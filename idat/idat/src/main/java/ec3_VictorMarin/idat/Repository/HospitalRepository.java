package ec3_VictorMarin.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec3_VictorMarin.idat.models.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
  
}
 	