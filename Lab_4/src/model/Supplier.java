/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author anany
 */
public class Supplier {
    
    private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;
    
    private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    
    @Override
    public String toString() {
        return supplyName;
    }
     public Product findProductById(int id) {
        return productCatalog.searchProduct(id);
     }
}
