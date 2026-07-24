package mcframe.clientMAUD.MAUDP0030;

import mcframe.commonCore.annotation.EI;

import mcframe.clientCore.beans.*;

import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;

@EI
public class MAUDP_RLUpdater<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLUpdater_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLUpdater(P panel, O operation) {
		super(panel, operation);
	}

}

