package java_professional_10.additional;

public class Main {
    public static void main(String[] args) {
       ICount sum = (a,b) -> (a + b);
       ICount dif = (a,b) -> (a - b);
       ICount mult = (a,b) -> (a * b);
       ICount div = (a,b) -> (a / b);
       ICount mod = (a,b) -> (a % b);
        System.out.println("Сумма = " + sum.count(1,2));
        System.out.println("Разница = " + dif.count(1,2));
        System.out.println("Произведение = " + mult.count(1,2));
        System.out.println("Деление = " + div.count(1,2));
        System.out.println("Остаток от деления = " + mod.count(1,2));
    }
}
@FunctionalInterface
interface ICount{
    double count(double a, double b);
}