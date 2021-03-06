package bt.group.btintchallenge.controller;

import models.Branch;
import models.Customer;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/bt")
public class BtTransactionSResource {
    private static final String CLASS_NAME = BtTransactionSResource.class.getName();
    private static final Logger logger = Logger.getLogger(CLASS_NAME);

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ResponseBody
    public List<Customer> getListCustommers(@PathVariable(name = "id") Long id) {
        logger.log(Level.INFO, "Richiesta Lista Branches brach_id: {0}", id);
        String sDate1 = "25/09/1989";
        Date dBirth = null;
        try {
            dBirth = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (id != null) {

            List<Customer> customers = new ArrayList<>();
            customers.add(new Customer(1L,
                    "Lucian",
                    "Lemnariu",
                    dBirth,
                    "OK",
                    2L,
                    LocalDateTime.now(),
                    "Silviu"));
            return customers;
        } else return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/branch/{id}")
    @ResponseBody
    public List<Branch> getHouse(@PathVariable(name = "id") Long id) {

        List<Branch> listBranches = new ArrayList<>();
        listBranches.add(new Branch(2L, "Descriere Pe Scurt", "Descriere", "Str Aurel Vlaicu 23, Suceava", 3L));
        return listBranches;
    }
}
