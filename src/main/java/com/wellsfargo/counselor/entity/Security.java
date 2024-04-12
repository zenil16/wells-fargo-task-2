package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long securityId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private short purchasePrice;

    @Column(nullable = false)
    private long quantity;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long portfolioId;

    protected Security(){

    }
    public Security(String firstName, String lastName, short purchasePrice, long portfolioId, long quantity, Date purchaseDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
    }

   public long getSecurityId(){
        return securityId;
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

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public short getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(short purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
