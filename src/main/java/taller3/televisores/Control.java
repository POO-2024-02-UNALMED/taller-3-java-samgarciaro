package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv(){
        return tv;
    }
    public void setTv(TV tv){
        this.tv = tv;
    }

    public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		if (tv.getEstado() && tv.getCanal() >= 1 && tv.getCanal() <= 120) {
			tv.setCanal(tv.getCanal() + 1);
		}		
	}
	public void canalDown() {
		if (tv.getEstado() && tv.getCanal() >= 1 && tv.getCanal() <= 120) {
			tv.setCanal(tv.getCanal() - 1);
		}		
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal){
        if(tv!=null){
            tv.setCanal(canal);
        } 
    }
    public void setVolumen(int volumen){
        if(tv!=null){
            tv.setVolumen(volumen);
        }
    }
	
}
