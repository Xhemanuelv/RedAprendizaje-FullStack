package relacionesjava.Enum;

/**
 * Enum utilizado para seleccionar un tipo de arma juego ruleta
 */
public enum MarcaRevolver {

    COLT(44, "Crolt Anaconda"),
    SMITH_WESSON(45, "Revolver M1197"),
    TAURUS(454, "Tau Judge"),
    RUGER(357, "Ruler Blackhawk"),
    ASTRA(38, "Astral 680");

    private Integer caliber;
    private String gunName;

    private MarcaRevolver(Integer caliber, String gunName) {
        this.caliber = caliber;
        this.gunName = gunName;
    }

    public Integer getCaliber() {
        return caliber;
    }

    public String getGunName() {
        return gunName;
    }

}
