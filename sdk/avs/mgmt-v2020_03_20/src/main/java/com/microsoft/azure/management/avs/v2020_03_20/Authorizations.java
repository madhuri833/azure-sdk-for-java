/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.AuthorizationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Authorizations.
 */
public interface Authorizations extends SupportsCreating<ExpressRouteAuthorization.DefinitionStages.Blank>, HasInner<AuthorizationsInner> {
    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteAuthorization> getAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteAuthorization> listAsync(final String resourceGroupName, final String privateCloudName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String privateCloudName, String authorizationName);

}