package org.example.repository

import org.example.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestEntityRepository : JpaRepository<TestEntity, Long> {
}
