package polymorphism1;

public class Japan extends Country{

    Japan(int totalPopulation, String language){
        super(totalPopulation, language);

    }

    public void getLanguage(){
        System.out.println("Japan");
        super.getLanguage();
    }

    public void getTotalPopulation(){
        super.getTotalPopulation();
    }

}
