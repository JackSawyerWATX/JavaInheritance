class SuvTest {
    public static void main(String[] args) {
        Suv suv = new Suv();

        suv.onTheHighway();
        suv.inPark();
        suv.onTheStreet();

        boolean parked = suv.isSleeping();

        if(parked) {
            System.out.println("I am sleeping.");
        }
    }
}
