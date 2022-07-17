public class shared_memory {
	public static void main(String args[])   {
		Passqq pa1=new Passqq();
		pa1.printNum();       //1
	    Passqq pa2=new Passqq();
		pa2.printNum();       //2
	}
}
class Passqq{
	static int n =0;	
	Passqq ()	{
		n++;
	}	
	public void printNum()		{
		System.out.println(n +" 個物件已建立");
	}
}    
