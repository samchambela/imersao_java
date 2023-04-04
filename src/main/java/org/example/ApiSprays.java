package org.example;

import java.util.ArrayList;
import java.util.List;

public class ApiSprays {
    private ArrayList<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public static class Data {
        private String displayName;
        private String fullTransparentIcon;
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
}
