package negocio;

import java.time.LocalDateTime;
import persistencia.IClienteDAO;
import persistencia.PersistenciaException;

public class ClienteNegocio implements IClienteNegocio {

    private IClienteDAO clienteDAO;

    public ClienteNegocio(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void guardar() throws NegocioException {
        try {
            System.out.println("Paso por negocio del cliente " + LocalDateTime.now());
            this.clienteDAO.guardar();
        } catch (PersistenciaException ex) {
            throw new NegocioException(ex.getMessage());
        }
    }

}
