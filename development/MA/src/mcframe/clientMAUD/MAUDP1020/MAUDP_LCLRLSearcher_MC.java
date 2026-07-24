package mcframe.clientMAUD.MAUDP1020;

import mcframe.clientCore.beans.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;

public class MAUDP_LCLRLSearcher_MC<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLSearcher<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLSearcher_MC(P panel, O operation) {
		super(panel, operation);
	}

	protected void adjustList() {
		super.adjustList();
		panel.getLclTable().adjustWidth();
	}

	@Override
	protected void clear() {
		super.clear();
		panel.getLclL().clear();
	}

	@Override
	protected void show() {
		super.show();
		panel.setDtlRowNoAll();
	}

	@Override
	protected boolean isDownBlockChanged() {

		// 上位クラスで画面に紐づかないコンテナはチェック対象外のためLclAllコンテナがチェックされない。
		// ここでチェックする（「選択」＝オンのレコードがあれば変更あり）
		for (MCContainer c : getAllDownContainerWithoutUpCont()) {
			if (c instanceof MCList) {
				MCList<?> list = (MCList<?>) c;
				if (panel.getComponent(list) == null) {
					if (list.createRow().containsConst(panel.getCheckColumn())) {
						if (list.getFirst(panel.getCheckColumn(), true) != null) return true;
					}
				}
			}
		}

		return super.isDownBlockChanged();
	}
}
