package com.jobtrackingapp.brewday.repository;

import com.jobtrackingapp.brewday.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
