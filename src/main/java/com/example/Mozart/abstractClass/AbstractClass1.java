package com.example.Mozart.abstractClass;

import com.example.Mozart.dependance.ConcreteDependance1;
import com.example.Mozart.dependance.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    protected ConcreteDependance1 concreteDependance1;
    protected ConcreteDependance2 concreteDependance2;
}
