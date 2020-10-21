package roshan.springFramework.sprintmicroservices.services;

import org.springframework.stereotype.Service;
import roshan.springFramework.sprintmicroservices.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
       return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Modello")
                .beerStyle("Light Beer")
                .build();
    }
}
