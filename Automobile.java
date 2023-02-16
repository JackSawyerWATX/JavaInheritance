class Automobile {
    private boolean parked = false;
    public void onTheHighway() {
        System.out.println("Better gas milage...");
    }
    public void inPark() {
        parked = true;
        System.out.println("Best gas milage!");
    }
    public boolean isSleeping() {
        return parked;
    }
}