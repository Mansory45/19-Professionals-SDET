package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use key to start me");
    }
    void stop(){
        System.out.println("Use the break to stop me");
    }
    void park(){
        System.out.println("You can park me manually ");
    }
}
class BMW extends Car{
    @Override
    void start() {
        super.start();
        System.out.println("you can use push start button to start me");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("you can use auto breaking or manual break to stop me");
    }

}
class Tesla extends  Car{
    @Override
    void start() {
        System.out.println(" you can start me from app");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking to stop me ");
    }

    @Override
    void park() {
        System.out.println(" i can park myself");
    }
}
class Toyota extends Car{


}