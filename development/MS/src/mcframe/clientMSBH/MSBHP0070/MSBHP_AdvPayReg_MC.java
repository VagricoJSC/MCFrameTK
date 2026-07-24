package mcframe.clientMSBH.MSBHP0070;

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
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMSUC.MSUCP0100.MSUCP_ApUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_AdvPayReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_AdvPayReg_MC extends MSBHP_AdvPayReg_MC_A implements IfOpePanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_AdvPayReg_MC() {
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
	public MSBHP_AdvPayReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0070_Srch01Caller<P extends MSBHP_AdvPayReg, B extends MS_MSBHL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			valueInitSub();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				if (!isNull(getHdrR().trd_cur_setoff_schd_amt()) && getHdrR().trd_cur_setoff_schd_amt().isPositive()) {
					dialog(new MCMessage(MSBHP0007));
					setStatus(REF);
				}
				else {
					setStatus(UPD);
				}
			}
			else if (Cnd_ope_DEL.isSelected()) {
				if (!isNull(getHdrR().trd_cur_setoff_schd_amt()) && getHdrR().trd_cur_setoff_schd_amt().isPositive()) {
					dialog(new MCMessage(MSBHP0008));
					setStatus(REF);
				}
			}
			else {
				setStatus(REF);
			}
			setFocus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
			setFocus();
		}
	}

	/**
	 * [MS_MSBHL0070_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0070_Ins01Caller<P extends MSBHP_AdvPayReg, B extends MS_MSBHL0070_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0070_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBHL0070_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0070_Upd01Caller<P extends MSBHP_AdvPayReg, B extends MS_MSBHL0070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0070_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBHL0070_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0070_Del01Caller<P extends MSBHP_AdvPayReg, B extends MS_MSBHL0070_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBHL0070_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBHL0070_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBHL0070_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBHL0070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBHL0070_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_pay_act_dt);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_pay_act_dt, true);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_setoff_tgt_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_setoff_schd_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_setoff_act_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_not_proc_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_com_paid_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub () {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Hdr_pay_act_dt, getToday());
			setValueEx(Hdr_ac_dt, getToday());

			// 基準通貨、為替レートＣＤ
			setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
			setValueEx(Hdr_base_cur_nm, getBaseCur().cur_nm());
			setValueEx(Hdr_base_cur_amt_dec_place, getBaseCur().amt_dec_place());
			setValueEx(Hdr_xrate_cd, getCo().purc_xrate_cd());
		}
		getHdrR().setStatus(MCRow.NONE);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_trd_cur_amt.addLCListener(this);
		Hdr_trd_cur_com_paid.addLCListener(this);
	}


	// -----------------------------------------------
	// イベント
	// -----------------------------------------------

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().adv_pay_act_no(getHdrR().adv_pay_act_no());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(bfSt, REF)) {
			// 参照登録
			if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
				setRefToInsInit();
			}
			else if (isSame(afOpe, Cnd_ope_UPD.getActionCommand())) {
				setBankAcMode();
				setNoteMode();
				setComPaidMode();
				setPayNtcMode();
			}
		}
		valueInit();
		setFocus();
	}

	/**
	 * 参照登録時、日付項目にシステム日付を設定する。
	 */
	protected void setRefToInsInit() {
		setValueEx(Hdr_pay_act_dt, getToday());
		setValueEx(Hdr_ac_dt, getToday());
	}
	
	@Override
	public void doHdr_pay_act_dt_LC(MCEventInfo info) {
		super.doHdr_pay_act_dt_LC(info);
		setValueComPaid();
	}
	
	@Override
	public void doHdr_pay_spot_flg_NC(MCEventInfo info) {
		super.doHdr_pay_spot_flg_NC(info);
		setPayNtcMode();
	}

	@Override
	public void doHdr_ap_sttl_cd_LC(MCEventInfo info) {
		super.doHdr_ap_sttl_cd_LC(info);
		setVauleBankAcCd();
		setVauleNote();
		setBankAcMode();
		setNoteMode();
	}

	@Override
	public void doHdr_com_paid_ap_sttl_cd_LC(MCEventInfo info) {
		super.doHdr_com_paid_ap_sttl_cd_LC(info);
		calcSetoffAmt();
		setVauleBankAcCd();
		setValueComPaid();
		setComPaidMode();
	}

	@Override
	public void doHdr_note_typ_LC(MCEventInfo info) {
		super.doHdr_note_typ_LC(info);

		if (!canEditAccptr()) {
			setValueEx(Hdr_accptr, null);
		}
	}

	@Override
	public void doHdr_draw_dt_LC(MCEventInfo info) {
		super.doHdr_draw_dt_LC(info);

		HdrR hdrR = getHdrR();
		if (isNull(hdrR.draw_dt())) {
			Hdr_note_days.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_note_days, null);
		}
		else {
			setDefaultMode(Hdr_note_days);
			if (!isNull(hdrR.note_days())) {
				setDueDt();
			}
			else if (!isNull(hdrR.due_dt())) {
				setNoteDays();
			}
		}
	}

	@Override
	public void doHdr_due_dt_LC(MCEventInfo info) {
		super.doHdr_due_dt_LC(info);

		if (!isNull(getHdrR().due_dt())) {
			setNoteDays();
		}
	}

	@Override
	public void doHdr_note_days_LC(MCEventInfo info) {
		super.doHdr_note_days_LC(info);

		setDueDt();
	}

	@Override
	public void doHdr_trd_cur_com_paid_tax_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_com_paid_tax_cd_LC(info);
		calcTaxAmt();
	}

	@Override
	public void doHdr_draw_bank_cd_LC(MCEventInfo info) {
		super.doHdr_draw_bank_cd_LC(info);
		
		setValueEx(Hdr_draw_branch_cd, null);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == Hdr_trd_cur_amt) {
			doHdr_trd_cur_amt_LC(info);
		}
		else if (lc == Hdr_trd_cur_com_paid) {
			doHdr_trd_cur_com_paid_LC(info);
		}
		else if (lc == Hdr_trd_cur_com_paid_tax_cd) {
			doHdr_trd_cur_com_paid_tax_cd_LC(info);
		}

		setStatus(getStatus());
	}

	@Override
	public void doHdr_psppl_cd_LC(MCEventInfo info) {
		super.doHdr_psppl_cd_LC(info);
		setValueEx(Hdr_pay_usr_cd, null);
		setValueEx(Hdr_pay_dpt_cd, null);
		if (!isNull(getHdrR().def_pay_dpt_cd())) {
			setValueEx(Hdr_pay_dpt_cd, getHdrR().def_pay_dpt_cd());
		}
	}

	protected void doHdr_trd_cur_amt_LC(MCEventInfo info) {
		calcSetoffAmt();
	}
	
	protected void doHdr_trd_cur_com_paid_LC(MCEventInfo info) {
		calcSetoffAmt();
		calcTaxAmt();
	}
	
	/**
	 * 支払額と手数料から相殺対象額、未処理残高を算出する。
	 */
	protected void calcSetoffAmt() {
		if (isNull(getHdrR().trd_cur_cd())) {
			// 取引通貨ＣＤが未設定の場合は金額計算しない
			return;
		}
		MCNumber setoffTgtAmt = getHdrR().trd_cur_amt();
		if (!isNull(setoffTgtAmt) && MAC_AP_STTL_TYP.isSETOFF(getHdrR().com_paid_ap_sttl_typ()) && !isNull(getHdrR().trd_cur_com_paid())) {
			// 手数料債務決済方法が相殺の場合、支払額＋手数料
			setoffTgtAmt = setoffTgtAmt.add(getHdrR().trd_cur_com_paid());
		}
		setValueEx(Hdr_trd_cur_setoff_tgt_amt, setoffTgtAmt);
		setValueEx(Hdr_trd_cur_not_proc_bal, setoffTgtAmt);
		setValueEx(Hdr_trd_cur_setoff_schd_amt, MCNumber.ZERO);
		setValueEx(Hdr_trd_cur_setoff_act_amt, MCNumber.ZERO);
	}
	
	/**
	 * 手数料と税率から手数料税額を算出する。
	 */
	protected void calcTaxAmt() {
		if (canEditComPaidTax()) {
			MCNumber amt = 
				MAUCP_AmtUtil.getIncTaxAmt(
					getHdrR().trd_cur_com_paid(), getHdrR().trd_cur_com_paid_tax_rate(),
					getHdrR().trd_cur_amt_dec_place(), getCo().com_paid_tax_rnd_typ());
			setValueEx(Hdr_trd_cur_com_paid_tax_amt, amt);
		}
		else {
			setValueEx(Hdr_trd_cur_com_paid_tax_amt, null);
		}
	}

	/**
	 * 口座・支払先口座が編集不可の場合、値をクリアする
	 */
	protected void setVauleBankAcCd() {
		if (!canEditBankAcCd()) {
			setValueEx(Hdr_bank_ac_cd, null);
		}

		if (!editablePayBankAcCd() && !requiredPayBankAcCd()) {
			setValueEx(Hdr_pay_bank_ac_cd, null);
		}
	}

	/**
	 * 手数料・手数料税が編集不可の場合、値をクリアする
	 */
	protected void setValueComPaid() {
		if (!canEditComPaid()) {
			setValueEx(Hdr_trd_cur_com_paid, null);
		}
		if (!isNull(getHdrR().pay_act_dt()) && canEditComPaidTax()) {
			setValueEx(Hdr_trd_cur_com_paid_tax_cd, MSUCP_ApUtil.getComPaidTaxCd(getHdrR().pay_act_dt(), this));
		}
		else {
			setValueEx(Hdr_trd_cur_com_paid_tax_cd, null);
		}
	}
	
	/**
	 * 手形項目が編集不可の場合、値をクリアする
	 */
	protected void setVauleNote() {
		if (!canEditNote()) {
			for (MCBeans c : getNoteParts()) {
				setValueEx((MCRowBeans)c, null);
			}
		}
	}

	/**
	 * 債務決済方法、手数料債務決済方法により口座の編集可否を判断する。
	 * @return
	 */
	protected boolean canEditBankAcCd() {
		if (MAC_AP_STTL_TYP.is_req_bank_ac(getHdrR().ap_sttl_typ())) {
			return true;
		}
		if (MAC_AP_STTL_TYP.is_req_bank_ac(getHdrR().com_paid_ap_sttl_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 債務決済方法、手数料債務決済方法により支払先口座が編集可能（必須ではない）かどうかを判断する。
	 * @return
	 */
	protected boolean editablePayBankAcCd() {
		if (MAC_AP_STTL_TYP.isCASH(getHdrR().ap_sttl_typ())) {
			return true;
		}
		if (MAC_AP_STTL_TYP.isCASH_COM_PAID(getHdrR().com_paid_ap_sttl_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 債務決済方法、手数料債務決済方法により支払先口座が入力必須かどうかを判断する。
	 * @return
	 */
	protected boolean requiredPayBankAcCd() {
		if (MAC_AP_STTL_TYP.isACNT(getHdrR().ap_sttl_typ())) {
			return true;
		}
		if (MAC_AP_STTL_TYP.isACNT_COM_PAID(getHdrR().com_paid_ap_sttl_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 債務決済方法により手形項目の編集可否を判断する。
	 * @return
	 */
	protected boolean canEditNote() {
		return MAC_AP_STTL_TYP.isNOTE(getHdrR().ap_sttl_typ());
	}
	
	/**
	 * 手形関連の項目を返す。
	 */
	protected MCBeans[] _noteParts;
	protected MCBeans[] getNoteParts() {
		if (_noteParts == null) {
			_noteParts = new MCModeBeans[]{
				Hdr_note_no,
				Hdr_note_typ,
				Hdr_note_typ_nm,
				Hdr_draw_dt,
				Hdr_note_days,
				Hdr_due_dt,
				Hdr_drawer_nm,
				Hdr_endrsr,
				Hdr_accptr,
				Hdr_draw_bank_cd,
				Hdr_draw_bank_nm,
				Hdr_draw_branch_cd,
				Hdr_draw_branch_nm,
				Hdr_note_rsn_cd,
				Hdr_note_rsn_nm,
				Hdr_note_sub_char1,
				Hdr_note_sub_char2,
				Hdr_note_sub_char3,
			};
		}
		return _noteParts;
	}

	/**
	 * 手形区分により引受人の編集可否を判断する。
	 */
	protected boolean canEditAccptr() {
		HdrR hdrR = getHdrR();
		if (isNull(hdrR.ap_sttl_typ())) {
			return false;
		}
		return MAC_NOTE_TYP.isXCHNG(getHdrR().note_typ());
	}

	/**
	 * 振出日により手形サイトの編集可否を判断する。
	 */
	protected boolean canEditNoteDays() {
		return !isNull(getHdrR().draw_dt());
	}

	/**
	 * 手数料債務決済方法により手数料の編集可否を判断する。
	 * @return
	 */
	protected boolean canEditComPaid() {
		return !isNull(getHdrR().com_paid_ap_sttl_cd());
	}
	
	/**
	 * 手数料債務決済方法により手数料税の編集可否を判断する。
	 * @return
	 */
	protected boolean canEditComPaidTax() {
		String sttlTyp = getHdrR().com_paid_ap_sttl_typ();
		if (MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp)) {
			return true;
		}
		else if (MAC_AP_STTL_TYP.isCASH_COM_PAID(sttlTyp)) {
			return true;
		}
		else if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 都度支払ＦＬＧにより、支払通知書前月残高表示の編集可否を制御する。
	 * @return
	 */
	protected boolean canEditPayNtcAdvPayFlg () {
		if (getHdrR().pay_spot_flg()) {
			return false;
		}
		return true;
	}
	
	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setDueDt() {
		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.draw_dt()) && !isNull(hdrR.note_days())) {
			// 支払期日＝振出日＋手形サイト）
			setValueEx(Hdr_due_dt, hdrR.draw_dt().addDay(hdrR.note_days()));
		}
	}

	/**
	 * 振出日、手形サイトをもとに支払期日を設定する
	 * @param idx
	 */
	protected void setNoteDays() {
		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.draw_dt()) && !isNull(hdrR.due_dt())) {
			// 手形サイト＝（支払期日－振出日）＋１
			MCNumber noteDays = MCNumber.valueOf(hdrR.due_dt().diffDay(hdrR.draw_dt()));
			if (noteDays.isNegative()) {
				setValueEx(Hdr_note_days, null);
			}
			else {
				setValueEx(Hdr_note_days, noteDays);
			}
		}
	}

	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------

	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		if (isINSStatus(status) || isUPDStatus(status)) {
			setBankAcMode();
			setNoteMode();
			setComPaidMode();
			setPayNtcMode();
		}

		setAdvPayActRevMode();
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setFocus();
	}

	/**
	 * 前渡金実績改定番号、最新ＦＬＧの入力制御
	 */
	protected void setAdvPayActRevMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_adv_pay_act_rev.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 口座関連項目の入力制御
	 */
	protected void setBankAcMode() {
		if (canEditBankAcCd()) {
			setDefaultMode(Hdr_bank_ac_cd);
		}
		else {
			Hdr_bank_ac_cd.setMode(MCMode.READ_ONLY);
		}
		
		if (requiredPayBankAcCd()) {
			setDefaultMode(Hdr_pay_bank_ac_cd);
		}
		else if (editablePayBankAcCd()) {
			Hdr_pay_bank_ac_cd.setMode(MCMode.ENABLE);
		}
		else {
			Hdr_pay_bank_ac_cd.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 手形関連項目の入力制御
	 */
	protected void setNoteMode() {
		if (canEditNote()) {
			if (!canEditAccptr()) {
				Hdr_accptr.setMode(MCMode.READ_ONLY);
			}
			if (!canEditNoteDays()) {
				Hdr_note_days.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			for (MCBeans c : getNoteParts()) {
				((MCModeBeans)c).setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	/**
	 * 手数料関連項目の入力制御
	 */
	protected void setComPaidMode() {
		if (canEditComPaid()) {
			setDefaultMode(Hdr_trd_cur_com_paid);
		}
		else {
			Hdr_trd_cur_com_paid.setMode(MCMode.READ_ONLY);
		}

		if (canEditComPaidTax()) {
			String sttlTyp = getHdrR().com_paid_ap_sttl_typ();
			if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
				Hdr_trd_cur_com_paid_tax_cd.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(Hdr_trd_cur_com_paid_tax_cd);
			}
		}
		else {
			Hdr_trd_cur_com_paid_tax_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 支払通知書関連の入力制御
	 */
	protected void setPayNtcMode () {
		if (canEditPayNtcAdvPayFlg()) {
			setDefaultMode(Hdr_pay_ntc_adv_pay_flg);
		}
		else {
			Hdr_pay_ntc_adv_pay_flg.setValue(false);
			Hdr_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * フォーカスを設定する
	 */
	protected void setFocus() {
		String st = getStatus();
		if (isINSStatus(st) || isUPDStatus(st)) {
			HdrPanel.focusFirstComponent();
		}
		else {
			CndPanel.focusFirstComponent();
		}
	}

	// -----------------------------------------------
	// リストロジック・入力補助
	// -----------------------------------------------

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
	}

	@Override
	public MCList getHdr_ap_sttl_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getHdr_ap_sttl_cd(row, info), newList = list.createInstance();
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isACNT(sttlTyp)) {
				newList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isCASH(sttlTyp)) {
				newList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isNOTE(sttlTyp)) {
				newList.add(r);
			}
		}
		return newList;
	}

	@Override
	public MCList getHdr_com_paid_ap_sttl_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getHdr_com_paid_ap_sttl_cd(row, info), newList = list.createInstance();
		for (MCRow r : list) {
			String sttlTyp = r.getStringNE("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isACNT_COM_PAID(sttlTyp)) {
				newList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isCASH_COM_PAID(sttlTyp)) {
				newList.add(r);
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(sttlTyp)) {
				String setoffTyp = r.getStringNE("ap_setoff_typ");
				if (MAC_AP_SETOFF_TYP.isBSPPL(setoffTyp)) {
					newList.add(r);
				}
			}
		}
		return newList;
	}

	// -----------------------------------------------
	// インタフェース(IfOpePanel)
	// -----------------------------------------------

	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_adv_pay_act_rev;
	}

	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
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

	// -----------------------------------------------
	// インタフェース(IfCanAcDtBase)
	// -----------------------------------------------

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

	// -----------------------------------------------
	// 参照登録
	// -----------------------------------------------

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getHdrR()) {
			list.addAll(getHdrNotInheritCols(type));
		}
		return list;
	}
	
	protected List<String> getHdrNotInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(HdrR.$adv_pay_act_no);
		list.add(HdrR.$adv_pay_act_seq);
		list.add(HdrR.$adv_pay_act_rev);
		list.add(HdrR.$latest_flg);
		list.add(HdrR.$pay_act_dt);
		list.add(HdrR.$ac_ym);
		list.add(HdrR.$ac_dt);
		list.add(HdrR.$can_ac_dt);
		list.add(HdrR.$trd_cur_setoff_schd_amt);
		list.add(HdrR.$trd_cur_setoff_act_amt);
		list.add(HdrR.$trd_cur_not_proc_bal);
		list.add(HdrR.$adv_pay_upd_cntr);
		list.add(HdrR.$ins_usr_id);
		list.add(HdrR.$ins_usr_nm);
		list.add(HdrR.$ins_func_id);
		list.add(HdrR.$ins_func_nm);
		list.add(HdrR.$upd_usr_id);
		list.add(HdrR.$upd_usr_nm);
		list.add(HdrR.$upd_func_id);
		list.add(HdrR.$upd_func_nm);
		list.add(HdrR.$ins_ts);
		list.add(HdrR.$upd_ts);
		list.add(HdrR.$upd_srv_req_no);

		return list;
	}

}