package session12_OOP_3.Homework;

//Create an abstract class 'Marks'
abstract class Marks {

    //with an abstract method 'getPercentage'.public abstract void getPercentage();
    public abstract void getPercentage();
}
//  It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
    // creez doua subclase A si B care mostenesc clasa Marks) la care fiecare subclase au o metoda care returneaza procentajul stundentilor

     class MarksA extends session12_OOP_3.Homework.TestMarks {
        int subject1, subject2, subject3;

        // Constructorul clasei MarksA care primește notele celor 3 materii
        public MarksA(int subject1, int subject2, int subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

// Implementez metoda getPercentage pentru studentul MArksA

        @Override
        public void getPercentage() {
            // calculez procentajul
            double percentage = (subject1 + subject2 + subject3) / 3.0;
            System.out.println("Procentajul studentului A este: " + percentage + "%");
        }
    }
     class MarksB extends session12_OOP_3.Homework.TestMarks {

        int subject1, subject2, subject3, subject4;

        // Constructorul clasei MarksB care primește notele celor 4 materii
        public MarksB(int subject1, int subject2, int subject3, int subject4 ) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

// Implementez metoda getPercentage pentru studentul MArksB

        @Override
        public void getPercentage() {
            // calculez procentajul
            double percentage = (subject1 + subject2 + subject3 + subject4) / 4.0;
            System.out.println("Procentajul studentului MarksB este: " + percentage + "%");
        }
    }
// creez clasa main ca sa pot printa
public abstract class TestMarks{
    public static void main(String[] args){
        MarksA marksA = new MarksA(85,90,92);
        MarksB marksB = new MarksB(78, 82, 88, 91);

        // Apelăm metodele getPercentage pentru fiecare student
        marksA.getPercentage();  // Va afișa procentajul studentului MarksA
        marksB.getPercentage();  // Va afișa procentajul studentului MarksB
    }

    public abstract void getPercentage();
}