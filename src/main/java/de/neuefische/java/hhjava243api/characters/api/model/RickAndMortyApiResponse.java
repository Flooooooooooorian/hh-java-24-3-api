package de.neuefische.java.hhjava243api.characters.api.model;

import de.neuefische.java.hhjava243api.characters.RickAndMortyCharacter;

import java.util.List;

public record RickAndMortyApiResponse(
        RickAndMortyApiResponseInfo info,
        List<RickAndMortyCharacter> results
) {
}
