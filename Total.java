package com.labasolvd;

public class Total {

    private Suspected suspected;
    private Result result;
    private String printResult;


    public Total(Suspected suspected, Result result, String printResult) {
        this.suspected = suspected;
        this.result = result;
        this.printResult = printResult;
    }

    public String getPrintResult() {
        return printResult;
    }

    public void setPrintResult(String printResult) {
        this.printResult = printResult;
    }

    public String All() {

        String printResult = suspected.name + suspected.surname + result.getResultYears();
        return printResult;
    }


    @Override
    public String toString() {
        return suspected.name + "\n" + suspected.surname + "\n" + result.getResultYears();
    }
}
