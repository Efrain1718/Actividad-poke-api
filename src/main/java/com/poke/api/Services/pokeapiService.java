package com.poke.api.Services;

import java.util.List;

import com.google.gson.Gson;
import com.poke.api.Models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class pokeapiService {
    @Autowired
    Gson gson;

    static String url ="https://pokeapi.co/api/v2/pokemon/";

    public List<Ability> getabilites(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return abilitesarray.getAbilities();
    }

    public long  getBaseExperinces(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return  abilitesarray.getBaseExperience();
    }

    public List<HeldItem> getHeldItems(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return  abilitesarray.getHeldItems();
    }

    public long  getId(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return  abilitesarray.getID();
    }

    public String getName(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return  abilitesarray.getName();
    }

    public String getLocation(String nombre){
        RestTemplate restTemplate = new RestTemplate();
        PokemonModel abilitesarray = restTemplate.getForObject(url+nombre, PokemonModel.class);
        return  abilitesarray.getLocationAreaEncounters();
    }
    
}
