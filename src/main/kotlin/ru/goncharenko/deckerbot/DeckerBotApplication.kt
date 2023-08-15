package ru.goncharenko.deckerbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeckerBotApplication

fun main(args: Array<String>) {
    runApplication<DeckerBotApplication>(*args)
}
