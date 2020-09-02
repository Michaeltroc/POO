public class Vehiculo {

    private String marca;
    private String numMatricula;
    private String color;
    private double precio;
    private String modelo;
    private String numchasis;
    private String tipoMotor;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String numMatricula, String color, double precio, String modelo, String numchasis, String tipoMotor) {
        this.marca = marca;
        this.numMatricula = numMatricula;
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.numchasis = numchasis;
        this.tipoMotor = tipoMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(String numchasis) {
        this.numchasis = numchasis;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
