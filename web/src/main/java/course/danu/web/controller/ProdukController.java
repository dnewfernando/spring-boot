package course.danu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.danu.web.entity.Produk;
import course.danu.web.service.ProdukService;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {
    @Autowired
    private ProdukService produkService;

    @PostMapping("/create")
    public ResponseEntity<Produk> createProdukFromController(@RequestBody Produk produkParameter) {
        Produk produkBaru = produkService.createProduk(produkParameter);
        return ResponseEntity.ok(produkBaru);
    }

    @GetMapping()
    public ResponseEntity <List<Produk>> getAllProdukFromController() {
        List<Produk> listProduk = produkService.getAllProduk();
        return ResponseEntity.ok(listProduk);
    }
}
