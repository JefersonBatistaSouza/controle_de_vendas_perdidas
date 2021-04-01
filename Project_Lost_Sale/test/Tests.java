/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import config.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author temporario
 */
public class Tests {

    public static void main(String[] args) {
        try {
            //novo Vendedor
            Seller s = new Seller("jef", "SGSGFKSHFSHFK");
            System.out.println(s.getFullname() + " " + s.getPassword() + " " + s.getFirstname());
            Calendar c = Calendar.getInstance();
            //nova venda perdida
            LostSale ls = new LostSale(110232, 109343, c.getTime(), s, "Peça não tinha no estoque");
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(ls.getIdsale()+" "+ls.getIdclint()+" "+formato.format(ls.getDate())+" "+ls.getNameseller().getFullname()+" "+ls.getReason());
            
            
           new Connection();
            
        } catch (NullPointerException | NumberFormatException ex) {
            return;
        }
    }
}
