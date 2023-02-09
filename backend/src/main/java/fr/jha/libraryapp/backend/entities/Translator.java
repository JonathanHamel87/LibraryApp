package fr.jha.libraryapp.backend.entities;

import fr.jha.libraryapp.backend.models.Identity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Translator extends Identity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Book> books;
}
