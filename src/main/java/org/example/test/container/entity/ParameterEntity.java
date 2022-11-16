package org.example.test.container.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "DICT_RTDM_PARAMETERS", schema = "RTDM_DICT")
@Entity
public class ParameterEntity {

    @Id
    @Column(name = "DIAGRAM_ID")
    private String diagramId;

    @Column(name = "PARAMETER_NAME")
    private String parameterName;
}
