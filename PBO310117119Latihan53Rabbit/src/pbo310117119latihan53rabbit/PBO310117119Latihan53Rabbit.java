/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan53rabbit;

/**
 *
 * @author Yogaputra
 * Nama                 : Arditya Yogaputra S
 * Kelas                : PBO3
 * NIM                  : 10117119
 * Deskripsi Program    : Program ini menampilkan rabbit
 */
public class PBO310117119Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rabbit rab = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rab.getName());
        System.out.println(rab.getName() + " is Vegetarian? " + rab.isVegetarian());
        System.out.println(rab.getName() + " eats " + rab.getEats());
        System.out.println(rab.getName() + " has " + rab.getNoOfLegs() + " legs.");
        System.out.println(rab.getName() + " color is " + rab.getColor());

    }

}
