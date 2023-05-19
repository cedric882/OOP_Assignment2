package polymorphism1;

public class Philippines extends Country{

    Philippines(int totalPopulation, String language){
        super(totalPopulation, language);

}

    public void getLanguage()
    {
        System.out.println("Philippines");
        super.getLanguage();
    }

    public void getTotalPopulation(){
        super.getTotalPopulation();
    }

}
