package io.minibuilds.designpatterns;


import io.minibuilds.designpatterns.adapter.GoodInsuranceAdapter;
import io.minibuilds.designpatterns.adapter.InsurmaticAdapter;
import io.minibuilds.designpatterns.agg.Aggregator;
import io.minibuilds.designpatterns.agg.Insurer;
import io.minibuilds.designpatterns.agg.QuoteParams;
import io.minibuilds.designpatterns.existing.GoodInsurance;
import io.minibuilds.designpatterns.existing.Insurmatic;

import java.time.LocalDate;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // existing objects e.g. 3rd party, legacy, etc
    GoodInsurance goodInsurance = new GoodInsurance();
    Insurmatic insurmatic = new Insurmatic();

    // wrap in our adapters to make them compatible with objects in the agg package
    List<Insurer> insurers = List.of(new GoodInsuranceAdapter(goodInsurance), new InsurmaticAdapter(insurmatic));


    Aggregator aggregator = new Aggregator(insurers);

    var quoteParams1 = new QuoteParams(LocalDate.of(1995, 1, 12), 1);
    var quotes1 = aggregator.getQuotes(quoteParams1);

    System.out.println(quoteParams1);
    quotes1.forEach(System.out::println);

    System.out.println();

    var quoteParams2 = new QuoteParams(LocalDate.of(1984, 6, 15), 7);
    var quotes2 = aggregator.getQuotes(quoteParams2);

    System.out.println(quoteParams1);
    quotes2.forEach(System.out::println);
  }

}
