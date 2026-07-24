package mcframe.clientMSBD.MSBDP0150;

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
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
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
import java.util.HashMap;
import java.util.Map;

import mcframe.clientCore.beans.MCButtonGroup;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientCore.beans.MCMessageBox;
import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.MCRootPanel;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.event.MCEventInfo;
import mcframe.clientCore.event.MCLCBeans;
import mcframe.clientCore.event.MCNCBeans;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0020.ConvQtyAmtUtil_Dtl2R;
import mcframe.clientMSUC.MSUCP0020.ConvQtyAmtUtil_DtlR;
import mcframe.clientMSUC.MSUCP0020.ConvQtyAmtUtil_HdrR;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCJoinKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonMS.constant.MSC_PURC_SRCH_TGT_TYP;
import mcframe.commonMS.constant.MSC_STK_ID_TYP;
import mcframe.commonMA.constant.MAC_PURC_ID_TYP;
import mcframe.commonMA.constant.MAC_PURC_TYP;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientFXUC.FXUCP0170.FXUCP_ValidaterUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcRetSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcRetSchdReg_MC extends MSBDP_PurcRetSchdReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _maxDtlPegNo = 1;
	protected int _maxIoPegNo = 1;
	
	protected boolean _nonActFlg = false;

	/** 詳細行を一括でキャッシュするリスト */
	protected Map<MCNumber, MCList<Dtl2R>> _dtl2L = new HashMap<MCNumber, MCList<Dtl2R>>();

	// 明細反映ボタン実行中フラグ
	protected boolean _updDtlBtnExecFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcRetSchdReg_MC() {
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
	public MSBDP_PurcRetSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Sprt01Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		/**
		 *  更新ボタンのイベントかどうかを表すフラグ
		 */
		protected boolean _upd_btn_event_flg = false;
		/**
		 * 続行不可能かどうかを表すフラグ
		 */
		protected boolean _error_flg = false;
		
		MCList<Dtl1R> _sprtTgtList = getSprtTgtDtl1L();
		
		protected MS_MSBDL0150_Sprt01Caller(P p, B b) {
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
			
			// 明細行のＷＧＣＤがＮＵＬＬの場合、詳細行の1行目から補完する
			for (Dtl1R tgtRow : _sprtTgtList) {
				if (isNull(tgtRow.purc_ret_loc_wg_cd())) {
					MCList<Dtl2R> chdIoL = _dtl2L.get(tgtRow.peg_no());
					if (isNull(chdIoL)) {
						continue;
					}
					Dtl2R ioRow = chdIoL.get(0);
					tgtRow.purc_ret_loc_wg_cd(ioRow.purc_ret_loc_wg_cd());
				}
			}
			
			//更新ボタンイベントのときは同期にする
			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().setAll(_sprtTgtList);
			//単価取得用の基準日を設定
			bridge.up1().forEach(r -> r.base_dt(getHdr1R().reg_dt()));
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			//単価再取得ボタンイベントのときは必要に応じてメッセージを表示
			if (!_upd_btn_event_flg) {
				if (_sprtTgtList.isEmpty()) {
					msgList.add(new MCMessage(MSBDP0013));
				}				
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			
			//　単価取得に最低限必要な必須チェックのみ実施する
			msgList.addAll(panel.checkReq(
					Hdr1_reg_dt
					));
			msgList.addAll(
					MSUCP_PurcUtil.chkForUpriExptDt(
						panel, _sprtTgtList, 
						Hdr1_sppl_cd, 
						Hdr1_trd_cur_cd, 
						columnDtl1_purc_ret_loc_wg_cd,
						columnDtl1_itm_cd,
						columnDtl1_itm_sub1,
						columnDtl1_itm_sub2,
						columnDtl1_itm_sub3,
						columnDtl1_trd_unit_cd,
						columnDtl1_trd_unit_qty,
						columnDtl1_base_unit_qty)
					);
			
			_sprtTgtList.forEach(r -> {
				// 購買区分で外注の判断を行う
				if (!isNull(r.purc_typ()) && !MAC_PURC_TYP.isPURC_ITM(r.purc_typ())) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl1_tax_cd));
				}
			});
			
			if (!msgList.isEmpty()) {
				_error_flg = true;
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
		protected void show() {
			//Ins01,Upd01用に変更前の値をキャッシュ
			_sprtTgtList.forEach(dr -> cacheUpri(dr));
			super.show();
			//単価イベントを実行
			MCMessageList msgL = new MCMessageList();
			_sprtTgtList.forEach(dr -> {
				doUpriEvent(dr, msgL);
			});
			if (!msgL.isEmpty()) {
				_error_flg = true;
				message(msgL);
			}
		}
		
	}
	


	/**
	 * Panel[Dtl1Btn]のボタン[srch_upri]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_srch_upri(MCEventInfo info) {
		callMS_MSBDL0150_Sprt01();
	}
	/**
	 * [MS_MSBDL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch01Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
			initMaxPegNo();
		}
		
		@Override
		protected void setMode() {
			Dtl1Table.selectRowNoFocus(0);
			setINSStatus();
		}
		@Override
		protected void setModeNoDown() {
			setINSStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			complSrchRsltForIns(bridge.down0(), bridge.down1(), bridge.down2());
			setCreateStatusToRegBlocks();
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
		}
		
		protected void setCreateStatusToRegBlocks() {
			bridge.down1().setStatus(MCRow.CREATE);
			bridge.down2().setStatus(MCRow.CREATE);
		}
		
		@Override
		protected void show() {
			Dtl1R r = bridge.down1().get(0);
			String pit = r.purc_id_typ();
			if (MAC_PURC_ID_TYP.isFFR_RCV(pit) || MAC_PURC_ID_TYP.isVMI(pit)) {
				super.show();
				setTrdCd();
			}
			else {
				MCMessageBox.dialog(panel, new MCMessage(MSBDP0022));
				
				clearHiddenList();
			}
			setDispAmt();
		}
	}

	/**
	 * [MS_MSBDL0150_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch02Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0150_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
			initMaxPegNo();
		}

		@Override
		protected void setMode() {
			Dtl1Table.selectRowNoFocus(0);
			setINSStatus();
		}

		@Override
		protected void setModeNoDown() {
			setINSStatus();
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down1().forEach(dr -> {
				if (!isNull(dr.tax_cd())) {
					dr.tax_fix_flg(true);
				}
			});
			complSrchRsltForIns(bridge.down0(), bridge.down1(), bridge.down2());
			setCreateStatusToRegBlocks();
			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
		}
		
		protected void setCreateStatusToRegBlocks() {
			bridge.down1().setStatus(MCRow.CREATE);
			bridge.down2().setStatus(MCRow.CREATE);
		}
		
		@Override
		protected void show() {
			super.show();
			setTrdCd();
			setDispAmt();
		}
	}

	/**
	 * [MS_MSBDL0150_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch03Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0150_Srch03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
			initMaxPegNo();
		}

		@Override
		protected void setMode() {
			Dtl1Table.selectRowNoFocus(0);
			super.setMode();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().xrate_cd(getCo().purc_xrate_cd());
			cacheAllDtl2(bridge.down1(), bridge.down2());

			// 明細行・詳細行の紐付NOの最大値に1加算して格納する
			_maxDtlPegNo = getMaxValue(bridge.down1(), Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(bridge.down2(), Dtl2R.$peg_no) + 1;
		}
		@Override
		protected void show() {
			super.show();
			setDispAmt();
		}
	}	

	/**
	 * [MS_MSBDL0150_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Ins01Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;
		
		/**
		 * 詳細全件のリスト
		 */
		MCList<Dtl2R> _dtl2All = getAllDtl2();
		
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<Dtl1R> _sprtTgtList = getSprtTgtDtl1L();
		
		protected MS_MSBDL0150_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_upriChngMsgList = new MCMessageList();
			
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l =  super.getDownBlocks();
			l.set(2, _dtl2All);
			return l;
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			//下段のテーブルはチェックしない
			msgList.addAll(panel.checkReq(getHdr1R()));
			checkReqSub(msgList, exceptDeleteAndEmpty(getDtl1L()));
			msgList.addAll(cmmChkIo(exceptDeleteAndEmpty(_dtl2All)));
		}
		
		@Override
		protected boolean confirmForCall() {
			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_sprtTgtList.forEach(dr ->	restoreUpri(dr));
			}
			
			return confirmRslt;
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			_sprtTgtList.forEach(dr ->	
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
						
			msgList.addAll(_upriChngMsgList);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up2().setAll(_dtl2All);
		}
				
		@Override
		protected void show() {
			super.show();
		}
	}
	
	
	/**
	 * [MS_MSBDL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Upd01Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		/**
		 * 単価再取得時のメッセージを保持するリスト
		 */
		MCMessageList _upriChngMsgList;

		/**
		 * 詳細全件のリスト
		 */
		MCList<Dtl2R> _dtl2All = getAllDtl2();
		
		/**
		 * 単価再取得対象のリスト
		 */
		MCList<Dtl1R> _sprtTgtList = getSprtTgtDtl1L();
		
		protected MS_MSBDL0150_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_upriChngMsgList = new MCMessageList();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			//下段のテーブルはチェックしない
			msgList.addAll(panel.checkReq(getHdr1R()));
			checkReqSub(msgList, exceptDeleteAndEmpty(getDtl1L()));
			msgList.addAll(cmmChkIo(exceptDeleteAndEmpty(_dtl2All)));
		}
		
		@Override
		protected boolean confirmForCall() {

			if (!doSprt()) {
				//ダイアログは単価再取得処理で表示する
				return false;
			}
			
			boolean confirmRslt = super.confirmForCall();
			if (_upriChngMsgList.size() > 0 && !confirmRslt) {
				_sprtTgtList.forEach(dr ->	restoreUpri(dr));
			}
			
			return confirmRslt;
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			_sprtTgtList.forEach(dr ->	
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
						
			msgList.addAll(_upriChngMsgList);
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l =  super.getDownBlocks();
			l.set(1, _dtl2All);
			return l;
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up2().setAll(_dtl2All);
		}
	}

	/**
	 * [MS_MSBDL0150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Del01Caller<P extends MSBDP_PurcRetSchdReg, B extends MS_MSBDL0150_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0150_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			//サーバのChk03はChk01のコンテナを共有しているため、Chk01のチェックが使用される。
			//チェックを回避するため削除ステータスに変更する必要がある。
			bridge.up0().setStatus(MCRow.DELETE);
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch_arr_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_arr_act(MCEventInfo info) {
		callMS_MSBDL0150_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_purc_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_purc_act(MCEventInfo info) {
		callMS_MSBDL0150_Srch02();
	}
	/**
	 * Panel[Cnd]のボタン[srch_purc_ret_schd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_purc_ret_schd(MCEventInfo info) {
		callMS_MSBDL0150_Srch03();
	}
	
	/**
	 * Panel[Dtl1Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_radd(MCEventInfo info) {
		insertRow(Dtl1Table);
	}
	/**
	 * Panel[Dtl1Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_rdel(MCEventInfo info) {

		Dtl1R dr = Dtl1Table.getSelectedMCRow();
		
		//行削除はフォーカス移動を伴うため、詳細行から先に処理すること
		
		//詳細行
		Dtl2Table.deleteRows(getDtl2L().subList(r -> {
			//削除復帰の場合は削除行を対象とする
			if (dr.isStatusDelete()) {
				return r.isStatusDelete();
			}
			//削除の場合は削除行以外を対象とする
			else {
				return !r.isStatusDelete();
			}
		}));
		_dtl2L.replace(dr.peg_no(), getDtl2L().shallowClone());
		
		//明細行
		deleteRow(Dtl1Table);
		setBtnMode();
		setDispAmt();
	}
	/**
	 * Panel[Dtl1Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtl1Btn_rcopy(MCEventInfo info) {
		Dtl1R seldr = Dtl1Table.getSelectedMCRow();
		Dtl1R dtl1_cpy_row = copyRow(Dtl1Table);
		
		if (!isNull(dtl1_cpy_row)) {
			MCList<Dtl2R> iol = _dtl2L.get(seldr.peg_no());

			if (iol == null || iol.size() == 0) {
				//詳細がない場合は、明細から詳細を作成
				MCList<Dtl2R> dtl2_list = MCList.create(Dtl2R.class);
				Dtl2R dtl2_add_row = Dtl2R.create();
				
				dtl2_add_row.setValuesByName(dtl1_cpy_row);
				dtl2_add_row.dtl_peg_no(dtl1_cpy_row.peg_no());
				getNotInheritDtl2Cols().forEach(s -> dtl2_add_row.setValue(s, null));
				setIoPegNo(dtl2_add_row);
				
				dtl2_add_row.setStatus(MCRow.CREATE);
				dtl2_list.add(dtl2_add_row);		
				_dtl2L.put(dtl1_cpy_row.peg_no(), dtl2_list);
				
			}
			else {
				//詳細がある場合は、明細を複製
				iol = iol.clone();
				iol.forEach(r -> {
					r.setStatus(MCRow.CREATE);
					r.dtl_peg_no(dtl1_cpy_row.peg_no());
					getNotInheritDtl2Cols().forEach(s -> r.setValue(s, null));
					setIoPegNo(r);
				});
				_dtl2L.put(dtl1_cpy_row.peg_no(), iol);
			}
			
			// 詳細枠を再表示
			showIo(dtl1_cpy_row);
		}
		setBtnMode();
		setDispAmt();
		
	}
	
	/**
	 * Panel[Dtl2Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_radd(MCEventInfo info) {
		
		// 明細の選択行を取得する
		Dtl1R dr = Dtl1Table.getSelectedMCRow();

		// 紐付NOセット
		if (isNull(dr.peg_no())) {
			setDtlPegNo(dr);
		}
		
		// 詳細行を追加し、明細紐付NOをセットする
		Dtl2R d2r = insertRow(Dtl2Table);

		d2r.dtl_peg_no(dr.peg_no());

		// 受払紐付NOセット
		setIoPegNo(d2r);
		
		// 品目情報(非表示項目)をコピー
		if (!isNull(dr.itm_cd())) {
			copyItmInfo(dr, d2r);
		}
		
		//明細のデータを追加行に設定
		MCNumber ioPegNo = d2r.peg_no();
		d2r.setValuesByName(dr);
		d2r.peg_no(ioPegNo);
		getNotInheritDtl2Cols().forEach(s -> d2r.setValue(s, null));
		setBtnMode();
	}
	/**
	 * Panel[Dtl2Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rdel(MCEventInfo info) {
		Dtl2R ioRow = deleteRow(Dtl2Table);
		if (!isNull(ioRow)) {
			_dtl2L.replace(ioRow.dtl_peg_no(), getDtl2L().shallowClone());
		}
		
	}
	/**
	 * Panel[Dtl2Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_rcopy(MCEventInfo info) {
		Dtl2R cpyRow = copyRow(Dtl2Table);
		
		// 行コピー後、受払紐付NOをセットする
		if (!isNull(cpyRow)) {
			setIoPegNo(cpyRow);
		}
		
	}
	
	
	/**
	 * Panel[Dtl2Btn]のボタン[upd_dtl]の押下時の処理
	 */
	@Override
	public void doDtl2Btn_upd_dtl(MCEventInfo info) {
		_updDtlBtnExecFlg = true;
		setValueForTrdUnitCols(exceptDeleteAndViewEmpty(Dtl1Table));
		setValueForContCols(exceptDeleteAndViewEmpty(Dtl1Table));
		_updDtlBtnExecFlg = false;
	}
	/**
	 * 明細の単位及び、詳細の数量の合計を明細の単位に換算した数量を、上段にセットする。
	 * @param dtlL 対象行
	 */
	protected void setValueForTrdUnitCols(MCList<Dtl1R> dtlL) {
		
		// 発注明細(予定情報)でグループ
		MCList<Dtl1R> dtlLByPoD = dtlL.groupBy(Dtl1R.$purc_ret_schd_d_no);
		
		// 紐付NO
		int hdr_peg_no = 1;
		// ユーティリティ実行用のヘッダリスト
		MCList<ConvQtyAmtUtil_HdrR> hdrList = MCList.create(ConvQtyAmtUtil_HdrR.class);
		
		// ユーティリティ実行用の明細リスト
		MCList<ConvQtyAmtUtil_DtlR> dtlList
			= MCList.create(ConvQtyAmtUtil_DtlR.class);

		// ユーティリティ実行用の詳細リスト
		MCList<ConvQtyAmtUtil_Dtl2R> dtl2List
			= MCList.create(ConvQtyAmtUtil_Dtl2R.class);
		
		for (Dtl1R row : dtlLByPoD) {
			
			Dtl1R hdr = dtlL.getFirst(Dtl1R.$purc_ret_schd_d_no, row.purc_ret_schd_d_no());
			
			// ユーティリティ実行用ヘッダ
			ConvQtyAmtUtil_HdrR utlHdr = ConvQtyAmtUtil_HdrR.create();
			utlHdr.peg_no(hdr_peg_no++);
			utlHdr.base_unit_dec_place(hdr.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(hdr.base_unit_rnd_typ());
			
			hdrList.add(utlHdr);
			
			// ユーティリティ実行用明細（上段）
			MCList<Dtl1R> dtl = dtlL.subList(Dtl1R.$purc_ret_schd_d_no, row.purc_ret_schd_d_no());
			MCList<ConvQtyAmtUtil_DtlR> utlDtlL
				= MCList.create(ConvQtyAmtUtil_DtlR.class);
			MCList<ConvQtyAmtUtil_Dtl2R> utlDtl2L
			= MCList.create(ConvQtyAmtUtil_Dtl2R.class);
			
			for (Dtl1R dr : dtl) {
				ConvQtyAmtUtil_DtlR utlDtlR
					= ConvQtyAmtUtil_DtlR.create();
				
				utlDtlR.peg_no(dr.peg_no());
				utlDtlR.hdr_peg_no(utlHdr.peg_no());
				
				utlDtlL.add(utlDtlR);
				
				MCList<Dtl2R> d2l = _dtl2L.get(dr.peg_no());
				if (isNull(d2l)) {
					return;
				}
				
				d2l.forEach(ir -> {
					ConvQtyAmtUtil_Dtl2R uir = utlDtl2L.createRow();
					uir.dtl_peg_no(dr.peg_no());
					uir.peg_no(ir.peg_no());
					uir.trd_unit_cd(ir.trd_unit_cd());
					uir.trd_unit_qty(ir.trd_unit_qty());
					uir.trd_unit_conv_base_qty(ir.trd_unit_dmn_qty());
					uir.trd_unit_conv_qty(ir.trd_unit_conv_qty());
					//明細の単位
					uir.schd_trd_unit_cd(hdr.trd_unit_cd());
					uir.schd_trd_unit_conv_qty(hdr.trd_unit_conv_qty());
					uir.schd_trd_unit_conv_base_qty(hdr.trd_unit_dmn_qty());
					uir.schd_trd_unit_dec_place(hdr.trd_unit_dec_place());
					uir.schd_trd_unit_rnd_typ(hdr.trd_unit_rnd_typ());
					dtl2List.add(uir);
				});
			}

			dtlList.addAll(utlDtlL);
			
		}
		
		// 明細の数量、金額項目計算用ユーティリティ実行
		calcDtlQty(hdrList, dtlList, dtl2List);
		
		// ユーティリティの計算結果を明細に反映する
		for (ConvQtyAmtUtil_DtlR dtlR : dtlList) {
			Dtl1R row = getDtl1L().getFirst(Dtl1R.$peg_no, dtlR.peg_no());
			setValueEx(columnDtl1_trd_unit_cd, row.getGUIIndex(), dtlR.trd_unit_cd());
			setValueEx(columnDtl1_trd_unit_qty, row.getGUIIndex(), dtlR.trd_unit_qty());
		}

	}
	
	protected void setValueForContCols(MCList<Dtl1R> dtl) {
		for (Dtl1R dr : dtl) {
			
			MCList<Dtl2R> d2l = _dtl2L.get(dr.peg_no());
			
			if (isNull(d2l)) {
				return;
			}
			
			//明細の有効成分を再計算
			dr.purc_cont_qty(null);
			dr.std_cont_qty(null);
			
			d2l.forEach(ir ->  {
				MSUCP_PurcUtil.setCont(ir);
				MSUCP_PurcUtil.addCont(dr, ir);
			});
		}
			
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0160(MCEventInfo info) {
	
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0160");
		aso.putCnd(crtOpenMSBDP0160CndR(aso, getHdr1R()));	
		aso.putSearchAction();
		aso.show();
	}				
	protected mcframe.clientMSBD.MSBDP0160.CndR crtOpenMSBDP0160CndR(MAUCP_AppScreenOpener aso, Hdr1R r) {
		mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg p = (mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0160.CndR to = mcframe.clientMSBD.MSBDP0160.CndR.create();
		to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.name());
		to.srch_tgt_no(r.purc_ret_schd_no());
		to.ope(p.Cnd_ope_INS.getActionCommand());
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0150_Ins01();
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0150_Upd01();
	}
	
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0150_Del01();
	}
	
	/**
	 * 単価再取得処理を実行します。
	 * @return 正常に終了した場合true
	 */
	protected boolean doSprt() {
		MSBDP_PurcRetSchdReg.MS_MSBDL0150_Sprt01Caller caller = createMS_MSBDL0150_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		return !caller.getErrorFlg();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr1_ptax_xrate.addNCListener(this);
		
		columnDtl1_itm_cd.addLCListener(this);
		columnDtl1_itm_sub1.addLCListener(this);
		columnDtl1_itm_sub2.addLCListener(this);
		columnDtl1_itm_sub3.addLCListener(this);
		columnDtl2_itm_cd.addLCListener(this);
		columnDtl2_itm_sub1.addLCListener(this);
		columnDtl2_itm_sub2.addLCListener(this);
		columnDtl2_itm_sub3.addLCListener(this);
		columnDtl1_trd_unit_qty.addNCListener(this);
		columnDtl1_trd_cur_upri.addNCListener(this);
		columnDtl1_trd_cur_tax_amt.addNCListener(this);
		columnDtl1_ptax_cur_upri.addNCListener(this);
		columnDtl1_ptax_cur_tax_amt.addLCListener(this);
		columnDtl1_base_cur_tax_amt.addLCListener(this);
		columnDtl1_str_ln_cd.addNCListener(this);
		columnDtl1_stk_arrv_bp_cd.addNCListener(this);
		columnDtl1_str_ln_cd_none_flg.addNCListener(this);
		columnDtl1_crt_lot_flg.addNCListener(this);
		columnDtl1_lot_no.addNCListener(this);
		columnDtl1_sublot_no.addNCListener(this);
		columnDtl1_sno1.addNCListener(this);
		columnDtl1_sno2.addNCListener(this);
		columnDtl1_sno3.addNCListener(this);
		columnDtl1_sno4.addNCListener(this);
		columnDtl1_purc_cont_qty.addNCListener(this);
		columnDtl1_trd_cur_upri.addLCListener(this);
		columnDtl1_trd_unit_qty.addLCListener(this);
		columnDtl1_tax_cd.addLCListener(this);
		columnDtl1_trd_cur_tax_amt.addLCListener(this);
		columnDtl1_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl1_trd_cur_proc_upri.addLCListener(this);
		columnDtl1_trd_cur_onr_prov_upri.addLCListener(this);
		columnDtl1_trd_cur_amt.addLCListener(this);
		columnDtl1_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl1_trd_cur_proc_amt.addLCListener(this);
		columnDtl1_trd_cur_onr_prov_amt.addLCListener(this);
		getDtl1L().addListListener(createListListener(createDtlRowListener()));
		Hdr1_purc_dpt_cd.addLCListener(this);
	}
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				Dtl1R dtl = (Dtl1R) event.getSourceRow();
				dtl.base_purc_ac_dt(getToday());
				copyHdrToDtl(dtl);
			}
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		getDtl1_purc_ret_loc_cd_ListPutter().putBind(LocCols.$i_dt, Hdr1_reg_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl1_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr1_reg_dt);
		columnDtl1_bd_dpt_cd.getListConfig().getPutter().putBind(DptCols.$i_dt, Hdr1_reg_dt);
		getDtl1_maker_cd_ListPutter().putBind(ItmDtlMakerCols.$i_master_dt, Hdr1_reg_dt);
		getDtl1_maker_cd_ListPutter().putBind(ItmDtlMakerCols.$i_sppl_cd, Hdr1_sppl_cd);

		getDtl2_purc_ret_loc_cd_ListPutter().putBind(LocCols.$i_dt, Hdr1_reg_dt);
		getDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_sppl_cd, Hdr1_sppl_cd);
		getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr1_reg_dt);
		
	}
	/**
	 * 明細行の選択行変更イベント
	 */
	@Override
	public void doDtl1_NC(MCEventInfo info) {
		super.doDtl1_NC(info);
		
		int idx = info.getEventIndex();
		if (idx >= 0) {
			Dtl1R row = getDtl1L().get(idx);
			showIo(row);
		}
		// 検索結果を取得した時点でソートされているため、ソートは不要
		Dtl2Table.adjustWidth();
		
		// ボタン・モード制御
		setBtnMode();

	}
	@Override
	public void doDtl1_abort_flg_NC(MCEventInfo info) {
		super.doDtl1_abort_flg_NC(info);

		// ボタン・モード制御
		setBtnMode();
		setDispAmt();
	}


	/**
	 * 明細行に対する詳細行を表示する。
	 * @param row 対象の明細行
	 */
	protected void showIo(Dtl1R row) {
		if (!isNull(row)){
			getDtl2L().setAll(_dtl2L.get(row.peg_no()));
			showSub(Dtl2Table);
		}
		else {
			getDtl2L().clear();
		}
	}
	
	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);
			tbl.selectLeftmostColumn(0);
		}
	}
	
	/**
	 * ボタン制御
	 */
	protected void setBtnMode() {

		Hdr1R hr = getHdr1R();
		Dtl1R dtl1_sel_row = Dtl1Table.getSelectedMCRow();
		MCButton openStkInfo1 = Dtl1Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500;
		
		// 明細行のボタン制御
		if (isNull(dtl1_sel_row)) {
			Dtl1Btn_rcopy.setMode(MCMode.DISABLE);
			Dtl1Btn_rdel.setMode(MCMode.DISABLE);
			openStkInfo1.setMode(MCMode.DISABLE);
		}
		else {
			if (dtl1_sel_row.bef_abort_flg() || hasAct(dtl1_sel_row) || dtl1_sel_row.abort_flg()) {
				setDefaultMode(Dtl1Btn_rcopy);
				Dtl1Btn_rdel.setMode(MCMode.DISABLE);
				openStkInfo1.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Dtl1Btn_rcopy);
				setDefaultMode(Dtl1Btn_rdel);
				setDefaultMode(openStkInfo1);
			}
			if (isNull(hr.sppl_cd()) ||
					isNull(dtl1_sel_row.purc_ret_loc_cd()) || 
					isNull(dtl1_sel_row.itm_cd())) {
				openStkInfo1.setMode(MCMode.DISABLE);
			}
		}

		Dtl2R dtl2_sel_row = Dtl2Table.getSelectedMCRow();
		MCButton openStkInfo2 = Dtl2Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500;
		// 詳細行のボタン制御
		if (isNull(dtl1_sel_row) || dtl1_sel_row.isStatusDelete()) {
			Dtl2Btn_radd.setMode(MCMode.DISABLE);
			Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
			Dtl2Btn_rdel.setMode(MCMode.DISABLE);
			openStkInfo2.setMode(MCMode.DISABLE);
		}
		else {			
			if (!isNull(dtl1_sel_row) && 
					(dtl1_sel_row.bef_abort_flg() || hasAct(dtl1_sel_row) || dtl1_sel_row.abort_flg())) {
				Dtl2Btn_radd.setMode(MCMode.DISABLE);
				Dtl2Btn_rcopy.setMode(MCMode.DISABLE);
				Dtl2Btn_rdel.setMode(MCMode.DISABLE);
				openStkInfo2.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Dtl2Btn_radd);
				setDefaultMode(Dtl2Btn_rcopy);
				setDefaultMode(Dtl2Btn_rdel);
				setDefaultMode(openStkInfo2);
			}
			if (!isNull(dtl2_sel_row)) {
				if (isNull(hr.sppl_cd()) ||
						isNull(dtl2_sel_row.purc_ret_loc_cd()) || 
						isNull(dtl2_sel_row.itm_cd())) {
					openStkInfo2.setMode(MCMode.DISABLE);
				}
			}
			else {
				openStkInfo2.setMode(MCMode.DISABLE);
			}
		}
		
		// 取消ボタンの制御
		if (isSame(getStatus(), DEL)) {
			boolean isDisable = false;
			for (Dtl1R r : getDtl1L()) {
				if (r.bef_abort_flg()) {
					isDisable = true;
					break;
				}
			}
			if (isDisable) {
				Btn_del.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_del);
			}
		}
		
		if (!isNull(getHdr1R().purc_ret_schd_no())) {
			Btn_open_MSBDP0160.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBDP0160);
		}
		
		//対象区分
		String tt = getCndR().srch_tgt_typ();
		if (MSC_PURC_SRCH_TGT_TYP.isPURC_RET_SCHD_NO(tt)) {
			Cnd_srch_arr_act.setMode(MCMode.INVISIBLE);
			Cnd_srch_purc_act.setMode(MCMode.INVISIBLE);
			if(Cnd_ope_REF.isSelected() || Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()
					 || FIX_I.equals(getStatus())
					 || FIX_U.equals(getStatus())
					 || FIX_D.equals(getStatus())) {
				Cnd_srch_purc_ret_schd.setMode(MCMode.ENABLE);
			}
			else {
				Cnd_srch_purc_ret_schd.setMode(MCMode.DISABLE);
			}
		}
		else if (isNull(tt) || MSC_PURC_SRCH_TGT_TYP.isARR_ACT_NO(tt)) {
			Cnd_srch_purc_ret_schd.setMode(MCMode.INVISIBLE);
			Cnd_srch_purc_act.setMode(MCMode.INVISIBLE);
			if(isINSStatus(getStatus())
					 || FIX_I.equals(getStatus())
					 || FIX_U.equals(getStatus())
					 || FIX_D.equals(getStatus())) {
				Cnd_srch_arr_act.setMode(MCMode.ENABLE);
			}
			else {
				Cnd_srch_arr_act.setMode(MCMode.DISABLE);
			}			
		}
		else if (MSC_PURC_SRCH_TGT_TYP.isPURC_ACT_NO(tt) || 
				MSC_PURC_SRCH_TGT_TYP.isPURC_ACT_D_NO(tt)) {
			Cnd_srch_purc_ret_schd.setMode(MCMode.INVISIBLE);
			Cnd_srch_arr_act.setMode(MCMode.INVISIBLE);
			if(isINSStatus(getStatus())
					 || FIX_I.equals(getStatus())
					 || FIX_U.equals(getStatus())
					 || FIX_D.equals(getStatus())) {
				Cnd_srch_purc_act.setMode(MCMode.ENABLE);
			}
			else {
				Cnd_srch_purc_act.setMode(MCMode.DISABLE);
			}
		}
	}
	
	/**
	 * 詳細行の選択イベント
	 */
	@Override
	public void doDtl2_NC(MCEventInfo info) {
		super.doDtl2_NC(info);
		
		// ボタン・モード制御
		setBtnMode();
	}
	protected void setDefaultPurcTyp(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl1_purc_typ, idx, MAC_PURC_TYP.PURC_ITM.value());
	}

	/**
	 * 良品区分の初期値を設定します。
	 * @param dr 対象行
	 */
	protected void setDefaultQualityTyp(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl1_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
	}
	protected void setDefaultQualityTyp(Dtl2R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl2_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
	}
	/**
	 * 在庫識別区分の初期値を設定します。
	 * @param dr 対象行
	 */
	protected void setDefaultStkIdTyp(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl1_stk_id_typ, idx, MSC_STK_ID_TYP.COSTK.value());
	}
	protected void setDefaultStkIdTyp(Dtl2R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl2_stk_id_typ, idx, MSC_STK_ID_TYP.COSTK.value());
	}
	/**
	 * 購買識別区分の初期値を設定します。
	 * @param dr 対象行
	 */
	protected void setDefaultPurcIdTyp(Dtl1R dr) {
		String sit = dr.stk_id_typ();
		String pit = dr.purc_id_typ();
		if (isNull(pit)) {
			pit = MAC_PURC_ID_TYP.PURC.value();
		}
		
//		在庫識別区分で「無償受給」選択時
//		○「無償受給」固定。
		if (MSC_STK_ID_TYP.isNCV_RCV(sit)) {
			pit =  MAC_PURC_ID_TYP.FFR_RCV.value();
		}
//		在庫識別区分で「ＶＭＩ」選択時
//		○「ＶＭＩ」固定。
		else if (MSC_STK_ID_TYP.isRNT_RCV(sit)) {
			pit =  MAC_PURC_ID_TYP.VMI.value();
		}
		else if (!isMatchPurcIdTyp(dr, pit)) {
			pit = null;
		}
		
		setValueEx(columnDtl1_purc_id_typ, dr.getGUIIndex(), pit);
	}
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 * @param dr
	 */
	protected void setColByDscntItm(Dtl1R dr) {
		if (dr.dscnt_itm_flg()) {
			int idx = dr.getGUIIndex();
			setValueEx(columnDtl1_trd_unit_cd, idx, dr.base_unit_cd());
			setValueEx(columnDtl1_trd_unit_qty, idx, MCNumber.ONE);

			setValueEx(columnDtl1_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
			setValueEx(columnDtl1_stk_id_typ, idx, MSC_STK_ID_TYP.COSTK.value());
			setValueEx(columnDtl1_gd_cd, idx, getDefaultFeedStkGd().gd_cd());
			
		}
	}

	protected void setColByDscntItm(Dtl2R dtl2R, Dtl1R dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			int idx = dtl2R.getGUIIndex();
			setValueEx(columnDtl2_trd_unit_cd, idx, dtl2R.base_unit_cd());
			setValueEx(columnDtl2_trd_unit_qty, idx, MCNumber.ONE);

			setValueEx(columnDtl2_quality_typ, idx, MAC_QUALITY_TYP.GOOD.value());
			setValueEx(columnDtl2_stk_id_typ, idx, MSC_STK_ID_TYP.COSTK.value());
			setValueEx(columnDtl2_gd_cd, idx, getDefaultFeedStkGd().gd_cd());
		}
	}

	protected void doDtl2_itm_LC(MCEventInfo info){
		
		if (Dtl2_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			Dtl1R dr = Dtl1Table.getSelectedMCRow();
			int idx = info.getEventIndex();
			Dtl2R ir = getDtl2L().get(idx);
			if(isMng(dr)) {
				setDefaultQualityTyp(ir);
				setDefaultStkIdTyp(ir);
			}
			setColByDscntItm(ir, dr);
		}
	}
	
	protected void doDtl1_itm_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Dtl1R dr = getDtl1L().get(idx);
		setValueEx(columnDtl1_bp_lot_no, idx, null);
		setValueEx(columnDtl1_po_no, idx, null);
		setValueEx(columnDtl1_mfg_inst_no, idx, null);
		// 品目CD クリア時
		if (isNull(dr.itm_cd())) {
			
			// 詳細行が存在する場合、詳細行の品目CDをクリアする
			if (getDtl2L().size() != 0) {
				getDtl2L().forEach(d2r -> {
					if (!isNull(d2r.peg_no())) {
						setValueEx(columnDtl2_itm_cd, d2r.getGUIIndex(), null);
					}
				});
			}
			
			clearWhenItmNull(dr);
			setBtnMode();
			return;
		} 
		// 品目入力時
		else {
			if (!Dtl1_itm_p_PPanel.isItmFix(idx)) {
				return;
			}
		
			clearRsn(dr);
			clearVerNo(dr);
			clearRefNo(dr);
			
			insertNewDtl2(dr, getDtl2L());
			getDtl2L().forEach(d2r -> {
				if (!isNull(d2r.peg_no())) {
					copyItmInfo(dr, d2r);
				}
			});
		syncDtl1ToDtl2(columnDtl1_trd_unit_cd, 
				columnDtl2_trd_unit_cd, info.getEventIndex());
		}
		setDefaultPurcIdTyp(dr);
		setDefaultTaxCd(dr, true);
		setIvItmNm(dr);
		setSpplItm(dr);
		setDefaultPayCrryovrTimes(dr);
		setWtaxRate(dr);
		if(isMng(dr)) {
			setDefaultPurcTyp(dr);
			setDefaultStkIdTyp(dr);	
		}
		else {
			setValueEx(columnDtl1_gd_cd, idx, getDefaultFeedStkGd().gd_cd());
		}
		setDefaultQualityTyp(dr);
		setColByDscntItm(dr);

		setBtnMode();

	}

	protected void clearWhenItmNull(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		setValueEx(columnDtl1_purc_typ, idx, null);
		setValueEx(columnDtl1_tax_cd, idx, null);
		setValueEx(columnDtl1_quality_typ, idx, null);
		setValueEx(columnDtl1_stk_id_typ, idx, null);
		setValueEx(columnDtl1_purc_id_typ, idx, null);
		setValueEx(columnDtl1_gd_cd, idx, null);
		setValueEx(columnDtl1_pay_crryovr_times, idx, null);
		setValueEx(columnDtl1_purc_ret_rsn_cd, idx, null);
		setValueEx(columnDtl1_stk_arrv_bp_cd, idx, null);
		setValueEx(columnDtl1_sppl_itm_cd, idx, null);
		setValueEx(columnDtl1_sppl_itm_nm, idx, null);
		setValueEx(columnDtl1_iv_itm_nm, idx, null);
		clearVerNo(dr);
		clearRefNo(dr);
	}
	protected boolean insertNewDtl2(Dtl1R dr, MCList<Dtl2R> d2l) {
		setDtlPegNo(dr);
		
		// 詳細行が存在しない場合は、1行追加する
		if (d2l.size() == 0) {
			Dtl2R d2r = Dtl2R.create();
			d2r.setValuesByName(dr);
			d2r.dtl_peg_no(dr.peg_no());
			setIoPegNo(d2r);
			insertRowNoFocus(Dtl2Table, 0, d2r);
			
			return true;
		}
		return false;
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Dtl1_itm_p_PPanel.isItm(lc)) {
			doDtl1_itm_LC(info);
		}
		if (Dtl2_itm_p_PPanel.isItm(lc)) {
			doDtl2_itm_LC(info);
		}
		
		if (lc == columnDtl1_ptax_cur_tax_amt) {
			doDtl1_ptax_cur_tax_amt_LC(info);
		}
		
		if (lc == columnDtl1_base_cur_tax_amt) {
			doDtl1_base_cur_tax_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_upri){
			doDtl1_trd_cur_upri_LC(info);
		}
		if (lc == columnDtl1_trd_unit_qty) {
			doDtl1_trd_unit_qty_LC(info);
		}
		if (lc == columnDtl1_trd_cur_tax_amt) {
			doDtl1_trd_cur_tax_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_dscnt_amt) {
			doDtl1_trd_cur_dscnt_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_proc_upri) {
			doDtl1_trd_cur_proc_upri_LC(info);
		}
		if(lc == columnDtl1_trd_cur_onr_prov_upri) {
			doDtl1_trd_cur_onr_prov_upri_LC(info);
		}
		if (lc == columnDtl1_tax_cd) {
			doDtl1_tax_cd_LC(info);
		}
		if(lc == columnDtl1_trd_cur_amt){
			doDtl1_trd_cur_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_inc_tax_amt){
			doDtl1_trd_cur_inc_tax_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_proc_amt){
			doDtl1_trd_cur_proc_amt_LC(info);
		}
		if(lc == columnDtl1_trd_cur_onr_prov_amt){
			doDtl1_trd_cur_onr_prov_amt_LC(info);
		}
		if (lc == Hdr1_purc_dpt_cd) {
			doHdr1_purc_dpt_cd_LC(info);
		}
	}

	@Override
	public void doDtl1_purc_ret_loc_cd_LC(MCEventInfo info) {
		super.doDtl1_purc_ret_loc_cd_LC(info);
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if (isNull(dtlR.purc_ret_sppl_cd())) {
			setValueEx(columnDtl1_base_ac_dt, info.getEventIndex(), null);
		}
		else if (isNull(dtlR.base_ac_dt())) {
			setValueEx(columnDtl1_base_ac_dt, info.getEventIndex(), getToday());
		}
	}

	public void doDtl1_trd_cur_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		clearDscntAmt(dtlR);
		Hdr1R hdr1R = getHdr1R();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_upri(dtlR.trd_cur_upri());
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(hdr1R, dtlR);
			setPtaxCurAmt(hdr1R, dtlR);
		}
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(hdr1R, dtlR);
		}
	}
	/**
	 * 数量変更イベント
	 * @param info
	 */
	public void doDtl1_trd_unit_qty_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(getHdr1R(), dtlR);
		}
	}
	/**
	 * 税額変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_tax_amt_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		// 埋め込み画面側のイベント処理で、税額から先に値がセットされ、値引額側がエラーにならないので、税額にイベントを実装
		chkProcAmtMinus(dtlR);
		setDispAmt();
	}
	/**
	 * 取引通貨値引額変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if(isOutSrc(dtlR)) {
			if(dtlR.repurc_obli_flg()) {
				setRepurcObliTax(dtlR);
			}
			else {
				setOutsrcAmt(getHdr1R(), dtlR);
			}
		}
	}
	/**
	 * 取引通貨加工単価変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_proc_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		// 加工単価がnullの場合は値引額をクリアする
		if(isNull(dtlR.trd_cur_proc_upri())) {
			dtlR.trd_cur_dscnt_amt(null);
			setValueEx(columnDtl1_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
		}
		chkProcAmtMinus(dtlR);
		MCNumber onr_prov_upri = dtlR.trd_cur_onr_prov_upri();
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			onr_prov_upri = null;
		}
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), onr_prov_upri);
		setValueEx(columnDtl1_trd_cur_upri, info.getEventIndex(), upri);
	}
	/**
	 * 取引通貨有償支給単価変更イベント
	 * @param info
	 */
	public void doDtl1_trd_cur_onr_prov_upri_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		MCNumber upri = getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri());
		setValueEx(columnDtl1_trd_cur_upri, info.getEventIndex(), upri);
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
	protected void chkProcAmtMinus(Dtl1R dtlR) {
		if(!isOutSrc(dtlR) || isNull(dtlR.trd_cur_dscnt_amt())) {
			return;
		}
		MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
				dtlR.trd_unit_qty(),
				getHdr1R().trd_cur_amt_dec_place(),
				getHdr1R().purc_amt_rnd_typ(),
				dtlR.trd_cur_dscnt_amt());
		setValueEx(columnDtl1_trd_cur_proc_amt, dtlR.getGUIIndex(), procAmt);
	}
	/**
	 * 税CD変更イベント
	 * @param info
	 */
	public void doDtl1_tax_cd_LC(MCEventInfo info) {
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		clearDscntAmt(dtlR);
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmt(getHdr1R(), dtlR);
		}
	}
	/**
	 * 買戻義務有の場合に、税額・税込金額を再計算します
	 * @param dtlR
	 */
	protected void setRepurcObliTax(Dtl1R dtlR) {
		Hdr1R hdr = getHdr1R();
		if(isNull(hdr.trd_cur_cd()) || (isNull(dtlR.trd_cur_proc_upri()) && isNull(dtlR.trd_cur_onr_prov_upri()))) {
			return;
		}
		MCNumber amt = null;
		if (Dtl1Table.getEditingColumnConfig() == columnDtl1_trd_cur_proc_amt
				|| Dtl1Table.getEditingColumnConfig() == columnDtl1_trd_cur_onr_prov_amt) {
			amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		}
		else {
			// 金額 = (単価:加工単価 + 有償支給単価)×数量
			amt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_upri(),
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
	protected void setOutsrcAmt(Hdr1R hdrR, Dtl1R dtlR) {
		if(!isOutSrc(dtlR)) {
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
	protected void setBaseCurAmt(Hdr1R hdrR, Dtl1R dtlR) {
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
	protected void setPtaxCurAmt(Hdr1R hdrR, Dtl1R dtlR) {
		dtlR.ptax_cur_onr_prov_upri(convCur(dtlR.trd_cur_onr_prov_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_upri(convCur(dtlR.trd_cur_proc_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_upri(convCur(dtlR.trd_cur_upri(), hdrR.ptax_xrate(), hdrR.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_amt(convCur(dtlR.trd_cur_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_tax_amt(convCur(dtlR.trd_cur_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtlR.ptax_cur_inc_tax_amt(convCur(dtlR.trd_cur_inc_tax_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
	}

	public void doDtl1_trd_cur_amt_LC(MCEventInfo info) {
		setDispAmt();
		Hdr1R hdr = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if(MAC_OUTSRC_UPRI_TYP.isPROC(dtlR.outsrc_upri_typ())) {
			dtlR.trd_cur_proc_amt(dtlR.trd_cur_amt());
			setBaseCurAmt(hdr, dtlR);
			setPtaxCurAmt(hdr, dtlR);
		}
	}

	public void doDtl1_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setDispAmt();
	}

	/**
	 * 取引通貨加工金額変更イベント
	 * @param info
	 */
	protected void doDtl1_trd_cur_proc_amt_LC(MCEventInfo info) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_proc_amt) {
			return;
		}
		Hdr1R hdr = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		clearDscntAmt(dtlR);
		if (isNull(dtlR.trd_cur_proc_upri())
				|| (!isNull(dtlR.trd_cur_proc_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl1_trd_cur_proc_upri))) {
			MCNumber trdCurProcAmt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().add(nvl(dtlR.trd_cur_dscnt_amt(), MCNumber.ZERO)) : null;
			MCNumber trdCurProcUpri = MAUCP_AmtUtil.getUpri(trdCurProcAmt, dtlR.trd_unit_qty(), hdr.trd_cur_upri_dec_place());
			dtlR.trd_cur_proc_upri(trdCurProcUpri);
			setOutsrcUpriAndAmt(hdr, dtlR);
		}
	}
	/**
	 * 取引通貨有償支給金額変更イベント
	 * @param info
	 */
	protected void doDtl1_trd_cur_onr_prov_amt_LC(MCEventInfo info) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_onr_prov_amt) {
			return;
		}
		Hdr1R hdr = getHdr1R();
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		if (isNull(dtlR.trd_cur_onr_prov_upri())
				|| (!isNull(dtlR.trd_cur_onr_prov_upri()) && !isNull(info.getOldValue()) && !(info.getOldColumn() == columnDtl1_trd_cur_onr_prov_upri))) {
			MCNumber trdCurOnrProvUpri = MAUCP_AmtUtil.getUpri(dtlR.trd_cur_onr_prov_amt(), dtlR.trd_unit_qty(), hdr.trd_cur_upri_dec_place());
			dtlR.trd_cur_onr_prov_upri(trdCurOnrProvUpri);
			setOutsrcUpriAndAmt(hdr, dtlR);
		}
	}
	protected void setOutsrcUpriAndAmt(Hdr1R hdr, Dtl1R dtlR) {
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_proc_amt
				&& Dtl1Table.getEditingColumnConfig() != columnDtl1_trd_cur_onr_prov_amt) {
			return;
		}
		
		dtlR.trd_cur_upri(getOutsrcUpri(dtlR.trd_cur_proc_upri(), dtlR.trd_cur_onr_prov_upri()));
		
		if(dtlR.repurc_obli_flg()) {
			setRepurcObliTax(dtlR);
		}
		else {
			setOutsrcAmtAndTax(hdr, dtlR);
		}
		clearDscntAmt(dtlR);
	}
	protected void setOutsrcAmtAndTax(Hdr1R hdr, Dtl1R dtlR) {
		MCNumber amt = getOutsrcAmt(dtlR.trd_cur_proc_amt(), dtlR.trd_cur_onr_prov_amt());
		MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(amt, dtlR.tax_rate(), hdr.trd_cur_amt_dec_place(), hdr.purc_tax_rnd_typ(), dtlR.inc_tax_flg());
		if(dtlR.inc_tax_flg()) {
			amt = !isNull(amt) ? amt.subtract(tax_amt) : null;
		}
		MCNumber inc_tax_amt = !isNull(amt) ? amt.add(tax_amt) : null;
		dtlR.trd_cur_amt(amt);
		dtlR.trd_cur_tax_amt(tax_amt);
		dtlR.trd_cur_inc_tax_amt(inc_tax_amt);
		setBaseCurAmt(hdr, dtlR);
		setPtaxCurAmt(hdr, dtlR);
	}
	protected MCNumber getOutsrcAmt(MCNumber trdCurProcAmt, MCNumber trdCurOnrProvAmt) {
		if(isNull(trdCurProcAmt) && isNull(trdCurOnrProvAmt)) {
			return null;
		}
		return nvl(trdCurProcAmt, MCNumber.ZERO).add(nvl(trdCurOnrProvAmt, MCNumber.ZERO));
	}
	
	protected void clearDscntAmt(Dtl1R dtlR) {
		if (isNull(dtlR.trd_cur_upri()) || dtlR.trd_cur_upri().isZero()) {
			columnDtl1_trd_cur_dscnt_amt.setValue(dtlR.getGUIIndex(), null);
		}
	}
	
	@Override
	public void doDtl1_mfg_inst_no_NC(MCEventInfo info) {
		super.doDtl1_mfg_inst_no_NC(info);
		int i = info.getEventIndex();
		Dtl1R dr = getDtl1L().get(i);
		if (!canOutSrcPurcUpriChange(dr)){
		
			setValueEx(columnDtl1_trd_cur_proc_upri, i, null);
			setValueEx(columnDtl1_trd_cur_onr_prov_upri, i, null);
		}
	}
	
	protected void doDtl1_ptax_cur_tax_amt_LC(MCEventInfo info) {
		
		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_ptax_cur_tax_amt) {
			return;
		}
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		Hdr1R hdrR = getHdr1R();
		
		if (isNull(dtlR.ptax_cur_amt())
				|| isNull(dtlR.ptax_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.ptax_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(基準通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を基準通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.ptax_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.ptax_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt().divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			if(isOutSrc(dtlR)) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_onr_prov_amt(convCur(dtlR.trd_cur_onr_prov_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.ptax_cur_proc_amt(convCur(dtlR.trd_cur_proc_amt(), hdrR.ptax_xrate(), hdrR.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.ptax_cur_amt().add(taxAmt);
			dtlR.ptax_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt().divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
		setDispAmt();
	}
	
	protected void doDtl1_base_cur_tax_amt_LC(MCEventInfo info) {

		if (Dtl1Table.getEditingColumnConfig() != columnDtl1_base_cur_tax_amt) {
			return;
		}
		
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		Hdr1R hdrR = getHdr1R();
		
		if (isNull(dtlR.base_cur_amt())
				|| isNull(dtlR.base_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.base_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(基準通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を基準通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.base_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.base_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.base_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.base_cur_amt().divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			if(isOutSrc(dtlR)) {
				if(dtlR.repurc_obli_flg()) {
					MCNumber procAmt = MAUCP_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					MCNumber incTaxAmt = !isNull(dtlR.trd_cur_amt()) ? dtlR.trd_cur_amt().add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null;
					dtlR.trd_cur_proc_amt(!isNull(procAmt) ? procAmt.subtract(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)) : null);
					dtlR.trd_cur_onr_prov_amt(!isNull(incTaxAmt) ? incTaxAmt.subtract(nvl(procAmt, MCNumber.ZERO)) : null);
				}
				else {
					MCList<MCRow> retL = calcPropOutSrcUpri(dtlR.trd_cur_amt(), hdrR.trd_cur_amt_dec_place(),
							dtlR.trd_cur_onr_prov_upri(), dtlR.trd_cur_proc_upri(), dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_onr_prov_amt(retL.getNumberNE(0, "amt"));
					dtlR.trd_cur_proc_amt(retL.getNumberNE(1, "amt"));
				}
				dtlR.base_cur_onr_prov_amt(convToBaseCur(dtlR.trd_cur_onr_prov_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_proc_amt(convToBaseCur(dtlR.trd_cur_proc_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			}
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.base_cur_amt().add(taxAmt);
			dtlR.base_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt().divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
		}
		
		setDispAmt();
	}
	
	@Override
	public void doDtl1_purc_ret_loc_cd_NC(MCEventInfo info) {
		super.doDtl1_purc_ret_loc_cd_NC(info);
		int i = info.getEventIndex();
		Dtl1R dr = getDtl1L().get(i);
		
		syncDtl1ToDtl2(columnDtl1_purc_ret_loc_cd, 
				columnDtl2_purc_ret_loc_cd, info.getEventIndex());

		if (isNull(dr.purc_ret_loc_cd())) {
			setValueEx(columnDtl1_stk_arrv_bp_cd, i, null);
		}
		setBtnMode();
	}
	
	@Override
	public void doDtl1_purc_ret_loc_wg_cd_NC(MCEventInfo info) {
		super.doDtl1_purc_ret_loc_wg_cd_NC(info);
		int i = info.getEventIndex();

		setValueEx(columnDtl1_maker_cd, i, null);
		setBtnMode();
	}
	
	@Override
	public void doDtl2_purc_ret_loc_cd_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl2_purc_ret_loc_cd_NC(info);
		int i = info.getEventIndex();

		Dtl2R dr = getDtl2L().get(i);
		if (isNull(dr.purc_ret_loc_cd())) {
			setValueEx(columnDtl2_stk_arrv_bp_cd, i, null);
		}
		setBtnMode();
	}
	

	@Override
	public void doDtl1_stk_arrv_bp_cd_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_stk_arrv_bp_cd, 
				columnDtl2_stk_arrv_bp_cd, info.getEventIndex());	
	}
	
	@Override
	public void doDtl1_trd_unit_cd_NC(MCEventInfo info) {
		if (canChngTrdUnit(info.getEventIndex())) {
			syncDtl1ToDtl2(columnDtl1_trd_unit_cd, 
					columnDtl2_trd_unit_cd, info.getEventIndex());
		}
		Dtl1R dtl1R = getDtl1L().get(info.getEventIndex());
		columnDtl1_trd_cur_dscnt_amt.setValue(dtl1R.getGUIIndex(), null);
	};
	protected boolean canChngTrdUnit(int dtl1EventIdx) {
		// 詳細行が１行かつ明細行と詳細行の品目ＣＤ、枝番１～３のいずれかが不一致の場合、取引単位の変更は不可
		// ※不一致の場合（品目変更時）は品目のLCイベントで単位が設定される
		MCList<Dtl2R> d2l = getDtl2L();
		Dtl1R d1r = getDtl1L().get(dtl1EventIdx);
		if (d2l.size() == 1) {
			Dtl2R d2r = d2l.get(0);
			if (!isSame(d1r.itm_cd(), d2r.itm_cd())
					|| !isSame(d1r.itm_sub1(), d2r.itm_sub1())
					|| !isSame(d1r.itm_sub2(), d2r.itm_sub2())
					|| !isSame(d1r.itm_sub3(), d2r.itm_sub3())) {
				return false;
			}
		}
		return true;
	}
	
	protected void doDtl1_trd_unit_qty_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_trd_unit_qty, 
				columnDtl2_trd_unit_qty, info.getEventIndex());
	};
	
	@Override 
	public void doDtl1_quality_typ_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_quality_typ, 
				columnDtl2_quality_typ, info.getEventIndex());
	};
	
	@Override 
	public void doDtl1_stk_id_typ_NC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Dtl1R dr = getDtl1L().get(idx);
		String newv = (String) info.getNewValue();

		// 金額関連項目クリア
		if (!MSC_STK_ID_TYP.isCOSTK(newv) && !MSC_STK_ID_TYP.isONR_PROV(newv)) {
			clearNonPurcColumn(idx);
		}
		setDefaultPurcIdTyp(dr);

		if (MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ())) {
			setValueEx(columnDtl1_stk_arrv_bp_cd, idx, dr.purc_ret_sppl_cd());
		}
		else if (MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ())) {
			// 外注場所以外の場所が選択されている場合、在庫着荷先をクリアする
			if (isNull(dr.purc_ret_sppl_cd())) {
				setValueEx(columnDtl1_stk_arrv_bp_cd, idx, null);
			}
		}
		
		syncDtl1ToDtl2(columnDtl1_stk_id_typ, 
				columnDtl2_stk_id_typ, idx);
	};

	@Override
	public void doDtl2_stk_id_typ_NC(MCEventInfo info) {
		super.doDtl2_stk_id_typ_NC(info);
		
		int idx = info.getEventIndex();
		Dtl2R dr = getDtl2L().get(idx);		
		
		if (MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ())) {
			setValueEx(columnDtl2_stk_arrv_bp_cd, idx, dr.purc_ret_sppl_cd());
		}
		else if (MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ())) {
			// 外注場所以外の場所が選択されている場合、在庫着荷先をクリアする
			if (isNull(dr.purc_ret_sppl_cd())) {
				setValueEx(columnDtl2_stk_arrv_bp_cd, idx, null);
			}
		}
	}
	protected void clearNonPurcColumn(int eidx) {
		setValueEx(columnDtl1_pay_crryovr_times, eidx, null);
		setValueEx(columnDtl1_upri_not_tgt_flg, eidx, false);
		setValueEx(columnDtl1_trd_cur_proc_upri, eidx, null);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, eidx, null);
		setValueEx(columnDtl1_trd_cur_upri, eidx, null);
		setValueEx(columnDtl1_trd_cur_dscnt_amt, eidx, null);
		setValueEx(columnDtl1_dscnt_rsn_cd, eidx, null);
		setValueEx(columnDtl1_ap_dpt_cd, eidx, null);
		setValueEx(columnDtl1_tax_cd, eidx, null);
		setValueEx(columnDtl1_tax_fix_flg, eidx, false);
		setValueEx(columnDtl1_wtax_rate, eidx, null);
		setValueEx(columnDtl1_interim_flg, eidx, false);
	}
	
	@Override 
	public void doDtl1_gd_cd_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_gd_cd, 
				columnDtl2_gd_cd, info.getEventIndex());
	};
	protected void doDtl1_str_ln_cd_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_str_ln_cd, 
				columnDtl2_str_ln_cd, info.getEventIndex());
	};
	protected void doDtl1_str_ln_cd_none_flg_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_str_ln_cd_none_flg, 
				columnDtl2_str_ln_cd_none_flg, info.getEventIndex());
	};
	protected void doDtl1_crt_lot_flg_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_crt_lot_flg, 
				columnDtl2_crt_lot_flg, info.getEventIndex());
	};
	protected void doDtl1_lot_no_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_lot_no, 
				columnDtl2_lot_no, info.getEventIndex());
	};
	protected void doDtl1_sublot_no_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_sublot_no, 
				columnDtl2_sublot_no, info.getEventIndex());
	};

	@Override
	public void doDtl1_bp_lot_no_NC(MCEventInfo info) {
		super.doDtl1_bp_lot_no_NC(info);
		syncDtl1ToDtl2(columnDtl1_bp_lot_no, 
				columnDtl2_bp_lot_no, info.getEventIndex());
	};
	protected void doDtl1_sno1_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_sno1, 
				columnDtl2_sno1, info.getEventIndex());
	};
	protected void doDtl1_sno2_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_sno2, 
				columnDtl2_sno2, info.getEventIndex());
	};
	protected void doDtl1_sno3_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_sno3, 
				columnDtl2_sno3, info.getEventIndex());
	};
	protected void doDtl1_sno4_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_sno4, 
				columnDtl2_sno4, info.getEventIndex());
	};

	protected void doDtl1_purc_cont_qty_NC(MCEventInfo info) {
		syncDtl1ToDtl2(columnDtl1_purc_cont_qty, 
				columnDtl2_purc_cont_qty, info.getEventIndex());
	};
	

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if(nc == columnDtl1_str_ln_cd){
			doDtl1_str_ln_cd_NC(info);
		}
		else if(nc == columnDtl1_trd_unit_qty){
			doDtl1_trd_unit_qty_NC(info);
		}
		else if(nc == columnDtl1_str_ln_cd_none_flg){
			doDtl1_str_ln_cd_none_flg_NC(info);
		}
		else if (nc == columnDtl1_stk_arrv_bp_cd) {
			doDtl1_stk_arrv_bp_cd_NC(info);
		}
		else if(nc == columnDtl1_crt_lot_flg){
			doDtl1_crt_lot_flg_NC(info);
		}
		else if(nc == columnDtl1_lot_no){
			doDtl1_lot_no_NC(info);
		}
		else if(nc == columnDtl1_sublot_no){
			doDtl1_sublot_no_NC(info);
		}
		else if(nc == columnDtl1_sno1){
			doDtl1_sno1_NC(info);
		}
		else if(nc == columnDtl1_sno2){
			doDtl1_sno2_NC(info);
		}
		else if(nc == columnDtl1_sno3){
			doDtl1_sno3_NC(info);
		}
		else if(nc == columnDtl1_sno4){
			doDtl1_sno4_NC(info);
		}

		if (nc == columnDtl1_purc_cont_qty) {
			doDtl1_purc_cont_qty_NC(info);
		}
	}
	
	/**
	 * 明細行の品目情報を、詳細行にコピーする
	 * @param dr コピー元明細行
	 * @param d2r コピー先詳細行
	 */
	protected void copyItmInfo(Dtl1R dr, Dtl2R d2r) {
		
		if (!Dtl1_itm_p_PPanel.isItmFixLight(dr.getGUIIndex())) {
			return;
		}
		
		d2r.itm_cd(dr.itm_cd());
		d2r.itm_sub1(dr.itm_sub1());
		d2r.itm_sub2(dr.itm_sub2());
		
		// 品目リストロジックのイベントを発生させて、在庫管理区分など画面制御に必要な項目を設定する
		int i2 = d2r.getGUIIndex();
		setValueEx(columnDtl2_itm_sub3, i2, null);
		setValueEx(columnDtl2_itm_sub3, i2, dr.itm_sub3());

	}
	
	protected void copyPurcRetLocInfo(Dtl1R dr, Dtl2R d2r) {
		if (isNull(d2r.purc_ret_loc_cd())){
			setValueEx(columnDtl2_purc_ret_loc_cd, d2r.getGUIIndex(), dr.purc_ret_loc_cd());		
		}
		
	}
	/**
	 * リストから最大値+1を取得する
	 * @param dtl 対象のMCList
	 * @param noName 対象のカラム名
	 * @return 最大値+1
	 */
	protected MCNumber getNextNo(MCList<?> dtl, String noName) {
		
		// Listが空、もしくはNullなら1を固定で返す
		if (isNull(dtl) || dtl.size() == 0) {
			return MCNumber.valueOf(1);
		}
		
		// List内の指定カラムの最大値が取れない場合も1を固定で返す
		MCNumber nextNo = (MCNumber)dtl.max(noName);
		if (isNull(nextNo)) {
			return MCNumber.valueOf(0);
		}
		
		// 最大値が取れたら、1を加算して返す
		return nextNo.add(1);
		
	}
	
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdr1R());
		ret.add(getDtl1L());
		ret.add(getDtl2L());
		
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	/**
	 * 種別を「登録」に変更した時に実行されるFillSpaceのイベント
	 */
	@Override
	protected void opePanelFillSpace() {
		// 登録枠でも詳細枠はFillSpaceしない
		for (MCTable<?> tbl : opePanelFillSpaceTables()) {
			if (tbl != Dtl2Table) {
				tbl.fillSpace();
			}
		}
		
		// 紐付NO初期化
		initMaxPegNo();
		
	}

	// IfRowMoveBaseの実装
	@Override
	public MCTable<?> getRowMoveTable() {
		return Dtl1Table;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	protected void jbInit() {
		super.jbInit();
		Dtl2Btn_Btn_open_MSBEP0500_PPanel
			.StkInfo_open_MSBEP0500.setFunctionKey(MCFunctionKey.F3);
	}
	
	/**
	 * 画面起動時の初期値設定
	 */
	@Override
	protected void valueInit() {
		super.valueInit();

		setInitValue();
	}
	
	protected void setDate() {
		MCDate t =  getToday();
		setValueEx(Hdr1_reg_dt, t);
		setValueEx(Hdr1_schd_dt, t);
	}
	/**
	 * 明細行の明細紐付NOを設定する<br>
	 * @param list 明細行リスト
	 */
	protected void setDtlPegNo(MCList<Dtl1R> list) {
		for (Dtl1R row : list) {
			setDtlPegNo(row);
		}
	}
	
	/**
	 * 明細行の明細紐付NOを設定する<br>
	 * @param row 明細行
	 */
	protected void setDtlPegNo(Dtl1R row) {
		if (isNull(row.peg_no())) {
			row.peg_no(++_maxDtlPegNo);
		}
	}
	
	/**
	 * 詳細行の受払紐付NOを設定する<br>
	 * @param list 詳細行リスト
	 */
	protected void setIoPegNo(MCList<Dtl2R> list) {
		for (Dtl2R row : list) {
			setIoPegNo(row);
		}
	}
	
	/**
	 * 詳細行の受払紐付NOを設定する<br>
	 * @param row 詳細行
	 */
	protected void setIoPegNo(Dtl2R row) {
		row.peg_no(++_maxIoPegNo);

		MCList<Dtl2R> l = _dtl2L.get(row.dtl_peg_no());
		if (l == null) {
			MCList<Dtl2R> nl = MCList.create(Dtl2R.class);
			nl.add(row);
			_dtl2L.put(row.dtl_peg_no(), nl);
		}
		else {
			if (!l.contains(row)) {
				l.add(row);
			}
		}
		
	}

	/**
	 * 対象カラムの最大値を取得する
	 * @param list 対象リスト
	 * @param colNm 対象カラム
	 * @return 最大値
	 */
	protected int getMaxValue(MCList<?> list, String colNm) {
		Comparable<?> maxNo = list.max(colNm);
		return ((MCNumber)maxNo).intValue();
	}
	/**
	 * 明細紐付NO・受払紐付NOの最大値を初期化
	 */
	protected void initMaxPegNo() {
		
		// 明細枠に値のある行が存在する場合は、1に初期化するのではなく、明細行の最大値+1に初期化する
		MCList<Dtl1R> NoEmptyDtl1L = MCList.create(Dtl1R.class);
		MCList<Dtl2R> NoEmptyDtl2L = MCList.create(Dtl2R.class);
		for (Dtl1R dtlRow : getDtl1L()) {
			if (!dtlRow.isEmpty()) {
				NoEmptyDtl1L.add(dtlRow);
				NoEmptyDtl2L.addAll(_dtl2L.get(dtlRow.peg_no()));
			}
		}

		if (NoEmptyDtl1L.size() > 0) {
			_maxDtlPegNo = getMaxValue(NoEmptyDtl1L, Dtl1R.$peg_no) + 1;
			_maxIoPegNo = getMaxValue(NoEmptyDtl2L, Dtl2R.$peg_no) + 1;
		}
		else {
			_maxDtlPegNo = 1;
			_maxIoPegNo = 1;
		}
		
	}
	
	@Override
	public void doHdr1_sppl_iv_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr1_sppl_iv_flg_NC(info);
		setHdrPanelMode();
		setHdrPanelValue();
	}
	
	protected void setHdrPanelValue() {
		if (!getHdr1R().sppl_iv_flg()) {
			setValueEx(Hdr1_rcpt_iv_no, null);
			setValueEx(Hdr1_ref_rcpt_iv_no, null);
		}
	}
	@Override
	protected void setOpeStatus(String bfOpe, String afOpe,
			String bfSt) {	
		super.setOpeStatus(bfOpe, afOpe, bfSt);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setSrchTgtTyp();
		
		// 検索枠の先頭項目にフォーカスセット
		CndPanel.focusFirstComponent();
		
		// ボタン・モード制御
		setBtnMode();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		Hdr1Panel.focusFirstComponent();

		setInitValue();
		setHdrPanelMode();
		setHdrPanelValue();
		setBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		Dtl1Table.selectLeftmostColumn(0);
		setHdrPanelMode();
		setHdrPanelValue();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setHdrPanelMode();
		setHdrPanelValue();
		
		for (Dtl1R dr : getDtl1L()) {
			if (hasAct(dr)) {
				for (MCModeBeans m : MCBeansUtil.getAllComponents(MCModeBeans.class,
						Hdr1Panel)) {
					if (isEditableMode(m) &&
							Hdr1_intr_rmrks != m && 
							Hdr1_sub_char1 != m && 
							Hdr1_sub_char2 != m && 
							Hdr1_sub_char3 != m && m instanceof MCRowBeans) {
						m.setMode(MCMode.READ_ONLY);
					}
				}
				break;
			}
		}
		
		Dtl1Table.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setHdrPanelMode();
		setHdrPanelValue();
		Dtl1Table.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();

		setBtnMode();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();

		setBtnMode();
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 選択種別・NCイベント
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		setBtnMode();
		initMaxPegNo();
	}
	
	/**
	 * 検索条件のクリア
	 */
	protected void clearCnd() {
		
	}
	
	// 各種NC、LCイ、VCベントの実装です。
	// 入力・表示制御の設計にあわせて実装します。
	// 単票の種別変更時のイベントはdoOpeChngNC実装します。
	// また、取引CD変更時は明細をクリアするため、クリア確認を実装します
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		setSrchTgtTyp();

		// 参照登録時、実績日や業務実施日に当たるようような日付は初期設定する。
		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			setRefToInsInit();
		}
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			//詳細のステータスを変更
			_dtl2L.values().forEach(l2 -> l2.forEach(r2 -> r2.setStatus(MCRow.CREATE)));
		}
		setBtnMode();
		
	}
	@Override
	protected List<String> getNotInheritCols(String type,
			MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);
		if (cont == getHdr1R()) {
			l.add(Hdr1R.$purc_ret_schd_no);
			l.add(Hdr1R.$schd_dt);
			l.add(Hdr1R.$reg_dt);
		}
		else if (cont == getDtl1L()) {
			l.add(Dtl1R.$bef_abort_flg);
			l.add(Dtl1R.$abort_flg);
			l.add(Dtl1R.$purc_ret_schd_d_no);
			l.add(Dtl1R.$ret_qty);
			l.add(Dtl1R.$ref_arr_act_no);
			l.add(Dtl1R.$ref_arr_act_rev);
			l.add(Dtl1R.$ref_purc_act_d_no);
			l.add(Dtl1R.$ref_purc_act_d_seq);
			l.add(Dtl1R.$ref_purc_act_no);
			l.add(Dtl1R.$ref_purc_act_rev);
			l.add(Dtl1R.$ref_purc_act_seq);
			l.add(Dtl1R.$disp_seq);
		}
		else if (cont == getDtl2L()) {
			l.addAll(getNotInheritDtl2Cols());
		}
		return l;
	}

	protected List<String> getNotInheritDtl2Cols() {
		List<String> l = new ArrayList<String>();
		l.add(Dtl2R.$purc_ret_schd_io_no);
		l.add(Dtl2R.$io_schd_pr_no);
		l.add(Dtl2R.$ref_arr_act_no);
		l.add(Dtl2R.$ref_arr_act_rev);
		l.add(Dtl2R.$ref_purc_act_io_no);
		l.add(Dtl2R.$ref_purc_act_io_seq);
		
		return l;
	}
	
	
	protected void setRefToInsInit() {
		setInitValue();
	}

	/**
	 * 検索対象区分を設定する
	 */
	protected void setSrchTgtTyp() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() ||
				(Cnd_ope_REF.isSelected() && SRCH.equals(getStatus()))) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.name());
		}
		else if (isINSStatus(getStatus())){
			if (MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.value().equals(getCndR().srch_tgt_typ())) {
				setValueEx(Cnd_srch_tgt_typ_nm, null);
			}
		}
	}
	
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispSrchTgtTyp());		
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}
	
	public MSC_PURC_SRCH_TGT_TYP[] getDispSrchTgtTyp() {
		
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.ARR_ACT_NO,
					MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO,
					MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO
			};
			
		}
		else {
			return new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO
			};
		}

	}
	
	/**
	 * 検索対象区分・NCイベント
	 */
	@Override
	public void doCnd_srch_tgt_typ_NC(MCEventInfo info) {
		super.doCnd_srch_tgt_typ_NC(info);
		setBtnMode();
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		
		if (table == Dtl1Table) {
			Dtl1R dr = (Dtl1R)row;
			dr.peg_no(null);
			setDtlPegNo(dr);
		}
		
		return super.copyRowSub(table, row);
	}
	
	@Override
	public void doHdr1_sppl_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr1_sppl_cd_LC(info);

		getDtl1L().forEach(dr ->clearRefNo(dr));
		copySpplToRet();
		setDefaultTaxCd(true);
		setBtnMode();
		for (Dtl1R r : getDtl1L()) {
			if (!r.isEmpty()) {
				if (r.abort_flg()) {
					continue;
				}
				setIvItmNm(r);
				setDefaultPayCrryovrTimes(r);
				setSpplItm(r);
				setDtlOutsrcColumnByHdr(r);
				setDispAmt();
			}
		}
		String purcDptCd = getHdr1R().purc_dpt_cd();
		setValueEx(Hdr1_purc_usr_cd, null);
		setValueEx(Hdr1_purc_dpt_cd, null);
		if (!isNull(getHdr1R().def_purc_usr_cd())) {
			setValueEx(Hdr1_purc_usr_cd, getHdr1R().def_purc_usr_cd());
		}
		else if (!isNull(getHdr1R().def_purc_dpt_cd())) {
			setValueEx(Hdr1_purc_dpt_cd, getHdr1R().def_purc_dpt_cd());
		}
		if (isNull(Hdr1_sppl_cd.getValue())) {
			// 発注先クリア時
			getHdr1R().ap_dpt_cd(null);
		}
		else {
			if (!isNull(getHdr1R().mst_ap_dpt_cd())) {
				getHdr1R().ap_dpt_cd(getHdr1R().mst_ap_dpt_cd());
			}
			else if (isNullAnd(purcDptCd, getHdr1R().purc_dpt_cd())) {
				getHdr1R().ap_dpt_cd(null);
			}
		}
		
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			setDefaultApDptCd(r);
		}
		setDispAmt();
	}
	public void doHdr1_purc_dpt_cd_LC(MCEventInfo info) {
		String apDptCd = getHdr1R().ap_dpt_cd();
		setApDptCd();
		
		if (!isSame(apDptCd, getHdr1R().ap_dpt_cd())) {
			for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
				setDefaultApDptCd(r);
			}
		}
	}
	protected void setApDptCd() {
		if (isNull(getHdr1R().mst_ap_dpt_cd())) {
			if (isNull(getHdr1R().purc_dpt_cd())) {
				getHdr1R().ap_dpt_cd(null);
			}
			else {
				 if (getHdr1R().ap_dpt_flg()) {
					getHdr1R().ap_dpt_cd(getHdr1R().purc_dpt_cd());
				}
				else {
					getHdr1R().ap_dpt_cd(null);
				}	
			}
		}
	}
	/**
	 * ヘッダの外注に係る項目を明細に設定する。
	 */
	protected void setDtlOutsrcColumnByHdr(Dtl1R r) {
		Hdr1R hdrR = getHdr1R();
		if(isOutSrc(r)) {
			r.repurc_obli_flg(hdrR.repurc_obli_flg());
			r.outsrc_upri_typ(hdrR.outsrc_upri_typ());
			if(r.repurc_obli_flg()) {
				setRepurcObliTax(r);
			}
		}
		else {
			r.repurc_obli_flg(false);
			r.outsrc_upri_typ(null);
		}
	}
	@Override
	public void doHdr1_reg_dt_LC(MCEventInfo info) {
		super.doHdr1_reg_dt_LC(info);
		setDefaultTaxCd(false);
		setWtaxRate();		
		for (Dtl1R dtlR : exceptDeleteAndEmpty(getDtl1L())) {
			if (!dtlR.abort_flg() && !dtlR.bef_abort_flg() && isNullAnd(dtlR.ref_arr_act_no(), dtlR.ref_purc_act_no(), dtlR.ref_purc_act_d_no())) {
				setSpplItm(dtlR);
			}
		}
	}

	/**
	 * 発注先情報を返品先にコピーします。
	 */
	protected void copySpplToRet() {
		setValueEx(Hdr1_ret_sppl_nm, Hdr1_sppl_nm.getRowValue());
		setValueEx(Hdr1_ret_sppl_zip_cd, Hdr1_sppl_zip_cd.getRowValue());
		setValueEx(Hdr1_ret_sppl_addr1, Hdr1_sppl_addr1.getRowValue());
		setValueEx(Hdr1_ret_sppl_addr2, Hdr1_sppl_addr2.getRowValue());
		setValueEx(Hdr1_ret_sppl_addr3, Hdr1_sppl_addr3.getRowValue());
		setValueEx(Hdr1_ret_sppl_addr4, Hdr1_sppl_addr4.getRowValue());
		setValueEx(Hdr1_ret_sppl_cntct_dpt, Hdr1_sppl_cntct_dpt.getRowValue());
		setValueEx(Hdr1_ret_sppl_cntct_psn, Hdr1_sppl_cntct_psn.getRowValue());
		setValueEx(Hdr1_ret_sppl_tel, Hdr1_sppl_tel.getRowValue());
		setValueEx(Hdr1_ret_sppl_fax, Hdr1_sppl_fax.getRowValue());
	}
	/**
	 * 部品設定
	 */
	@Override
	protected void setupParts() {
		super.setupParts();

		// 登録枠
		
		Hdr1_sppl_addr_p_PPanel.setRelateBeans(Hdr1_sppl_cd, Hdr1_sppl_nm);
		Hdr1_ret_sppl_addr_p_PPanel.setRelateBeans(Hdr1_ret_sppl_nm);
		
		// 為替レート
		Hdr1_xrate_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_base_cur_cd, Hdr1_xrate_cd, Hdr1_reg_dt, true, Hdr1_xrate_inpt_flg);
		// 納税為替レート
		Hdr1_prax_xrate_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_ptax_cur_cd, Hdr1_xrate_cd, Hdr1_reg_dt, true, Hdr1_ptax_xrate_inpt_flg);

		Hdr1_purc_usr_dpt_p_PPanel.setRelateBeans(Hdr1_reg_dt);
		Hdr1_trd_cur_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place);
		Hdr1_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place);
		
		// 明細枠
		Dtl1_itm_p_PPanel.setRelateBeans(columnDtl1_sundry_itm_flg, columnDtl1_stk_mng_typ);
		Dtl1_str_ln_p_PPanel.setRelateBeans(columnDtl1_purc_ret_loc_cd, columnDtl1_str_ln_tgt_flg);
		Dtl1_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, 
				columnDtl1_sno1_mng_typ, columnDtl1_sno2_mng_typ, columnDtl1_sno3_mng_typ, columnDtl1_sno4_mng_typ);
		Dtl1_lot_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1,
				columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_lot_mng_typ,
				columnDtl1_sublot_mng_typ);
		Dtl1_trd_unit_qty_p_PPanel.setRelateBeans(Dtl1_itm_p_PPanel.columnItm_itm_cd, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub1, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub2, 
				Dtl1_itm_p_PPanel.columnItm_itm_sub3,
				columnDtl1_trd_unit_cd, columnDtl1_trd_unit_dec_place,
				columnDtl1_trd_unit_rnd_typ, 
				columnDtl1_trd_unit_dmn_qty, columnDtl1_trd_unit_conv_qty, 
				columnDtl1_base_unit_cd);
		Dtl1_base_unit_qty_p_PPanel.setRelateBeans(
				columnDtl1_base_unit_cd, columnDtl1_base_unit_dec_place, columnDtl1_base_unit_rnd_typ, 
				columnDtl1_trd_unit_qty, columnDtl1_trd_unit_dmn_qty, columnDtl1_trd_unit_conv_qty);

		Dtl1_ret_qty_p_PPanel.setRelateBeans(columnDtl1_base_unit_cd, columnDtl1_base_unit_dec_place);
		
		Dtl1_ver_no_p_PPanel.setRelateBeans(columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, 
				columnDtl1_itm_sub3, null, columnDtl1_ver_flg);
		// 取引通貨単価・金額
		Dtl1_trd_upri_amt_p_PPanel.setRelateBeans(
				Hdr1_trd_cur_cd, Hdr1_sppl_cd, 
				columnDtl1_itm_cd, columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3,
				columnDtl1_trd_unit_cd,
				columnDtl1_trd_unit_qty, Hdr1_trd_cur_amt_dec_place, Hdr1_trd_cur_upri_dec_place, 
				Hdr1_purc_amt_rnd_typ, Hdr1_purc_tax_rnd_typ, 
				Hdr1_purc_upri_cng_flg, columnDtl1_itm_purc_upri_cng_flg, columnDtl1_dscnt_itm_flg);
		Dtl1_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl1_trd_upri_amt_p_PPanel.setSchd(true);
		
		// 取引通貨加工単価・金額
		Dtl1_trd_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_upri_dec_place,
				columnDtl1_itm_cd,columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_trd_unit_cd);
		Dtl1_trd_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place, 
				columnDtl1_trd_unit_qty, columnDtl1_trd_cur_proc_upri, Hdr1_purc_amt_rnd_typ, null);
		// 取引通貨有償支給単価・金額
		Dtl1_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_upri_dec_place,
				columnDtl1_itm_cd,columnDtl1_itm_sub1, columnDtl1_itm_sub2, columnDtl1_itm_sub3, columnDtl1_trd_unit_cd);
		Dtl1_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_trd_cur_cd, Hdr1_trd_cur_amt_dec_place, 
				columnDtl1_trd_unit_qty, columnDtl1_trd_cur_onr_prov_upri, Hdr1_purc_amt_rnd_typ, null);
		
		// 源泉税額
		Dtl1_wtax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, columnDtl1_base_cur_amt, columnDtl1_wtax_rate, true);
		
		// 基準通貨単価・金額
		Dtl1_base_cur_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, 
				columnDtl1_trd_cur_upri, Hdr1_xrate);
		Dtl1_base_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, 
				columnDtl1_trd_cur_proc_upri, Hdr1_xrate);
		Dtl1_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_upri_dec_place, 
				columnDtl1_trd_cur_onr_prov_upri, Hdr1_xrate);
		
		Dtl1_base_cur_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place,
				columnDtl1_trd_cur_amt, Hdr1_xrate);
		Dtl1_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place, 
				columnDtl1_trd_cur_dscnt_amt, Hdr1_xrate);
		Dtl1_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd,Hdr1_base_cur_amt_dec_place, 
				columnDtl1_trd_cur_tax_amt, Hdr1_xrate);
		Dtl1_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd,Hdr1_base_cur_amt_dec_place,
				columnDtl1_trd_cur_inc_tax_amt, Hdr1_xrate);
		Dtl1_base_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place,
				columnDtl1_trd_cur_proc_amt, Hdr1_xrate);
		Dtl1_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_base_cur_cd, Hdr1_base_cur_amt_dec_place,
				columnDtl1_trd_cur_onr_prov_amt, Hdr1_xrate);
		// 納税通貨単価・金額
		Dtl1_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, 
				columnDtl1_trd_cur_upri, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_proc_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, 
				columnDtl1_trd_cur_proc_upri, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_upri_dec_place, 
				columnDtl1_trd_cur_onr_prov_upri, Hdr1_ptax_xrate);
		
		Dtl1_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_dscnt_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd,Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_tax_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd,Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_inc_tax_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_proc_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_proc_amt, Hdr1_ptax_xrate);
		Dtl1_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(Hdr1_ptax_cur_cd, Hdr1_ptax_cur_amt_dec_place, 
				columnDtl1_trd_cur_onr_prov_amt, Hdr1_ptax_xrate);

		
		// 負担項目
		Dtl1_bd_p_PPanel.setRelateBeans(
				columnDtl1_asset_mng_typ,
				columnDtl1_bd_lot_mng_typ, columnDtl1_bd_sublot_mng_typ, columnDtl1_bd_sno1_mng_typ, 
				columnDtl1_bd_sno2_mng_typ, columnDtl1_bd_sno3_mng_typ, columnDtl1_bd_sno4_mng_typ);
		
		// 有効成分部品
		Dtl1_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_std_cont_fctr,
				null, columnDtl1_cont_fctr_dec_place, columnDtl1_cont_fctr_rnd_typ);
		Dtl1_std_cont_qty_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_std_cont_fctr, 
				null, columnDtl1_cont_fctr_dec_place, columnDtl1_cont_fctr_rnd_typ);
		Dtl1_purc_cont_fctr_p_PPanel.setRelateBeans(columnDtl1_cont_fctr_flg, columnDtl1_base_unit_qty, columnDtl1_purc_cont_qty,
				columnDtl1_cont_fctr_dec_place);
		
		// 詳細枠
		Dtl2_str_ln_p_PPanel.setRelateBeans(columnDtl2_purc_ret_loc_cd, columnDtl2_str_ln_tgt_flg);
		Dtl2_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, columnDtl2_itm_sub3, 
				columnDtl2_sno1_mng_typ, columnDtl2_sno2_mng_typ, columnDtl2_sno3_mng_typ, columnDtl2_sno4_mng_typ);
		Dtl2_lot_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1,
				columnDtl2_itm_sub2, columnDtl2_itm_sub3, columnDtl2_lot_mng_typ,
				columnDtl2_sublot_mng_typ);

		Dtl2_ver_no_p_PPanel.setRelateBeans(columnDtl2_itm_cd, columnDtl2_itm_sub1, columnDtl2_itm_sub2, 
				columnDtl2_itm_sub3, null, columnDtl2_ver_flg);
		Dtl2_trd_unit_qty_p_PPanel.setRelateBeans(Dtl2_itm_p_PPanel.columnItm_itm_cd, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub1, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub2, 
				Dtl2_itm_p_PPanel.columnItm_itm_sub3,
				columnDtl2_trd_unit_cd, columnDtl2_trd_unit_dec_place,
				columnDtl2_trd_unit_rnd_typ, 
				columnDtl2_trd_unit_dmn_qty, columnDtl2_trd_unit_conv_qty, 
				columnDtl2_base_unit_cd);
		Dtl2_base_unit_qty_p_PPanel.setRelateBeans(
				columnDtl2_base_unit_cd, columnDtl2_base_unit_dec_place, columnDtl2_base_unit_rnd_typ, 
				columnDtl2_trd_unit_qty, columnDtl2_trd_unit_dmn_qty, columnDtl2_trd_unit_conv_qty);
		
		// 有効成分部品
		Dtl2_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_std_cont_fctr,
				null, columnDtl2_cont_fctr_dec_place, columnDtl2_cont_fctr_rnd_typ);
		Dtl2_std_cont_qty_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_std_cont_fctr,
				null, columnDtl2_cont_fctr_dec_place, columnDtl2_cont_fctr_rnd_typ);
		Dtl2_purc_cont_fctr_p_PPanel.setRelateBeans(columnDtl2_cont_fctr_flg, columnDtl2_base_unit_qty, columnDtl2_purc_cont_qty,
				columnDtl2_cont_fctr_dec_place);
		
	}
	
	/**
	 * 検索後の初期値をセット
	 */
	protected void setInitValue() {

		setDate();
		setValueEx(Hdr1_base_cur_cd, getCo().base_cur_cd());
		setValueEx(Hdr1_ptax_cur_cd, getCo().ptax_cur_cd());
		setValueEx(Hdr1_xrate_cd, getCo().purc_xrate_cd());
		
		//値変更確認が出ないようにするためステータスを変更
		getHdr1R().setStatus(MCRow.NONE);
		setSrchTgtTyp();
		
	}

	/**
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 * @param setTaxFixFlg
	 */
	protected void setDefaultTaxCd(Dtl1R dtlR, boolean setTaxFixFlg) {

		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				Hdr1_sppl_cd.getValue(), 
				Hdr1_reg_dt.getValue(), 
				this);
		setValueEx(columnDtl1_tax_cd, dtlR.getGUIIndex(), taxCd);
		if (setTaxFixFlg) {
			dtlR.tax_fix_flg();
		}
	}
	
	/**
	 * 税初期値を設定します。（全行）
	 * @param setTaxFixFlg
	 */
	protected void setDefaultTaxCd(boolean setTaxFixFlg) {
		for (Dtl1R r : getDtl1L()) {
			if (!r.isEmpty()) {
				if (r.abort_flg()) {
					continue;
				}
				if (r.tax_fix_flg() && !setTaxFixFlg) {
					continue;
				}
				setDefaultTaxCd(r, setTaxFixFlg);
			}
		}
	}
	/**
	 * ＩＶ表記品名を設定します。
	 * @param Dtl1R
	 */
	protected void setIvItmNm(Dtl1R dtl1R) {
		if (!getHdr1R().sppl_iv_flg()){
			setValueEx(columnDtl1_iv_itm_nm, dtl1R.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(Hdr1_prnt_lcl_cd.getValue(), 
					dtl1R.itm_cd(), dtl1R.itm_sub1(), dtl1R.itm_sub2(), dtl1R.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl1_iv_itm_nm, dtl1R.getGUIIndex(), null);
			}
			else {
				setValueEx(columnDtl1_iv_itm_nm, dtl1R.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	/**
	 * 発注先品目・品名を設定します
	 * @param Dtl1R
	 */
	protected void setSpplItm(Dtl1R Dtl1R) {
		MCRow row = MAUCP_ItmUtil.getBpItm(Hdr1_sppl_cd.getValue(), Dtl1R.itm_cd(), Dtl1R.itm_sub1(), Dtl1R.itm_sub2(), Dtl1R.itm_sub3(), Hdr1_reg_dt.getValue(), this);
		if (isNull(row)) {
			setValueEx(columnDtl1_sppl_itm_cd, Dtl1R.getGUIIndex(), null);
			setValueEx(columnDtl1_sppl_itm_nm, Dtl1R.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl1_sppl_itm_cd, Dtl1R.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnDtl1_sppl_itm_nm, Dtl1R.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	
	/**
	 * 理由をクリアします
	 * @param allDtlClear
	 * @param Dtl1R
	 */
	protected void clearRsn(Dtl1R dr) {
		setValueEx(columnDtl1_purc_ret_rsn_cd, dr.getGUIIndex(), null);
	}
	
	/**
	 * 版ＮＯをクリアします。
	 */
	protected void clearVerNo(Dtl1R dr) {
		setValueEx(columnDtl1_ver_no, dr.getGUIIndex(), null);
	}

	/**
	 * 単位をクリアします。
	 */
	protected void clearUnit(Dtl1R dr) {
		setValueEx(columnDtl1_trd_unit_cd, dr.getGUIIndex(), null);
	}
	/**
	 * 参考情報のＮＯをクリアします。
	 */
	protected void clearRefNo(Dtl1R dr) {
		dr.ref_arr_act_no(null);
		dr.ref_arr_act_rev(null);
		dr.ref_purc_act_no(null);
		dr.ref_purc_act_seq(null);
		dr.ref_purc_act_rev(null);
		dr.ref_purc_act_d_no(null);
		dr.ref_purc_act_d_seq(null);
		
		MCList<Dtl2R> d2l = _dtl2L.get(dr.peg_no());
		if (!isNull(d2l)) {
			d2l.forEach(r->{
				r.ref_arr_act_no(null);
				r.ref_arr_act_rev(null);
				r.ref_purc_act_io_no(null);
				r.ref_purc_act_io_seq(null);
			});
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
			Dtl1Table.fillSpace();
		}
	}
	/**
	 * ヘッダ枠のGUI項目のモード制御
	 */
	protected void setHdrPanelMode() {
		
		if (getHdr1R().sppl_iv_flg()) {
			setDefaultMode(Hdr1_rcpt_iv_no);
			setDefaultMode(Hdr1_ref_rcpt_iv_no);
		}
		else {
			Hdr1_rcpt_iv_no.setMode(MCMode.READ_ONLY);
			Hdr1_ref_rcpt_iv_no.setMode(MCMode.READ_ONLY);
		}

		setXrateInputMode();
		setPtaxXrateInputMode();
	}
	@Override
	public void doHdr1_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr1_trd_cur_cd_LC(info);
		setXrateInputMode();
		setPtaxXrateInputMode();
		setWtaxRate();
	}
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(crtDtl1CellConfig());
		Dtl2Table.setCellConfig(crtDtl2CellConfig());
	}
	
	protected Dtl1CellConfig crtDtl1CellConfig() {
		return new Dtl1CellConfig();
	}
	
	protected class Dtl1CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			Hdr1R hr = getHdr1R();
			Dtl1R dr = getDtl1L().get(index);
			
			// 実績済の場合
			if (hasAct(dr)) {
				if (column != columnDtl1_abort_flg || dr.ret_qty().gte(dr.base_unit_qty())) {
					return MCMode.READ_ONLY;					
				}
			}
			if (column == columnDtl1_trd_cur_dscnt_amt) {
				if (isNull(dr.trd_cur_upri()) || dr.trd_cur_upri().isZero()) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (!isDscntItmEditableColumn(column)) {
				if (dr.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (isMngItmEditableColumn(column)) {
				if (!isMng(dr)) {
					return MCMode.READ_ONLY;
				}
			}
			// 打切・打切解除の場合
			if (dr.abort_flg() || dr.bef_abort_flg()) {
				// 打切以外の項目は入力不可
				if(column != columnDtl1_abort_flg) {
					return MCMode.READ_ONLY;
				}
			}

			if (column == columnDtl1_ver_no) {
				if (!dr.ver_flg()) {
					return MCMode.READ_ONLY;
				}
			}


			// インボイス表記品名
			else if (column == columnDtl1_iv_itm_nm) {
				if (!getHdr1R().sppl_iv_flg() || !dr.sundry_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			

			else if (column == columnDtl1_trd_unit_qty) {
				if (dr.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			// 仕入返品理由

			else if (column == columnDtl1_purc_ret_rsn_cd) {
				// 品目ＣＤが未設定
				if (isNull(dr.itm_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl1_wtax_rate) {
				if (!canEditWtaxRate(dr)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl1_mfg_inst_no) {
				if (!isOutSrc(dr)) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl1_tax_cd ||
					column == columnDtl1_trd_cur_dscnt_amt ||
					column == columnDtl1_ap_dpt_cd ||
					column.getRootPanel() == Dtl1_trd_upri_amt_p_PPanel ||
					column.getRootPanel() == Dtl1_trd_cur_proc_upri_p_PPanel ||
					column.getRootPanel() == Dtl1_trd_cur_onr_prov_upri_p_PPanel ||
					column.getRootPanel() == Dtl1_trd_cur_proc_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_trd_cur_onr_prov_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_proc_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_onr_prov_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_tax_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_inc_tax_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_proc_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_base_cur_onr_prov_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_proc_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_onr_prov_upri_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_tax_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_inc_tax_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_proc_amt_p_PPanel || 
					column.getRootPanel() == Dtl1_ptax_cur_onr_prov_amt_p_PPanel || 
					column == columnDtl1_wtax_rate || 
					column.getRootPanel() == Dtl1_wtax_amt_p_PPanel ||
					column == columnDtl1_pay_crryovr_times) {

				if (!isNull(dr.purc_id_typ()) && (MAC_PURC_ID_TYP.isVMI(dr.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(dr.purc_id_typ()))) {
					return MCMode.READ_ONLY;
				}
				else if (!isNull(dr.stk_id_typ()) && !MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ()) && !MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ())) {
					return MCMode.READ_ONLY;
				}
				// 取引通貨単価
				else if (column == columnDtl1_trd_cur_upri
						|| column == columnDtl1_trd_cur_amt
						|| column == columnDtl1_trd_cur_inc_tax_amt) {
					if(!hr.purc_upri_cng_flg() && !dr.itm_purc_upri_cng_flg()) {
						return MCMode.READ_ONLY;
					}
					// 外注単価区分:加工単価+有償支給単価の場合は入力不可
					if(MAC_OUTSRC_UPRI_TYP.isPROC_PROV(dr.outsrc_upri_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (column == columnDtl1_trd_cur_amt && !dr.upri_not_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (column == columnDtl1_trd_cur_inc_tax_amt && !dr.upri_not_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 加工単価・有償支給単価
				else if (column == columnDtl1_trd_cur_proc_upri
						|| column == columnDtl1_trd_cur_onr_prov_upri
						|| column == columnDtl1_trd_cur_proc_amt
						|| column == columnDtl1_trd_cur_onr_prov_amt) {
					if(!canOutSrcPurcUpriChange(dr)){
						return MCMode.READ_ONLY;
					}
					else if(column == columnDtl1_trd_cur_onr_prov_upri && MAC_OUTSRC_UPRI_TYP.isPROC(dr.outsrc_upri_typ())) {
						return MCMode.READ_ONLY;
					}
					else if(column == columnDtl1_trd_cur_onr_prov_amt && MAC_OUTSRC_UPRI_TYP.isPROC(dr.outsrc_upri_typ())) {
						return MCMode.READ_ONLY;
					}
					else if(column == columnDtl1_trd_cur_proc_amt && dr.inc_tax_flg()) {
						return MCMode.READ_ONLY;
					}
					else if(column == columnDtl1_trd_cur_onr_prov_amt && dr.inc_tax_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(hr.trd_ptn_typ())) {
				if (Dtl1_bd_p_PPanel.BdItemTable == column.getTable()) {
					if (!MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			if (getSyncCheckTgtCols().contains(column.getBaseRowColumnName())) {
				MCList<Dtl2R> io = _dtl2L.get(dr.peg_no());
				MCMode mode = column.getMode();
				if (MCMode.REQUIRED.equals(mode) && (io != null && io.size() > 1)) {
					if (column == columnDtl1_str_ln_cd) {
						if (dr.str_ln_tgt_flg()) {
							return MCMode.ENABLE;
						}
						else {
							return super.getPriorMode(index, column, table);
						}
					}
					else {
						return MCMode.ENABLE;
					}
				}
			}

			if (column == columnDtl1_stk_arrv_bp_cd) {
				if (isEditableMode(column) && !MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ())) {
					return MCMode.ENABLE;
				}
				else if (isNull(dr.purc_ret_loc_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl1_ptax_cur_tax_amt) {
				if (isNull(getHdr1R().ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dr.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dr.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(getHdr1R().ptax_xrate())) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(getHdr1R().purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dr.trd_cur_upri())
						|| dr.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(getHdr1R().ptax_xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
			}
			
			else if (column == columnDtl1_base_cur_tax_amt) {
				if (!isNull(getHdr1R().ptax_cur_cd())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dr.trd_cur_tax_amt())) {
					return MCMode.READ_ONLY;
				}
				if (isSame(dr.tax_rate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (MAC_TAX_CALC_TYP.isSLIP(getHdr1R().purc_tax_calc_typ())) {
					return MCMode.READ_ONLY;
				}
				if (isNull(dr.trd_cur_upri())
						|| dr.trd_cur_upri().lte(MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isSame(getHdr1R().xrate(), MCNumber.ZERO)) {
					return MCMode.READ_ONLY;
				}
				if (isNull(getHdr1R().xrate())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl1_base_ac_dt) {
				if (isNull(dr.purc_ret_sppl_cd())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}

		/**
		 * 値引品の場合に、編集不可なカラムかどうか判定します。<br>
		 * @param column 判定するカラム
		 * @return 編集不可のカラムの場合、trueを返します。
		 */
		protected boolean isDscntItmEditableColumn(MCBeans column) {
			return !(
					column == columnDtl1_trd_unit_cd ||
					column == columnDtl1_trd_unit_qty||
					
					column == columnDtl1_quality_typ ||
					column == columnDtl1_stk_id_typ||
					column == columnDtl1_purc_id_typ||
					isMngItmEditableColumn(column)
					);
		}

		protected boolean isMngItmEditableColumn(MCBeans column) {
			return (column == columnDtl1_gd_cd
					|| column == columnDtl1_quality_typ);
		}

	}

	protected boolean canOutSrcPurcUpriChange(Dtl1R dr) {
		return isOutSrc(dr) && (dr.itm_purc_upri_cng_flg() || getHdr1R().purc_upri_cng_flg()) && dr.upri_not_tgt_flg();
	}
	protected boolean isOutSrc(Dtl1R dr) {
		return !MAC_PURC_TYP.isPURC_ITM(dr.purc_typ());
	}
	
	protected Dtl2CellConfig crtDtl2CellConfig() {
		return new Dtl2CellConfig();
	}
	
	protected class Dtl2CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			Dtl2R ir = getDtl2L().get(index);
			Dtl1R dr = getDtl1L().getFirst(Dtl1R.$peg_no, ir.dtl_peg_no());
			
			// 実績済の場合
			if (!isNull(dr) && hasAct(dr)) {
				return MCMode.READ_ONLY;
			}
			if (!isDscntItmEditableColumn(column)) {
				if (dr.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (isMngItmEditableColumn(column)) {
				if (!isMng(dr)) {
					return MCMode.READ_ONLY;
				}
			}

			// 打切・打切解除の場合
			if (dr == null) {
				return MCMode.READ_ONLY;
			}
			else {
				if (dr.abort_flg() || dr.bef_abort_flg()) {
					return MCMode.READ_ONLY;
				}
			}
					
			if (column == columnDtl2_ver_no) {
				if (!ir.ver_flg()) {
					return MCMode.READ_ONLY;
				}
			}


			else if (column == columnDtl2_stk_arrv_bp_cd) {
				if (isEditableMode(column) && !MSC_STK_ID_TYP.isONR_PROV(ir.stk_id_typ())) {
					return MCMode.ENABLE;
				}
				else if (isNull(ir.purc_ret_loc_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 値引品の場合に、編集不可なカラムかどうか判定します。<br>
		 * @param column 判定するカラム
		 * @return 編集不可のカラムの場合、trueを返します。
		 */
		protected boolean isDscntItmEditableColumn(MCBeans column) {
			return !(column == columnDtl2_trd_unit_cd ||
					column == columnDtl2_trd_unit_qty ||

					column == columnDtl2_quality_typ ||
					column == columnDtl2_stk_id_typ||
					isMngItmEditableColumn(column)
					);
		}

		protected boolean isMngItmEditableColumn(MCBeans column) {
			return (column == columnDtl2_gd_cd
					|| column == columnDtl2_quality_typ);
		}
	}
	
	/**
	 * 単価再取得対象の明細を取得する
	 */
	protected MCList<Dtl1R> getSprtTgtDtl1L() {
		MCList<Dtl1R> upL = MCList.create(Dtl1R.class);
		for (Dtl1R r : getDtl1L()) {
			if (isTgt(r)){
				upL.add(r);
			}
		}
		return upL;
	}
	
	protected boolean isTgt(Dtl1R r) {
		return !r.upri_not_tgt_flg() && 
				!r.isStatusDelete() && 
				!r.isEmpty() && 
				!hasRetQty(r) && 
				!r.abort_flg() &&
				!r.bef_abort_flg() &&
				(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) || MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ()));
	}
	
	/**
	 * 返品数量があるかどうかを返します。
	 */
	protected boolean hasRetQty(Dtl1R r) {
		return !isNull(r.ret_qty()) && MCNumber.ZERO.gt(r.ret_qty());
	}
	/**
	 * 異なる単価の明細が含まれるかどうかを判定します。
	 */
	protected void setDiffLatestUpriMsg(MCMessageList ml, Dtl1R dr) {
		if (isNullOr(dr.old_trd_cur_upri(), dr.trd_cur_upri())) {
			return;
		}
		if (!isSame(dr.old_trd_cur_upri(), dr.trd_cur_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_upri.getLabelByLocale(), 
					dr.old_trd_cur_upri(), dr.trd_cur_upri(), toDispGUIIndex(dr)));
		}
		if (!isSame(dr.old_trd_cur_proc_upri(), dr.trd_cur_proc_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_proc_upri.getLabelByLocale(), 
					dr.old_trd_cur_proc_upri(), dr.trd_cur_proc_upri(), toDispGUIIndex(dr)));
		}
		if (!isSame(dr.old_trd_cur_onr_prov_upri(), dr.trd_cur_onr_prov_upri())) {
			ml.add(new MCMessage(dr, null, MSBDP0005,
					columnDtl1_trd_cur_onr_prov_upri.getLabelByLocale(), 
					dr.old_trd_cur_onr_prov_upri(), dr.trd_cur_onr_prov_upri(), toDispGUIIndex(dr)));
		}
	}
	/**
	 * 単価をキャッシュする。
	 */
	protected void cacheUpri(Dtl1R dr) {
		dr.old_trd_cur_upri(dr.trd_cur_upri());
		dr.old_trd_cur_proc_upri(dr.trd_cur_proc_upri());
		dr.old_trd_cur_onr_prov_upri(dr.trd_cur_onr_prov_upri());
	}
	/**
	 * 単価をキャッシュした値に戻す。
	 */
	protected void restoreUpri(Dtl1R dr) {
		int idx = dr.getGUIIndex();
		MCNumber u = dr.old_trd_cur_upri();
		MCNumber pu = dr.old_trd_cur_proc_upri();
		MCNumber opu = dr.old_trd_cur_onr_prov_upri();
		setValueEx(columnDtl1_trd_cur_upri, idx, u);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, pu);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, opu);
	}
	
	/**
	 * 単価のイベントを発生させる。
	 */
	protected void doUpriEvent(Dtl1R dr, MCMessageList msgL) {
		int idx = dr.getGUIIndex();
		MCNumber u = dr.trd_cur_upri();
		MCNumber pu = dr.trd_cur_proc_upri();
		MCNumber opu = dr.trd_cur_onr_prov_upri();
		// 一度単価をクリアするとイベントで値引額がクリアされるので保持する
		MCNumber dscntAmt = dr.trd_cur_dscnt_amt();
		String dscntRsnCd = dr.dscnt_rsn_cd();
		String dscntRsnNm = dr.dscnt_rsn_nm();
		
		// 同一値でイベントを発生させるために一度クリアする
		setValueEx(columnDtl1_trd_cur_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, null);
		// イベントを発生させる
		setValueEx(columnDtl1_trd_cur_upri, idx, u);
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, pu);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, opu);
		
		if ((!isNull(dr.trd_cur_amt()) && !isNull(dscntAmt) && dr.trd_cur_amt().lt(dscntAmt))
				|| (isNull(u) && !isNull(dscntAmt))) {
			// 金額<値引額のときと、元々は単価・値引額が入力されていたがマスタ単価が取得できず値引額が残ってしまった場合は、値引額をクリアする
			msgL.add(new MCMessage(dr, null, MSBDP0036, dscntAmt, dscntRsnCd, dscntRsnNm, toDispGUIIndex(dr)));
			setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, null);
			setValueEx(columnDtl1_dscnt_rsn_cd, idx, null);
		}
		else {
			setValueEx(columnDtl1_trd_cur_dscnt_amt, idx, dscntAmt);
			setValueEx(columnDtl1_dscnt_rsn_cd, idx, dscntRsnCd);
		}
	}
	protected List<String> _mccols = null;
	protected List<String> getSyncCheckTgtCols() {
		if (_mccols == null) {
			_mccols = new ArrayList<String>();
			_mccols.add(Dtl1R.$quality_typ);
			_mccols.add(Dtl1R.$gd_cd);
			_mccols.add(Dtl1R.$purc_ret_loc_cd);
			_mccols.add(Dtl1R.$str_ln_cd);
			_mccols.add(Dtl1R.$lot_no);
			_mccols.add(Dtl1R.$sublot_no);
			_mccols.add(Dtl1R.$sno1);
			_mccols.add(Dtl1R.$sno2);
			_mccols.add(Dtl1R.$sno3);
			_mccols.add(Dtl1R.$sno4);
			_mccols.add(Dtl1R.$stk_id_typ);
			_mccols.add(Dtl1R.$stk_arrv_bp_cd);
		}
		return _mccols;
	}

	/**
	 * 詳細のリストを返します。
	 * 明細行が打切更新の場合、詳細の追加行は含まれず、削除行はMODIFYに変更されます。
	 */
	protected MCList<Dtl2R> getAllDtl2() {
		MCList<Dtl2R> l = getDtl2L().createInstance();
		for( Dtl1R dr : getDtl1L()) {
			MCList<Dtl2R> il = _dtl2L.get(dr.peg_no());
			if (il != null) {
				if (dr.abort_flg() || dr.bef_abort_flg()) {
					for (Dtl2R ir : il) {
						//打切更新の場合、検索結果行のみ返す。削除行は更新行に変更する。
						if (!ir.isStatusGUICreate() && !ir.isStatusCreate()) {
							if (ir.isStatusDelete()) {
								ir.setStatus(MCRow.MODIFY);
							}
							l.add(ir);
						}
					}
				}
				else {
					l.addAll(il);
				}
			}
		}
		return l;
	}
	
	protected void cacheAllDtl2(MCList<Dtl1R> d1l, MCList<Dtl2R> d2l) {
		MCJoinKey<MCList<Dtl2R>> k = d1l.join(Dtl1R.$peg_no, d2l, Dtl2R.$dtl_peg_no);
		d1l.forEach(d1r -> {
			d1r.bef_abort_flg(d1r.abort_flg());
			_dtl2L.put(d1r.peg_no(), d1r.getJoined(k));
		});
	}
	
	/**
	 * 詳細が１レコードの再に明細と同期するための処理です。<p>
	 * 詳細がない場合は1レコード追加してから同期します。<br>
	 * 数量変更時は単位も同期します。
	 */
	protected void syncDtl1ToDtl2(MCColumnConfig dtl1Col, 
			MCColumnConfig dtl2Col, int dtl1EventIdx) {
		// 明細反映ボタン押下時は何もしない
		if (_updDtlBtnExecFlg) {
			return;
		}
		
		MCList<Dtl2R> d2l = getDtl2L();
		Dtl1R d1r = getDtl1L().get(dtl1EventIdx);
		insertNewDtl2(d1r, d2l);
		if (d2l.size() == 1) {
			Dtl2R d2r = getDtl2L().get(0);
			if (dtl1Col == columnDtl1_str_ln_cd) {
				if (!isSame(d1r.purc_ret_loc_cd(), d2r.purc_ret_loc_cd())) {
					return;
				}
			}
			if (dtl1Col == columnDtl1_str_ln_cd_none_flg) {
				if (!isSame(d1r.purc_ret_loc_cd(), d2r.purc_ret_loc_cd())) {
					return;
				}
			}
			
			// 明細の品目情報を詳細に反映してからイベントを起こす
			d2r.itm_cd(d1r.itm_cd());
			d2r.itm_sub1(d1r.itm_sub1());
			d2r.itm_sub2(d1r.itm_sub2());
			d2r.itm_sub3(d1r.itm_sub3());
			
			Comparable<?> v1 = dtl1Col.getRowValue(dtl1EventIdx);
			Comparable<?> v2 = dtl2Col.getRowValue(0);
			if (isSame(v1, v2)) {
				setValueEx(dtl2Col, 0, null);
			}
			if (dtl1Col == columnDtl1_trd_unit_qty) {
				if (!isNull(d1r.trd_unit_qty())) {
					setValueEx(columnDtl2_trd_unit_cd, 0, d1r.trd_unit_cd());
				}
			}
			setValueEx(dtl2Col, 0, v1);
		}
	
	}
	
	@Override
	public void setFocus(MCMessage msg) {
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Dtl2R) {
			for (Dtl1R r : getDtl1L()) {
				if (isSame(((Dtl2R) msg.getCauseRow()).dtl_peg_no(), r.peg_no())) {
					Dtl1Table.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}
	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearHiddenList();
	}

	@Override
	protected void clearContainers(List<MCContainer> containers) {
		super.clearContainers(containers);
		if (containers.contains(getDtl2L())) {
			clearHiddenList();
		}
	}
	
	/**
	 * キャッシュをクリアする
	 */
	protected void clearHiddenList() {
		_dtl2L.clear();
	}

	@Override
	protected void listInit() {
		super.listInit();
		columnDtl1_itm_cd.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub1.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub2.addIgnoreListBeans(columnDtl1_maker_cd);
		columnDtl1_itm_sub3.addIgnoreListBeans(columnDtl1_maker_cd);
	}

	/**
	 * 行ステータスが変更された場合に、ヘッダ項目を明細項目にコピーします
	 */
	protected void copyHdrToDtl(Dtl1R dtlR) {
		setDefaultTaxCd(dtlR, false);
		setDefaultApDptCd(dtlR);
		setDtlPegNo(dtlR);
	}
	/**
	 * 債務部門を設定します（行指定）
	 */
	protected void setDefaultApDptCd(Dtl1R dtlR) {
		if (isEditable(columnDtl1_ap_dpt_cd, dtlR.getGUIIndex())) {
			setValueEx(columnDtl1_ap_dpt_cd, dtlR.getGUIIndex(), Hdr1_ap_dpt_cd.getValue());
		}
	}
	/**
	 * 支払繰越回数初期値を設定します（行指定）
	 */
	protected void setDefaultPayCrryovrTimes(Dtl1R dtlR) {
		if (isNull(dtlR.pay_crryovr_times())) {
			if (!isNull(dtlR.itm_pay_crryovr_times())) {
				setValueEx(columnDtl1_pay_crryovr_times, dtlR.getGUIIndex(), dtlR.itm_pay_crryovr_times());
			}
			else {
				setValueEx(columnDtl1_pay_crryovr_times, dtlR.getGUIIndex(), Hdr1_sppl_pay_crryovr_times.getValue());
			}
		}
	}
	
	@Override
	public MCList<?> getDtl1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(getHdr1R().trd_ptn_typ())) {
			row.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
		}
		return super.getDtl1_itm_p_PPanel_columnItm_itm_cd(row, info);
	}
	
	@Override
	public void doDtl1_purc_typ_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl1_purc_typ_NC(info);
		int idx = info.getEventIndex();
		Dtl1R r = getDtl1L().get(idx);
		if (!isOutSrc(r)) {
			setValueEx(columnDtl1_mfg_inst_no, idx, null);
			setValueEx(columnDtl1_repurc_obli_flg, idx, false);
			r.outsrc_upri_typ(null);
		}
		else {
			setValueEx(columnDtl1_repurc_obli_flg, idx, getHdr1R().repurc_obli_flg());
			r.outsrc_upri_typ(getHdr1R().outsrc_upri_typ());
		}
		// 購買区分変更時は金額項目をクリア
		setValueEx(columnDtl1_trd_cur_proc_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_onr_prov_upri, idx, null);
		setValueEx(columnDtl1_trd_cur_upri, idx, null);
	}
	
	@Override
	public MCList<MCRow> getDtl1_purc_id_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> tmpL = super.getDtl1_purc_id_typ(row, info);
		MCList<MCRow> rsltL = MCList.create(MCRow.class);
		Dtl1R dtlR = getDtl1L().get(info.getEventIndex());
		for (MCRow r : tmpL) {
			if (isMatchPurcIdTyp(dtlR, r.getStringNE(MAC_PURC_ID_TYP.$VALUE))) {
				rsltL.add(r);
			}
		}
		return rsltL;
	}

	@Override
	public MCList getDtl1_purc_ret_rsn_cd(
			MCRow row,
			MCEventInfo info) {
		Dtl1R dr = getDtl1L().get(info.getEventIndex());
		
		if (MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ())) {
			row.addBooleanColumn(PurcRtnBizRsnCols.$i_xpns_purc_flg, true);
		}
		else {
			row.addBooleanColumn(PurcRtnBizRsnCols.$i_not_xpns_purc_flg, true);
		}

		return super.getDtl1_purc_ret_rsn_cd(row, info);
	}

	/**
	 * 在庫管理するかどうかを返します。
	 */
	protected boolean isMng(Dtl1R r) {
		return MSUCP_PurcUtil.isPurcStkMng(r.stk_mng_typ(), r.asset_mng_typ(), r.xpns_purc_flg());
	}
	
	protected boolean isMng(String stkMngTyp, String assetMngTyp, boolean xpnsPurcFlg) {
		// 品目の在庫管理区分・資産管理区分、経費購買FLGの組合せで、
		// 引当対象を判別するための値を在庫管理区分項目に設定する
		if (MAC_STK_MNG_TYP.isMNG(stkMngTyp)) {
			if (MAC_ASSET_MNG_TYP.isMNG(assetMngTyp)) {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理する」
				if (xpnsPurcFlg) {
					// 経費購買FLGがオンの場合は、在庫を更新しない
					return false;
				}
				else {
					// 経費購買FLGがオフの場合は、在庫を更新する
					return true;
				}
			}
			else {
				// 品目マスタ.在庫管理区分・資産管理区分が「在庫管理する」・「資産管理しない」の場合
				// 在庫を更新する
				return true;
			}
		}
		else {
			// 品目マスタ・在庫管理区分が「在庫管理する」以外の場合は、在庫を更新しない
			return false;
		}	
	}
	public MCList getDtl1_quality_typ(MCRow row,	MCEventInfo info) {
		setBindForQualityTyp(row);
		return super.getDtl1_quality_typ(row, info);
	}
	@Override
	public MCList getDtl2_quality_typ(MCRow row,	MCEventInfo info) {
		setBindForQualityTyp(row);
		return super.getDtl2_quality_typ(row, info);
	}
	
	protected void setBindForQualityTyp(MCRow row) {
		row.setBooleanNE(MAC_QUALITY_TYP.GOOD.key(), true);
		row.setBooleanNE(MAC_QUALITY_TYP.DFCT_INSP.key(), true);
		row.setBooleanNE(MAC_QUALITY_TYP.SSPND.key(), true);
	}

	@Override
	public MCList getDtl1_stk_id_typ(MCRow row,	MCEventInfo info) {

		Dtl1R dr = getDtl1L().get(info.getEventIndex());
		setBindForStkIdTyp(row, dr);

		return super.getDtl1_stk_id_typ(row, info);
	}

	@Override
	public MCList getDtl2_stk_id_typ(MCRow row, MCEventInfo info) {
		
		Dtl2R dr = getDtl2L().get(info.getEventIndex());
		setBindForStkIdTyp(row, Dtl1Table.getSelectedMCRow(), dr);
		
		return super.getDtl2_stk_id_typ(row, info);		
	}	

	protected void setBindForStkIdTyp(MCRow row, Dtl1R d1r, Dtl2R d2r) {

		if (d1r.dscnt_itm_flg()) {
			row.addBooleanColumn(MSC_STK_ID_TYP.COSTK.key(), true);
			return;
		}
		
		row.addBooleanColumn(MSC_STK_ID_TYP.ACCPT_DFCT.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.COSTK.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.NCV_RCV.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), true);
		//場所指定あり
		if (!isNull(d2r.purc_ret_loc_cd())){
			//外注場所の場合VMI不可
			if (!isNull(d2r.purc_ret_sppl_cd())) {
				row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), false);
			}
			//自社場所の場合有償支給不可
			else {
				row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), false);
			}
		}
		if (d1r.arr_skip_flg()) {
			row.addBooleanColumn(MSC_STK_ID_TYP.NCV_RCV.key(), false);
		}
		
		if (!isMng(d1r)) {
			row.addBooleanColumn(MSC_STK_ID_TYP.ACCPT_DFCT.key(), false);
			row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), false);
			row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), false);
		}
	}
	protected void setBindForStkIdTyp(MCRow row, Dtl1R dr) {

		if (dr.dscnt_itm_flg()) {
			row.addBooleanColumn(MSC_STK_ID_TYP.COSTK.key(), true);
			return;
		}
		
		row.addBooleanColumn(MSC_STK_ID_TYP.ACCPT_DFCT.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.COSTK.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.NCV_RCV.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), true);
		row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), true);
		//場所指定あり
		if (!isNull(dr.purc_ret_loc_cd())){
			//外注場所の場合VMI不可
			if (!isNull(dr.purc_ret_sppl_cd())) {
				row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), false);
			}
			//自社場所の場合有償支給不可
			else {
				row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), false);
			}
		}
		if (dr.arr_skip_flg()) {
			row.addBooleanColumn(MSC_STK_ID_TYP.NCV_RCV.key(), false);
		}

		if (!isMng(dr)) {
			row.addBooleanColumn(MSC_STK_ID_TYP.ACCPT_DFCT.key(), false);
			row.addBooleanColumn(MSC_STK_ID_TYP.RNT_RCV.key(), false);
			row.addBooleanColumn(MSC_STK_ID_TYP.ONR_PROV.key(), false);
		}
	}
	
	/**
	 * 適切な購買識別区分であるか否かを判定します。
	 */
	protected boolean isMatchPurcIdTyp(Dtl1R dr, String purcIdTyp) {
		String stkIdTyp = dr.stk_id_typ();
		
		// 値引品目の場合、「通常購買」固定
		if (dr.dscnt_itm_flg()) {
			if (MAC_PURC_ID_TYP.isPURC(purcIdTyp)) {
				return true;
			}
		}
//		在庫識別区分で「自社在庫」、「有償支給」、「検収不良」のいずれかを選択時
//		○「通常購買」または「有償受給」を選択可能。
		else if (MSC_STK_ID_TYP.isCOSTK(stkIdTyp) ||
				MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp) ||
				MSC_STK_ID_TYP.isONR_PROV(stkIdTyp) ) {

			if (MAC_PURC_ID_TYP.isPURC(purcIdTyp) ||
					MAC_PURC_ID_TYP.isONR_RCV(purcIdTyp)) {
				return true;
			}
		}
//		在庫識別区分で「無償受給」選択時
//		○「無償受給」固定。
		else if (MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)) {
			if (MAC_PURC_ID_TYP.isFFR_RCV(purcIdTyp)) {
				return true;
			}
		}
//		在庫識別区分で「ＶＭＩ」選択時
//		○「ＶＭＩ」固定。
		else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)) {
			if (MAC_PURC_ID_TYP.isVMI(purcIdTyp)) {
				return true;
			}
		}
		
		return false;

	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (columnDtl1_stk_arrv_bp_cd == beans) {
			Dtl1R dtlR = getDtl1L().get(eventIndex);
	
			if (beans == columnDtl1_stk_arrv_bp_cd) {
				if (!isNull(dtlR.purc_ret_sppl_cd())) {
					row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.SPPL.value());
				}
			}
		}
		else if (beans == columnDtl1_itm_cd) {
			if (MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(getHdr1R().trd_ptn_typ())) {
				bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
			}
		}
		else if (columnDtl2_stk_arrv_bp_cd == beans) {
			Dtl2R dtlR = getDtl2L().get(eventIndex);
	
			if (beans == columnDtl2_stk_arrv_bp_cd) {
				if (!isNull(dtlR.purc_ret_sppl_cd())) {
					row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.SPPL.value());
				}
			}
		}
		return row;
	}

	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (panel == Dtl1Btn_Btn_open_MSBEP0500_PPanel) {
			return Dtl1Table;
		}
		else {
			return Dtl2Table;
		}
	}

	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		MCRow bind = MCRow.create();
		if (table == Dtl1Table) {
			Dtl1R dr  = Dtl1Table.getSelectedMCRow();

			if (dr != null) {
				bind.addStringColumn(IfStkInspBase.CND_WG_CD, dr.purc_ret_loc_wg_cd()); // ワーキンググループＣＤ
				bind.addStringColumn(IfStkInspBase.CND_WG_NM, dr.purc_ret_loc_wg_nm()); // ワーキンググループ名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, dr.purc_ret_loc_cd()); // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, dr.purc_ret_loc_nm()); // 場所名
				bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, dr.str_ln_cd()); //　棚ラインＣＤ
				bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, dr.str_ln_nm());  //　棚ライン名
				bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dr.itm_cd()); // 品目ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dr.itm_sub1()); // 枝番１
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dr.itm_sub2()); // 枝番２
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dr.itm_sub3()); // 枝番３
				bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dr.itm_nm()); // 品名
				bind.addStringColumn(IfStkInspBase.CND_LOT_NO, dr.lot_no()); // ロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_SUBLOT_NO, dr.sublot_no()); // サブロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_BP_LOT_NO, dr.bp_lot_no()); // 業者ロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_VER_NO, dr.ver_no()); // 版ＮＯ
				bind.addStringColumn(IfStkInspBase.CND_SNO1, dr.sno1()); // 手配ＮＯ１
				bind.addStringColumn(IfStkInspBase.CND_SNO2, dr.sno2()); // 手配ＮＯ２
				bind.addStringColumn(IfStkInspBase.CND_SNO3, dr.sno3()); // 手配ＮＯ３
				bind.addStringColumn(IfStkInspBase.CND_SNO4, dr.sno4()); // 手配ＮＯ４
				bind.addStringColumn(IfStkInspBase.CND_GD_CD, dr.gd_cd()); // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, dr.gd_nm()); // 格付名
				

				setStkCndCommon(bind);

			}
		}
		else {
			Dtl2R dr  = Dtl2Table.getSelectedMCRow();

			if (dr != null) {
				bind.addStringColumn(IfStkInspBase.CND_WG_CD, dr.purc_ret_loc_wg_cd()); // ワーキンググループＣＤ
				bind.addStringColumn(IfStkInspBase.CND_WG_NM, dr.purc_ret_loc_wg_nm()); // ワーキンググループ名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, dr.purc_ret_loc_cd()); // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, dr.purc_ret_loc_nm()); // 場所名
				bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, dr.str_ln_cd()); //　棚ラインＣＤ
				bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, dr.str_ln_nm());  //　棚ライン名
				bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dr.itm_cd()); // 品目ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dr.itm_sub1()); // 枝番１
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dr.itm_sub2()); // 枝番２
				bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dr.itm_sub3()); // 枝番３
				bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dr.itm_nm()); // 品名
				bind.addStringColumn(IfStkInspBase.CND_LOT_NO, dr.lot_no()); // ロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_SUBLOT_NO, dr.sublot_no()); // サブロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_BP_LOT_NO, dr.bp_lot_no()); // 業者ロットＮＯ
				bind.addStringColumn(IfStkInspBase.CND_VER_NO, dr.ver_no()); // 版ＮＯ
				bind.addStringColumn(IfStkInspBase.CND_SNO1, dr.sno1()); // 手配ＮＯ１
				bind.addStringColumn(IfStkInspBase.CND_SNO2, dr.sno2()); // 手配ＮＯ２
				bind.addStringColumn(IfStkInspBase.CND_SNO3, dr.sno3()); // 手配ＮＯ３
				bind.addStringColumn(IfStkInspBase.CND_SNO4, dr.sno4()); // 手配ＮＯ４
				bind.addStringColumn(IfStkInspBase.CND_GD_CD, dr.gd_cd()); // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, dr.gd_nm()); // 格付名

				setStkCndCommon(bind);
			}
		}
		return bind;
	}
	
	protected void setStkCndCommon(MCRow bind) {

		bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);

		bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
		bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, true);
	}
	
	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		//在庫情報選択ではフォーカス行のみを更新する
		return IfStkInspBase.OPE_UPD;
	}
	@Override
	public String getInptLocCdCol() {
		return Dtl1R.$purc_ret_loc_cd;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する	
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdr1R().purc_ret_schd_no());
		}
	}

	/**
	 * 登録用データを調整する。
	 */
	protected void complSrchRsltForIns(Hdr1R hr, MCList<Dtl1R> dl, MCList<Dtl2R> il) {
		MCDate dt = getToday();
		hr.reg_dt(dt);
		hr.schd_dt(dt);
		hr.xrate_cd(getCo().purc_xrate_cd());
		cacheAllDtl2(dl, il);
	}
	/**
	 * 為替レート指定ＦＬＧの入力制御を設定します
	 */
	protected void setXrateInputMode() {
		// 取引通貨＝基準通貨のとき、または取引通貨未設定の場合は常に入力不可
		if (isSame(Hdr1_trd_cur_cd.getValue(), Hdr1_base_cur_cd.getValue()) || isNull(Hdr1_trd_cur_cd.getValue())) {
			Hdr1_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr1_xrate_inpt_flg);
		}
	}
	/**
	 * 納税為替レート指定ＦＬＧの入力制御を設定します
	 */
	protected void setPtaxXrateInputMode() {
		// 取引通貨＝納税通貨のとき、または取引通貨と納税通貨のいずれかが未設定の場合は常に入力不可
		if (isSame(Hdr1_trd_cur_cd.getValue(), Hdr1_ptax_cur_cd.getValue()) 
						|| isNull(Hdr1_trd_cur_cd.getValue())
						|| isNull(Hdr1_ptax_cur_cd.getValue())
			) {
			Hdr1_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr1_ptax_xrate_inpt_flg);
		}
	}
	protected void setTrdCd() {
		Hdr1R r = getHdr1R();
		setValueEx(Hdr1_trd_cd, getDefaultTrdCd(
				MSUCP_PurcUtil.getPurcRetTrdPtnTyp(r.trd_ptn_typ())));
	}
	//---------------------------------
	// 源泉税対応
	//---------------------------------
	/**
	 * 源泉税率取得(行指定)
	 * @param r
	 */
	protected void setWtaxRate(Dtl1R r) {
		if (canEditWtaxRate(r)) {
			if (isNullAnd(r.ref_arr_act_no(), r.ref_purc_act_no(), r.ref_purc_act_d_no())) {
				// 源泉税率取得
				MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						getHdr1R().reg_dt(),
						this);
				setValueEx(columnDtl1_wtax_rate, r.getGUIIndex(), wtaxRate);
			}
		}
		else {
			clearWtaxRate(r);
		}
	}
	/**
	 * 源泉税率取得(全行)
	 * @param r
	 */
	protected void setWtaxRate() {
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			if (!r.isEmpty()) {
				if (r.abort_flg()) {
					continue;
				}
				setWtaxRate(r);
			}
		}
	}
	/**
	 * 源泉税率をクリアします
	 * @param dtlR
	 */
	protected void clearWtaxRate(Dtl1R dtlR) {
		if (!canEditWtaxRate(dtlR)) {
			setValueEx(columnDtl1_wtax_rate, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(Dtl1R dtlR) {
		String purcIdTyp = dtlR.purc_id_typ();
		String trdCurCd = getHdr1R().trd_cur_cd();
		String baseCurCd = getHdr1R().base_cur_cd();
		String ptaxCurCd = getHdr1R().ptax_cur_cd();
		
		if (MAC_PURC_ID_TYP.isVMI(purcIdTyp)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(dtlR.stk_id_typ())
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
	 * ヘッダの金額合計を設定する。
	 */
	protected void setDispAmt() {
		MCNumber trdCurAmt = MCNumber.ZERO;
		MCNumber trdCurIncTaxAmt = MCNumber.ZERO;
		for (Dtl1R r : exceptDeleteAndEmpty(getDtl1L())) {
			if (r.abort_flg()) {
				continue;
			}
			if (!isNull(r.trd_cur_amt())) {
				trdCurAmt = trdCurAmt.add(
						r.dscnt_itm_flg() ? r.trd_cur_amt().negate() : r.trd_cur_amt());
			}
			if (!isNull(r.trd_cur_inc_tax_amt())) {
				trdCurIncTaxAmt = trdCurIncTaxAmt
						.add(r.dscnt_itm_flg() ? r.trd_cur_inc_tax_amt().negate()
								: r.trd_cur_inc_tax_amt());
			}
		}
		getHdr1R().trd_cur_amt(trdCurAmt);
		getHdr1R().trd_cur_inc_tax_amt(trdCurIncTaxAmt);
	}
	@Override
	public void afterUpdStkData(MCRootPanel panel, int index) {
		// 在庫情報選択により、詳細行の在庫キーが変更された場合、
		// 明細行に紐付く詳細行が他になければ、ロット情報、手配NOを詳細行から明細行にコピーする
		if (panel == Dtl2Btn_Btn_open_MSBEP0500_PPanel) {
			Dtl2R tgtIoR = getDtl2L().get(index);
			Dtl1R dtlR = getDtl1L().getFirst(Dtl1R.$peg_no, tgtIoR.dtl_peg_no());
			
			MCList<Dtl2R> ioL = getDtl2L().subList(Dtl2R.$dtl_peg_no, dtlR.peg_no());
			if (ioL.size() == 1) {
				dtlR.lot_no(tgtIoR.lot_no());
				dtlR.sublot_no(tgtIoR.sublot_no());
				dtlR.sno1(tgtIoR.sno1());
				dtlR.sno2(tgtIoR.sno2());
				dtlR.sno3(tgtIoR.sno3());
				dtlR.sno4(tgtIoR.sno4());
				dtlR.wrk_no(tgtIoR.wrk_no());
				dtlR.wrk_nm(tgtIoR.wrk_nm());
			}
		}
	}
	
	protected boolean hasAct(Dtl1R dr) {
		return !isNull(dr.ret_qty()) && dr.ret_qty().isPositive();
	}
	
	@Override
	protected void clearNotInheritInfo(List<MCContainer> containers) {
		super.clearNotInheritInfo(containers);
		List<String> cols = getNotInheritCols(NOT_INHERIT_TYPE_REF_UPD, getDtl2L());
		_dtl2L.values().forEach(l2 -> l2.clear(cols.toArray(new String[0])));
	}

	protected MCMessageList cmmChkIo(MCList<Dtl2R> il) {
		MCMessageList msgL = new MCMessageList();
		
		// 棚・ラインの必須チェック
		for (Dtl2R r : il) {
			if (r.str_ln_tgt_flg() && isNull(r.str_ln_cd()) && !r.str_ln_cd_none_flg()) {
				msgL.add(FXUCP_ValidaterUtil.msgNoDataAtReq(
						r,
						Dtl2R.$str_ln_cd,
						columnDtl2_str_ln_cd.getMessageByLocale(),
						r.getGUIIndex()));
			}
		}
		
		return msgL;
	}

}