package b04.s40;

public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[6];
        // ...

        for (int i = 0; i < array.length; i++) {
            int K = 0 + i * 30;
            if (K < 100 && K >= 0) {
                array[i] = Integer.toString(K) + " cannoli con ricotta non sufficienti";
            } else {
                array[i] = Integer.toString(K) + " cannoli con ricotta in abbondanza";
            }
        }
        for (String item : array) {
            System.out.println(item);
        }

        int[] filippo = { 7, 5, 11, 25 };
        int k = 5;
        for (int value : filippo) { // creo una copia dell'array e nn lo posso modificare. Si usa solo in lettura praticamante
            k = k+value;
            value +=k;
            ;
        }

       for(int i=0;i<filippo.length;i++) {
           System.out.println(filippo [i]);    // ci mostrerà che non abbiamo modificato l'array
       }
       
       System.out.println(k);
       

    }
}
