package io.minibuilds.designpatterns.existing;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GoodInsurance {

  public int quote(LocalDate dob, int ncdYears) {
    int premium = 30000;
    long age = ChronoUnit.YEARS.between(dob, LocalDate.now());
    if (age < 35) {
      premium *= 1.2;
    }

    if (ncdYears <= 1) {
      premium *= 1.1;
    } else if (ncdYears == 2) {
      premium *= 1.05;
    }

    return premium;
  }
}
