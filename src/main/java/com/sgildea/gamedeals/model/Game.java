package com.sgildea.gamedeals.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 250)
    @JsonProperty("name")
    private String name;

    @Size(max = 250)
    @NotNull( message = "Please enter a title")
    private String title;

    @Digits(integer=6, fraction=2, message = "Please enter a valid price")
    @NotNull( message = "Please enter a price")
    @JsonProperty("rating")
    private Double price;

    @Size(max = 750)
    @URL
    @JsonProperty(  value="url", required=true, defaultValue="No url")
    private String link;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "platform_id", referencedColumnName="id", nullable=false, unique=false )
    private Platform platform;

    @Lob
    @Column(name="image")
    private byte[] image;

    private LocalDateTime createDate;

    @Size(max = 2500)
    @NotNull
    @JsonProperty("body")
    private String description;


    @Lob
    @Column(name="file")
    private byte[] file;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getFile() {        return file; }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
