package com.example.pokeapilocal.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

	private String urlPokemon= "https://pokeapi.co/api/v2/pokemon";
	
	public String imprimirPokemon(String nombrePok) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
		
	}
	
	public String obtenerAbilities(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.optString("abilities");
		}catch(JSONException e) {

		}
		return obtenerAbili;
	}
	
	public String obtenerBaseExperience(String nombrePok) {
		String obtenerBaseExperience="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerBaseExperience =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerBaseExperience);
			obtenerBaseExperience =  obtenerObj.optString("base_experience");
		}catch(JSONException e) {

		}
		return obtenerBaseExperience;
	}


	public String obtenerHeld_items(String nombrePok) {
		String obtenerHeld_items="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerHeld_items =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerHeld_items);
			obtenerHeld_items = obtenerObj.optString("held_items");
		}catch(JSONException e) {

		}
		return obtenerHeld_items;
	}


	public String obtenerID(String nombrePok) {
		String obtenerID="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerID =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerID);
			obtenerID = obtenerObj.optString("id");
		}catch(JSONException e) {

		}
		return obtenerID;
	}
	

	public String obtenerName(String nombrePok) {
		String obtenerName="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerName =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerName);
			obtenerName = obtenerObj.getJSONObject("name").toString();
		}catch(JSONException e) {

		}
		return obtenerName;
	}
	
	public String obtenerLocationAreaeEncounters(String nombrePok) {
		String obtenerAreaEncounter="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAreaEncounter =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAreaEncounter);
			obtenerAreaEncounter = obtenerObj.optString("location_area_encounters");
		}catch(JSONException e) {

		}
		return obtenerAreaEncounter;
	}
	
}
