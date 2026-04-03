public class StudentTest {
    public static void main(String[] args){
        Student account1 = new Student("Jane", 72.75);
        Student account2 = new Student ("John", 93.5);

        System.out.printf("%s's Letter Grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's Letter Grade is: %s%n", account2.getName(), account2.getLetterGrade());
    }
}
