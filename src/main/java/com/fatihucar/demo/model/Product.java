package com.fatihucar.demo.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.*;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

import javax.annotation.sql.DataSourceDefinitions;
import java.io.Serializable;
import java.util.UUID;


@Table("Product")
@Getter
@Setter
public class Product {

    @PrimaryKey
    private PrimaryKeyClass pk;

    @Column(value = "product_id")
    @CassandraType(type = Name.UUID)
    private UUID productId;

    @Column(value = "serial_number")
    @CassandraType(type = Name.UUID)
    private UUID serialNumber;

    @Column(value = "name")
    @CassandraType(type = Name.TEXT)
    private String name;

    @Column(value = "item_category")
    @CassandraType(type = Name.TEXT)
    private String itemCategory;

    @Column(value = "price")
    @CassandraType(type = Name.INT)
    private int price;

}
