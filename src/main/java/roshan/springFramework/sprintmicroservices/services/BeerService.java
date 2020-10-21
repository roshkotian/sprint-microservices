package roshan.springFramework.sprintmicroservices.services;

import roshan.springFramework.sprintmicroservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
