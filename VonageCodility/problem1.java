import java.util.Arrays;


public class problem1 {
    
    public static int solution(int[] A){
        Arrays.sort(A);
        //A.Min();
        int flag =1;
        for (int i =0; i < A.length; i++){
            if(A[i] <= 0){
                continue;
            }else if (A[i] == flag){
                flag++;
            }
        }
        return flag;
        
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));        
    }
}
