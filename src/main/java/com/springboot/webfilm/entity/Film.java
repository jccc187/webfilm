package com.springboot.webfilm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "film"
)
public class Film {
    @Id
    @Column(
            name = "fid"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int fid;
    private String name;
    private String keyword;

    public Film() {
    }

    public int getFid() {
        return this.fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
