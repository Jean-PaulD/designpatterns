/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creationalTest.builder;

import designPatterns.creational.Builder.ItalianMealBuilder;
import designPatterns.creational.Builder.JapaneseMealBuilder;
import designPatterns.creational.Builder.Meal;
import designPatterns.creational.Builder.MealBuilder;
import designPatterns.creational.Builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void driverTest() {
         MealBuilder mealBuilder = new ItalianMealBuilder();
         MealDirector mealDirector = new MealDirector(mealBuilder);
         mealDirector.constructMeal();
         Meal meal = mealDirector.getMeal();
         System.out.println("Meal 1 name is: " + meal);
         
         mealBuilder = new JapaneseMealBuilder();
         mealDirector = new MealDirector(mealBuilder);
         mealDirector.constructMeal();
         meal = mealDirector.getMeal();
         System.out.println("Meal 2 name is: " + meal);
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
