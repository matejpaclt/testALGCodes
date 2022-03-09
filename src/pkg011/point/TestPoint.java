/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg011.point;

/**
 *
 * @author Uživatel
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point myPoint = new Point();
        System.out.println(myPoint.toString());
        Point yourPoint = new Point(3, 4);
        System.out.println(yourPoint.toString());
        System.out.println(yourPoint); //println automaticky vola toString()
        System.out.println(myPoint.distanceFromOrigin());
        System.out.println(yourPoint.distanceFromOrigin());
        System.out.println(yourPoint.distanceFrom(myPoint));
        System.out.println(myPoint.getX());
    }
    
}
