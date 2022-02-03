
public class Grade {
    
  /*  Write an if/else statement for the following requirements:
If student gets 90 or higher: console log  A
If students get 80 or above: console log B
If students get 70 or above: console log C
If students get 55 or above: console log D
Any grade lower than 55 is F*/

public static void main(String args[]){
int grade=58;
    if(grade>89){
        System.out.println("you got an A");
    }else if (grade>79){
        System.out.println("you got a B");
    }else if(grade>69){
        System.out.println("you got a C");
    }else if(grade>54){
        System.out.println("you got a D");
    }else{
        System.out.println("you failed");
    }

    
}
    
}
