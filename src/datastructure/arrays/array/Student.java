package datastructure.arrays.array;

/**
 * @author hejiawei
 * @date 2020/11/3 16:22
 */
public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }


    public static void main(String[] args) {
        Array<Student> array = new Array<>();
        array.addLast(new Student("Alice", 48));
        array.addLast(new Student("Kity", 68));
        array.addLast(new Student("hhh", 99));
        System.out.println(array);
    }

}
