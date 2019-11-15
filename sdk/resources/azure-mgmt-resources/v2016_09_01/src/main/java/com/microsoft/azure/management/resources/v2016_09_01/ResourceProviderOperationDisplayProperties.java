/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource provider operation's display properties.
 */
public class ResourceProviderOperationDisplayProperties {
    /**
     * Operation description.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Operation provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Operation resource.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get operation description.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set operation description.
     *
     * @param publisher the publisher value to set
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get operation provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set operation provider.
     *
     * @param provider the provider value to set
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get operation resource.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set operation resource.
     *
     * @param resource the resource value to set
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set operation.
     *
     * @param operation the operation value to set
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set operation description.
     *
     * @param description the description value to set
     * @return the ResourceProviderOperationDisplayProperties object itself.
     */
    public ResourceProviderOperationDisplayProperties withDescription(String description) {
        this.description = description;
        return this;
    }

}