package session_11_OOP_2.Homework_Session11;

public class challange {

    // challenge 1
//    Create an Animal class with sound() method that prints to console “animal makes sounds”

    public class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sound() {
            System.out.println("Animal makes sounds");
        }
    }
    // 2. Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case


    class Dog extends Animal {
        private String race;

        public Dog(String name, String race) {
            super(name);
            this.race = race;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        @Override
        public void sound() {
            System.out.println("The dog barks.");
        }
    }
    //Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method “meow”

    class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void sound() {
            super.sound();
        }
    }

    // 4.Create a Wolf class that extends Animal, and overrides sound() method, and print “how”
    class Wolf extends Animal {
        public Wolf(String name) {
            super(name);
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void sound() {
            super.sound();
        }
    }
}

