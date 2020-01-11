/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.ClusterInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.BatchAIManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Indexable, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<BatchAIManager> {
    /**
     * @return the allocationState value.
     */
    AllocationState allocationState();

    /**
     * @return the allocationStateTransitionTime value.
     */
    DateTime allocationStateTransitionTime();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the currentNodeCount value.
     */
    Integer currentNodeCount();

    /**
     * @return the errors value.
     */
    List<BatchAIError> errors();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nodeSetup value.
     */
    NodeSetup nodeSetup();

    /**
     * @return the nodeStateCounts value.
     */
    NodeStateCounts nodeStateCounts();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the provisioningStateTransitionTime value.
     */
    DateTime provisioningStateTransitionTime();

    /**
     * @return the scaleSettings value.
     */
    ScaleSettings scaleSettings();

    /**
     * @return the subnet value.
     */
    ResourceId subnet();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userAccountSettings value.
     */
    UserAccountSettings userAccountSettings();

    /**
     * @return the virtualMachineConfiguration value.
     */
    VirtualMachineConfiguration virtualMachineConfiguration();

    /**
     * @return the vmPriority value.
     */
    VmPriority vmPriority();

    /**
     * @return the vmSize value.
     */
    String vmSize();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithUserAccountSettings, DefinitionStages.WithVmSize, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the cluster definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long
            * @return the next definition stage
            */
            WithUserAccountSettings withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the cluster definition allowing to specify UserAccountSettings.
         */
        interface WithUserAccountSettings {
           /**
            * Specifies userAccountSettings.
            * @param userAccountSettings Settings for an administrator user account that will be created on each compute node in the cluster
            * @return the next definition stage
            */
            WithVmSize withUserAccountSettings(UserAccountSettings userAccountSettings);
        }

        /**
         * The stage of the cluster definition allowing to specify VmSize.
         */
        interface WithVmSize {
           /**
            * Specifies vmSize.
            * @param vmSize The size of the virtual machines in the cluster. All nodes in a cluster have the same VM size. For information about available VM sizes for clusters using images from the Virtual Machines Marketplace see Sizes for Virtual Machines (Linux). Batch AI service supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series)
            * @return the next definition stage
            */
            WithCreate withVmSize(String vmSize);
        }

        /**
         * The stage of the cluster definition allowing to specify NodeSetup.
         */
        interface WithNodeSetup {
            /**
             * Specifies nodeSetup.
             * @param nodeSetup Setup to be performed on each compute node in the cluster
             * @return the next definition stage
             */
            WithCreate withNodeSetup(NodeSetup nodeSetup);
        }

        /**
         * The stage of the cluster definition allowing to specify ScaleSettings.
         */
        interface WithScaleSettings {
            /**
             * Specifies scaleSettings.
             * @param scaleSettings Scale settings for the cluster. Batch AI service supports manual and auto scale clusters
             * @return the next definition stage
             */
            WithCreate withScaleSettings(ScaleSettings scaleSettings);
        }

        /**
         * The stage of the cluster definition allowing to specify Subnet.
         */
        interface WithSubnet {
            /**
             * Specifies subnet.
             * @param subnet Existing virtual network subnet to put the cluster nodes in. Note, if a File Server mount configured in node setup, the File Server's subnet will be used automatically
             * @return the next definition stage
             */
            WithCreate withSubnet(ResourceId subnet);
        }

        /**
         * The stage of the cluster definition allowing to specify VirtualMachineConfiguration.
         */
        interface WithVirtualMachineConfiguration {
            /**
             * Specifies virtualMachineConfiguration.
             * @param virtualMachineConfiguration OS image configuration for cluster nodes. All nodes in a cluster have the same OS image
             * @return the next definition stage
             */
            WithCreate withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration);
        }

        /**
         * The stage of the cluster definition allowing to specify VmPriority.
         */
        interface WithVmPriority {
            /**
             * Specifies vmPriority.
             * @param vmPriority VM priority. Allowed values are: dedicated (default) and lowpriority. Possible values include: 'dedicated', 'lowpriority'
             * @return the next definition stage
             */
            WithCreate withVmPriority(VmPriority vmPriority);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, DefinitionStages.WithNodeSetup, DefinitionStages.WithScaleSettings, DefinitionStages.WithSubnet, DefinitionStages.WithVirtualMachineConfiguration, DefinitionStages.WithVmPriority {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, UpdateStages.WithScaleSettings {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify ScaleSettings.
         */
        interface WithScaleSettings {
            /**
             * Specifies scaleSettings.
             * @param scaleSettings Scale settings. Desired scale settings for the cluster. Batch AI service supports manual and auto scale clusters
             * @return the next update stage
             */
            Update withScaleSettings(ScaleSettings scaleSettings);
        }

    }
}