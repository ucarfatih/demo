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

/*@Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((eventTime == null) ? 0 : eventTime.hashCode());
    result = prime * result + ((personId == null) ? 0 : personId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LoginEventKey other = (LoginEventKey) obj;
    if (eventTime == null) {
      if (other.eventTime != null)
        return false;
    } else if (!eventTime.equals(other.eventTime))
      return false;
    if (personId == null) {
      if (other.personId != null)
        return false;
    } else if (!personId.equals(other.personId))
      return false;
    return true;
  }*/