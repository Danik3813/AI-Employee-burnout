package com.ai;

import com.ai.Utility.DataExplain;
import com.ai.dataSet.Data;
import com.ai.dataSet.WeightData;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

public class Sparkle {

    private final Ensemble ensemble;

    public Sparkle()
    {
        String workdir = System.getProperty("user.dir");
        ensemble = new Ensemble(workdir + "/weight/");
        /* todo: check weight directory, if not present, get the train csv and save as train folder */
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Sparkle sp = new Sparkle();
        Data testData = new Data("2020-03-04", "male", "Service", "No",
                "2.0", "9.1", "9.2");
        double response = sp.getBurnRate(testData);
        System.out.println(response);
        PrintStream printStream = new PrintStream(System.out, true, "UTF-8");
        printStream.println(sp.resultExplain(testData, response));
    }

    public String resultExplain(Data data, double result) {
        String ans = "";
        WeightData weights = data.getWeightedData();
        String t = DataExplain.explainDate(weights.getJoinDateWeight());
        boolean f = false;
        if(!t.isEmpty()){
            f = true;
            ans += "" + t;
        }
        t = DataExplain.explainCompanyType(weights.getCompanyTypeWeight());
        if(!t.isEmpty()){
            ans += (f ? ", " : "") + t;
            f = true;
        }
        t = DataExplain.explainWFH(weights.getDistWorkWeight());
        if(!t.isEmpty()){
            ans += (f ? ", " : "") + t;
            f = true;
        }
        t = DataExplain.explainworkLoad(weights.getWorkloadWeight());
        if(!t.isEmpty()){
            ans += (f ? ", " : "") + t;
            f = true;
        }
        t = DataExplain.explainworkTime(weights.getWorkingTimeWeight());
        if(!t.isEmpty()){
            ans += (f ? ", " : "") + t;
            f = true;
        }
        t = DataExplain.explainFatigueScore(weights.getFatigueScoreWeight());
        if(!t.isEmpty()){
            ans += (f ? ", " : "") + t;
            f = true;
        }
        if(f) ans += ".";
        else ans += "Нет ключевых факторов.";

        return ans;
    }

    public double getBurnRate(Data data){
        double answer = ensemble.getResult(data);
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(answer).replace(',', '.'));
    }
}
