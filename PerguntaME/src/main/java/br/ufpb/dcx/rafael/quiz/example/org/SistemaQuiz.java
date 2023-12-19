package br.ufpb.dcx.rafael.quiz.example.org;

import java.util.List;

public interface SistemaQuiz {
    void cadastrarPergunta (Pergunta p);

    Pergunta sorteiaPergunta ();

    List<Pergunta> getTodasAsPerguntas();

}
