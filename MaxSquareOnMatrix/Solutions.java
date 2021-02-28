public class Solutions {
    public int solution(int[] A) {
        //int i = 0;
        int matrixSize = 1;
        int maxSize = 0;
        // Finding the max size
        for (int i= 0; i < A.length; i++){
            if (A[i] > maxSize){
                maxSize = A[i];
            }
        }
        for ( int i=maxSize; i > 1; i--){
            matrixSize = i;
            //System.out.println("matrixSize :" +  matrixSize);
           int j = 0;
           int maxArraySize = A.length - 1;
           int matchCount = 0;
           while (j < A.length){
                if (A[j] >= matrixSize){
                    matchCount++;
                }else {
                    matchCount = 0;
                }
                if ( matrixSize > maxArraySize-j && matchCount == 0) {
                    break;
                }  
                //System.out.println("matrixSize " +  matrixSize + " A["+j+"] "+ A[j] + " Matched Count "+ matchCount );
                if (matrixSize == matchCount){
                     return matrixSize;
                 }
                j++;
           }
           
        }
        return matrixSize;
     }
    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        
        System.out.println("[1,2,3,4,5]");
        int[] A = {1,2,3,4,5};
        System.out.println(solutions.solution(A));
        int[] A1 = { 1, 2, 5, 3, 1, 3 };
        System.out.println(solutions.solution(A1));
        int[] A2 = { 3, 3, 3, 5, 4 };
        System.out.println(solutions.solution(A2));
        int[] A3 = { 6, 5, 5, 6, 2, 2 };
        System.out.println(solutions.solution(A3));
        
    }
}
