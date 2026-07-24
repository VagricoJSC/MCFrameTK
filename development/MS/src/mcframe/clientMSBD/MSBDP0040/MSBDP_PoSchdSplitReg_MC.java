package mcframe.clientMSBD.MSBDP0040;

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

import mcframe.clientFSBA.FSBAP0020.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5390.*;
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
import mcframe.clientFSBA.FSBAP0000.IfSyncTableBase;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.commonFX.notice.*;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PoSchdSplitReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PoSchdSplitReg_MC extends MSBDP_PoSchdSplitReg_MC_A implements IfOpePanel, IfSyncTableBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoSchdSplitReg_MC() {
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
	public MSBDP_PoSchdSplitReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Srch01Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDtl2L());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		
	}

	/**
	 * [MS_MSBDL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Srch02Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDtl2L());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_DEL.isSelected()) {
				setDELStatus();
			}
			else {
				setREFStatus();
			}
			
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		
	}

	/**
	 * [MS_MSBDL0040_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Sprt01Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		
		protected MCList<Dtl1R> _bfDtl2L;
		
		protected MS_MSBDL0040_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkForCall() {
			boolean checkFlg = super.checkForCall();
			if (checkFlg) {
				if (exceptDeleteAndEmpty(getDtl2L()).subList(Dtl1R.$check, true).isEmpty()) {
					panel.dialog(new MCMessage(FX_Msg.FXBAP0038));
					checkFlg = false;
				}
			}
			return checkFlg;
		}
		
		protected void checkReq(MCMessageList msgList) {
			String sysParm = getSysParm("MASTER_DT_BASE");
			
			for (Dtl1R r : getDtl2L()) {
				if (!r.check()) {
					continue;
				}
				msgList.addAll(panel.checkReq(
						r.getGUIIndex()
						, columnDtl2_itm_cd
						, columnDtl2_itm_sub1
						, columnDtl2_itm_sub2
						, columnDtl2_itm_sub3
						, columnDtl2_in_to_loc_cd
						, isSame(sysParm, "1") ? columnDtl2_rqst_avl_rqst_dt : columnDtl2_po_schd_dt));
			}
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<Dtl1R> upL = MCList.create(Dtl1R.class);
			for (Dtl1R r : bridge.up0()) {
				if(r.check()){
					upL.add(r);
				}
			}
			bridge.up0().setAll(upL);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBDP0016);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			_bfDtl2L = getDtl2L().clone();
		}
		
		@Override
		protected void show() {
			super.show();
			for (Dtl1R r : getDtl2L()) {
				if (!r.check()) {
					continue;
				}
				// 値の退避
				String oldSpplCd = r.sppl_cd();
				String oldMakerCd = r.maker_cd();
				String oldTrdCurCd = r.trd_cur_cd();

				Dtl1R bfR = _bfDtl2L.get(r.getGUIIndex());
				if (!isSame(bfR.sppl_cd(), oldSpplCd)) {
					setValueEx(columnDtl2_sppl_cd, r.getGUIIndex(), null);
					setValueEx(columnDtl2_sppl_cd, r.getGUIIndex(), oldSpplCd);
				}
				if (!isSame(bfR.maker_cd(), oldMakerCd)) {
					setValueEx(columnDtl2_maker_cd, r.getGUIIndex(), null);
					setValueEx(columnDtl2_maker_cd, r.getGUIIndex(), oldMakerCd);
				}
				if (!isSame(bfR.trd_cur_cd(), oldTrdCurCd)) {
					setValueEx(columnDtl2_trd_cur_cd, r.getGUIIndex(), null);
					setValueEx(columnDtl2_trd_cur_cd, r.getGUIIndex(), oldTrdCurCd);
				}
				setRqstDlvRqstDt(r);

			}
		}
	}

	/**
	 * [MS_MSBDL0040_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Sprt02Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;
		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;
		/** 単価再取得対象のリスト */
		MCList<Dtl1R> _tgtList;
		
		protected MS_MSBDL0040_Sprt02Caller(P p, B b) {
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
				msgList.addAll(MSUCP_PurcUtil.chkForUpriExptDt(
						panel
						, _tgtList
						, columnDtl2_sppl_cd
						, columnDtl2_trd_cur_cd
						, columnDtl2_in_to_loc_wg_cd 
						, columnDtl2_itm_cd
						, columnDtl2_itm_sub1
						, columnDtl2_itm_sub2
						, columnDtl2_itm_sub3
						, columnDtl2_trd_unit_cd
						, columnDtl2_trd_unit_qty
						, columnDtl2_base_unit_qty));
				
				//　単価取得に最低限必要な必須チェックのみ実施する
				_tgtList.forEach(r -> {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_in_to_loc_cd));
						
					// 購買単価取得区分
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_purc_upri_req_typ));
					
					// 購買単価取得区分にあわせた基準日を必須とする。
					if (MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl2_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_po_schd_dt));
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT((String)columnDtl2_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_dlv_rqst_dt));
					}
					else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT((String)columnDtl2_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_purc_schd_dt));
					}
					// 外注の場合は製造場所も必須とする。
					if ((boolean)columnDtl2_outsrc_flg.getValue(r.getGUIIndex())) {
						String sysParm = getSysParm("MASTER_DT_BASE");
						if (!isSame(sysParm, "1")) {
								if (!MAC_PURC_UPRI_REQ_TYP.isPO_DT((String)columnDtl2_purc_upri_req_typ.getValue(r.getGUIIndex()))) {
								msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_po_schd_dt));
							}
						}
						msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl2_mfg_loc_cd, columnDtl2_tax_cd));
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
			MCList<Dtl1R> upL = MCList.create(Dtl1R.class);
			for (Dtl1R r : bridge.up0()) {
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
	 * [MS_MSBDL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Ins01Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<Dtl1R> _tgtList;
		protected MS_MSBDL0040_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_IStatus();
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
		
		protected MCMessageList checkForCallStackSub(MCMessageList msgL) {
			for (Dtl1R r : getDtl2L()) {
				msgL.addAll(checkBeforeAfter(columnDtl2_po_schd_dt, columnDtl2_dlv_rqst_dt, r));
				msgL.addAll(checkBeforeAfter(columnDtl2_po_schd_dt, columnDtl2_purc_schd_dt, r));
				msgL.addAll(checkPositive(r, columnDtl2_trd_unit_qty));
			}
			return msgL;
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
	}

	/**
	 * [MS_MSBDL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Del01Caller<P extends MSBDP_PoSchdSplitReg, B extends MS_MSBDL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0040_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}	
	}

	/**
	 * Panel[Cnd]のボタン[srch01]の押下時の処理
	 */
	@Override
	public void doCnd_srch01(MCEventInfo info) {
		callMS_MSBDL0040_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch02]の押下時の処理
	 */
	@Override
	public void doCnd_srch02(MCEventInfo info) {
		callMS_MSBDL0040_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[mstr_replace]の押下時の処理
	 */
	@Override
	public void doBtn_mstr_replace(MCEventInfo info) {
		callMS_MSBDL0040_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[upri_replace]の押下時の処理
	 */
	@Override
	public void doBtn_upri_replace(MCEventInfo info) {
		callMS_MSBDL0040_Sprt02();
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		Dtl1R r = insertRow(Dtl2Table);
		MCRow.copyvalue(r, Dtl1Table.getRow(0));
		r.setStatus(Status.CREATE);
		setValueEx(columnDtl2_reg_dt, r.getGUIIndex(), getToday());
		setValueEx(columnDtl2_tax_fix_flg, r.getGUIIndex(), true);
		setValueEx(columnDtl2_po_schd_no, r.getGUIIndex(), null);
		setValueEx(columnDtl2_ins_usr_id, r.getGUIIndex(), null);
		setValueEx(columnDtl2_ins_usr_nm, r.getGUIIndex(), null);
		setValueEx(columnDtl2_ins_func_id, r.getGUIIndex(), null);
		setValueEx(columnDtl2_ins_func_nm, r.getGUIIndex(), null);
		setValueEx(columnDtl2_ins_ts, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_usr_id, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_usr_nm, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_func_id, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_func_nm, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_ts, r.getGUIIndex(), null);
		setValueEx(columnDtl2_upd_srv_req_no, r.getGUIIndex(), null);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(Dtl2Table);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		Dtl1R r = copyRow(Dtl2Table);
		setValueEx(columnDtl2_reg_dt, r.getGUIIndex(), getToday());
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0040_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0040_Del01();
	}
	
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void tableInit() {
		super.tableInit();
		Dtl1Table.addHSyncTables(Dtl2Table);
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		// 検索対象区分の設定
		setSrchTgtTyp();
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		//---------------------------------
		// 分割元
		//---------------------------------
		// 発注予定数量
		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3
				, columnDtl1_trd_unit_cd, columnDtl1_trd_unit_dec_place, columnDtl1_trd_unit_rnd_typ
				, columnDtl1_trd_unit_conv_base_qty, columnDtl1_trd_unit_conv_qty, columnDtl1_base_unit_cd);
		// 基準単位数量
		Dtl1_base_unit_qty_p_PPanel.setRelateBeans(columnDtl1_base_unit_cd, columnDtl1_base_unit_dec_place, columnDtl1_base_unit_rnd_typ, columnDtl1_trd_unit_qty, columnDtl1_trd_unit_conv_base_qty, columnDtl1_trd_unit_conv_qty);
				
		// 有効成分
		Dtl1_inst_cont_qty_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_std_cont_fctr, null, columnDtl1_cont_fctr_dec_place, columnDtl1_cont_fctr_rnd_typ);
		// 版
		Dtl1_ver_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_site_cd, columnDtl1_ver_flg);
		// 取引通貨単価・金額
		Dtl1_trd_cur_upri_p_PPanel.setSchd(true);
		Dtl1_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_sppl_cd, columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_trd_unit_cd, columnDtl1_trd_unit_qty, columnDtl1_trd_cur_amt_dec_place, columnDtl1_trd_cur_upri_dec_place, columnDtl1_purc_amt_rnd_typ, columnDtl1_purc_tax_rnd_typ, columnDtl1_sppl_purc_upri_cng_flg, columnDtl1_itm_purc_upri_cng_flg, columnDtl1_dscnt_itm_flg);
		// 取引通貨加工単価・金額
		Dtl1_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_trd_cur_upri_dec_place, columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_trd_unit_cd);
		Dtl1_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_trd_cur_amt_dec_place, columnDtl1_trd_unit_qty, columnDtl1_trd_cur_proc_upri,
				columnDtl1_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl1_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_trd_cur_upri_dec_place, columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_trd_unit_cd);
		Dtl1_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_trd_cur_amt_dec_place, columnDtl1_trd_unit_qty,
				columnDtl1_trd_cur_onr_prov_upri, columnDtl1_purc_amt_rnd_typ, null);
		
		// 為替レート
		Dtl1_xrate_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_base_cur_cd, columnDtl1_xrate_cd, columnDtl1_reg_dt, true, columnDtl1_xrate_inpt_flg);
		// 基準通貨単価・金額
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_upri_dec_place, columnDtl1_trd_cur_upri, columnDtl1_xrate);
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_amt_dec_place, columnDtl1_trd_cur_amt, columnDtl1_xrate);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_amt_dec_place, columnDtl1_trd_cur_tax_amt, columnDtl1_xrate);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_amt_dec_place, columnDtl1_trd_cur_inc_tax_amt, columnDtl1_xrate);
		// 基準通貨加工単価・金額
		Dtl1_base_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_upri_dec_place, columnDtl1_trd_cur_proc_upri, columnDtl1_xrate);
		Dtl1_base_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_amt_dec_place, columnDtl1_trd_cur_proc_amt, columnDtl1_xrate);
		// 基準通貨有償支給単価・金額
		Dtl1_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_upri_dec_place, columnDtl1_trd_cur_onr_prov_upri, columnDtl1_xrate);
		Dtl1_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl1_base_cur_cd, columnDtl1_base_cur_amt_dec_place, columnDtl1_trd_cur_onr_prov_amt, columnDtl1_xrate);
		
		// 納税為替レート
		Dtl1_ptax_xrate_p_PPanel.setRelateBeans(columnDtl1_trd_cur_cd, columnDtl1_ptax_cur_cd, columnDtl1_xrate_cd, columnDtl1_reg_dt, true, columnDtl1_ptax_xrate_inpt_flg);
		// 納税通貨単価・金額
		Dtl1_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_upri, columnDtl1_ptax_xrate);
		Dtl1_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_amt, columnDtl1_ptax_xrate);
		Dtl1_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_tax_amt, columnDtl1_ptax_xrate);
		Dtl1_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_inc_tax_amt, columnDtl1_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl1_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_proc_upri, columnDtl1_ptax_xrate);
		Dtl1_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_proc_amt, columnDtl1_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl1_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_upri_dec_place, columnDtl1_trd_cur_onr_prov_upri, columnDtl1_ptax_xrate);
		Dtl1_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl1_ptax_cur_cd, columnDtl1_ptax_cur_amt_dec_place, columnDtl1_trd_cur_onr_prov_amt, columnDtl1_ptax_xrate);

		Dtl1_bditm_p_PPanel.setRelateBeans(
				columnDtl1_asset_mng_typ,
				columnDtl1_bd_lot_mng_typ, columnDtl1_bd_sublot_mng_typ, columnDtl1_bd_sno1_mng_typ, 
				columnDtl1_bd_sno2_mng_typ, columnDtl1_bd_sno3_mng_typ, columnDtl1_bd_sno4_mng_typ);

		//---------------------------------
		// 分割先
		//---------------------------------
		// 発注予定数量
		Dtl2_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3
				, columnDtl2_trd_unit_cd, columnDtl2_trd_unit_dec_place, columnDtl2_trd_unit_rnd_typ
				, columnDtl2_trd_unit_conv_base_qty, columnDtl2_trd_unit_conv_qty, columnDtl2_base_unit_cd);
		// 基準単位数量
		Dtl2_base_unit_qty_p_PPanel.setRelateBeans(columnDtl2_base_unit_cd, columnDtl2_base_unit_dec_place, columnDtl2_base_unit_rnd_typ, columnDtl2_trd_unit_qty, columnDtl2_trd_unit_conv_base_qty, columnDtl2_trd_unit_conv_qty);
		
		// 有効成分
		Dtl2_inst_cont_qty_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_std_cont_fctr, null, columnDtl2_cont_fctr_dec_place, columnDtl2_cont_fctr_rnd_typ);
		// 版
		Dtl2_ver_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3, columnDtl2_site_cd, columnDtl2_ver_flg);
		
		// 取引通貨単価・金額
		Dtl2_trd_cur_upri_p_PPanel.setSchd(true);
		Dtl2_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_sppl_cd, columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3, columnDtl2_trd_unit_cd, columnDtl2_trd_unit_qty, columnDtl2_trd_cur_amt_dec_place, columnDtl2_trd_cur_upri_dec_place, columnDtl2_purc_amt_rnd_typ, columnDtl2_purc_tax_rnd_typ, columnDtl2_sppl_purc_upri_cng_flg, columnDtl2_itm_purc_upri_cng_flg, columnDtl2_dscnt_itm_flg);
		// 取引通貨加工単価・金額
		Dtl2_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_trd_cur_upri_dec_place);
		Dtl2_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_trd_cur_amt_dec_place, columnDtl2_trd_unit_qty, columnDtl2_trd_cur_proc_upri,
				columnDtl2_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl2_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_trd_cur_upri_dec_place);
		Dtl2_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_trd_cur_amt_dec_place, columnDtl2_trd_unit_qty,
				columnDtl2_trd_cur_onr_prov_upri, columnDtl2_purc_amt_rnd_typ, null);
		
		// 為替レート
		Dtl2_xrate_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_base_cur_cd, columnDtl2_xrate_cd, columnDtl2_reg_dt, true, columnDtl2_xrate_inpt_flg);
		// 基準通貨単価・金額
		Dtl2_base_cur_upri_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_upri_dec_place, columnDtl2_trd_cur_upri, columnDtl2_xrate);
		Dtl2_base_cur_amt_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_amt_dec_place, columnDtl2_trd_cur_amt, columnDtl2_xrate);
		Dtl2_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_amt_dec_place, columnDtl2_trd_cur_tax_amt, columnDtl2_xrate);
		Dtl2_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_amt_dec_place, columnDtl2_trd_cur_inc_tax_amt, columnDtl2_xrate);
		// 基準通貨加工単価・金額
		Dtl2_base_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_upri_dec_place, columnDtl2_trd_cur_proc_upri, columnDtl2_xrate);
		Dtl2_base_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_amt_dec_place, columnDtl2_trd_cur_proc_amt, columnDtl2_xrate);
		// 基準通貨有償支給単価・金額
		Dtl2_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_upri_dec_place, columnDtl2_trd_cur_onr_prov_upri, columnDtl2_xrate);
		Dtl2_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl2_base_cur_cd, columnDtl2_base_cur_amt_dec_place, columnDtl2_trd_cur_onr_prov_amt, columnDtl2_xrate);
		
		// 納税為替レート
		Dtl2_ptax_xrate_p_PPanel.setRelateBeans(columnDtl2_trd_cur_cd, columnDtl2_ptax_cur_cd, columnDtl2_xrate_cd, columnDtl2_reg_dt, true, columnDtl2_ptax_xrate_inpt_flg);
		// 納税通貨単価・金額
		Dtl2_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_upri_dec_place, columnDtl2_trd_cur_upri, columnDtl2_ptax_xrate);
		Dtl2_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_amt_dec_place, columnDtl2_trd_cur_amt, columnDtl2_ptax_xrate);
		Dtl2_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_amt_dec_place, columnDtl2_trd_cur_tax_amt, columnDtl2_ptax_xrate);
		Dtl2_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_amt_dec_place, columnDtl2_trd_cur_inc_tax_amt, columnDtl2_ptax_xrate);
		// 納税通貨加工単価・金額
		Dtl2_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_upri_dec_place, columnDtl2_trd_cur_proc_upri, columnDtl2_ptax_xrate);
		Dtl2_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_amt_dec_place, columnDtl2_trd_cur_proc_amt, columnDtl2_ptax_xrate);
		// 納税通貨有償支給単価・金額
		Dtl2_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_upri_dec_place, columnDtl2_trd_cur_onr_prov_upri, columnDtl2_ptax_xrate);
		Dtl2_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnDtl2_ptax_cur_cd, columnDtl2_ptax_cur_amt_dec_place, columnDtl2_trd_cur_onr_prov_amt, columnDtl2_ptax_xrate);

		Dtl2_bditm_p_PPanel.setRelateBeans(
				columnDtl2_asset_mng_typ,
				columnDtl2_bd_lot_mng_typ, columnDtl2_bd_sublot_mng_typ, columnDtl2_bd_sno1_mng_typ, 
				columnDtl2_bd_sno2_mng_typ, columnDtl2_bd_sno3_mng_typ, columnDtl2_bd_sno4_mng_typ);
		
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnDtl2_sppl_cd);
		linkBeansToISPanelCustom(columnDtl2_maker_cd);
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (isSame(sysParm, "1")) {
			getDtl2_sppl_cd_ListPutter().putBind(MSUAC_List.ItmDtlSpplCols.$i_master_dt, columnDtl2_rqst_avl_rqst_dt);
			getDtl2_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, columnDtl2_rqst_avl_rqst_dt);
		}
	}
	
	@Override
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispProdSrchTgtTyp());
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}
	
	public MSC_PURC_SRCH_TGT_TYP[] getDispProdSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO
			};
		}
		else {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO,
					MSC_PURC_SRCH_TGT_TYP.SPLIT_DST_PO_SCHD_NO
			};
		}
	}
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnDtl2_dlv_rqst_dt.addLCListener(this);
		columnDtl2_dlv_rqst_hm.addLCListener(this);
		columnDtl2_tax_cd.addLCListener(this);
		columnDtl2_trd_cur_upri.addLCListener(this);
		columnDtl2_trd_cur_tax_amt.addLCListener(this);
		columnDtl2_trd_unit_qty.addLCListener(this);
		columnDtl2_trd_cur_proc_upri.addLCListener(this);
		columnDtl2_trd_cur_onr_prov_upri.addLCListener(this);
	}
	// -----------------------------------------------
	// LCevents
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl2_dlv_rqst_dt) {
			doDtl2_dlv_rqst_dt_LC(info);
		}
		else if (lc == columnDtl2_dlv_rqst_hm) {
			doDtl2_dlv_rqst_hm_LC(info);
		}
		else if (lc == columnDtl2_tax_cd) {
			doDtl2_tax_cd_LC(info);
		}
		else if(lc == columnDtl2_trd_cur_upri) {
			doDtl2_trd_cur_upri_LC(info);
		}
		else if (lc == columnDtl2_trd_cur_tax_amt) {
			doDtl2_trd_cur_tax_amt_LC(info);
		}
		else if (lc == columnDtl2_trd_unit_qty) {
			doDtl2_trd_unit_qty_LC(info);
		}
		else if(lc == columnDtl2_trd_cur_proc_upri) {
			doDtl2_trd_cur_proc_upri_LC(info);
		}
		else if(lc == columnDtl2_trd_cur_onr_prov_upri) {
			doDtl2_trd_cur_onr_prov_upri_LC(info);
		}
	}
	// -----------------------------------------------
	// NCevents
	// -----------------------------------------------
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 行ステータスカラムの表示制御設定
		setStatusColumn();
		// 検索対象区分の設定
		setSrchTgtTyp();
	}
	
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, 
			String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand())
				&& isSame(bfSt, REF)) {
			setRefToInsInit();
			setSRCH_SPLITStatus();
		}
	}
	
	protected void setRefToInsInit() {
		getDtl1L().clear();
		getDtl2L().clear();
	}

	@Override
	public void doDtl2_NC(MCEventInfo info) {
		super.doDtl2_NC(info);
		if (getDtl2L().size() == 0) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else if (Cnd_ope_INS.isSelected()) {
			Btn_rcopy.setMode(MCMode.ENABLE);
		}
	}
	
	@Override
	public void doDtl2_trd_cur_cd_NC(MCEventInfo info) {
		super.doDtl2_trd_cur_cd_NC(info);
		int index = info.getEventIndex();
		// 通貨ＣＤ変更時に単価をクリアする
		setValueEx(columnDtl2_trd_cur_upri, index, null);
	}
	
	@Override
	public void doDtl2_trd_unit_cd_NC(MCEventInfo info) {
		super.doDtl2_trd_unit_cd_NC(info);
		int index = info.getEventIndex();
		// 単位ＣＤ変更時に単価をクリアする
		setValueEx(columnDtl2_trd_cur_upri, index, null);
	}
	
	@Override
	public void doDtl2_sppl_cd_NC(MCEventInfo info) {
		super.doDtl2_sppl_cd_NC(info);
		int index = info.getEventIndex();
		Dtl1R r = getDtl2L().get(index);
		setDefaultTaxCd(r);
		setSpplItm(r);
	}
	/**
	 * 納入希望日変更イベント
	 * @param info
	 */
	public void doDtl2_dlv_rqst_dt_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
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
	/**
	 * 納入希望時刻変更イベント
	 * @param info
	 */
	public void doDtl2_dlv_rqst_hm_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		// 計画外の場合納入予定日＝依頼元納入予定日
		if (isNull(dtlR.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setValueEx(columnDtl2_rqst_dlv_rqst_hm, dtlR.getGUIIndex(), dtlR.dlv_rqst_hm());
		}
	}
	@Override
	public void doDtl2_reg_dt_LC(MCEventInfo info) {
		super.doDtl2_reg_dt_LC(info);

		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		if (isNull(dtlR.po_schd_src_typ()) || MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setSpplItm(dtlR);
		}
	}
	@Override
	public void doDtl2_purc_schd_dt_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl2_purc_schd_dt_LC(info);
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		// 税の反映
		setDefaultTaxCd(dtlR);
	}
	@Override
	public void doDtl2_po_schd_dt_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl2_po_schd_dt_LC(info);
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		// 税の反映
		setDefaultTaxCd(dtlR);
	}
	/**
	 * 税CD変更イベント
	 * @param info
	 */
	public void doDtl2_tax_cd_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
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
	public void doDtl2_trd_cur_tax_amt_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		// 埋め込み画面側のイベントで、数量の変更後に税額が上書きされてしまうので、税額のイベントで値を変えるようにする。
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(dtlR);
		}
	}
	/**
	 * 数量変更イベント
	 * @param info
	 */
	public void doDtl2_trd_unit_qty_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
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
	public void doDtl2_trd_cur_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
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
	public void doDtl2_trd_cur_proc_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		MCNumber onr_prov_upri = dtlR.trd_cur_onr_prov_upri();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			onr_prov_upri = null;
		}
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), onr_prov_upri);
		setValueEx(columnDtl2_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 取引通貨有償支給単価変更イベント
	 * @param info
	 */
	public void doDtl2_trd_cur_onr_prov_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri());
		setValueEx(columnDtl2_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 外注時の単価(加工単価+有償支給単価)を取得する
	 * @param trd_cur_proc_upri 取引通貨加工単価
	 * @param trd_cur_onr_prov_upri 取引通貨有償支給単価
	 * @return
	 */
	protected MCNumber getOutsrcUpri(MCNumber trd_cur_proc_upri,
			MCNumber trd_cur_onr_prov_upri) {
		if (isNull(trd_cur_proc_upri) && isNull(trd_cur_onr_prov_upri)) {
			return null;
		}
		return nvl(trd_cur_proc_upri, MCNumber.ZERO)
				.add(nvl(trd_cur_onr_prov_upri, MCNumber.ZERO));
	}

	protected void setRqstDlvRqstDt(Dtl1R dtlR) {
		// 計画外の場合納入予定日＝依頼元納入予定日
		if (MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ())) {
			setValueEx(columnDtl2_rqst_dlv_rqst_dt, dtlR.getGUIIndex(),
					dtlR.dlv_rqst_dt());
		}
	}

	protected void setPoSchdDt(Dtl1R dtlR, MCRow src) {
		if (isNull(src)) {
			dtlR.po_schd_dt(dtlR.dlv_rqst_dt());
		}
	}

	protected void setRqstAvlRqstDt(Dtl1R dtlR, MCRow src) {
		if (isNull(src) && (isNull(dtlR.po_schd_src_typ())
				|| MSC_PO_SCHD_SRC_TYP.isUPLND(dtlR.po_schd_src_typ()))) {
			dtlR.rqst_avl_rqst_dt(dtlR.dlv_rqst_dt());
		}
	}

	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param dtlR
	 */
	protected void setRepurcObliTax(Dtl1R dtlR) {
		if(isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri())){
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
	protected void setOutsrcAmt(Dtl1R dtlR) {
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
	protected void setBaseCurAmt(Dtl1R dtlR) {
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
	protected void setPtaxCurAmt(Dtl1R dtlR) {
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
	// 入力制御
	// -----------------------------------------------
		
	@Override
	public boolean isSRCHStatus(java.lang.String status) {
		if (isSame(status, SRCH_SPLIT) || 
				isSame(status, SRCH_DEL) ||
				isSame(status, SRCH_REF)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		// 登録
		if (Cnd_ope_INS.isSelected()) {
			setSRCH_SPLITStatus();
		}
		// 取消
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		// 参照
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
	}
	@Override
	public void setSRCH_SPLITStatus() {
		super.setSRCH_SPLITStatus();
		setSrchTgtTyp();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void setINSStatus() {
		if (getDtl1L().size() > 0) {
			super.setINSStatus();
			Dtl1Table.selectLeftmostColumn(0);
		}
		else {
			setSRCH_SPLITStatus();
		}
		
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		Dtl1Table.selectLeftmostColumn(0);
	}
	
	/**
	 * 行ステータスカラムの表示制御をします
	 */
	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。行追加がある種別では表示、それ以外は非表示
		if (Cnd_ope_INS.isSelected()) {
			Dtl1Table.setStatusColumnVisible(true);
			Dtl2Table.setStatusColumnVisible(true);
		}
		else {
			Dtl1Table.setStatusColumnVisible(false);
			Dtl2Table.setStatusColumnVisible(false);
		}
	}
	@Override
	public MCList<?> getDtl2_sppl_cd(MCRow row, MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		if (dtlR.outsrc_flg()) {
			row.setBooleanNE("inc_outsrc_flg", true);
		}
		return super.getDtl2_sppl_cd(row, info);
	}
	@Override
	public MCList<?> getDtl2_purc_rsn_cd(MCRow row, MCEventInfo info) {
		Dtl1R dtlR = getDtl2L().get(info.getEventIndex());
		if(MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())){
			row.setBooleanNE("xpns_purc_flg", true);
		}
		else {
			row.setBooleanNE("not_xpns_purc_flg", true);
		}
		return super.getDtl2_purc_rsn_cd(row, info);
	}
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
	/**
	 * 発注先品目・品名を設定します
	 * @param dtlR
	 */
	protected void setSpplItm(Dtl1R dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(dtlR.sppl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.reg_dt(), this);
		if (isNull(row)) {
			setValueEx(columnDtl2_sppl_itm_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl2_sppl_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl2_sppl_itm_cd, dtlR.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnDtl2_sppl_itm_nm, dtlR.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	/**
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 */
	protected void setDefaultTaxCd(Dtl1R dtlR) {
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.sppl_cd(), 
				getPurcUpriBaseDt(dtlR), 
				this);
		setValueEx(columnDtl2_tax_cd, dtlR.getGUIIndex(), taxCd);
	}
	
	protected MCDate getPurcUpriBaseDt(Dtl1R dtlR) {
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
	
	/**
	 * 検索対象区分を設定する
	 */
	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO.name());
		}
	}
	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl2Table.setCellConfig(crtDtl2CellConfig());
	}

	protected Dtl2CellConfig crtDtl2CellConfig() {
		return new Dtl2CellConfig();
	}

	protected class Dtl2CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Dtl1R r = (Dtl1R) table.getBaseTable().getRow(index);
			// 加工単価・有償支給単価
			if (column == columnDtl2_trd_cur_proc_upri 
					|| column == columnDtl2_trd_cur_onr_prov_upri ) {
				if (!r.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!r.itm_purc_upri_cng_flg() && !r.sppl_purc_upri_cng_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!r.upri_not_tgt_flg()) {
					return MCMode.READ_ONLY;
				}
				if (column == columnDtl2_trd_cur_onr_prov_upri && MAC_OUTSRC_UPRI_TYP.isPROC(r.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 	取引通貨単価
			if(column == columnDtl2_trd_cur_upri) {
				// 外注単価区分:加工単価+有償支給単価の場合は入力不可
				if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(r.outsrc_upri_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 為替レート指定ＦＬＧ
			if (column == columnDtl2_xrate_inpt_flg) {
				if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			// 納税為替レート指定ＦＬＧ
			if (column == columnDtl2_ptax_xrate_inpt_flg) {
				if (isSame(r.trd_cur_cd(), getCo().ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			// 依頼元使用可能希望日
			if (column == columnDtl2_rqst_avl_rqst_dt) {
				if (!MSC_PO_SCHD_SRC_TYP.isUPLND(r.po_schd_src_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 納入予定日・時刻、仕入予定日
			if (column == columnDtl2_dlv_rqst_dt 
					|| column == columnDtl2_dlv_rqst_hm
					|| column == columnDtl2_purc_schd_dt) {
				if (r.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 製造場所・構成パタン
			if (column == columnDtl2_mfg_loc_cd
					|| column == columnDtl2_bom_ptn) {
				if (!r.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 発注先・メーカ
			if (column == columnDtl2_sppl_cd 
					|| column ==  columnDtl2_maker_cd) {
				if (r.outsrc_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 仕入理由
			if (column == columnDtl2_bd_dpt_cd) {
				if (isEditableMode(column) && MSUCP_PurcUtil.isPurcXpns(r.trd_ptn_typ(), r.asset_mng_typ())) {
					return MCMode.ENABLE;
				}

			}
			return super.getPriorMode(index, column, table);
		}
	}
	// -----------------------------------------------
	// 単価再取得
	// -----------------------------------------------
	/**
	 * 単価再取得対象の明細を取得します。
	 */
	protected MCList<Dtl1R> getSprtTgtDtlL() {
		MCList<Dtl1R> upL = MCList.create(Dtl1R.class);
		for (Dtl1R r : getDtl2L()) {
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
	protected boolean isTgt(Dtl1R r) {
		return  !r.upri_not_tgt_flg() && 
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
		MSBDP_PoSchdSplitReg.MS_MSBDL0040_Sprt02Caller caller = createMS_MSBDL0040_Sprt02();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		return caller.getErrorFlg();
	}
	/**
	 * 単価をキャッシュする。
	 */
	protected void cacheUpri(Dtl1R dtlR) {
		dtlR.old_trd_cur_upri(dtlR.trd_cur_upri());
		dtlR.old_trd_cur_proc_upri(dtlR.trd_cur_proc_upri());
		dtlR.old_trd_cur_onr_prov_upri(dtlR.trd_cur_onr_prov_upri());
		dtlR.old_interim_flg(dtlR.interim_flg());
	}
	/**
	 * 単価をキャッシュした値に戻す。
	 */
	protected void restoreUpri(Dtl1R dtlR) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.old_trd_cur_upri();
		MCNumber procUpri = dtlR.old_trd_cur_proc_upri();
		MCNumber onrProvUpri = dtlR.old_trd_cur_onr_prov_upri();
		boolean interimFlg = dtlR.old_interim_flg();
		setValueEx(columnDtl2_trd_cur_upri, idx, upri);
		setValueEx(columnDtl2_trd_cur_proc_upri, idx, procUpri);
		setValueEx(columnDtl2_trd_cur_onr_prov_upri, idx, onrProvUpri);
		setValueEx(columnDtl2_interim_flg, idx, interimFlg);
	}
	/**
	 * 単価のイベントを発生させる。
	 */
	protected void doUpriEvent(Dtl1R dtlR) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.trd_cur_upri();
		MCNumber procUpri = dtlR.trd_cur_proc_upri();
		MCNumber onrProvUpri = dtlR.trd_cur_onr_prov_upri();
		Boolean interimFlg = dtlR.interim_flg();
		// 同一値でイベントを発生させるために一度クリアする
		setValueEx(columnDtl2_trd_cur_upri, idx, null);
		setValueEx(columnDtl2_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl2_trd_cur_onr_prov_upri, idx, null);
		setValueEx(columnDtl2_interim_flg, idx, false);
		// イベントを発生させる
		setValueEx(columnDtl2_trd_cur_upri, idx, upri);
		setValueEx(columnDtl2_trd_cur_proc_upri, idx, procUpri);
		setValueEx(columnDtl2_trd_cur_onr_prov_upri, idx, onrProvUpri);
		setValueEx(columnDtl2_interim_flg, idx, interimFlg);
	}
	/**
	 * 異なる単価の明細が含まれるかどうかを判定します。
	 */
	protected void setDiffLatestUpriMsg(MCMessageList msgL, Dtl1R dtlR) {
		if (isNullOr(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			return;
		}
		if (!isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl2_trd_cur_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
		}
		if (!isSame(dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl2_trd_cur_proc_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_proc_upri(), dtlR.trd_cur_proc_upri(), toDispGUIIndex(dtlR)));
		}
		if (!isSame(dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBDP0005,
					columnDtl2_trd_cur_onr_prov_upri.getLabelByLocale(), 
					dtlR.old_trd_cur_onr_prov_upri(), dtlR.trd_cur_onr_prov_upri(), toDispGUIIndex(dtlR)));
		}
	}
	// -----------------------------------------------
	// 予定日算出ユーティリティ使用準備
	// -----------------------------------------------
	protected Dtl1R getSchdDtEditCnd(Dtl1R dtlR) {
		Dtl1R cnd = dtlR.clone();
		cnd.po_schd_dt(null);
		cnd.purc_schd_dt(null);
		cnd.rqst_avl_rqst_dt(null);
		return cnd;
	}
	protected Dtl1R getSchdDtEditCnd(Dtl1R dtlR, String columnNm) {
		if (isNullAnd(dtlR.rqst_avl_rqst_dt(), dtlR.dlv_rqst_dt())) {
			return Dtl1R.create();
		}
		Dtl1R cnd = dtlR.clone();
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
	protected MCRow callGetSchdDt(Dtl1R dtlR , MCDate baseDt , String sysParm) {
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
				null, 
				dtlR.in_to_loc_cd(), 
				dtlR.site_cd(), 
				dtlR.outsrc_sppl_cd(),
				dtlR.sppl_cal_cd(), 
				dtlR.in_to_loc_cal_cd(), 
				null, 
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
	protected void setSchdDt(Dtl1R dest, MCRow src) {
		if (!isNull(src)) {
			if (isNull(dest.po_schd_src_typ())
					|| MSC_PO_SCHD_SRC_TYP.isUPLND(dest.po_schd_src_typ())) {	
				dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
			}
			dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
			setValueEx(columnDtl2_purc_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
			setValueEx(columnDtl2_po_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$po_schd_dt));
		}
		setRqstDlvRqstDt(dest);
		setPoSchdDt(dest, src);
	}
	protected void setSchdDt(String col, Dtl1R dest, MCRow src) {
		if (!isNull(src)) {
			if (isSame(col, MSUCP_PurcUtil.$dlv_rqst_dt)) {
				if (isNull(dest.po_schd_src_typ())
						|| MSC_PO_SCHD_SRC_TYP.isUPLND(dest.po_schd_src_typ())) {	
					dest.rqst_avl_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$rqst_dlv_rqst_dt));
				}
				dest.dlv_rqst_dt(src.getDateNE(MSUCP_PurcUtil.$dlv_rqst_dt));
				setValueEx(columnDtl2_purc_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$purc_schd_dt));
				setValueEx(columnDtl2_po_schd_dt, dest.getGUIIndex(), src.getDateNE(MSUCP_PurcUtil.$po_schd_dt));
			}
		}
		setRqstDlvRqstDt(dest);
		if (isSame(col, MSUCP_PurcUtil.$dlv_rqst_dt)) {
			setRqstAvlRqstDt(dest, src);
		}
	}
	// -----------------------------------------------
	// その他
	// -----------------------------------------------
	/**
	 * 経費購買か否かを判定します
	 * @param r
	 * @return
	 */
	protected boolean isPurcXpns(Dtl1R dtlR) {
		return MSUCP_PurcUtil.isPurcXpns(dtlR.trd_ptn_typ(), dtlR.asset_mng_typ());
	}
	// -----------------------------------------------
	// fillspace
	// -----------------------------------------------
	@Override
	protected void opePanelFillSpace() {
		//fillspaceは行わない。
	}
	@Override
	protected void fillSpaceForOpen() {
		//fillspaceは行わない。
	}
	// -----------------------------------------------
	// IfSyncTableBase
	// -----------------------------------------------
	@Override
	public MCTable<?> getHSyncMainTable(MCRootPanel panel) {
		return Dtl1Table;
	}
	
	// -----------------------------------------------
	// IfOpePanel
	// -----------------------------------------------
	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getDtl1L());
		ret.add(getDtl2L());
		return ret;
	}
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}
	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	// -----------------------------------------------
	// IF
	// -----------------------------------------------	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getDtl2L()) {
			list.add(Dtl1R.$reg_dt);
			list.add(Dtl1R.$po_schd_no);
			list.add(Dtl1R.$ins_usr_id);
			list.add(Dtl1R.$ins_usr_nm);
			list.add(Dtl1R.$ins_func_id);
			list.add(Dtl1R.$ins_func_nm);
			list.add(Dtl1R.$ins_ts);
			list.add(Dtl1R.$upd_usr_id);
			list.add(Dtl1R.$upd_usr_nm);
			list.add(Dtl1R.$upd_func_id);
			list.add(Dtl1R.$upd_func_nm);
			list.add(Dtl1R.$upd_ts);
			list.add(Dtl1R.$upd_srv_req_no);
		}
		return list;
	}

}