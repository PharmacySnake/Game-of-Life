package chess;

public enum Nappulat {

    S("s"),
    T("t"),
    R("r"),
    L("l"),
    Q("q"),
    K("k");

    private final String nappi;

    private Nappulat(String nappi) {
        this.nappi = nappi;
    }

    public String getNappi() {
        return this.nappi;
    }
}
