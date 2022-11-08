package io.study.kotlin.kotlinminiproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMiniProjectApplication

fun main(args: Array<String>) {
    //window
    runApplication<KotlinMiniProjectApplication>(*args)
}
