package com.rnsit.day2;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int k = 5; k < 15; k++)
        {

            if (k%2 != 0)//8%2!=0//false
                continue;

            System.out.print(k + " ");//6,8
        }

    }
}
