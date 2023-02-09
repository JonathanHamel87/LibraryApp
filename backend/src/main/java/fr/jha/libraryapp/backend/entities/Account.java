package fr.jha.libraryapp.backend.entities;

import fr.jha.libraryapp.backend.models.Identity;
import fr.jha.libraryapp.backend.models.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
public class Account extends Identity{
    private int age;
    private String password;
    private List<Roles> roles;

    @OneToMany
    private List<Book> borrowedBook;
}
