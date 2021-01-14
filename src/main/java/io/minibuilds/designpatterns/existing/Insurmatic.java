package io.minibuilds.designpatterns.existing;

import java.math.BigDecimal;

public class Insurmatic {
  public BigDecimal getPremium(int age, int ncdYears) {
    BigDecimal premium = BigDecimal.valueOf(250);
    if (age < 35) {
      premium = premium.multiply(BigDecimal.valueOf(1.15));
    }

    if (ncdYears <= 1) {
      premium = premium.multiply(BigDecimal.valueOf(1.25));
    }
    return premium;
  }
}
