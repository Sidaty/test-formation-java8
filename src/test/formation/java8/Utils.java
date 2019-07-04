/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.util.List;

/**
 *
 * @author sidaty
 */
public class Utils {
    
    
    @Deprecated
    public static int sum(List<Integer> integers) {
        int sum = 0;
        for (Integer elt : integers) {
            sum += elt;
        }
        return sum;
    }
    
}
