package uz.tg.controller;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TgController extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "lolMessagBot";
    }

    @Override
    public String getBotToken() {
        return "1487031714:AAHetBYdfukPU3k4KbE-eVGOdEJnKNQE8uQ";
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {

       //

        Message message = update.getMessage();

        Integer messageId = update.getMessage().getMessageId();

        String messageText = update.getMessage().getText();

        User user = update.getMessage().getFrom();

        SendMessage sendMessage = new SendMessage();
        if (messageText.equals("salom")) {

            sendMessage.setChatId(String.valueOf(message.getChatId()));
            sendMessage.setText("Valeykum salom");
        } else {
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            sendMessage.setText("salom");
        }
        if (messageText.equals("qalesan")) {

            sendMessage.setChatId(String.valueOf(message.getChatId()));
            sendMessage.setText("Zo'r o'zing qalesan");
        } else {
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            sendMessage.setText("salom");
        }
        try {
            System.out.println(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
    }

        //

    }
}
