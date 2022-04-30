package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationI {
    private RedBlue redBlue;
    private RedBlue yellow;

    @JsonProperty("red-blue")
    public RedBlue getRedBlue() { return redBlue; }
    @JsonProperty("red-blue")
    public void setRedBlue(RedBlue value) { this.redBlue = value; }

    @JsonProperty("yellow")
    public RedBlue getYellow() { return yellow; }
    @JsonProperty("yellow")
    public void setYellow(RedBlue value) { this.yellow = value; }
}