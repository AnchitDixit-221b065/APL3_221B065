abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performSwim() {
        swimBehavior.swim();
    }

    abstract void display();
}
