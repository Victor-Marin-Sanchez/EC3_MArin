package ec3_VictorMarin.idat.services;

import java.util.List;

import ec3_VictorMarin.idat.models.Cliente;

public interface ClienteService {
  
  void guardar(Cliente cliente);
  void actualizar(Cliente cliente);
  void eliminar(Integer id);
  List<Cliente> listar();
  Cliente obtener(Integer id);
}
