import java.math.BigDecimal;
import java.time.LocalDate;

public class Gasto {

    private int id;
    private String nombre;
    private LocalDate fecha;
    private BigDecimal dinero;
    private String usuario;



    public Gasto() {
    }


    public Gasto(int id, String nombre, LocalDate fecha, BigDecimal dinero, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.dinero = dinero;
        this.usuario = usuario;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getDinero() {
        return this.dinero;
    }

    public void setDinero(BigDecimal dinero) {
        this.dinero = dinero;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
