package polymorphism1;

public class Country {
    int totalPopulation;
    String language;

    public Country(int totalPopulation, String language) {
        this.totalPopulation = totalPopulation;
        this.language = language;
    }

    public void getLanguage(){
        System.out.println("This country speak " + language + " language");
    }

    public void getTotalPopulation(){
        System.out.println("This country has a total population of " + totalPopulation + " million people");
    }

}
