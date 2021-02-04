package lista2;


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class OrcFinan {
	//Atributos
	public String dono;
	public BigDecimal saldo;
	private static final String MOEDA = "R$";
	private static final DecimalFormat FORMATO = new DecimalFormat(MOEDA + " #,###,##0.00");
	
	//Método Construtor
	public OrcFinan(String d, BigDecimal s) {
		this.dono = d;
		this.saldo = s;
	}
	
	//Getters e Setters
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	/*	Essa função causa Estouro de pilha porque ela está chamando a si mesma
	 * 	sem caso base.
	 * 
	 * public BigDecimal setSaldo(BigDecimal s) {
		return this.setSaldo(s);
	}*/
	
	public void setSaldo(BigDecimal s) {
		this.saldo=s;
	}
	public String getDono() {
		return this.dono;
	}
	
	/*	Essa função causa Estouro de pilha porque ela está chamando a si mesma
	 * 	sem caso base.
	 * 
	 * public void setDono(String d) {
		this.setDono(d);
	}*/
	public void setDono(String d) {
		this.dono=d;
	}
	//Métodos Personalizados
	public void status() {
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public void deposita10() {
		
		//this.setSaldo(this.getSaldo() + 10);
		this.setSaldo( this.getSaldo().add( new BigDecimal(10) ) );
		
		//Equivatente ao código de cima
		
		/*BigDecimal saldoAnterior=this.getSaldo();
		BigDecimal saldo=saldoAnterior.add(new BigDecimal(10));
				
		this.setSaldo(saldo);*/
	}
}
