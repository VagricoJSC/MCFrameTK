package mcframe.clientMABS.MABSP0030;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5250.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListType;

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_BomLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_BomLst_MC extends MABSP_BomLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_BomLst_MC() {
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
	public MABSP_BomLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[RPnl]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MA_MABSL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Srch01Caller<P extends MABSP_BomLst, B extends MA_MABSL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));

			// 切替時用のチェック
			if (Cnd_ope_CHNG.isSelected()) {
				msgList.addAll(checkBeforeAfter(Cnd_chng_st_dt, Cnd_chng_end_dt));
				if (MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
					msgList.addAll(checkAtLeastOneInput(Cnd_old_itm_cd, Cnd_old_alt_grp_cd));
					msgList.addAll(checkAtLeastOneInput(Cnd_new_itm_cd, Cnd_new_alt_grp_cd));
				}
				if (!isNullOr(getCndR().old_itm_cd(), getCndR().new_itm_cd())) {
					if(isSame(getCndR().old_itm_cd(), getCndR().new_itm_cd()) 
					&& isSame(getCndR().old_itm_sub1(), getCndR().new_itm_sub1()) 
					&& isSame(getCndR().old_itm_sub2(), getCndR().new_itm_sub2()) 
					&& isSame(getCndR().old_itm_sub3(), getCndR().new_itm_sub3())
					&& isSame(getCndR().old_ver_no(), getCndR().new_ver_no())) {
						msgList.add(new MCMessage(MABSP0003));
					}
				}
				if (!isNullOr(getCndR().old_alt_grp_cd(), getCndR().new_alt_grp_cd())) {
					if (isSame(getCndR().old_alt_grp_cd(), getCndR().new_alt_grp_cd())) {
						msgList.add(new MCMessage(MABSP0004));
					}
				}
			}
		}

		@Override
		protected void show() {
			super.show();

			if (Cnd_ope_CHNG.isSelected()) {
				getDtlL().setBoolean(DtlR.$check, true);
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);

			if (Cnd_ope_CHNG.isSelected()) {
				if (getCndR().wg_flg()) {
					Btn_upd_wg.setMode(MCMode.ENABLE);
				}
				else {
					Btn_upd_cmn.setMode(MCMode.ENABLE);
				}
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}

		@Override
		protected void sort() {
			if (!Cnd_ope_CHNG.isSelected()) {
				super.sort();
			}
		}
	}

	/**
	 * [MA_MABSL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Upd01Caller<P extends MABSP_BomLst, B extends MA_MABSL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void checkStEndDtValid(MCMessageList list) {
			// 何もしない
		}
	}

	/**
	 * [MA_MABSL0030_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Del01Caller<P extends MABSP_BomLst, B extends MA_MABSL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0030_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0030_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[upd_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_upd_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	/**
	 * Panel[Btn]のボタン[open_MABSP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0020(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0020");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0020CndR(aso, row));
		aso.show();
	}
	/**
	 * 遷移先[MABSP0020]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP0020.CndR crtOpenMABSP0020CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0020.CndR to = mcframe.clientMABS.MABSP0020.CndR.create();
		mcframe.clientMABS.MABSP0020.MABSP_BomReg p = (mcframe.clientMABS.MABSP0020.MABSP_BomReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.par_itm_cd(r.par_itm_cd());
		to.par_itm_sub1(r.par_itm_sub1());
		to.par_itm_sub2(r.par_itm_sub2());
		to.par_itm_sub3(r.par_itm_sub3());
		to.bom_ptn(r.bom_ptn());
		if (isNullOrNullVal(r.wg_cd())) {
			to.wg_flg(false);
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		if (!isNullOr(r.par_itm_nm(),r.bom_ptn())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0040(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0040CndR(aso, row));
		aso.show();
	}
	/**
	 * 遷移先[MABSP0040]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP0040.CndR crtOpenMABSP0040CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0040.CndR to = mcframe.clientMABS.MABSP0040.CndR.create();
		mcframe.clientMABS.MABSP0040.MABSP_BomExSrch p = (mcframe.clientMABS.MABSP0040.MABSP_BomExSrch) aso.getPanel();
		to.ope(p.Cnd_ope_EX1.getActionCommand());
		to.itm_cd(r.par_itm_cd());
		to.itm_sub1(r.par_itm_sub1());
		to.itm_sub2(r.par_itm_sub2());
		to.itm_sub3(r.par_itm_sub3());
		to.bom_ptn(r.bom_ptn());
		if (!isNullOrNullVal(r.wg_cd())) {
			to.wg_cd(r.wg_cd());
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0080(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0080CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABSP0080]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP0080.CndR crtOpenMABSP0080CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0080.CndR to = mcframe.clientMABS.MABSP0080.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		to.alt_grp_cd(r.alt_grp_cd());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);
		if (isNull(dtlR)) return;
		int idx = dtlR.getGUIIndex();
		
		setValueEx(columnDtl_bom_key, idx, null);
		setValueEx(columnDtl_chng_no, idx, null);
		setValueEx(columnDtl_ext_sys_no_bom, idx, null);
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0030_Del01();
	}


	//-------------------- 入力補助引数編集  --------------------//
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == Cnd_old_itm_cd || beans == Cnd_new_itm_cd) {
			if (MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
				row.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.COMM.value());
			} else {
				row.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
			}
		}
		return row;
	}

	//-------------------- 初期化ここから --------------------//

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Dtl_par_itm_p_PPanel.addItmLCListner(this);
		Dtl_chd_itm_p_PPanel.addItmLCListner(this);

		Cnd_old_itm_nm.addLCListener(this);
		Cnd_new_itm_nm.addLCListener(this);
		
		columnDtl_chd_inpt_qty.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Dtl_par_itm_p_PPanel.isItm(lc)) {
			doDtl_par_itm_cd_LC(info);
		}
		else if (Dtl_chd_itm_p_PPanel.isItm(lc)) {
			doDtl_chd_itm_cd_LC(info);
		}
		
		if (lc == Cnd_old_itm_nm) {
			doCnd_old_itm_cd_LC(info);
		}
		else if (lc == Cnd_new_itm_nm) {
			doCnd_new_itm_cd_LC(info);
		}
		else if (lc == columnDtl_chd_inpt_qty) {
			doDtl_chd_inpt_qty_LC(info);
		}
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.moveColumns(columnDtl_min_sno1, columnDtl_max_sno1, 
							columnDtl_min_sno2, columnDtl_max_sno2
							, columnDtl_min_sno3, columnDtl_max_sno3);
	}

	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlTable.removeSortColumn(columnDtl_bom_key);
		DtlTable.addSortColumn(columnDtl_wg_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_typ, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_typ_d_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub1, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub2, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub3, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_bom_ptn, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_oper_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_oper_seq, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_disp_seq, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_alt_grp_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_typ, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_typ_d_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub1, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub2, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub3, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_st_dt, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_end_dt, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_bom_key, MCList.SortType.ASC);
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Cnd_old_ver_no_p_PPanel.setRelateBeans(Cnd_old_itm_cd, Cnd_old_itm_sub1, Cnd_old_itm_sub2, Cnd_old_itm_sub3, null, null);
		Cnd_new_ver_no_p_PPanel.setRelateBeans(Cnd_new_itm_cd, Cnd_new_itm_sub1, Cnd_new_itm_sub2, Cnd_new_itm_sub3, null, null);

		Dtl_qty1_p_PPanel.setRelateBeans(columnDtl_par_base_unit_cd, columnDtl_par_dec_place);
		Dtl_qty2_p_PPanel.setRelateBeans(columnDtl_chd_base_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty3_p_PPanel.setRelateBeans(columnDtl_chd_base_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty4_p_PPanel.setRelateBeans(columnDtl_chd_base_unit_cd, columnDtl_chd_dec_place);
		Dtl_min_sno_p_PPanel.setRelateBeans(columnDtl_par_itm_cd, columnDtl_par_itm_sub1, columnDtl_par_itm_sub2, columnDtl_par_itm_sub3, columnDtl_par_sno1_mng_typ, columnDtl_par_sno2_mng_typ, columnDtl_par_sno3_mng_typ, columnDtl_par_sno4_mng_typ);
		Dtl_max_sno_p_PPanel.setRelateBeans(columnDtl_par_itm_cd, columnDtl_par_itm_sub1, columnDtl_par_itm_sub2, columnDtl_par_itm_sub3, columnDtl_par_sno1_mng_typ, columnDtl_par_sno2_mng_typ, columnDtl_par_sno3_mng_typ, columnDtl_par_sno4_mng_typ);
	}

	//-------------------- 初期化ここまで --------------------//	

	//-------------------- ステータスここから --------------------//
	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_CHNG.isSelected()) {
			getDtlTable().setStatusColumnVisible(true);
			setCHNGStatus();
		}
		else {
			super.setStatusByOpe();
		}
		setTabMode();
		setRegTgtMode();
		setTab4PanelMode();
		setModeByRegTgt();
		
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}

	protected void setTabMode() {
		CndTabTab.setEnabledAt(CndTabTab.indexOfComponent(Tab1Panel), !Cnd_ope_CHNG.isSelected());
		CndTabTab.setEnabledAt(CndTabTab.indexOfComponent(Tab2Panel), !Cnd_ope_CHNG.isSelected());
		CndTabTab.setEnabledAt(CndTabTab.indexOfComponent(Tab3Panel), !Cnd_ope_CHNG.isSelected());
		CndTabTab.setEnabledAt(CndTabTab.indexOfComponent(Tab4Panel), Cnd_ope_CHNG.isSelected());

		// 表示中のタブが非表示になったら別のタブに切り替える
		if (!CndTabTab.isEnabledAt(CndTabTab.getSelectedIndex())) {
			for (int i=0; i < CndTabTab.getTabCount(); i++) {
				if (CndTabTab.isEnabledAt(i)) {
					CndTabTab.setSelectedIndex(i);
					break;
				}
			}
		}
	}

	protected void setTab4PanelMode() {
		if (!Cnd_ope_CHNG.isSelected()){
			return ;
		}
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			setDefaultMode(Cnd_old_itm_cd);
			setDefaultMode(Cnd_old_ver_no);
			setDefaultMode(Cnd_old_alt_grp_cd);
			setDefaultMode(Cnd_new_itm_cd);
			setDefaultMode(Cnd_new_ver_no);
			setDefaultMode(Cnd_new_alt_grp_cd);

			if (!isNull(getCndR().old_itm_cd())) {
				setValueEx(Cnd_old_alt_grp_cd, null);
				Cnd_old_alt_grp_cd.setMode(MCMode.READ_ONLY);
			}
			if (!isNull(getCndR().old_alt_grp_cd())) {
				Cnd_old_itm_cd.setMode(MCMode.READ_ONLY);
				Cnd_old_ver_no.setMode(MCMode.READ_ONLY);
			}
			if (!isNull(getCndR().new_itm_cd())) {
				setValueEx(Cnd_new_alt_grp_cd, null);
				Cnd_new_alt_grp_cd.setMode(MCMode.READ_ONLY);
			}
			if (!isNull(getCndR().new_alt_grp_cd())) {
				Cnd_new_itm_cd.setMode(MCMode.READ_ONLY);
				Cnd_new_ver_no.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			Cnd_old_itm_cd.setMode(MCMode.REQUIRED);
			Cnd_old_ver_no.setMode(MCMode.ENABLE);
			Cnd_old_alt_grp_cd.setMode(MCMode.READ_ONLY);
			Cnd_new_itm_cd.setMode(MCMode.REQUIRED);
			Cnd_new_ver_no.setMode(MCMode.ENABLE);
			Cnd_new_alt_grp_cd.setMode(MCMode.REQUIRED);
			setValueEx(Cnd_old_alt_grp_cd, null);
		}
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_chng_wg_cd);
			if (MAC_STR.isNULL_VAL(getCndR().chng_wg_cd())) {
				setValueEx(Cnd_chng_wg_cd, null);
			}
		}
		else {
			Cnd_chng_wg_cd.setMode(MCMode.READ_ONLY);
			getCndR().chng_wg_cd(MAC_STR.NULL_VAL.value());
			getCndR().chng_wg_nm(null);
		}
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setTabMode();
		setRegTgtMode();
		setBtnMode();
	}

	protected void setRegTgtMode() {
		if (RPnl_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (RPnl_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null || !r.alt_itm_flg()) {
			Btn_open_MABSP0080.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MABSP0080.setMode(MCMode.ENABLE);
		}
	}
	//-------------------- ステータスここまで --------------------//

	//-------------------- イベントここから --------------------//
	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック：ＢＯＭマスタ登録へ画面遷移
	 */
	public void doDtl_DC(MCEventInfo info) {
		doBtn_open_MABSP0020(info);
	}

	protected void doDtl_par_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bom_ptn())) {
			setValueEx(columnDtl_bom_ptn, idx, r.par_def_bom_ptn());
		}
	}

	protected void doDtl_chd_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.chd_itm_typ())) {
			setValueEx(columnDtl_ph_flg, idx, false);
			setValueEx(columnDtl_bkf_typ, idx, null);
			setValueEx(columnDtl_inpt_ctl_typ, idx, null);
			if (!isNull(r.alt_grp_cd())){
				setValueEx(columnDtl_alt_grp_cd, idx, null);
			}
		}
		else {
			setValueEx(columnDtl_alt_itm_flg, idx, false);
			
			if (!isNull(r.par_dec_place()) && isNull(r.par_inst_qty())){
				setValueEx(columnDtl_par_inst_qty, idx, MCNumber.ONE);
			}
			if (!isNull(r.chd_dec_place()) && isNull(r.fxd_chd_rqmt_qty())){
				setValueEx(columnDtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
		}
		if (r.ph_flg() && isNull(r.ph_bom_ptn())) {
			setValueEx(columnDtl_ph_bom_ptn, idx, r.chd_def_bom_ptn());
		}

		if (!r.ph_flg()) {
			setSnoTyp(r.chd_sno1_mng_typ(), idx, columnDtl_sno_typ1);
			setSnoTyp(r.chd_sno2_mng_typ(), idx, columnDtl_sno_typ2);
			setSnoTyp(r.chd_sno3_mng_typ(), idx, columnDtl_sno_typ3);
			setSnoTyp(r.chd_sno4_mng_typ(), idx, columnDtl_sno_typ4);
		}

		if (isNull(r.lot_mng_typ()) 
		 || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			setValueEx(columnDtl_inst_lot_fix_flg, idx, false);
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnDtl_lot_mix_flg, idx, false);
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			setValueEx(columnDtl_sublot_mix_flg, idx, false);
		}
		if (MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ())) {
			setValueEx(columnDtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
	}
	
	@Override
	public void doDtl_lot_mng_typ_NC(MCEventInfo info) {
		super.doDtl_lot_mng_typ_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.alt_itm_typ())) {
			setValueEx(columnDtl_alt_itm_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info) {
		super.doDtl_sublot_mng_typ_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.alt_itm_typ())) {
			setValueEx(columnDtl_alt_itm_typ, idx, null);
		}
	}

	/**
	 * 子品目の手配ＮＯ管理区分から手配区分を設定する（手配ＮＯ管理区分が任意以外のとき）
	 */
	protected void setSnoTyp(String snoMngTyp, int idx, MCColumnConfig cc) {
		if (MAC_SNO_MNG_TYP.isNOT_MNG(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.NO_EXTND.value());
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.EXTND.value());
		}
		else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.EXTND_NULL.value());
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
		setBtnMode();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_alt_grp_cd, idx, null);
	}
	
	@Override
	public void doDtl_oper_cd_LC(MCEventInfo info) {
		super.doDtl_oper_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.oper_cd())) {
			setValueEx(columnDtl_oper_seq, idx, null);
		}
		else if (isNull(r.oper_seq())) {
			setValueEx(columnDtl_oper_seq, idx, MCNumber.ONE);
		}
	}
	
	@Override
	public void doDtl_chd_asset_mng_typ_LC(MCEventInfo info) {
		super.doDtl_chd_asset_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
			setValueEx(columnDtl_ph_flg, idx, true);
		}
	}
	
	@Override
	public void doDtl_inpt_ctl_typ_LC(MCEventInfo info) {
		super.doDtl_inpt_ctl_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
			setValueEx(columnDtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (isNull(r.inpt_ctl_typ()) || !MAC_INPT_CTL_TYP.isMRP_INPT(r.inpt_ctl_typ())) {
				setValueEx(columnDtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			}
		}
	}
	
	@Override
	public void doDtl_alloc_ctl_typ_LC(MCEventInfo info) {
		super.doDtl_alloc_ctl_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg() 
		 || r.byprod_flg()
		 || MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ())
		 || MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
		 ) {
			if (isNull(r.alloc_ctl_typ()) || !MAC_ALLOC_CTL_TYP.isNO_ALLOC(r.alloc_ctl_typ())) {
				setValueEx(columnDtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
			}
		}
	}
	
	@Override
	public void doDtl_bkf_typ_LC(MCEventInfo info) {
		super.doDtl_bkf_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (isNull(r.bkf_typ()) || !MAC_BKF_TYP.isNO_BKF(r.bkf_typ())) {
				setValueEx(columnDtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			}
		}
	}
	
	@Override
	public void doDtl_lot_mix_flg_NC(MCEventInfo info) {
		super.doDtl_lot_mix_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.lot_mix_flg()) {
				setValueEx(columnDtl_lot_mix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doDtl_sublot_mix_flg_NC(MCEventInfo info) {
		super.doDtl_sublot_mix_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.sublot_mix_flg()) {
				setValueEx(columnDtl_sublot_mix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doDtl_inst_lot_fix_flg_NC(MCEventInfo info) {
		super.doDtl_inst_lot_fix_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg()
		 || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			if (r.inst_lot_fix_flg()) {
				setValueEx(columnDtl_inst_lot_fix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doDtl_main_itm_flg_NC(MCEventInfo info) {
		super.doDtl_main_itm_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.main_itm_flg()) {
				setValueEx(columnDtl_main_itm_flg, idx, false);
			}
		}
	}

	@Override
	public void doDtl_ph_flg_NC(MCEventInfo info) {
		super.doDtl_ph_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg()) {
			setValueEx(columnDtl_ver_no, idx, null);
			setValueEx(columnDtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			setValueEx(columnDtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			setValueEx(columnDtl_alt_itm_flg, idx, false);
			setValueEx(columnDtl_alt_grp_cd, idx, null);
			setValueEx(columnDtl_main_itm_flg, idx, false);
			setValueEx(columnDtl_yield_calc_flg, idx, false);
			setValueEx(columnDtl_inst_lot_fix_flg, idx, false);
			setValueEx(columnDtl_lot_mix_flg, idx, false);
			setValueEx(columnDtl_sublot_mix_flg, idx, false);
			setValueEx(columnDtl_byprod_flg, idx, false);
			if (isNull(r.ph_bom_ptn())) {
				setValueEx(columnDtl_ph_bom_ptn, idx, r.chd_def_bom_ptn());
			}
			setValueEx(columnDtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
		else {
			setValueEx(columnDtl_ph_bom_ptn, idx, null);
			setValueEx(columnDtl_bkf_typ, idx, null);
			setValueEx(columnDtl_inpt_ctl_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_ver_flg_NC(MCEventInfo info) {
		super.doDtl_ver_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.ver_flg()) {
			setValueEx(columnDtl_ver_no, idx, null);
		}
	}
	
	@Override
	public void doDtl_alt_itm_flg_NC(MCEventInfo info) {
		super.doDtl_alt_itm_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.alt_itm_flg()) {
			if (!isNull(r.chd_itm_cd())) {
				setValueEx(columnDtl_chd_itm_cd, idx, null);
			}
			setValueEx(columnDtl_ver_no, idx, null);
			setValueEx(columnDtl_alt_itm_typ, idx, null);
			setValueEx(columnDtl_alt_itm_ratio, idx, null);
			setValueEx(columnDtl_alt_alloc_prio, idx, null);
			if (isNull(r.chd_itm_cd())) {
				setValueEx(columnDtl_chd_base_unit_cd, idx, null);
				setValueEx(columnDtl_chd_dec_place, idx, MCNumber.valueOf(r.qty2_p().qty_META.scale()));
			}
		}
		else {
			setValueEx(columnDtl_alt_grp_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_alt_grp_cd_LC(MCEventInfo info) {
		super.doDtl_alt_grp_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.alt_grp_cd())) {
			setValueEx(columnDtl_alt_itm_typ, idx, null);
			setValueEx(columnDtl_alt_itm_ratio, idx, null);
			setValueEx(columnDtl_alt_alloc_prio, idx, null);
		}
		else if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())){
			setValueEx(columnDtl_inpt_ctl_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_alt_grp_cd_NE(MCEventInfo info) {
		super.doDtl_alt_grp_cd_NE(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		columnDtl_alt_grp_cd.setListType(r.alt_itm_flg() ? MCListType.STRICT : MCListType.FREE);
	}
	
	@Override
	public void doDtl_alt_itm_typ_LC(MCEventInfo info) {
		super.doDtl_alt_itm_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())) {
			if (!isNull(r.chd_dec_place())) {
				setValueEx(columnDtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			
			if (!isNull(r.lot_mng_typ()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				setValueEx(columnDtl_lot_mix_flg, idx, true);
			}
			else if (isNull(r.lot_mng_typ())) {
				setValueEx(columnDtl_lot_mix_flg, idx, false);
			}
			
			if (!isNull(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				setValueEx(columnDtl_sublot_mix_flg, idx, true);
			}
			else if (isNull(r.sublot_mng_typ())) {
				setValueEx(columnDtl_sublot_mix_flg, idx, false);
			}
		}
	}

	@Override
	public void doDtl_byprod_flg_NC(MCEventInfo info) {
		super.doDtl_byprod_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (r.ph_flg()) {
			if (r.byprod_flg()) {
				setValueEx(columnDtl_byprod_flg, idx, false);
			}
		}
		else if (r.byprod_flg()) {
			setValueEx(columnDtl_ver_no, idx, null);
			setValueEx(columnDtl_alt_itm_flg, idx, false);
			setValueEx(columnDtl_alt_grp_cd, idx, null);
			setValueEx(columnDtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			setValueEx(columnDtl_lot_mix_flg, idx, false);
			setValueEx(columnDtl_sublot_mix_flg, idx, false);
			setValueEx(columnDtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
			setValueEx(columnDtl_yield_calc_flg, idx, false);
			setValueEx(columnDtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			setValueEx(columnDtl_main_itm_flg, idx, false);
			if (!isNull(r.chd_dec_place())) {
				setValueEx(columnDtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			setValueEx(columnDtl_chd_rqmt_qty, idx, r.chd_inpt_qty());
		}
	}
	
	/**
	 * 子投入数量に対するイベント処理
	 *
	 * @param info イベント情報
	 */
	protected void doDtl_chd_inpt_qty_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.chd_rqmt_qty()) || r.byprod_flg()){
			setValueEx(columnDtl_chd_rqmt_qty, idx, r.chd_inpt_qty());
		}
	}
	
	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}
	
	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_upd_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_upd_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doCnd_bom_chng_typ_LC(MCEventInfo info) {
		super.doCnd_bom_chng_typ_LC(info);

		String v = getCndR().bom_chng_typ();
		getCndR().old_alt_itm_ratio(MAC_BOM_CHNG_TYP.old_alt_itm_ratio(v));
		getCndR().old_alt_alloc_prio(MAC_BOM_CHNG_TYP.old_alt_alloc_prio(v));
		getCndR().new_alt_itm_ratio(MAC_BOM_CHNG_TYP.new_alt_itm_ratio(v));
		getCndR().new_alt_alloc_prio(MAC_BOM_CHNG_TYP.new_alt_alloc_prio(v));
		
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			Cnd_new_alt_grp_cd.setListType(MCListType.STRICT);
			setValueEx(Cnd_new_alt_grp_cd, null);
		}
		else {
			Cnd_new_alt_grp_cd.setListType(MCListType.FREE);
			setValueEx(Cnd_new_alt_itm_typ, MAC_BOM_CHNG_TYP.get(getCndR().bom_chng_typ()).alt_itm_typ());
		}

		setTab4PanelMode();
	}
	protected void doCnd_old_itm_cd_LC(MCEventInfo info) {
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			if (isNull(getCndR().old_itm_nm())) {
				setDefaultMode(Cnd_old_alt_grp_cd);
			}
			else {
				Cnd_old_alt_grp_cd.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			if (!isNull(getCndR().old_itm_cd())) {
				setValueEx(Cnd_new_alt_grp_cd, getCndR().old_itm_cd());
			}
		}
	}
	protected void doCnd_new_itm_cd_LC(MCEventInfo info) {
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			if (isNull(getCndR().new_itm_nm())) {
				setDefaultMode(Cnd_new_alt_grp_cd);
			}
			else {
				Cnd_new_alt_grp_cd.setMode(MCMode.READ_ONLY);
			}
		}
	}
	@Override
	public void doCnd_old_alt_grp_cd_LC(MCEventInfo info) {
		super.doCnd_old_alt_grp_cd_LC(info);
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			if (isNull(getCndR().old_alt_grp_nm())) {
				setDefaultMode(Cnd_old_itm_cd);
				setDefaultMode(Cnd_old_ver_no);
			}
			else {
				Cnd_old_itm_cd.setMode(MCMode.READ_ONLY);
				Cnd_old_ver_no.setMode(MCMode.READ_ONLY);
			}
		}
	}
	@Override
	public void doCnd_new_alt_grp_cd_LC(MCEventInfo info) {
		super.doCnd_new_alt_grp_cd_LC(info);
		if (isNull(getCndR().bom_chng_typ()) || MAC_BOM_CHNG_TYP.isTERM(getCndR().bom_chng_typ())) {
			if (isNull(getCndR().new_alt_grp_nm())) {
				setDefaultMode(Cnd_new_itm_cd);
				setDefaultMode(Cnd_new_ver_no);
			}
			else {
				Cnd_new_itm_cd.setMode(MCMode.READ_ONLY);
				Cnd_new_ver_no.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			setValueEx(Cnd_new_alt_itm_typ, MAC_BOM_CHNG_TYP.get(getCndR().bom_chng_typ()).alt_itm_typ());
		}
	}

	@Override										
	public void setFIXStatus() {
		super.setFIXStatus();
		setRegTgtMode();
		setModeByRegTgt();
		setTab4PanelMode();
		setBtnMode();
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setRegTgtValue(info);
		setModeByRegTgt();
		setTab4PanelMode();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (info.getComponent() == Cnd_ope_Group) {
			if (!ref && getCndR().cmn_flg() && getCndR().wg_flg()) {
				initRegTgt();
			}
		}
		else if (info.getComponent() == Cnd_cmn_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().wg_flg(false);
			}
		}
		else if (info.getComponent() == Cnd_wg_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().cmn_flg(false);
			}
		}
	}

	protected void setModeByRegTgt() {
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		setTab4PanelMode();
		fillSpace();
		getBulkSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		setTab4PanelMode();
		fillSpace();
		getBulkSetR().clearAll();
	}

	//-------------------- イベントここまで --------------------//

	//-------------------- セルコンフィグここから --------------------//
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createBomTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return ＢＯＭ用のセルコンフィグ
	 */
	protected BomTableCellConfig createBomTableCellConfig() {
		return new BomTableCellConfig(this);
	}

	/**
	 * ＢＯＭ用のセルコンフィグクラス
	 */
	protected class BomTableCellConfig extends MAUDP_RLBaseCellConfig {

		public BomTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD || getStatus() == CHNG) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_oper_seq) {
					if (isNull(r.oper_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_chd_itm_cd
						|| column == columnDtl_chd_itm_sub1
						|| column == columnDtl_chd_itm_sub2
						|| column == columnDtl_chd_itm_sub3) {
					if (r.alt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ver_no) {
					if (r.alt_itm_flg() || !r.ver_flg() || r.byprod_flg() || r.ph_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_byprod_flg) {
					if (isNull(r.chd_itm_cd()) || r.ph_flg() || !isNull(r.alt_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ph_flg) {
					if (isNull(r.chd_itm_cd()) || r.byprod_flg() || !isNull(r.alt_grp_cd())) {
						return MCMode.READ_ONLY;
					}
					if (MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ph_bom_ptn) {
					if (!r.ph_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alt_itm_flg) {
					if (r.ph_flg() || r.byprod_flg()
							|| !isNull(r.chd_itm_cd()) && !r.alt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alt_grp_cd) {
					if (r.ph_flg() || r.byprod_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.alt_itm_flg()) {
						return MCMode.REQUIRED;
					}
					else if (isNull(r.chd_itm_cd()))
						return MCMode.READ_ONLY;
				}
				else if (column == columnDtl_alt_itm_typ
					  || column == columnDtl_alt_itm_ratio
					  || column == columnDtl_alt_alloc_prio) {
					if (isNull(r.alt_grp_cd()) || r.alt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_chd_rqmt_qty) {
					if (r.byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_fxd_chd_rqmt_qty) {
						if (!isNull(r.fxd_chd_rqmt_qty()) 
						 && r.fxd_chd_rqmt_qty().isZero()
						 && (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ()) || r.byprod_flg())) {
							return MCMode.READ_ONLY;
						}
				}
				else if (column == columnDtl_sno_typ1) {
					if (!isNull(r.chd_sno1_mng_typ())
					 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno1_mng_typ())
					 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno_typ2) {
					if (!isNull(r.chd_sno2_mng_typ())
					 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno2_mng_typ())
					 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno_typ3) {
					if (!isNull(r.chd_sno3_mng_typ())
					 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno3_mng_typ())
					 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno_typ4) {
					if (!isNull(r.chd_sno4_mng_typ())
					 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno4_mng_typ())
					 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bkf_typ
						|| column == columnDtl_yield_calc_flg
						|| column == columnDtl_inpt_ctl_typ) {
					if (r.ph_flg() || r.byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_inst_lot_fix_flg) {
					if (isNull(r.lot_mng_typ()) 
					 || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
					 || r.ph_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lot_mix_flg) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) 
					 || r.byprod_flg() 
					 || r.ph_flg() 
					 ) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sublot_mix_flg) {
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
					 || r.byprod_flg() 
					 || r.ph_flg() 
					 ) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alloc_ctl_typ) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ()) 
					 || MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
					 || r.ph_flg() 
					 || r.byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_main_itm_flg) {
					if (r.ph_flg() || r.byprod_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				//親品目が架空品の場合、もしくは親品目の手配ＮＯ管理区分が「２：管理する（必須）」の場合は部品と動きを変える
				else if (column == columnDtl_max_sno1){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno1_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_max_sno2){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno2_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_max_sno3){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno3_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_max_sno4){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno4_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_min_sno1){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno1_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_min_sno2){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno2_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_min_sno3){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno3_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_min_sno4){
					if (MAC_ITM_TYP.isPHANTOM(r.par_itm_typ()) || MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno4_mng_typ())){
						return MCMode.ENABLE;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	//-------------------- セルコンフィグここまで --------------------//

	@Override
	public MCList getDtl_alt_grp_cd(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!r.alt_itm_flg()) {
			return MCList.create(MCRow.class);
		}
		if (isNull(row.getString(AltGrpBomCols.$i_wg_cd))) {
			row.addStringColumn(AltGrpBomCols.$i_wg_cd, MAC_STR.NULL_VAL.value());
		}
		return super.getDtl_alt_grp_cd(row, info);
	}

}