package com.udea.LabSpring.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

    @ApiModelProperty(notes = "Email de el empleado")
    private String email;

    @ApiModelProperty(notes = "Cargo de el empleado")
    private String cargo;

    @ApiModelProperty(notes = "Salario para el empleado para el empleado")
    private Double salario;

    @ApiModelProperty(notes = "Número telefónico de el empleado")
    private String telefono;
}
