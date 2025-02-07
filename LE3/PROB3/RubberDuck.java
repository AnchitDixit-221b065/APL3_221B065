class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFly(), new Squeak(), new Swim());
    }

    @Override
    void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
