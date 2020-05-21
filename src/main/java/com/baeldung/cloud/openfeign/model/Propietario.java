
package com.baeldung.cloud.openfeign.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class Propietario {

    public String codigoCamara;
    public String matricula;
    public String razonSocial;
    public String codigoOrganizacionJuridica;
    public String codigoCategoriaMatricula;
    public String codigoEstadoMatricula;
    public String ultimoAnoRenovado;
    public String fechaRenovacion;
    public String valorEstAgSuc;
    public String municipioComercial;
    public String direccionComercial;
    public String barrioComercial;
    public String codigoPostalComercial;
    public String telefonoComercial1;
    public String telefonoComercial2;
    public String telefonoComercial3;
    public String correoElectronicoComercial;
    public String codigoUbicacionEmpresa;
    public String direccionFiscal;
    public String barrioFiscal;
    public String codigoPostalFiscal;
    public String municipioFiscal;
    public String correoElectronicoFiscal;
    public String empleados;
    public String ciiu1;
    public String shd1;
    public String ciiu2;
    public String shd2;
    public String ciiu3;
    public String shd3;
    public String ciiu4;
    public String shd4;
    public String descActEcon;
    public String tipoPropietario;
    public String codigoTipoLocal;
    public String afiliado;
    public String anoRenovadoAnterior;
    public String fechaRenovacionAnterior;
    public String fechaMatricula;
    public String fechaCancelacion;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
