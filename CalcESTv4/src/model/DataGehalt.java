package model;

public class DataGehalt {

	public static DataGehalt dg = new DataGehalt();
	
	private double bruttoGehalt;
	private double lohnSteuer;
	private double soliZuschlag;
	private double krankenVers;
	private double pflegeVers;
	private double arbeitslosenVers;
	private double rentenVers;
	
	
	public double getBruttoGehalt() {
		return bruttoGehalt;
	}

	public void setBruttoGehalt(double bruttoGehalt) {
		this.bruttoGehalt = bruttoGehalt * 12;
	}

	public double getLohnSteuer() {
		return lohnSteuer;
	}

	public void setLohnSteuer(double lohnSteuer) {
		this.lohnSteuer = lohnSteuer * 12;
	}

	public double getSoliZuschlag() {
		return soliZuschlag;
	}

	public void setSoliZuschlag(double soliZuschlag) {
		this.soliZuschlag = soliZuschlag * 12;
	}

	public double getKrankenVers() {
		return krankenVers;
	}

	public void setKrankenVers(double krankenVers) {
		this.krankenVers = krankenVers * 12;
	}

	public double getPflegeVers() {
		return pflegeVers;
	}

	public void setPflegeVers(double pflegeVers) {
		this.pflegeVers = pflegeVers * 12;
	}
	
	public double getArbeitslosenVers() {
		return arbeitslosenVers;
	}

	public void setArbeitslosenVers(double arbeitslosenVers) {
		this.arbeitslosenVers = arbeitslosenVers * 12;
	}
	public double getRentenVers() {
		return rentenVers;
	}

	public void setRentenVers(double rentenVers) {
		this.rentenVers = rentenVers;
	}
	
	
}
