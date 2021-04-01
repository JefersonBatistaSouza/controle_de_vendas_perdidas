/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import objects.Seller;

/**
 *
 * @author temporario
 */
public class Session {

    private static Session instance = null;
    private Seller nameseller;
    private Seller idseller;

    private Session() {
    }

    public Seller getNameseller() {
        return nameseller;
    }

    public void setNameseller(Seller nameseller) {
        this.nameseller = nameseller;
    }

    public Seller getIdseller() {
        return idseller;
    }

    public void setIdseller(Seller idseller) {
        this.idseller = idseller;
    }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }
}
