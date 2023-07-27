package Kodlama.io.Camp5_Homework.controller;

import Kodlama.io.Camp5_Homework.business.abstracts.TecnologyService;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.CreateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.DeleteTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest.UpdateTecnologyRequest;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetAllTecnologyResponse;
import Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse.GetByIdTecnolohyResponse;
import Kodlama.io.Camp5_Homework.entities.Tecnology;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/tecnologies")
@AllArgsConstructor
public class TecnologyController {
    private TecnologyService tecnologyService;

    @GetMapping()
    public List<GetAllTecnologyResponse> getAll(){
        return tecnologyService.getAll();
    }

    @GetMapping("/{id}")
    GetByIdTecnolohyResponse getById(@PathVariable int id){
        return tecnologyService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateTecnologyRequest createTecnologyRequest){
        this.tecnologyService.add(createTecnologyRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateTecnologyRequest updateTecnologyRequest){
        tecnologyService.update(updateTecnologyRequest);
    }

    @DeleteMapping()
    public void delete(DeleteTecnologyRequest deleteTecnologyRequest){
        this.tecnologyService.delete(deleteTecnologyRequest);
    }
}
