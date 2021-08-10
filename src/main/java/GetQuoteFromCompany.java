public class GetQuoteFromCompany {
    InsuranceCompany company;

    public GetQuoteFromCompany(InsuranceCompany company1) {
        this.company = company1;
    }
    public Quote getQuote() {
        return InsuranceApi.getQuote(company);
    }
}
