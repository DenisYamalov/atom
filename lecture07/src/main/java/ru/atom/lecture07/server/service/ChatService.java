package ru.atom.lecture07.server.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.atom.lecture07.server.controller.ChatController;
import ru.atom.lecture07.server.dao.MessageDao;
import ru.atom.lecture07.server.dao.UserDao;
import ru.atom.lecture07.server.model.Message;
import ru.atom.lecture07.server.model.User;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ChatService.class);

    @Autowired
    private UserDao userDao;
    private MessageDao messageDao;

    @Nullable
    @Transactional
    public User getLoggedIn(@NotNull String name) {
        return userDao.getByLogin(name);
    }

    @Transactional
    public void login(@NotNull String login) {
        User user = new User();
        userDao.save(user.setLogin(login));
 /*       messageDao.save(login,"logged in");*/
        log.info("[" + login + "] logged in");
    }

    @NotNull
    @Transactional
    public List<User> getOnlineUsers() {
        return new ArrayList<>(userDao.findAll());
    }

    @Transactional
    public void logout(@NotNull String login){
        userDao.delete(login);
        /*messageDao.save(login,"logged out");*/
        log.info("[" + login + "] logged out");
    }

    @NotNull
    @Transactional
    public List<Message> getMessages() {
        return new ArrayList<>(messageDao.findAll());
    }

    public void say(@NotNull String login,@NotNull String msg){
        messageDao.save(login,msg);
        log.info("[" + login + "]:" + msg);
    }
}
