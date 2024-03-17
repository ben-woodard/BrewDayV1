package com.jobtrackingapp.brewday.repository;

import com.jobtrackingapp.brewday.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
