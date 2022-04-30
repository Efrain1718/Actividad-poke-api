package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIii {
    private Emerald emerald;
    private Gold fireredLeafgreen;
    private Gold rubySapphire;

    @JsonProperty("emerald")
    public Emerald getEmerald() { return emerald; }
    @JsonProperty("emerald")
    public void setEmerald(Emerald value) { this.emerald = value; }

    @JsonProperty("firered-leafgreen")
    public Gold getFireredLeafgreen() { return fireredLeafgreen; }
    @JsonProperty("firered-leafgreen")
    public void setFireredLeafgreen(Gold value) { this.fireredLeafgreen = value; }

    @JsonProperty("ruby-sapphire")
    public Gold getRubySapphire() { return rubySapphire; }
    @JsonProperty("ruby-sapphire")
    public void setRubySapphire(Gold value) { this.rubySapphire = value; }
}