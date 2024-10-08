package com.medinastr.worldcup.dto;

import com.medinastr.worldcup.entity.Nation;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;

public class NationDTO extends RepresentationModel<NationDTO> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String institution;

    public NationDTO() {}

    public NationDTO(String name, String institution) {
        this.name = name;
        this.institution = institution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Nation toNation() {
        Nation nation = new Nation();
        nation.setName(this.getName());
        nation.setInstitution(this.getInstitution());
        return nation;
    }
}
