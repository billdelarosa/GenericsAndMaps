/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Billy-Mac
 */
public class Lab_Startup {
    public static void main(String[] args) {
        Movie m1 = new Movie("Movie One", "Brittany", "1111");
        Movie m2 = new Movie("Second Movie", "John", "2222");
        Movie m3 = new Movie("Movie #3", "Dan", "3333");
        Movie m4 = new Movie("Fourth Movie", "Tom", "1111");
        
        Map<String, Movie> map = new HashMap<>();
        map.put("1111", m1);
        map.put("2222", m2);
        map.put("3333", m3);
        
        // Before duplicate
        System.out.println(map.get("1111"));
        map.put("1111", m4);
        
        System.out.println("------------------");
        
        // Getting individual items
        System.out.println(map.get("1111"));
        System.out.println(map.get("2222"));
        System.out.println(map.get("3333"));
        
        System.out.println("------------------");
        
        // Looping through keys
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Movie movie = map.get(key);
            System.out.println(movie);
        }
        
        System.out.println("------------------");
        
        // Looping through values
        Collection<Movie> movies = map.values();
        for(Movie movie : movies) {
            System.out.println(movie);
        }
        
        System.out.println("------------------");
        
        Map<String, Movie> treeMap = new TreeMap<String, Movie>(map);
        
        Set<String> treeKeys = treeMap.keySet();
        
        for(String key : treeKeys) {
            Movie m = map.get(key);
            System.out.println(m.toString());
        }
        
        System.out.println("------------------");
        
        Collection<Movie> values = treeMap.values();
        List<Movie> sortedList = new ArrayList<Movie>(values);

        Collections.sort(sortedList);
        for(Movie mvs : sortedList) {
            System.out.println(mvs);
        }
        
        System.out.println("------------------");
        
        // Lab 4
        Collection<Movie> values2 = treeMap.values();
        List<Movie> sortedList2 = new ArrayList<Movie>(values2);
        
        Collections.sort(sortedList2, new MoviesByDirector());
        for(Movie mvs2 : sortedList2) {
            System.out.println(mvs2);
        }
        
        System.out.println("------------------");
        
        // Lab 5
        
        Set<Movie> treeSet = new TreeSet();
        treeSet.add(m1);
        treeSet.add(m2);
        treeSet.add(m3);
        treeSet.add(m4);
        
        for(Movie movieTreeSet : treeSet) {
            System.out.println(movieTreeSet);
        }
    }   
    
      
}
