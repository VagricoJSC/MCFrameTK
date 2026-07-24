package mcframe.clientMAUD.MAUDP1020;

import mcframe.commonCore.annotation.EI;
import mcframe.clientCore.beans.*;

@EI
public class MAUDP_LCLRLDeleter<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_LCLRLDeleter_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLDeleter(P panel, O operation) {
		super(panel, operation);
	}

}
