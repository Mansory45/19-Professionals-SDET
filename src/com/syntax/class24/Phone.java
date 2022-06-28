package com.syntax.class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlock();

    void sendText(){
        System.out.println("use the messing app to send the mesg");
    }

}
class Iphone extends Phone{
    @Override
    void displayPictures(){
        System.out.println("use the photos app to diplay the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use faceId to unlock the phone");
    }
}
class Sumsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery app to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("user Finger print sensor or face to unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {
        Sumsung sumsung = new Sumsung();
        sumsung.displayPictures();
    }
}