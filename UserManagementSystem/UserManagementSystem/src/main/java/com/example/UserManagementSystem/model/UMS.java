package com.example.UserManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "userManagmenetService")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UMS {

    @Id
    @Column(name = "userId")
    private Integer userId;
    @Column(name="userName")
    private String userName;
    @Column(name="date_of_birth")
    private String dob;
    @Column(name="Email")
    private String email;

    @Column(name="phone")
    private String phoneNumber;
    @Column(name="Date")
    private Date date;

    @Column(name="Time")
    private Time time;

}

