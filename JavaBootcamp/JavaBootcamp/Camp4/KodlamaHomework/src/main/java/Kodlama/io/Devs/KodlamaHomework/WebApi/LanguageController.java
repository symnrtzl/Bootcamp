package Kodlama.io.Devs.KodlamaHomework.WebApi;

import Kodlama.io.Devs.KodlamaHomework.Business.abstracts.LanguageService;
import Kodlama.io.Devs.KodlamaHomework.Entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/devs")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Language getById(@PathVariable int id){
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception {
        languageService.add(language);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable int id,@RequestBody Language language) {
        language.setId(id);
        languageService.update(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id,@RequestBody Language language){
        languageService.delete(language);
    }
}




 /*   @GetMapping("/getById/{id}")
    public Language getById(@PathVariable("id") int id){
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception {
        languageService.add(language);
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") int id ,@RequestBody Language language) {
        languageService.update(id,language);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        languageService.delete(id);
    }*/