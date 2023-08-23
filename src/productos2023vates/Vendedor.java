
package productos2023vates;

public class Vendedor extends Persona{
    private String legajo;

    public Vendedor(String legajo, String nombre) {
        super(nombre);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return super.toString() + legajo ;
    }
    
    

    
    
}
