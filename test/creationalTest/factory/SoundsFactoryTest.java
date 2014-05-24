/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creationalTest.factory;

import designPatterns.creational.Factory.Sounds;
import designPatterns.creational.Factory.SoundsFactory;
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
public class SoundsFactoryTest {
    
    public SoundsFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sound() {
         SoundsFactory soundsFactory = new SoundsFactory();
         Sounds s1 = soundsFactory.getSound("microwave");
         System.out.println("Sound: " + s1.iAm());
         Sounds s2 = soundsFactory.getSound("oven");
         System.out.println("Sound: " + s2.iAm());
         
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
