package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your date of birth in format yyyy-MM-dd:");
        String DOB = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateofBirth = sdf.parse(DOB);

        Calendar today = Calendar.getInstance();
        today.setTime(dateofBirth);

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int date = today.get(Calendar.DATE);

        LocalDate birthdate = LocalDate.of(year, month, date);
        LocalDate now = LocalDate.now();
        Period yeardiff = Period.between(birthdate, now);

        if(yeardiff.getYears() < 16){
            System.out.println("The age of the applicant is " + yeardiff.getYears() + " which is too early to apply for a driving license.");
        } else {
            System.out.println("Congratulation you are qualified for applying a driving license!");
        }

    }
}
