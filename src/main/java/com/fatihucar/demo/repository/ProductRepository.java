package com.fatihucar.demo.repository;

import com.fatihucar.demo.model.Product;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.io.Serializable;
import java.util.Optional;

public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
