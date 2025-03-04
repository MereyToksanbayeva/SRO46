package com.example.SRO.controller;
import com.example.SRO.model.Artist;
import com.example.SRO.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistRepository repository;

    @GetMapping
    public List<Artist> getAllArtists() {
        return repository.findAll();
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return repository.save(artist);
    }
}
