package br.ufpe.cin.if678.util;

import java.io.Serializable;

public class Tuple<F, S, T> implements Serializable {

	private static final long serialVersionUID = 6306359022384871484L;

	private F first;
	private S second;
	private T third;

	public Tuple(F first, S second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	public T getThird() {
		return third;
	}

}
