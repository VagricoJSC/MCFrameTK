package mcframe.clientMGBD.MGBDP0540;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5210.*;
import mcframe.clientMAUB.MAUBP5340.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_BomExSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_BomExSrch_MC extends MGBDP_BomExSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _is_expand_all = false;
	
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_BomExSrch_MC() {
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
	public MGBDP_BomExSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0540_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0540_Srch01Caller<P extends MGBDP_BomExSrch, B extends MG_MGBDL0540_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0540_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getAllSubDtl());
		}

		@Override
		protected void clear() {
			super.clear();
			Dtl_hrrchy_p_PPanel.screenClearBody();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			if (Cnd_ope_EX1.isSelected()) {
				for (DtlR r : bridge.down0()) {
					if (isNull(r.itm_calc_ctg_cd())) {
						r.unreg_flg(true);
					}
					r.leaf(r.itm_cd());
				}
			}
			else {
				for (DtlR r : bridge.down0()) {
					r.leaf(r.itm_cd());
				}
			}
			
			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {
			super.show();
			getCnd2R().term(getCndR().term());
			getCnd2R().calc_grp_cd(getCndR().calc_grp_cd());
			if(_is_expand_all){
				Dtl_hrrchy_p_PPanel.showExpandAll(getDtlL());
			}
			else{
				Dtl_hrrchy_p_PPanel.showCollapseAll(getDtlL());
			}
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setREFStatus();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MG_MGBDL0540_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0540_Srch02Caller<P extends MGBDP_BomExSrch, B extends MG_MGBDL0540_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0540_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			setupUp0();
		}
		
		protected void setupUp0() {
			DtlR r = DtlTable.getSelectedMCRow();
			bridge.up0().calc_grp_cd(_cndR.calc_grp_cd());
			bridge.up0().wg_cd(r.wg_cd());
			bridge.up0().term(_cndR.term());
			bridge.up0().itm_cd(r.itm_cd());
			bridge.up0().itm_sub1(r.itm_sub1());
			bridge.up0().itm_sub2(r.itm_sub2());
			bridge.up0().itm_sub3(r.itm_sub3());
			bridge.up0().itm_calc_ctg_cd(r.itm_calc_ctg_cd());
			bridge.up0().dtl_calc_ctg_cd(r.dtl_calc_ctg_cd());
			bridge.up0().purc_calc_ctg_cd(r.purc_calc_ctg_cd());
			bridge.up0().proc_calc_ctg_cd(r.proc_calc_ctg_cd());
			bridge.up0().prov_calc_ctg_cd(r.prov_calc_ctg_cd());
			bridge.up0().sls_calc_ctg_cd(r.sls_calc_ctg_cd());
			bridge.up0().fix_calc_ctg_cd(r.fix_calc_ctg_cd());
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			ItmTable.selectRowNoFocus(0);
			ItmDtlTable.selectRowNoFocus(0);
			ItmOperTable.selectRowNoFocus(0);
			ItmWkTable.selectRowNoFocus(0);
			ItmPurcTable.selectRowNoFocus(0);
			ItmProcTable.selectRowNoFocus(0);
			ItmProvTable.selectRowNoFocus(0);
			ItmSlsTable.selectRowNoFocus(0);
			ItmFixTable.selectRowNoFocus(0);
		}

		@Override
		protected void moveFocusNoDown() {
		}

		@Override
		protected void showNoDownDataMsg() {
			// ダイアログ出さない
		}

		@Override
		protected void resultNoDataFound() {
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMG_MGBDL0540_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMG_MGBDL0540_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[srch_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_srch_dtl(MCEventInfo info) {
		callMG_MGBDL0540_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0540_ex2]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0540_ex2(MCEventInfo info) {
		openMGBDP0540(Cnd_ope_EX2.getActionCommand());
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0540_ex1]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0540_ex1(MCEventInfo info) {
		openMGBDP0540(Cnd_ope_EX1.getActionCommand());
	}
	
	protected void openMGBDP0540(String ope) {
		DtlR r = DtlTable.getSelectedMCRow();
		CndR bind = CndR.create();
		bind.ope(ope);
		bind.calc_grp_cd(_cndR.calc_grp_cd());
		bind.term(_cndR.term());
		bind.wg_cd(r.wg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		if (isSame(ope, Cnd_ope_EX1.getActionCommand())) {
			bind.bom_ptn(r.bom_ptn());
		}
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0540");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0520]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0520(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0520");
		mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg p = (mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg)so.getPanel();
		mcframe.clientMGBD.MGBDP0520.CndR bind = mcframe.clientMGBD.MGBDP0520.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.ope(p.Cnd_ope_REF.getActionCommand());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.term(_cndR.term());
		bind.par_itm_cd(r.itm_cd());
		bind.par_itm_sub1(r.itm_sub1());
		bind.par_itm_sub2(r.itm_sub2());
		bind.par_itm_sub3(r.itm_sub3());
		bind.bom_ptn(r.bom_ptn());
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0530]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0530(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0530.CndR bind = mcframe.clientMGBD.MGBDP0530.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.par_itm_cd(r.itm_cd());
		bind.par_itm_sub1(r.itm_sub1());
		bind.par_itm_sub2(r.itm_sub2());
		bind.par_itm_sub3(r.itm_sub3());
		bind.bom_ptn(r.bom_ptn());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0530");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0530_chd]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0530_chd(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0530.CndR bind = mcframe.clientMGBD.MGBDP0530.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.chd_itm_cd(r.itm_cd());
		bind.chd_itm_sub1(r.itm_sub1());
		bind.chd_itm_sub2(r.itm_sub2());
		bind.chd_itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0530");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_par_rqmt_qty_p_PPanel.setRelateBeans(columnDtl_par_unit_cd, columnDtl_par_dec_place);
		Dtl_chd_rqmt_qty_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_chd_base_qty_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_fxd_chd_rqmt_qty_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_chd_min_qty_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_chd_batch_qty_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Itm_qty_p_PPanel.setRelateBeans(columnItm_unit_cd, columnItm_dec_place);
		ItmDtl_min_lot_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_batch_lot_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_fxd_lot_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_fxd_yield_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_nmr_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_dnm_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmDtl_max_qty_p_PPanel.setRelateBeans(columnItmDtl_unit_cd, columnItmDtl_dec_place);
		ItmWk_qty_p_PPanel.setRelateBeans(columnItmWk_unit_cd, columnItmWk_dec_place);
		ItmWk_wk_cost_p_PPanel.setRelateBeans(columnItmWk_wk_cost_unit_nm, columnItmWk_wk_cost_dec_place);
		ItmWk_fxd_wk_cost_p_PPanel.setRelateBeans(columnItmWk_wk_cost_unit_nm, columnItmWk_wk_cost_dec_place);
		ItmWk_min_wk_cost_p_PPanel.setRelateBeans(columnItmWk_wk_cost_unit_nm, columnItmWk_wk_cost_dec_place);
		ItmWk_batch_wk_cost_p_PPanel.setRelateBeans(columnItmWk_wk_cost_unit_nm, columnItmWk_wk_cost_dec_place);
		ItmPurc_qty_p_PPanel.setRelateBeans(columnItmPurc_unit_cd, columnItmPurc_dec_place);
		ItmPurc_upri_p_PPanel.setRelateBeans(columnItmPurc_cur_cd, columnItmPurc_dec_place);
		ItmProc_qty_p_PPanel.setRelateBeans(columnItmProc_unit_cd, columnItmProc_dec_place);
		ItmProc_upri_p_PPanel.setRelateBeans(columnItmProc_cur_cd, columnItmProc_dec_place);
		ItmProv_qty_p_PPanel.setRelateBeans(columnItmProv_unit_cd, columnItmProv_dec_place);
		ItmProv_upri_p_PPanel.setRelateBeans(columnItmProv_cur_cd, columnItmProv_dec_place);
		ItmSls_qty_p_PPanel.setRelateBeans(columnItmSls_unit_cd, columnItmSls_dec_place);
		ItmSls_upri_p_PPanel.setRelateBeans(columnItmSls_cur_cd, columnItmSls_dec_place);
		ItmFix_qty_p_PPanel.setRelateBeans(columnItmFix_unit_cd, columnItmFix_dec_place);
		ItmFix_std_upri_p_PPanel.setRelateBeans(columnItmFix_cur_cd, columnItmFix_std_upri_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setListInValue();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false); // ソート不可

		DtlTable.moveColumns(columnDtl_unreg_flg, columnDtl_leaf_str);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		// ソート設定のポップアップを無効にする
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			conf.ignoreSortOrder(true);
		}
		return conf;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		clearAllSubDtl();
		setBtnMode();
	}
	
	protected void clearAllSubDtl() {
		for (MCList<?> l : getAllSubDtl()) {
			l.clear();
		}
	}
	
	protected MCList<?>[] getAllSubDtl() {
		return new MCList[]{getItmL(), getItmDtlL(), getItmOperL(), getItmWkL(),
				getItmPurcL(), getItmProcL(), getItmProvL(), getItmSlsL(),
				getItmFixL()};
	}
	
	protected void setCndMode() {
		setBomPtnMode();
	}
	
	protected void setBomPtnMode() {
		if (Cnd_ope_EX1.isSelected()) {
			setDefaultMode(Cnd_bom_ptn);
		}
		else {
			Cnd_bom_ptn.setMode(MCMode.ENABLE);
		}
	}
	
	protected void setDtlMode() {
		setUnregFlgMode();
	}

	protected void setUnregFlgMode() {
		if (Cnd_ope_EX1.isSelected()) {
			setDefaultMode(columnDtl_unreg_flg);
		}
		else {
			columnDtl_unreg_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			Btn_srch_dtl.setMode(MCMode.DISABLE);
			Btn_open_MGBDP0530_chd.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_srch_dtl);
			setDefaultMode(Btn_open_MGBDP0530_chd);
		}
		if (r == null || isNull(r.bom_ptn())) {
			Btn_open_MGBDP0520.setMode(MCMode.DISABLE);
			Btn_open_MGBDP0530.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MGBDP0520);
			setDefaultMode(Btn_open_MGBDP0530);
		}
		
		setOpenMGBDP0540Mode();
	}
	
	protected void setOpenMGBDP0540Mode() {
		if (Cnd_ope_EX1.isSelected()) {
			if (DtlTable.getSelectedMCRow() == null) {
				Btn_open_MGBDP0540_ex2.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MGBDP0540_ex2);
			}
			Btn_open_MGBDP0540_ex1.setMode(MCMode.DISABLE);
		}
		else {
			DtlR r = DtlTable.getSelectedMCRow();
			if (r == null || isNull(r.bom_ptn())) {
				Btn_open_MGBDP0540_ex1.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MGBDP0540_ex1);
			}
			Btn_open_MGBDP0540_ex2.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getDtlL().clear();
		Dtl_hrrchy_p_PPanel.screenClearBody();
		setListInValue();
		setSRCHStatus();
	}
	
	protected void setListInValue() {
		if (Cnd_ope_EX1.isSelected()) {
			getCndR().itm_is_srch_typ(MAC_ITM_IS_SRCH_TYP.ASSET1.value());
			getCndR().par_itm_flg(true);
			getCndR().chd_itm_flg(false);
		}
		else {
			getCndR().itm_is_srch_typ(MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
			getCndR().par_itm_flg(false);
			getCndR().chd_itm_flg(true);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == ItmTable) {
			doItm_DC(info);
		}
		else if (dc == ItmDtlTable) {
			doItmDtl_DC(info);
		}
		else if (dc == ItmOperTable) {
			doItmOper_DC(info);
		}
		else if (dc == ItmWkTable) {
			doItmWk_DC(info);
		}
		else if (dc == ItmPurcTable) {
			doItmPurc_DC(info);
		}
		else if (dc == ItmProcTable) {
			doItmProc_DC(info);
		}
		else if (dc == ItmProvTable) {
			doItmProv_DC(info);
		}
		else if (dc == ItmSlsTable) {
			doItmSls_DC(info);
		}
		else if (dc == ItmFixTable) {
			doItmFix_DC(info);
		}
	}

	protected void doItm_DC(MCEventInfo info) {
		ItmR r = ItmTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0500.CndR bind = mcframe.clientMGBD.MGBDP0500.CndR.create();
		bind.wg_cd(r.wg_cd());
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0500");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmDtl_DC(MCEventInfo info) {
		ItmDtlR r = ItmDtlTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0510.CndR bind = mcframe.clientMGBD.MGBDP0510.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0510");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmOper_DC(MCEventInfo info) {
		ItmOperR r = ItmOperTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0560.CndR bind = mcframe.clientMGBD.MGBDP0560.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0560");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmWk_DC(MCEventInfo info) {
		ItmWkR r = ItmWkTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0580.CndR bind = mcframe.clientMGBD.MGBDP0580.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0580");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmPurc_DC(MCEventInfo info) {
		ItmPurcR r = ItmPurcTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0600.CndR bind = mcframe.clientMGBD.MGBDP0600.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0600");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmProc_DC(MCEventInfo info) {
		ItmProcR r = ItmProcTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0660.CndR bind = mcframe.clientMGBD.MGBDP0660.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0660");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmProv_DC(MCEventInfo info) {
		ItmProvR r = ItmProvTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0610.CndR bind = mcframe.clientMGBD.MGBDP0610.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0610");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmSls_DC(MCEventInfo info) {
		ItmSlsR r = ItmSlsTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0590.CndR bind = mcframe.clientMGBD.MGBDP0590.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0590");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	protected void doItmFix_DC(MCEventInfo info) {
		ItmFixR r = ItmFixTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0620.CndR bind = mcframe.clientMGBD.MGBDP0620.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			bind.cmn_flg(true);
		}
		else {
			bind.wg_flg(true);
			bind.wg_cd(r.wg_cd());
		}
		bind.term_fr(_cndR.term());
		bind.term_to(_cndR.term());
		bind.calc_ctg_cd(r.calc_ctg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0620");
		so.putCnd(bind);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		setCndMode();
		setDtlMode();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
		setCndMode();
		setDtlMode();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(false);
	}

}