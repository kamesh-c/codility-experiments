import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibFrog {
 
    public static List<Integer> getFibonacciNumbers( int max){
        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);
        for (int i = 1; fib.get(i) <= max; i++){
            fib.add(fib.get(i-1) + fib.get(i));
        }
        fib.remove(0);
        Collections.reverse(fib);
        return fib;
    }

    public static int solution(int[] A){
        List<Integer> fibList = getFibonacciNumbers(A.length);
        fibList.stream().forEach(System.out::println);
        Pointers point = new Pointers(-1, 0);
        List<Pointers> positions = new ArrayList<>();
        boolean[] stepFlag = new boolean[A.length];
        positions.add(point);
        Pointers nextPoint = null;
        int steps = 0; 
        while (true){
            if (positions.size() == steps){
                return -1;
            }
            nextPoint = positions.get(steps);
            steps++;
            for(Integer i: fibList){
                if (nextPoint.currentPosition + i == A.length){
                    //System.out.println(Arrays.toString(stepFlag));
                    return nextPoint.counter +1 ;
                }else if ((nextPoint.currentPosition+ i > A.length ) || A[nextPoint.currentPosition+i] == 0 || stepFlag[nextPoint.currentPosition+i]){
                    continue;
                }
                positions.add(new Pointers(nextPoint.currentPosition +i, nextPoint.counter+1));
                stepFlag[nextPoint.currentPosition+i] = true ;
            }
            
        }
    }
    public static void main(String[] args) {
       System.out.println(solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
    }
}
class Pointers{
    int currentPosition= -1;
    int counter = 0;
    Pointers(int currentPosition, int counter){
        this.currentPosition = currentPosition;
        this.counter = counter;
    }
}