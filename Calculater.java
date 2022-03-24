import java.util.stream.DoubleStream;

public class Calculater {
    static double add(double... operands)
    {
        return DoubleStream.of(operands).sum();
    }
    static double multiply(double... operands)
    {
        return DoubleStream.of(operands).reduce(1,(a,b)->a*b);
    }
    static  double divide(double... operands)
    {

        return DoubleStream.of(operands).reduce(1,(a,b)->b/a);
    }

}
