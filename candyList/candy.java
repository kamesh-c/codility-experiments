import java.util.Arrays;

public class candy {
    public static int solution(int[] candyList){
        long count = Arrays.stream(candyList).distinct().count();
        int max = candyList.length/2;

        if (count < max){
            return (int)count;
        }else{
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,2,3,3}));
        System.out.println(solution(new int[]{6,6,6,6}));
        System.out.println(solution(new int[]{1,1,2,3}));

    }
}
