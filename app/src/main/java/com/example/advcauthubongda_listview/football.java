package com.example.advcauthubongda_listview;

public class football {
    private int flag;
    private int player_photo;
    private String name;
    private String old;

    public football(int flag, int player_photo, String name, String old) {
        this.flag = flag;
        this.player_photo = player_photo;
        this.name = name;
        this.old = old;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getPlayer_photo() {
        return player_photo;
    }

    public void setPlayer_photo(int player_photo) {
        this.player_photo = player_photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
