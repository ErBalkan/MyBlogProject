package com.erbalkan.blog.entities.concretes;

import java.time.LocalDateTime;
import java.util.UUID;

import com.erbalkan.blog.core.entities.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="posts")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post implements BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID) // UUID olarak otomatik arttırma
    @Column(name="id",updatable=false,nullable=false,columnDefinition = "uuid default gen_random_uuid()") // Değişemez, 
    private UUID id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="createdAt")
    private LocalDateTime createdAt;

    @Column(name="updatedAd")
    private LocalDateTime updatedAt;

    @ManyToOne // Postlara ait 1 kategori olabilir.
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
