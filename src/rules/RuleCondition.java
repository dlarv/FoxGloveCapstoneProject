package rules;

/*UMGC CAPSTONE PROJECT
* Title:Game of Life in Java By Team Fox Glove:
*         Anthony Farias
          Mitchell Howard
          Patrick Kamdem
          Hyrum Madson
          Bensaiten Sanchez Flores 
          
*CMSC 495 7380
*Professor Sanford
*February 12, 2024 
*
*The RuleCondition class: Contains a boolean statement about a cell’s environment. 
 * If this statement is evaluated to be true, this condition is met.
 */

import data.*;

abstract class RuleCondition {
	public abstract boolean check(Neighbors neighbors, ColorState currentColorState);
}



