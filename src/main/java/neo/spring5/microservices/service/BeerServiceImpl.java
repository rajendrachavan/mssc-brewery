package neo.spring5.microservices.service;

import neo.spring5.microservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .beerName("Galaxy Cat")
                .beerStyle("Pale ale")
                .build();
    }
}
