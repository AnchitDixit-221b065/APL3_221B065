public class Main
{
	public static void main(String[] args) {
		System.out.println("Recipe for whiskey");
		Beverage w = new Whiskey();
		w.template_method(30);
		System.out.println();
		System.out.println("............................");
		System.out.println();
		System.out.println("Recipe for Rum");
		Beverage r = new Rum();
		r.template_method(30);
		System.out.println();
		System.out.println("............................");
		System.out.println();
		System.out.println("Recipe for Beer");
		Beverage b = new Beer();
		b.template_method(300);
	}
}