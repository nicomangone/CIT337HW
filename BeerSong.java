/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nico Mangone
 */
public class BeerSong {
    
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();

}
    
    public static void Ninety_Nine_Bottles_of_Beer() {
        
        int beerNum = 99;
        String word = "bottles";

     while (beerNum > 0) {

        if (beerNum == 1) {
          word = "bottle"; 
        }

        System.out.print(beerNum + " " + word + " of beer on the wall");
        System.out.println(", " + beerNum + " " + word + " of beer.");
        System.out.print("Take one down and ");
        System.out.print("pass it around, ");
        beerNum = beerNum - 1;

        //create if statement for when song ends
        if (beerNum > 0) {
           System.out.println(beerNum + " " + word + " of beer on the wall.");
           System.out.println(" ");
        } else {
           System.out.println("no more bottles of beer on the wall.");
        } 
     } 
   } 
}
