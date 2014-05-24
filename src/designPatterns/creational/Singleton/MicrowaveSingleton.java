/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designPatterns.creational.Singleton;

/**
 *
 * @author Jean-Paul
 */
public class MicrowaveSingleton { //This is singleton class
    
    private static MicrowaveSingleton microwaveSingleton = null;
    
    private MicrowaveSingleton(){}
    
    public static MicrowaveSingleton getInstance(){
        if(microwaveSingleton == null){
            microwaveSingleton = new MicrowaveSingleton();
        }
        return microwaveSingleton;
    }
    
    public void makeSounds(){
        System.out.println("Deet, deet, deeeeeeet! - The Microwave 2014");
    }
    
}
