package com.reminder.memo.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mensajes")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="creador")
    private String creator;
    @Column(name="destinatario")
    private String destinatary;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_at")
    private LocalDateTime createAt;
    @Column(name="contenido")
    private String content;
    @ManyToOne()
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Message(String creator, String destinatary, String content, User user) {
        this.creator = creator;
        this.destinatary = destinatary;
        this.content = content;
        this.user = user;
    }

    public Message() {
    }

    public Long getId() {
        return id;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public String getDestinatary() {
        return destinatary;
    }
    public void setDestinatary(String destinatary) {
        this.destinatary = destinatary;
    }
    public LocalDateTime getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
