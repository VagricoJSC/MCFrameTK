package mcframe.clientMABS.MABSP0010;

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
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmDtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmDtlReg_MC extends MABSP_ItmDtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmDtlReg_MC() {
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
	public MABSP_ItmDtlReg_MC(String name) {
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
	 * Panel[DtlBtn]のボタン[open_MABSP1100]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1100(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1100");
		
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1100CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1100.CndR crtOpenMABSP1100CndR(MAUCP_AppScreenOpener aso) {		
		mcframe.clientMABS.MABSP1100.CndR to =
				mcframe.clientMABS.MABSP1100.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}	
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1110]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1110");
		
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1110CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1110.CndR crtOpenMABSP1110CndR(MAUCP_AppScreenOpener aso) {		
		mcframe.clientMABS.MABSP1110.CndR to =
				mcframe.clientMABS.MABSP1110.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}		
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1130CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABSP0180]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to =
				mcframe.clientMABS.MABSP1130.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}		
	/**
	 * [MA_MABSL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Srch01Caller<P extends MABSP_ItmDtlReg, B extends MA_MABSL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
		}
		
		@Override
		protected void resultNoDataFound() {
			CndTabTab.focusActiveFirstComponent();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
	}

	/**
	 * [MA_MABSL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Sprt01Caller<P extends MABSP_ItmDtlReg, B extends MA_MABSL0010_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0010_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Upd01Caller<P extends MABSP_ItmDtlReg, B extends MA_MABSL0010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MA_MABSL0010_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Del01Caller<P extends MABSP_ItmDtlReg, B extends MA_MABSL0010_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0010_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0010_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0010_Sprt01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_cmn(MCEventInfo info) {
		callMA_MABSL0010_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_wg(MCEventInfo info) {
		callMA_MABSL0010_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_cmn(MCEventInfo info) {
		callMA_MABSL0010_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del_wg(MCEventInfo info) {
		callMA_MABSL0010_Del01();
	}




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

		Dtl_itm_p_PPanel.addItmLCListner(this);
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndTabTab.focusActiveFirstComponent();
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_mfg_lt_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_purc_lt_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_min_lot_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_batch_lot_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_max_lot_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_yield_schd_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_mfg_inst_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_qty1_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_qty2_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
                , columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ
                , columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
	}
	
	//セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createItmDtlTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 一覧のセルコンフィグ
	 */
	protected ItmDtlTableCellConfig createItmDtlTableCellConfig() {

		return new ItmDtlTableCellConfig(this);
	}

	/**
	 * セルコンフィグクラス
	 */
	protected class ItmDtlTableCellConfig extends MAUDP_RLBaseCellConfig {

		public ItmDtlTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR row = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_mfg_loc_cd) {
					if (isNull(row.asset_mng_typ()) || !MAC_ASSET_MNG_TYP.isMNG(row.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (!isNullOrNullVal(row.sppl_cd())
							|| !isNullOrNullVal(row.rqst_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sppl_cd) {
					if (!isNullOrNullVal(row.mfg_loc_cd())
							|| !isNullOrNullVal(row.rqst_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_maker_cd) {
					if (isNullOrNullVal(row.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rqst_loc_cd) {
					if (!isNullOrNullVal(row.mfg_loc_cd())
							|| !isNullOrNullVal(row.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bom_ptn
						|| column == columnDtl_bkf_flg) {
					if (isNullOrNullVal(row.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_mfg_lt || column == columnDtl_mfg_lt_add_qty
						|| column == columnDtl_no_mfg_aprv_flg
						|| column == columnDtl_inst_rec_issue_flg
						|| column == columnDtl_itm_lower_yield
						|| column == columnDtl_itm_std_yield
						|| column == columnDtl_itm_upper_yield) {
					if (isNullOrNullVal(row.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lot_issue_typ) {
					if (isNullOrNullVal(row.mfg_loc_cd())
							|| MAC_LOT_MNG_TYP.isNOT_MNG(row.lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_purc_lt
						|| column == columnDtl_purc_lt_add_qty
						|| column == columnDtl_purc_basis_typ
						|| column == columnDtl_rqst_wg_cd
						|| column == columnDtl_po_batch_flg) {
					if (isNullOrNullVal(row.sppl_cd())
							&& isNullOrNullVal(row.loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_accpt_insp_lt) {
					if (isNullOrNullVal(row.sppl_cd()) && isNullOrNullVal(row.loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
					else if(MAC_PURC_BASIS_TYP.isARR_BASIS(row.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
					else if(MAC_PURC_ID_TYP.isFFR_RCV(row.purc_id_typ()) || MAC_PURC_ID_TYP.isVMI(row.purc_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sz_day_week_typ) {
					if (!isNull(row.lot_sz_pd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sz_week) {
					if (isNull(row.sz_day_week_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lot_sz_pd) {
					if (!isNull(row.sz_day_week_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_oper_ptn
						|| column == columnDtl_yield_schd_qty
						|| column == columnDtl_mfg_inst_qty
						|| column == columnDtl_fxd_rqmt_qty
						|| column == columnDtl_ln_stk_flg) {
					if (isNullOrNullVal(row.mfg_loc_cd())
							|| !isNull(row.loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_purc_id_typ) {
					if (isNullOrNullVal(row.sppl_cd()) && isNull(row.loc_sppl_cd())) {
						return MCMode.READ_ONLY;
					}
					if (!MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rsrc_std_qty1
						|| column == columnDtl_rsrc_unit_qty1) {
					if (isNull(row.rsrc_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rsrc_std_qty2
						|| column == columnDtl_rsrc_unit_qty2) {
					if (isNull(row.rsrc_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
				else if (column == columnDtl_sno1){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno1_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno2){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno2_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno3){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno3_mng_typ())){
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_sno4){
					if (MAC_SNO_MNG_TYP.isMNG_REQ(row.sno4_mng_typ())){
						return MCMode.ENABLE;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
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
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}
	
	/**
	 * ボタンのモードを変更する。
	 * @param btn 処理対象のボタン
	 * @param isEnabled trueの場合、画面ステータスのデフォルトのモード。falseの場合、DISABLEモード。
	 */
	protected void setBtnModeByFlg(MCButton btn, boolean isEnabled) {
		if (isEnabled) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 製造品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1100(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ());
	}

	/**
	 * 購買品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1110(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ()) ;
	}

	/**
	 * 検査品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1130(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ());
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		
		if (r == null || isNull(r.itm_cd())) {
			DtlBtn_open_MABSP1100.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1110.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1130.setMode(MCMode.DISABLE);
		}
		else {
			setBtnModeByFlg(DtlBtn_open_MABSP1100, isEnableBtn_open_MABSP1100(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1110, isEnableBtn_open_MABSP1110(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1130, isEnableBtn_open_MABSP1130(r));
		}
	}

	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			setStatus(UPD);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setStatus(DEL);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setStatus(REF);
		}
		setModeByRegTgt();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
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

	@Override										
	public void setFIXStatus() {
		super.setFIXStatus();
		setBtnMode();
		setRegTgtMode();
		setModeByRegTgt();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	
	@Override										
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
	}
	
	@Override										
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
	}


	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setRegTgtValue(info);
		setModeByRegTgt();
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
			setDefaultMode(Cnd_mfg_loc_cd);
			setDefaultMode(Cnd_mfg_loc_nm);
			setDefaultMode(Cnd_site_cd);
			setDefaultMode(Cnd_site_nm);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
				setDefaultMode(columnDtl_mfg_loc_cd);
				setDefaultMode(columnDtl_mfg_loc_nm);
			}
			setDefaultMode(DtlBtn_upd_wg);
			setDefaultMode(DtlBtn_del_wg);
			DtlBtn_upd_cmn.setMode(MCMode.INVISIBLE);
			DtlBtn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (isNull(getSysParm("DEF_WG_CD"))) {
				setValueEx(Cnd_mfg_loc_cd, null);
				setValueEx(Cnd_site_cd, null);
				Cnd_mfg_loc_cd.setMode(MCMode.READ_ONLY);
				Cnd_mfg_loc_nm.setMode(MCMode.READ_ONLY);
				Cnd_site_cd.setMode(MCMode.READ_ONLY);
				Cnd_site_nm.setMode(MCMode.READ_ONLY);
			}
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
				if (isNull(getSysParm("DEF_WG_CD"))) {
					columnDtl_mfg_loc_cd.setMode(MCMode.INVISIBLE);
					columnDtl_mfg_loc_nm.setMode(MCMode.INVISIBLE);
					columnDtl_site_cd.setMode(MCMode.INVISIBLE);
					columnDtl_site_nm.setMode(MCMode.INVISIBLE);
				}
			}
			setDefaultMode(DtlBtn_upd_cmn);
			setDefaultMode(DtlBtn_del_cmn);
			DtlBtn_upd_wg.setMode(MCMode.INVISIBLE);
			DtlBtn_del_wg.setMode(MCMode.INVISIBLE);
		}
	}

	public void doDtl_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNullOrNullVal(r.mfg_loc_cd()) && isNull(r.bom_ptn())) {
			setValueEx(columnDtl_bom_ptn, idx, r.def_bom_ptn());
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnDtl_lot_issue_typ, idx, null);
		}
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
		getBulkSetR().clearAll();
	}

	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_mfg_loc_cd, idx, null);
		setValueEx(columnDtl_rqst_loc_cd, idx, null);
	}
		
	@Override
	public void doDtl_stk_mng_typ_LC(MCEventInfo info) {
		super.doDtl_stk_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNullOrNullVal(r.sppl_cd()) && !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value());
		}
		if (isNull(r.order_ratio())){
			setValueEx(columnDtl_order_ratio, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doDtl_asset_mng_typ_LC(MCEventInfo info) {
		super.doDtl_asset_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
			setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
		}
	}
	@Override
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info) {
		super.doDtl_mfg_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNullOrNullVal(r.mfg_loc_cd())) {
			if (isNull(r.loc_sppl_cd())) {
				setValueEx(columnDtl_purc_lt, idx, null) ;
				setValueEx(columnDtl_purc_lt_add_qty, idx, null) ;
				setValueEx(columnDtl_purc_basis_typ, idx, null);
				setValueEx(columnDtl_accpt_insp_lt, idx, null) ;
				setValueEx(columnDtl_rqst_wg_cd, idx, null) ;
				setValueEx(columnDtl_po_batch_flg, idx, false) ;
				setValueEx(columnDtl_purc_id_typ, idx, null) ;
				if (isNull(r.yield_schd_qty())) {
					setValueEx(columnDtl_yield_schd_qty, idx, MCNumber.ONE) ;
				}
				if (isNull(r.mfg_inst_qty())) {
					setValueEx(columnDtl_mfg_inst_qty, idx, MCNumber.ONE) ;
				}
			}
			else {
				setValueEx(columnDtl_oper_ptn, idx, null) ;
				setValueEx(columnDtl_yield_schd_qty, idx, null) ;
				setValueEx(columnDtl_mfg_inst_qty, idx, null) ;
				setValueEx(columnDtl_fxd_rqmt_qty, idx, null) ;
				setValueEx(columnDtl_lot_issue_typ, idx, null) ;
				setValueEx(columnDtl_ln_stk_flg, idx, false) ;
				setValueEx(columnDtl_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value()) ;
			}
			if (isNull(r.bom_ptn())) {
				setValueEx(columnDtl_bom_ptn, idx, r.def_bom_ptn()) ;
			}
			
			if (!isNull(r.sppl_cd())) {
				setValueEx(columnDtl_sppl_cd, idx, null) ;
			}
			if (!isNull(r.rqst_loc_cd())) {
				setValueEx(columnDtl_rqst_loc_cd, idx, null) ;
			}
		}
		else {
			setValueEx(columnDtl_yield_schd_qty, idx, null) ;
			setValueEx(columnDtl_mfg_inst_qty, idx, null) ;
			setValueEx(columnDtl_fxd_rqmt_qty, idx, null) ;
			setValueEx(columnDtl_bom_ptn, idx, null) ;
			setValueEx(columnDtl_no_mfg_aprv_flg, idx, false) ;
			setValueEx(columnDtl_inst_rec_issue_flg, idx, false) ;
			setValueEx(columnDtl_itm_lower_yield, idx, null) ;
			setValueEx(columnDtl_itm_std_yield, idx, null) ;
			setValueEx(columnDtl_itm_upper_yield, idx, null) ;
			
			if (MAC_STR.isNULL_VAL(r.sppl_cd())) {
				setValueEx(columnDtl_sppl_cd, idx, null) ;
			}
			if (MAC_STR.isNULL_VAL(r.rqst_loc_cd())) {
				setValueEx(columnDtl_rqst_loc_cd, idx, null) ;
			}
		}
	}
	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNullOrNullVal(r.sppl_cd())) {
			setValueEx(columnDtl_bom_ptn, idx, null) ;
			setValueEx(columnDtl_bkf_flg, idx, false);
			setValueEx(columnDtl_oper_ptn, idx, null) ;
			setValueEx(columnDtl_mfg_lt, idx, null) ;
			setValueEx(columnDtl_mfg_lt_add_qty, idx, null) ;
			setValueEx(columnDtl_yield_schd_qty, idx, null) ;
			setValueEx(columnDtl_mfg_inst_qty, idx, null) ;
			setValueEx(columnDtl_fxd_rqmt_qty, idx, null) ;
			setValueEx(columnDtl_lot_issue_typ, idx, null) ;
			setValueEx(columnDtl_ln_stk_flg, idx, false) ;
			setValueEx(columnDtl_inst_rec_issue_flg, idx, false) ;
			setValueEx(columnDtl_no_mfg_aprv_flg, idx, false) ;
			setValueEx(columnDtl_itm_lower_yield, idx, null) ;
			setValueEx(columnDtl_itm_std_yield, idx, null) ;
			setValueEx(columnDtl_itm_upper_yield, idx, null) ;
			
			if (!isNull(r.stk_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				setValueEx(columnDtl_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value());
			}
			
			if (!isNull(r.mfg_loc_cd())) {
				setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
			}
			if (!isNull(r.rqst_loc_cd())) {
				setValueEx(columnDtl_rqst_loc_cd, idx, null) ;
			}
		}
		else {
			setValueEx(columnDtl_maker_cd, idx, null) ;
			setValueEx(columnDtl_purc_lt, idx, null) ;
			setValueEx(columnDtl_purc_lt_add_qty, idx, null) ;
			setValueEx(columnDtl_purc_basis_typ, idx, null) ;
			setValueEx(columnDtl_accpt_insp_lt, idx, null) ;
			setValueEx(columnDtl_purc_id_typ, idx, null) ;
			setValueEx(columnDtl_rqst_wg_cd, idx, null) ;
			setValueEx(columnDtl_po_batch_flg, idx, false) ;
			
			if (MAC_STR.isNULL_VAL(r.mfg_loc_cd())) {
				setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
			}
			if (MAC_STR.isNULL_VAL(r.rqst_loc_cd())) {
				setValueEx(columnDtl_rqst_loc_cd, idx, null) ;
			}
		}
	}
	@Override
	public void doDtl_rqst_loc_cd_LC(MCEventInfo info) {
		super.doDtl_rqst_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNullOrNullVal(r.rqst_loc_cd())) {
			setValueEx(columnDtl_bom_ptn, idx, null) ;
			setValueEx(columnDtl_bkf_flg, idx, false);
			setValueEx(columnDtl_oper_ptn, idx, null) ;
			setValueEx(columnDtl_mfg_lt, idx, null) ;
			setValueEx(columnDtl_mfg_lt_add_qty, idx, null) ;
			setValueEx(columnDtl_purc_lt, idx, null) ;
			setValueEx(columnDtl_purc_lt_add_qty, idx, null) ;
			setValueEx(columnDtl_purc_basis_typ, idx, null);
			setValueEx(columnDtl_yield_schd_qty, idx, null) ;
			setValueEx(columnDtl_mfg_inst_qty, idx, null) ;
			setValueEx(columnDtl_fxd_rqmt_qty, idx, null) ;
			setValueEx(columnDtl_lot_issue_typ, idx, null) ;
			setValueEx(columnDtl_accpt_insp_lt, idx, null) ;
			setValueEx(columnDtl_purc_id_typ, idx, null) ;
			setValueEx(columnDtl_rqst_wg_cd, idx, null) ;
			setValueEx(columnDtl_po_batch_flg, idx, false) ;
			setValueEx(columnDtl_inst_rec_issue_flg, idx, false) ;
			setValueEx(columnDtl_no_mfg_aprv_flg, idx, false) ;
			setValueEx(columnDtl_itm_lower_yield, idx, null) ;
			setValueEx(columnDtl_itm_std_yield, idx, null) ;
			setValueEx(columnDtl_itm_upper_yield, idx, null) ;
			
			if (!isNull(r.sppl_cd())) {
				setValueEx(columnDtl_sppl_cd, idx, null) ;
			}
			if (!isNull(r.mfg_loc_cd())) {
				setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
			}
		}
		else {
			if (MAC_STR.isNULL_VAL(r.sppl_cd())) {
				setValueEx(columnDtl_sppl_cd, idx, null) ;
			}
			if (MAC_STR.isNULL_VAL(r.mfg_loc_cd())) {
				setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
			}
		}
	}
	@Override
	public void doDtl_rsrc_cd1_LC(MCEventInfo info) {
		super.doDtl_rsrc_cd1_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_rsrc_std_qty1, idx, null);
		setValueEx(columnDtl_rsrc_unit_qty1, idx, null);
	}
	
	@Override
	public void doDtl_rsrc_cd2_LC(MCEventInfo info) {
		super.doDtl_rsrc_cd2_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_rsrc_std_qty2, idx, null);
		setValueEx(columnDtl_rsrc_unit_qty2, idx, null);
	}
	
	@Override
	public void doDtl_purc_basis_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_purc_basis_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			setValueEx(columnDtl_accpt_insp_lt, idx, null);
		}
	}
	
	@Override
	public void doDtl_purc_id_typ_LC(MCEventInfo info) {
		super.doDtl_purc_id_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
			setValueEx(columnDtl_accpt_insp_lt, idx, null);
		}
	}
	@Override
	public void doDtl_lot_sz_pd_LC(MCEventInfo info) {
		super.doDtl_lot_sz_pd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.lot_sz_pd())) {
			setValueEx(columnDtl_sz_day_week_typ, idx, null);
		}
	}
	@Override
	public void doDtl_sz_day_week_typ_LC(MCEventInfo info) {
		super.doDtl_sz_day_week_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.sz_day_week_typ())) {
			setValueEx(columnDtl_lot_sz_pd, idx, null);
		}
		else {
			setValueEx(columnDtl_sz_week, idx, null);
		}
	}

}