package com.udea.LabSpring.Resource;

import com.udea.LabSpring.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadosController {

    @Autowired
    private EmpleadoRepository repository;

}
