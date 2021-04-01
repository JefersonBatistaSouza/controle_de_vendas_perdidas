/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import static validation.Validate.validateString;
/**
 *
 * @author Jeferson
 */
public final class Seller {
    private int idseller;
    private String fullname;
    private String password;
    private String firstname;

    public Seller(String fullname, String password) {
        this.setFullname(fullname);
        this.setFirstname(this.getFullname());
        this.setPassword(password);
    }

    public int getIdSeller() {
        return idseller;
    }

    public void setIdSeller(int idseller) {
        this.idseller = idseller;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        if (validateString(fullname, 3) == true){
            this.fullname = fullname;
        }else{
            return;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String fullname) {
        String[] name = fullname.split(" ");
        this.firstname = name[0];
    }
}
