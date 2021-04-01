/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Date;
import static validation.Validate.*;

/**
 *
 * @author Jeferson
 */
public final class LostSale {
    
    private int idsale;
    private int idclint;
    private Date date;
    private Seller nameseller;
    private String reason;
    
    public LostSale(int idsale, int idclint, Date date, Seller nameseller, String reason) {
        this.setIdsale(idsale);
        this.setIdclint(idclint);
        this.setDate(date);
        this.setNameseller(nameseller);
        this.setReason(reason);
    }
    
    public int getIdsale() {
        return idsale;
    }
    
    public void setIdsale(int idsale) {
        if (validateCode(idsale) == true) {
            this.idsale = idsale;
        }else{
             System.exit(0);
        }
    }
    
    public int getIdclint() {
        return idclint;
    }
    
    public void setIdclint(int idclint) {
        if (validateCode(idclint) == true) {
            this.idclint = idclint;
        }else{
            return;
        }
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Seller getNameseller() {
        return nameseller;
    }
    
    public void setNameseller(Seller nameseller) {
        if (validateString(String.valueOf(nameseller), 3) == true) {
            this.nameseller = nameseller;
        }else{
            return;
        }
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        if (validateString(reason, 20) == true) {
            this.reason = reason;
        }else{
           
        }
    }
    
}
