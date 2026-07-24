package mcframe.clientMAUD.MAUDP1010;

import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLUpdater;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUDP_RLUpdater_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLUpdater<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLUpdater_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	public MCMessage msgNoDataChange() {
		return new MCMessage(FXBAP0038);
	}

	/** キーの重複チェックを行います。 */
	@Override
	protected void checkDuplicate(MCMessageList msgList) {
		if (_implRLPanel.getDtlTable() != null) {
			checkDuplicateMain(msgList, _implRLPanel.getDtlTable());
		}
	}

	protected void checkDuplicateMain(MCMessageList msgList, MCTable<?> tbl) {
		String[] keys = tbl.getList().createRow().getKeys().toArray(new String[0]);
		panel.checkDuplicate(msgList, tbl, keys);
	}

	/**
	 * 開始日終了日の重複をチェックする。
	 *
	 * @param list エラーメッセージを格納するためのリスト
	 */
	protected void checkStEndDtValid(MCMessageList list) {
		if (_implRLPanel instanceof MAUDP_RLBase) {
			((MAUDP_RLBase)_implRLPanel).checkStEndDtValid(list);
		}
	}

	/**
	 * サーバー処理で例外が発生した場合のメッセージ加工を行う。
	 * @param m メッセージ
	 * @param am メッセージリスト
	 * @param cs キーカラムリスト
	 * @param bcs 変更前キーカラムリスト
	 */
	@Override
	protected void modMsg(MCMessage m, MCMessageList am, MCColumnConfig[] cs, MCColumnConfig[] bcs) {

		if (isSame(m.getID(), FXBAL0024)) {
			MCMessage nm = getMsgForForeignInvalid(MAUDP0092, m, _msgArr);
			if (nm != null) {
				am.add(nm);
			}
		}
		else {
			super.modMsg(m, am, cs, bcs);
		}
	}

	/**
	 * 外部参照項目が見つからない場合のMCMessageを作成します。
	 *
	 * @param msgId メッセージＩＤ
	 * @param logicMsg ロジックのメッセージ
	 * @param msgArr 重複チェック用のリスト
	 * @return メッセージまたはnull
	 */
	protected MCMessage getMsgForForeignInvalid(String msgId,
			MCMessage logicMsg, ArrayList<String> msgArr) {
		MCConstRow cr = (MCConstRow) logicMsg.getCauseRow();

		/* ロケールにあったテーブル名をb1に格納 */
		String tableName = logicMsg.getBind(2);
		String b1 = getTableLocaleName(tableName);

		// キーの取得
		List<String> keys = new ArrayList<String>();
		String srvBind3 = logicMsg.getBind(3);
		if (!isNull(srvBind3)) {
			for (String b : srvBind3.split(",")) {
				keys.add(b);
			}
		}

		// テーブル定義の項目名と画面のコンテナの項目名（エイリアス）が同じ前提
		MCTable<?> t = _implRLPanel.getDtlTable();
		MCRow row = t.getList().createRow();
		MCColumnConfig[] confs = t.getColumnConfigs();
		List<MCColumnConfig> tarConfs = new ArrayList<MCColumnConfig>();
		for (String key :keys) {
			String tarColPath = row.getRealColumnPath(key);
			for (MCColumnConfig conf :confs) {
				String colPath = conf.getBaseRowColumnName();
				if(!isNull(colPath)){
					if(isSame(colPath, tarColPath)){
						tarConfs.add(conf);
						break;
					}
				}
			}
		}
		if (keys.size() != tarConfs.size()) {
			// キーが見つからなければロジックのまま返す
			return logicMsg;
		}
		String b2 = _implRLPanel.toStringWithMsgLabelNoArray(
				cr.getGUIIndex()
				, tarConfs.toArray(new MCColumnConfig[0]));

		return getNewMsg(msgArr, cr, logicMsg.getCauseColumn(), msgId, b1, b2);
	}

}

