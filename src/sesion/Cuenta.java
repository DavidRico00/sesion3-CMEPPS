package sesion;

public class Cuenta {
	
	private Double saldo;
	
	public Cuenta(Double i) {
		this.saldo = i;
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
