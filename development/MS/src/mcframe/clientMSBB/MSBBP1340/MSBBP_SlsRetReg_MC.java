package mcframe.clientMSBB.MSBBP1340;

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
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMAUB.MAUBP5400.*;
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
import mcframe.clientCore.beans.list.MCLinkBeans;

import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import mcframe.commonMA.meta.MA_META;
import java.util.Arrays;
import mcframe.clientCore.beans.list.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsRetReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsRetReg_MC extends MSBBP_SlsRetReg_MC_A implements IfOpePanel, IfRowMoveBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 明細行紐付けID
	 * <p>
	 * 	明細行と紐づく詳細行を関連付けする揮発性のID<br>
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
	protected MCList<IoR> _ioLAll = MCList.create(IoR.class);

	// 明細反映ボタン実行中フラグ
	protected boolean _updDtlBtnExecFlg = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsRetReg_MC() {
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
	public MSBBP_SlsRetReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1340_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1340_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1340_Del01();
	}

	/**
	 * [MS_MSBBL1340_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Prnt01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1340_Prnt01Caller(P p, B b) {
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
	 * [MS_MSBBL1340_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Sprt01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/**
		 *  更新ボタンのイベントフラグ
		 */
		protected boolean _upd_btn_event_flg = false;

		/**
		 * エラーフラグ
		 */
		protected boolean _error_flg = false;


		protected MS_MSBBL1340_Sprt01Caller(P p, B b) {
			super(p, b);
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
			msgList.addAll(panel.checkReq(Hdr_sls_ret_dt));
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
				dest.dt(getHdrR().sls_ret_dt());
				dest.cst_cd(getHdrR().cst_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
				dest.wg_cd(getHdrR().wg_cd());
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBBL1340_Prnt01();
	}

	/**
	 * [MS_MSBBL1340_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Del01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1340_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0();
			bridge.up1().setAll(exceptEmpty(_ioLAll));
			getHdrR();
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
	 * [MS_MSBBL1340_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Srch01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1340_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			setCnt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			copyAmtDataSchd();
			setOrgAmt();
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
			setINS_SLS_RETStatus();
			setHdrPanelInitValue();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);

			for (DtlR dtlR : bridge.down1()) {
				if (isNull(bridge.down0().sls_ret_schd_no()) && !isNull(dtlR.ref_sls_act_no())) {
					// 売上実績を引き継いだ際に、為替レートを取り直さないため、参照ＮＯを設定する。
					bridge.down0().ref_no(dtlR.ref_sls_act_no());
					break;
				}
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
		hdrR.pri_prnt_flg(getCopyFlg(dtlL, DtlR.$pri_prnt_flg));
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
	 * [MS_MSBBL1340_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Srch02Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1340_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			// 仕入直送発注ＮＯの有無によって売上実績か仕入直送実績か判別する。
			boolean insPurc = false;
			for (DtlR dtlR : bridge.down1()) {
				if (!isNull(dtlR.purc_ddlv_po_no())) {
					insPurc = true;
					break;
				}
			}
			if (insPurc) {
				setINS_PURCStatus();
			}
			else {
				setINS_SLS_ACTStatus();
			}
			setHdrPanelInitValue();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);

			for (DtlR dtlR : bridge.down1()) {
				if (isNull(bridge.down0().sls_ret_schd_no()) && !isNull(dtlR.ref_sls_act_no())) {
					// 売上実績を引き継いだ際に、為替レートを取り直さないため、参照ＮＯを設定する。
					bridge.down0().ref_no(dtlR.ref_sls_act_no());
					break;
				}
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void show() {
			super.show();
			setCnt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			copyAmtDataSchd();
			setOrgAmt();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}

	}

	/**
	 * [MS_MSBBL1340_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Srch03Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Srch03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1340_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());

			for (DtlR dtlR : bridge.down1()) {
				if (isNull(bridge.down0().sls_ret_schd_no()) && !isNull(dtlR.ref_sls_act_no())) {
					// 売上実績を引き継いだ際に、為替レートを取り直さないため、参照ＮＯを設定する。
					bridge.down0().ref_no(dtlR.ref_sls_act_no());
					break;
				}
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void show() {
			super.show();
			setCnt();
			// 裏リストに格納
			_ioLAll.setAll(getIoL());
			getHdrR().xrate_cd(getCo().sls_xrate_cd());
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
			copyAmtData();
			setOrgAmt();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLAll.clear();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void setMode() {
			super.setMode();
			deleteEmptyRows();
			DtlTable.selectLeftmostColumn(0);
		}
	}
	protected void deleteEmptyRows() {
		if ((isUpdNotPurcStatus() && !isNull(getHdrR().sls_ret_schd_no())
				|| isSame(getStatus(), UPD_PURC))) {
			for (int i = DtlTable.getRowCount() - 1; i >= 0; i--) {
				DtlR dtlR = DtlTable.getRow(i);
				if (isNull(dtlR.itm_cd())) {
					DtlTable.deleteRow(i);
				}
			}
		}
	}

	/**
	 * ヘッダ枠の項目に検索後の初期値をセット
	 */
	protected void setHdrPanelInitValue() {
		getHdrR().sls_ret_dt(getToday());
		getHdrR().ac_dt(getToday());
		setBillBasisDt();
	}

	/**
	 * [MS_MSBBL1340_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Ins01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;

		protected MS_MSBBL1340_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
			_trd_cur_upri_chng_flg = false;
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
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
			bridge.up2().setAll(raddEmpty(exceptEmpty(_ioLAll)));
		}

		@Override
		protected boolean confirmForCall() {
			if (callMS_MSBBL1340_Sprt01_Before_Upd()) {
				return false;
			}
			boolean confirmRslt = super.confirmForCall();
			if (_trd_cur_upri_chng_flg && !confirmRslt) {
				restoreTrdCurUpri();
			}
			return confirmRslt;
		}
	}

	/**
	 * [MS_MSBBL1340_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1340_Upd01Caller<P extends MSBBP_SlsRetReg, B extends MS_MSBBL1340_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/**
		 * 販売単価変更フラグ
		 */
		protected boolean _trd_cur_upri_chng_flg = false;

		protected MS_MSBBL1340_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
			_trd_cur_upri_chng_flg = false;
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
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

			if (callMS_MSBBL1340_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();

			if (_trd_cur_upri_chng_flg && !confirmRslt) {

				restoreTrdCurUpri();
			}

			return confirmRslt;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			// 上り電文には裏リストを設定
			bridge.up2().setAll(raddEmpty(exceptEmpty(_ioLAll)));
		}
	}

	/**
	 * 単価が変更された場合、確認メッセージを表示する。
	 * @param msgList メッセージリスト
	 */
	protected void confirmForTrdCurUpriChng(MCMessageList msgList) {

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
	protected boolean callMS_MSBBL1340_Sprt01_Before_Upd() {
		MSBBP_SlsRetReg.MS_MSBBL1340_Sprt01Caller caller = createMS_MSBBL1340_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();

		return caller.getErrorFlg();
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL1340_Srch03();
	}

	/**
	 * Panel[Cnd]のボタン[srch_ins]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ins(MCEventInfo info) {
		// 検索対象区分に応じて呼出オペレーションを切り替える
		String selectedVal = Cnd_srch_tgt_typ.getValue();
		if (MSC_SLS_SRCH_TGT_TYP.isARR_ACT_NO(selectedVal)
				|| MSC_SLS_SRCH_TGT_TYP.isSRET_SCHD_NO(selectedVal)) {
			callMS_MSBBL1340_Srch01();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isSLS_ACT_NO(selectedVal)) {
			callMS_MSBBL1340_Srch02();
		}
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

	}

	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		if (!isDtlRowSelected()) {
			return;
		}
		DtlR r = copyRow(DtlTable);

		setHdrAmt();
		setHdrIncTaxAmt();

		MCList<IoR> chdIoL = getChildIoL(r).clone();

		if (!isNull(r.dtl_row_id())) {
			r.dtl_row_id(nextCnt());
		}
		r.sls_ret_act_d_no(null);
		r.sls_ret_act_d_seq(null);
		r.sls_ret_schd_d_no(null);
		r.disp_seq(null);
		r.arr_pr_no(null);
		r.io_schd_pr_no(null);
		r.schd_qty(null);
		r.arr_qty(null);
		r.sls_ret_qty(null);
		r.abort_qty(null);
		r.ref_sls_act_no(null);
		r.ref_sls_act_seq(null);
		r.ref_sls_act_d_no(null);
		r.ref_sls_act_d_seq(null);
		r.arr_act_no(null);
		r.sls_dtl_upd_flg(false);
		r.db_trd_unit_cd(null);
		r.db_trd_unit_conv_qty(null);
		r.db_trd_unit_conv_base_qty(null);
		r.db_trd_unit_dec_place(null);
		r.db_trd_unit_rnd_typ(null);
		r.db_trd_unit_qty(null);
		r.db_trd_cur_amt(null);
		r.db_trd_cur_dscnt_amt(null);
		r.db_trd_cur_tax_amt(null);
		r.db_trd_cur_upri(null);
		r.db_wtax_rate(null);
		r.db_tax_rate(null);
		r.db_inc_tax_flg(false);
		r.init_trd_unit_cd(null);
		r.init_trd_unit_qty(null);
		r.init_trd_cur_dscnt_amt(null);
		r.init_trd_cur_tax_amt(null);
		r.init_trd_cur_upri(null);
		r.init_tax_rate(null);
		r.init_inc_tax_flg(false);

		chdIoL.setStatus(MCRow.CREATE);
		chdIoL.setNumber(IoR.$dtl_row_id, r.dtl_row_id());
		chdIoL.setString(IoR.$arr_pr_no, null);
		chdIoL.setString(IoR.$arr_schd_no, null);
		chdIoL.setString(IoR.$arr_act_no, null);
		chdIoL.setString(IoR.$ref_sls_act_d_no, null);
		chdIoL.setString(IoR.$ref_sls_act_io_no, null);
		chdIoL.setNumber(IoR.$ref_sls_act_io_seq, null);
		chdIoL.setString(IoR.$purc_act_io_no, null);
		chdIoL.setString(IoR.$sls_act_io_no, null);
		chdIoL.setNumber(IoR.$sls_act_io_seq, null);
		chdIoL.setString(IoR.$sls_act_d_no, null);

		chdIoL.setNumber(IoR.$schd_qty, null);
		chdIoL.setNumber(IoR.$arr_qty, null);

		// 裏リストへ追加
		_ioLAll.addAll(chdIoL);

		showChildIoL();
	}

	/**
	 * Panel[DtlBtn]のボタン[sprt_srch_upri]の押下時の処理
	 */
	@Override
	public void doDtlBtn_sprt_srch_upri(MCEventInfo info) {
		callMS_MSBBL1340_Sprt01();
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
			dtlR.dtl_row_id(nextCnt());
		}
		// 明細一覧の選択行の品目情報を追加行へコピー
		copyDtl2IoItmInfo(ioR, dtlR);
		ioR.setStatus(MCRow.CREATE);

		ioR.sync_flg(true);

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
		r.arr_act_no(null);
		r.ref_sls_act_d_no(null);
		r.ref_sls_act_io_no(null);
		r.ref_sls_act_io_seq(null);
		r.purc_act_io_no(null);
		r.sls_act_io_no(null);
		r.sls_act_io_seq(null);
		r.sls_act_d_no(null);

		r.schd_qty(null);
		r.arr_qty(null);

		r.sync_flg(true);

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

	// ------------------------------------- Initialize -------------------------------------

	@Override
	protected void setupParts() {
		super.setupParts();

		// 登録枠
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_sls_ret_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt, Hdr_srch_tgt_no);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd,
				Hdr_sls_ret_dt, true, Hdr_xrate_inpt_flg, true, Hdr_ref_no);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd,
				Hdr_xrate_cd, Hdr_sls_ret_dt, true, Hdr_ptax_xrate_inpt_flg, true, Hdr_ref_no);

		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_no_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);


		// 明細

		Dtl_ret_sppl_addr_p_PPanel.setRelateBeans(columnDtl_ret_nm);
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

		Dtl_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		Dtl_arr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		Dtl_sret_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		Dtl_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);

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
				columnDtl_dscnt_itm_flg,
				columnDtl_schd_no,
				columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty,
				columnDtl_schd_trd_unit_conv_base_qty,
				columnDtl_schd_trd_unit_conv_qty,
				columnDtl_base_unit_dec_place,
				columnDtl_base_unit_rnd_typ);
		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);
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
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_loc_cd, columnDtl_str_ln_tgt_flg);
		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);

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
		Io_schd_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ,
				columnIo_schd_qty, columnIo_trd_unit_conv_base_qty,
				columnIo_trd_unit_conv_qty);
		Io_arr_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ,
				columnIo_arr_qty, columnIo_trd_unit_conv_base_qty,
				columnIo_trd_unit_conv_qty);
		Io_str_ln_p_PPanel.setRelateBeans(columnIo_loc_cd, columnIo_str_ln_tgt_flg);
		Io_lot_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_lot_mng_typ,
				columnIo_sublot_mng_typ);
		Io_sno_wrk_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_sno1_mng_typ,
				columnIo_sno2_mng_typ, columnIo_sno3_mng_typ, columnIo_sno4_mng_typ);
		Io_ver_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, null, columnIo_ver_flg);

	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		// 得意先
		linkBeansToISPanelCustom(Hdr_cst_cd, true);

		// 納品先
		linkBeansToISPanelCustom(columnDtl_dlv_cd, true);

		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_sls_ret_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getDtl_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
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

		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, true);
	}

	/**
	 * 詳細枠のロットＮＯの引数設定
	 * 
	 * @param bind
	 * @param idx
	 */
	protected void setIoLotNoBind(MCRow bind, int idx) {

		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, true);
	}

	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}

	@Override
	public MCList<?> getHdr_cst_cd(MCRow row, MCEventInfo info) {

		row.setStringNE(BpCols.$i_dlv_cd, getHdrR().dlv_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.CST_BY_DLV.value());

		return super.getHdr_cst_cd(row, info);
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
					getBindRowForISCustom(row, (MCLinkBeans) compo, info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		insInit();
		insDtInit();
		setDefaultSrcTgtTyp();
		_ioLAll = MCList.create(IoR.class);
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
		columnDtl_base_cur_amt.addLCListener(this);
		columnDtl_base_cur_inc_tax_amt.addLCListener(this);
		columnDtl_base_cur_tax_amt.addLCListener(this);
		columnDtl_cost_upri.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_base_unit_qty.addLCListener(this);
		columnDtl_lot_no.addLCListener(this);
		columnDtl_sublot_no.addLCListener(this);
		columnDtl_ver_no.addLCListener(this);
		columnDtl_str_ln_cd.addLCListener(this);
		columnDtl_str_ln_cd_none_flg.addNCListener(this);
		columnDtl_sno1.addLCListener(this);
		columnDtl_sno2.addLCListener(this);
		columnDtl_sno3.addLCListener(this);
		columnDtl_sno4.addLCListener(this);
		columnDtl_trd_unit_qty.addNCListener(this);
		
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
					HdrR hdr = getHdrR();
					if (hdr.purc_ret_tgt_flg()) {
						dtl.base_purc_ac_dt(getToday());
					}
				}
			}
		}
	@Override
	protected void listInit() {
		super.listInit();

		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_sls_ret_dt);
		
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
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

	protected void setDefaultSrcTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {

			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO.name());

		}
		else {
			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
		}

	}

	// コンボボックスの設定
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

	public MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
					MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO, MSC_SLS_SRCH_TGT_TYP.ARR_ACT_NO,
					MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
			};
		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
			};
		}
	}

	/**
	 * 登録種別時の初期値設定
	 */
	protected void insInit() {

		Hdr_base_cur_cd.setValue(getCo().base_cur_cd());
		Hdr_ptax_cur_cd.setValue(getCo().ptax_cur_cd());
		getHdrR().xrate_cd(getCo().sls_xrate_cd());

		//納品書即時発行
		Hdr_dlv_slip_out_flg.setValue(true);

		if (_ioLAll == null) {
			_ioLAll = MCList.create(IoR.class);
		}

		HdrPanel.focusFirstComponent();
	}

	/**
	 * 日付初期値設定
	 */
	protected void insDtInit() {
	// デフォルト日付の設定
		Hdr_sls_ret_dt.setValue(getToday());
		Hdr_bill_basis_dt.setValue(getToday());
		Hdr_ac_dt.setValue(getToday());
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
		// 詳細枠はFillSpaceしない
		for (MCTable<?> tbl : opePanelFillSpaceTables()) {
			if (tbl != IoTable) {
				tbl.fillSpace();
			}
		}
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {

		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().sls_ret_dt());
		}

		return row;
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
		msgList.addAll(checkReq(Hdr_sls_ret_dt));
	}
	protected class CstItmListPutter extends MCListPutter {

		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}

		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();

			MCRow setRow = createPanelRow(compo, index,
					isNull(row) ? MCRow.create() : row);
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
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().sls_ret_dt());

		return super.getDtl_cst_itm_cd(row, info);
	}
//	// ------------------------------------- Mode -------------------------------------

	//登録：検索前
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		insInit();
		insDtInit();
		setModeDlvSundryFlg();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setCstIvFlgCtrl();
		setDestCdMode();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		setDtlBtnMode();
		setIoBtnMode();
	}

	//登録：検索後(売上返品予定)
	@Override
	public void setINS_SLS_RETStatus() {
		super.setINS_SLS_RETStatus();
		insInit();
		setModeCstIvFlg();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setModeDlvSundryFlg();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDestCdMode();
	}

	//登録：検索後(売上実績)
	@Override
	public void setINS_SLS_ACTStatus() {
		super.setINS_SLS_ACTStatus();
		insInit();
		setCstIvFlgCtrl();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDestCdMode();
	}

	//登録：検索後(仕入直送)
	@Override
	public void setINS_PURCStatus() {
		super.setINS_PURCStatus();
		insInit();
		setCstIvFlgCtrl();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDestCdMode();
	}

	//登録：実行後
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDtlMode();
		setIoMode();
	}

	//更新：実行後
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		ScreenOpePanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDtlMode();
		setIoMode();
	}

	//削除：実行後
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		ScreenOpePanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDtlMode();
		setIoMode();
	}

	//登録以外：検索前
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		if (!Cnd_ope_REF.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
		}
	}

	//更新：検索後
	@Override
	public void setUPDStatus() {
		HdrR hdr = getHdrR();
		if (!hdr.purc_ret_tgt_flg()) {
			super.setUPDStatus();
			setModeCstIvFlg();
			setHdrMode();
			setModeDlvSundryFlg();
			setModeRcvSchdDt();
			setModeBillBasisDt();
			setCstIvFlgCtrl();
			DtlTable.selectLeftmostColumn(0);
			setDtlBtnMode();
			setIoBtnMode();
			showChildIoL();
			setDestCdMode();
			HdrPanel.focusFirstComponent();
			if (!getHdrR().cst_iv_flg()) {
				columnDtl_iv_itm_nm.setVisible(false);
			}
		}
		else{
			setUPD_PURCStatus();
		}
		setDestCdMode();
	}

	//更新：検索後(仕入直送)
	@Override
	public void setUPD_PURCStatus() {
		super.setUPD_PURCStatus();
		setModeCstIvFlg();
		setModeDlvSundryFlg();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		setDestCdMode();
		HdrPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
		setDestCdMode();
	}

	//参照：検索後
	@Override
	public void setREFStatus() {
		HdrR hdr = getHdrR();
		if (!hdr.purc_ret_tgt_flg()) {
			super.setREFStatus();
			DtlTable.selectLeftmostColumn(0);
			setPrntBtnMode();
			showChildIoL();
			CndPanel.focusFirstComponent();
			if (!getHdrR().cst_iv_flg()) {
				columnDtl_iv_itm_nm.setVisible(false);
			}
		}
		else {
			setREF_PURCStatus();
		}
		setDtlMode();
		setIoMode();
	}

	//参照：検索後(仕入直送)
	@Override
	public void setREF_PURCStatus() {
		super.setREF_PURCStatus();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		CndPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
	}

	//取消：検索後
	@Override
	public void setDELStatus() {
		HdrR hdr = getHdrR();
		if (!hdr.purc_ret_tgt_flg()) {
			super.setDELStatus();
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
			CndPanel.focusFirstComponent();
			if (!getHdrR().cst_iv_flg()) {
				columnDtl_iv_itm_nm.setVisible(false);
			}
		}
		else {
			setDEL_PURCStatus();
		}
	}

	//取消：検索後(仕入直送)
	@Override
	public void setDEL_PURCStatus() {
		super.setDEL_PURCStatus();
		DtlTable.selectLeftmostColumn(0);
		showChildIoL();
		CndPanel.focusFirstComponent();
		if (!getHdrR().cst_iv_flg()){
			columnDtl_iv_itm_nm.setVisible(false);
		}
	}

	/**
	 * 納品書発行ボタンの制御を行う。
	 */
	protected void setPrntBtnMode() {

		if (!getHdrR().cst_iv_flg()) {
			setDefaultMode(Btn_prnt);
		} 
		else {
			Btn_prnt.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * ヘッダブロックのモード制御
	 */
	protected void setHdrMode() {
		if (isUpdNotPurcStatus()) {
			// 種別：更新かつ売上返品紐付けありの場合
			if (!isNull(getHdrR().sls_ret_schd_no())) {
				// 納品先
				Hdr_dlv_cd.setMode(MCMode.READ_ONLY);
				Hdr_pri_prnt_flg.setMode(MCMode.READ_ONLY);

				// 得意先
				Hdr_cst_cd.setMode(MCMode.READ_ONLY);

				// 仕向先
				Hdr_dest_cd1.setMode(MCMode.READ_ONLY);
				Hdr_dest_cd2.setMode(MCMode.READ_ONLY);
				Hdr_dest_cd3.setMode(MCMode.READ_ONLY);

				// 取引通貨ＣＤ
				Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
			}
		}
	}

	/**
	 * 	明細ブロックのモード制御
	 */
	protected void setDtlBtnMode() {
		if (isUpdNotPurcStatus()) {
			// 種別：更新かつ売上返品紐付けありの場合
			if (!isNull(getHdrR().sls_ret_schd_no())) {
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
				DtlBtn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_rcopy);
				setDefaultMode(DtlBtn_radd);
			}
		}
	}

	/**
	 * 	詳細ボタンブロックのモード設定
	 */
	protected void setIoBtnMode() {

		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isUpdInsStatus()) {

			// 明細行未選択、明細行削除、非在庫品の場合は不可
			if (isNull(selectRow) || selectRow.isStatusDelete()
					|| MAC_STK_MNG_TYP.isNOT_MNG(selectRow.stk_mng_typ())) {
				IoBtn_radd.setMode(MCMode.DISABLE);
				IoBtn_rcopy.setMode(MCMode.DISABLE);
				IoBtn_rdel.setMode(MCMode.DISABLE);
				return;
			}

			// 予定引継データは行追加不可（行コピーでのみ行を分割できる）
			if (!isNull(selectRow.sls_ret_schd_d_no())) {
				IoBtn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_radd);
			}
			IoR selectIoRow = IoTable.getSelectedMCRow();
			MCList<IoR> IoL = exceptDelete(getIoL());
			
			if (!isNull(selectIoRow) && !selectIoRow.isStatusDelete() && IoL.size() == 1) {
				IoBtn_rdel.setMode(MCMode.DISABLE);
			} else {
				setDefaultMode(IoBtn_rdel);
			}
			setDefaultMode(IoBtn_rcopy);
		}
	}

	public MCList<IoR> exceptDelete(MCList<IoR> list) {
		MCList<IoR> ans = list.createInstance();
		for (IoR row : list) {
			if (!row.isStatusDelete()) {
					ans.add(row);
			}
		}
		return ans;
	}
	/**
	 * 	更新の画面ステータスか判定する
	 * 	更新検索前、更新検索後
	 * @return
	 */
	protected boolean isUpdNotPurcStatus() {

		return isSame(getStatus(), UPD);
	}

	/**
	 * 	更新の画面ステータスか判定する
	 * 	更新検索前、更新検索後、更新検索後(仕入直送)
	 * @return
	 */
	protected boolean isUpdStatus() {

		return isSame(getStatus(), UPD) || isSame(getStatus(), UPD_PURC);
	}

	/**
	 * 	登録・更新の画面ステータスか判定する
	 * 	参照・取消以外
	 * @return
	 */
	protected boolean isUpdInsStatus() {

		return isInsStatus() || isUpdStatus();
	}

	/**
	 * 	登録可能な画面ステータスか判定する
	 * 	登録検索前、登録検索後(売上実績)
	 * @return
	 */
	protected boolean isInsActStatus() {
		return isSame(getStatus(), INS) || isSame(getStatus(), INS_SLS_ACT);
	}

	/**
	 * 	登録可能な画面ステータスか判定する
	 * 	登録検索前、登録検索後(売上実績)、登録検索後(売上返品予定)
	 * @return
	 */
	protected boolean isInsNotPurcStatus() {
		return isInsActStatus() || isSame(getStatus(), INS_SLS_RET);
	}

	/**
	 * 	登録可能な画面ステータスか判定する
	 * 	登録検索前、登録検索後(売上実績)、登録検索後(売上返品予定)、登録検索後(仕入直送)
	 * @return
	 */
	protected boolean isInsStatus() {
		return isInsNotPurcStatus() || isSame(getStatus(), INS_PURC);
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

			if (isDefaultModeEditable(column)) {

				// 版ＮＯ
				if (column == columnDtl_ver_no) {
					if (!r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 売上返品予定引継行は変更不可
				if (!isNull(r.sls_ret_schd_d_no())
						&& Arrays.asList(SRET_SCHD_TRNST_NON_EDTBL_COLS).contains(
								column.getBaseRowColumnName())) {
					return MCMode.READ_ONLY;
				}

				if (column == columnDtl_iv_itm_nm) {
					if (hdr.cst_iv_flg() && !r.sundry_itm_flg()) {
						return MCMode.READ_ONLY;
					}
					if (hdr.cst_iv_flg() && r.sundry_itm_flg()) {
						return MCMode.REQUIRED;
					}
				}

				// 仕向先2
				if (column == columnDtl_dest_cd2) {
					if (isNull(r.dest_cd1())) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕向先3
				if (column == columnDtl_dest_cd3) {
					if (isNull(r.dest_cd2())) {
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
					if (!isNull(r.sls_ret_schd_d_no())) {
						return MCMode.READ_ONLY;
					}
				}

				// 負担部門
				if (column == columnDtl_bd_dpt_cd) {
					if (!r.sls_acxfr_flg()) {
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

				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					if (!(isSame(hdr.trd_cur_cd(), hdr.base_cur_cd()) && isSame(
							hdr.base_cur_cd(), nvl(hdr.ptax_cur_cd(), hdr.base_cur_cd())))) {
						return MCMode.READ_ONLY;
					}
				}

				// 格付ＣＤ
				if (column == columnDtl_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 支払予定日
				if (column == columnDtl_pay_schd_dt) {
					if (!hdr.purc_ret_tgt_flg() || !r.sppl_iv_flg() || !r.pay_spot_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 取引通貨金額
				if (column == columnDtl_trd_cur_amt || column == columnDtl_trd_cur_inc_tax_amt) {
					if (!r.upri_not_tgt_flg() || (!r.itm_sls_upri_cng_flg() && !hdr.sls_upri_cng_flg())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isSame(getStatus(), UPD)) {
				// 仕入返品理由
				if (column == columnDtl_purc_ret_rsn_cd) {
					if (hdr.purc_ret_tgt_flg()) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}

				// 債務部門
				if (column == columnDtl_ap_dpt_cd) {
					if (hdr.purc_ret_tgt_flg()) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}

		/**
		 * 売上返品予定引継行編集不可項目
		 */
		protected final String[] SRET_SCHD_TRNST_NON_EDTBL_COLS = {
				DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3,
				DtlR.$dlv_cd, DtlR.$dlv_nm, DtlR.$dlv_addr1, DtlR.$dlv_addr2,
				DtlR.$dlv_addr3, DtlR.$dlv_addr4, DtlR.$dlv_cntct_dpt,
				DtlR.$dlv_cntct_psn, DtlR.$dlv_tel, DtlR.$dlv_fax, DtlR.$trd_cur_upri,
				DtlR.$trd_cur_amt,
				DtlR.$upri_not_tgt_flg, DtlR.$interim_flg
				, DtlR.$trd_cur_dscnt_amt
				, DtlR.$dest_cd1, DtlR.$dest_cd2, DtlR.$dest_cd3
				, DtlR.$cntry_org_cd
		};
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
			DtlR parDtl = getParDtlR(r);

			if (isDefaultModeEditable(column)) {

				// 同時計上ＦＬＧがオフの場合入力不可
				if (!r.sync_flg()
						&& Arrays.asList(SYNC_OFF_NON_EDTBL_COLS).contains(
								column.getBaseRowColumnName())) {
					return MCMode.READ_ONLY;
				}

				// 打切
				if (column == columnIo_abort_flg) {
					if (isNull(parDtl.sls_ret_schd_d_no())) {
						return MCMode.READ_ONLY;
					}
				}

				// 同時計上
				if (column == columnIo_sync_flg) {
					if (!isNull(parDtl.sls_ret_qty()) && !parDtl.sls_ret_qty().isZero()
							&& !isSame(parDtl.sls_ret_qty(), parDtl.arr_qty())) {
						return MCMode.READ_ONLY;
					}
					if (isNull(getHdrR().sls_ret_schd_no()) || isUpdStatus()) {
						return MCMode.READ_ONLY;
					}
				}
				// 単位、数量
				if (column == columnIo_trd_unit_cd || column == columnIo_trd_unit_qty) {
					if (parDtl.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 格付
				if (column == columnIo_gd_cd) {
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 版ＮＯ
				if (column == columnIo_ver_no) {
					if (!r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}

		/**
		 * 同時計上ＦＬＧオフ(入荷後計上)時編集不可項目
		 */
		protected final String[] SYNC_OFF_NON_EDTBL_COLS = {
				IoR.$trd_unit_cd,
				IoR.$gd_cd,
				IoR.$loc_cd,
				IoR.$str_ln_cd,
				IoR.$str_ln_cd_none_flg,
				IoR.$lot_no,
				IoR.$sublot_no,
				IoR.$ver_no,
				IoR.$sno1,
				IoR.$sno2,
				IoR.$sno3,
				IoR.$sno4
		};
	}

	/**
	 * 納品先諸口ＦＬＧによる登録枠の入力モード制御
	 */
	protected void setModeDlvSundryFlg() {

		MCMode setMode;
		if (Hdr_dlv_sundry_flg.getValue()) {
			setMode = MCMode.ENABLE;
		}
		else {
			setMode = MCMode.READ_ONLY;
		}

		if (isInsActStatus()) {
			Hdr_dlv_addr2.setMode(setMode);
			Hdr_dlv_addr3.setMode(setMode);
			Hdr_dlv_addr4.setMode(setMode);
			Hdr_dlv_cntct_dpt.setMode(setMode);
			Hdr_dlv_cntct_psn.setMode(setMode);
			Hdr_dlv_fax.setMode(setMode);
			Hdr_dlv_tel.setMode(setMode);
		}
		if (isUpdNotPurcStatus()) {
			if (!isNull(getHdrR().sls_ret_schd_no())) {
				setMode = MCMode.READ_ONLY;
			}
			Hdr_dlv_nm.setMode(setMode);
			Hdr_dlv_zip_cd.setMode(setMode);
			Hdr_dlv_addr1.setMode(setMode);
			Hdr_dlv_addr2.setMode(setMode);
			Hdr_dlv_addr3.setMode(setMode);
			Hdr_dlv_addr4.setMode(setMode);
			Hdr_dlv_cntct_dpt.setMode(setMode);
			Hdr_dlv_cntct_psn.setMode(setMode);
			Hdr_dlv_fax.setMode(setMode);
			Hdr_dlv_tel.setMode(setMode);
		}
		if (isSame(getStatus(), INS)) {
			Hdr_dlv_nm.setMode(setMode);
			Hdr_dlv_zip_cd.setMode(setMode);
			Hdr_dlv_addr1.setMode(setMode);
		}
	}

	/**
	 * 	インボイス取引対象による入力モード制御
	 */
	protected void setModeCstIvFlg() {
		MCMode setMode;
		if (getHdrR().cst_iv_flg()) {
			setDefaultMode(columnDtl_iv_itm_nm);
			setDefaultMode(columnDtl_cntry_org_cd);
			setDefaultMode(columnDtl_cntry_org_nm);

			setMode = MCMode.READ_ONLY;
		}
		else {
			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);

			Hdr_num_flg.setMode(MCMode.READ_ONLY);
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_ref_iv_no.setMode(MCMode.READ_ONLY);
			setMode = MCMode.REQUIRED;
		}

		if (isUpdStatus() && isInsNotPurcStatus()) {
			Hdr_num_flg.setMode(setMode);
			if (getHdrR().num_flg()) {
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_iv_no.setMode(setMode);
			}
			Hdr_ref_iv_no.setMode(setMode);
		}
		if (isSame(getStatus(), INS_PURC)) {
			Hdr_dlv_nm.setMode(setMode);
		}
		Hdr_sls_usr_cd.setMode(MCMode.ENABLE);
		Hdr_sls_dpt_cd.setMode(MCMode.REQUIRED);
	}

	/**
	 * 入金予定日のモードを設定する。
	 */
	protected void setModeRcvSchdDt() {

		if (getHdrR().cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			setDefaultMode(Hdr_rcv_schd_dt);
		}
		else {
			Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
		}
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
			getHdrR().bill_basis_dt(getToday());
		}
	}

	protected void setBillBasisDt(MCDate bill_basis_dt) {

		if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			Hdr_bill_basis_dt.clear();
		}
		else {
			if (isNull(bill_basis_dt)) {
				getHdrR().bill_basis_dt(getToday());
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
	 * @param index
	 */
	protected void copyHdr2DtlDlvInfo(int index) {

		// EVENTを発生させるとうるさくなりそうなのと、諸口の場合があるので
		// とりあえずコンテナに直接値を設定する
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
			if (!isNull(Dtl_itm_p_PPanel.isItmFixLight(r.getGUIIndex())) && r.isStatusCreate()) {
				retL.add(r);
			}
		}
		return retL;
	}

	/**
	 *	登録情報を入力予定の指定行へコピーする
	 * @param dest
	 * @param src
	 */
	protected void copyHdr2DtlInfo(DtlR dest, HdrR src) {
		dest.dlv_cd(src.dlv_cd());
		dest.dlv_nm(src.dlv_nm());
		dest.dlv_zip_cd(src.dlv_zip_cd());
		dest.dlv_addr1(src.dlv_addr1());
		dest.dlv_addr2(src.dlv_addr2());
		dest.dlv_addr3(src.dlv_addr3());
		dest.dlv_addr4(src.dlv_addr4());
		dest.dlv_cntct_dpt(src.dlv_cntct_dpt());
		dest.dlv_cntct_psn(src.dlv_cntct_psn());
		dest.dlv_tel(src.dlv_tel());
		dest.dlv_fax(src.dlv_fax());
		dest.pri_prnt_flg(src.pri_prnt_flg());
		dest.cntry_cd(src.cntry_cd());
		dest.cntry_nm(src.cntry_nm());
		dest.dlv_sundry_flg(src.dlv_sundry_flg());
		dest.prnt_lcl_cd(src.prnt_lcl_cd());
		if (isEditable(columnDtl_dest_cd1, dest.getGUIIndex())) {
			dest.dest_cd1(src.dest_cd1());
			dest.dest_nm1(src.dest_nm1());
		}
		if (isEditable(columnDtl_dest_cd2, dest.getGUIIndex())) {
			dest.dest_cd2(src.dest_cd2());
			dest.dest_nm2(src.dest_nm2());
		}
		if (isEditable(columnDtl_dest_cd3, dest.getGUIIndex())) {
			dest.dest_cd3(src.dest_cd3());
			dest.dest_nm3(src.dest_nm3());
		}
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
			if (r.abort_flg() || (!isNull(r.arr_qty()) && !r.arr_qty().isPositive())) {
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
		MCList<IoR> retL = MCList.create(IoR.class);
		if (isNull(parDtlR.dtl_row_id())){
			return retL;
		}
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

//	// ------------------------------------- Event -------------------------------------

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
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		if (lc == columnDtl_ver_no) doDtl_ver_no_LC(info);
		if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		if (lc == columnDtl_base_unit_qty) doDtl_base_unit_qty_LC(info);
		if (lc == columnDtl_base_cur_amt) doDtl_base_cur_amt_LC(info);
		if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		if (lc == columnDtl_cost_amt) doDtl_cost_amt_LC(info);
		if (lc == columnDtl_cost_upri) doDtl_cost_upri_LC(info);
		if (lc == columnDtl_trd_cur_inc_tax_amt) doDtl_trd_cur_inc_tax_amt_LC(info);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		if (nc == Hdr_pri_prnt_flg) doHdr_pri_prnt_flg_NC(info);;
		if (nc == columnDtl_trd_unit_qty) {
			doDtl_trd_unit_qty_NC(info);
		}
	}


	/**
	 * 種別変更イベント
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setDefaultSrcTgtTyp();

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			Cnd_latest_flg.setMode(MCMode.READ_ONLY);
			Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_latest_flg);
			setDefaultMode(Cnd_srch_tgt_rev);
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdrR().sls_ret_act_no());
		}

		if (!isSame(bfSt, REF) && isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			_ioLAll.clear();
		}

	}


	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}

		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();
		String beforMode = getStatus();

		if ((isREFOpe(beforeOpe) && isREFStatus(beforMode)) && (isUPDOpe(afterOpe) || isDELOpe(afterOpe))) {
			if (!Hdr_latest_flg.getValue()) {
				dialog(msgPastRevisionCannotChanged());
				return false;
			}
		}

		return true;
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand()) && isSame(bfSt, REF)) {
			setRefToInsInit();
		}
		deleteEmptyRows();
	}

	protected void setRefToInsInit() {

		Hdr_sls_ret_act_no.clear();
		Hdr_sls_ret_act_rev.clear();
		Hdr_sls_ret_act_seq.clear();
		Hdr_latest_flg.clear();
		Hdr_dlv_slip_no.clear();
		Hdr_sls_ret_schd_no.clear();
		Hdr_ref_no.clear();
		if (!getHdrR().cst_iv_flg()) {
			Hdr_iv_no.clear();
		}
		Hdr_can_ac_dt_for_input.clear();
		Hdr_can_ac_dt.clear();
		Hdr_ac_dt_after_srch.clear();

		setValueEx(columnDtl_sls_ret_act_d_no, null);
		setValueEx(columnDtl_sls_ret_act_d_seq, null);
		setValueEx(columnDtl_arr_act_no, null);
		setValueEx(columnDtl_disp_seq, null);

		setValueEx(columnDtl_sls_ret_schd_no, null);
		setValueEx(columnDtl_sls_ret_schd_d_no, null);
		setValueEx(columnDtl_io_schd_pr_no, null);
		setValueEx(columnDtl_purc_ddlv_po_no, null);
		setValueEx(columnDtl_ref_sls_act_no, null);
		setValueEx(columnDtl_ref_sls_act_seq, null);
		setValueEx(columnDtl_ref_sls_act_d_no, null);
		setValueEx(columnDtl_ref_sls_act_d_seq, null);
		setValueEx(columnDtl_slo_no, null);
		setValueEx(columnDtl_slo_d_no, null);
		setValueEx(columnDtl_arr_pr_no, null);

		setValueEx(columnDtl_arr_qty, null);
		setValueEx(columnDtl_sls_ret_qty, null);
		setValueEx(columnDtl_abort_qty, null);

		setValueEx(columnDtl_purc_ret_act_no, null);
		setValueEx(columnDtl_purc_ret_act_rev, null);
		setValueEx(columnDtl_purc_ret_act_d_no, null);
		setValueEx(columnDtl_sls_dtl_upd_flg, false);
		for (DtlR r : getDtlL()) {
			r.db_trd_unit_cd(null);
			r.db_trd_unit_conv_qty(null);
			r.db_trd_unit_conv_base_qty(null);
			r.db_trd_unit_dec_place(null);
			r.db_trd_unit_rnd_typ(null);
			r.db_trd_unit_qty(null);
			r.db_trd_cur_amt(null);
			r.db_trd_cur_dscnt_amt(null);
			r.db_trd_cur_tax_amt(null);
			r.db_trd_cur_upri(null);
			r.db_wtax_rate(null);
			r.db_tax_rate(null);
			r.db_inc_tax_flg(false);
			r.init_trd_unit_cd(null);
			r.init_trd_unit_qty(null);
			r.init_trd_cur_dscnt_amt(null);
			r.init_trd_cur_tax_amt(null);
			r.init_trd_cur_upri(null);
			r.init_tax_rate(null);
			r.init_inc_tax_flg(false);
		}

		setValueEx(columnIo_sls_act_io_no, null);
		setValueEx(columnIo_arr_act_no, null);

		for (IoR r : _ioLAll) {

			r.sls_act_d_no(null);
			r.sls_act_io_no(null);
			r.sls_act_io_seq(null);
			r.arr_act_no(null);
			r.arr_schd_no(null);

			r.ref_sls_act_d_no(null);
			r.ref_sls_act_io_no(null);
			r.ref_sls_act_io_seq(null);
			r.purc_ret_act_io_no(null);
			r.purc_ret_act_d_no(null);
			r.purc_ret_act_rev(null);
			r.arr_qty(null);
			r.sync_flg(true);
			r.abort_flg(false);
			r.setStatus(MCRow.CREATE);
		}
	}

	public void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		if (MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())){
			// 売上部門を債権部門に設定できないケースがあるため、setValueExを使わない
			Hdr_ar_dpt_cd.setValue(getHdrR().sls_dpt_cd()); 
		}
		setDefaultCostUpri();
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);
		setDefaultCostUpri();
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if(!isNull(r.itm_cd())){
				setDefaultBillCrryovrTimes(r.getGUIIndex());
				if (!r.tax_fix_flg() && isNull(r.ref_sls_act_no())) {
					setDefaultTaxCd(r.getGUIIndex(), false);
				}
			}
		}
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

		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}
		if (!getHdrR().cst_iv_flg()) {
			getHdrR().clear(HdrR.$iv_no, HdrR.$ref_iv_no, HdrR.$num_flg);
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
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setBillBasisDt(getHdrR().bill_basis_dt());
	}

	/**
	 * 	インボイス取引ＦＬＧによる入力制御
	 * 	<p>
	 * 	I/V No, 対応 I/V No, 自動ＦＬＧは得意先インボイス取引ＦＬＧがオンの場合のみ入力可とする
	 * 	</p>
	 */
	protected void setCstIvFlgCtrl() {

		if (!isNull(getHdrR().cst_cd()) && getHdrR().cst_iv_flg()) {
			getHdrR().clear(HdrR.$dlv_slip_out_flg);

			if (getHdrR().num_flg()) {
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_iv_no.setMode(MCMode.REQUIRED);
			}

			Hdr_ref_iv_no.setMode(MCMode.ENABLE);
			Hdr_num_flg.setMode(MCMode.ENABLE);

			Hdr_dlv_slip_out_flg.setMode(MCMode.READ_ONLY);
			setDefaultMode(columnDtl_iv_itm_nm);
			setDefaultMode(columnDtl_cntry_org_cd);
			setDefaultMode(columnDtl_cntry_org_nm);
		}
		else {

			getHdrR().dlv_slip_out_flg(true);

			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_ref_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_num_flg.setMode(MCMode.READ_ONLY);

			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);
		}
	}

	protected void setDefaultBillCrryovrTimes (int index) {
		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			setValueEx(columnDtl_bill_crryovr_times, index, nvl(r.itm_bill_crryovr_times(), getHdrR().cst_bill_crryovr_times()));
		}
	}

	protected void setDefaultTaxCd (int index, boolean setTaxFixFlg) {

		if (MAC_TRD_PTN_TYP.isSLS_RTN(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().cst_cd(),
					getHdrR().sls_ret_dt(),
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
			MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().sls_ret_dt(), getHdrR().wg_cd(), getCo().gm_std_upri_typ());
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
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {

			setDefaultWatxRate(dtlR.getGUIIndex(), true);
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
				&& !isNull(getHdrR().sls_ret_dt())) {

			DtlR r = getDtlL().get(index);
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().sls_ret_dt(),
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
		DtlR dtlR = getDtlL().get(index);;
		MCNumber amt = MAUCP_AmtUtil.getTaxAmt(dtlR.trd_cur_amt(), dtlR.wtax_rate(), getHdrR().trd_cur_amt_dec_place(), getCo().wtax_rnd_typ());
		setValueEx(columnDtl_wtax_amt, dtlR.getGUIIndex(), amt);
	}

	@Override
	public void doHdr_sls_ret_dt_LC(MCEventInfo info) {
		super.doHdr_sls_ret_dt_LC(info);

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {

			setDefaultWatxRate(dtlR.getGUIIndex(), true);

			if (!dtlR.tax_fix_flg() && isNull(dtlR.ref_sls_act_no())) {
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
		DtlR r = getDtlL().get(info.getEventIndex());

		if (Dtl_itm_p_PPanel.isItmFix(index)) {

			// 詳細行に1行もなければ1行追加
			addChildDtlRow(r);

			// 登録枠の納品先関連項目をコピー
			copyHdr2DtlInfo(r,getHdrR());

			// 明細行IDが未設定の場合は発番
			if (isNull(r.dtl_row_id())) {
				r.dtl_row_id(nextCnt());
			}

			// 出荷返品時は単価に0を設定
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(getHdrR().trd_ptn_typ())) {
				setValueEx(columnDtl_trd_cur_upri, index, MCNumber.ZERO);
			}

			setDefaultBillCrryovrTimes(index);
			setDefaultTaxCd(index, true);
			setDefaultCostUpri(index);
			setIvItmNm(r);
			setColByDscntItm(r);

			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				setValueEx(columnDtl_gd_cd, index, getDefaultFeedStkGd().gd_cd());
			}
			setDefStrLnCd(r);
		}
		else if (isNull(r.itm_cd())) {
			// 一部項目を除いて明細行をクリアする
			clearRowExcept(r, ITM_CHNG_EXCLD_CLR_COLS);
		}

		setDefaultWatxRate(index, false);

		setIvItmNm(r);
		setCstItm(r);

		// 子の詳細リストもメンテナンス
		// この時点で画面の詳細一覧(getIoL())には明細に紐づく詳細リストのみが格納されている前提である
		for (IoR ioR : getIoL()) {
			copyDtl2IoItmInfo(ioR, r);
		}

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
			if(!dtFlg || (dtFlg && !isTrnstDtlRow(dtlR))) {
				setCstItm(dtlR);
			}
		}
	}
	
	/**
	 * 	明細行が（売上返品予定/売上実績)引継行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isTrnstDtlRow(DtlR r) {
		return !isNull(r.ref_sls_act_no()) || !isNull(r.sls_ret_schd_d_no());
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {

		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().sls_ret_dt(), this);
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
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(info.getEventIndex());
		setIvItmNm(r);
		copyDlvToRet(index);
	}

	/**
	 * 納品先情報を返品先にコピーします。
	 * @param dtlR
	 */
	protected void copyDlvToRet(int index) {
		DtlR row = getDtlL().get(index);

		if (isNull(row.ret_nm())) {
			setValueEx(columnDtl_ret_nm, index, row.dlv_nm());
		}
		if (isNull(row.ret_zip_cd())) {
			setValueEx(columnDtl_ret_zip_cd, index, row.dlv_zip_cd());
		}
		if (isNull(row.ret_addr1())) {
			setValueEx(columnDtl_ret_addr1, index, row.dlv_addr1());
		}
		if (isNull(row.ret_addr2())) {
			setValueEx(columnDtl_ret_addr2, index, row.dlv_addr2());
		}
		if (isNull(row.ret_addr3())) {
			setValueEx(columnDtl_ret_addr3, index, row.dlv_addr3());
		}
		if (isNull(row.ret_addr4())) {
			setValueEx(columnDtl_ret_addr4, index, row.dlv_addr4());
		}
		if (isNull(row.ret_cntct_dpt())) {
			setValueEx(columnDtl_ret_cntct_dpt, index, row.dlv_cntct_dpt());
		}
		if (isNull(row.ret_cntct_psn())) {
			setValueEx(columnDtl_ret_cntct_psn, index, row.dlv_cntct_psn());
		}
		if (isNull(row.ret_tel())) {
			setValueEx(columnDtl_ret_tel, index, row.dlv_tel());
		}
		if (isNull(row.ret_fax())) {
			setValueEx(columnDtl_ret_fax, index, row.dlv_fax());
		}
	}

	protected void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isSame(r.trd_cur_upri(), 0) && r.sls_acxfr_flg()){
			setValueEx(columnDtl_ret_rsn_cd, info.getEventIndex(), null);
		}
	}

	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setWtaxAmt(index);
		clearDscntInfo(getDtlL().get(info.getEventIndex()));

	}

	@Override
	public void doDtl_stk_mng_typ_LC(MCEventInfo info) {
		super.doDtl_stk_mng_typ_LC(info);

		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);

		// 非在庫品に変更時
		if (MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ())) {
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

		setValueForMoneyCols(getHdrR(), row);
	}
	/**
	 * 数量、金額系項目に値をセットする
	 */
	protected void setValueForMoneyCols(HdrR hdr, DtlR dtl) {

		if (isNull(dtl.sls_ret_schd_d_no()) || isNull(dtl.trd_unit_qty())
				|| isNull(dtl.trd_unit_cd())) {
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
			utlHdr.trd_cur_dscnt_amt(dtl.db_trd_cur_dscnt_amt());
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
			if (dtl.sls_dtl_upd_flg()) {
				utlHdr.trd_cur_upri(dtl.db_trd_cur_upri());
				utlHdr.trd_cur_dscnt_amt(dtl.db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_upri(dtl.init_trd_cur_upri());
				utlHdr.trd_cur_dscnt_amt(dtl.init_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_amt(dtl.init_schd_amt());
			utlHdr.trd_cur_tax_amt(dtl.init_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(dtl.init_trd_cur_upri(), dtl.init_trd_unit_qty(),
					dtl.tax_rate(), dtl.inc_tax_flg(), hdr.trd_cur_amt_dec_place(),
					hdr.sls_amt_rnd_typ(), hdr.sls_tax_rnd_typ(),
					dtl.init_schd_dscnt_amt());
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

		utlDtlL.add(utlDtlR);
		return utlDtlL;
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
		if (isNull(dtlR.sls_ret_schd_d_no())) {
			columnDtl_trd_cur_dscnt_amt.setValue(dtlR.getGUIIndex(), null);
		}
	}
	protected void doDtl_trd_unit_qty_NC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueForMoneyCols(getHdrR(), dtlR);
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

	protected void doDtl_cost_amt_LC(MCEventInfo info){
		int index = info.getEventIndex();

		setWtaxAmt(index);
		setCostAmt(index);
		setHdrAmt();
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
	 * @param r 売上返品明細
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
			if (r.isStatusDelete()  || r.isEmpty()) {
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

	protected void clearDscntInfo(DtlR r) {
		if (isNull(r.trd_cur_amt()) || r.trd_cur_amt().isZero()) {
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
		}
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

	@Override
	public void doHdr_num_flg_NC(MCEventInfo info) {
		super.doHdr_num_flg_NC(info);
		if (Hdr_num_flg.getValue()) {
			Hdr_iv_no.clear();
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {
			Hdr_iv_no.setMode(MCMode.REQUIRED);
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
	 * 仕向先の表示モードを設定する。
	 */
	protected void setDestCdMode() {

		if (isNull(getHdrR().dest_cd1())) {

			Hdr_dest_cd2.clear();
			Hdr_dest_cd2.setMode(MCMode.READ_ONLY);
		}
		else if(!isNull(getHdrR().sls_ret_schd_no())) {
			Hdr_dest_cd2.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_dest_cd2);
		}

		if (isNull(getHdrR().dest_cd2())) {

			Hdr_dest_cd3.clear();
			Hdr_dest_cd3.setMode(MCMode.READ_ONLY);
		}
		else if(!isNull(getHdrR().sls_ret_schd_no())) {
			Hdr_dest_cd3.setMode(MCMode.READ_ONLY);
		}
		else{
			setDefaultMode(Hdr_dest_cd3);
		}
	}

	/**
	 * 明細項目の表示制御
	 */
	protected void setDtlMode() {
		if (!getHdrR().purc_ret_tgt_flg()) {
			columnDtl_purc_act_no.setMode(MCMode.INVISIBLE);
			columnDtl_purc_act_rev.setMode(MCMode.INVISIBLE);
			columnDtl_purc_act_d_no.setMode(MCMode.INVISIBLE);
			columnDtl_sppl_cd.setMode(MCMode.INVISIBLE);
			columnDtl_sppl_nm.setMode(MCMode.INVISIBLE);
			columnDtl_sppl_cntry_cd.setMode(MCMode.INVISIBLE);
			columnDtl_sppl_cntry_nm.setMode(MCMode.INVISIBLE);
			columnDtl_ret_nm.setMode(MCMode.INVISIBLE);
			Dtl_ret_sppl_addr_p_PPanel.setINVISIBLEStatus();;
			columnDtl_ret_cntct_psn_title.setMode(MCMode.INVISIBLE);
			columnDtl_ret_usr_cd.setMode(MCMode.INVISIBLE);
			columnDtl_ret_usr_nm.setMode(MCMode.INVISIBLE);
			columnDtl_ret_dpt_cd.setMode(MCMode.INVISIBLE);
			columnDtl_ret_dpt_nm.setMode(MCMode.INVISIBLE);
			columnDtl_purc_ret_rsn_cd.setMode(MCMode.INVISIBLE);
			columnDtl_purc_ret_rsn_nm.setMode(MCMode.INVISIBLE);
			columnDtl_ap_dpt_cd.setMode(MCMode.INVISIBLE);
			columnDtl_ap_dpt_nm.setMode(MCMode.INVISIBLE);
			columnDtl_pay_schd_dt.setMode(MCMode.INVISIBLE);
			columnDtl_purc_ret_act_no.setMode(MCMode.INVISIBLE);
			columnDtl_purc_ret_act_rev.setMode(MCMode.INVISIBLE);
			columnDtl_purc_ret_act_d_no.setMode(MCMode.INVISIBLE);
		}

		if (!isNull(getHdrR().sls_ret_schd_no()) && Cnd_ope_INS.isSelected()) {
			Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.setMode(MCMode.READ_ONLY);
			Dtl_schd_qty_p_PPanel.columnQty_qty.setMode(MCMode.READ_ONLY);
		}
		else {
			Dtl_schd_qty_p_PPanel.columnQty_qty.setMode(MCMode.INVISIBLE);
		}

		if (!getHdrR().cst_iv_flg()) {
			columnDtl_cntry_org_cd.setMode(MCMode.INVISIBLE);
			columnDtl_cntry_org_nm.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 詳細項目の表示制御
	 */
	protected void setIoMode() {
		if (!getHdrR().purc_ret_tgt_flg()) {
			columnIo_purc_act_io_no.setMode(MCMode.INVISIBLE);
			Io_schd_qty_p_PPanel.columnQty_qty.setMode(MCMode.INVISIBLE);
			columnIo_purc_ret_act_io_no.setMode(MCMode.INVISIBLE);
		}

		if (!isNull(getHdrR().sls_ret_schd_no()) && Cnd_ope_INS.isSelected()) {
			Io_schd_qty_p_PPanel.columnQty_qty.setMode(MCMode.READ_ONLY);
		}
		else {
			Io_schd_qty_p_PPanel.columnQty_qty.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void doIo_NC(MCEventInfo info) {
		super.doIo_NC(info);
		setIoBtnMode();
	}

	@Override
	public void doIo_abort_flg_NC(MCEventInfo info) {
		super.doIo_abort_flg_NC(info);

		int index = info.getEventIndex();
		IoR ioR = getIoL().get(index);

		for (IoR r : _ioLAll) {
			if (r != ioR
				&& !isNull(r.arr_schd_no())
				&& isSame(r.arr_schd_no(), ioR.arr_schd_no())) {
				r.abort_flg(ioR.abort_flg());
				if (r.isStatusNone()) {
					r.setStatus(MCRow.MODIFY);
				}
			}
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}

		setIoBtnMode();
		showChildIoL();
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

	@Override
	public MCList<?> getDtl_purc_ret_rsn_cd(
			MCRow row,
			MCEventInfo info) {

		DtlR dr = getDtlL().get(info.getEventIndex());

		if (MAC_ASSET_MNG_TYP.isNOT_MNG(dr.asset_mng_typ())) {
			row.addBooleanColumn(PurcRtnBizRsnCols.$i_xpns_purc_flg, true);
		}
		else {
			row.addBooleanColumn(PurcRtnBizRsnCols.$i_not_xpns_purc_flg, true);
		}

		return super.getDtl_purc_ret_rsn_cd(row, info);
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
	 * 詳細行補完処理
	 * <p>明細に紐づく詳細行が1行も存在しない場合、明細行の内容から詳細行を1行作成する</p>
	 */
	protected void compIoL() {
		for (DtlR parDtlR : exceptDeleteAndEmpty(getDtlL())) {
			MCList<IoR> chdIoL = exceptEmpty(getChildIoL(parDtlR));
			if (chdIoL.isEmpty()) {
				addChildDtlRow(parDtlR);
			}
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

		// 詳細に対して行追加・行コピーできなければ自動行追加は行わない
		if (!IoBtn_radd.isEnabled() || !IoBtn_rcopy.isEnabled()) {
			return chdIoR;
		}

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
			chdIoR.sync_flg(true);
			chdIoR.setStatus(MCRow.CREATE);

			// 裏リストへ追加
			_ioLAll.add(chdIoR);
		}

		return chdIoR;
	}

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
					chdR.ver_flg(parDtlR.ver_flg());
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

				for (MCColumnConfig col : IoTable.getColumnConfigs()) {
					if (isSame(column, col.getBaseRowColumnName())) {
						if (isEditable(col, chdR.getGUIIndex())) {
							chdR.setValueNE(column, val);
						}
					}
				}

				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(parDtlR.sublot_mng_typ()) && isSame(parDtlR.sublot_no(), MAC_STR.NULL_VAL.value())) {
					chdR.sublot_no(MAC_STR.NULL_VAL.value());
				}

				if (isSame(column, DtlR.$str_ln_cd_none_flg)) {
					chdR.str_ln_cd(null);
					chdR.str_ln_nm(null);
				}
			}
		}
	}

	/**
	 * 	品目CD変更時に明細行でクリアしない項目
	 */
	protected final String[] ITM_CHNG_EXCLD_CLR_COLS = new String[] {

			DtlR.$itm_cd, 
			DtlR.$itm_sub1, 
			DtlR.$itm_sub2, 
			DtlR.$itm_sub3,
			DtlR.$dtl_row_id,
			DtlR.$purc_act_no,
			DtlR.$purc_act_rev,
			DtlR.$purc_act_d_no,
			DtlR.$purc_ret_act_no,
			DtlR.$purc_ret_act_rev,
			DtlR.$purc_ret_act_d_no,
			DtlR.$sls_ret_act_d_no,
			DtlR.$sls_ret_act_d_seq,
			DtlR.$slo_no,
			DtlR.$slo_d_no,
			DtlR.$sls_ret_schd_d_no,
			DtlR.$arr_act_no,
			DtlR.$disp_seq,
			DtlR.$sls_ret_schd_no,
			DtlR.$purc_ddlv_po_no,
			DtlR.$arr_pr_no,
			DtlR.$io_schd_pr_no };
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
	/**
	 * 詳細行リスト から 「明細行と紐づく詳細行」 をリスト化して返します。
	 * 
	 * @param list 詳細行リスト
	 * @return 
	 */
	protected <R extends MCRow> MCList<R> raddEmpty(MCList<R> list) {
		MCList<R> ans = list.createInstance();
		for (R row : list) {
			// 明細行IDが設定されている場合はリストに追加
			if (!isNull(row.getNumber(IoR.$dtl_row_id))) {
				ans.add(row);
			}
		}
		return ans;
	}
	
	@Override
	public void setFocus(MCMessage msg) {
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof IoR) {
			for (DtlR r : getDtlL()) {
				if (isSame(((IoR) msg.getCauseRow()).dtl_row_id(), r.dtl_row_id())) {
					DtlTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

}