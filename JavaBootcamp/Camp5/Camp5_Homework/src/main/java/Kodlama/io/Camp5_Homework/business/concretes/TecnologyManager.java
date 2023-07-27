package Kodlama.io.Camp5_Homework.business.concretes;

import Kodlama.io.Camp5_Homework.business.abstracts.TecnologyService;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.CreateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.DeleteTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.UpdateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetAllTecnologyResponse;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetByIdTecnolohyResponse;
import Kodlama.io.Camp5_Homework.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Camp5_Homework.dataAccess.abstracts.TecnologyRepository;
import Kodlama.io.Camp5_Homework.entities.Tecnology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TecnologyManager implements TecnologyService {
    private TecnologyRepository tecnologyRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllTecnologyResponse> getAll() {
        List<Tecnology> tecnologies= tecnologyRepository.findAll();

        List<GetAllTecnologyResponse> tecnologyResponses=tecnologies.stream().map(tecnology -> this.modelMapperService.forResponse().map(tecnology,GetAllTecnologyResponse.class)).collect(Collectors.toList());
        return tecnologyResponses;
    }

    @Override
    public GetByIdTecnolohyResponse getById(int id) {
        Tecnology tecnology=this.tecnologyRepository.findById(id).orElseThrow();
        GetByIdTecnolohyResponse response=this.modelMapperService.forResponse().map(tecnology,GetByIdTecnolohyResponse.class);
        return response;
    }

    @Override
    public void add(CreateTecnologyRequest createTecnologyRequest) {
        Tecnology tecnology=this.modelMapperService.forRequest().map(createTecnologyRequest,Tecnology.class);
        this.tecnologyRepository.save(tecnology);
    }

    @Override
    public void update(UpdateTecnologyRequest updateTecnologyRequest) {
        Tecnology tecnology=this.modelMapperService.forRequest().map(updateTecnologyRequest,Tecnology.class);
        this.tecnologyRepository.save(tecnology);
    }

    @Override
    public void delete(DeleteTecnologyRequest deleteTecnologyRequest) {
            Tecnology tecnology=this.modelMapperService.forRequest().map(deleteTecnologyRequest,Tecnology.class);
            this.tecnologyRepository.delete(tecnology);
    }
}
