package dataStructure;

import java.util.*;

enum Suite{
    DIAMOND, SPADE, CLUB, HEART;
}

public class Card{
    
    int rank;
    Suite suite;
    
    Card(int rank, Suite s){
        this.rank = rank;
        this.suite = s;
    }
    
}

class Deck {
    
    List<Card> cards = new ArrayList<Card>();
    
    public Deck(){
        for(Suite s: Suite.values()){
            for(int i = 0; i < 13; i++){
                Card card  = new Card(i, s);
                cards.add(card);
            }
        } 
    }
    
    public void Shuffle(){
         Collections.shuffle(this.cards);
    }
    
    
    public Card deal(){
        if(cards.size() == 0) throw new RuntimeException();
        return cards.remove(0);
    }
    
    public void WinningHand(){
        //Depend on the particular game;
    }
    
}


// grep -srhp "[[:alnum:]]\+@[[:alnum:]]\+" ./current_directory