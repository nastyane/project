package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;

public Product (long ID){
    this.id = ID;
}

//public String toString(){
      //return //"Product(title=" + this.getTitle() + ", description="+this.getDescription());
    //}
}
