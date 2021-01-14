package io.minibuilds.designpatterns.agg;

import java.util.List;
import java.util.stream.Collectors;

public class Aggregator {
  final List<Insurer> insurers;

  public Aggregator(List<Insurer> insurers) {
    this.insurers = insurers;
  }

  public List<Quote> getQuotes(QuoteParams quoteParams) {
    return insurers.stream().map(i -> i.getQuote(quoteParams)).collect(Collectors.toList());
  }

}
