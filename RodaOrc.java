package lista2;

import java.math.BigDecimal;

public class RodaOrc {

	public static void main(String[] args) {
		
		OrcFinan of1 = new OrcFinan("Antonio", new BigDecimal(475.87));
		
		of1.deposita10();
		
		System.out.println(of1.getSaldo());
	}
}
