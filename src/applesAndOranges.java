public class applesAndOranges {
    int[] apples, orange;
    int s, t, a, b, applesCount, orangeCount, countNearHouseApp, getCountNearHouseOra;
    int [] unitDistanceA = new int[applesCount], unitDistanceO = new int[orangeCount];


    public applesAndOranges(int samHouseLocatedS, int samHouseLocatedT, int[] thrownApple, int[] thrownOrange, int appleLocated, int orangeLocated, int applesCount, int orangeCount, int[] unitDistanceA, int[] unitDistanceO) {
        this.s = samHouseLocatedS;
        this.t = samHouseLocatedT;
        this.apples =  thrownApple;
        this.orange = thrownOrange;
        this.a = appleLocated;
        this.b = orangeLocated;
        this.applesCount = applesCount;
        this.orangeCount = orangeCount;
        this.unitDistanceA = unitDistanceA;
        this.unitDistanceO = unitDistanceO;
    }
    void distanceCalculationApple(){

        for (int i = 0; i< applesCount; i++) {
            unitDistanceA[i] = a + apples[i];
            System.out.println(unitDistanceA[i]);
        }

    }
    void distanceCalculationOrange(){
        for (int i = 0; i< orangeCount; i++) {
            unitDistanceO[i] = b + orange[i];
            System.out.println(unitDistanceO[i]);
        }

    }

    void  nearFallFruits(){

        for (int i = 0; i< applesCount; i++) {
            if(unitDistanceA[i]>= s )
               if( unitDistanceA[i]< t)
                   countNearHouseApp++;

            if(unitDistanceO[i]>= s)
                if( unitDistanceO[i] <= t)
                    getCountNearHouseOra++;
        }
        System.out.println(countNearHouseApp);
        System.out.println(getCountNearHouseOra);

    }
}

class bluePrint{

    public static void main(String[] args) {
        int[]  thrownApple ={2, 3 , -4}, thrownOrange = {3, -2 , -4};
        int appleLocated =4, orangeLocated = 12, applesCount=3, orangeCount = 3, samHouseLocatedS = 7, samHouseLocatedT =10;
        int [] unitDistanceA = new int[applesCount], unitDistanceO = new int[orangeCount];

        applesAndOranges calc = new applesAndOranges(samHouseLocatedS, samHouseLocatedT, thrownApple, thrownOrange,appleLocated,orangeLocated,applesCount,orangeCount,unitDistanceA,unitDistanceO);
        calc.distanceCalculationApple();
        calc.distanceCalculationOrange();
        calc.nearFallFruits();


        samHouseLocatedS = 7;
        samHouseLocatedT = 11;
        appleLocated = 5;
        orangeLocated = 15;
        applesCount = 3;
        orangeCount = 2;
        thrownApple = new int[]{-2, 2, 1}; thrownOrange = new int[]{5 ,-6};
        applesAndOranges calc1 = new applesAndOranges(samHouseLocatedS, samHouseLocatedT, thrownApple, thrownOrange,appleLocated,orangeLocated,applesCount,orangeCount,unitDistanceA,unitDistanceO);
        calc1.distanceCalculationApple();
        calc1.distanceCalculationOrange();
        calc1.nearFallFruits();
    }

}
