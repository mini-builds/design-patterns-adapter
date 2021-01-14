package io.minibuilds.designpatterns.adapter;

import io.minibuilds.designpatterns.agg.Quote;
import io.minibuilds.designpatterns.agg.QuoteParams;
import io.minibuilds.designpatterns.agg.Insurer;
import io.minibuilds.designpatterns.existing.GoodInsurance;

import java.math.BigDecimal;

public class GoodInsuranceAdapter implements Insurer {

  final GoodInsurance goodInsurance;

  public GoodInsuranceAdapter(GoodInsurance goodInsurance) {
    this.goodInsurance = goodInsurance;
  }

  @Override
  public Quote getQuote(QuoteParams quoteParams) {
    BigDecimal premium = BigDecimal.valueOf(goodInsurance.quote(quoteParams.getDob(), quoteParams.getNcdYears()), 2);
    return new Quote("Good Insurance Co.", premium);
  }
}
