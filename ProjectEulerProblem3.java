public class ProjectEulerProblem3 {

	public static void main(String[] args) {

		double A = 0;
        	
		double B = 600851475143d;
        		
	for (double C = 3; C < B; C += 2) {
     		
	while (B % C == 0) {
                
				A = C;
               
			B = B / C;
        
				}
				}
        
	System.out.println( + ((B == 1)?A:B));
		}
	}