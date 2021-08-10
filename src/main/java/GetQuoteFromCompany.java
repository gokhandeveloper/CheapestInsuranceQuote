public class GetQuoteFromCompany {
    InsuranceCompany company;

    public GetQuoteFromCompany(InsuranceCompany company1) {
        this.company = company1;
    }

    public Quote getQUote() {
        return InsuranceApi.getQuote(company);
    }
}
