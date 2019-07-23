package b04.s40;

public class While {
    public static void main(String[] args) {
        boolean condition = true;
        boolean something = true;

        while (condition) {
            System.out.println("something is true");

            if (something) {
                condition = false;
            }
        }
        
        int[] array = {3,6,8,5,9};
        
        // col ciclo while
        
        int i =0;
        
        while(array[i]%3 == 0) {
        	System.out.println("Maurizio sei bellissimo e il numero " + array[i] + " è divisibile per tre");
        	i +=1;
        	}
        
         // col ciclo for
        
        for(int j=0; j< array.length; j++) {
        	if(j %2 == 1) {      
        	continue;                // solo posizioni dispari nell'array
        	}
        	if(array[j]%3 == 0) {
        	System.out.println(array[j]);
        }
    }
    
   
}
}
