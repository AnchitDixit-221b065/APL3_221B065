class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence, i am Mute. No quack.");
    }
}
