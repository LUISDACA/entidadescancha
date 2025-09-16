package com.example.uccexample;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Asistant {

    @UserMessage("genera un saludo a los estudiantes de la UCC de sexto semestre de POO, máximo 150 caracteres")
    String chat();
}
