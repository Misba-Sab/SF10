package com.rnsit.day3;

public class EncapsulationDemo {
    public static void main(String[] args) {
        OopsConceptDemo obj=new OopsConceptDemo();
        obj.setAge(19);
        obj.setName("adil");
        obj.setSerialNum(101);

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getSerialNum());
    }
}
