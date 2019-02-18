package com.javastudio.tutorial.bean;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.NavigationCase;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@ViewScoped
@Named
public class AjaxTestController implements Serializable {

    private static final long serialVersionUID = 4136060574729497246L;

    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void increase() {
        index++;
    }
}
