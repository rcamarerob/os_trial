package com.rcb.trial.os.trial.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OSTrialController {

    @RequestMapping(value="/")
    public ResponseEntity<Void> mapping() {
        return ResponseEntity.ok().build();
    }
}
