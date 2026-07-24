package mcframe.clientMABC.MABCP1060;

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

import mcframe.clientMAUB.MAUBP0030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.SubAccountCols;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.JnlPtnSeqCols;
import mcframe.clientCore.event.MCEventInfo;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_JnlPatternReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_JnlPatternReg_MC extends MABCP_JnlPatternReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** パタン区分を変更した場合に値をクリアするMCRowBeansの配列(借方) */
	protected MCRowBeans[] _clearBeansWhenChangePatternTypDr;
	/** パタン区分に応じてモード制御するMCmodeBeansの配列(借方) */
	protected MCModeBeans[] _modeControlBeansWhenPatternTypMstDr;
	/** パタン区分を変更した場合に値をクリアするMCRowBeansの配列(貸方) */
	protected MCRowBeans[] _clearBeansWhenChangePatternTypCr;
	/** パタン区分に応じてモード制御するMCmodeBeansの配列(貸方) */
	protected MCModeBeans[] _modeControlBeansWhenPatternTypMstCr;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlPatternReg_MC() {
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
	public MABCP_JnlPatternReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Srch01Caller<P extends MABCP_JnlPatternReg, B extends MA_MABCL1060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1060_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getRsltR(), getRsltAllL().get(0));
		}

		@Override
		protected void moveFocus() {
			if(Cnd_ope_MOD.isSelected()) {
				BaseHdrPanel.focusFirstComponent();
			}
			else {
				CndPanel.focusFirstComponent();
			}
		}

		@Override
		protected void moveFocusNoDown() {
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MA_MABCL1060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Upd01Caller<P extends MABCP_JnlPatternReg, B extends MA_MABCL1060_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1060_Upd01Caller(P p, B b) {
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

		@Override
		protected boolean checkForCall() {
			setupRsltAll();

			return super.checkForCall();
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReq(msgList, getRsltR());
		}
		protected void setupRsltAll() {
			RsltR r = getRsltR().clone();
			r.check(true);
			if (Cnd_ope_UPD.isSelected()) {
				r.setStatus(MCRow.CREATE);
			}
			else {
				r.setStatus(MCRow.MODIFY);
			}
			getRsltAllL().clear();
			getRsltAllL().add(r);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			if (!panel.isStatusNone(getRsltR())) {
				return false;
			}
			return super.isUpBlockStatusNone();
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isUpdOpe()) {
				setFIX_UStatus();
				setValueEx(Cnd_jnl_ptn_cd, getRsltR().jnl_ptn_cd());
				setValueEx(Cnd_jnl_seq, getRsltR().jnl_seq());
			}
		}

		@Override
		protected void statusClear() {
			getRsltR().setStatus(MCRow.NONE);
		}
	}

	/**
	 * [MA_MABCL1060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Del01Caller<P extends MABCP_JnlPatternReg, B extends MA_MABCL1060_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1060_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}

		@Override
		protected boolean checkForCall() {
			setupRsltAll();

			return super.checkForCall();
		}
		protected void setupRsltAll() {
			RsltR r = getRsltR().clone();
			r.check(true);
			r.setStatus(MCRow.DELETE);
			getRsltAllL().clear();
			getRsltAllL().add(r);
		}

		@Override
		protected void statusClear() {
			getRsltR().setStatus(MCRow.NONE);
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL1060_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP1110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP1110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1110CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP1110]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1110.CndR crtOpenMABCP1110CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP1110.CndR to = mcframe.clientMABC.MABCP1110.CndR.create();
		RsltR fr = getRsltR();
		// 借方
		if (Btn_dr_typ_DR.isSelected()) {
			to.jnl_grp_cd(fr.dr_grp_cd());
		}
		// 貸方
		else if (Btn_dr_typ_CR.isSelected()) {
			to.jnl_grp_cd(fr.cr_grp_cd());
		}
		if (!isNull(to.jnl_grp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP1120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP1120(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1120");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1120CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP1120]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1120.CndR crtOpenMABCP1120CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP1120.CndR to = mcframe.clientMABC.MABCP1120.CndR.create();
		RsltR fr = getRsltR();
		// 借方
		if (Btn_dr_typ_DR.isSelected()) {
			to.jnl_grp_cd(fr.dr_grp_cd());
		}
		// 貸方
		else if (Btn_dr_typ_CR.isSelected()) {
			to.jnl_grp_cd(fr.cr_grp_cd());
		}
		if (!isNull(to.jnl_grp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP1130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1130");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1130CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP1130]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1130.CndR crtOpenMABCP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP1130.CndR to = mcframe.clientMABC.MABCP1130.CndR.create();
		RsltR fr = getRsltR();
		// 借方
		if (Btn_dr_typ_DR.isSelected()) {
			to.jnl_grp_cd(fr.dr_grp_cd());
		}
		// 貸方
		else if (Btn_dr_typ_CR.isSelected()) {
			to.jnl_grp_cd(fr.cr_grp_cd());
		}
		if (!isNull(to.jnl_grp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL1060_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL1060_Del01();
	}

	// 一覧がないので以下のメソッドをオーバーライドして無効にする
	@Override
	public MCList<? extends MCConstRow> getDtlL() {
		return null;
	}
	public MCTable getDtlTable() {
		return null;
	}
	@Override
	public void setSortColumn() {
		// 何もしない
	}
	@Override
	public void fillSpace() {
		// 何もしない
	}

	// 借方・貸方の制御 ---------------------------------------------------------
	
	/** パタン区分を変更した場合に値をクリアするMCRowBeansの配列を返します。 */
	protected MCRowBeans[] getClearBeansWhenChangePatternTypDr() {
		if (_clearBeansWhenChangePatternTypDr == null) {
			_clearBeansWhenChangePatternTypDr = new MCRowBeans[] {
					Rslt_dr_grp_cd, Rslt_dr_ac_cd, Rslt_dr_ac_tax_cd,
					Rslt_dr_itm_typ, Rslt_dr_amt_typ, Rslt_dr_abs_typ,
					Rslt_dr_abstract, };
		}
		return _clearBeansWhenChangePatternTypDr;
	}

	/** パタン区分に応じてモード制御するMCRowBeansの配列を返します。 */
	protected MCModeBeans[] getModeControlBeansWhenPatternTypMstDr() {
		if (_modeControlBeansWhenPatternTypMstDr == null) {
			_modeControlBeansWhenPatternTypMstDr = new MCModeBeans[] {
					Rslt_dr_ac_cd, Rslt_dr_ac_tax_cd, Rslt_dr_itm_typ,
					Rslt_dr_amt_typ, Rslt_dr_abs_typ, Rslt_dr_abstract };
		}
		return _modeControlBeansWhenPatternTypMstDr;
	}
	
	/** パタン区分を変更した場合に値をクリアするMCRowBeansの配列を返します。 */
	protected MCRowBeans[] getClearBeansWhenChangePatternTypCr() {
		if (_clearBeansWhenChangePatternTypCr == null) {
			_clearBeansWhenChangePatternTypCr = new MCRowBeans[] {
					Rslt_cr_grp_cd, Rslt_cr_ac_cd, Rslt_cr_ac_tax_cd,
					Rslt_cr_itm_typ, Rslt_cr_amt_typ, Rslt_cr_abs_typ,
					Rslt_cr_abstract };
		}
		return _clearBeansWhenChangePatternTypCr;
	}

	/** パタン区分に応じてモード制御するMCRowBeansの配列を返します。 */
	protected MCModeBeans[] getModeControlBeansWhenPatternTypMstCr() {
		if (_modeControlBeansWhenPatternTypMstCr == null) {
			_modeControlBeansWhenPatternTypMstCr = new MCModeBeans[] {
					Rslt_cr_ac_cd, Rslt_cr_ac_tax_cd, Rslt_cr_itm_typ,
					Rslt_cr_amt_typ, Rslt_cr_abs_typ, Rslt_cr_abstract };
		}
		return _modeControlBeansWhenPatternTypMstCr;
	}

	//--------------------リストロジック表示制御Start-----------------------

	// - コンボ:引数 ---------------------------------------------------------

	@Override
	public MCList getCnd_jnl_seq(MCRow row, MCEventInfo info) {
		row.setValueNE(JnlPtnSeqCols.$i_jnl_ptn_cd, getCndR().jnl_ptn_cd());
		return super.getCnd_jnl_seq(row, info);
	}
	
	// - 借方 --------------------------------------------------------------

	/** 補助勘定科目コンボ:引数 */
	@Override
	public MCList getRslt_dr_sub_ac_cd(MCRow row, MCEventInfo info) {
		row.setValueNE(SubAccountCols.$i_ac_cd, getRsltR().dr_ac_cd());
		return super.getRslt_dr_sub_ac_cd(row, info);
	}
	
	// - 貸方 --------------------------------------------------------------
	
	/** 補助勘定科目コンボ:引数 */
	@Override
	public MCList getRslt_cr_sub_ac_cd(MCRow row, MCEventInfo info) {
		row.setValueNE(SubAccountCols.$i_ac_cd, getRsltR().cr_ac_cd());
		return super.getRslt_cr_sub_ac_cd(row, info);
	}

	//--------------------リストロジック表示制御End-----------------------
	
	// - ListChangedイベント -----------------------------------
	// - 借方 --------------------------------------------------------------
	/** 仕訳部門区分 */
	@Override
	public void doRslt_dr_dpt_typ_LC(MCEventInfo info) {
		super.doRslt_dr_dpt_typ_LC(info);
		setValueEx(Rslt_dr_dpt_cd, null);
		setDrDptTypAttrsMode();
	}
	
	/** パタン区分 */
	@Override
	public void doRslt_dr_ptn_typ_LC(MCEventInfo info) {
		super.doRslt_dr_ptn_typ_LC(info);
		for(MCRowBeans rb : getClearBeansWhenChangePatternTypDr()){
			setValueEx(rb, null);
		}
		setDrPtnTypAttrsMode();
	}
	
	/** 勘定科目 */
	@Override
	public void doRslt_dr_ac_cd_LC(MCEventInfo info) {
		super.doRslt_dr_ac_cd_LC(info);
		//補助勘定科目、取引先区分をクリア
		setValueEx(Rslt_dr_sub_ac_cd, null);
		setValueEx(Rslt_dr_bp_typ, null);
		if(!isNull(getRsltR().dr_ac_cd()) && !getRsltR().dr_bp_flg()){
			setValueEx(Rslt_dr_bp_typ, MAC_BP_SET_TYP.NON.value());
		}
		setDrAcCdAttrsMode();
	}
	
	/** 取引先区分 */
	@Override
	public void doRslt_dr_bp_typ_LC(MCEventInfo info) {
		super.doRslt_dr_bp_typ_LC(info);
		setValueEx(Rslt_dr_bp_cd, null);
		setDrBpTypAttrsMode();
	}
	
	
	// - 貸方 --------------------------------------------------------------
	/** 仕訳部門区分 */
	@Override
	public void doRslt_cr_dpt_typ_LC(MCEventInfo info) {
		super.doRslt_cr_dpt_typ_LC(info);
		setValueEx(Rslt_cr_dpt_cd, null);
		setCrDptTypAttrsMode();
	}
	
	/** パタン区分 */
	@Override
	public void doRslt_cr_ptn_typ_LC(MCEventInfo info) {
		super.doRslt_cr_ptn_typ_LC(info);
		for(MCRowBeans rb : getClearBeansWhenChangePatternTypCr()){
			setValueEx(rb, null);
		}
		setCrPtnTypAttrsMode();
	}
	
	/** 勘定科目 */
	@Override
	public void doRslt_cr_ac_cd_LC(MCEventInfo info) {
		super.doRslt_cr_ac_cd_LC(info);
		//補助勘定科目、取引先区分をクリア
		setValueEx(Rslt_cr_sub_ac_cd, null);
		setValueEx(Rslt_cr_bp_typ, null);
		if(!isNull(getRsltR().cr_ac_cd()) && !getRsltR().cr_bp_flg()){
			setValueEx(Rslt_cr_bp_typ, MAC_BP_SET_TYP.NON.value());
		}
		setCrAcCdAttrsMode();
	}
	
	/** 取引先区分 */
	@Override
	public void doRslt_cr_bp_typ_LC(MCEventInfo info) {
		super.doRslt_cr_bp_typ_LC(info);
		setValueEx(Rslt_cr_bp_cd, null);
		setCrBpTypAttrsMode();
	}
	
	
	// - Status設定 ---------------------------------------------------------
	// - 借方 --------------------------------------------------------------
	/**
	 * 仕訳部門区分、パタン区分、勘定科目等によって各フィールドのモードを設定する。
	 */
	protected void setModeDr(){
		setDrDptTypAttrsMode();
		setDrPtnTypAttrsMode();
		setDrAcCdAttrsMode();
		setDrBpTypAttrsMode();
	}
	
	/**
	 * 仕訳部門区分属性項目のモードを制御する<br>
	 */
	protected void setDrDptTypAttrsMode() {
		if (MAC_DPT_TYP.isFIX(getRsltR().dr_dpt_typ())){
			setDefaultMode(Rslt_dr_dpt_cd);
		}
		else {
			Rslt_dr_dpt_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	
	/**
	 * パタン区分属性項目のモードを制御する<br>
	 */
	protected void setDrPtnTypAttrsMode() {
		String patternTyp = getRsltR().dr_ptn_typ();
		if (MAC_PTN_TYP.isMST(patternTyp)){
			for(MCModeBeans rb : getModeControlBeansWhenPatternTypMstDr()){
				setDefaultMode(rb);	
			}
		}
		else {
			for(MCModeBeans rb : getModeControlBeansWhenPatternTypMstDr()){
				rb.setMode(MCMode.READ_ONLY);
			}
		}

		if (MAC_PTN_TYP.isRSN(patternTyp) 
				|| MAC_PTN_TYP.isJNL(patternTyp)
				|| MAC_PTN_TYP.isAC(patternTyp)){
			setDefaultMode(Rslt_dr_grp_cd);// 仕訳グループ
		}
		else{
			Rslt_dr_grp_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 勘定科目属性項目のモード・値を制御する<br>
	 * 補助勘定科目使用・取引先使用を考慮する
	 */
	protected void setDrAcCdAttrsMode() {
		String acCd = getRsltR().dr_ac_cd();
		if (isNull(acCd)) {
			Rslt_dr_sub_ac_cd.setMode(MCMode.READ_ONLY);
			Rslt_dr_bp_typ.setMode(MCMode.READ_ONLY);
			Rslt_dr_bp_cd.setMode(MCMode.READ_ONLY);
			return;
		}

		// 補助勘定科目の制御 ------------------
		// 勘定科目マスタのsub_flgがtrueの場合は補助勘定科目を必須登録とする
		if (getRsltR().dr_sub_flg()) {
			setDefaultMode(Rslt_dr_sub_ac_cd);
		}
		else {
			Rslt_dr_sub_ac_cd.setMode(MCMode.READ_ONLY);
		}

		// 取引先区分の制御 -------------------
		// 勘定科目マスタのbp_flgがtrueの場合は取引先区分を必須登録とする
		if (getRsltR().dr_bp_flg()) {
			setDefaultMode(Rslt_dr_bp_typ);
		}
		else {
			Rslt_dr_bp_typ.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 取引先区分属性のモードを制御する
	 */
	protected void setDrBpTypAttrsMode() {
		String bpTyp = getRsltR().dr_bp_typ();
		if (isNull(bpTyp) || MAC_BP_SET_TYP.isNON(bpTyp) || !getRsltR().dr_bp_flg()) {
			Rslt_dr_bp_cd.setMode(MCMode.READ_ONLY);
		}
		// 取引先出力区分が5:固定値(取引先区分1)/6:固定値(取引先区分2)の場合は、
		// 取引先ＣＤを必須入力とする
		else if (MAC_BP_SET_TYP.isFIX_CST(bpTyp) || MAC_BP_SET_TYP.isFIX_SPL(bpTyp)) {
			setDefaultMode(Rslt_dr_bp_cd);
		}
		else {
			Rslt_dr_bp_cd.setMode(MCMode.ENABLE);
		}
	}
	
	
	// - 貸方 --------------------------------------------------------------
	/**
	 * 仕訳部門区分、パタン区分、勘定科目等によって各フィールドのモードを設定する。
	 */
	protected void setModeCr(){
		setCrDptTypAttrsMode();
		setCrPtnTypAttrsMode();
		setCrAcCdAttrsMode();
		setCrBpTypAttrsMode();
	}
	
	/**
	 * 仕訳部門区分属性項目のモードを制御する<br>
	 */
	protected void setCrDptTypAttrsMode() {
		if (MAC_DPT_TYP.isFIX(getRsltR().cr_dpt_typ())){
			setDefaultMode(Rslt_cr_dpt_cd);
		}
		else {
			Rslt_cr_dpt_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * パタン区分属性項目のモードを制御する<br>
	 */
	protected void setCrPtnTypAttrsMode() {
		String patternTyp = getRsltR().cr_ptn_typ();
		if (MAC_PTN_TYP.isMST(patternTyp)){
			for(MCModeBeans rb : getModeControlBeansWhenPatternTypMstCr()){
				setDefaultMode(rb);	
			}
		}
		else {
			for(MCModeBeans rb : getModeControlBeansWhenPatternTypMstCr()){
				rb.setMode(MCMode.READ_ONLY);
			}
		}

		if (MAC_PTN_TYP.isRSN(patternTyp) 
				|| MAC_PTN_TYP.isJNL(patternTyp)
				|| MAC_PTN_TYP.isAC(patternTyp)){
			setDefaultMode(Rslt_cr_grp_cd);// 仕訳グループ
		}
		else{
			Rslt_cr_grp_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 勘定科目属性項目のモード・値を制御する<br>
	 * 補助勘定科目使用・取引先使用を考慮する
	 */
	protected void setCrAcCdAttrsMode() {
		String acCd = getRsltR().cr_ac_cd();
		if (isNull(acCd)) {
			Rslt_cr_sub_ac_cd.setMode(MCMode.READ_ONLY);
			Rslt_cr_bp_typ.setMode(MCMode.READ_ONLY);
			Rslt_cr_bp_cd.setMode(MCMode.READ_ONLY);
			return;
		}

		// 補助勘定科目の制御 ------------------
		// 勘定科目マスタのsub_flgがtrueの場合は補助勘定科目を必須登録とする
		if (getRsltR().cr_sub_flg()) {
			setDefaultMode(Rslt_cr_sub_ac_cd);
		}
		else {
			Rslt_cr_sub_ac_cd.setMode(MCMode.READ_ONLY);
		}

		// 取引先区分の制御 -------------------
		// 勘定科目マスタのbp_flgがtrueの場合は取引先区分を必須登録とする
		if (getRsltR().cr_bp_flg()) {
			setDefaultMode(Rslt_cr_bp_typ);
		}
		else {
			Rslt_cr_bp_typ.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 取引先区分属性のモードを制御する
	 */
	protected void setCrBpTypAttrsMode() {
		String bpTyp = getRsltR().cr_bp_typ();
		if (isNull(bpTyp) || MAC_BP_SET_TYP.isNON(bpTyp) || !getRsltR().cr_bp_flg()) {
			Rslt_cr_bp_cd.setMode(MCMode.READ_ONLY);
		}
		// 取引先出力区分が5:固定値(取引先区分1)/6:固定値(取引先区分2)の場合は、
		// 取引先ＣＤを必須入力とする
		else if (MAC_BP_SET_TYP.isFIX_CST(bpTyp) || MAC_BP_SET_TYP.isFIX_SPL(bpTyp)) {
			setDefaultMode(Rslt_cr_bp_cd);
		}
		else {
			Rslt_cr_bp_cd.setMode(MCMode.ENABLE);
		}
	}


	@Override
	protected void clearAll() {
		getRsltR().clearAll();
	}

	// - Status --------------------------------

	@Override
	protected boolean doCndOpeVC(MCEventInfo info) {
		return (isStatusNone(getRsltR()) || confirmRegDataClear());
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		if (isUpdOpe()) {
			// 参照登録時、登録ユーザIDや更新カウンタ等を削除
			if (getStatus() == REF) {
				setRowStatusForIns(getRsltR());
				clearNotInheritInfo(getRsltR());
			}
			else {
				clearAll();
			}
			setUPDStatus();
			BaseHdrPanel.focusFirstComponent();
		}
		// 参照訂正時
		else if (isModOpe() && getStatus() == REF) {
			setMODStatus();
			BaseHdrPanel.focusFirstComponent();
		}
		else {
			clearAll();
			setSRCHStatus();
			CndPanel.focusFirstComponent();
		}
	}

	@Override
	protected void setStatusByOpe() {
		if (isUpdOpe()) {
			setUPDStatus();
		}
		else if (isDelOpe()) {
			setDELStatus();
		}
		else if (isModOpe()) {
			setMODStatus();
		}
		else if (isRefOpe()) {
			setREFStatus();
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setModeDr();
		setModeCr();
	}
	@Override
	public void setMODStatus() {
		super.setMODStatus();
		setModeDr();
		setModeCr();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_JNL_PTN));
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getRslt_dr_bp_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDrBpSetTyp(info));
		return super.getRslt_dr_bp_typ(row, info);
	}
	@Override
	public MCList getRslt_cr_bp_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getCrBpSetTyp(info));
		return super.getRslt_cr_bp_typ(row, info);
	}
	/**
	 * 表示する取引先区分（借方）を取得する
	 */
	protected MAC_BP_SET_TYP[] getDrBpSetTyp(MCEventInfo info) {
		if (getRsltR().dr_bp_flg()) {
			return new MAC_BP_SET_TYP[] { MAC_BP_SET_TYP.AR, MAC_BP_SET_TYP.CST, MAC_BP_SET_TYP.SPL, MAC_BP_SET_TYP.AP,
					MAC_BP_SET_TYP.CRE, MAC_BP_SET_TYP.FIX_CST, MAC_BP_SET_TYP.FIX_SPL, MAC_BP_SET_TYP.SO_CST,
					MAC_BP_SET_TYP.SO_SPL };
		}
		return MAC_BP_SET_TYP.array();
	}
	/**
	 * 表示する取引先区分（貸方）を取得する
	 */
	protected MAC_BP_SET_TYP[] getCrBpSetTyp(MCEventInfo info) {
		if (getRsltR().cr_bp_flg()) {
			return new MAC_BP_SET_TYP[] { MAC_BP_SET_TYP.AR, MAC_BP_SET_TYP.CST, MAC_BP_SET_TYP.SPL, MAC_BP_SET_TYP.AP,
					MAC_BP_SET_TYP.CRE, MAC_BP_SET_TYP.FIX_CST, MAC_BP_SET_TYP.FIX_SPL, MAC_BP_SET_TYP.SO_CST,
					MAC_BP_SET_TYP.SO_SPL };
		}
		return MAC_BP_SET_TYP.array();
	}
	//--------------------リストロジック表示制御End-----------------------

}