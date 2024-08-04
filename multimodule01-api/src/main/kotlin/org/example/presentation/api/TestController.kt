package org.example.presentation.api

import org.example.entity.TestEntity
import org.example.repository.TestEntityRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testEntityRepository: TestEntityRepository
) {

    @GetMapping("/test")
    fun test(): List<TestEntity> {
        return testEntityRepository.findAll()
    }
}

