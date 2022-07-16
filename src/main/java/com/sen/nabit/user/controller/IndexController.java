package com.sen.nabit.user.controller;

import org.apache.coyote.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
//@CrossOrigin(allowCredentials = "*")
public class IndexController {

    @CrossOrigin
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String hi(@PathVariable String id){
        StringBuffer str = new StringBuffer("Hi !").append(id).append(" !");
        System.out.println(str);
        return str.toString();
    }

}
