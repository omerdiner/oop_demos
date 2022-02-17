package com.gameservice.Entities;

public class Player {
    private String name;
    private String surname;
    private String tc;
    private int birthYear;
    private int id;

    public Player(String name, String surname, String tc, int birthYear, int id) {
        this.name = name;
        this.surname = surname;
        this.tc = tc;
        this.birthYear = birthYear;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tc='" + tc + '\'' +
                ", birthYear=" + birthYear +
                ", id=" + id +
                '}';
    }
}
