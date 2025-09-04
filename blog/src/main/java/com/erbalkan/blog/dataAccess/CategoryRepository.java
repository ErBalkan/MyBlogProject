package com.erbalkan.blog.dataAccess;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erbalkan.blog.entities.concretes.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
