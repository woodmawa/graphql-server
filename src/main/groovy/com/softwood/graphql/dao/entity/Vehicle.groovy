package com.softwood.graphql.dao.entity

import groovy.transform.EqualsAndHashCode
import lombok.Data

import javax.persistence.Entity
import javax.persistence.*
import java.time.LocalDate

@EqualsAndHashCode
@Entity
class Vehicle implements Serializable{

    private static final long serialVersionUID = 1L

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id
    @Column(name = "type", nullable = false)
    String type
    @Column(name = "model_code", nullable = false)
    String modelCode
    @Column(name = "brand_name")
    String brandName
    @Column(name = "launch_date")
    LocalDate launchDate
    transient  String formattedDate

    // Getter and setter
    public String getFormattedDate() {
        return launchDate.toString()
    }
}
