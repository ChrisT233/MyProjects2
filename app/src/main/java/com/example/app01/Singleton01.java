package com.example.app01;

class Singleton01 {

    boolean VisibleSecondButton;
    boolean VisibleFirstButton;

    private static final Singleton01 ourInstance = new Singleton01();

    static Singleton01 getInstance() {
        return ourInstance;
    }

    private Singleton01() {
    }

    public boolean isVisibleSecondButton() {
        return VisibleSecondButton;
    }

    public void setVisibleSecondButton(boolean visibleSecondButton) {
        VisibleSecondButton = visibleSecondButton;
    }

    public boolean isVisibleFirstButton() {
        return VisibleFirstButton;
    }

    public void setVisibleFirstButton(boolean visibleFirstButton) {
        VisibleFirstButton = visibleFirstButton;
    }


}
