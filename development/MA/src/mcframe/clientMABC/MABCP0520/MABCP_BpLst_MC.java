package mcframe.clientMABC.MABCP0520;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_BpLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BpLst_MC extends MABCP_BpLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Boolean IS_ALL_COM = true ;
	protected String _MST_SET_TYP;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BpLst_MC() {
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
	public MABCP_BpLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//ディバイダの位置を調整する
	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		getSplitPane(TopPanel).setDividerLocation(240);
	}

	protected String getMstSetTyp() {
		if(isNull(_MST_SET_TYP)) {
			_MST_SET_TYP = getRLUtil().getMstSetTyp(MAC_MST_NM.MAM_BP);
		}
		return _MST_SET_TYP;
	}
	protected boolean isAllCom() {
		return MAC_MST_SET_TYP.isALL_COM(getMstSetTyp()) ;
	}
	protected boolean isAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getMstSetTyp()) ;
	}
	/**
	 * [MA_MABCL0520_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0520_Srch01Caller<P extends MABCP_BpLst, B extends MA_MABCL0520_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0520_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_own_co_flg_on, Cnd_own_co_flg_off));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$org_cst_flg, bridge.down0(), DtlR.$cst_flg);
			bridge.down0().setColumnValue(DtlR.$org_acst_flg, bridge.down0(), DtlR.$acst_flg);
			bridge.down0().setColumnValue(DtlR.$org_bcst_flg, bridge.down0(), DtlR.$bcst_flg);
			bridge.down0().setColumnValue(DtlR.$org_rcst_flg, bridge.down0(), DtlR.$rcst_flg);
			bridge.down0().setColumnValue(DtlR.$org_sppl_flg, bridge.down0(), DtlR.$sppl_flg);
			bridge.down0().setColumnValue(DtlR.$org_asppl_flg, bridge.down0(), DtlR.$asppl_flg);
			bridge.down0().setColumnValue(DtlR.$org_bsppl_flg, bridge.down0(), DtlR.$bsppl_flg);
			bridge.down0().setColumnValue(DtlR.$org_psppl_flg, bridge.down0(), DtlR.$psppl_flg);
			bridge.down0().setColumnValue(DtlR.$org_cred_flg, bridge.down0(), DtlR.$cred_flg);
			bridge.down0().setColumnValue(DtlR.$org_dlv_flg, bridge.down0(), DtlR.$dlv_flg);
			bridge.down0().setColumnValue(DtlR.$org_maker_flg, bridge.down0(), DtlR.$maker_flg);
			bridge.down0().setColumnValue(DtlR.$org_dest_flg, bridge.down0(), DtlR.$dest_flg);
			bridge.down0().setColumnValue(DtlR.$org_onr_prsppl_flg, bridge.down0(), DtlR.$onr_prsppl_flg);
			bridge.down0().setColumnValue(DtlR.$org_tdlv_flg, bridge.down0(), DtlR.$tdlv_flg);
			bridge.down0().setColumnValue(DtlR.$org_all_com_flg, bridge.down0(), DtlR.$all_com_flg);

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			bridge.down0().setColumnValue(DtlR.$check_ar_dpt_cd, bridge.down0(), DtlR.$ar_dpt_cd);
			bridge.down0().setColumnValue(DtlR.$check_bcst_dpt_cd, bridge.down0(), DtlR.$bcst_dpt_cd);
			bridge.down0().setColumnValue(DtlR.$check_ap_dpt_cd, bridge.down0(), DtlR.$ap_dpt_cd);
			bridge.down0().setColumnValue(DtlR.$check_bsppl_dpt_cd, bridge.down0(), DtlR.$bsppl_dpt_cd);
			bridge.down0().setColumnValue(DtlR.$check_vmi_purc_dpt_cd, bridge.down0(), DtlR.$vmi_purc_dpt_cd);
			bridge.down0().setColumnValue(DtlR.$check_pay_dpt_cd, bridge.down0(), DtlR.$pay_dpt_cd);
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0520_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0520_Upd01Caller<P extends MABCP_BpLst, B extends MA_MABCL0520_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0520_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			
			if (isAllComCom() && Cnd_reg_COM.isSelected()) {
				getCndR().upd_only_com_flg(true);
			}
			else {
				getCndR().upd_only_com_flg(false);
			}
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			if (isAllCom()) {
				for (DtlR r : getDtlL().subList(DtlR.$check, true)) {
					msgList.addAll(checkAtLeastOne(r, columnDtl_all_com_flg, columnDtl_com_use_flg));
				}
			}
		}

		MCList<DtlR> _upBk = MCList.create(DtlR.class);
		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			_upBk=bridge.up0().clone();
			for (DtlR r : bridge.up0()) {
				// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
				setCheckDpt(r, DtlR.$ar_dpt_cd, DtlR.$check_ar_dpt_cd);
				setCheckDpt(r, DtlR.$bcst_dpt_cd, DtlR.$check_bcst_dpt_cd);
				setCheckDpt(r, DtlR.$ap_dpt_cd, DtlR.$check_ap_dpt_cd);
				setCheckDpt(r, DtlR.$bsppl_dpt_cd, DtlR.$check_bsppl_dpt_cd);
				setCheckDpt(r, DtlR.$vmi_purc_dpt_cd, DtlR.$check_vmi_purc_dpt_cd);
				setCheckDpt(r, DtlR.$pay_dpt_cd, DtlR.$check_pay_dpt_cd);
			}
		}

		@Override
		protected void handleMCEx(MCException ex) {
			MCIndexKey index = bridge.up0().createIndex(DtlR.$bp_cd);
			for (DtlR r : _upBk) {
				DtlR first = bridge.up0().getFirst(index, r.bp_cd());
				first.check_ar_dpt_cd(r.check_ar_dpt_cd());
				first.check_bcst_dpt_cd(r.check_bcst_dpt_cd());
				first.check_ap_dpt_cd(r.check_ap_dpt_cd());
				first.check_bsppl_dpt_cd(r.check_bsppl_dpt_cd());
				first.check_vmi_purc_dpt_cd(r.check_vmi_purc_dpt_cd());
				first.check_pay_dpt_cd(r.check_pay_dpt_cd());
			}
			super.handleMCEx(ex);
		}
		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(MCRow r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}

		@Override
		protected void setMode() {
			super.setMode();

			setBtnMode(DtlTable.getMCSelectedRow());
		}
	}

	/**
	 * [MA_MABCL0520_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0520_Del01Caller<P extends MABCP_BpLst, B extends MA_MABCL0520_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0520_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[cnd_select_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_select_all(MCEventInfo info) {
		setSrchCndFlgOn();
	}
	/**
	 * Panel[Cnd]のボタン[cnd_deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_deselect_all(MCEventInfo info) {
		setSrchCndFlgOff();
	}
	@Override
	public void doCnd_reg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_reg_NC(info);
		setRegTargetMode();
		if(isAllComCom() && Cnd_reg_COM.isSelected()) {
			getCndR().upd_only_com_flg(true);
		} else {
			getCndR().upd_only_com_flg(false);
		}
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0520_Srch01();
	}
	/**
	 * Panel[Show]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doShow_select_all(MCEventInfo info) {
		setShowFlg(true);
		displayColumn();
		setCmnColumnMode();
	}
	/**
	 * Panel[Show]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doShow_deselect_all(MCEventInfo info) {
		setShowFlg(false);
		displayColumn();
	}

	/**
	 * 遷移先[MABCP0510]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0510.CndR crtOpenMABCP0510CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0510.CndR to = mcframe.clientMABC.MABCP0510.CndR.create();
		mcframe.clientMABC.MABCP0510.MABCP_BpReg p = (mcframe.clientMABC.MABCP0510.MABCP_BpReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.bp_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0510]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0510(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0510");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0510CndR(aso, row));
		aso.show();
	}

	/**
	 * 遷移先[MABCP0540]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0540.CndR crtOpenMABCP0540CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0540.CndR to =
			mcframe.clientMABC.MABCP0540.CndR.create();
		to.bp_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0540]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0540(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0540");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0540CndR(aso, row));
		aso.show();
	}

	/**
	 * 遷移先[MABCP0560]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0560.CndR crtOpenMABCP0560CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0560.CndR to =
			mcframe.clientMABC.MABCP0560.CndR.create();
		to.bp_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0560]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0560(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0560");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0560CndR(aso, row));
		aso.show();
	}

	/**
	 * 遷移先[MABCP0570]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0570.CndR crtOpenMABCP0570CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0570.CndR to =
			mcframe.clientMABC.MABCP0570.CndR.create();
		to.bp_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0570]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0570(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0570");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0570CndR(aso, row));
		aso.show();	
	}

	/**
	 * 遷移先[MABCP0580]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0580.CndR crtOpenMABCP0580CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0580.CndR to =
			mcframe.clientMABC.MABCP0580.CndR.create();
		to.bp_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0580]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0580(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0580");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0580CndR(aso, row));
		aso.show();
	}

	/**
	 * 遷移先[MABCP0590]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0590.CndR crtOpenMABCP0590CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0590.CndR to =
			mcframe.clientMABC.MABCP0590.CndR.create();
		to.cred_cd(r.bp_cd());
		if (!isNull(r.bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0590]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0590(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0590");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0590CndR(aso, row));
		aso.show();	
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
		DtlR r = copyRow(DtlTable);

		if (r != null) {
			r.check_ar_dpt_cd(null);
			r.check_bcst_dpt_cd(null);
			r.check_ap_dpt_cd(null);
			r.check_bsppl_dpt_cd(null);
			r.check_vmi_purc_dpt_cd(null);
			r.check_pay_dpt_cd(null);
		}
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL0520_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0520_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL0520_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));

		getMstR().mst_set_typ(getMstSetTyp());
		IS_ALL_COM = isAllCom();
		if(isAllComCom()) {
			getCndR().own_co_flg_on(true);
		} else {
			getCndR().own_co_flg_on(true);
			getCndR().own_co_flg_off(true);
		}
		setSrchCndFlgOn();
		setComFlgMode();

		setShowFlg(true);
		displayColumn();
		setRegTargetMode();
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isDestEnabled(this)) {
			setComponentInvisibleAllStatus(Cnd_dest_flg, columnDtl_dest_flg);
		}
		if (!isCredEnabled(this)) {
			setComponentInvisibleAllStatus(DtlBtn_open_MABCP0590);
		}
		if(isAllComCom()) {
			setComponentInvisibleAllStatus(getSysDelBeans());
		}
		else {
			// 「共通・会社別」用の項目を非表示にする。
			setComponentInvisibleAllStatus(RegTargetPanel);
			setComponentInvisibleAllStatus(Cnd_own_co_flg_lab, Cnd_own_co_flg_off, Cnd_own_co_flg_on);
			setComponentInvisibleAllStatus(getCmnSysBeans());
		}
	}

	/**
	 * 検索条件の得意先ＦＬＧなどをオンに設定します。
	 */
	protected void setSrchCndFlgOn(){
		setValueEx(Cnd_cst_flg, true);
		setValueEx(Cnd_acst_flg, true);
		setValueEx(Cnd_bcst_flg, true);
		setValueEx(Cnd_rcst_flg, true);
		setValueEx(Cnd_dlv_flg, true);
		setValueEx(Cnd_dest_flg, true);
		setValueEx(Cnd_cred_flg, true);
		setValueEx(Cnd_sppl_flg, true);
		setValueEx(Cnd_asppl_flg, true);
		setValueEx(Cnd_bsppl_flg, true);
		setValueEx(Cnd_psppl_flg, true);
		setValueEx(Cnd_maker_flg, true);
	}

	/**
	 * 検索条件の得意先ＦＬＧなどをオフに設定します。
	 */
	protected void setSrchCndFlgOff(){
		setValueEx(Cnd_cst_flg, false);
		setValueEx(Cnd_acst_flg, false);
		setValueEx(Cnd_bcst_flg, false);
		setValueEx(Cnd_rcst_flg, false);
		setValueEx(Cnd_dlv_flg, false);
		setValueEx(Cnd_dest_flg, false);
		setValueEx(Cnd_cred_flg, false);
		setValueEx(Cnd_sppl_flg, false);
		setValueEx(Cnd_asppl_flg, false);
		setValueEx(Cnd_bsppl_flg, false);
		setValueEx(Cnd_psppl_flg, false);
		setValueEx(Cnd_maker_flg, false);
	}

	protected void setShowFlg(boolean flg){
		getShowR().cmn_flg(flg);
		getShowR().cst_flg(flg);
		getShowR().acst_flg(flg);
		getShowR().bcst_flg(flg);
		getShowR().rcst_flg(flg);
		getShowR().dlv_flg(flg);
		getShowR().sppl_flg(flg);
		getShowR().asppl_flg(flg);
		getShowR().bsppl_flg(flg);
		getShowR().psppl_flg(flg);
	}

	protected void setCmnColumnMode() {
		if (!isAllComCom()) {
			return;
		}
		if ((isUpdSts() || getStatus().equals(getMODStatus()))
				&& Cnd_reg_COM.isSelected()) {
			columnDtl_bp_cd.setMode(MCMode.READ_ONLY);
			columnDtl_bp_nm.setMode(MCMode.READ_ONLY);
			columnDtl_del_flg.setMode(MCMode.READ_ONLY);
			columnDtl_memo1.setMode(MCMode.READ_ONLY);
			columnDtl_memo2.setMode(MCMode.READ_ONLY);
			columnDtl_memo3.setMode(MCMode.READ_ONLY);
			columnDtl_memo4.setMode(MCMode.READ_ONLY);
			columnDtl_memo5.setMode(MCMode.READ_ONLY);
			columnDtl_memo6.setMode(MCMode.READ_ONLY);
			columnDtl_memo7.setMode(MCMode.READ_ONLY);
			columnDtl_memo8.setMode(MCMode.READ_ONLY);
			columnDtl_memo9.setMode(MCMode.READ_ONLY);
			columnDtl_memo10.setMode(MCMode.READ_ONLY);
			columnDtl_memo11.setMode(MCMode.READ_ONLY);
			columnDtl_memo12.setMode(MCMode.READ_ONLY);
			columnDtl_memo13.setMode(MCMode.READ_ONLY);
			columnDtl_memo14.setMode(MCMode.READ_ONLY);
			columnDtl_memo15.setMode(MCMode.READ_ONLY);
			columnDtl_memo16.setMode(MCMode.READ_ONLY);
			columnDtl_memo17.setMode(MCMode.READ_ONLY);
			columnDtl_memo18.setMode(MCMode.READ_ONLY);
			columnDtl_memo19.setMode(MCMode.READ_ONLY);
			columnDtl_memo20.setMode(MCMode.READ_ONLY);

			if (getShowR().cmn_flg()) {
				for (MCColumnConfig cmn : getCmnColumns()) {
					cmn.setMode(MCMode.READ_ONLY);
				}

				// システムパラメータ中に共通項目の非表示を制御
				MCBeans[] invisibleColumn = MAUCP_BeansUtil.getInvisibleBySysParam(this);
				for (MCBeans invisible : invisibleColumn) {
					for (MCColumnConfig cmn : getCmnColumns()) {
						if (invisible == cmn) {
							cmn.setMode(MCMode.INVISIBLE);
						}
					}
				}
			}
		}
	}

	protected MCColumnConfig[] getCmnColumns() {
		return new MCColumnConfig[] {
				columnDtl_bp_alt_nm1, columnDtl_bp_alt_nm2, columnDtl_bp_alt_nm3,
				columnDtl_bp_alt_nm4, columnDtl_zip_cd, columnDtl_addr1, columnDtl_addr2,
				columnDtl_addr3, columnDtl_addr4, columnDtl_tel, columnDtl_fax,
				columnDtl_biz_co_no, columnDtl_ein, columnDtl_std_co_cd,
				columnDtl_cntry_cd, columnDtl_cntry_nm, columnDtl_area_cd,
				columnDtl_area_nm, columnDtl_cur_cd, columnDtl_cur_nm,
				columnDtl_prnt_lcl_cd, columnDtl_prnt_lcl_nm, columnDtl_bp_grp_cd1,
				columnDtl_bp_grp_nm1, columnDtl_bp_grp_cd2, columnDtl_bp_grp_nm2,
				columnDtl_bp_grp_cd3, columnDtl_bp_grp_nm3, columnDtl_bp_grp_cd4,
				columnDtl_bp_grp_nm4, columnDtl_bp_grp_cd5, columnDtl_bp_grp_nm5,
				columnDtl_bp_grp_cd6, columnDtl_bp_grp_nm6, columnDtl_bp_grp_cd7,
				columnDtl_bp_grp_nm7, columnDtl_bp_grp_cd8, columnDtl_bp_grp_nm8,
				columnDtl_bp_grp_cd9, columnDtl_bp_grp_nm9, columnDtl_bp_grp_cd10,
				columnDtl_bp_grp_nm10, columnDtl_bp_alc_grp
		};
	}


	/**
	 * 登録対象項目のモード制御
	 */
	protected void setRegTargetMode() {
		if (_MST_SET_TYP == null) {
			return ;
		}
		if(!isAllComCom()) {
			setValueEx(Cnd_reg_Group, Cnd_reg_COM.getActionCommand());
			Cnd_reg_Group.setMode(MCMode.READ_ONLY);
			return;
		}
		setDefaultMode(DtlPanel);
		displayColumn();
		setCmnColumnMode();
		setComFlgMode();
	}

	protected void displayColumn() {
		changeColumnMode(DtlTable, getShowR(), DtlR.$$SHOW);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Show_cmn_flg || nc == Show_cst_flg || nc == Show_acst_flg || nc == Show_bcst_flg
				|| nc == Show_rcst_flg || nc == Show_dlv_flg || nc == Show_sppl_flg || nc == Show_asppl_flg
				|| nc == Show_bsppl_flg || nc == Show_psppl_flg) {
			displayColumn();
			setCmnColumnMode();
		}
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}

	protected class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR row = (DtlR)table.getBaseTable().getRow(index);

			if (getStatus() == UPD) {
				if (!isNull(row.upd_cntr())) {
					if (isFlgReadOnlyColumn(column, row)) {
						return MCMode.READ_ONLY;
					}
					// 得意先インボイス取引ＦＬＧ
					else if (column == columnDtl_cst_iv_flg
							&& (!row.cst_flg() || row.org_cst_flg())) {
						return MCMode.READ_ONLY;
					}
					// 発注先インボイス取引ＦＬＧ、支給積送管理区分
					else if ((column == columnDtl_sppl_iv_flg || column == columnDtl_prov_rcv_typ)
							&& (!row.sppl_flg() || row.org_sppl_flg())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isUpdSts()) {
				if (isAllCom()) {
					if (column == columnDtl_com_use_flg && row.all_com_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_com_ex_flg && !row.all_com_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (!row.cst_flg() && isCstFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.acst_flg() && isAcstFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.bcst_flg() && isBcstFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.rcst_flg() && isRcstFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.dlv_flg() && isDlvFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.sppl_flg() && isSpplFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.asppl_flg() && isAspplFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.bsppl_flg() && isBspplFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.psppl_flg() && isPspplFlgColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (MAC_BILL_PRNT_TYP.isNOT_PRNT(row.bill_prnt_typ()) && isBillPrntColumn(column)) {
					return MCMode.READ_ONLY;
				}
				else if (!row.pay_ntc_prnt_flg() && isPayNtcPrntColumn(column)) {
					return MCMode.READ_ONLY;
				}

				// 物流グループＣＤ
				else if (column == columnDtl_lg_grp_cd) {
					if (row.dlv_flg()) {
						return MCMode.REQUIRED;
					}
				}
				// 債権部門ＣＤ
				else if (column == columnDtl_ar_dpt_cd) {
					if (!MAC_AR_DPT_TYP.isAR(row.ar_dpt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求起算区分
				else if (column == columnDtl_bill_basis_typ) {
					if (!MAC_SLS_BASIS_TYP.isSHIP_BASIS(row.sls_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 現品票ＣＤ
				else if (column == columnDtl_stk_lst_form_cd) {
					if (!row.stk_lst_issue_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求先担当部門ＣＤ
				else if (column == columnDtl_bcst_dpt_cd) {
					if (!MAC_BILL_DPT_TYP.isBILL(row.bill_dpt_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求締日１
				else if (column == columnDtl_bill_cl_day1) {
					if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
							&& !MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}// 請求締日２～５
				else if (column == columnDtl_bill_cl_day2
						|| column == columnDtl_bill_cl_day3
						|| column == columnDtl_bill_cl_day4
						|| column == columnDtl_bill_cl_day5) {
					if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
							&& !MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (!checkBillClDay(column, row)) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払締日１
				else if (column == columnDtl_psppl_cl_day1) {
					if (row.pay_spot_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				// 支払締日２～５
				else if (column == columnDtl_psppl_cl_day2
						|| column == columnDtl_psppl_cl_day3
						|| column == columnDtl_psppl_cl_day4
						|| column == columnDtl_psppl_cl_day5) {
					if (!checkBillClDay(column, row)) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求書前月残高表示ＦＬＧ
				else if (column == columnDtl_bfw_bal_disp_flg
						|| column == columnDtl_bill_dtl_adv_flg) {
					if (MAC_BILL_CL_TYP.isEACH_SLS(row.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求税額端数処理区分
				else if (column == columnDtl_bill_tax_rnd_typ) {
					if (!row.tax_on_bill_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 請求締遅延日数
				else if (column == columnDtl_bill_cl_delay_days) {
					if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求締前後区分
				else if (column == columnDtl_bill_cl_ba_typ) {
					if (!MCNumber.ZERO.eq(row.bill_cl_delay_days())) {
						return MCMode.READ_ONLY;
					}
				}
				// 入金予定前後区分
				else if (column == columnDtl_rcv_ba_typ) {
					if (isNull(row.bill_cal_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 売上明細書出力区分
				else if (column == columnDtl_sls_dtl_outp_typ) {
					if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
							&& !MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())
							&& !MAC_BILL_CL_TYP.isSEL(row.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 手数料計算ＦＬＧ
				else if (column == columnDtl_calc_com_paid_flg) {
					if (!row.rcv_amt_match_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 案件別債務管理ＦＬＧ
				else if (column == columnDtl_wrk_ap_flg) {
					if (!row.wrk_po_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 外注単価区分、支給計上区分、支給単価変更許可ＦＬＧ、支給金額端数処理区分、支給税額端数処理区分、支給税計算区分、支給税ＣＤ、支給税優先ＦＬＧ、買戻義務
				else if (column == columnDtl_outsrc_upri_typ
						|| column == columnDtl_prov_basis_typ
						|| column == columnDtl_prov_upri_cng_flg
						|| column == columnDtl_prov_amt_rnd_typ
						|| column == columnDtl_prov_tax_rnd_typ
						|| column == columnDtl_prov_tax_calc_typ
						|| column == columnDtl_prov_tax_cd
						|| column == columnDtl_prov_tax_cd_prio_flg
						|| column == columnDtl_repurc_obli_flg ) {
					
					if (!row.onr_prsppl_flg()) {
						return MCMode.READ_ONLY;
					} else {
						if (column == columnDtl_outsrc_upri_typ) {
							if (getStatus() == UPD && (row.org_onr_prsppl_flg())) {
								return MCMode.READ_ONLY;
							}
						}
						if (column == columnDtl_prov_basis_typ) {
							if (row.subcon_flg() && MAC_PROV_RCV_TYP.isNOT_ARR(row.prov_rcv_typ()) && MAC_PROV_BASIS_TYP.isINPT(row.prov_basis_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						if (column == columnDtl_prov_tax_cd) {
							if (row.repurc_obli_flg()) {
								return MCMode.REQUIRED;
							}
						}
						if (column == columnDtl_prov_tax_cd_prio_flg) {
							if (row.repurc_obli_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						if(column == columnDtl_repurc_obli_flg) {
							if(getStatus() == UPD && !isSame(row.getStatus(), Status.CREATE)) {
								return MCMode.READ_ONLY;
							}
						}
					}
				}
				// 発注先ＦＬＧ
				else if (column == columnDtl_sppl_flg) {
					if (row.tdlv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 配送先ＦＬＧ
				else if (column == columnDtl_tdlv_flg) {
					if (row.sppl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 配送先経由区分
				else if (column == columnDtl_via_dlv_typ) {
					if (!row.tdlv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 配送先必須ＦＬＧ
				else if (column == columnDtl_tdlv_req_flg) {
					if (row.tdlv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 請求先ＣＤ
				else if (column == columnDtl_bcst_cd) {
					if (getCo().ar_no_use_flg()) {
						return MCMode.ENABLE;
					}
				}
				
				// 下請対象ＦＬＧ
				else if (column == columnDtl_subcon_flg) {
					if (!isSame(row.cntry_cd(),getCo().cntry_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 発注時納品書、納入指示時納品書、納期回答受領時納品書
				else if (column == columnDtl_po_dlv_slip_flg
						|| column == columnDtl_dlv_inst_dlv_slip_flg
						|| column == columnDtl_prms_rcpt_dlv_slip_flg) {
					if (isNull(row.sppl_ship_form_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcpt_iv_dup_flg) {
					if (!row.sppl_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 仕入計上区分
				else if(column == columnDtl_purc_basis_typ) {
					if(row.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払予定管理先ＣＤ
				else if (column == columnDtl_bsppl_cd) {
					if (getCo().ap_no_use_flg()) {
						return MCMode.ENABLE;
					}
				}
				// 売掛先ＣＤ、債権部門区分、販売単価端数処理区分、売上税計算区分、ロット逆転禁止区分、請求繰越回数、ロット明細分割区分
				else if (column == columnDtl_acst_cd
						|| column == columnDtl_ar_dpt_typ
						|| column == columnDtl_sls_upri_rnd_typ
						|| column == columnDtl_sls_tax_calc_typ
						|| column == columnDtl_lot_back_stop_typ
						|| column == columnDtl_bill_crryovr_times
						|| column == columnDtl_slip_each_lot_typ) {
					
					if (row.cst_sundry_flg()) {
						return MCMode.ENABLE;
					}
				}
				// バッチ支払予定締ＦＬＧ、支払通知書前月残高表示ＦＬＧ
				else if (column == columnDtl_batch_pay_schd_cl_flg
						|| column == columnDtl_pay_ntc_bfw_bal_disp_flg
						|| column == columnDtl_pay_ntc_adv_pay_flg) {
					if (row.pay_spot_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払税額端数処理区分
				else if (column == columnDtl_pay_tax_rnd_typ) {
					if (!row.tax_on_pay_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払予定締遅延日数
				else if (column == columnDtl_pay_schd_cl_delay_days) {
					if (!row.batch_pay_schd_cl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払予定締前後区分
				else if (column == columnDtl_pay_schd_cl_ba_typ) {
					if (!MCNumber.ZERO.eq(row.pay_schd_cl_delay_days())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (!row.isStatusCreate()) {
				if(isAllComCom()) {
					// 取引先ＣＤ
					if (column == columnDtl_bp_cd && !isNull(row.upd_cntr_c())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 検索後の売上、仕入、支給フラグ項目が入力可能かどうかを返す。
	 * 
	 * @param column 判定するカラム
	 * @param dtl Rowクラス
	 * @return フラグはチェックオンの場合に入力不可ならtrue
	 */
	protected boolean isFlgReadOnlyColumn(MCColumnConfig column, DtlR dtl) {
		if ((column == columnDtl_cst_flg && dtl.org_cst_flg())
				|| (column == columnDtl_acst_flg && dtl.org_acst_flg())
				|| (column == columnDtl_bcst_flg && dtl.org_bcst_flg())
				|| (column == columnDtl_rcst_flg && dtl.org_rcst_flg())
				|| (column == columnDtl_sppl_flg && dtl.org_sppl_flg())
				|| (column == columnDtl_asppl_flg && dtl.org_asppl_flg())
				|| (column == columnDtl_bsppl_flg && dtl.org_bsppl_flg())
				|| (column == columnDtl_psppl_flg && dtl.org_psppl_flg())
				|| (column == columnDtl_cred_flg && dtl.org_cred_flg())
				|| (column == columnDtl_dlv_flg && dtl.org_dlv_flg())
				|| (column == columnDtl_maker_flg && dtl.org_maker_flg())
				|| (column == columnDtl_dest_flg && dtl.org_dest_flg())
				|| (column == columnDtl_onr_prsppl_flg && dtl.org_onr_prsppl_flg())
				|| (column == columnDtl_tdlv_flg && dtl.org_tdlv_flg())
				|| (column == columnDtl_all_com_flg && dtl.org_all_com_flg())) {
			return true;
		}
		return false;
	}
	
	protected boolean checkBillClDay(MCColumnConfig column, DtlR r) {
		
		if (column == columnDtl_bill_cl_day2 || column == columnDtl_psppl_cl_day2) {
			if (column == columnDtl_bill_cl_day2 && !isNull(r.bill_cl_day1())) {
				return true;
			}
			else if (column == columnDtl_psppl_cl_day2 && !isNull(r.psppl_cl_day1())) {
				return true;
			}
		}
		if (column == columnDtl_bill_cl_day3 || column == columnDtl_psppl_cl_day3) {
			if (column == columnDtl_bill_cl_day3 && !isNull(r.bill_cl_day2())) {
				return true;
			}
			else if (column == columnDtl_psppl_cl_day3 && !isNull(r.psppl_cl_day2())) {
				return true;
			}
		}
		if (column == columnDtl_bill_cl_day4 || column == columnDtl_psppl_cl_day4) {
			if (column == columnDtl_bill_cl_day4 && !isNull(r.bill_cl_day3())) {
				return true;
			}
			else if (column == columnDtl_psppl_cl_day4 && !isNull(r.psppl_cl_day3())) {
				return true;
			}
		}
		if (column == columnDtl_bill_cl_day5 || column == columnDtl_psppl_cl_day5) {
			if (column == columnDtl_bill_cl_day5 && !isNull(r.bill_cl_day4())) {
				return true;
			}
			else if (column == columnDtl_psppl_cl_day5 && !isNull(r.psppl_cl_day4())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 得意先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 得意先関連項目カラムの場合true
	 */
	protected boolean isCstFlgColumn(MCColumnConfig column) {

		MCColumnConfig[] cstConfs = getCstColumns();
		boolean isCst = false;
		for (MCColumnConfig conf :cstConfs) {
			if (conf == column) {
				isCst = true;
			}
		}
		return isCst;
	}

	/**
	 * 売掛先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 売掛先関連項目カラムの場合true
	 */
	protected boolean isAcstFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] acstConfs = getAcstColumns();
		boolean isAcst = false;
		for (MCColumnConfig conf :acstConfs) {
			if (conf == column) {
				isAcst = true;
			}
		}
		return isAcst;
	}

	/**
	 * 請求先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 請求先関連項目カラムの場合true
	 */
	protected boolean isBcstFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] bcstConfs = getBcstColumns();
		boolean isBcst = false;
		for (MCColumnConfig conf :bcstConfs) {
			if (conf == column) {
				isBcst = true;
			}
		}
		return isBcst;
	}

	/**
	 * 入金先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 入金先関連項目カラムの場合true
	 */
	protected boolean isRcstFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] rcstConfs = getRcstColumns();
		boolean isRcst = false;
		for (MCColumnConfig conf :rcstConfs) {
			if (conf == column) {
				isRcst = true;
			}
		}
		return isRcst;
	}

	/**
	 * 納品先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 納品先関連項目カラムの場合true
	 */
	protected boolean isDlvFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] dlvConfs = getDlvColumns();
		boolean isDlv = false;
		for (MCColumnConfig conf :dlvConfs) {
			if (conf == column) {
				isDlv = true;
			}
		}
		return isDlv;
	}

	/**
	 * 発注先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 発注先関連項目カラムの場合true
	 */
	protected boolean isSpplFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] spplConfs = getSpplColumns();
		boolean isSppl = false;
		for (MCColumnConfig conf :spplConfs) {
			if (conf == column) {
				isSppl = true;
			}
		}
		return isSppl;
	}

	/**
	 * 買掛先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 買掛先関連項目カラムの場合true
	 */
	protected boolean isAspplFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] aspplConfs = getAspplColumns();
		boolean isAsppl = false;
		for (MCColumnConfig conf :aspplConfs) {
			if (conf == column) {
				isAsppl = true;
			}
		}
		return isAsppl;
	}

	/**
	 * 支払予定管理先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 支払予定管理先関連項目カラムの場合true
	 */
	protected boolean isBspplFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] bspplConfs = getBspplColumns();
		boolean isBsppl = false;
		for (MCColumnConfig conf :bspplConfs) {
			if (conf == column) {
				isBsppl = true;
			}
		}
		return isBsppl;
	}

	/**
	 * 支払先関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 支払先関連項目カラムの場合true
	 */
	protected boolean isPspplFlgColumn(MCColumnConfig column) {
		
		MCColumnConfig[] pspplConfs = getPspplColumns();
		boolean isPsppl = false;
		for (MCColumnConfig conf :pspplConfs) {
			if (conf == column) {
				isPsppl = true;
			}
		}
		return isPsppl;
	}

	/**
	 * 請求先発行関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 請求先発行関連項目カラムの場合true
	 */
	protected boolean isBillPrntColumn(MCColumnConfig column) {
		
		MCColumnConfig[] BillPrntConfs = getBillPrntColumns();
		boolean isBcst = false;
		for (MCColumnConfig conf :BillPrntConfs) {
			if (conf == column) {
				isBcst = true;
			}
		}
		return isBcst;
	}

	/**
	 * 支払通知書発行関連項目かを判定する
	 * 
	 * @param column 判定するカラム
	 * @return 支払通知書発行関連項目カラムの場合true
	 */
	protected boolean isPayNtcPrntColumn(MCColumnConfig column) {
		
		MCColumnConfig[] PayNtcPrntConfs = getPayNtcPrntColumns();
		boolean isBsppl = false;
		for (MCColumnConfig conf :PayNtcPrntConfs) {
			if (conf == column) {
				isBsppl = true;
			}
		}
		return isBsppl;
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック：取引先マスタ登録へ画面遷移
	 */
	public void doDtl_DC(MCEventInfo info) {
		doDtlBtn_open_MABCP0510(info);
	}

	@Override
	public void doDtl_all_com_flg_NC(MCEventInfo info) {
		super.doDtl_all_com_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.all_com_flg()) {
			setValueEx(columnDtl_com_use_flg, idx, false);
		}
		else {
			setValueEx(columnDtl_com_ex_flg, idx, false);
		}
	}

	@Override
	public void doDtl_cst_flg_NC(MCEventInfo info) {
		super.doDtl_cst_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.cst_flg()) {
			if (confirm(MABCP0006) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] cstConfs = getCstColumns();
				for (MCColumnConfig conf :cstConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.cst_flg(true);
			}
		}
		else {
			if (r.acst_flg() && isNull(r.acst_cd())){
				r.acst_cd(r.bp_cd()) ;
				r.acst_nm(r.bp_nm()) ;
			}
		}
		setBtnMode(info.getEventIndex());
	}

	@Override
	public void doDtl_acst_flg_NC(MCEventInfo info) {
		super.doDtl_acst_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.acst_flg()) {
			if (confirm(MABCP0007) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] acstConfs = getAcstColumns();
				for (MCColumnConfig conf :acstConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.acst_flg(true);
			}
		}
		else {
			if (r.cst_flg() && isNull(r.acst_cd())){
				r.acst_cd(r.bp_cd());
				r.acst_nm(r.bp_nm());
			}
			if (!getCo().ar_no_use_flg()) {
				if (r.bcst_flg() && isNull(r.bcst_cd())){
					r.bcst_cd(r.bp_cd());
					r.bcst_nm(r.bp_nm());
				}
			}
		}
	}
	
	@Override
	public void doDtl_bcst_flg_NC(MCEventInfo info) {
		super.doDtl_bcst_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.bcst_flg()) {
			if (confirm(MABCP0008) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] bcstConfs = getBcstColumns();
				for (MCColumnConfig conf :bcstConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.bcst_flg(true);
			}
		}
		else {
			if (!getCo().ar_no_use_flg()) {
				if (r.acst_flg() && isNull(r.bcst_cd())){
					setValueEx(columnDtl_bcst_cd, idx, r.bp_cd());
					setValueEx(columnDtl_bcst_nm, idx, r.bp_nm());
				}
			}
			if (r.rcst_flg() && isNull(r.rcst_cd())){
				r.rcst_cd(r.bp_cd());
				r.rcst_nm(r.bp_nm());
			}
			if (r.cred_flg() && isNull(r.ar_cred_cd())){
				r.ar_cred_cd(r.bp_cd());
				r.ar_cred_nm(r.bp_nm());
			}
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_bill_prnt_typ_NC(MCEventInfo info) {
		super.doDtl_bill_prnt_typ_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_BILL_PRNT_TYP.isNOT_PRNT(r.bill_prnt_typ())) {
			MCColumnConfig[] bill_prntConfs = getBillPrntColumns();
			for (MCColumnConfig conf :bill_prntConfs) {
				setValueEx(conf, idx, null);
			}
		}
		else if (!MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
			setValueEx(columnDtl_bill_dtl_adv_flg, idx, true);
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_rcst_flg_NC(MCEventInfo info) {
		super.doDtl_rcst_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.rcst_flg()) {
			if (confirm(MABCP0009) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] rcstConfs = getRcstColumns();
				for (MCColumnConfig conf :rcstConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.rcst_flg(true);
			}
		}
		else {
			if (r.bcst_flg() && isNull(r.rcst_cd())){
				r.rcst_cd(r.bp_cd());
				r.rcst_nm(r.bp_nm());
			}
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_cred_flg_NC(MCEventInfo info) {
		super.doDtl_cred_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.cred_flg()) {
			if (r.bcst_flg() && isNull(r.ar_cred_cd())){
				r.ar_cred_cd(r.bp_cd());
				r.ar_cred_nm(r.bp_nm());
			}
			if (r.bsppl_flg() && isNull(r.ap_cred_cd())){
				r.ap_cred_cd(r.bp_cd());
				r.ap_cred_nm(r.bp_nm());
			}
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_dlv_flg_NC(MCEventInfo info) {
		super.doDtl_dlv_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.dlv_flg()) {
			if (confirm(MABCP0010) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] dlvConfs = getDlvColumns();
				for (MCColumnConfig conf :dlvConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.dlv_flg(true);
			}
		}
	}
	
	@Override
	public void doDtl_sppl_flg_NC(MCEventInfo info) {
		super.doDtl_sppl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.sppl_flg()) {
			if (confirm(MABCP0011) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] spplConfs = getSpplColumns();
				for (MCColumnConfig conf :spplConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.sppl_flg(true);
			}
		}
		else {
			setValueEx(columnDtl_tdlv_flg, idx, false);

			if (r.asppl_flg() && isNull(r.asppl_cd())){
				r.asppl_cd(r.bp_cd());
				r.asppl_nm(r.bp_nm());
			}
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_asppl_flg_NC(MCEventInfo info) {
		super.doDtl_asppl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.asppl_flg()) {
			if (confirm(MABCP0012) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] aspplConfs = getAspplColumns();
				for (MCColumnConfig conf :aspplConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.asppl_flg(true);
			}
		}
		else {
			if (r.sppl_flg() && isNull(r.asppl_cd())){
				r.asppl_cd(r.bp_cd());
				r.asppl_nm(r.bp_nm());
			}
			if (!getCo().ap_no_use_flg()) {
				if (r.bsppl_flg() && isNull(r.bsppl_cd())){
					r.bsppl_cd(r.bp_cd());
					r.bsppl_nm(r.bp_nm());
				}
			}
		}
	}
	
	@Override
	public void doDtl_bsppl_flg_NC(MCEventInfo info) {
		super.doDtl_bsppl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.bsppl_flg()) {
			if (confirm(MABCP0013) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] bspplConfs = getBspplColumns();
				for (MCColumnConfig conf :bspplConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.bsppl_flg(true);
			}
		}
		else {
			if (!getCo().ap_no_use_flg()) {
				if (r.asppl_flg() && isNull(r.bsppl_cd())){
					r.bsppl_cd(r.bp_cd());
					r.bsppl_nm(r.bp_nm());
				}
			}
			if (r.psppl_flg() && isNull(r.psppl_cd())){
				r.psppl_cd(r.bp_cd());
				r.psppl_nm(r.bp_nm());
			}
			if (r.cred_flg() && isNull(r.ap_cred_cd())){
				r.ap_cred_cd(r.bp_cd());
				r.ap_cred_nm(r.bp_nm());
			}
		}
	}
	
	@Override
	public void doDtl_psppl_flg_NC(MCEventInfo info) {
		super.doDtl_psppl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.psppl_flg()) {
			if (confirm(MABCP0014) == MCMessageBox.YES_OPTION) {
				MCColumnConfig[] pspplConfs = getPspplColumns();
				for (MCColumnConfig conf :pspplConfs) {
					setValueEx(conf, idx, null);
				}
			}
			else {
				r.psppl_flg(true);
			}
		}
		else {
			if (r.bsppl_flg() && isNull(r.psppl_cd())){
				r.psppl_cd(r.bp_cd());
				r.psppl_nm(r.bp_nm());
			}
		}
	}
	
	@Override
	public void doDtl_prov_rcv_typ_LC(MCEventInfo info) {
		super.doDtl_prov_rcv_typ_LC(info);

		int idx = info.getEventIndex();
		setProvBasisTyp(idx);
	}
	
	@Override
	public void doDtl_ar_dpt_typ_LC(MCEventInfo info) {
		super.doDtl_ar_dpt_typ_LC(info);

		int idx = info.getEventIndex();
		setValueEx(columnDtl_ar_dpt_cd, idx, null);
	}
	
	@Override
	public void doDtl_sls_basis_typ_LC(MCEventInfo info) {
		super.doDtl_sls_basis_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_SLS_BASIS_TYP.isIN_BASIS(r.sls_basis_typ())){
			setValueEx(columnDtl_bill_basis_typ, idx, MAC_BILL_BASIS_TYP.SLS_AC.value());
		}
		else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(r.sls_basis_typ())){
			setValueEx(columnDtl_bill_basis_typ, idx, MAC_BILL_BASIS_TYP.ARRV.value());
		}
		else if (isNull(r.sls_basis_typ())) {
			setValueEx(columnDtl_bill_basis_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_bill_dpt_typ_LC(MCEventInfo info) {
		super.doDtl_bill_dpt_typ_LC(info);

		int idx = info.getEventIndex();
		setValueEx(columnDtl_bcst_dpt_cd, idx, null);
	}
	
	@Override
	public void doDtl_onr_prsppl_flg_NC(MCEventInfo info) {
		super.doDtl_onr_prsppl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.onr_prsppl_flg()) {
			setValueEx(columnDtl_repurc_obli_flg, idx, false);
			setValueEx(columnDtl_outsrc_upri_typ, idx, null);
			setValueEx(columnDtl_prov_upri_cng_flg, idx, false);
			setValueEx(columnDtl_prov_amt_rnd_typ, idx, null);
			setValueEx(columnDtl_prov_tax_rnd_typ, idx, null);
			setValueEx(columnDtl_prov_tax_calc_typ, idx, null);
			setValueEx(columnDtl_prov_tax_cd, idx, null);
			setValueEx(columnDtl_prov_tax_cd_prio_flg, idx, false);
		}
		setProvBasisTyp(idx);
	}

	@Override
	public void doDtl_repurc_obli_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_repurc_obli_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if(r.repurc_obli_flg()) {
			setValueEx(columnDtl_prov_tax_cd_prio_flg, idx, true);
		}
		else {
			setValueEx(columnDtl_prov_tax_cd, idx, null);
			setValueEx(columnDtl_prov_tax_cd_prio_flg, idx, false);
		}
	}

	@Override
	public void doDtl_sppl_iv_flg_NC(MCEventInfo info) {
		super.doDtl_sppl_iv_flg_NC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!r.sppl_iv_flg()) {
			setValueEx(columnDtl_rcpt_iv_dup_flg, idx, false);
		}
	}

	@Override
	public void doDtl_stk_lst_issue_flg_NC(MCEventInfo info) {
		super.doDtl_stk_lst_issue_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.stk_lst_issue_flg()) {
			setValueEx(columnDtl_stk_lst_form_cd, idx, null);
		}
	}

	@Override
	public void doDtl_bill_cl_typ_LC(MCEventInfo info) {
		super.doDtl_bill_cl_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ())) {
			setValueEx(columnDtl_bill_cl_delay_days, idx, null);

			if (!MAC_BILL_CL_TYP.isMANUAL(r.bill_cl_typ())) {
				setValueEx(columnDtl_bill_cl_day1, idx, null);

				if (!MAC_BILL_CL_TYP.isSEL(r.bill_cl_typ())) {
					setValueEx(columnDtl_sls_dtl_outp_typ, idx, null);
				}
			}
		}
		if (MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
			setValueEx(columnDtl_bfw_bal_disp_flg, idx, false);
			setValueEx(columnDtl_bill_dtl_adv_flg, idx, false);
		}
		else if (!MAC_BILL_PRNT_TYP.isNOT_PRNT(r.bill_prnt_typ())) {
			setValueEx(columnDtl_bill_dtl_adv_flg, idx, true);
		}
	}
	@Override
	public void doDtl_rcv_amt_match_flg_NC(MCEventInfo info) {
		super.doDtl_rcv_amt_match_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.rcv_amt_match_flg()) {
			setValueEx(columnDtl_calc_com_paid_flg, idx, false);
		}
	}
	@Override
	public void doDtl_wrk_po_flg_NC(MCEventInfo info) {
		super.doDtl_wrk_po_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.wrk_po_flg()) {
			setValueEx(columnDtl_wrk_ap_flg, idx, false);
		}
	}
	@Override
	public void doDtl_subcon_flg_NC(MCEventInfo info) {
		super.doDtl_subcon_flg_NC(info);

		int idx = info.getEventIndex();

		setProvBasisTyp(idx);
	}
	@Override
	public void doDtl_sppl_ship_form_cd_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_sppl_ship_form_cd_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sppl_ship_form_cd())) {
			setValueEx(columnDtl_po_dlv_slip_flg,  idx, false);
			setValueEx(columnDtl_dlv_inst_dlv_slip_flg,  idx, false);
			setValueEx(columnDtl_prms_rcpt_dlv_slip_flg,  idx, false);
		}
	}
	@Override
	public void doDtl_tdlv_flg_NC(MCEventInfo info) {
		super.doDtl_tdlv_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.tdlv_flg()) {
			setValueEx(columnDtl_via_dlv_typ, idx, null);
		}
		else {
			setValueEx(columnDtl_tdlv_req_flg, idx, false);
		}
	}
	@Override
	public void doDtl_cntry_cd_LC(MCEventInfo info) {
		super.doDtl_cntry_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isSame(r.cntry_cd(),getCo().cntry_cd())) {
			setValueEx(columnDtl_subcon_flg, idx, false);
		}
	}
	
	@Override
	public void doDtl_bill_cl_day1_LC(MCEventInfo info) {
		super.doDtl_bill_cl_day1_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cl_day1())) {
			setValueEx(columnDtl_bill_cl_day2, idx, null);
		}
	}
	
	@Override
	public void doDtl_bill_cl_day2_LC(MCEventInfo info) {
		super.doDtl_bill_cl_day2_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cl_day2())) {
			setValueEx(columnDtl_bill_cl_day3, idx, null);
		}
	}
	
	@Override
	public void doDtl_bill_cl_day3_LC(MCEventInfo info) {
		super.doDtl_bill_cl_day3_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cl_day3())) {
			setValueEx(columnDtl_bill_cl_day4, idx, null);
		}
	}
	
	@Override
	public void doDtl_bill_cl_day4_LC(MCEventInfo info) {
		super.doDtl_bill_cl_day4_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cl_day4())) {
			setValueEx(columnDtl_bill_cl_day5, idx, null);
		}
	}

	@Override
	public void doDtl_bill_cl_delay_days_LC(MCEventInfo info) {
		super.doDtl_bill_cl_delay_days_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cl_delay_days()) || !MCNumber.ZERO.eq(r.bill_cl_delay_days())) {
			setValueEx(columnDtl_bill_cl_ba_typ, idx, null);
		}
	}

	@Override
	public void doDtl_bill_cal_cd_LC(MCEventInfo info) {
		super.doDtl_bill_cal_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.bill_cal_cd())) {
			setValueEx(columnDtl_rcv_ba_typ, idx, null);
		}
	}

	@Override
	public void doDtl_pay_spot_flg_NC(MCEventInfo info) {
		super.doDtl_pay_spot_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.pay_spot_flg()) {
			setValueEx(columnDtl_psppl_cl_day1, idx, null);
			setValueEx(columnDtl_batch_pay_schd_cl_flg, idx, false);
			setValueEx(columnDtl_pay_ntc_bfw_bal_disp_flg, idx, false);
			setValueEx(columnDtl_pay_ntc_adv_pay_flg, idx, false);
		}
		else if (r.pay_ntc_prnt_flg()) {
			setValueEx(columnDtl_pay_ntc_adv_pay_flg, idx, true);
		}
	}
	
	@Override
	public void doDtl_psppl_cl_day1_LC(MCEventInfo info) {
		super.doDtl_psppl_cl_day1_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.psppl_cl_day1())) {
			setValueEx(columnDtl_psppl_cl_day2, idx, null);
		}
	}

	@Override
	public void doDtl_psppl_cl_day2_LC(MCEventInfo info) {
		super.doDtl_psppl_cl_day2_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.psppl_cl_day2())) {
			setValueEx(columnDtl_psppl_cl_day3, idx, null);
		}
	}
	
	@Override
	public void doDtl_psppl_cl_day3_LC(MCEventInfo info) {
		super.doDtl_psppl_cl_day3_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.psppl_cl_day3())) {
			setValueEx(columnDtl_psppl_cl_day4, idx, null);
		}
	}
	
	@Override
	public void doDtl_psppl_cl_day4_LC(MCEventInfo info) {
		super.doDtl_psppl_cl_day4_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.psppl_cl_day4())) {
			setValueEx(columnDtl_psppl_cl_day5, idx, null);
		}
	}
	
	@Override
	public void doDtl_tax_on_bill_flg_NC(MCEventInfo info) {
		super.doDtl_tax_on_bill_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.tax_on_bill_flg()) {
			setValueEx(columnDtl_bill_tax_rnd_typ, idx, null);
		}
	}
	@Override
	public void doDtl_tax_on_pay_flg_NC(MCEventInfo info) {
		super.doDtl_tax_on_pay_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.tax_on_pay_flg()) {
			setValueEx(columnDtl_pay_tax_rnd_typ, idx, null);
		}
	}

	@Override
	public void doDtl_batch_pay_schd_cl_flg_NC(MCEventInfo info) {
		super.doDtl_batch_pay_schd_cl_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.batch_pay_schd_cl_flg()) {
			setValueEx(columnDtl_pay_schd_cl_delay_days, idx, null);
		}
	}
	
	@Override
	public void doDtl_pay_schd_cl_delay_days_LC(MCEventInfo info) {
		super.doDtl_pay_schd_cl_delay_days_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.pay_schd_cl_delay_days()) || !MCNumber.ZERO.eq(r.pay_schd_cl_delay_days())) {
			setValueEx(columnDtl_pay_schd_cl_ba_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_pay_ntc_prnt_flg_NC(MCEventInfo info) {
		super.doDtl_pay_ntc_prnt_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.pay_ntc_prnt_flg()) {
			MCColumnConfig[] PayNtcPrntConfs = getPayNtcPrntColumns();
			for (MCColumnConfig conf :PayNtcPrntConfs) {
				setValueEx(conf, idx, null);
			}
		}
		else if (!r.pay_spot_flg()) {
			setValueEx(columnDtl_pay_ntc_adv_pay_flg, idx, true);
		}
		setBtnMode(info.getEventIndex());
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode(info.getEventIndex());
	}

	/**
	* ボタンの押下制御
	* @param 一覧のインデックス
	*/
	protected void setBtnMode(int index) {
		
		if (index < 0) {
			return;
		}
		DtlR row = getDtlL().get(index);
		if (row.cst_flg() && !row.del_flg() && !row.com_ex_flg()) {
			DtlBtn_open_MABCP0540.setMode(MCMode.ENABLE);
		}
		else {
			DtlBtn_open_MABCP0540.setMode(this, getStatus());
		}
		
		if ((row.bcst_flg() || row.rcst_flg()) && !row.del_flg() && !row.com_ex_flg()) {
			DtlBtn_open_MABCP0560.setMode(MCMode.ENABLE);
		}
		else {
			DtlBtn_open_MABCP0560.setMode(this, getStatus());
		}
		
		if (row.sppl_flg() && !row.del_flg() && !row.com_ex_flg()) {
			DtlBtn_open_MABCP0570.setMode(MCMode.ENABLE);
		}
		else {
			DtlBtn_open_MABCP0570.setMode(this, getStatus());
		}
		if ((row.bsppl_flg() || row.psppl_flg()) && !row.del_flg() && !row.com_ex_flg()) {
			DtlBtn_open_MABCP0580.setMode(MCMode.ENABLE);
		}
		else {
			DtlBtn_open_MABCP0580.setMode(this, getStatus());
		}
		
		if (row.cred_flg() && !row.com_ex_flg()) {
			DtlBtn_open_MABCP0590.setMode(MCMode.ENABLE);
		}
		else {
			DtlBtn_open_MABCP0590.setMode(this, getStatus());
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setComFlgMode();
		displayColumn();
		setRegTargetMode();
	}
	@Override
	public void setUPD_ADMINStatus() {
		super.setUPD_ADMINStatus();
		setComFlgMode();
		displayColumn();
		setRegTargetMode();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setComFlgMode();
		displayColumn();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setComFlgMode();
		displayColumn();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setComFlgMode();
		displayColumn();
	}
	@Override
	public void setMODStatus() {
		super.setREFStatus();
		setComFlgMode();
		displayColumn();
		setRegTargetMode();
	}
	
	protected void setProvBasisTyp(int index) {
		DtlR r = getDtlL().get(index);
		if (r.onr_prsppl_flg() && r.subcon_flg()) {
			if (MAC_PROV_RCV_TYP.isNOT_ARR(r.prov_rcv_typ())) {
				setValueEx(columnDtl_prov_basis_typ, index, MAC_PROV_BASIS_TYP.INPT.value());
			}
			else {
				setValueEx(columnDtl_prov_basis_typ, index, null);
			}
		}
		else {
			setValueEx(columnDtl_prov_basis_typ, index, null);
		}	
	}

	protected void setComFlgMode() {
		if (!isAllCom()) {
			columnDtl_all_com_flg.setMode(MCMode.INVISIBLE);
			columnDtl_com_use_flg.setMode(MCMode.INVISIBLE);
			columnDtl_com_ex_flg.setMode(MCMode.INVISIBLE);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getDtl_prov_basis_typ(MCRow row,MCEventInfo info) {
		addListLogicCnd(row, getProvBasisTyp(info));
		return super.getDtl_prov_basis_typ(row, info);
	}
	
	/**
	 * 表示する支給計上区分を取得する
	 */
	protected MAC_PROV_BASIS_TYP[] getProvBasisTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (MAC_PROV_RCV_TYP.isNOT_ARR(r.prov_rcv_typ())) {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GI, MAC_PROV_BASIS_TYP.INPT };
		} else {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GR, MAC_PROV_BASIS_TYP.INPT };
		}
	}

	//--------------------リストロジック表示制御End-----------------------

	/**
	 * 得意先関連項目
	 */
	protected MCColumnConfig[] getCstColumns() {
		return new MCColumnConfig[] {
				columnDtl_acst_cd, columnDtl_acst_nm, columnDtl_ar_dpt_typ, columnDtl_ar_dpt_typ_nm
				,columnDtl_ar_dpt_cd, columnDtl_ar_dpt_nm, columnDtl_cst_cntct_dpt, columnDtl_cst_cntct_psn
				,columnDtl_cst_cntct_psn_title, columnDtl_cst_sundry_flg, columnDtl_sls_upri_req_typ, columnDtl_sls_upri_req_typ_nm
				,columnDtl_sls_upri_cng_flg, columnDtl_sls_upri_rnd_typ, columnDtl_sls_upri_rnd_typ_nm, columnDtl_sls_amt_rnd_typ
				,columnDtl_sls_amt_rnd_typ_nm, columnDtl_sls_tax_calc_typ, columnDtl_sls_tax_calc_typ_nm, columnDtl_sls_tax_rnd_typ
				,columnDtl_sls_tax_rnd_typ_nm, columnDtl_sls_basis_typ, columnDtl_sls_basis_typ_nm, columnDtl_bill_basis_typ
				,columnDtl_bill_basis_typ_nm, columnDtl_ship_schd_split_typ, columnDtl_ship_schd_split_typ_nm, columnDtl_bill_crryovr_times
				,columnDtl_lot_back_stop_typ, columnDtl_lot_back_stop_typ_nm, columnDtl_slip_each_lot_typ, columnDtl_slip_each_lot_typ_nm
				,columnDtl_cst_ship_form_cd, columnDtl_cst_ship_form_nm, columnDtl_stk_lst_issue_flg, columnDtl_stk_lst_form_cd
				,columnDtl_stk_lst_form_nm, columnDtl_sls_tax_cd, columnDtl_sls_tax_nm, columnDtl_sls_tax_cd_prio_flg
				,columnDtl_wrk_ar_flg, columnDtl_cst_iv_flg, columnDtl_ship_lt, columnDtl_cst_tterm_cd1, columnDtl_cst_tterm_nm1
				,columnDtl_cst_tterm_cd2, columnDtl_cst_tterm_nm2, columnDtl_cst_tterm_cd3, columnDtl_cst_tterm_nm3
				,columnDtl_sls_anly_cd1, columnDtl_sls_anly_nm1, columnDtl_sls_anly_cd2, columnDtl_sls_anly_nm2
				,columnDtl_sls_anly_cd3, columnDtl_sls_anly_nm3
				,columnDtl_cst_prnt_typ, columnDtl_cst_prnt_typ_nm, columnDtl_not_lg_mix_flg, columnDtl_not_lot_mix_flg, columnDtl_not_sublot_mix_flg
		};
	}

	/**
	 * 売掛先関連項目
	 */
	protected MCColumnConfig[] getAcstColumns() {
		return new MCColumnConfig[] {
				columnDtl_bcst_cd, columnDtl_bcst_nm
				,columnDtl_acst_prnt_typ, columnDtl_acst_prnt_typ_nm
		};
	}
	
	/**
	 * 請求先関連項目
	 */
	protected MCColumnConfig[] getBcstColumns() {
		return new MCColumnConfig[] {
				columnDtl_rcst_cd, columnDtl_rcst_nm, columnDtl_ar_cred_cd, columnDtl_ar_cred_nm
				,columnDtl_bill_dpt_typ, columnDtl_bill_dpt_typ_nm, columnDtl_bcst_dpt_cd, columnDtl_bcst_dpt_nm
				,columnDtl_bill_cl_typ, columnDtl_bill_cl_typ_nm, columnDtl_bill_cl_day1, columnDtl_bill_cl_day2
				,columnDtl_bill_cl_day3, columnDtl_bill_cl_day4, columnDtl_bill_cl_day5, columnDtl_tax_on_bill_flg
				,columnDtl_bill_tax_rnd_typ, columnDtl_bill_tax_rnd_typ_nm, columnDtl_bill_cl_delay_days, columnDtl_bill_cl_ba_typ
				,columnDtl_bill_cl_ba_typ_nm, columnDtl_sls_interim_cl_flg, columnDtl_bill_cal_cd, columnDtl_bill_cal_nm
				,columnDtl_rcv_ba_typ, columnDtl_rcv_ba_typ_nm, columnDtl_bill_zip_cd, columnDtl_bill_addr1
				,columnDtl_bill_addr2, columnDtl_bill_addr3, columnDtl_bill_addr4, columnDtl_bill_tel
				,columnDtl_bill_bcst_nm, columnDtl_bill_bcst_dpt, columnDtl_bill_bcst_psn, columnDtl_bill_bcst_psn_title
				,columnDtl_bfw_bal_disp_flg, columnDtl_sls_dtl_outp_typ, columnDtl_sls_dtl_outp_typ_nm, columnDtl_bill_prnt_typ
				,columnDtl_bill_prnt_typ_nm, columnDtl_bill_dtl_outp_flg, columnDtl_bill_dtl_rcv_flg, columnDtl_bill_dtl_subttl_typ
				,columnDtl_bill_dtl_subttl_typ_nm, columnDtl_bill_dtl_brk_typ, columnDtl_bill_dtl_brk_typ_nm
				,columnDtl_bill_dtl_sort_typ, columnDtl_bill_dtl_sort_typ_nm, columnDtl_bill_can_slip_typ
				,columnDtl_bill_can_slip_typ_nm, columnDtl_auto_line_appl_flg
				,columnDtl_ar_setoff_grp_cd, columnDtl_ar_setoff_grp_nm
				,columnDtl_bcst_prnt_typ, columnDtl_bcst_prnt_typ_nm
				,columnDtl_bill_dtl_adv_flg
		};
	}
	
	/**
	 * 請求書発行関連項目
	 */
	protected MCColumnConfig[] getBillPrntColumns() {
		return new MCColumnConfig[] {
				columnDtl_bill_zip_cd, columnDtl_bill_addr1, columnDtl_bill_addr2, columnDtl_bill_addr3
				, columnDtl_bill_addr4, columnDtl_bill_tel, columnDtl_bill_bcst_nm, columnDtl_bill_bcst_dpt
				, columnDtl_bill_bcst_psn, columnDtl_bill_bcst_psn_title, columnDtl_sls_dtl_outp_typ, columnDtl_bill_dtl_outp_flg
				, columnDtl_bfw_bal_disp_flg, columnDtl_bill_dtl_rcv_flg, columnDtl_bill_dtl_subttl_typ, columnDtl_bill_dtl_brk_typ
				, columnDtl_bill_dtl_sort_typ, columnDtl_bill_can_slip_typ
				,columnDtl_bill_dtl_adv_flg
		};
	}
	
	/**
	 * 入金先関連項目
	 */
	protected MCColumnConfig[] getRcstColumns() {
		return new MCColumnConfig[] {
				columnDtl_xfr_psn, columnDtl_rcv_auto_appl_tgt_flg
				,columnDtl_rcv_amt_match_flg, columnDtl_ar_sttl_typ_match_flg
				,columnDtl_calc_com_paid_flg, columnDtl_auto_appl_delay_days
				,columnDtl_rcst_prnt_typ, columnDtl_rcst_prnt_typ_nm
		};
	}

	/**
	 * 納品先関連項目
	 */
	protected MCColumnConfig[] getDlvColumns() {
		return new MCColumnConfig[] {
				columnDtl_dlv_sundry_flg, columnDtl_dlv_cntct_dpt, columnDtl_dlv_cntct_psn
				,columnDtl_dlv_cntct_psn_title, columnDtl_pri_prnt_flg, columnDtl_cnsgn_stktk_flg 
				,columnDtl_tdlv_flg, columnDtl_via_dlv_typ, columnDtl_via_dlv_typ_nm
				,columnDtl_tdlv_req_flg, columnDtl_lg_grp_cd, columnDtl_lg_grp_nm
				,columnDtl_dlv_cal_cd, columnDtl_dlv_cal_nm, columnDtl_dlv_chnnl1
				,columnDtl_dlv_chnnl2, columnDtl_dlv_chnnl3
				,columnDtl_dlv_prnt_typ, columnDtl_dlv_prnt_typ_nm
		};
	}
	
	/**
	 * 発注先関連項目
	 */
	protected MCColumnConfig[] getSpplColumns() {
		return new MCColumnConfig[] {
				columnDtl_asppl_cd, columnDtl_asppl_nm, columnDtl_vmi_purc_dpt_cd, columnDtl_vmi_purc_dpt_nm
				,columnDtl_subcon_flg, columnDtl_purc_basis_typ, columnDtl_purc_basis_typ_nm
				,columnDtl_po_print_cd, columnDtl_po_print_nm, columnDtl_sppl_ship_form_cd
				,columnDtl_po_dlv_slip_flg, columnDtl_dlv_inst_dlv_slip_flg, columnDtl_prms_rcpt_dlv_slip_flg
				,columnDtl_sppl_ship_form_nm, columnDtl_pay_crryovr_times, columnDtl_sppl_cntct_dpt, columnDtl_sppl_cntct_psn
				,columnDtl_sppl_cntct_psn_title, columnDtl_purc_upri_req_typ, columnDtl_purc_upri_req_typ_nm, columnDtl_purc_upri_cng_flg
				,columnDtl_purc_amt_rnd_typ, columnDtl_purc_amt_rnd_typ_nm, columnDtl_purc_tax_rnd_typ, columnDtl_purc_tax_rnd_typ_nm
				,columnDtl_purc_tax_calc_typ, columnDtl_purc_tax_calc_typ_nm, columnDtl_purc_tax_cd, columnDtl_purc_tax_nm
				,columnDtl_purc_tax_cd_prio_flg, columnDtl_wrk_po_flg, columnDtl_wrk_ap_flg, columnDtl_purc_slip_each_lot_typ
				,columnDtl_purc_slip_each_lot_typ_nm ,columnDtl_prov_rcv_typ, columnDtl_prov_rcv_typ_nm, columnDtl_onr_prsppl_flg
				,columnDtl_repurc_obli_flg ,columnDtl_outsrc_upri_typ, columnDtl_outsrc_upri_typ_nm
				,columnDtl_prov_basis_typ, columnDtl_prov_basis_typ_nm, columnDtl_prov_upri_cng_flg, columnDtl_prov_amt_rnd_typ
				,columnDtl_prov_amt_rnd_typ_nm, columnDtl_prov_tax_rnd_typ, columnDtl_prov_tax_rnd_typ_nm, columnDtl_prov_tax_calc_typ
				,columnDtl_prov_tax_calc_typ_nm, columnDtl_prov_tax_cd, columnDtl_prov_tax_nm, columnDtl_prov_tax_cd_prio_flg
				,columnDtl_sppl_cal_cd, columnDtl_sppl_cal_nm, columnDtl_sppl_iv_flg,columnDtl_rcpt_iv_dup_flg, columnDtl_prms_recv_flg
				,columnDtl_sppl_tterm_cd1, columnDtl_sppl_tterm_nm1, columnDtl_sppl_tterm_cd2
				,columnDtl_sppl_tterm_nm2, columnDtl_sppl_tterm_cd3, columnDtl_sppl_tterm_nm3
				,columnDtl_sppl_prnt_typ, columnDtl_sppl_prnt_typ_nm
		};
	}
	
	/**
	 * 買掛先関連項目
	 */
	protected MCColumnConfig[] getAspplColumns() {
		return new MCColumnConfig[] {
				columnDtl_bsppl_cd, columnDtl_bsppl_nm
				,columnDtl_ap_dpt_cd, columnDtl_ap_dpt_nm
				,columnDtl_asppl_prnt_typ, columnDtl_asppl_prnt_typ_nm
		};
	}
	
	/**
	 * 支払予定管理先関連項目
	 */
	protected MCColumnConfig[] getBspplColumns() {
		return new MCColumnConfig[] {
				columnDtl_psppl_cd, columnDtl_psppl_nm, columnDtl_ap_cred_cd, columnDtl_ap_cred_nm
				,columnDtl_bsppl_dpt_cd, columnDtl_bsppl_dpt_nm, columnDtl_pay_spot_flg, columnDtl_psppl_cl_day1
				,columnDtl_psppl_cl_day2, columnDtl_psppl_cl_day3, columnDtl_psppl_cl_day4, columnDtl_psppl_cl_day5
				,columnDtl_purc_interim_cl_flg, columnDtl_ap_setoff_grp_cd, columnDtl_ap_setoff_grp_nm
				,columnDtl_pay_bank_ac_cd, columnDtl_pay_bank_ac_nm
				, columnDtl_tax_on_pay_flg, columnDtl_pay_tax_rnd_typ, columnDtl_pay_tax_rnd_typ_nm
				, columnDtl_pay_schd_ba_typ, columnDtl_pay_schd_ba_typ_nm, columnDtl_batch_pay_schd_cl_flg
				, columnDtl_pay_schd_cl_delay_days, columnDtl_pay_schd_cl_ba_typ, columnDtl_pay_schd_cl_ba_typ_nm
				, columnDtl_bsppl_prnt_typ, columnDtl_bsppl_prnt_typ_nm
				, columnDtl_pay_ntc_prnt_flg
				, columnDtl_pay_ntc_zip_cd, columnDtl_pay_ntc_addr1, columnDtl_pay_ntc_addr2, columnDtl_pay_ntc_addr3
				, columnDtl_pay_ntc_addr4, columnDtl_pay_ntc_tel, columnDtl_pay_ntc_bsppl_nm, columnDtl_pay_ntc_bsppl_dpt
				, columnDtl_pay_ntc_bsppl_psn, columnDtl_pay_ntc_bsppl_psn_title, columnDtl_pay_ntc_dtl_outp_flg
				, columnDtl_pay_ntc_bfw_bal_disp_flg, columnDtl_pay_ntc_adv_pay_flg, columnDtl_pay_ntc_dtl_pay_flg
				, columnDtl_pay_ntc_dtl_subttl_typ, columnDtl_pay_ntc_dtl_brk_typ, columnDtl_pay_ntc_dtl_sort_typ
				, columnDtl_pay_ntc_can_slip_typ
		};
	}
	
	/**
	 * 支払通知書発行関連項目
	 */
	protected MCColumnConfig[] getPayNtcPrntColumns() {
		return new MCColumnConfig[] {
				columnDtl_pay_ntc_zip_cd, columnDtl_pay_ntc_addr1, columnDtl_pay_ntc_addr2, columnDtl_pay_ntc_addr3
				, columnDtl_pay_ntc_addr4, columnDtl_pay_ntc_tel, columnDtl_pay_ntc_bsppl_nm, columnDtl_pay_ntc_bsppl_dpt
				, columnDtl_pay_ntc_bsppl_psn, columnDtl_pay_ntc_bsppl_psn_title, columnDtl_pay_ntc_dtl_outp_flg
				, columnDtl_pay_ntc_bfw_bal_disp_flg, columnDtl_pay_ntc_adv_pay_flg, columnDtl_pay_ntc_dtl_pay_flg
				, columnDtl_pay_ntc_dtl_subttl_typ, columnDtl_pay_ntc_dtl_brk_typ, columnDtl_pay_ntc_dtl_sort_typ
				, columnDtl_pay_ntc_can_slip_typ
		};
	}
	
	/**
	 * 支払先関連項目
	 */
	protected MCColumnConfig[] getPspplColumns() {
		return new MCColumnConfig[] {
				columnDtl_psppl_rmrks, columnDtl_note_days
				, columnDtl_pay_dpt_cd, columnDtl_pay_dpt_nm
				, columnDtl_psppl_prnt_typ, columnDtl_psppl_prnt_typ_nm
		};
	}
	/**
	 * システム情報（共通）項目
	 */
	protected MCBeans[] getCmnSysBeans() {
		return new MCBeans[] {
				columnDtl_ins_usr_id_c, columnDtl_ins_usr_nm_c, columnDtl_ins_ts_c,
				columnDtl_ins_func_id_c, columnDtl_ins_func_nm_c, columnDtl_upd_cntr_c,
				columnDtl_upd_usr_id_c, columnDtl_upd_usr_nm_c, columnDtl_upd_ts_c,
				columnDtl_upd_func_id_c, columnDtl_upd_func_nm_c, columnDtl_upd_srv_req_no_c,
				columnDtl_del_usr_id_c, columnDtl_del_usr_nm_c, columnDtl_del_ts_c
		};
	}
	/**
	 * システム情報の論理削除関連項目
	 */
	protected MCBeans[] getSysDelBeans() {
		return new MCBeans[] {
				columnDtl_del_usr_id, columnDtl_del_usr_nm, columnDtl_del_ts
		};
	}

}