package com.mitocode.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mitocode.model.Patient;
import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SignDTO {

    @EqualsAndHashCode.Include
    private Integer idSign;

    @NotNull
    private PatientDTO patient;

    @NotNull
    private LocalDate date;

    @NotNull
    private String temperature;

    @NotNull
    private String pulse;

    @NotNull
    private String rateRespiratory;
}
