package Music;

import java.io.Serializable;

public class note implements Serializable{

	private static final long serialVersionUID = 1L;
	int command;
	double time;
	long dure;
	int hauteur;
	int puissance;
	//notes (avec leur durée, leur hauteur, et peut-être leur date)
	public note(int command, int hauteur, int puissance,double time) {
		this.command = command;
		this.puissance = puissance;
		this.hauteur = hauteur;
		this.time = time;
	}
	public void setDure(long dure) {
		this.dure = dure;
	}
	public long getDure() {
		return this.dure;
	}
	public int getHauteur() {
		return this.hauteur;
	}
	public double getTime() {
		return this.time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public int getPuissance() {
		return this.puissance;
	}
	public int getCommand() {
		return this.command;
	}

}
