package lista2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class OrcFinan {
	//Atributos
	public String dono;
	public BigDecimal saldo;
	private static final String MOEDA = "R$";
	private static final DecimalFormat FORMATO = new DecimalFormat(MOEDA + " #,###,##0.00");
	private LocalDateTime diahora;
	
	//Método Construtor
	public OrcFinan(String d, BigDecimal s) {
		this.dono = d;
		this.saldo = s;
	}
	
	//Getters e Setters
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(BigDecimal s) {
			this.saldo=s;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono=d;
	}
	
	public LocalDateTime getDiahora() {
		return LocalDateTime.now();
	}

	public void setDiahora(LocalDateTime diahora) {
		this.diahora = LocalDateTime.now();
	}

	//Métodos Personalizados
	public void status() {
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public void deposita10() {
		this.setSaldo(this.getSaldo().add(new BigDecimal(10)));
	}
	
	public void saca10() {
		this.setSaldo(this.getSaldo().subtract(new BigDecimal(10)));
	}
}
