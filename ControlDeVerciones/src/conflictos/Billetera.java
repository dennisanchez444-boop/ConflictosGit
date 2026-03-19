package conflictos;

public class Billetera {
	double saldo;
	String titular;
	public Billetera(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}
	public void transferir(double monto) {
		saldo=saldo-monto;
	}
	public void mostrarSaldo() {
		System.out.println("Saldo de"+titular+":$"+saldo);
	}

}
