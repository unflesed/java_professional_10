package java_professional_10.task_3;

public class Book {
    String name;
    int cost;
    int year;

    public Book() {
    }

    public Book(String name, int cost, int year) {
        this.name = name;
        this.cost = cost;
        this.year = year;
    }

    ICost bookPriceChange = new ICost(){
        @Override
        public int newCost(int change){
            return cost + change;
        }
    };

    public int newCost(int change){
        ICost i = (a) -> cost + a;
        return i.newCost(change);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
@FunctionalInterface
interface ICost{
    int newCost(int a);
}