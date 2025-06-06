package modelos.dao.contratos;

import java.util.List;
import modelos.Avion;

public interface AvionDAO {
    void crear(Avion avion);
    Avion buscarPorId(String matricula);
    List<Avion> listarTodos();
    List<Avion> listarPorAerolinea(String aerolinea);
    void actualizar(Avion avion);
    void eliminar(String matricula);
}