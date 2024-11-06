public class Main {
    public static void main(String[] args) {
        Car2 car = new Car2("blue","tesla");
        System.out.println(car.color);
    }
}

class Car2 {
    String color;
    String maker;
    Car2(String color, String maker) {
        this.color = color;
        this.maker = maker;
    }
}
