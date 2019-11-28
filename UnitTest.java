import java.math.*;
public class UnitTest {
	public static int fibonnacci(int number) {
	if (number == 0) {
		return 0;
	}
	if (number == 1 || number == 2) {
		return 1;
	}
	return fibonnacci(number -1) + fibonnacci(number -2);
	}
	 int n = 100;
 	int b = n*(n+1)/2;
 	
}


