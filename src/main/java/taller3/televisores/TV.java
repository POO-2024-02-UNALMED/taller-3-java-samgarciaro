package taller3.televisores;

public class TV {
    private Marca marca;
    public int canal;
	private int precio;
	public boolean estado;
	public int volumen;
	public Control control;
	private static int numTV = 0;

    public TV(Marca marca, boolean estado){
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        this.estado = estado;
        this.marca = marca;

        numTV++;
    }

    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int numTV){
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
        if (this.estado && canal >= 1 && canal <= 120){
            this.setCanal(this.canal = this.canal+1);
        }
    }
    public void canalDown(){
        if (this.estado && canal >= 1 && canal <= 120){
            this.setCanal(this.canal = this.canal+1);
        }
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setCanal(int canal) {
        if (this.estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }
    
    public void setVolumen(int volumen){
        if (this.estado && 0 <= this.volumen &&  7>= this.volumen){
            this.volumen = volumen;
        }
        return;
    }

    public int getVolumen(){
        return this.volumen;
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
