public class Class {
    public static class Baby {
        String name;
        boolean isMale;
        double weight = 5.0;
        double decivels;
        int numPoops = 0;
        Baby[] siblings;

        void poop() {
            numPoops += 1;
            System.out.println("Dear mother, " + "I have pooped. Ready the diaper.");
        }

        Baby(String myname, boolean maleBaby) {
            name = myname;
            isMale = maleBaby;
        }

        void sayHi() {
            System.out.println("Hi, my name is " + name);
        }

        void eat(double foodWeight) {
            if(foodWeight >= 0 && foodWeight < weight) {
                weight = weight + foodWeight;
            }
        }
    }

    public static void main() {
        Baby shiloh = new Baby("Shiloh Jolie-Pitt", true);
        Baby knox = new Baby("Knox Jolie-Pitt", true);

        System.out.println(shiloh.name);
        System.out.println(shiloh.numPoops);

        shiloh.sayHi();
        shiloh.eat(1);
    }
}
