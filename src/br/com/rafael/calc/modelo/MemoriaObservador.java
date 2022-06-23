package br.com.rafael.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}