package day4;

public class matrixadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] x = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] y = {{11,21,31},{41,51,61},{71,81,91}};
//		int [][] z = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(+(x[i][j] +y[i][j])+" ");
			}
			System.out.print("\n");
		}
	}

}
