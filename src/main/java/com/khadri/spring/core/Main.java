package com.khadri.spring.core;

import com.khadri.spring.core.service.LoanRequestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        LoanRequestService loanRequestService = context.getBean(LoanRequestService.class);

        loanRequestService.applyLoan();
    }
}