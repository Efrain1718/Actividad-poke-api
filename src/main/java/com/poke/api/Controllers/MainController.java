package com.poke.api.Controllers;

import java.util.List;

import com.poke.api.Models.*;
import com.poke.api.Services.pokeapiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokedex")
public class MainController {

    @Autowired
    pokeapiService pokeService;
    
    // @GetMapping("/ability/{name}")
    // public List<Object> Sauldo(@PathVariable("name") String ability){
    //     return this.pokeService.abilites(ability);
    // }
    @GetMapping("/ability/{name}")
    public List<Ability> Abilities(@PathVariable("name") String nombre){
        return this.pokeService.getabilites(nombre);
    }

    @GetMapping("/base-experiences/{name}")
    public long  BaseExperience(@PathVariable("name") String nombre){
        return this.pokeService.getBaseExperinces(nombre);
    }

    @GetMapping("/held-items/{name}")
    public List<HeldItem> HeldItems(@PathVariable("name") String nombre){
        return this.pokeService.getHeldItems(nombre);
    }
    @GetMapping("/id/{name}")
    public long  Id(@PathVariable("name") String nombre){
        return this.pokeService.getId(nombre);
    }

    @GetMapping("/name/{name}")
    public String Name(@PathVariable("name") String nombre){
        return this.pokeService.getName(nombre);
    }

    @GetMapping("/location/{name}")
    public String LocationAreaEncounters(@PathVariable("name") String nombre){
        return this.pokeService.getLocation(nombre);
    }
}
