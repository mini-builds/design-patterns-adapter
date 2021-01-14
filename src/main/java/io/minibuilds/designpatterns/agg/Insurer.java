package io.minibuilds.designpatterns.agg;

public interface Insurer {
  Quote getQuote(QuoteParams quoteParams);
}
