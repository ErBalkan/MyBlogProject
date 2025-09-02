package com.erbalkan.blog.entities.concretes;

import java.util.List;

import com.erbalkan.blog.core.entities.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="categories")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category implements BaseEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy="category") // bir kategoriye ait birden fazla post olabilir.
    private List<Post> posts;
}
