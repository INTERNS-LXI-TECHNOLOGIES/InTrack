public class Main
{
	public static void main(String[] args)
	{
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.abs(-4.5));
		
		System.out.println(Math.max(3,10));
		
		System.out.println(Math.max(0.5,0.05));
		
		System.out.println(Math.min(10,17));
		
		System.out.println(Math.min(0.10,0.100));
		
		System.out.println(Math.pow(3,3)); //3^3   return type double
		
		System.out.println(Math.sqrt(25));  //return type double
		
		System.out.println(Math.cbrt(28));  //cube root of a number  return type double
		
		System.out.println(Math.round(-1.6));
		
		System.out.println(Math.round(3.3));
		
		System.out.println(Math.ceil(5.2));  //convert to next number  
		
		System.out.println(Math.floor(5.2)); //convert to lower number
		
		System.out.println(Math.sin(Math.PI/5));//double
		
		System.out.println(Math.cos(4));//double
		
		System.out.println(Math.log(5.9866));//double
		
		System.out.println(Math.log10(1000));//double
		
		System.out.println(Math.random());//double
		
		System.out.println((Math.random()*10)+5);//double
	}
}