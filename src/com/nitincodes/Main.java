package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java program to print details of multiple students using array as an object:
     Scanner sc = new Scanner(System.in);
     Details s[] = new Details[5];
     int sum=0;
     for(int i=0;i<5;i++){
         s[i]=new Details();
         s[i].age=sc.nextInt();
         sum+=s[i].age;
    }
        System.out.println("the average of age of the students are"+(float)sum/5);
    }
    static class Details{
        int age = 0;

    }
}
