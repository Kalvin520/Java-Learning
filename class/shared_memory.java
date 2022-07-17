public class shared_memory {
	public static void main(String args[])   {
		Pass pa1=new Pass();
		pa1.printNum();       //1
	    Pass pa2=new Pass();
		pa2.printNum();       //2
	}
}
//class Pass{
	static int n =0;	
	Pass ()	{
		n++;
	}	
	public void printNum()		{
		System.out.println(n +" 個物件已建立");
	}
}    

