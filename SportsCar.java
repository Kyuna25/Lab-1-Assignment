class SportsCar extends Vehicle implements Automobile {
    @Override
    public void accelerate() {
        System.out.println("SportsCar is moving fast");
    }
    @Override
    public void stop() {
        System.out.println("SportsCar has stopped");
    }
    @Override
    public void gas() {
        System.out.println("SportsCar is refueling");
    }
    @Override
    public void openTrunk() {
        System.out.println("SportsCar trunk is open");
    }
    @Override
    public void playMusic() {
        System.out.println("Music playing in the SportsCar");
    }
}
