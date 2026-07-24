package mcframe.clientMSBH.MSBHP0160;

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
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMSUB.MSUBP0010.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUA.MAUAP0010.MAUAP_List;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientCore.beans.list.MCLinkBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_ApSwBalReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_ApSwBalReg_MC extends MSBHP_ApSwBalReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApSwBalReg_MC() {
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
	public MSBHP_ApSwBalReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Upd01Caller<P extends MSBHP_ApSwBalReg, B extends MS_MSBHL0160_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0160_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected boolean checkForCall() {
			if (!super.checkForCall()) {
				return false;
			}
			MCList<SwFrR> checkedL = getSwFrL().subList(SwFrR.$check, true);
			if (!checkForUpd(checkedL)) {
				return false;
			}
			return true;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBHL0160_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Upd02Caller<P extends MSBHP_ApSwBalReg, B extends MS_MSBHL0160_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBHL0160_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected boolean checkForCall() {
			if (!super.checkForCall()) {
				return false;
			}
			MCList<SwFrR> checkedL = getSwFrL().subList(SwFrR.$check, true);
			if (!checkForUpd(checkedL)) {
				return false;
			}
			return true;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * 登録前チェック
	 * 
	 * @param チェック対象の明細（選択チェックされた行のみを渡すこと）
	 * @return 登録可否
	 */
	protected boolean checkForUpd(MCList<SwFrR> chkL) {
		for (SwFrR r : chkL) {

			// 振替元と振替先の買掛先、債務部門、支払予定管理先部門、案件が同じ場合
			// 案件が同一であるかは以下の判定を行う
			// ・案件処理区分が「案件別債務管理する」かつ振替元、振替先の案件が等しい
			// ・案件処理区分が「案件別債務管理しない」かつ振替元の案件がNULL文字
			// ・案件処理区分がNULL
			if (isSame(r.asppl_cd(), getSwToR().asppl_cd())
					&& isSame(r.ap_dpt_cd(), getSwToR().ap_dpt_cd())
					&& isSame(r.bsppl_dpt_cd(), getSwToR().bsppl_dpt_cd())
					&& (MSC_WRK_OPE_TYP.isWRK(getSwToR().ap_wrk_ope_typ())
							// この時点では通信用の案件ＣＤに値がないので表示用でチェック
							&& isSame(r.wrk_no(), getSwToR().wrk_no())
							|| MSC_WRK_OPE_TYP.isNOT_WRK(getSwToR().ap_wrk_ope_typ())
							&& MAC_STR.isNULL_VAL(r.wrk_no()) || isNull(getSwToR()
							.ap_wrk_ope_typ()))) {
				if (confirm(MSBHP0010) != MCMessageBox.YES_OPTION) {
					SwFrTable.focusCellAt(r.getGUIIndex(), columnSwFr_check);
					return false;
				}
				else {
					break;
				}
			}

		}
		return true;

	}

	/**
	 * [MS_MSBHL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Srch01Caller<P extends MSBHP_ApSwBalReg, B extends MS_MSBHL0160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0160_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			getSwR().clear();
			getSwToR().clear();
		}
		
		@Override	
		protected void setMode() {
			setValueEx(Sw_sw_dt, getToday());
			setValueEx(Sw_ac_dt, getToday());
			setValueEx(Sw_pay_basis_dt, getToday());
			setValueEx(Sw_pay_crryovr_times, MCNumber.ZERO);
			
			getSwToR().trd_cur_cd(getCndR().trd_cur_cd());
			getSwToR().trd_cur_nm(getCndR().trd_cur_nm());
			getSwToR().amt_dec_place(getCndR().amt_dec_place());
			
			getSwR().setStatus(Status.NONE);	
			getSwToR().setStatus(Status.NONE);
			
			setUPDStatus();
		}
		@Override	
		protected void setModeNoDown() {
			setSRCHStatus();
		}
	}

	/**
	 * [MS_MSBHL0160_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Srch02Caller<P extends MSBHP_ApSwBalReg, B extends MS_MSBHL0160_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0160_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			getSwR().clear();
			getSwToR().clear();
		}
		@Override	
		protected void setMode() {
			setValueEx(Sw_sw_dt, getToday());
			setValueEx(Sw_ac_dt, getToday());
			
			getSwToR().trd_cur_cd(getCndR().trd_cur_cd());
			getSwToR().trd_cur_nm(getCndR().trd_cur_nm());
			getSwToR().amt_dec_place(getCndR().amt_dec_place());
			
			getSwR().setStatus(Status.NONE);	
			getSwToR().setStatus(Status.NONE);
			
			setUPDStatus();
		}
		@Override	
		protected void setModeNoDown() {
			setSRCHStatus();
		}
	}

	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Typ_typ_chk_bal.isSelected()) {
			callMS_MSBHL0160_Srch01();
		}
		if (Typ_typ_not_chk.isSelected()) {
			callMS_MSBHL0160_Srch02();
		}
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Typ_typ_chk_bal.isSelected()) {
			callMS_MSBHL0160_Upd01();
		}
		if (Typ_typ_not_chk.isSelected()) {
			callMS_MSBHL0160_Upd02();
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(SwFrTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(SwFrTable);
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setSwMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setSwMode();
		SwFrTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setSwMode();
		CndPanel.focusFirstComponent();
	}

	/**
	 * 照合済残高振替と未照合残高振替の表示を切り替える
	 */
	protected void setSwMode() {
		// 照合済残高振替
		if (isSame(Typ_typ_Group.getValue(), Typ_typ_chk_bal.getActionCommand())) {
			setChkBalMode();
		}
		// 未照合残高振替
		else {
			setNotChkMode();
		}
	}

	/**
	 * 照合済残高振替の表示設定
	 */
	protected void setChkBalMode() {
		if (isSame(getStatus(), UPD)) {
			Sw_pay_basis_dt.setMode(getDefaultMode(Sw_pay_basis_dt));
			Sw_pay_crryovr_times.setMode(getDefaultMode(Sw_pay_crryovr_times));
		}
		columnSwFr_slip_sts_typ_nm.setMode(MCMode.INVISIBLE);
		columnSwFr_ap_sttl_cd.setMode(getDefaultMode(columnSwFr_ap_sttl_cd));
		columnSwFr_ap_sttl_nm.setMode(getDefaultMode(columnSwFr_ap_sttl_nm));
		columnSwFr_ap_sttl_typ.setMode(getDefaultMode(columnSwFr_ap_sttl_typ));
		columnSwFr_ap_sttl_typ_nm.setMode(getDefaultMode(columnSwFr_ap_sttl_typ_nm));
		columnSwFr_pay_schd_no.setMode(getDefaultMode(columnSwFr_pay_schd_no));
		columnSwFr_pay_chk_no.setMode(getDefaultMode(columnSwFr_pay_chk_no));
		
		columnSwFr_pay_basis_dt.setMode(MCMode.INVISIBLE);
		columnSwFr_pay_crryovr_times.setMode(MCMode.INVISIBLE);
		
		columnSwFr_ap_d_no.setMode(MCMode.INVISIBLE);
		columnSwFr_sw_src_pay_schd_no.setMode(MCMode.INVISIBLE);
		
		columnSwFr_trd_cd.setMode(MCMode.INVISIBLE);
		columnSwFr_trd_nm.setMode(MCMode.INVISIBLE);
		
		columnSwFr_act_no.setMode(MCMode.INVISIBLE);
		columnSwFr_act_rev.setMode(MCMode.INVISIBLE);
		columnSwFr_act_d_no.setMode(MCMode.INVISIBLE);
		
		columnSwFr_purc_dpt_cd.setMode(MCMode.INVISIBLE);
		columnSwFr_purc_dpt_nm.setMode(MCMode.INVISIBLE);
		
		columnSwFr_tgt_sw_amt.setMode(getDefaultMode(columnSwFr_tgt_sw_amt));
		columnSwFr_interim_flg.setMode(MCMode.INVISIBLE);
		
		columnSwFr_purc_wrk_no.setMode(MCMode.INVISIBLE);
		columnSwFr_purc_wrk_nm.setMode(MCMode.INVISIBLE);
		
		columnSwFr_xrate.setMode(MCMode.INVISIBLE);
		
		columnSwFr_purc_act_no.setMode(getDefaultMode(columnSwFr_purc_act_no));
		
		columnSwFr_ac_dt.setMode(MCMode.INVISIBLE);
		columnSwFr_ac_ym.setMode(MCMode.INVISIBLE);
		
		columnSwFr_sppl_cd.setMode(MCMode.INVISIBLE);
		columnSwFr_sppl_nm.setMode(MCMode.INVISIBLE);
		columnSwFr_po_no.setMode(MCMode.INVISIBLE);
		columnSwFr_po_d_no.setMode(MCMode.INVISIBLE);
		columnSwFr_bp_dlv_slip_no.setMode(MCMode.INVISIBLE);
		columnSwFr_bp_dlv_slip_d_no.setMode(MCMode.INVISIBLE);
	}

	/**
	 * 未照合残高振替の表示設定
	 */
	protected void setNotChkMode() {
		if (isSame(getStatus(), UPD)) {
			Sw_pay_basis_dt.setMode(MCMode.ENABLE);
			if (isNull(getSwR().pay_basis_dt())) {
				Sw_pay_crryovr_times.setMode(MCMode.READ_ONLY);
			}
			else {
				Sw_pay_crryovr_times.setMode(getDefaultMode(Sw_pay_crryovr_times));
			}
		}
		columnSwFr_slip_sts_typ_nm.setMode(getDefaultMode(columnSwFr_slip_sts_typ_nm));
		columnSwFr_ap_sttl_cd.setMode(MCMode.INVISIBLE);
		columnSwFr_ap_sttl_nm.setMode(MCMode.INVISIBLE);
		columnSwFr_ap_sttl_typ.setMode(MCMode.INVISIBLE);
		columnSwFr_ap_sttl_typ_nm.setMode(MCMode.INVISIBLE);
		columnSwFr_pay_schd_no.setMode(MCMode.INVISIBLE);
		columnSwFr_pay_chk_no.setMode(MCMode.INVISIBLE);
		
		columnSwFr_pay_basis_dt.setMode(getDefaultMode(columnSwFr_pay_basis_dt));
		columnSwFr_pay_crryovr_times.setMode(getDefaultMode(columnSwFr_pay_crryovr_times));
	
		columnSwFr_ap_d_no.setMode(getDefaultMode(columnSwFr_ap_d_no));
		columnSwFr_sw_src_pay_schd_no.setMode(getDefaultMode(columnSwFr_sw_src_pay_schd_no));
		
		columnSwFr_trd_cd.setMode(getDefaultMode(columnSwFr_trd_cd));
		columnSwFr_trd_nm.setMode(getDefaultMode(columnSwFr_trd_nm));
		
		columnSwFr_act_no.setMode(getDefaultMode(columnSwFr_act_no));
		columnSwFr_act_rev.setMode(getDefaultMode(columnSwFr_act_rev));
		columnSwFr_act_d_no.setMode(getDefaultMode(columnSwFr_act_d_no));
		
		columnSwFr_purc_dpt_cd.setMode(getDefaultMode(columnSwFr_purc_dpt_cd));
		columnSwFr_purc_dpt_nm.setMode(getDefaultMode(columnSwFr_purc_dpt_nm));
		
		columnSwFr_tgt_sw_amt.setMode(MCMode.INVISIBLE);
		columnSwFr_interim_flg.setMode(getDefaultMode(columnSwFr_interim_flg));
		
		columnSwFr_purc_wrk_no.setMode(getDefaultMode(columnSwFr_purc_wrk_no));
		columnSwFr_purc_wrk_nm.setMode(getDefaultMode(columnSwFr_purc_wrk_nm));
		
		columnSwFr_xrate.setMode(getDefaultMode(columnSwFr_xrate));
		
		columnSwFr_purc_act_no.setMode(MCMode.INVISIBLE);
		
		columnSwFr_ac_dt.setMode(getDefaultMode(columnSwFr_ac_dt));
		columnSwFr_ac_ym.setMode(getDefaultMode(columnSwFr_ac_ym));
		
		columnSwFr_sppl_cd.setMode(getDefaultMode(columnSwFr_sppl_cd));
		columnSwFr_sppl_nm.setMode(getDefaultMode(columnSwFr_sppl_nm));
		columnSwFr_po_no.setMode(getDefaultMode(columnSwFr_sppl_nm));
		columnSwFr_po_d_no.setMode(getDefaultMode(columnSwFr_po_d_no));
		columnSwFr_bp_dlv_slip_no.setMode(getDefaultMode(columnSwFr_bp_dlv_slip_no));
		columnSwFr_bp_dlv_slip_d_no.setMode(getDefaultMode(columnSwFr_bp_dlv_slip_d_no));
	}

	/**
	 *支払起算日のモードを制御します
	 */
	protected void setModePayBasisDt() {
		if (Typ_typ_chk_bal.isSelected()) {
			if (getSwToR().pay_spot_flg()) {
				Sw_pay_basis_dt.setMode(MCMode.ENABLE);
			}
			else {
				Sw_pay_basis_dt.setMode(getDefaultMode(Sw_pay_basis_dt));
			}
		}
	}
	
	/**
	 * 支払繰越回数のモードを制御します
	 */
	protected void setModePayCrryovrTimes() {
		if (getSwToR().pay_spot_flg()) {
			Sw_pay_crryovr_times.clear();
			setValueEx(Sw_pay_crryovr_times, MCNumber.ZERO);
			Sw_pay_crryovr_times.setMode(MCMode.READ_ONLY);
		}
		else if (!isNull(getSwR().pay_basis_dt())) {
			Sw_pay_crryovr_times.setMode(getDefaultMode(Sw_pay_crryovr_times));
		}
		else {
			setValueEx(Sw_pay_crryovr_times, null);
			Sw_pay_crryovr_times.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 *支払予定日のモードを制御します
	 */
	protected void setModePaySchdDt() {
		if (getSwToR().pay_spot_flg() || isNull(getSwToR().bsppl_cd())) {
			Sw_pay_schd_dt.setMode(getDefaultMode(Sw_pay_schd_dt));
		}
		else {
			Sw_pay_schd_dt.clear();
			Sw_pay_schd_dt.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Sw_usr_dpt_p_PPanel.setRelateBeans(Sw_ac_dt);

		SwFr_inc_tax_amt_p_PPanel.setRelateBeans(columnSwFr_trd_cur_cd, columnSwFr_amt_dec_place);
		SwFr_tgt_sw_amt_p_PPanel.setRelateBeans(columnSwFr_trd_cur_cd, columnSwFr_amt_dec_place);

		SwTo_tgt_sw_amt_p_PPanel.setRelateBeans(SwTo_trd_cur_cd, SwTo_amt_dec_place);
	}
	
	@Override	
	protected void listInit() {	
		super.listInit();
		getSwTo_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Sw_ac_dt);
		getSwTo_bsppl_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Sw_ac_dt);
		SwTo_bsppl_cd.getListConfig().setPutter(getMySwTo_bsppl_cd_ListPutter());
	}
	@Override
	public MCList<?> getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList<?> list =  super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == SwTo_bsppl_cd) return getSwTo_bsppl_cd(row, info);
		return null;
	}
	private MCListPutter MySwTo_bsppl_cd_p = null;
	protected MCListPutter getMySwTo_bsppl_cd_ListPutter() {
		if (MySwTo_bsppl_cd_p == null) {
			MySwTo_bsppl_cd_p = createMySwTo_bsppl_cd_ListPutter(SwTo_bsppl_cd, "bsppl_cd", "bsppl_nm", "pay_spot_flg");
		}
		return MySwTo_bsppl_cd_p;
	}
	protected MCListPutter createMySwTo_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	public MCList<?> getSwTo_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}
	
	@Override
	public MCList<MCRow> getSw_ap_sttl_cd(MCRow row, MCEventInfo info) {
		@SuppressWarnings("unchecked")
		MCList<MCRow> tmpL = super.getSw_ap_sttl_cd(row, info);
		MCList<MCRow> rsltL = tmpL.createInstance();
		for (MCRow r : tmpL) {
			String apSttlTyp = r.getStringNE("ap_sttl_typ");
			if (isSame(Typ_typ_Group.getValue(), Typ_typ_chk_bal.getActionCommand())) {
				if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(apSttlTyp)) {
					rsltL.add(r);
				}
			}
			else {
				if (MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(apSttlTyp)) {
					rsltL.add(r);
				}
			}
		}
		return rsltL;
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Typ_typ_Group, Typ_typ_not_chk.getActionCommand());
		setValueEx(Cnd_trd_cur_cd, getCo().base_cur_cd());
	}

	@Override
	public void doTyp_typ_NC(MCEventInfo info) {
		getSwFrL().clear();
		getSwR().clear();
		getSwToR().clear();
		setSRCHStatus();
	}
	
	@Override
	public void doSwFr_check_NC(MCEventInfo info) {
		super.doSwFr_check_NC(info);
		setAmtFields();
	}

	@Override
	public void doSwTo_ap_wrk_ope_typ_LC(MCEventInfo info){
		super.doSwTo_ap_wrk_ope_typ_LC(info);
		if (MSC_WRK_OPE_TYP.isWRK(getSwToR().ap_wrk_ope_typ())) {
			// 指定した案件に振替
			SwTo_wrk_no.setMode(MCMode.REQUIRED);
		}
		else {
			// 案件は振替しない
			setValueEx(SwTo_wrk_no, null);
			SwTo_wrk_no.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override	
	public void doSw_sw_dt_NC(MCEventInfo info) {	
		super.doSw_sw_dt_NC(info);
		setValueEx(Sw_ac_dt, getSwR().sw_dt());
		if (Typ_typ_chk_bal.isSelected()) {
			setValueEx(Sw_pay_basis_dt, getSwR().sw_dt());
		}
	}
	
	@Override	
	public void doSw_pay_basis_dt_NC(MCEventInfo info) {	
		super.doSw_pay_basis_dt_NC(info);
		setModePayCrryovrTimes();
	}
	
	@Override
	public void doSwTo_bsppl_cd_LC(MCEventInfo info) {
		super.doSwTo_bsppl_cd_LC(info);
		setModePayBasisDt();
		setModePayCrryovrTimes();
		setModePaySchdDt();
	}
	
	/**
	 * 各種金額フィールドの設定
	 */
	protected void setAmtFields() {
		if (getSwFrL().size() == 0) {
			getSwToR().tgt_sw_amt(MCNumber.ZERO);
			return;
		}
		MCNumber sum = MCNumber.ZERO;
		// 照合済残高振替
		if (isSame(Typ_typ_Group.getValue(), Typ_typ_chk_bal.getActionCommand())) {
			sum = getSwFrL().subList(SwFrR.$check, true).sum(SwFrR.$tgt_sw_amt);
		}
		// 未照合残高振替
		else {
			sum = getSwFrL().subList(SwFrR.$check, true).sum(SwFrR.$inc_tax_amt);
		}
		getSwToR().tgt_sw_amt(sum);
	}
	
	@Override
	public MCTable<SwFrR> getListRegTable() {
		return SwFrTable;
	}

}