package mcframe.clientMAUD.MAUDP1010;

import mcframe.commonCore.annotation.EI;
import mcframe.clientCore.beans.*;

@EI
public class MAUDP_RLDeleter<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLDeleter_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLDeleter(P panel, O operation) {
		super(panel, operation);
	}

}

