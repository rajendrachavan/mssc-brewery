package neo.spring5.microservices.service;

import lombok.extern.slf4j.Slf4j;
import neo.spring5.microservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Rajendra")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - would add a real impl to update Customer.
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting a customer.");
    }
}
