package teste;

import org.junit.Test;

import sub.subtracao;
import junit.framework.Assert;

public class subtracaoTeste {
	
	@Test
	public void subtracaoTeste() {
		double result;
		
		subtracao conta = new subtracao();
		result = conta.subtracao(50.0, 25.0);
		
		Assert.assertEquals(25.0, result, 0);
	}
}