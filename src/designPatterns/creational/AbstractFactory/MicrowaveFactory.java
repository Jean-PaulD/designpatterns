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
public class MicrowaveFactory extends ElectronicsFactory {

    public MicrowaveFactory() {
    }

    @Override
    public Food getFood(String type) {
        if ("noodles".equals(type)) {
            return new InstantFood();
        } else {
            return new DefrostFood();
        }

    }

}
