package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands") //nasıl ulaşacağı -->trayıcıda adresleme  www.kodlama.io/api/brands
public class BrandsController {

    private BrandService brandService;

    @Autowired // Parametrelere bak - BrandService, uygulamayı tara, BrandsServiceyi kim implemente ediyor BrandManager, Onun new'lenmiş halini ver
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall") // www.kodlama.io/api/brands/getAll yazılınca burası çalışacak
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
