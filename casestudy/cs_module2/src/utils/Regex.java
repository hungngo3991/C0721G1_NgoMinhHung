package casestudy.src.utils;

public class Regex {
    private static final String ID_SERVICE = "^(SV)((RO)|(HO)|(VL))[-]\\n{4}$";
    private static final String NAME_SERVICE = "^[A-Z][a-z0-9\\s]*$";
    private static final String RENTAL_TYPE = "^[R][T][-]((YEAR)|(MONTH)|(DAY)|(HOUSE))$";
    private static final String RATE_ROOM = "^[0-9]\\s[S][T][A][R][S]$";
    private static final String BOOKING = "^(BK)((VL)|(HO)|(RO))[-]\\d{4}$";
    private static final String NUMBER_CONTRACT = "^(CT)((VL)|(HO)|(RO))[-]\\d{4}$";
    private static final String DATE = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
    private static final String EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PHONE_NUMBER = "^[0][35789][0-9]{8}$";
    private static final String ID_CARD_NUMBER = "^[0-9]{9}$";
    private static final String ID_PERSON = "^\\d*$";
}
