public class Main {
    public static void main(String[] args) {
        Pandavs arjun = new Arjun();
        Pandavs bheem = new Bheem();
        Kauravs duryodhan = new Duryodhan();
        Kauravs vikarn = new Vikarn();
        
        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
