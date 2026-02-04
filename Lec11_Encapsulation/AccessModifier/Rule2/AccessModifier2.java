package Lec11_Encapsulation.AccessModifier.Rule2;

public class AccessModifier2 extends AccessModifier1 {
    // Can not access private members

    @Override

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }

}
