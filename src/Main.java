public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass!");
        System.out.println("Operator Precedence and Operator Challenge");
        System.out.println();

        double firstValue = 20.00;
        double secondValue = 80.00;
        double totalValue = (firstValue + secondValue) * 100.00;
        double getRemainder = totalValue % 40.00;

        System.out.println("Total Value: " + totalValue);
        System.out.println("Remainder: " + getRemainder);

        boolean isRemainder = getRemainder == 0 ?true:false;
        System.out.println("Is remainder zero?: " + isRemainder);
        if(!isRemainder){
            System.out.println("Got some remainder");
        }
    }
}