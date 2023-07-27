package Kodlama.io.Devs.KodlamaHomework.DataAccess.concretes;

import Kodlama.io.Devs.KodlamaHomework.DataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.KodlamaHomework.Entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "Python"));
        languages.add(new Language(3, "C#"));
        languages.add(new Language(4, "C"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) {
        for(Language language:languages){
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(Language language) {
        Language x = getById(language.getId());
        if (x != null) {
            x.setName(language.getName());
        }
    }




}
