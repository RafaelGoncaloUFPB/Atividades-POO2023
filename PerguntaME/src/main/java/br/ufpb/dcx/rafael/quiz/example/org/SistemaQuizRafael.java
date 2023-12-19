package br.ufpb.dcx.rafael.quiz.example.org;

import java.util.LinkedList;
import java.util.List;

public class SistemaQuizRafael implements SistemaQuiz {

    private List<Pergunta> perguntas;

    public SistemaQuizRafael(){
        this.perguntas = new LinkedList<>();
    }

    public SistemaQuizRafael(List<Pergunta> perguntas){
        this.perguntas = perguntas;
    }


    @Override
    public void cadastrarPergunta(Pergunta p) {
        this.perguntas.add(p);
    }

    @Override
    public Pergunta sorteiaPergunta() {
        if(this.perguntas.size()==0) {
            return null;
        } else {
            return this.perguntas.get(0);
        }
    }

    @Override
    public List<Pergunta> getTodasAsPerguntas() {
        return this.perguntas;
    }
}