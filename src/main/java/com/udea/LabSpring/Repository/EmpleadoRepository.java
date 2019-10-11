package com.udea.LabSpring.Repository;
import com.udea.LabSpring.Model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado,Integer> {
}
