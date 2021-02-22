package lista2;

public enum EnumOrc {
		//Chamar Enum pra mostrar dados 
		LUCRO(1), DESPESA(2);
	
	private int v;
	
	EnumOrc (int v) {
		this.v = v;
	}
	public int getValor() {
		return v;
	}
}
