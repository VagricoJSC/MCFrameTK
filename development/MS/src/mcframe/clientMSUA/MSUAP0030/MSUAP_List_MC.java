package mcframe.clientMSUA.MSUAP0030;

import mcframe.clientCore.event.MCEventInfo;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.*;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloItmCols;
import mcframe.commonMA.constant.*;

import mcframe.clientMSBB.MSBBP1210.*;
import mcframe.clientMSUA.MSUAP1100.MSUAP_SloItm;
import static mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;

abstract public class MSUAP_List_MC extends MSUAP_List_MC_A {

	// -- WrkNo:案件ＮＯ (START)
	protected void getWrkNo_Sort(MCList<MCRow> down, MCEventInfo info) {
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- WrkNo:案件ＮＯ (END)

	// -- SloItm:受注品目 (START)
	public MCList<MCRow> getSloItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloItm_GetList(row, info);//リストの取得
		getSloItm_SetViewCols(down, info);//表示用カラムの追加

		return down;
	}

	protected MCList<MCRow> getSloItm_GetList(MCRow row, MCEventInfo info){
		_beforeGetList(row, info);

		MCList<MCRow> list = getList("getSloItm", row, info, getListCacheTyp(row, info));

		_afterGetList(row, info, list);

		return list;
	}

	protected void getSloItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmCols.viewCols(), down, info);
	}

	protected void getSloItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmCols.sortPolicy());
	}
	// -- SloItm:受注品目 (END)
	/** 
	  * SloItmSub1:枝番１ メインメソッド<p>
	  * ItmSub1の受注登録用拡張です。
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloItmSub1(MCRow row, MCEventInfo info) {
		if (!_isInput(row)) {
			_setComboIdentifier(row);
		}
		MCList<MCRow> down = getSloItmSub1_GetList(row, info);//リストの取得
		getSloItmSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub1_Sort(down, info);//ソート
		}

		return down;
	}
	/** 
	  * SloItmSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloItmSub1_GetList(MCRow row, MCEventInfo info){
		_beforeGetList(row, info);

		MCList<MCRow> list = getList("getSloItmSub1", row, info, getListCacheTyp(row, info));

		_afterGetList(row, info, list);

		return list;
	}
	/** 
	  * SloItmSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub1Cols.viewCols(), down, info);
	}

	/** 
	  * SloItmSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub1Cols.sortPolicy());
	}

	public MCList<MCRow> getSloItmSub2(MCRow row, MCEventInfo info) {
		if (!_isInput(row)) {
			_setComboIdentifier(row);
		}
		MCList<MCRow> down = getSloItmSub2_GetList(row, info);//リストの取得
		getSloItmSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub2_Sort(down, info);//ソート
		}

		return down;
	}

	protected MCList<MCRow> getSloItmSub2_GetList(MCRow row, MCEventInfo info){
		_beforeGetList(row, info);

		MCList<MCRow> list = getList("getSloItmSub2", row, info, getListCacheTyp(row, info));

		_afterGetList(row, info, list);

		return list;
	}

	protected void getSloItmSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub2Cols.viewCols(), down, info);
	}

	protected void getSloItmSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub2Cols.sortPolicy());
	}

	public MCList<MCRow> getSloItmSub3(MCRow row, MCEventInfo info) {
		if (!_isInput(row)) {
			_setComboIdentifier(row);
		}
		MCList<MCRow> down = getSloItmSub3_GetList(row, info);//リストの取得
		getSloItmSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub3_Sort(down, info);//ソート
		}

		return down;
	}

	protected MCList<MCRow> getSloItmSub3_GetList(MCRow row, MCEventInfo info){
		_beforeGetList(row, info);

		MCList<MCRow> list = getList("getSloItmSub3", row, info, getListCacheTyp(row, info));

		_afterGetList(row, info, list);

		return list;
	}

	protected void getSloItmSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub3Cols.viewCols(), down, info);
	}

	protected void getSloItmSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub3Cols.sortPolicy());
	}

	protected boolean _isInput(MCRow row) {
		return row.contains($INPUT_VAL) || row.contains($INPUT_REQ_PLURAL_VAL);
	}

	protected void _setComboIdentifier(MCRow row) {
		row.setBooleanNE($COMBO_MODE, true);
	}

	protected void _beforeGetList(MCRow row, MCEventInfo info) {
		MSBBP_SloReg sloReg = _getSloReg(info);
		if (sloReg == null) {
			return;
		}

		_prepareCopyHdrToDtl(sloReg, row);
	}

	protected void _afterGetList(MCRow row, MCEventInfo info, MCList<MCRow> down) {
		MSBBP_SloReg sloReg = _getSloReg(info);
		if (sloReg == null) {
			return;
		}

		_setViaDlvTyp(sloReg, row, down);
	}

	protected MSBBP_SloReg _getSloReg(MCEventInfo info) {
		MSBBP_SloReg sloReg = null;
		if (info == null) {
			return sloReg;
		}

		mcframe.clientCore.beans.MCRootPanel rootPanel = info.getComponent().getBaseRootPanel();
		if (rootPanel instanceof MSUAP_SloItm) {
			sloReg = (MSBBP_SloReg) ((MSUAP_SloItm) rootPanel).getParentPanel();
		}
		else if (rootPanel instanceof MSBBP_SloReg) {
			sloReg = (MSBBP_SloReg) rootPanel;
		}
		return sloReg;
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.copyHdrToDtl()をサーバサイドで行うための準備
	 */
	protected void _prepareCopyHdrToDtl(MSBBP_SloReg sloReg, MCRow row) {
		mcframe.clientMSBB.MSBBP1210.DtlR r = sloReg.getDtlL().get(sloReg.DtlTable.getEventInfo().getEventIndex());
		int index = r.getGUIIndex();

		row.setBooleanNE(SloItmCols.$i_from_slo_reg, sloReg != null);
		if (sloReg == null) return;

		row.setBooleanNE(SloItmCols.$i_is_editable_dlv_cd, 
				sloReg.isEditable(sloReg.columnDtl_dlv_cd, index));

		row.setBooleanNE(SloItmCols.$i_is_editable_dest_cd1, 
				sloReg.isEditable(sloReg.columnDtl_dest_cd1, index));
		row.setBooleanNE(SloItmCols.$i_is_editable_dest_cd2, 
				sloReg.isEditable(sloReg.columnDtl_dest_cd2, index));
		row.setBooleanNE(SloItmCols.$i_is_editable_dest_cd3, 
				sloReg.isEditable(sloReg.columnDtl_dest_cd3, index));

		// 値の設定はサーバサイド、行のステータス変更はクライアントサイドで行う
		// setViaDlvTyp(r, h.via_dlv_typ(), h.via_dlv_typ_nm());

		row.setBooleanNE(SloItmCols.$i_is_editable_tdlv_cd, 
				sloReg.isEditable(sloReg.columnDtl_tdlv_cd, index));

		row.setBooleanNE(SloItmCols.$i_is_editable_dlv_day_week_typ_nm, 
				sloReg.isEditable(sloReg.columnDtl_dlv_day_week_typ_nm, index));

		row.setBooleanNE(SloItmCols.$i_is_editable_dlv_rqst_dt, 
				sloReg.isEditable(sloReg.columnDtl_dlv_rqst_dt, index));
		row.setBooleanNE(SloItmCols.$i_is_editable_dlv_rqst_hm, 
				sloReg.isEditable(sloReg.columnDtl_dlv_rqst_hm, index));

		row.setBooleanNE(SloItmCols.$i_is_editable_ship_rqst_dt, 
				sloReg.isEditable(sloReg.columnDtl_ship_rqst_dt, index));
		row.setBooleanNE(SloItmCols.$i_is_editable_ship_rqst_hm, 
				sloReg.isEditable(sloReg.columnDtl_ship_rqst_hm, index));
	}

	/**
	 * MSBBP1210.MSBBP_SloReg.setViaDlvTyp()と同等の処理
	 * 行ステータスの操作を含むのでここで処理する
	 * @param sloReg
	 * @param viaDlvtyp
	 * @param viaDlvtypNm
	 */
	protected void _setViaDlvTyp(MSBBP_SloReg sloReg, MCRow up, MCList<MCRow> down) {
		if (sloReg == null) return;
		
		if (down.size() != 1) return;
		
		MCRow r = down.get(0);

		if (!sloReg.getHdrR().cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(r.getStringNE(SloItmCols.$o_proc_typ))) {
			// この処理はサーバサイドで行う
		}
		else {
			// 品目の新規入力時、この時点では行ステータスはNONEになってしまっていてこの条件を満たしてしまう。
			// このリストロジックが品目の変更で利用された場合は品目コードが必ず変わるのでわざわざMODIFYにする必要はない。
			// if (dtlR.isStatusNone() && !isSame(dtlR.via_dlv_typ(), sloReg.getHdrR().via_dlv_typ())) {
			// 	dtlR.setStatus(MCRow.Status.MODIFY);
			// }

			// この処理はサーバサイドで行う
		}
	}
}
