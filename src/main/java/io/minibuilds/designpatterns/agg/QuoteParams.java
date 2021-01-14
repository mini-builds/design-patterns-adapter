package io.minibuilds.designpatterns.agg;

import java.time.LocalDate;

public class QuoteParams {
  final LocalDate dob;
  final int ncdYears;

  public QuoteParams(LocalDate dob, int ncdYears) {
    this.dob = dob;
    this.ncdYears = ncdYears;
  }

  public LocalDate getDob() {
    return dob;
  }

  public int getNcdYears() {
    return ncdYears;
  }

  @Override
  public String toString() {
    return "DoB: " + dob + " Ncd Years: " + ncdYears;
  }
}
