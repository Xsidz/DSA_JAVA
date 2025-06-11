public class oop {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(1);

        System.out.println(p1.color + p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Siddhesh Kabra";
        myAcc.setPassword("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println(myAcc.username);


       dog d1 = new dog();
       d1.eats();
       d1.color = "brown";
       d1.breathe();
       d1.setLegs(4);
       d1.setbreede("Lab");


       Queen q = new Queen();
       q.moves();

       
    }
}

class  Pen{
      
    float tip;
    String color;

    void setColor(String newColor){
            color = newColor;
    }

    void setTip(float newTip){
        tip = newTip;
    }

}

class BankAccount{

    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}



class Student{
    int rollno;
    String name;
    String password;


    // copy constructor
   Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
   }
}


class Animals{
     String color;
      void eats(){
       System.out.println("animal Eats");
      }

      void breathe(){
        System.out.println("Animal Breathes!!");
      }
}

class mamal extends  Animals {
          
    int legs;
    void setLegs(int legs){
        this.legs = legs;
    }
}

class dog extends mamal{
       String breed;
       void setbreede(String Breed){
        this.breed = Breed;
       }
}


abstract class Animal{

    void eat(){
    System.out.println("Animal eats");

    }
      abstract void walk();

}


class horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}



interface ChessPlayers{
    void moves();
}

class Queen implements ChessPlayers{
    public void moves(){
           System.out.println("up,down,right,left,(disgonally in 4 directtions)");
    }
}

class Rook implements ChessPlayers{
          public void moves(){
            System.out.println("up down, left rightt");
          }
}


interface Herbivore{
    void EatGrass();
}

interface Carnivore{
    void EatMeat();
}


class Bear implements Herbivore, Carnivore{
    public void EatGrass(){
        System.out.println("The Animal eats Veg food");
    }
    public void EatMeat(){
        System.out.println("The animal eatts Meat");
    }
}