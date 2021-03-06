/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Copy log details for a storage account of a DataBox job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "copyLogDetailsType", defaultImpl = DataBoxAccountCopyLogDetails.class)
@JsonTypeName("DataBox")
public class DataBoxAccountCopyLogDetails extends CopyLogDetails {
    /**
     * Destination account name.
     */
    @JsonProperty(value = "accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /**
     * Link for copy logs.
     */
    @JsonProperty(value = "copyLogLink", access = JsonProperty.Access.WRITE_ONLY)
    private String copyLogLink;

    /**
     * Get destination account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get link for copy logs.
     *
     * @return the copyLogLink value
     */
    public String copyLogLink() {
        return this.copyLogLink;
    }

}
