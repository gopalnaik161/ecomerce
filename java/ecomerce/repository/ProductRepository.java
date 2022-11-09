package ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ecomerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
