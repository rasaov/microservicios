package com.reminder.memo.models;

import java.time.LocalDateTime;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "partidas")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creador")
    private String creator;

    @Column(name = "deporte")
    private String sport;

    @Column(name = "ciudad")
    private String city;

    @Column(name = "provincia")
    private String province;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha")
    private LocalDateTime date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "hora_comienzo")
    private LocalDateTime startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "hora_final")
    private LocalDateTime endTime;

    @Column(name = "participantes")
    private Integer attendees;

    @Column(name = "suplentes")
    private Integer substitutes;

    @Column(name = "comentarios")
    private String comments;

    @ManyToMany(mappedBy = "matches")
    private List<User> users;

    public Match(String creator, String sport, String city, String province, LocalDateTime date,
            LocalDateTime startTime, LocalDateTime endTime, Integer attendees, Integer substitutes, String comments) {
        this.creator = creator;
        this.sport = sport;
        this.city = city;
        this.province = province;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.attendees = attendees;
        this.substitutes = substitutes;
        this.comments = comments;
    }

    public Match() {
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

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getAttendees() {
        return attendees;
    }

    public void setAttendees(Integer attendees) {
        this.attendees = attendees;
    }

    public Integer getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(Integer substitutes) {
        this.substitutes = substitutes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
