package mcframe.clientMAUD.MAUDP1020;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCMessageList;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUDP_LCLRLUpdater_MC<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLUpdater<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLUpdater_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void checkDuplicate(MCMessageList msgList) {
		super.checkDuplicate(msgList);
		checkDuplicateMain(msgList, panel.getLclTable());
	}

	@Override
	protected void setPickedListMap() {
		panel.refreshLclAllL();
		super.setPickedListMap();
	}

	@Override
	protected void statusClear() {
		super.statusClear();

		panel.getLclTable().getList().setStatus(MCRow.NONE);

		// 更新処理後、画面に紐づかないコンテナ（LclAll）に格納されているデータの
		// 「選択」チェックをオフにする。（更新後の検索時にデータクリア確認メッセージを出力しないため）
		for (MCContainer c : getAllUpBlocks()) {
			if (c instanceof MCList) {
				MCList<?> list = (MCList<?>) c;
				if (panel.getComponent(list) == null) {
					if (list.createRow().containsConst(panel.getCheckColumn())) {
						list.setBoolean(getCheckColumn(), false);
					}
				}
			}
		}
	}
}
