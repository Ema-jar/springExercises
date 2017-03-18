package com.emajar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by drago on 17/03/17.
 */
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    /**
     * This annotation means that an author can create many posts.
     * The mapping indicates that the author is the owner of the relationship.
     */
    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    private Author() {
        // for JPA
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Author[firstName=" + firstName + ", lastName='" + lastName + "]";
    }
}
