package Kodlama.io.Camp5_Homework.business.abstracts;

import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.CreateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.DeleteProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.UpdateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetAllLanguageResponse;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetByIdLanguageResponse;


import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getById(int id);

    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

    void delete(int id);
}
