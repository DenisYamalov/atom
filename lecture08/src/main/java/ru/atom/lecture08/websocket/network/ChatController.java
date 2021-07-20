package ru.atom.lecture08.websocket.network;

import org.jetbrains.annotations.NotNull;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.atom.lecture08.websocket.message.Message;
import ru.atom.lecture08.websocket.message.Topic;
import ru.atom.lecture08.websocket.util.JsonHelper;

@Controller
public class ChatController {

    @MessageMapping("/events")
    @SendTo("/events")
    public String send(@NotNull Topic topic, @NotNull Object object) {
        String message = JsonHelper.toJson(new Message(Topic.history, JsonHelper.toJson(object)));
        return message;
    }

}