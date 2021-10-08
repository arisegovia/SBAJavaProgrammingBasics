package com.company;

import java.util.Arrays;

public class Main {

    public static String reverseWords(char[] array){

        //Converts char into String
        String charToString = new String(array);

        //Converts words in string into String array, removing the space
        String[] words = charToString.split(" ");

        //Declaring reverseWords string
        String reverseWords = "";

        //Iterates through words String, reversing the position of the values
        for (int i = words.length - 1; i >= 0; i --){
            reverseWords += words[i] + " ";
        }

        return reverseWords;
    }

    public static void main(String[] args) {

        char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };

        System.out.println(Main.reverseWords(message));
    }
}
