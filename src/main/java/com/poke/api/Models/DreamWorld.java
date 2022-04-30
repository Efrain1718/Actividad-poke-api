package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DreamWorld {
    private String frontDefault;
    private String frontFemale;

    @JsonProperty("front_default")
    public String getFrontDefault() { return frontDefault; }
    @JsonProperty("front_default")
    public void setFrontDefault(String value) { this.frontDefault = value; }

    @JsonProperty("front_female")
    public String getFrontFemale() { return frontFemale; }
    @JsonProperty("front_female")
    public void setFrontFemale(String value) { this.frontFemale = value; }
}