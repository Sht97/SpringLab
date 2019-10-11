package com.udea.LabSpring.Model;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado,Integer> {
}
