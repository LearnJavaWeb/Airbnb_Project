package com.example.login.model;

import javax.persistence.*;

@Entity
@Table(name = "house",catalog = "demo_login")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameHouse;
    private String address;
    private String typeHouse;
    private String typeRoom;
    private Float amountBedRoom;
    private Float amountBathRoom;
    private Float amountNight;
    private String describeRoom;

    public House() {
    }

    public House(Long id, String nameHouse, String address, String typeHouse, String typeRoom, Float amountBedRoom, Float amountBathRoom, Float amountNight, String describeRoom) {
        this.id = id;
        this.nameHouse = nameHouse;
        this.address = address;
        this.typeHouse = typeHouse;
        this.typeRoom = typeRoom;
        this.amountBedRoom = amountBedRoom;
        this.amountBathRoom = amountBathRoom;
        this.amountNight = amountNight;
        this.describeRoom = describeRoom;
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Float getAmountBedRoom() {
        return amountBedRoom;
    }

    public void setAmountBedRoom(Float amountBedRoom) {
        this.amountBedRoom = amountBedRoom;
    }

    public Float getAmountBathRoom() {
        return amountBathRoom;
    }

    public void setAmountBathRoom(Float amountBathRoom) {
        this.amountBathRoom = amountBathRoom;
    }

    public Float getAmountNight() {
        return amountNight;
    }

    public void setAmountNight(Float amountNight) {
        this.amountNight = amountNight;
    }

    public String getDescribeRoom() {
        return describeRoom;
    }

    public void setDescribeRoom(String describeRoom) {
        this.describeRoom = describeRoom;
    }
}
