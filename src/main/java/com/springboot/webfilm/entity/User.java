package com.springboot.webfilm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "user"
)
public class User {
    @Id
    @Column(
            name = "uid"
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int uid;
    private String uplace;
    private String uip;

    public User() {
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUplace() {
        return this.uplace;
    }

    public void setUplcae(String uplace) {
        this.uplace = uplace;
    }

    public String getUip() {
        return this.uip;
    }

    public void setUip(String uip) {
        this.uip = uip;
    }
}

