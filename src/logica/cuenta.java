package logica;

	public class cuenta {
		private int numero;
		private int saldo;
		private String tipo;
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public cuenta(int numero, int saldo, String tipo) {
			this.numero = numero;
			this.saldo = saldo;
			this.tipo = tipo;
		}
		
		public int consignar(int valor) {
			return this.saldo += valor;
		}
		
		public void retirar(int valor) throws Exception {
			if(valor <= this.saldo) {
				this.saldo -= valor;			
			}else {
				throw new Exception("Saldo insuficiente");
			}
		}
		
	}

