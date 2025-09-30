package com.hardeep.splitwisedesign.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private String from;
    private String to;
    private int amount;
}
