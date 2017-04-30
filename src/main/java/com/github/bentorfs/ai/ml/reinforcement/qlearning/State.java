package com.github.bentorfs.ai.ml.reinforcement.qlearning;

import java.util.List;

/**
 * 
 * 
 * @author betorfs
 */
public interface State {

   public List<State> getPossibleNextStates();

   public boolean isFinalState();

   public ActionResult goToState(State nextState);

}
