public class Tdd
{
	public static void main(String[] arg)
	{
		String s = " Hello World ";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.substring(4));
		
		System.out.println(s.substring(0,5));
		
		System.out.println(s.equals("hello World"));
		
		System.out.println(s.equalsIgnoreCase("HELLO WORLD"));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.trim()); // trim the wightspace front and end
		
		System.out.println(s.replace("l","e"));
		
		System.out.println(s.startsWith(" Hello"));
		
		System.out.println(s.endsWith("ld "));
		
		System.out.println(s.contains(" "));
		
		System.out.println(s.indexOf("h"));
		
		System.out.println(s.lastIndexOf("l"));
		
		System.out.println(s.split("e"));
		
		
	
	}
}
	