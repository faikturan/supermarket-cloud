package com.coding.commons.domain.resource.repository;

import com.coding.commons.domain.resource.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
