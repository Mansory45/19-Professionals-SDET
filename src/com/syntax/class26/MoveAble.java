package com.syntax.class26;

public interface MoveAble {
   void move();
}
class Car implements MoveAble{
   public void move(){
      System.out.println("A car can move");
   }
   public void park(){
      System.out.println(" you can park me");
   }
}

class Person implements MoveAble{
   @Override
   public void move(){
      System.out.println("Human can also move");
   }
}
class Test{
   public static void main(String[] args) {
      MoveAble moveAble = new Car(); // widening
      moveAble.move();
      ((Car)(moveAble)).park();// narrowing

      MoveAble[] moveAbles = {new Car(),new Person()};
   }
}