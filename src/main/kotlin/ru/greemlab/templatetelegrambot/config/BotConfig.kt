package ru.greemlab.templatetelegrambot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession
import ru.greemlab.templatetelegrambot.bot.TelegramBot

@Configuration
class BotConfig {

    @Bean
    @Throws(TelegramApiException::class)
    fun telegramBotApi(telegramBot: TelegramBot): TelegramBotsApi {
        val botsApi = TelegramBotsApi(DefaultBotSession::class.java)
        botsApi.registerBot(telegramBot)
        return botsApi
    }
}