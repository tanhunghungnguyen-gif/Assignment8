
package Lec9_InheritanceAndPolymorphism.Super.InstanceVariable;

public class Husky extends Dog{
    int price = 1500;
    void HienThiPrice(){
        System.out.println("Dog's price : "+super.price);
        System.out.println("Husky's price : "+price);
    }
    
}
