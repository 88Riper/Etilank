/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etilank;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import etilank.Etilank;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class EtilankTest {
    
    public EtilankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("+before+");
   
    }
    
    @After
    public void tearDown() {
        System.out.println("+after+");
    }

    

    @Test
    public void testEmail() {
        System.out.println("+Test Email Values+");
        String expResultEmail = "admin";
        String result = Etilank.email(expResultEmail);
        System.out.println("Exp Result :"+expResultEmail);
        System.out.println("Result :" +result);
        assertEquals(expResultEmail,result);
    }

   
    @Test
    public void testPassword() {
        System.out.println("+Test password Values+");
        String expResultPassword = "Iptu.Saturo";
        String result = Etilank.password(expResultPassword);
        System.out.println("Exp Result :"+expResultPassword);
        System.out.println("Result :" +result);
        assertEquals(expResultPassword,result);
    }

    @Test
    public void testContainEmail(){
        System.out.println("+Test Contain Email+");
        String email = Etilank.email("admin");
        assertThat(email,containsString("ad"));  
    }
    
    @Test
    public void testNotContainEmail(){
        System.out.println("+Test No Contain Email+");
        String email = Etilank.email("admin");
        assertThat(email,(not(containsString(".com"))));
    }
    
    @Test
    public void EqualsVal(){
        System.out.println("+Test Equals Value");
        String email  = Etilank.email("admin");
        String password = Etilank.password("Iptu.Saturo");
        assertThat(email, is(equalTo(password)));
    }
    
    @Test
    public void notEqualsVal(){
        System.out.println("+Test Not Equals Value");
        String email  = Etilank.email("admin");
        String password = Etilank.password("Iptu.Saturo");
        assertThat(email, is(not(equalTo(password))));
    }

    @Test
    public void nullvall(){
        System.out.println("+Test Null Value");
        String email  = Etilank.email("admin");
        assertThat(email,is(nullValue()));
    }
        
    @Test
    public void notnullvall(){
        System.out.println("+Test Null Value");
        String email  = Etilank.email("admin");
        assertThat(email,is(not(nullValue())));
    }
    
    @Test
    public void startWithVal(){
        System.out.println("+Test Starts With Value+");
        String email = Etilank.email("admin");
        assertThat(email, startsWith("ad"));
    }
    
    @Test
    public void endWithVall(){
        System.out.println("+Test End With Value+");
        String email = Etilank.email("admin");
        assertThat(email, endsWith("min"));
    }
    
    @Test(expected = AssertionError.class)
    public void AssertionEmail(){
        System.out.println("+Test Assertion Email+");
        Etilank e = new Etilank();
        String email = Etilank.email("admin");
        String expected = "situro";
        assertEquals(expected, email);
    }
        
    /**
     * Test of inputData method, of class Etilank
     */
  //  @Test
  //  public void testInputData() {
    //    System.out.println("inputData");
      //  Etilank.inputData();
        //// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}

    /**
     * Test of menuUtama method, of class Etilank.
     */
    //@Test
    //public void testMenuUtama() {
      //  System.out.println("menuUtama");
        //Etilank.menuUtama();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    //}

    /**
     * Test of printValues method, of class Etilank.
     */
    //@Test
    //public void testPrintValues() {
      //  System.out.println("printValues");
        //ArrayList<Etilank.Data> list = null;
        //Etilank instance = new Etilank();
        //instance.printValues(list);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}

    /**
     * Test of main method, of class Etilank.
     */
    //@Test
    //public void testMain() {
      //  System.out.println("main");
        //String[] args = null;
       // Etilank.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}
    
}
