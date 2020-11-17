package com.java4future.java4future.entity.enums;

public enum ChessTitle {
    GM("Grandmaster"),
    IM("International master"),
    FM("FIDE Master"),
    CM("Candidate Master"),
    WGM("Woman Grandmaster"),
    WIM("Woman International Master"),
    WFM("Woman FIDE Master"),
    WCM("Woman Candidate Master");

    private String titleName;

    private ChessTitle(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }
}
