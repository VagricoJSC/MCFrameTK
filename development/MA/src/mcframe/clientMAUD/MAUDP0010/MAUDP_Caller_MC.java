package mcframe.clientMAUD.MAUDP0010;


import mcframe.clientCore.beans.*;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Caller;

public class MAUDP_Caller_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends FXBAP_Caller<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Caller_MC(P panel, O operation) {
		super(panel, operation);

	}

}

