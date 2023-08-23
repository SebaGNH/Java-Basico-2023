
package productos2023vates;

public class Cliente {
    private String numeroDeCliente;

    public Cliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    @Override
    public String toString() {
        return super.toString() + numeroDeCliente ;
    }
    
}
