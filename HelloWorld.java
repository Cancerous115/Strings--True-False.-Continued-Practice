class HelloWorld{
  public static void main(String[]args){
    String literalStrings1="abc";
    String literalStrings2="abc";
//"abc" was already present so the first will be the true form, even with objectString1 and objectString2 having the same values./ 
//Print True for literalStrings because it's first object is identified, while objectString values are different from our first. Making the first true, and objectString False. 
    String objectString1 = new String("def");
    String objectString2= new String("def");

    System.out.println(literalStrings1 == literalStrings2);

    System.out.println(objectString1 == objectString2);
  }
}