import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
public class JavaStringTraining{

public static  String swapCase(String initialValue)
{
int length = initialValue.length();

char[] charArrays = initialValue.toCharArray();

for(int i=0;i<length;i++)
{if(Character.isLowerCase(charArrays[i]))
{charArrays[i]=Character.toUpperCase(charArrays[i]);}
else
{charArrays[i]=Character.toLowerCase(charArrays[i]);}



}
initialValue = String.copyValueOf(charArrays);
return initialValue;
}

public static String swapCase2(String initialValue)
{

initialValue =StringUtils.swapCase(initialValue);

return initialValue;

}

public static void main(String[] args)

{
Scanner sc = new Scanner(System.in);
System.out.println("wpisz dowolny tekst");
String initialValue = sc.nextLine();
System.out.println("wartosc zmieniona to");
System.out.println(swapCase(initialValue));


System.out.println("*********");
System.out.println("wartosc zmieniona metodą z biblioteki apache.commons");
System.out.println(swapCase2(initialValue));

	
}







}


