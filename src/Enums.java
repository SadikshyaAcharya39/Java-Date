public class Enums {
    public static void main(String[] args) {
        enum Cards{
            Hearts,
            Clubs,
            Diamonds,
            Spades
        }

         Cards cards = Cards.Clubs;

          for(Cards card: Cards.values()){
              System.out.println(card);
          }


    }
}
