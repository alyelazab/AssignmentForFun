package DansDilemma;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DansDilemma {

    private Set<Double> getResultsOfTwoDoubles(Double input1, Double input2){
        Set<Double> results = new HashSet<>();
        //plus
        results.add(input1 + input2);
        //minus
        results.add(input1 - input2);
        results.add(input2 - input1);
        //mult
        results.add(input1 * input2);
        //div (make sure not to divide by 0)
        if(input2!=0d) results.add(input1 / input2);
        if (input1!=0d) results.add(input2 / input1);

        return results;
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return getResultsOfTwoDoubles(input1, input2).size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> allResults = new HashSet<>();
        allResults.addAll(getResultsOfTwoDoubles(input1, input2));
        allResults.addAll(getResultsOfTwoDoubles(input1, input3));
        allResults.addAll(getResultsOfTwoDoubles(input2, input3));
        return allResults.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> allResults = new HashSet<>();
        for(int i = 0; i<args.length; i++){
            for(int j = i+1; j<args.length; j++){
                allResults.addAll(getResultsOfTwoDoubles(args[i],args[j]));
            }
        }
        return allResults.size();
    }
}
