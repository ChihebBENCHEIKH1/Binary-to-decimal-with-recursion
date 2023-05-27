
public class App {
    public static int add(int i,int sum)
    {
        if(i==0)
            return sum;
        else if(i==1)
            return sum+1;
        else
        {
            String size=String.valueOf(i);
            int restOfDivision=i/(int)Math.pow(10, size.length()-1);
            int returnInt=i%(int)Math.pow(10, size.length()-1);
            sum+=(int)Math.pow(2, size.length()-1)*restOfDivision;
            System.out.println("sum =>"+sum +" iteration =>"+size.length());
            return add(returnInt,sum);
        }
    }
    public static void main(String[] args) throws Exception {
        int binary=1111;
        System.out.println("binary number "+binary+" = "+add(binary,0));
    }
}

