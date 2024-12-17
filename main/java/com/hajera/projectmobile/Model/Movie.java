package com.hajera.projectmobile.Model;

public class Movie {
    private String title;
    private String deskripsi;
    private String tahun;
    private String photo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getPhoto() {
        return Integer.parseInt(photo);
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}