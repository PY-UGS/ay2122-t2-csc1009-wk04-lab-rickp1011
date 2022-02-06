
import java.util.Scanner;
public class BMI_Test {
    public static void main(String [] args)
    {
        System.out.println("Enter weight in pounds:");
        Scanner sn = new Scanner(System.in);
        Double  oWeight = sn.nextDouble();
        Double Weight=oWeight * 0.45359237;
        System.out.println("Enter Height:");
        Scanner sc = new Scanner(System.in);
        double  oHeight = sc.nextDouble();
        Double Height = oHeight*0.0254;
        BMI name = new BMI(Weight,Height);
        System.out.println("BMI is "+(name.BMI(Weight,Height)));
        name.judge( name.BMI(Weight,Height));
    }
}
