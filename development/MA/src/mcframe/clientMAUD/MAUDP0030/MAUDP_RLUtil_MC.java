package mcframe.clientMAUD.MAUDP0030;

import java.util.*;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCListEvent;
import mcframe.commonCore.container.MCListListener;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.*;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientFXBA.FXBAP0060.FXBAP_RLUtil;
import mcframe.commonMAUD.MAUDC0030.MAUDC_RLBase;

public class MAUDP_RLUtil_MC extends FXBAP_RLUtil {
	

	public String defGetUPDStatus() {
		return "UPD";
	}
	public String defGetDELStatus() {
		return "DEL";
	}

	
	/**
	 * 画面共通の登録担当者名カラム名を取得します。<p>
	 */
	public String getInsUsrNmColumn(){
		return MAUDC_RLBase.getInsUsrNmColumn();
	}
	/**
	 * 画面共通の更新担当者名カラム名を取得します。<p>
	 */
	public String getUpdUsrNmColumn(){
		return MAUDC_RLBase.getUpdUsrNmColumn();
	}
	/**
	 * 画面共通の論理削除ユーザＩＤカラム名を取得します。<p>
	 */
	public String getDelUsrIdColumn(){
		return MAUDC_RLBase.getDelUsrIdColumn();
	}
	/**
	 * 画面共通の論理削除ユーザ名カラム名を取得します。<p>
	 */
	public String getDelUsrNmColumn(){
		return MAUDC_RLBase.getDelUsrNmColumn();
	}
	/**
	 * 画面共通の論理削除日時カラム名を取得します。<p>
	 */
	public String getDelTsColumn(){
		return MAUDC_RLBase.getDelTsColumn();
	}
	/**
	 * 画面共通の登録機能ＩＤカラム名を取得します。<p>
	 */
	public String getInsFuncIdColumn(){
		return MAUDC_RLBase.getInsFuncIdColumn();
	}
	/**
	 * 画面共通の登録機能名カラム名を取得します。<p>
	 */
	public String getInsFuncNmColumn(){
		return MAUDC_RLBase.getInsFuncNmColumn();
	}
	/**
	 * 画面共通の更新機能ＩＤカラム名を取得します。<p>
	 */
	public String getUpdFuncIdColumn(){
		return MAUDC_RLBase.getUpdFuncIdColumn();
	}
	/**
	 * 画面共通の更新機能名カラム名を取得します。<p>
	 */
	public String getUpdFuncNmColumn(){
		return MAUDC_RLBase.getUpdFuncNmColumn();
	}
	/**
	 * 画面共通の更新リクエストＮＯカラム名を取得します。<p>
	 */
	public String getUpdSrvReqNoColumn(){
		return MAUDC_RLBase.getUpdSrvReqNoColumn();
	}

	@Override
	protected String[] getUpdColNames() {
		return MCCollectionUtil.concat(super.getUpdColNames(), new String[] {
				getInsUsrNmColumn(), getUpdUsrNmColumn(), getDelUsrIdColumn(),
				getDelUsrNmColumn(), getDelTsColumn(), getInsFuncIdColumn(),
				getInsFuncNmColumn(), getUpdFuncIdColumn(), getUpdFuncNmColumn(),
				getUpdSrvReqNoColumn()
		});
	}
	
	
	
	public <E extends MCConstRow> boolean defDeleteRows(MCTable<E> table , MCList<E> list) {
		if (table == null || list == null) {
			return true;
		}
		if (list.isEmpty() || table.getRowCount() == 0) {
			return true;
		}
		
		MCList<E> keyChangedRows = list.createInstance();
		MCList<E> deletedRows = list.createInstance();
		MCList<E> otherRows = list.createInstance();

		for (E sr : list) {
			if (sr.isStatusModify() && isKeyUpd(sr)) {
				keyChangedRows.add(sr);
			}
			else if (sr.isStatusDelete()) {
				deletedRows.add(sr);
			}
			else {
				otherRows.add(sr);
			}
		}

		if (!keyChangedRows.isEmpty()) {
			if (!confirmUndoKeyUpd()) {
				return false;
			}
		}
		
		for(E sr : keyChangedRows ){
			stockBeforeDelete(table, sr);
			undoKeyUpd(sr);
		}
		
		for(E sr : deletedRows ){
			restoreData(table, sr, true);
		}
		table.deleteRows(list);
		return true;
	}

	// ////////////////
	// Dtlブロック関係
	// ////////////////

	/**
	 * アプリケーションが使用するデフォルトのセルコンフィグ
	 * @deprecated 共通親クラスのみがオーバーライド呼び出し可能
	 */
	@Deprecated
	public MAUDP_RLBaseCellConfig defCreateDefaultAppCellConfig() {
		MAUDP_RLBaseCellConfig cellConf = new MAUDP_RLBaseCellConfig((MAUDP_RLBase) getPanel());
		return cellConf;
	}


	public String getInsUsrCdColumn() {
		return "ins_usr_id";
	}
	public String getUpdUsrCdColumn() {
		return "upd_usr_id";
	}
}

