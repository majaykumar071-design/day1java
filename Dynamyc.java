class Car{
    String color;
    void speed(int num){
        System.out.println("Speed...."+num);
    }
}

public class Dynamyc{
    public static void main(String[] args) {
        Car bmw=new Car();
        Car RR=new Car();
        Car Tesla=new Car();
        Car Ferari=new Car();

        bmw.color="Red";
        RR.color="Blue";
        Tesla.color="Black";
        Ferari.color="White";

        System.out.println(bmw.color);
        System.out.println( RR.color);  
        System.out.println(Tesla.color);
        System.out.println(Ferari.color); 

        bmw.speed(200);
        RR.speed(250);
        Tesla.speed(300);
        Ferari.speed(250);
    }
}