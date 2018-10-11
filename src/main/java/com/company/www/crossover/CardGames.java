package com.company.www.crossover;

public class CardGames {

  /**
   * Conan Edogawa got tired of solving cases, and invited his friend, Professor Agasa, over. They
   * decided to play a game of cards. Conan has n cards, and the ith card has a number ai written on
   * it. They take turns playing, starting with Conan. In each turn, the player chooses a card and
   * removes it. Also, he removes all cards having a number strictly lesser than the number on the
   * chosen card. Formally, if the player chooses the ith card, he removes that card and removes the
   * jth card for all j such that aj < ai.
   *
   * <p>A player loses if he cannot make a move on his turn, that is, he loses if there are no cards
   * left. Predict the outcome of the game, assuming both players play optimally.
   */
  public static void main(String[] args) {

      int a =5;
     loop:  for(int i = 1 ; i< 3 ; i++)
      for(int j = 1 ; j< 3 ; j++){
          if(a == 5){
              break loop;
          }
        System.out.println(i*j);
      }


  }
}
