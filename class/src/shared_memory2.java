public class shared_memory2 {
	public static void main(String[] args) {
		System.out.println(Pass3a.score);//60
		System.out.println(Pass3a.dispose(88));//及格
	}
}
class Pass3a{
	static int score=60;
	static String dispose(int a) {
		String b="不及格";
		if (a>=60)
			b="及格";
		return b;
	}
}
