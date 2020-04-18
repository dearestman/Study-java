public class TrackPopulation {
    public static void main(String[] args) {

        City smackoverARpop = new City();
        smackoverARpop.population = 2232;
        birth(smackoverARpop);
        System.out.println(smackoverARpop.population);
    }

    static void birth(City aCity){
        aCity.population++;
    }
}
