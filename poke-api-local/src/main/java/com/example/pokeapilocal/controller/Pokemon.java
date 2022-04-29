package com.example.pokeapilocal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokeapilocal.service.PokemonService;

@RestController
@RequestMapping(path = "/pokemon")
public class Pokemon {

	@Autowired
	PokemonService pokemonService;
	
	@GetMapping(value="/{nombrePokemon}")
	public String AllEndPoint(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.imprimirPokemon(pokemon);
	}
	
	
	
	@GetMapping(value="/{nombrePokemon}/abilities")
	public String obtenerAbilities(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerAbilities(pokemon);
	}
	

	@GetMapping(value="/{nombrePokemon}/base_experience")
	public String obtenerBase_experience(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerBaseExperience(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/held_items")
	public String obtenerHeldItems(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerHeld_items(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/id")
	public String obtenerID(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerID(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/name")
	public String obtenerName(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerName(pokemon);
	}
	
	
	@GetMapping(value="/{nombrePokemon}/location_area_encounters")
	public String obtenerLocationAreaeEncounters(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonService.obtenerLocationAreaeEncounters(pokemon);
	}
	
}
