package polymorphism1;

import java.util.ArrayList;

public class PolymorphismActivity {

    public static void main(String[] args) {


        Country c1 = new Korea(51, "Korean");
        Country c2 = new Japan(125, "Japanese");
        Country c3 = new Philippines(113, "Filipino");

        c1.getLanguage();
        c1.getTotalPopulation();
        System.out.println();

        c2.getLanguage();
        c2.getTotalPopulation();
        System.out.println();

        c3.getLanguage();
        c3.getTotalPopulation();
        System.out.println();
    }
}
