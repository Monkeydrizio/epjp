package b04.s40;

public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[6];
        // ...
        
        for(int i=0; i< array.length; i++) {
        	int K = 0+i*30;
        	if(K<100 && K>=0) {
        	array[i]=  Integer.toString(K)+ " cannoli con ricotta non sufficienti";
        }
        	else {
        		array[i]=  Integer.toString(K)+ " cannoli con ricotta in abbondanza";	
        	}
        }
        for (String item : array) {
            System.out.println(item);
        }
    }
}
