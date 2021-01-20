package esercizi.eserciziotriangolo;


public class Triangolo {
    
    private float lato1;
    private float lato2;
    private float lato3;

    public Triangolo(float lato1, float lato2, float lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;    
    }
    
    public String controllaTriangolo(){
        String s = "";
        
        if(lato1 == lato2 && lato1 == lato3) s = "Equilatero";
        else if(lato1 == lato2 || lato1 == lato3 || lato2 == lato3) s = "Isoscele";
        else if (lato1 == 0 || lato2 == 0 || lato3 == 0) s = "Non è un triangolo";
        else s = "Scaleno";
        
        return s;
    }
    
}
