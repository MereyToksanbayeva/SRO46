package com.example.SRO.repository;
import com.example.SRO.model.ArtGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtGalleryRepository extends JpaRepository<ArtGallery, Long> {
}
