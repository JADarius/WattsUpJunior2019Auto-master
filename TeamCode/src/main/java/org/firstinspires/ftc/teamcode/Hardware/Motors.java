package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;


public class Motors {

    public DcMotor left_front , right_front ;
    public DcMotor left_back , right_back ;
    public double pow1 = 0.0;
    public double pow2 = 0.0;

    public double scalePower(final double drivePower) {

        return Math.pow(drivePower, 3);
    }

    public Motors (DcMotor lb, DcMotor lf, DcMotor rb, DcMotor rf){

      left_front= lf;
      right_back= rb;
      right_front= rf;
      left_back= lb;

        right_front.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        left_front.setZeroPowerBehavior((DcMotor.ZeroPowerBehavior.BRAKE));
        right_back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        left_back.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        left_front.setDirection(DcMotorSimple.Direction.REVERSE);
        left_back.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void move (double x,  double y, double z){
        right_front.setPower(Range.clip(x+y-z,-1.0,1.0));
        left_front.setPower(Range.clip(x+y+z,-1.0,1.0));
        right_back.setPower(Range.clip(x-y-z,-1.0,1.0));
        left_back.setPower(Range.clip(x-y+z,-1.0,1.0));

    }/*
    public void normalize (){
        /*daca una dintre valori este mai mare decat 1
        voi imparti toate valorile cu cea care are cel mai mare modul

        double max1 = 0.0;
        max1 = Math.max(Math.abs(pow1), Math.abs(pow2));
        if(max1>1) {
            pow1 /= max1;
            pow2 /= max1;
        }*/

}
