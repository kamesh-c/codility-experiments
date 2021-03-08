import java.util.Arrays;

public class JavaCollections {
    private static int solution( int[] A, int K){
        Arrays.sort(A);
        int index = Arrays.binarySearch(A, K);

        return index;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[] {5,1,2,3,4,6}, 5));
    }
}
