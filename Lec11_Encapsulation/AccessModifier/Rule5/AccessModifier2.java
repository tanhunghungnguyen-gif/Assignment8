package Lec11_Encapsulation.AccessModifier.Rule5;

import Lec11_Encapsulation.AccessModifier.Rule3.AccessModifier1;

public class AccessModifier2 {

    // Can not access default private protected members
    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt); //error
        System.out.println(object.df); //error
        System.out.println(object.pro); //error
        System.out.println(object.pbl);

    }
