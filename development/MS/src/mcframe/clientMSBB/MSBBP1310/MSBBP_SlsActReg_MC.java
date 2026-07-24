package mcframe.clientMSBB.MSBBP1310;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0210.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
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
import static java.util.Arrays.asList;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0060.MSUCP_ArUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;

import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;   // 在庫選択用
import mcframe.commonMA.meta.MA_META;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.clientCore.beans.list.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsActReg_MC extends MSBBP_SlsActReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 明細反映ボタン実行中フラグ
	protected boolean _updDtlBtnExecFlg = false;
	
	/**
	 * 明細行紐付けID
	 * <p>
	 * 	明細と紐づくを関連付けするID<br>
	 * 	peg_noとほぼおなじ
	 * </p>
	 */
	protected int _dtl_row_id = 0;

	/**
	 * 	詳細情報裏リスト
	 * 	<p>
	 * 	明細選択行に紐付く詳細リストのみが表示されるため	非表示分を含めた全データを格納する裏リスト
	 * 	</p>
	 */
	protected MCList<IoR> _ioLAll = MCList.create(IoR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsActReg_MC() {
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
	public MSBBP_SlsActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1310_Srch06]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch06Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch06Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setINS_IV_TRNSTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}
		
		@Override
		protected void show() {
			super.show();
			// 検索対象ＮＯをHdrブロックにコピー
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setHdrPanelInitValue();
			setIvHdrAmt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			for (DtlR r : getDtlL()) {
				addChildDtlRow(r);
			}
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtDataSchd();
			setOrgAmt();
			setUpriSlsSchdNo();
		}
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1750]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1750(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1750");
		aso.putCnd(crtOpenMSBEP1750CndR(aso, getHdrR()));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP1750.CndR crtOpenMSBEP1750CndR(MAUCP_AppScreenOpener aso, HdrR r) {	
		mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg p = (mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1750.CndR to = mcframe.clientMSBE.MSBEP1750.CndR.create();

		if(!r.pl_reg_flg()) {
			to.ope(p.Cnd_ope_INS.getActionCommand());		//操作種別＠登録する
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				to.ope(p.Cnd_ope_UPD.getActionCommand());	//操作種別＠訂正する
			}
			else if (Cnd_ope_DEL.isSelected()) {
				to.ope(p.Cnd_ope_DEL.getActionCommand());	//操作種別＠取り消す
			}
			else {
				to.ope(p.Cnd_ope_SRCH.getActionCommand());	//操作種別＠参照する
			}
		}
		to.iv_no(r.iv_no());
		
		return to;
	}
	
	/**
	 * [MS_MSBBL1310_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Prnt02Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1310_Prnt02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[iv_prnt]の押下時の処理
	 */
	@Override
	public void doBtn_iv_prnt(MCEventInfo info) {
		callMS_MSBBL1310_Prnt02();
	}
	
	/**
	 * [MS_MSBBL1310_Srch05]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch05Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch05Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}
		
		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}
		
		@Override
		protected void show() {
			super.show();
			// 検索対象ＮＯをHdrブロックにコピー
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setIvHdrAmt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtData();
			setOrgAmt();
			setUpriSlsSchdNo();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchTgtMode();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchTgtMode();
		}
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBBL1310_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[ins_noschd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_noschd(MCEventInfo info) {

		callMS_MSBBL1310_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_schd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_schd(MCEventInfo info) {
		callMS_MSBBL1310_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1310_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1310_Del01();
	}

	/**
	 * [MS_MSBBL1310_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Sprt01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/** 更新ボタンのイベントかどうかを表すフラグ */
		protected boolean _upd_btn_event_flg = false;

		/** 続行不可能かどうかを表すフラグ */
		protected boolean _error_flg = false;

		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
		
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_tgtList = getSrchL(_upd_btn_event_flg);
			//更新ボタンイベントのときは同期にする
			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
		}

		protected MS_MSBBL1310_Sprt01Caller(P p, B b) {
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			//単価再取得ボタンイベントのときは必要に応じてメッセージを表示
			if (!_upd_btn_event_flg) {
				if (_tgtList.isEmpty()) {
					msgList.add(new MCMessage(MSBBP0010));
				}
			}
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setAll(bridge.up0(), getSrchL(_upd_btn_event_flg), createMap_UpriSrchR_DtlR());
		}

		@Override
		protected void show() {

			//Ins01,Upd01用に変更前の値をキャッシュ
			_tgtList.forEach(dr -> cacheUpri(dr));

			getUpriSrchL().clear();

			showMerge();
			for (UpriSrchR r : getUpriSrchL()) {
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), r.sls_upri());
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), r.interim_flg());
			}
		}

		@Override
		protected MCMessage msgExecConfirm() {
			if (!_upd_btn_event_flg) {
				return new MCMessage(MSBBP0011);
			}
			return null;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 単価取得に最低限必要な必須チェックのみ実施する
			msgList.addAll(panel.checkReq(Hdr_sls_dt));
			msgList.addAll(panel.checkReq(Hdr_cst_cd));
			if (!isCstIv()) {
				msgList.addAll(panel.checkReq(Hdr_sls_dpt_cd));
				if (!isNull(getHdrR().sls_dpt_cd())) {
					msgList.addAll(panel.checkReq(Hdr_wg_cd));
				}
			}
			msgList.addAll(panel.checkReq(Hdr_trd_cur_cd));
			for (DtlR r : getSrchL(_upd_btn_event_flg)) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
				if (isCstIv()) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_sls_dpt_cd));
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_wg_cd));
				}
			}

			if (!msgList.isEmpty()) {
				_error_flg = true;
			}
		}

		/**
		 * RowMapper
		 * @return
		 */
		protected Map_UpriSrchR_DtlR<UpriSrchR, DtlR> createMap_UpriSrchR_DtlR() {
			return new Map_UpriSrchR_DtlR<UpriSrchR, DtlR>();
		}

		public class Map_UpriSrchR_DtlR<D extends UpriSrchR, S extends DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpriSrchR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(UpriSrchR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(UpriSrchR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(UpriSrchR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(UpriSrchR.$dlv_cd, DtlR.$dlv_cd);
				addColumnPathMap(UpriSrchR.$dest_cd1, DtlR.$dest_cd1);
				addColumnPathMap(UpriSrchR.$dest_cd2, DtlR.$dest_cd2);
				addColumnPathMap(UpriSrchR.$dest_cd3, DtlR.$dest_cd3);
				addColumnPathMap(UpriSrchR.$trd_unit_cd, DtlR.$trd_unit_cd);
				addColumnPathMap(UpriSrchR.$trd_unit_qty, DtlR.$trd_unit_qty);
				addColumnPathMap(UpriSrchR.$wg_cd, DtlR.$wg_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dt(getHdrR().sls_dt());
				dest.cst_cd(getHdrR().cst_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
				if (!isCstIv()) {
					dest.wg_cd(getHdrR().wg_cd());
				}
			}
		}
	}

	/**
	 * [MS_MSBBL1310_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Prnt01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1310_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 上り電文の価格印字ＦＬＧに任意の明細の価格印字ＦＬＧの値をコピーする
			// 納品書を発行する状況では、明細の価格印字ＦＬＧは一意である前提である
			bridge.up0().pri_prnt_flg(getDtlL().get(0).pri_prnt_flg());
		}

	}

	/**
	 * [MS_MSBBL1310_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch04Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch04Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_DLV_TRNSTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}

		@Override
		protected void show() {
			super.show();
			// 検索対象ＮＯをHdrブロックにコピー
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setHdrPanelInitValue();			
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtDataSchd();
			setOrgAmt();
			setUpriSlsSchdNo();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}

	}
	/**
	 * 納品先関連項目設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setDlv(HdrR hdrR, MCList<DtlR> dtlL) {
		// 納品先ＣＤ
		MCList<DtlR> dlv_cdL = dtlL.groupBy(DtlR.$dlv_cd);
		if (dlv_cdL.size() != 1) {
			return;
		}

		// 納品先諸口ＦＬＧにより編集可否が変更されない項目は、一律コピー
		DtlR firstDtlR = dtlL.get(0);
		hdrR.dlv_cd(firstDtlR.dlv_cd());
		hdrR.dlv_sundry_flg(firstDtlR.dlv_sundry_flg());
		hdrR.pri_prnt_flg(getCopyFlg(dtlL, DtlR.$pri_prnt_flg));
		hdrR.cntry_cd(firstDtlR.cntry_cd());
		hdrR.cntry_nm(firstDtlR.cntry_nm());

		// 納品先諸口ＦＬＧにより編集可否が変更される項目は、同一であればコピー
		if(firstDtlR.dlv_sundry_flg()) {
			hdrR.dlv_nm(getCopyStr(dtlL, DtlR.$dlv_nm));
			hdrR.dlv_zip_cd(getCopyStr(dtlL, DtlR.$dlv_zip_cd));

			DtlR addr1R = getCopyR(dtlL, DtlR.$dlv_addr1);
			if (!isNull(addr1R)) {hdrR.dlv_addr1(addr1R.dlv_addr1());}

			DtlR addr2R = getCopyR(dtlL, DtlR.$dlv_addr2);
			if (!isNullOr(addr1R, addr2R)) {hdrR.dlv_addr2(addr2R.dlv_addr2());}

			DtlR addr3R = getCopyR(dtlL, DtlR.$dlv_addr3);
			if (!isNullOr(addr1R, addr2R, addr3R)) {hdrR.dlv_addr3(addr3R.dlv_addr3());}

			DtlR addr4R = getCopyR(dtlL, DtlR.$dlv_addr4);
			if (!isNullOr(addr1R, addr2R, addr3R, addr4R)) {hdrR.dlv_addr4(addr4R.dlv_addr4());}

			hdrR.dlv_tel(getCopyStr(dtlL, DtlR.$dlv_tel));
			hdrR.dlv_fax(getCopyStr(dtlL, DtlR.$dlv_fax));
			hdrR.dlv_cntct_dpt(getCopyStr(dtlL, DtlR.$dlv_cntct_dpt));
			hdrR.dlv_cntct_psn(getCopyStr(dtlL, DtlR.$dlv_cntct_psn));
		}
		else {
			hdrR.dlv_nm(firstDtlR.dlv_nm());
			hdrR.dlv_zip_cd(firstDtlR.dlv_zip_cd());
			hdrR.dlv_addr1(firstDtlR.dlv_addr1());
			hdrR.dlv_addr2(firstDtlR.dlv_addr2());
			hdrR.dlv_addr3(firstDtlR.dlv_addr3());
			hdrR.dlv_addr4(firstDtlR.dlv_addr4());
			hdrR.dlv_tel(firstDtlR.dlv_tel());
			hdrR.dlv_fax(firstDtlR.dlv_fax());
			hdrR.dlv_cntct_dpt(firstDtlR.dlv_cntct_dpt());
			hdrR.dlv_cntct_psn(firstDtlR.dlv_cntct_psn());
		}
	}

	/**
	 * 仕向先１～３設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setDest(HdrR hdrR, MCList<DtlR> dtlL) {
		DtlR dest01R = getCopyR(dtlL, DtlR.$dest_cd1, DtlR.$dest_nm1);
		if (!isNull(dest01R)) {
			hdrR.dest_cd1(dest01R.dest_cd1());
			hdrR.dest_nm1(dest01R.dest_nm1());
		}

		DtlR dest02R = getCopyR(dtlL, DtlR.$dest_cd2, DtlR.$dest_nm2);
		if (!isNull(dest02R) && !isNull(hdrR.dest_cd1())) {
			hdrR.dest_cd2(dest02R.dest_cd2());
			hdrR.dest_nm2(dest02R.dest_nm2());
		}

		DtlR dest03R = getCopyR(dtlL, DtlR.$dest_cd3, DtlR.$dest_nm3);
		if (!isNull(dest03R) && !isNull(hdrR.dest_cd2())) {
			hdrR.dest_cd3(dest03R.dest_cd3());
			hdrR.dest_nm3(dest03R.dest_nm3());
		}
	}

	/**
	 * コピー文字列取得
	 * 
	 * @param srcL 明細リスト
	 * @param tgtColNm 対象項目名
	 * @return コピー文字列
	 */
	protected String getCopyStr(MCList<DtlR> srcL, String tgtColNm) {
		String result = null;

		MCList<DtlR> grpL = srcL.groupBy(tgtColNm);
		if (grpL.size() == 1) {
			result = grpL.get(0).getStringNE(tgtColNm);
		}

		return result;
	}

	/**
	 * コピー行取得
	 * 
	 * @param srcL 明細リスト
	 * @param tgtColNm 対象項目名
	 * @return コピー文字列
	 */
	protected DtlR getCopyR(MCList<DtlR> srcL, String... tgtColNm) {
		DtlR result = null;

		MCList<DtlR> grpL = srcL.groupBy(tgtColNm);
		if (grpL.size() == 1) {
			result = grpL.get(0);
		}

		return result;
	}

	/**
	 * コピーＦＬＧ取得
	 * 
	 * @param srcL 対象リスト
	 * @param tgtColNm 対象項目名
	 * @return コピーＦＬＧ
	 */
	protected boolean getCopyFlg(MCList<DtlR> srcL, String tgtColNm) {
		boolean result = !srcL.isEmpty();

		if(!isNull(srcL.getFirst(tgtColNm, false))) {
			result = false;
		}

		return result;
	}

	/**
	 * [MS_MSBBL1310_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch03Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_SLO_TRNSTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}

		@Override
		protected void show() {
			super.show();
			// 検索対象ＮＯをHdrブロックにコピー
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setHdrPanelInitValue();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtDataSchd();
			setOrgAmt();
			setUpriSlsSchdNo();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}
	}

	/**
	 * [MS_MSBBL1310_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch02Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_QTN_TRNSTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
			Cnd_srch_tgt_rev.setMode(MCMode.REQUIRED);
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}

		@Override
		protected void show() {
			
			// 見積有効期限チェック
			if (bridge.down0().valid_dt().lt(getToday())) {
				if (confirm(MSBBP0006, toYMDString(bridge.down0().valid_dt())) != MCMessageBox.YES_OPTION) {
					clearContainers(bridge.down0(), bridge.down1(), bridge.down2());
				}
			}
			
			super.show();
			// 検索対象ＮＯをHdrブロックにコピー
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setHdrPanelInitValue();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtDataSchd();
			setOrgAmt();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}
	}

	/**
	 * [MS_MSBBL1310_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Srch01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1310_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (isREFOpe(getCndR().ope())) {
				bridge.up0().ref_flg(true);
			}
			else {
				bridge.up0().ref_flg(false);
			}
		}
		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
		}

		@Override
		protected void show() {
			super.show();
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			setIvHdrAmt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL().subList(createRowMatcherExceptEmpty()));
			//変更前の打切りFLGを設定。
			setOrgAbortFlg(getDtlL());
			copyAmtData();
			setOrgAmt();
			setUpriSlsSchdNo();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}
	}

	/**
	 * [MS_MSBBL1310_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Del01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1310_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setPrint(true);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * [MS_MSBBL1310_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Upd01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;

		protected MS_MSBBL1310_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSrchL(true);
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
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
			// 入力値チェック
			msgList.addAll(inptChk());
			// 単価変更チェック
			_tgtList.forEach(dr ->	
				setDiffLatestUpriMsg(_upriChngMsgList, dr));

			msgList.addAll(_upriChngMsgList);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			// 上り電文には裏リストを設定
			bridge.up2().setAll(exceptEmpty(_ioLAll));
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				msgList.addAll(checkDt());
				msgList.addAll(checkPort());
			}
		}
	}

	/**
	 * [MS_MSBBL1310_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1310_Ins01Caller<P extends MSBBP_SlsActReg, B extends MS_MSBBL1310_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/** 単価再取得時のメッセージを保持するリスト */
		MCMessageList _upriChngMsgList;
		/** 単価再取得対象のリスト */
		MCList<DtlR> _tgtList;
				
		protected MS_MSBBL1310_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
			_upriChngMsgList = new MCMessageList();
			_tgtList = getSrchL(true);
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
			setIvSrcTyp();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 上り電文には裏リストを設定
			bridge.up2().setAll(exceptEmpty(_ioLAll));
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
			// 入力値チェック
			msgList.addAll(inptChk());
			// 単価変更チェック
			_tgtList.forEach(dr ->
				setDiffLatestUpriMsg(_upriChngMsgList, dr));
			msgList.addAll(_upriChngMsgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				msgList.addAll(checkDt());
				msgList.addAll(checkPort());
			}
		}
	}
	/**
	 * 港の重複チェック
	 * 
	 * @param msgList
	 */
	protected MCMessageList checkPort() {
		
		MCMessageList msgList = new MCMessageList();
		
		if (!isNullOr(getHdrR().load_port_cd(), getHdrR().dschrg_port_cd())
				&& isSame(getHdrR().load_port_cd(), getHdrR().dschrg_port_cd())) {
			
			msgList.add(new MCMessage(MSBBP0102));
		}
		else if (!isNullOr(getHdrR().load_port_cd(), getHdrR().via_port_cd())
				&& isSame(getHdrR().load_port_cd(), getHdrR().via_port_cd())) {
			
			msgList.add(new MCMessage(MSBBP0102));
		}
		else if (!isNullOr(getHdrR().dschrg_port_cd(), getHdrR().via_port_cd())
				&& isSame(getHdrR().dschrg_port_cd(), getHdrR().via_port_cd())) {
			
			msgList.add(new MCMessage(MSBBP0102));
		}
		return msgList;
	}
	
	protected MCMessageList checkDt() {
		
		MCMessageList msgList = new MCMessageList();
		
		if (!getHdrR().pl_reg_flg()) {
			if (isNull(getHdrR().via_schd_dt())) {
				// 船積予定日≦船卸予定日
				msgList.addAll(checkBeforeAfter(Hdr_etd_dt, Hdr_eta_dt));
			}
			else {
				// 船積予定日≦経由予定日≦船卸予定日
				msgList.addAll(check3Dt(Hdr_etd_dt, Hdr_via_schd_dt, Hdr_eta_dt));
			}
		}
		return msgList;
	}
	@Override
	protected void jbInit() {
		super.jbInit();
		
		IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setFunctionKey(MCFunctionKey.F11);
	}

	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {

		MCMessageList msgL = new MCMessageList();
		// 引継なし、見積引継の場合は予定がないのでチェックしない
		if (isNull(getHdrR().ship_dlv_slip_no()) && isNull(getHdrR().slo_no())) {
			return msgL;
		}

		MCList<DtlR> chkTargetL = makeInptChkTargetList();
		
		if (!chkTargetL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.SLS.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_sls_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty,
					columnDtl_sls_qty, columnDtl_sls_schd_qty, chkTargetL,  
					columnDtl_trd_unit_qty, columnDtl_sls_schd_no));
		}
		return msgL;
	}
	
	protected String[] getGrpColums() {
		return new String[] {
				DtlR.$sls_schd_no, DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicy() {
		return new MCGroupByPolicy(getGrpColums());
	}
	
	protected MCList<DtlR> makeInptChkTargetList() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCIndexKey schdIdxKey = getDtlL().createIndex(DtlR.$sls_schd_no);
		
		MCList<DtlR> schdGroupL = getDtlL().groupBy(grpKey);
		for (DtlR schdGroupR : schdGroupL) {
			
			if (isNull(schdGroupR.sls_schd_no())) {
				continue;
			}
			
			chkTargetL.addAll(getDtlL().subList(schdIdxKey, schdGroupR.sls_schd_no()));
		}
		
		return chkTargetL;
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		// 検索対象区分により呼出オペレーションを切り替える
		if (MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1310_Srch01();
		}
		else {
			callMS_MSBBL1310_Srch05();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_ins]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ins(MCEventInfo info) {

		// 検索対象区分により呼出オペレーションを切り替える
		if (MSC_SLS_SRCH_TGT_TYP.isQTN_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1310_Srch02();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isSLO_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1310_Srch03();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isDLV_SLIP_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1310_Srch04();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isIV_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1310_Srch06();
		}
		else {
			message(checkReq(getCndR()));
		}
	}

	/**
	 * Panel[DtlBtn]のボタン[radd_noschd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd_noschd(MCEventInfo info) {
		insertRow(DtlTable);
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
		IoTable.deleteRows(getIoL());
		DtlR dr = deleteRow(DtlTable);
		MCList<IoR> chdIoL = getChildIoL(dr);
		if (!getDtlL().contains(dr)) {
			// 明細に紐付く詳細行をキャッシュから削除する
			_ioLAll.removeAll(chdIoL);
		}
		setHdrAmt();
		setIvHdrAmt();
		setHdrIncTaxAmt();
	}

	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		DtlR r = copyRow(DtlTable);
		setHdrAmt();
		setIvHdrAmt();
		setHdrIncTaxAmt();
		
		MCList<IoR> chdIoL = getChildIoL(r).clone();
		
		if(!isNull(r.dtl_row_id())) {
			r.dtl_row_id(nextCnt());
		}
		r.disp_seq(null);
		r.abort_qty(null);
		
		chdIoL.setStatus(MCRow.CREATE);
		chdIoL.setNumber(IoR.$dtl_row_id, r.dtl_row_id());
		chdIoL.setString(IoR.$sls_act_no, null);
		chdIoL.setNumber(IoR.$sls_act_seq, null);
		chdIoL.setString(IoR.$sls_act_d_no, null);
		chdIoL.setNumber(IoR.$sls_act_d_seq, null);
		chdIoL.setString(IoR.$sls_act_io_no, null);
		chdIoL.setNumber(IoR.$sls_act_io_seq, null);
		chdIoL.setString(IoR.$sls_act_d_no, null);
		chdIoL.setString(IoR.$ship_act_d_no, null);
		chdIoL.setString(IoR.$iv_d_no, null);
		// 裏リストへ追加
		_ioLAll.addAll(chdIoL);
		
		showChildIoL();
	}

	/**
	 * Panel[DtlBtn]のボタン[sprt_srch_upri]の押下時の処理
	 */
	@Override
	public void doDtlBtn_sprt_srch_upri(MCEventInfo info) {
		callMS_MSBBL1310_Sprt01();
	}

	/**
	 * Panel[IoBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doIoBtn_radd(MCEventInfo info) {

		if (!isDtlRowSelected()) {
			return;
		}

		IoR ioR = insertRow(IoTable);
		DtlR dtlR = DtlTable.getSelectedMCRow();

		// 明細一覧の選択行の品目情報を追加行へコピー
		copyDtl2IoItmInfo(ioR, dtlR);
		ioR.setStatus(MCRow.CREATE);

		// 裏リストへ追加
		_ioLAll.add(ioR);
	}

	/**
	 * Panel[IoBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doIoBtn_rdel(MCEventInfo info) {

		if (!isDtlRowSelected()) {
			return;
		}

		if (!isIoRowSelected()) {
			return;
		}

		IoR delIoR = deleteRow(IoTable);

		if (delIoR.isStatusCreate()) {
			_ioLAll.remove(delIoR);
		}
	}

	/**
	 * Panel[IoBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doIoBtn_rcopy(MCEventInfo info) {

		if (!isDtlRowSelected() || !isIoRowSelected()) {
			return;
		}

		IoR r = copyRow(IoTable);
		r.setStatus(MCRow.CREATE);

		// 裏リストへ追加
		_ioLAll.add(r);
	}

	/**
	 * Panel[IoBtn]のボタン[upd_dtl]の押下時の処理
	 */
	@Override
	public void doIoBtn_upd_dtl(MCEventInfo info) {

		_updDtlBtnExecFlg = true;
		// 詳細の数量を集計して親の明細の取引数量に設定する
		sumIoLQty2Dtl();
		_updDtlBtnExecFlg = false;
	}

	// ------------------------------------- Initialize -------------------------------------

	@Override
	protected void setupParts() {
		super.setupParts();

		// 登録枠
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_sls_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt, Hdr_srch_tgt_no);
		Hdr_cred_bal_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,
				Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_not_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,
				Hdr_trd_cur_amt_dec_place);

		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd,
				Hdr_sls_dt, true, Hdr_xrate_inpt_flg, true);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd,
				Hdr_xrate_cd, Hdr_sls_dt, true, Hdr_ptax_xrate_inpt_flg, true);

		// 明細
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg, columnDtl_stk_mng_typ);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2,columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ, 
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);

		Dtl_trd_upri_amt_p_PPanel.setRelateBeans(
				Hdr_trd_cur_cd, Hdr_cst_cd,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
				columnDtl_trd_unit_cd,
				columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place,
				Hdr_sls_amt_rnd_typ, Hdr_sls_tax_rnd_typ,
				Hdr_sls_upri_cng_flg, columnDtl_sls_upri_cng_flg, columnDtl_dscnt_itm_flg,
				columnDtl_upri_sls_schd_no,
				columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty,
				columnDtl_schd_trd_unit_conv_base_qty,
				columnDtl_schd_trd_unit_conv_qty,
				columnDtl_base_unit_dec_place,
				columnDtl_base_unit_rnd_typ
				);
		
		Dtl_cost_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_cost_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_cost_upri_p_PPanel.UpriTable.setCellConfig(new MAUDP_CellConfig());
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_xrate);
		Dtl_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, Hdr_xrate);
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, Hdr_ptax_xrate);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_sublot_mng_typ);
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_loc_cd, columnDtl_str_ln_tgt_flg);

		Dtl_ship_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_abort_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_abort_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_sls_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_abort_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_iv_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_iv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);

		// 詳細
		Io_trd_unit_qty_p_PPanel.setRelateBeans(columnIo_trd_unit_cd,
				columnIo_trd_unit_dec_place);
		Io_base_unit_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ,
				columnIo_trd_unit_qty, columnIo_trd_unit_conv_base_qty,
				columnIo_trd_unit_conv_qty);

		Io_sno_wrk_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_sno1_mng_typ,
				columnIo_sno2_mng_typ, columnIo_sno3_mng_typ, columnIo_sno4_mng_typ);
		Io_str_ln_p_PPanel.setRelateBeans(columnIo_loc_cd, columnIo_str_ln_tgt_flg);
		Io_lot_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_lot_mng_typ,
				columnIo_sublot_mng_typ);
		Io_ver_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, null, columnIo_ver_flg);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		_ioLAll = MCList.create(IoR.class);
		insInit();
		insDtInit();
		setDefaultSrcTgtTyp();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_sls_dpt_cd.addLCListener(this);

		Hdr_dlv_cd.addLCListener(this);
		Hdr_dlv_nm.addLCListener(this);
		Hdr_pri_prnt_flg.addNCListener(this);
		Hdr_lg_grp_cd.addLCListener(this);
		Hdr_dlv_zip_cd.addLCListener(this);
		Hdr_dlv_addr1.addLCListener(this);
		Hdr_dlv_addr2.addLCListener(this);
		Hdr_dlv_addr3.addLCListener(this);
		Hdr_dlv_addr4.addLCListener(this);
		Hdr_dlv_tel.addLCListener(this);
		Hdr_dlv_fax.addLCListener(this);
		Hdr_dlv_cntct_dpt.addLCListener(this);
		Hdr_dlv_cntct_psn.addLCListener(this);
		Hdr_ac_dt.addLCListener(this);
		Hdr_sls_usr_cd.addLCListener(this);

		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_base_cur_amt.addLCListener(this);
		columnDtl_cost_upri.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_str_ln_cd.addLCListener(this);
		columnDtl_str_ln_cd_none_flg.addNCListener(this);
		columnDtl_lot_no.addLCListener(this);
		columnDtl_sublot_no.addLCListener(this);
		columnDtl_ver_no.addLCListener(this);
		columnDtl_sno1.addLCListener(this);
		columnDtl_sno2.addLCListener(this);
		columnDtl_sno3.addLCListener(this);
		columnDtl_sno4.addLCListener(this);
		setListListener(DtlTable, getDtlRowListener());
		columnDtl_trd_unit_qty.addNCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_iv_upri.addLCListener(this);
		columnDtl_dlv_cd.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
	}

	/**
	 * 登録種別時の初期値設定
	 */
	protected void insInit() {
		getHdrR().base_cur_cd(getBaseCur().cur_cd());
		getHdrR().base_cur_nm(getBaseCur().cur_nm());
		getHdrR().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		getHdrR().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		Hdr_xrate_cd.setValue(getCo().sls_xrate_cd());

		getHdrR().ptax_cur_cd(getPtaxCur().cur_cd());
		getHdrR().ptax_cur_nm(getPtaxCur().cur_nm());
		getHdrR().ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
		getHdrR().ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());

		Hdr_lot_chk_off_flg.setValue(false);
		Hdr_dlv_slip_out_flg.setValue(true);
		Hdr_dlv_slip_prntd_flg.setValue(false);

		HdrPanel.focusFirstComponent();
	}

	protected void setHdrPanelInitValue() {
		if (Cnd_ope_INS.isSelected()) {
			insDtInit();
		}
		getHdrR().dlv_slip_out_flg(true);
	}

	/**
	 * ヘッダ枠の項目に検索後の初期値をセット
	 */
	protected void insDtInit() {
		getHdrR().sls_dt(getToday());
		getHdrR().ac_dt(getToday());
		setBillBasisDt();

		if (!isCstIv() && !MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())
				|| (isCstIv() && MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())
										&& getDtlL().subList(r -> r.sls_cststk_flg()).size() == 0)) {
			if (isNull(getHdrR().ship_dt())) {
				getHdrR().ship_dt(getToday());
				Hdr_ship_hm.setMode(MCMode.ENABLE);
			}
			if (isNull(getHdrR().dlv_dt())) {
				getHdrR().dlv_dt(getToday());
				Hdr_dlv_hm.setMode(MCMode.ENABLE);
			}
		}
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_sls_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);

		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_sls_dt);

		// 得意先
		linkBeansToISPanelCustom(Hdr_cst_cd, true);
	}

	protected void fillSpace() {
		if (Cnd_ope_INS.isSelected()) {
			DtlTable.fillSpace();
		}
	}

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
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}

	@Override
	protected void opePanelFillSpace() {
		for (MCTable<?> tbl : opePanelFillSpaceTables()) {
			// 詳細枠はFillSpaceしない
			if (tbl == IoTable) {
				continue;
			}
			// インボイス引継ぎの売上は行追加・削除・コピー不可のためFillSpaceしない
			if (!isNull(getHdrR().iv_no())
					&& !MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				continue;
			}
			tbl.fillSpace();
		}
	}
	// ------------------------------------- Mode -------------------------------------	

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setValueEx(Hdr_sls_dt, getToday()); // 画面起動時に売上部門を入力可能とする対応
		insInit();
		insDtInit();
		setModeBillBasisDt();
		setModeSlsCnsgn();
		setDtlBtnMode();
		setIoBtnMode();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setINS_QTN_TRNSTStatus() {
		super.setINS_QTN_TRNSTStatus();
		insInit();
		setDtlBtnMode();
		setModeBillBasisDt();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setINS_SLO_TRNSTStatus() {
		super.setINS_SLO_TRNSTStatus();
		setDtlBtnMode();
		setModeBillBasisDt();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setINS_DLV_TRNSTStatus() {
		super.setINS_DLV_TRNSTStatus();
		insInit();
		setDtlBtnMode();
		setModeBillBasisDt();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public void setINS_IV_TRNSTStatus() {
		super.setINS_IV_TRNSTStatus();
		insInit();
		setDtlBtnMode();
		setModeBillBasisDt();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public void setUPDStatus() {
		
		// 共通処理が動作するよう、setUPDStatusメソッドを実装し、定義したステータスに振り分ける
		HdrR hdr = getHdrR();
		if (!isNull(hdr.iv_no())) {
			if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				setUPD_NRMLStatus();
			}
			else {
				setUPD_IV_TRNSTStatus();
			}
		}
		else if (MAC_SLS_BASIS_TYP.isIN_BASIS(hdr.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdr.sls_basis_typ())) {
			setUPD_DLV_TRNSTStatus();
		}
		else if (!isNull(hdr.qtn_no()) && isNull(hdr.slo_no())) {
			setUPD_QTN_TRNSTStatus();
		}
		else if (!isNull(hdr.slo_no())) {
			setUPD_SLO_TRNSTStatus();
		}
		else {
			setUPD_NRMLStatus();
		}
		setDestCdMode();
	}

	@Override
	public void setUPD_QTN_TRNSTStatus() {
		super.setUPD_QTN_TRNSTStatus();
		setHdrPanelInitValue();
		setModeBillBasisDt();
		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPD_SLO_TRNSTStatus() {
		super.setUPD_SLO_TRNSTStatus();
		setHdrPanelInitValue();
		setModeBillBasisDt();
		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPD_DLV_TRNSTStatus() {
		super.setUPD_DLV_TRNSTStatus();
		setHdrPanelInitValue();
		setModeBillBasisDt();
		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setUPD_IV_TRNSTStatus() {
		super.setUPD_IV_TRNSTStatus();
		setHdrPanelInitValue();
		setModeBillBasisDt();
		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setUPD_NRMLStatus() {
		super.setUPD_NRMLStatus();
		setModeSlsCnsgn();
		setModeBillBasisDt();
		setHdrPanelInitValue();
		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		setIv();
		setDlvCstMode();
		setBtn_Open_MSBEP1750Mode();
		setPlCtrlMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setIv();
		if (MSC_SLS_SRCH_TGT_TYP.isQTN_NO(getCndR().srch_tgt_typ())) {
			Cnd_srch_tgt_rev.setMode(MCMode.REQUIRED);
		}
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setIv();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setIv();
		setBtn_Open_MSBEP1750Mode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setIv();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setIv();
		setBtnPrntMode();
		setBtn_Open_MSBEP1750Mode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setHdrPanelInitValue();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setIv();
		setBtn_Open_MSBEP1750Mode();
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 請求起算日のモードを設定する。
	 */
	protected void setModeBillBasisDt() {
		
		if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			Hdr_bill_basis_dt.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_bill_basis_dt);
		}
	}
	
	/**
	 * 請求締処理区分が売上都度請求の場合に、請求起算日をクリアする。
	 */
	protected void setBillBasisDt() {
		
		if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			Hdr_bill_basis_dt.clear();
		}
		else {
			if (isNull(getHdrR().bill_basis_dt())) {
				getHdrR().bill_basis_dt(getToday());
			}
		}
	}

	/**
	 * 	貸出売上時のモード制御
	 */
	protected void setModeSlsCnsgn() {

		if (MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
			Hdr_ship_dt.setMode(MCMode.READ_ONLY);
			Hdr_ship_hm.setMode(MCMode.READ_ONLY);
			Hdr_dlv_dt.setMode(MCMode.READ_ONLY);
			Hdr_dlv_hm.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_ship_dt);
			setDefaultMode(Hdr_dlv_dt);
		}
	}

	/*
	 * 	明細ボタンのモード制御
	 */
	protected void setDtlBtnMode() {
		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isUpdStatus()) {
			if (isNull(selectRow)) {
				setDefaultMode(DtlBtn_radd);
				setDefaultMode(DtlBtn_radd_noschd);
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			else if (!isNull(selectRow.qtn_d_no()) && isNull(selectRow.sls_schd_no())){
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
				setDefaultMode(DtlBtn_rdel);
			}
			// 行コピーは計画外の場合のみ可能
			else if (isTrnstDtlRow(selectRow)) {
				setDefaultMode(DtlBtn_radd);
				setDefaultMode(DtlBtn_radd_noschd);
				setDefaultMode(DtlBtn_rdel);
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_radd);
				setDefaultMode(DtlBtn_radd_noschd);
				setDefaultMode(DtlBtn_rdel);
				setDefaultMode(DtlBtn_rcopy);
			}
			//打切FLG＝オンの場合、行削除ボタンを無効
			if (!isNull(selectRow) && selectRow.abort_flg()){
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			if (getHdrR().pl_reg_flg()) {
				DtlBtn_radd.setMode(MCMode.DISABLE);
				DtlBtn_radd_noschd.setMode(MCMode.DISABLE);
				DtlBtn_rdel.setMode(MCMode.DISABLE);
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
			}
			if (isStkNotMngOnly()
					|| (!isNull(selectRow) 
							&& !selectRow.isEmpty() 
							&& (selectRow.isStatusDelete() 
									|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())
									|| !isEditable(columnDtl_loc_cd, DtlTable.getEventInfo().getEventIndex())))) {
				DtlBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
			}
		}
	}

	/**
	 * 	詳細ボタンブロックのモード設定
	 */
	protected void setIoBtnMode() {
		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isUpdStatus()) {
			
			if (isNull(selectRow) 
					|| selectRow.isEmpty()
					|| isNull(selectRow.itm_cd())
					|| selectRow.isStatusDelete()
					|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())
					|| !isEditable(columnIo_loc_cd, IoTable.getEventInfo().getEventIndex())) {
				IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
			}

			// 明細行未選択、明細行削除、非在庫品の場合は不可
			if (isNull(selectRow) || selectRow.isStatusDelete()
					|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())) {
				IoBtn_radd.setMode(MCMode.DISABLE);
				IoBtn_rcopy.setMode(MCMode.DISABLE);
				IoBtn_rdel.setMode(MCMode.DISABLE);
				return;
			}

			// 納品書ＮＯ検索の場合は行追加・コピー不可
			if (!isNull(selectRow.dlv_slip_d_no())
					&& (MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ()))) {
				IoBtn_radd.setMode(MCMode.DISABLE);
				IoBtn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_radd);
				if (isNull(IoTable.getSelectedMCRow())) {
					IoBtn_rcopy.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(IoBtn_rcopy);
				}
			}
			setDefaultMode(IoBtn_rdel);
			// インボイス引継で出荷済の場合に変更できない項目の制御
			// 未出荷となるのは預り、または出荷指図対象外で出荷実績をスキップした場合でどちらも出荷基準
			if ((isSame(getStatus(), INS_IV_TRNST) || isSame(getStatus(), UPD_IV_TRNST))
					&& !MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())) {
				IoBtn_radd.setMode(MCMode.DISABLE);
				IoBtn_rcopy.setMode(MCMode.DISABLE);
				IoBtn_rdel.setMode(MCMode.DISABLE);
				IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
		}
	}
	
	/**
	 * 仕向先の表示モードを設定する。
	 */
	protected void setDestCdMode() {

		if (isNull(getHdrR().dest_cd1())) {
			
			Hdr_dest_cd2.clear();
			Hdr_dest_cd2.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_dest_cd2);
		}
		
		if (isNull(getHdrR().dest_cd2())) {
			
			Hdr_dest_cd3.clear();
			Hdr_dest_cd3.setMode(MCMode.READ_ONLY);
		}
		else{
			setDefaultMode(Hdr_dest_cd3);
		}
	}
	// ------------------------------------- I/F -------------------------------------	

	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getHdrR());
		ret.add(getDtlL());
		ret.add(getIoL());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getCndR());
		return ret;
	}

	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRevNoMode();
	}

	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	@Override
	public MCRowBeans getCndRevNo() {
		return Cnd_srch_tgt_rev;
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);

		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {

			if (cont == getHdrR()) {
				l.add(HdrR.$sls_act_no);
				l.add(HdrR.$sls_act_seq);
				l.add(HdrR.$sls_act_rev);
				l.add(HdrR.$sls_dt);
				l.add(HdrR.$ac_dt);
				l.add(HdrR.$ac_ym);
				l.add(HdrR.$bill_basis_dt);
				l.add(HdrR.$ship_dt);
				l.add(HdrR.$ship_hm);
				l.add(HdrR.$dlv_dt);
				l.add(HdrR.$dlv_hm);
				l.add(HdrR.$dlv_slip_no);
				l.add(HdrR.$ship_act_no);
				l.add(HdrR.$ship_dlv_slip_no);
				l.add(HdrR.$iv_no);
				l.add(HdrR.$iv_rev);
			}
			else if (cont == getDtlL()) {
				l.add(DtlR.$sls_act_no);
				l.add(DtlR.$sls_act_seq);
				l.add(DtlR.$sls_act_d_no);
				l.add(DtlR.$sls_act_d_seq);
				l.add(DtlR.$qtn_d_no);
				l.add(DtlR.$slo_d_no);
				l.add(DtlR.$dlv_slip_d_no);
				l.add(DtlR.$sls_schd_no);
				l.add(DtlR.$sls_dtl_upd_flg);
				l.add(DtlR.$init_trd_cur_tax_amt);
				l.add(DtlR.$init_trd_unit_cd);
				l.add(DtlR.$init_trd_unit_qty);
				l.add(DtlR.$init_trd_cur_upri);
				l.add(DtlR.$init_inc_tax_flg);
				l.add(DtlR.$init_tax_rate);
				l.add(DtlR.$init_trd_cur_dscnt_amt);
				l.add(DtlR.$db_trd_unit_cd);
				l.add(DtlR.$db_trd_unit_conv_qty);
				l.add(DtlR.$db_trd_unit_conv_base_qty);
				l.add(DtlR.$db_trd_unit_dec_place);
				l.add(DtlR.$db_trd_unit_rnd_typ);
				l.add(DtlR.$db_trd_unit_qty);
				l.add(DtlR.$db_trd_cur_amt);
				l.add(DtlR.$db_trd_cur_dscnt_amt);
				l.add(DtlR.$db_trd_cur_tax_amt);
				l.add(DtlR.$db_trd_cur_upri);
				l.add(DtlR.$db_wtax_rate);
				l.add(DtlR.$db_tax_rate);
				l.add(DtlR.$db_inc_tax_flg);
				l.add(DtlR.$ship_dlv_slip_d_no);
				l.add(DtlR.$slo_no);
				l.add(DtlR.$qtn_no);
				l.add(DtlR.$qtn_rev);
				l.add(DtlR.$iv_d_no);
				l.add(DtlR.$dlv_slip_no);
				l.add(DtlR.$ship_act_no);
				l.add(DtlR.$cst_po_no);
				l.add(DtlR.$cst_po_d_no);
				l.add(DtlR.$upri_sls_schd_no);
			}
			else if (cont == getIoL()) {
				l.add(IoR.$sls_act_no);
				l.add(IoR.$sls_act_seq);
				l.add(IoR.$sls_act_d_no);
				l.add(IoR.$sls_act_d_seq);
				l.add(IoR.$sls_act_io_no);
				l.add(IoR.$sls_act_io_seq);
				l.add(IoR.$ship_act_d_no);
				l.add(IoR.$iv_d_no);
			}
		}
		else if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {

			if (cont == getDtlL()) {
				l.add(DtlR.$sls_act_no);
				l.add(DtlR.$sls_act_seq);
				l.add(DtlR.$sls_act_d_no);
				l.add(DtlR.$sls_act_d_seq);
				l.add(DtlR.$sls_act_no);
				l.add(DtlR.$qtn_d_no);
				l.add(DtlR.$slo_d_no);
				l.add(DtlR.$dlv_slip_d_no);
				l.add(DtlR.$slo_d_no);
				l.add(DtlR.$sls_schd_no);
				l.add(DtlR.$sls_dtl_upd_flg);
				l.add(DtlR.$init_trd_cur_tax_amt);
				l.add(DtlR.$init_trd_unit_cd);
				l.add(DtlR.$init_trd_unit_qty);
				l.add(DtlR.$init_trd_cur_upri);
				l.add(DtlR.$init_inc_tax_flg);
				l.add(DtlR.$init_tax_rate);
				l.add(DtlR.$init_trd_cur_dscnt_amt);
				l.add(DtlR.$db_trd_unit_cd);
				l.add(DtlR.$db_trd_unit_conv_qty);
				l.add(DtlR.$db_trd_unit_conv_base_qty);
				l.add(DtlR.$db_trd_unit_dec_place);
				l.add(DtlR.$db_trd_unit_rnd_typ);
				l.add(DtlR.$db_trd_unit_qty);
				l.add(DtlR.$db_trd_cur_amt);
				l.add(DtlR.$db_trd_cur_dscnt_amt);
				l.add(DtlR.$db_trd_cur_tax_amt);
				l.add(DtlR.$db_trd_cur_upri);
				l.add(DtlR.$db_wtax_rate);
				l.add(DtlR.$db_tax_rate);
				l.add(DtlR.$db_inc_tax_flg);
				l.add(DtlR.$ship_dlv_slip_d_no);
				l.add(DtlR.$slo_no);
				l.add(DtlR.$qtn_no);
				l.add(DtlR.$qtn_rev);
				l.add(DtlR.$iv_d_no);
				l.add(DtlR.$dlv_slip_no);
				l.add(DtlR.$ship_act_no);
				l.add(DtlR.$cst_po_no);
				l.add(DtlR.$cst_po_d_no);
				l.add(DtlR.$upri_sls_schd_no);
			}
			else if (cont == getIoL()) {
				l.add(IoR.$sls_act_no);
				l.add(IoR.$sls_act_seq);
				l.add(IoR.$sls_act_d_no);
				l.add(IoR.$sls_act_d_seq);
				l.add(IoR.$sls_act_io_no);
				l.add(IoR.$sls_act_io_seq);
				l.add(IoR.$ship_act_d_no);
				l.add(IoR.$iv_d_no);
			}

		}
		return l;
	}

	// ------------------------------------- ListLogic -------------------------------------	
	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		else {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	@Override
	public MCList<?> getHdr_cst_cd(MCRow row, MCEventInfo info) {
			
		row.setStringNE(BpCols.$i_dlv_cd, getHdrR().dlv_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.CST_BY_DLV.value());
		if (isSame(getStatus(), UPD_NRML)) {
			row.addBooleanColumn(BpCols.$i_cst_iv_flg, false);
		}
		return super.getHdr_cst_cd(row, info);
	}

	@Override
	public MCList<?> getDtl_sls_rsn_cd(MCRow row, MCEventInfo info) {

		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		
		if (!isNull(dtlR.trd_cur_upri()) && dtlR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getDtl_sls_rsn_cd(row, info);
	}

	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}

	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {

		int index = info.getEventIndex();
		return super.getDtl_itm_p_PPanel_columnItm_itm_cd(setBindDtl_itm_cd(row, index),
				info);
	}

	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub1(
				setBindDtl_itm_cd(row, index), info);
	}

	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub2(
				setBindDtl_itm_cd(row, index), info);
	}

	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info) {
		int index = info.getEventIndex();
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub3(
				setBindDtl_itm_cd(row, index), info);
	}

	protected MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
					MSC_SLS_SRCH_TGT_TYP.QTN_NO, MSC_SLS_SRCH_TGT_TYP.SLO_NO,
					MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO
					,MSC_SLS_SRCH_TGT_TYP.IV_NO
			};
		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
				,MSC_SLS_SRCH_TGT_TYP.IV_NO
			};
		}
	}

	protected void setDefaultSrcTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, null);
		}
		else {
			if (isNull(getCndR().srch_tgt_typ())) {
				setValueEx(Cnd_srch_tgt_typ, MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.value());
				setValueEx(Cnd_srch_tgt_typ_nm, MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
		}
	}

	@Override
	public MCList<?> getListForIS(MCEventBeans compo, MCRow row, MCEventInfo info) {
		if (compo == Hdr_cst_cd && compo instanceof MCLinkBeans) {
			// リストロジック経由で取得する
			// 入力補助画面経由の場合、手入力した得意先が条件に含まれない
			return super.getHdr_cst_cd(
				getBindRowForISCustom(row, (MCLinkBeans)compo, info.getEventIndex()), info);
		}
		if (compo == columnDtl_dlv_cd && compo instanceof MCLinkBeans) {
			return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(
				getBindRowForISCustom(row, (MCLinkBeans)compo, info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_itm_cd || beans == columnDtl_itm_sub1
				|| beans == columnDtl_itm_sub2 || beans == columnDtl_itm_sub3) {
			setBindDtl_itm_cd(row, eventIndex);
		}
		if (beans == Hdr_cst_cd) {
			if (isSame(getStatus(), UPD_NRML)) {
				row.setBooleanNE(BpCols.$i_cst_iv_flg, false);
			}
		}
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().sls_dt());
			if (isStkNotMngOnly() && !MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
				// 貸出売上時、在庫品のみ
				// 出荷済の場合、または受注引継の場合、非在庫品のみ
				bind.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK2.value());
			}
		}
		return row;
	}
	/**
	 * 	品目マスタリストロジックの検索条件を設定する
	 * @param bind
	 * @return
	 */
	protected MCRow setBindDtl_itm_cd(MCRow bind, int index) {
		if (index < 0) {
			return bind;
		}

		if (MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
			// 貸出売上時、在庫品のみ
		}
		else if (isStkNotMngOnly()) {
			// 出荷済の場合、または受注引継の場合、非在庫品のみ
			bind.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK2.value());
		}
		else {
			// 計画外売上、見積引継時の場合、画面実装仕様書に定義された条件(在庫品、非在庫品）に準拠
		}

		return bind;
	}
	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().sls_dt());
		if (isStkNotMngOnly() && !MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
			// 貸出売上時、在庫品のみ
			// 出荷済の場合、または受注引継の場合、非在庫品のみ
			row.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ,
					MAC_ITM_IS_SRCH_TYP.STK2.value());
		}
		return super.getDtl_cst_itm_cd(row, info);
	}

	@Override
	public void openISPanel(MCLinkBeans beans, int i) {
		if (columnDtl_cst_itm_cd == beans) {
			ISPanelLinker ret = getISPanelLinkerNE(beans);
			if (ret != null && ret.isEnable()) {
				MCMessageList msgList = new MCMessageList();
				chkOpenMSUAP1140Req(msgList);

				if (!msgList.isEmpty()) {

					message(msgList);
					return;
				}
				super.openISPanel(beans, i);
			}
		}
		else {
			super.openISPanel(beans, i);
		}
	}

	/**
	 * 得意先品目入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1140Req(MCMessageList msgList) {
		msgList.addAll(checkReq(Hdr_cst_cd));
		msgList.addAll(checkReq(Hdr_sls_dt));

	}

	protected class CstItmListPutter extends MCListPutter {

		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}

		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();

			MCRow setRow = createPanelRow(compo, index, isNull(row) ? MCRow.create() : row);
			DtlR selectRow = DtlTable.getRow(index);

			if (!MCMode.READ_ONLY.equals(DtlTable.isCellEditable(index, Dtl_itm_p_PPanel.columnItm_itm_cd))
					&& !isNull(setRow.getStringNE("itm_cd"))) {
				return compo.setValues(index, setRow);
			}

			setRow.setStringNE("itm_cd", selectRow.itm_cd());
			setRow.setStringNE("itm_sub1", selectRow.itm_sub1());
			setRow.setStringNE("itm_sub2", selectRow.itm_sub2());
			setRow.setStringNE("itm_sub3", selectRow.itm_sub3());

			return compo.setValues(index, setRow);
		}
	}

	@Override
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo,
			String... columns) {
		MCListPutter lp = new CstItmListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}

	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
	}

	// ------------------------------------- Event -------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_sls_dpt_cd) doHdr_sls_dpt_cd_LC(info);

		if (lc == Hdr_dlv_cd) doHdr_dlv_cd_LC(info);
		if (lc == Hdr_dlv_nm) doHdr_dlv_nm_LC(info);
		if (lc == Hdr_dlv_zip_cd) doHdr_dlv_zip_cd_LC(info);
		if (lc == Hdr_dlv_addr1) doHdr_dlv_addr1_LC(info);
		if (lc == Hdr_dlv_addr2) doHdr_dlv_addr2_LC(info);
		if (lc == Hdr_dlv_addr3) doHdr_dlv_addr3_LC(info);
		if (lc == Hdr_dlv_addr4) doHdr_dlv_addr4_LC(info);
		if (lc == Hdr_lg_grp_cd) doHdr_lg_grp_cd_LC(info);
		if (lc == Hdr_dlv_tel) doHdr_dlv_tel_LC(info);
		if (lc == Hdr_dlv_fax) doHdr_dlv_fax_LC(info);
		if (lc == Hdr_dlv_cntct_dpt) doHdr_dlv_cntct_dpt_LC(info);
		if (lc == Hdr_dlv_cntct_psn) doHdr_dlv_cntct_psn_LC(info);
		if (lc == Hdr_ac_dt) doHdr_ac_dt_LC(info);
		if (lc == Hdr_sls_usr_cd) doHdr_sls_usr_cd_LC(info);

		if (Dtl_itm_p_PPanel.isItm(lc)) doDtl_itm_LC(info);
		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		if (lc == columnDtl_ver_no) doDtl_ver_no_LC(info);
		if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		if (lc == columnDtl_cost_upri) doDtl_cost_upri_LC(info); 
		if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_base_cur_amt) doDtl_base_cur_amt_LC(info);
		if (lc == columnDtl_trd_cur_inc_tax_amt) doDtl_trd_cur_inc_tax_amt_LC(info);
		if (lc == columnDtl_iv_upri) doDtl_iv_upri_LC(info);
		if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		if (lc == columnDtl_tax_cd) doDtl_tax_cd_LC(info);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == Hdr_pri_prnt_flg) doHdr_pri_prnt_flg_NC(info);
		if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
	}

	/**
	 * 種別変更イベント
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setDefaultSrcTgtTyp();

		if (Cnd_ope_INS.isSelected()) {
			insDtInit();
		}

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSrchTgtMode();
		}
		else {
			setDefaultMode(Cnd_latest_flg);
			setDefaultMode(Cnd_srch_tgt_rev);
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {

		// 登録枠のクリア確認
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();
		String beforMode = this.getStatus();
		// 参照種別から訂正、取り消しの種別に遷移するときは、過去リビジョンの場合は遷移できないようにする
		if ((isREFOpe(beforeOpe) && isREFStatus(beforMode)) && (isUPDOpe(afterOpe) || isDELOpe(afterOpe))) {
			if (!Hdr_latest_flg.getValue()) {
				dialog(msgPastRevisionCannotChanged());
				return false;
			}
		}
		return true;
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			if (isCstIv()) {
				getCndR().srch_tgt_no(getHdrR().iv_no());
				getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.IV_NO.value());
				getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else {
				getCndR().srch_tgt_no(getHdrR().sls_act_no());
				getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.value());
				getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			setRefToInsInit();
		}
	}

	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt) {

		// 引継された伝票は参照登録不可
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			HdrR hdr = getHdrR();
			if (!isNull(hdr.iv_no()) && !MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				dialog(MSBBP0101);
				return false;
			}
			if (MAC_SLS_BASIS_TYP.isIN_BASIS(hdr.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(hdr.sls_basis_typ())) {
				dialog(MSBBP0009);
				return false;
			}
			if (!isNull(hdr.slo_no())) {
				dialog(MSBBP0008);
				return false;
			}
			if (!isNull(hdr.qtn_no())) {
				dialog(MSBBP0007);
				return false;
			}
		}
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) &&
				(isSame(afOpe, Cnd_ope_UPD.getActionCommand()) || isSame(afOpe, Cnd_ope_DEL.getActionCommand()))) {
			HdrR hdr = getHdrR();
			if (!isNull(hdr.iv_no()) && MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(getCndR().srch_tgt_typ())) {
				dialog(MSBBP0106);
				return false;
			}
		}
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			if (isCstIv()) {
				getCndR().srch_tgt_no(getHdrR().iv_no());
				getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.IV_NO.value());
				getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.IV_NO.name());
			}
			else {
				getCndR().srch_tgt_no(getHdrR().sls_act_no());
				getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.value());
				getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			}
		}

		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}
	protected void setSrchTgtMode() {
		if (MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(Cnd_srch_tgt_typ.getValue())) {
			Cnd_latest_flg.setMode(MCMode.REQUIRED);
			Cnd_srch_tgt_rev.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_latest_flg.setValue(true);
			Cnd_srch_tgt_rev.clear();
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
		}
	}
	protected void setRefToInsInit() {

		Hdr_sls_act_no.clear();
		Hdr_sls_act_rev.clear();
		Hdr_sls_act_seq.clear();
		Hdr_dlv_slip_no.clear();
		Hdr_can_ac_dt_for_input.clear();
		Hdr_can_ac_dt.clear();
		Hdr_ac_dt_after_srch.clear();
		Hdr_edi_flg.clear();
		
		setValueEx(columnDtl_sls_act_d_no, null);
		setValueEx(columnDtl_sls_act_d_seq, null);

		setValueEx(columnIo_sls_act_io_no, null);
		
		for (IoR r : _ioLAll) {
			r.sls_act_d_no(null);
			r.sls_act_io_no(null);
			r.sls_act_io_seq(null);
			r.sls_act_no(null);
			r.sls_act_seq(null);
			r.sls_act_d_seq(null);
			r.ship_act_d_no(null);
			r.setStatus(MCRow.CREATE);
		}
	}

	@Override
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		if (!super.doHdr_trd_cd_VC(info)) {
			return false;
		}
		return isStatusNone(getDtlL(), _ioLAll) || confirmRegDataClear();
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);

		String trdPtnTyp = getHdrR().trd_ptn_typ();
		DtlTable.clear();
		IoTable.clear();
		_ioLAll.clear();
		if (isNull(trdPtnTyp)) {
			getHdrR().sls_basis_typ(null);
			getHdrR().sls_basis_typ_nm(null);
		}
		else if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)) {
			getHdrR().sls_basis_typ(MAC_SLS_BASIS_TYP.SHIP_BASIS.value());
			MAC_SLS_BASIS_TYP.putNameNE(getHdrR(), HdrR.$sls_basis_typ, HdrR.$sls_basis_typ_nm);
		}
		else if (MAC_TRD_PTN_TYP.isSLS_CNSGN(trdPtnTyp)) {
			getHdrR().sls_basis_typ(null);
			getHdrR().sls_basis_typ_nm(null);
			Hdr_ship_dt.clear();
			Hdr_dlv_dt.clear();
		}

		setModeSlsCnsgn();
		fillSpace();
	}
	@Override
	public void doHdr_ar_dpt_cd_LC(MCEventInfo info) {
		super.doHdr_ar_dpt_cd_LC(info);
		if (isCstIv()) {
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				dtlR.ar_dpt_cd(getHdrR().ar_dpt_cd());
				dtlR.ar_dpt_nm(getHdrR().ar_dpt_nm());
			}
		}
	}
	@Override
	public void doCnd_srch_tgt_typ_LC(MCEventInfo info) {
		super.doCnd_srch_tgt_typ_LC(info);
		if (MSC_SLS_SRCH_TGT_TYP.isQTN_NO((String)info.getNewValue())) {
			Cnd_latest_flg.setValue(false);
			Cnd_srch_tgt_no.setMode(MCMode.REQUIRED);
			Cnd_srch_tgt_rev.setMode(MCMode.REQUIRED);
		}
		else if (isNull(info.getNewValue())) {
			Cnd_latest_flg.setValue(false);
			Cnd_srch_tgt_no.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_no.clear();
			Cnd_srch_tgt_rev.clear();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSrchTgtMode();
		}
		else {
			Cnd_latest_flg.setValue(true);
			Cnd_srch_tgt_no.setMode(MCMode.REQUIRED);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
		}
	}

	protected void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		if (MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())){
			Hdr_ar_dpt_cd.setValue(getHdrR().sls_dpt_cd()); 
		}
		setDefaultCostUpri();
		if (isCstIv()) {
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				dtlR.sls_dpt_cd(getHdrR().sls_dpt_cd());
				dtlR.sls_dpt_nm(getHdrR().sls_dpt_nm());
				dtlR.wg_cd(getHdrR().wg_cd());
				dtlR.wg_nm(getHdrR().wg_nm());
			}
		}
	}

	@Override
	public void doHdr_def_cst_cd_NC(MCEventInfo info) {
		super.doHdr_def_cst_cd_NC(info);
		
		setCstCd();
	}

	protected void setCstCd() {
		// 「検索結果がありません」メッセージを回避するために、入力補助画面の処理を実装させない。
		linkBeansToISPanelCustom(Hdr_cst_cd, false);
		Hdr_cst_cd.setValue(getHdrR().def_cst_cd());
		linkBeansToISPanelCustom(Hdr_cst_cd, true);
	}

	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		super.doHdr_cst_cd_LC(info);

		setCredBal();

		// 画面で表示されている値を変更時一旦クリアする
		setValueEx(Hdr_sls_usr_cd, null);
		setValueEx(Hdr_sls_dpt_cd, null);

		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}

		for (DtlR r : getDtlL()) {
			// インボイス表記品名をクリアしておく
			if (!isCstIv()) {
				setValueEx(columnDtl_iv_itm_nm, null);
			}
			if (r.isStatusCreate() || r.isStatusModify()
					|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
				int index = r.getGUIIndex();

				setDefaultBillCrryovrTimes(index);
				setDefaultTaxCd(index, true);
				setIvItmNm(r);
				setIvAmt(r);
				setArDpt(r);
			}
		}
		
		setCstItm(false);
		setModeBillBasisDt();
		setBillBasisDt();
		setIv();
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		
		setCredBal();
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
		}
	}
	
	/**
	 * 与信枠残高を設定する。
	 */
	protected void setCredBal() {
		
		if (!isNull(getHdrR().cst_cd()) && !isNull(getHdrR().trd_cur_cd())) {
			// 与信枠残高取得
			getHdrR().cred_bal(MSUCP_ArUtil.getCredBal(getHdrR().cst_cd(), getHdrR().trd_cur_cd(), this));
		}
		else {
			getHdrR().cred_bal(null);
		}
	}
	@Override
	public void doHdr_num_flg_NC(MCEventInfo info) {
		
		super.doHdr_num_flg_NC(info);
		
		setValueEx(Hdr_iv_no, null);
		if (getHdrR().num_flg()) {
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_iv_no);
		}
	}
	
	/**
	 * インボイス対象/対象外に応じた画面制御を行う
	 */
	protected void setIv() {
		
		if (!isCstIv()) {
			// インボイスタブの非活性化
			HdrTabTab.setEnabledAt(HdrTabTab.indexOfComponent(Hdr2Panel), false);
			
			// 初期値と表示モードの設定
			if (isUpdStatus()) {
				initIv();
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
				Hdr_iv_dt.setMode(MCMode.READ_ONLY);
				Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_sls_dpt_cd.setMode(MCMode.REQUIRED);
				Hdr_ar_dpt_cd.setMode(MCMode.REQUIRED);
				if (MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ())
						|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ())
						|| MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
					Hdr_ship_dt.setMode(MCMode.READ_ONLY);
					Hdr_ship_hm.setMode(MCMode.READ_ONLY);
					Hdr_dlv_dt.setMode(MCMode.READ_ONLY);
					Hdr_dlv_hm.setMode(MCMode.READ_ONLY);
				}
				else {
					Hdr_ship_dt.setMode(MCMode.REQUIRED);
					if (isNull(Hdr_ship_dt.getValue())) {
						Hdr_ship_hm.setMode(MCMode.READ_ONLY);
					}
					else {
						Hdr_ship_hm.setMode(MCMode.ENABLE);
					}
					Hdr_dlv_dt.setMode(MCMode.REQUIRED);
					if (isNull(Hdr_dlv_dt.getValue())) {
						Hdr_dlv_hm.setMode(MCMode.READ_ONLY);
					}
					else {
						Hdr_dlv_hm.setMode(MCMode.ENABLE);
					}
				}
				Hdr_dlv_slip_out_flg.setMode(MCMode.REQUIRED);
				setValueEx(Hdr_dlv_slip_out_flg, true);
			}
			for (MCColumnConfig r : getIvCtrlDtlCol()) {
				r.setMode(MCMode.INVISIBLE);
			}
		}
		else {
			// インボイスタブの活性化
			HdrTabTab.setEnabledAt(HdrTabTab.indexOfComponent(Hdr2Panel), true);
			
			// 初期値のセット
			getHdrR().dlv_slip_out_flg(false);
			getHdrR().iv_immed_prnt_flg(true);
			if (isINSStatus(getStatus())) {
				setValueEx(Hdr_iv_no, null);
				setValueEx(Hdr_iv_dt, getToday());
				setValueEx(Hdr_iv_prnt_flg, false);
				setValueEx(Hdr_pl_skip_flg, true);
				setValueEx(Hdr_pl_reg_flg, false);
				for (DtlR r : getDtlL()) {
					r.iv_d_no(null);
				}
			}
			
			// 表示モードの設定
			Hdr_dlv_slip_out_flg.setMode(MCMode.READ_ONLY);
			if (isUpdStatus()) {
				setDefaultMode(Hdr_iv_no);
				setDefaultMode(Hdr_iv_dt);
				Hdr_sls_dpt_cd.setMode(MCMode.ENABLE);
				Hdr_ar_dpt_cd.setMode(MCMode.ENABLE);
				
				if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ()) && isSame(getStatus(), UPD_NRML)) {
					Hdr_pl_skip_flg.setMode(MCMode.REQUIRED);
				}
				if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
					Hdr_rcv_schd_dt.setMode(MCMode.REQUIRED);
				}
				if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())
						|| (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ()) 
								&& getDtlL().subList(r -> r.sls_cststk_flg()).size() == 0)) {
					Hdr_ship_dt.setMode(MCMode.REQUIRED);
					if (isNull(Hdr_ship_dt.getValue())) {
						Hdr_ship_hm.setMode(MCMode.READ_ONLY);
					}
					else {
						Hdr_ship_hm.setMode(MCMode.ENABLE);
					}
					Hdr_dlv_dt.setMode(MCMode.REQUIRED);
					if (isNull(Hdr_dlv_dt.getValue())) {
						Hdr_dlv_hm.setMode(MCMode.READ_ONLY);
					}
					else {
						Hdr_dlv_hm.setMode(MCMode.ENABLE);
					}
				}
				else {
					Hdr_ship_dt.setMode(MCMode.READ_ONLY);
					Hdr_ship_hm.setMode(MCMode.READ_ONLY);
					Hdr_dlv_dt.setMode(MCMode.READ_ONLY);
					Hdr_dlv_hm.setMode(MCMode.READ_ONLY);
				}
			}
			if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				columnDtl_trd_cd.setMode(MCMode.INVISIBLE);
				columnDtl_trd_nm.setMode(MCMode.INVISIBLE);
				columnDtl_cst_po_no.setMode(MCMode.INVISIBLE);
			}
			
			for (MCColumnConfig r : getIvCtrlDtlCol()) {
				setDefaultMode(r);
			}
		}
	}
	
	/**
	 * インボイス対象/対象外の制御に使用する明細項目
	 */
	protected MCColumnConfig[] getIvCtrlDtlCol() {
		return new MCColumnConfig[] {
			columnDtl_trd_cd
			, columnDtl_trd_nm
			, columnDtl_cntry_org_cd
			, columnDtl_cntry_org_nm
			, columnDtl_iv_itm_nm
			, columnDtl_iv_upri
			, columnDtl_iv_amt
			, columnDtl_iv_d_rmrks
			, columnDtl_iv_trd_rmrks
			, columnDtl_iv_trd_d_rmrks
			, columnDtl_iv_intr_d_rmrks
			, columnDtl_iv_sub_char1
			, columnDtl_iv_sub_char2
			, columnDtl_iv_sub_char3
			, columnDtl_sls_usr_cd
			, columnDtl_sls_usr_nm
			, columnDtl_sls_dpt_cd
			, columnDtl_sls_dpt_nm
			, columnDtl_wg_cd
			, columnDtl_wg_nm
			, columnDtl_ar_dpt_cd
			, columnDtl_ar_dpt_nm
			, columnDtl_iv_d_no
			, columnDtl_dlv_slip_no
			, columnDtl_sls_act_no
			, columnDtl_cst_po_no
			, columnDtl_qtn_no
			, columnDtl_qtn_rev
			, columnDtl_slo_no
		};
	}
	
	protected void setDlvCstMode() {
		if (isCstIv()) {
			Hdr_dlv_cd.setMode(MCMode.READ_ONLY);
			Hdr_cst_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * インボイス作成元区分を設定する。
	 */
	protected void setIvSrcTyp() {
		if (isCstIv()) {
			if (isSame(getStatus(), INS)) {
				setValueEx(Hdr_iv_src_typ, MSC_IV_SRC_TYP.SLS.value());
			}
		}
		else {
			setValueEx(Hdr_iv_src_typ, null);
		}
	}
	
	/**
	 * インボイス取引項目の初期化やクリアを行う。
	 */
	protected void initIv() {
		setValueEx(Hdr_iv_no, null);
		setValueEx(Hdr_num_flg, false);
		setValueEx(Hdr_iv_rev, null);
		setValueEx(Hdr_iv_dt, null);
		setValueEx(Hdr_iv_immed_prnt_flg, false);
		setValueEx(Hdr_iv_prnt_flg, false);
		setValueEx(Hdr_pl_skip_flg, false);
		setValueEx(Hdr_pl_reg_flg, false);
		setValueEx(Hdr_trnspt_cd, null);
		setValueEx(Hdr_vssl_flght, null);
		setValueEx(Hdr_load_port_cd, null);
		setValueEx(Hdr_etd_dt, null);
		setValueEx(Hdr_dschrg_port_cd, null);
		setValueEx(Hdr_eta_dt, null);
		setValueEx(Hdr_via_port_cd, null);
		setValueEx(Hdr_via_schd_dt, null);
		setValueEx(Hdr_iv_tterm_cd1, null);
		setValueEx(Hdr_iv_tterm_rmrks1, null);
		setValueEx(Hdr_iv_tterm_cd2, null);
		setValueEx(Hdr_iv_tterm_rmrks2, null);
		setValueEx(Hdr_iv_tterm_cd3, null);
		setValueEx(Hdr_iv_tterm_rmrks3, null);
		setValueEx(Hdr_rcv_schd_dt, null);
		setValueEx(Hdr_lc_no, null);
		setValueEx(Hdr_lc_dt, null);
		setValueEx(Hdr_lc_rmrks, null);
		setValueEx(Hdr_bl_no, null);
		setValueEx(Hdr_bl_dt, null);
		setValueEx(Hdr_bl_rmrks, null);
		setValueEx(Hdr_iv_rmrks, null);
		setValueEx(Hdr_case_mrk1, null);
		setValueEx(Hdr_case_mrk2, null);
		setValueEx(Hdr_case_mrk3, null);
		setValueEx(Hdr_case_mrk4, null);
		setValueEx(Hdr_case_mrk5, null);
		setValueEx(Hdr_case_mrk6, null);
		setValueEx(Hdr_iv_intr_rmrks, null);
		setValueEx(Hdr_iv_sub_char1, null);
		setValueEx(Hdr_iv_sub_char2, null);
		setValueEx(Hdr_iv_sub_char3, null);
		
		for (DtlR r : exceptEmpty(getDtlL())) {
			r.cntry_org_cd(null);
			r.iv_itm_nm(null);
			r.iv_upri(MCNumber.ZERO);
			r.iv_amt(MCNumber.ZERO);
			r.iv_d_rmrks(null);
			r.iv_trd_rmrks(null);
			r.iv_trd_d_rmrks(null);
			r.iv_intr_d_rmrks(null);
			r.iv_sub_char1(null);
			r.iv_sub_char2(null);
			r.iv_sub_char3(null);
			r.sls_usr_cd(null);
			r.sls_usr_nm(null);
			r.sls_dpt_cd(null);
			r.sls_dpt_nm(null);
			r.wg_cd(null);
			r.wg_nm(null);
			r.ar_dpt_cd(null);
			r.ar_dpt_nm(null);
		}
	}
	
	/**
	 * インボイス取引得意先かどうか。
	 * @return インボイス取引先の場合はtrue
	 */
	protected boolean isCstIv() {
		return getHdrR().cst_iv_flg();
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setDtlBtnMode();
		setIoBtnMode();
		showChildIoL();
	}

	@Override
	public void doIo_NC(MCEventInfo info) {
		super.doIo_NC(info);
		setIoBtnMode();
	}

	/**
	 * 品目ＣＤ、枝番１、枝番２、枝番３のＬＣイベント
	 * 
	 * <p>
	 * 	単価、金額項目、取引数量をクリアする<br>
	 * 	新規行の場合、登録枠の納品先情報を明細行にコピーする<br>
	 * 	明細に紐づく詳細行が1行も存在しない場合、詳細に1行追加する<br>
	 * 	明細行の情報を紐づく詳細行へ展開する
	 *　</p>
	 * @param info
	 */
	protected void doDtl_itm_LC(MCEventInfo info) {

		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);

		// 取引数量のクリア
		setValueEx(columnDtl_trd_unit_qty, index, null);

		if (Dtl_itm_p_PPanel.isItmFix(index)) {

			// 詳細行に1行もなければ1行追加
			addChildDtlRow(row);

			// 登録枠の納品先関連項目をコピー
			copyHdr2DtlDlvInfo(index);

			// 登録枠の仕向先関連項目をコピー
			copyHdr2DtlDestInfo(index);
			// 登録枠のインボイス対象時表示項目をコピー
			copyHdr2DtlIvCtrlInfo(index);
			// 明細行IDが未設定の場合は発番
			if (isNull(row.dtl_row_id())) {
				row.dtl_row_id(nextCnt());
			}

			setDtlDefaultValue(info);
			setColByDscntItm(row);
		}
		else if (isNull(row.itm_cd())) {
			
			// 品目に関連する項目を削除する
			setValueEx(columnDtl_bill_crryovr_times, index, null);
			setValueEx(columnDtl_tax_cd, index, null);
			setValueEx(columnDtl_cost_upri, index, null);
			setValueEx(columnDtl_gd_cd, index, null);
		}
		
		setIvItmNm(row);
		setDefaultWatxRate(index, false);

		// 子の詳細リストもメンテナンス
		// この時点で画面の詳細一覧(getIoL())には明細に紐づく詳細リストのみが格納されている前提である
		for (IoR r : getIoL()) {
			copyDtl2IoItmInfo(r, row);
		}
		
		setDtlBtnMode();
		setIoBtnMode();
		
		setCstItm(row);
		
		DtlTable.focusCellAt(index,info.getOldColumn());
	}
	/**
	 * インボイス表記品名を設定する。
	 * @param r
	 */
	protected void setIvItmNm(DtlR r) {
		if (!isCstIv()){
			setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(getHdrR().prnt_lcl_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this);
			
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), null);
			} else {
				setValueEx(columnDtl_iv_itm_nm, r.getGUIIndex(), nvl(row.getStringNE("itm_nm"), r.itm_nm()));
			}
		}
	}
	
	/**
	 * インボイス金額を設定する。
	 * @param r
	 */
	protected void setIvAmt(DtlR r) {
		if (!isCstIv()) {
			setValueEx(columnDtl_iv_upri, r.getGUIIndex(), null);
		}
		else if (!isSame(r.trd_cur_upri(), 0)) {
			setValueEx(columnDtl_iv_upri, r.getGUIIndex(), r.trd_cur_upri());
		}
	}
	/**
	 * 源泉税率の初期値を設定する。
	 * @param index インデックス
	 * @param light 品目のイベントから呼ばれる場合はfalse、そうでない場合はtrue
	 */
	protected void setDefaultWatxRate(int index, boolean light) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())
				&& isWatxRateEditable()
				&& light ? Dtl_itm_p_PPanel.isItmFixLight(index) : Dtl_itm_p_PPanel.isItmFix(index)
				&& !isNull(getHdrR().sls_dt())) {
			
			DtlR r = getDtlL().get(index);
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().sls_dt(),
					this);
			
			setValueEx(columnDtl_wtax_rate, index, wtaxRate);
		}
		else {
			setValueEx(columnDtl_wtax_rate, index, null);
		}
	}
	
	/**
	 * 源泉税率が入力可能かどうか。
	 * @return 入力可能場合はtrue
	 */
	protected boolean isWatxRateEditable() {
		
		if (!isNull(getHdrR().trd_cur_cd()) 
				&& isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd()) 
				&& (isSame(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd()) || isNull(getHdrR().ptax_cur_cd()))) {
			return true;
		}
		
		return false;
	}

	/**
	 * 明細の債権部門を設定する。
	 * @param r
	 */
	protected void setArDpt(DtlR r) {
		if (isCstIv()) {
			setValueEx(columnDtl_ar_dpt_cd, r.getGUIIndex(), getHdrR().ar_dpt_cd());
			setValueEx(columnDtl_ar_dpt_nm, r.getGUIIndex(), getHdrR().ar_dpt_nm());
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
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm(boolean dtFlg) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.abort_flg() && !dtlR.org_abort_flg()) {
				if(!dtFlg || (dtFlg && !isTrnstDtlRow(dtlR))) {
					setCstItm(dtlR);
				}
			}
		}
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {
		
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().sls_dt(), this);
		if (isNull(row)) {
			row = MCRow.create();
			row.addStringColumn("bp_itm_cd");
		}
		// イベント発火順の都合上設定したsetIgnoreListBeans(...)によって
		// 品目、枝番にnullを渡すとsetValuesメソッドでnullに上書きされる。
		// これらを防止するため、メソッド呼び出し元の品目関連の情報をRowにすべて設定する。
		row.addStringColumn("itm_cd", dtlR.itm_cd());
		row.addStringColumn("itm_sub1", dtlR.itm_sub1());
		row.addStringColumn("itm_sub2", dtlR.itm_sub2());
		row.addStringColumn("itm_sub3", dtlR.itm_sub3());
		columnDtl_cst_itm_cd.setValues(dtlR.getGUIIndex(), row);
	}
	protected void doHdr_ac_dt_LC(MCEventInfo info) {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			dtlR.ac_dt(getHdrR().ac_dt());
		}
	}
	
	protected void doHdr_sls_usr_cd_LC(MCEventInfo info) {
		if (isCstIv()) {
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				dtlR.sls_usr_cd(getHdrR().sls_usr_cd());
				dtlR.sls_usr_nm(getHdrR().sls_usr_nm());
			}
		}
	}
	@Override
	public void doHdr_sls_dt_LC(MCEventInfo info) {
		super.doHdr_sls_dt_LC(info);

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
			if (!dtlR.tax_fix_flg()) {
				setDefaultTaxCd(dtlR.getGUIIndex(), false);
			}
		}
		setCstItm(true);
		setDefaultCostUpri();
	}

	protected void doHdr_dlv_cd_LC(MCEventInfo info) {
		
		if (!isNull(getHdrR().dlv_cd())){

			if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
				setValueEx(Hdr_pri_prnt_flg, false);
			}
		}
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dlv_cd, dtlR.getGUIIndex())){
				
				dtlR.dlv_cd(getHdrR().dlv_cd());
				dtlR.dlv_nm(getHdrR().dlv_nm());
				dtlR.dlv_sundry_flg(getHdrR().dlv_sundry_flg());
				dtlR.pri_prnt_flg(getHdrR().pri_prnt_flg());
				dtlR.dlv_zip_cd(getHdrR().dlv_zip_cd());
				dtlR.dlv_addr1(getHdrR().dlv_addr1());
				dtlR.dlv_addr2(getHdrR().dlv_addr2());
				dtlR.dlv_addr3(getHdrR().dlv_addr3());
				dtlR.dlv_addr4(getHdrR().dlv_addr4());
				dtlR.cntry_cd(getHdrR().cntry_cd());
				dtlR.cntry_nm(getHdrR().cntry_nm());
				dtlR.dlv_tel(getHdrR().dlv_tel());
				dtlR.dlv_fax(getHdrR().dlv_fax());
				dtlR.dlv_cntct_dpt(getHdrR().dlv_cntct_dpt());
				dtlR.dlv_cntct_psn(getHdrR().dlv_cntct_psn());
				dtlR.lg_grp_cd(getHdrR().lg_grp_cd());
				dtlR.lg_grp_nm(getHdrR().lg_grp_nm());
			}
		}

		if (!isSame(getHdrR().def_cst_cd(),getHdrR().cst_cd())) {
			setCstCd();
		}
	}

	protected void doHdr_dlv_nm_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_nm, dtlR.getGUIIndex())){
				
				dtlR.dlv_nm(getHdrR().dlv_nm());
			}
		}
	}
	
	protected void doHdr_dlv_cntct_dpt_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_cntct_dpt, dtlR.getGUIIndex())){
				
				dtlR.dlv_cntct_dpt(getHdrR().dlv_cntct_dpt());
			}
		}
	}

	protected void doHdr_dlv_cntct_psn_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_cntct_psn, dtlR.getGUIIndex())){
				
				dtlR.dlv_cntct_psn(getHdrR().dlv_cntct_psn());
			}
		}
	}

	protected void doHdr_dlv_zip_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_zip_cd, dtlR.getGUIIndex())){
				
				dtlR.dlv_zip_cd(getHdrR().dlv_zip_cd());
			}
		}
	}

	protected void doHdr_dlv_addr1_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr1, dtlR.getGUIIndex())){
				
				dtlR.dlv_addr1(getHdrR().dlv_addr1());
			}
		}
	}
	
	protected void doHdr_dlv_addr2_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr2, dtlR.getGUIIndex())){
				
				dtlR.dlv_addr2(getHdrR().dlv_addr2());
			}
		}
	}

	protected void doHdr_dlv_addr3_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr3, dtlR.getGUIIndex())){
				
				dtlR.dlv_addr3(getHdrR().dlv_addr3());
			}
		}
	}

	protected void doHdr_dlv_addr4_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr4, dtlR.getGUIIndex())){
				
				dtlR.dlv_addr4(getHdrR().dlv_addr4());
			}
		}
	}
	
	protected void doHdr_dlv_tel_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_tel, dtlR.getGUIIndex())){
				
				dtlR.dlv_tel(getHdrR().dlv_tel());
			}
		}
	}

	protected void doHdr_dlv_fax_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_fax, dtlR.getGUIIndex())){
				
				dtlR.dlv_fax(getHdrR().dlv_fax());
			}
		}
	}

	protected void doHdr_lg_grp_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_lg_grp_cd, dtlR.getGUIIndex())){
				
				dtlR.lg_grp_cd(getHdrR().lg_grp_cd());
				dtlR.lg_grp_nm(getHdrR().lg_grp_nm());
			}
		}
	}

	protected void doHdr_pri_prnt_flg_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_pri_prnt_flg, dtlR.getGUIIndex())){
				
				dtlR.pri_prnt_flg(getHdrR().pri_prnt_flg());
			}
		}
	}

	@Override
	public void doHdr_dest_cd1_LC(MCEventInfo info) {
		super.doHdr_dest_cd1_LC(info);
		
		setDestCdMode();
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd1, dtlR.getGUIIndex())){
				setValueEx(columnDtl_dest_cd1, dtlR.getGUIIndex(), getHdrR().dest_cd1());
			}
		}
	}

	@Override
	public void doHdr_dest_cd2_LC(MCEventInfo info) {
		super.doHdr_dest_cd2_LC(info);
		
		setDestCdMode();
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd2, dtlR.getGUIIndex())){
				setValueEx(columnDtl_dest_cd2, dtlR.getGUIIndex(), getHdrR().dest_cd2());
			}
		}
	}

	@Override
	public void doHdr_dest_cd3_LC(MCEventInfo info) {
		super.doHdr_dest_cd3_LC(info);
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd3, dtlR.getGUIIndex())){
				setValueEx(columnDtl_dest_cd3, dtlR.getGUIIndex(), getHdrR().dest_cd3());
			}
		}
	}
	@Override
	public void doHdr_pl_skip_flg_NC(MCEventInfo info) {
		
		super.doHdr_pl_skip_flg_NC(info);
		
		setBtn_Open_MSBEP1750Mode();
	}
	
	/**
	 * 計画外インボイスの訂正・取消・参照時、Ｐ/Ｌ省略がオフの場合はＰ／Ｌ登録を押下可とする。
	 * 
	 */
	protected void setBtn_Open_MSBEP1750Mode() {
		if (!getHdrR().pl_skip_flg() && MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
			Btn_open_MSBEP1750.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP1750);
		}
	}
	
	protected void setBtnPrntMode() {
		if (!MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ()) || MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(getCndR().srch_tgt_typ())) {
			Btn_iv_prnt.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_iv_prnt);
		}
		if (isCstIv()) {
			Btn_prnt.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_prnt);
		}
	}
	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		super.doDtl_abort_flg_NC(info);
		setIvHdrAmt();
		setHdrIncTaxAmt();
	}
	
	@Override
	public void doDtl_sls_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_sls_rsn_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (!r.sls_acxfr_flg()) {
			
			r.bd_dpt_cd(null);
			r.bd_dpt_nm(null);
		}
	}
	
	@Override
	public void doDtl_sls_acxfr_flg_NC (MCEventInfo info) {
		super.doDtl_sls_acxfr_flg_NC(info);
		setHdrAmt(); // ヘッダの粗利率を再計算するために呼び出す
		setIvHdrAmt();
	}

	protected void doDtl_trd_cur_upri_LC(MCEventInfo info){
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isSame(r.trd_cur_upri(), 0) && r.sls_acxfr_flg()){
			setValueEx(columnDtl_sls_rsn_cd, info.getEventIndex(), null);
		}
		setIvAmt(r);
	}

	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (!isNull(info.getNewValue())) {
			DtlR r = getDtlL().get(index);
			if (!isNull(r.wtax_rate())) {
				MCNumber wtaxAmt = MAUCP_AmtUtil.getTaxAmt((MCNumber)info.getNewValue(),
						r.wtax_rate(), getHdrR().trd_cur_amt_dec_place(),
						getCo().wtax_rnd_typ(), MCNumber.ZERO);
				setValueEx(columnDtl_wtax_amt, index, wtaxAmt);
			}
			setHdrAmt();
			setIvHdrAmt();
			setCostAmt(r);
			clearDscntInfo(r);
		}
		else {
			setValueEx(columnDtl_wtax_amt, index, null);
		}
		calcIvAmt(getDtlL().get(info.getEventIndex()));
	}

	protected void doDtl_base_cur_amt_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setProfRate(r);
		setHdrAmt();
		setIvHdrAmt();
	}

	@Override
	public void doDtl_stk_mng_typ_LC(MCEventInfo info) {
		super.doDtl_stk_mng_typ_LC(info);

		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);

		// 非在庫品に変更時
		if (!MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
			// 場所ＣＤをクリア
			setValueEx(columnDtl_loc_cd, index, null);

			MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(row));
			if (chdL.size() > 1) {
				// 非在庫品は明細と詳細が１：１の関係のため詳細の行追加・行削除ができない制御をかけている
				// しかし、在庫品で詳細が2行以上存在する状態で、在庫品⇒非在庫品に変更した場合、
				// 既存の詳細行を全削除し、新たに１行追加する
				deleteAllChdIoL(row);
				IoR chdR = addChildDtlRow(row);
				copyDtl2IoItmInfo(chdR, row);
			}
		}
	}

	protected void doDtl_trd_unit_qty_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_trd_unit_qty);
		setCostAmt(row);
		setValueForMoneyCols(getHdrR(), row);

		setHdrAmt();
		setIvAmt(row);
		calcIvAmt(row);
		setIvHdrAmt();
	}
	
	protected void doDtl_iv_upri_LC(MCEventInfo info) {
		calcIvAmt(getDtlL().get(info.getEventIndex()));
	}

	protected void doDtl_tax_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		
		setValueForMoneyCols(getHdrR(), row);
	}
	
	/**
	 * インボイス金額を計算する
	 */
	protected void calcIvAmt(DtlR r) {
		MCNumber amt = null;
		if (!isNullOr(r.iv_upri(), r.trd_unit_qty(), getHdrR().trd_cur_amt_dec_place(),
				getHdrR().sls_amt_rnd_typ())) {
			
			if (isSame(r.trd_cur_upri(), r.iv_upri())) {
				amt = r.trd_cur_amt();
			}
			else {
				amt = getAmt(r.iv_upri(), r.trd_unit_qty(), getHdrR().trd_cur_amt_dec_place(), getHdrR().sls_amt_rnd_typ());
			}
		}
		setValueEx(columnDtl_iv_amt, r.getGUIIndex(), amt);
		setIvHdrAmt();
	}
	/**
	 * 数量、金額系項目に値をセットする
	 */
	protected void setValueForMoneyCols(HdrR hdr, DtlR dtl) {

		if ((isNull(dtl.sls_schd_no()) && isNull(dtl.qtn_d_no()))
				|| MSC_IV_SRC_TYP.isSLS(hdr.iv_src_typ())
				|| isNull(dtl.trd_unit_qty()) || isNull(dtl.trd_unit_cd())
				|| isNull(dtl.trd_cur_upri())) {
			return;
		}
		// 紐付NO
		int hdr_peg_no = 1;

		// ユーティリティ実行用ヘッダ
		MCList<ConvQtyAmtUtil_HdrR> utlHdrL = createUtilHdr(hdr, dtl, hdr_peg_no);

		// ユーティリティ実行用明細（上段）
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = createUtilDtl(hdr, dtl, hdr_peg_no);

		// 明細の金額項目計算用ユーティリティ実行
		setAmtToDtlL(utlHdrL, utlDtlL);

		// ユーティリティの計算結果を明細に反映する
		ConvQtyAmtUtil_DtlR calcR = utlDtlL.get(0);
		dtl.trd_cur_upri(calcR.trd_cur_upri());
		dtl.trd_cur_dscnt_amt(calcR.trd_cur_dscnt_amt());
		dtl.trd_cur_amt(calcR.trd_cur_amt());
		dtl.trd_cur_tax_amt(calcR.trd_cur_tax_amt());
		dtl.trd_cur_inc_tax_amt(calcR.trd_cur_inc_tax_amt());
		dtl.trd_unit_conv_qty(calcR.trd_unit_conv_qty());
		dtl.trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());
		dtl.wtax_amt(calcR.wtax_amt());

		// 単価・値引額・金額・税額
		dtl.base_cur_upri(convToBaseCur(dtl.trd_cur_upri(), hdr.xrate(),
				hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_dscnt_amt(convToBaseCur(dtl.trd_cur_dscnt_amt(), hdr.xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_amt(convToBaseCur(dtl.trd_cur_amt(), hdr.xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.base_cur_tax_amt(convToBaseCur(dtl.trd_cur_tax_amt(), hdr.xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		if (!isNull(hdr.xrate())) {
			dtl.base_cur_inc_tax_amt(dtl.base_cur_amt().add(dtl.base_cur_tax_amt()));
		}

		if (!isNull(hdr.ptax_cur_cd())) {
			dtl.ptax_cur_upri(convCur(dtl.trd_cur_upri(), hdr.ptax_xrate(),
					hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_dscnt_amt(convCur(dtl.trd_cur_dscnt_amt(), hdr.ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_amt(convCur(dtl.trd_cur_amt(), hdr.ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.ptax_cur_tax_amt(convCur(dtl.trd_cur_tax_amt(), hdr.ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			if (!isNull(hdr.ptax_xrate())) {
				dtl.ptax_cur_inc_tax_amt(dtl.ptax_cur_amt().add(dtl.ptax_cur_tax_amt()));
			}
		}
		setHdrAmt();
		setIvHdrAmt();
		setHdrIncTaxAmt();
	}
	protected MCList<ConvQtyAmtUtil_HdrR> createUtilHdr(HdrR hdr, DtlR dtl,
			int hdrPegNo) {
		MCList<ConvQtyAmtUtil_HdrR> l = MCList.create(ConvQtyAmtUtil_HdrR.class);
		ConvQtyAmtUtil_HdrR utlHdr = ConvQtyAmtUtil_HdrR.create();

		utlHdr.peg_no(hdrPegNo);
		utlHdr.wtax_amt(dtl.wtax_amt());
		utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
		utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
		utlHdr.trd_cur_cd(hdr.trd_cur_cd());
		utlHdr.wtax_rate(dtl.wtax_rate());
		utlHdr.act_tax_rate(dtl.tax_rate());
		utlHdr.act_inc_tax_flg(dtl.inc_tax_flg());
		utlHdr.amt_dec_place(hdr.trd_cur_amt_dec_place());
		utlHdr.upri_dec_place(hdr.trd_cur_upri_dec_place());
		utlHdr.amt_rnd_typ(hdr.sls_amt_rnd_typ());
		utlHdr.tax_rnd_typ(hdr.sls_tax_rnd_typ());
		utlHdr.wtax_rnd_typ(getCo().wtax_rnd_typ());
		utlHdr.schd_base_unit_qty(dtl.init_schd_qty());

		boolean useDbVal = dtl.sls_dtl_upd_flg()
				&& isSame(dtl.db_trd_unit_cd(), dtl.trd_unit_cd());

		if (useDbVal) {
			utlHdr.trd_unit_cd(dtl.db_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.db_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.db_trd_cur_upri());
			if (isSame(dtl.db_trd_unit_qty(), dtl.trd_unit_qty())) {
				utlHdr.trd_cur_dscnt_amt(dtl.db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_dscnt_amt(dtl.init_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_amt(dtl.db_trd_cur_amt());
			utlHdr.trd_cur_tax_amt(dtl.db_trd_cur_tax_amt());
			utlHdr.trd_cur_inc_tax_amt(
					dtl.db_trd_cur_amt().add(dtl.db_trd_cur_tax_amt()));
			utlHdr.trd_unit_conv_qty(dtl.db_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.db_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.db_tax_rate());
			utlHdr.inc_tax_flg(dtl.db_inc_tax_flg());
		}
		else {
			utlHdr.trd_unit_cd(dtl.init_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.init_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.init_trd_cur_upri());
			utlHdr.trd_cur_dscnt_amt(dtl.init_trd_cur_dscnt_amt());
			MCRow rslt = getAmtAndTax(dtl.init_trd_cur_upri(), dtl.init_trd_unit_qty(),
					dtl.init_tax_rate(), dtl.init_inc_tax_flg(), hdr.trd_cur_amt_dec_place(),
					hdr.sls_amt_rnd_typ(), hdr.sls_tax_rnd_typ(),
					dtl.init_schd_dscnt_amt());
			utlHdr.trd_cur_amt(rslt.getNumberNE("amt"));
			utlHdr.trd_cur_tax_amt(rslt.getNumberNE("tax_amt"));
			utlHdr.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
			utlHdr.trd_unit_conv_qty(dtl.schd_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.schd_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.init_tax_rate());
			utlHdr.inc_tax_flg(dtl.init_inc_tax_flg());
		}
		l.add(utlHdr);
		return l;
	}
	protected MCList<ConvQtyAmtUtil_DtlR> createUtilDtl(HdrR hdr, DtlR dtl,
			int hdrPegNo) {
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = MCList.create(ConvQtyAmtUtil_DtlR.class);
		ConvQtyAmtUtil_DtlR utlDtlR = ConvQtyAmtUtil_DtlR.create();

		utlDtlR.hdr_peg_no(hdrPegNo);
		utlDtlR.trd_unit_qty(dtl.trd_unit_qty());
		utlDtlR.trd_unit_cd(dtl.trd_unit_cd());
		utlDtlR.trd_unit_conv_qty(dtl.trd_unit_conv_qty());
		utlDtlR.trd_unit_conv_base_qty(dtl.trd_unit_conv_base_qty());
		utlDtlR.trd_cur_dscnt_amt(dtl.trd_cur_dscnt_amt());

		utlDtlL.add(utlDtlR);
		return utlDtlL;
	}

	protected void doDtl_cost_upri_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setCostAmt(r);
		setHdrAmt();
		setIvHdrAmt();
	}

	protected void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}
	protected void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}

	protected void doDtl_lot_no_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$lot_no);
	}

	protected void doDtl_sublot_no_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$sublot_no);
	}

	protected void doDtl_ver_no_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$ver_no);
	}

	protected void doDtl_str_ln_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_str_ln_cd);
	}

	protected void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$str_ln_cd_none_flg);
	}

	@Override
	public void doDtl_trd_unit_cd_LC(MCEventInfo info) {
		super.doDtl_trd_unit_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_trd_unit_cd);
		setValueForMoneyCols(getHdrR(), row);
	}
	@Override
	public void doDtl_trd_unit_cd_NC(MCEventInfo info) {
		super.doDtl_trd_unit_cd_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.sls_schd_no()) && isNull(dtlR.qtn_d_no())
				&& isNull(dtlR.sls_act_d_no())) {
			dtlR.trd_cur_dscnt_amt(null);
		}
	}

	@Override
	public void doDtl_gd_cd_LC(MCEventInfo info) {
		super.doDtl_gd_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_gd_cd);
	}

	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_loc_cd);
	}

	protected void doDtl_sno1_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_sno1);
	}

	protected void doDtl_sno2_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_sno2);
	}

	protected void doDtl_sno3_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_sno3);
	}

	protected void doDtl_sno4_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_sno4);
	}

	@Override
	public void doDtl_dest_cd1_LC(MCEventInfo info) {
		super.doDtl_dest_cd1_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.dest_cd1())) {
			setValueEx(columnDtl_dest_cd2, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_dest_cd2_LC(MCEventInfo info) {
		super.doDtl_dest_cd2_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.dest_cd2())) {
			setValueEx(columnDtl_dest_cd3, info.getEventIndex(), null);
		}
	}
	protected void doDtl_dlv_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		getHdrR().prnt_lcl_cd(r.prnt_lcl_cd());
		setIvItmNm(r);
	}
	protected void setCostAmt(DtlR r) {
		
		MCNumber cost_amt = null;
		if (!isNullOr(r.cost_upri(), r.base_unit_qty())) {
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getHdrR().base_cur_amt_dec_place());
		}
		setValueEx(columnDtl_cost_amt, r.getGUIIndex(), cost_amt);
		
		setProfRate(r);
	}

	protected void clearDscntInfo(DtlR r) {
		if (isNull(r.trd_cur_amt()) || r.trd_cur_amt().isZero()) {
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
		}
	}
	protected java.math.RoundingMode toRoundingMode(String rndTyp) {
		MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
		if (typ == null) {
			return null;
		}
		else {
			return typ.toMC();
		}
	}
	
	protected void setProfRate(DtlR r) {
		r.prof_rate(MSUCP_SlsUtil.getProfRate(r.base_cur_amt(), r.cost_amt()));
	}

	protected void setProfRate(MCList<DtlR> dtlL) {
		for (DtlR r : dtlL) {
			setProfRate(r);
		}
	}
	
	/**
	 * ヘッダの取引通貨金額、粗利対象計、粗利対象外計、原価金額計、基準通貨粗利対象計の設定
	 * (基準通貨税込金額は除く）
	 */
	protected void setHdrAmt() {
		MCNumber trd_cur_amt = null;
		MCNumber ttl_amt = null;
		MCNumber ttl_amt_no_cost = null;
		MCNumber base_cur_ttl_amt = null;
		MCNumber cost_amt = null;
		
		for (DtlR r : getDtlL()) {
			if (r.isStatusDelete() || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_amt()) || r.sls_acxfr_flg()) {
				continue;
			}
			
			if (r.dscnt_itm_flg()) {
				trd_cur_amt = nvl(trd_cur_amt, MCNumber.ZERO).subtract(r.trd_cur_amt());
			}
			else {
				trd_cur_amt = nvl(trd_cur_amt, MCNumber.ZERO).add(r.trd_cur_amt());
				if (!isNull(r.cost_upri())) {
					ttl_amt = nvl(ttl_amt, MCNumber.ZERO).add(r.trd_cur_amt());
					base_cur_ttl_amt = nvl(base_cur_ttl_amt, MCNumber.ZERO).add(r.base_cur_amt());
					cost_amt = nvl(cost_amt, MCNumber.ZERO).add(r.cost_amt());
				}
			}
		}
		
		if (!isNull(trd_cur_amt)) {
			ttl_amt_no_cost = trd_cur_amt.subtract(nvl(ttl_amt, MCNumber.ZERO));
		}
		
		getHdrR().trd_cur_amt(trd_cur_amt);
		getHdrR().ttl_amt(ttl_amt);
		getHdrR().ttl_amt_no_cost(ttl_amt_no_cost);
		getHdrR().base_cur_ttl_amt(base_cur_ttl_amt);
		getHdrR().ttl_cost_amt(cost_amt);
		
		getHdrR().prof_rate(MSUCP_SlsUtil.getProfRate(base_cur_ttl_amt, cost_amt));
	}

	/**
	 * ヘッダの取引通貨税込金額の設定
	 */
	protected void setHdrIncTaxAmt() {
		MCNumber trd_cur_inc_tax_amt = null;
		
		for (DtlR r : getDtlL()) {
			if (r.isStatusDelete() || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_inc_tax_amt()) || !isNull(r.bd_dpt_cd())) {
				continue;
			}
			
			if (r.dscnt_itm_flg()) {
				trd_cur_inc_tax_amt = nvl(trd_cur_inc_tax_amt, MCNumber.ZERO).subtract(r.trd_cur_inc_tax_amt());
			}
			else {
				trd_cur_inc_tax_amt = nvl(trd_cur_inc_tax_amt, MCNumber.ZERO).add(r.trd_cur_inc_tax_amt());
			}
		}
		getHdrR().trd_cur_inc_tax_amt(trd_cur_inc_tax_amt);
	}
	/**
	 * ヘッダのＩ／Ｖ計、無償計、本体、運賃、保険料、その他経費の設定
	 */
	protected void setIvHdrAmt() {
		if (!isCstIv()) {
			return;
		}
		HdrR hdrR = getHdrR();
		MCList<DtlR> dtlL = getDtlL();

		// ivDLが空かどうかのチェック
		MCList<DtlR> subL = exceptDeleteAndEmpty(dtlL);

		if (!subL.isEmpty()) {
			
			// 明細のインボイス金額の合計値がNULLの場合
			if (isNull(subL.sum(DtlR.$iv_amt))) {
				clearTtlAmt();
				return;
			}

			//取引金額計
			MCNumber ttlTrdCurAmt = getTtlAmt(subL, DtlR.$trd_cur_amt);

			hdrR.ttl_iv_amt(getTtlAmt(subL, DtlR.$iv_amt)); //Ｉ／Ｖ計
			hdrR.ttl_ncv_amt(hdrR.ttl_iv_amt().subtract(ttlTrdCurAmt)); //無償計（＝Ｉ／Ｖ計－取引金額計）

			// 取引金額を輸出入諸掛区分ごとに集計
			MCList<DtlR> baseL = subL.subList(DtlR.$exim_xpns_typ, null);
			hdrR.ttl_base_amt(getTtlAmt(baseL, DtlR.$trd_cur_amt)); //本体（＝「輸出入諸掛区分」が未設定の取引金額の合算値）
			
			MCList<DtlR> freightL = subL.subList(DtlR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.FREIGHT.value());
			hdrR.ttl_freight_amt(getTtlAmt(freightL, DtlR.$trd_cur_amt)); //運賃
			
			MCList<DtlR> insuranceL = subL.subList(DtlR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.INSURANCE.value());
			hdrR.ttl_insurance_amt(getTtlAmt(insuranceL, DtlR.$trd_cur_amt)); //保険料
			
			hdrR.ttl_other_amt(ttlTrdCurAmt
					.subtract(hdrR.ttl_base_amt())
					.subtract(hdrR.ttl_freight_amt())
					.subtract(hdrR.ttl_insurance_amt())); //その他経費（＝取引金額計－本体－運賃－保険料）
		}
		else {
			clearTtlAmt();
		}
	}
	
	/**
	 * 合計金額を取得する
	 * 
	 * @param subL：空行を除くリスト
	 * @param col：集計するカラム名
	 * @return
	 */
	protected MCNumber getTtlAmt(MCList<DtlR> subL, String col) {
		
		MCNumber ttlAmt = MCNumber.ZERO;
		for (DtlR subR : subL) {
			MCNumber amt = subR.getNumberNE(col);
			if (isNull(amt)) {
				continue;
			}
			if (subR.dscnt_itm_flg()) {
				ttlAmt = ttlAmt.subtract(amt);
			}
			else {
				ttlAmt = ttlAmt.add(amt);
			}
		}
		return ttlAmt;
	}
	
	/**
	 * 諸合計金額のクリア
	 * 
	 */
	protected void clearTtlAmt() {
		HdrR hdrR = getHdrR();
		
		hdrR.ttl_iv_amt(null);	//Ｉ／Ｖ計
		hdrR.ttl_ncv_amt(null);	//無償計
		hdrR.ttl_base_amt(null);	//本体
		hdrR.ttl_freight_amt(null);	//運賃
		hdrR.ttl_insurance_amt(null);	//保険料
		hdrR.ttl_other_amt(null);	//その他経費
	}
	
	/**
	 * パッキングリストが登録済みかどうかによる入力制御
	 */
	protected void setPlCtrlMode() {
		if (isCstIv()) {
			if (getHdrR().pl_reg_flg()) {
				Hdr_dlv_cd.setMode(MCMode.READ_ONLY);
				Hdr_dest_cd1.setMode(MCMode.READ_ONLY);
				Hdr_sls_usr_cd.setMode(MCMode.READ_ONLY);
				Hdr_sls_dpt_cd.setMode(MCMode.READ_ONLY);
				Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
				Hdr_ptax_xrate.setMode(MCMode.READ_ONLY);
				Hdr_cst_po_no.setMode(MCMode.READ_ONLY);
				Hdr_ar_dpt_cd.setMode(MCMode.READ_ONLY);
				Hdr_iv_dt.setMode(MCMode.READ_ONLY);
				Hdr_pl_skip_flg.setMode(MCMode.READ_ONLY);
				Hdr_trnspt_cd.setMode(MCMode.READ_ONLY);
				Hdr_vssl_flght.setMode(MCMode.READ_ONLY);
				Hdr_load_port_cd.setMode(MCMode.READ_ONLY);
				Hdr_etd_dt.setMode(MCMode.READ_ONLY);
				Hdr_dschrg_port_cd.setMode(MCMode.READ_ONLY);
				Hdr_eta_dt.setMode(MCMode.READ_ONLY);
				Hdr_via_port_cd.setMode(MCMode.READ_ONLY);
				Hdr_via_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_cd1.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_cd2.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_cd3.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_rmrks1.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_rmrks2.setMode(MCMode.READ_ONLY);
				Hdr_iv_tterm_rmrks3.setMode(MCMode.READ_ONLY);
				Hdr_lc_no.setMode(MCMode.READ_ONLY);
				Hdr_lc_dt.setMode(MCMode.READ_ONLY);
				Hdr_lc_rmrks.setMode(MCMode.READ_ONLY);
				Hdr_iv_rmrks.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk1.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk2.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk3.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk4.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk5.setMode(MCMode.READ_ONLY);
				Hdr_case_mrk6.setMode(MCMode.READ_ONLY);
				Hdr_iv_intr_rmrks.setMode(MCMode.READ_ONLY);
				Hdr_iv_sub_char1.setMode(MCMode.READ_ONLY);
				Hdr_iv_sub_char2.setMode(MCMode.READ_ONLY);
				Hdr_iv_sub_char3.setMode(MCMode.READ_ONLY);
			}
		}
	}
	/**
	 * 登録枠の納品先関連項目を有効な全明細へコピーする
	 */
	protected void copyHdr2DtlDlvInfoAll() {

		HdrR hdr = getHdrR();
		if (isNull(hdr.dlv_cd())) {
			return;
		}

		for (DtlR row : exceptDeleteAndEmpty(getDtlL())) {
			copyHdr2DtlDlvInfo(row.getGUIIndex());
		}

	}

	/**
	 * 	登録枠の納品先関連項目を指定行の納品関連項目にコピーする
	 * <p>引継行および新規行以外の場合はコピーしません</p>
	 * @param index	
	 */
	protected void copyHdr2DtlDlvInfo(int index) {
		DtlR row = getDtlL().get(index);
		if (isHdr2DtlCopyRow(row) && isNull(row.dlv_cd())) {
			HdrR hdr = getHdrR();
			row.dlv_cd(hdr.dlv_cd());
			row.dlv_nm(hdr.dlv_nm());
			row.dlv_zip_cd(hdr.dlv_zip_cd());
			row.dlv_addr1(hdr.dlv_addr1());
			row.dlv_addr2(hdr.dlv_addr2());
			row.dlv_addr3(hdr.dlv_addr3());
			row.dlv_addr4(hdr.dlv_addr4());
			row.dlv_cntct_dpt(hdr.dlv_cntct_dpt());
			row.dlv_cntct_psn(hdr.dlv_cntct_psn());
			row.dlv_tel(hdr.dlv_tel());
			row.dlv_fax(hdr.dlv_fax());
			row.pri_prnt_flg(hdr.pri_prnt_flg());
			row.cntry_cd(hdr.cntry_cd());
			row.cntry_nm(hdr.cntry_nm());
			row.dlv_sundry_flg(hdr.dlv_sundry_flg());
			row.prnt_lcl_cd(hdr.prnt_lcl_cd());
		}
	}

	/**
	 * 	登録枠の仕向先関連項目を指定行の仕向先関連項目にコピーする
	 * <p>引継行および新規行以外の場合はコピーしません</p>
	 * @param index	
	 */
	protected void copyHdr2DtlDestInfo(int index) {
		DtlR row = getDtlL().get(index);
		if (isHdr2DtlCopyRow(row)) {
			HdrR hdr = getHdrR();
			if (isNull(row.dest_cd1())) {
				row.dest_cd1(hdr.dest_cd1());
				row.dest_nm1(hdr.dest_nm1());
			}
			if (isNull(row.dest_cd2())) {
				row.dest_cd2(hdr.dest_cd2());
				row.dest_nm2(hdr.dest_nm2());
			}
			if (isNull(row.dest_cd3())) {
				row.dest_cd3(hdr.dest_cd3());
				row.dest_nm3(hdr.dest_nm3());
			}
			row.pri_prnt_flg(hdr.pri_prnt_flg());
		}
	}
	/**
	 * 	登録枠のインボイス対象時表示項目を指定行にコピーする
	 * <p>引継行および新規行以外の場合はコピーしません</p>
	 * @param index	
	 */
	protected void copyHdr2DtlIvCtrlInfo(int index) {
		DtlR row = getDtlL().get(index);
		if (isHdr2DtlCopyRow(row)) {
			HdrR hdr = getHdrR();
			if (isNull(row.sls_usr_cd())) {
				row.sls_usr_cd(hdr.sls_usr_cd());
				row.sls_usr_nm(hdr.sls_usr_nm());
			}
			if (isNull(row.sls_dpt_cd())) {
				row.sls_dpt_cd(hdr.sls_dpt_cd());
				row.sls_dpt_nm(hdr.sls_dpt_nm());
			}
			if (isNull(row.wg_cd())) {
				row.wg_cd(hdr.wg_cd());
				row.wg_nm(hdr.wg_nm());
			}
			if (isNull(row.ar_dpt_cd())) {
				row.ar_dpt_cd(hdr.ar_dpt_cd());
				row.ar_dpt_nm(hdr.ar_dpt_nm());
			}
			row.ac_dt(hdr.ac_dt());
		}
	}
	/**
	 * 	登録枠から明細行へ値コピーの対象となる有効な明細行かどうかを判定する
	 * @param r
	 * @return
	 */
	protected boolean isHdr2DtlCopyRow(DtlR r) {
		return r.isStatusCreate() && !isTrnstDtlRow(r);
	}
	/**
	 * 	明細行が（見積/受注/納品書/インボイス)引継行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isTrnstDtlRow(DtlR r) {
		return (!isNull(r.qtn_d_no()) || !isNull(r.sls_schd_no())) 
				&& !MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ());
	}

	/**
	 *	明細行の情報を詳細行へコピーする
	 * @param dest
	 * @param src
	 */
	protected void copyDtl2IoItmInfo(IoR dest, DtlR src) {

		dest.trd_unit_cd(src.trd_unit_cd());
		dest.trd_unit_nm(src.trd_unit_nm());
		dest.trd_unit_qty(src.trd_unit_qty());
		dest.trd_unit_dec_place(src.trd_unit_dec_place());
		dest.trd_unit_rnd_typ(src.trd_unit_rnd_typ());
		dest.trd_unit_conv_base_qty(src.trd_unit_conv_base_qty());
		dest.trd_unit_conv_qty(src.trd_unit_conv_qty());
		dest.base_unit_qty(src.base_unit_qty());
		dest.lot_no(src.lot_no());
		dest.sublot_no(src.sublot_no());
		dest.ver_no(src.ver_no());
		dest.sno1(src.sno1());
		dest.sno2(src.sno2());
		dest.sno3(src.sno3());
		dest.sno4(src.sno4());
		dest.itm_cd(src.itm_cd());
		dest.itm_sub1(src.itm_sub1());
		dest.itm_sub2(src.itm_sub2());
		dest.itm_sub3(src.itm_sub3());
		dest.ver_flg(src.ver_flg());
		dest.gd_cd(src.gd_cd());
		dest.gd_nm(src.gd_nm());
		dest.loc_cd(src.loc_cd());
		dest.loc_nm(src.loc_nm());
		dest.str_ln_cd(src.str_ln_cd());
		dest.str_ln_nm(src.str_ln_nm());
		dest.str_ln_cd_none_flg(src.str_ln_cd_none_flg());
		dest.str_ln_tgt_flg(src.str_ln_tgt_flg());
		dest.sno1_mng_typ(src.sno1_mng_typ());
		dest.sno2_mng_typ(src.sno2_mng_typ());
		dest.sno3_mng_typ(src.sno3_mng_typ());
		dest.sno4_mng_typ(src.sno4_mng_typ());
		dest.stk_mng_typ(src.stk_mng_typ());
		dest.base_unit_cd(src.base_unit_cd());
		dest.base_unit_nm(src.base_unit_nm());
		dest.base_unit_dec_place(src.base_unit_dec_place());
		dest.base_unit_rnd_typ(src.base_unit_rnd_typ());
		dest.lot_mng_typ(src.lot_mng_typ());
		dest.sublot_mng_typ(src.sublot_mng_typ());
		dest.dtl_row_id(src.dtl_row_id());
	}

	/**
	 * 	明細行で変更した内容を紐づく詳細行へ展開する(Event)
	 * <p>
	 * 	詳細行が2行以上の場合は展開しない<br>
	 * 	明細行の値クリア時にも展開しない<br>
	 * </p>
	 * @param parDtlR 明細Rowコンテナ
	 * @param val	変更後の値
	 * @param destColumn　コピー先のMCColumnConfigオブジェクト
	 */
	protected void propagateWithEvent(DtlR parDtlR, Comparable<?> val,
			MCColumnConfig destColumn) {

		// 明細反映ボタン押下時は何もしない
		if (_updDtlBtnExecFlg) {
			return;
		}
		
		if (!isNull(val)) {

			// 明細行IDが未設定の場合は発番
			if (isNull(parDtlR.dtl_row_id())) {
				parDtlR.dtl_row_id(nextCnt());
			}

			MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(parDtlR));

			if (chdL.isEmpty()) {
				IoR chdR = addChildDtlRow(parDtlR);
				// 変更項目以外の項目も含めて明細行の内容をすべてコピーする
				copyDtl2IoItmInfo(chdR, parDtlR);
			}
			else if (chdL.size() == 1) {
				IoR chdR = chdL.get(0);

				if (destColumn == columnIo_trd_unit_qty) {
					// 明細取引数量変更時、取引単位が異なる場合はキャンセルする（詳細の取引単位がブランクの場合、エラーとなるため）
					if (!isSame(parDtlR.trd_unit_cd(), chdR.trd_unit_cd())) {
						return;
					}
				}
				
				if (destColumn == columnIo_trd_unit_cd) {
					// 品目変更時に、詳細枠に変更後の品目を反映させる前に単位のイベントが動くため、古い品目で単位を取得しないよう手前で品目を設定しておく
					chdR.itm_cd(parDtlR.itm_cd());
					chdR.itm_sub1(parDtlR.itm_sub1());
					chdR.itm_sub2(parDtlR.itm_sub2());
					chdR.itm_sub3(parDtlR.itm_sub3());
				}

				// 変更項目のみを詳細行へコピーする
				setValueEx(destColumn, chdR.getGUIIndex(), val);
			}
		}
	}

	/*
	 * 	明細行で変更した内容を紐づく詳細行へ展開する（Eventなし)
	 * <p>
	 * 	詳細行が2行以上の場合は展開しない<br>
	 * 	明細行の値クリア時にも展開しない<br>
	 * </p>
	 * @param parDtlR 明細Rowコンテナ
	 * @param column 変更カラム
	 */
	protected void propagate(DtlR parDtlR, String column) {

		Comparable<?> val = parDtlR.getValue(column);
		if (!isNull(val)) {

			MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(parDtlR));

			if (chdL.isEmpty()) {
				IoR chdR = addChildDtlRow(parDtlR);
				// 変更項目以外の項目も含めて明細行の内容をすべてコピーする
				copyDtl2IoItmInfo(chdR, parDtlR);
			}
			else if (chdL.size() == 1) {
				IoR chdR = chdL.get(0);
				chdR.setValueNE(column, val);

				if (isSame(column,DtlR.$str_ln_cd_none_flg)) {
					chdR.str_ln_cd(null);
					chdR.str_ln_nm(null);
				}
			}
		}
	}

	/**
	 * 	詳細の数量を集計して親の明細行へ反映する
	 */
	protected void sumIoLQty2Dtl() {
		for (DtlR par : exceptDeleteAndEmpty(getDtlL())) {
			MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(par));
			if (!isNull(par.trd_unit_cd()) && !isEditable(columnDtl_trd_unit_qty, par.getGUIIndex())) {
				continue;
			}
			
			if(isNull(par.trd_unit_cd()) && chdL.groupBy(IoR.$trd_unit_cd).size() == 1) {
				setValueEx(columnDtl_trd_unit_cd, par.getGUIIndex(), chdL.get(0).trd_unit_cd());
			}
			MCNumber sumBaseUnitQty = chdL.sum(IoR.$base_unit_qty);
			if (!isNull(par.trd_unit_cd())) {
				// 明細で設定されている取引単位数量に換算する
				MCNumber calcQty = rvrsBaseUnitConvAndChk(sumBaseUnitQty,
						par.trd_unit_conv_base_qty(), par.trd_unit_conv_qty(),
						par.trd_unit_dec_place(), par.trd_unit_rnd_typ(),
						par.base_unit_dec_place(), par.base_unit_rnd_typ());
				if (!isNull(calcQty)) {
					setValueEx(columnDtl_trd_unit_qty, par.getGUIIndex(), calcQty);
				}
				else {
					setValueEx(columnDtl_trd_unit_cd, par.getGUIIndex(), par.base_unit_cd());
					setValueEx(columnDtl_trd_unit_qty, par.getGUIIndex(), sumBaseUnitQty);
				}
			}
			else {
				// 明細の単位が未入力、または詳細の合計基準単位数を取引単位に換算できない場合は、基準単位で設定
				setValueEx(columnDtl_trd_unit_cd, par.getGUIIndex(), par.base_unit_cd());
				setValueEx(columnDtl_trd_unit_qty, par.getGUIIndex(), sumBaseUnitQty);
			}
		}
	}

	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isNull(info.getNewValue())) {
			// 源泉税額の算出
			MCNumber wtaxAmt = MAUCP_AmtUtil.getTaxAmt(r.trd_cur_amt(), (MCNumber)info.getNewValue(),
					getHdrR().trd_cur_amt_dec_place(), getCo().wtax_rnd_typ(), MCNumber.ZERO);
			setValueEx(columnDtl_wtax_amt, index, wtaxAmt);
		}
		else {
			setValueEx(columnDtl_wtax_amt, index, null);
		}
		
	}

	/**
	 * 	更新可能な画面ステータスか判定する
	 * @return
	 */
	protected boolean isUpdStatus() {

		return isSame(getStatus(), INS) || isSame(getStatus(), UPD_NRML)
				|| isSame(getStatus(), INS_QTN_TRNST)
				|| isSame(getStatus(), INS_DLV_TRNST)
				|| isSame(getStatus(), INS_SLO_TRNST)
				|| isSame(getStatus(), INS_IV_TRNST)
				|| isSame(getStatus(), UPD_QTN_TRNST)
				|| isSame(getStatus(), UPD_DLV_TRNST)
				|| isSame(getStatus(), UPD_SLO_TRNST)
				|| isSame(getStatus(), UPD_IV_TRNST);
	}

	/**
	 * 	明細一覧の行が選択されているか判定する<br>
	 * 	未選択の場合はメッセージを表示する
	 * @return
	 */
	protected boolean isDtlRowSelected() {

		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isNull(selectRow)) {
			dialog(msgNoSelectedRow());
			return false;
		}
		return true;
	}

	/**
	 * 	詳細一覧の行が選択されているか判定する<br>
	 * 	未選択の場合はメッセージを表示する
	 * @return
	 */
	protected boolean isIoRowSelected() {

		IoR selectRow = IoTable.getSelectedMCRow();
		if (isNull(selectRow)) {
			dialog(msgNoSelectedRow());
			return false;
		}
		return true;
	}

	/**
	 * 	明細行に紐づく詳細行を追加する
	 * <p>
	 * 	詳細行が1行も存在しなければ、1行だけ追加する<br>
	 * 	追加した詳細行を返却する（追加しなかった場合はnullを返す)
	 * </p>
	 * @param parDtlR
	 * @return
	 */
	protected IoR addChildDtlRow(DtlR parDtlR) {

		MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(parDtlR));
		IoR chdIoR = null;

		if (chdL.isEmpty()) {
			// 画面の明細行が選択されている場合
			if (DtlTable.getSelectedMCRow() == parDtlR) {
				chdIoR = insertRow(IoTable);
			}
			// それ以外 (登録・更新処理時からの呼出を想定）
			else {
				chdIoR = _ioLAll.createRow();
			}

			// 明細一覧の選択行の品目情報を追加行へコピー
			copyDtl2IoItmInfo(chdIoR, parDtlR);
			chdIoR.setStatus(MCRow.CREATE);

			// 裏リストへ追加
			_ioLAll.add(chdIoR);
		}

		return chdIoR;
	}

	/**
	 * 詳細行補完処理
	 * <p>明細に紐づく詳細行が1行も存在しない場合、明細行の内容から詳細行を1行作成する</p>
	 */
	protected void compIoL() {
		for (DtlR parDtlR : exceptDeleteAndEmpty(getDtlL())) {
			MCList<IoR> chdIoL = exceptDeleteAndEmpty(getChildIoL(parDtlR));
			if (chdIoL.isEmpty() && IoBtn_radd.isEnabled()) {
				addChildDtlRow(parDtlR);
			}
		}
	}

	protected void setDtlDefaultValue(MCEventInfo info) {
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (isNull(r.itm_sub3())) {
			return;
		}
		setDefaultDlv(r);
		setDefaultBillCrryovrTimes(index);
		setDefaultTaxCd(index, true);
		setDefaultCostUpri(index);

		if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_gd_cd, index, getDefaultFeedStkGd().gd_cd());
		}
	}

	protected void setDefaultCostUpri() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if(!isTrnstDtlRow(dtlR)) {
				setDefaultCostUpri(dtlR.getGUIIndex());
			}
		}
	}
	
	/**
	 * 計画外品目を入力時に、計画明細の納品先が一意である場合に、納品先の初期値を設定する。
	 * @param dtlR 明細
	 */
	protected void setDefaultDlv(DtlR dtlR) {
		
		if (!isNull(dtlR.dlv_cd())) {
			return;
		}
		
		boolean isSameDlv = true;
		boolean isSamePriPrntFlg = true;
		
		DtlR schdR = null;
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			
			if (!isTrnstDtlRow(r)) {
				continue;
			}
			
			if (isNull(schdR)) {
				schdR = r;
			}
			else {
				
				if (!isSame(r.dlv_cd(), schdR.dlv_cd())
						|| !isSame(r.dlv_nm(), schdR.dlv_nm()) 
						|| !isSame(r.dlv_zip_cd(), schdR.dlv_zip_cd()) 
						|| !isSame(r.dlv_addr1(), schdR.dlv_addr1()) 
						|| !isSame(r.dlv_addr2(), schdR.dlv_addr2()) 
						|| !isSame(r.dlv_addr3(), schdR.dlv_addr3()) 
						|| !isSame(r.dlv_addr4(), schdR.dlv_addr4()) 
						|| !isSame(r.dlv_cntct_dpt(), schdR.dlv_cntct_dpt()) 
						|| !isSame(r.dlv_cntct_psn(), schdR.dlv_cntct_psn())
						|| !isSame(r.dlv_tel(), schdR.dlv_tel())
						|| !isSame(r.dlv_fax(), schdR.dlv_fax())
						|| !isSame(r.cntry_cd(), schdR.cntry_cd())) {
					
					isSameDlv = false;
					break;
				}
				
				if (!isSame(r.pri_prnt_flg(), schdR.pri_prnt_flg())) {
					isSamePriPrntFlg = false;
				}
			}
		}
	
		if (!isNull(schdR) && isSameDlv) {
			
			setValueEx(columnDtl_dlv_cd, dtlR.getGUIIndex(), schdR.dlv_cd());
			
			if (isSamePriPrntFlg) {
				setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), schdR.pri_prnt_flg());
			}
			
			if (schdR.dlv_sundry_flg()) {
				
				setValueEx(columnDtl_dlv_nm, dtlR.getGUIIndex(), schdR.dlv_nm());
				setValueEx(columnDtl_dlv_zip_cd, dtlR.getGUIIndex(), schdR.dlv_zip_cd());
				setValueEx(columnDtl_dlv_addr1, dtlR.getGUIIndex(), schdR.dlv_addr1());
				setValueEx(columnDtl_dlv_addr2, dtlR.getGUIIndex(), schdR.dlv_addr2());
				setValueEx(columnDtl_dlv_addr3, dtlR.getGUIIndex(), schdR.dlv_addr3());
				setValueEx(columnDtl_dlv_addr4, dtlR.getGUIIndex(), schdR.dlv_addr4());
				setValueEx(columnDtl_dlv_cntct_dpt, dtlR.getGUIIndex(), schdR.dlv_cntct_dpt());
				setValueEx(columnDtl_dlv_cntct_psn, dtlR.getGUIIndex(), schdR.dlv_cntct_psn());
				setValueEx(columnDtl_dlv_tel, dtlR.getGUIIndex(), schdR.dlv_tel());
				setValueEx(columnDtl_dlv_fax, dtlR.getGUIIndex(), schdR.dlv_fax());
				setValueEx(columnDtl_cntry_cd, dtlR.getGUIIndex(), schdR.cntry_cd());
			}
		}
	}


	protected void setDefaultBillCrryovrTimes (int index) {
		if (!isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			setValueEx(columnDtl_bill_crryovr_times, index, nvl(
					r.itm_bill_crryovr_times(), getHdrR().cst_bill_crryovr_times()));
		}
	}

	protected void setDefaultTaxCd (int index, boolean setTaxFixFlg) {
		
		if (!isNull(getHdrR().cst_cd())
				&& (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ()) || isNull(getHdrR().sls_basis_typ()))) {
			DtlR r = getDtlL().get(index);
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().cst_cd(),
					getHdrR().sls_dt(),
					this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
			if (setTaxFixFlg) {
				r.tax_fix_flg(false);
			}
		}
	}

	protected void setDefaultCostUpri(int index) {
		
		DtlR r = getDtlL().get(index);
		MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(
				r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
				getHdrR().sls_dt(), getHdrR().wg_cd(), getCo().gm_std_upri_typ());
		setValueEx(columnDtl_cost_upri, index, cost_upri);
	}

	// ------------------------------------- CellConfig -------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
		IoTable.setCellConfig(createIoTableCellConfig());
	}

	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * セルコンフィグ(明細テーブル)
	 */
	public class DtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			HdrR hdr = getHdrR();

			if (isUpdStatus()) {
				if (column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
					if (!r.upri_not_tgt_flg() || (!r.sls_upri_cng_flg() && !hdr.sls_upri_cng_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_trd_unit_cd){
					if (!isNull(r.qtn_d_no()) && isNull(r.sls_schd_no())){
						return MCMode.READ_ONLY;
					}
				}
				// インボイス表記品名
				if(column == columnDtl_iv_itm_nm) {
					if (isSame(getStatus(), INS) || isSame(getStatus(), UPD_NRML)) {
						if (isCstIv() && r.sundry_itm_flg()) {
							return MCMode.REQUIRED;
						}
					}
				}
				
				// インボイス単価
				if(column == columnDtl_iv_upri) {
					if (isSame(getStatus(), INS) || isSame(getStatus(), UPD_NRML)) {
						if (isCstIv() &&
								((MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && r.sls_acxfr_flg())
								|| (!isNull(r.trd_cur_upri()) && r.trd_cur_upri().isZero()))) {
							return MCMode.REQUIRED;
						}
					}
				}
				// 品目
				if (column == columnDtl_itm_cd || column == columnDtl_itm_sub1
						|| column == columnDtl_itm_sub2 || column == columnDtl_itm_sub3) {
					if (isTrnstDtlRow(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 品名
				if (column == columnDtl_itm_nm) {
					// 諸口品ＦＬＧがオンの場合は編集可
					if (!r.sundry_itm_flg() && isTrnstDtlRow(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 納品先ＣＤ
				if (column == columnDtl_dlv_cd) {
					if (r.sls_cststk_flg() || isTrnstDtlRow(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕向先ＣＤ2
				if (column == columnDtl_dest_cd2) {
					if (isNull(r.dest_cd1())) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕向先ＣＤ3
				if (column == columnDtl_dest_cd3) {
					if (isNull(r.dest_cd2())) {
						return MCMode.READ_ONLY;
					}
				}

				// 格付ＣＤ
				if (column == columnDtl_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
							|| !isNull(r.slo_d_no())) {
						return MCMode.READ_ONLY;
					}
				}
				// ロットＮＯ・サブロットＮＯ
				if (column == columnDtl_lot_no || column == columnDtl_sublot_no) {
					MCList<IoR> ioL = _ioLAll.subList(IoR.$dtl_row_id, r.dtl_row_id());
					MCMode mode = column.getMode();
					if (!isNull(ioL) && ioL.size() > 1 && MCMode.REQUIRED.equals(mode)) {
						return MCMode.ENABLE;
					}
					if (r.sls_cststk_flg()) {
						return MCMode.ENABLE;
					}
				}

				// 版ＮＯ
				if (column == columnDtl_ver_no) {
					if (!r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 負担部門ＣＤ
				if (column == columnDtl_bd_dpt_cd) {
					if (!r.sls_acxfr_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 売上理由
				if (column == columnDtl_sls_rsn_cd) {
					if (isDefaultModeEditable(column)) {
						if (!isNull(hdr.trd_cur_cd()) && !isNull(r.trd_cur_upri())
								&& r.trd_cur_upri().isZero()) {
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.ENABLE;
						}
					}
				}

				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					// 取引通貨＝基準通貨＝納税通貨　または　取引通貨＝基準通貨かつ納税通貨NULLの場合に入力変更可能
					if (!isWatxRateEditable()) {
						return MCMode.READ_ONLY;
					}
				}

				// 売上理由
				if (column == columnDtl_dscnt_rsn_cd) {
					if (isNull(r.trd_cur_dscnt_amt())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 対象が預り売上となる場合、単位/数量は変更不可
				if (r.sls_cststk_flg()) {
					if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 値引品目の場合、単位/数量は変更不可
				if (r.dscnt_itm_flg()) {
					if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_loc_cd
						|| column == columnDtl_str_ln_cd
						|| column == columnDtl_str_ln_cd_none_flg) {
					if (isLocEditable(r.sls_schd_no())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (isSame(getStatus(), UPD_NRML) && getHdrR().pl_reg_flg() ) {
				if (isPlReadOnlyDtlCol(column)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected MCCellConfig createIoTableCellConfig() {
		return new IoTableCellConfig();
	}

	/**
	 * セルコンフィグ(詳細テーブル)
	 */
	public class IoTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			IoR r = (IoR) table.getBaseTable().getRow(index);

			if (isUpdStatus()) {
				DtlR selectRow = DtlTable.getSelectedMCRow();
				// 格付ＣＤ
				if (column == columnIo_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnIo_loc_cd
					|| column == columnIo_str_ln_cd
					|| column == columnIo_str_ln_cd_none_flg
					|| column == columnIo_sno1
					|| column == columnIo_sno2
					|| column == columnIo_sno3
					|| column == columnIo_sno4){
					if (isLocEditable(selectRow.sls_schd_no())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 明細の品目が値引品目の場合、詳細の単位/数量も入力変更不可
				if (!isNull(selectRow) && selectRow.dscnt_itm_flg()) {
					if (column == columnIo_trd_unit_cd || column == columnIo_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				if (!isNull(selectRow) && !isNull(selectRow.qtn_d_no()) && isNull(selectRow.sls_schd_no())) {
					if (column == columnIo_trd_unit_cd) {
						return MCMode.READ_ONLY;
					}
				}

				// 版ＮＯ
				if (column == columnIo_ver_no) {
					if (!r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// インボイス引継で出荷済の場合に変更できない項目の制御
				// 未出荷となるのは預り、または出荷指図対象外で出荷実績をスキップした場合でどちらも出荷基準
				if (column == columnIo_trd_unit_qty || column == columnIo_loc_cd
						|| column == columnIo_lot_no || column == columnIo_sublot_no
						|| column == columnIo_str_ln_cd || column == columnIo_ver_no
						|| column == columnIo_sno1 || column == columnIo_sno2
						|| column == columnIo_sno3 || column == columnIo_sno4) {
					
					if ((isSame(getStatus(), INS_IV_TRNST) || isSame(getStatus(), UPD_IV_TRNST))
							&& !MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (isSame(getStatus(), UPD_NRML) && getHdrR().pl_reg_flg() ) {
				if (isPlReadOnlyIoCol(column)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// ------------------------------------- Utility -------------------------------------
	/**
	 * 	明細行に紐づく子の詳細リストをすべて削除する
	 * @param par
	 */
	protected void deleteAllChdIoL(DtlR par) {
		MCList<IoR> chdL = getChildIoL(par);
		MCList<IoR> delL = chdL.createInstance();
		for (IoR chd : chdL) {
			if (chd.isStatusCreate()) {
				delL.add(chd);
			}
			else {
				chd.setStatus(MCRow.DELETE);
			}
		}
		_ioLAll.removeAll(delL);
	}

	/**
	 * 	基準単位数量から別の単位の数量へ換算する<br>
	 * 	ただし換算不可能な場合はnullを返却する<br>
	 * 	換算可能かどうかの判断は換算結果と、換算結果を逆換算した結果が同じ値となること<br>
	 * @param r
	 * @return
	 */
	protected MCNumber rvrsBaseUnitConvAndChk(MCNumber qty, MCNumber toDmnQty,
			MCNumber toConvQty, MCNumber toDecPlace, String toUnitConvRndTyp,
			MCNumber frDecPlace, String frUnitConvRndTyp) {

		// 基準単位数量から入力単位数量への換算
		MCNumber calcNum = rvrsBaseUnitConv(qty, toDmnQty, toConvQty, toDecPlace,
				toUnitConvRndTyp);

		// 入力単位数量から基準単位数量への再計算
		MCNumber reCalcNum = convToBaseUnit(calcNum, toDmnQty, toConvQty, frDecPlace,
				frUnitConvRndTyp);

		if (isSame(qty, reCalcNum)) {
			// 変換ＯＫ
			return calcNum;
		}
		return null;
	}

	/**
	 * 	明細(親)にぶら下がっている詳細(子)のリストを取得する
	 * <p>
	 * 	IoRの裏リスト(_ioLAll)からdtlRのdtl_row_idの値が同じIoLリストをから抽出します。<br>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param parDtlR
	 * @return
	 */
	protected MCList<IoR> getChildIoL(DtlR parDtlR) {

		MCIndexKey idxKey = _ioLAll.createIndex(IoR.$dtl_row_id);
		return _ioLAll.subList(idxKey, parDtlR.dtl_row_id());

	}

	/**
	 * 	詳細(子)の親の明細Rowを取得する
	 * 	<p>
	 * 	明細（親）と詳細（子）のリストには同一のdtl_row_id設定されている前提で動作します。
	 * <p>
	 * @param chdIoL
	 * @return
	 */
	protected DtlR getParDtlR(IoR chdIoR) {

		MCIndexKey idxKey = getDtlL().createIndex(DtlR.$dtl_row_id);
		MCList<DtlR> parDtlL = getDtlL().subList(idxKey, chdIoR.dtl_row_id());

		if (!isNull(parDtlL) && !parDtlL.isEmpty()) {
			return parDtlL.get(0);
		}
		return DtlR.create();
	}

	/**
	 * 	選択された明細行に紐づく詳細のリストを画面上に表示する
	 */
	protected void showChildIoL() {

		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			// 裏リストから子の詳細データのみを抽出
			MCList<IoR> chdIoL = getChildIoL(selectedRow);
			getIoL().setAll(chdIoL);
		}
	}

	/**
	 * 明細行IDカウンタをリセット
	 */
	protected void resetCnt() {
		_dtl_row_id = 0;
	}

	/**
	 * 	明細の最大の明細行IDをカウンタに設定する
	 * <p>
	 * 	検索結果で明細と詳細の親子のペアで同一の明細行ＩＤが連番で設定される前提。
	 * 	検索後処理での使用を想定
	 * </p>
	 */
	protected void setCnt() {

		if (!getDtlL().isEmpty()) {
			MCNumber max_dtl_row_id = (MCNumber) getDtlL().max(DtlR.$dtl_row_id);
			_dtl_row_id = max_dtl_row_id.intValue();
		}
		else {
			resetCnt();
		}
		_dtl_row_id++;
	}

	protected int nextCnt() {
		return _dtl_row_id++;
	}

	// ------------------------------------- Constants -------------------------------------

	/**
	 * 	明細行で値変更時に詳細リストへ反映する項目
	 * DtlRowListener#valueChangedの廃止に伴う
	 */
	@Deprecated
	protected final String[] IOL_INHERIT_COS = new String[] {
			DtlR.$trd_unit_qty, DtlR.$trd_unit_cd, DtlR.$lot_no, DtlR.$sublot_no, DtlR.$ver_no,
			DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4, DtlR.$loc_cd, DtlR.$str_ln_cd
	};

	// ------------------------------------- RowListener -------------------------------------	

	protected DtlRowListener getDtlRowListener() {
		return new DtlRowListener();
	}

	protected class DtlRowListener implements MCRowListener, MCRowStatusListener {

		// valueChangeメソッドはLCイベント前に呼び出されるため、基準単位数などが変更前の値でコピーされてしまうので
		// ここでのコピーは中止する
		@Override
		@Deprecated
		public void valueChanged(MCRowEvent event) {

		}

		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR r = (DtlR) event.getSourceRow();
				copyHdr2DtlDlvInfo(r.getGUIIndex());
				copyHdr2DtlDestInfo(r.getGUIIndex());
				copyHdr2DtlIvCtrlInfo(r.getGUIIndex());
			}
		}
	}

	protected MCRowMatcher<IoR> createRowMatcherExceptEmpty() {
		return new MatchExceptEmpty<IoR>();
	}
	protected class MatchExceptEmpty<T extends IoR> implements MCRowMatcher<T> {
		@Override
		public boolean match(T row) {
			if (row.isEmpty()) {
				return false;
			}
			return true;
		}
	}

	/**
	 * 検索対象の明細を取得する
	 * @return
	 */
	protected MCList<DtlR> getSrchL(boolean updBtnEventFlg) {
		MCList<DtlR> srchL = MCList.create(DtlR.class);
		for (DtlR srchR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)){
			if (updBtnEventFlg && hasSchd(srchR)){
				continue;
			}
			if (isSame(getStatus(), INS_IV_TRNST) || isSame(getStatus(), UPD_IV_TRNST) || getHdrR().pl_reg_flg()) {
				continue;
			}
			srchL.add(srchR);
		}
		return srchL;
	}
	protected boolean hasSchd(DtlR srchR) {
		if (isNull(srchR.qtn_d_no()) && isNull(srchR.sls_schd_no())){
			return false;
		}
		return true;
	}

	/**
	 * 単価再取得処理を実行します。
	 * @return 単価再取得処理中にエラーが起きた場合true
	 */
	protected boolean hasErr() {
		@SuppressWarnings("rawtypes")
		MSBBP_SlsActReg.MS_MSBBL1310_Sprt01Caller caller = createMS_MSBBL1310_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		return caller.getErrorFlg();
	}
	/**
	 * 単価をキャッシュする。
	 */
	protected void cacheUpri(DtlR dtlR) {
		dtlR.old_trd_cur_upri(dtlR.trd_cur_upri());
	}
	/**
	 * 単価をキャッシュした値に戻す。
	 */
	protected void restoreUpri(DtlR dtlR) {
		int idx = dtlR.getGUIIndex();
		MCNumber upri = dtlR.old_trd_cur_upri();
		setValueEx(columnDtl_trd_cur_upri, idx, upri);
	}
	/**
	 * 異なる単価の明細が含まれるかどうかを判定します。
	 */
	protected void setDiffLatestUpriMsg(MCMessageList msgL, DtlR dtlR) {
		if (isNullOr(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			return;
		}
		if (!isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri())) {
			msgL.add(new MCMessage(dtlR, null, MSBBP0011,
					dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
		}
	}
	/**
	 * パッキングリスト登録後に売上実績登録画面で訂正できる明細項目かどうか判定します。
	 */
	protected boolean isPlReadOnlyDtlCol(MCColumnConfig column) {
		if (column == columnDtl_bill_crryovr_times || column == columnDtl_loc_cd
				|| column == columnDtl_lot_no || column == columnDtl_sublot_no || column == columnDtl_str_ln_cd || column == columnDtl_ver_no
				|| column == columnDtl_sno1 || column == columnDtl_sno2 || column == columnDtl_sno3 || column == columnDtl_sno4
				|| column == columnDtl_trd_d_rmrks || column == columnDtl_intr_rmrks
				|| column == columnDtl_sub_char1 || column == columnDtl_sub_char2 || column == columnDtl_sub_char3) {
			return false;
		}
		return true;
	}
	
	/**
	 * パッキングリスト登録後に売上実績登録画面で訂正できる詳細項目かどうか判定します。
	 */
	protected boolean isPlReadOnlyIoCol(MCColumnConfig column) {
		if (column == columnIo_trd_unit_qty || column == columnIo_loc_cd || column == columnIo_lot_no
				|| column == columnIo_sublot_no || column == columnIo_str_ln_cd || column == columnIo_ver_no
				|| column == columnIo_sno1 || column == columnIo_sno2 || column == columnIo_sno3 || column == columnIo_sno4) {
			return false;
		}
		return true;
	}
	// ---------------------------------------- 在庫選択機能 START ----------------------------------------
	// 仮実装：在庫選択画面から値を設定するとき、設定対象項目名称を指定する。
	@Override
	public String getInptItmCdCol() {
		return DtlR.$itm_cd;
	}

	@Override
	public String getInptItmSub1Col() {
		return DtlR.$itm_sub1;
	}

	@Override
	public String getInptItmSub2Col() {
		return DtlR.$itm_sub2;
	}

	@Override
	public String getInptItmSub3Col() {
		return DtlR.$itm_sub3;
	}
	
	@Override
	public String getInptGdCdCol() {
		return DtlR.$gd_cd;
	}

	@Override
	public String getInptLotNoCol() {
		return DtlR.$lot_no;
	}

	@Override
	public String getInptSublotNoCol() {
		return DtlR.$sublot_no;
	}

	@Override
	public String getInptLocCdCol() {
		return DtlR.$loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$str_ln_cd_none_flg;
	}

	@Override
	public String getInptSno1Col() {
		return DtlR.$sno1;
	}

	@Override
	public String getInptSno2Col() {
		return DtlR.$sno2;
	}

	@Override
	public String getInptSno3Col() {
		return DtlR.$sno3;
	}

	@Override
	public String getInptSno4Col() {
		return DtlR.$sno4;
	}

	@Override
	public String getInptPackUnitCdCol() {
		return DtlR.$trd_unit_cd;
	}

	@Override
	public String getInptBaseStkQtyCol() {
		return DtlR.$base_unit_qty;
	}

	@Override
	public String getInptBaseUnitCdCol() {
		return DtlR.$base_unit_cd;
	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		
		DtlR dtlR  = DtlTable.getSelectedMCRow();
		
		if (!isNull(dtlR) && (dtlR.abort_flg() || dtlR.isStatusDelete())) {
			
			if (isSame(OPE_UPD, ope)) {
				return false;
			}
		}
		
		if (isStkNotMngOnly() && isSame(getStkTable(panel).getName(), DtlTable.getName())) {
			
			if (isSame(OPE_INS, ope)) {
				return false;
			}
		}
		
		return true;
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (DtlBtn_open_MSBEP0500_p_PPanel == panel) {
			return DtlTable;
		}
		if (IoBtn_open_MSBEP0500_p_PPanel == panel) {
			return IoTable;
		}

		return null;
	}
	
	@Override
	public MCConstRow getInsertableRow(MCTable<?> table) {
		
		if (isSame(table.getName(), IoTable.getName())) {
			
			IoR ioR = insertRow(IoTable);
			DtlR dtlR = DtlTable.getSelectedMCRow();

			// 明細一覧の選択行の品目情報を追加行へコピー
			copyDtl2IoItmInfo(ioR, dtlR);
			ioR.setStatus(MCRow.CREATE);

			// 裏リストへ追加
			_ioLAll.add(ioR);
			
			return ioR;
		}
		return IfStkInspBase.super.getInsertableRow(table);
	}
	
	@Override
	public boolean isCndEnable(String ope, String name, MCTable<?> table) {
		
		if (MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
			
			if (isSame(name, IfStkInspBase.CND_STK_INFO_SRCH_TYP) 
					|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_CD)
					|| isSame(name, IfStkInspBase.CND_STK_ARRV_BP_NM)) {
				return false;
			}	
		}
		
		if (isSame(name, IfStkInspBase.CND_ITM_CD) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB1) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB2) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB3) 
				|| isSame(name, IfStkInspBase.CND_ITM_NM)) {
			return isEditable(columnDtl_itm_cd, DtlTable.getMCSelectedRow());
		}
		
		if (isSame(table.getName(), DtlTable.getName())) {
			
			if (isSame(name, IfStkInspBase.CND_GD_CD) || isSame(name, IfStkInspBase.CND_GD_NM)) {
				if (hasStkGdDefCd(this)) {
					return true;
				}
				return isEditable(columnDtl_gd_cd, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_LOC_CD) || isSame(name, IfStkInspBase.CND_LOC_NM)) {
				return isEditable(columnDtl_loc_cd, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO1)) {
				return isEditable(columnDtl_sno1, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO2)) {
				return isEditable(columnDtl_sno2, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO3)) {
				return isEditable(columnDtl_sno3, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO4)) {
				return isEditable(columnDtl_sno4, DtlTable.getMCSelectedRow());
			}
		}
		else if (isSame(table.getName(), IoTable.getName())) {
				
			if (isSame(name, IfStkInspBase.CND_GD_CD) || isSame(name, IfStkInspBase.CND_GD_NM)) {
				if (hasStkGdDefCd(this)) {
					return true;
				}
				return isEditable(columnIo_gd_cd, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_LOC_CD) || isSame(name, IfStkInspBase.CND_LOC_NM)) {
				return isEditable(columnIo_loc_cd, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO1)) {
				return isEditable(columnIo_sno1, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO2)) {
				return isEditable(columnIo_sno2, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO3)) {
				return isEditable(columnIo_sno3, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_SNO4)) {
				return isEditable(columnIo_sno4, IoTable.getMCSelectedRow());
			}
		}
		
		return IfStkInspBase.super.isCndEnable(ope, name, table);
	}

	// 在庫選択画面に渡す検索条件を設定する（MSBEP_StkInfo_MC：setBindVal関数を参照のこと）
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		
		if (table == null) {
			return null;
		}
		
		MCRow bind = MCRow.create();
		
		DtlR dtlR  = DtlTable.getSelectedMCRow();
		if (!isNull(dtlR)) {
			
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dtlR.itm_cd());                           // 品目ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dtlR.itm_sub1());                       // 枝番１
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dtlR.itm_sub2());                       // 枝番２
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dtlR.itm_sub3());                       // 枝番３
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dtlR.itm_nm());                           // 品名
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value()); // 在庫情報場所区分
			
			if (MAC_TRD_PTN_TYP.isSLS_CNSGN(getHdrR().trd_ptn_typ())) {
				
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_SRCH_TYP, MSC_STK_INFO_SRCH_TYP.VMI.value());   //在庫情報検索区分
				bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, nvl(dtlR.dlv_cd(), getHdrR().dlv_cd())); // 在庫着荷先ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM,  nvl(dtlR.dlv_nm(), getHdrR().dlv_nm()));// 在庫着荷先名
			}
			else {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_SRCH_TYP, MSC_STK_INFO_SRCH_TYP.AVL.value()); //在庫情報検索区分
			}
		}
	
		if (isSame(table.getName(), DtlTable.getName())) {
			
			DtlR selR  = (DtlR)table.getSelectedMCRow();
			if (!isNull(selR)) {
				
				bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.gd_cd()); // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.gd_nm()); // 格付名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.loc_cd()); // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.loc_nm()); // 場所名
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno1_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO1, MAC_STR.NULL_VAL.value());// 手配ＮＯ１
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO1, selR.sno1());// 手配ＮＯ１
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno2_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO2, MAC_STR.NULL_VAL.value());// 手配ＮＯ２
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO2, selR.sno2());// 手配ＮＯ２
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno3_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO3, MAC_STR.NULL_VAL.value());// 手配ＮＯ３
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO3, selR.sno3());// 手配ＮＯ３
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno4_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO4, MAC_STR.NULL_VAL.value());// 手配ＮＯ４
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO4, selR.sno4());// 手配ＮＯ４
				}
				if (!isNull(selR.itm_cd())) {
					bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD); 
				}
			}
		}
		else if (isSame(table.getName(), IoTable.getName())) {
			
			IoR selR  = (IoR)table.getSelectedMCRow();
			if (!isNull(selR)) {
				bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.gd_cd()); // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.gd_nm()); // 格付名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.loc_cd()); // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.loc_nm()); // 場所名
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno1_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO1, MAC_STR.NULL_VAL.value());// 手配ＮＯ１
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO1, selR.sno1());// 手配ＮＯ１
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno2_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO2, MAC_STR.NULL_VAL.value());// 手配ＮＯ２
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO2, selR.sno2());// 手配ＮＯ２
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno3_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO3, MAC_STR.NULL_VAL.value());// 手配ＮＯ３
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO3, selR.sno3());// 手配ＮＯ３
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(selR.sno4_mng_typ())) {
					bind.addStringColumn(IfStkInspBase.CND_SNO4, MAC_STR.NULL_VAL.value());// 手配ＮＯ４
				}
				else {
					bind.addStringColumn(IfStkInspBase.CND_SNO4, selR.sno4());// 手配ＮＯ４
				}
				if (!selR.isEmpty()) {
					bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD); 
				}
			}
		}

		return bind;
	}
	
	/**
	 * 非在庫品のみ選択できるかどうか。
  	 * @return 検収基準、着荷基準または受注ＮＯがNULLではない場合はtrue
	 */
	protected boolean isStkNotMngOnly() {
		
		return (MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ()) || !isNull(getHdrR().slo_no()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ()));
	}

	protected boolean isLocEditable(String slsSchdNo) {

		return ((MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ())) && !isNull(slsSchdNo));
	}
	// ---------------------------------------- 在庫選択機能 END ----------------------------------------
	
	/**
	 * 変更前の打切りFLGを設定する。
	 * @param dtlL
	 */
	protected void setOrgAbortFlg(MCList<DtlR> dtlL){
		for (DtlR dtlR: dtlL){
			dtlR.org_abort_flg(dtlR.abort_flg());
		}
	}
	protected void setOrgAmt() {
		for (DtlR r : getDtlL()) {
			r.trd_upri_amt_p().org_trd_cur_dscnt_amt(r.init_trd_cur_dscnt_amt());
			r.trd_upri_amt_p().org_qty(r.init_trd_unit_qty());
		}
	}
	protected void copyAmtData() {
		for (DtlR r : getDtlL()) {
			r.db_trd_unit_cd(r.trd_unit_cd());
			r.db_trd_unit_conv_qty(r.trd_unit_conv_qty());
			r.db_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
			r.db_trd_unit_dec_place(r.trd_unit_dec_place());
			r.db_trd_unit_rnd_typ(r.trd_unit_rnd_typ());
			r.db_trd_unit_qty(r.trd_unit_qty());
			r.db_trd_cur_amt(r.trd_cur_amt());
			r.db_trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
			r.db_trd_cur_tax_amt(r.trd_cur_tax_amt());
			r.db_trd_cur_upri(r.trd_cur_upri());
			r.db_wtax_rate(r.wtax_rate());
			r.db_tax_rate(r.tax_rate());
			r.db_inc_tax_flg(r.inc_tax_flg());
		}
	}
	protected void copyAmtDataSchd() {
		for (DtlR r : getDtlL()) {
			r.init_trd_unit_cd(r.trd_unit_cd());
			r.init_trd_unit_qty(r.trd_unit_qty());
			r.init_trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
			r.init_trd_cur_tax_amt(r.trd_cur_tax_amt());
			r.init_trd_cur_upri(r.trd_cur_upri());
			r.init_tax_rate(r.tax_rate());
			r.init_inc_tax_flg(r.inc_tax_flg());
		}
	}
	protected void setUpriSlsSchdNo() {
		for (DtlR r : getDtlL()) {
			if (MSC_IV_SRC_TYP.isSLS(getHdrR().iv_src_typ())) {
				r.upri_sls_schd_no(null);
			}
			else {
				r.upri_sls_schd_no(r.sls_schd_no());
			}
		}
	}

}