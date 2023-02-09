package fr.jha.libraryapp.backend.repositories;

import fr.jha.libraryapp.backend.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
