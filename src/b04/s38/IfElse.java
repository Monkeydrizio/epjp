package b04.s38;

public class IfElse {
    public static void main(String[] args) {
               
        int value = 100;
                       
        if (value <=100 && value>=0) {
        
        if (value %2==0) {
            System.out.println(value + " è un numero pari");
        } else {
            System.out.println(value + " è un numero dispari");
        }
        }
         else {
        	System.out.println("il numero è troppo grande");
        }
        System.out.println("Cordiali saluti!"); 
    }
      
}
