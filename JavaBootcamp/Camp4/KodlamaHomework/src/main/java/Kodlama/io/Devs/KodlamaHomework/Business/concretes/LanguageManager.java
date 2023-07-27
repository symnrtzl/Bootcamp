package Kodlama.io.Devs.KodlamaHomework.Business.concretes;


import Kodlama.io.Devs.KodlamaHomework.Business.abstracts.LanguageService;
import Kodlama.io.Devs.KodlamaHomework.DataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.KodlamaHomework.Entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(Language language) throws Exception {
        for(Language l : languageRepository.getAll()){
            if(l.getName().equals(language.getName()) ){
                throw new Exception("Aynı dil tekrar yazılamaz !!!");
            }
        }
        languageRepository.add(language);

    }


    @Override
    public void update(Language language) {
        languageRepository.update(language);
    }

    @Override
    public void delete(Language language) {
        languageRepository.delete(language);
    }


}





/*

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(Language language) throws Exception {
        List<Language> ListLanguages;
        ListLanguages= languageRepository.getAll();

        for(Language i:ListLanguages){
            if(i.getName().equalsIgnoreCase(language.getName())){
                throw new Exception("Bu dil sistemde mevcuttur. Lütfen başka bir dil giriniz !!!");
            }
        }
    }

    @Override
    public void update(int id,Language language) {
        languageRepository.update(id,language);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }*/