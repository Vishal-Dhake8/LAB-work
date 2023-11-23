package arrayadd;
	
	public class ArrayAdd {
	    public static void main(String[] args) {
	        int[][] matrixA = {
	            {4, 2, 6},
	            {7, 5, 11},
	            {3, 8,0 }
	            };
	        

	        int[][] matrixB = {
	            {4, 8, 7},
	            {1, 5, 5},
	            {2, 2, 8}
	        };

	        int rows = matrixA.length;
	        int cols = matrixB[0].length;

	        int[][] sumMatrix = new int[rows][cols];

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	      
	        System.out.println("MatrixA:");
	        printMatrix(matrixA);

	        System.out.println("MatrixB:");
	        printMatrix(matrixB);

	        System.out.println("Sum of Matrices:");
	        printMatrix(sumMatrix);
	    }

	 
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	 
	

		
