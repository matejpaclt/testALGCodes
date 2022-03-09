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
public class Point {
    //data, instancne promenne, clenske promenne, atributy, fields 
    private double x;
    private double y;
    
    //metody
    //konstruktor
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    //pretizeny overloaded konstruktor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //[2,3]
    //textova reprezentace
    @Override
    public String toString(){
       return String.format("[%.2f,%.2f]", x, y); 
    }
    public double distanceFromOrigin(){
        //return Math.sqrt(Math.pow(x-0,2) + Math.pow(y-0, 2));
        return distanceFrom(0,0);
    }
    public double distanceFrom(double x , double y){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y, 2));
    }
    public double distanceFrom(Point p){
        //return Math.hypot(this.x - p,x,this.y - p,y);
        return distanceFrom(p.x, p.y);
    }
    //getter
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
