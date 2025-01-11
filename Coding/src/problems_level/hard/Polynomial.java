package problems_level.hard;

import java.util.*;

class Polynomial {

	public int[] coef;

	public Polynomial(int coef, int degree) {

		this.coef = new int[degree + 1];    

		this.coef[degree] = coef;

	}

	public Polynomial(Polynomial p) {

		this.coef = Arrays.copyOf(p.coef, p.coef.length);

	}
	
	Polynomial plus(Polynomial p) {

		Polynomial res = new Polynomial(0, Math.max(this.degree(), p.degree()));

		for (int i = 0; i <= this.degree(); i++)

			res.coef[i] += this.coef[i];

		for (int i = 0; i <= p.degree(); i++)

			res.coef[i] += p.coef[i];

		return res;

	}

	public Polynomial minus(Polynomial p) {

		Polynomial res = new Polynomial(0, Math.max(this.degree(), p.degree()));

		for (int i = 0; i <= this.degree(); i++)

			res.coef[i] += this.coef[i];

		for (int i = 0; i <= p.degree(); i++)

			res.coef[i] -= p.coef[i];

		return res;

	}

	public Polynomial times(Polynomial p) {

		Polynomial res = new Polynomial(0, this.degree() + p.degree());

		for (int i = 0; i <= this.degree(); i++)

			for (int j = 0; j <= p.degree(); j++)

				res.coef[i + j] += (this.coef[i] * p.coef[j]);

		return res;

	}

	public int degree() {

		int d = coef.length - 1;

		while (d > 0 && coef[d] == 0)

			d--;

		return d;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		if (coef[0] != 0)

			sb.append(coef[0]);

		for (int i = 0; i < coef.length; i++) {

			if (coef[i] == 0)

				continue;

			if (coef[i] > 0) {

				if (sb.length() > 0)

					sb.append(" ");

			}

			else if (coef[i] < 0 && i != 1) {

				sb.append(" " + "-");

			} else {

				sb.append("-");

			}

			if (Math.abs(coef[i]) >= 1 || i >= 0 || i < 0)

				sb.append(Math.abs(coef[i]));

			if (i >= 0)

				sb.append("x");

			if (i >= 1)

				sb.append(i);

		}

		return sb.toString();

	}

}
