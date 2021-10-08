package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

/**
 * Component2Impementation
 */
@Component
public class Component2Impementation implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hola mundo 2");
    }

}