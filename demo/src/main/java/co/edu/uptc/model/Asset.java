package co.edu.uptc.model;

import com.google.gson.annotations.SerializedName;

import co.edu.uptc.model.enums.AssetType;

/**
 * Representa un activo financiero disponible en el mercado.
 *
 * <p>Un {@link Asset} tiene un identificador, nombre, tipo, precio actual y una medida de volatilidad.
 * Se usa para valorar inversiones y calcular métricas de portafolio.</p>
 */
public class Asset { //Activo
    private String id;
    private String name;
    private AssetType assetType;
    private double actualPrice;
    private double volatility;

    /** Constructor vacío requerido para serialización. */
    public Asset() {
    }

    /**
     * Crea un activo con sus atributos principales.
     *
     * @param id identificador del activo
     * @param name nombre del activo
     * @param assetType tipo del activo
     * @param actualPrice precio de mercado actual
     * @param volatility volatilidad (por ejemplo 0.05 para 5%)
     */
    public Asset(String id, String name, AssetType assetType, double actualPrice, double volatility) {
        this.id = id;
        this.name = name;
        this.assetType = assetType;
        this.actualPrice = actualPrice;
        this.volatility = volatility;
    }

    /** @return identificador del activo. */
    public String getId() {
        return id;
    }
    /** @param id nuevo identificador del activo. */
    public void setId(String id) {
        this.id = id;
    }
    /** @return nombre del activo. */
    public String getName() {
        return name;
    }
    /** @param name nuevo nombre del activo. */
    public void setName(String name) {
        this.name = name;
    }
    /** @return tipo del activo. */
    public AssetType getAssetType() {
        return assetType;
    }
    /** @param assetType nuevo tipo del activo. */
    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }
    /** @return precio actual de mercado. */
    public double getActualPrice() {
        return actualPrice;
    }
    /** @param actualPrice nuevo precio de mercado. */
    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }
    /** @return volatilidad del activo. */
    public double getVolatility() {
        return volatility;
    }
    /** @param volatility nueva volatilidad del activo. */
    public void setVolatility(double volatility) {
        this.volatility = volatility;
    }

    @Override
    public String toString() {
        return "Asset [id=" + id + ", name=" + name + ", assetType=" + assetType + ", actualPrice=" + actualPrice
                + ", volatility=" + volatility + "]";
    }
}
