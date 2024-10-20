package org.example.repository;

import org.example.entity.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandmarksRepository extends JpaRepository<Landmark, Long> {
}
