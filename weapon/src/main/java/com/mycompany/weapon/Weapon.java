/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.weapon;

/**
 *
 * @author jswai
 */
public class Weapon {

        // Instance Variables
    String name; 
    String type;
    int damage;
    int rarity;
 
    // Constructor Declaration of Class 
    public Weapon(String name, String type,
                   int damage, int rarity)
    {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.rarity = rarity;
    }//setters
 
    // method 1
    public String getName()
    {
        return name;
    }
    
  
    // method 2
    public String gettype()
    {
        return type;
    }
 
    // method 3
    public int getdamage()
    {
        return damage;
    }
 
    // method 4
    public int getrarity()
    {
        return rarity;
    }
 
    @Override
    public String toString()
    {
        return("you found "+ this.getName()+
               ".\nIt is a " +
               this.gettype()+",it deals " + this.getdamage()+
               " damage, and has a rarity of "+ this.getrarity() );
    }
 
    public static void main(String[] args)
    {
        Weapon knife = new Weapon("knife","dagger", 5, 1);
        System.out.println(knife.toString());
        
        Weapon kris = new Weapon("kris","dagger", 10, 2);
        System.out.println(kris.toString());
        
        Weapon xiphos = new Weapon("xiphos","dagger", 15, 3);
        System.out.println(xiphos.toString());
    }
}
 