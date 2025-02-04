package com.app.theshineindia.device_scan;

import android.graphics.drawable.Drawable;

public class App {
    private String name;
    private String package_name;
    private String status;
    private Drawable icon;
    private boolean isHidden;

    public String getName() {
        return name;
    }

    public String getPackage_name() {
        return package_name;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }
}
