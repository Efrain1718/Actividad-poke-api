package com.poke.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionDetail {
    private long rarity;
    private Species version;

    @JsonProperty("rarity")
    public long getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(long value) { this.rarity = value; }

    @JsonProperty("version")
    public Species getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(Species value) { this.version = value; }
}