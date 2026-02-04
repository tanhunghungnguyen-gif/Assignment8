package Lec11_Encapsulation.AccessModifier.Rule4;

import Lec11_Encapsulation.AccessModifier.Rule3.AccessModifier1;

public class AccessModifier2 extends AccessModifier1 {
    // Can not access default private members

    @Override
    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt); //error
        System.out.println(object.df); //error
        System.out.println(pro);
        System.out.println(object.pbl);
    }

}
