package persistencia;

public class ClienteDAO implements IClienteDAO {

    private IConexionBD conexionBD;

    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void guardar() throws PersistenciaException {
        System.out.println("Se guardo el cliente");
    }
}
