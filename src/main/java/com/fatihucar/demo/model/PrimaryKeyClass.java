package com.fatihucar.demo.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
public class PrimaryKeyClass implements Serializable {

    @PrimaryKeyColumn(name = "product_id", ordinal = 0, type= PrimaryKeyType.PARTITIONED)
    private UUID productId;

    @PrimaryKeyColumn(name = "serial_number", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private UUID serialNumber;

    @PrimaryKeyColumn(name = "name", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;

    public void getProductId(UUID productId){
        this.productId = productId;
    }

    public UUID setProductId() {
        return productId;
    }

    public void setSerialNumber(UUID serialNumber) {
        this.serialNumber = serialNumber;
    }

    public UUID getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimaryKeyClass that = (PrimaryKeyClass) o;
        return Objects.equals(productId, that.productId) && Objects.equals(serialNumber, that.serialNumber) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, serialNumber, name);
    }
}
