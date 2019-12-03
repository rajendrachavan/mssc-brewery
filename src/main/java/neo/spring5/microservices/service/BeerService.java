package neo.spring5.microservices.service;

import neo.spring5.microservices.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
