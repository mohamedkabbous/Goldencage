/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Glad.esprit.tests;

import Glad.esprit.util.MyConnection;
import java.sql.Connection;


/**
 *
 * @author Karray
 */
public class TestAddDepot {


    public static void main(String[] args) {
        
        Connection c1 =MyConnection.getInstance();
        if ( c1== null)
            System.out.println("non");
        else System.out.println("oui");
    }
}
