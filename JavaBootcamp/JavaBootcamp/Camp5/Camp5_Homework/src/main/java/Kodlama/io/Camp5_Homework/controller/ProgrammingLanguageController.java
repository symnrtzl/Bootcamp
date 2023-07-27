package Kodlama.io.Camp5_Homework.controller;

import Kodlama.io.Camp5_Homework.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.CreateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.DeleteProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest.UpdateProgrammingLanguageRequest;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetAllLanguageResponse;
import Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/homework")
@AllArgsConstructor
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @GetMapping()
    public List<GetAllLanguageResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdLanguageResponse getByIdLanguageResponse(@PathVariable int id){
        return programmingLanguageService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
    }
    @PutMapping()
    public void update(@RequestBody() UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest){
        this.programmingLanguageService.update(updateProgrammingLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(int id){
        this.programmingLanguageService.delete(id);
    }


}
