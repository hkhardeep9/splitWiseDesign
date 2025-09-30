package com.hardeep.splitwisedesign.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStatus {
    private StatusCode status;
    private String message;
}
