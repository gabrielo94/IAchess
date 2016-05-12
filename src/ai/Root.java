package ai;

import Chessboard.Chessboard;
import Chessboard.ChessboardBuilder;
import enums.Player;
import java.util.ArrayList;
import sjakk.Chess;
import sjakk.Move;

/**
 *
 * @author joakimlindquister
 */
public class Root {
    public Move bestMove;
    private Player playingAs;
    int currentBest = Integer.MIN_VALUE;
    
    public Root(Player playingAs){
        this.playingAs = playingAs;
    }
    
    public Move explore(Chessboard board){
        ArrayList<Move> moves = board.getLegalMoves(playingAs);
        if(moves.isEmpty()){
            throw new IllegalStateException();
        }
        moves.parallelStream().forEach(move -> exploreAuxiliar(board, move));
        /*for(Move move: moves){
            Chessboard newBoard = ChessboardBuilder.copy(board);
            newBoard.updateMove(move);
            Node node = new Node(playingAs);
            node.explore(BruteChessAI.depth -1, newBoard, Chess.switchPlayer(playingAs));
            if(node.getRating() > currentBest){
                bestMove = move;
                currentBest = node.getRating();
            }
        }*/
        return bestMove;
    }    
    
    private void exploreAuxiliar(Chessboard board, Move move) {
        
        Chessboard newBoard = ChessboardBuilder.copy(board);
        newBoard.updateMove(move);
        Node node = new Node(playingAs);
        node.explore(BruteChessAI.depth -1, newBoard, Chess.switchPlayer(playingAs));
        if(node.getRating() > currentBest){
            bestMove = move;
            currentBest = node.getRating();
        }
    }
}
