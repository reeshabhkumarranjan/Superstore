package database;

import java.io.Serializable;

public final class PathString implements Serializable {

    private String s;

    public PathString() {
        s = "";
    }

    public void appendRight(String val) {
        s = s + val;
    }

    public void appendLeft(String val) {
        s = val + s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
