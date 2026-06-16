package course.danu.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.danu.web.entity.Produk;
import course.danu.web.repository.ProdukRepository;

@Service
public class ProdukService {
    
    @Autowired
    private ProdukRepository produkRepository;

    public Produk createProduk(Produk produk) {
        return produkRepository.save(produk);
    }

    public Produk getProdukById(Long id) {
        return produkRepository.findById(id).orElse(null);
    }

    public List<Produk> getAllProduk() {
        return produkRepository.findAll();
    }
}
