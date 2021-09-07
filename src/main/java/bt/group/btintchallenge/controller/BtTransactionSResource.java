package bt.group.btintchallenge.controller;

import models.Customer;
import models.House;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/bt")
public class BtTransactionSResource {
    private static final String CLASS_NAME = BtTransactionSResource.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);

    @RequestMapping("/{id}")
    public List<Customer> getListCustommers(@PathVariable(name = "id") Long id) {
        System.out.println("plm");
        String method = "getListCustommers";
        logger.entering(CLASS_NAME, method, id);

        if (id != null) {

            List<Customer> customers = new ArrayList<>();
            customers.add(new Customer(1L,
                    "Lucian",
                    "Lemnariu",
                    LocalDateTime.now(),
                    "OK",
                    2L,
                    LocalDateTime.now(),
                    "Silviu"));
            return customers;
        } else return null;
    }

    @RequestMapping("/house/{name}")
    public House getHouse(@PathVariable(name = "name")String name) {
        return new House("Lucian", 100);
    }
}
