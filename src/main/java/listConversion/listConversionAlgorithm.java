package listConversion;

import java.util.ArrayList;
import java.util.List;

public class listConversionAlgorithm {

    public static List listConversion(List<Integer> inputList) {
        //end of recursion / base case
        if(inputList.size()==1){
            return inputList;
        }

        //computing
        List<Integer> sumList=new ArrayList<>();
        List<Integer> multList=new ArrayList<>();

        while(!inputList.isEmpty()){
                sumList.add(inputList.remove(0)+inputList.remove(0));
        }
        //in between check
        if(sumList.size()%2!=0){
            multList.addAll(sumList);
        }
        else {
            while (!sumList.isEmpty()) {
                multList.add(sumList.remove(0) * sumList.remove(0));
            }
        }
        //recursive call
        return listConversion(multList);
    }
}
