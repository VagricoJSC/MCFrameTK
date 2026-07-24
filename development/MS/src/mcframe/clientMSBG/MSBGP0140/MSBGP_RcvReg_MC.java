package mcframe.clientMSBG.MSBGP0140;

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
import mcframe.clientMAUB.MAUBP0320.*;
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
import mcframe.clientCore.sys.MCSys;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import static mcframe.commonMSUA.MSUAC0080.MSUAC_List.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBGP_RcvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_RcvReg_MC extends MSBGP_RcvReg_MC_A implements IfOpePanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvReg_MC() {
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
	public MSBGP_RcvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Srch01Caller<P extends MSBGP_RcvReg, B extends MS_MSBGL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0140_Srch01Caller(P p, B b) {
			super(p, b);
			
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setModeRcv();
			HdrPanel.focusFirstComponent();
		}
		
		@Override
		protected void show() {
			super.show();
			getHdrR().base_cur_cd(getBaseCur().cur_cd());
			getHdrR().xrate_cd(getCo().sls_xrate_cd());
			
		}
		
	}

	/**
	 * [MS_MSBGL0140_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Ins01Caller<P extends MSBGP_RcvReg, B extends MS_MSBGL0140_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0140_Ins01Caller(P p, B b) {
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
		
		
		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		}
		
	}

	/**
	 * [MS_MSBGL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Upd01Caller<P extends MSBGP_RcvReg, B extends MS_MSBGL0140_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBGL0140_Upd01Caller(P p, B b) {
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
			getCndR().rcv_no(getHdrR().rcv_no());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setOpenBtnMode();
		
		}
		
		
		
		
	}

	/**
	 * [MS_MSBGL0140_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Del01Caller<P extends MSBGP_RcvReg, B extends MS_MSBGL0140_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBGL0140_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setBtnModeDisable();
		}
		
	}

	/**
	 * [MS_MSBGL0140_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0140_Prnt01Caller<P extends MSBGP_RcvReg, B extends MS_MSBGL0140_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBGL0140_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {			
			super.setMode();

			Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
			Btn_open_MSBGP0250.setMode(MCMode.DISABLE);
			
			HdrPanel.focusFirstComponent();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBGL0140_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0200(MCEventInfo info) {	
		MCRow bind = MCRow.create();
		
		bind.addStringColumn("dat_typ", getHdrR().dat_typ());
		bind.addStringColumn("rcv_no", getHdrR().rcv_no());

		openPanel("MS", "MSBGP0200", T1, bind);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0210(MCEventInfo info) {
		MCRow bind = MCRow.create();
		
		bind.addStringColumn("dat_typ", getHdrR().dat_typ());
		bind.addStringColumn("rcv_no", getHdrR().rcv_no());

		openPanel("MS", "MSBGP0210", T1, bind);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0160(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0160");
		
		mcframe.clientMSBG.MSBGP0160.CndR to = mcframe.clientMSBG.MSBGP0160.CndR.create();
		aso.runValueInit();
		to.rcv_no(getHdrR().rcv_no());
		
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBGP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0250(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0250");
		
		mcframe.clientMSBG.MSBGP0250.CndR to = mcframe.clientMSBG.MSBGP0250.CndR.create();
		aso.runValueInit();
		to.rcv_no(getHdrR().rcv_no());
		
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBGL0140_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBGL0140_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBGL0140_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBGL0140_Del01();
	}
	
	
	/**
	 * モード設定
	 * 
	 */
	protected void setModeRcv() {
		String rcvTyp = getHdrR().rcv_typ();
		MCNumber rcvAmt = getHdrR().rcv_amt();
		MCNumber applAmt = getHdrR().appl_amt();
		
		// 更新モード
		if (Cnd_ope_UPD.isSelected()) {
			// 入金処理済の場合、登録後モードとする
			if ((!isNull(rcvAmt) && !isNull(applAmt) && !applAmt.isZero())) {
				dialog(new MCMessage(MSBGP0004));
				setFix(HdrPanel, Hdr2Panel, NotePanel, BtnPanel, EastBtnPanel);
			}
			// 手形の場合
			else if (MAC_AR_STTL_TYP.isNOTE(rcvTyp)) {
				setUPD_NOTEStatus();
			}
			// その他
			else {
				setUPDStatus();
			}
			setValueEx(Hdr_opn_flg, true);
			
		}
		// 新規モード
		else if (Cnd_ope_INS.isSelected()) {
			// 手形の場合
			if (MAC_AR_STTL_TYP.isNOTE(rcvTyp)) {
				setINS_NOTEStatus();
			}
			// その他
			else {
				setINSStatus();
			}
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_rcv_dt, true);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_rcv_dt);
		Hdr_rcv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_com_paid_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_rcv_proc_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
		Hdr_not_proc_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_amt_dec_place);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setDefaultValues();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_rcv_amt.addNCListener(this);
		Hdr_rcv_dpt_cd.addLCListener(this);
	}
	
	/**
	 * 各フィールドにデフォルト値を設定する
	 * 
	 */
	protected void setDefaultValues() {
		setValueEx(Hdr_rcv_dt, getToday());
		setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Hdr_xrate_cd, getCo().sls_xrate_cd());
		setValueEx(Hdr_opn_flg, true);
	}
	
	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>起動タイプ：T1 （検索）<br>
	 * バインド値<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>rcv_no</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * </table>
	 * <br>
	 * その他の引数：なし</li>
	 * </P>
	 * 
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		
		super.initByScreenParam(openTyp, bind, args);
		
		if (T1 == openTyp) {
			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			
			setValueEx(Hdr_rcv_dt, bind.getDate("rcv_schd_dt"));
			setValueEx(Hdr_rcst_cd, bind.getString("rcst_cd"));
			setValueEx(Hdr_bcst_cd, bind.getString("bcst_cd"));
			setValueEx(Hdr_bill_dpt_cd, bind.getString("bill_dpt_cd"));
			setValueEx(Hdr_trd_cur_cd, bind.getString("trd_cur_cd"));
			setValueEx(Hdr_rcv_mtd_cd, bind.getString("rcv_mtd_cd"));
			setValueEx(Hdr_rcv_amt, bind.getNumber("rcv_amt"));
			valueInit();
		}

	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		if (nc == Hdr_rcv_amt) {
			doHdr_rcv_amt_NC();
		}
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == Hdr_rcv_dpt_cd) {
			doHdr_rcv_dpt_cd_LC(info);
		}
	}
	
	/**
	 * 入金処理額、未処理残高を計算
	 * 
	 */
	public void doHdr_rcv_amt_NC() {
		if (isNull(getHdrR().rcv_amt())) {
			getHdrR().not_proc_bal(null);
			return;
		}
		
		MCNumber rcv_amt = nvl(getHdrR().rcv_amt(), MCNumber.ZERO);
		MCNumber rcv_proc_amt = nvl(getHdrR().rcv_proc_amt(), MCNumber.ZERO);
		getHdrR().not_proc_bal(rcv_amt.subtract(rcv_proc_amt));
	}

	protected void doHdr_rcv_dpt_cd_LC(MCEventInfo info) {
		setDefaultAc();
	}

	@Override
	public void doHdr_rcv_dt_LC(MCEventInfo info) {
		super.doHdr_rcv_dt_LC(info);
		setDefAutoApplBasisDt();
		
		
	}
	
	@Override
	public void doHdr_rcv_auto_appl_tgt_flg_NC(MCEventInfo info) {
		super.doHdr_rcv_auto_appl_tgt_flg_NC(info);
		setAutoApplStsTyp();
		setAutoApplItemMode();
		setDefAutoApplBasisDt();
	}
	
	/**
	 * 入金自動消込対象ＦＬＧに応じて自動消込状況区分の値を設定する
	 */
	protected void setAutoApplStsTyp(){
		if (getHdrR().rcv_auto_appl_tgt_flg()) {
			setValueEx(Hdr_auto_appl_sts_typ, MSC_AUTO_APPL_STS_TYP.NOT_EXE.value());
		}
		else {
			setValueEx(Hdr_auto_appl_sts_typ, MSC_AUTO_APPL_STS_TYP.EXCLD.value());
		}
	}
	
	/**
	 * 入金自動消込関連項目のモード設定と値のクリアを行う	
	 */
	protected void setAutoApplItemMode(){
		if (getHdrR().rcv_auto_appl_tgt_flg()) {
			Hdr_auto_appl_basis_dt.setMode(MCMode.REQUIRED);
			Hdr_com_paid.setMode(MCMode.ENABLE);
		}
		else {
			Hdr_auto_appl_basis_dt.setMode(MCMode.READ_ONLY);
			Hdr_com_paid.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_auto_appl_basis_dt, null);
			setValueEx(Hdr_com_paid, null);
		}
	}
	
	@Override
	public void doHdr_rcst_cd_LC(MCEventInfo info) {
		super.doHdr_rcst_cd_LC(info);
		setBcst();
		setValueEx(Hdr_bcst_cd, null);
		setValueEx(Hdr_bill_dpt_cd, null);
		
		// 入金自動消込対象ＦＬＧのデフォルト設定
		setValueEx(Hdr_rcv_auto_appl_tgt_flg, getHdrR().rcv_auto_appl_tgt_flg());
		if (isNull(getHdrR().rcv_dt())) {
			getHdrR().auto_appl_basis_dt(null);
			return;
		}
		setDefAutoApplBasisDt();
		setXfrPsn();
	}
	
	protected void setXfrPsn() {
		if (!MAC_AR_STTL_TYP.isBANK(getHdrR().rcv_typ())) {
			getHdrR().xfr_psn(null);
		}
	}

	protected void setBcst() {
		if (isNull(getHdrR().rcst_cd())) {
			setValueEx(Hdr_bcst_cd, null);
			setValueEx(Hdr_bill_dpt_cd, null);
			setValueEx(Hdr_rcv_auto_appl_tgt_flg, false);
			Hdr_bcst_cd.setMode(MCMode.READ_ONLY);
			Hdr_bill_dpt_cd.setMode(MCMode.READ_ONLY);
			return;
		}
		else {
			Hdr_bcst_cd.setMode(MCMode.ENABLE);
			Hdr_bill_dpt_cd.setMode(MCMode.ENABLE);
		}
	}
	
	// 入金自動消込基準日のデフォルト設定
	protected void setDefAutoApplBasisDt() {
		// 入金日がNULLの場合は入金自動消込基準日をクリア
		if (isNull(getHdrR().rcv_dt())) {
			getHdrR().auto_appl_basis_dt(null);
			return;
		}
		// 自動消込遅延日数。nullの場合はゼロとする。
		MCNumber delayDays = isNull(getHdrR().auto_appl_delay_days()) ? MCNumber.ZERO
				: getHdrR().auto_appl_delay_days();
		if (getHdrR().rcv_auto_appl_tgt_flg()) {
			// 入金日を基準として遅延日数を加味した日付を入金自動消込基準日のデフォルトとする
			getHdrR().auto_appl_basis_dt(getHdrR().rcv_dt().addDay(delayDays));
		}
	}
	
	@Override
	public void doHdr_rcv_mtd_cd_LC(MCEventInfo info) {
		setModeRcv();
	}
	
	@Override
	public void doHdr_bcst_cd_LC(MCEventInfo info){
		super.doHdr_bcst_cd_LC(info);
		setValueEx(Hdr_bill_dpt_cd, null);
	}
	
	@Override
	public void doHdr_bcst_cd_NC(MCEventInfo info) {
		super.doHdr_bcst_cd_NC(info);
		setDefaultAc();
	}
	
	@Override
	public void doHdr_rcv_typ_NC(MCEventInfo info) {
		super.doHdr_rcv_typ_NC(info);
		Hdr_bank_ac_cd.clear();
		Hdr_bank_ac_nm.clear();
		Hdr_note_no.clear();
		Hdr_note_typ.clear();
		Hdr_note_typ_nm.clear();
		Hdr_draw_dt.clear();
		Hdr_due_dt.clear();
		Hdr_drawer_nm.clear();
		Hdr_endrsr.clear();
		Hdr_accptr.clear();
		Hdr_draw_bank_cd.clear();
		Hdr_draw_bank_nm.clear();
		Hdr_draw_branch_cd.clear();
		Hdr_draw_branch_nm.clear();
		Hdr_note_rsn_cd.clear();
		Hdr_note_rsn_nm.clear();
		Hdr_note_sub_char1.clear();
		Hdr_note_sub_char2.clear();
		Hdr_note_sub_char3.clear();
		
		setDefaultAc();
	}
	
	/**
	 * デフォルトの口座を設定する
	 * 
	 */
	protected void setDefaultAc() {

		if (MAC_AR_STTL_TYP.isBANK(getHdrR().rcv_typ())) {
			setValueEx(Hdr_bank_ac_cd, getHdrR().def_bank_ac_cd());
		}
	}
	
	@Override
	public void doHdr_note_typ_NC(MCEventInfo info) {

		super.doHdr_note_typ_NC(info);
		
		// 為替手形の場合
		if (MAC_NOTE_TYP.isXCHNG(getHdrR().note_typ())) {
			Hdr_accptr.setMode(MCMode.REQUIRED);
		}
		// 約束手形の場合
		else {
			Hdr_accptr.clear();
			Hdr_accptr.setMode(MCMode.READ_ONLY);
		}

	}
	
	@Override
	public void doHdr_draw_bank_cd_NC(MCEventInfo info) {
		super.doHdr_draw_bank_cd_NC(info);

		Hdr_draw_branch_cd.clear();
		Hdr_draw_branch_nm.clear();
	}
	
	@Override	
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {	
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// REF →　INS
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setRefToInsInit(bfSt);
		}
		
		// UPD →　INS
		if ((isSame(bfOpe, Cnd_ope_UPD.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))) {
			setUpdToInsInit();
		}
		
		// REF →　UPD
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_UPD.getActionCommand()))) {
			setRefToUpdInit(bfSt);
		}
		// DEL → INS
		if ((isSame(bfOpe, Cnd_ope_DEL.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()))){
			setUpdToInsInit();
		}
		
		
	}	
		
	protected void setRefToInsInit(String bfSt) {	
		// 参照登録
		if (bfSt == REF) {
			// 参照していたデータにより、新規に移った際のモードをセット
			setModeRcv();
			
			// 新規の入金処理額は「0」なので入金処理額を「null」に、未処理残高は入金額と同額にする
			
			getHdrR().rcv_proc_amt_p().amt(null);
			getHdrR().not_proc_bal(getHdrR().rcv_amt());
			getHdrR().rcv_no(null);
			getHdrR().fb_flg(false);
			getHdrR().ext_sys_cd(null);
			getHdrR().ext_sys_nm(null);
			getHdrR().ext_rcv_no(null);
			//入金日を計上日に設定する。
			setValueEx(Hdr_rcv_dt, getToday());
			// 自動消込状況区分は引き継げない
			setAutoApplStsTyp();
			//値を初期化する。
			setValueEx(Hdr_opn_flg, true);
			setValueEx(Hdr_prnt_flg, false);
			
			
		}
		// 初期化
		else if (bfSt == SRCH) {
			setDefaultValues();
		}
		
		HdrPanel.focusFirstComponent();
	}	
	
	protected void setUpdToInsInit() {	
		setDefaultValues();
		HdrPanel.focusFirstComponent();
	}	

	protected void setRefToUpdInit(String bfSt) {	
	
		
		// 参照（検索前）→ 更新の場合は画面のモードを変更しない。
		if (bfSt == SRCH) {
			return;
		}
		
		// 入金処理額が０より大きい場合、更新不可
		// 参照から更新に移った場合にチェックされないのでここでチェックする
		setModeRcv();
		HdrPanel.focusFirstComponent();
	}
	

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			// 種別切り替え時に検索区分が変わる場合は、種別変更後の検索区分とNOの整合性を考え、適切なNOを検索条件に設定する
			// 検索区分とNOの整合性が取れない場合は、検索条件のNOを設定しない
			getCndR().rcv_no(getHdrR().rcv_no());
		}
	}
	
	@Override
	public void setMode(String status) {
		super.setMode(status);
		setBankAcMode();
	}
	
	/**
	 * 入金方法が「振込」以外の場合、口座・振込人名を入力不可にする
	 * 
	 */
	protected void setBankAcMode() {
		if (sruiffIsINSStatus() || sruiffIsUPDStatus()) {
			// 振込でない場合
			if (!MAC_AR_STTL_TYP.isBANK(getHdrR().rcv_typ())) {
				Hdr_bank_ac_cd.setMode(MCMode.READ_ONLY);
				Hdr_xfr_psn.setMode(MCMode.READ_ONLY);
			}
			// 振込の場合
			else {
				Hdr_bank_ac_cd.setMode(MCMode.REQUIRED);
				Hdr_xfr_psn.setMode(MCMode.ENABLE);
			}
		}
	}
	
	
	protected boolean sruiffIsINSStatus() {
		return getStatus() == INS || getStatus() == INS_NOTE;
	}

	protected boolean sruiffIsUPDStatus() {
		return getStatus() == UPD || getStatus() == UPD_NOTE;
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public void setUPD_NOTEStatus() {
		super.setUPD_NOTEStatus();
		setNoteTypMode();
		setAutoApplItemMode();
		setBcst();
	}
	
	@Override
	public void setINS_NOTEStatus() {
		super.setINS_NOTEStatus();
		setNoteTypMode();
		setAutoApplItemMode();
		setBcst();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		Cnd_ope_INS.mcRequestFocus();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setOpenBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setAutoApplItemMode();
		setBcst();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setAutoApplItemMode();
		setBcst();
	}

	/**
	 * 画面遷移ボタンのモード設定を行う
	 * 
	 */
	protected void setOpenBtnMode() {
		
		
		if (isNull(getHdrR().rcv_proc_amt())) {
			Btn_open_MSBGP0250.setMode(MCMode.DISABLE);
			return;
		
		}
		// 入金処理額が0の場合、伝票が存在していないのでMSBGP0250に遷移するボタンをdisableにする
		if (getHdrR().rcv_proc_amt().isPositive()) {
			Btn_open_MSBGP0250.setMode(MCMode.ENABLE);
		}
		else {
			Btn_open_MSBGP0250.setMode(MCMode.DISABLE);
		}
	}
	
	protected void setNoteTypMode() {
		Hdr_rcst_cd.setMode(MCMode.REQUIRED);
		
		if (MAC_NOTE_TYP.isXCHNG(getHdrR().note_typ())) {
			Hdr_accptr.setMode(MCMode.REQUIRED);
		}
		else {
			Hdr_accptr.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr_accptr, null);
		}
	}
	
	/**
	 * 画面遷移ボタンをdisableにする
	 * 
	 */
	protected void setBtnModeDisable() {
		Btn_open_MSBGP0200.setMode(MCMode.DISABLE);
		Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
		Btn_open_MSBGP0160.setMode(MCMode.DISABLE);
		Btn_open_MSBGP0250.setMode(MCMode.DISABLE);
	}
	
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

}