package mcframe.commonMA.constant;

import mcframe.commonCore.lang.MCNumber;

/**
 * REC_ID に使用するシーケンス名を保持する区分
 *
 */
public interface IfNumSysTyp extends IfConstGrp {
	abstract public MCNumber length();
	abstract public String prefix();
}
