package com.antumbrastation.phantomchess.csp;

import com.antumbrastation.phantomchess.board.PieceType;

import java.util.Map;
import java.util.Set;

public class TrueConstraint implements StateRestraint {

    @Override
    public boolean satisfied(Map<Integer, PieceType> potentialHiddenState) {
        return true;
    }

    @Override
    public Set<Integer> boundPieces(Set<Integer> bound) {
        return bound;
    }

    public String toString() {
        return "{TRUE}";
    }

}
