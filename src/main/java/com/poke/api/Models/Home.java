package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Home {
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;

    @JsonProperty("front_default")
    public String getFrontDefault() { return frontDefault; }
    @JsonProperty("front_default")
    public void setFrontDefault(String value) { this.frontDefault = value; }

    @JsonProperty("front_female")
    public String getFrontFemale() { return frontFemale; }
    @JsonProperty("front_female")
    public void setFrontFemale(String value) { this.frontFemale = value; }

    @JsonProperty("front_shiny")
    public String getFrontShiny() { return frontShiny; }
    @JsonProperty("front_shiny")
    public void setFrontShiny(String value) { this.frontShiny = value; }

    @JsonProperty("front_shiny_female")
    public String getFrontShinyFemale() { return frontShinyFemale; }
    @JsonProperty("front_shiny_female")
    public void setFrontShinyFemale(String value) { this.frontShinyFemale = value; }
}