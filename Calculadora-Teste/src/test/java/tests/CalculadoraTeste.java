package tests;
import control.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void testeSomar() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.somar(3.0, 2.0), 0.0);
    }

    @Test
    public void testeSubtrair() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(1.0, calc.subtrair(3.0, 2.0), 0.0);
    }

    @Test
    public void testeMultiplicar() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(6.0, calc.multiplicar(3.0, 2.0), 0.0);
    }

    @Test
    public void testeDividir() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0, calc.dividir(10.0, 2.0), 0.0);
    }
}
