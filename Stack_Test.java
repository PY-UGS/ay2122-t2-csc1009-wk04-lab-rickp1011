
public class Stack_Test {
    public static void main(String [] args)
    {
        int [ ] me = new int [11];
        Stack newq = new Stack(me);
        for (int i =0 ; i<10;i++)
        {
            newq.push(i);

        }
        int i =0;
        while (i<10)
        {
            System.out.print(newq.pop()+" ");
            i++;
        }
    }
}
