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
class OvenFactory extends ElectronicsFactory {

    public OvenFactory() {
    }

    @Override
    public Food getFood(String type) {
    if ("steak".equals(type)) {
            return new SlowCook();
        } else {
            return new QuickCook();
        }
    }

}
