package com.hadihariri.kotlincourse.interop;


import java.io.IOException;

/**
 * Created by hadihariri on 25/08/16.
 */
public class TalkingToKotlin {


    public void loadStats(CustomerKotlin customerKotlin) {


        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Hadi", "mail@hadihariri.com");

        customerKotlin.setEmail("mail@hadihariri.com");


        customerKotlin.changeStatus(Status.Current);

        customerKotlin.preferential();


        UtilityClass.prefix("some", "value");
        int copyrightYear = UtilityClass.CopyrightYear;

    }
}
