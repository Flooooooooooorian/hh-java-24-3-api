package de.neuefische.java.hhjava243api.characters;

import de.neuefische.java.hhjava243api.characters.api.model.RickAndMortyCharacterOrigin;

public record RickAndMortyCharacter(
        String id,
        String name,
        String status,
        String species,
        RickAndMortyCharacterOrigin origin
) {
}
