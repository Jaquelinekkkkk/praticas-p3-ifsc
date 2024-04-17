package ifsc;

public class Smartphone extends Produto{
    public String modelo;
   public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

public String getDimensoesTela() {
		return dimensoesTela;
	}

	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}

   private String dimensoesTela;
	

}
