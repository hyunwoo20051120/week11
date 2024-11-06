public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.start();
        car.openSunroof();
        car.engine.run();

        Bike bike = new Bike();
        bike.color = "blue";
        bike.start();
        bike.backBreak();
        bike.engine.run();
        System.out.println(car.toString());
    }
}

class Vehicle {
    String color;

    void start() {
        System.out.println("차량이 출발합니다.");
    }
}

class Car extends Vehicle {  // Car 클래스는 Vehicle을 상속받음
    Engine engine = new Engine();
    void openSunroof() {
        System.out.println("선루프를 엽니다.");
    }
}

class Bike extends Vehicle {
    Engine engine = new Engine();
    void backBreak() {
        System.out.println("Hold backBreak.");
    }
}

class Engine {
    void run() {
        System.out.println("엔진이 작동합니다.");
    }
}