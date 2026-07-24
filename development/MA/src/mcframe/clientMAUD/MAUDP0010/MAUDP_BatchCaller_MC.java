package mcframe.clientMAUD.MAUDP0010;

import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientCore.beans.MCCallerPanelBridge;

public class MAUDP_BatchCaller_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge>
		extends mcframe.clientFXBA.FXBAP0010.FXBAP_BatchCaller<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_BatchCaller_MC(P panel, O bridge) {
		super(panel, bridge);
	}

}

