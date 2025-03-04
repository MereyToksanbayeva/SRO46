package com.example.SRO.controller;

import com.example.SRO.model.ArtGallery;
import com.example.SRO.repository.ArtGalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/galleries")
public class ArtGalleryController {
    @Autowired
    private ArtGalleryRepository repository;

    @GetMapping
    public List<ArtGallery> getAllGalleries() {
        return repository.findAll();
    }

    @PostMapping
    public ArtGallery createGallery(@RequestBody ArtGallery gallery) {
        return repository.save(gallery);
    }
}
