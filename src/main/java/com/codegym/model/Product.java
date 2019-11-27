package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @NotEmpty
    @Size(max = 50)
    private String name;
    private double price;
    private int amount;
    private Date dateCreated;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    public Category category;

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public Product() {
    }

    public Product(String code, String name, double price, int amount, Date dateCreated, String description, Category category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.dateCreated = dateCreated;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public  Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
