class Reversed_String
{
	public static void main(String[] args )
	{
		String s1="My name is Glive Gijiness c";
		String sa[]=s1.split("");
		for(int i=sa.length-1; i>=0; i--)
			System.out.print(sa[i]+" ");
	}
}