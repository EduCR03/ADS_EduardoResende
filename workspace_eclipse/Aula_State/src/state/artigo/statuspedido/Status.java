package state.artigo.statuspedido;

public class Status {
	
	public enum StatusPedido{
		INICIAL{
			public StatusPedido avancar() {
				return PAGO;
			}
			public StatusPedido cancelar() {
				return CANCELADO;
			}
		},
		PAGO{
			public StatusPedido avancar() {
				return ENTREGUE;
			}
			public StatusPedido cancelar() {
				return CANCELADO;
			}
		},
		ENTREGUE{
			public StatusPedido avancar() {
				return FINALIZADO;
			}
			public StatusPedido cancelar() {
				return CANCELADO;
			}
		},
		FINALIZADO{
			public StatusPedido avancar() {
				return FINALIZADO;
			}
			public StatusPedido cancelar() {
				return FINALIZADO;
			}
		},
		CANCELADO{
			public StatusPedido avancar() {
				return CANCELADO;
			}
			public StatusPedido cancelar() {
				return CANCELADO;
			}
		};
		
		abstract StatusPedido avancar();
		abstract StatusPedido cancelar();
	}

}
