package org.example.models;

public class ModelConector {
    String URL = "jdbc:mysql://bm1w0sszewblw9udp6z6-mysql.services.clever-cloud.com/bm1w0sszewblw9udp6z6";
    String USER = "uo3ktfqj1mrjqjpv";
    String PASS = "RiQcFSQwIyvVDTnM9Nap";

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }
}
