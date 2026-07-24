package mcframe.clientMAUD.MAUDP0010;

import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.commonCore.annotation.EI;

@EI
public class MAUDP_Deleter<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends
		MAUDP_Deleter_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Deleter(P panel, O operation) {
		super(panel, operation);
	}

}

