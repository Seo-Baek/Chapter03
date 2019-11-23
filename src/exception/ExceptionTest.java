package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("Some Codd 1");
		System.out.println("Some Codd 2");
		System.out.println("Some Codd 3");
		
		try {
			int result = 1000/a;
		} catch(ArithmeticException ex) {
			//1.사과
			System.out.println("죄송합니다. 예기치 않은 상황이 발생하였습니다.");
			
			//2.로그남기기
			System.out.println(ex);
			
			//3.정상종료
			return;
			
			//1,2,3 번을 하지 못하면
			//다음 코드라도 적어놓고 절대 catch 블럭을 비워 놓지 말아야 한다!
			//ex.printStackTrace();
		}
		System.out.println("Some Codd 4");
		System.out.println("Some Codd 5");
		System.out.println("Some Codd 6");
	}

}
