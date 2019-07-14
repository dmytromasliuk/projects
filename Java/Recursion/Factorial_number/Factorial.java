
public class Factorial {

	//calculating factorial number
	public static int solution(int n) {
		if (n != 0)
			return n * solution(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(0));
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
	}
	
}
