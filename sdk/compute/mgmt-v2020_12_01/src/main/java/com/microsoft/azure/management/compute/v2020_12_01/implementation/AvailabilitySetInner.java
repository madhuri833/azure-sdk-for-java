/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2020_12_01.InstanceViewStatus;
import com.microsoft.azure.management.compute.v2020_12_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the availability set that the virtual machine
 * should be assigned to. Virtual machines specified in the same availability
 * set are allocated to different nodes to maximize availability. For more
 * information about availability sets, see [Manage the availability of virtual
 * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
 * &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see
 * [Planned maintenance for virtual machines in
 * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
 * &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set
 * at creation time. An existing VM cannot be added to an availability set.
 */
@JsonFlatten
public class AvailabilitySetInner extends Resource {
    /**
     * Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /**
     * Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachines;

    /**
     * Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "properties.statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * Sku of the availability set, only name is required to be set. See
     * AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for
     * virtual machines with managed disks and 'Classic' for virtual machines
     * with unmanaged disks. Default value is 'Classic'.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get update Domain count.
     *
     * @return the platformUpdateDomainCount value
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set update Domain count.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get fault Domain count.
     *
     * @return the platformFaultDomainCount value
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set fault Domain count.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get a list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set a list of references to all virtual machines in the availability set.
     *
     * @param virtualMachines the virtualMachines value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'.
     *
     * @param sku the sku value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
