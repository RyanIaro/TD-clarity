package com.example.Mozart.concreteClass;

import com.example.Mozart.abstractClass.AbstractClass1;
import com.example.Mozart.dependance.ConcreteDependance1;
import com.example.Mozart.dependance.ConcreteDependance2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConcreteClass1 extends AbstractClass1 {
    public final ConcreteDependance1 concreteDependance1;
    public final ConcreteDependance2 concreteDependance2;
}
