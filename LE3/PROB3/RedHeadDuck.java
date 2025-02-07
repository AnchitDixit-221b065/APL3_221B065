class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    void display() {
        System.out.println("I am a Red Head Duck.");
    }
}
