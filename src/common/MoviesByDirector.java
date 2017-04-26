/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Billy-Mac
 */
public class MoviesByDirector implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return new CompareToBuilder()
               .append(m1.getDirector(), m2.getDirector())
               .toComparison();
    }
    
}
