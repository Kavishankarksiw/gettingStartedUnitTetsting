import java.util.List;

public class SumNumbersMain {
    SumNumber sumNumber ;
    public SumNumbersMain(SumNumber sumNumber){
        this.sumNumber = sumNumber;
    }
    public int SumOfNumbers(){
        int sum=0;
        List<Integer> sumList = sumNumber.ListOfNumbers();
        for (Integer num : sumList){
            sum+=num;
        }
        return sum;
    }
}
