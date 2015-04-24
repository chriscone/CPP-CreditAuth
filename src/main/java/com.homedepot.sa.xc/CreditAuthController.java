package com.homedepot.xc.sa;

import com.homedepot.xc.sa.model.ResponseWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chris.cone on 4/24/15.
 */
@RestController
@RequestMapping("/creditAuth")
public class CreditAuthController {

    @RequestMapping(method = RequestMethod.GET)
    public String getList(){
        return "The credit auth list service is up!";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getOne(){
        return "The credit auth service is up!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseWrapper processCreditAuth(){
        return null;
    }


}
