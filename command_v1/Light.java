package command_v1;

//Receiver
public class Light{
private boolean on;

	public void switchOn(){
	  on = true;
	}
	public void switchOff(){
	  on = false;
	}
	public boolean isOn() {
		return on;
	}
	
	public String dameEstado(){
		String estado;
		if (on){ estado= "encendida";
		}else{ estado= "apagada";}
		
		return estado;
	}

}