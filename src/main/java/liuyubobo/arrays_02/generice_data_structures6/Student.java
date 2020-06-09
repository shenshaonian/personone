package liuyubobo.arrays_02.generice_data_structures6;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 22:03
 **/
public class Student {
    private String name;
    private int score;

    //名字一样的时候，要用this
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array6<Student> a6 = new Array6<>();
        a6.addLast(new Student("A", 100));
        a6.addLast(new Student("BB", 70));
        a6.addLast(new Student("CCC", 99));
        a6.add(3, new Student("xx", 90));
        a6.set(3, null);

        System.out.println(a6);
        boolean r = a6.contains(new Student("A", 100));
        System.out.println(r);
    }

//    private String name;
//    private int score;
//
//    public Student(String studentName, int studentScore){
//        name = studentName;
//        score = studentScore;
//    }
//
//    @Override
//    public String toString(){
//        return String.format("Student(name: %s, score: %d)", name, score);
//    }
//
//    public static void main(String[] args) {
//
//        Array6<Student> arr = new Array6<>();
//        arr.addLast(new Student("Alice", 100));
//        arr.addLast(new Student("Bob", 66));
//        arr.addLast(new Student("Charlie", 88));
//        System.out.println(arr);
//    }
}
