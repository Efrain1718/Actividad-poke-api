package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OfficialArtwork {
    private String frontDefault;

    @JsonProperty("front_default")
    public String getFrontDefault() { return frontDefault; }
    @JsonProperty("front_default")
    public void setFrontDefault(String value) { this.frontDefault = value; }
}