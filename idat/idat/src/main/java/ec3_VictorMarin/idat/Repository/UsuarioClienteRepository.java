package ec3_VictorMarin.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3_VictorMarin.idat.models.UsuarioCliente;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente,Integer> {
  
  UsuarioCliente findByUsuario(String usuario);
}
