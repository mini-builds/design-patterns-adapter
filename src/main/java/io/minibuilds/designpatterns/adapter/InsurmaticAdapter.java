package io.minibuilds.designpatterns.adapter;

import io.minibuilds.designpatterns.agg.Quote;
import io.minibuilds.designpatterns.agg.QuoteParams;
import io.minibuilds.designpatterns.agg.Insurer;
import io.minibuilds.designpatterns.existing.Insurmatic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InsurmaticAdapter implements Insurer {

  final Insurmatic insurmatic;

  public InsurmaticAdapter(Insurmatic insurmatic) {
    this.insurmatic = insurmatic;
  }


  @Override
  public Quote getQuote(QuoteParams quoteParams) {
    int age = (int) ChronoUnit.YEARS.between(quoteParams.getDob(), LocalDate.now());
    return new Quote("Insurmatic", insurmatic.getPremium(age, quoteParams.getNcdYears()));
  }
}
