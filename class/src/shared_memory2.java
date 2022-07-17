public class e9_2g {
	public static void main(String[] args) {
		System.out.println(Pass3.score);//60
		System.out.println(Pass3.dispose(88));//及格
	}
}
class Pass3{
	static int score=60;
	static String dispose(int a) {
		String b="不及格";
		if (a>=60)
			b="及格";
		return b;
	}
}
