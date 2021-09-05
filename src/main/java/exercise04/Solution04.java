/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Marc Palacio
 */

/*
 *    - Write an application
 *      that asks the user for various things (noun, verbs, adjective etc in the form of a string)
 *      then print all of the inputs in a specific format (in this case a Mad Lib)
 */

package exercise04;
import java.util.*;

public class Solution04 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hillarious!", verb, adjective, noun, adverb);
    }
}
