package Cuadrante;

public class Tres {

	public static <T> Boolean exists (T[][] values, T valueToSearch) {
		
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values.length;j++) {
				if (valueToSearch==values[i][j])
					return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a [][] = {
				 {2,2,2},
				 {1,2,3,4}
		 };
		 int b [][] = {
				 {2,2,2},
				 {1,2,3,4}
		 };
		 int c = 2;

		 Tres.exists(a,b);
}
	
	

	
}
