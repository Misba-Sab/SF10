package com.rnsit.day2;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 10,b=20,c=30;
        if(a>b)
            if(a>c)
                System.out.println("a is greater");
            else
                System.out.println("c is greater");
        else if(b>a)
            if(b>c)
                System.out.println("b is greater");
            else
                System.out.println("c is greater");
        else
            System.out.println("c is greater");

    }
}
