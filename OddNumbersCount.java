import java.util.List;

public class OddNumbersCount {
    public OddNumbers oddNumbers;

    public OddNumbersCount(OddNumbers oddNumbers){
        this.oddNumbers = oddNumbers;
    }
    public Integer getOddCount(){
        int n=0;
        List<Integer> oddNumList = oddNumbers.OddNumberList();
        for (Integer num : oddNumList){
            if(num%2==1){
                n+=1;
            }
        }
        return n;
    }
}
