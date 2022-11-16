package ec3_VictorMarin.idat.services;

import java.util.List;

import ec3_VictorMarin.idat.models.UsuarioCliente;

public interface UsuarioClienteService {
  
  void guardar(UsuarioCliente usuarioCliente);
  void actualizar(UsuarioCliente usuarioCliente);
  void eliminar(Integer id);
  List<UsuarioCliente> listar();
  UsuarioCliente obtener(Integer id);
}
