package com.udea.LabSpring.Resource;

import com.udea.LabSpring.Model.Empleado;
import com.udea.LabSpring.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
public class EmpleadosController {

    @Autowired
    private EmpleadoRepository repository;


    @PostMapping("/addEmp")
    public String addEmpleado(@RequestBody Empleado empleado){
        if(empleado.getEdad()<18 || empleado.getSalario()<0){
            return "Datos invalidos";
        }
        else {
            try{
                if(repository.existsById(empleado.getId())){
                    return "ya existe";
                }
                repository.save(empleado);
                return "Agregado con id: "+empleado.getId();
            }
            catch (Exception e)
            {
                return e.getMessage();
            }
        }

    }

    @GetMapping(value = "/findAllEmp",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Empleado> getEmpleados(){
        return repository.findAll();
    }

    @GetMapping(value ="/findEmp/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Empleado> getEmpleado(@PathVariable String id){
        return repository.findById(id);
    }

    @DeleteMapping("/delEmp/{id}")
    public String deleteEmpleado(@PathVariable String id){
        repository.deleteById(id);
        return "Empleado despedido";
    }
    @PutMapping(value = "/update/{id}")
    public String updateEmpleado(@PathVariable String id,@RequestBody Empleado empleado){
        //Optional<Empleado> lista = repository.findById(id);

        repository.save(empleado);
        //return lista.get().getId();
        return "update exitoso";
    }

}
