package neo.spring5.microservices.service;

import neo.spring5.microservices.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
