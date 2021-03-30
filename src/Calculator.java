public class Calculator {

    public static void main(String[] args){
        System.out.println(solve(8));
    }
    public static int solve(int N){
        int value = (int) Math.pow(2,N);
        System.out.println("2^"+N+" = "+value);
        int digitSum = digitSumCalculator(value);
        int finalValue = digitSumWrapper(digitSum);
        return finalValue;
    }
    public static int digitSumCalculator(int N){
        int sum = 0;
        while(N > 0){
            int value = N%10;
            sum = sum + value;
            N = N/10;
        }
        System.out.println("Digit Sum:"+sum);
        return sum;
    }
    public static int digitSumWrapper(int N){
        int digitSum = digitSumCalculator(N);
        if(digitSum > 9){
            return digitSumWrapper(digitSum);
        }
        else{
            return digitSum;
        }
    }
}
