/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.eserciziotriangolo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author darda
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }

    /**
     * Test of controllaTriangolo method, of class Triangolo.
     */
    @Test
    public void testControllaTriangoloIsoscele() {
        float a = 3;
        float b = 3;
        float c = 5;
        
        
        System.out.println("controlla Triangolo Isoscele");
        Triangolo instance = new Triangolo (a,b,c);
        String expResult = "Isoscele";
        String result = instance.controllaTriangolo();
        assertEquals(expResult, result);
    }
    
     public void testControllaTriangoloScaleno() {
        float a = 3;
        float b = 6;
        float c = 5;
        
        
        System.out.println("controlla Triangolo Scaleno");
        Triangolo instance = new Triangolo (a,b,c);
        String expResult = "Scaleno";
        String result = instance.controllaTriangolo();
        assertEquals(expResult, result);
    }
     
     public void testControllaTriangoNonValido() {
        float a = 3;
        float b = 0;
        float c = 5;
        
        
        System.out.println("controlla Triangolo non valido");
        Triangolo instance = new Triangolo (a,b,c);
        String expResult = "Non è un triangolo";
        String result = instance.controllaTriangolo();
        assertEquals(expResult, result);
    }
     
     public void testControllaTriangoloEquilatero() {
        float a = 3;
        float b = 3;
        float c = 3;
        
        
        System.out.println("controlla Triangolo Equilatero");
        Triangolo instance = new Triangolo (a,b,c);
        String expResult = "Equilatero";
        String result = instance.controllaTriangolo();
        assertEquals(expResult, result);
    }

}
