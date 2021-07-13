package ru.atom.lecture07.server.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message", schema = "chat")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Integer id;

    @ManyToOne (fetch = FetchType.EAGER, cascade = {CascadeType.ALL},targetEntity = User.class)
    @JoinColumn (name = "user_id")
    private User user;

    @Column(name = "time", nullable = false)
    private Date time = new Date();

    @Column(name = "value", nullable = false, length = 140)
    private String value;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        /*return this;*/
    }

    public Date getTime() {
        return time;
    }

    public Message setTime(Date timestamp) {
        this.time = timestamp;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Message setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", timestamp=" + time +
                ", value='" + value + '\'' +
                '}';
    }
}
