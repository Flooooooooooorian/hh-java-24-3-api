package de.neuefische.java.hhjava243api.characters;

import de.neuefische.java.hhjava243api.characters.api.RickAndMortyApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final RickAndMortyApiService rickAndMortyApiService;

    @GetMapping
    public List<RickAndMortyCharacter> getAllCharacters() {
        return rickAndMortyApiService.loadAllCharacters();
    }
}
