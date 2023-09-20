package zad8;

public class Confectioner {
    private final Flour flour;

    public Confectioner(Flour flour) {
        this.flour = flour;
    }

    public String createCake() {
        // cukiernik ma dodac do ciata 1 porcje maki
        String flourPortion = flour.getPortion();

//        String candiePortion = candie.getPortion();

        return "Recipe: " + flourPortion;
//        return "Recipe: " + flourPortion + ", " + candiePortion;
    }

}
