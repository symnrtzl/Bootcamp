package Kodlama.io.Devs.KodlamaHomework.Business.abstracts;

import Kodlama.io.Devs.KodlamaHomework.Entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    Language getById(int id);

    void add(Language language) throws Exception;

    void  update(Language language);

    void delete(Language language);

}
