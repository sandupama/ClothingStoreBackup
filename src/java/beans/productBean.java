/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class productBean implements Serializable {
      public productBean() {
    }
    
   
    private String productName;
    private String size;
    private String color;
    private int amount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    public String getSize() {
        return size;
    }

   
    public void setSize(String size) {
        this.size = size;
    }

   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public int getAmount() {
        return amount;
    }

    
    public void setAmount(int amount) {
        this.amount = amount;
    }

}