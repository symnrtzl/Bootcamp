package Kodlama.io.Camp5_Homework.business.abstracts;

import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.CreateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.DeleteTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.UpdateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetAllTecnologyResponse;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetByIdTecnolohyResponse;
import Kodlama.io.Camp5_Homework.dataAccess.abstracts.TecnologyRepository;


import java.util.List;

public interface TecnologyService {

    List<GetAllTecnologyResponse> getAll();

    GetByIdTecnolohyResponse getById(int id);

    void add(CreateTecnologyRequest createTecnologyRequest);

    void update(UpdateTecnologyRequest updateTecnologyRequest);

    void delete(DeleteTecnologyRequest deleteTecnologyRequest);


}
