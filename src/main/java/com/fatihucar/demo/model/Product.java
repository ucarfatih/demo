package com.fatihucar.demo.model;

import org.springframework.data.cassandra.core.mapping.*;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;

import java.io.Serializable;
import java.util.UUID;


@Table("product")
public class Product implements Serializable {

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

    public void setPk(PrimaryKeyClass pk) {
        this.pk = pk;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
