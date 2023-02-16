class Suv extends Automobile {
    public void onTheStreet() {
        System.out.println("Stop and go traffic gets the worst gas milage.");
    }

    public void onTheIce() {
        System.out.println("AWD");
        super.inPark();
    }
}