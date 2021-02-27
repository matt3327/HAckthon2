package com.java.basics;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable

    public static void main(String[] args) {
        //call the functions in the required sequence
    }
    private int Input;
    
    public String getInput() {
        return Input;
    }

    public void displayResult(int result) {
        validatePhoneNumber = result;
        if(result == 1) {
        System.out.println("Valid");
        }else {
        	System.out.println("Invalid")
        }
    }

    public int validatePhoneNumber(String input) {
       for(int i; i < input.length(); i++) {
    	if(Character.isLetter(input.charAt(i) == true)) {return -1;}
       }
      
       int numOfNum = 0;
       
       for(int i; i < input.length(); i++) {
    	   if(Character.isDigit(Input.charAt(i)==true)) {
    		   numOfNum ++;
    	   }
       }
       for(int i; i < input.length(); i++) {
    	   if(Character.isSpecialCharacter(Input.charAt(i)==true)) {
    		  return -1;
    	   }
       }
       if(numOfNum == 10) {return 1;}
       else if(Input == null) {return 0;}
       else {return -1;}
       
    }
    
    public void closeScanner(){
       scanner.close();
    }
}
