public class Vehicle {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name){
        this.name=name;
    }

    public void gear(int noOfgear){
        System.out.println("number of gear in"+name+noOfgear);
    }
}
