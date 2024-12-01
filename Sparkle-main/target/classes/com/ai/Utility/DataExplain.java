package com.ai.Utility;

public class DataExplain {
    public static String explainDate(double normalizedInput)
    {
        if(normalizedInput <= 0.6)
        {
            return "";
        }
        else if(normalizedInput <= 1)
            return "отпуск отсутствовал в течение длительного периода";
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
        else if(normalizedInput == 0){return "нет возможности уйти на удалённую работу";}
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
            return "загруженность на работе — средняя";
        }
        else if (normalizedInput <= 1)
        {
            return "загруженность на работе — высокая";
        }
        throw new RuntimeException("Workload not normalized");
    }
    public static String explainworkTime(double normalizedInput)
    {
        if(normalizedInput <= 0.45)
        {
            return "";
        }
        else if (normalizedInput <= 1.0)
        {
            return ("продолжительный рабочий день - " + ((int)(normalizedInput * 9 + 1))) + " часов";
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
            return "средний уровень психической утомляемости";
        }
        else if(normalizedInput <= 1.0)
        {
            return "высокий уровень психической утомляемости";
        }
        throw new RuntimeException("FatigueScore not normalized");
    }
}
