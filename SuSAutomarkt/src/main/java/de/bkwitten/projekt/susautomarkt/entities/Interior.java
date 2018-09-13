package de.bkwitten.projekt.susautomarkt.entities;

public class Interior {

	private boolean climate;
	private boolean abs;
	private boolean navi;

	// usw

	public Interior() {

		setClimate(climate);
		setAbs(abs);
		setNavi(navi);

		// usw
	}

	public boolean isClimate() {
		return climate;
	}

	public boolean isAbs() {
		return abs;
	}

	public boolean isNavi() {
		return navi;
	}

	public void setClimate(boolean climate) {
		this.climate = climate;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public void setNavi(boolean navi) {
		this.navi = navi;
	}
}
