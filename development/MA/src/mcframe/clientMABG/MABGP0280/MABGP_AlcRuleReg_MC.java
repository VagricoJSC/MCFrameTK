package mcframe.clientMABG.MABGP0280;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5160.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_AlcRuleReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_AlcRuleReg_MC extends MABGP_AlcRuleReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _diffUseTyp = getDiffUseTyp();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_AlcRuleReg_MC() {
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
	public MABGP_AlcRuleReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MABGP0290]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0290(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0290");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0290CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0300]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0300(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0300");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0300CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0310]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0310(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0310");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0310CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0320]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0320(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0320");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0320CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0330]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0330(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0330");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0330CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0250]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABGP0250(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0250");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0250CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABGP0290]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0290.CndR crtOpenMABGP0290CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0290.CndR to =
			mcframe.clientMABG.MABGP0290.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0300]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0300.CndR crtOpenMABGP0300CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0300.CndR to =
			mcframe.clientMABG.MABGP0300.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0310]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0310.CndR crtOpenMABGP0310CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0310.CndR to =
			mcframe.clientMABG.MABGP0310.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0320]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0320.CndR crtOpenMABGP0320CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0320.CndR to =
			mcframe.clientMABG.MABGP0320.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0330]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0330.CndR crtOpenMABGP0330CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0330.CndR to =
			mcframe.clientMABG.MABGP0330.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0250]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0250.CndR crtOpenMABGP0250CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0250.CndR to =
			mcframe.clientMABG.MABGP0250.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_coef_cd(fr.alc_coef_cd());
		}
		return to;
	}
	
	/**
	 * [MA_MABGL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Srch01Caller<P extends MABGP_AlcRuleReg, B extends MA_MABGL0280_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0280_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0280_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Upd01Caller<P extends MABGP_AlcRuleReg, B extends MA_MABGL0280_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0280_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0280_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Del01Caller<P extends MABGP_AlcRuleReg, B extends MA_MABGL0280_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0280_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0280_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0280_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0280_Del01();
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getDtl_alc_rule_typ_ListPutter().putBind(AlcRuleTypCols.$i_alc_tgt_typ, columnDtl_alc_tgt_typ);
		for (MAC_ASST_TYP typ : setAsstTyp()) {
			getDtl_asst_typ_ListPutter().putBind(typ.key(), true);
		}
	}
	
	/**
	 * 表示させる資産区分を設定する
	 */
	protected MAC_ASST_TYP[] setAsstTyp() {
		MAC_ASST_TYP[] arrayAsstTyp = 
			{ MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
		return arrayAsstTyp;
	}
	
	/**
	 * ソートの設定
	 */
	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_term, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_alc_ptn_cd, SortType.ASC);
	}
	
	//------------------ イベント Start ------------------//
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc ==Dtl_term_p_PPanel.columnTerm_term) doDtl_term_LC(info);
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}
	
	@Override
	public void doDtl_alc_ptn_cd_LC(MCEventInfo info){
		super.doDtl_alc_ptn_cd_LC(info);
		setOpenButtonMode();
	}

	@Override
	public void doDtl_alc_coef_cd_LC(MCEventInfo info){
		super.doDtl_alc_coef_cd_LC(info);
		setOpenButtonMode();
		int index = info.getEventIndex();
		if (index >= 0) {
			setValueEx(columnDtl_coef_limit_flg, index, false);
		}
	}

	public void doDtl_term_LC(MCEventInfo info) {
		setOpenButtonMode();
	}
	
	@Override
	public void doDtl_alc_tgt_typ_LC(MCEventInfo info) {
		super.doDtl_alc_tgt_typ_LC(info);
		setOpenButtonMode();
		int index = info.getEventIndex();
		if (index >= 0) {
			DtlR r = getDtlL().get(index);
			if (!MAC_ALC_TGT_TYP.isMFG(r.alc_tgt_typ()) && !MAC_ALC_TGT_TYP.isMFG_PURC(r.alc_tgt_typ())) {
				setValueEx(columnDtl_non_os_flg, index, false);
			}
			if (!MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ())) {
				setValueEx(columnDtl_scst_alc_flg, index, false);
			}
		}
	}
	
	@Override
	public void doDtl_alc_rule_typ_LC(MCEventInfo info) {
		super.doDtl_alc_rule_typ_LC(info);
		setOpenButtonMode();
	}
	
	@Override
	public void doDtl_alc_tgt_typ_NC(MCEventInfo info) {
		super.doDtl_alc_tgt_typ_NC(info);
		setValueEx(columnDtl_alc_rule_typ, info.getEventIndex(), null);
		setValueEx(columnDtl_expns_cd, info.getEventIndex(), null);		
	}
	
	/**
	 * 小数部有効桁数のチェック
	 */
	@Override
	public boolean doDtl_dec_place_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isDecPlace(n)){
			return false;
		}
		return super.doDtl_dec_place_VC(info);
	}
	
	// 小数部有効桁数のチェック
	protected boolean isDecPlace(MCNumber n){
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}
	
	//------------------ イベント End ------------------//
	
	protected void setOpenButtonMode() {

		setOpenButtonMode(DtlBtn_open_MABGP0290, getWkTyps());
		setOpenButtonMode(DtlBtn_open_MABGP0300, getExpnsTyps());
		setOpenButtonMode(DtlBtn_open_MABGP0310, getInptTyps());
		setOpenButtonMode(DtlBtn_open_MABGP0320, getOtherTyps());
		setOpenButtonMode(DtlBtn_open_MABGP0330, getAlcTyps());

		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r) || isNull(r.term()) || isNull(r.alc_coef_cd())) {
			DtlBtn_open_MABGP0250.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(DtlBtn_open_MABGP0250);
		}
	}
	
	protected void setOpenButtonMode(MCButton btn, List<String> typs) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r) || isNull(r.term()) || isNull(r.alc_ptn_cd())
				|| openButtonCnd(btn, typs, r)) {
			
			btn.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(btn);
		}
	}
	
	protected boolean openButtonCnd(MCButton btn, List<String> typs, DtlR r) {
		if (DtlBtn_open_MABGP0330 == btn) {
			return isNull(r.alc_tgt_typ())
					|| !(typs.contains(r.alc_tgt_typ()));
		}
		else {
			return isNull(r.alc_rule_typ())
					|| !(typs.contains(r.alc_rule_typ()));
		}
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setOpenButtonMode();
	}
	
	protected List<String> _wkTyps ;
	protected List<String> getWkTyps() { 
		if(_wkTyps == null) {
			_wkTyps = new ArrayList<String>();
			_wkTyps.add(MAC_ALC_RULE_TYP.WK.value());
		}
		return _wkTyps;
	}
	protected List<String> _expnsTyps ;
	protected List<String> getExpnsTyps() {
		if(_expnsTyps == null) {
			_expnsTyps = new ArrayList<String>();
			_expnsTyps.add(MAC_ALC_RULE_TYP.EXPNS_COST.value());
			_expnsTyps.add(MAC_ALC_RULE_TYP.PROFIT.value());
		}
		return _expnsTyps;
	}
	protected List<String> _inptTyps ;
	protected List<String> getInptTyps() {
		if(_inptTyps == null) {
			_inptTyps = new ArrayList<String>();
			_inptTyps.add(MAC_ALC_RULE_TYP.INPT_QTY.value());
		}
		return _inptTyps;
	}
	protected List<String> _otherTyps ;
	protected List<String> getOtherTyps() {
		if(_otherTyps == null) {
			_otherTyps = new ArrayList<String>();
			_otherTyps.add(MAC_ALC_RULE_TYP.OTHER_VAL.value());
		}
		return _otherTyps;
	}
	protected List<String> _alcTyps ;
	protected List<String> getAlcTyps() {
		if(_alcTyps == null) {
			_alcTyps = new ArrayList<String>();
			_alcTyps.add(MAC_ALC_TGT_TYP.ALC.value());
		}
		return _alcTyps;
	}
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	//--------------------セルコンフィグstart-------------------------
	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR row = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_coef_limit_flg) {
					if (isNull(row.alc_coef_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_non_os_flg) {
					if (!MAC_ALC_TGT_TYP.isMFG(row.alc_tgt_typ()) && !MAC_ALC_TGT_TYP.isMFG_PURC(row.alc_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_scst_alc_flg) {
					if (!MAC_ALC_TGT_TYP.isSLS(row.alc_tgt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
	}
	//--------------------セルコンフィグend---------------------------

	//--------------------リストロジック表示制御Start-----------------------
	@Override
	public MCList getDtl_expns_cd(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());		
		if (MAC_ALC_TGT_TYP.isSLS(r.alc_tgt_typ())) {	
			row.addStringColumn(ExpnsCols.$i_expns_typ, MAC_EXPNS_TYP.SGA.value());
		}
		else {
			row.addStringColumn(ExpnsCols.$i_expns_typ, MAC_EXPNS_TYP.PROD.value());
		}
		return super.getDtl_expns_cd(row, info);
	}
	@Override
	public MCList getDtl_diff_calc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDiffCalcTyp(info));
		return super.getDtl_diff_calc_typ(row, info);
	}
	/**
	 * 表示する差異計算区分を取得する
	 */
	protected MAC_DIFF_CALC_TYP[] getDiffCalcTyp(MCEventInfo info) {
		MAC_DIFF_CALC_TYP[] arrayDiffCalcTyp;
		arrayDiffCalcTyp = MAC_DIFF_CALC_TYP.array();

		if (MAC_DIFF_USE_TYP.isNON(_diffUseTyp)) {
			return arrayDiffCalcTyp = MCCollectionUtil.remove(arrayDiffCalcTyp, new MAC_DIFF_CALC_TYP[0],
					MAC_DIFF_CALC_TYP.DIFF1, MAC_DIFF_CALC_TYP.DIFF2, MAC_DIFF_CALC_TYP.DIFF3, MAC_DIFF_CALC_TYP.DIFF4, MAC_DIFF_CALC_TYP.DIFF5);
		}
		if (MAC_DIFF_USE_TYP.isDIFF1(_diffUseTyp)) {
			return arrayDiffCalcTyp = MCCollectionUtil.remove(arrayDiffCalcTyp, new MAC_DIFF_CALC_TYP[0],
					MAC_DIFF_CALC_TYP.DIFF2, MAC_DIFF_CALC_TYP.DIFF3, MAC_DIFF_CALC_TYP.DIFF4, MAC_DIFF_CALC_TYP.DIFF5);
		}
		else if (MAC_DIFF_USE_TYP.isDIFF2(_diffUseTyp)) {
			return arrayDiffCalcTyp = MCCollectionUtil.remove(arrayDiffCalcTyp, new MAC_DIFF_CALC_TYP[0],
					MAC_DIFF_CALC_TYP.DIFF3, MAC_DIFF_CALC_TYP.DIFF4, MAC_DIFF_CALC_TYP.DIFF5);
		}
		else if (MAC_DIFF_USE_TYP.isDIFF3(_diffUseTyp)) {
			return arrayDiffCalcTyp = MCCollectionUtil.remove(arrayDiffCalcTyp, new MAC_DIFF_CALC_TYP[0],
					MAC_DIFF_CALC_TYP.DIFF4, MAC_DIFF_CALC_TYP.DIFF5);
		}
		else if (MAC_DIFF_USE_TYP.isDIFF4(_diffUseTyp)) {
			return arrayDiffCalcTyp = MCCollectionUtil.remove(arrayDiffCalcTyp, new MAC_DIFF_CALC_TYP[0], 
					MAC_DIFF_CALC_TYP.DIFF5);
		}
		return arrayDiffCalcTyp;
	}

	// 原価会社パラメータ情報の差異使用区分を取得
	public static String getDiffUseTyp() {
		return nvl(getCoParmNoCache().diff_use_typ(), MAC_DIFF_USE_TYP.DIFF5.value());
	}
	//--------------------リストロジック表示制御End-----------------------

}