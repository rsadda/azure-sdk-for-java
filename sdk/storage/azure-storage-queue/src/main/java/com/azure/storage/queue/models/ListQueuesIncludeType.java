// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListQueuesIncludeType.
 */
public enum ListQueuesIncludeType {
    /**
     * Enum value metadata.
     */
    METADATA("metadata");

    /**
     * The actual serialized value for a ListQueuesIncludeType instance.
     */
    private final String value;

    ListQueuesIncludeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListQueuesIncludeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListQueuesIncludeType object, or null if unable to parse.
     */
    @JsonCreator
    public static ListQueuesIncludeType fromString(String value) {
        ListQueuesIncludeType[] items = ListQueuesIncludeType.values();
        for (ListQueuesIncludeType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}