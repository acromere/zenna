package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class WingSpikeIcon extends SvgIcon {

    double POINT_RADIUS;

    double DISC_RADIUS;

    double zx;

    double zy;

    double yx;

    double yy;

    double xx;

    double xy;

    double wx;

    double wy;

    double vx;

    double vy;

    private double bx;

    private double by;

    private double dx;

    private double dy;

    private double fx;

    private double fy;

    private double frontStartAngleDeg;

    private double frontSpanAngleDeg;

    private double leftArcStartAngleDeg;

    private double leftArcSpanAngleDeg;

    private double backArcStartAngleDeg;

    private double backArcSpanAngleDeg;

    private double rightArcStartAngleDeg;

    private double rightArcSpanAngleDeg;

    public WingSpikeIcon() {
        POINT_RADIUS = 2;
        DISC_RADIUS = 5;
        zx = 16;
        zy = 7;
        yx = 7;
        yy = 25;
        xx = 16;
        xy = 22;
        wx = 25;
        wy = 25;
        vx = xx;
        vy = xy;
    }

    @Override
    protected void define() {
        super.define();

        draw(circle(16, 16, 6));
    }

}
