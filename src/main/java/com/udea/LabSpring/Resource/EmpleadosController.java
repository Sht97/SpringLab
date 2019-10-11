package com.udea.LabSpring.Resource;

import com.udea.LabSpring.Model.Empleado;
import com.udea.LabSpring.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpleadosController {

    @Autowired
    private EmpleadoRepository repository;


    @PostMapping("/addEmp")
    public String addEmpleado(@RequestBody Empleado empleado){
        repository.save(empleado);
        return "Agregado con id: ";
    }

    @GetMapping(value = "/findAllEmp",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Empleado> getEmpleados(){
        return repository.findAll();
    }

    @GetMapping("/findEmp/{id}")
    public Optional<Empleado> getEmpleado(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delEmp/{id}")
    public String deleteEmpleado(@PathVariable int id){
        repository.deleteById(id);
        return "Empleado despedido";
    }

}
