package com.pavdem2012.helloworld;

public class HelloWorld {

    public static void main(String[] args) {
    
        float i = 6; 
        float j = 7; 
        float answer =i /j; 

        String message = "Hello World!!!! Да ну нафиг так бывает???";

        String stringAnswer = message + " " + answer;

        boolean isMoreThanOne ;
        if (answer > 1) {
            isMoreThanOne = true;
        } else {
            isMoreThanOne = false;	
        }

        System.out.println(message);
        System.out.println(stringAnswer + " " + isMoreThanOne); 
    }
}
