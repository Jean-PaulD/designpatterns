/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalTest.abstractFactory;

import designPatterns.creational.AbstractFactory.AbstractFactory;
import designPatterns.creational.AbstractFactory.ElectronicsFactory;
import designPatterns.creational.AbstractFactory.Food;
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
public class AstractFactoryTest {

    public AstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AbstractTest() {

        AbstractFactory abstractFactory = new AbstractFactory();

        ElectronicsFactory electronicsFactory1 = abstractFactory.getElectronicsFactory("microwave");
        Food f1 = electronicsFactory1.getFood("noodles");
        System.out.println("Microwave Food: " + f1.foodType());
        Food f2 = electronicsFactory1.getFood("not noodles");
        System.out.println("Microwave Food: " + f2.foodType());
        
        ElectronicsFactory electronicsFactory2 = abstractFactory.getElectronicsFactory("oven");
        Food f3 = electronicsFactory1.getFood("steak");
        System.out.println("Oven Food: " + f3.foodType());
        Food f4 = electronicsFactory1.getFood("not steak");
        System.out.println("Oven Food: " + f4.foodType());
        
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
