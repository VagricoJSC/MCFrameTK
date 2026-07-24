package mcframe.clientMSBG.MSBGP0200;

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

import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0420.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_AdvRcvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_AdvRcvReg_MC extends MSBGP_AdvRcvReg_MC_A implements IfOpePanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 入金情報の検索時に上書きされないフィールドの変更を制御するためのフラグ
	 */
	protected boolean _isRmrksChange = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_AdvRcvReg_MC() {
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
	public MSBGP_AdvRcvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Srch01Caller<P extends MSBGP_AdvRcvReg, B extends MS_MSBGL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0200_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();

			setValueEx(AdvRcv_div_flg, getRcvR().div_flg());
			setAmountFields();
			getRcvR().base_cur_cd(getBaseCur().cur_cd());
			getRcvR().xrate_cd(getCo().sls_xrate_cd());
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());	
			_isRmrksChange = false; // 伝票備考の変更フラグをリセット
			
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			// 参照の場合は個別のモード設定は行わない
			if (Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected()) {
				setTabPaneMode(getHdrR().trd_ptn_typ());
			}
			// 更新の場合
			else {
				setModeByTrdCd();
				setAmt2Mode();
				setArSttlCd2Mode();
				statusClear();
			}
		}
	
	}

	/**
	 * [MS_MSBGL0200_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Srch02Caller<P extends MSBGP_AdvRcvReg, B extends MS_MSBGL0200_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		String _trdPtnTyp;	// 取引パタン区分
		
		protected MS_MSBGL0200_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			// HdrRの入金実績情報をRcvRにコピーする。
			bridge.up0().rcv_act_no(getHdrR().rcv_act_no());
			bridge.up0().rcv_act_seq(getHdrR().rcv_act_seq());
			bridge.up0().ac_dt(getHdrR().ac_dt());
			
			// 検索前の値を取得
			_trdPtnTyp = getHdrR().trd_ptn_typ();
			
			bridge.down0().old_rcst_cd(bridge.down0().rcst_cd());
			bridge.down0().old_bcst_cd(bridge.down0().bcst_cd());
			bridge.down0().old_bill_dpt_cd(bridge.down0().bill_dpt_cd());
		}
	
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Rcv_rcv_no));	
			msgList.addAll(panel.checkReq(Hdr_ac_dt));	
		}
		
		@Override
		protected void show() {
			super.show();
			
			// 組み合わせエラーチェック
			if (!chkTrdRcv(_trdPtnTyp, getRcvR().dat_typ())) {
				return;
			}
			
			setAmountFields();
		}
		
		@Override
		protected void setMode() {
			//ステータスを戻す
			if(_isRmrksChange){
				getHdrR().setStatus(Status.MODIFY);
			}	
			
			setModeByTrdCd();
			setRefRcvMode();
			setAmt2Mode();
			setArSttlCd2Mode();	
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_INS.isSelected()) {
				setSRCH_NEW_RCVStatus();
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setSRCH_RCVStatus();
			}
		}
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			RcvPanel.focusFirstComponent();
		}
		
		/**
		 * 入金情報検索時、各種項目が設定されていない入金情報を参照していた場合は、各項目は入力できる。
		 */
		protected void setRefRcvMode() {		
			if (isNull(getRcvR().rcst_cd())) {
				Rcv_rcst_cd.setMode(MCMode.REQUIRED);
			}
			if (isNull(getRcvR().bcst_cd())) {
				if(MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ())){
					Rcv_bcst_cd.setMode(MCMode.REQUIRED);
				}	
			}
			
			if (isNull(getRcvR().bill_dpt_cd()) && !isNull(getRcvR().bcst_cd())) {
				if(MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isRCV_SUSP(getHdrR().trd_ptn_typ())){
					Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
				}
			}
		}
		
	}
	
	/**
	 * [MS_MSBGL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Ins01Caller<P extends MSBGP_AdvRcvReg, B extends MS_MSBGL0200_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0200_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		protected void show() {
			super.show();
		}
	}

	/**
	 * [MS_MSBGL0200_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Upd01Caller<P extends MSBGP_AdvRcvReg, B extends MS_MSBGL0200_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0200_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		protected void show() {
			super.show();
			// 表示用のフィールドへコピー
			getCndR().rcv_act_no(getHdrR().rcv_act_no());
		}
	}

	/**
	 * [MS_MSBGL0200_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0200_Del01Caller<P extends MSBGP_AdvRcvReg, B extends MS_MSBGL0200_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBGL0200_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
		@Override
		public void setMode(){
			setFIX_DStatus();
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}

	}
	
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		
		Rcv_xrate_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_base_cur_cd, Rcv_xrate_cd, Hdr_ac_dt, true);
		Rcv_rcv_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		Rcv_not_proc_bal_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		
		AdvRcv_amt1_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
		AdvRcv_amt2_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);

		AdvRcv_appl_amt_p_PPanel.setRelateBeans(Rcv_trd_cur_cd, Rcv_amt_dec_place);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rcv_rcv_amt.addNCListener(this);
		AdvRcv_amt1.addNCListener(this);
		AdvRcv_amt2.addNCListener(this);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getRcv_slo_no_ListPutter().putBind(SloNoCols.$i_adv_rcv_flg, true);
		getRcv_slo_no_ListPutter().putBind(SloNoCols.$m_slo_d_no_srh_flg, MCMode.READ_ONLY.getName());
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0200_Srch01();
	}
	/**
	 * Panel[Rcv]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doRcv_srch(MCEventInfo info) {
		callMS_MSBGL0200_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBGL0200_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0200_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBGL0200_Del01();
	}
	
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		
		// 入金Ｎｏでの検索
		if (T1 == openTyp) {
			
			valueInit();

			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			getHdrR().setStatus(Status.NONE);
			setValueEx(Hdr_trd_cd, getInitSlip(bind.getStringNE("dat_typ")));
			getRcvR().rcv_no(bind.getStringNE("rcv_no"));
			
			addDoBehind(Rcv_srch);
			
		}

	}
	
	protected String getInitSlip(String datTyp) {
		
		// 仮受
		if (MSC_RCV_DAT_TYP.isSUSP(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value());
		}
		// 入金
		else if (MSC_RCV_DAT_TYP.isRCV(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.RCV_ADV.value());
		}
		// 前受
		else if (MSC_RCV_DAT_TYP.isADV(datTyp)) {
			return getDefaultTrdCd(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value());
		}
		
		return null;
		
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getRcv_bill_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getRcv_debt_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getRcv_cred_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setDefaultValues();
	}
	
	protected void setDefaultValues() {

		setValueEx(Hdr_ac_dt, getToday());
		setValueEx(Rcv_trd_cur_cd, getBaseCur().cur_cd());
		
		setBaseCurValues();
		setINSStatus();
	}
	
	/**
	 * 基準通貨、為替レートＣＤのデフォルト値を設定する
	 * 
	 */
	protected void setBaseCurValues() {
		setValueEx(Rcv_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Rcv_xrate_cd, getCo().sls_xrate_cd());
	}
	
	protected boolean chkTrdRcv(String trdPtnTyp, String DatTyp) {
		// 入金ＮＯが入力済みで、入金検索済みの場合のみチェックを行う。
		if (isNull(trdPtnTyp) || isNull(DatTyp)) {
			return true;
		}
		
		MCMessage m = _chkTrdRcv(trdPtnTyp, DatTyp);
		
		if (m != null) {
			dialog(m);
			return false;
		}
		
		return true;
	}
	
	/**
	 * 取引パタン区分と入金情報の組み合わせをチェックする。<BR>
	 * 前受金入金の入金情報は、入金検索時にサーバでエラーとなっている前提で動作する。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param datTyp 入金データ区分
	 * @return
	 */
	protected MCMessage _chkTrdRcv(String trdPtnTyp, String datTyp) {
		// 前受金入金の場合、入金の入金情報が使用できる
		if (MAC_TRD_PTN_TYP.isRCV_ADV(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isRCV(datTyp)) {
				return new MCMessage(MSBGP0011);
			}
		}
		// 前受仮受登録（仮受金入金）の場合、入金の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isRCV_SUSP(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isRCV(datTyp)) {
				return new MCMessage(MSBGP0012);
			}
		}
		// 仮受金相殺（前受）の場合、仮受の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isSUSP(datTyp)) {
				return new MCMessage(MSBGP0013);
			}
		}
		// 仮受金その他相殺の場合、仮受の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isSUSP(datTyp)) {
				return new MCMessage(MSBGP0014);
			}
		}
		// 前受金その他相殺の場合、前受の入金情報が使用できる
		else if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)) {
			if (!MSC_RCV_DAT_TYP.isADV(datTyp)) {
				return new MCMessage(MSBGP0015);
			}
		}
		
		return null;
	}

	@Override
	public MCList getRcv_tax_cd(MCRow row, MCEventInfo info) {
		
		MCRow bindR = MCRow.create();
		if (getRcvR().purc_flg()) bindR.addBooleanColumn(RcvR.$purc_flg, true);
		if (getRcvR().sls_flg()) bindR.addBooleanColumn(RcvR.$sls_flg, true);
		bindR.addBooleanColumn("inc_tax_flg", true);

		return super.getRcv_tax_cd(bindR, info);
	}

	@Override
	public void doRcv_trd_cur_cd_LC(MCEventInfo info) {
		super.doRcv_trd_cur_cd_LC(info);
		
		setValueEx(Rcv_rcv_amt, null);
		setAmountFields();
		
		// リスト選択が正しい場合
		if (info.getNewListIndex() >= 0) {
			Rcv_rcv_amt.setMode(MCMode.REQUIRED);
			if (!isNull(getRcvR().rcv_no())) {
				AdvRcv_amt1.setMode(MCMode.REQUIRED);
			}
		}
		// リスト選択されていない場合
		else {
			Rcv_rcv_amt.setMode(MCMode.READ_ONLY);
			AdvRcv_amt1.setMode(MCMode.READ_ONLY);
		}	
	}
	
	@Override
	public void doRcv_rcv_dt_LC(MCEventInfo info) {
		super.doRcv_rcv_dt_LC(info);
		if (isNull(info.getNewValue())) {
			setValueEx(Rcv_tax_cd, null);
			return;
		}
	}
	
	@Override
	public void doRcv_rcst_cd_LC(MCEventInfo info) {
		super.doRcv_rcst_cd_LC(info);
		setModeBcst();
		setXfrPsn();
		setValueEx(Rcv_bcst_cd, null);
		setValueEx(Rcv_bill_dpt_cd, null);
	}
	
	protected void setXfrPsn() {
		if (!MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())) {
			getRcvR().xfr_psn(null);
		}
	}
	
	@Override
	public void doRcv_bcst_cd_LC(MCEventInfo info) {
		super.doRcv_bcst_cd_LC(info);
		setModeBillDpt();
		// 請求書前受金表示の入力制御
		setModeBillDtlAdvFlg();
		setValueEx(Rcv_bill_dpt_cd, null);
	}
	
	@Override
	public void doRcv_debtor_id_typ_LC(MCEventInfo info) {
		super.doRcv_debtor_id_typ_LC(info);
		
		setValueEx(Rcv_debtor_id_cd, null);
		setDebtCred();
		
		if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().debtor_id_typ())) {
			Rcv_debtor_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.FREE);
			Rcv_debtor_nm.setMode(getDefaultMode(Rcv_debtor_nm));
		}
		else {
			Rcv_debtor_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.STRICT);
			Rcv_debtor_nm.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override
	public void doRcv_creditor_id_typ_LC(MCEventInfo info) {
		super.doRcv_creditor_id_typ_LC(info);
		
		setValueEx(Rcv_creditor_id_cd, null);
		setCred();
		
		if (MAC_DEBT_CRED_ID_TYP.isFLEX(getRcvR().creditor_id_typ())) {
			Rcv_creditor_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.FREE);
			Rcv_creditor_nm.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_creditor_id_cd.setListType(mcframe.clientCore.beans.list.MCListType.STRICT);
			Rcv_creditor_nm.setMode(getDefaultMode(Rcv_creditor_nm));
		}
	}
	
	protected void setDebtCred() {
		if (MAC_DEBT_CRED_ID_TYP.isBCST(getRcvR().debtor_id_typ())) {
			setValueEx(Rcv_debtor_id_cd, getRcvR().bcst_cd());
		}
	}
	
	protected void setCred() {
		if (MAC_DEBT_CRED_ID_TYP.isBCST(getRcvR().creditor_id_typ())) {
			setValueEx(Rcv_creditor_id_cd, getRcvR().bcst_cd());
		}
	}
	
	@Override
	public void doRcv_ar_sttl_cd1_LC(MCEventInfo info){
		super.doRcv_ar_sttl_cd1_LC(info);
		
		// 相殺関連の他項目は相殺方法ＣＤのNCイベントでリセットおよび非活性される
		if (MAC_TRD_PTN_TYP.isRCV_SUSP(getHdrR().trd_ptn_typ())) {
			setValueEx(Rcv_ar_sttl_cd2, null);
		}
	}
	
	@Override
	public void doRcv_ar_sttl_cd2_LC(MCEventInfo info) {
		super.doRcv_ar_sttl_cd2_LC(info);

		if (MAC_SLS_PURC_TYP.isPURC(getRcvR().sls_purc_typ2())
				|| MAC_SLS_PURC_TYP.isSLS(getRcvR().sls_purc_typ2())) {
			
			if (MAC_SLS_PURC_TYP.isPURC(getRcvR().sls_purc_typ2())) {
				getRcvR().purc_flg(true);
				getRcvR().sls_flg(false);
			}
			else if (MAC_SLS_PURC_TYP.isSLS(getRcvR().sls_purc_typ2())) {
				getRcvR().purc_flg(false);
				getRcvR().sls_flg(true);
			}
			
			setDefaultMode(Rcv_tax_cd);
		}
		else {
			getRcvR().purc_flg(false);
			getRcvR().sls_flg(false);
			Rcv_tax_cd.setMode(MCMode.READ_ONLY);
		}

		Rcv_tax_cd.setValue(getRcvR().tax_cd_sub());
	}
	
	@Override
	public void doRcv_ar_sttl_cd2_NC(MCEventInfo info) {
		super.doRcv_ar_sttl_cd2_NC(info);
		clearWhenArSttlCd2NC();
		setModeArSttl2();
		
		// 相殺方法が変更された場合、相殺額フィールドをクリアする。
		setValueEx(AdvRcv_amt2, null);	// 債権決済方法２が変更された場合、明細の相殺額をクリアし、金額カラムを再計算する
		setAmountFields();
		setAmt2Mode();
	}
	
	/**
	 * 相殺方法変更時フィールドクリア
	 */
	protected void clearWhenArSttlCd2NC() {
		clearSetOff();
	}
	
	@Override
	public void doRcv_ar_sttl_cd3_LC(MCEventInfo info) {
		super.doRcv_ar_sttl_cd3_LC(info);
		setModeArSttl3();
	}
	
	protected void setModeArSttl2() {
		if (isNull(getRcvR().ar_sttl_cd2())) {
			Rcv_tax_cd.setMode(MCMode.READ_ONLY);
			Rcv_debtor_id_typ.setMode(MCMode.READ_ONLY);
			Rcv_debtor_id_cd.setMode(MCMode.READ_ONLY);
			Rcv_debtor_nm.setMode(MCMode.READ_ONLY);
			Rcv_debt_bd_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			Rcv_tax_cd.setMode(getDefaultMode(Rcv_tax_cd));
			Rcv_debtor_id_typ.setMode(getDefaultMode(Rcv_debtor_id_typ));
			Rcv_debtor_id_cd.setMode(getDefaultMode(Rcv_debtor_id_cd));
			Rcv_debtor_nm.setMode(getDefaultMode(Rcv_debtor_id_cd));
			Rcv_debt_bd_dpt_cd.setMode(getDefaultMode(Rcv_debt_bd_dpt_cd));
		}
	}
	
	protected void setModeArSttl3() {
		if (isNull(getRcvR().ar_sttl_cd3())) {
			Rcv_creditor_id_typ.setMode(getDefaultMode(Rcv_creditor_id_typ));
			Rcv_creditor_id_cd.setMode(getDefaultMode(Rcv_creditor_id_cd));
			Rcv_cred_bd_dpt_cd.setMode(getDefaultMode(Rcv_cred_bd_dpt_cd));
		}
		else {
			Rcv_creditor_id_typ.setMode(MCMode.REQUIRED);
			Rcv_creditor_id_cd.setMode(MCMode.REQUIRED);
			Rcv_cred_bd_dpt_cd.setMode(MCMode.REQUIRED);
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Rcv_rcv_amt) {
			doRcv_rcv_amt_NC();
		}
		else if (nc == AdvRcv_amt1) {
			doAdvRcv_amt1_NC();
		}
		else if (nc == AdvRcv_amt2) {
			doAdvRcv_amt2_NC();
		}
	}

	@Override
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info) {
		super.doHdr_trd_ptn_typ_LC(info);
		clearWhenHdr_trd_ptn_typ_NC(info);
		setModeByTrdCd();
		
		// 入金方法区分からの連携および、相殺方法コンボの操作によって
		setAmt2Mode();
		setAmountFields();
	}
	
	@Override
	public void doRcv_rcv_no_NC(MCEventInfo info) {
		super.doRcv_rcv_no_NC(info);
		clearWhenRcv_rcv_no_NC();
		setModeByTrdCd();
		
		// 入金NOは検索条件でもあるので、変更時にComRのステータスを変えないようにする
		getRcvR().setStatus(Status.NONE);
	}
	
	@Override
	public void doRcv_bcst_cd_NC(MCEventInfo info) {
		super.doRcv_bcst_cd_NC(info);
		setDefaultAccount();
		setAmountFields();
		
		if (MAC_DEBT_CRED_ID_TYP.isBCST(getRcvR().debtor_id_typ())) {
			setDebtCred();
		}
	}
	
	@Override
	public void doRcv_ar_sttl_typ1_NC(MCEventInfo info) {
		super.doRcv_ar_sttl_typ1_NC(info);
		clearWhenArSttlTyp1NC();
		
		setDefaultAccount();
		setBankAcMode();
	}
	
	public void doRcv_rcv_amt_NC() {
		if (isNull(getRcvR().rcv_no())) {
			getRcvR().not_proc_bal_w(getRcvR().rcv_amt());
			getAdvRcvR().amt1(getRcvR().rcv_amt());
		}
		setAmountFields();
	}

	@Override
	public void doRcv_trd_rmrks_NC(MCEventInfo info) {
		super.doRcv_trd_rmrks_NC(info);
		_isRmrksChange = true;
	}
	
	public void doAdvRcv_amt1_NC() {
		setAmountFields();
	}
	
	public void doAdvRcv_amt2_NC() {
		setAmountFields();
	}
	
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == Hdr_trd_cd) {
			return doHdr_trd_cd_VC(info);
		}
		return super.doVCEvent(vc, info);
	}
	
	/**
	 * 入金ＮＯ入力済みの場合、選択できる伝票を制限する
	 * 
	 * @param info
	 */
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		int newIdx = info.getNewListIndex();
		// 画面初期化時に伝票部品のsetDefaultValueから飛んできた場合に-1となるため。
		if (newIdx < 0) {
			return true;
		}
		
		// 選択されようとしているリストの行
		MCRow slipR = Hdr_trd_cd.getList().get(newIdx);
		return chkTrdRcv(slipR.getString("trd_ptn_typ"), getRcvR().dat_typ());
	}	
	
	protected void clearWhenHdr_trd_ptn_typ_NC(MCEventInfo info) {
		String oldVal = (String)info.getOldValue();
		String newVal = (String)info.getNewValue();
		
		if (MAC_TRD_PTN_TYP.isRCV_ADV(oldVal) && MAC_TRD_PTN_TYP.isRCV_SUSP(newVal)
			|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(oldVal) && MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(newVal)) {
			setValueEx(Rcv_slo_no, null);
		}
		// 「仮受前受相殺」⇔「仮受その他相殺」と「前受金入金」⇔「仮受金入金」の変更では
		// 入金情報の入金データ区分が同じなので、入金情報はクリアしない
		if (MAC_TRD_PTN_TYP.isRCV_ADV(oldVal) && MAC_TRD_PTN_TYP.isRCV_SUSP(newVal)
			|| MAC_TRD_PTN_TYP.isRCV_SUSP(oldVal) && MAC_TRD_PTN_TYP.isRCV_ADV(newVal)
			|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(oldVal) && MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(newVal)
			|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(oldVal)	&& MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(newVal)) {
			
			return;
		}
		
		clearWhenRcv_rcv_no_NC();
		setValueEx(Rcv_trd_rmrks, null);
		setValueEx(Rcv_rcv_no, null);
	}
	
	/**
	 * 債権決済区分１変更時フィールドクリア
	 */
	protected void clearWhenArSttlTyp1NC() {
		clearBank();
		clearSetOff();
	}
	
	/**
	 * 振込項目クリア
	 */
	protected void clearBank() {
		Rcv_bank_ac_cd.clear();
		Rcv_bank_ac_nm.clear();
		Rcv_xfr_psn.clear();
	}
	
	/**
	 * 相殺方法項目クリア
	 */
	protected void clearSetOff() {
		Rcv_tax_cd.clear();
		Rcv_tax_nm.clear();
		Rcv_tax_rate.clear();
		Rcv_debtor_id_typ.clear();
		Rcv_debtor_id_typ_nm.clear();
		Rcv_debtor_id_cd.clear();
		Rcv_debtor_nm.clear();
		if (isNull(getRcvR().ar_sttl_cd2())) {
			Rcv_debt_bd_dpt_cd.clear();
			Rcv_debt_bd_dpt_nm.clear();
		}
	}
	
	/**
	 * 入金ＮＯ変更時フィールドクリア
	 * 
	 */
	protected void clearWhenRcv_rcv_no_NC() {
		String rcvNo = getRcvR().rcv_no();
		String rmrks = getRcvR().trd_rmrks();
		getRcvR().clear();
		getAdvRcvR().clear();
		getRcvR().rcv_no(rcvNo);
		getRcvR().trd_rmrks(rmrks);

		setBaseCurValues();
	}
	
	@Override
	public void setMode(String status) {
		super.setMode(status);
		setBankAcMode();
		setModeArSttl2();
	}
	
	/**
	 * 仮受金入金用の設定
	 */
	protected void setArSttlModeForNewSusp() {
		setValueEx(Rcv_ar_sttl_cd2, null);
		Rcv_ar_sttl_cd2.setMode(MCMode.READ_ONLY);
		Rcv_tax_cd.setMode(MCMode.READ_ONLY);
	}
	
	/**
	 * デフォルトの口座を設定する
	 * 
	 */
	protected void setDefaultAccount() {
		if (isNull(getRcvR().rcv_no())) {
			setValueEx(Rcv_bank_ac_cd, null);
			setValueEx(Rcv_xfr_psn, null);
			if (MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())) {
				setValueEx(Rcv_bank_ac_cd, getHdrR().def_bank_ac_cd());
			}
		}
	}
	
	@Override	
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {	
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// REF →　INS
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setRefToInsInit(bfSt);
		}
		
		// UPD →　INS, DEL → INS
		if ((isSame(bfOpe, Cnd_ope_UPD.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))
				|| (isSame(bfOpe, Cnd_ope_DEL.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setUpdToInsInit();
		}
		
		// REF →　UPD, REF　→ DEL
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_UPD.getActionCommand()))
				|| (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_DEL.getActionCommand()))) {
			doCnd_ope_VC(info);
			setRefToUpdInit(bfSt);
		}
		// →UPD ,→DEL
		if (isSame(afOpe, Cnd_ope_UPD.getActionCommand()) || isSame(afOpe, Cnd_ope_DEL.getActionCommand())){
			Cnd_rcv_act_rev.setMode(MCMode.READ_ONLY);
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setRefToInsInit(String bfSt) {
		// 参照登録を行なわないため、登録対象をクリアする
		getCndR().clear();
		getHdrR().clear();
		getRcvR().clear();
		getAdvRcvR().clear();

		valueInit();
		
		statusClear();
		
		HdrPanel.focusFirstComponent();
	}
	
	protected void setUpdToInsInit() {	
		valueInit();
		
		getHdrR().can_ac_dt(null);
		setValueEx(Hdr_rcv_act_no, null);
		setValueEx(Hdr_rcv_act_rev, null);
		setValueEx(Cnd_rcv_act_no, null);
		setValueEx(Cnd_rcv_act_rev, null);
		setValueEx(AdvRcv_rcv_no, null);
		
		statusClear();
		HdrPanel.focusFirstComponent();
	}	

	protected void setRefToUpdInit(String bfSt) {	
		// ヘッダの入金実績ＮＯが空でない
		if (!isNull(getHdrR().rcv_act_no())) {
			
			setModeByTrdCd();
			setAmt2Mode();
			setArSttlCd2Mode();
			// 計上日を赤伝計上日にコピー
			getHdrR().can_ac_dt(getHdrR().ac_dt());
			statusClear();
		}
		HdrPanel.focusFirstComponent();
	}
	
	/**
	 * 入金方法が「振込」以外の場合、口座、振込人名を入力不可能にする。<BR>
	 */
	protected void setBankAcMode() {

		if (!MAC_AR_STTL_TYP.isBANK(getRcvR().ar_sttl_typ1())
				|| !isNull(getRcvR().rcv_no()) || Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected()
				|| isSame(FIX_U, getStatus()) || isSame(FIX_I, getStatus())){
			Rcv_bank_ac_cd.setMode(MCMode.READ_ONLY);
			Rcv_xfr_psn.setMode(MCMode.READ_ONLY);
		}
		
		else {
			Rcv_bank_ac_cd.setMode(MCMode.REQUIRED);
			Rcv_xfr_psn.setMode(MCMode.ENABLE);
		}
	}
	

	/**
	 * 選択された取引ＣＤの取引パタン区分により請求先ＣＤのモードを設定する。<BR>
	 */
	protected void setModeBcst() {
		if (isNull(getRcvR().rcst_cd())) {
			setValueEx(Rcv_bcst_cd, null);
			Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			if (MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())) {
				Rcv_bcst_cd.setMode(MCMode.REQUIRED);
			}
			else if (MAC_TRD_PTN_TYP.isRCV_SUSP(getHdrR().trd_ptn_typ())) {
				Rcv_bcst_cd.setMode(MCMode.ENABLE);
			}
			else {
				Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	/**
	 * 請求先ＣＤが入力された時に請求部門ＣＤを入力可にする。<BR>
	 */
	protected void setModeBillDpt(){
		//仮受金前受金相殺,仮受金その他勘定相殺,前受金その他勘定相殺の時は常に入力不可
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())) {
			Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		
		else if(isNull(getRcvR().bcst_cd())){
			setValueEx(Rcv_bill_dpt_cd, null);
			Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		
		else{
			Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
		}	
	}
	
	/**
	 * 請求先ＣＤが入力された時に請求書前受金表示の入力制御を行う。<BR>
	 */
	protected void setModeBillDtlAdvFlg(){
		// 以下の条件を満たす場合に入力可
		// 取引パタン区分が「前受金入金」「前受金その他勘定相殺」「仮受金前受金相殺」の」いずれか
		// 請求締処理区分が「売上都度請求」以外
		if (MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())) {
			if (isNull(getRcvR().bcst_cd())
				 || MAC_BILL_CL_TYP.isEACH_SLS(getRcvR().bill_cl_typ())) {
				setValueEx(Rcv_bill_dtl_adv_flg, false);
				Rcv_bill_dtl_adv_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Rcv_bill_dtl_adv_flg);
			}
		}
		else {
			setValueEx(Rcv_bill_dtl_adv_flg, false);
			Rcv_bill_dtl_adv_flg.setMode(MCMode.READ_ONLY);
		}	
	}
	
	/**
	 * 選択された取引ＣＤの取引パタン区分により画面のモードを設定する
	 * 
	 */
	protected void setModeByTrdCd() {
		
		// 取引ＣＤ未入力時
		if (isNull(getHdrR().trd_cd())) {
			getRcvR().clear();
			setValueEx(Rcv_trd_cur_cd, getBaseCur().cur_cd());
			
			setNO_SLIP_CDStatus();
			Hdr_trd_cd.mcRequestFocus();
			return;
		}
		
		setTabPaneMode(getHdrR().trd_ptn_typ());

		// ステータス制御
		setRcvTabMode();
		
		// 仮受金その他相殺、前受金その他相殺の場合、相殺タブの入力制御を行う。
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())) {
			setSetoffTabMode();
		}
		
		// 個別のモードを設定する
		setAdditionalMode();
	}
	
	protected void setRcvTabMode() {
		String rcvNo = getRcvR().rcv_no();
		
		// 検索前かつ入金ＮＯ指定必須
		if (isNull(getRcvR().rcv_no())
				&& (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ()))) {
			// 新規
			if (Cnd_ope_INS.isSelected()) {
				setSRCH_NEW_RCVStatus();
				setArSttlModeForNewSetoffSusp();
			}
			// 更新
			if (Cnd_ope_UPD.isSelected()) {
				setSRCH_RCVStatus();
			}
		}
		// 入金ＮＯ指定任意、入金ＮＯ指定必須
		else {
			// 検索後
			if (!isNull(getRcvR().rcv_no())) {
				// 新規
				if (Cnd_ope_INS.isSelected()) {
					setREF_NEW_RCVStatus();
				}
				// 更新
				if (Cnd_ope_UPD.isSelected()) {
					setREF_RCVStatus();
				}
			}
			// 検索前
			else {
				// 入金ＮＯ未入力
				if (isNull(rcvNo)) {
					// 新規
					if (Cnd_ope_INS.isSelected()) {
						setINSStatus();
						
						// 請求部門の入力制御
						setModeBcst();
						setModeBillDpt();
					}
					// 更新
					if (Cnd_ope_UPD.isSelected()) {
						setUPDStatus();
						
						// 請求部門の入力制御
						setModeBcst();
						setModeBillDpt();
					}
				}
				// 入金ＮＯ入力済
				else {
					// 新規
					if (Cnd_ope_INS.isSelected()) {
						setSRCH_NEW_RCVStatus();
					}
					// 更新
					if (Cnd_ope_UPD.isSelected()) {
						setSRCH_RCVStatus();
					}
				}
			}
		}
	}
	
	/**
	 * 相殺タブの相殺方法の入力制御
	 */
	protected void setSetoffTabMode() {
		
		// !入金済みのステータスの時のみ、入力制御する。
		if (!(isSame(REF_NEW_RCV, getStatus()) || isSame(REF_RCV, getStatus()))) {
			return;
		}
		Rcv_ar_sttl_cd3.setMode(MCMode.REQUIRED);
	}
		
	/**
	 * 新規で、仮受金その他相殺・仮受金その他相殺用の設定
	 */
	protected void setArSttlModeForNewSetoffSusp() {
		setValueEx(Rcv_ar_sttl_cd2, null);
		
		Rcv_ar_sttl_cd1.setMode(MCMode.READ_ONLY);
		Rcv_ar_sttl_cd2.setMode(MCMode.READ_ONLY);
		Rcv_tax_cd.setMode(MCMode.READ_ONLY);
	}
	
	/**
	 * 画面項目個別でモードを設定する
	 * 
	 */
	public void setAdditionalMode() {

		setBankAcMode();
		
		if (isSame(SRCH_NEW_RCV, getStatus()) || isSame(SRCH_RCV, getStatus())) {
			setAmountFields();
		}

		// 入金ＮＯのモード設定
		setRcvNoMode();
		
		// 受注ＮＯのモード設定
		setSloNoMode();
		
		//相殺方法のモード設定
		setArSttlCd2Mode();
		
		//前受仮受枠の入金額のモード設定
		if(isNull(getRcvR().rcv_no())){
			AdvRcv_amt1.setMode(MCMode.READ_ONLY);
		}
		else{
			AdvRcv_amt1.setMode(MCMode.REQUIRED);
		}
		
		// 入金待ちモードでないときに、相殺先等を入力制御する。
		if (!(isSame(SRCH_NEW_RCV, getStatus()) || isSame(SRCH_RCV, getStatus()))) {
			
			/*  入金先の入力制御 */
			// 入金ＮＯ入力済みで、入金先も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().rcst_cd())) {
				if (!isNull(getRcvR().old_rcst_cd())) {
					Rcv_rcst_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_rcst_cd.setMode(MCMode.REQUIRED);
				}
			}
			else if(isNull(getRcvR().old_rcst_cd())){
				Rcv_rcst_cd.setMode(MCMode.REQUIRED);
				
			}
			else{
				getDefaultMode(Rcv_rcst_cd);
			}
				
			/*  請求先の入力制御 */
			// 入金ＮＯ入力済みで、請求先も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().bcst_cd())) {
				if (!isNull(getRcvR().old_bcst_cd())) {
					Rcv_bcst_cd.setMode(MCMode.READ_ONLY);
				}
				else if  (MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())) {
					Rcv_bcst_cd.setMode(MCMode.REQUIRED);
				}
				else {
					Rcv_bcst_cd.setMode(MCMode.ENABLE);
				}
			}
			else {
				setModeBcst();
			}
			
			/*  請求部門の入力制御 */
			// 入金ＮＯ入力済みで、請求部門も入力済みの場合、変更不可とする
			if (!isNull(getRcvR().rcv_no()) && !isNull(getRcvR().bill_dpt_cd())) {
				if (!isNull(getRcvR().old_bill_dpt_cd())) {
					Rcv_bill_dpt_cd.setMode(MCMode.READ_ONLY);
				}
				else {
					Rcv_bill_dpt_cd.setMode(MCMode.ENABLE);
				}
			}
			else {
				setModeBillDpt();
			}
			
		
			if (MAC_TRD_PTN_TYP.isRCV_SUSP(getHdrR().trd_ptn_typ())) {
				setDebtorRO();
				setArSttlModeForNewSusp();
			}
			else if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())) {
				setDebtorEnable();
				setArSttlModeForNewSetoffSusp();
			}
			else {
				setDebtorRO();
			}
			
			// 請求書前受金表示の入力制御
			setModeBillDtlAdvFlg();
		}
	}
	
	/**
	 * 借方先情報を入力不可にする
	 */
	protected void setDebtorRO() {
		setValueEx(Rcv_creditor_id_cd, null);
		setValueEx(Rcv_creditor_id_typ, null);
		Rcv_creditor_id_cd.setMode(MCMode.READ_ONLY);
		Rcv_creditor_id_typ.setMode(MCMode.READ_ONLY);
		
		setValueEx(Rcv_ar_sttl_cd3, null);
		setValueEx(Rcv_cred_bd_dpt_cd, null);
		
		Rcv_ar_sttl_cd3.setMode(MCMode.READ_ONLY);
		Rcv_cred_bd_dpt_cd.setMode(MCMode.READ_ONLY);
		Rcv_cred_bd_dpt_nm.setMode(MCMode.READ_ONLY);
	}
	
	/**
	 * 借方先情報を入力可にする
	 */
	protected void setDebtorEnable() {
		Rcv_ar_sttl_cd3.setMode(MCMode.REQUIRED);
		Rcv_creditor_id_cd.setMode(MCMode.REQUIRED);
		Rcv_creditor_id_typ.setMode(MCMode.REQUIRED);
		Rcv_cred_bd_dpt_cd.setMode(MCMode.REQUIRED);
		Rcv_cred_bd_dpt_nm.setMode(MCMode.READ_ONLY);
		
	}
	
	/**
	 * 入金ＮＯのモード設定を行う。
	 */
	protected void setRcvNoMode() {
		// 仮受金前受金相殺か、仮受その他相殺、前受金その他相殺の場合、入金ＮＯを必須にする
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())) {
			Rcv_rcv_no.setMode(MCMode.REQUIRED);
		}
		else {
			Rcv_rcv_no.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * 受注ＮＯのモード設定を行う。
	 */
	protected void setSloNoMode() {
		if (MAC_TRD_PTN_TYP.isRCV_ADV(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(getHdrR().trd_ptn_typ())) {
			Rcv_slo_no.setMode(MCMode.ENABLE);
		}
		else {
			Rcv_slo_no.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * タブの制御を行う
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 */
	protected void setTabPaneMode(String trdPtnTyp) {
		
		if (MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdPtnTyp)) {
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(RcvPanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(NotePanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(SetoffPanel), true);
		}
		else {
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(RcvPanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(NotePanel), true);
			RcvTabTab.setEnabledAt(RcvTabTab.indexOfComponent(SetoffPanel), false);
			RcvTabTab.setSelectedComponent(RcvPanel);
		}

	}

	/**
	 * 入金方法が「手形」の場合、相殺方法を入力不可にする。<BR>
	 * ただし、仮受その他相殺、仮受金入金の場合、、前受金その他相殺は入金方法にかかわらず相殺方法は入力できない。
	 */
	protected void setArSttlCd2Mode() {
		if (MAC_AR_STTL_TYP.isNOTE(getRcvR().ar_sttl_typ1())) {
			Rcv_ar_sttl_cd2.setMode(MCMode.READ_ONLY);
		}
		else {
			
			if (MAC_TRD_PTN_TYP.isRCV_SUSP(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_OTH(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(getHdrR().trd_ptn_typ())) {
					Rcv_ar_sttl_cd2.setMode(MCMode.READ_ONLY);
			} 
		}
	}
	
	protected void setAmt2Mode() {
		
		if (isNull(getRcvR().ar_sttl_cd2())) {
			Rcv_tax_cd.setMode(MCMode.READ_ONLY);
			AdvRcv_amt2.setMode(MCMode.READ_ONLY);
			setValueEx(AdvRcv_amt2, null);
		}
		else {
			
			AdvRcv_amt2.setMode(MCMode.REQUIRED);
			Rcv_tax_cd.setMode(MCMode.ENABLE);
		}
		
	}
	
	/**
	 * 各種金額フィールドの設定
	 * 
	 */
	protected void setAmountFields() {
		// 入金額と相殺額はnullの場合は0として計算する
		MCNumber amt1 = isNull(getAdvRcvR().amt1()) ? MCNumber.ZERO : getAdvRcvR().amt1();
		MCNumber notProcBal = getRcvR().not_proc_bal_w();
		
		// 未処理残高
		getRcvR().not_proc_bal(isNull(notProcBal) ? null : notProcBal.subtract(amt1));
	}
	
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getRcvR());
		ret.add(getAdvRcvR());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	public MCRowBeans getCndRevNo() {
		return Cnd_rcv_act_rev;
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setRevNoMode();
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			// 種別切り替え時に検索区分が変わる場合は、種別変更後の検索区分とNOの整合性を考え、適切なNOを検索条件に設定する
			// 検索区分とNOの整合性が取れない場合は、検索条件のNOを設定しない
			getCndR().rcv_act_no(getHdrR().rcv_act_no());
		}
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return Hdr_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}

}