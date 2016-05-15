package ai;

import Chessboard.Chessboard;
import Chessboard.ChessboardBuilder;
import enums.Player;
import java.util.ArrayList;
import sjakk.Chess;
import sjakk.Move;

/**
 *
 * @author Joakim
 */
public class Node {
   private Player playingAs;
   
   private int rating;
   
   public Node(Player playingAs){
       this.playingAs = playingAs;
   }
   
   public int getRating(){
       return rating;
   }
   
   public void explore(int depth, Chessboard board, Player turn){
       if(depth == 0){
           rating = BoardRater.rateBoard(board, playingAs);
           return;
       }
        ArrayList<Move> moves = board.getLegalMoves(turn);
        if (moves.isEmpty()) {
            rating = BoardRater.rateBoard(board, playingAs);
        }
        
        initMaxMin(turn);
        moves.parallelStream().forEach(move -> exploreAuxiliar(board, move,
                depth, turn));
        /*for (Move move : moves) {
            Chessboard newBoard = ChessboardBuilder.copy(board);
            newBoard.updateMove(move);
            Node child = new Node(playingAs);
            child.explore(depth - 1, newBoard, Chess.switchPlayer(turn));

            if (turn == playingAs) {
                if (child.rating > rating) {
                    rating = child.rating;            
                }
            } else {
                if(child.rating < rating){
                    rating = child.rating;
                }
            }
        }*/
    }

    private void initMaxMin(Player turn) {
        if(playingAs == turn){
            rating = Integer.MIN_VALUE;
        } else {
            rating = Integer.MAX_VALUE;
        }
    }
    
    private void exploreAuxiliar(Chessboard board, Move move, int depth, 
            Player turn) {
        Chessboard newBoard = ChessboardBuilder.copy(board);
        newBoard.updateMove(move);
        Node child = new Node(playingAs);

        child.explore(depth - 1, newBoard, Chess.switchPlayer(turn));

        if (turn == playingAs) {
            if (child.rating > rating) {
                rating = child.rating;            
            }
        } else {
            if(child.rating < rating){
                rating = child.rating;
            }
        }
    }
    public void exploreA(int depth, Chessboard board, Player turn){
       if(depth == 0){
           rating = BoardRater.rateBoard(board, playingAs);
           return;
       }
        ArrayList<Move> moves = board.getLegalMoves(turn);
        if (moves.isEmpty()) {
            rating = BoardRater.rateBoard(board, playingAs);
        }
        
        initMaxMin(turn);
        moves.parallelStream().forEach(move -> exploreAuxiliarA(board, move,
                depth, turn));
        
    }
    private void exploreAuxiliarA(Chessboard board, Move move, int depth, 
            Player turn) {
        Chessboard newBoard = ChessboardBuilder.copy(board);
        newBoard.updateMove(move);
        Node child = new Node(playingAs);
        
        if (child.rating>=move.rating){
            child.exploreA(depth - 1, newBoard, Chess.switchPlayer(turn));
        }
        if (turn == playingAs) {
            if (child.rating > rating) {
                rating = child.rating;            
            }
        } else {
            if(child.rating < rating){
                rating = child.rating;
            }
        }
    }
}
