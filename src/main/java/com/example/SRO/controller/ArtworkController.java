package com.example.SRO.controller;

import com.example.SRO.model.Artwork;
import com.example.SRO.repository.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {
    @Autowired
    private ArtworkRepository repository;

    @GetMapping
    public List<Artwork> getAllArtworks() {
        return repository.findAll();
    }

    @PostMapping
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return repository.save(artwork);
    }
}
