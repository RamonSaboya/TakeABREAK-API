package br.ufpe.cin.if678.util;

import java.io.Serializable;

public class Pair<F, S> implements Serializable {

	private static final long serialVersionUID = -6468811325440617183L;

	private F first;
	private S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}
}
