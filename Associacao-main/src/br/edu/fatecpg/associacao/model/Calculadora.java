package br.edu.fatecpg.associacao.model;

public class Calculadora {
    
    public int somar(int... valores) {
        int total = 0;
        for (int valor : valores) {
            total += valor;
        }
        return total;
    }

    public double somar(double... valores) {
        double total = 0.0;
        for (double valor : valores) {
            total += valor;
        }
        return total;
    }

    public int subt(int... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor fornecido para subtração.");
        }
        int total = valores[0];
        for (int i = 1; i < valores.length; i++) {
            total -= valores[i];
        }
        return total;
    }

    public double subt(double... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor fornecido para subtração.");
        }
        double total = valores[0];
        for (int i = 1; i < valores.length; i++) {
            total -= valores[i];
        }
        return total;
    }

    public int mult(int... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor fornecido para multiplicação.");
        }
        int total = 1;
        for (int valor : valores) {
            total *= valor;
        }
        return total;
    }

    public double mult(double... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor fornecido para multiplicação.");
        }
        double total = 1.0;
        for (double valor : valores) {
            total *= valor;
        }
        return total;
    }

    public double div(double... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Nenhum valor fornecido para divisão.");
        }
        double total = valores[0];
        for (int i = 1; i < valores.length; i++) {
            total /= valores[i];
        }
        return total;
    }
}