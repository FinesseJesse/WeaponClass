/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.customclassjesse;

/**
 *
 * @author jswai
 */
public class CustomClassJesse {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Class Declaration

    // Instance Variables
    String name; 
    String type;
    int damage;
    int range;
 
    // Constructor Declaration of Class
    public sword(String name, String type,
                   int damage, int range)
    {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.range = range;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
    }
}
