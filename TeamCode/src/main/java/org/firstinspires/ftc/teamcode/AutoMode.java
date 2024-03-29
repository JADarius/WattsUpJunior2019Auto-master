/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Hardware.Magura;


@Autonomous(name="Autonomous", group="Linear Opmode")
//@Disabled
public class AutoMode extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private Magura robot;/*
    private int MOTOR_TICK_COUNT = 1120;
    private double circumference = Math.PI * 101.6;
    public void walk(int distance) {
        robot.motors.left_front.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.left_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.right_front.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.right_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        int target =(int) (distance * MOTOR_TICK_COUNT / circumference);

        robot.motors.left_front.setTargetPosition(target);
        robot.motors.left_back.setTargetPosition(target);
        robot.motors.right_front.setTargetPosition(target);
        robot.motors.right_back.setTargetPosition(target);

        robot.motors.left_front.setPower(1);
        robot.motors.left_back.setPower(1);
        robot.motors.right_front.setPower(1);
        robot.motors.right_back.setPower(1);

        robot.motors.left_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.left_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.right_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.right_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(robot.motors.left_front.isBusy()&&robot.motors.right_front.isBusy()){
            telemetry.addData("Status", "Walking using encoders");
            telemetry.update();
        }
        robot.motors.left_front.setPower(0);
        robot.motors.left_back.setPower(0);
        robot.motors.right_front.setPower(0);
        robot.motors.right_back.setPower(0);
    }
    public void turn(int angle){
        robot.motors.left_front.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.left_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.right_front.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motors.right_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        int  target = (int) (angle * circumference / 360);

        robot.motors.left_front.setTargetPosition(target);
        robot.motors.left_back.setTargetPosition(target);
        robot.motors.right_front.setTargetPosition(-target);
        robot.motors.right_back.setTargetPosition(-target);

        robot.motors.left_front.setPower(1);
        robot.motors.left_back.setPower(1);
        robot.motors.right_front.setPower(1);
        robot.motors.right_back.setPower(1);

        robot.motors.left_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.left_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.right_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.motors.right_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(robot.motors.left_front.isBusy()&&robot.motors.right_front.isBusy()) {
            telemetry.addData("Status", "Turning to left");
            telemetry.update();
        }

        robot.motors.left_front.setPower(0);
        robot.motors.left_back.setPower(0);
        robot.motors.right_front.setPower(0);
        robot.motors.right_back.setPower(0);
    }*/
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        robot = new Magura(hardwareMap);
        waitForStart();
        runtime.reset();
        robot.motors.right_back.setPower(1);
        robot.motors.right_front.setPower(1);
        robot.motors.left_front.setPower(1);
        robot.motors.left_back.setPower(1);

        sleep(1000);

        robot.motors.right_front.setPower(0);
        robot.motors.right_back.setPower(0);
        robot.motors.left_front.setPower(0);
        robot.motors.left_back.setPower(0);
    }
}
