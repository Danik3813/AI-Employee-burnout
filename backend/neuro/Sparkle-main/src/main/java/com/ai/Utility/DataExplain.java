package com.ai.Utility;

public class DataExplain {
    public static String explainDate(double normalizedInput)
    {
        if(normalizedInput <= 0.6)
        {
            return "";
        }
        else if(normalizedInput <= 1)
            return "давно небыло отпуска";
        throw new RuntimeException("Date not normalized");
    }
    public static String explainCompanyType(double normalizedInput)
    {
        if(normalizedInput == 1)
        {
            return "работает в сфере услуг";
        }
        else if(normalizedInput == 0){
            return "";}
        throw new RuntimeException("Company type not normalized");
    }
    public static String explainWFH(double normalizedInput)
    {
        if(normalizedInput == 1)
        {
            return "";
        }
        else if(normalizedInput == 0){return "работает на месте";}
        throw new RuntimeException("Work from home not normalized");
    }
    public static String explainworkLoad(double normalizedInput)
    {
        if(normalizedInput <= 0.35)
        {
            return "";
        }
        else if(normalizedInput <= 0.65)
        {
            return "средняя нагруженность на работе";
        }
        else if (normalizedInput <= 1)
        {
            return "высокая нагруженность на работе";
        }
        throw new RuntimeException("Workload not normalized");
    }
    public static String explainworkTime(double normalizedInput)
    {
        if(normalizedInput <= 0.45)
        {
            return "";
        }
        else if(normalizedInput <= 0.7)
        {
            return "средний рабочий день";
        }
        else if (normalizedInput <= 1.0)
        {
            return "длинный рабочий день";
        }
        throw new RuntimeException("Worktime not normalized");
    }
    public static String explainFatigueScore(double normalizedInput)
    {
        if(normalizedInput <= 0.3)
        {
            return "";
        }
        else if(normalizedInput <= 0.6)
        {
            return "средняя психичская переутомленность";
        }
        else if(normalizedInput <= 1.0)
        {
            return "высокая психичская переутомленность";
        }
        throw new RuntimeException("FatigueScore not normalized");
    }
}
