public class CoolNotCool {

//     Store a number in a variable called num and write an if statement: 
// If num is odd, display "Cool"
// If num is even and between 2-5, display "Not Cool"
// If num is even and between 6-20, display "Cool"
// If num is even and greater than 20, display "Not Cool
    
    public static void main (String args[]){
        int num=-4;
        
        if(num%2!=0){
            
            System.out.println("Cool");
        }else{
            
            if(num <6 && num>1){
            System.out.println("Not Cool");
            }else if(num>5 && num<21){
                System.out.println("Cool");
            }else if(num>20){
                System.out.println("Not Cool");
            }else{
                System.out.println("Number doesnt apply");
            }
        
        }

        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print(j);
        //     }
        //     System.err.println();
        // }
    }
}
