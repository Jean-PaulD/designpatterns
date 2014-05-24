/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designPatterns.creational.Factory;

/**
 *
 * @author Jean-Paul
 */
public class SoundsFactory {
    public Sounds getSound(String type){
        if ("microwave".equals(type)){
            return new Microwave();
        }
        else
            return new Oven();
    }
}
