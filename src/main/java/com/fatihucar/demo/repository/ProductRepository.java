package com.fatihucar.demo.repository;

import com.fatihucar.demo.model.PrimaryKeyClass;
import com.fatihucar.demo.model.Product;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


//@EnableCassandraRepositories
@Repository
public interface ProductRepository extends CassandraRepository<Product, PrimaryKeyClass> {
/*
    List<Product> findByKeyProductId(final UUID productId);

    List<Product> findByKeySerialNumber(final UUID serialNumber);

    List<Product> findByKeyName(final String serialNumber);

    List<Product> findByKeyProductIdAndKeySerialNumber(final UUID productId, final UUID serialNumber);

    List<Product> findByKeyProductIdAndKeySerialNumberAndName(final UUID productId, final UUID serialNumber,
                                                              final String name);
*/
}
