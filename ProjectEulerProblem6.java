
public class ProjectEulerProblem6 {
	

	public int euler6(int n) {
int Square = 0;
int Sum = 0;
for (int i=1; i<=n; i++) {
	Square +=  (i*i);
	Sum += i;
		}
		Sum *= Sum;
		
	int ans = Sum-Square;
	return ans;
	}
public static void main(String[]args){
	System.out.println();
	
	}
}
