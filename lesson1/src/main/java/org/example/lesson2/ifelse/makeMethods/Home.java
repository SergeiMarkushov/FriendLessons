package org.example.lesson2.ifelse.makeMethods;

public class Home {
    private int kvartira;
    private int etash;

    public Home(int kvartira, int etash) {
        this.kvartira =kvartira;
        this.etash = etash;
    }

    public int getKvartira() {
        return kvartira;
    }

    public void setKvartira(int kvartira) {
        this.kvartira = kvartira;
    }

    public int getEtash() {
        return etash;
    }

    public void setEtash(int etash) {
        this.etash = etash;
    }
}
