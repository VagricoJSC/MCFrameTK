package mcframe.clientMAUD.MAUDP0010;
import mcframe.commonCore.annotation.EI;

import mcframe.clientCore.beans.*;

@EI
public class MAUDP_Updater<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends
		MAUDP_Updater_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Updater(P panel, O operation) {
		super(panel, operation);
	}

}

