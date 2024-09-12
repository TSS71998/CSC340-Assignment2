package com.csc340.assignment2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@RestController
public class ApiController {

    @GetMapping("/mmo")
    public Object getMMO(){
        try {
            String url = "https://www.freetogame.com/api/games?category=mmorpg&sort-by=release-date";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            List<Game> gameList = new ArrayList<>();

            for (JsonNode rt : root) {
                String name = rt.get("title").asText();
                String releaseDate = rt.get("release_date").asText();
                String author = rt.get("developer").asText();

                Game game = new Game(name, releaseDate, author);
                gameList.add(game);
            }
            return gameList;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ApiController.class.getName()).log(Level.SEVERE,
                    null, ex);
            return "error in /mmo";
        }
    }


    @GetMapping("/fantasy")
    public Object getFantasy(){
        try {
            String url = "https://www.freetogame.com/api/games?category=fantasy&sort-by=release-date";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            List<Game> gameList = new ArrayList<>();

            for (JsonNode rt : root) {
                String name = rt.get("title").asText();
                String releaseDate = rt.get("release_date").asText();
                String author = rt.get("developer").asText();

                Game game = new Game(name, releaseDate, author);
                gameList.add(game);
            }
            return gameList;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ApiController.class.getName()).log(Level.SEVERE,
                    null, ex);
            return "error in /fantasy";
        }
    }

    @GetMapping("/strategy")
    public Object getStrategy(){
        try {
            String url = "https://www.freetogame.com/api/games?category=strategy&sort-by=release-date";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonListResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonListResponse);

            List<Game> gameList = new ArrayList<>();

            for (JsonNode rt : root) {
                String name = rt.get("title").asText();
                String releaseDate = rt.get("release_date").asText();
                String author = rt.get("developer").asText();

                Game game = new Game(name, releaseDate, author);
                gameList.add(game);
            }
            return gameList;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ApiController.class.getName()).log(Level.SEVERE,
                    null, ex);
            return "error in /strategy";
        }
    }


}
