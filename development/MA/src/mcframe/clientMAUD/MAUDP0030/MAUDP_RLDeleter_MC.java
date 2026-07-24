package mcframe.clientMAUD.MAUDP0030;

import mcframe.clientCore.beans.*;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLUpdater;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import static mcframe.commonFX.notice.FX_Msg.*;

public class MAUDP_RLDeleter_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLUpdater<P, O> {

	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLDeleter_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	/**
	 * 削除処理の実行を確認するメッセージを返す。
	 */
	protected MCMessage msgExecConfirm() {
		return panel.msgDeleteConfirm();
	}

	/**
	 * 削除処理が終了した時のメッセージ
	 */
	public MCMessage msgUpdated() {
		return new MCMessage(FXBAP0022);
	}

}

