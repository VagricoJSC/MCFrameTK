package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientCore.beans.*;
import mcframe.commonCore.annotation.EI;

@EI
public class MAUDP_RLSearcher<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLSearcher_MC<P, O> {

	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLSearcher(P panel, O operation) {
		super(panel, operation);
	}

}

