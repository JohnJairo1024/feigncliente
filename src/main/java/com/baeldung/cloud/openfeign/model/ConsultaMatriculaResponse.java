
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
public class ConsultaMatriculaResponse {

    public String codigoCamara;
    public String matricula;
    public List<Registro> registros = null;
    public String fechaRespuesta;
    public String horaRespuesta;
    public Error error;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
