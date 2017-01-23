/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm.work.bourne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import jvm.work.bourne.Point3D;
/**
 *
 * @author PEYO
 */
public class SolutionSphere {
    public static void main(String[] args) {
        
        Point3D p1 = new Point3D(0, 5, 4);
        Point3D p2 = new Point3D(0, 0, -3);
        Point3D p3 = new Point3D(-2, 1, -6);
        Point3D p4 = new Point3D(1, -2, 2);
        Point3D p5 = new Point3D(1,1,1);
        Point3D p6 = new Point3D(4, -4, 3);
        
        Point3D[] A = {p1,p2,p3,p4,p5,p6};
        
        ArrayList<Integer> radios = new ArrayList<>();
        int esferas = 0;
        for(int i = 0; i < A.length;i++){
            int radio;
            radio = (A[i].x * A[i].x) + (A[i].y * A[i].y) + (A[i].z * A[i].z);
            if(!radios.contains(radio)){
                esferas++;
                radios.add(radio);
            }
        }
        
        System.out.println("Esferas: " + esferas);
        
    }
}
