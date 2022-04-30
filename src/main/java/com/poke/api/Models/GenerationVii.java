package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVii {
    private DreamWorld icons;
    private Home ultraSunUltraMoon;

    @JsonProperty("icons")
    public DreamWorld getIcons() { return icons; }
    @JsonProperty("icons")
    public void setIcons(DreamWorld value) { this.icons = value; }

    @JsonProperty("ultra-sun-ultra-moon")
    public Home getUltraSunUltraMoon() { return ultraSunUltraMoon; }
    @JsonProperty("ultra-sun-ultra-moon")
    public void setUltraSunUltraMoon(Home value) { this.ultraSunUltraMoon = value; }
}