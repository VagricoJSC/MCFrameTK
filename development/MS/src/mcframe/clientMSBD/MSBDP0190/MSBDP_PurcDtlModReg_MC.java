package mcframe.clientMSBD.MSBDP0190;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import mcframe.clientMSUC.MSUCP0040.*;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcDtlModReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcDtlModReg_MC extends MSBDP_PurcDtlModReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDtlModReg_MC() {
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
	public MSBDP_PurcDtlModReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Srch01Caller<P extends MSBDP_PurcDtlModReg, B extends MS_MSBDL0190_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0190_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		/**
		 * チェック処理を行います
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_purc_dt_from, Cnd_purc_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_ym_from, Cnd_ac_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_from, Cnd_ac_dt_to));
			msgList.addAll(checkAtLeastOne(SelectOpePanel));
			msgList.addAll(checkAtLeastOne(IvTrgtPanel));
			msgList.addAll(checkAtLeastOne(UpriStsPanel));
			msgList.addAll(checkAtLeastOne(SubconStsPanel));
		}
		
		@Override
		protected void show() {
			super.show();
			setHdrEditFlg();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatusByOpe();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			// ステータス設定
			setSrchStatusByOpe();
			// 操作種別による入力制御設定の設定
			setModeByOpe();
		}
	}

	/**
	 * [MS_MSBDL0190_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt01Caller<P extends MSBDP_PurcDtlModReg, B extends MS_MSBDL0190_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		// 単価再取得時のメッセージを保持するリスト
		protected MCMessageList _msgL;
		// 取得対象の明細
		protected MCList<DtlR> _tgtL = MCList.create(DtlR.class);
		
		protected MS_MSBDL0190_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0023); 
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			_tgtL.forEach(r -> {
				// 購買区分で外注の判断を行う
				if (isOutSrc(r)) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_tax_cd));
				}
			});
		}
		

	
		@Override
		protected void initCaller() {
			for (DtlR r : getDtlL().subList(DtlR.$check, true)) {
				r.base_dt(null);
				if (!isNull(UpriReq_upri_dt.getValue())) {
					r.base_dt(UpriReq_upri_dt.getValue());
				}
				else {
					r.base_dt(r.sbst_dt());
				}
				if (isTrgtGetUpri(r)) {
					_tgtL.add(r);
				}
			}
			super.initCaller();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			if (_tgtL.size() == 0) {
				msgList.add(msgNoCheckedRow());
			}
			super.checkForCallStack(msgList);
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_tgtL);

		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void show() {
			super.show();
			_msgL = new MCMessageList();
			for (DtlR r : (MCList<DtlR>)getCheckedRows(panel)) {
				// 値を退避
				MCNumber trdCurUpri = r.trd_cur_upri();
				MCNumber trdCurProcUpri = r.trd_cur_proc_upri();
				MCNumber trdCurOnrProvUpri = r.trd_cur_onr_prov_upri();
				MCNumber xrate = r.xrate();
				MCNumber ptaxXrate = r.ptax_xrate();
				boolean interim_flg = r.interim_flg();
				// 一度単価をクリアするとイベントで値引額がクリアされるので保持する
				MCNumber dscntAmt = r.trd_cur_dscnt_amt();
				String dscntRsnCd = r.dscnt_rsn_cd();
				String dscntRsnNm = r.dscnt_rsn_nm();
				
				// 変更イベントを発生させるため一度クリアする
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_amt, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_proc_amt, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_onr_prov_amt, r.getGUIIndex(), null);
				setValueEx(columnDtl_xrate, r.getGUIIndex(), null);
				setValueEx(columnDtl_ptax_xrate, r.getGUIIndex(), null);
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), null);
				
				// 設定しなおしてイベントを発生させる
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), trdCurUpri);
				setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), trdCurProcUpri);
				setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), trdCurOnrProvUpri);
				setValueEx(columnDtl_xrate, r.getGUIIndex(), xrate);
				setValueEx(columnDtl_ptax_xrate, r.getGUIIndex(), ptaxXrate);
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), interim_flg);
				
				if ((!isNull(r.trd_cur_amt()) && !isNull(dscntAmt) && r.trd_cur_amt().lt(dscntAmt))
						|| (isNull(trdCurUpri) && !isNull(dscntAmt))) {
					// 金額<値引額のときと、元々は単価・値引額が入力されていたがマスタ単価が取得できず値引額が残ってしまった場合は、値引額をクリアする
					_msgL.add(new MCMessage(r, null, MSBDP0036, dscntAmt, dscntRsnCd, dscntRsnNm, toDispGUIIndex(r)));
					setValueEx(columnDtl_trd_cur_dscnt_amt, r.getGUIIndex(), null);
					setValueEx(columnDtl_dscnt_rsn_cd, r.getGUIIndex(), null);
				}
				else {
					setValueEx(columnDtl_trd_cur_dscnt_amt, r.getGUIIndex(), dscntAmt);
					setValueEx(columnDtl_dscnt_rsn_cd, r.getGUIIndex(), dscntRsnCd);
				}
			}
		}
		
		
		
		@Override
		protected void showEndMsg() {
			if (!_msgL.isEmpty()) {
				message(_msgL);
			}
			else if (bridge.up0().size() > 0) {
				panel.dialog(new MCMessage(MSBDP0024));
			}
		}
		
		
	}

	/**
	 * [MS_MSBDL0190_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt02Caller<P extends MSBDP_PurcDtlModReg, B extends MS_MSBDL0190_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0190_Sprt02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0025); 
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(XrateReq_xrate_dt));
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected boolean checkForCall() {
			boolean rslt = super.checkForCall();
			if (rslt) {
				MCList<DtlR> dtlL = getCheckedRows(panel);
				if (dtlL.size() == 0) {
					panel.dialog(msgNoCheckedRow());
					rslt = false;
				}
				MCList<DtlR> subL = getTgtListXrate(dtlL);
				if (subL.isEmpty()) {
					panel.dialog(new MCMessage(MSBDP0027));
					rslt = false;
				}	
			}
			return rslt;
		}
		
		/**
		 * 為替レート取得対象を抽出します
		 * @param dtlL
		 * @return
		 */
		protected MCList<DtlR> getTgtListXrate(MCList<DtlR> dtlL) {
			MCList<DtlR> subL = dtlL.subList(new MCRowMatcher<DtlR>() {
				public boolean match (DtlR m) {
					if (isSame(m.base_trd_cur_cd(), m.base_cur_cd())) {
						return false;
					}
					else {
						return true;
					}
				}
			});
			return subL;
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setDateNE(DtlR.$xrate_base_dt, getXrateReqR().xrate_dt());
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void show() {
			super.show();
			for (DtlR r : (MCList<DtlR>)getCheckedRows(panel)) {
				MCNumber xrate = r.xrate();
				setValueEx(columnDtl_xrate, r.getGUIIndex(), null);
				setValueEx(columnDtl_xrate, r.getGUIIndex(), xrate);
			}
			// 同じヘッダの他の明細にも為替レートをセットする
			for (MCList<DtlR> l : (MCList<DtlR>[])getCheckedRows(panel).groupList(DtlR.$rcpt_iv_mng_no)) {
				DtlR r = l.get(0);
				if (isNull(r.rcpt_iv_mng_no())) {
					for (MCList<DtlR> purcL : l.groupList(DtlR.$purc_act_no)) {
						r = purcL.get(0);
					}
				}
				copyHdrToDtlColumn(columnDtl_xrate, r);
			}
		}
		
		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBDP0026));
		}
	}

	/**
	 * [MS_MSBDL0190_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt03Caller<P extends MSBDP_PurcDtlModReg, B extends MS_MSBDL0190_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		
		// 取得対象の明細
		protected MCList<DtlR> _tgtL = MCList.create(DtlR.class);
		
		protected MS_MSBDL0190_Sprt03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(TaxReq_tax_dt));
		}
		
		@Override
		protected void initCaller() {
			for (DtlR r : getDtlL().subList(DtlR.$check, true)) {
				if (!isRcptIv(r)) {
					_tgtL.add(r);
				}
			}
			super.initCaller();
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0028);
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_tgtL);
			bridge.up0().setDateNE(DtlR.$tax_base_dt, getTaxReqR().tax_dt());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			if (_tgtL.size() == 0) {
				msgList.add(msgNoCheckedRow());
			}
			super.checkForCallStack(msgList);
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void show() {
			super.show();
			for (DtlR r : (MCList<DtlR>)getCheckedRows(panel)) {
				DtlR dtlR = getDtlL().get(r.getGUIIndex());
				dtlR.tax_cd(r.tax_cd());
				dtlR.tax_nm(r.tax_nm());
				dtlR.tax_rate(r.tax_rate());
				dtlR.tax_typ(r.tax_typ());
				dtlR.inc_tax_flg(r.inc_tax_flg());
				
				MCNumber tmpUpri = dtlR.trd_cur_upri();
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), tmpUpri);
			}
		}
		
		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBDP0029));
		}
	}
	
	/**
	 * [MS_MSBDL0190_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Upd01Caller<P extends MSBDP_PurcDtlModReg, B extends MS_MSBDL0190_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0190_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBDL0190_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBDL0190_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0190_Upd01();
	}
	/**
	 * Panel[UpriReq]のボタン[uprireq]の押下時の処理
	 */
	@Override
	public void doUpriReq_uprireq(MCEventInfo info) {
		callMS_MSBDL0190_Sprt01();
	}
	/**
	 * Panel[XrateReq]のボタン[xratereq]の押下時の処理
	 */
	@Override
	public void doXrateReq_xratereq(MCEventInfo info) {
		callMS_MSBDL0190_Sprt02();
	}
	/**
	 * Panel[TaxReq]のボタン[taxreq]の押下時の処理
	 */
	@Override
	public void doTaxReq_taxreq(MCEventInfo info) {
		callMS_MSBDL0190_Sprt03();
	}
	/**
	 * Panel[UpriReq]のボタン[tag_flg]の押下時の処理
	 */
	@Override
	public void doUpriReq_tag_flg(MCEventInfo info) {
		for (DtlR row : getDtlL()) {
			int i = row.getGUIIndex();
			if (isEditable(columnDtl_check, i) && row.check()
					&& !isPurcDscnt(row) &&!isRcptIv(row)) {
				setValueEx(columnDtl_interim_flg, i, true);
			}
		}
	}
	/**
	 * Panel[UpriReq]のボタン[not_tag_flg]の押下時の処理
	 */
	@Override
	public void doUpriReq_not_tag_flg(MCEventInfo info) {
		for (DtlR row : getDtlL()) {
			int i = row.getGUIIndex();
			if (isEditable(columnDtl_check, i) && row.check()
					&& !isPurcDscnt(row) &&!isRcptIv(row)) {
				setValueEx(columnDtl_interim_flg, i, false);
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		openDtl(info);
	}
	// -----------------------------------------------
	// 画面遷移
	// -----------------------------------------------
	/**
	 * 詳細ボタンの画面遷移を制御します。
	 * @param info
	 */
	protected void openDtl (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		if (isPurc(dtlR)) {
			// 仕入、経費仕入の場合
			if (isNull(dtlR.rcpt_iv_no())) {
				MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0140");
				aso.putCnd(crtOpenMSBDP0140CndR(aso, dtlR));
				aso.putSearchAction();
				aso.show();
			}
			else {
				MCRow bind = setBind_MSBEP2210(dtlR);
				
				if (Cnd_ope_UPD.isSelected()) {
					openPanel("MS", "MSBEP2210", T3, bind);
				}
				else {
					openPanel("MS", "MSBEP2210", T2, bind);
				}
			}
		}
		else if (isPurcRtn(dtlR)) {
			// 仕入返品、経費仕入返品の場合
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0160");
			aso.putCnd(crtOpenMSBDP0160CndR(aso, dtlR));
			aso.putSearchAction();
			aso.show();
		}
		else if (isPurcDscnt(dtlR))  {
			// 仕入値引・値増、経費仕入値引・値増の場合
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0180");
			aso.putCnd(crtOpenMSBDP0180CndR(aso, dtlR));
			aso.putSearchAction();
			aso.show();
		}
		// その他ＶＭＩなどは遷移不可
	}
	
	// 仕入実績登録画面
	protected mcframe.clientMSBD.MSBDP0140.CndR crtOpenMSBDP0140CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg p = (mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0140.CndR to = mcframe.clientMSBD.MSBDP0140.CndR.create();
		if (Cnd_ope_UPD.isSelected()) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
			to.ope(p.Cnd_ope_UPD.getActionCommand());	
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
			to.purc_act_rev(r.purc_act_rev());
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		return to;
	}
	// 仕入返品登録画面
	protected mcframe.clientMSBD.MSBDP0160.CndR crtOpenMSBDP0160CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg p = (mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0160.CndR to = mcframe.clientMSBD.MSBDP0160.CndR.create();
		if (Cnd_ope_UPD.isSelected()) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_RET_ACT_NO.name());
			to.srch_tgt_no(r.purc_ret_act_no());
			to.ope(p.Cnd_ope_UPD.getActionCommand());	
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_RET_ACT_NO.name());
			to.srch_tgt_no(r.purc_ret_act_no());
			to.srch_tgt_rev(r.purc_ret_act_rev());
			to.ope(p.Cnd_ope_REF.getActionCommand());	
		}
		return to;
	}
	// 仕入値引登録画面
	protected mcframe.clientMSBD.MSBDP0180.CndR crtOpenMSBDP0180CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg p = (mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0180.CndR to = mcframe.clientMSBD.MSBDP0180.CndR.create();
		if (Cnd_ope_UPD.isSelected()) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
			to.ope(p.Cnd_ope_UPD.getActionCommand());	
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
			to.srch_tgt_no(r.purc_act_no());
			to.rev_no(r.purc_act_rev());
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		return to;
	}
	
		public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
			
			mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg rootP = (mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg)panel;
			if(!rootP.Cnd_disp_unit_Hdr.isSelected()) {
				dialog(MSBDP0100);
				return;
			}
			
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
			
			mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
			
			p.screenOpen(rootP, args);
		}
		
		//受領インボイス画面
		protected MCRow setBind_MSBEP2210(DtlR r) {
			MCRow bind = MCRow.create();
			bind.addStringColumn("rcpt_iv_no", r.rcpt_iv_no());
			bind.addStringColumn("rcpt_iv_mng_no", r.rcpt_iv_mng_no());
			
			if (Cnd_ope_REF.isSelected()) {
				bind.addNumberColumn("rcpt_iv_rev", r.rcpt_iv_rev());
			}

			return bind;
		}
		
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		// 操作種別に応じた項目の入力制御と初期値の設定
		setDispDefaultByOpe();
		// 検索モードの設定
		setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Dtl.getActionCommand());
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		
		// 取引単位数量
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);				
		Dtl_base_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_trd_unit_cd, columnDtl_base_trd_unit_dec_place);
		// 基準単位数量
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place,columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,columnDtl_trd_unit_conv_qty);
		Dtl_base_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place,columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,columnDtl_trd_unit_conv_qty);
		// 標準有効成分
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		// 仕入有効成分
		Dtl_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr,
				columnDtl_purc_cont_fctr, columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		// 品目分類
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		// 取引先分類
		Dtl_sppl_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
		// 買掛先分類
		Dtl_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		//-------------------------------------------
		// 取引通貨
		//-------------------------------------------
		// 取引通貨単価・金額
		Dtl_trd_cur_upri_p_PPanel.setAmtToUpri(true);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_sppl_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_cur_upri_dec_place,
				columnDtl_purc_amt_rnd_typ, columnDtl_purc_tax_rnd_typ, null, null,
				columnDtl_dscnt_itm_flg);
		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place);
		// 取引通貨加工単価・金額
		Dtl_old_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place);
		Dtl_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place);
		Dtl_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty, columnDtl_trd_cur_proc_upri,
				columnDtl_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl_old_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place);
		Dtl_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place);
		Dtl_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty,
				columnDtl_trd_cur_onr_prov_upri, columnDtl_purc_amt_rnd_typ, null);
		//-------------------------------------------
		// 基準通貨
		//-------------------------------------------
		// 為替レート
		Dtl_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_base_cur_cd, columnDtl_xrate_cd, columnDtl_purc_dt, true);
		// 基準通貨単価・金額・税込金額・値引額
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_upri, columnDtl_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_amt, columnDtl_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, columnDtl_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, columnDtl_xrate);
		Dtl_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, columnDtl_xrate);
		// 基準通貨加工単価・金額
		Dtl_base_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_proc_upri,
				columnDtl_xrate);
		Dtl_base_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_proc_amt,
				columnDtl_xrate);
		// 基準通貨有償支給単価・金額
		Dtl_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri,
				columnDtl_xrate);
		Dtl_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt,
				columnDtl_xrate);
		//-------------------------------------------
		// 納税通貨
		//-------------------------------------------
		// 納税為替レート
		Dtl_ptax_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_ptax_cur_cd, columnDtl_xrate_cd, columnDtl_purc_dt, true);
		// 納税通貨単価・金額・税込金額・値引額
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt,
				columnDtl_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_proc_upri,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_proc_amt,
				columnDtl_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt,
				columnDtl_ptax_xrate);
		Dtl_bditm_p_PPanel.setRelateBeans(
				columnDtl_asset_mng_typ,
				columnDtl_bd_lot_mng_typ, columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ, 
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ, columnDtl_bd_sno4_mng_typ);
	}
	
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(XrateReqPanel);
		}
	}
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_trd_cur_proc_amt.addLCListener(this);
		columnDtl_trd_cur_onr_prov_amt.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_ptax_cur_tax_amt.addLCListener(this);
		columnDtl_base_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_purc_dpt_cd.addNCListener(this);
		columnDtl_purc_usr_cd.addNCListener(this);
		columnDtl_xrate.addLCListener(this);
		columnDtl_ptax_xrate.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl_trd_cur_proc_upri.addLCListener(this);
		columnDtl_trd_cur_onr_prov_upri.addLCListener(this);
		columnDtl_purc_dpt_cd.addLCListener(this);
	}
	// -----------------------------------------------
	// VCEvent
	// -----------------------------------------------
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}
	
	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc instanceof MCColumnConfig) {
			MCColumnConfig col = (MCColumnConfig)nc;
			DtlR r = getDtlL().get(info.getEventIndex());
			if (isHdrCol(col,isNull(r.rcpt_iv_mng_no()))) {
				// ヘッダ項目を編集した場合、明細行にヘッダ項目の値を連動させる
				if (getDtlL().size() == 0 || info.getEventIndex() < 0) {
					return;
				}
				if (r.hdr_edit_flg()) {
					copyHdrToDtlColumn(col, r);
				}
			}
		}
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		if (info.getEventIndex() < 0) {
			return;
		}
		setBtnMode(info.getEventIndex());
	}
	
	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_trd_cur_proc_amt) {
			doDtl_trd_cur_proc_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_onr_prov_amt) {
			doDtl_trd_cur_onr_prov_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_amt) {
			doDtl_trd_cur_amt_LC(info);
		}

		if (lc == columnDtl_ptax_cur_tax_amt) {
			doDtl_ptax_cur_tax_amt_LC(info);
		}
		
		if (lc == columnDtl_base_cur_tax_amt) {
			doDtl_base_cur_tax_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_upri) {
			doDtl_trd_cur_upri_LC(info);
		}
		if (lc == columnDtl_xrate) {
			doDtl_xrate_LC(info);
		}
		if (lc == columnDtl_ptax_xrate) {
			doDtl_ptax_xrate_LC(info);
		}
		if (lc == columnDtl_trd_cur_tax_amt) {
			doDtl_trd_cur_tax_amt_LC(info);
		}
		if(lc == columnDtl_trd_cur_dscnt_amt) {
			doDtl_trd_cur_dscnt_amt_LC(info);
		}
		if(lc == columnDtl_trd_cur_proc_upri) {
			doDtl_trd_cur_proc_upri_LC(info);
		}
		if(lc == columnDtl_trd_cur_onr_prov_upri) {
			doDtl_trd_cur_onr_prov_upri_LC(info);
		}
		if (lc == columnDtl_tax_cd) {
			doDtl_tax_cd_LC(info);
		}
		if (lc == columnDtl_purc_dpt_cd) {
			doDtl_purc_dpt_cd_LC(info);
		}
	}

	public void doDtl_purc_dpt_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setApDptCd(r);
	}
	
	protected void setApDptCd(DtlR dtlR) {
		if (isNull(dtlR.mst_ap_dpt_cd())) {
			if (isNull(dtlR.purc_dpt_cd())) {
				setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), null);
			}
			else {
				 if (dtlR.ap_dpt_flg()) {
					 setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), dtlR.purc_dpt_cd());
				}
				else {
					setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), null);
				}	
			}
		}
	}
	
	public void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		clearDscntAmt(dtlR);
		if(isOutSrc(dtlR)) {
			if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
				dtlR.trd_cur_proc_upri(dtlR.trd_cur_upri());
				dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
				setBaseCurAmt(dtlR);
				setPtaxCurAmt(dtlR);
			}
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(dtlR);
			}
		}
	}

	protected void clearDscntAmt(DtlR dtlR) {
		if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero() || isNull(dtlR.trd_cur_amt()) || dtlR.trd_cur_amt().isZero()) {
			dtlR.trd_cur_dscnt_amt(null);
			dtlR.dscnt_rsn_cd(null);
			dtlR.dscnt_rsn_nm(null);
		}
	}
	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param dtlR
	 */
	protected void setRepurcObliTax(DtlR dtlR) {
		if(isNull(dtlR.trd_cur_cd()) || (isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri()))) {
			return;
		}
		MCNumber amt = null;
		if (DtlTable.getEditingColumnConfig() == columnDtl_trd_cur_proc_amt
				|| DtlTable.getEditingColumnConfig() == columnDtl_trd_cur_onr_prov_amt) {
			amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		}
		else {
			// 金額 = (単価:加工単価 + 有償支給単価)×数量
			amt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_upri(),
					dtlR.trd_unit_qty(),
					dtlR.trd_cur_amt_dec_place(),
					dtlR.purc_amt_rnd_typ(),
					dtlR.trd_cur_dscnt_amt()
					);
			if(dtlR.inc_tax_flg()) {
				// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
				MCNumber proc_inc_tax_amt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
						dtlR.trd_unit_qty(),
						dtlR.trd_cur_amt_dec_place(),
						dtlR.purc_amt_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
				dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
				// 有償支給金額は金額-加工金額
				dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
			}else {
				dtlR.trd_cur_amt(amt);
				// 外税の場合は金額を案分
				setOutsrcAmt(dtlR);
			}
		}
		// 加工金額を元に税額を取得(有償支給金額は税額に含めない)
		// 値引額は共通処理で考慮済なので計算に含めない
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(
				dtlR.trd_cur_proc_amt(),
				dtlR.tax_rate(),
				dtlR.trd_cur_amt_dec_place(),
				dtlR.purc_tax_rnd_typ(),
				dtlR.inc_tax_flg()
				);
		if(dtlR.inc_tax_flg()) {
			amt = (amt != null) ? amt.subtract(tax_amt) : null;
			MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(tax_amt) : null;
			dtlR.trd_cur_proc_amt(proc_amt);
		}
		MCNumber inc_tax_amt = (amt != null) ? amt.add(tax_amt) : null;

		dtlR.trd_cur_amt(amt);
		dtlR.trd_cur_tax_amt(tax_amt);
		dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(dtlR);
		setPtaxCurAmt(dtlR);
	}
	/**
	 * 金額を案分して加工金額・有償支給金額を導出します
	 * @param dtlR
	 */
	protected void setOutsrcAmt(DtlR dtlR) {
		if(!isOutSrc(dtlR)) {
			return;
		}
		MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), dtlR.trd_cur_amt_dec_place(),
				dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
		dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
		dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
		setBaseCurAmt(dtlR);
		setPtaxCurAmt(dtlR);
	}
	/**
	 * 基準通貨項目に取引通貨項目を元に値を設定します
	 * @param dtlR
	 */
	protected void setBaseCurAmt(DtlR dtlR) {
		dtlR.base_cur_onr_prov_upri(convToBaseCur(dtlR.trd_cur_onr_prov_upri(), dtlR.xrate(), dtlR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_upri(convToBaseCur(dtlR.trd_cur_proc_upri(), dtlR.xrate(), dtlR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), dtlR.xrate(), dtlR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	/**
	 * 納税通貨項目に取引通貨項目を元に値を設定します
	 * @param dtlR
	 */
	protected void setPtaxCurAmt(DtlR dtlR) {
		dtlR.ptax_cur_onr_prov_upri(convCur(dtlR.trd_cur_onr_prov_upri(), dtlR.ptax_xrate(), dtlR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_upri(convCur(dtlR.trd_cur_proc_upri(), dtlR.ptax_xrate(), dtlR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), dtlR.ptax_xrate(), dtlR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}

	protected void doDtl_ptax_cur_tax_amt_LC(MCEventInfo info) {
		
		if (DtlTable.getEditingColumnConfig() != columnDtl_ptax_cur_tax_amt) {
			return;
		}
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());

		MCNumber taxAmt = dtlR.ptax_cur_tax_amt();
		if (isNull(dtlR.ptax_cur_tax_amt())
				|| isNull(dtlR.ptax_cur_inc_tax_amt())) {
			return;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額を計算する。
			// 税込金額 から手入力した税額を除いた値を金額に反映する。
			MCNumber exTaxAmt = dtlR.ptax_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.ptax_cur_amt(exTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt().divide(dtlR.ptax_xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(dtlR.ptax_xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			if(isOutSrc(dtlR)) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), dtlR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), dtlR.ptax_xrate(), dtlR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		else {
			// 外税の場合、税込金額を計算する。
			// 税抜金額に手入力した税額を加算した値を税込金額に反映する。
			MCNumber incTaxAmt = dtlR.ptax_cur_amt().add(taxAmt);
			dtlR.ptax_cur_inc_tax_amt(incTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt().divide(dtlR.ptax_xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(dtlR.ptax_xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
	}
	protected void doDtl_base_cur_tax_amt_LC(MCEventInfo info) {
		
		if (DtlTable.getEditingColumnConfig() != columnDtl_base_cur_tax_amt) {
			return;
		}
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());

		MCNumber taxAmt = dtlR.base_cur_tax_amt();
		if (isNull(dtlR.base_cur_tax_amt())
				|| isNull(dtlR.base_cur_inc_tax_amt())) {
			return;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(納税通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を納税通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.base_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.base_cur_amt(exTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.base_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.base_cur_amt().divide(dtlR.xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(dtlR.xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			if(isOutSrc(dtlR)) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							dtlR.trd_cur_amt_dec_place(),
							dtlR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), dtlR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), dtlR.xrate(), dtlR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.base_cur_amt().add(taxAmt);
			dtlR.base_cur_inc_tax_amt(incTaxAmt);
			if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt().divide(dtlR.xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(dtlR.xrate(), dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
		}
	}
	
	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setWtaxAmt(r);
	}
	/**
	 * 取引通貨加工金額変更イベント
	 * @param info
	 */
	protected void doDtl_trd_cur_proc_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(isNull(dtlR.trd_cur_proc_amt())) {
			dtlR.trd_cur_dscnt_amt(null);
			setValueEx(columnDtl_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
		}
		if (isNull(dtlR.trd_cur_proc_upri())
				|| (!isNull(dtlR.trd_cur_proc_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl_trd_cur_proc_upri))) {
			MCNumber trdCurProcAmt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().add(nvl(dtlR.trd_cur_dscnt_amt(), MCNumber.ZERO)) : null;
			MCNumber trdCurProcUpri = MAUCP_AmtUtil.getUpri(trdCurProcAmt, dtlR.trd_unit_qty(), dtlR.trd_cur_upri_dec_place());
			dtlR.trd_cur_proc_upri(trdCurProcUpri);
			setOutsrcUpriAndAmt(dtlR);
		}
	}
	/**
	 * 取引通貨有償支給金額変更イベント
	 * @param info
	 */
	protected void doDtl_trd_cur_onr_prov_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.trd_cur_onr_prov_upri())
				|| (!isNull(dtlR.trd_cur_onr_prov_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl_trd_cur_onr_prov_upri))) {
			MCNumber trdCurOnrProvUpri = MAUCP_AmtUtil.getUpri(dtlR.trd_cur_onr_prov_amt(), dtlR.trd_unit_qty(), dtlR.trd_cur_upri_dec_place());
			dtlR.trd_cur_onr_prov_upri(trdCurOnrProvUpri);
			setOutsrcUpriAndAmt(dtlR);
		}
	}
	protected void setOutsrcUpriAndAmt(DtlR dtlR) {
		if (DtlTable.getEditingColumnConfig() != columnDtl_trd_cur_proc_amt
				&& DtlTable.getEditingColumnConfig() != columnDtl_trd_cur_onr_prov_amt) {
			return;
		}
		
		dtlR.trd_cur_upri(getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri()));
		
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmtAndTax(dtlR);
		}
		clearDscntAmt(dtlR);
	}
	protected void setOutsrcAmtAndTax(DtlR dtlR) {
		MCNumber amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(amt, dtlR.tax_rate(), dtlR.trd_cur_amt_dec_place(), dtlR.purc_tax_rnd_typ(), dtlR.inc_tax_flg());
		if(dtlR.inc_tax_flg()) {
			amt = !isNull(amt) ? amt.subtract(tax_amt) : null;
		}
		MCNumber inc_tax_amt = !isNull(amt) ? amt.add(tax_amt) : null;
		dtlR.trd_cur_amt(amt);
		dtlR.trd_cur_tax_amt(tax_amt);
		dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(dtlR);
		setPtaxCurAmt(dtlR);
	}
	protected MCNumber getOutsrcAmt(MCNumber trdCurProcAmt, MCNumber trdCurOnrProvAmt) {
		if(isNull(trdCurProcAmt) && isNull(trdCurOnrProvAmt)) {
			return null;
		}
		return nvl(trdCurProcAmt, MCNumber.ZERO).add(nvl(trdCurOnrProvAmt, MCNumber.ZERO));
	}
	/**
	 * 取引通貨金額変更イベント
	 * @param info
	 */
	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setWtaxAmt(dtlR);
		clearDscntAmt(dtlR);
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(dtlR);
			setPtaxCurAmt(dtlR);
		}
	}
	protected void doDtl_xrate_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.hdr_edit_flg()) {
			copyHdrToDtlColumn(columnDtl_xrate, r);
		}
	}
	protected void doDtl_ptax_xrate_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.hdr_edit_flg()) {
			copyHdrToDtlColumn(columnDtl_ptax_xrate, r);
		}
	}
	/**
	 * 税額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(isOutSrc(dtlR)){
			// 埋め込み画面側のイベント処理で、税額から先に値がセットされ、値引額側がエラーにならないので、税額にイベントを実装
			chkProcAmtMinus(dtlR);
		}
	}
	/**
	 * 取引通貨値引額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(isOutSrc(dtlR)) {
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(dtlR);
			}
		}
	}
	/**
	 * 取引通貨加工単価変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_proc_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 加工単価がnullの場合は値引額をクリアする
		if(isNull(dtlR.trd_cur_proc_upri())) {
			dtlR.trd_cur_dscnt_amt(null);
			setValueEx(columnDtl_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
		}
		chkProcAmtMinus(dtlR);
		MCNumber onr_prov_upri = dtlR.trd_cur_onr_prov_upri();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			onr_prov_upri = null;
		}
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), onr_prov_upri);
		setValueEx(columnDtl_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 取引通貨有償支給単価変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_onr_prov_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri());
		setValueEx(columnDtl_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 外注時の単価(加工単価+有償支給単価)を取得する
	 * @param trd_cur_proc_upri 取引通貨加工単価
	 * @param trd_cur_onr_prov_upri 取引通貨有償支給単価
	 * @return
	 */
	protected MCNumber getOutsrcUpri(MCNumber trd_cur_proc_upri, MCNumber trd_cur_onr_prov_upri) {
		if(isNull(trd_cur_proc_upri) && isNull(trd_cur_onr_prov_upri)) {
			return null;
		}
		return nvl(trd_cur_proc_upri, MCNumber.ZERO).add(nvl(trd_cur_onr_prov_upri, MCNumber.ZERO));
	}
	/**
	 * 値引額の値により、加工金額がマイナスとならないようにチェックする。
	 * 加工金額を計算して設定することで、マイナス値を設定した際にエラーを発生させる。
	 * 
	 * @param dtlR
	 */
	protected void chkProcAmtMinus(DtlR dtlR) {
		if(!isOutSrc(dtlR) || isNull(dtlR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
				dtlR.trd_unit_qty(),
				dtlR.trd_cur_amt_dec_place(),
				dtlR.purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		if(procAmt.isNegative()) {
			setValueEx(columnDtl_trd_cur_proc_amt, dtlR.getGUIIndex(), procAmt);
		}
	}
	/**
	 * 税CD変更イベント
	 * @param info
	 */
	public void doDtl_tax_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(dtlR);
		}
	}
	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 操作種別に応じた項目の入力制御と初期値の設定
		// 検索モードの設定
		setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Dtl.getActionCommand());
		// その他初期値等設定
		setDispDefaultByOpe();
	}
	@Override
	public void doCnd_disp_unit_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		// 操作種別に応じた項目の入力制御と初期値の設定
		setDispDefaultByOpe();
	}
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			doBtn_open_dtl(info);
		}
	}
	@Override
	public void doCnd_dis_can_disp_flg_NC(MCEventInfo info) {
		super.doCnd_dis_can_disp_flg_NC(info);
		setModeToIncPastFlg();
	}
	
	protected void setModeToIncPastFlg() {
		if (getCndR().dis_can_disp_flg()) {
			setValueEx(Cnd_inc_past_flg, true);
			Cnd_inc_past_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_inc_past_flg);
		}
	}

	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(crtDtlCellConfig());
	}
	protected DtlCellConfig crtDtlCellConfig() {
		return new DtlCellConfig();
	}
	protected class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);
			if (Cnd_ope_UPD.isSelected()) {
				// オペレーション実行後は該当行を入力不可
				if (isEditableMode(column)) {
					if (MAC_RTN_STS_TYP.isOK(dtlR.rtn_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 無償・検証不良の明細の訂正は認めない
				if (dtlR.ncv_flg() || dtlR.accpt_dfct_flg()) {
					return MCMode.READ_ONLY;
				}
				//-----------------------------
				// ヘッダ項目
				//-----------------------------
				if (isHdrCol(column,isNull(dtlR.rcpt_iv_mng_no()))) {
					if (!dtlR.hdr_edit_flg()) {
						// ヘッダ項目は、代表する明細のみ修正可である
						return MCMode.READ_ONLY;
					}
					//　計上日 
					if (column == columnDtl_ac_dt) {
						// 過月訂正のみ可
						if (isNull(dtlR.purc_cl_ym()) || dtlR.ac_ym().gt(dtlR.purc_cl_ym())) {
							return MCMode.READ_ONLY;
						}
					}
					// 納税日・納税為替レート・納税通貨税額
					if (column == columnDtl_ptax_xrate
							|| column == columnDtl_ptax_cur_tax_amt) {
						if (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())
								|| isNull(dtlR.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					// 支払起算日
					if (column == columnDtl_pay_basis_dt) {
						if (dtlR.sppl_iv_flg() && dtlR.pay_spot_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					// 支払予定日
					if (column == columnDtl_pay_schd_dt) {
						if (!dtlR.sppl_iv_flg()) {
							return MCMode.READ_ONLY;
						}
						else if (!dtlR.pay_spot_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else {
					//-----------------------------
					// 明細項目
					//-----------------------------
					// 取引通貨単価・金額・税込金額
					if (column == columnDtl_trd_cur_upri || column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
						// 外注単価区分:加工単価+有償支給単価の場合は入力不可
						if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(dtlR.outsrc_upri_typ())) {
							return MCMode.READ_ONLY;
						}
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 加工単価・金額、有償支給単価・金額
					if (column == columnDtl_trd_cur_proc_upri
							|| column == columnDtl_trd_cur_proc_amt
							|| column == columnDtl_trd_cur_onr_prov_upri
							|| column == columnDtl_trd_cur_onr_prov_amt) {
						if (!isOutSrc(dtlR)) {
							return MCMode.READ_ONLY;
						}
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 有償支給単価・有償支給金額
					if(column == columnDtl_trd_cur_onr_prov_upri || column == columnDtl_trd_cur_onr_prov_amt) {
						if (MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
							return MCMode.READ_ONLY;
						}
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 加工金額・有償支給金額
					if(column == columnDtl_trd_cur_proc_amt || column == columnDtl_trd_cur_onr_prov_amt) {
						if(dtlR.inc_tax_flg()) {
							return MCMode.READ_ONLY;
						}
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 税ＣＤ
					if (column == columnDtl_tax_cd) {
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 値引額
					if (column == columnDtl_trd_cur_dscnt_amt) {
						// 受領インボイスは入力不可
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_base_purc_ac_dt) {
						if (!isPurcDscnt(dtlR) && !isPurcRtn(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					if (isPurcDscnt(dtlR)) {

						// 値引額・値引理由
						if (column == columnDtl_trd_cur_dscnt_amt
								|| column == columnDtl_dscnt_rsn_cd) {
							return MCMode.READ_ONLY;
						}
						else if (column == columnDtl_trd_cur_onr_prov_upri
								|| column == columnDtl_trd_cur_onr_prov_amt
								|| column == columnDtl_trd_cur_proc_upri
								|| column == columnDtl_trd_cur_proc_amt) {
							return MCMode.READ_ONLY;
						}
						
						if(isEditableMode(column) && column == columnDtl_bd_dpt_cd){
							return MCMode.REQUIRED;
						}
						if (column.getRootPanel() == Dtl_bditm_p_PPanel) {
							if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_rsn_cd) {
							return MCMode.REQUIRED;
						}
					}
					
					if (isPurcRtn(dtlR)) {
						if (column == columnDtl_rsn_cd) {
							return MCMode.REQUIRED;
						}
					}
					
					// 理由
					if (column == columnDtl_rsn_cd) {
						if (isPurcXpns(dtlR)) {
							return MCMode.REQUIRED;
						}
					}
					
					// 源泉税率
					if (column == columnDtl_wtax_rate) {
						if (!isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd())) {
							return MCMode.READ_ONLY;
						}
						if (!isNull(dtlR.ptax_cur_cd()) && !isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					
					// 基準通貨税額
					if (column == columnDtl_base_cur_tax_amt) {
						if (!isNull(dtlR.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
						if (MAC_TAX_CALC_TYP.isSLIP(dtlR.purc_tax_calc_typ())) {
							return MCMode.READ_ONLY;
						}
						if (isSame(dtlR.tax_rate(), MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.trd_cur_tax_amt())) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.trd_cur_upri())
								|| dtlR.trd_cur_upri().lte(MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isSame(dtlR.xrate(), MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.xrate())) {
							return MCMode.READ_ONLY;
						}
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					
					// 納税通貨税額
					if (column == columnDtl_ptax_cur_tax_amt) {
						if (isNull(dtlR.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
						if (MAC_TAX_CALC_TYP.isSLIP(dtlR.purc_tax_calc_typ())) {
							return MCMode.READ_ONLY;
						}
						if (isSame(dtlR.tax_rate(), MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.ptax_xrate())) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.trd_cur_tax_amt())) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtlR.trd_cur_upri())
								|| dtlR.trd_cur_upri().lte(MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isSame(dtlR.ptax_xrate(), MCNumber.ZERO)) {
							return MCMode.READ_ONLY;
						}
						if (isRcptIv(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_trd_cur_dscnt_amt) {
						if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_interim_flg) {
						if (isPurcDscnt(dtlR) || isRcptIv(dtlR)) {
							return  MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	/**
	 * 操作種別に対応するステータスを設定します。（検索）
	 */
	protected void setSrchStatusByOpe() {
		if (Cnd_disp_unit_Hdr.isSelected()) {
			setSRCH_HDRStatus();
		}
		else if (Cnd_disp_unit_Dtl.isSelected()) {
			setSRCH_DTLStatus();
		}
		else {
			setSRCH_IOStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	/**
	 * 操作種別に対応するステータスを設定します。（更新）
	 */
	protected void setRefStatusByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				setREF_HDRStatus();
			}
			else if (Cnd_disp_unit_Dtl.isSelected()) {
				setREF_DTLStatus();
			}
			else {
				setREF_IOStatus();
			}	
		}
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}
	/**
	 * 操作種別に対応する入力制御を設定します。
	 */
	public void setModeByOpe() {
		// 検索条件の入力制御
		setCndColModeByOpe();
	}
	/**
	 * 操作種別に対応する検索条件の入力制御を設定します。
	 */
	public void setCndColModeByOpe() {
		if (Cnd_ope_UPD.isSelected()) {
			Cnd_disp_unit_Group.setMode(MCMode.READ_ONLY);
			Cnd_dis_can_disp_flg.setMode(MCMode.READ_ONLY);
			Cnd_sign_rev_flg.setMode(MCMode.READ_ONLY);
			Cnd_incl_temp_ap_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setModeToIncPastFlg();
	}

	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		setModeToIncPastFlg();
	}
	
	/**
	 * ボタンの押下制御をします。
	 * @param index 一覧のインデックス
	 */
	protected void setBtnMode(int index) {
		DtlR r = getDtlL().get(index);
		if (MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())) {
			Btn_open_dtl.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_dtl.setMode(MCMode.ENABLE);
		}
	}
	// -----------------------------------------------
	// 理由
	// -----------------------------------------------
	@Override
	public MCList<MCRow> getDtl_rsn_cd(MCRow row, MCEventInfo info) {
		MCList<MCRow> rslt = MCList.create(MCRow.class);
		MAUAP_List lst = (MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		//-----------------------------
		// 仕入・経費仕入・ＶＭＩ仕入の場合
		//-----------------------------
		if (isPurc(dtlR)
			 || MAC_TRD_PTN_TYP.isPURC_VMI(dtlR.trd_ptn_typ())) {
			if (isPurcXpns(dtlR)) {
				// 経費仕入の場合 
				row.setBooleanNE(PurcBizRsnCols.$i_xpns_purc_flg, true);
			}
			else {
				row.setBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg, true);
			}
			rslt = lst.getPurcBizRsn(row, info);
		}
		//-----------------------------
		// 仕入値引の場合
		//-----------------------------
		else if (isPurcDscnt(dtlR)) {
			rslt = lst.getPurcDscntBizRsn(row, info);
		}
		//-----------------------------
		// 仕入返品の場合
		//-----------------------------
		else if (isPurcRtn(dtlR)) {
			if (isPurcXpns(dtlR)) {
				row.setBooleanNE(PurcRtnBizRsnCols.$i_xpns_purc_flg, true); 
			}
			else {
				row.setBooleanNE(PurcBizRsnCols.$i_not_xpns_purc_flg, true);
			}
			rslt = lst.getPurcRtnBizRsn(row, info);
		}
		return rslt;
	}
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
	/**
	 * 操作種別に対応する初期値を設定します。
	 */
	public void setDefValByOpe() {
		// 検索条件の初期値設定
		setCndColDefValByOpe();
	}
	/**
	 * 操作種別に対応する検索条件の初期値を設定します。
	 */
	public void setCndColDefValByOpe() {
		// 検索条件のクリア
		clearCndByDipUnit();
		// 検索種別
		setValueEx(Cnd_purc_flg, true);
		setValueEx(Cnd_ret_flg, true);
		setValueEx(Cnd_dscnt_flg, true);
		// インボイス取引対象
		setValueEx(Cnd_iv_trgt_flg, true);
		setValueEx(Cnd_iv_not_trgt_flg, true);
		// 単価
		setValueEx(Cnd_upri_flg, true);
		setValueEx(Cnd_interim_flg, true);
		// 下請
		setValueEx(Cnd_subcon_flg, true);
		setValueEx(Cnd_not_subcon_flg, true);
		// 無効・取消含む
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_dis_can_disp_flg, false);
			setValueEx(Cnd_sign_rev_flg, false);
			setValueEx(Cnd_incl_temp_ap_flg, false);
		}
		setValueEx(Cnd_inc_past_flg, false);
	}
	/**
	 * 源泉税額を設定します
	 * @param r
	 */
	protected void setWtaxAmt(DtlR r) {
		if (canEditWtaxRate(r)) {
			if (isNull(r.wtax_rate())) {
				setValueEx(columnDtl_wtax_amt, r.getGUIIndex(), null);
			}
			else {
				MCNumber wtaxAmt = MAUCP_AmtUtil.getTaxAmt(r.trd_cur_amt(),
						r.wtax_rate(), r.trd_cur_amt_dec_place(),
						getCo().wtax_rnd_typ(), MCNumber.ZERO);
				setValueEx(columnDtl_wtax_amt, r.getGUIIndex(), wtaxAmt);
			}
		}
	}
	
	// -----------------------------------------------
	// 値の設定（クリア）
	// -----------------------------------------------
	/**
	 * 検索モードに応じて条件をクリアします
	 */
	protected void clearCndByDipUnit() {
		if (Cnd_disp_unit_Hdr.isSelected()) {
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_in_to_loc_cd, null);
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_tdlv_cd, null);
			setValueEx(Cnd_ap_dpt_cd, null);
			setValueEx(Cnd_gd_cd, null);
			setValueEx(Cnd_maker_cd, null);
			setValueEx(Cnd_sppl_itm_cd, null);
			setValueEx(Cnd_sppl_itm_nm, null);
			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_bp_lot_no, null);
			setValueEx(Cnd_purc_act_d_no, null);
			setValueEx(Cnd_arr_act_no, null);
			setValueEx(Cnd_purc_ret_act_d_no, null);
			setValueEx(Cnd_tax_cd, null);
			setValueEx(Cnd_dtl_trd_d_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			setValueEx(Cnd_in_to_loc_wg_cd, null);
			setValueEx(Cnd_in_to_loc_wg_nm, null);
			setValueEx(Cnd_ap_dpt_nm, null);
			setValueEx(Cnd_rcpt_iv_d_no, null);
			setValueEx(Cnd_po_no, null);
			setValueEx(Cnd_po_d_no, null);
			setValueEx(Cnd_purc_src_typ, null);
			setValueEx(Cnd_purc_src_no, null);
			setValueEx(Cnd_sign_rev_flg, false);
			setValueEx(Cnd_cst_itm_cd, null);
			clearContainers(getCndR().itm_typ_p());
			clearContainers(getCndR().itm_p());
			clearContainers(getCndR().ver_no_p());
			clearContainers(getCndR().sno_p());
			clearContainers(getCndR().itm_grp_p());
		}
		else if (Cnd_disp_unit_Dtl.isSelected()) {
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_edi_bp_dlv_slip_no, null);
			setValueEx(Cnd_arr_act_no, null);
		}
	}
	// -----------------------------------------------
	// リスト取得
	// -----------------------------------------------
	// -----------------------------------------------
	// If
	// -----------------------------------------------
	@Override
	public MCTable<DtlR> getListRegTable() {
		return DtlTable;
	}
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
	}
	// -----------------------------------------------
	// その他
	// -----------------------------------------------
	/**
	 * 操作種別に応じた項目の入力制御と初期値の設定
	 */
	protected void setDispDefaultByOpe() {
		// 一覧クリア
		clearContainers(getDtlL());
		// ステータス設定
		setSrchStatusByOpe();
		// 操作種別による入力制御設定の設定
		setModeByOpe();
		// 操作種別による初期値の設定
		setDefValByOpe();
		// 行ステータスは非表示
		setStatusColumn();
	}
	/**
	 * 対象項目がヘッダ情報であるか判定します
	 * @param column　対象項目
	 * @param flg　true:仕入実績／false:受領インボイス
	 * @return　true:ヘッダ情報／false:ヘッダ情報ではない
	 */
	protected boolean isHdrCol(MCColumnConfig column, boolean flg) {
		if (flg) {
			return isPurcHdrCol(column);
		}
		return isIvHdrCol(column);
	}
	/**
	 * 対象項目が仕入実績ヘッダ情報であるか判定します
	 * @param column　対象項目
	 * @return　true:ヘッダ情報／false:ヘッダ情報ではない
	 */
	protected boolean isPurcHdrCol(MCColumnConfig column) {
		if (column == columnDtl_ac_dt
				|| column == columnDtl_xrate
				|| column == columnDtl_ptax_xrate
				|| column == columnDtl_ptax_dt
				|| column == columnDtl_pay_basis_dt
				|| column == columnDtl_pay_schd_dt
				|| column == columnDtl_trd_rmrks
				|| column == columnDtl_intr_rmrks
				|| column == columnDtl_purc_usr_cd
				|| column == columnDtl_purc_dpt_cd
				|| column == columnDtl_purc_act_sub_char1
				|| column == columnDtl_purc_act_sub_char2
				|| column == columnDtl_purc_act_sub_char3) {
			return true;
		}
		return false;
	}
	/**
	 * 対象項目が受領インボイスヘッダ情報であるか判定します
	 * @param column　対象項目
	 * @return　true:ヘッダ情報／false:ヘッダ情報ではない
	 */
	protected boolean isIvHdrCol(MCColumnConfig column) {
		if (column == columnDtl_ac_dt
				|| column == columnDtl_pay_basis_dt
				|| column == columnDtl_pay_schd_dt
				|| column == columnDtl_xrate
				|| column == columnDtl_ptax_xrate
				|| column == columnDtl_ptax_dt
				|| column == columnDtl_trd_rmrks
				|| column == columnDtl_intr_rmrks
				|| column == columnDtl_purc_act_sub_char1
				|| column == columnDtl_purc_act_sub_char2
				|| column == columnDtl_purc_act_sub_char3) {
			return true;
		}
		return false;
	}
	/**
	 * ヘッダ項目編集可能ＦＬＧの設定
	 * @param list
	 */
	protected void setHdrEditFlg() {
		MCList<DtlR>[] grpL = getDtlL().groupList(DtlR.$rcpt_iv_mng_no);
		for (MCList<DtlR> tmpL : grpL) {
			if (isNull(tmpL.get(0).rcpt_iv_mng_no())) {
				MCList<DtlR>[] purcGrpL = tmpL.groupList(DtlR.$purc_act_no);
				for (MCList<DtlR> purcTmpL : purcGrpL) {
					setHdrEditFlg(purcTmpL);
				}
			}
			else {
				setHdrEditFlg(tmpL);
			}
		}
	}
	protected void setHdrEditFlg(MCList<DtlR> tmpL) {
		tmpL.setBooleanNE(DtlR.$hdr_edit_flg, false);
		tmpL.sort(SortType.ASC, DtlR.$disp_seq);
		// ヘッダ項目は表示順が最小のレコードのみ編集可能
		tmpL.get(0).hdr_edit_flg(true);
	}
	/**
	 * ヘッダ項目が変更された場合、同じヘッダに属する明細の値を変更します
	 * @return
	 */
	protected void copyHdrToDtlColumn(MCColumnConfig column, DtlR srcR) {
		MCList<DtlR> subL = MCList.create(DtlR.class);
		if(isNull(srcR.rcpt_iv_mng_no())) {
			subL = getDtlL().subList(DtlR.$purc_act_no, srcR.purc_act_no());
		}
		else {
			subL = getDtlL().subList(DtlR.$rcpt_iv_mng_no, srcR.rcpt_iv_mng_no());
		}
		
		for (DtlR r : subL) {
			if (isSame(r.getGUIIndex(), srcR.getGUIIndex())) {
				continue;
			}
			setValueEx(column, r.getGUIIndex(), column.getValue(srcR.getGUIIndex()));
		}
	}
	/**
	 * 経費購買（経費返品）であるかを判定します
	 * @param dtlR
	 */
	protected boolean isPurcXpns(DtlR dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	
	/**
	 * 行ステータスを非表示にします
	 */
	protected void setStatusColumn() {
		DtlTable.setStatusColumnVisible(true);
	}
	/**
	 * 仕入伝票か否かを判定します
	 */
	protected boolean isPurc(DtlR r) {
		if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
			return true;
		}
		else {
			return false;	
		}
	}
	/**
	 * 仕入返品伝票か否かを判定します
	 */
	protected boolean isPurcRtn(DtlR r) {
		if (MAC_TRD_PTN_TYP.isPURC_RTN(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(r.trd_ptn_typ())) {
			return true;
		}
		else {
			return false;	
		}
	}
	/**
	 * 仕入値引伝票か否かを判定します
	 */
	protected boolean isPurcDscnt(DtlR r) {
		if (MAC_TRD_PTN_TYP.isPURC_DSCNT(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XTRA(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(r.trd_ptn_typ())) {
			return true;
		}
		else {
			return false;	
		}
	}
	/**
	 * 受領インボイス対象か否かを判定します。
	 * @return
	 */
	protected boolean isRcptIv (DtlR r) {
		if (r.sppl_iv_flg() && (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))) {
			return true;
		}
		return false;
	}
	
	/**
	 * 単価取得対象か否かを判定します。
	 * @return
	 */
	protected boolean isTrgtGetUpri(DtlR r) {
		if (isPurcDscnt(r)) {
			// 仕入値引伝票の場合は常に対象外
			return false;
		}
		if (isNullOr(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				, r.sppl_cd(), r.maker_cd()
				, r.base_trd_unit_cd(), r.base_trd_unit_qty()
				, r.base_trd_cur_cd()
				, r.base_in_to_loc_wg_cd(), r.base_in_to_loc_cd()
				, r.base_dt()
				)) {
			// 単価取得キー項目がnullの場合は対象外
			return false;
		}
		// 発注時と仕入時で単位が異なる場合、異なる単位の単価が取得されてしまうので対象外
		if (!isSame(r.base_trd_unit_cd(), r.trd_unit_cd())) {
			return false;
		}
		
		if (isPurcRtn(r)) {
			if (isOutSrc(r)) {
				if (isNullOr(r.mfg_inst_no())) {
					// 仕入返品の外注の場合、製造指図ＮＯが必要
					return false;
				}
			}
		}
		else {
			if (isOutSrc(r)) {
				if (isNullOr(r.mfg_loc_cd(), r.bom_ptn(), r.outsrc_itm_ord_no(), r.rqst_avl_rqst_dt())) {
					// 仕入の場合、場所などの情報が必要(外注品を計画外仕入することはない)
					return false;
				}
			}
		}
		
		if (isRcptIv(r)) {
			return false;
		}
		return true;
	}
	/**
	 * 対象が外注品であるか否かを判定します
	 * @return
	 */
	protected boolean isOutSrc(DtlR r) {
		if (MAC_PURC_TYP.isOUTSRC_ITM_FFR(r.purc_typ())
				|| MAC_PURC_TYP.isOUTSRC_ITM_ONR_SS(r.purc_typ())) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(DtlR dtlR) {
		String trdCurCd = dtlR.trd_cur_cd();
		String baseCurCd = dtlR.base_cur_cd();
		String ptaxCurCd = dtlR.ptax_cur_cd();
		if (isSame(trdCurCd, baseCurCd)
				&& (isSame(trdCurCd, ptaxCurCd) || isNull(ptaxCurCd))) {
			return true;
		}
		else {
			return false;
		}
	}

}