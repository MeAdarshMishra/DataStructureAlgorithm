import java.util.Scanner;

class GCDCalculator{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input two integer");
        int value1=scanner.nextInt();
        int value2=scanner.nextInt();
        scanner.close();
        var maximum=Math.max(value1,value2);
        var minimum =Math.min(value1,value2);
        System.out.println("GCD(" + maximum+","+minimum+")=" + calculateGCD(maximum,minimum));
    }
    private static int calculateGCD(int value1,int value2){
        int reminder=value1%value2;
        if(reminder==0){
            return value2;

        }
        return calculateGCD(value2, reminder);
    }
}