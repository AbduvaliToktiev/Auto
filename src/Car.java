abstract public class Car {
    private int age;
    private String cabin;
    private int price;
    private String color;

    public Car() {

    }

    public Car(int age, String cabin, int price, String color) {
        this.age = age;
        this.cabin = cabin;
        this.price = price;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
