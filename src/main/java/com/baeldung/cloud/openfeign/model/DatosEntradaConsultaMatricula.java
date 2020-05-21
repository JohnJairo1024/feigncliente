package com.baeldung.cloud.openfeign.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DatosEntradaConsultaMatricula {

    private String usuario;
    private String codCam;
    private String mat;

}
