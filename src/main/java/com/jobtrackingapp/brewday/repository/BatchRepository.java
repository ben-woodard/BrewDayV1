package com.jobtrackingapp.brewday.repository;

import com.jobtrackingapp.brewday.domain.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {
}
