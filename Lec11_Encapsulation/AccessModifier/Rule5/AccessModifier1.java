package Lec11_Encapsulation.AccessModifier.Rule5;

public class AccessModifier1 {

    private int pvt = 1;
    default int df = 2;
    protected int pro = 3;
    public int pbl = 4;

// Methods here can access all variables
    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
