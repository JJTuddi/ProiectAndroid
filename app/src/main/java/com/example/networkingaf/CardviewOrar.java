package com.example.networkingaf;

public class CardviewOrar {
    private String titluActivitate, oreActivitate, despreActivitate, locatieActivitate, sfat;
    private int mImageResource;
    public static int tipVremeToImg(int tipVreme) {
        switch (tipVreme) {
            case 0:
                return R.drawable.sunny;
            case 1:
                return R.drawable.snow;
            case 2:
                return R.drawable.cloudy;
            case 3:
                return R.drawable.greycloudy;
            case 4:
                return R.drawable.rainy;
            case 5:
                return R.drawable.stormy;
            case 6:
                return R.drawable.windy;
            default:
                return R.drawable.drive;
        }
    }
    public CardviewOrar(String titluActivitate, String oreActivitate, String despreActivitate, String locatieActivitate, int tipVreme) {
        this.titluActivitate = titluActivitate;
        this.oreActivitate = oreActivitate;
        this.despreActivitate = despreActivitate;
        this.locatieActivitate = locatieActivitate;
        this.mImageResource = tipVremeToImg(tipVreme);
        sfat = "";
        try {
            if (Integer.parseInt(oreActivitate.substring(0, 2)) < 12) {
                sfat += "Nu uita sa iti bei cafeaua! ";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (tipVreme == 4 || tipVreme == 5) {
            sfat += "Sa iei o umbreala! ";
        } else if (tipVreme == 0) {
            sfat += "Sa folosesti protectie solara!" ;
        } else if (tipVreme > 6) {
            sfat += "Ia transportul in comun! ";
        }
    }

    private void temperatura(double temp) {
        if (temp < 10) {
            sfat += "Este frig afara(<10)! ";
        } else if (temp > 25) {
            sfat += "Este cald afara(>25)!";
        } else {
            sfat += "Sunt " + String.valueOf(temp) + " grade Celsius! ";
        }
    }

    public String getTitluActivitate() {
        return titluActivitate;
    }

    public void setTitluActivitate(String titluActivitate) {
        this.titluActivitate = titluActivitate;
    }

    public String getOreActivitate() {
        return oreActivitate;
    }

    public void setOreActivitate(String oreActivitate) {
        this.oreActivitate = oreActivitate;
    }

    public String getDespreActivitate() {
        return despreActivitate;
    }

    public void setDespreActivitate(String despreActivitate) {
        this.despreActivitate = despreActivitate;
    }

    public String getLocatieActivitate() {
        return locatieActivitate;
    }

    public void setLocatieActivitate(String locatieActivitate) {
        this.locatieActivitate = locatieActivitate;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getSfat() {
        return sfat;
    }
}
