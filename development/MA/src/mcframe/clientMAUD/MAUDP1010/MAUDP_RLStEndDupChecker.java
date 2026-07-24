package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientCore.beans.MCCallerPanelBridge;

public class MAUDP_RLStEndDupChecker<P extends MAUDP_RLBase, O extends MCCallerPanelBridge> extends MAUDP_RLStEndDupChecker_MC<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLStEndDupChecker(P panel, O operation) {
		super(panel, operation);
	}
	
}

