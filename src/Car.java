/*
Create a class Car having propertys manufacturer and price.Create three instances of the class and display the details of each car sorted with respect to the price.
 */
import java.util.Scanner;

class Car {
    public String Car_property;
    public String Car_manufacturer;
    public int price;
    public Car(String Car_property,String Car_manufacturer,int price)
    {
        this.Car_property=Car_property;
        this.Car_manufacturer=Car_manufacturer;
        this.price=price;
    }
    public static void Display(Car[] obj){
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length-1; j++) {
                if(obj[j].price < obj[j+1].price){
                    Car t = obj[j];
                    obj[j]= obj[j+1];
                    obj[j+1]= t;
                }
            }

        }
        for (int i=0; i< obj.length; i++){
            System.out.println(obj[i].Car_property+" "+ obj[i].Car_manufacturer);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        Car obj[] = new Car[size];
        for(int i=0; i<obj.length; i++){
            System.out.println("Enter the property of Car such as SUV , Sports or other");
            String s1= sc.nextLine();
            System.out.println("Enter the manufacturer of Car");
            String s2= sc.nextLine();
            System.out.println("Enter the Price of Car");
            int p= sc.nextInt();
            obj[i]=new Car(s1,s2,p);
        }
        Car.Display(obj);
    }
}