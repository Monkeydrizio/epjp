package b06;

public class S63 {
    public static void main(String[] args) {
        System.out.println(Boolean.class);
        System.out.println(Character.class);
        System.out.println(Byte.class);
        System.out.println(Short.class);
        System.out.println(Integer.class);
        System.out.println(Float.class);
        System.out.println(Double.class);

        // from Java 9 on
        // @SuppressWarnings("deprecation")
        Integer i = new Integer(1); // questo metodo � sconsigliato da Java 9 e verr� rimosso in futuro
        Integer j = Integer.valueOf(2); // si peferisce usare valueOf per creare i tipi Wrapper
        System.out.println(i + j);

        int k = j.intValue();
        System.out.println(k);

        Integer m = 3;
        System.out.println(m);

        int n = j;
        System.out.println(n);
    }
}
