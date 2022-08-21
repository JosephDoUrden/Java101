public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905313333333");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "905391111111");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "905322222222");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,100,80,70,89,20);
        s1.isPass();

        Student s2 = new Student("Carl Sagan", "777", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(100, 0, 100,0,100,0);
        s2.isPass();

        Student s3 = new Student("Yusufhan Saçak", "404", "3", tarih, fizik, biyoloji);
        s3.addBulkExamNote(100, 100, 100,100,100,100);
        s3.isPass();



    }
}
