import java.util.Scanner;

public class Example22 {
    public static void main(String[] args){
        int sum, product, i;
        sum = 0;
        product = 1;
        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            product = product * i;
        }
        System.out.println("Sum from 1 to 10: " +sum);
        System.out.println("Product from 1 to 10:" +product);
    }
}
