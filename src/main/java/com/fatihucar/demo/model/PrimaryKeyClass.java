package com.fatihucar.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.UUID;

@org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
@Getter
@Setter
@EqualsAndHashCode
public class PrimaryKeyClass implements Serializable {

    @PrimaryKeyColumn(name = "product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.UUID)
    private UUID productId;

    @PrimaryKeyColumn(name = "serial_number", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.UUID)
    private UUID serialNumber;

    @PrimaryKeyColumn(name = "name", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;
}
