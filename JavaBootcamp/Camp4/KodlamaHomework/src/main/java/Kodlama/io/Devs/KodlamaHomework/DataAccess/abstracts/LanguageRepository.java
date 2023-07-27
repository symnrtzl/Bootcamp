package Kodlama.io.Devs.KodlamaHomework.DataAccess.abstracts;

import Kodlama.io.Devs.KodlamaHomework.Entities.concretes.Language;

import java.util.List;


public interface LanguageRepository {

    List<Language> getAll();

    Language getById(int id);

    void update(Language language);

    void add(Language language);

    void delete(Language language);




}
