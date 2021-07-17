package com.abhi.lldclass.movieBookingLLD;

/**
 *Creating a movie class
 */
public class Movie {
    private int id;
    private String name;
    private String description;
    private String duration;
    private Language language;
    private float price;

    public Movie(int id, String name, String description, String duration, Language language, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.language = language;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration='" + duration + '\'' +
                ", language=" + language +
                ", price=" + price +
                '}';
    }
}
