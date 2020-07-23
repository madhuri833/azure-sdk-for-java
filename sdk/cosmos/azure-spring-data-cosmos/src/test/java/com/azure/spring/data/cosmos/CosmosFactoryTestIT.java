// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.common.TestConstants;
import com.azure.spring.data.cosmos.config.CosmosClientConfig;
import com.azure.spring.data.cosmos.repository.TestRepositoryConfig;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfig.class)
public class CosmosFactoryTestIT {

    @Value("${cosmos.uri:}")
    private String cosmosDbUri;

    @Value("${cosmos.key:}")
    private String cosmosDbKey;

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyKey() {
        final CosmosClientConfig cosmosClientConfig = CosmosClientConfig.builder()
            .database(TestConstants.DB_NAME)
            .cosmosClientBuilder(new CosmosClientBuilder()
                .endpoint(TestConstants.DB_NAME)
                .key(""))
            .build();
        CosmosFactory.createCosmosAsyncClient(cosmosClientConfig);
    }

    @Test(expected = AssertionError.class)
    public void testInvalidEndpoint() {
        final CosmosClientConfig cosmosClientConfig = CosmosClientConfig.builder()
            .database(TestConstants.DB_NAME)
            .cosmosClientBuilder(new CosmosClientBuilder()
                .endpoint(TestConstants.COSMOSDB_FAKE_HOST)
                .key(cosmosDbKey))
            .build();
        CosmosAsyncClient client =  CosmosFactory.createCosmosAsyncClient(cosmosClientConfig);
        final CosmosFactory factory = new CosmosFactory(client, TestConstants.DB_NAME);

        assertThat(factory).isNotNull();
    }

    @Test
    public void testConnectionPolicyUserAgentKept() throws IllegalAccessException {

        final CosmosClientConfig cosmosClientConfig = CosmosClientConfig.builder()
            .database(TestConstants.DB_NAME)
            .cosmosClientBuilder(new CosmosClientBuilder()
                .endpoint(cosmosDbUri)
                .key(cosmosDbKey))
            .build();
        CosmosFactory.createCosmosAsyncClient(cosmosClientConfig);

        final String uaSuffix = getUserAgentSuffixValue(cosmosClientConfig.getCosmosClientBuilder());
        assertThat(uaSuffix).contains("spring-data");
    }

    private String getUserAgentSuffixValue(CosmosClientBuilder cosmosClientBuilder) throws IllegalAccessException {
        final Field userAgentSuffix = FieldUtils.getDeclaredField(CosmosClientBuilder.class,
            "userAgentSuffix", true);
        return (String) userAgentSuffix.get(cosmosClientBuilder);
    }
}