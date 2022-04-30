package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationViii {
    private DreamWorld icons;

    @JsonProperty("icons")
    public DreamWorld getIcons() { return icons; }
    @JsonProperty("icons")
    public void setIcons(DreamWorld value) { this.icons = value; }
}