package mcframe.clientMSBD.MSBDP0030;

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
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PoSchdListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PoSchdListReg_MC extends MSBDP_PoSchdListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoSchdListReg_MC() {
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
	public MSBDP_PoSchdListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Srch01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0030_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_po_schd_dt_fr, Cnd_po_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_purc_schd_dt_fr, Cnd_purc_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_reg_dt_fr, Cnd_reg_dt_to));
			msgList.addAll(checkAtLeastOne(PoStsPanel));
			msgList.addAll(checkAtLeastOne(InterimPanel));
		}

		@Override
		protected void show() {
			super.show();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatusByOpe();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatusByOpe();
		}
	}
	/**
	 * [MS_MSBDL0030_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		
		protected MS_MSBDL0030_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
						String sysParm = getSysParm("MASTER_DT_BASE");
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				msgList.addAll(panel.checkReq(r.getGUIIndex()
						, columnDtl_itm_cd
						, columnDtl_itm_sub1
						, columnDtl_itm_sub2
						, columnDtl_itm_sub3
						, columnDtl_in_to_loc_cd
						, isSame(sysParm, "1") ? columnDtl_rqst_avl_rqst_dt : columnDtl_po_schd_dt
						, columnDtl_reg_dt));
			}
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0016);
		}

		@Override
		protected void show() {
			super.show();
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				// 金額クリア
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_upri_not_tgt_flg, r.getGUIIndex(), false);
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), false);
				
				// 税や為替レートはサーバでどの場合も置き換えているため、指定FLGは外す
				r.tax_fix_flg(false);
				r.xrate_inpt_flg(false);
				r.ptax_xrate_inpt_flg(false);
				
				setRqstDlvRqstDt(r);
			}
		}
	}
	/**
	 * [MS_MSBDL0030_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt02Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;
		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0030_Sprt02Caller(P p, B b) {
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
			if (!_upd_btn_event_flg) {
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
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_po_schd_dt));
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_dlv_rqst_dt));
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_purc_schd_dt));
					}
					// 外注の場合は製造場所、税も必須とする。
					if ((boolean)columnDtl_outsrc_flg.getValue(r.getGUIIndex())) {
						String sysParm = getSysParm("MASTER_DT_BASE");
						if (!isSame(sysParm, "1")) {
							if (!MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
								msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_po_schd_dt));
							}
						}
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_mfg_loc_cd, columnDtl_tax_cd));
					}
				});
				
				if (!msgList.isEmpty()) {
					_error_flg = true;
				}
			}
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<DtlR> upL = MCList.create(DtlR.class);
			for (DtlR r : bridge.up0()) {
				if (!r.upri_not_tgt_flg()) {
					if(MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())){
						r.base_dt(r.po_schd_dt());
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
			_tgtList.forEach(dr -> doUpriEvent(dr));
		}
	}

	/**
	 * [MS_MSBDL0030_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt03Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0030_Sprt03Caller(P p, B b) {
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
						&& !r.abort_flg() 
						&& !isNull(r.dlv_cd())) {
					upL.add(r);
				}
			}
			return upL;
		}
	}
	/**
	 * [MS_MSBDL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Imp01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBDL0030_Imp01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				setINSStatus();
			}
			setBtnModeByOpe();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void setModeMCEx(mcframe.commonCore.notice.MCException ex) {
			super.setModeMCEx(ex);
			setFIX_IStatus();
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
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_IStatus();
		}
	}
	/**
	 * [MS_MSBDL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Ins01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0030_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtlL();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				if (!r.check() || r.abort_flg()) {
					continue;
				}
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
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setBtnModeByOpe();
		}
	}
	
	/**
	 * [MS_MSBDL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Upd01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtlL();
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
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				if (!r.check() || r.abort_flg()) {
					continue;
				}
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
	}
	/**
	 * [MS_MSBDL0030_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Upd02Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0030_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}
	/**
	 * [MS_MSBDL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Del01Caller<P extends MSBDP_PoSchdListReg, B extends MS_MSBDL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0030_Del01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	// -----------------------------------------------
	// チェック処理
	// -----------------------------------------------
	protected MCMessageList cmnChkDtl(DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		msgL.addAll(checkBeforeAfter(columnDtl_po_schd_dt, columnDtl_dlv_rqst_dt, dtlR));
		msgL.addAll(checkBeforeAfter(columnDtl_po_schd_dt, columnDtl_purc_schd_dt, dtlR));
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
			if (!r.check() || r.abort_flg()) {
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
	 * Panel[Btn]のボタン[srch_schd_dt]の押下時の処理
	 */
	@Override
	public void doBtn_srch_schd_dt(MCEventInfo info) {
		callMS_MSBDL0030_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0040(MCEventInfo info) {
		openMSBD0040(info);
	}
	/**
	 * 発注予定分割登録画面へ遷移します。
	 * @param info
	 */
	protected void  openMSBD0040(MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0040");
		aso.putCnd(crtOpenMSBDP0040CndR(aso, dtlR));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0040.CndR crtOpenMSBDP0040CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg p = (mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0040.CndR to = mcframe.clientMSBD.MSBDP0040.CndR.create();
		p.Btn_sync_p_PPanel.getSyncR().sync_flg(true);
		if (isNull(r.split_src_schd_no())) {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO.name());
			to.srch_tgt_no(r.po_schd_no());
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		else {
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.SPLIT_DST_PO_SCHD_NO.name());
			to.srch_tgt_no(r.po_schd_no());
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		return to;
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBDL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBDL0030_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[srch_upri]の押下時の処理
	 */
	@Override
	public void doBtn_srch_upri(MCEventInfo info) {
		callMS_MSBDL0030_Sprt02();
	}
	/**
	 * Panel[Btn]のボタン[srch_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_srch_dlv(MCEventInfo info) {
		callMS_MSBDL0030_Sprt03();
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
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0030_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_crct]の押下時の処理
	 */
	@Override
	public void doBtn_upd_crct(MCEventInfo info) {
		callMS_MSBDL0030_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0030_Del01();
	}
	
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		// 操作種別によるモードの設定
		setSrchStatusByOpe();
		// 操作種別によるヘッダ項目の入力制御設定
		setHdrColModeByOpe();
		// 操作種別によるボタンの入力制御設定
		setBtnModeByOpe();
		// 初期値の設定
		setValueEx(BulkSet_reg_dt, getToday());
		setValueEx(BulkSet_purc_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 発注予定数量
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
				, columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ
				, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		// 基準単位数量
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		// 有効成分
		Dtl_inst_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null, columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		// 棚・ライン
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_in_to_loc_cd, columnDtl_str_ln_tgt_flg);
		// 品目
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		// 品目分類
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		// 取引先分類
		Dtl_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
		// 版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_site_cd, columnDtl_ver_flg);
		// 手配ＮＯ
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		// 配送先
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		
		// 取引通貨単価・金額
		Dtl_trd_cur_upri_p_PPanel.setSchd(true);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_sppl_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_cur_upri_dec_place, columnDtl_purc_amt_rnd_typ, columnDtl_purc_tax_rnd_typ, columnDtl_sppl_purc_upri_cng_flg, columnDtl_itm_purc_upri_cng_flg, columnDtl_dscnt_itm_flg);
		// 取引通貨加工単価・金額
		Dtl_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty, columnDtl_trd_cur_proc_upri,
				columnDtl_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_trd_cur_amt_dec_place, columnDtl_trd_unit_qty,
				columnDtl_trd_cur_onr_prov_upri, columnDtl_purc_amt_rnd_typ, null);
		
		// 為替レート
		Dtl_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_base_cur_cd, columnDtl_xrate_cd, columnDtl_reg_dt, true, columnDtl_xrate_inpt_flg);
		// 基準通貨単価・金額
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_upri, columnDtl_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_amt, columnDtl_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, columnDtl_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, columnDtl_xrate);
		// 基準通貨加工単価・金額
		Dtl_base_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_proc_upri, columnDtl_xrate);
		Dtl_base_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_proc_amt, columnDtl_xrate);
		// 基準通貨有償支給単価・金額
		Dtl_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri, columnDtl_xrate);
		Dtl_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd, columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt, columnDtl_xrate);
		
		// 納税為替レート
		Dtl_ptax_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_ptax_cur_cd, columnDtl_xrate_cd, columnDtl_reg_dt, true, columnDtl_ptax_xrate_inpt_flg);
		// 納税通貨単価・金額
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, columnDtl_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, columnDtl_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, columnDtl_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, columnDtl_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_proc_upri, columnDtl_ptax_xrate);
		Dtl_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_proc_amt, columnDtl_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri, columnDtl_ptax_xrate);
		Dtl_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd, columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt, columnDtl_ptax_xrate);
		
		Dtl_bditm_p_PPanel.setRelateBeans(columnDtl_asset_mng_typ, 
				columnDtl_bd_lot_mng_typ, columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ, 
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ, columnDtl_bd_sno4_mng_typ);

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
	
	/**
	 * 操作種別ごとにヘッダ項目の入力制御を設定します
	 */
	protected void setHdrColModeByOpe() {
		// 発注予定状況
		setPoSts();
		// インボイス取引対象
		setIVTrgtFlg();
		// 仮単価
		setInterimFlg();
	}
	
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_purc_usr_cd.addLCListener(this);
		BulkSet_purc_dpt_cd.addLCListener(this);
		BulkSet_rqst_fr_usr_cd.addLCListener(this);
		BulkSet_rqst_fr_dpt_cd.addLCListener(this);
		
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		
		columnDtl_dlv_rqst_dt.addLCListener(this);
		columnDtl_dlv_rqst_hm.addLCListener(this);
		
		columnDtl_str_ln_cd.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_proc_upri.addLCListener(this);
		columnDtl_trd_cur_onr_prov_upri.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		getDtlL().addListListener(createListListener(createDtlRowListener()));
	}
	@Override
	protected void listInit() {
		super.listInit();
		MCColumnConfig[] ignoreCols = {
			columnDtl_sppl_cd, columnDtl_trd_cur_cd, columnDtl_maker_cd, columnDtl_mfg_loc_cd, columnDtl_bom_ptn
		};
		columnDtl_itm_cd.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub1.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub2.addIgnoreListBeans(ignoreCols);
		columnDtl_itm_sub3.addIgnoreListBeans(ignoreCols);
	}
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR dtlR = (DtlR) event.getSourceRow();
				setValueEx(columnDtl_add_flg, dtlR.getGUIIndex(), true);
				setValueEx(columnDtl_tax_fix_flg, dtlR.getGUIIndex(), true);
			}
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
	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
	}
	
	protected void doCnd_ope_NCSub() {
		// 一覧クリア
		clearContainers(getDtlL());
		// 操作種別によるモードの設定
		setSrchStatusByOpe();
		// 操作種別によるヘッダ項目の入力制御設定
		setHdrColModeByOpe();
		// 操作種別によるボタンの入力制御設定
		setBtnModeByOpe();
	}

	@Override
	public void doCnd_po_flg_NC(MCEventInfo info) {
		super.doCnd_po_flg_NC(info);
		if (!Cnd_po_flg.getValue() && isEditableMode(Cnd_po_flg)) {
			Cnd_purc_sts_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_po_flg);
		}
	}
	
	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		// 共通項目の値が空白の場合は、各項目に値をセットしません。
		// 訂正時に選択チェックをオンにするだけで、購買部門などをNullにされてしまうのを防ぐためです。
		if (!isNull(getBulkSetR().reg_dt()) && isNull(dtlR.reg_dt())) {
			bulkSet(columnDtl_reg_dt, dtlR);			
		}
		if (!isNull(getBulkSetR().rqst_wg_cd()) && isNull(dtlR.rqst_wg_cd())) {
			bulkSet(columnDtl_rqst_wg_cd, dtlR);
		}
		if (!isNull(getBulkSetR().purc_usr_cd()) && isNull(dtlR.purc_usr_cd())) {
			bulkSet(columnDtl_purc_usr_cd, dtlR);
		}
		if (!isNull(getBulkSetR().purc_dpt_cd()) && isNull(dtlR.purc_dpt_cd())) {
			bulkSet(columnDtl_purc_dpt_cd, dtlR);
		}
		if (!isNull(getBulkSetR().rqst_fr_usr_cd()) && isNull(dtlR.rqst_fr_usr_cd())) {
			bulkSet(columnDtl_rqst_fr_usr_cd, dtlR);
		}
		if (!isNull(getBulkSetR().rqst_fr_dpt_cd()) && isNull(dtlR.rqst_fr_dpt_cd())) {
			bulkSet(columnDtl_rqst_fr_dpt_cd, dtlR);
		}
		
		setDefault(dtlR);
	}
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		if (info.getEventIndex() < 0) {
			return;
		}
		if (getDtlL().size() > 0) {
			setBtnMode(info.getEventIndex());
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
		if (lc == BulkSet_rqst_fr_usr_cd) {
			doBulkSet_rqst_fr_usr_cd_LC(info);
		}
		if (lc == BulkSet_rqst_fr_dpt_cd) {
			doBulkSet_rqst_fr_dpt_cd_LC(info);
		}
		if (lc == columnDtl_dlv_rqst_dt) {
			doDtl_dlv_rqst_dt_LC(info);
		}
		if (lc == columnDtl_dlv_rqst_hm) {
			doDtl_dlv_rqst_hm_LC(info);
		}
		if (lc == columnDtl_itm_cd
				|| lc == columnDtl_itm_sub1
				|| lc == columnDtl_itm_sub2
				|| lc == columnDtl_itm_sub3) {
			
			doDtl_itm_LC(info);
		}
		if (lc == columnDtl_tax_cd) {
			doDtl_tax_cd_LC(info);
		}
		if(lc == columnDtl_trd_cur_upri) {
			doDtl_trd_cur_upri_LC(info);
		}
		if(lc == columnDtl_trd_cur_proc_upri) {
			doDtl_trd_cur_proc_upri_LC(info);
		}
		if(lc == columnDtl_trd_cur_onr_prov_upri) {
			doDtl_trd_cur_onr_prov_upri_LC(info);
		}
	}
	
	@Override
	public void doBulkSet_reg_dt_LC(MCEventInfo info) {
		super.doBulkSet_reg_dt_LC(info);
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_reg_dt, dtlR);
			}
		}
	}
	
	@Override
	public void doBulkSet_rqst_wg_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doBulkSet_rqst_wg_cd_LC(info);
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_rqst_wg_cd, dtlR);
			}
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
	 * 購買部門を一括設定します。
	 * @param info
	 */
	public void doBulkSet_purc_dpt_cd_LC(MCEventInfo info) {
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_purc_dpt_cd, dtlR);
			}
		}
	}
	/**
	 * 依頼元担当者を一括設定します。
	 * @param info
	 */
	public void doBulkSet_rqst_fr_usr_cd_LC(MCEventInfo info) {
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_rqst_fr_usr_cd, dtlR);
			}
		}
	}
	/**
	 * 依頼元部門を一括設定します。
	 * @param info
	 */
	public void doBulkSet_rqst_fr_dpt_cd_LC(MCEventInfo info) {
		for (DtlR dtlR : getDtlL()) {
			if (dtlR.check()) {
				bulkSet(columnDtl_rqst_fr_dpt_cd, dtlR);
			}
		}
	}
	@Override
	public void doDtl_trd_cd_LC(MCEventInfo info) {
		super.doDtl_trd_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!isSame(isPurcXpns(dtlR), dtlR.xpns_purc_flg())) {
			setValueEx(columnDtl_purc_rsn_cd, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 品目変更イベント
	 * @param info
	 */
	public void doDtl_itm_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			clearVerNo(dtlR);
			clearPurcRsnCd(dtlR);
			clearTrdCurUpri(dtlR);
			setIvItmNm(dtlR);
			setSpplItm(dtlR);
			setDefaultTaxCd(dtlR);
			setColByDscntItm(dtlR);
			setDefStrLnCd(dtlR);
			doDtl_dlv_rqst_dt_LC(info);
		}
	}
	
	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		clearPurcRsnCd(dtlR);
		clearTrdCurUpri(dtlR);
		setIvItmNm(dtlR);
		setSpplItm(dtlR);
		setDefaultTaxCd(dtlR);
		int idx = info.getEventIndex();
		if (!isNull(dtlR.def_purc_usr_cd()) || !isNull(dtlR.def_purc_dpt_cd())){
			setValueEx(columnDtl_purc_usr_cd, idx, null);
			setValueEx(columnDtl_purc_dpt_cd, idx, null);
		}
		if (!isNull(dtlR.def_purc_usr_cd())) {
			setValueEx(columnDtl_purc_usr_cd, idx, dtlR.def_purc_usr_cd());
		}
		else if (!isNull(dtlR.def_purc_dpt_cd())) {
			setValueEx(columnDtl_purc_dpt_cd, idx, dtlR.def_purc_dpt_cd());
		}
	}
	
	/**
	 * 納入希望日変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		MCRow rslt = MCRow.create();
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (!isNullOrNullVal(sysParm) && isSame(sysParm , "1")) {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR, MSUCP_PurcUtil.$dlv_rqst_dt), dtlR.dlv_rqst_dt(), sysParm);
			setSchdDt(MSUCP_PurcUtil.$dlv_rqst_dt, dtlR, rslt);
		} else {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR), null ,sysParm);
			setSchdDt(dtlR, rslt);
		}
	}
	/**
	 * 納入希望時刻変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_hm_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 計画外の場合納入予定日＝依頼元納入予定日
		if (isNull(dtlR.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setValueEx(columnDtl_rqst_dlv_rqst_hm, dtlR.getGUIIndex(), dtlR.dlv_rqst_hm());
		}
	}
	
	protected MCDate getPurcUpriBaseDt(DtlR dtlR) {
		if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.po_schd_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.dlv_rqst_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.purc_schd_dt();
		}
		return null;
	}
	
	@Override
	public void doDtl_reg_dt_LC(MCEventInfo info) {
		super.doDtl_reg_dt_LC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setSpplItm(dtlR);
		}
	}
	/**
	 * 仕入予定日変更イベント
	 * @param info
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 税ＣＤ初期値設定
		setDefaultTaxCd(dtlR);
		// 仕入直送の場合、納入希望日＝仕入予定日とする
		if (!isNull(dtlR.dlv_cd())) {
			// 仕入直送の場合、依頼元が必ずあるため依頼元納入希望日の連動などは考慮しない
			dtlR.dlv_rqst_dt(dtlR.purc_schd_dt());
		}
	}
	/**
	 * 計画外の場合に、依頼元納入希望日へ納入希望日を設定します。
	 * @param dtlR
	 */
	protected void setRqstDlvRqstDt(DtlR dtlR) {
		if (isNull(dtlR.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setValueEx(columnDtl_rqst_dlv_rqst_dt, dtlR.getGUIIndex(), dtlR.dlv_rqst_dt());
		}
	}

	protected void setPoSchdDt(DtlR dtlR, MCRow src) {
		if (isNull(src)) {
			dtlR.po_schd_dt(dtlR.dlv_rqst_dt());
		}
	}
	protected void setRqstAvlRqstDt(DtlR dtlR ,MCRow src) {
		if (isNull(src) && (isNull(dtlR.po_schd_src_typ())
				|| MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ()))) {
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
		setDrctDlvTyp(dtlR);
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
	 * 取引通貨単価変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
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
	 * 取引通貨加工単価変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_proc_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
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
	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------	
	/**
	 * ボタンの押下制御をします。
	 * @param index 一覧のインデックス
	 */
	protected void setBtnMode(int index) {
		DtlR r = getDtlL().get(index);
		setBtnRcopyMode(r);
	}
	/**
	 * 行コピーボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRcopyMode(DtlR r) {
		if (r.outsrc_flg()) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	/**
	 * 行ステータスの表示・非表示を設定します。
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			DtlTable.setStatusColumnVisible(true);
		}
		else {
			DtlTable.setStatusColumnVisible(false);
		}
		
	}
	/**
	 * 操作種別に対応するステータスを設定します。（検索）
	 */
	public void setSrchStatusByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			Ctrl_ctrl_PPanel.expand(false);
			fillSpace();
			DtlTable.selectLeftmostColumn(0);
		} 
		else if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		} 
		else if (Cnd_ope_UPD_CRCT.isSelected()) {
			setSRCH_UPD_CRCTStatus();
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		} 
		else if (Cnd_ope_SPLIT.isSelected()) {
			setSRCH_SPLITStatus();
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		} 
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		} 
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
			Ctrl_ctrl_PPanel.expand(true);
			CndPanel.focusFirstComponent();
		}
		setStatusColumn();
	}
	
	/**
	 * 操作種別に対応するステータスを設定します。（更新）
	 */
	public void setUpdStatusByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			Ctrl_ctrl_PPanel.expand(false);
		} 
		else if (Cnd_ope_UPD_CRCT.isSelected()) {
			setUPD_CRCTStatus();
			Ctrl_ctrl_PPanel.expand(false);
		} 
		else if (Cnd_ope_SPLIT.isSelected()) {
			setSPLITStatus();
			Ctrl_ctrl_PPanel.expand(false);
		} 
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
			Ctrl_ctrl_PPanel.expand(false);
		} 
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}
		setStatusColumn();
		DtlTable.selectLeftmostColumn(0);
	}
	/**
	 * 検索ボタンの入力制御を設定する
	 */
	public void setBtnModeByOpe() {
		if (Cnd_ope_INS.isSelected()) {
			Ctrl_ctrl_PPanel.Ope_srch.setMode(MCMode.DISABLE);
		}
	}

	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------	
	/**
	 * 発注予定状況の設定
	 */
	public void setPoSts () {
		if (Cnd_ope_UPD_CRCT.isSelected() || Cnd_ope_REF.isSelected() ) {
			setValueEx(Cnd_po_schd_flg, true);
			setValueEx(Cnd_po_flg, true);
		} 
		else {
			setValueEx(Cnd_po_schd_flg, true);
			setValueEx(Cnd_po_flg, false);
		}
	}
	
	/**
	 * Ｉ／Ｖ取引対象の設定
	 */
	public void setIVTrgtFlg () {
		setValueEx(Cnd_iv_trgt_flg, true);
		setValueEx(Cnd_iv_not_trgt_flg, true);
	}
	
	/**
	 * 単価（仮単価・本単価）の設定
	 */
	public void setInterimFlg () {
		setValueEx(Cnd_interim_flg, true);
		setValueEx(Cnd_not_interim_flg, true);
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
		if (b == columnDtl_reg_dt && isEditable(columnDtl_reg_dt, r.getGUIIndex())) {
			setValueEx(columnDtl_reg_dt, r.getGUIIndex(), BulkSet_reg_dt.getValue());
		}
		if (b == columnDtl_rqst_wg_cd && isEditable(columnDtl_rqst_wg_cd, r.getGUIIndex())) {
			setValueEx(columnDtl_rqst_wg_cd, r.getGUIIndex(), BulkSet_rqst_wg_cd.getValue());
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
			setValueEx(columnDtl_purc_dpt_cd, r.getGUIIndex(), BulkSet_purc_dpt_cd.getValue());
		}
		if(b == columnDtl_rqst_fr_usr_cd && isEditable(columnDtl_rqst_fr_usr_cd, r.getGUIIndex())) {
			r.rqst_fr_usr_cd(BulkSet_rqst_fr_usr_cd.getValue());
			r.rqst_fr_usr_nm(BulkSet_rqst_fr_usr_nm.getValue());
		}
		if(b == columnDtl_rqst_fr_dpt_cd && isEditable(columnDtl_rqst_fr_dpt_cd, r.getGUIIndex())) {
			r.rqst_fr_dpt_cd(BulkSet_rqst_fr_dpt_cd.getValue());
			r.rqst_fr_dpt_nm(BulkSet_rqst_fr_dpt_nm.getValue());
		}
	}
	
	/**
	 * 行追加時の初期値を設定します。
	 * @param r
	 */
	protected void setDefault(DtlR r) {
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

			if (MAC_RTN_STS_TYP.isOK(dtlR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
								
				// 打切の場合、打切以外は入力不可
				if (column != columnDtl_abort_flg && column != columnDtl_check) {
					if (isEditableMode(column) && dtlR.abort_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 前回打切の場合、今回は打切解除のみしかできない
				if (column != columnDtl_abort_flg && column != columnDtl_check) {
					if (isEditableMode(column) && dtlR.bef_abort_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 紐切れしてないWG間依頼の場合、打切はWG間依頼で行う
				if (column == columnDtl_abort_flg) {
					if (isEditableMode(column) && MSC_PO_SCHD_SRC_TYP.isRQST(dtlR.po_schd_src_typ()) && !dtlR.rqst_can_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				
				// 取引
				if (column == columnDtl_trd_cd) {
					if (isEditableMode(column) 
							&& ((MSC_PO_SCHD_SRC_TYP.isRQST(dtlR.po_schd_src_typ()) 
								|| MSC_PO_SCHD_SRC_TYP.isSLO(dtlR.po_schd_src_typ())) 
										&& !dtlR.rqst_can_flg())) {
						// ＷＧ間依頼または依頼元が受注の場合変更不可
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				
				// 発注先
				if (column == columnDtl_sppl_cd) {
					if (isEditableMode(column) && dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// メーカ
				if (column == columnDtl_maker_cd) {
					if (isEditableMode(column) && dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// 品名
				if (column == columnDtl_itm_nm) {
					if (isEditableMode(column) && ((!isNull(dtlR.po_schd_src_typ()) && !MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) || !dtlR.sundry_itm_flg())) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// インボイス表記品名
				if (column == columnDtl_iv_itm_nm) {
					if (isEditableMode(column) && (!dtlR.sundry_itm_flg() || !dtlR.sppl_iv_flg())) {
						return MCMode.READ_ONLY;
					}
					else {
							return getDefaultMode(index, column, table);
					}
				}
				// 単位
				if (column == columnDtl_trd_unit_cd) {
					if (isEditableMode(column)
							&& dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					if (isEditableMode(column) && dtlR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 数量
				if (column == columnDtl_trd_unit_qty) {
					if (isEditableMode(column)
							&& dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					if (isEditableMode(column) && dtlR.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 依頼元担当者
				if (column == columnDtl_rqst_fr_usr_cd) {
					if(isEditableMode(column)
						&& !dtlR.rqst_can_flg() 
						&& !MSC_PO_SCHD_SRC_TYP.isUPLND(nvl(dtlR.po_schd_src_typ(), MSC_PO_SCHD_SRC_TYP.UPLND.value()))) {
						return MCMode.READ_ONLY;
					}
				}
				// 依頼元部門
				if (column == columnDtl_rqst_fr_dpt_cd) {
					if(isEditableMode(column)
						&& !dtlR.rqst_can_flg() 
						&& !MSC_PO_SCHD_SRC_TYP.isUPLND(nvl(dtlR.po_schd_src_typ(), MSC_PO_SCHD_SRC_TYP.UPLND.value()))) {
						return MCMode.READ_ONLY;
					}
				}
				// 依頼元使用可能希望日
				if (column == columnDtl_rqst_avl_rqst_dt) {
					if (isEditableMode(column) 
							&& !isNull(dtlR.po_schd_src_typ())
							&& !MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// 納入希望日
				if (column == columnDtl_dlv_rqst_dt || column == columnDtl_dlv_rqst_hm) {
					if (isEditableMode(column) && dtlR.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// 仕入予定日
				if (column == columnDtl_purc_schd_dt) {
					if (isEditableMode(column) && MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(dtlR.purc_upri_req_typ())) {
						return MCMode.REQUIRED;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// 	取引通貨単価
				if(column == columnDtl_trd_cur_upri) {
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
				// 為替レート指定ＦＬＧ
				if (column == columnDtl_xrate_inpt_flg) {
					if (isEditableMode(column) && 
							(isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd()) || isNull(dtlR.trd_cur_cd()))) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				// 納税為替レート指定ＦＬＧ
				if (column == columnDtl_ptax_xrate_inpt_flg) {
					if (isEditableMode(column) && 
							(isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd()) || isNull(dtlR.trd_cur_cd()) || isNull(dtlR.ptax_cur_cd()))) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				
				// 手配ＮＯ
				if (column == columnDtl_sno1
						|| column == columnDtl_sno2 
						|| column == columnDtl_sno3 
						|| column == columnDtl_sno4) {
					if (isEditableMode(column) && ((!isNull(dtlR.slo_no()) && !dtlR.rqst_can_flg()) || dtlR.outsrc_flg())) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
				
				// 負担部門
				if (column == columnDtl_bd_dpt_cd) {
					if (isEditableMode(column) && MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ())) {
						return MCMode.ENABLE;
					}

				}
				
				if (column == columnDtl_rqst_upd_stop_flg) {
					if (MSC_PO_SCHD_CHG_TYP.isDIV_ADD(dtlR.po_schd_chg_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
			}
			
			if (Cnd_ope_DEL.isSelected()) {
				if (column == columnDtl_check) {
					if (isEditableMode(column) && !canDel(dtlR)) {
						return MCMode.READ_ONLY;
					}
					else {
						return getDefaultMode(index, column, table);
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
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
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(),
						row.getStringNE("itm_nm"));
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
	 * 発注先品目・品名を設定します
	 * @param dtlR
	 */
	protected void setSpplItm(DtlR dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(dtlR.sppl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.reg_dt(), this);
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
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 */
	protected void setDefaultTaxCd(DtlR dtlR) {
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.sppl_cd(), 
				getPurcUpriBaseDt(dtlR), 
				this);
		setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), taxCd);
	}
	
	@Override
	public void doDtl_po_schd_dt_LC(MCEventInfo info) {
		super.doDtl_po_schd_dt_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDefaultTaxCd(dtlR);
	}
	
	@Override
	public void doDtl_purc_upri_req_typ_LC(MCEventInfo info) {
		super.doDtl_purc_upri_req_typ_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setDefaultTaxCd(dtlR);
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
	// -----------------------------------------------
	// 値の設定（クリア）
	// -----------------------------------------------
	/**
	 * 仕入理由をクリアします。
	 * @param dtlR
	 */
	protected void clearPurcRsnCd(DtlR dtlR) {
		if (!isSame(isPurcXpns(dtlR), dtlR.xpns_purc_flg())) {
			setValueEx(columnDtl_purc_rsn_cd, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 取引通貨単価をクリアします。
	 * @param dtlR
	 */
	protected void clearTrdCurUpri(DtlR dtlR) {
		setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), null);
	}
	/**
	 * 版ＮＯをクリアします。
	 */
	protected void clearVerNo(DtlR dtlR) {
		setValueEx(columnDtl_ver_no, dtlR.getGUIIndex(), null);
	}
	/**
	 * 行コピー時に項目をクリアします。
	 * @param index
	 */
	protected void clearNotCopyCol(int index) {
		setValueEx(columnDtl_mfg_inst_no, index, null);
		setValueEx(columnDtl_outsrc_itm_ord_no, index, null);
		setValueEx(columnDtl_po_flg, index, null);
		setValueEx(columnDtl_purc_sts_typ, index, null);
		setValueEx(columnDtl_wg_rqst_src_typ, index, null);
		setValueEx(columnDtl_wg_rqst_src_no, index, null);
		setValueEx(columnDtl_po_schd_no, index, null);
		setValueEx(columnDtl_slo_no, index, null);
		setValueEx(columnDtl_po_no, index, null);
		setValueEx(columnDtl_po_schd_chg_typ, index, null);
		setValueEx(columnDtl_split_src_schd_no, index, null);
		setValueEx(columnDtl_org_flg, index, null);
		setValueEx(columnDtl_po_schd_src_typ, index, null);
		setValueEx(columnDtl_po_schd_src_no, index, null);
		setValueEx(columnDtl_rqst_can_flg, index, null);
		setValueEx(columnDtl_bef_in_to_loc_wg_cd, index, null);
		setValueEx(columnDtl_bef_lg_grp_cd, index, null);
		setValueEx(columnDtl_bef_loc_grp_cd, index, null);
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
	public MCList<?> getCnd_po_schd_src_typ(MCRow row, MCEventInfo info) {
		MCList<?> allList = super.getCnd_po_schd_src_typ(row, info);
		MCList<MCRow> list = MCList.create(MCRow.class);
		if (Cnd_ope_DEL.isSelected()) {
			for (MCRow r : allList) {
				// 受注やＷＧ間依頼の場合、通常取り消し不可であるが、紐切れの場合は取り消し可能であるため、検索条件に残す。
				if (!MSC_PO_SCHD_SRC_TYP.isPPLN(r.getStringNE(CndR.$po_schd_src_typ))
						&& !MSC_PO_SCHD_SRC_TYP.isMFG_INST(r.getStringNE(CndR.$po_schd_src_typ))) {
					list.add(r);
				}
			}
			return list;
		}
		return allList;
	}
	
	@Override
	public MCList<?> getDtl_trd_cd(MCRow row, MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		MCList<?> list = super.getDtl_trd_cd(row, info);
		if (dtlR.outsrc_flg()) {
			// 外注品の場合経費購買不可
			return list.subList(MAC_TRD_PTN_TYP.$VALUE, MAC_TRD_PTN_TYP.PURC.value());
		}
		return list;
	}
	@Override
	public MCList<?> getDtl_sppl_cd(MCRow row, MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (dtlR.outsrc_flg()) {
			row.setBooleanNE("inc_outsrc_flg", true);
		}
		return super.getDtl_sppl_cd(row, info);
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
	// -----------------------------------------------
	// その他
	// -----------------------------------------------
	@Override
	protected void setSortColumn() {
		super.setSortColumn();	
		DtlTable.addSortColumn(columnDtl_po_schd_src_no, MCList.SortType.ASC);	
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
	 * 対象のレコードが取り消し不可か否かを判定します。
	 * @param dtlR
	 * @return
	 */
	protected boolean canDel(DtlR dtlR) {
		if (!MSC_PO_SCHD_CHG_TYP.isNOT_CHG(dtlR.po_schd_chg_typ())) {
			// 分割済の発注予定は取消不可
			return false;
		}
		if (!MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())
				&& !MSC_PO_SCHD_SRC_TYP.isOP(dtlR.po_schd_src_typ())
				&& !dtlR.rqst_can_flg()) {
			// 計画外でも発注点在庫補充でもなく、紐切れでも無い場合は取消不可
			return false;
			
		}
		if (dtlR.po_flg()) {
			// 発注済の場合取消不可
			return false;
		}
		return true;
	}
	// -----------------------------------------------
	// 単価再取得
	// -----------------------------------------------
	/**
	 * 単価再取得対象の明細を取得します。
	 */
	protected MCList<DtlR> getSprtTgtDtlL() {
		MCList<DtlR> upL = MCList.create(DtlR.class);
		for (DtlR r : getDtlL()) {
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
				!r.isEmpty() && 
				!r.abort_flg();
	}
	/**
	 * 単価再取得処理を実行します。
	 * @return 単価再取得処理中にエラーが起きた場合true
	 */
	protected boolean hasErr() {
		@SuppressWarnings("rawtypes")
		MSBDP_PoSchdListReg.MS_MSBDL0030_Sprt02Caller caller = createMS_MSBDL0030_Sprt02();
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
	}
	/**
	 * 単価のイベントを発生させる。
	 */
	protected void doUpriEvent(DtlR dtlR) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.trd_cur_upri();
		MCNumber procUpri = dtlR.trd_cur_proc_upri();
		MCNumber onrProvUpri = dtlR.trd_cur_onr_prov_upri();
		// 同一値でイベントを発生させるために一度クリアする
		setValueEx(columnDtl_trd_cur_upri, idx, null);
		setValueEx(columnDtl_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, idx, null);
		// イベントを発生させる
		setValueEx(columnDtl_trd_cur_upri, idx, upri);
		setValueEx(columnDtl_trd_cur_proc_upri, idx, procUpri);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, idx, onrProvUpri);
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
		fillSpace();
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
		cnd.po_schd_dt(null);
		cnd.purc_schd_dt(null);
		cnd.rqst_avl_rqst_dt(null);
		return cnd;
	}
	protected DtlR getSchdDtEditCnd(DtlR dtlR, String columnNm) {
		if (isNullAnd(dtlR.rqst_avl_rqst_dt(), dtlR.dlv_rqst_dt())) {
			return DtlR.create();
		}
		DtlR cnd = dtlR.clone();
		if (isSame(MSUCP_PurcUtil.$rqst_dlv_rqst_dt, columnNm)) {
			cnd.po_schd_dt(null);
			cnd.dlv_rqst_dt(null);
			cnd.purc_schd_dt(null);
		} 
		else if (isSame(MSUCP_PurcUtil.$dlv_rqst_dt, columnNm)) {
			cnd.po_schd_dt(null);
			cnd.purc_schd_dt(null);
			cnd.rqst_avl_rqst_dt(null);
		}
		return cnd;
	}

	
	/**
	 * 予定日を取得します
	 * @param dtlR
	 * @return
	 */
	protected MCRow callGetSchdDt(DtlR dtlR , MCDate baseDt , String sysParm) {
		if (isSame(sysParm, "1")) {
			if (isNullAnd(dtlR.dlv_rqst_dt(), dtlR.rqst_avl_rqst_dt())) {
				return MCRow.create();
			}
		}	else {
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
				dtlR.po_schd_dt(), 
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
			// 納入希望日のイベントを起こすと、再度予定日算出が動いてしまうためイベントは起こさない。
			if (isNull(dest.po_schd_src_typ())
					|| MSC_PO_SCHD_SRC_TYP.isUPLND(dest.po_schd_src_typ())) {
				dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
			}
			dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
			setPurcSchdDt(dest, src);
			setValueEx(columnDtl_po_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$po_schd_dt));
		}
		setRqstDlvRqstDt(dest);
		setPoSchdDt(dest, src);
	}
	protected void setSchdDt(String col, DtlR dest, MCRow src) {
		if (!isNull(src)) {
			if (isSame(col, MSUCP_PurcUtil.$dlv_rqst_dt)) {
				// 納入希望日のイベントを起こすと、再度予定日算出が動いてしまうためイベントは起こさない。
				if (isNull(dest.po_schd_src_typ())
						|| MSC_PO_SCHD_SRC_TYP.isUPLND(dest.po_schd_src_typ())) {
					dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
				}
				dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
				setPurcSchdDt(dest, src);
				setValueEx(columnDtl_po_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$po_schd_dt));
			}
		}
		setRqstDlvRqstDt(dest);
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
		if (isNull(dest.dlv_cd())) {
			// 仕入直送でない場合
			setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
		}
		else {
			// 仕入直送の場合
			setValueEx(columnDtl_purc_schd_dt, dest.getGUIIndex(), dest.dlv_rqst_dt());
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
		// 金額 = (単価:加工単価 + 有償支給単価)×数量
		MCNumber amt =  MAUCP_AmtUtil.getAmt(dtlR.trd_cur_upri(),
				dtlR.trd_unit_qty(),
				dtlR.trd_cur_amt_dec_place(),
				dtlR.purc_amt_rnd_typ()
				);
		if(dtlR.inc_tax_flg()) {
			// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
			MCNumber proc_inc_tax_amt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
					dtlR.trd_unit_qty(),
					dtlR.trd_cur_amt_dec_place(),
					dtlR.purc_amt_rnd_typ());
			dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
			// 有償支給金額は金額-加工金額
			dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
		}else {
			dtlR.trd_cur_amt(amt);
			// 外税の場合は金額を案分
			setOutsrcAmt(dtlR);
		}
		// 加工金額を元に税額を取得(有償支給金額は税額に含めない)
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
				dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), null);
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
		callMS_MSBDL0030_Imp01();
	}
	
	@Override
	protected void doFileInErrorAction(MCTable<?> table, MCMessageList msgList) {
		setFIX_IStatus();
		super.doFileInErrorAction(table, msgList);
	}
	
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		DtlR r = (DtlR)srcRow;
		if (isNull(r.reg_dt())) {
			bulkSet(columnDtl_reg_dt, r);
		}
		if (isNull(r.rqst_wg_cd())) {
			bulkSet(columnDtl_rqst_wg_cd, r);
		}
		if (isNull(r.purc_usr_cd())) {
			bulkSet(columnDtl_purc_usr_cd, r);
		}
		if (isNull(r.purc_dpt_cd())) {
			bulkSet(columnDtl_purc_dpt_cd, r);
		}
		if (isNull(r.rqst_fr_usr_cd())) {
			bulkSet(columnDtl_rqst_fr_usr_cd, r);
		}
		if (isNull(r.rqst_fr_dpt_cd())) {
			bulkSet(columnDtl_rqst_fr_dpt_cd, r);
		}
		setDefault(r);
	}
	@Override
	public MCTable<DtlR> getListRegTable() {
		return DtlTable;
	}


	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
				if (!isNull(row) && MAC_STR.isNULL_VAL(row.getStringNE("sppl_cd"))) {
					row.setValue("sppl_cd", null);
				}
				return super.setValues(index, row);
			}
		};
		MCListPutter slp = super.createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(compo, columns);
		lp.setListLogicId(slp.getListLogicId());
		return lp;
	}

}