/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designPatterns.creational.AbstractFactory;

/**
 *
 * @author Jean-Paul
 */
public class DefrostFood extends Food {

    public DefrostFood() {
    }

    @Override
    public String foodType() {
        return "frozen";
    }
    
}
