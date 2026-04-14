class Sedan extends Vehicle implements Automobile {

    @Override
    public void accelerate() {
        System.out.println("Sedan accelerating smoothly");
    }
    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }
    @Override
    public void gas() {
        System.out.println("Sedan refueling");
    }
    public void openTrunk() {
        System.out.println("Sedan trunk is open");
    }
    public void playMusic() {
        System.out.println("Sedan playing Music");
    }
}
