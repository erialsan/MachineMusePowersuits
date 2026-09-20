package net.machinemuse.general.gui.clickable;

import java.util.List;

import net.machinemuse.numina.geometry.MusePoint2D;

public interface IClickable {

    void draw();

    void move(double x, double y);

    MusePoint2D getPosition();

    boolean hitBox(double x, double y);

    List getToolTip();
}
