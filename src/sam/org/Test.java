package sam.org;

public class Test
{
public static void main(String[] args)
{
try
{
System.out.println("5");
int data = 5 / 0;
}
catch(ArithmeticException e)
{
System.out.println("2");
System.exit(5658);
}
finally
{
System.out.println("3");
}
System.out.println("4");

System.out.println("Edited by Branch:Amar");
}
}


	 
