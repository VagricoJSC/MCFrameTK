package mcframe.clientMAUD.MAUDP0020;

import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.clientFXBA.FXBAP0030.FXBAP_ISSearcher;

/**
 * @param
 * <P>
 * @param <O>
 */
public class MAUDP_ISSearcher_MC<P extends MAUDP_ISPanel, O extends MCCallerPanelBridge> extends
	FXBAP_ISSearcher<P, O> {
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_ISSearcher_MC(P panel, O operation) {
		super(panel, operation);
	}
	// 内部用のメモ
	// 入力補助用のパネルクラスは、モジュールの共通親クラスを継承している
	// （＝xAppsの入力補助用のパネル親クラスを継承していない）が、
	// 検索定型処理は、xApps の入力補助用の検索定型処理を継承するような
	// つくりになっている（＝モジュールの検索定型処理を継承していない）。
	// これは、パネルの親クラスとしては「モジュール」の。
	// 検索定型処理に関しては「入力補助用」のそれが、より多く変更の可能性が
	// あると判断したためである。
}

