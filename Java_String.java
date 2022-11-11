class Java_String{
	public static void main(String[] args){
		String s1="Glive";
		String s2="Gijiness";
		//char[] ch1={'a','e','i','o','u'};
		
		System.out.println(s1.concat(s2));//means adding both string
		
		
		System.out.println(s1.equals(s2));// equals means equal checking
		
		
	//	System.out.println(s1.equalIgnoreCase(s2));//this line error idk
		
		
		System.out.println(s1.compareTo(s2)); //3 letters are some in this String
		
		
		//System.out.println(s1.compareToIgnoreCase());//this line also error idk  
		
		//System.out.println (s1.charAt('G'));// error 
		
		System.out.println(s1.contains(s2));// checking both string are same
		
		System.out.println(s1.startsWith("G")); // true beacuse G is the 1st letters
		
		
		System.out.println(s1.endsWith("G"));//false beacuse end letters is (s) 
		
		System.out.println(s1.indexOf("e"));//4
		
		System.out.println(s2.indexOf("e"));//5
		
		System.out.println(s1.substring(2));//ive
		
		System.out.println(s1.substring(2,3));//i
		
		System.out.println(s1.repeat(3)+" ");// thats means my s1 name raeapeated 3 times
		
		System.out.println(s1.replace('G','S'));//replace my name Glive too Slive
		
	}
}
