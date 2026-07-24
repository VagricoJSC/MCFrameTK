package mcframe.clientMAUD.MAUDP1020;

import mcframe.commonCore.annotation.EI;
import mcframe.clientCore.beans.*;

@EI
public class MAUDP_LCLRLUpdater<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_LCLRLUpdater_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLUpdater(P panel, O operation) {
		super(panel, operation);
	}

}
