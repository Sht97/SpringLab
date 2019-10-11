package com.udea.LabSpring.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@ToString

@ApiModel(description="Toda la información personal del empleado")

@Document(collection = "Empleados")
public class Empleado {
    @ApiModelProperty(notes = "ID generado para el empleado")
    @Id
    private int id;

    @ApiModelProperty(notes = "Nombre completo de el empleado")
    private  String nombreCompleto;

    @ApiModelProperty(notes = "Email del empleado")
    private String email;

    @ApiModelProperty(notes = "Cargo del empleado")
    private String cargo;

    @ApiModelProperty(notes = "Salario para el empleado para el empleado")
    private Double salario;

    @ApiModelProperty(notes = "género sexual del empleado")
    private String genero;

    @ApiModelProperty(notes = "Estado civil del empleado")
    private String estadoCivil;

    @ApiModelProperty(notes = "Número telefónico del empleado")
    private int edad;

    @ApiModelProperty(notes = "Número telefónico del empleado")
    private String telefono;

    public Double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }
}
