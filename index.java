import java.util.*;

/*
    1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов. +
    2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o) +
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

 */
public class index {
    public static void main(String[] args) {
        Cat Barsic = new Cat("Barsic", 5);
        Cat Mursik = new Cat("Mursik", 4);
        Cat BarsicTwo = new Cat("Barsic", 5);

        HashSet<Cat> setCat = new HashSet<Cat>(Arrays.asList(Barsic, Mursik, BarsicTwo));
        System.out.println(setCat);
        System.out.println(Barsic.equals(BarsicTwo));


    }
}

class Cat {
    String name;
    Integer age;
    String color;
    Integer weight;
    static Boolean isAggresive;

    void printInfo() {
        System.out.println("Cat name is " + name + " age = " + age + " color = " + color + " weight = " + weight + " isAggresive " + isAggresive);
    }

    Cat() {
        name = "Gray";
        age = 2;
        color = "black";
        weight = 5;
        // isAggresive = false;
    }

    Cat(String name) {
        this.name = name;
        this.age = 2;
        this.color = "black";
        this.weight = 5;
        // isAggresive = false;
    }

    Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.color = "black";
        this.weight = 5;
        // isAggresive = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(age, cat.age) && Objects.equals(color, cat.color) && Objects.equals(weight, cat.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, weight);
    }
    
    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        if (this.name.equals(cat.name) && this.age == cat.age) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + color.hashCode() + weight;
    }

}