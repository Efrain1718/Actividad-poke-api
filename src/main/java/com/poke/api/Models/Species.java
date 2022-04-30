package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Species {
    private String name;
    private String url;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}