package ru.atom.lecture07.server.dao;

import ru.atom.lecture07.server.model.Message;
import ru.atom.lecture07.server.model.User;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MessageDaoImpl implements MessageDao {
    @PersistenceContext
    private EntityManager em;


    @Override
    public void save(String login, String msg ) {
        Message message = new Message();
        message.setUser(new User().setLogin(login));
        message.getTime();
        message.setValue(msg);
        em.persist(message);
    }

    @Override
    public List<Message> findAll() {

        return em.createQuery("Select t from " + Message.class.getSimpleName() + " t").getResultList();
    }
}

