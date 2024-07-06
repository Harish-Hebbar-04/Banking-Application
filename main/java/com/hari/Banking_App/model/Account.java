package com.hari.Banking_App.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name="accounts")
@Getter
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username")
    private String userName;
    private double balance;
}
