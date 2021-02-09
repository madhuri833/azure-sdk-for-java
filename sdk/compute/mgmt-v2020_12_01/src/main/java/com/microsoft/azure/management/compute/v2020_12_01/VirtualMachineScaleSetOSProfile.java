/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set OS profile.
 */
public class VirtualMachineScaleSetOSProfile {
    /**
     * Specifies the computer name prefix for all of the virtual machines in
     * the scale set. Computer name prefixes must be 1 to 15 characters long.
     */
    @JsonProperty(value = "computerNamePrefix")
    private String computerNamePrefix;

    /**
     * Specifies the name of the administrator account. &lt;br&gt;&lt;br&gt;
     * **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt;
     * **Disallowed values:** "administrator", "admin", "user", "user1",
     * "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser",
     * "adm", "admin2", "aspnet", "backup", "console", "david", "guest",
     * "john", "owner", "root", "server", "sql", "support", "support_388945a0",
     * "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt;
     * **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt;
     * **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length
     * (Windows):** 20 characters  &lt;br&gt;&lt;br&gt;&lt;li&gt; For root
     * access to the Linux VM, see [Using root privileges on Linux virtual
     * machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt;
     * For a list of built-in system users on Linux that should not be used in
     * this field, see [Selecting User Names for Linux on
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "adminUsername")
    private String adminUsername;

    /**
     * Specifies the password of the administrator account.
     * &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters
     * &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters
     * &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions
     * below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has
     * upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special
     * character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed
     * values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word",
     * "pass@word1", "Password!", "Password1", "Password22", "iloveyou!"
     * &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the
     * Remote Desktop service or its login password in a Windows
     * VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users,
     * SSH, and check or repair disks on Azure Linux VMs using the VMAccess
     * Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password).
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded
     * string is decoded to a binary array that is saved as a file on the
     * Virtual Machine. The maximum length of the binary array is 65535 bytes.
     * &lt;br&gt;&lt;br&gt; For using cloud-init for your VM, see [Using
     * cloud-init to customize a Linux VM during
     * creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "customData")
    private String customData;

    /**
     * Specifies Windows operating system settings on the virtual machine.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /**
     * Specifies the Linux operating system settings on the virtual machine.
     * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see
     * [Linux on Azure-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see
     * [Information for Non-Endorsed
     * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "linuxConfiguration")
    private LinuxConfiguration linuxConfiguration;

    /**
     * Specifies set of certificates that should be installed onto the virtual
     * machines in the scale set.
     */
    @JsonProperty(value = "secrets")
    private List<VaultSecretGroup> secrets;

    /**
     * Get specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     *
     * @return the computerNamePrefix value
     */
    public String computerNamePrefix() {
        return this.computerNamePrefix;
    }

    /**
     * Set specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     *
     * @param computerNamePrefix the computerNamePrefix value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withComputerNamePrefix(String computerNamePrefix) {
        this.computerNamePrefix = computerNamePrefix;
        return this;
    }

    /**
     * Get specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters  &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root privileges on Linux virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt; For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for Linux on Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the adminUsername value
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set specifies the name of the administrator account. &lt;br&gt;&lt;br&gt; **Windows-only restriction:** Cannot end in "." &lt;br&gt;&lt;br&gt; **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 1  character &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 20 characters  &lt;br&gt;&lt;br&gt;&lt;li&gt; For root access to the Linux VM, see [Using root privileges on Linux virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)&lt;br&gt;&lt;li&gt; For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for Linux on Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param adminUsername the adminUsername value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password).
     *
     * @return the adminPassword value
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set specifies the password of the administrator account. &lt;br&gt;&lt;br&gt; **Minimum-length (Windows):** 8 characters &lt;br&gt;&lt;br&gt; **Minimum-length (Linux):** 6 characters &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 123 characters &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 72 characters &lt;br&gt;&lt;br&gt; **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled &lt;br&gt; Has lower characters &lt;br&gt;Has upper characters &lt;br&gt; Has a digit &lt;br&gt; Has a special character (Regex match [\W_]) &lt;br&gt;&lt;br&gt; **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" &lt;br&gt;&lt;br&gt; For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-reset-rdp?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-vmaccess-extension?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#reset-root-password).
     *
     * @param adminPassword the adminPassword value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Get specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the customData value
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param customData the customData value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get specifies Windows operating system settings on the virtual machine.
     *
     * @return the windowsConfiguration value
     */
    public WindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set specifies Windows operating system settings on the virtual machine.
     *
     * @param windowsConfiguration the windowsConfiguration value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json) &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the linuxConfiguration value
     */
    public LinuxConfiguration linuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json) &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see [Information for Non-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param linuxConfiguration the linuxConfiguration value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
        return this;
    }

    /**
     * Get specifies set of certificates that should be installed onto the virtual machines in the scale set.
     *
     * @return the secrets value
     */
    public List<VaultSecretGroup> secrets() {
        return this.secrets;
    }

    /**
     * Set specifies set of certificates that should be installed onto the virtual machines in the scale set.
     *
     * @param secrets the secrets value to set
     * @return the VirtualMachineScaleSetOSProfile object itself.
     */
    public VirtualMachineScaleSetOSProfile withSecrets(List<VaultSecretGroup> secrets) {
        this.secrets = secrets;
        return this;
    }

}
