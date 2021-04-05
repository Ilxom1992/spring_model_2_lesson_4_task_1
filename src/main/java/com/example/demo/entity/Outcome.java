package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Outcome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long fromCardId;
    private Long toCardId;
    private Double amount;
    private Date date;
    private Double commissionAmount;
    @ManyToOne
    private Card card;
}
