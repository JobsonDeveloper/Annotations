package br.com.jobson.tarefaAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        for (Method method : UtilizaTabela.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = method.getAnnotation(Tabela.class);
                System.out.println("Nome dado para a tabela: " + tabela.nome());
            }
            else {
                System.out.println("Annotation não encontrada!");
            }
        }
    }
}
