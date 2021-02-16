package streamapiex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx {
    //
    //from cities , get a list containing count of cities with even length
    //
    public static void main(String[]  args){
        List<String> cities=new ArrayList<>();
        cities.add("mumbai");
        cities.add("delhi");
        cities.add("hyderabad");
        cities.add("chennai");
        cities.add("pune");
  /*
        List<Integer>lengths=new ArrayList<>();
        List<String>evenLengthCities=new ArrayList<>();
        for(String city:cities){
            if(city.length()%2==0){
                evenLengthCities.add(city);
            }
        }

        for (String city:evenLengthCities){
            lengths.add(city.length());
        }

        for (int length:lengths){
            System.out.println(length);
        }
*/
/*
        Stream<String> citiesStream=cities.stream();
        Predicate<String>predicate=(city)->  city.length() % 2 == 0;
        Stream<String>evenCitiesStream=citiesStream.filter(predicate);
        Function<String,Integer>lengthFunction= (city)->city.length() ;
        Stream<Integer>lengthsStream=evenCitiesStream.map(lengthFunction);
        Consumer<Integer>consumer=(count)->System.out.println(count);
        lengthsStream.forEach(consumer);
*/



        cities.stream().
               filter(city->city.length()%2==0)
               .map(city->city.length()).
                forEach(length->System.out.println(length));



    }
}
