package session_10_OOP.Homework;

public class Challenge1 {
    public static class Student {
        private String firstName;
        private String lastName;
        private String sex;
        private int age;
        private String birthDate;
        private String CNP;
        private String address;


        // creez constructorul ei

        public Student(String firstName, String lastName, String sex, int age, String birthDate, String CNP, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.birthDate = birthDate;
            this.CNP = CNP;
            this.address = address;
        }
        // adaug gettere si settere la fiecare

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public String getCNP() {
            return CNP;
        }

        public String getAddress() {
            return address;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public void setCNP(String CNP) {
            this.CNP = CNP;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


    // creez clasa Profesor

    public class Profesor {
        private String firstName;
        private String lastName;
        private String sex;
        private int age;
        private String birthDate;
        private String CNP;
        private String address;


        // creez constructorul apoi gettere si setter
        public Profesor(String firstName, String lastName, String sex, int age, String birthDate, String CNP, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.birthDate = birthDate;
            this.CNP = CNP;
            this.address = address;

        }


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSex() {
            return sex;
        }

        public int getAge() {
            return age;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public String getCNP() {
            return CNP;
        }

        public String getAddress() {
            return address;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public void setCNP(String CNP) {
            this.CNP = CNP;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        // acelasi lucru si pentru clasa curs

        public class Curs {
            private String name;
            private String schedule;
            private int duration;  // Durata în ore
            private String description;
            private Profesor assignedProfesor;

            // Constructor
            public Curs(String name, String schedule, int duration, String description) {
                this.name = name;
                this.schedule = schedule;
                this.duration = duration;
                this.description = description;
                this.assignedProfesor = null;  // Cursul nu are profesor asignat la început
            }

            public String getName() {
                return name;
            }

            public String getSchedule() {
                return schedule;
            }

            public int getDuration() {
                return duration;
            }

            public String getDescription() {
                return description;
            }

            public Profesor getAssignedProfesor() {
                return assignedProfesor;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setSchedule(String schedule) {
                this.schedule = schedule;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setAssignedProfesor(Profesor assignedProfesor) {
                this.assignedProfesor = assignedProfesor;
            }

            // metoda publica pentru class
            public void showCourseDetails() {
                System.out.println("Curs: " + name);
                System.out.println("Program: " + schedule);
                System.out.println("Durata: " + duration + " ore");
                System.out.println("Descriere: " + description);
                if (assignedProfesor != null) {
                    System.out.println("Profesor: " + assignedProfesor.getFirstName() + " " + assignedProfesor.getLastName());
                } else {
                    System.out.println("Nu este asignat un profesor.");
                }
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        // Creare profesori
        Challenge1.Profesor profesor1 = new Challenge1.Profesor("Adriana ", "Munteanu", "Feminin", 36, "1988-10-29", "2900212345678", "Strada Prelungirea Gehncea ");
        Challenge1.Profesor profesor2 = new Challenge1.Profesor("Rolland", "Ionescu", "Masculin", 28, "1996-06-24", "1900223456789", "Strada Mica 10");


        cursJava.setAssignedProfesor(profesor1);
        cursI.setAssignedProfesor(profesor2);

        // Creare studenți
        Student student1 = new Student("Sofia", "Vasile", "Feminin", 20, "2004-01-15", "1234567890123", "Strada Sperantei");
        Student student2 = new Student("Elena", "Georgescu", "Feminin", 21, "2003-11-10", "1234567890456", "Strada Albastră 33");

        // Afișare detalii cursuri
        cursJava.showCourseDetails();
        cursI.showCourseDetails();
    }
}
