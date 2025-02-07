class LakeDuck extends Duck {
    public LakeDuck() {
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    void display() {
        System.out.println("I am a Lake Duck.");
    }
}
