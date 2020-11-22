package com.java4future.java4future.entity;

import com.java4future.java4future.entity.enums.CourseCategory;
import com.java4future.java4future.entity.enums.ExperienceLevel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    private Long creatorId;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @Enumerated(EnumType.STRING)
    private CourseCategory category;

    @Column(nullable = false)
    @NotNull
    private Double price;

    @Column(nullable = false)
    @NotBlank
    private String description;

    @Enumerated(EnumType.STRING)
    private ExperienceLevel experienceLevel;

    public CourseEntity() {
    }

    public Long getId() {
        return id;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public String getTitle() {
        return title;
    }

    public CourseCategory getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(CourseCategory category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseEntity)) return false;
        CourseEntity course = (CourseEntity) o;
        return Objects.equals(getId(), course.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
