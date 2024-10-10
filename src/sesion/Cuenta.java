package sesion;

public class Cuenta {
	
	private Double saldo;
	private String nombre, numero;
	
	public Cuenta(Double i) {
		this.saldo = i;
	}
	
	public Cuenta(Double d, String numero, String nombre) {
		this.saldo = d;
		this.numero = numero;
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(Double i) {
		this.saldo += i;
	}

	public void retirar(Double d) {
		this.saldo -= d;				
	}



}
