public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double temp = 0;

        if (this.salary >= 1000){
            temp = salary * 0.03;
            return temp;
        }
        else {
            return 0;
        }
    }

    double bonus(){
        double temp = 0;
        double bonus = 0;

        if (this.workHours >= 40){
            temp = this.workHours - 40;
            bonus = temp * 30;
            return bonus;
        }else {
            return 0;
        }
    }

    double raiseSalary(){
        double workYear = 0;
        double temp = 0;

        workYear = 2021 - this.hireYear;

        if (workYear > 20){
            temp = this.salary * 0.15;
            return temp;
        } else if (workYear > 10) {
            temp = this.salary * 0.1;
            return temp;
        } else if (10 > workYear) {
            temp = this.salary * 0.05;
            return temp;
        }else {
            return 0;
        }
    }

    public void printInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary() + bonus() - tax()));
    }
}
