class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFly(), new Mute(), new Swim());
    }

    @Override
    void display() {
        System.out.println("I am a Wooden Duck.");
    }
}
