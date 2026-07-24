package mcframe.clientMABC.MABCP0280;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;
import javax.swing.tree.*;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_DptReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_DptReg_MC extends MABCP_DptReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _noEvent = false;
	
	protected MCList<DptMapR> _dptMapL;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_DptReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_DptReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0280_Upd01();
	}
	/**
	 * Panel[Dtl]のボタン[set_addr]の押下時の処理
	 */
	@Override
	public void doDtl_set_addr(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.addr1())) {
			setValueEx(columnDtl_zip_cd, idx, getCo().zip_cd());
			setValueEx(columnDtl_addr1, idx, getCo().addr1());
			setValueEx(columnDtl_addr2, idx, getCo().addr2());
			setValueEx(columnDtl_addr3, idx, getCo().addr3());
			setValueEx(columnDtl_addr4, idx, getCo().addr4());
			setValueEx(columnDtl_tel, idx, getCo().tel());
			setValueEx(columnDtl_fax, idx, getCo().fax());
		}
	}
	/**
	 * Panel[Dtl2]のボタン[set_addr]の押下時の処理
	 */
	@Override
	public void doDtl2_set_addr(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtl2L().get(idx);
		if (isNull(r.addr1())) {
			setValueEx(columnDtl2_zip_cd, idx, getCo().zip_cd());
			setValueEx(columnDtl2_addr1, idx, getCo().addr1());
			setValueEx(columnDtl2_addr2, idx, getCo().addr2());
			setValueEx(columnDtl2_addr3, idx, getCo().addr3());
			setValueEx(columnDtl2_addr4, idx, getCo().addr4());
			setValueEx(columnDtl2_tel, idx, getCo().tel());
			setValueEx(columnDtl2_fax, idx, getCo().fax());
		}
	}
	/**
	 * Panel[SrchBtn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doSrchBtn_srch(MCEventInfo info) {
		callMA_MABCL0280_Srch01();
	}

	/**
	 * [MA_MABCL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Srch01Caller<P extends MABCP_DptReg, B extends MA_MABCL0280_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0280_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isDownBlockChanged() {
			// Dtl2Tableも変更チェック対象に追加（組織変更時の対応）
			if (panel.isChanged(Dtl2Table)) {
				return true;
			}
			return super.isDownBlockChanged();
		}

		@Override
		protected void afterCall() {
			if (isUpdOpe() && !bridge.down0().isEmpty()) {
				throw new MCException(MABCP0002);
			}

			super.afterCall();
		}

		@Override
		protected void clear() {
			super.clear();
			clearSub();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			if (!isNull(Tree1Tree.getList())) {
				Tree1Tree.selectRowNoFocus(Tree1Tree.getList().get(0));
			}
			DtlTable.selectLeftmostColumn(0);
			Dtl2Table.selectRowNoFocus(0);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setButtonMode();
		}

		@Override
		protected void setModeNoDown() {
			if (isUpdOpe()) {
				setUPDStatus();
				setButtonMode();
			}
			else {
				setFIXStatus();
			}
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();

			if (Cnd_ope_MOD.isSelected() || Cnd_ope_UPD_ADMIN.isSelected()) {
				MCList l = getCnd_st_dt(MCRow.create(), null);
				if (!l.isEmpty()) {
					if (isSame(getCndR().st_dt(), l.get(l.size()-1).getDateNE(DptHisCols.$o_st_dt))) {
						Hdr1_end_dt.setMode(MCMode.REQUIRED);
					}
				}
			}
			else {
				setDefaultMode(Hdr1_end_dt);
			}
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}

		protected void showSub() {
			// ヘッダの設定
			getHdr1R().setByName(getDptHisL().get(0));

			// 組織変更時、登録枠の内容を登録（新組織）にコピー
			if (Cnd_ope_CNG.isSelected()) {
				MCList<DtlR> list = MCList.create(DtlR.class);
				for (DtlR r : getDtlL()) {
					list.add(crtDtl2R(r));
				}
				getDtl2L().addAll(list);
				setNewStDt();
			}
			

			// 検索結果を変更前にコピーする
			getDtlL().setColumnValue(DtlR.$org_wg_cd, getDtlL(), DtlR.$wg_cd);
			getDtlL().setColumnValue(DtlR.$org_asst_dpt_flg, getDtlL(), DtlR.$asst_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_ar_dpt_flg, getDtlL(), DtlR.$ar_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_ap_dpt_flg, getDtlL(), DtlR.$ap_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_sls_dpt_flg, getDtlL(), DtlR.$sls_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_purc_dpt_flg, getDtlL(), DtlR.$purc_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_ship_dpt_flg, getDtlL(), DtlR.$ship_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_arr_dpt_flg, getDtlL(), DtlR.$arr_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_mfg_dpt_flg, getDtlL(), DtlR.$mfg_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_sd_dpt_flg, getDtlL(), DtlR.$sd_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_insp_dpt_flg, getDtlL(), DtlR.$insp_dpt_flg);
			getDtlL().setColumnValue(DtlR.$org_bd_dpt_flg, getDtlL(), DtlR.$bd_dpt_flg);

			// ツリーの表示
			viewTree(Tree1Tree, DtlTable);
			viewTree(Tree2Tree, Dtl2Table);

			getDptHisL().clear();
			DtlTable.selectRowNoFocus(0);
			Dtl2Table.selectRowNoFocus(0);

			_dptMapL = getDptMapL().clone();
		}

		@Override
		protected void adjustList() {
			super.adjustList();
			Dtl2Table.adjustWidth();
		}
		@Override
		protected void sort() {
			// ソートしない
		}
	}

	protected DtlR crtDtl2R(DtlR r) {
		DtlR r2 = DtlR.create();
		r2.setStatus(MCRow.CREATE);
		r2.setValuesByName(r);
		r2.org_dpt_cd(r.dpt_cd());
		r2.org_up_lv_dpt_cd(r.up_lv_dpt_cd());
		r2.dpt_cd_key(null);
		r2.st_dt_key(null);
		r2.ins_usr_id(null);
		r2.ins_usr_nm(null);
		r2.ins_ts(null);
		r2.ins_func_id(null);
		r2.ins_func_nm(null);
		r2.upd_usr_id(null);
		r2.upd_usr_nm(null);
		r2.upd_ts(null);
		r2.upd_func_id(null);
		r2.upd_func_nm(null);
		r2.upd_srv_req_no(null);
		r2.del_usr_id(null);
		r2.del_usr_nm(null);
		r2.del_ts(null);
		r2.upd_cntr(null);
		return r2;
	}

	/**
	 * [MA_MABCL0280_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Upd01Caller<P extends MABCP_DptReg, B extends MA_MABCL0280_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0280_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return (panel.isStatusNone(getAllUpBlocks())
					&& panel.isStatusNone(getHdr1R())
					&& panel.isStatusNone(getHdr2R())
					&& panel.isStatusNone(getDtl2L()));
		}

		@Override
		protected boolean checkForCall() {
			if (isUpdOpe() && getDtlL().isEmpty()) {
				showNoUpDataMsg();
				return false;
			}
			return super.checkForCall();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getHdr1R()));
			msgList.addAll(panel.checkReq(getHdr2R()));
			msgList.addAll(panel.checkReq(exceptDeleteAndEmpty(getDtl2L())));
		}

		@Override
		protected void setupUpParam() {
			// 組織変更履歴データ編集
			MCList<DptHisR> hisL = MCList.create(DptHisR.class);
			DptHisR hisR = DptHisR.create();
			hisR.setValuesByName(getHdr1R());
			hisR.st_dt_key(hisR.st_dt());
			if (isUpdOpe()) {
				hisR.setStatus(MCRow.CREATE);
			}
			else {
				hisR.setStatus(MCRow.MODIFY);
			}
			hisL.add(hisR);
			if (Cnd_ope_CNG.isSelected()) {
				// 組織変更時、組織変更履歴（新組織）の追加
				hisR = DptHisR.create();
				hisR.setValuesByName(getHdr2R());
				hisR.setStatus(MCRow.CREATE);
				hisL.add(hisR);
			}
			getDptHisL().setAll(hisL);
			
			// 部門データ編集
			for (DtlR r : getDtlL()) {
				if (r.isStatusCreate()) {
					r.st_dt(getHdr1R().st_dt());
				}
				r.end_dt(getHdr1R().end_dt());
			}

			// 部門変更対応データ編集
			MCIndexKey idxkey = getDtlL().createIndex(DtlR.$dpt_cd);
			MCIndexKey idxkey2 = getDtl2L().createIndex(DtlR.$dpt_cd);
			MCList<DptMapR> dptMapL = MCList.create(DptMapR.class);
			// 組織変更時のみ
			if (Cnd_ope_CNG.isSelected()) {
				for (DptMapR r : _dptMapL) {
					if (!isNull(r.upd_cntr())) {
						r.end_dt(getHdr1R().end_dt());
						r.setStatus(MCRow.MODIFY);
						dptMapL.add(r);

						DtlR row = getDtlL().getFirst(idxkey, r.new_dpt_cd());
						if (!isNull(row.new_dpt_cd())) {
							DptMapR newR = DptMapR.create();
							newR.setStatus(MCRow.CREATE);
							newR.old_dpt_cd(r.old_dpt_cd());
							newR.st_dt(getHdr2R().st_dt());
							newR.end_dt(getHdr2R().end_dt());
							newR.new_dpt_cd(row.new_dpt_cd());
							dptMapL.add(newR);
						} else {
							DtlR row2 = getDtl2L().getFirst(idxkey2, r.new_dpt_cd());
							if (row2 != null) {
								DptMapR newR = r.clone();
								newR.setStatus(MCRow.CREATE);
								newR.st_dt(getHdr2R().st_dt());
								newR.end_dt(getHdr2R().end_dt());
								dptMapL.add(newR);
							}
						}
					}
				}
				for (DtlR r : getDtlL()) {
					if (!isNull(r.new_dpt_cd())) {
						DptMapR newR = DptMapR.create();
						newR.setStatus(MCRow.CREATE);
						newR.old_dpt_cd(r.dpt_cd());
						newR.st_dt(getHdr2R().st_dt());
						newR.end_dt(getHdr2R().end_dt());
						newR.new_dpt_cd(r.new_dpt_cd());
						dptMapL.add(newR);
					}
				}
			}
			getDptMapL().setAll(dptMapL);

			super.setupUpParam();

			// ステータスが変更されたデータのみセットする（部門マスタ（現組織））
			bridge.up1().setAll(panel.exceptEmpty(getDtlL()).statusChangedList());
			
			// 部門マスタ
			if (Cnd_ope_CNG.isSelected()) {
				// 新組織の部門を上り電文に追加
				MCList<DtlR> dtl2L = exceptDeleteAndEmpty(getDtl2L());
				for (DtlR r2 : dtl2L) {
					r2.st_dt(getHdr2R().st_dt());
					r2.end_dt(getHdr2R().end_dt());
					r2.new_flg(true);
				}
				bridge.up1().addAll(dtl2L);
			}
		}
		/**
		 * 変更箇所がない場合のメッセージ
		 */
		public MCMessage msgNoDataChange() {
			return panel.msgNoDataChange();
		}

		@Override
		protected void show() {
			super.show();

			if (Cnd_ope_CNG.isSelected()) {
				setMaxStDt();
			}
		}

		@Override
		protected void statusClear() {
			super.statusClear();
			getDtl2L().setStatus(MCRow.NONE);
		}
		@Override
		protected void handleMCEx(mcframe.commonCore.notice.MCException ex) {
			treeMapUpdate(DtlTable);
			treeMapUpdate(Dtl2Table);
			super.handleMCEx(ex);
		}
	}

	/**
	 * [MA_MABCL0280_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Del01Caller<P extends MABCP_DptReg, B extends MA_MABCL0280_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0280_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();

			if (Cnd_ope_DEL.isSelected()) {
				setMaxStDt();
			}
		}
	}

	/**
	 * Panel[TreeBtn1]のボタン[view]の押下時の処理
	 */
	@Override
	public void doTreeBtn1_view(MCEventInfo info) {
		viewTree(Tree1Tree, DtlTable);
		DtlTable.selectRowNoFocus(0);
	}

	/**
	 * Panel[TreeBtn1]のボタン[expand]の押下時の処理
	 */
	@Override
	public void doTreeBtn1_expand(MCEventInfo info) {
		Tree1Tree.expandAll();
	}

	/**
	 * Panel[TreeBtn1]のボタン[collapse]の押下時の処理
	 */
	@Override
	public void doTreeBtn1_collapse(MCEventInfo info) {
		Tree1Tree.collapseAll();
	}

	/**
	 * Panel[Btn1]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn1_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}

	/**
	 * Panel[Btn1]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn1_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}

	/**
	 * Panel[Btn1]のボタン[add_top]の押下時の処理
	 */
	@Override
	public void doBtn1_add_top(MCEventInfo info) {
		DtlR addR = insertRowLast(DtlTable);
		addR.st_dt(getHdr1R().st_dt());
		setButtonMode();
	}

	/**
	 * Panel[Btn1]のボタン[add_sub]の押下時の処理
	 */
	@Override
	public void doBtn1_add_sub(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		DtlR addR = insertRow(DtlTable);
		addR.st_dt(getHdr1R().st_dt());
		addR.up_lv_dpt_cd(r.dpt_cd());
		addR.up_lv_dpt_nm(r.dpt_nm());
		setButtonMode();
	}

	/**
	 * Panel[Btn1]のボタン[del_dpt]の押下時の処理
	 */
	@Override
	public void doBtn1_del_dpt(MCEventInfo info) {
		delRec(DtlTable);
	}

	/**
	 * Panel[Btn1]のボタン[can_del]の押下時の処理
	 */
	@Override
	public void doBtn1_can_del(MCEventInfo info) {
		canDel(DtlTable);
	}

	/**
	 * Panel[TreeBtn2]のボタン[view]の押下時の処理
	 */
	@Override
	public void doTreeBtn2_view(MCEventInfo info) {
		viewTree(Tree2Tree, Dtl2Table);
		Dtl2Table.selectRowNoFocus(0);
	}

	/**
	 * Panel[TreeBtn2]のボタン[expand]の押下時の処理
	 */
	@Override
	public void doTreeBtn2_expand(MCEventInfo info) {
		Tree2Tree.expandAll();
	}

	/**
	 * Panel[TreeBtn2]のボタン[collapse]の押下時の処理
	 */
	@Override
	public void doTreeBtn2_collapse(MCEventInfo info) {
		Tree2Tree.collapseAll();
	}

	/**
	 * Panel[Btn2]のボタン[add_top]の押下時の処理
	 */
	@Override
	public void doBtn2_add_top(MCEventInfo info) {
		insertRowLast(Dtl2Table);
		setButtonMode();
	}

	/**
	 * Panel[Btn2]のボタン[add_sub]の押下時の処理
	 */
	@Override
	public void doBtn2_add_sub(MCEventInfo info) {
		DtlR r = Dtl2Table.getSelectedMCRow();
		DtlR addR = insertRow(Dtl2Table);
		addR.up_lv_dpt_cd(r.dpt_cd());
		addR.up_lv_dpt_nm(r.dpt_nm());
		setButtonMode();
	}

	/**
	 * Panel[Btn2]のボタン[del_dpt]の押下時の処理
	 */
	@Override
	public void doBtn2_del_dpt(MCEventInfo info) {
		delRec(Dtl2Table);
	}

	/**
	 * Panel[Btn2]のボタン[can_del]の押下時の処理
	 */
	@Override
	public void doBtn2_can_del(MCEventInfo info) {
		canDel(Dtl2Table);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0280_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0280_Del01();
	}
	/**
	 * Panel[Btn1]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn1_rcopy(MCEventInfo info) {
		DtlR src = DtlTable.getSelectedMCRow();
		DtlR dest = DtlTable.getList().createRow();
		if (!src.isEmpty()) {
			MCConstRow.copyvalue(dest, src);
			getRLUtil().defCopyRowSub(dest);
			dest.dpt_cd(null);
			dest.dpt_nm_lcl(null);
			dest.dpt_nm(null);
			dest.setStatus(Status.CREATE);
		}
		//NCイベントがここで起こる
		//MCConstRow.copyvalueの前に持っていかないこと
		if (isNull(src.up_lv_dpt_cd())) {
			insertRow(DtlTable, DtlTable.getRowCount(), dest);
		}
		else {
			Tree1R treeR = (Tree1R)getTreeAndTableMap1().get(src);
			int addIdx = Tree1Tree.getAllChildRows(treeR).size() + 1;
			if ((src.getGUIIndex() + addIdx) <= DtlTable.getRowCount()) {
				insertRow(DtlTable, src.getGUIIndex() + addIdx, dest);
			}
			else {
				insertRow(DtlTable, DtlTable.getRowCount(), dest);
			}
		}
		setButtonMode();
	}
	/**
	 * Panel[Btn2]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn2_rcopy(MCEventInfo info) {
		DtlR src = Dtl2Table.getSelectedMCRow();
		DtlR dest = Dtl2Table.getList().createRow();
		if (!src.isEmpty()) {
			MCConstRow.copyvalue(dest, src);
			getRLUtil().defCopyRowSub(dest);
			dest.dpt_cd(null);
			dest.dpt_nm(null);
			dest.org_dpt_cd(null);
			dest.setStatus(Status.CREATE);
		}
		if (isNull(src.up_lv_dpt_cd())) {
			insertRow(Dtl2Table, Dtl2Table.getRowCount(), dest);
		}
		else {
			Tree1R treeR = (Tree1R)getTreeAndTableMap2().get(src);
			int addIdx = Tree2Tree.getAllChildRows(treeR).size() + 1;
			if ((src.getGUIIndex() + addIdx) <= Dtl2Table.getRowCount()) {
				insertRow(Dtl2Table, src.getGUIIndex() + addIdx, dest);
			}
			else {
				insertRow(Dtl2Table, Dtl2Table.getRowCount(), dest);
			}
		}
		setButtonMode();
	}

	// -- 個別実装　（ここから）

	@Override
	public MCList getDtl_cost_dpt_cd(MCRow row, MCEventInfo info) {
		mcframe.clientMAUC.MAUCP0020.TermR termR = getTermInfoYMD(this, getHdr1R().st_dt());
		row.setDateNE(CostDptCols.$i_ym, termR == null ? null : termR.term());
		return super.getDtl_cost_dpt_cd(row, info);
	}

	@Override
	public MCList getDtl2_cost_dpt_cd(MCRow row, MCEventInfo info) {
		mcframe.clientMAUC.MAUCP0020.TermR termR = getTermInfoYMD(this, getHdr2R().st_dt());
		row.setDateNE(CostDptCols.$i_ym, termR == null ? null : termR.term());
		return super.getDtl2_cost_dpt_cd(row, info);
	}

	@Override
	public MCList getDtl_ac_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE(AcDptCols.$i_dt, getHdr1R().st_dt());
		return super.getDtl_ac_dpt_cd(row, info);
	}

	@Override
	public MCList getDtl2_ac_dpt_cd(MCRow row, MCEventInfo info) {
		row.setDateNE(AcDptCols.$i_dt, getHdr2R().st_dt());
		return super.getDtl2_ac_dpt_cd(row, info);
	}
	
	

	/**TreeとTableのRow同士の関連付けを保持します。*/
	TreeAndTableMap _treeTableMap1 = createTreeAndTableMap();

	TreeAndTableMap _treeTableMap2 = createTreeAndTableMap();

	/**TreeとTableのRow同士の関連付けを保持するTreeAndTableMapクラスを取得します。*/
	protected TreeAndTableMap getTreeAndTableMap1() {
		return _treeTableMap1;
	}

	protected TreeAndTableMap getTreeAndTableMap2() {
		return _treeTableMap2;
	}

	/**リストＡとＢとを関連付けるためのクラスを取得します。*/
	protected TreeAndTableMap createTreeAndTableMap() {
		return new TreeAndTableMap();
	}

	/**リストＡとＢとを関連付けるクラスです。*/
	protected class TreeAndTableMap {
		Map<MCRow, MCRow> _abMap = new HashMap<MCRow, MCRow>();

		Map<MCRow, MCRow> _baMap = new HashMap<MCRow, MCRow>();

		/**
		 * 引数の List の Row 同士を関連付けます。
		 *
		 * <b>List同士を関連付けるものではありません。</b><br>
		 * 関連付けは格納順に行います。
		 * どちらか一方の要素が無くなった時点で関連付けは終了します。
		 * 残りの Row の関連付けは行われません。
		 */
		public void set(MCList<?> tree, MCList<?> table) {

			init();

			// マップ作成対象外のリスト
			if (isNull(tree) || isNull(table)) {
				return;
			}

			_abMap = new HashMap<MCRow, MCRow>();
			_baMap = new HashMap<MCRow, MCRow>();

			// マップ作成
			int size = tree.size();
			int bSize = table.size();
			size = (size < bSize) ? size : bSize;
			for (int i = 0; i < size; i++) {
				MCRow ar = tree.get(i);
				MCRow br = table.get(i);

				_abMap.put(ar, br);
				_baMap.put(br, ar);
			}

		}

		public MCRow get(MCRow key) {

			if (_abMap.containsKey(key)) {
				return _abMap.get(key);
			}
			if (_baMap.containsKey(key)) {
				return _baMap.get(key);
			}
			return null;
		}

		public void init() {
			_abMap.clear();
			_baMap.clear();
		}

		public void remove(MCRow key) {
			if (_abMap.containsKey(key)) {
				_abMap.remove(key);

			}
			else if (_baMap.containsKey(key)) {
				_baMap.remove(key);
			}
		}
	}

	@Override
	protected void setListListener(MCTable tbl, EventListener... listeners) {
		if (tbl != DtlTable && tbl != Dtl2Table) {
			super.setListListener(tbl, listeners);
		}
	}

	@Override
	protected void setStatusByOpe() {
		// 登録操作種別時のみ検索結果がなかった場合にUPDモードに移行する
		if (isUpdOpe()) {
			if (getDptHisL().isEmpty()) {
				getDtlTable().setStatusColumnVisible(true);
				setUPDStatus();
				fillSpace();
			}
			else {
				setFIXStatus();
			}
		}
		else if (isUpdAdminOpe()) {
			if (getDtlTable() != null) {
				getDtlTable().setStatusColumnVisible(true);
			}
			setUPD_ADMINStatus();
		}
		else if (Cnd_ope_CNG.isSelected()) {
			setCNGStatus();
		}
		else {
			super.setStatusByOpe();
		}
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		clearAll();
		// 操作種別変更時は常にFIXモード
		setFIXStatus();
		moveFocusCndPanel();

		if (isDelOpe() || Cnd_ope_CNG.isSelected()) {
			setMaxStDt();
			Cnd_del_flg.setValue(true);
		}
		else if (isUpdOpe()) {
			Cnd_st_dt.setValue(null);
			Cnd_del_flg.setValue(true);
		}

		setValueEx(Btn2_sync_flg, false);

		setDividerPos(Dpt1Panel, Cnd_ope_CNG.isSelected() ? 0.5 : 1);
	}
	protected void setMaxStDt() {
		MCList l = getCnd_st_dt(MCRow.create(),null);
		if (!l.isEmpty()) {
			Cnd_st_dt.setValue(l.get(l.size()-1).getDateNE(DptHisCols.$o_st_dt));
		}
	}

	protected boolean checkAllTableClear() {
		// Dtl2Tableも変更チェック対象に追加（組織変更時の対応）
		return ((getDtlL().isStatusNone() && getDtl2L().isStatusNone()) || confirmTableClear());
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		clearSub();
	}

	protected void clearSub() {
		getHdr1R().clear();
		getHdr2R().clear();
		getDtl2L().clear();
		getTree1L().clear();
		getTree2L().clear();
		getDptHisL().clear();
		getDptMapL().clear();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		if (isUpdOpe() || isDelOpe() || Cnd_ope_CNG.isSelected()) {
			Cnd_st_dt.setMode(MCMode.READ_ONLY);
			Cnd_del_flg.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		// 一覧の値が変更されたとき、ツリーとの関連付けを保持するマップを更新
		for (MCColumnConfig c : DtlTable.getAllColumnConfigs()) {
			if (c == nc) {
				treeMapUpdate(DtlTable);
			}
		}
		for (MCColumnConfig c : Dtl2Table.getAllColumnConfigs()) {
			if (c == nc) {
				treeMapUpdate(Dtl2Table);
			}
		}
	}

	/**
	 * TreeのNCEventの実装<p>
	 * 選択した行のRowにリンクするTableの行をselectRow()で選択します。
	 */
	@Override
	public void doTree1_NC(MCEventInfo info) {
		super.doTree1_NC(info);

		if (!_noEvent) {
			viewList(Tree1Tree, DtlTable);
			selectRowNoFocus(info.getEventIndex(), false, DtlTable, Tree1Tree);
		}
	}
	protected void setDropFlgTrue() {
		_dropFlg = true;
	}
	/**
	 * 親のRowを返します
	 */
	protected Tree1R getParentRow(MCTree tree, Tree1R childRow) {
		Enumeration e = tree.getModel().getRoot().preorderEnumeration();
		while (e.hasMoreElements()) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.nextElement();
			if (node.getUserObject() == childRow) {
				DefaultMutableTreeNode pNode = (DefaultMutableTreeNode) node.getParent();
				return (Tree1R)pNode.getUserObject();
			}
		}
		return null;
	}

	/**
	 * TableのNCEventの実装<p>
	 * 選択した行のRowにリンクするTreeの行が見えるようにTreeを展開します。
	 */
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		if (_noEvent) {
			viewTreeWithoutListSort(Tree1Tree, DtlTable);
		}

		selectRowNoFocus(info.getEventIndex(), true, DtlTable, Tree1Tree);
		setButtonMode();
	}
	protected void selectRowNoFocus(int i, boolean treeFlg, MCTable table, MCTree tree) {
		if (i < 0) {
			return ;
		}
		TreeAndTableMap map = (table == DtlTable) ? getTreeAndTableMap1() : getTreeAndTableMap2();
		if (treeFlg) {
			DtlR r = (DtlR) table.getRow(i);
			MCRow tr = map.get(r);
			if (tree.getList().contains(tr)) {
				tree.selectRowNoFocus((Tree1R) tr);
				DefaultMutableTreeNode root = (DefaultMutableTreeNode)  tree.getModel().getRoot();
				Enumeration e = root.preorderEnumeration();
				
				DefaultMutableTreeNode node = null;
				while (e.hasMoreElements()) {
					node = (DefaultMutableTreeNode) e.nextElement();
					if (node.getUserObject() == tr) {
						tree.scrollPathToVisible(new TreePath(node.getPath()));
						break;
					}
				}
			}
		}
		else {
			Tree1R r = (Tree1R) tree.getList().get(i);
			MCRow tr = map.get(r);
			if (table.getList().contains(tr)) {
				table.selectRowNoFocus(tr.getGUIIndex());
			}
		}
	}
	/**
	 * TreeのNCEventの実装<p>
	 * 選択した行のRowにリンクするTableの行をselectRow()で選択します。
	 */
	@Override
	public void doTree2_NC(MCEventInfo info) {
		super.doTree2_NC(info);

		if (!_noEvent) {
			viewList(Tree2Tree, Dtl2Table);
			selectRowNoFocus(info.getEventIndex(), false, Dtl2Table, Tree2Tree);
		}
	}

	/**
	 * TableのNCEventの実装<p>
	 * 選択した行のRowにリンクするTreeの行が見えるようにTreeを展開します。
	 */
	@Override
	public void doDtl2_NC(MCEventInfo info) {
		super.doDtl2_NC(info);

		if (_noEvent) {
			viewTreeWithoutListSort(Tree2Tree, Dtl2Table);
		}

		selectRowNoFocus(info.getEventIndex(), true, Dtl2Table, Tree2Tree);
		setButtonMode();
	}

	@Override
	public void doHdr1_st_dt_LC(MCEventInfo info) {
		super.doHdr1_st_dt_LC(info);

		if (isUpdOpe()) {
			for (DtlR r : getDtlL()) {
				r.st_dt(getHdr1R().st_dt());
			}
		}
	}
	
	@Override
	public boolean doHdr1_end_dt_VC(MCEventInfo info) {
		MCDate dt = (MCDate)info.getNewValue();
		if (!isNull(dt)) {
			if (getNextDay(dt).getYear() > 9999) {
				return false;
			}
		}
		return super.doHdr1_end_dt_VC(info);
	}
	@Override
	public void doHdr1_end_dt_LC(MCEventInfo info) {
		super.doHdr1_end_dt_LC(info);

		setNewStDt();
	}
	/**
	 * 新組織の適用開始日（旧組織の適用終了日＋１日）を設定します。
	 */
	protected void setNewStDt() {
		if (!isNull(getHdr1R().end_dt())) {
			getHdr2R().st_dt(getNextDay(getHdr1R().end_dt()));
		}
	}
	/**
	 * 引数の日付の次の日を返します。
	 */
	protected MCDate getNextDay(MCDate dt) {
		return dt.addDay(1).trunc(MCDateFieldType.DAY);
	}

	@Override
	public boolean doDtl_dpt_cd_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		// 上位部門と同じ部門は不可
		if (isSame(info.getNewValue(), r.up_lv_dpt_cd())) {
			return false;
		}
		// 部門は一意
		for (DtlR row : getDtlL()) {
			if (!isSame(r.getGUIIndex(), row.getGUIIndex()) && isSame(info.getNewValue(), row.dpt_cd())) {
				return false;
			}
		}
		return super.doDtl_dpt_cd_VC(info);
	}
	@Override
	public void doDtl_dpt_cd_LC(MCEventInfo info) {
		super.doDtl_dpt_cd_LC(info);

		int eventIdx = info.getEventIndex();

		viewTreeWithoutListSort(Tree1Tree, DtlTable);

		DtlTable.selectRow(eventIdx);

		String _defWgCd = getSysParm("DEF_WG_CD") ;
		if (!isNull(_defWgCd)) {
			setValueEx(columnDtl_wg_cd, eventIdx, _defWgCd);
		}

		setButtonMode();
	}
	@Override
	public void doDtl_dpt_nm_LC(MCEventInfo info) {
		super.doDtl_dpt_nm_LC(info);
		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(Tree1Tree, DtlTable);
		DtlTable.selectRow(eventIdx);
		setButtonMode();
	}

	@Override
	public boolean doDtl_new_dpt_cd_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isNull(info.getNewValue())) {
			// 同一部門は指定不可
			if (isSame(r.dpt_cd(), info.getNewValue())) {
				return false;
			}
		}
		return super.doDtl_new_dpt_cd_VC(info);
	}
	/**
	 * chkDptが自分の下位部門に所属する場合falseを返す。
	 * （再帰的にチェック）
	 */
	protected boolean chkDownDpt(String dpt, String chkDpt) {
		for (DtlR r : getDtlL().subList(DtlR.$up_lv_dpt_cd, dpt)) {
			if (isSame(r.dpt_cd(), chkDpt)) {
				return false;
			}
			if (!chkDownDpt(r.dpt_cd(), chkDpt)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void doDtl_new_dpt_cd_LC(MCEventInfo info) {
		super.doDtl_new_dpt_cd_LC(info);

		DtlR r1 = getDtlL().get(info.getEventIndex());
		DtlR r2 = getDtl2L().getFirst(DtlR.$org_dpt_cd, r1.dpt_cd());
		String afterDptCd = isNull(r1.new_dpt_cd()) ? r1.dpt_cd() : r1.new_dpt_cd();
		
		// 既存部門の変更
		if (r2 != null) {

			// 下位部門を取得
			MCList<DtlR> l2 = getDtl2L().subList(DtlR.$up_lv_dpt_cd, r2.dpt_cd());

			if (isNull(r1.new_dpt_cd())) {
				l2.setValue(DtlR.$up_lv_dpt_cd, r1.dpt_cd());
				l2.setValue(DtlR.$up_lv_dpt_nm, r1.dpt_nm());
				setValueEx(columnDtl2_dpt_cd, r2.getGUIIndex(), r2.org_dpt_cd());
			}
			else {
				l2.setValue(DtlR.$up_lv_dpt_cd, r1.new_dpt_cd());
				// 既に新部門が存在（部門統合）するか
				DtlR inteDpt = getDtl2L().getFirst(DtlR.$dpt_cd, r1.new_dpt_cd());
				if (inteDpt != null) {
					// 統合される部門は削除
					getDtl2L().remove(r2);
					l2.setValue(DtlR.$up_lv_dpt_nm, inteDpt.dpt_nm());
				}
				else {
					// 新部門に変更
					setValueEx(columnDtl2_dpt_cd, r2.getGUIIndex(), r1.new_dpt_cd());
					l2.setValue(DtlR.$up_lv_dpt_nm, r2.dpt_nm());
				}
			}
		}
		else {
			// 新部門をクリアしたとき、対象が部門統合で削除されたレコードなら復活させる
			if (isNull(r1.new_dpt_cd())) {
				if (getDtl2L().getFirst(DtlR.$org_dpt_cd, r1.dpt_cd()) == null) {

					// 下位部門を取得
					MCList<DtlR> l2 = getDtl2L().subList(DtlR.$org_up_lv_dpt_cd, r1.dpt_cd());
					l2.setValue(DtlR.$up_lv_dpt_cd, r1.dpt_cd());
					l2.setValue(DtlR.$up_lv_dpt_nm, r1.dpt_nm());

					DtlR addR2 = crtDtl2R(r1);
					setUpLvDpt2(addR2);

					getDtl2L().add(addR2);
				}
			}
		}
		// ツリーの表示とテーブルのソート
		viewTree(Tree2Tree, Dtl2Table);
		
		DtlR changeRow = getDtl2L().getFirst(DtlR.$dpt_cd, afterDptCd);
		if (changeRow != null) {
			if (hasInfinitLoop(changeRow, changeRow.dpt_cd(), changeRow.up_lv_dpt_cd(), getDtl2L())) {
				// 統合先が自身の下位部門の場合、同一レコード上の無限ループになるため、値をクリアしてセルにフォーカス移動する。
				setValueEx(columnDtl2_up_lv_dpt_cd, changeRow.getGUIIndex(), null);
				Dtl2Table.focusCellAt(changeRow.getGUIIndex(), columnDtl2_up_lv_dpt_cd);
			}
			else {
				Dtl2Table.selectRowNoFocus(changeRow.getGUIIndex());
			}
		}
	}
	/**
	 * 渡されたリストの中で最小のインデックスを返す。
	 * （統合された部門を復活させる際のレコードの追加場所）
	 */
	protected int getMinGuiIndex(MCList<DtlR> l) {
		int i = -1;
		for (DtlR r : l) {
			if (i < 0 || r.getGUIIndex() < i) {
				i = r.getGUIIndex();
			}
		}
		return i;
	}
	/**
	 * 上位部門を探す。
	 * （統合された部門を復活させる際の上位部門の設定）
	 */
	protected void setUpLvDpt2(DtlR r2) {
		if (getDtl2L().getFirst("dpt_cd", r2.up_lv_dpt_cd()) != null) {
			return ;
		}
		DtlR r1 = getDtlL().getFirst("dpt_cd", r2.up_lv_dpt_cd());
		if (isNull(r1) || isNull(r1.new_dpt_cd())) {
			r2.up_lv_dpt_cd(null);
			r2.up_lv_dpt_nm(null);
		}
		else {
			r2.up_lv_dpt_cd(r1.new_dpt_cd());
			DtlR newR = getDtl2L().getFirst("dpt_cd", r1.new_dpt_cd());
			if (!isNull(newR)) {
				r2.up_lv_dpt_nm(newR.dpt_nm());
			}
		}
	}

	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!r.ar_flg()) {
			setValueEx(columnDtl_ar_dpt_flg, idx, false);
		}
		if (!r.ap_flg()) {
			setValueEx(columnDtl_ap_dpt_flg, idx, false);
		}
		if (!r.sls_flg()) {
			setValueEx(columnDtl_sls_dpt_flg, idx, false);
		}
		if (!r.purc_flg()) {
			setValueEx(columnDtl_purc_dpt_flg, idx, false);
		}
		if (!r.lg_flg() && !r.mfg_flg()) {
			setValueEx(columnDtl_ship_dpt_flg, idx, false);
			setValueEx(columnDtl_arr_dpt_flg, idx, false);
		}
		if (!r.mfg_flg()) {
			setValueEx(columnDtl_mfg_dpt_flg, idx, false);
		}
		if (!r.sd_flg()) {
			setValueEx(columnDtl_sd_dpt_flg, idx, false);
		}
	}

	@Override
	public void doDtl2_wg_cd_LC(MCEventInfo info) {
		super.doDtl2_wg_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtl2L().get(idx);
		if (!r.ar_flg()) {
			setValueEx(columnDtl2_ar_dpt_flg, idx, false);
		}
		if (!r.ap_flg()) {
			setValueEx(columnDtl2_ap_dpt_flg, idx, false);
		}
		if (!r.sls_flg()) {
			setValueEx(columnDtl2_sls_dpt_flg, idx, false);
		}
		if (!r.purc_flg()) {
			setValueEx(columnDtl2_purc_dpt_flg, idx, false);
		}
		if (!r.lg_flg() && !r.mfg_flg()) {
			setValueEx(columnDtl2_ship_dpt_flg, idx, false);
			setValueEx(columnDtl2_arr_dpt_flg, idx, false);
		}
		if (!r.mfg_flg()) {
			setValueEx(columnDtl2_mfg_dpt_flg, idx, false);
		}
		if (!r.sd_flg()) {
			setValueEx(columnDtl2_sd_dpt_flg, idx, false);
		}
	}

	@Override
	public boolean doDtl2_dpt_cd_VC(MCEventInfo info) {
		DtlR r = getDtl2L().get(info.getEventIndex());
		// 新規追加部門の場合、上位部門と同じ部門は不可（既存部門はの場合は部門統合なのでＯＫ）
		if (isNull(r.org_dpt_cd()) && isSame(info.getNewValue(), r.up_lv_dpt_cd())) {
			return false;
		}
		// 部門は一意
		for (DtlR row : getDtl2L()) {
			if (!isSame(r.getGUIIndex(), row.getGUIIndex()) && isSame(info.getNewValue(), row.dpt_cd())) {
				return false;
			}
		}
		return super.doDtl2_dpt_cd_VC(info);
	}
	@Override
	public void doDtl2_dpt_cd_LC(MCEventInfo info) {
		super.doDtl2_dpt_cd_LC(info);

		int eventIdx = info.getEventIndex();

		viewTreeWithoutListSort(Tree2Tree, Dtl2Table);

		Dtl2Table.selectRow(eventIdx);

		String _defWgCd = getSysParm("DEF_WG_CD") ;
		if (!isNull(_defWgCd)) {
			setValueEx(columnDtl2_wg_cd, eventIdx, _defWgCd);
		}

		setButtonMode();
	}
	@Override
	public void doDtl2_dpt_nm_LC(MCEventInfo info) {
		super.doDtl2_dpt_nm_LC(info);
		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(Tree2Tree, Dtl2Table);
		Dtl2Table.selectRow(eventIdx);
		setButtonMode();
	}

	/**
	 * ボタンのモード制御
	 */
	protected void setButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r) && !r.del_flg()) {
			setDefaultMode(Btn1_del_dpt);
		}
		else {
			Btn1_del_dpt.setMode(MCMode.DISABLE);
		}
		if (!isNull(r) && r.del_flg()) {
			setDefaultMode(Btn1_can_del);
		}
		else {
			Btn1_can_del.setMode(MCMode.DISABLE);
		}

		DtlR r2 = Dtl2Table.getSelectedMCRow();
		if (!isNull(r2) && !r2.del_flg()) {
			setDefaultMode(Btn2_del_dpt);
		}
		else {
			Btn2_del_dpt.setMode(MCMode.DISABLE);
		}
		if (!isNull(r2) && r2.del_flg()) {
			setDefaultMode(Btn2_can_del);
		}
		else {
			Btn2_can_del.setMode(MCMode.DISABLE);
		}
		if (checkNotSet(DtlTable)) {
			Btn1_add_top.setMode(MCMode.DISABLE);
			Btn1_add_sub.setMode(MCMode.DISABLE);
			Btn1_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn1_add_top);
			if (!isNull(r) && !isNull(r.dpt_cd()) && !isNull(r.dpt_nm()) && !r.del_flg()) {
				setDefaultMode(Btn1_add_sub);
			}
			else {
				Btn1_add_sub.setMode(MCMode.DISABLE);
			}
			if (!isNull(r)) {
				setDefaultMode(Btn1_rcopy);
			}
			else {
				Btn1_rcopy.setMode(MCMode.DISABLE);
			}
		}
		if (checkNotSet(Dtl2Table)) {
			Btn2_add_top.setMode(MCMode.DISABLE);
			Btn2_add_sub.setMode(MCMode.DISABLE);
			Btn2_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn2_add_top);
			if (!isNull(r2) && !isNull(r2.dpt_cd()) && !isNull(r2.dpt_nm()) && !r2.del_flg()) {
				setDefaultMode(Btn2_add_sub);
			}
			else {
				Btn2_add_sub.setMode(MCMode.DISABLE);
			}
			if (!isNull(r2)) {
				setDefaultMode(Btn2_rcopy);
			}
			else {
				Btn2_rcopy.setMode(MCMode.DISABLE);
			}
		}
	}
	protected boolean checkNotSet(MCTable table) {
		if (table == DtlTable) {
			for (DtlR r : getDtlL()) {
				if (isNull(r.dpt_cd())) {
					return true;
				}
			}
		}
		else {
			for (DtlR r : getDtl2L()) {
				if (isNull(r.dpt_cd())) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected boolean _dropFlg = false;

	protected void viewList(MCTree tree, MCTable tab) {
		if (!chkDrop(tree)) {
			return;
		}
		TreeModel model = tree.getModel();
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
		Enumeration e = root.preorderEnumeration();

		MCList<MCRow> listL = tab.getList().createInstance();
		MCList<MCRow> treeL = tree.getList().createInstance();
		
		while (e.hasMoreElements()) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.nextElement();
			if (node.getUserObject() instanceof Tree1R) {
				Tree1R treeR = (Tree1R) node.getUserObject();
				treeL.add(treeR);

				TreeAndTableMap map = (tab == DtlTable) ? getTreeAndTableMap1() : getTreeAndTableMap2();
				DtlR dtlR = (DtlR)map.get(treeR);

				DefaultMutableTreeNode pNode = (DefaultMutableTreeNode) node.getParent();
				if (pNode.getUserObject() instanceof Tree1R) {
					Tree1R pR = (Tree1R) pNode.getUserObject();
					// 上位が変更された場合のみ書き換え、ステータス変更
					if (!isSame(dtlR.up_lv_dpt_cd(), pR.dpt_cd())) {
						dtlR.up_lv_dpt_cd(pR.dpt_cd());
						dtlR.up_lv_dpt_nm(pR.dpt_nm());
						if (dtlR.isStatusNone()) {
							dtlR.setStatus(MCRow.MODIFY);
						}
					}
				}
				listL.add(dtlR);
			}
		}

		// treeに表示できていないMCRowを維持する。
		tab.getList().removeAll(listL);
		tab.getList().addAll(listL);

		if (tree == Tree1Tree) {
			getTreeAndTableMap1().set(listL, treeL);
		}
		else {
			getTreeAndTableMap2().set(listL, treeL);
		}
	}
	protected boolean chkDrop(MCTree tree) {
		if (_dropFlg) {
			_dropFlg = false;
			return true;
		}
		return false;
	}
	protected boolean canDragAndDrop(MCTree tree) {
		if (tree == Tree1Tree) {
			return isSame(getStatus(), UPD) || isSame(getStatus(), UPD_ADMIN) || isSame(getStatus(), MOD);
		}
		else {
			return isSame(getStatus(), CNG);
		}
	}
	/**
	 * ノードに対応するレコードを取得し、論理削除フラグがオンときfalseを返す（ドラッグさせない）
	 */
	protected boolean notDelDpt(MCTree tree, MCTreeNode treeNode) {
		if (tree == Tree1Tree) {
			MCRow r = getTreeAndTableMap1().get((MCRow)treeNode.getUserObject());
			if (r != null && r.getBoolean(DtlR.$del_flg)) {
				return false;
			}
		}
		else {
			MCRow r = getTreeAndTableMap2().get((MCRow)treeNode.getUserObject());
			if (r != null && r.getBoolean(DtlR.$del_flg)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Treeを表示します。
	 */
	protected void viewTree(MCTree tre, MCTable tab) {
		MCList<MCRow> a = tre.getList();
		MCList<MCRow> b = getTreeSrc(tab.getList());
		setTree(a, b, tab);
		
		treeMapUpdate(a, b, tab);

		tre.expandAll();

		// ツリーにの並び順に合わせてリストを再表示
		setDropFlgTrue();
		viewList(tre, tab);
	}
	protected void treeMapUpdate(MCList<MCRow> treeL, MCList<MCRow> tabL, MCTable tab) {
		if (tab == DtlTable) {
			getTreeAndTableMap1().set(treeL, tabL);
		}
		else {
			getTreeAndTableMap2().set(treeL, tabL);
		}
	}
	protected void treeMapUpdate(MCTable tab) {
		if (tab == DtlTable) {
			getTreeAndTableMap1().set(Tree1Tree.getList(), DtlTable.getList());
		}
		else {
			getTreeAndTableMap2().set(Tree2Tree.getList(), Dtl2Table.getList());
		}
	}

	/**
	 * Treeに表示する元のリストを返します。
	 */
	protected MCList<MCRow> getTreeSrc(MCList<MCRow> l) {
		MCList<MCRow> m = MCList.create(MCRow.class);
		for (MCRow r : l) {
			if (!r.isEmpty() && !isNull(r.getStringNE("dpt_cd"))) {
				m.add(r);
			}
		}
		return m;
	}

	/**
	 * Treeに設定します。
	 */
	protected void setTree(MCList<MCRow> treeL, MCList<MCRow> tabL, MCTable table) {

		MCList<MCRow> tmp = treeL.createInstance();

		for (MCRow r : tabL) {
			MCRow treeR = treeL.createRow();
			if (isNull(r.getStringNE("dpt_cd"))) {
				continue;
			}
			treeR.setValuesByName(r);
			treeR.setStringNE("tree_dpt_cd", (r.getStringNE("dpt_cd")));
			treeR.setStringNE("tree_up_lv_dpt_cd", (r.getStringNE("up_lv_dpt_cd")));
			if (table == DtlTable) {
				treeR.setStringNE("tree_row_label",
						createNodeLabel(r.getGUIIndex(), columnDtl_dpt_cd, columnDtl_dpt_nm));
			}
			else {
				treeR.setStringNE("tree_row_label",
						createNodeLabel(r.getGUIIndex(), columnDtl2_dpt_cd, columnDtl2_dpt_nm));
			}
			treeR.setAttributes(r);
			tmp.add(treeR);
		}
		treeL.setAll(tmp);
	}

	protected void delRec(MCTable table) {
		MCRow r = table.getSelectedMCRow();
		if (isNull(r.getValueNE(getUpdCntrColumn()))) {
			if (isExistsSubDpt(r, table)) {
				throw new MCException(MABCP0003);
			}
			int idx = r.getGUIIndex();
			_noEvent = true; // 行削除後にフォーカス移動のイベントでイベントが走らないように設定
			deleteRow(table);
			_noEvent = false;
			if (table.getList().size()-1 < idx) {
				idx = table.getList().size()- 1;
			}
			table.selectRowNoFocus(idx);
		}
		else {
			if (isExistsSubDpt(r, table, false)) {
				throw new MCException(MABCP0004);
			}
			r.setBooleanNE(DtlR.$del_flg, true);
			r.setStatus(MCRow.MODIFY);
			treeMapUpdate(table);
		}
		setButtonMode();
	}
	/**
	 * 下位部門が存在すればtrueを返す。
	 */
	protected boolean isExistsSubDpt(MCRow row, MCTable table) {
		return !isNull(getSubDptRow(row, table));
	}
	/**
	 * 論理削除ＦＬＧが引数で指定したBOOL値の下位部門が存在すればtrueを返す。
	 */
	protected boolean isExistsSubDpt(MCRow row, MCTable table, boolean delFlg) {
		String dptCd = row.getStringNE(DtlR.$dpt_cd);
		if (isNull(dptCd)) {
			return false;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$up_lv_dpt_cd, DtlR.$del_flg);
		return table.getList().getFirst(key, dptCd, delFlg) != null;
		
	}
	/**
	 * 下位部門のレコードを返す。
	 */
	protected MCRow getSubDptRow(MCRow row, MCTable table) {
		String dptCd = row.getStringNE(DtlR.$dpt_cd);
		if (isNull(dptCd)) {
			return null;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$up_lv_dpt_cd);
		return table.getList().getFirst(key, dptCd);
	}
	/**
	 * 上位部門のレコードを返す。
	 */
	protected MCRow getUpRecRow(MCRow row, MCTable table) {
		String cd = row.getStringNE(DtlR.$up_lv_dpt_cd);
		if (isNull(cd)) {
			return null;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$dpt_cd);
		return table.getList().getFirst(key, cd);
	}
	/**
	 * 上位部門のレコードの選択がオンのとき、下位部門のレコードの選択をオンにする。
	 */
	protected void setSubCheckOn(DtlR row, MCTable table) {
		if (row.check()) {
			for (DtlR subR : getSubList(row, table)) {
				if (!subR.check()) {
					subR.check(true);
					setSubCheckOn(subR, table);
				}
			}
		}
	}
	/**
	 * 下位部門のリストを返す。
	 */
	protected MCList<DtlR> getSubList(MCRow row, MCTable table) {
		String cd = row.getStringNE(DtlR.$dpt_cd);
		MCIndexKey key = table.getList().createIndex(DtlR.$up_lv_dpt_cd);
		MCList<DtlR> subL = getDtlL().subList(key, cd);
		return subL;
	}

	protected void canDel(MCTable table) {
		MCRow r = table.getSelectedMCRow();
		if (isNull(r)) {
			return ;
		}
		if (!isNull(r.getStringNE(DtlR.$up_lv_dpt_cd))) {
			MCIndexKey key = table.getList().createIndex(DtlR.$dpt_cd);
			MCRow row = table.getList().getFirst(key, r.getStringNE(DtlR.$up_lv_dpt_cd));

			if (!isNull(row) && row.getBooleanNE(DtlR.$del_flg)) {
				throw new MCException(MABCP0005);
			}
		}

		r.setBooleanNE(DtlR.$del_flg, false);

		if (r.isStatusNone()) {
			r.setStatus(MCRow.MODIFY);
		}
		treeMapUpdate(table);

		setButtonMode();
	}

	@Override
	public boolean doDtl_check_VC(MCEventInfo info) {
		if (!_noEvent) {
			DtlR r = getDtlL().get(info.getEventIndex());
			MCRow upR = getUpRecRow(r, DtlTable);
			if (!isNull(upR)) {
				if (upR.getBoolean(DtlR.$check)) {
					return false;
				}
			}
		}
		return super.doDtl_check_VC(info);
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info){
		if (!_noEvent) {
			super.doDtl_check_NC(info);
			DtlR r = getDtlL().get(info.getEventIndex());
			setSubCheckOn(r, DtlTable);
		}
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		DtlTable.setCellConfig(createDtlConf());
		Dtl2Table.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf();
	}

	public class DtlConf extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (table.getBaseTable() == DtlTable) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (getStatus() == MOD && !isNull(r.upd_cntr())) {
					if ((column == columnDtl_wg_cd && !isNull(r.org_wg_cd()))
							|| (column == columnDtl_asst_dpt_flg && r.org_asst_dpt_flg())
							|| (column == columnDtl_ar_dpt_flg && r.org_ar_dpt_flg())
							|| (column == columnDtl_ap_dpt_flg && r.org_ap_dpt_flg())
							|| (column == columnDtl_sls_dpt_flg && r.org_sls_dpt_flg())
							|| (column == columnDtl_purc_dpt_flg && r.org_purc_dpt_flg())
							|| (column == columnDtl_ship_dpt_flg && r.org_ship_dpt_flg())
							|| (column == columnDtl_arr_dpt_flg && r.org_arr_dpt_flg())
							|| (column == columnDtl_mfg_dpt_flg && r.org_mfg_dpt_flg())
							|| (column == columnDtl_sd_dpt_flg && r.org_sd_dpt_flg())
							|| (column == columnDtl_insp_dpt_flg && r.org_insp_dpt_flg())
							|| (column == columnDtl_bd_dpt_flg && r.org_bd_dpt_flg())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_dpt_cd) {
					if (isExistsSubDpt(r, table)) {
						return MCMode.READ_ONLY;
					}
					if ((isModOpe() || isUpdAdminOpe()) && !isNull(r.upd_cntr())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_set_addr) {
					if (!isNull(r.addr1())) {
						return MCMode.DISABLE;
					}
				}
				if (column == columnDtl_ar_dpt_flg) {
					if (!r.ar_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_ap_dpt_flg) {
					if (!r.ap_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_sls_dpt_flg) {
					if (!r.sls_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_purc_dpt_flg) {
					if (!r.purc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_ship_dpt_flg || column == columnDtl_arr_dpt_flg) {
					if (!r.lg_flg() && !r.mfg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_mfg_dpt_flg) {
					if (!r.mfg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_sd_dpt_flg) {
					if (!r.sd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (table.getBaseTable() == Dtl2Table) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl2_dpt_cd) {
					if (!isNull(r.org_dpt_cd())) {
						return MCMode.READ_ONLY;
					}
					if (isExistsSubDpt(r, table)) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_set_addr) {
					if (!isNull(r.addr1())) {
						return MCMode.DISABLE;
					}
				}
				if (column == columnDtl2_ar_dpt_flg) {
					if (!r.ar_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_ap_dpt_flg) {
					if (!r.ap_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_sls_dpt_flg) {
					if (!r.sls_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_purc_dpt_flg) {
					if (!r.purc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_ship_dpt_flg || column == columnDtl2_arr_dpt_flg) {
					if (!r.lg_flg() && !r.mfg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_mfg_dpt_flg) {
					if (!r.mfg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl2_sd_dpt_flg) {
					if (!r.sd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		@Override
		protected String getButtonColumnValue(int index, MCColumnConfig column,
				MCTable<?> table, boolean selected) {
			if (table.getBaseTable() == DtlTable) {
				if (column == columnDtl_set_addr) {
					return columnDtl_set_addr.getLabelByLocale();
				}
			}
			else if (table.getBaseTable() == Dtl2Table) {
				if (column == columnDtl2_set_addr) {
					return columnDtl2_set_addr.getLabelByLocale();
				}
			}
			return super.getButtonColumnValue(index, column, table, selected);
		}
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		((MCTree64)Tree1Tree).delegate64 = getTree1Delegate();
		((MCTree64)Tree2Tree).delegate64 = getTree2Delegate();
		
		DtlTable.setHSyncTables(Dtl2Table);
		DtlTable.setHSyncTable(false);

		setDividerPos(Dpt1Panel, 1);
	}

	protected static MCTree64Delegate getTree1Delegate() {
		// 別ファイル（MCTree64AppDelegate.java）で定義
		return new MCTree64AppDelegate();
	}

	protected static MCTree64Delegate getTree2Delegate() {
		// 別ファイル（MCTree64AppDelegate.java）で定義
		return new MCTree64AppDelegate();
	}

	@Override
	public void doBtn2_sync_flg_NC(MCEventInfo info) {
		super.doBtn2_sync_flg_NC(info);

		DtlTable.setHSyncTable(getBtn2R().sync_flg());
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_DPT));
	}
	@Override
	public MCList getDtl_up_lv_dpt_cd(MCRow row, MCEventInfo info){
		MCList<DtlR> l = getDtlL();
		MCList<DtlR> nl = l.subList(r -> !isNull(r.dpt_cd()));
		nl.sort(DtlR.$dpt_cd);
		return nl;
	}

	@Override
	public MCList getDtl2_up_lv_dpt_cd(MCRow row, MCEventInfo info){
		MCList<DtlR> l = getDtl2L();
		MCList<DtlR> nl = l.subList(r -> !isNull(r.dpt_cd()));
		nl.sort(DtlR.$dpt_cd);
		return nl;
	}

	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_up_lv_dpt_cd.setListVisibleColumn(DtlR.$dpt_cd, DtlR.$dpt_nm);
		getDtl_up_lv_dpt_cd_ListPutter().setColumns(DtlR.$dpt_cd, DtlR.$dpt_nm);
		
		columnDtl2_up_lv_dpt_cd.setListVisibleColumn(DtlR.$dpt_cd, DtlR.$dpt_nm);
		getDtl2_up_lv_dpt_cd_ListPutter().setColumns(DtlR.$dpt_cd, DtlR.$dpt_nm);
		
	}

	/**
	 * Tableの情報を元にTreeを表示します。Tableのリストをツリーの並びと合わせる処理は実行しません。
	 */
	protected void viewTreeWithoutListSort(MCTree tre, MCTable tab) {
		MCList<MCRow> a = tre.getList();
		MCList<MCRow> b = getTreeSrc(tab.getList());
		setTree(a, b, tab);
		
		treeMapUpdate(a, b, tab);

		tre.expandAll();
		
		selectRowNoFocus(tab.getMCSelectedRow(), true, tab, tre);
	}

	@Override
	public void doDtl_up_lv_dpt_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_up_lv_dpt_cd_LC(info);
		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(Tree1Tree, DtlTable);
		DtlTable.selectRow(eventIdx);
		setButtonMode();
	}

	@Override
	public void doDtl2_up_lv_dpt_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl2_up_lv_dpt_cd_LC(info);
		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(Tree2Tree, Dtl2Table);
		Dtl2Table.selectRow(eventIdx);
		setButtonMode();
	}

	/**
	 * 無限ループかどうかを判定します。<p>
	 * 
	 * @param changeRow 変更対象の行
	 * @param newCd 変更対象の変更後コード
	 * @param newUpCd 変更対象の変更後上位コード
	 * @param changeList 変更対象のリスト
	 * @return 無限ループの場合はtrue。それ以外はfalse。
	 */
	protected boolean hasInfinitLoop(DtlR changeRow, String newCd, String newUpCd, MCList<DtlR> changeList) {

		// 同一レコードでのループ
		if (isSame(newCd, newUpCd)) {
			return true;
		}
		
		MCList<DtlR> l = changeList.shallowClone();
		l.remove(changeRow);

		HashSet<String> upCds = new HashSet<>();
		upCds.add(newCd);
		
		// 上位が引数newCdと一致する場合は無限ループとみなす
		MCIndexKey getUpCdKey = l.createIndex(DtlR.$dpt_cd);
		DtlR up = l.getFirst(getUpCdKey, newUpCd);
		while(up != null) {
			String up_cd = up.up_lv_dpt_cd();
			if (isNull(up_cd)) {
				break;
			}
			
			if (upCds.contains(up_cd)) {
				return true;
			}
			
			upCds.add(up_cd);
			
			up = l.getFirst(getUpCdKey, up_cd);
		}
		return false;
	}

	@Override
	public boolean doDtl_up_lv_dpt_cd_VC(MCEventInfo info) {
		MCList<DtlR> l = getDtlL();
		DtlR r = l.get(info.getEventIndex());

		if (!isNull(info.getNewValue())) {
			// 無限ループは不可
			if (hasInfinitLoop(r, r.dpt_cd(), (String)info.getNewValue(), l)) {
				return false;
			}
		}
		return super.doDtl_up_lv_dpt_cd_VC(info);
	}

	@Override
	public boolean doDtl2_up_lv_dpt_cd_VC(MCEventInfo info) {
		MCList<DtlR> l = getDtl2L();
		DtlR r = l.get(info.getEventIndex());

		if (!isNull(info.getNewValue())) {
			// 無限ループは不可
			if (hasInfinitLoop(r, r.dpt_cd(), (String)info.getNewValue(), l)) {
				return false;
			}
		}
		return super.doDtl2_up_lv_dpt_cd_VC(info);
	}

}