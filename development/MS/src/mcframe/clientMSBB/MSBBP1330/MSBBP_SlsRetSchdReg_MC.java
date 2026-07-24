package mcframe.clientMSBB.MSBBP1330;

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
import mcframe.clientMAUB.MAUBP0210.*;
import mcframe.clientMAUB.MAUBP0320.*;
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
import mcframe.clientCore.beans.layout.MCBorderLayout;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import static java.util.Arrays.asList;
import mcframe.clientMAUC.MAUCP1060.MAUCP_TrdUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientCore.beans.list.*;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;   // 在庫選択用
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
import mcframe.commonMA.meta.MA_META;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsRetSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsRetSchdReg_MC extends MSBBP_SlsRetSchdReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 明細反映ボタン実行中フラグ
	protected boolean _updDtlBtnExecFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsRetSchdReg_MC() {
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
	public MSBBP_SlsRetSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[DtlBtn]のボタン[sprt_srch_upri]の押下時の処理
	 */
	@Override
	public void doDtlBtn_sprt_srch_upri(MCEventInfo info) {
		callMS_MSBBL1330_Sprt01();
	}
	/**
	 * [MS_MSBBL1330_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Sprt01Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/**
		 *  更新ボタンのイベントフラグ
		 */
		protected boolean _upd_btn_event_flg = false;

		/**
		 * エラーフラグ
		 */
		protected boolean _error_flg = false;

		public MS_MSBBL1330_Sprt01Caller(P panel, B operation) {
			super(panel, operation);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			if (_upd_btn_event_flg) {
				setScreenAsync(false);
			}
			_error_flg = false;
		}

		/**
		 * 更新ボタンイベントフラグを設定する。
		 * @param updEvent
		 */
		protected void setUpdBtnEventFlg(boolean updBtnEventFlg) {
			_upd_btn_event_flg = updBtnEventFlg;
		}

		/**
		 * エラーフラグを返す。
		 * @return エラーフラグ
		 */
		protected boolean getErrorFlg() {
			return _error_flg;
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!_upd_btn_event_flg) {
				if (getSrchL().isEmpty()) {
					msgList.add(new MCMessage(MSBBP0010));
				}
			}
		}

		/**
		 * 検索対象の明細を取得する
		 * @return
		 */
		protected MCList<DtlR> getSrchL() {

			return exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setAll(bridge.up0(), getSrchL(), createMap_UpriSrchR_DtlR());
		}

		@Override
		protected void show() {
			getUpriSrchL().clear();

			showMerge();
			for (UpriSrchR r : getUpriSrchL()) {
				getDtlL().get(r.getGUIIndex()).old_trd_cur_upri(getDtlL().get( r.getGUIIndex()).trd_cur_upri());
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), r.sls_upri());
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), r.interim_flg());
				setWtaxAmt(r.getGUIIndex());
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
			//　単価取得に最低限必要な必須チェックのみ実施する
			msgList.addAll(panel.checkReq(Hdr_reg_dt));
			msgList.addAll(panel.checkReq(Hdr_cst_cd));
			msgList.addAll(panel.checkReq(Hdr_sls_dpt_cd));
			if (!isNull(getHdrR().sls_dpt_cd())) {
				msgList.addAll(panel.checkReq(Hdr_wg_cd));
			}
			msgList.addAll(panel.checkReq(Hdr_trd_cur_cd));
			for (DtlR r : getSrchL()) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
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
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dt(getHdrR().reg_dt());
				dest.cst_cd(getHdrR().cst_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
				dest.wg_cd(getHdrR().wg_cd());
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1330_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1330_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1330_Del01();
	}

	/**
	 * [MS_MSBBL1330_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Del01Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1330_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 上り電文には裏リストを設定
			bridge.up2().setAll(exceptEmpty(_ioLAll));
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			for (DtlR chkR : getDtlL()) {
				if (chkR.arr_qty().isPositive()) {
					msgList.add(new MCMessage(chkR, DtlR.$arr_qty, MSBBP0026, toDispGUIIndex(chkR)));
					break;
				}
			}

		}
	}

	/**
	 * [MS_MSBBL1330_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Srch03Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Srch03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1330_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			setCnt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			if (isNull(getHdrR().prnt_lcl_cd())) {
				getHdrR().prnt_lcl_cd(getDtlL().get(0).prnt_lcl_cd());
			}
			setHdrSrchTgtNo();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_SLS_RET_SrchStatus();

		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();

		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down1()) {
				r.setStatus(Status.CREATE);
			}

			for (IoR r : bridge.down2()) {
				r.setStatus(Status.CREATE);
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
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
		hdrR.pri_prnt_flg(getCopyFlg(dtlL.subList(DtlR.$vmi_flg, false), DtlR.$pri_prnt_flg));
		hdrR.cntry_cd(firstDtlR.cntry_cd());
		hdrR.cntry_nm(firstDtlR.cntry_nm());
		hdrR.prnt_lcl_cd(firstDtlR.prnt_lcl_cd());

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
	 * [MS_MSBBL1330_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Srch04Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Srch04Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1330_Srch04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索時の明細の打切ＦＬＧの値を保持するため隠し項目へコピー
			for (DtlR r : bridge.down1()) {
				r.init_abort_flg(r.abort_flg());
			}

			// 検索時の詳細の打切ＦＬＧの値を保持するため隠し項目へコピー
			for (IoR r : bridge.down2()) {
				r.init_abort_flg(r.abort_flg());
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void show() {
			super.show();
			setCnt();
			// 裏リストに格納
			_ioLAll.clear();
			for (IoR r : getIoL()) {
				if (isNull(r.arr_schd_no())) {
					continue;
				}
				_ioLAll.add(r);
			}
			if (isNull(getHdrR().prnt_lcl_cd())) {
				getHdrR().prnt_lcl_cd(getDtlL().get(0).prnt_lcl_cd());
			}
			getHdrR().xrate_cd(getCo().sls_xrate_cd());
			setHdrSrchTgtNo();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setAbort();
			setHdrMode();
			setCnt();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}


		protected void setAbort() {
			for (DtlR r : getDtlL()) {
				r.old_abort_flg(r.abort_flg());
			}

			for (IoR r : getIoL()) {
				r.old_abort_flg(r.abort_flg());
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL1330_Srch04();
	}

	/**
	 * Panel[Cnd]のボタン[srch_ins]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ins(MCEventInfo info) {

		// 検索対象区分に応じて呼出オペレーションを切り替える
		String selectedVal = Cnd_srch_tgt_typ.getValue();
		if (MSC_SLS_SRCH_TGT_TYP.isSHIP_DLV_SLIP_NO(selectedVal)
				|| MSC_SLS_SRCH_TGT_TYP.isSLS_DLV_SLIP_NO(selectedVal)) {
			callMS_MSBBL1330_Srch01();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(selectedVal)) {
			callMS_MSBBL1330_Srch03();
		}
	}

	/**
	 * [MS_MSBBL1330_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Upd01Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;

		protected MS_MSBBL1330_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_trd_cur_upri_chng_flg = false;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 上り電文には裏リストを設定
			bridge.up2().setAll(exceptEmpty(_ioLAll));
		}

		@Override
		protected void show() {
			super.show();
			showChildIoL();
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);

			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurUpriChng(upriChngMsgList);

			if (!upriChngMsgList.isEmpty()) {
				_trd_cur_upri_chng_flg = true;
			}

			msgList.addAll(upriChngMsgList);
		}

		@Override
		protected boolean confirmForCall() {

			 if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				 return super.confirmForCall();
			 }

			if (callMS_MSBBL1330_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();

			if (_trd_cur_upri_chng_flg && !confirmRslt) {

				restoreTrdCurUpri();
			}

			return confirmRslt;
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
			l.set(2, _ioLAll);
			return l;
		}
	}

	/**
	 * [MS_MSBBL1330_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Ins01Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;


		protected MS_MSBBL1330_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			_trd_cur_upri_chng_flg = false;
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);

			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurUpriChng(upriChngMsgList);

			if (!upriChngMsgList.isEmpty()) {
				_trd_cur_upri_chng_flg = true;
			}

			msgList.addAll(upriChngMsgList);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			// 上り電文には裏リストを設定
			bridge.up2().setAll(exceptEmpty(_ioLAll));
		}

		@Override
		protected boolean confirmForCall() {

			 if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				 return super.confirmForCall();
			 }

			if (callMS_MSBBL1330_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();

			if (_trd_cur_upri_chng_flg && !confirmRslt) {

				restoreTrdCurUpri();
			}

			return confirmRslt;
		}

		@Override
		protected void setMode() {
			super.setMode();

			// 貸出出荷返品時は明細の貸出格付を表示させる
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())
					&& getDtlL().get(0).vmi_flg()) {
				columnDtl_cnsgn_gd_cd.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_gd_nm.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_loc_cd.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_loc_nm.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_str_ln_cd.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_str_ln_nm.setMode(MCMode.READ_ONLY);
			}
		}

		@Override
		protected void show() {
			super.show();
			showChildIoL();
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> l = super.getDownBlocks();
			l.set(2, _ioLAll);
			return l;
		}
	}

	/**
	 * 単価が変更された場合、確認メッセージを表示する。
	 * @param msgList メッセージリスト
	 */
	protected void confirmForTrdCurUpriChng(MCMessageList msgList) {

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			return;
		}

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {

			if (!isNull(dtlR.old_trd_cur_upri()) 
					&& !isNull(dtlR.trd_cur_upri()) 
					&& !isSame(dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri()) ) {

				msgList.add(new MCMessage(dtlR, DtlR.$trd_cur_upri, MSBBP0012, dtlR.old_trd_cur_upri(), dtlR.trd_cur_upri(), toDispGUIIndex(dtlR)));
			}
		}
	}

	/**
	 * 単価を変更前に戻す。
	 */
	protected void restoreTrdCurUpri() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {

			if (!isNull(dtlR.old_trd_cur_upri())) {

				setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), dtlR.old_trd_cur_upri());
			}
		}
	}

	/**
	 * 更新前に単価再所得処理を実行する。
	 * @return 実行結果がエラーの場合はtrue
	 */
	protected boolean callMS_MSBBL1330_Sprt01_Before_Upd() {
		MSBBP_SlsRetSchdReg.MS_MSBBL1330_Sprt01Caller caller = createMS_MSBBL1330_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();

		return caller.getErrorFlg();
	}

	@Override
	protected void jbInit() {
		super.jbInit();

		IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setFunctionKey(MCFunctionKey.F11);
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
		// 明細行IDが未設定の場合は発番
		if (isNull(dtlR.dtl_row_id())) {
			dtlR.dtl_row_id(_dtl_row_id++);
		}
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

		if (!isDtlRowSelected() || !isIoRowSelected()) {
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
		r.arr_schd_no(null);
		r.arr_pr_no(null);
		r.ref_sls_act_d_no(null);
		r.ref_dlv_slip_d_no(null);

		r.arr_qty(null);
		r.sls_ret_qty(null);
		r.abort_qty(null);
		r.sls_ret_schd_abort_qty(null);
		r.abort_flg(false);
		r.sls_ret_schd_abort_flg(false);

		// 裏リストへ追加
		_ioLAll.add(r);
	}

	/**
	 * Panel[IoBtn]のボタン[upd_dtl]の押下時の処理
	 */
	@Override
	public void doIoBtn_upd_dtl(MCEventInfo info) {

		_updDtlBtnExecFlg = true;

		// 明細反映処理
		reflectDtlL();

		_updDtlBtnExecFlg = false;
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
		if (!isDtlRowSelected()) {
			return;
		}
		IoTable.deleteRows(getIoL());
		DtlR dr = deleteRow(DtlTable);

		if (dr.isStatusDelete()) {
			for (IoR ioR : getChildIoL(dr)) {
				if (!ioR.isStatusDelete()) {
					ioR.setStatus(Status.DELETE);
				}
			}
		}

		setHdrAmt();
		setHdrIncTaxAmt();

		MCList<IoR> chdIoL = getChildIoL(dr);
		if (!getDtlL().contains(dr) && (Cnd_ope_INS.isSelected() || dr.isStatusCreate())) {
			// 明細に紐付く詳細行をキャッシュから削除する
			_ioLAll.removeAll(chdIoL);
		}
		setIoBtnMode();
	}

	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		if (!isDtlRowSelected()) {
			return;
		}
		DtlR copyR = copyRow(DtlTable);

		setHdrAmt();
		setHdrIncTaxAmt();

		MCList<IoR> chdIoL = getChildIoL(copyR).clone();

		if(!isNull(copyR.dtl_row_id())) {
			copyR.dtl_row_id(nextCnt());
		}
		copyR.abort_flg(false);
		copyR.sls_ret_schd_d_no(null);
		copyR.disp_seq(null);
		copyR.ref_dlv_slip_no(null);
		copyR.ref_dlv_slip_d_no(null);
		copyR.ref_sls_act_no(null);
		copyR.ref_sls_act_d_no(null);
		copyR.arr_pr_no(null);
		copyR.io_schd_pr_no(null);

		copyR.sret_schd_sts_typ(null);
		copyR.sret_schd_sts_typ_nm(null);
		copyR.arr_qty(null);
		copyR.sls_ret_qty(null);
		copyR.arr_cmpl_flg(false);

		chdIoL.setStatus(MCRow.CREATE);
		chdIoL.setNumber(IoR.$dtl_row_id, copyR.dtl_row_id());
		chdIoL.setString(IoR.$arr_schd_no, null);
		chdIoL.setString(IoR.$arr_pr_no, null);
		chdIoL.setString(IoR.$ref_sls_act_d_no, null);
		chdIoL.setString(IoR.$ref_dlv_slip_d_no, null);

		chdIoL.setNumber(IoR.$arr_qty, null);
		chdIoL.setNumber(IoR.$sls_ret_qty, null);
		chdIoL.setNumber(IoR.$abort_qty, null);
		chdIoL.setNumber(IoR.$sls_ret_schd_abort_qty, null);
		chdIoL.setBoolean(IoR.$abort_flg, false);
		chdIoL.setBoolean(IoR.$sls_ret_schd_abort_flg, false);

		// 裏リストへ追加
		_ioLAll.addAll(chdIoL);

		showChildIoL();
	}



	/**
	 * [MS_MSBBL1330_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1330_Srch01Caller<P extends MSBBP_SlsRetSchdReg, B extends MS_MSBBL1330_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1330_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();

			// 裏リストに格納
			_ioLAll.setAll(getIoL());

			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				if (getHdrR().vmi_flg()) {
					setINS_VMIStatus();
				}
				else {
					setINS_SHIP_RETStatus();
				}
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {
				setINS_SLS_RET_SrchStatus();
			}
			setCnt();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
			resetCnt();
			_ioLAll.clear();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down1()) {
				r.setStatus(Status.CREATE);
			}

			for (IoR r : bridge.down2()) {
				r.setStatus(Status.CREATE);
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}
		@Override
		protected void show() {
			super.show();
			setHdrSrchTgtNo();
		}

	}
	/**
	 * 予定ＮＯ引継ぎか否かに応じた担当者部門部品の振る舞い変更のための設定
	 */
	protected void setHdrSrchTgtNo() {
		String no = null;
		for (DtlR r : getDtlL()) {
			if (!isNull(r.ref_dlv_slip_no())) {
				no = r.ref_dlv_slip_no();
				break;
			}
			if (!isNull(r.ref_sls_act_no())) {
				no = r.ref_sls_act_no();
				break;
			}
		}
		setHdrSrchTgtNo(no);
	}
	/**
	 * 予定ＮＯ引継ぎか否かに応じた担当者部門部品の振る舞い変更のための設定
	 */
	protected void setHdrSrchTgtNo(String srchTgtNo) {
		getHdrR().srch_tgt_no(srchTgtNo);
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
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

	// ------------------------------------- Initialize -------------------------------------


	@Override
	protected void setupParts() {
		super.setupParts();

		// 登録枠
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_reg_dt, Hdr_srch_tgt_no);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd,
				Hdr_reg_dt, true, Hdr_xrate_inpt_flg);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd,
				Hdr_xrate_cd, Hdr_reg_dt, true, Hdr_ptax_xrate_inpt_flg);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_no_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

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
		Dtl_arr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		Dtl_sret_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);

		Dtl_trd_upri_amt_p_PPanel.setRelateBeans(
				Hdr_trd_cur_cd, 
				Hdr_cst_cd,
				columnDtl_itm_cd, 
				columnDtl_itm_sub1, 
				columnDtl_itm_sub2, 
				columnDtl_itm_sub3,
				columnDtl_trd_unit_cd,
				columnDtl_trd_unit_qty, 
				Hdr_trd_cur_amt_dec_place, 
				Hdr_trd_cur_upri_dec_place,
				Hdr_sls_amt_rnd_typ, 
				Hdr_sls_tax_rnd_typ,
				Hdr_sls_upri_cng_flg, 
				columnDtl_itm_sls_upri_cng_flg, 
				columnDtl_dscnt_itm_flg);
		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl_trd_upri_amt_p_PPanel.setSchd(true);
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
		Dtl_ptax_cur_inc_tax_amt_p_PPanel
				.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place,
						columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
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
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_loc_cd, columnDtl_str_ln_tgt_flg);
		Dtl_cnsgn_str_ln_p_PPanel.setRelateBeans(columnDtl_cnsgn_loc_cd, columnDtl_cnsgn_str_ln_tgt_flg);
		Dtl_verno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub1, columnDtl_itm_sub1, columnDtl_site_cd,
				columnDtl_ver_flg);
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);

		Dtl_verno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);

		// 詳細
		Io_trd_unit_qty_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2,columnIo_itm_sub3, columnIo_trd_unit_cd,
				columnIo_trd_unit_dec_place, columnIo_trd_unit_rnd_typ, 
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty,
				columnIo_base_unit_cd);

		Io_base_unit_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ,
				columnIo_trd_unit_qty, columnIo_trd_unit_conv_base_qty,
				columnIo_trd_unit_conv_qty);

		Io_arr_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_sret_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_abrt_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_sret_schd_abrt_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_str_ln_p_PPanel.setRelateBeans(columnIo_loc_cd, columnIo_str_ln_tgt_flg);
		Io_cnsgn_str_ln_p_PPanel.setRelateBeans(columnIo_cnsgn_loc_cd, columnIo_cnsgn_str_ln_tgt_flg);
		Io_lot_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_lot_mng_typ,
				columnIo_sublot_mng_typ);
		Io_sno_wrk_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_sno1_mng_typ,
				columnIo_sno2_mng_typ, columnIo_sno3_mng_typ, columnIo_sno4_mng_typ);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		// 得意先
		linkBeansToISPanelCustom(Hdr_cst_cd, true);

		// 納品先
		linkBeansToISPanelCustom(columnDtl_dlv_cd, true);

		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_reg_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt,Hdr_reg_dt);
	}

	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {

		if (columnDtl_lot_no == putter.getLinkBeans()) {
			setDtlLotNoBind(bind, idx);
		}
		else if (columnIo_lot_no == putter.getLinkBeans()) {
			setIoLotNoBind(bind, idx);
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}

	/**
	 * 明細枠のロットＮＯの引数設定
	 * 
	 * @param bind
	 * @param idx
	 */
	protected void setDtlLotNoBind(MCRow bind, int idx) {

		boolean srch_no_stk_and_io_flg = true;
		DtlR dtlR = getDtlL().get(idx);
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			srch_no_stk_and_io_flg = false;
		}
		else if (dtlR.vmi_flg()) {
			srch_no_stk_and_io_flg = false;
		}
		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, srch_no_stk_and_io_flg);
	}

	/**
	 * 詳細枠のロットＮＯの引数設定
	 * 
	 * @param bind
	 * @param idx
	 */
	protected void setIoLotNoBind(MCRow bind, int idx) {

		boolean srch_no_stk_and_io_flg = true;
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			srch_no_stk_and_io_flg = false;
		}
		else if (dtlR.vmi_flg()) {
			srch_no_stk_and_io_flg = false;
		}
		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, srch_no_stk_and_io_flg);
	}

	@Override
	protected void listInit() {
		super.listInit();

		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_reg_dt);
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
	}

	@Override
	public MCList<?> getHdr_cst_cd(MCRow row, MCEventInfo info) {

		row.setStringNE(BpCols.$i_dlv_cd, getHdrR().dlv_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.CST_BY_DLV.value());

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(BpCols.$i_cst_iv_flg, false);
		}

		return super.getHdr_cst_cd(row, info);
	}

	@Override
	public MCList<?> getHdr_trd_cd(MCRow row, MCEventInfo info) {

		if (isShipRtnStatus()) {
			row.setStringNE(TrdCols.$i_trd_ptn_typ, MAC_TRD_PTN_TYP.SHIP_RTN.value());
		}
		// 売上返品の場合、検索前後でモードは変わらないため、売上実績ＮＯの有無で検索前後を判断する。
		else if (isSame(getStatus(), INS_SLS_RET) && !isNull(getDtlL()) && !isNull(getDtlL().get(0)) && !isNull(getDtlL().get(0).ref_sls_act_no())) {
			row.setStringNE(TrdCols.$i_trd_ptn_typ, MAC_TRD_PTN_TYP.SLS_RTN.value());
		}

		return super.getHdr_trd_cd(row, info);
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

	/**
	 * 	品目マスタリストロジックの検索条件を設定する
	 * @param bind
	 * @return
	 */
	protected MCRow setBindDtl_itm_cd(MCRow bind, int index) {
		if (index < 0) {
			return bind;
		}

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			// 出荷返品時、在庫品のみ
			bind.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
		}

		return bind;
	}

	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
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
					getBindRowForISCustom(row, (MCLinkBeans) compo, info.getEventIndex()),info);
		}
		return super.getListForIS(compo, row, info);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == Hdr_cst_cd) {
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				row.setBooleanNE(BpCols.$i_cst_iv_flg, false);
			}
		}

		if (beans == columnDtl_itm_cd || beans == columnDtl_itm_sub1
				|| beans == columnDtl_itm_sub2 || beans == columnDtl_itm_sub3) {
			setBindDtl_itm_cd(row, eventIndex);
		}
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			row.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			row.setDateNE(CstItmCols.$i_dt, getHdrR().reg_dt());
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				// 出荷返品時、在庫品のみ
				row.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
			}
		}
		return row;
	}
	
	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().reg_dt());
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			// 出荷返品時、在庫品のみ
			row.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
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
		msgList.addAll(checkReq(Hdr_reg_dt));
		
	}
	
	protected class CstItmListPutter extends MCListPutter {

		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}
		
		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();

			MCRow setRow =  createPanelRow(compo, index, isNull(row) ? MCRow.create() :row);
			DtlR selectRow = DtlTable.getRow(index);

			if (!isNull(setRow.getStringNE("itm_cd"))) {	
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
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new CstItmListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		insInitSls();
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

		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl_base_cur_amt.addLCListener(this);
		columnDtl_base_cur_inc_tax_amt.addLCListener(this);
		columnDtl_base_cur_tax_amt.addLCListener(this);
		columnDtl_cost_upri.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_base_unit_qty.addLCListener(this);
		columnDtl_lot_no.addLCListener(this);
		columnDtl_sublot_no.addLCListener(this);
		columnDtl_str_ln_cd.addLCListener(this);
		columnDtl_str_ln_cd_none_flg.addNCListener(this);
		columnDtl_cnsgn_str_ln_cd.addLCListener(this);
		columnDtl_cnsgn_str_ln_cd_none_flg.addNCListener(this);
		columnDtl_sno1.addLCListener(this);
		columnDtl_sno2.addLCListener(this);
		columnDtl_sno3.addLCListener(this);
		columnDtl_sno4.addLCListener(this);

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

	protected void setDefaultSrcTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {

			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLS_DLV_SLIP_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_DLV_SLIP_NO.name());

		}
		else {

			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO.name());
		}

	}

	// コンボボックスの設定
	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		else {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	public MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
					MSC_SLS_SRCH_TGT_TYP.SHIP_DLV_SLIP_NO, MSC_SLS_SRCH_TGT_TYP.SLS_DLV_SLIP_NO,
					MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
			};
		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO
			};
		}
	}

	/**
	 * 登録種別時の初期値設定(売上返品)
	 */
	protected void insInitSls() {

		// 管理ＮＯのクリア
		Hdr_sls_ret_schd_no.clear();
		setValueEx(columnDtl_sls_ret_schd_no, null);
		setValueEx(columnDtl_sls_ret_schd_d_no, null);
		setValueEx(columnIo_arr_schd_no, null);
		setValueEx(columnDtl_arr_pr_no, null);

		// デフォルト日付の設定
		Hdr_reg_dt.setValue(getToday());
		Hdr_sls_ret_schd_dt.setValue(getToday());

		Hdr_base_cur_cd.setValue(getBaseCur().cur_cd());
		Hdr_base_cur_nm.setValue(getBaseCur().cur_nm());
		Hdr_base_cur_amt_dec_place.setValue(getBaseCur().amt_dec_place());
		Hdr_base_cur_upri_dec_place.setValue(getBaseCur().upri_dec_place());
		Hdr_xrate_cd.setValue(getCo().sls_xrate_cd());

		Hdr_ptax_cur_cd.setValue(getPtaxCur().cur_cd());
		Hdr_ptax_cur_nm.setValue(getPtaxCur().cur_nm());
		Hdr_ptax_cur_amt_dec_place.setValue(getPtaxCur().amt_dec_place());
		Hdr_ptax_cur_upri_dec_place.setValue(getPtaxCur().upri_dec_place());

		if (_ioLAll == null) {
			_ioLAll = MCList.create(IoR.class);
		}

		HdrPanel.focusFirstComponent();
	}

	/**
	 * 登録種別時の初期値設定（出荷返品）
	 */
	protected void insInitShip() {

		// 管理ＮＯのクリア
		Hdr_sls_ret_schd_no.clear();
		setValueEx(columnDtl_sls_ret_schd_no, null);
		setValueEx(columnDtl_sls_ret_schd_d_no, null);
		setValueEx(columnIo_arr_schd_no, null);
		setValueEx(columnDtl_arr_pr_no, null);

		// デフォルト日付の設定
		Hdr_sls_ret_schd_dt.setValue(getToday());
		Hdr_reg_dt.setValue(getToday());

		if (_ioLAll == null) {
			_ioLAll = MCList.create(IoR.class);
		}

		HdrPanel.focusFirstComponent();
	}

	@Override
	protected void opePanelFillSpace() {
		if (isNull(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {
			DtlTable.fillSpace();
		}
		else {
			int dtlCnt = getDtlL().size();
			int dtlNotDlvCnt = getDtlL().subList(DtlR.$ref_dlv_slip_no, null).size();
			if (isSame(dtlCnt, dtlNotDlvCnt)) {
				DtlTable.fillSpace();
			}
		}
	}



	// ------------------------------------- Mode -------------------------------------

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setIvDtlColumn();
		insInitShip();
		setModeDlvSundryFlg();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		setDtlBtnMode();
		setIoBtnMode();
	}


	@Override
	public void setINS_SLS_RETStatus() {
		super.setINS_SLS_RETStatus();
		insInitSls();
		setIvDtlColumn();
		setModeCstIvFlg();
		setCstIvFlgCtrl();
		setModeDlvSundryFlg();
		setModeXrateInptFlg();
		setShipMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
	}

	public void setINS_SLS_RET_SrchStatus() {
		getHdrR().reg_dt(getToday());
		super.setINS_SLS_RETStatus();
		MCNumber tmpXrate = getHdrR().xrate();
		MCNumber tmpPtaxXrate = getHdrR().ptax_xrate();
		insInitSls();
		Hdr_xrate.setValue(tmpXrate);
		Hdr_ptax_xrate.setValue(tmpPtaxXrate);
		setIvDtlColumn();
		setModeCstIvFlg();
		setCstIvFlgCtrl();
		setModeDlvSundryFlg();
		setModeXrateInptFlg();
		setXrateInptFlg();
		setShipMode();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		DtlTable.fillSpace();
	}

	@Override
	public void setINS_SHIP_RETStatus() {
		super.setINS_SHIP_RETStatus();
		setIvDtlColumn();
		insInitShip();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setINS_VMIStatus() {
		super.setINS_VMIStatus();
		setIvDtlColumn();
		insInitShip();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setIvDtlColumn();
		setModeCnsgnGd();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setIvDtlColumn();
		CndPanel.focusFirstComponent();
	}

	protected void setPItem(){
		setIvDtlColumn();
		setModeCstIvFlg();
		setCstIvFlgCtrl();
		setModeDlvSundryFlg();
		setModeXrateInptFlg();
		setShipMode();
		setBtnSprtMode();
		setModeCnsgnGd();
		setModeSyncFlg();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		HdrR hdr = getHdrR();
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(hdr.trd_ptn_typ())) {
			if (hdr.vmi_flg()) {
				super.setUPDStatus();
				setPItem();
			}
			else {
				setUPD_SHIP_RETStatus();
			}
		}
		else if (MAC_TRD_PTN_TYP.isSLS_RTN(hdr.trd_ptn_typ())) {
			setUPD_SLS_RETStatus();
		}
		setHdrMode();
		setDestCdMode();
		setDtlBtnMode();
		setIoBtnMode();
	}

	/**
	 * 入庫数量がある明細が存在する場合、ヘッダ項目は入力不可
	 */
	protected void setHdrMode() {
		for (DtlR r : getDtlL()) {
			if (!isNull(r.arr_qty()) && r.arr_qty().isPositive()) {
				Hdr_dlv_cd.setMode(MCMode.READ_ONLY);
				Hdr_reg_dt.setMode(MCMode.READ_ONLY);
				Hdr_sls_ret_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_cst_cd.setMode(MCMode.READ_ONLY);
				Hdr_sls_usr_cd.setMode(MCMode.READ_ONLY);
				Hdr_sls_dpt_cd.setMode(MCMode.READ_ONLY);
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
				Hdr_num_flg.setMode(MCMode.READ_ONLY);
				Hdr_ref_iv_no.setMode(MCMode.READ_ONLY);
				Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
				Hdr_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
				Hdr_xrate.setMode(MCMode.READ_ONLY);
				Hdr_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
				Hdr_ptax_xrate.setMode(MCMode.READ_ONLY);
				Hdr_cst_po_no.setMode(MCMode.READ_ONLY);
				Hdr_ar_dpt_cd.setMode(MCMode.READ_ONLY);
				Hdr_trd_rmrks.setMode(MCMode.READ_ONLY);
				Hdr_intr_rmrks.setMode(MCMode.READ_ONLY);
				Hdr_tterm_cd1.setMode(MCMode.READ_ONLY);
				Hdr_tterm_rmrks1.setMode(MCMode.READ_ONLY);
				Hdr_tterm_cd2.setMode(MCMode.READ_ONLY);
				Hdr_tterm_rmrks2.setMode(MCMode.READ_ONLY);
				Hdr_tterm_cd3.setMode(MCMode.READ_ONLY);
				Hdr_tterm_rmrks3.setMode(MCMode.READ_ONLY);
				Hdr_sub_char1.setMode(MCMode.READ_ONLY);
				Hdr_sub_char2.setMode(MCMode.READ_ONLY);
				Hdr_sub_char3.setMode(MCMode.READ_ONLY);

				break;
			}
		}
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().vmi_flg()) {
			for (DtlR r : getDtlL()) {
				if (!isNull(r.ref_dlv_slip_no())) {
					Hdr_dlv_cd.setMode(MCMode.READ_ONLY);
					Hdr_dest_cd1.setMode(MCMode.READ_ONLY);
					break;
				}
			}
		}
	}

	@Override
	public void setUPD_SLS_RETStatus() {
		super.setUPD_SLS_RETStatus();
		setPItem();
		setDestCdMode();
	}

	@Override
	public void setUPD_SHIP_RETStatus() {
		super.setUPD_SHIP_RETStatus();
		setPItem();
		setDestCdMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setIvDtlColumn();
		setModeCnsgnGd();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setIvDtlColumn();
		setModeCnsgnGd();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setIvDtlColumn();
		setModeCnsgnGd();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setIvDtlColumn();
		setModeCnsgnGd();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		CndPanel.focusFirstComponent();
	}

	protected void setIvDtlColumn() {
		if (getHdrR().cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())){
			columnDtl_iv_itm_nm.setVisible(true);
			columnDtl_cntry_org_cd.setVisible(true);
			columnDtl_cntry_org_nm.setVisible(true);
		}
		else {
			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);
		}
		if (!getHdrR().cst_iv_flg()){
			columnDtl_tdlv_cd.setVisible(false);
			columnDtl_tdlv_nm.setVisible(false);
		}
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().cst_iv_flg()) {
			columnDtl_tdlv_cd.setVisible(true);
			columnDtl_tdlv_nm.setVisible(true);
		}
	}

	/**
	 * 	検索前の登録種別のモード制御
	 */
	protected void setINSMode(String trd_ptn_typ) {

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(trd_ptn_typ)) {
			Hdr_sync_flg.setValue(true);
			Hdr_vmi_flg.setValue(true);
			setINSStatus();
			DtlTable.fillSpace();
		}
		else if (MAC_TRD_PTN_TYP.isSLS_RTN(trd_ptn_typ)) {
			Hdr_sync_flg.setValue(true);
			Hdr_vmi_flg.setValue(false);
			// 売上返品の取引パタンの場合、検索前・検索後でモードの違いは、取引ＣＤのリストロジックのみなのでステータスは共用とする
			setINS_SLS_RETStatus();
			Hdr_trd_cd.setMode(MCMode.ENABLE);
			DtlTable.fillSpace();
		}
		else {
			// 取引ＣＤがクリアされた場合は、取引ＣＤ以外の登録項目はロックする（ほぼ非活性のため専用ステータスは定義しない）
			setFix(HdrTabPanel, ListPanel);
			// ただし取引ＣＤだけは除外
			Hdr_trd_cd.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 	明細ブロックのモード制御
	 */
	protected void setDtlBtnMode() {

		DtlR selectRow = DtlTable.getSelectedMCRow();

		if (isUpdStatus()) {
			if (!(MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().vmi_flg()) ||
					!isNull(selectRow) && !selectRow.isEmpty() && (selectRow.isStatusDelete() 
									|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())
									|| !isNull(selectRow.ref_dlv_slip_d_no())
									|| !isNull(selectRow.ref_sls_act_d_no())
									|| !isEditable(columnDtl_cnsgn_loc_cd, DtlTable.getEventInfo().getEventIndex()))) {

				DtlBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
			}

			if (isNull(selectRow)) {
				setDefaultMode(DtlBtn_radd);
				setDefaultMode(DtlBtn_rcopy);
				setDefaultMode(DtlBtn_rdel);
				return;
			}
			//出荷返品且つ納品書NOを元に参照する場合は、行追加、行コピーできない。
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())
					&& !isNull(selectRow.ref_dlv_slip_d_no())){
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
				DtlBtn_radd.setMode(MCMode.DISABLE);
			}


			// 「一部入荷」「一部入荷・未計上」「入荷完了・未計上」「完了」の明細は行削除不可。
			if (MSC_SRET_SCHD_STS_TYP.isPART_ARR(selectRow.sret_schd_sts_typ())
					|| MSC_SRET_SCHD_STS_TYP.isPART_ARR_NON_AC(selectRow
							.sret_schd_sts_typ())
					|| MSC_SRET_SCHD_STS_TYP.isCMPL(selectRow.sret_schd_sts_typ())
					|| MSC_SRET_SCHD_STS_TYP.isCMPL_ARR_NON_AC(selectRow
							.sret_schd_sts_typ())) {
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			else if ((!isNull(selectRow.sls_ret_schd_d_no()) && selectRow.init_abort_flg()) || selectRow.abort_flg()) {
				// 更新で検索時、該当行の更新前の打切ＦＬＧがオンだった場合、該当行の行削除は不可にする。（一度、打切を解除してからなら行削除可能）
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_rdel);
			}
		}
	}

	/**
	 * 	詳細ボタンブロックのモード設定
	 */
	protected void setIoBtnMode() {

		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isUpdStatus()) {

			if (!(MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().vmi_flg())
					|| isNull(selectRow) 
					|| selectRow.isEmpty()
					|| isNull(selectRow.itm_cd())
					|| selectRow.isStatusDelete()
					|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())
					|| !isEditable(columnIo_cnsgn_loc_cd, IoTable.getEventInfo().getEventIndex())) {
				IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
			}

			if (isNull(selectRow) 
					|| selectRow.abort_flg()
					|| selectRow.isStatusDelete()) {
				IoBtn_radd.setMode(MCMode.DISABLE);
				IoBtn_rcopy.setMode(MCMode.DISABLE);
				IoBtn_rdel.setMode(MCMode.DISABLE);
				IoBtn_upd_dtl.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_radd);
				setDefaultMode(IoBtn_rcopy);

				// 行削除・明細反映ボタン
				// 一部でも入荷/打切されている詳細は行削除不可。明細の打切がオンの場合も行削除不可
				if (hasAbrtOrArrAct(selectRow)) {
					IoBtn_radd.setMode(MCMode.DISABLE);
					IoBtn_rcopy.setMode(MCMode.DISABLE);
					IoBtn_rdel.setMode(MCMode.DISABLE);
					IoBtn_upd_dtl.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(IoBtn_upd_dtl);
					// 更新で検索時、該当行の更新前の打切ＦＬＧがオンだった場合、該当行の行削除は不可にする。（一度、打切を解除してからなら行削除可能）
					if (selectRow.init_abort_flg() && !isNull(selectRow.arr_pr_no())) {
						IoBtn_rdel.setMode(MCMode.DISABLE);
					}
					else {
						if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().vmi_flg() && !isNull(selectRow.ref_dlv_slip_no())) {
							IoBtn_radd.setMode(MCMode.DISABLE);
							IoBtn_rcopy.setMode(MCMode.DISABLE);
						}
						else {
							setDefaultMode(IoBtn_rdel);
						}
					}
				}
			}
		}
	}

	/**
	 * 	更新可能な画面ステータスか判定する
	 * @return
	 */
	protected boolean isUpdStatus() {

		return isSame(getStatus(), INS) || isSame(getStatus(), INS_SLS_RET)
				|| isSame(getStatus(), INS_VMI) || isSame(getStatus(), INS_SHIP_RET) || isSame(getStatus(), UPD)
				|| isSame(getStatus(), UPD_SLS_RET) || isSame(getStatus(), UPD_SHIP_RET);
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
			Boolean vmi = getHdrR().vmi_flg();
			if (isUpdStatus()) {
				if (column != columnDtl_abort_flg) {
					if (r.abort_flg() || (!isNull(r.arr_qty()) && r.arr_qty().isPositive())) {
						// 打切ＦＬＧがオンの場合、入庫数量>0 の場合、打切ＦＬＧ項目以外はすべて編集不可
						return MCMode.READ_ONLY;
					}

					else if (r.old_abort_flg()) {
						// 打切ＦＬＧがオフの場合でも、更新前の打切ＦＬＧがオンのケースは打切ＦＬＧ項目以外はすべて編集不可
						return MCMode.READ_ONLY;
					}
				}
				// 打切
				if (column == columnDtl_abort_flg) {
					// 更新前の打切ＦＬＧがオンの場合は打切ＦＬＧのみ変更可能
					if (r.old_abort_flg()) {
						return MCMode.REQUIRED;
					}
					// 新規行は編集不可
					if (isNull(r.sls_ret_schd_d_no())) {
						return MCMode.READ_ONLY;
					}
					// 詳細の入荷予定に、入荷/打切のレコードが存在しない場合にのみチェック可能。
					else if (!hasAbrtOrArrAct(r) || r.chg_abort_flg()) {
						return MCMode.REQUIRED;
					}
				}
				// 出荷返品時の入力制御
				if (asList(SHIP_RET_RO_COLS).contains(column.getBaseRowColumnName())) {
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && !vmi) {
						return MCMode.READ_ONLY;
					}
				}
				// 品名の入力制御
				if (column == columnDtl_itm_nm) {

					// 実績参照時は不可
					if (!isNull(r.ref_sls_act_d_no())) {
						return MCMode.READ_ONLY;
					}
				}
				// インボイス表記品名
				if (column == columnDtl_iv_itm_nm) {
					if (getHdrR().cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())){
						if (r.sundry_itm_flg() && isNull(r.ref_sls_act_d_no())) {
							return MCMode.REQUIRED;
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}

				// 納品先諸口ＦＬＧによる入力制御
				if (asList(DLV_SUNDRY_EDTBL_COLS).contains(column.getBaseRowColumnName())) {
					// 納品先諸口ＦＬＧがオンで出荷実績参照時（出荷返品時）以外の場合、編集可
					if (r.dlv_sundry_flg() && (!isSame(getStatus(), INS_SHIP_RET) || !isSame(getStatus(), INS_VMI))) {
						return MCMode.ENABLE;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}

				// 取引数量
				if (column == columnDtl_trd_unit_qty) {
					// 一部でも入荷されている場合は変更不可
					if (!isNull(r.arr_qty()) && r.arr_qty().isPositive()) {
						return MCMode.READ_ONLY;
					}
				}
				// 取引単位
				if (column == columnDtl_trd_unit_cd) {
					//取引パタン区分が出荷返品、かつ得意先がインボイス対象取引ＦＬＧがオンの場合は、
					//登録する、訂正するの両方とも、単位、数量は変更不可（READ_ONLY)　上段・下段の両方とも。
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())
							&& getHdrR().cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 価格印字
				if (column == columnDtl_pri_prnt_flg) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 取得対象外
				if (column == columnDtl_upri_not_tgt_flg) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 取引通貨金額
				if (column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
					if (!r.upri_not_tgt_flg() || (!r.itm_sls_upri_cng_flg() && !getHdrR().sls_upri_cng_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				// 値引品目の場合、単位/数量は変更不可
				if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 税指定
				if (column == columnDtl_tax_fix_flg) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 原価単価
				if (column == columnDtl_cost_upri) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 値引額
				if (column == columnDtl_trd_cur_dscnt_amt) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 値引理由ＣＤ
				if (column == columnDtl_dscnt_rsn_cd) {
					if (!isNull(r.trd_cur_dscnt_amt())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}

				// 請求繰越回数
				if (column == columnDtl_bill_crryovr_times) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 負担部門
				if (column == columnDtl_bd_dpt_cd) {
					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
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

				// 負担部門ＣＤ
				if (column == columnDtl_bd_dpt_cd) {
					if (!r.sls_acxfr_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 格付ＣＤ
				if (column == columnDtl_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					if (!isWatxRateEditable()) {
						return MCMode.READ_ONLY;
					}
				}

				// 原産地
				if (column == columnDtl_cntry_org_cd) {
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 手配ＮＯ１～４
				if (column == columnDtl_sno1 || column == columnDtl_sno2 || column == columnDtl_sno3 || column == columnDtl_sno4) {
					if (isNull(getHdrR().trd_cd())) {
						return MCMode.READ_ONLY;
					}
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && getHdrR().vmi_flg() && !isNull(r.ref_dlv_slip_no())) {
						return MCMode.READ_ONLY;
					}
				}

				if (isTrnstShip(getHdrR(), r)) {
					if (getHdrR().vmi_flg()) {
						if (column == columnDtl_cnsgn_loc_cd ||
							column == columnDtl_cnsgn_str_ln_cd ||
							column == columnDtl_cnsgn_str_ln_cd_none_flg) {
							return MCMode.READ_ONLY;
						}
					}

					if (column == columnDtl_dlv_cd ||
						column == columnDtl_dest_cd1 ||
						column == columnDtl_itm_cd ||
						column == columnDtl_itm_sub1 ||
						column == columnDtl_itm_sub2 ||
						column == columnDtl_itm_sub3 ||
						column == columnDtl_lot_no ||
						column == columnDtl_sublot_no ||
						column == columnDtl_ver_no ||
						column == columnDtl_trd_unit_cd ||
						column == columnDtl_cnsgn_gd_cd ||
						column == columnDtl_cst_po_d_no ||
						column == columnDtl_cst_itm_cd ||
						column == columnDtl_cst_itm_nm
						) {
						return MCMode.READ_ONLY;
					}
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

				// 親の明細行を取得
				DtlR parDtl = getParDtlR(r);
				if (parDtl.abort_flg() && !MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
					// 親の明細の打切ＦＬＧがオンの場合、編集不可
					return MCMode.READ_ONLY;
				}

				if (column != columnIo_abort_flg && column != columnIo_sls_ret_schd_abort_flg) {
					if (r.abort_flg() || (!isNull(parDtl.arr_qty()) && parDtl.arr_qty().isPositive())) {
						// 打切ＦＬＧがオンの場合、入庫数量>0 の場合、打切ＦＬＧ項目以外はすべて編集不可
						return MCMode.READ_ONLY;
					}
					else if (r.old_abort_flg()) {
						// 打切ＦＬＧがオフの場合でも、更新前の打切ＦＬＧがオンのケースは打切ＦＬＧ項目以外はすべて編集不可
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnIo_abort_flg) {

					// 入庫数量=0 の場合は入力不可
					if (!isNull(r.arr_qty()) && r.arr_qty().isZero()) {
						return MCMode.READ_ONLY;
					}
					// 基準単位数量＞入荷数量の場合にオンにできる
					else if (!isNull(r.arr_qty()) && !isNull(r.base_unit_qty()) && r.base_unit_qty().gt(r.arr_qty())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnIo_sls_ret_schd_abort_flg) {

					// 入荷数量＞売上返品数量の場合にオンにできる
					if (!isNull(r.arr_qty()) && r.arr_qty().gt(r.sls_ret_qty()) && !MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}

				}

				if (column == columnIo_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnIo_cnsgn_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnIo_cnsgn_loc_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnIo_cnsgn_str_ln_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (getHdrR().vmi_flg()) {
						if (!r.cnsgn_str_ln_cd_none_flg() && isNull(parDtl.ref_dlv_slip_d_no())) {
							return MCMode.ENABLE;
						}
					}
				}
				if (column == columnIo_cnsgn_str_ln_cd_none_flg) {
					if (getHdrR().vmi_flg() && isNull(parDtl.ref_dlv_slip_d_no())) {
						return MCMode.ENABLE;
					}
				}
				// 取引数量,取引単位
				if (column == columnIo_trd_unit_qty || column == columnIo_trd_unit_cd) {
					//取引パタン区分が出荷返品、かつ得意先がインボイス対象取引ＦＬＧがオンの場合は、
					//登録する、訂正するの両方とも、単位、数量は変更不可（READ_ONLY)　上段・下段の両方とも。
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())
							&& getHdrR().cst_iv_flg()
							&& column == columnIo_trd_unit_cd) {
						return MCMode.READ_ONLY;
					}

					if (parDtl.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (isTrnstShip(getHdrR(), parDtl)) {
					if (getHdrR().vmi_flg()) {
						if (column == columnIo_cnsgn_loc_cd ||
							column == columnIo_cnsgn_str_ln_cd ||
							column == columnIo_cnsgn_str_ln_cd_none_flg) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnIo_lot_no ||
						column == columnIo_sublot_no ||
						column == columnIo_sno1 ||
						column == columnIo_sno2 ||
						column == columnIo_sno3 ||
						column == columnIo_sno4 ||
						column == columnIo_cnsgn_gd_cd ||
						column == columnIo_trd_unit_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isTrnstShip(HdrR hdrR, DtlR dtlR) {
		return (MAC_TRD_PTN_TYP.isSHIP_RTN(hdrR.trd_ptn_typ()) && !isNull(dtlR.ref_dlv_slip_no()))
				|| isShipRtnStatus();
	}

	protected boolean isShipRtnStatus() {
		return isSame(getStatus(), INS_SHIP_RET) || isSame(getStatus(), INS_VMI);
	}

	/**
	 * 出荷返品（貸出返品を除く）の場合に入力不可な明細一覧項目
	 */
	protected final String[] SHIP_RET_RO_COLS = new String[] {
			DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3,
			DtlR.$itm_nm, DtlR.$dlv_cd, DtlR.$dlv_nm, DtlR.$dlv_addr1, DtlR.$dlv_addr2, DtlR.$dlv_addr3,
			DtlR.$dlv_addr4, DtlR.$dlv_cntct_dpt, DtlR.$dlv_cntct_psn, DtlR.$dlv_tel, DtlR.$dlv_fax,
			DtlR.$dest_cd1, DtlR.$dest_cd2, DtlR.$dest_cd3, DtlR.$trd_unit_cd, 
			DtlR.$trd_cur_upri, DtlR.$interim_flg, DtlR.$trd_cur_dscnt_amt, DtlR.$dscnt_rsn_cd,
			DtlR.$cost_upri, DtlR.$tax_fix_flg, DtlR.$tax_cd,DtlR.$bill_crryovr_times, 
			DtlR.$sno1, DtlR.$sno2, DtlR.$sno3, DtlR.$sno4,
			DtlR.$cst_po_d_no, DtlR.$cst_itm_cd, DtlR.$cst_itm_nm, DtlR.$bd_dpt_cd
	};

	/**
	 * 納品先諸口ＦＬＧがオンの場合に入力可能な明細一覧項目
	 */
	protected final String[] DLV_SUNDRY_EDTBL_COLS = new String[] {
			DtlR.$dlv_nm, DtlR.$dlv_addr1, DtlR.$dlv_addr2, DtlR.$dlv_addr3,
			DtlR.$dlv_addr4, DtlR.$dlv_cntct_dpt, DtlR.$dlv_cntct_psn, DtlR.$dlv_tel,
			DtlR.$dlv_fax
	};

	/**
	 * 納品先諸口ＦＬＧによる登録枠の入力モード制御
	 */
	protected void setModeDlvSundryFlg() {

		MCMode setMode;
		if (isUpdStatus()) {
			if (Hdr_dlv_sundry_flg.getValue()) {
				setMode = MCMode.ENABLE;
			}
			else {
				setMode = MCMode.READ_ONLY;
			}

			Hdr_dlv_nm.setMode(setMode);
			Hdr_dlv_addr1.setMode(setMode);
			Hdr_dlv_addr2.setMode(setMode);
			Hdr_dlv_addr3.setMode(setMode);
			Hdr_dlv_addr4.setMode(setMode);
			Hdr_dlv_cntct_dpt.setMode(setMode);
			Hdr_dlv_cntct_psn.setMode(setMode);
			Hdr_dlv_fax.setMode(setMode);
			Hdr_dlv_tel.setMode(setMode);
		}
	}

	/**
	 * 出荷取引の入力制御を行う。
	 */
	protected void setShipMode() {

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			Hdr_ar_dpt_cd.setMode(MCMode.READ_ONLY);
			Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
			Hdr_pri_prnt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_ar_dpt_cd);
		}
	}

	/**
	 * 単価再取得ボタンのモードを設定する。
	 */
	protected void setBtnSprtMode() {

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {

			DtlBtn_sprt_srch_upri.setMode(MCMode.DISABLE);
		}
		else {

			setDefaultMode(DtlBtn_sprt_srch_upri);
		}
	}

	/**
	 * 	インボイス取引対象による入力モード制御
	 */
	protected void setModeCstIvFlg() {

		if (isUpdStatus()) {
			if (getHdrR().cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {

				Hdr_iv_no.setMode(MCMode.REQUIRED);
				Hdr_num_flg.setMode(MCMode.ENABLE);
				Hdr_ref_iv_no.setMode(MCMode.ENABLE);
				setDefaultMode(columnDtl_iv_itm_nm);
				setDefaultMode(columnDtl_cntry_org_cd);
				setDefaultMode(columnDtl_cntry_org_nm);

				if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
					Hdr_rcv_schd_dt.setMode(MCMode.REQUIRED);
				}
				else {
					setDefaultMode(Hdr_rcv_schd_dt);
				}
			}
			else{
				setDefaultMode(Hdr_iv_no);
				setDefaultMode(Hdr_num_flg);
				setDefaultMode(Hdr_ref_iv_no);
				setDefaultMode(Hdr_rcv_schd_dt);
				columnDtl_iv_itm_nm.setMode(MCMode.INVISIBLE);
				columnDtl_iv_itm_nm.setMode(MCMode.INVISIBLE);
				columnDtl_cntry_org_cd.setMode(MCMode.INVISIBLE);
				columnDtl_cntry_org_nm.setMode(MCMode.INVISIBLE);
			}

		}
	}

	/**
	 * 為替レート指定ＦＬＧ、納税為替レート指定ＦＬＧのモードを設定する
	 */
	protected void setModeXrateInptFlg() {

		if (isNullOr(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd()) 
				|| isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd())) {
			Hdr_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_xrate_inpt_flg);
		}

		if (isNullOr(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd())
				|| isSame(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd())) {
			Hdr_ptax_xrate_inpt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_ptax_xrate_inpt_flg);
		}
	}

	protected void setXrateInptFlg() {
		if (!isNull(getHdrR().trd_cur_cd()) && !isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd())) {
			Hdr_xrate_inpt_flg.setValue(true);
		}
		if (!isNull(getHdrR().trd_cur_cd()) && !isNull(getHdrR().ptax_cur_cd()) && !isSame(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd())) {
			Hdr_ptax_xrate_inpt_flg.setValue(true);
		}
	}

	protected void setModeCnsgnGd() {
		if (getHdrR().vmi_flg()) {
			// 貸出格付項目を表示させる
			if (isUpdStatus()) {
				columnDtl_cnsgn_gd_cd.setMode(MCMode.ENABLE);
				columnDtl_cnsgn_loc_cd.setMode(MCMode.ENABLE);
				columnIo_cnsgn_gd_cd.setMode(MCMode.REQUIRED);
				columnIo_cnsgn_loc_cd.setMode(MCMode.REQUIRED);
			}
			else {
				columnDtl_cnsgn_gd_cd.setMode(MCMode.READ_ONLY);
				columnDtl_cnsgn_loc_cd.setMode(MCMode.READ_ONLY);
				columnIo_cnsgn_gd_cd.setMode(MCMode.READ_ONLY);
				columnIo_cnsgn_loc_cd.setMode(MCMode.READ_ONLY);
			}
			columnDtl_cnsgn_gd_nm.setMode(MCMode.READ_ONLY);
			columnDtl_cnsgn_loc_nm.setMode(MCMode.READ_ONLY);
			columnIo_cnsgn_gd_nm.setMode(MCMode.READ_ONLY);
			columnIo_cnsgn_loc_nm.setMode(MCMode.READ_ONLY);
			columnIo_cnsgn_str_ln_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			columnDtl_cnsgn_gd_cd.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_gd_nm.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_loc_cd.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_loc_nm.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnDtl_cnsgn_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_gd_cd.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_gd_nm.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_loc_cd.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_loc_nm.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnIo_cnsgn_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setModeSyncFlg() {
		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			Hdr_sync_flg.setMode(MCMode.READ_ONLY);
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

	/**
	 * 	登録枠の納品先・仕向先関連項目を指定行の項目にコピーする
	 * @param index
	 */
	protected void copyHdr2DtlInfo(int index) {

		DtlR row = getDtlL().get(index);
		if (!isNull(row.itm_cd())) {
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
			if (isEditable(columnDtl_dest_cd1, row.getGUIIndex())) {
				row.dest_cd1(hdr.dest_cd1());
				row.dest_nm1(hdr.dest_nm1());
			}
			if (isEditable(columnDtl_dest_cd2, row.getGUIIndex())) {
				row.dest_cd2(hdr.dest_cd2());
				row.dest_nm2(hdr.dest_nm2());
			}
			if (isEditable(columnDtl_dest_cd3, row.getGUIIndex())) {
				row.dest_cd3(hdr.dest_cd3());
				row.dest_nm3(hdr.dest_nm3());
			}
		}
	}

	/**
	 * 	登録枠から明細行へ値コピーの対象となる有効な明細行のリストを抽出する
	 * <p>
	 * 	有効な明細行の条件：品目ＣＤが指定済で、新規ステータスとする
	 * </p>
	 * @param l
	 * @return
	 */
	protected MCList<DtlR> copyDtlL(MCList<DtlR> l) {

		MCList<DtlR> retL = getDtlL().createInstance();
		for (DtlR r : l) {
			if (!isNull(r.itm_cd()) && r.isStatusCreate()) {
				retL.add(r);
			}
		}
		return retL;
	}

	/**
	 *	明細の品目情報を入力予定の指定行へコピーする
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
		dest.itm_cd(src.itm_cd());
		dest.itm_sub1(src.itm_sub1());
		dest.itm_sub2(src.itm_sub2());
		dest.itm_sub3(src.itm_sub3());
		dest.stk_mng_typ(src.stk_mng_typ());
		dest.lot_mng_typ(src.lot_mng_typ());
		dest.sublot_mng_typ(src.sublot_mng_typ());
		dest.sno1_mng_typ(src.sno1_mng_typ());
		dest.sno2_mng_typ(src.sno2_mng_typ());
		dest.sno3_mng_typ(src.sno3_mng_typ());
		dest.sno4_mng_typ(src.sno4_mng_typ());
		dest.base_unit_cd(src.base_unit_cd());
		dest.base_unit_nm(src.base_unit_nm());
		dest.base_unit_dec_place(src.base_unit_dec_place());
		dest.base_unit_rnd_typ(src.base_unit_rnd_typ());
		dest.dtl_row_id(src.dtl_row_id());
		dest.loc_cd(src.loc_cd());
		dest.loc_nm(src.loc_nm());
		dest.cnsgn_loc_cd(src.cnsgn_loc_cd());
		dest.cnsgn_loc_nm(src.cnsgn_loc_nm());
		dest.gd_cd(src.gd_cd());
		dest.gd_nm(src.gd_nm());
		dest.cnsgn_gd_cd(src.cnsgn_gd_cd());
		dest.cnsgn_gd_nm(src.cnsgn_gd_nm());
		dest.lot_no(src.lot_no());
		dest.sublot_no(src.sublot_no());
		dest.str_ln_cd(src.str_ln_cd());
		dest.str_ln_nm(src.str_ln_nm());
		dest.str_ln_cd_none_flg(src.str_ln_cd_none_flg());
		dest.str_ln_tgt_flg(src.str_ln_tgt_flg());
		dest.cnsgn_str_ln_cd(src.cnsgn_str_ln_cd());
		dest.cnsgn_str_ln_nm(src.cnsgn_str_ln_nm());
		dest.cnsgn_str_ln_cd_none_flg(src.cnsgn_str_ln_cd_none_flg());
		dest.cnsgn_str_ln_tgt_flg(src.cnsgn_str_ln_tgt_flg());
		dest.sno1(src.sno1());
		dest.sno2(src.sno2());
		dest.sno3(src.sno3());
		dest.sno4(src.sno4());
	}

	/**
	 * 	明細反映処理
	 * <p>
	 * 	詳細の選択行の数量集計し明細の数量に反映する。必要に応じ、単位換算して明細の単位も変更する。
	 * </p>
	 */
	protected void reflectDtlL() {

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
	 * 	指定した明細に紐づく詳細情報に一部でも入荷/打切されている行が存在するか判定する
	 * @param par
	 * @return
	 */
	protected boolean hasAbrtOrArrAct(DtlR par) {

		boolean rslt = false;
		MCList<IoR> chdIoL = getChildIoL(par);
		for (IoR r : chdIoL) {
			if (r.abort_flg() || (!isNull(r.arr_qty()) && r.arr_qty().isPositive())) {
				rslt = true;
				break;
			}
		}

		return rslt;
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

		// 画面制御でしくじらなければ明細のdtl_row_idはユニークである
		if (!isNull(parDtlL) && !parDtlL.isEmpty()) {
			return parDtlL.get(0);
		}
		return DtlR.create();
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

		if (Dtl_itm_p_PPanel.isItm(lc)) doDtl_itm_LC(info);
		if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		if (lc == columnDtl_cnsgn_str_ln_cd) doDtl_cnsgn_str_ln_cd_LC(info);
		if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		if (lc == columnDtl_base_unit_qty) doDtl_base_unit_qty_LC(info);
		if (lc == columnDtl_base_cur_amt) doDtl_base_cur_amt_LC(info);
		if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_cost_upri) doDtl_cost_upri_LC(info);
		if (lc == columnDtl_trd_cur_inc_tax_amt) doDtl_trd_cur_inc_tax_amt_LC(info);

		if (lc == columnIo_cnsgn_str_ln_cd) doIo_cnsgn_str_ln_cd_LC(info);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == Hdr_pri_prnt_flg) doHdr_pri_prnt_flg_NC(info);

		if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		if (nc == columnDtl_cnsgn_str_ln_cd_none_flg) doDtl_cnsgn_str_ln_cd_none_flg_NC(info);
	}

	/**
	 * 種別変更イベント
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setDefaultSrcTgtTyp();
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdrR().sls_ret_schd_no());
		}
		// 参照登録時は、売上担当者・売上部門を保持する
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			setHdrSrchTgtNo(getHdrR().sls_ret_schd_no());
		}
	}


	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}

		return true;
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			setRefToInsInit();
		}
	}

	@Override
	protected List<String> getNotInheritCols(String type,
			MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);
		if (cont == getDtlL()) {
			l.add(DtlR.$old_abort_flg);
			l.add(DtlR.$abort_flg);
		} else if (cont == getIoL()) {
			l.add(IoR.$old_abort_flg);
			l.add(IoR.$abort_flg);
		}
		return l;
	}
	
	protected void setRefToInsInit() {

		setValueEx(columnDtl_io_schd_pr_no, null);
		setValueEx(columnDtl_disp_seq, null);
		setValueEx(columnDtl_sret_schd_sts_typ, null);
		setValueEx(columnDtl_sret_schd_sts_typ_nm, null);
		setValueEx(columnDtl_arr_cmpl_flg, false);
		setValueEx(columnDtl_arr_qty, null);
		setValueEx(columnDtl_sls_ret_qty, null);
		if (!(MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ()) && !getHdrR().vmi_flg())) {
			setValueEx(columnDtl_ref_dlv_slip_no, null);
			setValueEx(columnDtl_ref_dlv_slip_d_no, null);
		}
		setValueEx(columnDtl_ref_sls_act_no, null);
		setValueEx(columnDtl_ref_sls_act_seq, null);
		setValueEx(columnDtl_ref_sls_act_d_no, null);
		setValueEx(columnDtl_ref_sls_act_d_seq, null);

		for (IoR r : _ioLAll) {
			r.setStatus(Status.CREATE);
			r.abort_flg(false);
			r.sls_ret_schd_abort_flg(false);
			r.arr_qty(null);
			r.sls_ret_qty(null);
			r.abort_qty(null);
			r.sls_ret_schd_abort_qty(null);
			r.arr_pr_no(null);
			r.arr_schd_no(null);
		}

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			if (getHdrR().vmi_flg()) {
				setINSStatus();
			}
			else {
				setINS_SHIP_RETStatus();
				setDtlBtnMode();
				setIoBtnMode();
			}
		}
		else if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {
			setINS_SLS_RETStatus();
		}
	}

	public void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())){
			// 売上部門を債権部門に設定できないケースがあるため、setValueExを使わない
			Hdr_ar_dpt_cd.setValue(getHdrR().sls_dpt_cd());
		}
		setDefaultCostUpri();
	}

	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		super.doHdr_cst_cd_LC(info);

		if (isNull(getHdrR().cst_cd())) {
			// クリア時は全明細の参照売上実績ＮＯ、参照売上実績明細ＮＯをクリア
			String[] clearCols = {
					DtlR.$ref_sls_act_no, DtlR.$ref_sls_act_seq, DtlR.$ref_sls_act_d_no,
					DtlR.$ref_sls_act_d_seq
			};
			getDtlL().clear(clearCols);
		}

		// 画面で表示されている値を変更時一旦クリアする
		setValueEx(Hdr_sls_usr_cd, null);
		setValueEx(Hdr_sls_dpt_cd, null);
		setValueEx(Hdr_ar_dpt_cd, null);

		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}

		// 債権部門の設定
		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && MAC_AR_DPT_TYP.isAR(getHdrR().ar_dpt_typ())){
			setValueEx(Hdr_ar_dpt_cd, getHdrR().lnk_ar_dpt_cd());
		}

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())){
			setValueEx(Hdr_trd_cur_cd, null);
		}

		for (DtlR r : getDtlL()) {
			if (r.isStatusCreate() || r.isStatusModify()
					|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
				int index = r.getGUIIndex();
				setDefaultBillCrryovrTimes(index);
				setDefaultTaxCd(index, true);
			}
		}

		setCstItm(false);
		setModeCstIvFlg();
		setCstIvFlgCtrl();
	}

	/**
	 * 	インボイス取引ＦＬＧによる入力制御
	 * 	<p>
	 * 	I/V No, 対応 I/V No, 自動ＦＬＧは得意先インボイス取引ＦＬＧがオンの場合のみ入力可とする
	 * 	</p>
	 */
	protected void setCstIvFlgCtrl() {

		if (!isNull(getHdrR().cst_cd()) && getHdrR().cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {

			Hdr_ref_iv_no.setMode(MCMode.ENABLE);
			Hdr_num_flg.setMode(MCMode.ENABLE);
			if (getHdrR().num_flg()) {
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_iv_no.setMode(MCMode.REQUIRED);
			}

			if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
				Hdr_rcv_schd_dt.setMode(MCMode.REQUIRED);
			}
			else {
				setDefaultMode(Hdr_rcv_schd_dt);
			}
		}
		else {
			getHdrR().clear(HdrR.$iv_no, HdrR.$ref_iv_no, HdrR.$num_flg, HdrR.$rcv_schd_dt);
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_ref_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_num_flg.setMode(MCMode.READ_ONLY);
			Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setDefaultBillCrryovrTimes(int index) {
		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			setValueEx(columnDtl_bill_crryovr_times, index, nvl(r.itm_bill_crryovr_times(), getHdrR().cst_bill_crryovr_times()));
		}
	}

	protected void setDefaultTaxCd(int index, boolean setTaxFixFlg) {

		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().cst_cd(),
					getHdrR().reg_dt(),
					this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
			if (setTaxFixFlg) {
				r.tax_fix_flg(false);
			}
		}
	}

	protected void setDefaultCostUpri(int index) {

		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {
			DtlR r = getDtlL().get(index);
			MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().reg_dt(), getHdrR().wg_cd(), getCo().gm_std_upri_typ());
			setValueEx(columnDtl_cost_upri, index, cost_upri);
		}
	}

	protected void setDefaultCostUpri() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if(!isTrnstDtlRow(dtlR)) {
				setDefaultCostUpri(dtlR.getGUIIndex());
			}
		}
	}

	@Override
	public void doDtl_ret_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_ret_rsn_cd_LC(info);

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
	}

	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		int index = info.getEventIndex();
		setWtaxAmt(index);
	}

	/**
	 * 源泉税率の初期値を設定する。
	 * @param index インデックス
	 * @param light 品目のイベントから呼ばれる場合はfalse、そうでない場合はtrue
	 */
	protected void setDefaultWatxRate(int index, boolean light) {

		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())
				&& isWatxRateEditable()
				&& light ? Dtl_itm_p_PPanel.isItmFixLight(index) : Dtl_itm_p_PPanel.isItmFix(index)
				&& !isNull(getHdrR().reg_dt())) {

			DtlR r = getDtlL().get(index);
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().reg_dt(),
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
	 * 源泉税額を設定します
	 * @param dtlR
	 */
	protected void setWtaxAmt(int index) {
		DtlR dtlR = getDtlL().get(index);
		MCNumber amt = MAUCP_AmtUtil.getTaxAmt(dtlR.trd_cur_amt(), dtlR.wtax_rate(), getHdrR().trd_cur_amt_dec_place(), getCo().wtax_rnd_typ());
		setValueEx(columnDtl_wtax_amt, dtlR.getGUIIndex(), amt);
	}

	protected void clearDscntInfo(int index) {
		DtlR r = getDtlL().get(index);
		if (isNull(r.trd_cur_amt()) || r.trd_cur_amt().isZero()) {
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
		}
	}

	@Override
	public void doHdr_reg_dt_LC(MCEventInfo info) {
		super.doHdr_reg_dt_LC(info);

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {

			setDefaultWatxRate(dtlR.getGUIIndex(), true);
			if (!dtlR.tax_fix_flg()) {
				setDefaultTaxCd(dtlR.getGUIIndex(), false);
			}
		}
		setCstItm(true);
		setDefaultCostUpri();
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
	public void doHdr_tterm_cd1_LC(MCEventInfo info) {
		super.doHdr_tterm_cd1_LC(info);
	}

	@Override
	public void doHdr_tterm_cd2_LC(MCEventInfo info) {
		super.doHdr_tterm_cd2_LC(info);
	}

	@Override
	public void doHdr_tterm_cd3_LC(MCEventInfo info) {
		super.doHdr_tterm_cd3_LC(info);
	}

	/**
	 * 	明細品目変更イベント共通処理(品目、枝番１、枝番２、枝番３　共通）
	 * <p>
	 * 	単価、金額項目、取引数量をクリアする<br>
	 * 	新規行の場合、登録枠の納品先情報を明細行にコピーする<br>
	 * 	明細に紐づく詳細行が1行も存在しない場合、詳細に1行追加する<br>
	 * 	明細行の情報を紐づく詳細行へ展開する
	 *　</p>
	 */
	protected void doDtl_itm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);

		if (Dtl_itm_p_PPanel.isItmFix(index)) {

			// 詳細行に1行もなければ1行追加
			addChildDtlRow(row);

			// 登録枠の納品先・仕向先関連項目をコピー
			copyHdr2DtlInfo(index);

			// 明細行IDが未設定の場合は発番
			if (isNull(row.dtl_row_id())) {
				row.dtl_row_id(_dtl_row_id++);
			}

			setDefaultBillCrryovrTimes(index);
			setDefaultTaxCd(index, true);
			setDefaultCostUpri(index);

			if (isSame(getStatus(), INS)) {
				setValueEx(columnDtl_vmi_flg, index, true);
			}

			if (MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
				setValueEx(columnDtl_gd_cd, index, getDefaultFeedStkGd().gd_cd());
				if (getHdrR().vmi_flg()) {
					setValueEx(columnDtl_cnsgn_gd_cd, index, getDefaultFeedStkGd().gd_cd());
				}
			}
			setColByDscntItm(row);
			setDefStrLnCd(row);
		}
		else {
			// ロットＮＯ、サブロットＮＯをクリア
			setValueEx(columnDtl_lot_no, index, null);
			setValueEx(columnDtl_sublot_no, index, null);

			// 参照売上実績情報をクリア
			setValueEx(columnDtl_ref_sls_act_no, index, null);
			setValueEx(columnDtl_ref_sls_act_seq, index, null);
			setValueEx(columnDtl_ref_sls_act_d_no, index, null);
			setValueEx(columnDtl_ref_sls_act_d_seq, index, null);
		}

		setDefaultWatxRate(index, false);
		setIvItmNm(row);
		setCstItm(row);

		// 子の詳細リストもメンテナンス
		// この時点で画面の詳細一覧(getIoL())には明細に紐づく詳細リストのみが格納されている前提である
		for (IoR r : getIoL()) {
			copyDtl2IoItmInfo(r, row);
		}

		setDtlBtnMode();
		setIoBtnMode();
		DtlTable.focusCellAt(index,info.getOldColumn());
	}

	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR　受注明細
	 */
	protected void setIvItmNm(DtlR dtlR) {
		if (!getHdrR().cst_iv_flg()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(dtlR.prnt_lcl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			} else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm(boolean dtFlg) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.abort_flg() && !dtlR.old_abort_flg()) {
				if(!dtFlg || (dtFlg && !isTrnstDtlRow(dtlR))) {
					setCstItm(dtlR);
				}
			}
		}
	}
	
	/**
	 * 	明細行が（売上返品予定/売上実績/入荷実績)引継行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isTrnstDtlRow(DtlR r) {
		return !isNull(r.ref_dlv_slip_no()) || !isNull(r.ref_sls_act_no());
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().reg_dt(), this);
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
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlR dtlR) {
		if (isNull(dtlR.loc_cd()) || !dtlR.str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				dtlR.loc_cd(), 
				this);
		if (isNullOrNullVal(StrLnCd)) {
			setValueEx(columnDtl_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}

	/**
	 * 納品先のＬＣイベント。
	 * @param info MCEventInfo
	 */
	protected void doDtl_dlv_cd_LC(MCEventInfo info) {

		DtlR r = getDtlL().get(info.getEventIndex());
		setIvItmNm(r);
	}

	protected void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isSame(r.trd_cur_upri(), 0) && r.sls_acxfr_flg()){
			setValueEx(columnDtl_ret_rsn_cd, info.getEventIndex(), null);
		}
	}

	@Override
	public void doHdr_num_flg_NC(MCEventInfo info) {
		super.doHdr_num_flg_NC(info);

		if (Hdr_num_flg.getValue()) {
			Hdr_iv_no.clear();
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {
			if (isUpdStatus()) {
				if (getHdrR().cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ())) {
					Hdr_iv_no.setMode(MCMode.REQUIRED);
				}
				else {
					Hdr_iv_no.setMode(MCMode.ENABLE);
				}
			}
			else{
				Hdr_iv_no.setMode(MCMode.ENABLE);
			}
		}
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

	/**
	 * [Hdr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * </p>
	 */
	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);

		// 納品書ＮＯ引継、売上実績ＮＯ引継の場合はイベントを実行しない。
		if (isShipRtnStatus() ||
				(isSame(getStatus(), INS_SLS_RET) && !isNull(getDtlL()) && !isNull(getDtlL().get(0)) && !isNull(getDtlL().get(0).ref_sls_act_no()))) {
			return;
		}

		// クリア前に現在値を退避
		String trd_cd = getHdrR().trd_cd();
		String trd_nm = getHdrR().trd_nm();
		String trd_ptn_typ = getHdrR().trd_ptn_typ();

		// 登録項目をすべてクリアする
		clearContainers(getHdrR(), getDtlL(), getIoL());
		_ioLAll.clear();

		// 取引パタンに応じて画面項目をモード設定
		setINSMode(trd_ptn_typ);
		setBtnSprtMode();
		setDtlBtnMode();
		setIoBtnMode();

		// 退避値を設定し直す（Eventを起こするループになる）
		getHdrR().trd_cd(trd_cd);
		getHdrR().trd_nm(trd_nm);
		getHdrR().trd_ptn_typ(trd_ptn_typ);
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		getHdrR().xrate_inpt_flg(false);
		getHdrR().ptax_xrate_inpt_flg(false);
		setModeXrateInptFlg();

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {

			setDefaultWatxRate(dtlR.getGUIIndex(), true);
		}
	}


	@Override
	public void doDtl_arr_cnt_rmrks_LC(MCEventInfo info) {
		super.doDtl_arr_cnt_rmrks_LC(info);
		// 子の詳細情報に内容をコピー
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		MCList<IoR> chdL = exceptDeleteAndEmpty(getChildIoL(row));
		chdL.setString(IoR.$arr_cnt_rmrks, row.arr_cnt_rmrks());
	}

	@Override
	public void doIo_abort_flg_NC(MCEventInfo info) {
		super.doIo_abort_flg_NC(info);
		int index = info.getEventIndex();
		IoR row = getIoL().get(index);
		if (getHdrR().sync_flg() && !MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
			setValueEx(columnIo_sls_ret_schd_abort_flg, index, row.abort_flg());
		}
	}

	@Override
	public void doIo_sls_ret_schd_abort_flg_NC(MCEventInfo info) {
		super.doIo_sls_ret_schd_abort_flg_NC(info);
		int index = info.getEventIndex();
		IoR row = getIoL().get(index);
		if (row.sls_ret_schd_abort_flg()) {
			// オンにした際、基準単位数量＞入荷数量だった場合、入荷予定の打切もオンになる。
			if (row.base_unit_qty().gt(row.arr_qty())) {
				setValueEx(columnIo_abort_flg, index, true);
			}
		}
	}

	@Override
	public void doIo_cnsgn_loc_cd_LC(MCEventInfo info) {
		super.doIo_cnsgn_loc_cd_LC(info);
		int index = info.getEventIndex();
		IoR row = getIoL().get(index);
		if (isNull(row.loc_cd())) {
			setValueEx(columnIo_loc_cd, row.getGUIIndex(), row.cnsgn_loc_cd());
		}
	}

	public void doIo_cnsgn_str_ln_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		IoR row = getIoL().get(index);
		if (isSame(row.loc_cd(), row.cnsgn_loc_cd()) && isNull(row.str_ln_cd())) {
			setValueEx(columnIo_str_ln_cd, row.getGUIIndex(), row.cnsgn_str_ln_cd());
		}
	}

	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		super.doDtl_abort_flg_NC(info);
		int index = info.getEventIndex();

		setHdrAmt();
		setHdrIncTaxAmt();

		setValueEx(columnDtl_chg_abort_flg, index, true);


		DtlR parDtl = getDtlL().get(index);
		MCList<IoR> chdL = getChildIoL(parDtl);
		// オンにした明細に紐づく詳細の全レコードの「打切」「売上返品打切」をオンにし入力変更不可にする。
		// オフにした明細に紐づく詳細の全レコードの「打切」「売上返品打切」をオフにする。
		chdL.setBooleanNE(IoR.$abort_flg, parDtl.abort_flg());
		chdL.setBooleanNE(IoR.$sls_ret_schd_abort_flg, parDtl.abort_flg());
		
		setDtlBtnMode();
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

	@Override
	public void doIo_NC(MCEventInfo info) {
		super.doIo_NC(info);
		setIoBtnMode();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}

		setDtlBtnMode();
		setIoBtnMode();
		showChildIoL();
	}

	protected void doDtl_trd_unit_qty_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_trd_unit_qty);

	}

	@Override
	public void doDtl_trd_unit_cd_LC(MCEventInfo info) {
		super.doDtl_trd_unit_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_trd_unit_cd);
		columnDtl_trd_cur_dscnt_amt.setValue(row.getGUIIndex(), null);
	}

	@Override
	public void doDtl_gd_cd_LC(MCEventInfo info) {
		super.doDtl_gd_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_gd_cd);
	}

	@Override
	public void doDtl_cnsgn_gd_cd_LC(MCEventInfo info) {
		super.doDtl_cnsgn_gd_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_cnsgn_gd_cd);
	}

	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_loc_cd);
		if (row.vmi_flg() && isNull(row.cnsgn_loc_cd())) {
			setValueEx(columnDtl_cnsgn_loc_cd, row.getGUIIndex(), row.loc_cd());
		}
	}

	@Override
	public void doDtl_cnsgn_loc_cd_LC(MCEventInfo info) {
		super.doDtl_cnsgn_loc_cd_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_cnsgn_loc_cd);
		if (isNull(row.loc_cd())) {
			setValueEx(columnDtl_loc_cd, row.getGUIIndex(), row.cnsgn_loc_cd());
		}
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

	protected void doDtl_str_ln_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_str_ln_cd);
		if (row.vmi_flg() && isSame(row.loc_cd(), row.cnsgn_loc_cd()) && isNull(row.cnsgn_str_ln_cd())) {
			setValueEx(columnDtl_cnsgn_str_ln_cd, row.getGUIIndex(), row.str_ln_cd());
		}
	}

	protected void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$str_ln_cd_none_flg);
	}

	protected void doDtl_cnsgn_str_ln_cd_none_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagate(row, DtlR.$cnsgn_str_ln_cd_none_flg);
	}

	protected void doDtl_cnsgn_str_ln_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		propagateWithEvent(row, info.getNewValue(), columnIo_cnsgn_str_ln_cd);
		if (isSame(row.loc_cd(), row.cnsgn_loc_cd()) && isNull(row.str_ln_cd())) {
			setValueEx(columnDtl_str_ln_cd, row.getGUIIndex(), row.cnsgn_str_ln_cd());
		}
	}

	protected void doDtl_base_unit_qty_LC(MCEventInfo info){
		int index = info.getEventIndex();
		setCostAmt(index);
	}

	protected void doDtl_base_cur_amt_LC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setProfRate(r);
		setHdrAmt();
	}

	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setWtaxAmt(index);
		clearDscntInfo(index);
	}

	protected void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}
	protected void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}

	protected void doDtl_cost_upri_LC(MCEventInfo info){
		int index = info.getEventIndex();
		setCostAmt(index);
		setHdrAmt();
	}

	protected void setCostAmt(int index) {
		DtlR r = getDtlL().get(index);

		MCNumber cost_amt = null;
		if (!isNullOr(r.cost_upri(), r.base_unit_qty())) {
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getHdrR().base_cur_amt_dec_place());
		}
		setValueEx(columnDtl_cost_amt, r.getGUIIndex(), cost_amt);

		setProfRate(r);
	}

	protected void setProfRate(DtlR r) {
		r.prof_rate(MSUCP_SlsUtil.getProfRate(r.base_cur_amt(), r.cost_amt()));
	}

	protected void setDscntAmt(DtlR r) {

		if (isNull(r.init_schd_dscnt_amt())) {
			return;
		}
		if (isNull(r.base_unit_qty())) {
			return;
		}

		MCNumber dscntQty = r.base_unit_qty().divide(r.init_schd_qty(), MA_META.QTY.scale(), MAC_RND_TYP.RNDOFF.toMC());
		MCNumber tmpDscntAmt = MAUCP_AmtUtil.getAmt(r.init_schd_dscnt_amt(), dscntQty,
				getHdrR().trd_cur_amt_dec_place(), getHdrR().sls_amt_rnd_typ());

		setValueEx(columnDtl_trd_cur_dscnt_amt, r.getGUIIndex(), tmpDscntAmt);
	}

	/**
	 * 取引通貨単価を設定する。
	 * @param r 売上返品予定明細
	 */
	protected void setUpri(DtlR r) {

		if (isNull(r.init_schd_amt()) || isNull(r.init_schd_qty()) || isNull(r.base_unit_qty())) {
			return;
		}
		if (r.init_schd_qty().isZero() || r.trd_unit_qty().isZero()) {
			setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
			return;
		}
		// 値引額が未指定の場合はゼロとみなして計算
		MCNumber schdDscntAmt = MCNumber.ZERO;
		if (!isNull(r.init_schd_dscnt_amt())) {
			schdDscntAmt = r.init_schd_dscnt_amt();
		}

		// 単価を割り戻して設定する
		MCNumber tmpUpri = 
			(r.init_schd_amt().add(schdDscntAmt))
			.divide(r.init_schd_qty(), getHdrR().trd_cur_upri_dec_place().intValue(), toRoundingMode(getHdrR().sls_upri_rnd_typ()))
			.multiply(r.base_unit_qty())
			.divide(r.trd_unit_qty(), getHdrR().trd_cur_upri_dec_place().intValue(), toRoundingMode(getHdrR().sls_upri_rnd_typ()));
		setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), tmpUpri);
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
			if (r.isStatusDelete() || r.abort_flg() || r.isEmpty()) {
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
			if (r.isStatusDelete() || r.abort_flg() || r.isEmpty()) {
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

				if (destColumn == columnIo_str_ln_cd) {
					setValueEx(columnIo_loc_cd, chdR.getGUIIndex(), parDtlR.loc_cd());
					setValueEx(columnIo_str_ln_cd, chdR.getGUIIndex(), val);
				}
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

				if (destColumn == columnIo_str_ln_cd) {
					// 明細棚・ライン変更時、場所ＣＤが異なる場合はキャンセルする（詳細の場所ＣＤがブランクの場合、エラーとなるため）
					if (!isSame(parDtlR.loc_cd(), chdR.loc_cd())) {
						return;
					}
				}

				// 変更項目のみを詳細行へコピーする
				setValueEx(destColumn, chdR.getGUIIndex(), val);
			}
		}
	}

	/**
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

				if (isSame(column, DtlR.$str_ln_cd_none_flg) && !isSame(parDtlR.loc_cd(), chdR.loc_cd())) {
					return;
				}

				chdR.setValueNE(column, val);

				if (isSame(column, DtlR.$str_ln_cd_none_flg)) {
					chdR.str_ln_cd(null);
					chdR.str_ln_nm(null);
				}

				if (isSame(column, DtlR.$cnsgn_str_ln_cd_none_flg)) {
					chdR.cnsgn_str_ln_cd(null);
					chdR.cnsgn_str_ln_nm(null);
				}
			}
		}
	}

	@Override
	public MCList<?> getDtl_ret_rsn_cd(MCRow row, MCEventInfo info) {

		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);

		if (isNull(dtlR.trd_cur_upri()) || !isNull(dtlR.trd_cur_upri()) && dtlR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsRtnBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getDtl_ret_rsn_cd(row, info);
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
	 * </p>
	 */
	protected void setCnt() {

		_dtl_row_id = 0;
		MCNumber max_dtl_row_id = (MCNumber) getDtlL().max(DtlR.$dtl_row_id);
		if (isNull(max_dtl_row_id)){
			max_dtl_row_id = MCNumber.ZERO;
		}
		_dtl_row_id = max_dtl_row_id.intValue();
		_dtl_row_id++;
	}

	protected int nextCnt() {
		return _dtl_row_id++;
	}

	/**
	 * 明細行紐付けID
	 * <p>
	 * 	明細と紐づく入荷予定を関連付けする揮発性のID<br>
	 * 	サーバ通信処理までは連携するがDB登録はしない
	 * </p>
	 */
	protected int _dtl_row_id = 0;

	/**
	 * 	詳細情報裏リスト
	 * 	<p>
	 * 	明細選択行に紐付く詳細リストのみが表示されるため	非表示分を含めた全データを格納する裏リスト
	 * 	</p>
	 */
	protected MCList<IoR> _ioLAll;


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
		return DtlR.$cnsgn_gd_cd;
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
		return DtlR.$cnsgn_loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$cnsgn_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$cnsgn_str_ln_cd_none_flg;
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

		if (isSame(getStkTable(panel).getName(), DtlTable.getName())) {

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

		if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {

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
				return isEditable(columnDtl_cnsgn_gd_cd, DtlTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_LOC_CD) || isSame(name, IfStkInspBase.CND_LOC_NM)) {
				return isEditable(columnDtl_cnsgn_loc_cd, DtlTable.getMCSelectedRow());
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
				return isEditable(columnIo_cnsgn_gd_cd, IoTable.getMCSelectedRow());
			}
			else if (isSame(name, IfStkInspBase.CND_LOC_CD) || isSame(name, IfStkInspBase.CND_LOC_NM)) {
				return isEditable(columnIo_cnsgn_loc_cd, IoTable.getMCSelectedRow());
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

			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dtlR.itm_cd());						   // 品目ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dtlR.itm_sub1());					   // 枝番１
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dtlR.itm_sub2());					   // 枝番２
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dtlR.itm_sub3());					   // 枝番３
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dtlR.itm_nm());						   // 品名
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value()); // 在庫情報場所区分

			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {

				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_SRCH_TYP, MSC_STK_INFO_SRCH_TYP.VMI.value());   //在庫情報検索区分
				bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, nvl(dtlR.dlv_cd(), getHdrR().dlv_cd())); // 在庫着荷先ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM,  nvl(dtlR.dlv_nm(), getHdrR().dlv_nm()));// 在庫着荷先名
			}
		}

		if (isSame(table.getName(), DtlTable.getName())) {

			DtlR selR  = (DtlR)table.getSelectedMCRow();
			if (!isNull(selR)) {

				bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.cnsgn_gd_cd());					   // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.cnsgn_gd_nm());					   // 格付名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.cnsgn_loc_cd());					 // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.cnsgn_loc_nm());					 // 場所名
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
				bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.cnsgn_gd_cd());							 // 格付ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.cnsgn_gd_nm());							 // 格付名
				bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.cnsgn_loc_cd());						   // 場所ＣＤ
				bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.cnsgn_loc_nm());						   // 場所名
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

	@Override
	public void afterInsStkData(MCRootPanel panel, int index) {
		setSnsgnGdCd(panel, index);
	}

	@Override
	public void afterUpdStkData(MCRootPanel panel, int index) {
		setSnsgnGdCd(panel, index);
	}

	protected void setSnsgnGdCd(MCRootPanel panel, int index){
		if (isSame(getStkTable(panel).getName(), DtlTable.getName())) {
			DtlR dtlR = getDtlL().get(index);
			setValueEx(columnDtl_gd_cd, index, dtlR.cnsgn_gd_cd());
			setValueEx(columnDtl_loc_cd, index, dtlR.cnsgn_loc_cd());
			setValueEx(columnDtl_str_ln_cd, index, dtlR.cnsgn_str_ln_cd());
		}
		if (isSame(getStkTable(panel).getName(), IoTable.getName())) {
			IoR ioR = getIoL().get(index);
			setValueEx(columnIo_gd_cd, index, ioR.cnsgn_gd_cd());
			setValueEx(columnIo_loc_cd, index, ioR.cnsgn_loc_cd());
			setValueEx(columnIo_str_ln_cd, index, ioR.cnsgn_str_ln_cd());
		}
	}

	// ---------------------------------------- 在庫選択機能 END ----------------------------------------

}