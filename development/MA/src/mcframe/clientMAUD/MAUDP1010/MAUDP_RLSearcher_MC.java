package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientCore.beans.*;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLSearcher;

public class MAUDP_RLSearcher_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLSearcher<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLSearcher_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void afterCallSub() {
		// マスタは基本的にキー項目の変更は行わないが、例外として適用開始日だけは変更を行うことができる。
		// 検索した適用開始日を変更前項目として保持する。
		for (int i = 0; i < param().getContainerParam().down().size(); i++) {
			MCContainer cont = param().getContainerParam().getDownBlock(i);
			String stDtKeyCol = getStDtKeyCol(cont);
			if (stDtKeyCol != null && cont instanceof MCList) {
				MCList<MCRow> l = (MCList) cont;
				for (MCRow r : l) {
					r.setValue(stDtKeyCol, r.getValueNE("st_dt"));
				}
			}
		}
	}

	protected String getStDtKeyCol(MCContainer cont) {
		for (String x : cont.getColumnPathArray()) {
			if (x.endsWith("st_dt_key")) {
				return x;
			}
		}
		return null;
	}
}

