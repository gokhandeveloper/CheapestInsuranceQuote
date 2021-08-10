import org.junit.jupiter.api.Test;

import java.util.*;

public class GetQuoteFromCompanyTest {

    @Test
    public void getQuote() {
        Map<InsuranceCompany, Quote> quotes = new HashMap<>();
        var company1 = new InsuranceCompany();
        company1.companyName="site1";
        var getQuote=  new GetQuoteFromCompany(company1);
        Quote quote = getQuote.getQuote();
        quotes.put(company1,quote);
        quotes.forEach((i,q) -> System.out.println(i.companyName + q.price));

    }
    @Test
    public void getQuotes() {
        var company1 = new InsuranceCompany();
        company1.companyName="site1";
        var company2 = new InsuranceCompany();
        company2.companyName="site2";
        var company3 = new InsuranceCompany();
        company3.companyName="site3";
        List<InsuranceCompany> companyList= new ArrayList<>();
        companyList.add(company1);
        companyList.add(company2);
        companyList.add(company3);

        var getQuote=  new GetQuotes(companyList);
        List<Quote> quotes = getQuote.getQuotes();
        System.out.println(quotes.toString());


    }





}
