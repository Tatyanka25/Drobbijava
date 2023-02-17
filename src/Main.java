public class Main {
    public static void main(String[] args) {
        var fraction1 = new Drobbi(3, 5);
        var fraction2= new Drobbi(4,7);
        var result = fraction1.Addition(fraction2);
        var result1 = fraction1.Multiplication(fraction2);
        var result2 = fraction1.Deduction(fraction2);
        var result3 = fraction1.Splitting(fraction2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}