//in java,anonymous class

interface HumanBeing{
    void think();
}


public class Runner {
    public static void main(String[] args) {

        HumanBeing programmer = new HumanBeing() {
            @Override
            public void think() {
                System.out.println("Thibk Virtually");
            }
        };
        programmer.think();

    }
}
