public class children
{
publi Static void main(String[]args)
{
    Scanner in = new Scanner(System.in);
		System.out.println("enter the 2n children in n pair");
		int a=in.nextInt();
		int b=a-1;
		int c=1;
		for(int i=1;i<=b;i++)
    {
			c*=i;
		}
System.out.println("total no of distinct pairs :"+c);
}
}
