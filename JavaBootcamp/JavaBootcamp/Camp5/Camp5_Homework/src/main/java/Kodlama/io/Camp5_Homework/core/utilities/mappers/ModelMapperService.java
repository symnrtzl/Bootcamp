package Kodlama.io.Camp5_Homework.core.utilities.mappers;

import org.modelmapper.ModelMapper;
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
