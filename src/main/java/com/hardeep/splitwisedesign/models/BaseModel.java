package com.hardeep.splitwisedesign.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @jakarta.persistence.Id
    private Long id;
}
