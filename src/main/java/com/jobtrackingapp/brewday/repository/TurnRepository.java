package com.jobtrackingapp.brewday.repository;

import com.jobtrackingapp.brewday.domain.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn,Long> {
}
