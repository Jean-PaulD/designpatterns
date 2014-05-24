/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPatterns.creational.Prototype;

/**
 *
 * @author Jean-Paul
 */
public class Dog implements Prototype {

    String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }
    
    @Override
    public String toString(){
        return "This dog says " + sound;
    }
}
