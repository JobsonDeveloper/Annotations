package br.com.jobson.tarefaAnnotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    String nome();
}
