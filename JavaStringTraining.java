import java.util.Scanner;

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

public static void main(String[] args)

{
Scanner sc = new Scanner(System.in);
System.out.println("wpisz dowolny tekst");
String initialValue = sc.nextLine();
System.out.println("wartosc zmieniona to");
System.out.println(swapCase(initialValue));


	
	
}







}


