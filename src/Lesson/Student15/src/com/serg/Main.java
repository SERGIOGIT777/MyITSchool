package Lesson.Student15.src.com.serg;

import java.util.EnumSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*dayjfWeek monday = dayjfWeek.Monday;
        System.out.println(monday);
        */

        /*for(Seasons s: Seasons.values()){
            System.out.println(s);
        }*/

        /*Seasons sea = Seasons.FALL;
        switch (sea){
            case WINTER:
                System.out.println("ЗИМА");
                break;
            case SPRING:
                System.out.println("ВЕСНА");
                break;
            case SUMMER:
                System.out.println("ЛЕТО");
                break;
            case FALL:
                System.out.println("ОСЕНЬ");
                break;
        }

         */

        /*
        //name и ordinal

        System.out.println(Color.BLACK.name());
        System.out.println(Color.BLACK.ordinal());

        //equals
        boolean isEqualsTo = Color.RED.equals(Color.RED);
        boolean isEqualsToDiffferentColor = Color.RED.equals(Color.BLACK);

        System.out.println(isEqualsTo);
        System.out.println(isEqualsToDiffferentColor);

        //toString()

        String red = Color.RED.toString();
        System.out.println(red);

        //hashCode() - генерирует рандомно

        int code = Color.RED.hashCode();
        System.out.println(code);

         */

        /*
        //finallize и clone()

        protected final void finalize(){}
        protected final Object clone() throw CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }

         */

        //valueof()

        /*
        System.out.println(Color.valueOf("BLACK").ordinal());
        System.out.println(Color.valueOf("YELLOW").ordinal());

         */

       // System.out.println(Color.valueOf(Color.class, "BLACK").toString());

        /*for(Countries country: Countries.values()){
            System.out.println(country + ", " + country.currency);
        }

        */


        /*
        for(Countries countries: Countries.values()){
            if(countries.hasCurrency()){
                System.out.println(countries + " has currency, It`s " + countries.currency);
            } else
            {
                System.out.println(countries + " has not currency");
            }
        }

         */

       /* for(Countries countries: Countries.values()) {
            System.out.print(countries + " ");
            countries.sayHello();
        }

        */

       /* Set<Countries> countries = EnumSet.allOf(Countries.class);
        EnumSet.of(CANADA);
        System.out.println(countries);

        */

       /* EnumSet<Countries> range = EnumSet.range(Countries.BELARUS, Countries.CANADA);
        System.out.println(range);

        EnumSet<Countries> canadaSet = EnumSet.of(Countries.CANADA);
        Set<Countries> belarusSet = Set.of(Countries.BELARUS);
        EnumSet<Countries> canadaSetCopy = EnumSet.copyOf(canadaSet);
        EnumSet<Countries> belarusSetCopy = EnumSet.copyOf(belarusSet);

        System.out.println(canadaSetCopy);
        System.out.println(belarusSetCopy);

        */

        /*
        EnumSet<Countries> initialSet = EnumSet.of(Countries.CANADA, Countries.POLAND, Countries.BELARUS);
        EnumSet<Countries> complement = EnumSet.complementOf(initialSet);
        System.out.println(complement);

        */

        EnumSet<Countries> noneof = EnumSet.noneOf(Countries.class);
        System.out.println(noneof);


    }
}
