package mcframe.clientMSBB.MSBBP1360;

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
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMAUB.MAUBP5390.*;
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
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.clientMSUC.MSUCP0060.MSUCP_ArUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.commonMA.meta.MA_META;
import java.util.Map;
import java.util.HashMap;
import mcframe.clientCore.beans.list.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import static mcframe.clientMSUC.MSUCP0020.MSUCP_ConvQtyAmtUtil.*;
import mcframe.clientMSUC.MSUCP0020.*;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_PurcDdlvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_PurcDdlvReg_MC extends MSBBP_PurcDdlvReg_MC_A implements IfOpePanel, IfRowMoveBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _updDtlBtnExecFlg = false;

	// 明細行ＩＤをキーとして詳細リストを格納するマップ
	protected Map<MCNumber, MCList<IoR>> _ioLMap = new HashMap<MCNumber, MCList<IoR>>();

	// 明細行ＩＤ発番用カウンタ
	protected int _dtl_row_id = 0;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_PurcDdlvReg_MC() {
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
	public MSBBP_PurcDdlvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1360_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch03Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1360_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().setStatus(Status.CREATE);
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);

			for (DtlR r : bridge.down1()) {
				
				r.purc_trd_unit_cd(r.trd_unit_cd());
				r.purc_trd_unit_qty(r.trd_unit_qty());
				r.purc_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.purc_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.purc_trd_unit_dec_place(r.trd_unit_dec_place());
				r.purc_base_unit_qty(r.base_unit_qty());
				
				if (r.sync_flg()) {
					r.xrate_purc_dt(getToday());
				}
				else {
					r.xrate_purc_dt(r.purc_dt());
				}
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setHdrPanelInitValue();
			setINSStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setINS_SRCHStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
			setIoLMap();
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLMap.clear();
		}
		@Override
		protected void show() {
			super.show();
			copyAmtDataSchd();
			setOrgAmt();
			calcPurcBaseCur();
		}
	}


	/**
	 * [MS_MSBBL1360_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch01Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1360_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().setStatus(Status.CREATE);
			bridge.down1().setStatus(Status.CREATE);
			bridge.down2().setStatus(Status.CREATE);

			for (DtlR r : bridge.down1()) {
				
				r.purc_trd_unit_cd(r.trd_unit_cd());
				r.purc_trd_unit_qty(r.trd_unit_qty());
				r.purc_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.purc_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.purc_trd_unit_dec_place(r.trd_unit_dec_place());
				r.purc_base_unit_qty(r.base_unit_qty());
				
				if (r.sync_flg()) {
					r.xrate_purc_dt(getToday());
				}
				else {
					r.xrate_purc_dt(r.purc_dt());
				}
			}
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setHdrPanelInitValue();
			setINSStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setINS_SRCHStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
			setIoLMap();
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLMap.clear();
		}
		@Override
		protected void show() {
			super.show();
			copyAmtDataSchd();
			setOrgAmt();
			calcPurcBaseCur();
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
	 * [MS_MSBBL1360_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch02Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1360_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());

			for (DtlR r : bridge.down1()) {
				
				r.purc_trd_unit_cd(r.trd_unit_cd());
				r.purc_trd_unit_qty(r.trd_unit_qty());
				r.purc_trd_unit_conv_base_qty(r.trd_unit_conv_base_qty());
				r.purc_trd_unit_conv_qty(r.trd_unit_conv_qty());
				r.purc_trd_unit_dec_place(r.trd_unit_dec_place());
				r.purc_base_unit_qty(r.base_unit_qty());
				if (r.sync_flg()) {
					r.xrate_purc_dt(bridge.down0().sls_dt());
				}
				else {
					r.xrate_purc_dt(r.purc_dt());
				}
			}
			
			_ioLMap.put(MCNumber.ZERO, bridge.down2());
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();
			setCnt();
			setIoLMap();
			DtlTable.selectLeftmostColumn(0);
			showChildIoL();
		}

		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			resetCnt();
			_ioLMap.clear();
		}
		@Override
		protected void show() {
			super.show();
			copyAmtData();
			setOrgAmt();
		}
	}

	/**
	 * [MS_MSBBL1360_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Ins01Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1360_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(exceptEmpty(getAllIoL()));
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}

	/**
	 * [MS_MSBBL1360_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Upd01Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1360_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 詳細行の補完
			compIoL();
			setPrint(true);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up2().setAll(exceptEmpty(getAllIoL()));
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
		}
	}

	/**
	 * [MS_MSBBL1360_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Del01Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1360_Del01Caller(P p, B b) {
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
			bridge.up2().setAll(exceptEmpty(getAllIoL()));
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * [MS_MSBBL1360_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Prnt01Caller<P extends MSBBP_PurcDdlvReg, B extends MS_MSBBL1360_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1360_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_slip]の押下時の処理
	 */
	@Override
	public void doCnd_srch_slip(MCEventInfo info) {
		callMS_MSBBL1360_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1360_Ins01();
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		// 検索対象区分により呼出オペレーションを切り替える
		if (MSC_SLS_SRCH_TGT_TYP.isSLO_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1360_Srch01();
		}
		else if (MSC_SLS_SRCH_TGT_TYP.isDLV_SLIP_NO(Cnd_srch_tgt_typ.getValue())) {
			callMS_MSBBL1360_Srch03();
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
		DtlR insR = insertRow(DtlTable);
		insR.dtl_row_id(nextCnt());
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
		
		if (dr.isStatusDelete()) {
			for (IoR ioR : _ioLMap.get(dr.dtl_row_id())) {
				if (!ioR.isStatusDelete()) {
					ioR.setStatus(Status.DELETE);
				}
			}
		}
		
		if (!getDtlL().contains(dr) && (Cnd_ope_INS.isSelected() || dr.isStatusCreate())) {
			// 明細に紐付く詳細行をキャッシュから削除する
			_ioLMap.remove(dr.dtl_row_id());
		}
		setHdrAmt();
		setHdrIncTaxAmt();
		
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
		DtlR oldDtlR = DtlTable.getSelectedMCRow();
		
		MCList<IoR> oldIoL = _ioLMap.get(oldDtlR.dtl_row_id());
		
		DtlR dtlR = copyRow(DtlTable);
		
		setHdrAmt();
		setHdrIncTaxAmt();
		
		if(!isNull(dtlR.dtl_row_id())
			 || !isNull(oldDtlR.dtl_row_id())) {
				dtlR.dtl_row_id(nextCnt());
		}
		dtlR.clear(DtlR.$sls_act_no,
				DtlR.$sls_act_seq,
				DtlR.$sls_act_d_no,
				DtlR.$sls_act_d_seq,
				DtlR.$org_sync_flg);
		if (dtlR.sync_flg()) {
			dtlR.clear(DtlR.$purc_ac_ym,
					DtlR.$purc_ac_dt,
					DtlR.$purc_dt,
					DtlR.$purc_act_no,
					DtlR.$purc_act_d_no);
		}
		
		if (!isNull(oldIoL)) {
			MCList<IoR> ioL = oldIoL.clone();
		
			ioL.setValueNE(IoR.$dtl_row_id, dtlR.dtl_row_id());
			ioL.clear(IoR.$sls_act_io_no, IoR.$sls_act_io_seq);
			if (dtlR.sync_flg()) {
				ioL.clear(IoR.$purc_qty, IoR.$sls_qty, IoR.$purc_act_io_no, IoR.$purc_act_io_seq);
			}
			ioL.setStatus(Status.CREATE);
		
			_ioLMap.put(dtlR.dtl_row_id(), ioL);
		}
		
		showChildIoL();
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

		MCList<IoR> ioL = _ioLMap.get(dtlR.dtl_row_id());
		if (isNull(ioL)) {
			ioL = MCList.create(IoR.class);
		}
		ioL.add(ioR);
		_ioLMap.put(dtlR.dtl_row_id(), ioL);
	}

	/**
	 * Panel[IoBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doIoBtn_rdel(MCEventInfo info) {

		if (!isDtlRowSelected()) {
			return;
		}
		DtlR parDtlR = DtlTable.getSelectedMCRow();

		if (!isIoRowSelected()) {
			return;
		}

		IoR r =  deleteRow(IoTable);
		
		if (r.isStatusCreate()) {
			MCList<IoR> ioL = _ioLMap.get(parDtlR.dtl_row_id());
			if (isNull(ioL)) {
				ioL = MCList.create(IoR.class);
			}
			ioL.remove(r);
			_ioLMap.put(parDtlR.dtl_row_id(), ioL);
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
		DtlR dtlR = DtlTable.getSelectedMCRow();

		IoR r = copyRow(IoTable);
		r.setStatus(MCRow.CREATE);
		r.dtl_row_id(dtlR.dtl_row_id());

		r.purc_qty(null);
		r.sls_qty(null);
		if (dtlR.sync_flg()) {
			r.purc_act_io_no(null);
			r.purc_act_io_seq(null);
		}
		r.sls_act_io_no(null);
		r.sls_act_io_seq(null);

		MCList<IoR> ioL = _ioLMap.get(dtlR.dtl_row_id());
		if (isNull(ioL)) {
			ioL = MCList.create(IoR.class);
		}
		ioL.add(r);
		_ioLMap.put(dtlR.dtl_row_id(), ioL);
	}

	/**
	 * Panel[IoBtn]のボタン[upd_dtl]の押下時の処理
	 */
	@Override
	public void doIoBtn_upd_dtl(MCEventInfo info) {
		_updDtlBtnExecFlg = true;
		sumIoLQty2Dtl();
		_updDtlBtnExecFlg = false;
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBBL1360_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1360_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1360_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setDefaultSrcTgtTyp();
		insInit();
	}

	@Override
	public MCList<?> getListForIS(MCEventBeans compo, MCRow row, MCEventInfo info) {
		if (compo == columnDtl_dlv_cd && compo instanceof MCLinkBeans) {
			return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(
					getBindRowForISCustom(row, (MCLinkBeans) compo, info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}

	// ------------------------------------- Initialize -------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_sls_dpt_cd.addLCListener(this);
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_base_unit_qty.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_base_cur_amt.addLCListener(this);
		columnDtl_cost_upri.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_crt_lot_flg.addNCListener(this);
		columnDtl_lot_no.addNCListener(this);
		columnDtl_sublot_no.addNCListener(this);
		columnDtl_ver_no.addNCListener(this);
		columnIo_trd_unit_qty.addLCListener(this);
		columnIo_base_unit_qty.addLCListener(this);
		columnDtl_purc_trd_unit_qty.addLCListener(this);
		setListListener(DtlTable, getDtlRowListener());
		columnDtl_trd_unit_qty.addNCListener(this);
		columnDtl_purc_trd_unit_qty.addNCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_purc_tax_cd.addLCListener(this);
		columnDtl_trd_cur_dscnt_amt.addLCListener(this);
		columnDtl_purc_trd_cur_dscnt_amt.addLCListener(this);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		// ヘッダ項目
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_sls_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt, Hdr_slo_no);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_sls_dt, true, Hdr_xrate_inpt_flg, true);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_xrate_cd, Hdr_sls_dt, true, Hdr_ptax_xrate_inpt_flg, true);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_not_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_cred_bal_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		// 明細
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_dlv_p_PPanel.setRelateBeans(Hdr_cst_cd);
		
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2,columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ, 
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_sls_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		Dtl_sls_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		
		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl_trd_upri_amt_p_PPanel.setRelateBeans(
				Hdr_trd_cur_cd, Hdr_cst_cd,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
				columnDtl_trd_unit_cd,
				columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place,
				Hdr_sls_amt_rnd_typ, Hdr_sls_tax_rnd_typ,
				null, null, columnDtl_dscnt_itm_flg,
				columnDtl_sls_schd_no,
				columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty,
				columnDtl_schd_trd_unit_conv_base_qty,
				columnDtl_schd_trd_unit_conv_qty,
				columnDtl_base_unit_dec_place,
				columnDtl_base_unit_rnd_typ
				);
		
		Dtl_trd_upri_amt_p_PPanel.setSchd(false);
		
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
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_cost_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_cost_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_cost_upri_p_PPanel.UpriTable.setCellConfig(new MAUDP_CellConfig());
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ,
				columnDtl_lot_no_typ, columnDtl_sublot_mng_typ, columnDtl_sublot_no_typ,
				true);
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_purc_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_purc_base_unit_qty, columnDtl_std_cont_fctr,
				null, columnDtl_cont_fctr_dec_place,
				columnDtl_cont_fctr_rnd_typ);
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(columnDtl_cont_fctr_flg,
				columnDtl_purc_base_unit_qty, columnDtl_std_cont_fctr,
				null, columnDtl_cont_fctr_dec_place,
				columnDtl_cont_fctr_rnd_typ);
		Dtl_purc_cont_fctr_p_PPanel.setRelateBeans(
				columnDtl_cont_fctr_flg, 
				columnDtl_purc_base_unit_qty, 
				columnDtl_purc_cont_qty,
				columnDtl_cont_fctr_dec_place);
		
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);

		Dtl_purc_trd_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl_purc_trd_upri_amt_p_PPanel.setRelateBeans(
				columnDtl_purc_trd_cur_cd, columnDtl_sppl_cd,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
				columnDtl_purc_trd_unit_cd,
				columnDtl_purc_trd_unit_qty, columnDtl_purc_trd_cur_amt_dec_place, columnDtl_purc_trd_cur_upri_dec_place,
				columnDtl_purc_amt_rnd_typ, columnDtl_purc_tax_rnd_typ,
				null, null, columnDtl_dscnt_itm_flg,
				columnDtl_purc_schd_no,
				columnDtl_purc_trd_unit_conv_base_qty,
				columnDtl_purc_trd_unit_conv_qty,
				columnDtl_purc_s_trd_unit_conv_base_qty,
				columnDtl_purc_s_trd_unit_conv_qty,
				columnDtl_base_unit_dec_place,
				columnDtl_base_unit_rnd_typ
				);

		Dtl_purc_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		
		Dtl_purc_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_purc_trd_unit_cd,
				columnDtl_purc_trd_unit_dec_place);
		
		Dtl_purc_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place);
		
		Dtl_purc_xrate_p_PPanel.setRelateBeans(columnDtl_purc_trd_cur_cd, Hdr_base_cur_cd, Hdr_purc_xrate_cd, columnDtl_xrate_purc_dt, true, columnDtl_purc_xrate_inpt_flg, true);
		
		Dtl_purc_ptax_xrate_p_PPanel.setRelateBeans(columnDtl_purc_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_purc_xrate_cd, columnDtl_xrate_purc_dt, true, columnDtl_purc_ptax_xrate_inpt_flg, true);

		Dtl_purc_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_upri_dec_place, columnDtl_purc_trd_cur_upri, columnDtl_purc_xrate);
		Dtl_purc_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_purc_trd_cur_amt, columnDtl_purc_xrate);
		Dtl_purc_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_purc_trd_cur_inc_tax_amt, columnDtl_purc_xrate);
		Dtl_purc_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_purc_trd_cur_tax_amt, columnDtl_purc_xrate);
		Dtl_purc_base_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place, columnDtl_purc_trd_cur_dscnt_amt, columnDtl_purc_xrate);
		Dtl_purc_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_upri_dec_place, columnDtl_purc_trd_cur_upri, columnDtl_purc_ptax_xrate);
		Dtl_purc_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_purc_trd_cur_amt, columnDtl_purc_ptax_xrate);
		Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel
				.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place,
						columnDtl_purc_trd_cur_inc_tax_amt, columnDtl_purc_ptax_xrate);
		Dtl_purc_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_purc_trd_cur_tax_amt, columnDtl_purc_ptax_xrate);
		Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place, columnDtl_purc_trd_cur_dscnt_amt, columnDtl_purc_ptax_xrate);
		
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
		Io_purc_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_sls_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place, columnIo_base_unit_rnd_typ, null,
				columnIo_trd_unit_conv_base_qty, columnIo_trd_unit_conv_qty);
		Io_lot_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_lot_mng_typ,
				columnIo_lot_no_typ, columnIo_sublot_mng_typ, columnIo_sublot_no_typ,
				true);
		Io_sno_wrk_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, columnIo_sno1_mng_typ,
				columnIo_sno2_mng_typ, columnIo_sno3_mng_typ, columnIo_sno4_mng_typ);

		Io_purc_cont_qty_p_PPanel.setRelateBeans(columnIo_cont_fctr_flg,
				columnIo_purc_base_unit_qty, columnIo_std_cont_fctr, null,
				columnIo_cont_fctr_dec_place, columnIo_cont_fctr_rnd_typ);
		Io_std_cont_qty_p_PPanel.setRelateBeans(columnIo_cont_fctr_flg,
				columnIo_purc_base_unit_qty, columnIo_std_cont_fctr, null,
				columnIo_cont_fctr_dec_place, columnIo_cont_fctr_rnd_typ);
		Io_purc_cont_fctr_p_PPanel.setRelateBeans(
				columnIo_cont_fctr_flg, 
				columnIo_purc_base_unit_qty, 
				columnIo_purc_cont_qty,
				columnIo_cont_fctr_dec_place);
		Io_ver_no_p_PPanel.setRelateBeans(columnIo_itm_cd, columnIo_itm_sub1,
				columnIo_itm_sub2, columnIo_itm_sub3, null, columnIo_ver_flg);
		
		Io_purc_base_unit_qty_p_PPanel.setRelateBeans(columnIo_base_unit_cd,
				columnIo_base_unit_dec_place);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		// 納品先
		linkBeansToISPanelCustom(columnDtl_dlv_cd, true);
		
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_sls_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);
		
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		getDtl_purc_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		
	}
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_cst_itm_cd) {				
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().sls_dt());
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
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new CstItmListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	
	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		MCDate dt = getHdrR().sls_dt();
		row.setDateNE(CstItmCols.$i_dt, dt);
		
		return super.getDtl_cst_itm_cd(row, info);
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
	protected void listInit() {
		super.listInit();
		
		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_sls_dt);
		
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
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
	// ------------------------------------- Mode -------------------------------------	

	protected void setSrchStatus() {
		
		if (Cnd_ope_INS.isSelected()) {
			setINS_SRCHStatus();
		}
		else {
			setSRCHStatus();
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		setRevNoMode();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setHdrTtermMode();
		setDlvSlipOutFlg();
		setIoBtnMode();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setHdrTtermMode();
		setDlvSlipOutFlg();
		setDestCdMode();
		setIoBtnMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDlvSlipOutFlg();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		setRevNoMode();
	}

	/**
	 * 	更新可能な画面ステータスか判定する
	 * @return
	 */
	protected boolean isUpdStatus() {

		return isSame(getStatus(), INS) || isSame(getStatus(), UPD);
	}
	
	/**
	 * 納品書即時発行ＦＬＧの設定
	 */
	protected void setDlvSlipOutFlg() {
		getHdrR().dlv_slip_out_flg(true);
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

	protected MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLO_NO,
				MSC_SLS_SRCH_TGT_TYP.DLV_SLIP_NO
			};
		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
			};
		}
	}

	protected void setDefaultSrcTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
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
		}
		else if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {

			// 行コピーは計画外の非在庫品のみが対象となる
			if (cont == getDtlL()) {
				l.add(DtlR.$sls_act_no);
				l.add(DtlR.$sls_act_seq);
				l.add(DtlR.$sls_act_d_no);
				l.add(DtlR.$sls_act_d_seq);
				l.add(DtlR.$dtl_row_id);
				l.add(DtlR.$org_sync_flg);
				l.add(DtlR.$ext_sys_cd);
				l.add(DtlR.$ext_sys_nm);
				l.add(DtlR.$ext_purc_act_d_no);
			}
			else if (cont == getIoL()) {
				l.add(IoR.$sls_act_io_no);
				l.add(IoR.$sls_act_io_seq);
				l.add(IoR.$dtl_row_id);
			}
		}
		return l;
	}

	/*
	 * 	明細ボタンのモード制御
	 */
	protected void setDtlBtnMode() {
		DtlR selectRow = DtlTable.getSelectedMCRow();
		if (isUpdStatus()) {
			if (isNull(selectRow)) {
				setDefaultMode(DtlBtn_radd);
				DtlBtn_rcopy.setMode(MCMode.DISABLE);
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(DtlBtn_radd);
				setDefaultMode(DtlBtn_rdel);
				setDefaultMode(DtlBtn_rcopy);
			}
		}
	}

	/**
	 * 	詳細ボタンブロックのモード設定
	 */
	protected void setIoBtnMode() {
		DtlR selectDtlR = DtlTable.getSelectedMCRow();
		if (isUpdStatus()) {
			
			if (isNull(selectDtlR) || isUnschdDtlR(selectDtlR) || selectDtlR.isStatusDelete()) {
				IoBtn_rcopy.setMode(MCMode.DISABLE);
				IoBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_rcopy);
				setDefaultMode(IoBtn_rdel);
			}
			
			if (isNull(selectDtlR) || isUnschdDtlR(selectDtlR) || !selectDtlR.org_sync_flg() || !selectDtlR.sync_flg() || selectDtlR.isStatusDelete()) {
				IoBtn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(IoBtn_radd);
			}
		}
	}

	/**
	 * 	取引条件のモード制御
	 */
	protected void setHdrTtermMode() {
	}

	/**
	 * 	選択された明細行に紐づく詳細のリストを画面上に表示する
	 */
	protected void showChildIoL() {

		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			if (!isNull(selectedRow.dtl_row_id())){
				MCList<IoR> ioL = _ioLMap.get(selectedRow.dtl_row_id());
				getIoL().setAll(ioL);
			}
			else
			{
				getIoL().setAll(null);
			}
		}
	}

	protected void setIoLMap() {

		_ioLMap.clear();
		MCIndexKey idxkey = getIoL().createIndex(IoR.$dtl_row_id);
		for (DtlR r : getDtlL()) {
			_ioLMap.put(r.dtl_row_id(),
					getIoL().subList(idxkey, r.toArray(DtlR.$dtl_row_id)));
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
	 * 	検索結果で明細と詳細の親子のペアで同一の明細行ＩＤが連番で設定されている前提。
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

	// ------------------------------------- EVENT -------------------------------------
	@Override
	public void doLCEvent(mcframe.clientCore.event.MCLCBeans lc,
			mcframe.clientCore.event.MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == Hdr_sls_dpt_cd) doHdr_sls_dpt_cd_LC(info);
		if (Dtl_itm_p_PPanel.isItm(lc)) doDtl_itm_LC(info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_base_unit_qty) doDtl_base_unit_qty_LC(info);
		if (lc == columnDtl_cost_upri) doDtl_cost_upri_LC(info); 
		if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_base_cur_amt) doDtl_base_cur_amt_LC(info);
		if (lc == columnDtl_purc_trd_unit_qty) doDtl_purc_trd_unit_qty_LC(info);
		if (lc == columnIo_base_unit_qty) doIo_base_unit_qty_LC(info);
		if (lc == columnDtl_trd_cur_inc_tax_amt) doDtl_trd_cur_inc_tax_amt_LC(info);
		if (lc == columnDtl_tax_cd) doDtl_tax_cd_LC(info);
		if (lc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_LC(info);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == columnDtl_crt_lot_flg) doDtl_crt_lot_flg_NC(info);
		if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		if (nc == columnDtl_ver_no) doDtl_ver_no_NC(info);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setDefaultSrcTgtTyp();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setDtlBtnMode();
		setIoBtnMode();
		showChildIoL();
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			// 種別切り替え時に検索区分が変わる場合は、種別変更後の検索区分とNOの整合性を考え、適切なNOを検索条件に設定する
			// 検索区分とNOの整合性が取れない場合は、検索条件のNOを設定しない
			getCndR().srch_tgt_no(getHdrR().sls_act_no());
		}
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			if (isSame(bfOpe, Cnd_ope_REF.getActionCommand())) {
				setRefToInsInit();
			}
			setINS_SRCHStatus();
		}
	}

	/**
	 * 参照する⇒登録するに変更したときの処理。参照登録機能はないのでクリアする。
	 */
	protected void setRefToInsInit() {
		clearContainers(getHdrR(), getDtlL(), getIoL());
		_ioLMap.clear();
	}

	@Override
	public void doCnd_srch_tgt_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_srch_tgt_typ_LC(info);

		// 受注ＮＯ選択時
		if (MSC_SLS_SRCH_TGT_TYP.isSLO_NO(Cnd_srch_tgt_typ.getValue())
			|| MSC_SLS_SRCH_TGT_TYP.isDLV_SLIP_NO(Cnd_srch_tgt_typ.getValue())) {
			setDefaultMode(Cnd_purc_schd_dt);
			Cnd_srch_tgt_rev.clear();
			Cnd_latest_flg.setValue(false);
		}
		else {
			Cnd_purc_schd_dt.clear();
			Cnd_purc_schd_dt.setMode(MCMode.READ_ONLY);
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
	public void doHdr_sls_dt_LC(MCEventInfo info) {
		super.doHdr_sls_dt_LC(info);
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
			
			setPurcSlsDt(dtlR);
		}
		setCstItm(true);
		setDefaultCostUpri();
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		
		if (!isNull(getHdrR().cst_cd()) && !isNull(getHdrR().trd_cur_cd())) {
			// 与信枠残高取得
			getHdrR().cred_bal(MSUCP_ArUtil.getCredBal(getHdrR().cst_cd(), getHdrR().trd_cur_cd(), this));
		}
		else {
			getHdrR().cred_bal(null);
		}
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
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
	 * 明細の仕入売上日を設定する。(部品を連動させるため)
	 * @param dtlR
	 */
	protected void setPurcSlsDt(DtlR dtlR) {

		if (dtlR.sync_flg()) {
			setValueEx(columnDtl_xrate_purc_dt, dtlR.getGUIIndex(), getHdrR().sls_dt());
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

	@Override
	public void doHdr_tterm_cd1_LC(MCEventInfo info) {
		super.doHdr_tterm_cd1_LC(info);
		setHdrTtermMode();
	}

	@Override
	public void doHdr_tterm_cd2_LC(MCEventInfo info) {
		super.doHdr_tterm_cd2_LC(info);
		setHdrTtermMode();
	}

	@Override
	public void doHdr_tterm_cd3_LC(MCEventInfo info) {
		super.doHdr_tterm_cd3_LC(info);
		setHdrTtermMode();
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
			addChildIoRow(row);
			// 登録枠の納品先関連項目をコピー
			copyHdr2DtlDlvInfo(index);

			// 登録枠の仕向先関連項目をコピー
			copyHdr2DtlDestInfo(index);

			// 明細行IDが未設定の場合は発番
			if (isNull(row.dtl_row_id())) {
				row.dtl_row_id(nextCnt());
			}

			setDtlDefaultValue(info);
			setCstItm(row);
		}
		else if (isNull(row.itm_cd())) {
			//クリア時は該当行のすべての項目をクリアする。
			
			clearRowExcept(row, 
			DtlR.$sls_act_d_no,
			DtlR.$purc_act_no,
			DtlR.$purc_act_d_no,
			DtlR.$po_no,
			DtlR.$po_d_no,
			DtlR.$slo_d_no,
			DtlR.$disp_seq,
			DtlR.$sls_act_no,
			DtlR.$sls_act_seq,
			DtlR.$sls_act_d_seq,
			DtlR.$sls_schd_no,
			DtlR.$purc_schd_no,
			DtlR.$dtl_row_id,
			DtlR.$arr_pr_no,
			DtlR.$ship_pr_no,
			DtlR.$arr_pr_upd_cntr,
			DtlR.$ship_pr_upd_cntr);
		}
		
		setDefaultWatxRate(index, false);

		// 子の詳細リストもメンテナンス
		// この時点で画面の詳細一覧(getIoL())には明細に紐づく詳細リストのみが格納されている前提である
		for (IoR r : getIoL()) {
			copyDtl2IoItmInfo(r, row);
		}

		setDtlBtnMode();
		setIoBtnMode();
	}
	/**
	 * 	登録枠の納品先関連項目を指定行の納品関連項目にコピーする
	 * <p>新規行以外の場合はコピーしません</p>
	 * @param index	
	 */
	protected void copyHdr2DtlDlvInfo(int index) {
		DtlR row = getDtlL().get(index);
		if (row.isStatusCreate() && isNull(row.dlv_cd())) {
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
		}
	}

	/**
	 * 	登録枠の仕向先関連項目を指定行の仕向先関連項目にコピーする
	 * <p>新規行以外の場合はコピーしません</p>
	 * @param index	
	 */
	protected void copyHdr2DtlDestInfo(int index) {
		DtlR row = getDtlL().get(index);
		if (row.isStatusCreate()) {
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
		}
	}
	
	@Override
	public void doDtl_sync_flg_NC(MCEventInfo info) {
		super.doDtl_sync_flg_NC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setPurcTrdUnitCd(dtlR);
		setPurcTrdUnitQty(dtlR);
		setPurcBaseUnitQty(dtlR);
		setPurcSlsDt(dtlR);
	}

	@Override
	public void doDtl_abort_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_abort_flg_NC(info);
		
		setHdrAmt();
		setHdrIncTaxAmt();
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (dtlR.sync_flg()) {
			getDtlL().subList(r->!isNull(r.slo_d_no()) && isSame(r.purc_schd_no(), dtlR.purc_schd_no())).setValueNE(DtlR.$abort_flg, dtlR.abort_flg());
		}
		else {
			getDtlL().subList(r->!r.isStatusDelete() && !isNull(r.slo_d_no()) && isSame(r.sls_schd_no(), dtlR.sls_schd_no())).setValueNE(DtlR.$abort_flg, dtlR.abort_flg());
		}
	}

	@Override
	public void doDtl_trd_unit_cd_LC(MCEventInfo info) {
		super.doDtl_trd_unit_cd_LC(info);

		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		// 単位を変更すると数量、単価をクリアする。（計画外の行）
		if (isUnschdDtlR(r)) {
			setValueEx(columnDtl_trd_cur_upri, index, null);
		}
		setValueForMoneyCols(getHdrR(), r);

		propagate(r, DtlR.$trd_unit_cd);
		
		setPurcTrdUnitCd(r);
	}
	
	@Override
	public void doDtl_purc_trd_unit_cd_LC(MCEventInfo info) {
		super.doDtl_purc_trd_unit_cd_LC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		dtlR.purc_trd_unit_qty(dtlR.trd_unit_qty());
		setValueForPurcMoneyCols(getHdrR(), dtlR);
	}
	
	protected void doDtl_purc_trd_unit_qty_LC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setValueForPurcMoneyCols(getHdrR(), dtlR);
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
	}
	
	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (!isNull(info.getNewValue())) {
			DtlR r = getDtlL().get(index);
			setHdrAmt();
			setCostAmt(r);
			setWtaxAmt(r);
			clearDscntInfo(r);
		}
		else {
			setValueEx(columnDtl_wtax_amt, index, null);
		}
	}

	protected void doDtl_base_cur_amt_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setProfRate(r);
		setHdrAmt();
	}

	protected void doDtl_trd_cur_upri_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		if (isNull(info.getNewValue())
				|| (isSame(0, info.getOldValue()) && !isSame(0, info.getNewValue()))) {
			setValueEx(columnDtl_sls_rsn_cd, index, null);
		}
	}

	protected void doDtl_trd_unit_qty_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$trd_unit_qty);
		setCostAmt(r);
		setValueForMoneyCols(getHdrR(), r);
		setHdrAmt();
		setPurcTrdUnitQty(r);
	}
	public void doDtl_tax_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueForMoneyCols(getHdrR(), dtlR);
	}
	public void doDtl_purc_tax_cd_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setValueForPurcMoneyCols(getHdrR(), dtlR);
	}
	@Override
	public void doDtl_trd_unit_cd_NC(MCEventInfo info) {
		super.doDtl_trd_unit_cd_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.sls_schd_no()) && isNull(dtlR.sls_act_d_no())) {
			dtlR.trd_cur_dscnt_amt(null);
		}
	}
	@Override
	public void doDtl_purc_trd_unit_cd_NC(MCEventInfo info) {
		super.doDtl_purc_trd_unit_cd_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (isNull(dtlR.sls_schd_no()) && isNull(dtlR.sls_act_d_no())) {
			dtlR.purc_trd_cur_dscnt_amt(null);
		}
	}
	/**
	 * 数量、金額系項目に値をセットする
	 */
	protected void setValueForMoneyCols(HdrR hdr, DtlR dtl) {

		if (isNull(dtl.sls_schd_no()) || isNull(dtl.trd_unit_qty())
				|| isNull(dtl.trd_unit_cd()) || isNull(dtl.trd_cur_upri())) {
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
	
	/**
	 * 仕入側の数量、金額系項目に値をセットする
	 */
	protected void setValueForPurcMoneyCols(HdrR hdr, DtlR dtl) {

		if (!dtl.sync_flg() && isNull(dtl.sls_schd_no()) || isNull(dtl.purc_trd_unit_qty())
				|| isNull(dtl.purc_trd_unit_cd()) || isNull(dtl.purc_trd_cur_upri())) {
			return;
		}
		// 紐付NO
		int hdr_peg_no = 1;

		// ユーティリティ実行用ヘッダ
		MCList<ConvQtyAmtUtil_HdrR> utlHdrL = createUtilHdrPurc(hdr, dtl, hdr_peg_no);

		// ユーティリティ実行用明細（上段）
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = createUtilDtlPurc(hdr, dtl, hdr_peg_no);

		// 明細の金額項目計算用ユーティリティ実行
		setAmtToDtlL(utlHdrL, utlDtlL);

		// ユーティリティの計算結果を明細に反映する
		ConvQtyAmtUtil_DtlR calcR = utlDtlL.get(0);
		dtl.purc_trd_cur_upri(calcR.trd_cur_upri());
		dtl.purc_trd_cur_dscnt_amt(calcR.trd_cur_dscnt_amt());
		dtl.purc_trd_cur_amt(calcR.trd_cur_amt());
		dtl.purc_trd_cur_tax_amt(calcR.trd_cur_tax_amt());
		dtl.purc_trd_cur_inc_tax_amt(calcR.trd_cur_inc_tax_amt());
		dtl.purc_trd_unit_conv_qty(calcR.trd_unit_conv_qty());
		dtl.purc_trd_unit_conv_base_qty(calcR.trd_unit_conv_base_qty());

		// 単価・値引額・金額・税額
		dtl.purc_base_cur_upri(convToBaseCur(dtl.purc_trd_cur_upri(), dtl.purc_xrate(),
				hdr.base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
		dtl.purc_base_cur_dscnt_amt(convToBaseCur(dtl.purc_trd_cur_dscnt_amt(), dtl.purc_xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.purc_base_cur_amt(convToBaseCur(dtl.purc_trd_cur_amt(), dtl.purc_xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.purc_base_cur_tax_amt(convToBaseCur(dtl.purc_trd_cur_tax_amt(), dtl.purc_xrate(),
				hdr.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		dtl.purc_base_cur_inc_tax_amt(dtl.purc_base_cur_amt().add(dtl.purc_base_cur_tax_amt()));

		if (!isNull(hdr.ptax_cur_cd())) {
			dtl.purc_ptax_cur_upri(convCur(dtl.purc_trd_cur_upri(), dtl.purc_ptax_xrate(),
					hdr.ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			dtl.purc_ptax_cur_dscnt_amt(convCur(dtl.purc_trd_cur_dscnt_amt(), dtl.purc_ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.purc_ptax_cur_amt(convCur(dtl.purc_trd_cur_amt(), dtl.purc_ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.purc_ptax_cur_tax_amt(convCur(dtl.purc_trd_cur_tax_amt(), dtl.purc_ptax_xrate(),
					hdr.ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtl.purc_ptax_cur_inc_tax_amt(dtl.purc_ptax_cur_amt().add(dtl.purc_ptax_cur_tax_amt()));
		}
	}
	protected MCList<ConvQtyAmtUtil_HdrR> createUtilHdrPurc(HdrR hdr, DtlR dtl,
			int hdrPegNo) {
		MCList<ConvQtyAmtUtil_HdrR> l = MCList.create(ConvQtyAmtUtil_HdrR.class);
		ConvQtyAmtUtil_HdrR utlHdr = ConvQtyAmtUtil_HdrR.create();

		utlHdr.peg_no(hdrPegNo);
		utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
		utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
		utlHdr.trd_cur_cd(dtl.purc_trd_cur_cd());
		utlHdr.act_tax_rate(dtl.purc_tax_rate());
		utlHdr.act_inc_tax_flg(dtl.purc_inc_tax_flg());
		utlHdr.amt_dec_place(dtl.purc_trd_cur_amt_dec_place());
		utlHdr.upri_dec_place(dtl.purc_trd_cur_upri_dec_place());
		utlHdr.amt_rnd_typ(dtl.purc_amt_rnd_typ());
		utlHdr.tax_rnd_typ(dtl.purc_tax_rnd_typ());
		utlHdr.wtax_rnd_typ(getCo().wtax_rnd_typ());
		utlHdr.schd_base_unit_qty(dtl.purc_schd_init_qty());

		boolean useDbVal = dtl.purc_dtl_upd_flg()
				&& isSame(dtl.purc_db_trd_unit_cd(), dtl.purc_trd_unit_cd());

		if (useDbVal) {
			utlHdr.trd_unit_cd(dtl.purc_db_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.purc_db_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.purc_db_trd_cur_upri());
			if (isSame(dtl.purc_db_trd_unit_qty(), dtl.purc_trd_unit_qty())) {
				utlHdr.trd_cur_dscnt_amt(dtl.purc_db_trd_cur_dscnt_amt());
			}
			else {
				utlHdr.trd_cur_dscnt_amt(dtl.purc_init_trd_cur_dscnt_amt());
			}
			utlHdr.trd_cur_amt(dtl.purc_db_trd_cur_amt());
			utlHdr.trd_cur_tax_amt(dtl.purc_db_trd_cur_tax_amt());
			utlHdr.trd_cur_inc_tax_amt(
					dtl.purc_db_trd_cur_amt().add(dtl.purc_db_trd_cur_tax_amt()));
			utlHdr.trd_unit_conv_qty(dtl.purc_db_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.purc_db_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.purc_db_tax_rate());
			utlHdr.inc_tax_flg(dtl.purc_db_inc_tax_flg());
		}
		else {
			utlHdr.trd_unit_cd(dtl.purc_init_trd_unit_cd());
			utlHdr.trd_unit_qty(dtl.purc_init_trd_unit_qty());
			utlHdr.trd_cur_upri(dtl.purc_init_trd_cur_upri());
			utlHdr.trd_cur_dscnt_amt(dtl.purc_init_trd_cur_dscnt_amt());
			utlHdr.trd_cur_amt(dtl.purc_schd_init_ex_amt());
			utlHdr.trd_cur_tax_amt(dtl.purc_init_trd_cur_tax_amt());
			MCRow rslt = getAmtAndTax(dtl.purc_init_trd_cur_upri(), dtl.purc_init_trd_unit_qty(),
					dtl.purc_tax_rate(), dtl.purc_inc_tax_flg(), dtl.purc_trd_cur_amt_dec_place(),
					dtl.purc_amt_rnd_typ(), dtl.purc_tax_rnd_typ(),
					dtl.purc_schd_init_dscnt_amt());
			utlHdr.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
			utlHdr.base_unit_dec_place(dtl.base_unit_dec_place());
			utlHdr.base_unit_rnd_typ(dtl.base_unit_rnd_typ());
			utlHdr.trd_unit_conv_qty(dtl.purc_s_trd_unit_conv_qty());
			utlHdr.trd_unit_conv_base_qty(dtl.purc_s_trd_unit_conv_base_qty());
			utlHdr.tax_rate(dtl.purc_init_tax_rate());
			utlHdr.inc_tax_flg(dtl.purc_init_inc_tax_flg());
		}
		l.add(utlHdr);
		return l;
	}
	protected MCList<ConvQtyAmtUtil_DtlR> createUtilDtlPurc(HdrR hdr, DtlR dtl,
			int hdrPegNo) {
		MCList<ConvQtyAmtUtil_DtlR> utlDtlL = MCList.create(ConvQtyAmtUtil_DtlR.class);
		ConvQtyAmtUtil_DtlR utlDtlR = ConvQtyAmtUtil_DtlR.create();

		utlDtlR.hdr_peg_no(hdrPegNo);
		utlDtlR.trd_unit_qty(dtl.purc_trd_unit_qty());
		utlDtlR.trd_unit_cd(dtl.purc_trd_unit_cd());
		utlDtlR.trd_unit_conv_qty(dtl.purc_trd_unit_conv_qty());
		utlDtlR.trd_unit_conv_base_qty(dtl.purc_trd_unit_conv_base_qty());
		utlDtlR.trd_cur_dscnt_amt(dtl.purc_trd_cur_dscnt_amt());

		utlDtlL.add(utlDtlR);
		return utlDtlL;
	}
	
	protected void doDtl_base_unit_qty_LC(MCEventInfo info) {
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		setPurcBaseUnitQty(r);
	}
	
	protected void doIo_base_unit_qty_LC(MCEventInfo info) {
		
		int index = info.getEventIndex();
		IoR r = getIoL().get(index);
		setPurcBaseUnitQty(r);
	}
	
	@Override
	public void doDtl_bp_dlv_slip_no_LC(MCEventInfo info) {
		super.doDtl_bp_dlv_slip_no_LC(info);
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$bp_dlv_slip_no);
	}
	
	@Override
	public void doDtl_bp_dlv_slip_d_no_LC(MCEventInfo info) {
		super.doDtl_bp_dlv_slip_d_no_LC(info);
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$bp_dlv_slip_d_no);
	}
	
	@Override
	public void doDtl_ship_fr_valid_dt_LC(MCEventInfo info) {
		super.doDtl_ship_fr_valid_dt_LC(info);
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$ship_fr_valid_dt);
	}
	
	@Override
	public void doDtl_bp_lot_no_LC(MCEventInfo info) {
		super.doDtl_bp_lot_no_LC(info);
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$bp_lot_no);
	}

	protected void doDtl_cost_upri_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setCostAmt(r);
		setHdrAmt();
	}

	protected void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}
	protected void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}

	protected void doDtl_crt_lot_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$crt_lot_flg);
	}

	protected void doDtl_lot_no_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$lot_no);
	}

	protected void doDtl_sublot_no_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$sublot_no);
	}
	
	protected void doDtl_ver_no_NC(MCEventInfo info) {
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		propagate(r, DtlR.$ver_no);
	}
	
	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		setWtaxAmt(r);
	}
	@Override
	public void doHdr_dest_cd1_LC(MCEventInfo info) {
		super.doHdr_dest_cd1_LC(info);
		
		setDestCdMode();
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd1, dtlR.getGUIIndex())){
				
				dtlR.dest_cd1(getHdrR().dest_cd1());
				dtlR.dest_nm1(getHdrR().dest_nm1());
			}
		}
	}

	@Override
	public void doHdr_dest_cd2_LC(MCEventInfo info) {
		super.doHdr_dest_cd2_LC(info);
		
		setDestCdMode();
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd2, dtlR.getGUIIndex())){
				
				dtlR.dest_cd2(getHdrR().dest_cd2());
				dtlR.dest_nm2(getHdrR().dest_nm2());
			}
		}
	}

	@Override
	public void doHdr_dest_cd3_LC(MCEventInfo info) {
		super.doHdr_dest_cd3_LC(info);
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd3, dtlR.getGUIIndex())){
				
				dtlR.dest_cd3(getHdrR().dest_cd3());
				dtlR.dest_nm3(getHdrR().dest_nm3());
			}
		}
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
	 * 源泉税額の計算
	 * 
	 * @param dtlR 明細
	 */
	protected void setWtaxAmt(DtlR dtlR) {
		
		MCNumber decPlace = getHdrR().trd_cur_amt_dec_place();
		String taxRndTyp = getCo().wtax_rnd_typ();
		
		if (isNullOr(dtlR.trd_cur_amt(), dtlR.wtax_rate())) {
			dtlR.wtax_amt(null);
		}
		else {
			dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate()).divide(100,
					decPlace.intValue(), MAC_RND_TYP.toMC(taxRndTyp)));
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
		setDefaultTaxCd(index);
		setDefaultCostUpri(index);
		setColByDscntItm(r);

		if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_gd_cd, index, getDefaultFeedStkGd().gd_cd());
		}
	}

	protected void setDefaultCostUpri() {
		for (DtlR dtlR : exceptEmpty(getDtlL())) {
			if (isNull(dtlR.slo_d_no())) {
				setDefaultCostUpri(dtlR.getGUIIndex());
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

	protected void setDefaultTaxCd (int index) {
		
		if (!isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().cst_cd(), getHdrR().sls_dt(), this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
		}
	}

	protected void setDefaultCostUpri(int index) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			DtlR r = getDtlL().get(index);
			MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					getHdrR().sls_dt(), getHdrR().wg_cd(), getCo().gm_std_upri_typ());
			setValueEx(columnDtl_cost_upri, index, cost_upri);
		}
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

	protected void setProfRate(DtlR r) {
		r.prof_rate(MSUCP_SlsUtil.getProfRate(r.base_cur_amt(), r.cost_amt()));
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
			if(!dtFlg || (dtFlg && isNull(dtlR.slo_d_no()))) {
				setCstItm(dtlR);
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
			
			if (isUnschdDtlR(r)) {
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
	 * @param r 売上明細
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
			.divide(r.init_schd_qty(), getHdrR().trd_cur_upri_dec_place().intValue(), toRoundingMode(getHdrR().sls_amt_rnd_typ()))
			.multiply(r.base_unit_qty())
			.divide(r.trd_unit_qty(), getHdrR().trd_cur_upri_dec_place().intValue(), toRoundingMode(getHdrR().sls_amt_rnd_typ()));
		setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), tmpUpri);
	}
	
	/**
	 * 仕入取引通貨単価を設定する。
	 * @param r 売上明細
	 */
	protected void setPurcUpri(DtlR r) {
		
		if (!r.sync_flg() || isNull(r.purc_schd_init_amt()) || isNull(r.purc_schd_init_qty()) || isNull(r.base_unit_qty())) {
			return;
		}
		if (r.purc_schd_init_qty().isZero() || r.trd_unit_qty().isZero()) {
			setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
			return;
		}
		// 値引額が未指定の場合はゼロとみなして計算
		MCNumber purcSchdDscntAmt = MCNumber.ZERO;
		if (!isNull(r.purc_schd_init_dscnt_amt())) {
			purcSchdDscntAmt = r.purc_schd_init_dscnt_amt();
		}
		
		// 単価を割り戻して設定する
		MCNumber tmpUpri = 
			(r.purc_schd_init_amt().add(purcSchdDscntAmt))
			.divide(r.purc_schd_init_qty(), r.purc_trd_cur_upri_dec_place().intValue(), toRoundingMode(r.purc_amt_rnd_typ()))
			.multiply(r.base_unit_qty())
			.divide(r.purc_trd_unit_qty(), r.purc_trd_cur_upri_dec_place().intValue(), toRoundingMode(r.purc_amt_rnd_typ()));
		setValueEx(columnDtl_purc_trd_cur_upri, r.getGUIIndex(), tmpUpri);
	}
	
	/**
	 * 仕入単位に関連する項目を設定する。
	 * @param dtlR 明細行
	 */
	protected void setPurcTrdUnitCd(DtlR dtlR) {
		
		if (dtlR.sync_flg()) {
			
			setValueEx(columnDtl_purc_trd_unit_conv_base_qty, dtlR.getGUIIndex(), dtlR.trd_unit_conv_base_qty());
			setValueEx(columnDtl_purc_trd_unit_conv_qty, dtlR.getGUIIndex(), dtlR.trd_unit_conv_qty());
			setValueEx(columnDtl_purc_trd_unit_dec_place, dtlR.getGUIIndex(), dtlR.trd_unit_dec_place());
			setValueEx(columnDtl_purc_trd_unit_cd, dtlR.getGUIIndex(), dtlR.trd_unit_cd());
		}
	}
	
	/**
	 * 仕入取引単位数量を設定する。
	 * @param dtlR 明細行
	 */
	protected void setPurcTrdUnitQty(DtlR dtlR) {
		
		if (dtlR.sync_flg()) {
			setValueEx(columnDtl_purc_trd_unit_qty, dtlR.getGUIIndex(), dtlR.trd_unit_qty());
		}
	}
	
	/**
	 * 明細仕入基準単位数量を設定する。
	 * @param dtlR 明細行
	 */
	protected void setPurcBaseUnitQty(DtlR dtlR) {
		
		if (dtlR.sync_flg()) {
			setValueEx(columnDtl_purc_base_unit_qty, dtlR.getGUIIndex(), dtlR.base_unit_qty());
		}
	}
	
	/**
	 * 詳細基準単位数量を設定する。
	 * @param ioR 詳細行
	 */
	protected void setPurcBaseUnitQty(IoR ioR) {
		
		DtlR dtlR = getDtlL().getFirst(DtlR.$dtl_row_id, ioR.dtl_row_id());
		if (dtlR.sync_flg()) {
			setValueEx(columnIo_purc_base_unit_qty, ioR.getGUIIndex(), ioR.base_unit_qty());
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
			if (r.isEmpty() || r.isStatusDelete() || isNull(r.trd_cur_amt()) || r.sls_acxfr_flg()) {
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
			
			if (r.isStatusDelete() || r.isEmpty() || isNull(r.trd_cur_inc_tax_amt()) || !isNull(r.bd_dpt_cd())) {
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
			
			// 同時計上
			if (column == columnDtl_sync_flg) {
				if ((!isNull(r) && isNull(r.slo_d_no())) 
						|| ((isSame(getStatus(), DEL) || isSame(getStatus(), UPD)) && !r.org_sync_flg())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (isUpdStatus()) {

				// 打切
				if (column == columnDtl_abort_flg) {
					if (isUnschdDtlR(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 品目
				if (column == columnDtl_itm_cd || column == columnDtl_itm_sub1
						|| column == columnDtl_itm_sub2 || column == columnDtl_itm_sub3) {
					if (!isUnschdDtlR(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 値引品目の場合、単位/数量は変更不可
				if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 納品先
				if (column == columnDtl_dlv_cd) {
					if (!isUnschdDtlR(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 売上理由
				if (column == columnDtl_sls_rsn_cd) {
					if (!isNull(r.trd_cur_upri()) && r.trd_cur_upri().isZero()) {
						return MCMode.REQUIRED;
					}
				}

				// 負担部門
				if (column == columnDtl_bd_dpt_cd) {
					if (!r.sls_acxfr_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 業者納品書ＮＯ、業者納品書明細ＮＯ、業者ロットＮＯ
				if (column == columnDtl_bp_dlv_slip_no
						|| column == columnDtl_bp_dlv_slip_d_no
						|| column == columnDtl_bp_lot_no) {
					if (isUnschdDtlR(r) || !r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// ロット情報 （売上前にロットが確定している場合は、ロット項目は変更不可）
				if (column == columnDtl_crt_lot_flg || column == columnDtl_lot_no || column == columnDtl_sublot_no
						|| column == columnDtl_ship_fr_valid_dt || column == columnDtl_bp_lot_no) {
					if (r.arr_schd_lot_fix_flg() || r.mrkt_judg_flg() || !r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 出荷元期限
				if (column == columnDtl_ship_fr_valid_dt) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				// 納品先ＣＤ
				if (column == columnDtl_dlv_cd) {
					if (!isUnschdDtlR(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					if (!isWatxRateEditable()) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕向先ＣＤ1
				if (column == columnDtl_dest_cd1) {
					if (isNull(r.slo_d_no())) {
						return MCMode.ENABLE;
					}
				}
				
				// 仕向先ＣＤ2
				if (column == columnDtl_dest_cd2) {
					if (!isNull(r.dest_cd1()) && isNull(r.slo_d_no())) {
						return MCMode.ENABLE;
					}
				}

				// 仕向先ＣＤ3
				if (column == columnDtl_dest_cd3) {
					if (!isNull(r.dest_cd2()) && isNull(r.slo_d_no())) {
						return MCMode.ENABLE;
					}
				}
				
				// 仕入負担部門
				if (column == columnDtl_purc_bd_dpt_cd) {
					if (isUnschdDtlR(r) || !r.xpns_purc_flg() || !r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 仕入理由
				if (column == columnDtl_purc_rsn_cd) {
					if (isUnschdDtlR(r) || !r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.xpns_purc_flg()) {
						return MCMode.REQUIRED;
					}
				}
				
				if (column == columnDtl_purc_tax_cd
						|| column == columnDtl_purc_trd_cur_upri
						|| column == columnDtl_purc_trd_cur_amt
						|| column == columnDtl_purc_trd_cur_inc_tax_amt
						|| column == columnDtl_purc_interim_flg
						|| column == columnDtl_purc_trd_cur_dscnt_amt
						|| column == columnDtl_purc_dscnt_rsn_cd) {
					
					if (isUnschdDtlR(r) || !r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
					if (r.sppl_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_purc_trd_cur_upri
						|| column == columnDtl_purc_trd_cur_amt
						|| column == columnDtl_purc_trd_cur_inc_tax_amt
						|| column == columnDtl_purc_interim_flg) {
					
					if (r.subcon_flg() || r.outsrc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 仕入有効成分
				if (column == columnDtl_purc_cont_qty) {
					if (!r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 版ＮＯ
				if (column == columnDtl_ver_no) {
					if (!r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 仕入為替レート
				if (column == columnDtl_purc_xrate
						|| column == columnDtl_purc_ptax_xrate) {
					if (!r.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 納税日
				if (column == columnDtl_ptax_dt) {
					if (!r.sync_flg()) {
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
			DtlR parDtl = getParDtlR(r);
			
			if (isUpdStatus()) {
				
				// 単位・数量
				if (column == columnIo_trd_unit_cd || column == columnIo_trd_unit_qty) {
					if (parDtl.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// ロット情報
				if (column == columnIo_crt_lot_flg) {
					if (!isNull(parDtl)) {
						if (parDtl.arr_schd_lot_fix_flg() || parDtl.mrkt_judg_flg()
								|| !parDtl.sync_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (column == columnIo_lot_no || column == columnIo_sublot_no || column == columnIo_ship_fr_valid_dt || column == columnIo_bp_lot_no) {
					if (!isNull(parDtl)) {
						if (parDtl.arr_schd_lot_fix_flg() || parDtl.mrkt_judg_flg()
								|| !parDtl.sync_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 出荷元期限
				if (column == columnIo_ship_fr_valid_dt) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) || isUnschdIoR(r)) {
						return MCMode.READ_ONLY;
					}
				}

				// 仕入有効成分
				if (column == columnIo_purc_cont_qty) {
					if (!parDtl.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 版ＮＯ
				if (column == columnIo_ver_no) {
					if (!parDtl.sync_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnIo_bp_dlv_slip_no
						|| column == columnIo_bp_dlv_slip_d_no
						|| column == columnIo_bp_lot_no) {
					if (!parDtl.sync_flg() ||  isUnschdIoR(r)) {
						return MCMode.READ_ONLY;
					}
				}

			}
			return super.getPriorMode(index, column, table);
		}
	}

	// ------------------------------------- ListLogic -------------------------------------


	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_sls_rsn_cd(MCRow row, MCEventInfo info) {

		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		DtlR DtlR = getDtlL().get(index);
		
		if (!isNull(DtlR.trd_cur_upri()) && DtlR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getDtl_sls_rsn_cd(row, info);
	}
	
	/**
	 * 仕入理由のリストロジック
	 */
	@Override
	public MCList<?> getDtl_purc_rsn_cd(MCRow row, MCEventInfo info) {
		
		DtlR tgtRow = getDtlL().get(info.getEventIndex());
		if (tgtRow.xpns_purc_flg()) {
			row.setBooleanNE("xpns_purc_flg", true);
		}
		else {
			row.setBooleanNE("not_xpns_purc_flg", true);
		}
		
		return super.getDtl_purc_rsn_cd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispSlsSrchTgtTyp());
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	// ------------------------------------- Common -------------------------------------
	/**
	 * 	明細行に紐づく子の詳細リストをすべて削除する
	 * @param par
	 */
	protected void deleteAllChdIoL(DtlR par) {
		MCList<IoR> newChdL = getIoL().createInstance();
		for (IoR chd : _ioLMap.get(par.dtl_row_id())) {
			if (chd.isStatusCreate()) {
				continue;
			}
			else {
				chd.setStatus(MCRow.DELETE);
				newChdL.add(chd);
			}
		}
		_ioLMap.put(par.dtl_row_id(), newChdL);
	}

	/**
	 * 	明細行に紐づく子の詳細リストをすべて復帰(削除解除)する
	 * @param par
	 */
	protected void reviveAllChdIoL(DtlR par) {
		MCList<IoR> chdL = _ioLMap.get(par.dtl_row_id());
		for (IoR r : chdL) {
			r.setStatus(MCRow.MODIFY);
		}
	}

	protected MCList<IoR> getAllIoL() {
		MCList<IoR> ioL = getIoL().createInstance();
		for (Comparable<?> key : _ioLMap.keySet()) {
			if (!isNull(key)){
				ioL.addAll(_ioLMap.get(key));
			}
		}
		return ioL;
	}

	/**
	 * 	明細行で変更した内容を紐づく詳細行へコピーする
	 * <p>
	 * 	紐づく詳細行が2行以上の場合は何もしない<br>
	 * 	明細行の値クリア時にも展開しない
	 * </p>
	 */
	protected void propagate(DtlR parDtl, String column) {

		if (_updDtlBtnExecFlg) {
			return;
		}
		Comparable<?> val = parDtl.getValue(column);
		if (!isNull(val)) {
			MCList<IoR> chdIoL = _ioLMap.get(parDtl.dtl_row_id());
			if (isNull(chdIoL)){
				IoR newIo = addChildIoRow(parDtl);
				copyDtl2IoItmInfo(newIo, parDtl);
			}
			else {
				MCList<IoR>  chdExptIoL = exceptEmpty(chdIoL);
				if (isNull(chdExptIoL) || chdExptIoL.isEmpty()) {
					IoR newIo = addChildIoRow(parDtl);
					copyDtl2IoItmInfo(newIo, parDtl);
				}
				else if (chdExptIoL.size() == 1) {
					if (chdExptIoL.get(0).isStatusDelete()) {
						return;
					}
					if (isSame(column, DtlR.$trd_unit_qty)) {	
						if (!isSame(parDtl.trd_unit_cd(), chdExptIoL.get(0).trd_unit_cd())) {
							return;
						}
					}	
					MCColumnConfig conf = IoTable.getColumnConfigByBaseTableColumnName(column);
					
					if (isSame(column, DtlR.$trd_unit_cd)) {
						chdExptIoL.get(0).itm_cd(parDtl.itm_cd());
						chdExptIoL.get(0).itm_sub1(parDtl.itm_sub1());
						chdExptIoL.get(0).itm_sub2(parDtl.itm_sub2());
						chdExptIoL.get(0).itm_sub3(parDtl.itm_sub3());
					}
					
					setValueEx(conf, 0, val);
				}
			}
		}
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
		dest.crt_lot_flg(src.crt_lot_flg());
		dest.lot_no(src.lot_no());
		dest.sublot_no(src.sublot_no());
		dest.ver_no(src.ver_no());
		dest.ship_fr_valid_dt(src.ship_fr_valid_dt());
		dest.purc_cont_fctr(src.purc_cont_fctr());
		dest.purc_cont_qty(src.purc_cont_qty());
		dest.std_cont_qty(src.std_cont_qty());
		dest.std_cont_fctr(src.std_cont_fctr());
		dest.sno1(src.sno1());
		dest.sno2(src.sno2());
		dest.sno3(src.sno3());
		dest.sno4(src.sno4());
		dest.itm_cd(src.itm_cd());
		dest.itm_sub1(src.itm_sub1());
		dest.itm_sub2(src.itm_sub2());
		dest.itm_sub3(src.itm_sub3());
		dest.gd_cd(src.gd_cd());
		dest.gd_nm(src.gd_nm());
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
		dest.lot_no_typ(src.lot_no_typ());
		dest.sublot_no_typ(src.sublot_no_typ());
		dest.ver_flg(src.ver_flg());
		dest.cont_fctr_flg(src.cont_fctr_flg());
		dest.cont_fctr_rnd_typ(src.cont_fctr_rnd_typ());
		dest.cont_fctr_dec_place(src.cont_fctr_dec_place());
		dest.dtl_row_id(src.dtl_row_id());
	}

	/**
	 * 	詳細の数量を集計して親の明細行へ反映する
	 */
	protected void sumIoLQty2Dtl() {
		for (DtlR par : exceptDeleteAndEmpty(getDtlL())) {

			MCList<IoR> chdL = _ioLMap.get(par.dtl_row_id());

			if (isNull(chdL)) {
				continue;
			}

			if(isNull(par.trd_unit_cd()) && chdL.groupBy(IoR.$trd_unit_cd).size() == 1) {
				setValueEx(columnDtl_trd_unit_cd, par.getGUIIndex(), chdL.get(0).trd_unit_cd());
			}

			MCNumber sumBaseUnitQty = exceptDeleteAndEmpty(chdL).sum(IoR.$base_unit_qty);
			if (!isNull(par.trd_unit_cd())) {
				// 明細で設定されている取引単位数量に換算する

				// 現在の単位を基準単位に換算
				MCNumber calcQty = rvrsBaseUnitConv(sumBaseUnitQty,
						par.trd_unit_conv_base_qty(), par.trd_unit_conv_qty(),
						par.trd_unit_dec_place(), par.trd_unit_rnd_typ(), true);
				if (!isNull(calcQty)) {
					setValueEx(columnDtl_trd_unit_qty, par.getGUIIndex(), calcQty);
					continue;
				}
			}
			// 明細の単位が未入力、または詳細の合計基準単位数を取引単位に換算できない場合は、基準単位で設定
			setValueEx(columnDtl_trd_unit_cd, par.getGUIIndex(), par.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, par.getGUIIndex(), sumBaseUnitQty);

		}
		
		setValueForContCols(exceptDeleteAndViewEmpty(DtlTable));
	}
	
	/**
	 * 明細の有効成分を再計算する。
	 * @param dtlL 明細リスト
	 */
	protected void setValueForContCols(MCList<DtlR> dtlL) {
		
		for (DtlR dtlR : dtlL) {
			
			MCList<IoR> chdL = _ioLMap.get(dtlR.dtl_row_id());
			
			if (isNull(chdL)) {
				return;
			}
			
			//明細の有効成分を再計算
			dtlR.purc_cont_qty(null);
			dtlR.std_cont_qty(null);
			
			chdL.forEach(ioR ->  {
				MSUCP_PurcUtil.setCont(ioR);
				MSUCP_PurcUtil.addCont(dtlR, ioR);
			});
		}
	}

	/**
	 * 詳細行補完処理
	 * <p>明細に紐づく詳細行が1行も存在しない場合、明細行の内容から詳細行を1行作成する</p>
	 */
	protected void compIoL() {
		for (DtlR parDtlR : exceptDeleteAndEmpty(getDtlL())) {
			MCList<IoR> IoL = _ioLMap.get(parDtlR.dtl_row_id());
			if (isNull(IoL)) {
				IoL = MCList.create(IoR.class);
			}
			MCList<IoR> chdIoL = exceptEmpty(IoL);
			if (chdIoL.isEmpty()) {
				addChildIoRow(parDtlR);
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
	protected IoR addChildIoRow(DtlR parDtlR) {

		MCList<IoR> chdL = _ioLMap.get(parDtlR.dtl_row_id());
		IoR chdIoR = null;

		if (isNull(chdL) || exceptEmpty(chdL).isEmpty()) {
			// 画面の明細行が選択されている場合
			if (DtlTable.getSelectedMCRow() == parDtlR) {
				IoTable.clear();
				chdIoR = insertRow(IoTable);
			}
			// それ以外 (登録・更新処理時からの呼出を想定）
			else {
				chdIoR = getIoL().createRow();
			}

			// 明細一覧の選択行の品目情報を追加行へコピー
			copyDtl2IoItmInfo(chdIoR, parDtlR);
			chdIoR.setStatus(MCRow.CREATE);

			chdL = getIoL().createInstance();
			chdL.add(chdIoR);
			_ioLMap.put(parDtlR.dtl_row_id(), chdL);
		}

		return chdIoR;
	}

	/**
	 * 	明細行が計画外の行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isUnschdDtlR(DtlR r) {

		return isNull(r.slo_d_no());
	}

	/**
	 * 詳細行が計画外の行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isUnschdIoR(IoR r) {
		DtlR parDtl = getDtlL().getFirst(DtlR.$dtl_row_id, r.dtl_row_id());
		if (!isNull(parDtl)) {
			return isUnschdDtlR(parDtl);
		}
		else {
			// 本来ありえないはず
			return true;
		}
	}

	/**
	 * 	詳細(子)の親の明細Rowを取得する
	 * @param r
	 * @return
	 */
	protected DtlR getParDtlR(IoR r) {
		DtlR parDtl = getDtlL().getFirst(DtlR.$dtl_row_id, r.dtl_row_id());
		if (!isNull(parDtl)) {
			return parDtl;
		}
		return DtlR.create();
	}
	/**
	 * 	登録種別時の初期値設定
	 */
	protected void insInit() {

		getHdrR().base_cur_cd(getBaseCur().cur_cd());
		getHdrR().base_cur_nm(getBaseCur().cur_nm());
		getHdrR().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		getHdrR().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		Hdr_xrate_cd.setValue(getCo().sls_xrate_cd());
		Hdr_purc_xrate_cd.setValue(getCo().purc_xrate_cd());
		
		getHdrR().ptax_cur_cd(getPtaxCur().cur_cd());
		getHdrR().ptax_cur_nm(getPtaxCur().cur_nm());
		getHdrR().ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
		getHdrR().ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());

		setHdrTtermMode();
	}
	
	/**
	 * ヘッダ枠の項目に検索後の初期値をセット
	 */
	protected void setHdrPanelInitValue() {
		getHdrR().sls_dt(getToday());
		getHdrR().ac_dt(getToday());
		Hdr_dlv_dt.setValue(getToday());
		getHdrR().bill_basis_dt(getToday());
	}

	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {
		MCMessageList msgL = new MCMessageList();
		
		MCList<DtlR> chkTargetForSlsL = makeInptChkTargetListForSls();
		MCList<DtlR> chkTargetForPurcL = makeInptChkTargetListForPurc();
		
		if (!chkTargetForSlsL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.SLS.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_sls_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty,
					columnDtl_sls_qty, columnDtl_sls_schd_qty, 
					chkTargetForSlsL, columnDtl_trd_unit_qty, columnDtl_sls_schd_no));
		}
		
		if (!chkTargetForPurcL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.PURC.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_purc_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty,
					columnDtl_base_unit_purc_qty, columnDtl_base_unit_purc_schd_qty,
					chkTargetForPurcL, columnDtl_trd_unit_qty, columnDtl_purc_schd_no));
		}
		
		return msgL;
	}
	
	protected String[] getGrpColumsForSls() {
		return new String[] {
				DtlR.$sls_schd_no
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicyForSls() {
		return new MCGroupByPolicy(getGrpColumsForSls());
	}
	
	protected MCList<DtlR> makeInptChkTargetListForSls() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy slsGrpKey = getInptChkGrpPolicyForSls();
		
		MCIndexKey slsIdxKey = getDtlL().createIndex(DtlR.$sls_schd_no);
		
		MCList<DtlR> slsSchdGroup = getDtlL().groupBy(slsGrpKey);
		for (DtlR ssGrpRow : slsSchdGroup) {
			
			if (isNull(ssGrpRow.sls_schd_no())) {
				continue;
			}
			
			chkTargetL.addAll(getDtlL().subList(slsIdxKey, ssGrpRow.sls_schd_no()));
		}
		
		return chkTargetL;
	}
	
	protected String[] getGrpColumsForPurc() {
		return new String[] {
				DtlR.$purc_schd_no
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicyForPurc() {
		return new MCGroupByPolicy(getGrpColumsForPurc());
	}
	
	protected MCList<DtlR> makeInptChkTargetListForPurc() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy purcGrpKey = getInptChkGrpPolicyForPurc();
		
		MCIndexKey purcIdxKey = getDtlL().createIndex(DtlR.$sync_flg, DtlR.$purc_schd_no);
		
		MCList<DtlR> purcSchdGroupL = getDtlL().groupBy(purcGrpKey);
		for (DtlR purcSchdGroupR : purcSchdGroupL) {
			
			if (isNull(purcSchdGroupR.purc_schd_no())) {
				continue;
			}
			
			chkTargetL.addAll(getDtlL().subList(purcIdxKey, true, purcSchdGroupR.purc_schd_no()));
		}
		
		return chkTargetL;
	}
	// ------------------------------------- RowListener -------------------------------------	

	protected DtlRowListener getDtlRowListener() {
		return new DtlRowListener();
	}

	protected class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR r = (DtlR) event.getSourceRow();
				copyHdr2DtlDlvInfo(r.getGUIIndex());
				copyHdr2DtlDestInfo(r.getGUIIndex());
			}
		}

	}
	protected void setOrgAmt() {
		for (DtlR r : getDtlL()) {
			r.trd_upri_amt_p().org_trd_cur_dscnt_amt(r.init_trd_cur_dscnt_amt());
			r.trd_upri_amt_p().org_qty(r.init_trd_unit_qty());
			r.purc_trd_upri_amt_p().org_trd_cur_dscnt_amt(r.purc_init_trd_cur_dscnt_amt());
			r.purc_trd_upri_amt_p().org_qty(r.purc_init_trd_unit_qty());
		}
	}
	protected void copyAmtData() {
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
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
			r.purc_db_trd_unit_cd(r.purc_trd_unit_cd());
			r.purc_db_trd_unit_conv_qty(r.purc_trd_unit_conv_qty());
			r.purc_db_trd_unit_conv_base_qty(r.purc_trd_unit_conv_base_qty());
			r.purc_db_trd_unit_dec_place(r.purc_trd_unit_dec_place());
			r.purc_db_trd_unit_qty(r.purc_trd_unit_qty());
			r.purc_db_trd_cur_amt(r.purc_trd_cur_amt());
			r.purc_db_trd_cur_dscnt_amt(r.purc_trd_cur_dscnt_amt());
			r.purc_db_trd_cur_tax_amt(r.purc_trd_cur_tax_amt());
			r.purc_db_trd_cur_upri(r.purc_trd_cur_upri());
			r.purc_db_tax_rate(r.purc_tax_rate());
			r.purc_db_inc_tax_flg(r.purc_inc_tax_flg());
		}
	}
	protected void copyAmtDataSchd() {
		for (DtlR r :  exceptDeleteAndEmpty(getDtlL())) {
			r.purc_init_trd_unit_cd(r.purc_trd_unit_cd());
			r.purc_init_trd_unit_qty(r.purc_trd_unit_qty());
			r.purc_init_trd_cur_dscnt_amt(r.purc_trd_cur_dscnt_amt());
			r.purc_init_trd_cur_tax_amt(r.purc_trd_cur_tax_amt());
			r.purc_init_trd_cur_upri(r.purc_trd_cur_upri());
		}
	}
	/**
	 * 仕入側の基準通貨単価・基準通貨金額項目を算出する。
	 */
	protected void calcPurcBaseCur() {
		for (DtlR r : getDtlL()) {
			if (!r.sync_flg()) {
				continue;
			}
			r.purc_base_cur_upri(convToBaseCur(r.purc_trd_cur_upri(), r.purc_xrate(),
					getHdrR().base_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
			r.purc_base_cur_dscnt_amt(convToBaseCur(r.purc_trd_cur_dscnt_amt(), r.purc_xrate(),
					getHdrR().base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			r.purc_base_cur_amt(convToBaseCur(r.purc_trd_cur_amt(), r.purc_xrate(),
					getHdrR().base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			r.purc_base_cur_tax_amt(convToBaseCur(r.purc_trd_cur_tax_amt(), r.purc_xrate(),
					getHdrR().base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			r.purc_base_cur_inc_tax_amt(r.purc_base_cur_amt().add(r.purc_base_cur_tax_amt()));

			if (!isNull(getHdrR().ptax_cur_cd())) {
				r.purc_ptax_cur_upri(convCur(r.purc_trd_cur_upri(), r.purc_ptax_xrate(),
						getHdrR().ptax_cur_upri_dec_place(), getCo().xrate_rnd_typ()));
				r.purc_ptax_cur_dscnt_amt(convCur(r.purc_trd_cur_dscnt_amt(), r.purc_ptax_xrate(),
						getHdrR().ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				r.purc_ptax_cur_amt(convCur(r.purc_trd_cur_amt(), r.purc_ptax_xrate(),
						getHdrR().ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				r.purc_ptax_cur_tax_amt(convCur(r.purc_trd_cur_tax_amt(), r.purc_ptax_xrate(),
						getHdrR().ptax_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
				r.purc_ptax_cur_inc_tax_amt(r.purc_ptax_cur_amt().add(r.purc_ptax_cur_tax_amt()));
			}
		}
	}

}