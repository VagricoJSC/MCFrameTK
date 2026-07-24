package mcframe.clientMABS.MABSP0040;

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
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5210.*;
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
import mcframe.clientCore.container.MCRowEvent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_BomExSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_BomExSrch_MC extends MABSP_BomExSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _is_expand_all = false;
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_BomExSrch_MC() {
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
	public MABSP_BomExSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0040_Srch01Caller<P extends MABSP_BomExSrch, B extends MA_MABSL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			if(_is_expand_all){
				Dtl_hrrchy_p_PPanel.showExpandAll(getDtlL());
			}
			else{
				Dtl_hrrchy_p_PPanel.showCollapseAll(getDtlL());
			}
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setMode() {
			setREFStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.leaf(r.itm_cd());
			}
			_cndR = getCndR().clone();
		}
		@Override
		protected void clear() {
			super.clear();

			clearAll();
		}
	}

	/**
	 * [MA_MABSL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABSL0040_Srch02Caller<P extends MABSP_BomExSrch, B extends MA_MABSL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			setCnd();

			super.setupUpParam();
		}
		protected void setCnd() {
			getCnd2R().st_dt_to(_cndR.base_dt());
			getCnd2R().end_dt_fr(_cndR.base_dt());

			DtlR r = DtlTable.getSelectedMCRow();
			if (r != null) {
				getCnd2R().itm_cd(r.itm_cd());
				getCnd2R().itm_sub1(r.itm_sub1());
				getCnd2R().itm_sub2(r.itm_sub2());
				getCnd2R().itm_sub3(r.itm_sub3());
				getCnd2R().wg_cd(r.wg_cd());
				getCnd2R().bom_ptn(r.bom_ptn());
			}
		}

		@Override
		protected void moveFocus() {
			Wrk1DtlTable.selectRowNoFocus(0);
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk4DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);
			Wrk6DtlTable.selectRowNoFocus(0);
			Wrk7DtlTable.selectRowNoFocus(0);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMA_MABSL0040_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMA_MABSL0040_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[srch_dtl]の押下時の処理
	 */
	@Override
	public void doDtlBtn_srch_dtl(MCEventInfo info) {
		callMA_MABSL0040_Srch02();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP0040_EX1]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP0040_EX1(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0040CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP0040_EX2]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP0040_EX2(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0040CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0040.CndR crtOpenMABSP0040CndR(MAUCP_AppScreenOpener aso) {
		CndR to = CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if(Cnd_ope_EX1.isSelected()) {
			to.ope(Cnd_ope_EX2.getActionCommand());
			to.ver_no(r.ver_no());
		}
		else {
			to.ope(Cnd_ope_EX1.getActionCommand());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.bom_ptn(r.bom_ptn());
		if (_cndR != null) {
			to.base_dt(_cndR.base_dt());
			to.wg_cd(_cndR.wg_cd());
		}
		return to;
	}


	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] { Wrk1DtlTable, Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable, Wrk5DtlTable, Wrk6DtlTable,
				Wrk7DtlTable };
	}

	protected String[] _dummyStringArray = {};
	
	/**
	 * キー項目を返します。
	 * @param list
	 * @return
	 */
	protected String[] getDtlRKeyColumns(MCList<? extends MCConstRow> list) {
		MCConstRow r = list.createRow();
		return r.getKeys().toArray(_dummyStringArray);
	}
	//------------------ 汎用メソッド End ------------------//

	@Override
	protected void listenerInit() {
		super.listenerInit();
	}

	@Override
	public void fillSpace() {
		// 何もしない
	}
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 何もしない
	}
	@Override
	protected void setStatusByOpe() {
		// 何もしない
	}
	@Override
	protected void setOpeMode() {
		// 何もしない
	}
	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		setOpenBtnMode();
	}

	protected void setCndMode() {
		if (Cnd_ope_EX1.isSelected()) {
			setDefaultMode(Cnd_bom_ptn);
			Cnd_ver_no.setMode(MCMode.READ_ONLY);
			setValueEx(Cnd_ver_no, null) ;
		}
		else {
			Cnd_bom_ptn.setMode(MCMode.ENABLE);
			setDefaultMode(Cnd_ver_no);
		}
	}
	protected void setOpenBtnMode() {
		if (Cnd_ope_EX1.isSelected()) {
			DtlBtn_open_MABSP0040_EX1.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtn_open_MABSP0040_EX2.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void setSortColumn() {
		for (MCTable<?> tbl : getDtlTables()) {
			for (MCColumnConfig c : getColumnConfigs(tbl,
					tbl.getList().createRow().getKeys().toArray(_dummyStringArray))) {
				tbl.addSortColumn(c, MCList.SortType.ASC);
			}
		}
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getWrk1DtlL().clear();
		getWrk2DtlL().clear();
		getWrk3DtlL().clear();
		getWrk4DtlL().clear();
		getWrk5DtlL().clear();
		getWrk6DtlL().clear();
		getWrk7DtlL().clear();
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_base_qty, MCNumber.ONE);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.moveColumns(columnDtl_ext, columnDtl_bottom_flg);
		DtlTable.moveColumns(columnDtl_min_sno1, columnDtl_max_sno1, columnDtl_min_sno2,
				columnDtl_max_sno2, columnDtl_min_sno3, columnDtl_max_sno3);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Cnd_sno_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, Cnd_sno1_mng_typ,
				Cnd_sno2_mng_typ, Cnd_sno3_mng_typ, Cnd_sno4_mng_typ);

		Dtl_qty1_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_qty2_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty3_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty4_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty5_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_qty6_p_PPanel.setRelateBeans(columnDtl_chd_unit_cd, columnDtl_chd_dec_place);
		Dtl_min_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ,
				columnDtl_sno4_mng_typ);
		Dtl_max_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ,
				columnDtl_sno4_mng_typ);

		Wrk1Dtl_qty1_p_PPanel.setRelateBeans(columnWrk1Dtl_unit_cd, columnWrk1Dtl_dec_place);
		Wrk1Dtl_qty2_p_PPanel.setRelateBeans(columnWrk1Dtl_unit_cd, columnWrk1Dtl_dec_place);
		Wrk1Dtl_sno_p_PPanel.setRelateBeans(columnWrk1Dtl_itm_cd, columnWrk1Dtl_itm_sub1, columnWrk1Dtl_itm_sub2,
				columnWrk1Dtl_itm_sub3, columnWrk1Dtl_sno1_mng_typ, columnWrk1Dtl_sno2_mng_typ,
				columnWrk1Dtl_sno3_mng_typ, columnWrk1Dtl_sno4_mng_typ);

		Wrk2Dtl_qty1_p_PPanel.setRelateBeans(columnWrk2Dtl_itm_unit_cd, columnWrk2Dtl_itm_dec_place);
		Wrk2Dtl_qty2_p_PPanel.setRelateBeans(columnWrk2Dtl_itm_unit_cd, columnWrk2Dtl_itm_dec_place);

		Wrk3Dtl_qty_p_PPanel.setRelateBeans(columnWrk3Dtl_base_unit_cd, columnWrk3Dtl_itm_dec_place);

		Wrk5Dtl_qty1_p_PPanel.setRelateBeans(columnWrk5Dtl_base_unit_cd, columnWrk5Dtl_dec_place);
		Wrk5Dtl_qty2_p_PPanel.setRelateBeans(columnWrk5Dtl_base_unit_cd, columnWrk5Dtl_dec_place);
		Wrk5Dtl_qty3_p_PPanel.setRelateBeans(columnWrk5Dtl_base_unit_cd, columnWrk5Dtl_dec_place);
		Wrk5Dtl_str_ln1_p_PPanel.setRelateBeans(columnWrk5Dtl_gi_loc_cd, columnWrk5Dtl_gi_str_ln_tgt_flg);
		Wrk5Dtl_str_ln2_p_PPanel.setRelateBeans(columnWrk5Dtl_inpt_gi_loc_cd, columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		Wrk5Dtl_str_ln3_p_PPanel.setRelateBeans(columnWrk5Dtl_ship_gi_loc_cd, columnWrk5Dtl_ship_gi_str_ln_tgt_flg);

		Wrk6Dtl_qty_p_PPanel.setRelateBeans(columnWrk6Dtl_unit_cd, columnWrk6Dtl_dec_place);
	}

	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);

		if (dc == Wrk1DtlTable) {
			doWrk1Dtl_DC(info);
		}
		else if (dc == Wrk2DtlTable) {
			doWrk2Dtl_DC(info);
		}
		else if (dc == Wrk3DtlTable) {
			doWrk3Dtl_DC(info);
		}
		else if (dc == Wrk4DtlTable) {
			doWrk4Dtl_DC(info);
		}
		else if (dc == Wrk5DtlTable) {
			doWrk5Dtl_DC(info);
		}
		else if (dc == Wrk6DtlTable) {
			doWrk6Dtl_DC(info);
		}
		else if (dc == Wrk7DtlTable) {
			doWrk7Dtl_DC(info);
		}
	}

	protected void doWrk1Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0010");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0010CndR(aso, getWrk1DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0010.CndR crtOpenMABSP0010CndR(MAUCP_AppScreenOpener aso, Wrk1DtlR fr) {
		mcframe.clientMABS.MABSP0010.CndR to = mcframe.clientMABS.MABSP0010.CndR.create();
		if (isNull(getSysParm("DEF_WG_CD"))) {
			if (isNullOrNullVal(fr.wg_cd())) {
				to.cmn_flg(true);
			}
			else {
				to.wg_flg(true);
				to.wg_cd(fr.wg_cd());
			}
		}
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		return to;
	}

	protected void doWrk2Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0090CndR(aso, getWrk2DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0090.CndR crtOpenMABSP0090CndR(MAUCP_AppScreenOpener aso, Wrk2DtlR fr) {
		mcframe.clientMABS.MABSP0090.CndR to = mcframe.clientMABS.MABSP0090.CndR.create();
		if (isNullOrNullVal(fr.loc_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(fr.wg_cd());
			to.loc_cd(fr.loc_cd());
		}
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		return to;
	}

	protected void doWrk3Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0110CndR(aso, getWrk3DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0110.CndR crtOpenMABSP0110CndR(MAUCP_AppScreenOpener aso, Wrk3DtlR fr) {
		mcframe.clientMABS.MABSP0110.CndR to = mcframe.clientMABS.MABSP0110.CndR.create();
		if (isNullOrNullVal(fr.loc_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(fr.wg_cd());
			to.loc_cd(fr.loc_cd());
		}
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		return to;
	}

	protected void doWrk4Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0150");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0150CndR(aso, getWrk4DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0150.CndR crtOpenMABSP0150CndR(MAUCP_AppScreenOpener aso, Wrk4DtlR fr) {
		mcframe.clientMABS.MABSP0150.CndR to = mcframe.clientMABS.MABSP0150.CndR.create();
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.loc_cd(fr.loc_cd());
		return to;
	}

	protected void doWrk5Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0800");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0800CndR(aso, getWrk5DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0800.CndR crtOpenMABSP0800CndR(MAUCP_AppScreenOpener aso, Wrk5DtlR fr) {
		mcframe.clientMABS.MABSP0800.CndR to = mcframe.clientMABS.MABSP0800.CndR.create();
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.loc_cd(fr.loc_cd());
		return to;
	}

	protected void doWrk6Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0170");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0170CndR(aso, getWrk6DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0170.CndR crtOpenMABSP0170CndR(MAUCP_AppScreenOpener aso, Wrk6DtlR fr) {
		mcframe.clientMABS.MABSP0170.CndR to = mcframe.clientMABS.MABSP0170.CndR.create();
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.insp_ptn_cd(fr.insp_ptn_cd());
		return to;
	}

	protected void doWrk7Dtl_DC(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0190");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0190CndR(aso, getWrk7DtlL().get(info.getEventIndex())));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0190.CndR crtOpenMABSP0190CndR(MAUCP_AppScreenOpener aso, Wrk7DtlR fr) {
		mcframe.clientMABS.MABSP0190.CndR to = mcframe.clientMABS.MABSP0190.CndR.create();
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		return to;
	}

}