package Lec11_Encapsulation.AccessModifier.Rule3;

public class AccessModifier2 {
    // Can not access private members

    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt);
        System.out.println(object.df);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }
}
