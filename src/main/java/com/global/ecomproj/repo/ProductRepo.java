package com.global.ecomproj.repo;

import com.global.ecomproj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // Corrected: The 'category' field is an integer. Searching it with 'like' is not possible.
    // The query has been updated to search by 'name', 'description', and 'brand' only.
    @Query("SELECT p from Product p where lower(p.name) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.description) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.brand) like lower(concat('%', :keyword, '%'))")
    List<Product> searchProducts(String keyword);
}
