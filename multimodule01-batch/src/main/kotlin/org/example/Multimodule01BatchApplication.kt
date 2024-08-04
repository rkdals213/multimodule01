package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Multimodule01BatchApplication

fun main(args: Array<String>) {
    runApplication<Multimodule01BatchApplication>(*args)
}
