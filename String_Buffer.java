class String_Buffer
{
	public static void main(String[] args)
	{
		String s="Glive";
		StringBuffer s1=new StringBuffer("Glive");
		System.out.println(s1.append("Gijiness"));
		System.out.println(s1.charAt(2));
		System.out.println(s.indexOf('v'));
		
		System.out.println(s1.delete(2,5));
		System.out.println(s1.replace(1,4,"styles"));
		System.out.println(s1.reverse());
	}
	
}