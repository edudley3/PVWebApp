/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Registration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elizabethdudley
 */
public class RegistrationJUnit4Test {
    private static Registration r;
    private static Student s;
    
    public RegistrationJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        r = new Registration();
        r.setEmail("liz");
        r.setPass("eD");
        r.setUsername("lizbeth");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of login method, of class Registration.
     */
    @Test
    public void testRegister() {
        System.out.println("RegistrationTest : RegisterCheck()");
        //normal register
        String expResult = "main";
        String result = r.register();
        assertEquals(expResult, result);
        //already registered email check
        r.setEmail("user");
        r.setPass("pass");
        result = r.register();
        expResult = "index";
        assertEquals(expResult, result);
    }

}
