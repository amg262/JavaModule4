package edu.wctc;

import java.io.Serializable;

public class Activity implements Playable, Serializable {
    private static final long serialVersionUID = 1L;

    private String name, desc;
    private int playersMin, playersMax;

    public Activity(String name, String desc, int playersMin, int playersMax) {
        this.name = name;
        this.desc = desc;
        this.playersMin = playersMin;
        this.playersMax = playersMax;
    }

    @Override
    public String rules() {
        return String.format("%s\n\t%s", name, desc);
    }

    @Override
    public String numberOfPlayers() {
        return playersMin == playersMax ? String.valueOf(playersMin) : playersMin + "-" + playersMax;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t# of Players: %s", rules(), numberOfPlayers());
    }
}
