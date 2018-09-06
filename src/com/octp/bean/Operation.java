package com.octp.bean;

public class Operation {
    private int firstNumber;
     private String operator;
     private int secondNumber;
     private int result;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Operation(int firstNumber, String operator, int secondNumber){



        this.firstNumber =  firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;


        if (this.operator.equals("+")) {
            this.result = this.firstNumber + this.secondNumber;
        }
        else if (this.operator.equals("-")) {
            this.result = this.firstNumber - this.secondNumber;
        }
        else if (this.operator.equals("x")) {
            this.result = this.firstNumber * this.secondNumber;
        }
        else {
            if (secondNumber == 0) {

                System.out.println("Math Erreur : Tentative de diviser par 0");
            }
            else
                this.result = this.firstNumber / this.secondNumber;
        }





    }


}
