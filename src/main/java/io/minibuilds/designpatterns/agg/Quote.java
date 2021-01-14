package io.minibuilds.designpatterns.agg;

import java.math.BigDecimal;

public class Quote {
  final String insurer;
  final BigDecimal premium;

  public Quote(String insurer, BigDecimal premium) {
    this.insurer = insurer;
    this.premium = premium;
  }

  public String getInsurer() {
    return insurer;
  }

  public BigDecimal getPremium() {
    return premium;
  }

  @Override
  public String toString() {
    return insurer + ": " + premium;
  }
}
