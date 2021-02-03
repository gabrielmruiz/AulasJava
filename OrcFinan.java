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
	
	public BigDecimal setSaldo(BigDecimal s) {
		return this.setSaldo(s);
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.setDono(d);
	}
	//Métodos Personalizados
	public void status() {
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public void deposita10() {
		this.setSaldo(this.getSaldo() + 10);
	}
}
