package com.coding.supermarket.domain.brand.repository;

import com.coding.supermarket.domain.product.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
