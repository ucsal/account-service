package bank.account_service.controller;


import bank.account_service.config.AccountConfiguration;
import bank.account_service.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AccountController {

    @Autowired
    private AccountConfiguration configuration;


    private final AtomicLong contadorId = new AtomicLong();


    @GetMapping("/account")
    public Account account(

            @RequestParam(value= "tipoConta", defaultValue = "") String tipoConta

    ) {

        String tipo = tipoConta;
        if (tipo == null || tipo.isBlank()) {
            tipo = configuration.getDefaultValue();
        }

        return new Account(contadorId.incrementAndGet(), tipo);

    }




}
