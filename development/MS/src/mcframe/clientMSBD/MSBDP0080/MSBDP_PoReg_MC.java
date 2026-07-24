package mcframe.clientMSBD.MSBDP0080;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMSUB.MSUBP0010.*;
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
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import java.util.Comparator;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PoReg_MC extends MSBDP_PoReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoReg_MC() {
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
	public MSBDP_PoReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Srch01Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			setDispAmt();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
		}
	}
	/**
	 * [MS_MSBDL0080_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Srch02Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0080_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			setDispAmt();
			setValueEx(Hdr_po_dt, getToday());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}
	}
	/**
	 * [MS_MSBDL0080_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt02Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		
		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;
		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0080_Sprt02Caller(P p, B b) {
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
					, Hdr_sppl_cd
					, Hdr_trd_cur_cd
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
					msgList.addAll(panel.checkReq(Hdr_po_dt));
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
					if (!MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(Hdr_po_dt));
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
				if (!(r.upri_not_tgt_flg() || isSame(Status.DELETE, r.getStatus()) || doneNextOper(r))) {
					r.po_dt(getHdrR().po_dt());
					if(MAC_PURC_UPRI_REQ_TYP.isPO_DT(r.purc_upri_req_typ())){
						r.base_dt(getHdrR().po_dt());
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
			bridge.up1().setAll(upL);
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
	 * [MS_MSBDL0080_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt03Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0080_Sprt03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected boolean checkForCall() {
			boolean checkFlg = super.checkForCall();
			if (checkFlg) {
				if (getTrgtList().isEmpty()) {
					checkFlg = false;
				}
			}
			return checkFlg;
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getTrgtList());
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0015);
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
				if (!r.abort_flg() 
						&& !doneNextOper(r)
						&& isPurcDdlv(r)) {
					upL.add(r);
				}
			}
			return upL;
		}
	}
	/**
	 * [MS_MSBDL0080_Sprt04]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt04Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Sprt04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBDL0080_Sprt04Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(exceptDeleteAndEmpty(getDtlL()));
		}
		@Override
		protected void show() {
			setGUIIndexAtDownParam();
			boolean sppl_chg_flg = bridge.up0().getBooleanNE("sppl_chg_flg");
			// 発注先変更時は発注先のリストロジックから値を設定するので電文の値を設定しない。
			if (!sppl_chg_flg) {
				if(!isNull(bridge.down0().ap_dpt_cd())) {
					setValueEx(Hdr_ap_dpt_cd, bridge.down0().ap_dpt_cd());
				}
				else {
					if (getHdrR().ap_dpt_flg()) {
						setValueEx(Hdr_ap_dpt_cd, getHdrR().purc_dpt_cd());
					}
					else {
						setValueEx(Hdr_ap_dpt_cd, null);
					}
				}
			}
			for (DtlR downR : bridge.down1()) {
				DtlR dtlR = getDtlL().get(downR.getGUIIndex());
				
				setValueEx(columnDtl_purc_basis_typ, downR.getGUIIndex(), downR.purc_basis_typ());
				
				// 資産管理対象外品、かつ購買識別区分がnullの場合は購買識別区分を設定しない
				if (!MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) || !isNull(downR.purc_id_typ())) {
					if (isMatchPurcIdTyp(dtlR, downR.purc_id_typ())) {
						setValueEx(columnDtl_purc_id_typ, downR.getGUIIndex(), downR.purc_id_typ());
					}
				}
				
				if (!sppl_chg_flg) {
					setDefaultApDptCd(downR);
				}
			}
		}
	}
	/**
	 * [MS_MSBDL0080_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Prnt01Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0080_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Hdr_prnt_po_flg, Hdr_prnt_dlv_flg, Hdr_prnt_purc_ddlv_dlv_flg));
		}
	}
	/**
	 * [MS_MSBDL0080_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Ins01Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		protected MS_MSBDL0080_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtlL();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(cmnChkHdr());
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
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
	 * [MS_MSBDL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Upd01Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		protected MCList<DtlR> _befDtlL = MCList.create(DtlR.class);
		protected MS_MSBDL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSprtTgtDtlL();
			_befDtlL = getDtlL().clone();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(cmnChkHdr());
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
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
		protected void show() {
			super.show();
			setNotUpRowData();
		}
		
		protected void setNotUpRowData() {
			MCList<DtlR> afterDtlL = getDtlL();
			for (DtlR afterDtlR : afterDtlL) {
				if (isNull(afterDtlR.po_d_no())) {
					continue;
				}
			}
		}
	}
	/**
	 * [MS_MSBDL0080_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Del01Caller<P extends MSBDP_PoReg, B extends MS_MSBDL0080_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0080_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}

		@Override
		protected void checkReq(mcframe.commonCore.notice.MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getHdrR()));
		}
	}
	/**
	 * Panel[Cnd]のボタン[srch_po]の押下時の処理
	 */
	@Override
	public void doCnd_srch_po(MCEventInfo info) {
		callMS_MSBDL0080_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_po_schd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_po_schd(MCEventInfo info) {
		callMS_MSBDL0080_Srch02();
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
	 * Panel[Btn]のボタン[open_MSBDP0250]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0250(MCEventInfo info) {
		openMSBDP0250(info);
	}
	/**
	 * Panel[Btn]のボタン[bndl_schd]の押下時の処理
	 */
	@Override
	public void doBtn_bndl_schd(MCEventInfo info) {
		
		MCNumber maxDtlPegNo = null;
		MCList<DtlR> tmpL = getDtlL().clone();
		tmpL.sort(SortType.DESC, DtlR.$dtl_peg_no);
		if (tmpL.size() > 0) {
			maxDtlPegNo = nvl(tmpL.get(0).dtl_peg_no(), MCNumber.ZERO).add(MCNumber.ONE);
		}
		
		if (confirm(new MCMessage(MSBDP0017)) != MCMessageBox.YES_OPTION) {
			return;
		}
		
		MCList<DtlR> subL = getDtlL().subList(DtlR.$check, true);
		
		if (subL.size() < 2) {
			MCMessageBox.dialog(this, new MCMessage(MSBDP0020));
			return;
		}
		
		if (!chkBndl(subL)){
			return;
		}
		
		// まとめ後の数量
		MCNumber ttl_trd_unit_qty = sumTtlQty(subL);
		// まとめ後の値引額
		MCNumber ttl_trd_cur_dscnt_amt = sumTtlDscntAmt(subL);
		
		// まとめ後の日付を取得するための操作用リスト
		MCList<DtlR> sortedL = subL.clone();
		// まとめ後の依頼元使用可能希望日
		sortedL.sort(SortType.ASC, DtlR.$rqst_avl_rqst_dt);
		MCDate rqstAvlRqstDt = sortedL.get(0).rqst_avl_rqst_dt();
		// まとめ後の納入希望日
		sortedL.sort(createSortDlvRqstDt(sortedL));
		MCDate dlvRqstDt = sortedL.get(0).dlv_rqst_dt();
		MCDate dlvRqstHm = sortedL.get(0).dlv_rqst_hm();
		
		DtlR afterBndlDtlR = subL.get(0).clone();
		afterBndlDtlR.check(false);
		afterBndlDtlR.setStatus(Status.MODIFY);
		DtlTable.insertRow(afterBndlDtlR);
		// 紐付けをクリア
		setValueEx(columnDtl_bndl_flg, afterBndlDtlR.getGUIIndex(), true);
		setValueEx(columnDtl_po_schd_src_typ, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_po_schd_src_no, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_slo_no, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_slo_d_no, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_po_schd_no, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_po_d_no, afterBndlDtlR.getGUIIndex(), null);
		
		// まとめ後の値を設定
		setValueEx(columnDtl_trd_unit_qty, afterBndlDtlR.getGUIIndex(), ttl_trd_unit_qty);
		setValueEx(columnDtl_trd_cur_dscnt_amt, afterBndlDtlR.getGUIIndex(), ttl_trd_cur_dscnt_amt);
		setValueEx(columnDtl_dtl_peg_no, afterBndlDtlR.getGUIIndex(), maxDtlPegNo);
		afterBndlDtlR.rqst_avl_rqst_dt(rqstAvlRqstDt);
		setValueEx(columnDtl_dlv_rqst_dt, afterBndlDtlR.getGUIIndex(), dlvRqstDt);
		setValueEx(columnDtl_dlv_rqst_hm, afterBndlDtlR.getGUIIndex(), dlvRqstHm);
		if (isNull(dlvRqstDt)) {
			setValueEx(columnDtl_purc_schd_dt, afterBndlDtlR.getGUIIndex(), null);
		}
		setValueEx(columnDtl_rqst_fr_usr_cd, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_rqst_fr_usr_nm, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_rqst_fr_dpt_cd, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_rqst_fr_dpt_nm, afterBndlDtlR.getGUIIndex(), null);
		
		// ボリュームディスカウントで単価が変わることを想定して単価をクリアする。
		setValueEx(columnDtl_trd_cur_upri, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_trd_cur_proc_upri, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_trd_cur_onr_prov_upri, afterBndlDtlR.getGUIIndex(), null);
		setValueEx(columnDtl_interim_flg, afterBndlDtlR.getGUIIndex(), false);
		setValueEx(columnDtl_upri_not_tgt_flg, afterBndlDtlR.getGUIIndex(), false);
		
		subL = sortListDescGuiIndex(subL);
		// 計画外をまとめる場合はまとめFLGをオンにしない
		boolean hasPoSchd = false;
		boolean hasSlo = false;
		for (DtlR r : subL) {
			if(!isNull(r.po_schd_no()) || r.po_schd_flg()){
				hasPoSchd = true;
			}
			if(!isNull(r.slo_d_no()) || r.rqst_slo_flg()){
				hasSlo = true;
			}
			if (isNull(r.po_d_no())) {
				// 未登録行であれば、行を削除。
				DtlTable.deleteRow(r.getGUIIndex());
			}
			else {
				// 登録済の行であれば削除ステータスとする。
				r.setStatus(Status.DELETE);
				setValueEx(columnDtl_check, r.getGUIIndex(), false);
			}
			// まとめ対象の紐付けＮＯを振りなおす。
			MCList<Dtl2R> bndlTgtL = getDtl2L().subList(Dtl2R.$dtl_peg_no, r.dtl_peg_no());
			bndlTgtL.setNumberNE(Dtl2R.$dtl_peg_no, afterBndlDtlR.dtl_peg_no());
		}
		if (!hasPoSchd) {
			setValueEx(columnDtl_bndl_flg, afterBndlDtlR.getGUIIndex(), false);
		}
		else {
			afterBndlDtlR.po_schd_flg(true);
		}
		if(hasSlo){
			setValueEx(columnDtl_rqst_slo_flg, afterBndlDtlR.getGUIIndex(), true);
		}
	}
	/**
	 * まとめ後の数量合計を算出します
	 * @param dtlL
	 * @return
	 */
	protected MCNumber sumTtlQty (MCList<DtlR> dtlL) {
		MCNumber ttlQty = null;
		if (dtlL.get(0).dscnt_itm_flg()) {
			ttlQty = MCNumber.ONE;
		}
		else {
			for (DtlR r : dtlL) {
				if (!r.isStatusDelete() && !isNull(r.trd_unit_qty())) {
					ttlQty = nvl(ttlQty, MCNumber.ZERO);
					ttlQty = ttlQty.add(r.trd_unit_qty());
				}
			}
		}
		return ttlQty;
	}
	/**
	 * まとめ後の値引額合計を算出します
	 * @param dtlL
	 * @return
	 */
	protected MCNumber sumTtlDscntAmt (MCList<DtlR> dtlL) {
		MCNumber ttl_trd_cur_dscnt_amt = null;
		for (DtlR r : dtlL) {
			if (!r.isStatusDelete() && !isNull(r.trd_cur_dscnt_amt())) {
				ttl_trd_cur_dscnt_amt = nvl(ttl_trd_cur_dscnt_amt, MCNumber.ZERO);
				ttl_trd_cur_dscnt_amt = ttl_trd_cur_dscnt_amt.add(r.trd_cur_dscnt_amt());
			}
		}
		return ttl_trd_cur_dscnt_amt;
	}
	/**
	 * GUIIndexの大きい順に並べ替えたリストを返します。
	 * @param dtlL
	 * @return
	 */
	protected MCList<DtlR> sortListDescGuiIndex(MCList<DtlR> dtlL) {
		if (isNull(dtlL) || dtlL.size() == 0) {
			return dtlL;
		}
		MCList<DtlR> rsltL = MCList.create(DtlR.class);
		int num = dtlL.size()-1;
		int i = 0;
		while (i < dtlL.size()) {
			rsltL.add(dtlL.get(num-i));
			i++;
		}
		return rsltL;
	}
	/**
	 * 納入希望日（時刻含む）順に並べ替えるためのComparatorを返します。
	 * @param dtlL
	 * @return
	 */
	protected Comparator<DtlR> createSortDlvRqstDt(MCList<DtlR> dtlL) {
		Comparator<DtlR> comp = new Comparator<DtlR>() {
			final int rEq = 0;     // arg0とarg1の納入希望日（時刻含む）は同値
			final int rSmall = -1; // arg0の納入希望日（時刻含む）の方が小さい
			final int rBig = 1;    // arg1の納入希望日（時刻含む）の方が小さい
			public int compare(DtlR arg0, DtlR arg1) {
				// 日付がいづれも入力されている場合は、時刻も含めて並べ替えをする
				if (!isNullOr(arg0.dlv_rqst_dt(), arg1.dlv_rqst_dt())) {
					// 時刻を含んで大小関係を比較する
					MCDate dlvRqstHm0;
					if (isNull(arg0.dlv_rqst_hm())) {
						dlvRqstHm0 = arg0.dlv_rqst_dt().endTimeOfDay();
					}
					else {
						dlvRqstHm0 = arg0.dlv_rqst_hm();
					}
					MCDate dlvRqstHm1;
					if (isNull(arg1.dlv_rqst_hm())) {
						dlvRqstHm1 = arg1.dlv_rqst_dt().endTimeOfDay();
					}
					else {
						dlvRqstHm1 = arg1.dlv_rqst_hm();
					}
					
					if (dlvRqstHm0.lt(dlvRqstHm1)) {
						return rSmall;
					}
					else if (dlvRqstHm0.gt(dlvRqstHm1)) {
						return rBig;
					}
					else {
						return rEq;
					}
				}
				else if (isNull(arg0.rqst_dlv_rqst_dt()) && !isNull(arg1.rqst_dlv_rqst_dt())) {
					//　nullは優先度低のため後ろに下げる
					return rBig;
				}
				else if (!isNull(arg0.rqst_dlv_rqst_dt()) && isNull(arg1.rqst_dlv_rqst_dt())) {
					return rSmall;
				}
				else {
					return rEq;
				}
			}
		};
		return comp;
	}
	
	/**
	 * まとめ可能な明細かどうかを判定します。
	 * @param dtlL
	 * @return
	 */
	protected boolean chkBndl(MCList<DtlR> dtlL) {
		DtlR srcR = dtlL.get(0);
		MCMessageList msgL = new MCMessageList();
		for (DtlR r : dtlL) {
			// まとめ可能な条件であるかを判定
			msgL.addAll(canBndlDtl(srcR, r));
			
			// 製造指図済はまとめられない
			if (r.mfg_inst_flg()) {
				msgL.add(new MCMessage(r, null, MSBDP0009, toDispGUIIndex(r)));
			}
			
			// 入荷・仕入・インボイス登録済はまとめられない
			if (doneNextOper(r)) {
				msgL.add(new MCMessage(r, null, MSBDP0021, toDispGUIIndex(r)));
			}
			
			// 値引品はまとめられない
			if (r.dscnt_itm_flg()) {
				msgL.add(new MCMessage(r, null, MSBDP0035, toDispGUIIndex(r)));
			}
		}
		if (msgL.size() > 0) {
			message(msgL);
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * まとめ可能な明細かどうかを判定します。
	 * @param dtlL
	 * @return
	 */
	protected MCMessageList canBndlDtl(DtlR srcR, DtlR descR) {
		MCMessageList msgL = new MCMessageList();
		if (!(isSameCol(columnDtl_itm_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_itm_sub1, srcR, descR, msgL)
				&& isSameCol(columnDtl_itm_sub2, srcR, descR, msgL)
				&& isSameCol(columnDtl_itm_sub3, srcR, descR, msgL)
				&& isSameCol(columnDtl_itm_nm, srcR, descR, msgL)
				&& isSameCol(columnDtl_ver_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_maker_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_trd_unit_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_mfg_loc_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bom_ptn, srcR, descR, msgL)
				&& isSameCol(columnDtl_sppl_itm_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_sppl_itm_nm, srcR, descR, msgL)
				&& isSameCol(columnDtl_iv_itm_nm, srcR, descR, msgL)
				&& isSameCol(columnDtl_in_to_loc_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_purc_id_typ, srcR, descR, msgL)
				&& isSameCol(columnDtl_purc_upri_req_typ, srcR, descR, msgL)
				&& isSameCol(columnDtl_pay_crryovr_times, srcR, descR, msgL)
				&& isSameCol(columnDtl_wtax_rate, srcR, descR, msgL)
				&& isSameCol(columnDtl_ap_dpt_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bp_lot_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_sno1, srcR, descR, msgL)
				&& isSameCol(columnDtl_sno2, srcR, descR, msgL)
				&& isSameCol(columnDtl_sno3, srcR, descR, msgL)
				&& isSameCol(columnDtl_sno4, srcR, descR, msgL)
				&& isSameCol(columnDtl_purc_rsn_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_dpt_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_itm_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_itm_sub1, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_itm_sub2, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_itm_sub3, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_lot_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_sublot_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_sno1, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_sno2, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_sno3, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_sno4, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_loc_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_ctg_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_oper_cd, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_iv_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_slo_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_bd_po_no, srcR, descR, msgL)
				&& isSameCol(columnDtl_pri_prnt_flg, srcR, descR, msgL)
				&& isSameCol(columnDtl_arr_cnt_rmrks, srcR, descR, msgL)
				&& isSameCol(columnDtl_trd_d_rmrks, srcR, descR, msgL)
				&& isSameCol(columnDtl_intr_rmrks, srcR, descR, msgL)
				&& isSameCol(columnDtl_po_print_d_rmrks, srcR, descR, msgL)
				&& isSameCol(columnDtl_dlv_slip_d_rmrks, srcR, descR, msgL)
				&& isSameCol(columnDtl_rqst_can_flg, srcR, descR, msgL)
			)) {
		}
		return msgL;
	}
	
	protected boolean isSameCol(MCColumnConfig column, DtlR src, DtlR desc, MCMessageList msgL) {
		boolean rslt = false;
		// nullとnull文字の比較は差異とはみなさない。
		if ((isNull(column.getValue(desc.getGUIIndex())) || column.getValue(desc.getGUIIndex()) instanceof String)
				&& (isNull(column.getValue(src.getGUIIndex())) || column.getValue(src.getGUIIndex()) instanceof String)) {
			String col1 = (String)column.getValue(src.getGUIIndex());
			String col2 = (String)column.getValue(desc.getGUIIndex());
			if (isNullOrNullVal(col1) && isNullOrNullVal(col2)) {
				return true;
			}
		}
		// 項目に差異があるか比較
		rslt = isSame(column.getValue(src.getGUIIndex()), column.getValue(desc.getGUIIndex()));
		if (!rslt) {
			MCMessage msg = new MCMessage(desc, null, MSBDP0007, column.getLabelByLocale(), toDispGUIIndex(desc));
			msgL.add(msg);
		}
		
		return rslt;
	}
	
	/**
	 * Panel[Btn]のボタン[srch_upri]の押下時の処理
	 */
	@Override
	public void doBtn_srch_upri(MCEventInfo info) {
		callMS_MSBDL0080_Sprt02();
	}
	/**
	 * Panel[Btn]のボタン[srch_dlv]の押下時の処理
	 */
	@Override
	public void doBtn_srch_dlv(MCEventInfo info) {
		callMS_MSBDL0080_Sprt03();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0080_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0080_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0080_Del01();
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
		MCList<Dtl2R> tmpL = MCList.create(Dtl2R.class);
		for (Dtl2R r : getDtl2L()) {
			// 発注予定を新規登録時に行削除した場合は削除。
			// ステータスをDELに変えた場合は残しておく。
			DtlR dtlR = getDtlL().getFirst(DtlR.$dtl_peg_no, r.dtl_peg_no());
			if (!isNull(dtlR)) {
				tmpL.add(r);
			}
		}
		getDtl2L().setAll(tmpL);
		setDispAmt();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);
		if (isNull(dtlR)) {
			return;
		}
		dtlR.arr_rem_abort_flg(false);
		dtlR.purc_rem_abort_flg(false);
		setBtnMode(dtlR.getGUIIndex());
		setDispAmt();
	}
	
	// -----------------------------------------------
	// チェック処理
	// -----------------------------------------------
	/**
	 * チェック処理（ヘッダ）
	 * @return
	 */
	protected MCMessageList cmnChkHdr() {
		MCMessageList msgL = new MCMessageList();
		msgL.addAll(checkAfterToday(Hdr_upd_po_print_schd_dt));
		return msgL;
	}
	/**
	 * チェック処理（明細）
	 * @param dtlR
	 * @return
	 */
	protected MCMessageList cmnChkDtl(DtlR dtlR) {
		MCMessageList msgL = new MCMessageList();
		if (dtlR.abort_flg()) {
			// 打切時はチェックしない
			return msgL;
		}
		if (Hdr_subcon_flg.getValue() 
				&& !isNonPurc(dtlR)
				&& (isNullOr(dtlR.dlv_rqst_dt(), dtlR.purc_schd_dt())
						|| !dtlR.dlv_rqst_dt().eqDate(dtlR.purc_schd_dt()))) {
			msgL.add(new MCMessage(dtlR, DtlR.$dlv_rqst_dt, MSBDP0001, toDispGUIIndex(dtlR)));
		}
		msgL.addAll(checkBeforeAfter(Hdr_po_dt, columnDtl_dlv_rqst_dt, dtlR));
		msgL.addAll(checkBeforeAfter(Hdr_po_dt, columnDtl_purc_schd_dt, dtlR));
		msgL.addAll(checkPositive(dtlR, columnDtl_trd_unit_qty));
		return msgL;
	}
	// -----------------------------------------------
	// 画面遷移（他画面から本画面への遷移）
	// -----------------------------------------------
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (T1 == openTyp) {
			if (args[0] instanceof MCList) {
				MCList<mcframe.clientMSBD.MSBDP0090.DtlR> dtlL = (MCList)args[0];
				for (mcframe.clientMSBD.MSBDP0090.DtlR r : dtlL) {
					Cnd2R cnd2R = Cnd2R.create();
					cnd2R.po_schd_no(r.po_schd_no());
					Cnd2Table.insertRow(cnd2R);
				}
				setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
				valueInit();
				
				addDoBehind(Cnd_srch_po_schd);
			}
		}
	}
	// -----------------------------------------------
	// 画面遷移(納期調整登録)
	// -----------------------------------------------
	/**
	 * 納期調整登録画面へ遷移します。（発注ＮＯによる再検索を実施します）
	 * @param info
	 */
	protected void openMSBD0120 (MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0120");
		aso.putCnd(crtOpenMSBDP0120CndR(aso, getHdrR()));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0120.CndR crtOpenMSBDP0120CndR(MAUCP_AppScreenOpener aso, HdrR r) {	
		mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg p = (mcframe.clientMSBD.MSBDP0120.MSBDP_PurcDlvDtAdjstReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0120.CndR to = mcframe.clientMSBD.MSBDP0120.CndR.create();
		to.po_no(r.po_no());
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
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
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0250");
		aso.putCnd(crtOpenMSBDP0250CndR(aso, getHdrR()));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0250.CndR crtOpenMSBDP0250CndR(MAUCP_AppScreenOpener aso, HdrR r) {	
		mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt p = (mcframe.clientMSBD.MSBDP0250.MSBDP_PurcDlvSlipPrnt) aso.getPanel();
		mcframe.clientMSBD.MSBDP0250.CndR to = mcframe.clientMSBD.MSBDP0250.CndR.create();
		to.po_no(r.po_no());
		to.ope(p.Cnd_ope_DLVSLIP.getActionCommand());
		return to;
	}
	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);

		R row = list.get(0);
		
		if(isNull(row)) {
			return;
		}

		String bizTyp = getHdrR().getBoolean(HdrR.$edi_flg) ? MAC_BIZ_TYP.PO_EDI.value(): MAC_BIZ_TYP.PO.value();
		row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
	}
	
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		setHdrValue();
		Dtl2Table.setMode(MCMode.INVISIBLE);
		Cnd2Table.setMode(MCMode.INVISIBLE);
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 発注先
		Hdr_sppl_p_PPanel.setRelateBeans(Hdr_sppl_cd, Hdr_sppl_nm);
		// 為替レート
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_purc_xrate_cd, Hdr_po_dt, true, Hdr_xrate_inpt_flg);
		// 納税為替レート
		Hdr_prax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_purc_xrate_cd, Hdr_po_dt, true, Hdr_ptax_xrate_inpt_flg);
		
		// 担当者・部門
		Hdr_purc_usr_dpt_p_PPanel.setRelateBeans(Hdr_po_dt, Hdr_po_schd_no);
		
		// 品目
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		// 版
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_site_cd, columnDtl_ver_flg);
		// 有効成分
		Dtl_inst_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
				columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		// 手配ＮＯ
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		//　納入場所
		Dtl_in_to_loc_p_PPanel.setRelateBeans(columnDtl_in_to_loc_cd, columnDtl_in_to_loc_nm);
		// 棚・ライン
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_in_to_loc_cd, columnDtl_str_ln_tgt_flg);

		// 発注数量
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
				, columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ
				, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		
		
		// 基準単位数量
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);

		// 配送先
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		
		// 取引通貨単価・金額
		Dtl_trd_cur_upri_p_PPanel.setSchd(true);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_sppl_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place,
				Hdr_purc_amt_rnd_typ, Hdr_purc_tax_rnd_typ, Hdr_sppl_purc_upri_cng_flg, columnDtl_itm_purc_upri_cng_flg, columnDtl_dscnt_itm_flg);
		// 取引通貨加工単価・金額
		Dtl_trd_cur_proc_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_proc_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place, columnDtl_trd_unit_qty, columnDtl_trd_cur_proc_upri,
				Hdr_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd);
		Dtl_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place, columnDtl_trd_unit_qty,
				columnDtl_trd_cur_onr_prov_upri, Hdr_purc_amt_rnd_typ, null);

		// 基準通貨単価・金額
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, Hdr_xrate);
		// 基準通貨加工単価・金額
		Dtl_base_cur_proc_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_proc_upri, Hdr_xrate);
		Dtl_base_cur_proc_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_proc_amt, Hdr_xrate);
		// 基準通貨有償支給単価・金額
		Dtl_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri, Hdr_xrate);
		Dtl_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt, Hdr_xrate);
				
		// 納税通貨単価・金額
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, Hdr_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl_ptax_cur_proc_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_proc_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_proc_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_proc_amt, Hdr_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_onr_prov_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_onr_prov_amt, Hdr_ptax_xrate);
		
		// 源泉税額
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_base_cur_amt, columnDtl_wtax_rate, true);
		// 負担項目
		Dtl_bditm_p_PPanel.setRelateBeans(columnDtl_asset_mng_typ, 
				columnDtl_bd_lot_mng_typ, columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ, 
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ, columnDtl_bd_sno4_mng_typ);;
	}
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		String sysParm = getSysParm("MASTER_DT_BASE");
		// 品目
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr_sppl_cd);
		if (isSame(sysParm, "1")) {
			getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, columnDtl_rqst_avl_rqst_dt);
		} else {
			getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_po_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_po_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_po_dt);
			getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_po_dt);
		}
		
		// 買掛先
		getDtl_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_po_dt);
		
		// 負担部門
		getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_po_dt);
		
		// メーカＣＤ
		getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, Hdr_sppl_cd);
		if (isSame(sysParm, "1")) {
			getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, columnDtl_rqst_avl_rqst_dt);
		} else {
			getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, Hdr_po_dt);
		}
	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		if (beans == columnDtl_itm_cd) {
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(getHdrR().trd_ptn_typ())) {
				bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
			}
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}	

	@Override
	protected void listInit() {
		super.listInit();
		getDtl_in_to_loc_cd_ListPutter().putBind(LocCols.$i_dt, Hdr_po_dt);
		getDtl_mfg_loc_cd_ListPutter().putBind(MSUAC_List.ItmDtlMfgLocCols.$i_master_dt,
				Hdr_po_dt);
		getDtl_bom_ptn_ListPutter().putBind(MSUAC_List.ItmDtlBomPtnCols.$i_dt, Hdr_po_dt);
		MCColumnConfig[] ignoreCols = {
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
		//--------------------------------------
		// NCEvent
		//--------------------------------------
		columnDtl_interim_flg.addNCListener(this);
		columnDtl_trd_unit_qty.addNCListener(this);
		//--------------------------------------
		// LCEvent
		//--------------------------------------
		// 一括入力
		BulkSet_dlv_rqst_dt.addLCListener(this);
		BulkSet_dlv_rqst_hm.addLCListener(this);
		//　金額
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl_trd_cur_proc_upri.addLCListener(this);
		columnDtl_trd_cur_onr_prov_upri.addLCListener(this);
		// 品目
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		// 予定日
		columnDtl_dlv_rqst_dt.addLCListener(this);
		columnDtl_dlv_rqst_hm.addLCListener(this);
		// 手配ＮＯ
		columnDtl_sno1.addLCListener(this);
		//購買部門
		Hdr_purc_dpt_cd.addLCListener(this);
		
		getDtlL().addListListener(createListListener(createDtlRowListener()));
	}
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR dtl = (DtlR) event.getSourceRow();
				if (isNull(dtl.rqst_avl_rqst_dt())) {
					bulkSet(columnDtl_rqst_avl_rqst_dt, dtl);
				}
				if (isNull(dtl.dlv_rqst_dt())) {
					bulkSet(columnDtl_dlv_rqst_dt, dtl);
				}
				if (isNull(dtl.dlv_rqst_hm())) {
					bulkSet(columnDtl_dlv_rqst_hm, dtl);
				}
				copyHdrToDtl(dtl);
			}
		}
	}
	// -----------------------------------------------
	// VCEvent
	// -----------------------------------------------
	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {
		// 参照新規時
		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())
				&& isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isREFStatus(bfSt)) {
			
			// 受注紐付発注の場合参照登録はできない
			boolean canRefToInsFlg = true;
			for (DtlR dtlR : getDtlL()) {
				if (!isNull(dtlR.slo_no()) && !dtlR.rqst_can_flg()) {
					dialog(MSBDP0034);
					canRefToInsFlg = false;
					break;
				}
			}
			
			if (!canRefToInsFlg) {
				return false;
			}
			Dtl2Table.clear();
			return true;
		}
		// 参照以外のオペレーションから別オペレーションへ移動時
		else if (!isSame(bfOpe, Cnd_ope_REF.getActionCommand())) {
			if (!isChanged()) {
				// 変更時はconfirmRegDataClear()でクリアする
				clearBulkSet();
			}
		}
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}
	@Override
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		return super.doHdr_trd_cd_VC(info);
	}
	
	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnDtl_interim_flg) {
			doDtl_interim_flg_NC(info);
		}
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
			setOutsrcAmt(getHdrR(), dtlR);
		}
	}
	
	@Override
	public void doCnd_ope_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setHdrValue();
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)) {
			setBtnMode(r.getGUIIndex());
		}
	}
	
	@Override
	public void doHdr_prnt_po_flg_NC(MCEventInfo info) {
		super.doHdr_prnt_po_flg_NC(info);
		if (isEditableMode(Hdr_po_print_dt) && !Hdr_prnt_po_flg.getValue()) {
			Hdr_po_print_dt.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_po_print_dt);
		}
	}
	@Override
	public void doHdr_aprv_rvrs_flg_NC(MCEventInfo info) {
		super.doHdr_aprv_rvrs_flg_NC(info);
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
	};
	
	/**
	 * 仮単価ＦＬＧの制御を行います。
	 * @param info
	 */
	public void doDtl_interim_flg_NC(MCEventInfo info) {
		setUpdPoPrintSchdDtMode();
	}
	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		super.doDtl_abort_flg_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setBtnRdelMode(dtlR);
		setDispAmt();
	}
	
	@Override
	public void doDtl_po_conf_rcpt_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_po_conf_rcpt_flg_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_po_conf_rcpt_dt, dtlR.getGUIIndex(), null);
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode(info.getEventIndex());
	}
	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_trd_cur_amt) {
			doDtl_trd_cur_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_tax_amt) {
			doDtl_trd_cur_tax_amt_LC(info);
		}
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_LC(info);
		}
		if (lc == BulkSet_dlv_rqst_dt) {
			doBulkSet_dlv_rqst_dt_LC(info);
		}
		if (lc == BulkSet_dlv_rqst_hm) {
			doBulkSet_dlv_rqst_hm_LC(info);
		}
		if (lc == columnDtl_dlv_rqst_dt) {
			doDtl_dlv_rqst_dt_LC(info);
		}
		if (lc == columnDtl_dlv_rqst_hm) {
			doDtl_dlv_rqst_hm_LC(info);
		}
		if (lc == columnDtl_sno1) {
			doDtl_sno1_LC(info);
		}
		if(lc == columnDtl_trd_cur_upri){
			doDtl_trd_cur_upri_LC(info);
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
		if (lc == columnDtl_trd_cur_inc_tax_amt) {
			doDtl_trd_cur_inc_tax_amt_LC(info);
		}
		if (lc == columnDtl_tax_cd) {
			doDtl_tax_cd_LC(info);
		}
		if (lc == Hdr_purc_dpt_cd) {
			doHdr_purc_dpt_cd_LC(info);
		}
	}
	
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (!isNullOrNullVal(dtlR.mfg_loc_cd())) {
			setValueEx(columnDtl_outsrc_flg, dtlR.getGUIIndex(), true);
			setValueEx(columnDtl_repurc_obli_flg, dtlR.getGUIIndex(), getHdrR().repurc_obli_flg());
			if (!isSame(dtlR.outsrc_upri_typ(), getHdrR().outsrc_upri_typ())) {
				clearAmtInfo(dtlR);
			}
			dtlR.outsrc_upri_typ(getHdrR().outsrc_upri_typ());
		}
		else {
			setValueEx(columnDtl_outsrc_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_bom_ptn, dtlR.getGUIIndex(), null);
			// 製造場所が「*」でもwg_cdが設定されるのでクリアする
			setValueEx(columnDtl_mfg_loc_wg_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_repurc_obli_flg, dtlR.getGUIIndex(), false);
			if (!isNull(dtlR.outsrc_upri_typ())) {
				clearAmtInfo(dtlR);
			}
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
	
	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);
	}
	
	@Override
	public void doHdr_sppl_cd_LC(MCEventInfo info) {
		super.doHdr_sppl_cd_LC(info);
		setModeValBySppl();
		setUpdPoPrintSchdDtMode();
		setEdiFlgMode();
		for (DtlR r : exceptEmpty(getDtlL())) {
			if (r.abort_flg()) {
				continue;
			}
			setPriPrntFlg(r);
			setDefaultTaxCd(r, true);
			setDefaultPurcUpriReqTyp(r);
			setDefaultPayCrryovrTimes(r);
			setIvItmNm(r);
			setSpplItm(r);
			setDtlOutsrcColumnByHdr(r);
		}
		setDispAmt();
		String purcDptCd = getHdrR().purc_dpt_cd();
		if (!isNull(getHdrR().def_purc_usr_cd()) || !isNull(getHdrR().def_purc_dpt_cd())){
			setValueEx(Hdr_purc_usr_cd, null);
			setValueEx(Hdr_purc_dpt_cd, null);
		}
		if (!isNull(getHdrR().def_purc_usr_cd())) {
			setValueEx(Hdr_purc_usr_cd, getHdrR().def_purc_usr_cd());
		}
		else if (!isNull(getHdrR().def_purc_dpt_cd())) {
			setValueEx(Hdr_purc_dpt_cd, getHdrR().def_purc_dpt_cd());
		}
		if (isNull(getHdrR().po_print_cd()) && !isNullOr(getHdrR().sppl_cd(), getCo().po_print_cd())) {
			setValueEx(Hdr_po_print_cd, getCo().po_print_cd());
		}
		if (!isNull(getHdrR().sppl_cd()) && !isNull(getHdrR().po_dt())) {
			getHdrR().sppl_chg_flg(true);
			callMS_MSBDL0080_Sprt04();
		}
		if (isNull(Hdr_sppl_cd.getValue())) {
			// 発注先クリア時
			getHdrR().ap_dpt_cd(null);
		}
		else {
			if (!isNull(getHdrR().mst_ap_dpt_cd())) {
				// 変更後の発注先に対しマスタで債務部門が設定されていた場合
				getHdrR().ap_dpt_cd(getHdrR().mst_ap_dpt_cd());
			}
			else {
				if (isNullAnd(purcDptCd, getHdrR().purc_dpt_cd())) {
					// 購買部門の変更イベントが起きない場合はここでクリア
					getHdrR().ap_dpt_cd(null);
				}
				else {
					getHdrR().ap_dpt_cd(getHdrR().ap_dpt_flg() ? getHdrR().purc_dpt_cd() : null);
				}
			}
		}
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultApDptCd(r);
		}
	}
	public void doHdr_purc_dpt_cd_LC(MCEventInfo info) {
		String apDptCd = getHdrR().ap_dpt_cd();
		setApDptCd();

		if (!isSame(apDptCd, getHdrR().ap_dpt_cd())) {
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				setDefaultApDptCd(r);
			}
		}
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setSchdDt(r);
		}
	}
	/**
	 * ヘッダの外注に係る項目を明細に設定する。
	 */
	protected void setDtlOutsrcColumnByHdr(DtlR r) {
		HdrR hdrR = getHdrR();
		if(r.outsrc_flg()) {
			r.repurc_obli_flg(hdrR.repurc_obli_flg());
			r.outsrc_upri_typ(hdrR.outsrc_upri_typ());
			if(MAC_OUTSRC_UPRI_TYP.isPROC(r.outsrc_upri_typ())) {	
				setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
			}
			if(r.repurc_obli_flg()) {
				setRepurcObliTax(r);
			}
		}
		else {
			r.repurc_obli_flg(false);
			r.outsrc_upri_typ(null);
			setValueEx(columnDtl_trd_cur_proc_upri, r.getGUIIndex(), null);
			setValueEx(columnDtl_trd_cur_onr_prov_upri, r.getGUIIndex(), null);
		}
	}
	
	@Override
	public void doHdr_edi_tgt_flg_NC(MCEventInfo info) {
		getHdrR().edi_flg((Boolean) info.getNewValue());
		super.doHdr_edi_tgt_flg_NC(info);
	}
	@Override
	public void doHdr_edi_flg_NC(mcframe.clientCore.event.MCEventInfo info) {	
		super.doHdr_edi_flg_NC(info);
		if((Boolean)info.getNewValue()) {
			setValueEx(Hdr_prnt_po_flg, false);
		}
	}
	@Override
	public void doHdr_po_dt_LC(MCEventInfo info) {
		super.doHdr_po_dt_LC(info);
		for (DtlR r : exceptEmpty(getDtlL())) {
			if (r.abort_flg()) {
				continue;
			}
			if (!r.tax_fix_flg()) {
				setDefaultTaxCd(r, false);
			}
			setWtaxRate(r);
			if (isNull(r.po_schd_no())) {
				setSpplItm(r);
			}
		}
		if (!isNull(getHdrR().sppl_cd()) && !isNull(getHdrR().po_dt())) {
			getHdrR().sppl_chg_flg(false);
			callMS_MSBDL0080_Sprt04();
		}
	}

	protected void setModeValBySppl() {
		if (isPriPrintTrgt() && canPrntDlvSlip()) {
			Hdr_prnt_dlv_flg.setMode(MCMode.REQUIRED);
			getHdrR().prnt_dlv_flg(getDefDlvSlipPrntFlg());
		}
		else {
			Hdr_prnt_dlv_flg.setMode(MCMode.READ_ONLY);
			getHdrR().prnt_dlv_flg(false);
		}
		if (existPurcDdlv() && canPrntDlvSlip()) {
			Hdr_prnt_purc_ddlv_dlv_flg.setMode(MCMode.REQUIRED);
			getHdrR().prnt_purc_ddlv_dlv_flg(getDefDlvSlipPrntFlg());
		}
		else {
			Hdr_prnt_purc_ddlv_dlv_flg.setMode(MCMode.READ_ONLY);
			getHdrR().prnt_purc_ddlv_dlv_flg(false);
		}
	}

	protected boolean canPrntDlvSlip() {
		if (Cnd_ope_REF.isSelected() && !getHdrR().latest_flg()) {
			return false;
		}
		return true;
	}

	protected boolean existPurcDdlv() {
		for (DtlR r : getDtlL()) {
			if (MSC_DRCT_DLV_TYP.isDDLV(r.drct_dlv_typ())
				&& !isNull(r.slo_no())) {
				return true;
			}
		}
		return false;
	}
	protected boolean getDefDlvSlipPrntFlg() {
		if (Cnd_ope_INS.isSelected()
			|| Cnd_ope_UPD.isSelected()
			|| Cnd_ope_DEL.isSelected()) {
			return getHdrR().po_dlv_slip_flg();
		}
		return false;
	}
	
	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		setXrateInputMode();
		setPtaxXrateInputMode();
	}
	@Override
	public void doBulkSet_rqst_avl_rqst_dt_LC(MCEventInfo info) {
		super.doBulkSet_rqst_avl_rqst_dt_LC(info);
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.abort_flg()) {
				bulkSet(columnDtl_rqst_avl_rqst_dt, dtlR);
			}
		}
	}
	/**
	 * 納入希望日を一括設定します
	 */
	protected void doBulkSet_dlv_rqst_dt_LC(MCEventInfo info) {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.abort_flg()) {
				bulkSet(columnDtl_dlv_rqst_dt, dtlR);
			}
		}
	}
	/**
	 * 納入希望時刻を一括設定します
	 */
	protected void doBulkSet_dlv_rqst_hm_LC(MCEventInfo info) {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.abort_flg()) {
				bulkSet(columnDtl_dlv_rqst_hm, dtlR);
			}
		}
	}
	/**
	 * 金額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		setDispAmt();
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
			setOutsrcAmt(getHdrR(), dtlR);
		}
		setDispAmt();
	}
	public void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setDispAmt();
	}
	
	public void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		HdrR hdrR = getHdrR();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_upri(dtlR.trd_cur_upri());
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(hdrR, dtlR);
			setPtaxCurAmt(hdrR, dtlR);
		}
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(hdrR, dtlR);
		}
		clearDscntAmt(dtlR);
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
			setOutsrcAmt(getHdrR(), dtlR);
		}
	}
	/**
	 * 取引通貨値引額変更イベント
	 * @param info
	 */
	protected void doDtl_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		HdrR hdrR = getHdrR();
		if(dtlR.outsrc_flg()) {
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(hdrR, dtlR);
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
	 * @param dtlR
	 */
	protected void chkProcAmtMinus(DtlR dtlR) {
		if(!dtlR.outsrc_flg() || isNull(dtlR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
				dtlR.trd_unit_qty(),
				getHdrR().trd_cur_amt_dec_place(),
				getHdrR().purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		setValueEx(columnDtl_trd_cur_proc_amt, dtlR.getGUIIndex(), procAmt);
	}
	
	protected void clearDscntAmt(DtlR dtlR) {
		if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
			setValueEx(columnDtl_trd_cur_dscnt_amt, dtlR.getGUIIndex(), null);
		}
	}
	
	@Override
	public void doDtl_purc_id_typ_LC(MCEventInfo info) {
		super.doDtl_purc_id_typ_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNonPurc(dtlR)) {
			// 無償受給またはVMIの場合
			setValueEx(columnDtl_purc_schd_dt, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_purc_upri_req_typ, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), null);
			Dtl_bditm_p_PPanel.clearBdItem(dtlR.getGUIIndex());
			clearAmtInfo(dtlR);
		}
		else {
			setDefaultPayCrryovrTimes(dtlR);
			dtlR.purc_cmpl_flg(false);
		}
		
		setDefaultPurcBasisTyp(dtlR);
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
	 * 品目変更イベント
	 * @param info
	 */
	protected void doDtl_itm_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			// クリア
			clearRsn(dtlR);
			clearVerNo(dtlR);
			// 初期値設定
			setColByDscntItm(dtlR);
			setDefaultTaxCd(dtlR, true);
			setIvItmNm(dtlR);
			setSpplItm(dtlR);
			setDefaultPayCrryovrTimes(dtlR);
			setDefaultPurcIdTyp(dtlR);
			setWtaxRate(dtlR);
			setDefaultPurcBasisTyp(dtlR);
			setSyncFlg(dtlR);
			setDefStrLnCd(dtlR);
			setDlvSlipInvldFlg(dtlR);
			setSchdDt(dtlR);
		}
	}
	
	@Override
	public void doDtl_in_to_loc_cd_LC(MCEventInfo info) {
		super.doDtl_in_to_loc_cd_LC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 購買識別区分がマッチしない場合クリア
		clearPurcIdTyp(dtlR);
		// 版ＮＯクリア
		clearVerNo(dtlR);
		// 直納区分の設定
		setDrctDlvTyp(dtlR);
		setSchdDt(dtlR);
	}
	/**
	 * 納入希望日変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setSchdDt(dtlR);
		if (!dtlR.tax_fix_flg()) {
			setDefaultTaxCd(dtlR, false);
		}
		setWtaxRate(dtlR);
	}
	/**
	 * 納入希望時刻変更イベント
	 * @param info
	 */
	public void doDtl_dlv_rqst_hm_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.po_schd_no())) {
			// 計画外の場合補完、またはまとめ後は連動させる
			setValueEx(columnDtl_rqst_dlv_rqst_hm, dtlR.getGUIIndex(), dtlR.dlv_rqst_hm());
		}
	}

	/**
	 * 仕入予定日変更イベント
	 * @param info
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info) {
		// 予定日の反映
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		doDtl_purc_schd_dt_LC_Sub(dtlR);
	}
	protected void doDtl_purc_schd_dt_LC_Sub(DtlR dtlR){
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
			// 計画外の場合補完、またはまとめ後は連動させる
			setValueEx(columnDtl_rqst_dlv_rqst_dt, dtlR.getGUIIndex(), dtlR.dlv_rqst_dt());
		}
	}
	

	/**
	 * 手配ＮＯ１変更イベント
	 * @param info
	 */
	public void doDtl_sno1_LC(MCEventInfo info) {
		setWrkNo();
	}
	// -----------------------------------------------
	// リスト取得
	// -----------------------------------------------
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(getHdrR().trd_ptn_typ())) {
			row.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
		}
		return super.getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
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
	
	// 打切り、打切り解除の場合にtrue
	protected boolean isAbortChn(DtlR dtlR){
		return dtlR.abort_flg() || !isSame(dtlR.abort_flg(), dtlR.bef_abort_flg());
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
			if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
				// 入荷、仕入、受領IVのいずれかが行われている場合
				// ※打切り、打切り解除はこの後で判断するので除いている
				if (doneNextOper(dtlR) && !isAbortChn(dtlR)) {
					if (column == columnDtl_show_dtl) {
						return MCMode.ENABLE;
					}
					if (column == columnDtl_dlv_show_dtl) {
						return MCMode.ENABLE;
					}
					if (column == columnDtl_tdlv_show_dtl) {
						return MCMode.ENABLE;
					}
					else {
						if (isSame(getStatus(), UPD_NEXT) && (dtlR.arr_rem_abort_flg() || dtlR.purc_rem_abort_flg())) {
							if (column == columnDtl_abort_flg) {
								return MCMode.REQUIRED;
							}
						}
						return MCMode.READ_ONLY;
					}
			
				}
				// 打切・打切解除の場合
				else if (isAbortChn(dtlR)) {
					// 打切以外の項目は入力不可
					if(column != columnDtl_abort_flg) {
						if (isEditableMode(column)) {
							return MCMode.READ_ONLY;
						}
			
					}
				}
				else {
					// 打切
					if (column == columnDtl_abort_flg) {
						if (dtlR.bndl_flg() && isNull(dtlR.po_d_no())) {
							// まとめと打切は同時にできない
							return MCMode.READ_ONLY;
						}
						else if (dtlR.isStatusCreate()||dtlR.isEmpty()) {
							// 新規行の場合は打切り出来ない
							return MCMode.READ_ONLY;
						}
		
					}
					
					if (column == columnDtl_trd_cur_dscnt_amt) {
						if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
							return MCMode.READ_ONLY;
						}
					}
					
					// まとめのまとめは不可
					if (column == columnDtl_check) {
						if (isEditableMode(column) && dtlR.bndl_flg() && !isNull(dtlR.po_d_no())) {
							return MCMode.READ_ONLY;
						}
						if (!isNull(dtlR.dlv_cd()) && !dtlR.rqst_can_flg()) {
							// 仕入直送の場合はまとめ不可
							return MCMode.READ_ONLY;
						}
						if (dtlR.mfg_inst_flg() || dtlR.dscnt_itm_flg() || doneNextOper(dtlR)) {
							return MCMode.READ_ONLY;
						}
						
					}
					
					// 品目
					if (Dtl_itm_p_PPanel.isItm(column)) {
						if (isEditableMode(column) && (dtlR.bndl_flg() || !isNull(dtlR.po_d_no()) || !isNull(dtlR.po_schd_no()))) {
							return MCMode.READ_ONLY;
						}
	
					}
					
					// 品名
					if (column == columnDtl_itm_nm) {
						if (isEditableMode(column) && (dtlR.po_schd_flg() || !dtlR.sundry_itm_flg())) {
							return MCMode.READ_ONLY;
						}
					}
					
					// メーカ
					if (column == columnDtl_maker_cd) {
						if (isEditableMode(column) && dtlR.outsrc_flg()
								&& !isNull(dtlR.po_schd_no())) {
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
						if (isEditableMode(column) && (!dtlR.sundry_itm_flg() || !getHdrR().sppl_iv_flg())) {
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
					
					// 依頼元納入希望日時
					if (column == columnDtl_rqst_avl_rqst_dt) {
						if (isEditableMode(column) 
								&& (!isNull(dtlR.po_schd_no()))) {
							return MCMode.READ_ONLY;
						}
						
					}
					// 仕入予定日
					if (column == columnDtl_purc_schd_dt) {
						if (isNonPurc(dtlR)) {
							return MCMode.READ_ONLY;
						}
						else if (getHdrR().subcon_flg()) {
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
						if (isEditableMode(column) && 
								(isNullOr(dtlR.dlv_rqst_dt(), dtlR.purc_schd_dt())
										|| !dtlR.dlv_rqst_dt().eqDate(dtlR.purc_schd_dt()))) {
							return MCMode.READ_ONLY;
						}
						if (isPurcDdlv(dtlR)) {
							return MCMode.READ_ONLY;
						}
						if (getHdrR().subcon_flg()) {
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
						if (getHdrR().subcon_flg()) {
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
						if (!dtlR.itm_purc_upri_cng_flg() && !getHdrR().sppl_purc_upri_cng_flg()) {
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
						if (!dtlR.itm_purc_upri_cng_flg() && !getHdrR().sppl_purc_upri_cng_flg()) {
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
						if(!canEditWtaxRate(dtlR)) {
							return MCMode.READ_ONLY;
						}

					}
					
					// 仕入理由
					if (column == columnDtl_purc_rsn_cd) {
						if (isEditableMode(column) && MSUCP_PurcUtil.isPurcXpns(Hdr_trd_ptn_typ.getValue(), dtlR.asset_mng_typ())) {
							return MCMode.REQUIRED;
						}

					}
					// 請書受領
					if (column == columnDtl_po_conf_rcpt_dt) {
						if (isEditableMode(column) && !dtlR.po_conf_rcpt_flg()) {
							return MCMode.READ_ONLY;
						} 

					}
					// 手配ＮＯ１～４
					if (column == columnDtl_sno1
							|| column == columnDtl_sno2
							|| column == columnDtl_sno3
							|| column == columnDtl_sno4) {
						if (isEditableMode(column) && (!isNull(dtlR.slo_no()) || dtlR.rqst_slo_flg()) && !dtlR.rqst_can_flg()) {
							return MCMode.READ_ONLY;
						}
	
					}
					
					// 価格印字
					if (column == columnDtl_pri_prnt_flg) {
						if (isNull(getHdrR().sppl_ship_form_cd())) {
							return MCMode.READ_ONLY;
						}
						else if (isEditableMode(column)) {
							return MCMode.REQUIRED;
						}
					}
					if (column == columnDtl_mfg_loc_cd || column == columnDtl_bom_ptn) {
						if (isNull(dtlR.po_schd_no()) && isNull(dtlR.po_d_no())
							&& (isSame(getStatus(), INS) || isSame(getStatus(), UPD))) {
							if (dtlR.outsrc_flg()) {
								return MCMode.REQUIRED;
							}
							else {
								return MCMode.ENABLE;
							}
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
	@Override
	public void setStatus(String status) {
		super.setStatus(status);
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		setRevNoMode();
		setModeValBySppl();
		setStatusColumn();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setRevNoMode();
		setStatusColumn();
		setModeValBySppl();
	}
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setInsHdrMode();
		setFooterValue();
		getHdrR().setStatus(MCRow.CREATE);
		exceptViewEmpty(DtlTable).setStatus(MCRow.CREATE);
		// 行ステータスを非表示
		setStatusColumn();
	}
	@Override
	public void setUPDStatus() {
		if (isAprvFixOrAccpt()) {
			setUPD_APRVStatus();
		}
		else if (isNextOper()) {
			setUPD_NEXTStatus();
		}
		else {
			super.setUPDStatus();
		}
		setUpdHdrMode();
		setFooterValue();
		setStatusColumn();
	}
	
	protected boolean isNextOper() {
		for (DtlR r : exceptEmpty(getDtlL())) {
			if (doneNextOper(r)) {
				return true;
			}
		}
		return false;
	}
	
	// 次処理が行われていない明細が存在するか
	protected boolean isNotNextOper(){
		for (DtlR r : exceptEmpty(getDtlL())) {
			if (!doneNextOper(r)) {
				return true;
			}
		}
		return false;
	}

	protected boolean isAprvFixOrAccpt(){
		return !getHdrR().aprv_rvrs_flg() && 
				(MAC_APRV_STS_TYP.isFIX(getHdrR().aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ()));
	}
	
	@Override
	public void setDELStatus() {
		if (!Hdr_aprv_rvrs_flg.getValue() 
				&& (MAC_APRV_STS_TYP.isFIX(Hdr_aprv_sts_typ.getValue())
						|| MAC_APRV_STS_TYP.isACPT(Hdr_aprv_sts_typ.getValue()))) {
			setDEL_APRVStatus();
			// 承認引戻チェックの制御
			setAprvRvrsFlgModeDel();
		}
		else {
			super.setDELStatus();
			// 取消ボタンの制御
			setBtnDelMode();
			setPoCrctRsnCdMode();
			setEdiFlgMode();
		}
		// 初期値設定
		setFooterValue();
		// 行ステータスを非表示
		setStatusColumn();
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
	 * ヘッダ項目の入力制御・初期値を設定します。(登録)
	 */
	protected void setInsHdrMode() {
		setTrdMode();
		setSpplMode();
		setXrateInputMode();
		setPtaxXrateInputMode();
		setUpdPoPrintSchdDtMode();
		setEdiFlgMode();
	}
	
	/**
	 * ヘッダ項目の入力制御・初期値を設定します。(訂正)
	 */
	protected void setUpdHdrMode() {
		setAprvRvrsFlgModeUpd();
		setTrdCurMode();
		setUpdPoPrintSchdDtMode();
		setPoCrctRsnCdMode();
		setEdiFlgMode();
	}
	/**
	 * 取引の入力制御を設定します。
	 */
	protected void setTrdMode() {
		if (isEditableMode(Hdr_trd_cd) && containSchd()) {
			Hdr_trd_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_trd_cd);
		}
	}
	/**
	 * 発注先の入力制御を設定します。
	 */
	protected void setSpplMode() {
		if (isEditableMode(Hdr_sppl_cd) && containOutsrc()) {
			Hdr_sppl_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_sppl_cd);
		}
	}
	
	/**
	 * 為替レート指定ＦＬＧの入力制御を設定します
	 */
	protected void setXrateInputMode() {
		// 取引通貨＝基準通貨のとき、または取引通貨未設定の場合は常に入力不可
		if (isSame(Hdr_trd_cur_cd.getValue(), Hdr_base_cur_cd.getValue()) || isNull(Hdr_trd_cur_cd.getValue())) {
			Hdr_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_xrate_inpt_flg);
		}
	}
	/**
	 * 納税為替レート指定ＦＬＧの入力制御を設定します
	 */
	protected void setPtaxXrateInputMode() {
		// 取引通貨＝納税通貨のとき、または取引通貨と納税通貨のいずれかが未設定の場合は常に入力不可
		if (isSame(Hdr_trd_cur_cd.getValue(), Hdr_ptax_cur_cd.getValue()) 
						|| isNull(Hdr_trd_cur_cd.getValue())
						|| isNull(Hdr_ptax_cur_cd.getValue())
			) {
			Hdr_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_ptax_xrate_inpt_flg);
		}
	}
	/**
	 * 承認引戻ＦＬＧの入力制御を設定します。
	 */
	protected void setAprvRvrsFlgModeUpd() {
		// 納入指示・納期回答・ＩＶ登録・入荷・仕入のいずれかが行われていた場合、更新不可
		if (isEditableMode(Hdr_aprv_rvrs_flg) && Hdr_next_opr_flg.getValue()) {
			Hdr_aprv_rvrs_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!getHdrR().aprv_upd_flg()) {
				if (isEditableMode(Hdr_aprv_rvrs_flg)) {
					Hdr_aprv_rvrs_flg.setMode(MCMode.READ_ONLY);
				}
			}
			else {
				setDefaultMode(Hdr_aprv_rvrs_flg);
			}
		}
	}
	/**
	 * 承認引戻ＦＬＧの入力制御を設定します。
	 */
	protected void setAprvRvrsFlgModeDel() {
		if (isEditableMode(Hdr_aprv_rvrs_flg) && !getHdrR().aprv_can_flg()) {
			Hdr_aprv_rvrs_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_aprv_rvrs_flg);
		}
	}
	
	/**
	 * 取引通貨の入力制御を設定します。
	 */
	protected void setTrdCurMode() {
		if (isEditableMode(Hdr_trd_cur_cd) && containDoneAbort()) {
			Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_trd_cur_cd);
		}
	}
	/**
	 * 変更注文書発行予定日の入力制御を設定します。
	 */
	protected void setUpdPoPrintSchdDtMode() {
		if (isEditableMode(Hdr_upd_po_print_schd_dt) && containInterim() && getHdrR().subcon_flg()) {
			Hdr_upd_po_print_schd_dt.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_upd_po_print_schd_dt);
		}
	}
	
	protected void setPoCrctRsnCdMode() {
		// 訂正は、検索した明細に次処理が行われていないものが存在した場合
		// 取消は、取消可能な場合
		// 承認引戻ＦＬＧがオン、または承認状況区分が一次承認済でも最終承認済でもない場合
		if ((Cnd_ope_UPD.isSelected() && isNotNextOper() || Cnd_ope_DEL.isSelected() && availDelBtn())
				&& (getHdrR().aprv_rvrs_flg()
						|| !(MAC_APRV_STS_TYP.isFIX(getHdrR().aprv_sts_typ())
								|| MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ())))) {
			if (getHdrR().subcon_flg()) {
				if (editablePoCrctRsn()) {
					Hdr_po_crct_rsn_cd.setMode(MCMode.REQUIRED);
				}
				else {
					Hdr_po_crct_rsn_cd.setMode(MCMode.READ_ONLY);
				}
				Hdr_po_print_cd.setMode(MCMode.ENABLE);
			}
			else {
				if (editablePoCrctRsn()) {
					Hdr_po_crct_rsn_cd.setMode(MCMode.ENABLE);
				}
				else {
					Hdr_po_crct_rsn_cd.setMode(MCMode.READ_ONLY);
				}
				Hdr_po_print_cd.setMode(MCMode.ENABLE);
			}
		}
		else {
			Hdr_po_print_cd.setMode(MCMode.READ_ONLY);
			Hdr_po_crct_rsn_cd.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * ボタンの押下制御をします。
	 * @param index 一覧のインデックス
	 */
	protected void setBtnMode(int index) {
		if(index < 0){
			return;
		}
		DtlR r = getDtlL().get(index);
		setBtnRcopyMode(r);
		setBtnRdelMode(r);
	}
	/**
	 * 行削除ボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRdelMode(DtlR r) {
		if (r.abort_flg() || r.bef_abort_flg()) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else if(doneNextOper(r)){
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
	}
	/**
	 * 行コピーボタンの押下制御をします。
	 * @param r
	 */
	protected void setBtnRcopyMode(DtlR r) {
		if (isPurcDdlv(r)) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	/**
	 * 削除ボタンの押下制御をします
	 */
	protected void setBtnDelMode() {
		// 明細の中に次処理済の行がある、または、打切した行がある場合は取消不可
		if (!availDelBtn()) {
			Btn_del.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected boolean availDelBtn() {
		return !(containDoneArr() || containDonePurc() || containDoneRcptIv() || containDoneAbort());
	}
	
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
	/**
	 * ヘッダ項目の初期値を設定する
	 */
	protected void setHdrValue () {
		if (Cnd_ope_INS.isSelected()) {
			// 発注日
			setValueEx(Hdr_po_dt, getToday());
		}
		
		// 最新
		setValueEx(Cnd_latest_flg, true);
		
		// 帳票
		if (!getHdrR().edi_flg()) {
			setValueEx(Hdr_prnt_po_flg, true);
		}
		if (!isPriPrintTrgt()) {
			setValueEx(Hdr_prnt_dlv_flg, false);
		}
		else {
			setValueEx(Hdr_prnt_dlv_flg, getDefDlvSlipPrntFlg());
		}
		setValueEx(Hdr_prnt_purc_ddlv_dlv_flg, existPurcDdlv() ? getDefDlvSlipPrntFlg() : false);
		
		// 基準通貨
		setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Hdr_base_cur_nm, getBaseCur().cur_nm());
		setValueEx(Hdr_base_cur_amt_dec_place, getBaseCur().amt_dec_place());
		setValueEx(Hdr_base_cur_upri_dec_place, getBaseCur().upri_dec_place());
		
		// 納税通貨
		setValueEx(Hdr_ptax_cur_cd, getPtaxCur().cur_cd());
		setValueEx(Hdr_ptax_cur_nm, getPtaxCur().cur_nm());
		setValueEx(Hdr_ptax_cur_amt_dec_place, getPtaxCur().amt_dec_place());
		setValueEx(Hdr_ptax_cur_upri_dec_place, getPtaxCur().upri_dec_place());
		
		// 為替レート
		setValueEx(Hdr_purc_xrate_cd, getCo().purc_xrate_cd());
		
		getBulkSetR().dlv_rqst_dt(null);
		getBulkSetR().dlv_rqst_hm(null);
		
		getHdrR().setStatus(Status.NONE);
	}

	protected void setFooterValue() {
		if(Cnd_ope_DEL.isSelected() && !availDelBtn()){
			getHdrR().prnt_po_flg(false);
			Hdr_prnt_dlv_flg.setMode(MCMode.READ_ONLY);
			Hdr_prnt_po_flg.setMode(MCMode.READ_ONLY);
			Hdr_prnt_purc_ddlv_dlv_flg.setMode(MCMode.READ_ONLY);
			Hdr_indiv_prnt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!getHdrR().edi_flg()) {
				getHdrR().prnt_po_flg(true);
			}
			else {
				getHdrR().prnt_po_flg(false);
			}
			setModeValBySppl();
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
		if (b == columnDtl_rqst_avl_rqst_dt && isEditable(columnDtl_rqst_avl_rqst_dt, r.getGUIIndex())) {
			setValueEx(columnDtl_rqst_avl_rqst_dt, r.getGUIIndex(), BulkSet_rqst_avl_rqst_dt.getValue());
		}
		if (b == columnDtl_dlv_rqst_dt && isEditable(columnDtl_dlv_rqst_dt, r.getGUIIndex())) {
			setValueEx(columnDtl_dlv_rqst_dt, r.getGUIIndex(), BulkSet_dlv_rqst_dt.getValue());
		}
		if (b == columnDtl_dlv_rqst_hm && isEditable(columnDtl_dlv_rqst_hm, r.getGUIIndex())) {
			setValueEx(columnDtl_dlv_rqst_hm, r.getGUIIndex(), BulkSet_dlv_rqst_hm.getValue());
		}
	}
	
	/**
	 * 行ステータスが変更された場合に、ヘッダ項目を明細項目にコピーします
	 */
	protected void copyHdrToDtl(DtlR dtlR) {
		if (isNull(dtlR.tax_cd())) {
			setDefaultTaxCd(dtlR, false);
		}
		if (isNull(dtlR.purc_upri_req_typ())) {
			setDefaultPurcUpriReqTyp(dtlR);
		}
		if (isNull(dtlR.ap_dpt_cd())) {
			setDefaultApDptCd(dtlR);
		}
	}
	/**
	 * 金額合計を設定します。
	 */
	protected void setDispAmt() {
		MCNumber trdCurAmt = MCNumber.ZERO;
		MCNumber trdCurIncTaxAmt = MCNumber.ZERO;
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (r.abort_flg() && !r.arr_rem_abort_flg() && !r.purc_rem_abort_flg()) {
				continue;
			}
			MCNumber amt = r.trd_cur_amt();
			MCNumber incTaxAmt = r.trd_cur_inc_tax_amt();
			if(r.abort_flg() && (r.arr_rem_abort_flg() || r.purc_rem_abort_flg())) {
				MCNumber actQty = MCNumber.max(r.arr_qty(), r.purc_qty());
				MCNumber qty = MCNumber.min(actQty, r.base_unit_qty());
				MCNumber trdUnitQty = rvrsBaseUnitConv(qty,
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
				
				MCNumber remAbortDscntAmt = MCNumber.ZERO;
				if (!isNull(r.trd_cur_dscnt_amt())) {
					remAbortDscntAmt = r.trd_cur_dscnt_amt().multiply(qty)
							.divide(r.base_unit_qty(), getHdrR().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getHdrR().purc_amt_rnd_typ()));
				}
				
				MCRow amtR = MAUCP_AmtUtil.getAmtAndTax(r.trd_cur_upri(), trdUnitQty, r.tax_rate(),
						r.inc_tax_flg(), getHdrR().trd_cur_amt_dec_place(),
						getHdrR().purc_amt_rnd_typ(), getHdrR().purc_tax_rnd_typ(),
						remAbortDscntAmt);
				amt = amtR.getNumber("amt");
				incTaxAmt = amtR.getNumber("inc_tax_amt");
			}
			if (!isNull(r.trd_cur_amt())) {
				trdCurAmt = trdCurAmt.add(r.dscnt_itm_flg() ? amt.negate() : amt);
			}
			if (!isNull(r.trd_cur_inc_tax_amt())) {
				trdCurIncTaxAmt = trdCurIncTaxAmt.add(r.dscnt_itm_flg() ? incTaxAmt.negate() : incTaxAmt);
			}
		}
		setValueEx(BulkSet_amt, trdCurAmt);
		setValueEx(BulkSet_inc_tax_amt, trdCurIncTaxAmt);
	}
	
	/**
	 * 案件ＮＯを設定します。
	 */
	protected void setWrkNo() {
		String wrkNo = null;
		for(DtlR r : getDtlL()) {
			if (!isNull(r.sno1())) {
				wrkNo = r.wrk_no();
				break;
			}
		}
		setValueEx(Hdr_wrk_no, wrkNo);
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
	 * 税初期値を設定します。(行指定)
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
				Hdr_sppl_cd.getValue(), 
				getPurcUpriBaseDt(dtlR), 
				this);
		setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), taxCd);
		if (setTaxFixFlg) {
			dtlR.tax_fix_flg(false);
		}
	}

	protected MCDate getPurcUpriBaseDt(DtlR dtlR) {
		if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(dtlR.purc_upri_req_typ())) {
			return Hdr_po_dt.getValue();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.dlv_rqst_dt();
		}
		else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(dtlR.purc_upri_req_typ())) {
			return dtlR.purc_schd_dt();
		}
		return null;
	}
	
	protected void setApDptCd() {
		if (isNull(getHdrR().mst_ap_dpt_cd())) {
			if (isNull(getHdrR().purc_dpt_cd())) {
				getHdrR().ap_dpt_cd(null);
			}
			else {
				 if (getHdrR().ap_dpt_flg()) {
					getHdrR().ap_dpt_cd(getHdrR().purc_dpt_cd());
				}
				else {
					getHdrR().ap_dpt_cd(null);
				}	
			}
		}
	}
	
	/**
	 * 購買単価取得区分を設定します（行指定）
	 */
	protected void setDefaultPurcUpriReqTyp(DtlR dtlR) {
		if (isEditable(columnDtl_purc_upri_req_typ, dtlR.getGUIIndex())) {
			setValueEx(columnDtl_purc_upri_req_typ, dtlR.getGUIIndex(), nvl(Hdr_purc_upri_req_typ.getValue(), getCo().purc_upri_req_typ()));
		}
	}
	/**
	 * 債務部門を設定します（行指定）
	 */
	protected void setDefaultApDptCd(DtlR dtlR) {
		if (isEditable(columnDtl_ap_dpt_cd, dtlR.getGUIIndex())) {
			setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), Hdr_ap_dpt_cd.getValue());
		}
	}
	/**
	 * 支払繰越回数初期値を設定します（行指定）
	 */
	protected void setDefaultPayCrryovrTimes(DtlR dtlR) {
		if (isEditable(columnDtl_pay_crryovr_times, dtlR.getGUIIndex())) {
			if (!isNull(dtlR.itm_pay_crryovr_times())) {
				setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.itm_pay_crryovr_times());
			}
			else {
				setValueEx(columnDtl_pay_crryovr_times, dtlR.getGUIIndex(), Hdr_sppl_pay_crryovr_times.getValue());
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
	
	protected void setPriPrntFlg(DtlR dtlR){
		// 納品書を発行しない
		if (!isPriPrintTrgt()) {
			setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), false);
		}
		else {
			setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), true);
		}
	}
	
	protected void setPriPrntFlg() {
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setPriPrntFlg(r);
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
		else if (r.dlv_rqst_dt().eqDate(r.purc_schd_dt()) && (!r.arr_skip_flg())) {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_sync_flg, r.getGUIIndex(), false);
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
		else if (getHdrR().subcon_flg()) {
			if (!MAC_PURC_BASIS_TYP.isARR_BASIS(dtlR.purc_basis_typ())) {
				setValueEx(columnDtl_purc_basis_typ, dtlR.getGUIIndex(), MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
		}
	}
	
	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR
	 */
	protected void setIvItmNm(DtlR dtlR) {
		if (!Hdr_sppl_iv_flg.getValue()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(Hdr_prnt_lcl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
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
		MCRow row = MAUCP_ItmUtil.getBpItm(Hdr_sppl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), Hdr_po_dt.getValue(), this);
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
		HdrR hdr = getHdrR();
		if(isNull(hdr.trd_cur_cd()) || (isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri()))) {
			return;
		}
		// 金額 = (単価:加工単価 + 有償支給単価)×数量
		MCNumber amt =  MAUCP_AmtUtil.getAmt(dtlR.trd_cur_upri(),
				dtlR.trd_unit_qty(),
				hdr.trd_cur_amt_dec_place(),
				hdr.purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt()
				);
		if(dtlR.inc_tax_flg()) {
			// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
			MCNumber proc_inc_tax_amt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
					dtlR.trd_unit_qty(),
					hdr.trd_cur_amt_dec_place(),
					hdr.purc_amt_rnd_typ(),
					dtlR.trd_cur_dscnt_amt());
			dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
			// 有償支給金額は金額-加工金額
			dtlR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
		}else {
			dtlR.trd_cur_amt(amt);
			// 外税の場合は金額を案分
			setOutsrcAmt(hdr, dtlR);
		}
		// 加工金額を元に税額を取得(有償支給金額は税額に含めない)
		// 値引額は共通処理で考慮済なので計算に含めない
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(
				dtlR.trd_cur_proc_amt(),
				dtlR.tax_rate(),
				hdr.trd_cur_amt_dec_place(),
				hdr.purc_tax_rnd_typ(),
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
		setBaseCurAmt(hdr, dtlR);
		setPtaxCurAmt(hdr, dtlR);
	}
	/**
	 * 金額を案分して加工金額・有償支給金額を導出します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setOutsrcAmt(HdrR hdrR, DtlR dtlR) {
		if(!dtlR.outsrc_flg()) {
			return;
		}
		MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
				dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
		dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
		dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
		setBaseCurAmt(hdrR, dtlR);
		setPtaxCurAmt(hdrR, dtlR);
	}
	/**
	 * 基準通貨項目に取引通貨項目を元に値を設定します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setBaseCurAmt(HdrR hdrR, DtlR dtlR) {
		dtlR.base_cur_onr_prov_upri(convToBaseCur(dtlR.trd_cur_onr_prov_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_upri(convToBaseCur(dtlR.trd_cur_proc_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdrR.xrate(), hdrR.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	/**
	 * 納税通貨項目に取引通貨項目を元に値を設定します
	 * @param hdrR
	 * @param dtlR
	 */
	protected void setPtaxCurAmt(HdrR hdrR, DtlR dtlR) {
		dtlR.ptax_cur_onr_prov_upri(convCur(dtlR.trd_cur_onr_prov_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_upri(convCur(dtlR.trd_cur_proc_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}
	/**
	 * 予定日を設定します
	 */
	protected void setSchdDt(DtlR dtlR) {
		MCRow rslt = MCRow.create();
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (!isNullOrNullVal(sysParm) && isSame(sysParm , "1")) {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR), dtlR.rqst_avl_rqst_dt(), sysParm);
		} else {
			rslt = callGetSchdDt(getSchdDtEditCnd(dtlR), null, sysParm);
		}
		setSchdDt(dtlR, rslt);
	}
	
	// -----------------------------------------------
	// 値の設定（クリア）
	// -----------------------------------------------	
	/**
	 * 金額項目をクリアします
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
	 * 理由をクリアします
	 * @param allDtlClear
	 * @param dtlR
	 */
	protected void clearRsn(DtlR dtlR) {
		if (!isSame(MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()), dtlR.xpns_purc_flg())) {
			setValueEx(columnDtl_purc_rsn_cd, dtlR.getGUIIndex(), null);
		}
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
	 * 版ＮＯをクリアします。
	 */
	protected void clearVerNo(DtlR dtlR) {
		setValueEx(columnDtl_ver_no, dtlR.getGUIIndex(), null);
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
	/**
	 * 共通項目をクリアします。
	 */
	protected void clearBulkSet() {
		setValueEx(BulkSet_rqst_avl_rqst_dt, null);
		setValueEx(BulkSet_dlv_rqst_dt, null);
		setValueEx(BulkSet_dlv_rqst_hm, null);
		setValueEx(BulkSet_amt, MCNumber.ZERO);
		setValueEx(BulkSet_inc_tax_amt, MCNumber.ZERO);
	}
	// -----------------------------------------------
	// 単価再取得
	// -----------------------------------------------
	/**
	 * 単価再取得対象の明細を取得します。
	 */
	protected MCList<DtlR> getSprtTgtDtlL() {
		MCList<DtlR> upL = MCList.create(DtlR.class);
		// 一時承認済、最終承認済の場合は単価取得対象外
		if (isAprvFixOrAccpt()) {
			return upL;
		}
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
		return !r.upri_not_tgt_flg() && 
				!r.isStatusDelete() && 
				!r.isEmpty() && 
				!r.abort_flg() &&
				!isNonPurc(r) &&
				!doneNextOper(r);
	}
	
	/**
	 * 納品書発行対象であるか否かを判定します。
	 * @return
	 */
	protected boolean isPriPrintTrgt () {
		if (isNull(getHdrR().sppl_ship_form_cd())) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * 単価再取得処理を実行します。
	 * @return 単価再取得処理中にエラーが起きた場合true
	 */
	protected boolean hasErr() {
		@SuppressWarnings("rawtypes")
		MSBDP_PoReg.MS_MSBDL0080_Sprt02Caller caller = createMS_MSBDL0080_Sprt02();
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
		fillSpace();
	}
	
	protected void fillSpace() {
		if (Cnd_ope_INS.isSelected()) {
			DtlTable.fillSpace();
		}
	}
	// -----------------------------------------------
	// その他
	// -----------------------------------------------	
	/**
	 * 納入場所変更チェック
	 * @return
	 */
	protected MCMessageList confirmLocChg() {
		MCMessageList msgList = new MCMessageList();
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (r.abort_flg()) {
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
	 * 入荷済みの明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containDoneArr() {
		MCList<DtlR> subL = getDtlL().subList(DtlR.$arr_flg, true);
		if (subL.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 仕入済みの明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containDonePurc() {
		MCList<DtlR> subL = getDtlL().subList(DtlR.$purc_flg, true);
		if (subL.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * 受領インボイス登録済みの明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containDoneRcptIv() {
		MCList<DtlR> subL = getDtlL().subList(DtlR.$rcpt_iv_flg, true);
		if (subL.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 打切済みの明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containDoneAbort() { 
		for (DtlR r : getDtlL()) {
			if (r.abort_flg() || !isSame(r.abort_flg(), r.bef_abort_flg()) || isSchdAbort(r)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 仮単価の明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containInterim() {
		MCList<DtlR> subL = getDtlL().subList(DtlR.$interim_flg, true);
		if (subL.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 外注品の明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containOutsrc() {
		MCList<DtlR> subL = getDtlL().subList(DtlR.$outsrc_flg, true).subList(DtlR.$po_schd_flg, true);
		if (subL.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 計画の明細が含まれるかを判定します
	 * @return
	 */
	protected boolean containSchd() {
		for (DtlR r : getDtlL()) {
			if (!isNull(r.po_schd_no())) {
				return true; 
			}
		}
		return false;
	}

	/**
	 * 次の業務を行っているか否かを判定します
	 * @return
	 */
	protected boolean doneNextOper(DtlR r) {
		if (r.arr_flg() || r.purc_flg() || r.rcpt_iv_flg() || isSchdAbort(r)){
			return true;
		}
		else {
			return false;
		}
	}
	
	// 予定の打切り（購買納期調整で全数打切り）を行ったか
	protected boolean isSchdAbort(DtlR r) {
		return (!r.arr_flg() && r.arr_cmpl_flg() && !r.arr_skip_flg()) || (!r.purc_flg() && r.purc_cmpl_flg() && !isNonPurc(r));
	}

	protected boolean isNonPurc(DtlR r) {
		return MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ());
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
	protected boolean editablePoCrctRsn () {
		if (!isSame(getHdrR().po_rev(), MCNumber.ONE) || getHdrR().po_print_flg() || getHdrR().last_edi_flg()) {
			return true;
		}
		return false;
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
		String trdCurCd = getHdrR().trd_cur_cd();
		String baseCurCd = getHdrR().base_cur_cd();
		String ptaxCurCd = getHdrR().ptax_cur_cd();
		
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
	// -----------------------------------------------
	// ユーティリティ使用準備
	// -----------------------------------------------	
	protected DtlR getSchdDtEditCnd(DtlR dtlR) {
		DtlR cnd = dtlR.clone();
		cnd.purc_schd_dt(null);
		cnd.rqst_avl_rqst_dt(null);
		return cnd;
	}
	protected MCRow callGetSchdDt(DtlR dtlR , MCDate baseDt , String sysParm) {
		if (isSame(sysParm, "1")) {
			if (isNullAnd(dtlR.dlv_rqst_dt(), dtlR.rqst_avl_rqst_dt())) {
				return MCRow.create();
			}
		} else {
			if (isNull(dtlR.dlv_rqst_dt())) {
			return MCRow.create();
			}
		}
		return MSUCP_PurcUtil.getSchdDt(
				MCNumber.ONE, 
				dtlR.rqst_avl_rqst_dt(), 
				dtlR.dlv_rqst_dt(), 
				null, 
				dtlR.purc_schd_dt(), 
				Hdr_sppl_cd.getValue(), 
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
				Hdr_sppl_cal_cd.getValue(), 
				dtlR.in_to_loc_cal_cd(), 
				dtlR.dlv_cal_cd(), 
				dtlR.lg_grp_cd(), 
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
			else if (getHdrR().subcon_flg()) {
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
	
	// -----------------------------------------------
	// IF
	// -----------------------------------------------	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getHdrR()) {
			list.add(HdrR.$po_no);
			list.add(HdrR.$po_rev);
			list.add(HdrR.$latest_flg);
			list.add(HdrR.$can_flg);
			list.add(HdrR.$po_print_dt);
			list.add(HdrR.$po_print_flg);
			list.add(HdrR.$aprv_rvrs_flg);
			list.add(HdrR.$aprv_flg);
			list.add(HdrR.$aprv_no);
			list.add(HdrR.$aprv_sts_typ);
			list.add(HdrR.$aprv_sts_typ_nm);
			list.add(HdrR.$aprv_upd_flg);
			list.add(HdrR.$aprv_can_flg);
			list.add(HdrR.$po_dt);
			list.add(HdrR.$po_schd_no);
			list.add(HdrR.$po_crct_rsn_cd);
			list.add(HdrR.$po_crct_rsn_nm);
			list.add(HdrR.$po_crct_rsn_rmrks);
			list.add(HdrR.$last_edi_flg);
			list.add(HdrR.$purc_if_flg);
			list.add(HdrR.$ext_sys_cd);
			list.add(HdrR.$ext_sys_nm);
			list.add(HdrR.$ext_po_no);
		}
		else if (cont == getDtlL()) {
			if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
				list.add(DtlR.$dlv_rqst_dt);
				list.add(DtlR.$dlv_rqst_hm);
				list.add(DtlR.$rqst_dlv_rqst_dt);
				list.add(DtlR.$rqst_dlv_rqst_hm);
				list.add(DtlR.$rqst_avl_rqst_dt);
				list.add(DtlR.$purc_schd_dt);
				list.add(DtlR.$sync_flg);
				list.add(DtlR.$po_conf_rcpt_flg);
				list.add(DtlR.$po_conf_rcpt_dt);
			}
			list.add(DtlR.$bndl_flg);
			list.add(DtlR.$slo_no);
			list.add(DtlR.$slo_d_no);
			list.add(DtlR.$po_schd_src_typ);
			list.add(DtlR.$po_schd_src_typ_nm);
			list.add(DtlR.$po_schd_src_no);
			list.add(DtlR.$rqst_fr_usr_cd);
			list.add(DtlR.$rqst_fr_usr_nm);
			list.add(DtlR.$rqst_fr_dpt_cd);
			list.add(DtlR.$rqst_fr_dpt_nm);
			list.add(DtlR.$po_schd_no);
			list.add(DtlR.$po_d_no);
			list.add(DtlR.$disp_seq);
			list.add(DtlR.$dtl_peg_no);
			list.add(DtlR.$purc_sts_typ);
			list.add(DtlR.$purc_sts_typ_nm);
			list.add(DtlR.$dlv_inst_qty);
			list.add(DtlR.$dlv_inst_prms_rcpt_qty);
			list.add(DtlR.$rcpt_iv_qty);
			list.add(DtlR.$arr_qty);
			list.add(DtlR.$purc_qty);
			list.add(DtlR.$arr_schd_split_flg);
			list.add(DtlR.$arr_cmpl_flg);
			list.add(DtlR.$rqst_can_flg);
			list.add(DtlR.$purc_cmpl_flg);
			list.add(DtlR.$po_cnt_rmrks);
			list.add(DtlR.$rcpt_iv_flg);
			list.add(DtlR.$arr_flg);
			list.add(DtlR.$purc_flg);
			list.add(DtlR.$abort_flg);
			list.add(DtlR.$bef_abort_flg);
			list.add(DtlR.$bef_in_to_loc_wg_cd);
			list.add(DtlR.$bef_lg_grp_cd);
			list.add(DtlR.$bef_loc_grp_cd);
			list.add(DtlR.$outsrc_itm_ord_no);
			list.add(DtlR.$po_schd_flg);
			list.add(DtlR.$mfg_inst_flg);
			list.add(DtlR.$ext_po_d_no);
			list.add(DtlR.$dlv_slip_no);
			list.add(DtlR.$dlv_slip_seq);
			list.add(DtlR.$dlv_slip_mng_no);
			list.add(DtlR.$dlv_slip_mng_seq);
			list.add(DtlR.$purc_ddlv_dlv_slip_no);
		}

		return list;
	}
	
	@Override
	public boolean confirmRegDataClear() {
		boolean rslt = super.confirmRegDataClear();
		if (rslt) {
			clearBulkSet();
		}
		return rslt;
	}
	
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		ret.add(getDtl2L());
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
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}
	
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}

	public MCRowBeans getCndRevNo() {
		return Cnd_rev_no;
	}

	@Override
	public boolean isStatusChange() {
		return true;
	}

	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().po_no(getHdrR().po_no());
		}
	}
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
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
	protected void tableInit() {
		super.tableInit();
		DtlTable.moveColumns(columnDtl_str_ln_cd_none_flg, columnDtl_outsrc_flg, columnDtl_mfg_loc_cd, columnDtl_mfg_loc_nm, columnDtl_bom_ptn);
	}
	@Override
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(
			MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns) {
			@Override
			public MCMessageList setValues(int index, mcframe.commonCore.container.MCRow row) {
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
	protected void setEdiFlgMode() {
		if (getHdrR().edi_tgt_flg() && !isAprvFixOrAccpt()) {
			Hdr_edi_flg.setMode(MCMode.REQUIRED);
			getHdrR().edi_flg(true);
			getHdrR().prnt_po_flg(false);
		}
		else {
			Hdr_edi_flg.setMode(MCMode.READ_ONLY);
			getHdrR().prnt_po_flg(true);
		}
	}

}