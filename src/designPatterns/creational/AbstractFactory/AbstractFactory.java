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
public class AbstractFactory {

    public ElectronicsFactory getElectronicsFactory(String type) {
        if ("microwave".equals(type)) {
            return new MicrowaveFactory();
        } else {
            return new OvenFactory();
        }
    }

}
