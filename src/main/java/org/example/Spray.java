package org.example;

public class Spray {

    @Override
    public String toString() {
        return "Spray{" +
                "displayName='" + displayName + '\'' +
                ", fullTransparentIcon='" + fullTransparentIcon + '\'' +
                '}';
    }

    //    @SerializedName("displayName")
    //    String nome;
    String displayName;
    String fullTransparentIcon;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFullTransparentIcon() {
        return fullTransparentIcon;
    }

    public void setFullTransparentIcon(String fullTransparentIcon) {
        this.fullTransparentIcon = fullTransparentIcon;
    }
}

