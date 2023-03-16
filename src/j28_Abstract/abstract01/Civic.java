package j28_Abstract.abstract01;

public class Civic extends Lastik{


    @Override
    public void motor() {
        System.out.println("1.4 motor hacminiz vardir.");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapi vardir.");
    }

    @Override
    public void koltuk() {
        System.out.println("4 dandik koltuk vardir.");
    }

    @Override
    public void lastik() {
        System.out.println("4 lastik vardir.");
    }

    // Polymorphisim
   // Civic c1 = new Civic();
    //Honda c2 = new Civic();
}
