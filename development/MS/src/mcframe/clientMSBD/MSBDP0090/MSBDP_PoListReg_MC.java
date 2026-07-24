package mcframe.clientMSBD.MSBDP0090;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
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
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.io.MCCsvBinaryReader;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PoListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PoListReg_MC extends MSBDP_PoListReg_MC_A implements IfListRegPanel, MCResultViewerWithFile {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	MCIndexKey _dtlKey;
	/** 共通枠の発注日を変更したか */
	protected boolean _isBulkSetPoDt = false;
	/** 発注日変更時のサーバ処理対象行*/
	protected MCList<DtlR> _poDtChgL = MCList.create(DtlR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoListReg_MC() {
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
	public MSBDP_PoListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0090_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Upd01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0090_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void moveFocus() {
			DtlTable.selectLeftmostColumn(0);
			setBtnMode(DtlTable.getSelectedMCRow());
			super.moveFocus();
		}
	}


	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0090_Upd01();
	}
	/**
	 * [MS_MSBDL0090_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Prnt01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0090_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Btn_prnt_po_flg, Btn_prnt_dlv_flg, Btn_prnt_purc_ddlv_dlv_flg));
		}
	}


	/**
	 * [MS_MSBDL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Srch01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0090_Srch01Caller(P p, B b) {
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
			msgList.addAll(cmnChkCnd());
		}

		@Override
		protected void show() {
			super.show();
			_dtlKey = getDtlL().createIndex(DtlR.$po_no);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatusByOpe();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}
	/**
	 * [MS_MSBDL0090_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Srch02Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0090_Srch02Caller(P p, B b) {
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
			msgList.addAll(cmnChkCnd());
		}

		@Override
		protected void show() {
			super.show();
			_dtlKey = getDtlL().createIndex(DtlR.$po_no);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatusByOpe();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

	}
	/**
	 * [MS_MSBDL0090_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Sprt01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0090_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			String sysParm = getSysParm("MASTER_DT_BASE");
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				if (isSame(sysParm, "1")) {
					msgList.addAll(panel.checkReq(r.getGUIIndex()
					, columnDtl_itm_cd
					, columnDtl_itm_sub1
					, columnDtl_itm_sub2
					, columnDtl_itm_sub3
					, columnDtl_in_to_loc_cd
					, columnDtl_po_dt
					, columnDtl_rqst_avl_rqst_dt));
				} else {
					msgList.addAll(panel.checkReq(r.getGUIIndex()
					, columnDtl_itm_cd
					, columnDtl_itm_sub1
					, columnDtl_itm_sub2
					, columnDtl_itm_sub3
					, columnDtl_in_to_loc_cd
					, columnDtl_po_dt));
				}
			}
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0016);
		}
		
		@Override
		protected void show() {
			super.show();
			MCList<DtlR> subL =  getDtlL().subList(DtlR.$check, true);
			for (DtlR r : subL) {
				// 金額クリア
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_dscnt_amt, r.getGUIIndex(), null);
				setValueEx(columnDtl_dscnt_rsn_cd, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_upri_not_tgt_flg, r.getGUIIndex(), false);
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), false);
				
				// 税や為替レートはサーバでどの場合も置き換えているため、指定FLGは外す
				r.tax_fix_flg(false);
				r.xrate_inpt_flg(false);
				r.ptax_xrate_inpt_flg(false);
				
				// 購買識別区分により、各カラムを設定
				// （リストロジックによりマスタを参照するような処理は、サーバ側ですべて設定済のため、画面ではイベントを起こさない。
				// 計算のみイベントを起こして、関連項目に算出結果を設定する
				if (!isMatchPurcIdTyp(r, r.purc_id_typ())) {
					// マスタ引きした購買識別区分の初期値が今回の伝票に合わない場合
					r.purc_id_typ(null);
					r.purc_id_typ_nm(null);
				}
				else if (isNonPurc(r)) {
					// VMIまたは無償受給の場合
					r.purc_schd_dt(null);
					r.purc_upri_req_typ(null);
					r.purc_upri_req_typ_nm(null);
					r.pay_crryovr_times(null);
					setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), null);
					setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
					r.tax_cd(null);
					r.tax_nm(null);
					r.tax_fix_flg(false);
					r.tax_rate(null);
					r.tax_typ(null);
					r.inc_tax_flg(false);
					setValueEx(columnDtl_wtax_rate, r.getGUIIndex(), null);
					Dtl_bditm_p_PPanel.clearBdItem(r.getGUIIndex());
				}
				
				// 同時計上FLG
				setSyncFlg(r);
				
				// 価格印字FLG
				setPriPrntFlg(r);
				
				setRqstDlvRqstDt(r);
			}
		}
	}

	/**
	 * [MS_MSBDL0090_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Sprt02Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;
		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0090_Sprt02Caller(P p, B b) {
			super(p, b);
		}
		/**
		 * 更新ボタンイベントからの呼び出しかどうかを設定する。
		 */
		protected void setUpdBtnEventFlg(boolean updBtnEventFlg) {
			_upd_btn_event_flg = updBtnEventFlg;
		}
		/**
		 * 続行不可能かどうかを返す。
		 */
		protected boolean getErrorFlg() {
			return _error_flg;
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			_tgtList = getSprtTgtDtlL();
			
			//更新ボタンイベントのときは同期にする
			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
		}

		@Override
		protected MCMessage msgExecConfirm() {
			//単価再取得ボタンイベントのときは確認メッセージを表示
		if (!_upd_btn_event_flg) {
				return new MCMessage(MSBDP0014);
			}
			return null;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			//単価再取得ボタンイベントのときは必要に応じてメッセージを表示
			if (!_upd_btn_event_flg) {
				if (_tgtList.isEmpty()) {
					msgList.add(new MCMessage(MSBDP0013));
				}
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 必須チェック
			msgList.addAll(MSUCP_PurcUtil.chkForUpriExptDt(
					panel
					, _tgtList
					, columnDtl_sppl_cd
					, columnDtl_trd_cur_cd
					, columnDtl_in_to_loc_wg_cd 
					, columnDtl_itm_cd
					, columnDtl_itm_sub1
					, columnDtl_itm_sub2
					, columnDtl_itm_sub3
					, columnDtl_trd_unit_cd
					, columnDtl_trd_unit_qty
					, columnDtl_base_unit_qty));
			//　単価取得に最低限必要な必須チェックのみ実施する
			_tgtList.forEach(r -> {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_in_to_loc_cd));
				// 購買単価取得区分
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_purc_upri_req_typ));
				
				// 購買単価取得区分にあわせた基準日を必須とする。
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_po_dt));
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_dlv_rqst_dt));
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_purc_schd_dt));
				}
				// 外注の場合は製造場所、依頼元納入希望日も必須とする。
				if ((boolean)columnDtl_outsrc_flg.getValue(r.getGUIIndex())) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_mfg_loc_cd, columnDtl_tax_cd, columnDtl_bom_ptn));
					String sysParm = getSysParm("MASTER_DT_BASE");
					if (!isSame(sysParm, "1")) {
						if (!MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_po_dt));
						}
					}
					if (!MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_dlv_rqst_dt));
					}
				}
			});
			if (!msgList.isEmpty()) {
				_error_flg = true;
			}
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<DtlR> upL = MCList.create(DtlR.class);
			for (DtlR r : _tgtList) {
				if (!r.check()) {
					continue;
				}
				if (!r.upri_not_tgt_flg()) {
					if(MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())){
						r.base_dt(r.po_dt());
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(r.purc_upri_req_typ())) {
						r.base_dt(r.dlv_rqst_dt());
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(r.purc_upri_req_typ())) {
						r.base_dt(r.purc_schd_dt());
					}
					upL.add(r);
				}
			}
			bridge.up0().setAll(upL);
		}
		@Override
		protected void show() {
			//Ins01,Upd01用に変更前の値をキャッシュ
			_tgtList.forEach(dr -> cacheUpri(dr));
			super.show();
			//単価イベントを実行
			MCMessageList msgL = new MCMessageList();
			_tgtList.forEach(dr -> {
				doUpriEvent(dr, msgL);	
			});
			if (!msgL.isEmpty()) {
				_error_flg = true;
				message(msgL);
			}
		}
	}

	/**
	 * [MS_MSBDL0090_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Sprt03Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0090_Sprt03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0015);
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getTrgtList());
		}
		
		@Override
		protected void show() {
			super.show();
			for (DtlR r : bridge.down0()) {
				if (!r.isEmpty()) {
					// 値の退避
					String inToLocCd = r.in_to_loc_cd();
					String strLnCd = r.str_ln_cd();
					// イベントを発生させるために一度クリアする
					setValueEx(columnDtl_in_to_loc_cd, r.getGUIIndex(), null);
					setValueEx(columnDtl_str_ln_cd, r.getGUIIndex(), null);
					// イベントを発生させる
					setValueEx(columnDtl_in_to_loc_cd, r.getGUIIndex(), inToLocCd);
					if (isNull(strLnCd)) {
						setValueEx(columnDtl_str_ln_cd_none_flg, r.getGUIIndex(), true);	
					}
					else {
						setValueEx(columnDtl_str_ln_cd_none_flg, r.getGUIIndex(), false);
						setValueEx(columnDtl_str_ln_cd, r.getGUIIndex(), strLnCd);
					}
				}
			}
		}
		protected MCList<DtlR> getTrgtList() {
			MCList<DtlR> upL = MCList.create(DtlR.class);
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				if (r.check() 
						&& isPurcDdlv(r)) {
					upL.add(r);
				}
			}
			return upL;
		}
	}
	/**
	 * [MS_MSBDL0090_Sprt04]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Sprt04Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Sprt04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0090_Sprt04Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		
		@Override
		protected void addProgressPanel() {
			// 画面イベントと同等になるようプログレスダイアログを表示しない
		}
		
		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			// 対象データがない場合にメッセージを出さない
			return true;
		}
		
		@Override
		protected boolean checkForCall() {
			// 対象データがない場合は通信しない
			if (getTrgtList().isEmpty()) {
				return false;
			}
			return super.checkForCall();
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getTrgtList());
		}
		
		@Override
		protected void show() {
			setGUIIndexAtDownParam();
			for (DtlR downR : bridge.down0()) {
				
				DtlR dtlR = getDtlL().get(downR.getGUIIndex());
				
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(dtlR.purc_upri_req_typ())) {
					// 税コード
					if (!dtlR.tax_fix_flg()) {
						if (!panel.isNonPurc(dtlR)) {
							setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), downR.tax_cd());
						}
					}
						
					// 源泉税率
					if (canEditWtaxRate(dtlR)) {
						setValueEx(columnDtl_wtax_rate, dtlR.getGUIIndex(), downR.wtax_rate());
					}
					else {
						clearWtaxRate(dtlR);
					}
				}
				// 債務部門
				if(!isNull(downR.ap_dpt_cd())) {
					setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), downR.ap_dpt_cd());
				}
				else {
					if(dtlR.ap_dpt_flg()) {
						setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), dtlR.purc_dpt_cd());
					}
					else {
						setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), null);
					}
				}
				// 発注先品目
				setValueEx(columnDtl_sppl_itm_cd, dtlR.getGUIIndex(), downR.sppl_itm_cd());
				setValueEx(columnDtl_sppl_itm_nm, dtlR.getGUIIndex(), downR.sppl_itm_nm());
				// 仕入計上区分
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), downR.purc_basis_typ());
				// 購買識別区分
				// 資産管理対象外品、かつ購買識別区分がnullの場合は購買識別区分を設定しない
				if (!MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) || !isNull(downR.purc_id_typ())) {
					if (isMatchPurcIdTyp(dtlR, downR.purc_id_typ())) {
						setValueEx(columnDtl_purc_id_typ, dtlR.getGUIIndex(), downR.purc_id_typ());
					}
				}
			}
		}
		protected MCList<DtlR> getTrgtList() {
			return _poDtChgL;
		}

	}
	/**
	 * [MS_MSBDL0090_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Imp01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBDL0090_Imp01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();

			if (getBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();

			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<BulkSetR> bulkSetL = MCList.create(BulkSetR.class);
			bulkSetL.add(getBulkSetR());
			containers.add(bulkSetL);

			// 明細
			containers.add(getDtlL());

			return csvOutFromContainer(containers);
		}
		@Override
		protected void setMode() {
			super.setMode();
			if (isAsync()) {
				setFIX_IStatus();
			}
			else if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.check(true);
			}
		}
		
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(DtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void show() {
			super.show();
			for (DtlR downR : bridge.down0()) {
				downR.sppl_repurc_obli_flg(downR.repurc_obli_flg());
				downR.sppl_outsrc_upri_typ(downR.outsrc_upri_typ());
			}
		}

		@Override
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
		
		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_IStatus();
		}
	}
	@Override
	public String getResultViewParamID(MCResultInfo info) {
		return null;
	}

	@Override
	public boolean notificationSetResultViewParam(MCCallerPanelBridge bridge, MCBinary... files) {
		boolean result = false;

		if (!(bridge instanceof MS_MSBDL0090_Imp01Bridge) && !(bridge instanceof MS_MSBDL0090_Ins01Bridge)) {
			return result;
		}

		if (files == null || files.length < 3) {
			return result;
		}

		MCMessageList errMsgL = new MCMessageList();

		// 検索条件
		MCCsvBinaryReader<CndR> cndReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(CndR.class), files[0]);
		errMsgL.addAll(cndReader.read());

		// 一括設定
		MCCsvBinaryReader<BulkSetR> bulkSetReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(BulkSetR.class), files[1]);
		errMsgL.addAll(bulkSetReader.read());

		// 明細
		MCCsvBinaryReader<DtlR> dtlReader = 
				MCCsvBinaryReader.createCsvBinaryReader(MCList.create(DtlR.class), files[2]);
		errMsgL.addAll(dtlReader.read());

		if (errMsgL.isEmpty()) {
			if (bridge instanceof MS_MSBDL0090_Imp01Bridge) {
				openByAsyncRslt((MS_MSBDL0090_Imp01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								bulkSetReader.getDestFirstRow(), 
								dtlReader.getDestList());
			}
			else if (bridge instanceof MS_MSBDL0090_Ins01Bridge) {
				openByAsyncRslt((MS_MSBDL0090_Ins01Bridge) bridge,
								cndReader.getDestFirstRow(), 
								bulkSetReader.getDestFirstRow(), 
								dtlReader.getDestList());
			}
		}
		else {
			message(errMsgL);
		}

		return result;
	}

	/***
	 * 画面起動（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param bulkSetR 一括設定枠コンテナ
	 * @param dtlFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBDL0090_Imp01Bridge bridge, 
			CndR cndR, BulkSetR bulkSetR, MCList<DtlR> dtlFileL) {
		openPanel(getModuleID(), getScreenID(), T1, null, bridge, cndR, bulkSetR, dtlFileL);
	}

	/***
	 * 画面起動（登録オペレーション非同期実行用）
	 * 
	 * @param bridge ファイル入力オペレーションBridge
	 * @param cndR 検索枠コンテナ
	 * @param bulkSetR 一括設定枠コンテナ
	 * @param dtlFileL 一覧枠コンテナリスト
	 */
	protected void openByAsyncRslt(MS_MSBDL0090_Ins01Bridge bridge, 
			CndR cndR, BulkSetR bulkSetR, MCList<DtlR> dtlFileL) {
		openPanel(getModuleID(), getScreenID(), T2, null, bridge, cndR, bulkSetR, dtlFileL);
	}

	/*** 画面起動時のfillSpaceをスキップするか */
	protected boolean _isSkipFillSpaceForOpen = false;

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			screenClear();

			MS_MSBDL0090_Imp01Bridge b = (MS_MSBDL0090_Imp01Bridge) args[0];
			restoreContainerBfrImp(b.down0(), args);

			if(getParamEx(b) == null) {
				MS_MSBDL0090_Imp01Caller<MSBDP_PoListReg, MS_MSBDL0090_Imp01Bridge> caller = createMS_MSBDL0090_Imp01();
				restoreCallerBfrImp(caller, b);
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}

			_isSkipFillSpaceForOpen = true;
		}
		else if (T2 == openTyp) {
			screenClear();

			MS_MSBDL0090_Ins01Bridge b = (MS_MSBDL0090_Ins01Bridge) args[0];
			restoreContainerBfrIns(b.down0(), args);

			if(getParamEx(b) == null) {
				MS_MSBDL0090_Ins01Caller<MSBDP_PoListReg, MS_MSBDL0090_Ins01Bridge> caller = createMS_MSBDL0090_Ins01();
				restoreCallerBfrIns(caller, b);
				setStatusForNoCheckR(getDtlL());
				_isSkipStatusClear = true;
			}
			else {
				setStatusForAsyncEx();
			}

			_isSkipFillSpaceForOpen = true;
		}
	}

	/***
	 * 未チェック行ステータス設定
	 * 
	 * @param dtlL 明細リスト
	 */
	protected void setStatusForNoCheckR(MCList<DtlR> dtlL) {
		for (DtlR dtlR : dtlL) {
			if (dtlR.upd_tgt_flg()) {
				continue;
			}

			if (dtlR.create_tgt_flg()) {
				dtlR.setStatus(Status.CREATE);
			}
			else if (dtlR.modify_tgt_flg()) {
				dtlR.setStatus(Status.MODIFY);
			}
			else {
				dtlR.setStatus(Status.GUICREATE);
			}

			dtlR.check(false);
		}
	}

	@Override
	protected void afterOpenByInitParam(String openTyp, MCRow bind, Object... args) {
		super.afterOpenByInitParam(openTyp, bind, args);

		if (T1 == openTyp) {
			MS_MSBDL0090_Imp01Bridge b = (MS_MSBDL0090_Imp01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
		else if (T2 == openTyp) {
			MS_MSBDL0090_Ins01Bridge b = (MS_MSBDL0090_Ins01Bridge) args[0];
			MCException ex = getParamEx(b);

			if (ex != null) {
				dialog(ex);
			}
			else if (_asyncResultMsg != null) {
				dialog(_asyncResultMsg);
				_asyncResultMsg = null;
			}
		}
	}

	/*** ステータスクリア処理をスキップするか */
	protected boolean _isSkipStatusClear = false;

	@Override
	public void statusClear() {
		// 非同期実行の結果確認時に下り電文から復元した行ステータスがクリアされないようにするために必要な処理。
		if (!_isSkipStatusClear) {
			super.statusClear();
		}

		// 実行後は、スキップ要否を元に戻しておく
		_isSkipStatusClear = false;
	}

	/***
	 * コンテナ値設定（ファイル入力オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainerBfrImp(MCList<DtlR> downL, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 一括設定
		BulkSetR bulkSetR = (BulkSetR) args[2];
		BulkSetR.copyvalue(getBulkSetR(), bulkSetR);

		// 明細
		MCList<DtlR> rsltL = (MCList<DtlR>) args[3];
		getDtlL().setAll(rsltL);
		setRowIndexForUp(rsltL, 0);
		_dtlKey = getDtlL().createIndex(DtlR.$po_no);

		// ボタン
		getBtnR().prnt_po_flg(false);
		getBtnR().prnt_dlv_flg(false);
		getBtnR().prnt_purc_ddlv_dlv_flg(false);
	}

	/***
	 * コンテナ値設定（登録オペレーション非同期実行用）
	 * 
	 * @param downL 下り電文リスト
	 * @param args 画面起動引数
	 */
	protected void restoreContainerBfrIns(MCList<DtlR> downL, Object... args) {
		// 検索条件
		CndR srcCndR = (CndR) args[1];
		CndR.copyvalue(getCndR(), srcCndR);

		// 一括設定
		BulkSetR bulkSetR = (BulkSetR) args[2];
		BulkSetR.copyvalue(getBulkSetR(), bulkSetR);

		// 明細
		MCList<DtlR> rsltL = (MCList<DtlR>) args[3];
		getDtlL().setAll(rsltL);
		setRowIndexForUp(rsltL, 1);
		_dtlKey = getDtlL().createIndex(DtlR.$po_no);

		// ボタン
		getBtnR().prnt_po_flg(false);
		getBtnR().prnt_dlv_flg(false);
		getBtnR().prnt_purc_ddlv_dlv_flg(false);
	}

	/*** 非同期実行終了メッセージ */
	protected MCMessage _asyncResultMsg = null;

	/***
	 * ファイル入力オペレーション通信後処理実行
	 * 
	 * @param caller ファイル入力オペレーションCaller
	 * @param b ファイル入力オペレーションBridge
	 */
	protected void restoreCallerBfrImp(
			MS_MSBDL0090_Imp01Caller<MSBDP_PoListReg, MS_MSBDL0090_Imp01Bridge> caller,
			MS_MSBDL0090_Imp01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b));
	}

	/***
	 * 登録オペレーション通信後処理実行
	 * 
	 * @param caller 登録オペレーションCaller
	 * @param b 登録オペレーションBridge
	 */
	protected void restoreCallerBfrIns(
			MS_MSBDL0090_Ins01Caller<MSBDP_PoListReg, MS_MSBDL0090_Ins01Bridge> caller,
			MS_MSBDL0090_Ins01Bridge b) {
		List<MCContainer> downBlocks = new ArrayList<MCContainer>();
		downBlocks.add(b.down0());

		_asyncResultMsg = caller.dispAsyncRslt(downBlocks, getParamMsg(b));
	}

	/***
	 * 上り電文用INDEX設定
	 * 
	 * @param srcL CSVファイル取込データ
	 * @param paramIndex paramｲﾝデックス
	 * @return 上り電文0リスト
	 */
	protected MCList<DtlR> setRowIndexForUp(MCList<DtlR> srcL, int paramIndex) {
		MCList<DtlR> tgtL = srcL.subList(DtlR.$check, true);

		// paramIndexとparamRowIndexを設定
		srcL.setParamIndex(paramIndex);
		for (int i = 0; i < tgtL.size(); i++) {
			DtlR r = tgtL.get(i);
			r.setParamIndex(paramIndex);
			r.setParamRowIndex(i);
		}

		return tgtL;
	}

	/***
	 * ファイル入力オペレーションBridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBDL0090_Imp01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
	    }

	    return result;
	}

	/***
	 * 登録オペレーションBridgeから例外取得
	 * 
	 * @param b Bridge
	 * @return 発生例外
	 */
	protected MCException getParamEx(MS_MSBDL0090_Ins01Bridge b) {
		MCException result = null;

		if (!b.param().getExceptionParam().isEmpty()) {
			result = b.param().getExceptionParam().getException();
		}

		return result;
	}

	/***
	 * ファイル入力オペレーションBridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBDL0090_Imp01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 登録オペレーションBridgeからメッセ―ジ取得
	 * 
	 * @param b Bridge
	 * @return メッセージリスト
	 */
	protected MCMessageList getParamMsg(MS_MSBDL0090_Ins01Bridge b) {
		MCMessageList result = null;

		if (!b.param().getMessageParam().isEmpty()) {
			result = b.param().getMessageParam().getMessage();
		}

		return result;
	}

	/***
	 * 非同期実行例外発生時のステータス設定
	 * 
	 */
	protected void setStatusForAsyncEx() {
		setFIX_IStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	/**
	 * [MS_MSBDL0090_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Ins01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0090_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (getBulkSetR().async_flg()) {
				setAsync(true);
				setCsvOutForAsync(true);
				// 非同期実行結果復元時のステータス設定用に、実行前の行ステータスを保持。
				setStatusFlg(getDtlL());
			}
			else {
				setPrint(true);
			}
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtlL();
		}
		/***
		 * ステータスＦＬＧ設定
		 * 
		 * @param dtlL 明細リスト
		 */
		protected void setStatusFlg(MCList<DtlR> dtlL) {
			for (DtlR dtlR : dtlL) {
				if (dtlR.upd_tgt_flg()) {
					dtlR.upd_tgt_flg(false);
				}
				dtlR.create_tgt_flg(false);
				dtlR.modify_tgt_flg(false);

				if (dtlR.check()) {
					dtlR.upd_tgt_flg(true);
				}

				if (dtlR.isStatusCreate()) {
					dtlR.create_tgt_flg(true);
				}
				else if (dtlR.isStatusModify()) {
					dtlR.modify_tgt_flg(true);
				}
			}
		}

		@Override
		protected boolean csvOutForAsync() {
			super.csvOutForAsync();

			List<MCList<?>> containers = new ArrayList<MCList<?>>();

			// 検索条件
			MCList<CndR> cndL = MCList.create(CndR.class);
			cndL.add(getCndR());
			containers.add(cndL);

			// 一括設定
			MCList<BulkSetR> bulkSetL = MCList.create(BulkSetR.class);
			bulkSetL.add(getBulkSetR());
			containers.add(bulkSetL);

			// 明細
			containers.add(getDtlL());

			return csvOutFromContainer(containers);
		}

		@Override
		protected void setMode() {
			super.setMode();

			if (isAsyncRsltMode()) {
				Ctrl_ctrl_PPanel.expand(false);
			}
			else if (isAsync()) {
				setFIX_IStatus();
			}
		}
		
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			for (DtlR r : getDtlL().subList(DtlR.$check, true)) {
				msgList.addAll(cmnChkDtl(r));
			}
		}
		
		@Override
		protected boolean confirmForCall() {
			if (hasErr()) {
				// エラーが起きた場合何もしない
				return false;
			}
			else {
				// 単価取得結果を反映させない場合は元の単価に戻す
				boolean confirmRslt = super.confirmForCall();
				if (_upriChngMsgList.size() > 0 && !confirmRslt) {
					_tgtList.forEach(dr ->	restoreUpri(dr));
				}
				return confirmRslt;
			}
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 単価変更チェック
			_tgtList.forEach(dr ->	
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
						
			msgList.addAll(_upriChngMsgList);
			
			// 場所変更チェック
			msgList.addAll(confirmLocChg());
		}
		
		@Override
		protected void moveFocus() {
			DtlTable.selectLeftmostColumn(0);
			setBtnMode(DtlTable.getSelectedMCRow());
			super.moveFocus();
		}

	}

	/**
	 * [MS_MSBDL0090_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0090_Del01Caller<P extends MSBDP_PoListReg, B extends MS_MSBDL0090_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0090_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			MCList<Dtl2R> list = MCList.create(Dtl2R.class);
			
			MCList<DtlR> hdrL = bridge.up1().groupBy(DtlR.$po_no);
			MCIndexKey idx = bridge.up2().createIndex(Dtl2R.$po_no); 
			for (DtlR dtlR : hdrL) {
				// 伝票に対応する行をすべて上らせる(排他制御のため)
				list.addAll(bridge.up2().subList(idx, dtlR.po_no()));
			}
			// ヘッダ単位の取消なら伝票取消する。
			if (Cnd_disp_unit_Hdr.isSelected()) {
				bridge.up1().setBooleanNE(DtlR.$slip_del_flg, true);
			}
			bridge.up2().setAll(list);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (DtlR dtlR : getDtlL().subList(DtlR.$check, true)) {
				if (editablePoCrctRsn(dtlR) && dtlR.subcon_flg()) {
					msgList.addAll(panel.checkReq(dtlR.getGUIIndex(), columnDtl_crct_rsn_cd));
				}
			}
		}
		
		
		@Override
		protected void moveFocus() {
			DtlTable.selectLeftmostColumn(0);
			setBtnMode(DtlTable.getSelectedMCRow());
			super.moveFocus();
		}
		
	}
	// -----------------------------------------------
	// チェック処理
	// -----------------------------------------------
	protected MCMessageList cmnChkCnd() {
		MCMessageList msgList = new MCMessageList();
		msgList.addAll(checkBeforeAfter(Cnd_po_schd_dt_fr, Cnd_po_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_po_dt_fr, Cnd_po_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_po_conf_rcpt_dt_fr, Cnd_po_conf_rcpt_dt_to));
		if (!Cnd_ope_INS.isSelected() && !Cnd_ope_BNDL.isSelected()) {
			msgList.addAll(checkAtLeastOne(PoAprvStsPanel));
			msgList.addAll(checkAtLeastOne(EdiTrgtPanel));
			msgList.addAll(checkAtLeastOne(PoPrntPanel));
			msgList.addAll(checkAtLeastOne(PurcIFTgtPanel));
			msgList.addAll(checkAtLeastOne(DlvPrntPanel));
			msgList.addAll(checkAtLeastOne(PurcDdlvDlvPrntPanel));
		}
		else {
			msgList.addAll(checkAtLeastOne(EdiTrgtPanel));
		}
		if (Cnd_disp_unit_Dtl.isSelected()) {
			msgList.addAll(checkAtLeastOne(SundryPanel));
			if (Cnd_ope_REF.isSelected()) {
				msgList.addAll(checkAtLeastOne(ArrPanel));
				msgList.addAll(checkAtLeastOne(PurcPanel));
			}
		}
		msgList.addAll(checkAtLeastOne(IvTrgtPanel));
		return msgList;
	}
	
	protected MCMessageList cmnChkDtl(DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		
		if (dtlR.subcon_flg() 
				&& !isNonPurc(dtlR)
				&& (isNullOr(dtlR.dlv_rqst_dt(), dtlR.purc_schd_dt())
						|| !dtlR.dlv_rqst_dt().eqDate(dtlR.purc_schd_dt()))) {
			msgL.add(new MCMessage(dtlR, DtlR.$dlv_rqst_dt, MSBDP0001, toDispGUIIndex(dtlR)));
		}
		msgL.addAll(checkAfterToday(columnDtl_upd_po_print_schd_dt, dtlR));
		msgL.addAll(checkBeforeAfter(columnDtl_po_dt, columnDtl_dlv_rqst_dt, dtlR));
		msgL.addAll(checkBeforeAfter(columnDtl_po_dt, columnDtl_purc_schd_dt, dtlR));
		msgL.addAll(checkPositive(dtlR, columnDtl_trd_unit_qty));
		
		return msgL;
	}
	/**
	 * 納入場所変更チェック
	 * @return
	 */
	protected MCMessageList confirmLocChg() {
		MCMessageList msgList = new MCMessageList();
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!r.check()) {
				continue;
			}
			if (!isNull(r.bef_in_to_loc_wg_cd()) && !isSame(r.in_to_loc_wg_cd(), r.bef_in_to_loc_wg_cd())) {
				msgList.add(new MCMessage(r, DtlR.$in_to_loc_cd, MSBDP0006,r.bef_in_to_loc_wg_cd(), r.in_to_loc_wg_cd(),  toDispGUIIndex(r)));
			}
			if (!isNull(r.bef_lg_grp_cd()) && !isSame(r.lg_grp_cd(), r.bef_lg_grp_cd())) {
				msgList.add(new MCMessage(r, DtlR.$in_to_loc_cd, MSBDP0018, r.bef_lg_grp_cd(), r.lg_grp_cd(), toDispGUIIndex(r)));
			}
			if (!isNull(r.bef_loc_grp_cd()) && !isSame(r.loc_grp_cd(), r.bef_loc_grp_cd())) {
				msgList.add(new MCMessage(r, DtlR.$in_to_loc_cd, MSBDP0019, r.bef_loc_grp_cd(), r.loc_grp_cd(), toDispGUIIndex(r)));
			}
		}
		return msgList;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0080(MCEventInfo info) {
		// 発注登録画面へ遷移する
		if (Cnd_ope_BNDL.isSelected()) {
			MCList<DtlR> subL = getDtlL().subList(DtlR.$check, true);
			if (subL.size() == 0) {
				dialog(msgNoSelectedRow());
				return;
			}
			else {
				DtlR dtlR = subL.get(0);
				for (DtlR r : subL) {
					if (!isHdrSameCol(dtlR, r)) {
						dialog(new MCMessage(MSBDP0004));
						return;
					}
				}
			}
			openMSBD0080ForBndl(info);
		}
		else {
			openMSBD0080(info);
		}
		

	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0120(MCEventInfo info) {
		// 納期調整登録画面へ遷移する
		openMSBD0120(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0140(MCEventInfo info) {
		// 仕入実績登録画面へ遷移する
		openMSBD0140(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1360]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1360(MCEventInfo info) {
		// 仕入直送売上登録画面へ遷移する
		openMSBBP1360(info);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0250(MCEventInfo info) {
		openMSBDP0250(info);
	}
	/**
	 * Panel[Btn]のボタン[srch_schd_dt]の押下時の処理
	 */
	@Override
	public void doBtn_srch_schd_dt(MCEventInfo info) {
		callMS_MSBDL0090_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[srch_upri]の押下時の処理
	 */
	@Override
	public void doBtn_srch_upri(MCEventInfo info) {
		callMS_MSBDL0090_Sprt02();
	}
	/**
	 * Panel[Btn]のボタン[srch_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_srch_dlv(MCEventInfo info) {
		callMS_MSBDL0090_Sprt03();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0090_Prnt01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			callMS_MSBDL0090_Srch02();
		}
		else {
			callMS_MSBDL0090_Srch01();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			createMS_MSBDL0090_Srch02().execDL();
		}
		else {
			createMS_MSBDL0090_Srch01().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		try {
			_isBulkSetPoDt = true;
			doSelectAll(DtlTable);
			setPoDtChgL(null);
			callMS_MSBDL0090_Sprt04();
		}
		finally {
			_isBulkSetPoDt = false;
			getDtlL().setBoolean(DtlR.$po_dt_chg_flg, false);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);
		if (!isNull(dtlR)) {
			clearNotCopyCol(dtlR.getGUIIndex());
		}
		setBtnMode(dtlR);
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0090_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0090_Del01();
	}
	
	// -----------------------------------------------
	// 画面遷移(発注)
	// -----------------------------------------------
	/**
	 * 発注登録画面へ遷移します。（複数予定を同一伝票にまとめるために発注登録へ遷移します）
	 * @param info
	 */
	protected void openMSBD0080ForBndl(MCEventInfo info) {
		MCList<DtlR> dtlL = getDtlL().subList(DtlR.$check, true);
		if (isNull(dtlL)) {
			dialog(msgNoSelectedRow());
			return;
		}
		openPanel("MS", "MSBDP0080", T1, null, dtlL);

	}
	/**
	 * 発注登録画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBD0080 (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0080");
		aso.putCnd(crtOpenMSBDP0080CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0080.CndR crtOpenMSBDP0080CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg p = (mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0080.CndR to = mcframe.clientMSBD.MSBDP0080.CndR.create();
		to.po_no(r.po_no());
		to.rev_no(r.po_rev());
		to.ope(p.Cnd_ope_REF.getActionCommand());
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(仕入実績登録)
	// -----------------------------------------------
	/**
	 * 発注登録画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBD0140 (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0140");
		aso.putCnd(crtOpenMSBDP0140CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0140.CndR crtOpenMSBDP0140CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg p = (mcframe.clientMSBD.MSBDP0140.MSBDP_PurcReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0140.CndR to = mcframe.clientMSBD.MSBDP0140.CndR.create();
		to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PO_NO.name());
		to.srch_tgt_no(r.po_no());
		to.ope(p.Cnd_ope_INS.getActionCommand());
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(仕入直送売上登録)
	// -----------------------------------------------
	/**
	 * 仕入直送売上登録画面へ遷移します。（受注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBBP1360 (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1360");
		aso.putCnd(crtOpenMSBBP1360CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBB.MSBBP1360.CndR crtOpenMSBBP1360CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg p = (mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1360.CndR to = mcframe.clientMSBB.MSBBP1360.CndR.create();
		if (!isNull(r.purc_ddlv_dlv_slip_no())) {
			to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO.name());
			to.srch_tgt_no(r.purc_ddlv_dlv_slip_no());
		}
		else {
			to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
			to.srch_tgt_no(r.slo_no());
		}
		to.ope(p.Cnd_ope_INS.getActionCommand());
		return to;
	}
	// -----------------------------------------------
	// 画面遷移(納期調整登録)
	// -----------------------------------------------
	/**
	 * 納期調整登録画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBD0120 (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0120");
		aso.putCnd(crtOpenMSBDP0120CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0120.CndR crtOpenMSBDP0120CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg p = (mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0120.CndR to = mcframe.clientMSBD.MSBDP0120.CndR.create();
		to.po_no(r.po_no());
		// 操作種別
		if (Cnd_ope_INS.isSelected()) {
			to.ope(p.Cnd_ope_UPD_DLVINST.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		return to;
	}
	/**
	 * 購買納品伝票発行画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBDP0250 (MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0250");
		aso.putCnd(crtOpenMSBDP0250CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0250.CndR crtOpenMSBDP0250CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt p = (mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt) aso.getPanel();
		mcframe.clientMSBD.MSBDP0250.CndR to = mcframe.clientMSBD.MSBDP0250.CndR.create();
		to.po_no(r.po_no());
		to.ope(p.Cnd_ope_DLVSLIP.getActionCommand());
		return to;
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg rootP = (mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg)panel;
		if(!rootP.Cnd_disp_unit_Hdr.isSelected()) {
			dialog(MSBDP0100);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);
		
		MCIndexKey idxkey = list.createIndex(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key1, mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key2);
		
		for(DtlR dispRow : getDtlL()) {
			R row = list.getFirst(idxkey, dispRow.po_no(), dispRow.po_rev().toString());
			
			String bizTyp = dispRow.getBoolean(DtlR.$edi_flg) ? MAC_BIZ_TYP.PO_EDI.value() : MAC_BIZ_TYP.PO.value();
			row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
		}
	}
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		Dtl2Table.setMode(MCMode.INVISIBLE);
		super.valueInit();
		// 表示単位の設定
		setDispUnitByOpe();
		// 操作種別によるモードの設定
		setSrchStatus();
		// 操作種別による検索項目のモード設定
		setCndModeByOpe();
		// 操作種別によるヘッダ項目の初期値設定
		setHdrColByOpe();
		// 表示初期値の設定
		setValueEx(Btn_prnt_po_flg, true);
		setValueEx(Btn_prnt_dlv_flg, true);
		setValueEx(Btn_prnt_purc_ddlv_dlv_flg, true);
		setValueEx(BulkSet_po_dt, getToday());
		setValueEx(BulkSet_purc_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		setValueEx(BulkSet_collect_flg, false);
		setBtnMode(null);
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 品目
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		// 発注数量
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
				, columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ
				, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		
		// 基準単位数量
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place,columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,columnDtl_trd_unit_conv_qty);

		// 有効成分
		Dtl_inst_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		//　納入場所
		Dtl_in_to_loc_p_PPanel.setRelateBeans(columnDtl_in_to_loc_cd, columnDtl_in_to_loc_nm);
		// 棚・ライン
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_in_to_loc_cd, columnDtl_str_ln_tgt_flg);
		// 版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_site_cd,
				columnDtl_ver_flg);
		// 手配ＮＯ
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		// 品目分類
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		// 取引先分類
		Dtl_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
		//　発注先
		Dtl_sppl_p_PPanel.setRelateBeans(columnDtl_sppl_cd, columnDtl_sppl_nm);
		// 配送先
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		
		
		// 取引通貨単価・金額
		Dtl_trd_cur_upri_p_PPanel.setSchd(true);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_sppl_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_cur_upri_dec_place,
				columnDtl_purc_amt_rnd_typ, columnDtl_purc_tax_rnd_typ, columnDtl_sppl_purc_upri_cng_flg, columnDtl_itm_purc_upri_cng_flg,
				columnDtl_dscnt_itm_flg);

		// 取引通貨加工単価・金額
		Dtl_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty, columnDtl_trd_cur_proc_upri,
				columnDtl_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty,
				columnDtl_trd_cur_onr_prov_upri, columnDtl_purc_amt_rnd_typ, null);

		// 為替レート
		Dtl_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_base_cur_cd, columnDtl_xrate_cd, columnDtl_po_dt, true,
				columnDtl_xrate_inpt_flg);
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

		// 納税為替レート
		Dtl_ptax_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_ptax_cur_cd, columnDtl_xrate_cd, columnDtl_po_dt, true,
				columnDtl_ptax_xrate_inpt_flg);
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
		
		// 源泉税額
		Dtl_wtax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_base_cur_amt, columnDtl_wtax_rate, true);

		Dtl_bditm_p_PPanel.setRelateBeans(columnDtl_asset_mng_typ, 
				columnDtl_bd_lot_mng_typ, columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ, 
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ, columnDtl_bd_sno4_mng_typ);
		
		Dtl_dly_prspct_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_dlv_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_prms_rcpt_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_prms_refl_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_dlv_inst_prms_rcpt_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_dlv_inst_prms_refl_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_arr_schd_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_yet_arr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_arr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_purc_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_rcpt_iv_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_yield_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		

	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		if (eventIndex >= 0) {
			DtlR dtlR = getDtlL().get(eventIndex);
			if (beans == columnDtl_itm_cd) {
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ())) {
					bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
				}
			}
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}	
	@Override
	protected void listInit() {
		super.listInit();
		MCColumnConfig[] ignoreCols = {
			columnDtl_sppl_cd, columnDtl_sppl_cntry_cd, columnDtl_trd_cur_cd,
			columnDtl_maker_cd, columnDtl_mfg_loc_cd, columnDtl_bom_ptn
		};
		columnDtl_itm_cd.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub1.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub2.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub3.addIgnoreListBeans(ignoreCols);
	}
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_purc_usr_cd.addLCListener(this);
		BulkSet_purc_dpt_cd.addLCListener(this);
		
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		
		columnDtl_dlv_rqst_dt.addLCListener(this);
		columnDtl_dlv_rqst_hm.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_unit_qty.addNCListener(this);
		columnDtl_purc_dpt_cd.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl_trd_cur_proc_upri.addLCListener(this);
		columnDtl_trd_cur_onr_prov_upri.addLCListener(this);
		getDtlL().addListListener(createListListener(createDtlRowListener()));
	}
	
	@Override
	protected MAUDP_RowListener createListRegRowListener() {
		return new ListRegRowListener();
	}
	protected class ListRegRowListener extends MAUDP_PanelBase.ListRegRowListener {
		@Override
		public void valueChanged(MCRowEvent event) {
			String col = event.getColumn();
			DtlR r = (DtlR)event.getSourceRow(); 
			if (isStatusNone(r)) {
				// 明細のいずれかのカラムを変更したとき、共通項目の発注日を明細の発注日にコピーする（検索直後、初めてその行を変更するときだけ実行する）
				if (!isSame(col, DtlR.$po_dt) 
						&& !isSame(r.po_dt(), BulkSet_po_dt.getValue())
						&& isEditable(columnDtl_po_dt, r.getGUIIndex())) {
					setValueEx(columnDtl_po_dt, r.getGUIIndex(), BulkSet_po_dt.getValue());
				}
			}
			super.valueChanged(event);
		}	
	}
	
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if ((isSame(event.getNewStatus(), Status.CREATE) || isSame(event.getNewStatus(), Status.MODIFY))
					&& isSame(event.getOldStatus(), Status.NONE)) {
				if (Cnd_ope_INS.isSelected()) {
					DtlR dtl = (DtlR) event.getSourceRow();
					setPriPrntFlg(dtl);
				}
			}
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnDtl_sppl_cd);
		linkBeansToISPanelCustom(columnDtl_maker_cd);
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (isSame(sysParm, "1")) {
			getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(MSUAC_List.ItmDtlWithSpplMakerCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(MSUAC_List.ItmDtlWithSpplMakerCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(MSUAC_List.ItmDtlWithSpplMakerCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(MSUAC_List.ItmDtlWithSpplMakerCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_sppl_cd_ListPutter().putBind(MSUAC_List.ItmDtlSpplCols.$i_master_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, columnDtl_rqst_avl_rqst_dt);
		}
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
	@Override
	public boolean doCnd_disp_unit_VC(MCEventInfo info) {
		if (!super.doCnd_disp_unit_VC(info)) {
			return false;
		}
		if (isChanged()) {
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
		if (nc == columnDtl_trd_unit_qty) {
			doDtl_trd_unit_qty_NC(info);
		}
	}
	public void doDtl_trd_unit_qty_NC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_trd_cur_dscnt_amt, dtlR.getGUIIndex(), null);
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(dtlR);
		}
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
		setStatusColumn();
		setBtnMode(null);
	}
	/**
	 * NCイベント処理
	 */
	protected void doCnd_ope_NCSub() {
		// 一覧クリア
		clearContainers(getDtlL());
		// 表示単位の設定
		setDispUnitByOpe();
		// 操作種別によるモードの設定
		setSrchStatus();
		// 操作種別による検索項目のモード設定
		setCndModeByOpe();
		// 操作種別によるヘッダ項目のクリアと初期値設定
		clearCndByOpe();
		setHdrColByOpe();
		setSrchTyp();
	}
	
	@Override
	public void doDtl_edi_tgt_flg_NC(MCEventInfo info) {
		super.doDtl_edi_tgt_flg_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		dtlR.edi_flg((Boolean) info.getNewValue());
	}

	@Override
	public void doDtl_edi_flg_NC(MCEventInfo info) {
		super.doDtl_edi_flg_NC(info);
		// 検索モードが明細の場合、同一ヘッダの今回ＥＤＩに同じ値を設定する
		if (Cnd_ope_DEL.isSelected() && Cnd_disp_unit_Dtl.isSelected()) {
			DtlR dtlR = getDtlL().get(info.getEventIndex());
			MCList<DtlR> subL = getDtlL().subList(DtlR.$po_no, dtlR.po_no());
			for (DtlR r : subL) {
				setValueEx(columnDtl_edi_flg, r.getGUIIndex(), info.getNewValue());
			}
		}
	}
	@Override
	public void doDtl_aprv_rvrs_flg_NC(MCEventInfo info) {
		super.doDtl_aprv_rvrs_flg_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDELStatus();
		MCIndexKey idxDtlL = getDtlL().createIndex(DtlR.$po_no, DtlR.$aprv_rvrs_flg);
		MCList<DtlR> subL = getDtlL().subList(idxDtlL, dtlR.po_no(), false);
		for (DtlR r : subL) {
			setValueEx(columnDtl_aprv_rvrs_flg, r.getGUIIndex(), true);
		}
	}
	
	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (dtlR.check()) {
			checkDtl(dtlR);
			if (isNull(dtlR.po_dt())) {
				bulkSet(columnDtl_po_dt, dtlR);
			}
			if (isNull(dtlR.purc_usr_cd())) {
				bulkSet(columnDtl_purc_usr_cd, dtlR);
			}
			if (isNull(dtlR.purc_dpt_cd())) {
				bulkSet(columnDtl_purc_dpt_cd, dtlR);
			}
			setDefault(dtlR);
		}
		syncCrctRsn(dtlR);
	}
	
	@Override
	public void doDtl_po_conf_rcpt_flg_NC(MCEventInfo info) {
		super.doDtl_po_conf_rcpt_flg_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_po_conf_rcpt_dt, dtlR.getGUIIndex(), null);
	}
	
	protected void syncCrctRsn(DtlR tgtR) {
		if (!Cnd_ope_DEL.isSelected()) {
			return;
		}
		if (tgtR.check()) {
			for (DtlR r : getDtlL().subList(DtlR.$po_no, tgtR.po_no())) {
				if (!isSame(tgtR.getGUIIndex(), r.getGUIIndex()) &&
						!MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) &&
						r.check()) {
					tgtR.crct_rsn_cd(r.crct_rsn_cd());
					tgtR.crct_rsn_nm(r.crct_rsn_nm());
					tgtR.crct_rsn_rmrks(r.crct_rsn_rmrks());
					return;
				}
			}
		}else {
			tgtR.crct_rsn_cd(null);
			tgtR.crct_rsn_nm(null);
			tgtR.crct_rsn_rmrks(null);
		}
	}
	
	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		setSrchStatus();
		// 一覧クリア
		clearContainers(getDtlL());
		clearCndByDispUnit();
		setSundryItmFlg();
		setArrSts();
		setPurcSts();
		setFooter();
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		if (info.getEventIndex() < 0) {
			return;
		}
		if (getDtlL().size() > 0) {
			DtlR r = getDtlL().get(info.getEventIndex());
			setBtnMode(r);
		}
	}
	@Override
	public void doBulkSet_async_flg_NC(MCEventInfo info) {
		super.doBulkSet_async_flg_NC(info);

		setInstImmedPrntFlgMode();
	}

	protected void setInstImmedPrntFlgMode() {
		if (getBulkSetR().async_flg()) {
			setValueEx(Btn_prnt_po_flg, false);
			setValueEx(Btn_prnt_dlv_flg, false);
			setValueEx(Btn_prnt_purc_ddlv_dlv_flg, false);
			Btn_prnt_po_flg.setMode(MCMode.READ_ONLY);
			Btn_prnt_dlv_flg.setMode(MCMode.READ_ONLY);
			Btn_prnt_purc_ddlv_dlv_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Btn_prnt_po_flg);
			setDefaultMode(Btn_prnt_dlv_flg);
			setDefaultMode(Btn_prnt_purc_ddlv_dlv_flg);
		}
	}
	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BulkSet_purc_usr_cd) {
			doBulkSet_purc_usr_cd_LC(info);
		}
		if (lc == BulkSet_purc_dpt_cd) {
			doBulkSet_purc_dpt_cd_LC(info);
		}
		if (lc == columnDtl_itm_cd
				|| lc == columnDtl_itm_sub1
				|| lc == columnDtl_itm_sub2
				|| lc == columnDtl_itm_sub3) {
			
			doDtl_itm_LC(info);
		}
		
		if (lc == columnDtl_dlv_rqst_dt) {
			doDtl_dlv_rqst_dt_LC(info);
		}
		if (lc == columnDtl_dlv_rqst_hm) {
			doDtl_dlv_rqst_hm_LC(info);
		}
		if(lc == columnDtl_trd_cur_upri){
			doDtl_trd_cur_upri_LC(info);
		}
		if(lc == columnDtl_trd_cur_tax_amt) {
			doDtl_trd_cur_tax_amt_LC(info);
		}
		if(lc == columnDtl_trd_cur_dscnt_amt) {
			doDtl_trd_cur_dscnt_amt(info);
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

	public void doDtl_mfg_loc_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!isNullOrNullVal(dtlR.mfg_loc_cd())) {
			setValueEx(columnDtl_outsrc_flg, dtlR.getGUIIndex(), true);
			setValueEx(columnDtl_repurc_obli_flg, dtlR.getGUIIndex(), dtlR.sppl_repurc_obli_flg());
			dtlR.outsrc_upri_typ(dtlR.sppl_outsrc_upri_typ());
		}
		else {
			setValueEx(columnDtl_outsrc_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_bom_ptn, dtlR.getGUIIndex(), null);
			// 製造場所が「*」でもwg_cdが設定されるのでクリアする
			setValueEx(columnDtl_mfg_loc_wg_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_repurc_obli_flg, dtlR.getGUIIndex(), false);
			dtlR.outsrc_upri_typ(null);
		}

		setDefaultPurcBasisTyp(dtlR);
		setSchdDt(dtlR);
	}
	
	public void doDtl_bom_ptn_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDefaultPurcBasisTyp(dtlR);
	}
	
	public void doDtl_maker_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDefaultPurcBasisTyp(dtlR);
		setSchdDt(dtlR);
	}
	
	public void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		clearDscntAmt(dtlR);
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
	/**
	 * 税額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 埋め込み画面側のイベント処理で、税額から先に値がセットされ、値引額側がエラーにならないので、税額にイベントを実装
		chkProcAmtMinus(dtlR);
		// 埋め込み画面側のイベントで、数量の変更後に税額が上書きされてしまうので、税額のイベントで値を変えるようにする。
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(dtlR);
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
	 * 取引通貨値引額変更イベント
	 * @param info
	 */
	protected void doDtl_trd_cur_dscnt_amt(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(dtlR.outsrc_flg()) {
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(dtlR);
			}
		}
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
		if(!dtlR.outsrc_flg() || isNull(dtlR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
				dtlR.trd_unit_qty(),
				dtlR.trd_cur_amt_dec_place(),
				dtlR.purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		setValueEx(columnDtl_trd_cur_proc_amt, dtlR.getGUIIndex(), procAmt);
	}
	protected void clearDscntAmt(DtlR dtlR) {
		if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
			setValueEx(columnDtl_trd_cur_dscnt_amt, dtlR.getGUIIndex(), null);
		}
	}

	@Override
	public void doBulkSet_po_dt_LC(MCEventInfo info) {
		super.doBulkSet_po_dt_LC(info);
		try {
			_isBulkSetPoDt = true;
			for (DtlR dtlR : getDtlL()) {
				if (dtlR.check()) {
					bulkSet(columnDtl_po_dt, dtlR);
				}
			}
			setPoDtChgL(null);
			callMS_MSBDL0090_Sprt04();
		}
		finally {
			_isBulkSetPoDt = false;
			getDtlL().setBoolean(DtlR.$po_dt_chg_flg, false);
		}
	}
	/**
	 * 購買担当者を一括設定します。
	 * @param info
	 */
	public void doBulkSet_purc_usr_cd_LC(MCEventInfo info) {
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_purc_usr_cd, dtlR);
			}
		}
	}
	/**
	 * 購買担当者を一括設定します。
	 * @param info
	 */
	public void doBulkSet_purc_dpt_cd_LC(MCEventInfo info) {
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_purc_dpt_cd, dtlR);
			}
		}
	}
	@Override
	public void doDtl_trd_cd_LC(MCEventInfo info) {
		super.doDtl_trd_cd_LC(info);
	}
	/**
	 * 品目変更イベント
	 * @param info
	 */
	public void doDtl_itm_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			// クリア
			clearVerNo(dtlR);
			clearPurcRsnCd(dtlR);
			clearTrdCurUpri(dtlR);
			// 初期値
			setIvItmNm(dtlR);
			setSpplItm(dtlR);
			setDefaultTaxCd(dtlR, true);
			setColByDscntItm(dtlR);
			setDefaultPayCrryovrTimes(dtlR);
			setDefaultPurcIdTyp(dtlR);
			setWtaxRate(dtlR);
			setDefaultPurcBasisTyp(dtlR);
			setSyncFlg(dtlR);
			setDefStrLnCd(dtlR);
			setDlvSlipInvldFlg(dtlR);
			if (isNull(dtlR.po_print_cd()) && !isNullOr(dtlR.sppl_cd(), getCo().po_print_cd())) {
				setValueEx(columnDtl_po_print_cd, dtlR.getGUIIndex(),  getCo().po_print_cd());
			}
			setSchdDt(dtlR);
		}
	}
	
	@Override
	public void doDtl_po_dt_LC(MCEventInfo info) {
		super.doDtl_po_dt_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (_isBulkSetPoDt) {
			if (!isSame(info.getNewValue(), info.getOldValue())) {
				dtlR.po_dt_chg_flg(true);
			}
			return;
		}
		else {
			setPoDtChgL(dtlR);
			callMS_MSBDL0090_Sprt04();
		}
	}
	
	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		clearPurcRsnCd(dtlR);
		setOutsrcColumnBySppl(dtlR);
		clearTrdCurUpri(dtlR);
		clearPurcIdTyp(dtlR);
		setIvItmNm(dtlR);
		setSpplItm(dtlR);
		setDefaultTaxCd(dtlR, true);
		setDefaultPayCrryovrTimes(dtlR);
		setModeValBySppl(dtlR, info);
		String purcDptCd = dtlR.purc_dpt_cd();
		int idx = info.getEventIndex();
		if (!isNull(dtlR.def_purc_usr_cd()) || !isNull(dtlR.def_purc_dpt_cd())) {
			setValueEx(columnDtl_purc_usr_cd, idx, null);
			setValueEx(columnDtl_purc_dpt_cd, idx, null);
		}
		if (!isNull(dtlR.def_purc_usr_cd())) {
			setValueEx(columnDtl_purc_usr_cd, idx, dtlR.def_purc_usr_cd());
		}
		else if (!isNull(dtlR.def_purc_dpt_cd())) {
			setValueEx(columnDtl_purc_dpt_cd, idx, dtlR.def_purc_dpt_cd());
		}
		if (isNull(dtlR.po_print_cd()) && !isNullOr(dtlR.sppl_cd(), getCo().po_print_cd())) {
			setValueEx(columnDtl_po_print_cd, idx, getCo().po_print_cd());
		}
		if (isNull(dtlR.sppl_cd())) {
			setValueEx(columnDtl_ap_dpt_cd, idx, null);
		}
		else {
			if (!isNull(dtlR.mst_ap_dpt_cd())) {
				setValueEx(columnDtl_ap_dpt_cd, idx, dtlR.mst_ap_dpt_cd());
			}
			else {
				if (isNullAnd(purcDptCd, dtlR.purc_dpt_cd())) {
					setValueEx(columnDtl_ap_dpt_cd, idx, null);
				}
				else {
					setValueEx(columnDtl_ap_dpt_cd, idx, dtlR.ap_dpt_flg() ? dtlR.purc_dpt_cd() : null);
				}
			}
		}
		setDefaultPurcBasisTyp(dtlR);
		setSchdDt(dtlR);
		dtlR.edi_flg(dtlR.edi_tgt_flg());
	}
	public void doDtl_purc_dpt_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setApDptCd(r);
	}
	/**
	 * 発注日変更時のイベント(MSBDL0090_Sprt04)に連携するリストを設定する。
	 * 引数の対象行がNULLの場合、複数行が対象
	 * 引数の対象行がNULL以外の場合、引数の行のみ対象
	 * @param dtlR 対象行
	 */
	protected void setPoDtChgL(DtlR dtlR) {
		if (isNull(dtlR)) {
			// 発注日が変わった行、かつ税・源泉税率・発注先品目に共通する項目に値が設定されている行を対象にする
			MCList<DtlR> upL = MCList.create(DtlR.class);
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				if (r.check() && r.po_dt_chg_flg()
						&& !isNullOr(r.po_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					upL.add(r);
				}
			}
			_poDtChgL = upL;
		}
		else {
			if (!isNullOr(dtlR.po_dt(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())) {
				_poDtChgL = MCList.create(DtlR.class);
				_poDtChgL.add(dtlR);
			}
		}
	}
	/**
	 * 発注先の外注に係る項目をマスタ値から設定する。
	 */
	protected void setOutsrcColumnBySppl(DtlR r) {
		if(r.outsrc_flg()) {
			r.repurc_obli_flg(r.sppl_repurc_obli_flg());
			r.outsrc_upri_typ(r.sppl_outsrc_upri_typ());
		}
		else {
			r.repurc_obli_flg(false);
			r.outsrc_upri_typ(null);
		}
	}
	
	protected void setModeValBySppl(DtlR dtlR, MCEventInfo info) {
		setPriPrntFlg(dtlR);
	}
	
	protected void setPriPrntFlg(DtlR dtlR){
		// 納品書を発行しない
		if (isNull(dtlR.sppl_ship_form_cd())) {
			setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), false);
		}
		else {
			setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), true);
		}
	}
	
	protected void setApDptCd(DtlR r) {
		if (isNull(r.mst_ap_dpt_cd())) {
			if (isNull(r.purc_dpt_cd())) {
				setValueEx(columnDtl_ap_dpt_cd, r.getGUIIndex(), null);
			}
			else {
				if (r.ap_dpt_flg()) {
					setValueEx(columnDtl_ap_dpt_cd, r.getGUIIndex(), r.purc_dpt_cd());
				}
				else {
					setValueEx(columnDtl_ap_dpt_cd, r.getGUIIndex(), null);
				}	
			}
		}
	}
	
	@Override
	public void doDtl_purc_upri_req_typ_LC(MCEventInfo info) {
		super.doDtl_purc_upri_req_typ_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!dtlR.tax_fix_flg()) {
			setDefaultTaxCd(dtlR, false);
		}
		setWtaxRate(dtlR);
	}
	
	/**
	 * 納入希望日変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setSchdDt(dtlR);
	}
	/**
	 * 納入希望時刻変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_hm_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 計画外の場合納入予定日＝依頼元納入予定日
		if (isNull(dtlR.po_schd_no())) {
			setValueEx(columnDtl_rqst_dlv_rqst_hm, dtlR.getGUIIndex(), dtlR.dlv_rqst_hm());
		}
	}
	/**
	 * 仕入予定日変更イベント
	 * @param info
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setSyncFlg(dtlR);
		if (!dtlR.tax_fix_flg()) {
			setDefaultTaxCd(dtlR, false);
		}
		setWtaxRate(dtlR);
		// 仕入直送の場合、納入希望日＝仕入予定日とする
		if (!isNull(dtlR.dlv_cd())) {
			// 仕入直送の場合、依頼元が必ずあるため依頼元納入希望日の連動などは考慮しない
			dtlR.dlv_rqst_dt(dtlR.purc_schd_dt());
		}
	}
	
	/**
	 * 仕入計上区分変更イベント
	 * @param info
	 */
	public void doDtl_purc_basis_typ_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDefaultPurcBasisTyp(dtlR);
		setSyncFlg(dtlR);
	}

	/**
	 * 計画外・まとめ後の場合に、依頼元納入希望日へ納入希望日を設定します。
	 * @param dtlR
	 */
	protected void setRqstDlvRqstDt(DtlR dtlR) {
		if (isNull(dtlR.po_schd_no())) {
			// 計画外の場合納入予定日＝依頼元納入予定日
			setValueEx(columnDtl_rqst_dlv_rqst_dt, dtlR.getGUIIndex(), dtlR.dlv_rqst_dt());
		}
	}
	protected void setRqstAvlRqstDt(DtlR dtlR,MCRow src) {
		if (isNull(src) && isNull(dtlR.po_schd_src_typ())) {
			dtlR.rqst_avl_rqst_dt(dtlR.dlv_rqst_dt());
		}
	}

	/**
	 * 直納区分を設定します
	 * @param info
	 */
	@Override
	public void doDtl_in_to_loc_cd_LC(MCEventInfo info) {
		super.doDtl_in_to_loc_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		clearVerNo(dtlR);
		clearPurcIdTyp(dtlR);
		setDrctDlvTyp(dtlR);
		setSchdDt(dtlR);
	}
	
	@Override
	public void doDtl_purc_id_typ_LC(MCEventInfo info) {
		super.doDtl_purc_id_typ_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNonPurc(dtlR)) {
			// 無償受給・ＶＭＩの場合
			setValueEx(columnDtl_purc_schd_dt, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_purc_upri_req_typ, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), null);
			Dtl_bditm_p_PPanel.clearBdItem(dtlR.getGUIIndex());
			clearAmtInfo(dtlR);
		}
		else {
			setDefaultPayCrryovrTimes(dtlR);
		}
		
		setDefaultPurcBasisTyp(dtlR);
	}
	
	@Override
	public void doDtl_crct_rsn_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_crct_rsn_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!dtlR.check()) {
			return;
		}
		for (DtlR r : getDtlL().subList(DtlR.$po_no, dtlR.po_no())) {
			if (!isSame(dtlR.getGUIIndex(), r.getGUIIndex()) && r.check()) {
				r.crct_rsn_cd(dtlR.crct_rsn_cd());
				r.crct_rsn_nm(dtlR.crct_rsn_nm());
				r.crct_rsn_rmrks(dtlR.crct_rsn_rmrks());
			}
		}
	}
	
	@Override
	public void doCnd_inc_past_flg_NC(MCEventInfo info) {
		super.doCnd_inc_past_flg_NC(info);
		setModeToInclCanFlg();
	}
	
	protected void setModeToInclCanFlg() {
		if (getCndR().inc_past_flg()) {
			setValueEx(Cnd_incl_can_flg, true);
			Cnd_incl_can_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_incl_can_flg);
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
			// オペレーション実行後は該当行を入力不可
			if (MAC_RTN_STS_TYP.isOK(dtlR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (Cnd_ope_INS.isSelected()) {
				if (isEditableMode(column)) {
					if (!isNull(dtlR.po_schd_no()) && !isEditableColWhenSchd(column)) {
						// 予定のある発注の場合は品目など入力不可
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_trd_cur_dscnt_amt) {
					if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
						return MCMode.READ_ONLY;
					}
				}
				// 発注先
				if (column == columnDtl_sppl_cd) {
					if (isEditableMode(column) && dtlR.outsrc_flg() && !isNull(dtlR.po_schd_no())) {
						return MCMode.READ_ONLY;
					}
					else if (isEditableMode(column) && isNull(dtlR.itm_sub3())) {
						return MCMode.READ_ONLY;
					}
	
				}
				// メーカ
				if (column == columnDtl_maker_cd) {
					if (isEditableMode(column) && dtlR.outsrc_flg() && !isNull(dtlR.po_schd_no())) {
						return MCMode.READ_ONLY;
					}
	
				}
				// 品目
				if (column == columnDtl_itm_nm) {
					if (isEditableMode(column) && (!isNull(dtlR.po_schd_no()) || !dtlR.sundry_itm_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				if (Dtl_bditm_p_PPanel.isBdColumn(column)) {
					if (isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
				}
				// インボイス表記品名
				if (column == columnDtl_iv_itm_nm) {
					if (isEditableMode(column) && (!dtlR.sundry_itm_flg() || !dtlR.sppl_iv_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 発注数量
				if (column == columnDtl_trd_unit_qty) {
					if (isEditableMode(column) && dtlR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
		
				}
				// 取引単位
				if (column == columnDtl_trd_unit_cd) {
					if (isEditableMode(column) && dtlR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
		
				}
				// 依頼元使用可能希望日
				if (column == columnDtl_rqst_avl_rqst_dt) {
					if (isEditableMode(column) 
							&& !isNull(dtlR.po_schd_no())) {
						return MCMode.READ_ONLY;
					}
			
				}
				
				// 仕入予定日
				if (column == columnDtl_purc_schd_dt) {
					if (isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
					else if (dtlR.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isEditableMode(column) && MAC_PURC_ID_TYP.isPURC(dtlR.purc_id_typ())
							|| MAC_PURC_ID_TYP.isONR_RCV((dtlR.purc_id_typ()))) {
						return MCMode.REQUIRED;
					}
				}
				// 同時計上ＦＬＧ
				if (column == columnDtl_sync_flg) {
					if (dtlR.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
					if (isNullOr(dtlR.dlv_rqst_dt(), dtlR.purc_schd_dt())
							|| !dtlR.dlv_rqst_dt().eqDate(dtlR.purc_schd_dt())) {
						return MCMode.READ_ONLY;
					}
					if (isPurcDdlv(dtlR)) {
						return MCMode.READ_ONLY;
					}
					if (dtlR.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(dtlR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(dtlR.purc_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 仕入計上区分
				if (column == columnDtl_purc_basis_typ) {
					if (isPurcDdlv(dtlR)) {
						return MCMode.READ_ONLY;
					}
					if (dtlR.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
					if (isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
					if (dtlR.subcon_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 支払繰越回数
				if (column == columnDtl_pay_crryovr_times) {
					if (isEditableMode(column) && isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
				}
				// 金額系項目
				if (column.getRootPanel() == Dtl_trd_cur_upri_p_PPanel) {
					if (isEditableMode(column) && isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
				}
				// 購買単価取得区分
				if (column == columnDtl_purc_upri_req_typ) {
					if (isEditableMode(column) && isNonPurc(dtlR)) {
						return MCMode.READ_ONLY;
					}
				}

				// 取引通貨単価
				if (column == columnDtl_trd_cur_upri) {
					// 外注単価区分:加工単価+有償支給単価の場合は入力不可
					if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(dtlR.outsrc_upri_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 加工単価
				if (column == columnDtl_trd_cur_proc_upri) {
					if (!dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!dtlR.itm_purc_upri_cng_flg() && !dtlR.sppl_purc_upri_cng_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!dtlR.upri_not_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 有償支給単価
				if (column == columnDtl_trd_cur_onr_prov_upri) {
					if (!dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!dtlR.itm_purc_upri_cng_flg() && !dtlR.sppl_purc_upri_cng_flg()) {
						return MCMode.READ_ONLY;
					}
					if (!dtlR.upri_not_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
					if (MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 源泉徴収税率
				if (column == columnDtl_wtax_rate) {
					if (!canEditWtaxRate(dtlR)) {
						return MCMode.READ_ONLY;
					}
					
				}
				// 為替レート指定ＦＬＧ
				if (column == columnDtl_xrate_inpt_flg) {
					if (isEditableMode(column) && 
							(isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd()) || isNull(dtlR.trd_cur_cd()))) {
						return MCMode.READ_ONLY;
					}
					
				}
				// 納税為替レート指定ＦＬＧ
				if (column == columnDtl_ptax_xrate_inpt_flg) {
					if (isEditableMode(column) && 
							(isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd()) || isNull(dtlR.trd_cur_cd()) || isNull(dtlR.ptax_cur_cd()))) {
						return MCMode.READ_ONLY;
					}
					
				}
				
				// 仕入理由
				if (column == columnDtl_purc_rsn_cd) {
					if (isEditableMode(column) && isPurcXpns(dtlR)) {
						return MCMode.REQUIRED;
					}
					
				}
				// 変更注文書
				if (column == columnDtl_upd_po_print_schd_dt) {
					if (isEditableMode(column) && dtlR.subcon_flg() && dtlR.interim_flg()) {
						return MCMode.REQUIRED;
					}
					
				}
				// 請書受領
				if (column == columnDtl_po_conf_rcpt_dt) {
					if (isEditableMode(column) && !dtlR.po_conf_rcpt_flg()) {
						return MCMode.READ_ONLY;
					} 
					
				}
				
				// 手配ＮＯ
				if (column == columnDtl_sno1
						|| column == columnDtl_sno2 
						|| column == columnDtl_sno3 
						|| column == columnDtl_sno4) {
					if (isEditableMode(column) && !isNull(dtlR.slo_no()) && !dtlR.rqst_can_flg()) {
						return MCMode.READ_ONLY;
					}
					
				}
				// 価格印字
				// 納品書のみ影響があるので、納品書を発行する明細のみ指定可能。
				// ※フッタの納品書発行ＦＬＧは制御していない。オンにして登録した際、
				// 納品書発行対象の発注先がなければ、納品書を発行しないで終了するだけ。
				if (column == columnDtl_pri_prnt_flg) {
					if (isNull(dtlR.sppl_ship_form_cd())) {
						return MCMode.READ_ONLY;
					}
					else if (isEditableMode(column)) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_mfg_loc_cd || column == columnDtl_bom_ptn) {
					if (isNull(dtlR.po_schd_no()) && isNull(dtlR.po_d_no()) && isINSStatus(getStatus())) {
						if (dtlR.outsrc_flg()) {
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.ENABLE;
						}
					}
				}
				if (column == columnDtl_edi_flg) {
					return getEdiFlgMode(dtlR);
				}
			}
			else if (Cnd_ope_DEL.isSelected()) {
				// 承認引戻
				if (column == columnDtl_aprv_rvrs_flg) {
					if (Cnd_disp_unit_Hdr.isSelected()) {
						if (dtlR.aprv_rvrs_flg() || !dtlR.aprv_can_flg() || isContainDoneNexOper(dtlR)
								|| !(MAC_APRV_STS_TYP.isFIX(dtlR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(dtlR.aprv_sts_typ()))) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						if (dtlR.aprv_rvrs_flg() || !dtlR.aprv_upd_flg() || !dtlR.aprv_can_flg() || isContainDoneNexOper(dtlR)
								|| !(MAC_APRV_STS_TYP.isFIX(dtlR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(dtlR.aprv_sts_typ()))) {
							return MCMode.READ_ONLY;
						}	
					}
					
				}
				else {
					// 承認済の場合は、承認引戻ＦＬＧをオンにしないと訂正不可
					if (!dtlR.aprv_rvrs_flg() && (MAC_APRV_STS_TYP.isFIX(dtlR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(dtlR.aprv_sts_typ()))) {
						return MCMode.READ_ONLY;
					}
					// チェック
					if (column == columnDtl_check) {
						if (isEditableMode(column) && doneNextOper(dtlR)) {
							return MCMode.READ_ONLY;
						}
					}
					// 訂正理由
					if (column == columnDtl_crct_rsn_cd) {
						if (!editablePoCrctRsn(dtlR)) {
							return MCMode.READ_ONLY;
						}
						else if (dtlR.subcon_flg()) {
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.ENABLE;
						}
					}
					if (column == columnDtl_edi_flg) {
						return getEdiFlgMode(dtlR);
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected MCMode getEdiFlgMode(DtlR r) {
		if (r.edi_tgt_flg()) {
			return MCMode.REQUIRED;
		}
		else {
			return MCMode.READ_ONLY;
		}
	}
	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	/**
	 * 行ステータスの表示・非表示を設定します。
	 */
	public void setStatusColumn() {
		if (Cnd_ope_INS.isSelected()) {
			DtlTable.setStatusColumnVisible(true);
		}
		else {
			DtlTable.setStatusColumnVisible(false);
		}
	}
	/**
	 * 行コピー時に項目をクリアします。
	 * @param index
	 */
	protected void clearNotCopyCol(int index) {
		setValueEx(columnDtl_po_schd_no, index, null);
		setValueEx(columnDtl_slo_no, index, null);
		setValueEx(columnDtl_slo_d_no, index, null);
		setValueEx(columnDtl_po_schd_src_typ, index, null);
		setValueEx(columnDtl_po_schd_src_typ_nm, index, null);
		setValueEx(columnDtl_outsrc_itm_ord_no, index, null);
		setValueEx(columnDtl_po_schd_src_no, index, null);
		setValueEx(columnDtl_rqst_fr_usr_cd, index, null);
		setValueEx(columnDtl_rqst_fr_usr_nm, index, null);
		setValueEx(columnDtl_rqst_fr_dpt_cd, index, null);
		setValueEx(columnDtl_rqst_fr_dpt_nm, index, null);
		setValueEx(columnDtl_po_no, index, null);
		setValueEx(columnDtl_po_rev, index, null);
		setValueEx(columnDtl_po_d_no, index, null);
		setValueEx(columnDtl_last_po_rev, index, null);
		setValueEx(columnDtl_po_print_flg, index, null);
		setValueEx(columnDtl_rqst_can_flg, index, null);
		setValueEx(columnDtl_bef_in_to_loc_wg_cd, index, null);
		setValueEx(columnDtl_bef_lg_grp_cd, index, null);
		setValueEx(columnDtl_bef_loc_grp_cd, index, null);
		setValueEx(columnDtl_dlv_slip_no, index, null);
		setValueEx(columnDtl_dlv_slip_seq, index, null);
		setValueEx(columnDtl_dlv_slip_rev, index, null);
	}
	
	/**
	 * ボタンの押下制御をします。
	 * @param index 一覧のインデックス
	 */
	protected void setBtnMode(DtlR r) {
		
		setBtnRcopyMode(r);
		setBtnRdelMode(r);
		setBtnOpnMSBDP0140(r);
		setBtnOpnMSBDP0120(r);
		setBtnOpnMSBDP0080(r);
		setBtnOpnMSBBP1360(r);
	}
	/**
	 * 行コピーボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRcopyMode(DtlR r) {
		if (isNull(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else if (isPurcDdlv(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	/**
	 * 行削除ボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRdelMode(DtlR r) {
		if (isNull(r)) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if (isNull(r.po_schd_no())) {
			setDefaultMode(Btn_rdel);
		}
		else {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 仕入実績登録画面遷移ボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnOpnMSBDP0140(DtlR r) {
		if (!isNull(r) && 
				!isNull(r.po_no()) && 
				!isNonPurc(r) && 
				!isPurcCmpl(r) &&
				!r.sppl_iv_flg() &&
				(Cnd_ope_REF.isSelected()
				|| (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_INS.isSelected())
				|| (!MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_DEL.isSelected()))) {
			setDefaultMode(Btn_open_MSBDP0140);
		}
		else {
			Btn_open_MSBDP0140.setMode(MCMode.DISABLE);
		}
	}
	
	protected boolean isPurcCmpl(DtlR r) {
		return MSC_PURC_STS_TYP.isCOMPL(r.purc_sts_typ()) ||
				MSC_PURC_STS_TYP.isPURC(r.purc_sts_typ());
	}
	
	protected void setBtnOpnMSBBP1360(DtlR r) {
		if (!isNull(r) && !isNull(r.po_no()) &&  !isNull(r.dlv_cd()) && 
				!r.sppl_iv_flg() &&
				(Cnd_ope_REF.isSelected()
				|| (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_INS.isSelected())
				|| (!MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_DEL.isSelected()))) {
			setDefaultMode(Btn_open_MSBBP1360);
		}
		else {
			Btn_open_MSBBP1360.setMode(MCMode.DISABLE);
		}
	}

	protected void setBtnOpnMSBDP0120(DtlR r) {
		if (!isNull(r) && !isNull(r.po_no()) &&  
				(Cnd_ope_REF.isSelected()
				|| (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_INS.isSelected())
				|| (!MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_DEL.isSelected()))) {
			setDefaultMode(Btn_open_MSBDP0120);
		}
		else {
			Btn_open_MSBDP0120.setMode(MCMode.DISABLE);
		}
	}
	
	protected void setBtnOpnMSBDP0080(DtlR r) {
		if (Cnd_ope_BNDL.isSelected() || !isNull(r) && !isNull(r.po_no()) &&  
				(Cnd_ope_REF.isSelected()
				|| (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_INS.isSelected())
				|| (!MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ()) && Cnd_ope_DEL.isSelected()))) {
			setDefaultMode(Btn_open_MSBDP0080);
		}
		else {
			Btn_open_MSBDP0080.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 操作種別に対応するステータスを設定します。（検索）
	 */
	public void setSrchStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			Ctrl_ctrl_PPanel.expand(true);
			fillSpace();
		}
		else if (Cnd_ope_BNDL.isSelected()) {
			setBNDLStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				setDEL_HDRStatus();
			}
			else {
				setDEL_DTLStatus();
			}
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNT_HDRStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
		else {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				setSRCH_HDRStatus();
				Ctrl_ctrl_PPanel.expand(true);
			}
			else {
				setSRCH_DTLStatus();
				Ctrl_ctrl_PPanel.expand(true);
			}
		}
		setStatusColumn();
		CndPanel.focusFirstComponent();

	}
	
	protected void setSrchTyp() {
		if (Cnd_ope_DEL.isSelected()) {
			getCndR().upd_flg(true);
		}
		else {
			getCndR().upd_flg(false);
		}
	}

	/**
	 * 操作種別に対応するステータスを設定します。（更新）
	 */
	public void setUpdStatusByOpe() {
		Ctrl_ctrl_PPanel.expand(false);
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			fillSpace();
		}
		if (Cnd_ope_BNDL.isSelected()) {
			setBNDLStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				setDEL_HDRStatus();
			}
			else {
				setDEL_DTLStatus();
			}
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				setREF_HDRStatus();
			}
			else {
				setREF_DTLStatus();
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNT_HDRStatus();
			setDlvSlipFlg();
		}
		else if (Cnd_ope_SEND.isSelected()
				|| Cnd_ope_RE_SEND.isSelected()) {
			setSEND_HDRStatus();
		}
		setStatusColumn();
		DtlTable.selectLeftmostColumn(0);
	}
	
	protected void setDlvSlipFlg() {
		if (getCndR().inc_past_flg()) {
			Btn_prnt_dlv_flg.setMode(MCMode.READ_ONLY);
			Btn_prnt_purc_ddlv_dlv_flg.setMode(MCMode.READ_ONLY);
			getBtnR().prnt_dlv_flg(false);
			getBtnR().prnt_purc_ddlv_dlv_flg(false);
		}
	}
	
	/**
	 * 検索条件の入力可否を設定します。
	 */
	public void setCndModeByOpe() {
		if (Cnd_ope_PRNT.isSelected()) {
			Cnd_disp_unit_Group.setMode(MCMode.READ_ONLY);
		}
	}
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
	/**
	 * 操作種別ごとにヘッダ項目の初期値を設定します
	 */
	protected void setHdrColByOpe() {
		setAprvStsByOpe();
		setAbortStsByOpe();
		setEdiStsByOpe();
		setPoPrntStsByOpe();
		setPoDtByOpe();
		setCmplDtByOpe();
		setPurcStsTypByOpe();
		setKpiColByOpe();
		setApDptByOpe();
		setRmrksColByOpe();
		setIVTrgtFlg();
		setSundryItmFlg();
		setArrSts();
		setPurcSts();
		setPurcIFSts();
		setDlvPrntStsByOpe();
		setPurcDdlvDlvPrntStsByOpe();
		setBulkSet();
		setFooter();
	}
	
	protected void setBulkSet() {
		if (!Cnd_ope_INS.isSelected()) {
			setValueEx(BulkSet_async_flg, false);
		}
	}
	
	protected void setFooter() {
		if (Cnd_ope_PRNT.isSelected()) {
			if (Cnd_disp_unit_Hdr.isSelected()) {
				getBtnR().prnt_dlv_flg(true);
				getBtnR().prnt_purc_ddlv_dlv_flg(true);
				getBtnR().prnt_po_flg(true);
			}
			else {
				getBtnR().prnt_dlv_flg(false);
				getBtnR().prnt_po_flg(false);
			}
		}
		else if (Cnd_ope_INS.isSelected()) {
			getBtnR().prnt_dlv_flg(true);
			getBtnR().prnt_purc_ddlv_dlv_flg(true);
			getBtnR().prnt_po_flg(true);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			getBtnR().prnt_dlv_flg(false);
			getBtnR().prnt_purc_ddlv_dlv_flg(false);
			getBtnR().prnt_po_flg(true);
		}
	}

	/**
	 * 検索条件（表示単位）を設定します
	 */
	protected void setDispUnitByOpe() {
		if (Cnd_ope_PRNT.isSelected()
			|| Cnd_ope_SEND.isSelected()
			|| Cnd_ope_RE_SEND.isSelected()) {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Hdr.getActionCommand());
		}
		else {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_Dtl.getActionCommand());
		}
	}
	/**
	 * 検索条件（発注承認状況）を設定します
	 */
	protected void setAprvStsByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_fix_flg, false);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Cnd_last_rjct_flg, false);
			setValueEx(Cnd_aprv_invalid_flg, false);
		}
		else if (Cnd_ope_SEND.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_fix_flg, true);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Cnd_last_rjct_flg, false);
			setValueEx(Cnd_aprv_invalid_flg, false);
		}
		else if (Cnd_ope_RE_SEND.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_fix_flg, true);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Cnd_last_rjct_flg, false);
			setValueEx(Cnd_aprv_invalid_flg, true);
		}
		else {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_fix_flg, true);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, true);
			setValueEx(Cnd_last_rjct_flg, true);
			setValueEx(Cnd_aprv_invalid_flg, true);
		}
	}
	/**
	 * 検索条件（打切状況）を設定します
	 */
	protected void setAbortStsByOpe () {
		setValueEx(Cnd_incl_abort_flg, false);
		setValueEx(Cnd_incl_can_flg, false);
	}
	/**
	 * 検索条件（ＥＤＩ対象か否か）を設定します
	 */
	protected void setEdiStsByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_not_edi_flg, true);
			setValueEx(Cnd_edi_flg, true);
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_not_edi_flg, true);
			setValueEx(Cnd_edi_flg, false);
		}
		else if (Cnd_ope_SEND.isSelected() || Cnd_ope_RE_SEND.isSelected()) {
			setValueEx(Cnd_not_edi_flg, false);
			setValueEx(Cnd_edi_flg, true);
		}
		else {
			setValueEx(Cnd_not_edi_flg, true);
			setValueEx(Cnd_edi_flg, true);
		}
	}
	/**
	 * 検索条件（注文書発行状況）を設定します
	 */
	protected void setPoPrntStsByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_not_po_prnt_flg, false);
			setValueEx(Cnd_po_prnt_flg, false);
		}
		else {
			setValueEx(Cnd_not_po_prnt_flg, true);
			setValueEx(Cnd_po_prnt_flg, true);
		}
	}
	/**
	 * 検索条件（請書受領ＦＬＧ・請書受領日）を設定します
	 */
	protected void setPoConfRcptFlgByOpe(){
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_po_conf_rcpt_flg, false);
			setValueEx(Cnd_po_conf_rcpt_dt_fr, null);
			setValueEx(Cnd_po_conf_rcpt_dt_to, null);
		}
	}
	/**
	 * 検索条件（発注日）を設定します
	 */
	protected void setPoDtByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_po_dt_fr, null);
			setValueEx(Cnd_po_dt_to, null);
		}
	}
	/**
	 * 検索条件（入荷日時）を設定します
	 */
	protected void setCmplDtByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_arr_hm_fr, null);
			setValueEx(Cnd_arr_hm_to, null);
		}
	}
	/**
	 * 検索条件（購買状況区分）を設定します
	 */
	protected void setPurcStsTypByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_purc_sts_typ, null);
		}
	}
	/**
	 *　検索条件（進捗管理項目）を設定します
	 */
	protected void setApDptByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_ap_dpt_cd, null);
		}
	}
	/**
	 *　検索条件（進捗管理項目）を設定します
	 */
	protected void setKpiColByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_prms_dlv_dt_overdue_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_overdue_flg, false);
			setValueEx(Cnd_pr_arr_fr, null);
			setValueEx(Cnd_pr_arr_to, null);
			setValueEx(Cnd_pr_purc_fr, null);
			setValueEx(Cnd_pr_purc_to, null);
		}
	}
	/**
	 *　検索条件（備考項目）を設定します
	 */
	protected void setRmrksColByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_trd_rmrks, null);
			setValueEx(Cnd_intr_rmrks, null);
			setValueEx(Cnd_po_print_rmrks, null);
			setValueEx(Cnd_dlv_slip_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_trd_d_rmrks, null);
			setValueEx(Cnd_po_print_d_rmrks, null);
			setValueEx(Cnd_dlv_slip_d_rmrks, null);
			setValueEx(Cnd_sub_char1, null);
			setValueEx(Cnd_sub_char2, null);
			setValueEx(Cnd_sub_char3, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
		}
	}
	/**
	 * 検索条件（Ｉ／Ｖ取引対象）を設定します
	 */
	public void setIVTrgtFlg () {
		setValueEx(Cnd_iv_trgt_flg, true);
		setValueEx(Cnd_iv_not_trgt_flg, true);
	}
	/**
	 * 検索条件（諸口品ＦＬＧ）を設定します
	 */
	public void setSundryItmFlg () {
		if (Cnd_disp_unit_Dtl.isSelected()) {
			setValueEx(Cnd_sundry_itm_flg, true);
			setValueEx(Cnd_not_sundry_itm_flg, true);
		}
	}
	
	public void setArrSts() {
		if (Cnd_disp_unit_Dtl.isSelected() && Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_not_arr_flg, true);
			setValueEx(Cnd_part_arr_flg, true);
			setValueEx(Cnd_arr_compl_flg, true);
		}
		else if (Cnd_disp_unit_Dtl.isSelected() && Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_not_arr_flg, true);
			setValueEx(Cnd_part_arr_flg, false);
			setValueEx(Cnd_arr_compl_flg, false);
		}
		else {
			setValueEx(Cnd_not_arr_flg, false);
			setValueEx(Cnd_part_arr_flg, false);
			setValueEx(Cnd_arr_compl_flg, false);
		}
	}

	public void setPurcSts() {
		if (Cnd_disp_unit_Dtl.isSelected() && Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_not_purc_flg, true);
			setValueEx(Cnd_part_purc_flg, true);
			setValueEx(Cnd_purc_compl_flg, true);
		}
		else if (Cnd_disp_unit_Dtl.isSelected() && Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_not_purc_flg, true);
			setValueEx(Cnd_part_purc_flg, false);
			setValueEx(Cnd_purc_compl_flg, false);
		}
		else {
			setValueEx(Cnd_not_purc_flg, false);
			setValueEx(Cnd_part_purc_flg, false);
			setValueEx(Cnd_purc_compl_flg, false);
		}
	}

	public void setPurcIFSts() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_purc_if_tgt_flg, false);
			setValueEx(Cnd_not_purc_if_tgt_flg, false);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_purc_if_tgt_flg, false);
			setValueEx(Cnd_not_purc_if_tgt_flg, true);
		}
		else if (Cnd_ope_REF.isSelected() || Cnd_ope_PRNT.isSelected()
				|| Cnd_ope_SEND.isSelected() || Cnd_ope_RE_SEND.isSelected()) {
			setValueEx(Cnd_purc_if_tgt_flg, true);
			setValueEx(Cnd_not_purc_if_tgt_flg, true);
		}
	}
	/**
	 * 検索条件（納品書発行状況）を設定します
	 */
	protected void setDlvPrntStsByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_not_dlv_prnt_flg, false);
			setValueEx(Cnd_dlv_prnt_flg, false);
		}
		else {
			setValueEx(Cnd_not_dlv_prnt_flg, true);
			setValueEx(Cnd_dlv_prnt_flg, true);
		}
	}
	/**
	 * 検索条件（仕入直送納品書発行状況）を設定します
	 */
	protected void setPurcDdlvDlvPrntStsByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_not_purc_ddlv_dlv_prnt_flg, false);
			setValueEx(Cnd_purc_ddlv_dlv_prnt_flg, false);
		}
		else {
			setValueEx(Cnd_not_purc_ddlv_dlv_prnt_flg, true);
			setValueEx(Cnd_purc_ddlv_dlv_prnt_flg, true);
		}
	}

	/**
	 * 一括設定内容を反映します。
	 * @param r
	 */
	protected void bulkSet(MCBeans b, DtlR r) {
		if (!r.isGUIVisible()) {
			return;
		}
		if (!r.check()) {
			return;
		}
		if (b == columnDtl_po_dt && isEditable(columnDtl_po_dt, r.getGUIIndex())) {
			setValueEx(columnDtl_po_dt, r.getGUIIndex(), BulkSet_po_dt.getValue());
		}
		if (b == columnDtl_purc_usr_cd && isEditable(columnDtl_purc_usr_cd, r.getGUIIndex())) {
			r.purc_usr_cd(BulkSet_purc_usr_cd.getValue());
			r.purc_usr_nm(BulkSet_purc_usr_nm.getValue());
		}
		if (b == columnDtl_purc_dpt_cd && isEditable(columnDtl_purc_dpt_cd, r.getGUIIndex())) {
			r.purc_usr_cd(BulkSet_purc_usr_cd.getValue());
			r.purc_usr_nm(BulkSet_purc_usr_nm.getValue());
			r.purc_dpt_cd(BulkSet_purc_dpt_cd.getValue());
			r.purc_dpt_nm(BulkSet_purc_dpt_nm.getValue());
			r.purc_dpt_wg_cd(BulkSet_purc_dpt_wg_cd.getValue());
			r.purc_dpt_wg_nm(BulkSet_purc_dpt_wg_nm.getValue());
			r.ap_dpt_flg(BulkSet_ap_dpt_flg.getValue());
			if (isNull(r.mst_ap_dpt_cd())) {			
				if (isNull(r.purc_dpt_cd())) {
					r.ap_dpt_cd(null);
					r.ap_dpt_nm(null);
				}		
				else {		
					if (r.ap_dpt_flg()) {
						r.ap_dpt_cd(r.purc_dpt_cd());
						r.ap_dpt_nm(r.purc_dpt_nm());
					}	
					else {	
						r.ap_dpt_cd(null);
						r.ap_dpt_nm(null);
					}	
				}		
			}
		}
	}
	/**
	 * 行追加時の初期値を設定します。
	 * @param r
	 */
	protected void setDefault(DtlR r) {
		if (Cnd_ope_INS.isSelected()) {
			// 基準単位
			setValueEx(columnDtl_base_cur_cd, r.getGUIIndex(), getBaseCur().cur_cd());
			setValueEx(columnDtl_base_cur_nm, r.getGUIIndex(), getBaseCur().cur_nm());
			setValueEx(columnDtl_base_cur_amt_dec_place, r.getGUIIndex(), getBaseCur().amt_dec_place());
			setValueEx(columnDtl_base_cur_upri_dec_place, r.getGUIIndex(), getBaseCur().upri_dec_place());
			// 納税通貨
			setValueEx(columnDtl_ptax_cur_cd, r.getGUIIndex(), getPtaxCur().cur_cd());
			setValueEx(columnDtl_ptax_cur_nm, r.getGUIIndex(), getPtaxCur().cur_nm());
			setValueEx(columnDtl_ptax_cur_amt_dec_place, r.getGUIIndex(), getPtaxCur().amt_dec_place());
			setValueEx(columnDtl_ptax_cur_upri_dec_place, r.getGUIIndex(), getPtaxCur().upri_dec_place());
			// 為替レート
			setValueEx(columnDtl_xrate_cd, r.getGUIIndex(), getCo().purc_xrate_cd());
			// 源泉税
			setValueEx(columnDtl_wtax_rnd_typ, r.getGUIIndex(), getCo().wtax_rnd_typ());
		}
	}
	
	/**
	 * 同一ヘッダの明細をチェックします。
	 * @param dtlR
	 */
	protected void checkDtl(DtlR dtlR) {
		if (!Cnd_ope_BNDL.isSelected()) {
			return;
		}
		if (!dtlR.check()) {
			return;
		}
		if (BulkSet_collect_flg.getValue()) {
			// イベントを起こすと無限に続くため、setValueExは使わない。
			getDtlL().setBooleanNE(DtlR.$check, false);
			for (DtlR r : getDtlL()) {
				if (isHdrSameCol(dtlR, r)) {
					// イベントを起こすと無限に続くため、setValueExは使わない。
					r.check(true);
					r.setStatus(Status.MODIFY);
				}
			}
		}
	}
	protected boolean isHdrSameCol (DtlR dtlR, DtlR r) {
		if (isSameCol(columnDtl_trd_cd, dtlR, r)
				&& isSameCol(columnDtl_purc_dpt_cd, dtlR, r)
				&& isSameCol(columnDtl_purc_usr_cd, dtlR, r)
				&& isSameCol(columnDtl_sppl_cd, dtlR, r)
				&& isSameCol(columnDtl_sppl_nm, dtlR, r)
				&& isSameCol(columnDtl_sppl_cntct_dpt, dtlR, r)
				&& isSameCol(columnDtl_sppl_cntct_psn, dtlR, r)
				&& isSameCol(columnDtl_sppl_zip_cd, dtlR, r)
				&& isSameCol(columnDtl_sppl_addr1, dtlR, r)
				&& isSameCol(columnDtl_sppl_addr2, dtlR, r)
				&& isSameCol(columnDtl_sppl_addr3, dtlR, r)
				&& isSameCol(columnDtl_sppl_addr4, dtlR, r)
				&& isSameCol(columnDtl_sppl_tel, dtlR, r)
				&& isSameCol(columnDtl_sppl_fax, dtlR, r)
				&& isSameCol(columnDtl_trd_cur_cd, dtlR, r)
				&& isSameCol(columnDtl_xrate, dtlR, r)
				&& isSameCol(columnDtl_xrate_inpt_flg, dtlR, r)
				&& isSameCol(columnDtl_ptax_xrate, dtlR, r)
				&& isSameCol(columnDtl_ptax_xrate_inpt_flg, dtlR, r)
				&& isSameCol(columnDtl_wrk_no, dtlR, r)
				) {
			return true;
		}
		else {
			return false;
		}
	}
	protected boolean isSameCol(MCColumnConfig column, DtlR src, DtlR desc) {
		boolean rslt = false;
		rslt = isSame(column.getValue(src.getGUIIndex()), column.getValue(desc.getGUIIndex()));

		return rslt;
	}
	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR
	 */
	protected void setIvItmNm(DtlR dtlR) {
		if (!dtlR.sppl_iv_flg()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(dtlR.prnt_lcl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			}
			else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	/**
	 * 発注先品目・品名を設定します
	 * @param dtlR
	 */
	protected void setSpplItm(DtlR dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(dtlR.sppl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.po_dt(), this);
		if (isNull(row)) {
			setValueEx(columnDtl_sppl_itm_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_sppl_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl_sppl_itm_cd, dtlR.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnDtl_sppl_itm_nm, dtlR.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	/**
	 * 税初期値を設定します。
	 * @param dtlR
	 * @param setTaxFixFlg
	 */
	protected void setDefaultTaxCd(DtlR dtlR, boolean setTaxFixFlg) {
		if (isNonPurc(dtlR)) {
			return;
		}
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.sppl_cd(), 
				getPurcUpriBaseDt(dtlR), 
				this);
		setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), taxCd);
		if (setTaxFixFlg) {
			dtlR.tax_fix_flg(false);
		}
	}
	
	protected MCDate getPurcUpriBaseDt(DtlR dtlR) {
		if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.po_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.dlv_rqst_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.purc_schd_dt();
		}
		return null;
	}
	
	/**
	 * 支払繰越回数初期値を設定します
	 */
	protected void setDefaultPayCrryovrTimes(DtlR dtlR) {
		if (isEditable(columnDtl_pay_crryovr_times, dtlR.getGUIIndex())) {
			if (!isNull(dtlR.itm_pay_crryovr_times())) {
				setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.itm_pay_crryovr_times());
			}
			else {
				setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.sppl_pay_crryovr_times());
			}
		}
		else {
			setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), null);
		}
	}
	
	/**
	 * 購買識別区分初期値を設定します
	 * @param dtlR
	 */
	protected void setDefaultPurcIdTyp(DtlR dtlR) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
			setValueEx(columnDtl_purc_id_typ, dtlR.getGUIIndex(), MAC_PURC_ID_TYP.PURC.value());
		}
	}
	
	/**
	 * 仕入計上区分初期値を設定します
	 * @param dtlR
	 */
	protected void setDefaultPurcBasisTyp(DtlR dtlR) {
		if (isPurcDdlv(dtlR)) {
			if (!MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())) {
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
		}
		else if (dtlR.arr_skip_flg()) {
			if (!MAC_PURC_BASIS_TYP.isIN_BASIS(dtlR.purc_basis_typ())) {
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
		}
		else if (isNonPurc(dtlR)) {
			if (!MAC_PURC_BASIS_TYP.isIN_BASIS(dtlR.purc_basis_typ())) {
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
		}
		else if (dtlR.subcon_flg()) {
			if (!MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())) {
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
		}
	}
	
	/**
	 * 直納区分を設定します
	 * @param dtlR
	 */
	protected void setDrctDlvTyp(DtlR dtlR) {
		if (isNullAnd(dtlR.in_to_loc_cd(), dtlR.dlv_cd())) {
			setValueEx(columnDtl_drct_dlv_typ, dtlR.getGUIIndex(), null);
		}
		else if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			setValueEx(columnDtl_drct_dlv_typ, dtlR.getGUIIndex(), MSC_DRCT_DLV_TYP.VIA.value());
		} 
		else {
			setValueEx(columnDtl_drct_dlv_typ, dtlR.getGUIIndex(), MSC_DRCT_DLV_TYP.DDLV.value());
		}
	}
	
	/**
	 * 同時計上ＦＬＧ
	 * @param r
	 */
	protected void setSyncFlg(DtlR r) {
		if (isPurcDdlv(r)) {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), true);
		}
		else if (r.arr_skip_flg()) {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), false);
		}
		else if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			if (!isNull(r.dlv_rqst_dt()) && !r.dlv_rqst_dt().eqDate(r.purc_schd_dt())) {
				setValueEx(columnDtl_purc_schd_dt, r.getGUIIndex(), r.dlv_rqst_dt().trunc(MCDateFieldType.DAY));
			}
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), true);
		}
		else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
			if (isNonPurc(r) && !isNull(r.purc_schd_dt())) {
				setValueEx(columnDtl_purc_schd_dt, r.getGUIIndex(), null);
			}
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), false);
		}
		else if (isNull(r.dlv_rqst_dt()) || isNull(r.purc_schd_dt())) {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), false);
		}
		// 入荷不要の品目は入荷実績を作成しないので、同時ＦＬＧをオンにしない
		else if(r.dlv_rqst_dt().eqDate(r.purc_schd_dt()) && (!r.arr_skip_flg())) {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), false);
		}
	}
	
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(DtlR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}
	/**
	 * 源泉税率取得
	 * @param r
	 */
	protected void setWtaxRate(DtlR r) {
		if (canEditWtaxRate(r)) {
			// 源泉税率取得
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getPurcUpriBaseDt(r),
					this);
			setValueEx(columnDtl_wtax_rate, r.getGUIIndex(), wtaxRate);
		}
		else {
			clearWtaxRate(r);
		}
	}
	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlR dtlR) {
		if (isNull(dtlR.in_to_loc_cd()) || !dtlR.str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.in_to_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtl_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}
	/**
	 * 納品書対象外フラグを設定する
	 */
	protected void setDlvSlipInvldFlg(DtlR dtlR) {
		dtlR.dlv_slip_invalid_flg(dtlR.arr_skip_flg() && !dtlR.purc_dlv_slip_flg());
	}
	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param dtlR
	 */
	protected void setRepurcObliTax(DtlR dtlR) {
		if(isNull(dtlR.trd_cur_cd()) || (isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri()))) {
			return;
		}
		// 金額 = (単価:加工単価 + 有償支給単価)×数量
		MCNumber amt =  MAUCP_AmtUtil.getAmt(dtlR.trd_cur_upri(),
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
		if(!dtlR.outsrc_flg()) {
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
	/**
	 * 予定日を設定します
	 */
	protected void setSchdDt(DtlR dtlR) {
		MCRow rslt = MCRow.create();
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (!isNullOrNullVal(sysParm) && isSame(sysParm , "1")) {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR, MSUCP_PurcUtil.$dlv_rqst_dt), dtlR.rqst_avl_rqst_dt(), sysParm);
			setSchdDt(MSUCP_PurcUtil.$dlv_rqst_dt, dtlR, rslt);
		} else {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR), null ,sysParm);
			setSchdDt(dtlR, rslt);
		}
	}
	// -----------------------------------------------
	// 値の設定（クリア）
	// -----------------------------------------------
	/**
	 * 版ＮＯをクリアします。
	 */
	protected void clearVerNo(DtlR dtlR) {
		setValueEx(columnDtl_ver_no, dtlR.getGUIIndex(), null);
	}
	/**
	 * 仕入理由をクリアします。
	 * @param dtlR
	 */
	protected void clearPurcRsnCd(DtlR dtlR) {
		if (!isSame(MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()), dtlR.xpns_purc_flg())) {
			setValueEx(columnDtl_purc_rsn_cd, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 取引通貨単価をクリアします。
	 * @param dtlR
	 */
	protected void clearTrdCurUpri(DtlR dtlR) {
		dtlR.trd_cur_proc_upri(null);
		dtlR.trd_cur_onr_prov_upri(null);
		dtlR.trd_cur_proc_amt(null);
		dtlR.trd_cur_onr_prov_amt(null);
		setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), null);
		setBaseCurAmt(dtlR);
		setPtaxCurAmt(dtlR);
	}
	/**
	 * 金額項目をクリアします(行指定)
	 * @param dtlR
	 */
	protected void clearAmtInfo(DtlR dtlR) {
		setValueEx(columnDtl_upri_not_tgt_flg, dtlR.getGUIIndex(), false);
		setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_trd_cur_proc_upri, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_interim_flg, dtlR.getGUIIndex(), false);
		setValueEx(columnDtl_trd_cur_dscnt_amt, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_wtax_rate, dtlR.getGUIIndex(), null);
		setValueEx(columnDtl_tax_fix_flg, dtlR.getGUIIndex(), false);
	}
	/**
	 * 購買識別区分をクリアします
	 * @param dtlR
	 */
	protected void clearPurcIdTyp(DtlR dtlR) {
		if (!isMatchPurcIdTyp(dtlR, dtlR.purc_id_typ())) {
			setValueEx(columnDtl_purc_id_typ, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 源泉税率をクリアします
	 * @param dtlR
	 */
	protected void clearWtaxRate(DtlR dtlR) {
		if (!canEditWtaxRate(dtlR)) {
			setValueEx(columnDtl_wtax_rate, dtlR.getGUIIndex(), null);
		}
	}
	// -----------------------------------------------
	// リスト取得
	// -----------------------------------------------
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ())) {
			row.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
		}
		return super.getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
	}
	@Override
	public MCList<?> getDtl_sppl_cd(MCRow row, MCEventInfo info) {
		// 外注の場合、製造場所から外注先を取得
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (dtlR.outsrc_flg()) {
			row.setBooleanNE("inc_outsrc_flg", true);
		}
		if (!isNull(dtlR.po_schd_no())) {
			row.setBooleanNE("inc_outsrc_flg", false);
		}
		MCList<?> rslt = super.getDtl_sppl_cd(row, info);
		// 発注先に応じて購買識別区分を取得。単価が必要に場合は初期化する
		if (isNonPurc(dtlR)) {
			for (MCRow r : rslt) {
				r.setStringNE("purc_upri_req_typ", null);
				r.setNumberNE("pay_crryovr_times", null);
			}
		}
		return rslt; 
	}
	@Override
	public MCList<?> getDtl_purc_rsn_cd(MCRow row, MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if(MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())){
			row.setBooleanNE("xpns_purc_flg", true);
		}
		else {
			row.setBooleanNE("not_xpns_purc_flg", true);
		}
		return super.getDtl_purc_rsn_cd(row, info);
	}
	@Override
	public MCList<MCRow> getDtl_purc_id_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> tmpL = super.getDtl_purc_id_typ(row, info);
		MCList<MCRow> rsltL = MCList.create(MCRow.class);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		for (MCRow r : tmpL) {
			if (isMatchPurcIdTyp(dtlR, r.getStringNE(MAC_PURC_ID_TYP.$VALUE))) {
				rsltL.add(r);
			}
		}
		return rsltL;
	}
	/**
	 * 予定のある発注時に入力可能な項目であるかを判定します。
	 * @param column
	 * @return
	 */
	protected boolean isEditableColWhenSchd(MCColumnConfig column) {
		if (column == columnDtl_trd_cd 
				|| Dtl_itm_p_PPanel.isItm(column) 
				|| column == columnDtl_po_schd_dt 
				|| column == columnDtl_rqst_avl_rqst_dt) {
			return false;
		}
		return true;
	}
	/**
	 * 経費購買か否かを判定します
	 * @param r
	 * @return
	 */
	protected boolean isPurcXpns(DtlR dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	/**
	 * 適切な購買識別区分であるか否かを判定します。
	 * @param dtlR
	 * @param purcIdTyp
	 * @return
	 */
	protected boolean isMatchPurcIdTyp(DtlR dtlR, String purcIdTyp) {

		//---------------------------------------
		//　通常以外不可な場合
		//---------------------------------------
		if (!MAC_PURC_ID_TYP.isPURC(purcIdTyp)) {
			if (isPurcDdlv(dtlR)) {
				// 仕入直送は通常購買のみ
				return false;
			}
			if (dtlR.dscnt_itm_flg()) {
				// 値引品目は通常購買のみ
				return false;
			}
			//---------------------------------------
			// ＶＭＩが選択できる条件
			//---------------------------------------
			if (MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
				if (dtlR.outsrc_flg()) {
					// 外注不可
					return false;
				}
				if (MSC_DRCT_DLV_TYP.isDDLV(dtlR.drct_dlv_typ())) {
					// 支給直送不可
					return false;
				}
				if (!MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
					// 在庫管理しない品目不可
					return false;
				}
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
					// 資産管理しない品目の場合、ＶＭＩ不可
					return false;
				}
			}
			//---------------------------------------
			// 無償受給が選択できる条件
			//---------------------------------------
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				if (dtlR.outsrc_flg()) {
					// 外注
					return false;
				}
				if (dtlR.arr_skip_flg()) {
					// 入荷不要
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 次の業務を行っているか否かを判定します
	 * @return
	 */
	protected boolean doneNextOper(DtlR r) {
		if (r.next_opr_flg()) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 自伝票に次処理済みの明細が含まれるか
	 * @param dtlR
	 * @return
	 */
	protected boolean isContainDoneNexOper(DtlR dtlR) {
		MCList<DtlR> subL = getDtlL().subList(_dtlKey, dtlR.po_no());
		for (DtlR r : subL) {
			if(doneNextOper(r)) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean isNonPurc(DtlR r) {
		return MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ());
	}
	
	/**
	 * 表示単位にあわせて検索条件をクリアします。
	 */
	protected void clearCndByDispUnit() {
		if (Cnd_disp_unit_Hdr.isSelected()) {
			// 明細に対する検索条件をクリア
			setValueEx(Cnd_incl_abort_flg, false);
			setValueEx(Cnd_sundry_itm_flg, false);
			setValueEx(Cnd_not_sundry_itm_flg, false);
			setValueEx(Cnd_not_purc_flg, false);
			setValueEx(Cnd_part_purc_flg, false);
			setValueEx(Cnd_purc_compl_flg, false);
			setValueEx(Cnd_not_arr_flg, false);
			setValueEx(Cnd_part_arr_flg, false);
			setValueEx(Cnd_arr_compl_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_fr, null);
			setValueEx(Cnd_dlv_rqst_hm_fr, null);
			setValueEx(Cnd_dlv_rqst_dt_to, null);
			setValueEx(Cnd_dlv_rqst_hm_to, null);
			setValueEx(Cnd_rqst_dlv_rqst_dt_fr, null);
			setValueEx(Cnd_rqst_dlv_rqst_hm_fr, null);
			setValueEx(Cnd_rqst_dlv_rqst_dt_to, null);
			setValueEx(Cnd_rqst_dlv_rqst_hm_to, null);
			setValueEx(Cnd_po_schd_dt_fr, null);
			setValueEx(Cnd_po_schd_dt_to, null);
			setValueEx(Cnd_po_conf_rcpt_flg, false);
			setValueEx(Cnd_po_conf_rcpt_dt_fr, null);
			setValueEx(Cnd_po_conf_rcpt_dt_to, null);
			setValueEx(Cnd_dlv_inst_dt_fr, null);
			setValueEx(Cnd_dlv_inst_dt_to, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_hm_to, null);
			setValueEx(Cnd_arr_hm_fr, null);
			setValueEx(Cnd_purc_sts_typ, null);
			setValueEx(Cnd_bp_lot_no, null);
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_site_nm, null);
			setValueEx(Cnd_in_to_loc_wg_cd, null);
			setValueEx(Cnd_in_to_loc_wg_nm, null);
			setValueEx(Cnd_in_to_loc_cd, null);
			setValueEx(Cnd_in_to_loc_nm, null);
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_typ_d_nm, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_cst_itm_nm, null);
			setValueEx(Cnd_ver_no, null);
			setValueEx(Cnd_sno1, null);
			setValueEx(Cnd_sno2, null);
			setValueEx(Cnd_sno3, null);
			setValueEx(Cnd_sno4, null);
			setValueEx(Cnd_wrk_no, null);
			setValueEx(Cnd_wrk_nm, null);
			setValueEx(Cnd_asset_mng_typ, null);
			setValueEx(Cnd_ap_dpt_cd, null);
			setValueEx(Cnd_ap_dpt_nm, null);
			setValueEx(Cnd_drct_dlv_typ, null);
			setValueEx(Cnd_po_schd_src_typ, null);
			setValueEx(Cnd_po_schd_src_no, null);
			setValueEx(Cnd_po_schd_no, null);
			setValueEx(Cnd_rqst_fr_usr_cd, null);
			setValueEx(Cnd_rqst_fr_usr_nm, null);
			setValueEx(Cnd_rqst_fr_dpt_cd, null);
			setValueEx(Cnd_rqst_fr_dpt_nm, null);
			setValueEx(Cnd_po_d_no, null);
			setValueEx(Cnd_slo_no, null);
			setValueEx(Cnd_slo_d_no, null);
			setValueEx(Cnd_maker_cd, null);
			setValueEx(Cnd_maker_nm, null);
			setValueEx(Cnd_ext_po_d_no, null);
			setValueEx(Cnd_prms_dlv_dt_overdue_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_overdue_flg, false);
			setValueEx(Cnd_pr_arr_fr, null);
			setValueEx(Cnd_pr_arr_to, null);
			setValueEx(Cnd_pr_purc_fr, null);
			setValueEx(Cnd_pr_purc_to, null);
			setValueEx(Cnd_po_cnt_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_trd_d_rmrks, null);
			setValueEx(Cnd_po_print_d_rmrks, null);
			setValueEx(Cnd_dlv_slip_d_rmrks, null);
			setValueEx(Cnd_po_schd_sub_char1, null);
			setValueEx(Cnd_po_schd_sub_char2, null);
			setValueEx(Cnd_po_schd_sub_char3, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			clearContainers(getCndR().itm_grp_p());
		}
		setValueEx(Cnd_inc_past_flg, false);
	}
	/**
	 * 操作種別にあわせて検索条件をクリアします。
	 */
	protected void clearCndByOpe() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
			setValueEx(Cnd_po_dt_fr, null);
			setValueEx(Cnd_po_dt_to, null);
			setValueEx(Cnd_po_conf_rcpt_flg, false);
			setValueEx(Cnd_po_conf_rcpt_dt_fr, null);
			setValueEx(Cnd_po_conf_rcpt_dt_to, null);
			setValueEx(Cnd_dlv_inst_dt_fr, null);
			setValueEx(Cnd_dlv_inst_dt_to, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_purc_sts_typ, null);
			setValueEx(Cnd_bp_lot_no, null);
			setValueEx(Cnd_ap_dpt_cd, null);
			setValueEx(Cnd_po_no, null);
			setValueEx(Cnd_po_d_no, null);
			setValueEx(Cnd_aprv_no, null);
			setValueEx(Cnd_ext_sys_cd, null);
			setValueEx(Cnd_ext_sys_nm, null);
			setValueEx(Cnd_ext_po_no, null);
			setValueEx(Cnd_ext_po_d_no, null);
			setValueEx(Cnd_prms_dlv_dt_overdue_flg, false);
			setValueEx(Cnd_dlv_rqst_dt_overdue_flg, false);
			setValueEx(Cnd_pr_arr_fr, null);
			setValueEx(Cnd_pr_arr_to, null);
			setValueEx(Cnd_pr_purc_fr, null);
			setValueEx(Cnd_pr_purc_to, null);
			setValueEx(Cnd_trd_rmrks, null);
			setValueEx(Cnd_intr_rmrks, null);
			setValueEx(Cnd_po_print_d_rmrks, null);
			setValueEx(Cnd_dlv_slip_d_rmrks, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_trd_d_rmrks, null);
			setValueEx(Cnd_po_print_d_rmrks, null);
			setValueEx(Cnd_dlv_slip_d_rmrks, null);
			setValueEx(Cnd_sub_char1, null);
			setValueEx(Cnd_sub_char2, null);
			setValueEx(Cnd_sub_char3, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			setValueEx(Cnd_edi_flg, true);
			setValueEx(Cnd_not_edi_flg, true);
		}
		if (Cnd_ope_SEND.isSelected() || Cnd_ope_RE_SEND.isSelected()) {
			setValueEx(Cnd_incl_can_flg, false);
		}
		else {
			setValueEx(Cnd_data_no, null);
		}

		setValueEx(Cnd_inc_past_flg, false);
	}
	// -----------------------------------------------
	// 単価再取得
	// -----------------------------------------------
	/**
	 * 単価再取得対象の明細を取得します。
	 */
	protected MCList<DtlR> getSprtTgtDtlL() {
		MCList<DtlR> upL = MCList.create(DtlR.class);
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (isTgt(r)){
				upL.add(r);
			}
		}
		return upL;
	}
	/**
	 * 単価再取得対象かどうかを判定します。
	 * @param r
	 * @return
	 */
	protected boolean isTgt(DtlR r) {
		return  r.check() &&
				!r.upri_not_tgt_flg() && 
				!r.isStatusDelete() && 
				!isNonPurc(r) &&
				!r.isEmpty();
	}
	/**
	 * 単価再取得処理を実行します。
	 * @return 単価再取得処理中にエラーが起きた場合true
	 */
	protected boolean hasErr() {
		@SuppressWarnings("rawtypes")
		MSBDP_PoListReg.MS_MSBDL0090_Sprt02Caller caller = createMS_MSBDL0090_Sprt02();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		return caller.getErrorFlg();
	}
	/**
	 * 単価をキャッシュする。
	 */
	protected void cacheUpri(DtlR dtlR) {
		dtlR.old_trd_cur_upri(dtlR.trd_cur_upri());
		dtlR.old_trd_cur_proc_upri(dtlR.trd_cur_proc_upri());
		dtlR.old_trd_cur_onr_prov_upri(dtlR.trd_cur_onr_prov_upri());
		dtlR.old_interim_flg(dtlR.interim_flg());
		dtlR.old_trd_cur_dscnt_amt(dtlR.trd_cur_dscnt_amt());
		dtlR.old_dscnt_rsn_cd(dtlR.dscnt_rsn_cd());
		dtlR.old_dscnt_rsn_nm(dtlR.dscnt_rsn_nm());
	}
	/**
	 * 単価をキャッシュした値に戻す。
	 */
	protected void restoreUpri(DtlR dtlR) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.old_trd_cur_upri();
		MCNumber procUpri = dtlR.old_trd_cur_proc_upri();
		MCNumber onrProvUpri = dtlR.old_trd_cur_onr_prov_upri();
		boolean interimFlg = dtlR.old_interim_flg();
		setValueEx(columnDtl_trd_cur_upri, idx, upri);
		setValueEx(columnDtl_trd_cur_proc_upri, idx, procUpri);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, idx, onrProvUpri);
		setValueEx(columnDtl_interim_flg, idx, interimFlg);
		setValueEx(columnDtl_trd_cur_dscnt_amt, idx, dtlR.old_trd_cur_dscnt_amt());
		setValueEx(columnDtl_dscnt_rsn_cd, idx, dtlR.old_dscnt_rsn_cd());
	}
	/**
	 * 単価のイベントを発生させる。
	 */
	protected void doUpriEvent(DtlR dtlR, MCMessageList msgL) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.trd_cur_upri();
		MCNumber procUpri = dtlR.trd_cur_proc_upri();
		MCNumber onrProvUpri = dtlR.trd_cur_onr_prov_upri();
		// 同一値でイベントを発生させるために一度クリアする
		
		// 一度単価をクリアするとイベントで値引額がクリアされるので保持する
		MCNumber dscntAmt = dtlR.trd_cur_dscnt_amt();
		String dscntRsnCd = dtlR.dscnt_rsn_cd();
		String dscntRsnNm = dtlR.dscnt_rsn_nm();
		setValueEx(columnDtl_trd_cur_upri, idx, null);
		
		setValueEx(columnDtl_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, idx, null);
		// イベントを発生させる
		setValueEx(columnDtl_trd_cur_upri, idx, upri);
		setValueEx(columnDtl_trd_cur_proc_upri, idx, procUpri);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, idx, onrProvUpri);
		if ((!isNull(dtlR.trd_cur_amt()) && !isNull(dscntAmt) && dtlR.trd_cur_amt().lt(dscntAmt))
				|| (isNull(upri) && !isNull(dscntAmt))) {
			// 金額<値引額のときと、元々は単価・値引額が入力されていたがマスタ単価が取得できず値引額が残ってしまった場合は、値引額をクリアする
			msgL.add(new MCMessage(dtlR, null, MSBDP0036, dscntAmt, dscntRsnCd, dscntRsnNm, toDispGUIIndex(dtlR)));
			setValueEx(columnDtl_trd_cur_dscnt_amt, idx, null);
			setValueEx(columnDtl_dscnt_rsn_cd, idx, null);
		}
		else {
			setValueEx(columnDtl_trd_cur_dscnt_amt, idx, dscntAmt);
			setValueEx(columnDtl_dscnt_rsn_cd, idx, dscntRsnCd);
		}
	}
	/**
	 * 異なる単価の明細が含まれるかどうかを判定します。
	 */
	protected void setDiffLatestUpriMsg(MCMessageList msgL, DtlR dtlR) {
		if (isNullOr(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			return;
		}
		if (!isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl_trd_cur_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
		}
		if (!isSame(dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl_trd_cur_proc_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri(), toDispGUIIndex(dtlR)));
		}
		if (!isSame(dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl_trd_cur_onr_prov_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri(), toDispGUIIndex(dtlR)));
		}
	}
	// -----------------------------------------------
	// fillspace
	// -----------------------------------------------
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		if (!_isSkipFillSpaceForOpen) {
			fillSpace();
		}
	}
	protected void fillSpace() {
		if (Cnd_ope_INS.isSelected()) {
			DtlTable.fillSpace();
		}
	}
	// -----------------------------------------------
	// ユーティリティ使用準備
	// -----------------------------------------------
	protected DtlR getSchdDtEditCnd(DtlR dtlR) {
		DtlR cnd = dtlR.clone();
		cnd.rqst_avl_rqst_dt(null);
		cnd.purc_schd_dt(null);
		cnd.po_dt(null);
		return cnd;
	}
	
	protected DtlR getSchdDtEditCnd(DtlR dtlR, String columnNm) {
		DtlR cnd = dtlR.clone();
		if (isSame(MSUCP_PurcUtil.$rqst_dlv_rqst_dt, columnNm)) {
			cnd.dlv_rqst_dt(null);
			cnd.purc_schd_dt(null);
		} 
		else if (isSame(MSUCP_PurcUtil.$dlv_rqst_dt, columnNm)) {
			cnd.rqst_avl_rqst_dt(null);
			cnd.purc_schd_dt(null);
		}
		return cnd;
	}
	
	/**
	 * 予定日を取得します
	 * @param dtlR
	 * @return
	 */
	protected MCRow callGetSchdDt(DtlR dtlR, MCDate baseDt, String sysParm) {
		if (isSame(sysParm, "1")) {
			if (isNullAnd(dtlR.dlv_rqst_dt(), dtlR.rqst_avl_rqst_dt())) {
				return MCRow.create();
			}
		} else {
			if (isNull(dtlR.dlv_rqst_dt())) {
				return MCRow.create();
			}
		}
		String lgGrpCd = null;
		if (!isNull(dtlR.tdlv_cd())) {
			lgGrpCd = dtlR.tdlv_lg_grp_cd();
		}
		else if (!isNull(dtlR.dlv_cd())) {
			lgGrpCd = dtlR.dlv_lg_grp_cd();
		}
		else {
			lgGrpCd = dtlR.lg_grp_cd();
		}
		return MSUCP_PurcUtil.getSchdDt(
				MCNumber.ONE, 
				dtlR.rqst_avl_rqst_dt(), 
				dtlR.dlv_rqst_dt(), 
				isSame(sysParm, "1") ? null : dtlR.po_dt(),
				dtlR.purc_schd_dt(), 
				dtlR.sppl_cd(), 
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.mfg_loc_cd(), 
				dtlR.maker_cd(), 
				dtlR.in_to_loc_wg_cd(), 
				dtlR.bom_ptn(), 
				dtlR.dlv_cd(), 
				dtlR.in_to_loc_cd(), 
				dtlR.site_cd(), 
				dtlR.outsrc_sppl_cd(),
				dtlR.sppl_cal_cd(), 
				dtlR.in_to_loc_cal_cd(), 
				dtlR.dlv_cal_cd(), 
				lgGrpCd,
				dtlR.base_unit_qty(), 
				isSame(sysParm, "1") ? baseDt : null,
				this);
	}
	
	/**
	 * 予定日反映
	 * @param dest
	 * @param src
	 */
	protected void setSchdDt(DtlR dest, MCRow src) {
		if (!isNull(src)) {
			if (isNull(dest.po_schd_no())) {
				dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
			}
			dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
			setPurcSchdDt(dest, src);
		}
		setRqstDlvRqstDt(dest);
		setSyncFlg(dest);
	}
	
	protected void setSchdDt(String col, DtlR dest, MCRow src) {
		if (!isNull(src)) {
			if (isSame(col, MSUCP_PurcUtil.$dlv_rqst_dt)) {
				if (isNull(dest.po_schd_no())) {
					dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
				}
				dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
				setPurcSchdDt(dest, src);
			}

		}
		setRqstDlvRqstDt(dest);
		setSyncFlg(dest);
		if (isSame(col, MSUCP_PurcUtil.$dlv_rqst_dt)) {
			setRqstAvlRqstDt(dest, src);
		}
	}
	
	/**
	 * 仕入予定日を算出します
	 * @param dest
	 * @param src
	 */
	protected void setPurcSchdDt(DtlR dest, MCRow src) {
		if (!isNonPurc(dest)) {
			// 仕入が発生する場合
			
			if (isPurcDdlv(dest)) {
				// 仕入直送の場合
				setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), dest.dlv_rqst_dt());	
			}
			else if (dest.subcon_flg()) {
				// 下請対象の場合
				setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), dest.dlv_rqst_dt());
			}
			else if (MAC_PURC_BASIS_TYP.isARR_BASIS(dest.purc_basis_typ())) {
				// 仕入計上区分：入荷基準の場合
				setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), dest.dlv_rqst_dt());
			}
			else {
				setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
			}
		}
	}
	
	/**
	 * 仕入直送であるか否かを判定します。
	 * @param dtlR
	 * @return true:仕入直送/false:仕入直送ではない
	 */
	protected boolean isPurcDdlv(DtlR dtlR) {
		return !isNull(dtlR.dlv_cd());
	}
	
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(DtlR dtlR) {
		String purcIdTyp = dtlR.purc_id_typ();
		String trdCurCd = dtlR.trd_cur_cd();
		String baseCurCd = dtlR.base_cur_cd();
		String ptaxCurCd = dtlR.ptax_cur_cd();
		
		if (MAC_PURC_ID_TYP.isVMI(purcIdTyp)
				|| MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
			return false;
		}
		else {
			if (isSame(trdCurCd, baseCurCd)
					&& (isSame(trdCurCd, ptaxCurCd) || isNull(ptaxCurCd))) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/**
	 * 訂正理由が編集可能かどうか（注文書を一度でも出力したことがあるかどうか）を判定します。
	 *　<pre>　
	 * ・登録直後⇒改訂1・注文書発行済ＦＬＧオフ⇒編集不可
	 * ・登録後注文書印刷済⇒改訂1・注文書発行済ＦＬＧオン⇒編集可
	 * ・登録後注文書未発行状態で更新⇒改訂1・注文書発行済ＦＬＧオフ⇒編集不可
	 * ・登録後注文書発行後に更新⇒改訂2・注文書発行済ＦＬＧオフ⇒編集可
	 * </pre>
	 * @return
	 */
	protected boolean editablePoCrctRsn (DtlR dtlR) {
		if (!isSame(dtlR.po_rev(), MCNumber.ONE) || dtlR.po_print_flg() || dtlR.last_edi_flg()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setBNDLStatus() {
		setBlkColFlg();
		super.setBNDLStatus();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setInstImmedPrntFlgMode();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
	}

	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		if (Cnd_ope_SEND.isSelected()
			|| Cnd_ope_RE_SEND.isSelected()) {
			Cnd_disp_unit_Group.setMode(MCMode.READ_ONLY);
			Cnd_opn_flg.setMode(MCMode.READ_ONLY);
			Cnd_fix_flg.setMode(MCMode.READ_ONLY);
			Cnd_acpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_rjct_flg.setMode(MCMode.READ_ONLY);
			Cnd_last_rjct_flg.setMode(MCMode.READ_ONLY);
			Cnd_aprv_invalid_flg.setMode(MCMode.READ_ONLY);
			Cnd_edi_flg.setMode(MCMode.READ_ONLY);
			Cnd_not_edi_flg.setMode(MCMode.READ_ONLY);
			Cnd_purc_if_tgt_flg.setMode(MCMode.READ_ONLY);
			Cnd_not_purc_if_tgt_flg.setMode(MCMode.READ_ONLY);
			Cnd_incl_can_flg.setMode(MCMode.READ_ONLY);
			setDefaultMode(Cnd_data_no);
			Btn_ins.setMode(MCMode.INVISIBLE);
			Btn_upd.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Cnd_disp_unit_Group);
			setDefaultMode(Cnd_opn_flg);
			setDefaultMode(Cnd_fix_flg);
			setDefaultMode(Cnd_acpt_flg);
			setDefaultMode(Cnd_rjct_flg);
			setDefaultMode(Cnd_last_rjct_flg);
			setDefaultMode(Cnd_aprv_invalid_flg);
			setDefaultMode(Cnd_edi_flg);
			setDefaultMode(Cnd_not_edi_flg);
			setDefaultMode(Cnd_purc_if_tgt_flg);
			setDefaultMode(Cnd_not_purc_if_tgt_flg);
			setDefaultMode(Cnd_incl_can_flg);
			Cnd_data_no.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_ins);
			Btn_upd.setMode(MCMode.INVISIBLE);
		}
		setModeToInclCanFlg();
	}

	@Override
	public void setSRCH_DTLStatus() {
		super.setSRCH_DTLStatus();
	}

	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setModeToInclCanFlg();
	}

	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
	}

	@Override
	public void setPRNT_HDRStatus() {
		super.setPRNT_HDRStatus();
		setModeToInclCanFlg();
	}
	@Override
	public void setDEL_HDRStatus() {
		super.setDEL_HDRStatus();
	}
	@Override
	public void setDEL_DTLStatus() {
		super.setDEL_DTLStatus();
	}

	protected void setBlkColFlg() {
		if (Cnd_ope_BNDL.isSelected()) {
			setValueEx(BulkSet_collect_flg, true);
		}
		else {
			setValueEx(BulkSet_collect_flg, false);
		}
	}
	
	// -----------------------------------------------
	// ファイル取り込み
	// -----------------------------------------------	
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == DtlTable) {
			return Cnd_ope_INS.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBDL0090_Imp01();
	}
	// -----------------------------------------------
	// If
	// -----------------------------------------------
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		DtlR r = (DtlR)srcRow;
		if (isNull(r.purc_usr_cd())) {
			bulkSet(columnDtl_purc_usr_cd, r);
		}
		if (isNull(r.purc_dpt_cd())) {
			bulkSet(columnDtl_purc_dpt_cd, r);
		}
		setDefault(r);
	}
	@Override
	public MCTable<DtlR> getListRegTable() {
		return DtlTable;
	}

	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			if (Cnd_ope_INS.isSelected() || Cnd_ope_BNDL.isSelected()) {
				return;
			}
			DtlR r = getDtlL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			openMSBD0080(info);
		}
	}

	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("sppl_cd"))) {
					row.setValue("sppl_cd", null);
				}
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("bom_ptn"))) {
					row.setValue("bom_ptn", null);
				}
				return super.setValues(index, row);
			}
		};
		MCListPutter slp = super.createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(compo, columns);
		lp.setListLogicId(slp.getListLogicId());
		return lp;
	}
	
	@Override
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(
			MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("sppl_cd"))) {
					row.setValue("sppl_cd", null);
				}
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("bom_ptn"))) {
					row.setValue("bom_ptn", null);
				}
				return super.setValues(index, row);
			}
		};
		MCListPutter slp = super.createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(compo, columns);
		lp.setListLogicId(slp.getListLogicId());
		return lp;
	}

	@Override
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(
			MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("sppl_cd"))) {
					row.setValue("sppl_cd", null);
				}
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("bom_ptn"))) {
					row.setValue("bom_ptn", null);
				}
				return super.setValues(index, row);
			}
		};
		MCListPutter slp = super.createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(compo, columns);
		lp.setListLogicId(slp.getListLogicId());
		return lp;
	}

	@Override
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(
			MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("sppl_cd"))) {
					row.setValue("sppl_cd", null);
				}
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("bom_ptn"))) {
					row.setValue("bom_ptn", null);
				}
				return super.setValues(index, row);
			}
		};
		MCListPutter slp = super.createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(compo, columns);
		lp.setListLogicId(slp.getListLogicId());
		return lp;
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.moveColumns(columnDtl_sppl_nm, columnDtl_outsrc_flg, columnDtl_mfg_loc_cd, columnDtl_mfg_loc_nm, columnDtl_bom_ptn);
	}

}