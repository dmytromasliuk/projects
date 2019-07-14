
public class Fibonacci {

	public static int solution(int n){
		if (n <= 0) return -1;
		if (n > 2)
			return  solution(n-1) + solution(n-2);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(-2));
		System.out.println(solution(-1));
		System.out.println(solution(0));
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));
		System.out.println(solution(7));
		System.out.println(solution(8));
		System.out.println(solution(35));
	}
	
}
