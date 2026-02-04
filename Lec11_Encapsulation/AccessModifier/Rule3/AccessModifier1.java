package Lec11_Encapsulation.AccessModifier.Rule3;

public class AccessModifier1 {

    private int pvt = 1;
    default int df = 2;
    protected int pro = 3;
    public int pbl = 4;

    // Các phương thức ở đây có thể truy cập tất cả các biến.
    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }

}
