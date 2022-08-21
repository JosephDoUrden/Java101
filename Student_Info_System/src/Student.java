public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int quizNote1, int note2, int quizNote2, int note3, int quizNote3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if (quizNote1 >= 0 && quizNote1 <= 100){
            this.c1.quizNote = quizNote1;
        }
        if (quizNote2 >= 0 && quizNote2 <= 100){
            this.c2.quizNote = quizNote2;
        }
        if (quizNote3 >= 0 && quizNote3 <= 100){
            this.c3.quizNote = quizNote3;
        }
    }

    void isPass(){
        this.avarage = (
                ((this.c1.note * 0.8) + (this.c1.quizNote * 0.2)) +
                        ((this.c2.note * 0.8) + (this.c2.quizNote * 0.2)) +
                        ((this.c3.note * 0.8) + this.c3.quizNote * 0.2)
                ) / 3.0;
        if (this.avarage > 55){
            this.isPass = true;
            System.out.println("=====================================");
            System.out.println(this.name);
            System.out.println("Sınıfı Başarılı Bir Şekilde Geçtiniz!");
        }else {
            this.isPass = false;
            System.out.println("=====================================");
            System.out.println(this.name);
            System.out.println("Sınıfta Kaldınız!");
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu:\t\t\t\t" + c1.note);
        System.out.println(c2.name + " Notu:\t\t\t\t" + c2.note);
        System.out.println(c3.name + " Notu:\t\t\t" + c3.note);
        System.out.println("Ortalama:\t\t\t\t" + this.avarage);
    }


}
