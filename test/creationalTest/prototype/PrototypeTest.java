/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creationalTest.prototype;

import designPatterns.creational.Prototype.Dog;
import designPatterns.creational.Prototype.Person;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jean-Paul
 */
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void protoTest() {
         Person p1 = new Person("Fred");
         System.out.println("person 1: " + p1);
         Person p2 = (Person)p1.doClone();
         System.out.println("person 2: " + p2);
         
         Dog d1 = new Dog("Fred");
         System.out.println("person 1: " + d1);
         Dog d2 = (Dog)d1.doClone();
         System.out.println("person 2: " + d2);
         
     
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
