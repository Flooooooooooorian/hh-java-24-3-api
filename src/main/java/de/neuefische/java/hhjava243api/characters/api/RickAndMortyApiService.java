package de.neuefische.java.hhjava243api.characters.api;

import de.neuefische.java.hhjava243api.characters.RickAndMortyCharacter;
import de.neuefische.java.hhjava243api.characters.api.model.RickAndMortyApiResponse;
import de.neuefische.java.hhjava243api.characters.api.model.RickAndMortyCharacterOrigin;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;

@Service
public class RickAndMortyApiService {

    private final RestClient restClient;

    public RickAndMortyApiService() {
        restClient = RestClient.builder()
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    public List<RickAndMortyCharacter> loadAllCharacters() {
        RickAndMortyApiResponse responseBody = restClient
                .get()
                .uri("/character")
                .retrieve()
                .body(RickAndMortyApiResponse.class);

        return responseBody.results();
    }
}
