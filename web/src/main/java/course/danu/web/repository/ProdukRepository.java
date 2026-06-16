package course.danu.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import course.danu.web.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, Long> {

}
