public class Audi extends Car{

    public Audi() {
    }

    public Audi(int age, String cabin, int price, String color) {
        super(age, cabin, price, color);
    }

    @Override
    public String toString() {
        return getCabin() + " | " + getAge() + " | " + getPrice() + " | " + getColor() + "\n";
    }
}
