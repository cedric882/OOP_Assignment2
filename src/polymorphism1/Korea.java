package polymorphism1;

public class Korea extends Country{

    Korea(int totalPopulation, String language){
        super(totalPopulation, language);


    }

    public void getLanguage(){
        System.out.println("Korea");
        super.getLanguage();
    }

    public void getTotalPopulation(){
       super.getTotalPopulation();
    }

}
