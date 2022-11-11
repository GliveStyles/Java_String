class String_Builder
{
	public static void main(String[] Args)
	{
		StringBuilder s1=new StringBuilder("Glive");
		System.out.println(s1.append("Gijiness"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.delete(2,6));
		System.out.println(s1.replace(0,3,"Styles"));
		System.out.println(s1.reverse());
		
	}
}
