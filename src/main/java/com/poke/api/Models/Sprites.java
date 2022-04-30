package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
    private Other other;
    private Versions versions;
    private Sprites animated;

    @JsonProperty("back_default")
    public String getBackDefault() { return backDefault; }
    @JsonProperty("back_default")
    public void setBackDefault(String value) { this.backDefault = value; }

    @JsonProperty("back_female")
    public String getBackFemale() { return backFemale; }
    @JsonProperty("back_female")
    public void setBackFemale(String value) { this.backFemale = value; }

    @JsonProperty("back_shiny")
    public String getBackShiny() { return backShiny; }
    @JsonProperty("back_shiny")
    public void setBackShiny(String value) { this.backShiny = value; }

    @JsonProperty("back_shiny_female")
    public String getBackShinyFemale() { return backShinyFemale; }
    @JsonProperty("back_shiny_female")
    public void setBackShinyFemale(String value) { this.backShinyFemale = value; }

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

    @JsonProperty("other")
    public Other getOther() { return other; }
    @JsonProperty("other")
    public void setOther(Other value) { this.other = value; }

    @JsonProperty("versions")
    public Versions getVersions() { return versions; }
    @JsonProperty("versions")
    public void setVersions(Versions value) { this.versions = value; }

    @JsonProperty("animated")
    public Sprites getAnimated() { return animated; }
    @JsonProperty("animated")
    public void setAnimated(Sprites value) { this.animated = value; }
}