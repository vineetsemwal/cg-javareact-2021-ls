package org.cg.apps.jpademo2.entities;

import javax.persistence.*;
import java.util.Objects;

@Table(name="addresses_data")
@Entity
public class Address {

    @GeneratedValue
    @Id
    private Integer addressId;

    private String city;

    private String building;

    public Address(){

    }

    public Address(String city, String building){
        this.city=city;
        this.building=building;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addressId, address.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId);
    }
}
