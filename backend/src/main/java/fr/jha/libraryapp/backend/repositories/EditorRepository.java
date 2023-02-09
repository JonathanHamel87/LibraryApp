package fr.jha.libraryapp.backend.repositories;

import fr.jha.libraryapp.backend.entities.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Long> {
}
