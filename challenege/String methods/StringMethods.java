public class StringMethods{
  public static void main(String[] args) {
      String str = " Hello,World!  ";

      int length = str.length();
      System.out.println(length);
      
      char chara = str.charAt(7);
      System.out.println(chara);

      String subs = str.substring(7);
      System.out.println(subs);

      String subs2 = str.substring(7,10);
      System.out.println(subs2);

      String uppercase = str.toUpperCase();
      System.out.println(uppercase);

      String lowercase = str.toLowerCase();
      System.out.println(lowercase);

      boolean isEqual = str.equals(" Hello,World!  ");
      System.out.println(isEqual);

      String trim = str.trim();
      System.out.println(trim);

      int indexOf = str.indexOf("world");
      System.out.println(indexOf);

      
  }
  
}