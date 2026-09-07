class inheritance{
    static class vehicle{
        String brand;
        int year;
        void startEngine(){
            System.out.println("engine start");
        }
    }
    static class car extends vehicle{
        String fueltype;
        @Override
        void startEngine() {
            System.out.println("car engine starts");
        }
        void drive(){
            System.out.println("car is driving");
        }
    static class truck extends vehicle{
        int loadcapacity;
        @Override
        void startEngine() {
            System.out.println("truck engine starts");
        }
        void haul(){
            System.out.println("truck is hauling");
        }
    }
    }
    public static void main(String[] args) {
        vehicle v=new vehicle();
        System.out.println(v.brand="bmw");
        System.out.println(v.year=2025);
        v.startEngine();
        car c=new car();
        c.drive();

    }
}


