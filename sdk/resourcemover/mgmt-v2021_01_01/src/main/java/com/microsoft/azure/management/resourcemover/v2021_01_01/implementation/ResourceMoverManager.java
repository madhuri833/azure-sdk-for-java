/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.resourcemover.v2021_01_01.MoveCollections;
import com.microsoft.azure.management.resourcemover.v2021_01_01.MoveResources;
import com.microsoft.azure.management.resourcemover.v2021_01_01.UnresolvedDependencies;
import com.microsoft.azure.management.resourcemover.v2021_01_01.OperationsDiscoverys;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ResourceMover resource management.
 */
public final class ResourceMoverManager extends ManagerCore<ResourceMoverManager, ResourceMoverServiceAPIImpl> {
    private MoveCollections moveCollections;
    private MoveResources moveResources;
    private UnresolvedDependencies unresolvedDependencies;
    private OperationsDiscoverys operationsDiscoverys;
    /**
    * Get a Configurable instance that can be used to create ResourceMoverManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ResourceMoverManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ResourceMoverManager that exposes ResourceMover resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ResourceMoverManager
    */
    public static ResourceMoverManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ResourceMoverManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ResourceMoverManager that exposes ResourceMover resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ResourceMoverManager
    */
    public static ResourceMoverManager authenticate(RestClient restClient, String subscriptionId) {
        return new ResourceMoverManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ResourceMoverManager that exposes ResourceMover management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ResourceMover management API entry points that work across subscriptions
        */
        ResourceMoverManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage MoveCollections.
     */
    public MoveCollections moveCollections() {
        if (this.moveCollections == null) {
            this.moveCollections = new MoveCollectionsImpl(this);
        }
        return this.moveCollections;
    }

    /**
     * @return Entry point to manage MoveResources.
     */
    public MoveResources moveResources() {
        if (this.moveResources == null) {
            this.moveResources = new MoveResourcesImpl(this);
        }
        return this.moveResources;
    }

    /**
     * @return Entry point to manage UnresolvedDependencies.
     */
    public UnresolvedDependencies unresolvedDependencies() {
        if (this.unresolvedDependencies == null) {
            this.unresolvedDependencies = new UnresolvedDependenciesImpl(this);
        }
        return this.unresolvedDependencies;
    }

    /**
     * @return Entry point to manage OperationsDiscoverys.
     */
    public OperationsDiscoverys operationsDiscoverys() {
        if (this.operationsDiscoverys == null) {
            this.operationsDiscoverys = new OperationsDiscoverysImpl(this);
        }
        return this.operationsDiscoverys;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ResourceMoverManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ResourceMoverManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ResourceMoverManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ResourceMoverServiceAPIImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
