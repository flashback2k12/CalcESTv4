package model;

public class WerbungsKosten {

	public static WerbungsKosten wk = new WerbungsKosten(); 
	
	private int ArbeitsTage;
	private double EntfernungsKMWA;
	private double SpendenGezahlt;
	private double KrankheitsKostenGezahlt;
	private double ArbeitsMittelGezahlt;
	private double TelefonKostenGezahlt;
	
	
	public int getArbeitsTage() {
		return ArbeitsTage;
	}
	public void setArbeitsTage(int arbeitsTage) {
		ArbeitsTage = arbeitsTage;
	}
	
	public double getEntfernungsKMWA() {
		return EntfernungsKMWA;
	}
	public void setEntfernungsKMWA(double entfernungsKMWA) {
		EntfernungsKMWA = entfernungsKMWA;
	}
	
	public double getSpendenGezahlt() {
		return SpendenGezahlt;
	}
	public void setSpendenGezahlt(double spendenGezahlt) {
		SpendenGezahlt = spendenGezahlt;
	}
	
	public double getKrankheitsKostenGezahlt() {
		return KrankheitsKostenGezahlt;
	}
	public void setKrankheitsKostenGezahlt(double krankheitsKostenGezahlt) {
		KrankheitsKostenGezahlt = krankheitsKostenGezahlt;
	}
	
	public double getArbeitsMittelGezahlt() {
		return ArbeitsMittelGezahlt;
	}
	public void setArbeitsMittelGezahlt(double arbeitsMittelGezahlt) {
		ArbeitsMittelGezahlt = arbeitsMittelGezahlt;
	}
	
	public double getTelefonKostenGezahlt() {
		return TelefonKostenGezahlt;
	}
	public void setTelefonKostenGezahlt(double telefonKostenGezahlt) {
		TelefonKostenGezahlt = telefonKostenGezahlt;
	}
	
	
	
	
}
