
public class ProjectEulerProblem2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1 = 0;
    int num2 = 1;
	int num3 = 0;
	int total = 0;

	    while (num3 < MAX_TERM_VALUE) {
	        num3 = num1 + num2;
	        num1 = num2;
	        num2 = num3;

if (num3 %2 == 0) {
total = total +num3;
	        }
	    } 
System.out.println(total);  
	}
static int MAX_TERM_VALUE = 4000000;
	}



