
package com.baeldung.cloud.openfeign.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class Registro {

    public String codigoCamara;
    public String camara;
    public String matricula;
    public String inscripcionProponente;
    public String razonSocial;
    public String codigoTipoIdentificacion;
    public String tipoIdentificacion;
    public String numeroIdentificacion;
    public String digitoVerificacion;
    public String codigoEstadoMatricula;
    public String estadoMatricula;
    public String codigoTipoSociedad;
    public String tipoSociedad;
    public String codigoOrganizacionJuridica;
    public String organizacionJuridica;
    public String codigoCategoriaMatricula;
    public String categoriaMatricula;
    public String ultimoAnoRenovado;
    public String fechaRenovacion;
    public String fechaMatricula;
    public String fechaCancelacion;
    public String autorizacionEnvioCorreoElectronico;
    public String direccionComercial;
    public String codigoPostalComercial;
    public String codigoMunicipioComercial;
    public String municipioComercial;
    public String dptoComercial;
    public String telefonoComercial1;
    public String telefonoComercial3;
    public String correoElectronicoComercial;
    public String direccionFiscal;
    public String codigoPostalFiscal;
    public String codigoMunicipioFiscal;
    public String municipioFiscal;
    public String dptoFiscal;
    public String correoElectronicoFiscal;
    public String codCiiuActEconPri;
    public List<Propietario> propietarios = null;
    public String fechaActualizacionRues;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
