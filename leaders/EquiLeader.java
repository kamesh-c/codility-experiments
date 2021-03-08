import java.util.HashMap;
import java.util.*;

public class EquiLeader {
    public static int solution(int[] A){
        if(A.length == 0 )
            return 0;
        HashMap<Integer, Integer> leaderCount = new HashMap<>();

        for ( int i: A){
            if (leaderCount.containsKey(i)){
                leaderCount.put(i, leaderCount.get(i) + 1);
            }else {
                leaderCount.put(i, 1);
            }
        }
        int mid = A.length / 2;     
        //System.out.println(mid);  
        List<Integer> dominatingLeaders = new ArrayList<>();
        for( Integer key: leaderCount.keySet()){
            //System.out.println(key);
            if (leaderCount.get(key) >= mid ){
                dominatingLeaders.add(key);
            }
        }
        if (dominatingLeaders.size() == 0){
            return 0;
        }
        
        int dominate = 0;
        int equalLeader = 0;
        int nonDominate = 0;
        int dominator = dominatingLeaders.get(0);
        int dominatorOccurences = leaderCount.get(dominator);
        int nonDominatorOccurences = A.length - dominatorOccurences;
        for (int i : A){
            System.out.println(new StringBuffer("i:")
                .append(i).append(" ")
                .append("dominate:").append(dominate).append(" ")
                .append("nonDominate:").append(nonDominate).append(" ")
                .append("dominatorOccurences:").append(dominatorOccurences).append(" ")
                .append("nonDominatorOccurences:").append(nonDominatorOccurences).append(" ")
                .append("equalLeader:").append(equalLeader).append(" "));
            if( i == dominator){
                dominate++;
            }else {
                nonDominate++;
            }
            if (dominate > nonDominate && (dominatorOccurences - dominate) > (nonDominatorOccurences - nonDominate))
                equalLeader++;
        }

        return equalLeader;
    }
    public static void main(String[] args) {
        int[] A = {4,3,4,4,4,2};
        System.out.println(solution(A));
        System.out.println(solution(new int[]{1,2,3,3,5,6}));
    }
}
