package ru.greemlab.templatetelegrambot.bot

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update
import kotlin.coroutines.CoroutineContext

/**
 * Основной класс Telegram-бота.
 * Реализует [TelegramLongPollingBot] и использует корутины для асинхронной обработки обновлений.
 */
@Component
class TelegramBot(
    @Value("\${app.bot.botUsername}") private val botUsername: String,
    @Value("\${app.bot.botToken}") private val botToken: String,
) : TelegramLongPollingBot(botToken), CoroutineScope {

    override fun getBotUsername(): String = botUsername

    override fun onUpdateReceived(update: Update) {

    }

    /**
     * Переопределение контекста корутин для асинхронной обработки.
     */
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO
}
