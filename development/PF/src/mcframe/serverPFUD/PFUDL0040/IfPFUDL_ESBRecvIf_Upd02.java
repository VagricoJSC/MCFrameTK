package mcframe.serverPFUD.PFUDL0040;

import mcframe.commonCore.container.*;
import mcframe.serverCore.logic.*;

/**
 * Upd02オペレーションのインターフェースクラス.<p>
 *
 * <br>
 */
public interface IfPFUDL_ESBRecvIf_Upd02 extends IfMCOperation {

	public static final String DEFAULT_MODULE_ID = "PF";
	public static final String DEFAULT_LOGIC_ID = "PFUDL0040";
	public static final String DEFAULT_OPERATION_ID = "Upd02";

	public MCContainer up(int i);

	public MCContainer down(int i);

	//-------------------------外部 I/F--------------------------

}

