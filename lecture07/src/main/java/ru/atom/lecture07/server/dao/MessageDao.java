package ru.atom.lecture07.server.dao;

import ru.atom.lecture07.server.model.Message;


import java.util.List;

public interface MessageDao {
/*    Message getMessageByUser(String login, String message);*/

    void save(String login, String message);

    List<Message> findAll();
}
