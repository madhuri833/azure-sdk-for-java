/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2021_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.kubernetesconfiguration.v2021_03_01.implementation.SourceControlConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SourceControlConfigurations.
 */
public interface SourceControlConfigurations extends SupportsCreating<SourceControlConfiguration.DefinitionStages.Blank>, HasInner<SourceControlConfigurationsInner> {
    /**
     * Gets details of the Source Control Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters). Possible values include: 'Microsoft.ContainerService', 'Microsoft.Kubernetes'
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters). Possible values include: 'managedClusters', 'connectedClusters'
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SourceControlConfiguration> getAsync(String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, String sourceControlConfigurationName);

    /**
     * This will delete the YAML file used to set up the Source control configuration, thus stopping future sync from the source repo.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters). Possible values include: 'Microsoft.ContainerService', 'Microsoft.Kubernetes'
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters). Possible values include: 'managedClusters', 'connectedClusters'
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, String sourceControlConfigurationName);

    /**
     * List all Source Control Configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters). Possible values include: 'Microsoft.ContainerService', 'Microsoft.Kubernetes'
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters). Possible values include: 'managedClusters', 'connectedClusters'
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SourceControlConfiguration> listAsync(final String resourceGroupName, final String clusterRp, final String clusterResourceName, final String clusterName);

}
