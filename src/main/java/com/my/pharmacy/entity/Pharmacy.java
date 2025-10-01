package com.my.pharmacy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pharmacy")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pharmacyName;
    private String pharmacyAddress;
    private String directionURL;
    private String roadViewURL;
    private String distance;
}
