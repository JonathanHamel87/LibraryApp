package fr.jha.libraryapp.backend.entities;

import fr.jha.libraryapp.backend.models.Categories;
import fr.jha.libraryapp.backend.models.Statut;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Statut statut;
    @Column(columnDefinition = "blob")
    private String description;
    private String title;
    @ManyToOne
    private Author author;
    private LocalDate publishDate;
    private int quantity;
    @ManyToOne
    private Translator translator;
    @ManyToOne
    private Editor editor;
    private int pages;
    private String ISBN;
    private List<Categories> categories;
}
