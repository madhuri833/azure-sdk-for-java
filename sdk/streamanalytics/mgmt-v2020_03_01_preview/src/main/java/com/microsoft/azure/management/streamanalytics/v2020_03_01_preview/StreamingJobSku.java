/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that are associated with a SKU.
 */
public class StreamingJobSku {
    /**
     * The name of the SKU. Required on PUT (CreateOrReplace) requests.
     * Possible values include: 'Standard'.
     */
    @JsonProperty(value = "name")
    private StreamingJobSkuName name;

    /**
     * Get the name of the SKU. Required on PUT (CreateOrReplace) requests. Possible values include: 'Standard'.
     *
     * @return the name value
     */
    public StreamingJobSkuName name() {
        return this.name;
    }

    /**
     * Set the name of the SKU. Required on PUT (CreateOrReplace) requests. Possible values include: 'Standard'.
     *
     * @param name the name value to set
     * @return the StreamingJobSku object itself.
     */
    public StreamingJobSku withName(StreamingJobSkuName name) {
        this.name = name;
        return this;
    }

}
