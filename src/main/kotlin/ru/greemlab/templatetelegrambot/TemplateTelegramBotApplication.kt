package ru.greemlab.templatetelegrambot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TemplateTelegramBotApplication

fun main(args: Array<String>) {
    runApplication<TemplateTelegramBotApplication>(*args)
}
