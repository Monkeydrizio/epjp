package b04;

public class ExStrings {
	public static void main(String[] args) {
		
		String a = "Unbelivable mate!";
	    String b = "Scantly clad";
	    String c = "  Cheers!   ";
	    
	    System.out.println(a.charAt(0));
	    
	    System.out.println(a.compareTo(b));
	    
	    System.out.println(a.concat(b));
	    
	    System.out.println(a.contains("mate"));
	    
	    System.out.println(a.equals(b));
	    
	    System.out.println(a.indexOf('v'));
	    
	    System.out.println(a.isEmpty());;
	    
	    System.out.println(a.lastIndexOf('v'));
	    
	    System.out.println(a.length());
	    
	    System.out.println(a.replace('a', 'e'));
	    
	    String a1[] = a.split(" ");
	    String a11 = a1[0];
	    String a12 = a1[1];  			    		
	    System.out.println(a11 + "\n" + a12);
	    
	    System.out.println(a.substring(2));
	    System.out.println(a.substring(2, 11));
	    
	    System.out.println(a.toLowerCase());
	    System.out.println(a.toUpperCase());
	    
	    System.out.println(c.trim());

	}
}
