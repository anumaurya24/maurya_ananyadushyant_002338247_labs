/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author anany
 */
public class Product {
    private String name;
    private int price;
    private int id;
    private ImageIcon Image;

    public ImageIcon getProdImage() {
        return Image;
    }

    public void setProdImage(ImageIcon Image) {
        this.Image = Image;
    }
     public static void setCount(int count) {
        Product.count = count;
    }
    private ArrayList<Feature> features;
    private static int count=0;
    public Product(){
        count++;
        id=count;
        features=new ArrayList<Feature>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

   public Feature addNewFeature() {
        Feature newFeature = new Feature();  // Create a new Feature using the default constructor
        features.add(newFeature);            // Add the new Feature to the list of features
        return newFeature;                   // Return the new Feature

}   
@Override
public String toString(){
    return name;  
}
}
