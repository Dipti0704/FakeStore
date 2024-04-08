package com.example.fakestore.modals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private long id;
    private String title;
    private String description;
    private double price;
    private Category category; // category object created
    private String image;

// if you want to create product constructor then instead of writing the whole use @AllArgsConstructor.
    // using @NoArgsConstructor default constructor will be created.

}

