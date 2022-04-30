package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Other {
    private DreamWorld dreamWorld;
    private Home home;
    private OfficialArtwork officialArtwork;

    @JsonProperty("dream_world")
    public DreamWorld getDreamWorld() { return dreamWorld; }
    @JsonProperty("dream_world")
    public void setDreamWorld(DreamWorld value) { this.dreamWorld = value; }

    @JsonProperty("home")
    public Home getHome() { return home; }
    @JsonProperty("home")
    public void setHome(Home value) { this.home = value; }

    @JsonProperty("official-artwork")
    public OfficialArtwork getOfficialArtwork() { return officialArtwork; }
    @JsonProperty("official-artwork")
    public void setOfficialArtwork(OfficialArtwork value) { this.officialArtwork = value; }
}