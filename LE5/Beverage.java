abstract class Beverage{
    private void Pour(int Qnt){
        System.out.println("Pour "+Qnt+" ml of beverage in glass");
    }
    protected abstract void Add_condiment();
    void Stir(){ }
    protected void Serve(){
        System.out.println("Serve through waiter");
    }
    public final void template_method(int Qnt){
        Pour(Qnt);
        Add_condiment();
        Stir();
        Serve();
    }
};