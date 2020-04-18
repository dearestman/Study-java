public class TrackPopulation4 {
    public static void main(String[] args) {
        City smackoverAR = new City();
        smackoverAR.population = 2232;
        smackoverAR = doBith(smackoverAR);
        System.out.println(smackoverAR.population);

    }

    static City doBith(City aCity){
        City myCity = new City();
        myCity.population = aCity.population+1;
        return myCity;
    }
}
