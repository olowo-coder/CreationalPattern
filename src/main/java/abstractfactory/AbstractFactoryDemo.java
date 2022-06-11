package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        CreditCardFactory abstractfactory = CreditCardFactory.getCreditCardFactory(400);

        CreditCard card = abstractfactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractfactory = CreditCardFactory.getCreditCardFactory(700);

        CreditCard card2 = abstractfactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
    }
}
