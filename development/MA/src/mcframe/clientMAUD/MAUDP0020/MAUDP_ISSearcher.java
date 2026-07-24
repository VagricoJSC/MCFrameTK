package mcframe.clientMAUD.MAUDP0020;

import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.commonCore.annotation.EI;

/**
 * @param
 * <P>
 * @param <O>
 */
@EI
public class MAUDP_ISSearcher<P extends MAUDP_ISPanel, O extends MCCallerPanelBridge> extends
	MAUDP_ISSearcher_MC<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_ISSearcher(P panel, O operation) {
		super(panel, operation);
	}
}

