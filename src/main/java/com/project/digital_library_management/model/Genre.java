package com.project.digital_library_management.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genres")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreId ;

    @NotBlank(message = "Genre name should not be blank")
    private String genreName ;

    @NotBlank(message = "Genre description must not be blank")
    @Size(min = 10 , message = "Description must have at least 10 characters")
    private String genreDescription ;

    @CreationTimestamp
    private LocalDateTime creationDate ;

    @UpdateTimestamp
    private LocalDateTime modificationDate ;

    @ManyToMany(mappedBy = "genre")
    private Set<Book> books = new HashSet<>();
}
