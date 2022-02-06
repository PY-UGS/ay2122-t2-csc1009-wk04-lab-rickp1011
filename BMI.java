
public class BMI {
    private double weight;
    private double height;
    public double BMI (double weight, double height)
    {
        double BMI = this.weight/Math.pow(this.height,2);
        return BMI;
    }
    public void judge (double BMI)
    {
        if (BMI < 18.5)
        {
            System.out.println("Underweight");
        }
        else if( BMI >= 18.5 && BMI < 25 )
        {
            System.out.println("Normal");
        }
        else if( BMI >= 25 && BMI < 30 )
        {
            System.out.println("Overweight");
        }
        else if( BMI <= 30 )
        {
            System.out.println("obese");
        }
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
