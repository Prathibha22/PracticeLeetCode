package gameWinnerWendyorBob;

public class gameWinner {
    public static String result(String input){
        //Input wwwbbbbwww
        //output bob wins
        findTurn turn=findTurn.WENDY;
        //checking for possibility of removing character
        while(input.contains(turn._checkCharSeq)) {
            int index=input.indexOf(turn._checkCharSeq);
            StringBuilder sb=new StringBuilder(input);
            sb.deleteCharAt(index+1);
            input=sb.toString();
            //changing the turn
            turn=turn.equals(findTurn.WENDY)?findTurn.BOB:findTurn.WENDY;
        }
        turn=turn.equals(findTurn.WENDY)?findTurn.BOB:findTurn.WENDY; //the winner will be the one with last move
        return turn.toString();
    }
    //define the players and what to have to win the move
    public enum findTurn {
        WENDY("www") ,
        BOB("bbb");
         String _checkCharSeq;

        findTurn(String checkCharSeq) {
            this._checkCharSeq=checkCharSeq;
        }
    }
}
