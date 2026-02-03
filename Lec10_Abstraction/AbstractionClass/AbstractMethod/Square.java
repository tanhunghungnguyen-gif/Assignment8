package Lec10_Abstraction.AbstractionClass.AbstractMethod;

public class Square extends Shape {

    private double side; //Khai bao doi tuong side chi dung trong hinh vuong nay

    public Square(double side) { //Khoi tao Constructor (ham) co kieu du lieu tra ve cua side
        this.side = side;        //Phan biet bien instance  voi tham so truyen vao side
    }

    @Override
    public double calculateArea() {
        return side * side;     //Dùng khi phương thức có kiểu trả về (không phải void)
    }

}
