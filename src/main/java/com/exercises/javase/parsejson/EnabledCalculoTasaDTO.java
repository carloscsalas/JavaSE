package com.exercises.javase.parsejson;

import java.util.List;
import java.util.StringJoiner;

public class EnabledCalculoTasaDTO {

    private List<CalculoTasaDTO> listCalculoTasa;

    public List<CalculoTasaDTO> getListCalculoTasa() {
        return listCalculoTasa;
    }

    public void setListCalculoTasa(List<CalculoTasaDTO> listCalculoTasa) {
        this.listCalculoTasa = listCalculoTasa;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", EnabledCalculoTasaDTO.class.getSimpleName() + "[", "]")
                .add("listCalculoTasa=" + listCalculoTasa)
                .toString();
    }
}
