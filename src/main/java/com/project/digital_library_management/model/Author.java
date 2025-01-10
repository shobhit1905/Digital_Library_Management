package com.project.digital_library_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId ;

    @NotBlank(message = "First name should not be blank")
    @NotNull(message = "First name should not be null")
    private String firstName ;

    @NotBlank(message = "Last name should not be blank")
    @NotNull(message = "Last name should not be null")
    private String lastName ;

    @Lob
    @Size(max = 65535 , message = "biography can have a max of 65535 characters")
    private String biography ;

    @NotBlank(message = "Author DOB should not be blank")
    private Date DOB ;

    @CreationTimestamp
    private LocalDateTime createdDate ;

    @UpdateTimestamp
    private LocalDateTime updatedDate ;

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
}
