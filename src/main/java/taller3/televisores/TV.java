package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        this.estado = estado;
        this.marca = marca;

        int numTV = TV.numTV+1;
    }

    public static int getNumTv(){
        return numTV;
    }
    public static void setNumTv(int numTV){
        TV.numTV = numTV;
    }

    public void turnOn() {
        this.estado = true;
    }
    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void volumenUp(){
        this.setVolumen(this.volumen = this.volumen+1);
    }
    public void volumenDown(){
        this.setVolumen(this.volumen = this.volumen-1);
    }

    public void canalUp(){
        this.setCanal(this.canal = this.canal+1);
    }
    public void canalDown(){
        this.setCanal(this.canal = this.canal-1);
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setCanal(int canal) {
        if (this.estado && 1 <= this.canal &&  120>= this.canal);
        this.canal = canal;
    }

    public void setVolumen(int volumen){
        if (this.estado && 0 <= this.volumen &&  7>= this.volumen);
        this.volumen = volumen;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setControl(Control control){
        this.control = control;
    }

    public Control getControl(){
        return this.control;
    }
}
