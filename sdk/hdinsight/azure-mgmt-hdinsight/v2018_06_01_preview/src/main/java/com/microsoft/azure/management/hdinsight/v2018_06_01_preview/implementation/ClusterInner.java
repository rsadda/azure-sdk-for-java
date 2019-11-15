/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ClusterGetProperties;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ClusterIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The HDInsight cluster.
 */
@SkipParentValidation
public class ClusterInner extends Resource {
    /**
     * The ETag for the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The properties of the cluster.
     */
    @JsonProperty(value = "properties")
    private ClusterGetProperties properties;

    /**
     * The identity of the cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ClusterIdentity identity;

    /**
     * Get the ETag for the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the ETag for the resource.
     *
     * @param etag the etag value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties of the cluster.
     *
     * @return the properties value
     */
    public ClusterGetProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of the cluster.
     *
     * @param properties the properties value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withProperties(ClusterGetProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity of the cluster, if configured.
     *
     * @return the identity value
     */
    public ClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the cluster, if configured.
     *
     * @param identity the identity value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(ClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

}