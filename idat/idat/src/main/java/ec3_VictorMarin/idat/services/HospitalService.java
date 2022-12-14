package ec3_VictorMarin.idat.services;

import java.util.List;

import ec3_VictorMarin.idat.models.Hospital;

public interface HospitalService {
  
  void guardar(Hospital hospital);
  void actualizar(Hospital hospital);
  void eliminar(Integer id);
  List<Hospital> listar();
  Hospital obtener(Integer id);
}
