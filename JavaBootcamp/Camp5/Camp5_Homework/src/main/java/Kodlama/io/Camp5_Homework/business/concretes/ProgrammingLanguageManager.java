package Kodlama.io.Camp5_Homework.business.concretes;

import Kodlama.io.Camp5_Homework.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.CreateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.DeleteProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.UpdateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetAllLanguageResponse;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetByIdLanguageResponse;
import Kodlama.io.Camp5_Homework.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Camp5_Homework.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Camp5_Homework.entities.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<ProgrammingLanguage> languages=programmingLanguageRepository.findAll();

        List<GetAllLanguageResponse> languageResponses=languages.stream().map(language-> this.modelMapperService.forResponse().map(language,GetAllLanguageResponse.class)).collect(Collectors.toList());

        return languageResponses;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        ProgrammingLanguage programmingLanguage=this.programmingLanguageRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse response=this.modelMapperService.forResponse().map(programmingLanguage,GetByIdLanguageResponse.class);
        return response;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage=this.modelMapperService.forRequest().map(createProgrammingLanguageRequest,ProgrammingLanguage.class);
        this.programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage=this.modelMapperService.forRequest().map(updateProgrammingLanguageRequest,ProgrammingLanguage.class);
        this.programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        this.programmingLanguageRepository.deleteById(id);
    }
}
