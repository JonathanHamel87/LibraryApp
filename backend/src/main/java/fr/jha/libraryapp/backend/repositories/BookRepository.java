package fr.jha.libraryapp.backend.repositories;

import fr.jha.libraryapp.backend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
