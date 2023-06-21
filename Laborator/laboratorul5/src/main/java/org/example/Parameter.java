package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameter {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public String value;
}
