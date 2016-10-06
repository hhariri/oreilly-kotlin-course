package com.hadihariri.kotlincourse.interop;

import com.hadihariri.kotlincourse.classes.CustomerKotlin;
import com.hadihariri.kotlincourse.classes.CustomerKotlinKt;
import com.hadihariri.kotlincourse.classes.Status;

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

        String value = customerKotlin.someField;

        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();

        customerKotlin.preferential();

        CustomerKotlinKt.extension(customerKotlin);

        UtilityClass.prefix("some", "value");
        int copyrightYear = UtilityClass.CopyrightYear;

    }
}
