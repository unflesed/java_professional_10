package practise.task_1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Icount c1 = (x) -> (x % 2) == 0;
        Icount c2 = (x) -> (x % 2) != 0;
        Icount c3 = (x) -> (x % a) == 0;
        System.out.println("Проверка на четность " + c1.count(10));
        System.out.println("Проверка на нечетность " + c2.count(11));
        System.out.println("Проверка на кратность А " + c3.count(101));
        Irange r = ((x, y, z) -> x < z && z < x);
        System.out.println("Проверка на диапазон " + r.range(1, 6, 7));
    }
}
