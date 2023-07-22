package com.khadri.spring.core.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoanEligibilityAspect {
    @Before("execution(void com.khadri.spring.core.service.LoanRequestService.applyLoan())")
    public void checkCibilScore(){
        System.out.println("check cibil score");
    }
    @Before("execution(void com.khadri.spring.core.service.LoanRequestService.applyLoan())")
    public void checkCibilSign(){
        System.out.println("check cibil sign");
    }
}