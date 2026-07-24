package mcframe.clientMAUD.MAUDP1020;

import mcframe.clientCore.beans.*;
import mcframe.commonCore.annotation.EI;

@EI
public class MAUDP_LCLRLSearcher<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_LCLRLSearcher_MC<P, O> {

	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLSearcher(P panel, O operation) {
		super(panel, operation);
	}

}
