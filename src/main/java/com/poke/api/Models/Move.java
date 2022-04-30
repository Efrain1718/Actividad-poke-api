package com.poke.api.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;

    @JsonProperty("move")
    public Species getMove() { return move; }
    @JsonProperty("move")
    public void setMove(Species value) { this.move = value; }

    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> getVersionGroupDetails() { return versionGroupDetails; }
    @JsonProperty("version_group_details")
    public void setVersionGroupDetails(List<VersionGroupDetail> value) { this.versionGroupDetails = value; }
}