package mcframe.clientMGUD.MGUDP0010;
import mcframe.commonCore.annotation.EI;

import mcframe.clientCore.beans.*;

@EI
public class MGUDP_FileUpdater<P extends MGUDP_PanelBase, O extends MCCallerPanelBridge> extends
		MGUDP_FileUpdater_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MGUDP_FileUpdater(P panel, O operation) {
		super(panel, operation);
	}

}

