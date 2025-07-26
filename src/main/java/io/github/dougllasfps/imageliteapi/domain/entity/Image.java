package io.github.dougllasfps.imageliteapi.domain.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

}
