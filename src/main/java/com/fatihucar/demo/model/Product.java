package com.fatihucar.demo.model;

import lombok.*;

import org.springframework.data.cassandra.core.mapping.*;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;

import java.util.UUID;


@Table("Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    @PrimaryKeyColumn()
    private UUID productId;


    private UUID serialNumber;

    private String itemCategory;

    private int price;

    @Column
    private String name;

}
