package com.DBExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Emanuele on 30/12/2016.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private Date postedOn;

    //many posts can be written by the same author
    @ManyToOne
    private Author author;


    //empty constructor for JPA
    private Post() {}

    public Post(Long id, String title, String body, Date postedOn) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.postedOn = postedOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }
}
