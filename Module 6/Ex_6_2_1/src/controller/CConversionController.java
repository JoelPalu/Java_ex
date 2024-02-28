package controller;

import model.CConversion;
import view.CConversionView;

public class CConversionController {

    private CConversion CConverion;
    public CConversionController(CConversion cc){
        this.CConverion = cc;
    }

    public double convert(double amount, String currencyF, String currencyT){

        return CConverion.convert(amount, currencyF, currencyT);
    }
}
