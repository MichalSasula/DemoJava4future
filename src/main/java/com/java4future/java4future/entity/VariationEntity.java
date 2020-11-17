package com.java4future.java4future.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class VariationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @Column(nullable = false)
    @Lob
    @NotBlank
    private String pgn;

    @Column(nullable = false)
    Boolean learned;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPgn() {
        return pgn;
    }

    public Boolean getLearned() {
        return learned;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPgn(String pgn) {
        this.pgn = pgn;
    }

    public void setLearned(Boolean learned) {
        this.learned = learned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VariationEntity)) return false;
        VariationEntity variation = (VariationEntity) o;
        return Objects.equals(getId(), variation.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
