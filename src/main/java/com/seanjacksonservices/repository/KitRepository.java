package com.seanjacksonservices.repository;

import com.seanjacksonservices.model.Kit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KitRepository extends JpaRepository<Kit, Integer> {
}
