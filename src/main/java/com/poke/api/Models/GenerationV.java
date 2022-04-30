package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationV {
    private Sprites blackWhite;

    @JsonProperty("black-white")
    public Sprites getBlackWhite() { return blackWhite; }
    @JsonProperty("black-white")
    public void setBlackWhite(Sprites value) { this.blackWhite = value; }
}