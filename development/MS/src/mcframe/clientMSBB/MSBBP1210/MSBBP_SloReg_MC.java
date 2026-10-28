package mcframe.clientMSBB.MSBBP1210;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0210.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP0070.*;
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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import mcframe.clientMSUC.MSUCP0060.MSUCP_ArUtil;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUC.MAUCP1060.MAUCP_TrdUtil;

import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloAllocGrpCols;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlRqstLocCols;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloLocCols;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloLgGrpCols;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlSpplCols;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.CstSloStkGdCols;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloItmCols;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;   // 在庫選択用
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.commonMA.meta.MA_META;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SloReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SloReg_MC extends MSBBP_SloReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloReg_MC() {
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
	public MSBBP_SloReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1210_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Sprt01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
		
		/**
		 *  更新ボタンのイベントフラグ
		 */
		protected boolean _upd_btn_event_flg = false;
		
		/**
		 * エラーフラグ
		 */
		protected boolean _error_flg = false;

		protected MS_MSBBL1210_Sprt01Caller(P p, B b) {
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
			
			MCList<DtlR> srchL = MCList.create(DtlR.class);
			if (!isAprv()) {
				for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {
					if (!dtlR.abort_flg() && !dtlR.org_abort_flg() && !isTrnst(dtlR) && !dtlR.vmi_flg()) {
						srchL.add(dtlR);
					}
				}
			}
			return srchL;
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
			
			MCList<DtlR> srchL = getSrchL();
			
			//　単価取得に最低限必要な必須チェックのみ実施する
			MCIndexKey idxkey = srchL.createIndex(DtlR.$sls_upri_req_typ);
			if (srchL.contains(idxkey, MAC_SLS_UPRI_REQ_TYP.SLO_DT.value())) {
				msgList.addAll(panel.checkReq(Hdr_slo_dt));
			}
			
			msgList.addAll(panel.checkReq(Hdr_cst_cd));
			msgList.addAll(panel.checkReq(Hdr_sls_dpt_cd));
			if (!isNull(getHdrR().sls_dpt_cd())) {
				msgList.addAll(panel.checkReq(Hdr_wg_cd));
			}
			msgList.addAll(panel.checkReq(Hdr_trd_cur_cd));
			
			for (DtlR r : srchL) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd));
				msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnDtl_itm_sub1));
				msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnDtl_itm_sub2));
				msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnDtl_itm_sub3));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_cd));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_unit_qty));
				
				if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(r.sls_upri_req_typ())) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_dlv_rqst_dt));
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(r.sls_upri_req_typ())) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_sls_schd_dt));
				}
				
				if (!r.vmi_flg()) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_sls_upri_req_typ));
				}
			}
			
			if (!msgList.isEmpty()) {
				_error_flg = true;
			}
		}
		
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
				
				if (MAC_SLS_UPRI_REQ_TYP.isSLO_DT(src.sls_upri_req_typ())) {
					dest.dt(getHdrR().slo_dt());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(src.sls_upri_req_typ())) {
					dest.dt(src.dlv_rqst_dt());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(src.sls_upri_req_typ())) {
					dest.dt(src.sls_schd_dt());
				}
				dest.cst_cd(getHdrR().cst_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
				dest.wg_cd(getHdrR().wg_cd());
			}
		}
	}

	/**
	 * [MS_MSBBL1210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1210_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			DtlTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void show() {
			super.show();
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
		}
		@Override
		protected void afterCall() {
			super.afterCall();

			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
			setTdlv(bridge.down0(), bridge.down1());
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
		hdrR.dlv_cntry_cd(firstDtlR.dlv_cntry_cd());
		hdrR.dlv_cntry_nm(firstDtlR.dlv_cntry_nm());
		hdrR.tdlv_req_flg(firstDtlR.tdlv_req_flg());
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

			DtlR dlv_lg_grpR = getCopyR(dtlL, DtlR.$dlv_lg_grp_cd, DtlR.$dlv_lg_grp_nm);
			if (!isNull(dlv_lg_grpR)) {
				hdrR.dlv_lg_grp_cd(dlv_lg_grpR.dlv_lg_grp_cd());
				hdrR.dlv_lg_grp_nm(dlv_lg_grpR.dlv_lg_grp_nm());
			}
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
			hdrR.dlv_lg_grp_cd(firstDtlR.dlv_lg_grp_cd());
			hdrR.dlv_lg_grp_nm(firstDtlR.dlv_lg_grp_nm());
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
	 * 配送先関連項目設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setTdlv(HdrR hdrR, MCList<DtlR> dtlL) {
		// 配送先ＣＤ
		MCList<DtlR> tdlv_cdL = dtlL.groupBy(DtlR.$tdlv_cd);
		if (tdlv_cdL.size() != 1) {
			return;
		}

		// 配送先ＣＤ未設定の場合、後続の設定処理不要
		DtlR firstDtlR = dtlL.get(0);
		if (isNull(firstDtlR.tdlv_cd())) {
			return;
		}

		// 配送先諸口ＦＬＧにより編集可否が変更されない項目は、一律コピー
		hdrR.tdlv_cd(firstDtlR.tdlv_cd());
		hdrR.tdlv_sundry_flg(firstDtlR.tdlv_sundry_flg());
		hdrR.tdlv_cntry_cd(firstDtlR.tdlv_cntry_cd());
		hdrR.tdlv_cntry_nm(firstDtlR.tdlv_cntry_nm());

		DtlR via_dlv_typR = getCopyR(dtlL, DtlR.$via_dlv_typ, DtlR.$via_dlv_typ_nm);
		if (!isNull(via_dlv_typR)) {
			hdrR.via_dlv_typ(via_dlv_typR.via_dlv_typ());
			hdrR.via_dlv_typ_nm(via_dlv_typR.via_dlv_typ_nm());
		}

		// 配送先諸口ＦＬＧにより編集可否が変更される項目は、同一であればコピー
		if(firstDtlR.tdlv_sundry_flg()) {
			hdrR.tdlv_nm(getCopyStr(dtlL, DtlR.$tdlv_nm));

			DtlR tdlv_lg_grpR = getCopyR(dtlL, DtlR.$tdlv_lg_grp_cd, DtlR.$tdlv_lg_grp_nm);
			if (!isNull(tdlv_lg_grpR)) {
				hdrR.tdlv_lg_grp_cd(tdlv_lg_grpR.tdlv_lg_grp_cd());
				hdrR.tdlv_lg_grp_nm(tdlv_lg_grpR.tdlv_lg_grp_nm());
			}

			hdrR.tdlv_zip_cd(getCopyStr(dtlL, DtlR.$tdlv_zip_cd));

			DtlR addr1R = getCopyR(dtlL, DtlR.$tdlv_addr1);
			if (!isNull(addr1R)) {hdrR.tdlv_addr1(addr1R.tdlv_addr1());}

			DtlR addr2R = getCopyR(dtlL, DtlR.$tdlv_addr2);
			if (!isNullOr(addr1R, addr2R)) {hdrR.tdlv_addr2(addr2R.tdlv_addr2());}

			DtlR addr3R = getCopyR(dtlL, DtlR.$tdlv_addr3);
			if (!isNullOr(addr1R, addr2R, addr3R)) {hdrR.tdlv_addr3(addr3R.tdlv_addr3());}

			DtlR addr4R = getCopyR(dtlL, DtlR.$tdlv_addr4);
			if (!isNullOr(addr1R, addr2R, addr3R, addr4R)) {hdrR.tdlv_addr4(addr4R.tdlv_addr4());}

			hdrR.tdlv_tel(getCopyStr(dtlL, DtlR.$tdlv_tel));
			hdrR.tdlv_fax(getCopyStr(dtlL, DtlR.$tdlv_fax));
			hdrR.tdlv_cntct_dpt(getCopyStr(dtlL, DtlR.$tdlv_cntct_dpt));
			hdrR.tdlv_cntct_psn(getCopyStr(dtlL, DtlR.$tdlv_cntct_psn));
		}
		else {
			hdrR.tdlv_nm(firstDtlR.tdlv_nm());
			hdrR.tdlv_lg_grp_cd(firstDtlR.tdlv_lg_grp_cd());
			hdrR.tdlv_lg_grp_nm(firstDtlR.tdlv_lg_grp_nm());
			hdrR.tdlv_zip_cd(firstDtlR.tdlv_zip_cd());
			hdrR.tdlv_addr1(firstDtlR.tdlv_addr1());
			hdrR.tdlv_addr2(firstDtlR.tdlv_addr2());
			hdrR.tdlv_addr3(firstDtlR.tdlv_addr3());
			hdrR.tdlv_addr4(firstDtlR.tdlv_addr4());
			hdrR.tdlv_tel(firstDtlR.tdlv_tel());
			hdrR.tdlv_fax(firstDtlR.tdlv_fax());
			hdrR.tdlv_cntct_dpt(firstDtlR.tdlv_cntct_dpt());
			hdrR.tdlv_cntct_psn(firstDtlR.tdlv_cntct_psn());
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
	 * [MS_MSBBL1210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch02Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1210_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			
			if (bridge.down0().qtn_valid_dt().lt(getToday())) {
				if (confirm(MSBBP0006, toYMDString(bridge.down0().qtn_valid_dt())) != MCMessageBox.YES_OPTION) {
					
					clearContainers(bridge.down0(), bridge.down1());
				}
			}
			
			super.show();
			
			getHdrR().slo_dt(getToday());
			setValueEx(Hdr_slo_typ, MSC_SLO_TYP.SLO.value());
			setValueEx(Hdr_adv_ship_ctrl_typ, MSC_ADV_SHIP_CTRL_TYP.SHIP_ABL.value());
			
			for (DtlR dtlR : getDtlL()) {
				setProcTyp(dtlR);
				setShipInstTyp(dtlR);
				setNotMixFlg(dtlR);
			}
			getHdrR().srch_tgt_no(getCndR().srch_tgt_no());
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setINS_QTNStatus();
			getDtlL().setStatus(Status.CREATE);
			DtlTable.fillSpace();
			DtlTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setINSStatus();
		}
		@Override
		protected void afterCall() {
			super.afterCall();

			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
		}
	}

	/**
	 * [MS_MSBBL1210_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Ins01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
				
	 	/**
	 	 * 販売単価変更フラグ
	 	 */
		protected boolean _trd_cur_upri_chng_flg = false;
				
		protected MS_MSBBL1210_Ins01Caller(P p, B b) {
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
		protected boolean confirmForCall() {

			if (callMS_MSBBL1210_Sprt01_Before_Upd()) {
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
	 * [MS_MSBBL1210_Upd01]の定型処理のInnerClass
	 */
	 protected class MS_MSBBL1210_Upd01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Upd01Bridge> 
	 		extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
	 	/**
	 	 * 販売単価変更フラグ
	 	 */
		protected boolean _trd_cur_upri_chng_flg = false;

		protected MS_MSBBL1210_Upd01Caller(P p, B b) {
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
		protected boolean confirmForCall() {
	
			if (callMS_MSBBL1210_Sprt01_Before_Upd()) {
				return false;
			}

			boolean confirmRslt = super.confirmForCall();
			
			if (_trd_cur_upri_chng_flg && !confirmRslt) {
				
				restoreTrdCurUpri();
			}
			
			return confirmRslt;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			for (DtlR dtlR : bridge.up1()) {
				if (dtlR.isStatusDelete()) {
					MCRow.copyall(bridge.down1().get(dtlR.getParamRowIndex()), dtlR);
				}
			}
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
	protected boolean callMS_MSBBL1210_Sprt01_Before_Upd() {

		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			return false;
		}
		
		MSBBP_SloReg.MS_MSBBL1210_Sprt01Caller caller = createMS_MSBBL1210_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		
		return caller.getErrorFlg();
	}

	/**
	 * [MS_MSBBL1210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Del01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_tdlv_p_PPanel.setTdlvMode(true);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_slo_dt, Hdr_srch_tgt_no);

		Hdr_cred_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_slo_dt, true, Hdr_xrate_inpt_flg);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_xrate_cd, Hdr_slo_dt, true, Hdr_ptax_xrate_inpt_flg);
		
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_no_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Hdr_adv_bill_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_adv_rcv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_dlv_p_PPanel.setRelateBeans(Hdr_cst_cd);
		
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);

		Dtl_trd_cur_upri_amt_p_PPanel.setSchd(true);
		Dtl_trd_cur_upri_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_cst_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, 
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place, 
				Hdr_sls_amt_rnd_typ, Hdr_sls_tax_rnd_typ, Hdr_sls_upri_cng_flg, columnDtl_sls_upri_cng_flg, columnDtl_dscnt_itm_flg);

		Dtl_cost_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_cost_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_cost_upri_p_PPanel.UpriTable.setCellConfig(new MAUDP_CellConfig());

		Dtl_iv_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_iv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_xrate);
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_ptax_xrate);
		
		Dtl_sno_p_PPanel.setSnoModeCtrl(true);
		Dtl_sno_p_PPanel.setAutoManuModeCtrl(true);
		Dtl_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_sno1_mng_typ,columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ,
				columnDtl_sno1_num_typ,columnDtl_sno2_num_typ,columnDtl_sno3_num_typ,columnDtl_sno4_num_typ,
				columnDtl_slo_sno1_flg,columnDtl_slo_sno2_flg,columnDtl_slo_sno3_flg,columnDtl_slo_sno4_flg);

		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_loc_cd, columnDtl_str_ln_tgt_flg);
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_lot_mng_typ, columnDtl_sublot_mng_typ);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		
		Dtl_alloc_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_wait_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_sls_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_ret_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_re_ship_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_schd_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_sls_schd_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		
		Dtl_iv_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_iv_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);
		
		Dtl_ver_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
	}
	
	@Override
	protected void linkBeansToISPanel() {
	    super.linkBeansToISPanel();
		
		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnDtl_sppl_cd);
		linkBeansToISPanelCustom(columnDtl_maker_cd);
	    
		linkBeansToISPanel(columnDtl_set_itm_grp_no, "MS", "MSUAP1090", false);
		
		// 得意先
		linkBeansToISPanelCustom(Hdr_cst_cd, true);
		
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_slo_dt);

	}
	
	protected void linkBeansToISPanel_itm(MCListPutter listPutter) {
		listPutter.putBind(SloItmCols.$i_dt, Hdr_slo_dt);
		listPutter.putBind(SloItmCols.$i_bp_cd, Hdr_cst_cd);
		listPutter.putBind(SloItmCols.$i_bp_nm, Hdr_cst_nm);
		listPutter.putBind(SloItmCols.$i_trd_ptn_typ, Hdr_trd_ptn_typ);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_cd, Hdr_dlv_cd);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_nm, Hdr_dlv_nm);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_sundry_flg, Hdr_dlv_sundry_flg);
		listPutter.putBind(SloItmCols.$i_hdr_pri_prnt_flg, Hdr_pri_prnt_flg);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_lg_grp_cd, Hdr_dlv_lg_grp_cd);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_lg_grp_nm, Hdr_dlv_lg_grp_nm);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_cntry_cd, Hdr_dlv_cntry_cd);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_cntry_nm, Hdr_dlv_cntry_nm);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_zip_cd, Hdr_dlv_zip_cd);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_addr1, Hdr_dlv_addr1);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_addr2, Hdr_dlv_addr2);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_addr3, Hdr_dlv_addr3);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_addr4, Hdr_dlv_addr4);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_tel, Hdr_dlv_tel);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_fax, Hdr_dlv_fax);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_cntct_dpt, Hdr_dlv_cntct_dpt);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_cntct_psn, Hdr_dlv_cntct_psn);
		listPutter.putBind(SloItmCols.$i_hdr_prnt_lcl_cd, Hdr_prnt_lcl_cd);
		listPutter.putBind(SloItmCols.$i_hdr_dest_cd1, Hdr_dest_cd1);
		listPutter.putBind(SloItmCols.$i_hdr_dest_nm1, Hdr_dest_nm1);
		listPutter.putBind(SloItmCols.$i_hdr_dest_cd2, Hdr_dest_cd2);
		listPutter.putBind(SloItmCols.$i_hdr_dest_nm2, Hdr_dest_nm2);
		listPutter.putBind(SloItmCols.$i_hdr_dest_cd3, Hdr_dest_cd3);
		listPutter.putBind(SloItmCols.$i_hdr_dest_nm3, Hdr_dest_nm3);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_cd, Hdr_tdlv_cd);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_nm, Hdr_tdlv_nm);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_sundry_flg, Hdr_tdlv_sundry_flg);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_lg_grp_cd, Hdr_tdlv_lg_grp_cd);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_lg_grp_nm, Hdr_tdlv_lg_grp_nm);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_cntry_cd, Hdr_tdlv_cntry_cd);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_cntry_nm, Hdr_tdlv_cntry_nm);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_zip_cd, Hdr_tdlv_zip_cd);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_addr1, Hdr_tdlv_addr1);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_addr2, Hdr_tdlv_addr2);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_addr3, Hdr_tdlv_addr3);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_addr4, Hdr_tdlv_addr4);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_tel, Hdr_tdlv_tel);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_fax, Hdr_tdlv_fax);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_cntct_dpt, Hdr_tdlv_cntct_dpt);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_cntct_psn, Hdr_tdlv_cntct_psn);
		listPutter.putBind(SloItmCols.$i_hdr_via_dlv_typ, Hdr_via_dlv_typ);
		listPutter.putBind(SloItmCols.$i_hdr_via_dlv_typ_nm, Hdr_via_dlv_typ_nm);
		listPutter.putBind(SloItmCols.$i_hdr_tdlv_req_flg, Hdr_tdlv_req_flg);
		listPutter.putBind(SloItmCols.$i_sls_basis_typ, Hdr_sls_basis_typ);
		listPutter.putBind(SloItmCols.$i_hdr_wg_cd, Hdr_wg_cd);
		listPutter.putBind(SloItmCols.$i_trd_cur_cd, Hdr_trd_cur_cd);
		listPutter.putBind(SloItmCols.$i_base_cur_cd, Hdr_base_cur_cd);
		listPutter.putBind(SloItmCols.$i_ptax_cur_cd, Hdr_ptax_cur_cd);
		listPutter.putBind(SloItmCols.$i_cst_iv_flg, Hdr_cst_iv_flg);
		listPutter.putBind(SloItmCols.$i_cst_bill_crryovr_times, Hdr_cst_bill_crryovr_times);
		listPutter.putBind(SloItmCols.$i_hdr_sls_upri_req_typ, Hdr_sls_upri_req_typ);
		listPutter.putBind(SloItmCols.$i_hdr_ship_schd_split_typ, Hdr_ship_schd_split_typ);
		listPutter.putBind(SloItmCols.$i_assort_typ, Hdr_assort_typ);
		listPutter.putBind(SloItmCols.$i_iv_no, Hdr_iv_no);
		listPutter.putBind(SloItmCols.$i_iv_num_flg, Hdr_iv_num_flg);
		listPutter.putBind(SloItmCols.$i_hdr_ship_rqst_dt, Hdr_ship_rqst_dt);
		listPutter.putBind(SloItmCols.$i_hdr_ship_rqst_hm, Hdr_ship_rqst_hm);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_rqst_dt, Hdr_dlv_rqst_dt);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_rqst_hm, Hdr_dlv_rqst_hm);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_day_week_typ, Hdr_dlv_day_week_typ);
		listPutter.putBind(SloItmCols.$i_hdr_dlv_day_week_typ_nm, Hdr_dlv_day_week_typ_nm);
	}
	@Override
	protected void listInit() {
		super.listInit();
		
		getDtl_gd_cd_ListPutter().putBind(CstSloStkGdCols.$i_cst_cd, Hdr_cst_cd);
		
		getHdr_dlv_day_week_typ_nm_ListPutter().setColumns(
				DayWeekTypCols.$o_day_week_typ_nm, DayWeekTypCols.$o_day_week_typ);
		
	    getDtl_dlv_day_week_typ_nm_ListPutter().setColumns(
	    		DayWeekTypCols.$o_day_week_typ_nm, DayWeekTypCols.$o_day_week_typ);
	    
		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_slo_dt);
		getDtl_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_slo_dt);
		// 品目コード変更時に、以下の項目に関連して発火する以下のリストロジックを抑制する
		// これらにかかわる処理はsetDtlSomeDefaultValues()で一括で行う
		MCColumnConfig[] ignoreItmCols = {
				columnDtl_tax_cd,
				columnDtl_trd_unit_cd,
				columnDtl_cntry_org_cd,
				columnDtl_dscnt_rsn_cd,
				columnDtl_gd_cd,
				columnDtl_dlv_cd,
				columnDtl_dlv_lg_grp_cd,
				columnDtl_dest_cd1,
				columnDtl_dest_cd2,
				columnDtl_dest_cd3,
				columnDtl_tdlv_cd,
				columnDtl_tdlv_lg_grp_cd,
				columnDtl_ship_term_cd,
				columnDtl_cst_itm_cd
		};
		columnDtl_itm_cd.addIgnoreListBeans(ignoreItmCols);
		columnDtl_itm_sub1.addIgnoreListBeans(ignoreItmCols);
		columnDtl_itm_sub2.addIgnoreListBeans(ignoreItmCols);
		columnDtl_itm_sub3.addIgnoreListBeans(ignoreItmCols);
		linkBeansToISPanel_itm(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		linkBeansToISPanel_itm(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		linkBeansToISPanel_itm(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		linkBeansToISPanel_itm(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_dlv_cd.addLCListener(this);
		Hdr_dlv_nm.addLCListener(this);
		Hdr_pri_prnt_flg.addNCListener(this);
		Hdr_dlv_lg_grp_cd.addLCListener(this);
		Hdr_dlv_zip_cd.addLCListener(this);
		Hdr_dlv_addr1.addLCListener(this);
		Hdr_dlv_addr2.addLCListener(this);
		Hdr_dlv_addr3.addLCListener(this);
		Hdr_dlv_addr4.addLCListener(this);
		Hdr_dlv_tel.addLCListener(this);
		Hdr_dlv_fax.addLCListener(this);
		Hdr_dlv_cntct_dpt.addLCListener(this);
		Hdr_dlv_cntct_psn.addLCListener(this);
		
		Hdr_tdlv_cd.addLCListener(this);
		Hdr_tdlv_nm.addLCListener(this);
		Hdr_tdlv_lg_grp_cd.addLCListener(this);
		Hdr_tdlv_zip_cd.addLCListener(this);
		Hdr_tdlv_addr1.addLCListener(this);
		Hdr_tdlv_addr2.addLCListener(this);
		Hdr_tdlv_addr3.addLCListener(this);
		Hdr_tdlv_addr4.addLCListener(this);
		Hdr_tdlv_tel.addLCListener(this);
		Hdr_tdlv_fax.addLCListener(this);
		Hdr_tdlv_cntct_dpt.addLCListener(this);
		Hdr_tdlv_cntct_psn.addLCListener(this);
		
		Hdr_sls_dpt_cd.addLCListener(this);
		
		Hdr_ship_rqst_dt.addNCListener(this);
		Hdr_ship_rqst_hm.addNCListener(this);
		Hdr_dlv_rqst_dt.addNCListener(this);
		Hdr_dlv_rqst_hm.addNCListener(this);
		
		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_cost_upri.addLCListener(this);
		columnDtl_base_cur_amt.addLCListener(this);
		columnDtl_base_unit_qty.addLCListener(this);
		columnDtl_iv_upri.addLCListener(this);
		columnDtl_dlv_cd.addLCListener(this);
		columnDtl_tdlv_cd.addLCListener(this);
		columnDtl_ship_rqst_dt.addLCListener(this);
		columnDtl_dlv_rqst_dt.addLCListener(this);
		
		setListListener(DtlTable, getDtlRowListener());
	}
	
	protected DtlRowListener getDtlRowListener() {
		return new DtlRowListener();
	}

	protected class DtlRowListener implements MCRowListener, MCRowStatusListener {
		// valueChangeメソッドはLCイベント前に呼び出されるため、基準単位数などが変更前の値でコピーされてしまうので
		@Override
		@Deprecated
		public void valueChanged(MCRowEvent event) {
			
		}
		
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (getStatus() != REF
					&& isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR r = (DtlR) event.getSourceRow();
				copyHdrToDtl(r);
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
					getBindRowForISCustom(row, (MCLinkBeans) compo, info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}
	
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		
		if (beans == columnDtl_itm_cd || beans == columnDtl_itm_sub1
				|| beans == columnDtl_itm_sub2 || beans == columnDtl_itm_sub3) {
			
			setDtlItmBind(row);
		}
		if (beans == columnDtl_cst_itm_cd) {
			setDtlCstItmBind(row);
		}
		
		return row;
	}

	@Override
	public MCList<?> getHdr_cst_cd(MCRow row, MCEventInfo info) {
			
		row.setStringNE(BpCols.$i_dlv_cd, getHdrR().dlv_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.CST_BY_DLV.value());
		
		return super.getHdr_cst_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		
		setDtlItmBind(row);
		
		return super.getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info) {
		
		setDtlItmBind(row);
		
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
	}
	
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info) {
		
		setDtlItmBind(row);
		
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
	}
	
	
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info) {
		
		setDtlItmBind(row);
		
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
	}
	
	/**
	 * 見積明細のリストロジックの検索条件を設定する。
	 * @param bind バインド
	 */
	protected void setDtlItmBind(MCRow bind) {

		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			
			bind.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
		}
	}
	
	/**
	 * 得意先品目のリストロジックの検索条件を設定する。
	 * @param bind バインド
	 */
	protected void setDtlCstItmBind(MCRow bind) {
		
		bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
		bind.setDateNE(CstItmCols.$i_dt, getHdrR().slo_dt());
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			bind.setStringNE(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
		}
	}
	
	@Override
	public void openISPanel(MCLinkBeans beans, int i) {
		if (columnDtl_set_itm_grp_no == beans) {
			ISPanelLinker ret = getISPanelLinkerNE(beans);
			if (ret != null && ret.isEnable()) {
				DtlR dtlR = DtlTable.getSelectedMCRow();
				MCMessageList msgList = new MCMessageList();
				chkOpenMSUAP1090Req(msgList, i);
				
				if (!msgList.isEmpty()) {
					
					message(msgList);	
					return;
				}
				
				mcframe.clientMSUA.MSUAP1090.CndR bindR = mcframe.clientMSUA.MSUAP1090.CndR.create();
				
				bindR.main_itm_cd(dtlR.itm_cd());
				bindR.main_itm_sub1(dtlR.itm_sub1());
				bindR.main_itm_sub2(dtlR.itm_sub2());
				bindR.main_itm_sub3(dtlR.itm_sub3());
				bindR.main_itm_unit_cd(dtlR.trd_unit_cd());
				bindR.dec_place(dtlR.trd_unit_dec_place());
				bindR.main_itm_qty(dtlR.trd_unit_qty());
				bindR.base_dt(getHdrR().slo_dt());
				bindR.set_itm_grp_no(dtlR.set_itm_grp_no());
				
				openModalPanel("MS", "MSUAP1090", T1, bindR,
						columnDtl_itm_cd,
						columnDtl_itm_sub1,
						columnDtl_itm_sub2,
						columnDtl_itm_sub3,
						columnDtl_trd_unit_cd,
						columnDtl_trd_unit_qty,
						columnDtl_set_itm_grp_no);
			}
		}
		else if (columnDtl_cst_itm_cd == beans) {
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
	
	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {
		
		
		if (columnDtl_sppl_cd == putter.getLinkBeans()) {
			
			setSpplBind(bind, idx);
		}
		
		if (columnDtl_maker_cd == putter.getLinkBeans()) {
			
			setMakerBind(bind, idx);
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}
	
	/**
	 * 品揃入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1090Req(MCMessageList msgList, int i) {
		
		msgList.addAll(checkReq(Hdr_slo_dt));
		msgList.addAll(checkReqWithCellMode(i, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3));
		msgList.addAll(checkReq(i, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty));
	}
	
	/**
	 * 得意先品目入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1140Req(MCMessageList msgList) {
		
		msgList.addAll(checkReq(Hdr_cst_cd));
		msgList.addAll(checkReq(Hdr_slo_dt));
	}
	
	protected class CstItmListPutter extends MCListPutter {
		
		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}
		
		@Override
		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();
			
			MCRow setRow =  createPanelRow(compo, index, isNull(row) ? MCRow.create() :row);
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
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 初期値の設定
	 */
	protected void valueInitSub() {
		
		setValueEx(Hdr_slo_dt, getToday());
		
		setValueEx(Hdr_slo_typ, MSC_SLO_TYP.SLO.value());
		setValueEx(Hdr_assort_typ, MSC_SHIP_ASSORT_TYP.NON.value());
		setValueEx(Hdr_adv_ship_ctrl_typ, MSC_ADV_SHIP_CTRL_TYP.SHIP_ABL.value());
		
		getHdrR().base_cur_cd(getBaseCur().cur_cd());
		getHdrR().base_cur_nm(getBaseCur().cur_nm());
		getHdrR().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		getHdrR().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		
		getHdrR().ptax_cur_cd(getPtaxCur().cur_cd());
		getHdrR().ptax_cur_nm(getPtaxCur().cur_nm());
		getHdrR().ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());
		getHdrR().ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
		
		getHdrR().xrate_cd(getCo().sls_xrate_cd());
		
	}
	
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		if (T1 == openTyp) {

			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			
			valueInitSub();
			
			setValueEx(Hdr_trd_cd, MAUCP_TrdUtil.getDefaultTrdCdNoCache(MAC_TRD_PTN_TYP.SLS.value()));
			
			if (bind.contains("dlv_cd")) {
				setValueEx(Hdr_dlv_cd, bind.getStringNE("dlv_cd"));
			}
			setValueEx(Hdr_cst_cd, bind.getStringNE("cst_cd"));
			setValueEx(Hdr_wrk_no, bind.getStringNE("wrk_no"));
			
			if (bind.contains("sls_usr_cd")) {
				setValueEx(Hdr_sls_usr_cd, bind.getStringNE("sls_usr_cd"));
			}
			if (bind.contains("sls_dpt_cd")) {
				setValueEx(Hdr_sls_dpt_cd, bind.getStringNE("sls_dpt_cd"));
			}
			
			if (param != null) {
				MCList<?> list = (MCList<?>)param[0];
				for (int i=0; i<list.size(); i++) {
					if (DtlTable.getRow(i) == null) {
						insertRow(DtlTable);
					}
					MCRow row = list.get(i);
					setValueEx(columnDtl_itm_cd, i, row.getStringNE("itm_cd"));
					setValueEx(columnDtl_itm_sub1, i, row.getStringNE("itm_sub1"));
					setValueEx(columnDtl_itm_sub2, i, row.getStringNE("itm_sub2"));
					setValueEx(columnDtl_itm_sub3, i, row.getStringNE("itm_sub3"));
					setValueEx(columnDtl_trd_unit_cd, i, row.getStringNE("trd_unit_cd"));
					setValueEx(columnDtl_trd_unit_qty, i, row.getNumberNE("trd_unit_qty"));
					setValueEx(columnDtl_cst_itm_cd, i, row.getStringNE("cst_itm_cd"));
					setValueEx(columnDtl_cst_itm_nm, i, row.getStringNE("cst_itm_nm"));
				}
				DtlTable.selectLeftmostColumn(0);
			}
			DtlTable.fillSpace(); // 画面が既に開いている状態で画面遷移されたケースを考慮
			HdrPanel.focusFirstComponent();
		}
	}
	
	@Override
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		
		addListLogicCnd(row, getDispSlsSrchTgtTyp());
			
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}
	
	/**
	 * 画面種別に対応するに販売検索対象区分を返す。
	 * @return
	 */
	protected MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.QTN_NO
			};
		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLO_NO
			};
		}
	}
	
	@Override
	public MCList<?> getDtl_ship_lg_grp_cd(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.dlv_sundry_flg()) {
			row.addStringColumn(SloLgGrpCols.$i_dlv_lg_grp_cd, r.dlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloLgGrpCols.$i_dlv_cd, r.dlv_cd());
		}
		if (r.tdlv_sundry_flg()) {
			row.addStringColumn(SloLgGrpCols.$i_tdlv_lg_grp_cd, r.tdlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloLgGrpCols.$i_tdlv_cd, r.tdlv_cd());
		}
		row.addStringColumn(SloLgGrpCols.$i_sls_dpt_cd, getHdrR().sls_dpt_cd());
		row.addDateColumn(SloLgGrpCols.$i_base_dt, getHdrR().slo_dt());
		row.addStringColumn(SloLgGrpCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(SloLgGrpCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(SloLgGrpCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(SloLgGrpCols.$i_itm_sub3, r.itm_sub3());
		
		return super.getDtl_ship_lg_grp_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_alloc_grp_cd(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.dlv_sundry_flg()) {
			row.addStringColumn(SloAllocGrpCols.$i_dlv_lg_grp_cd, r.dlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloAllocGrpCols.$i_dlv_cd, r.dlv_cd());
		}
		if (r.tdlv_sundry_flg()) {
			row.addStringColumn(SloAllocGrpCols.$i_tdlv_lg_grp_cd, r.tdlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloAllocGrpCols.$i_tdlv_cd, r.tdlv_cd());
		}
		row.addStringColumn(SloAllocGrpCols.$i_sls_dpt_cd, getHdrR().sls_dpt_cd());
		row.addDateColumn(SloAllocGrpCols.$i_base_dt, getHdrR().slo_dt());
		row.addStringColumn(SloAllocGrpCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(SloAllocGrpCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(SloAllocGrpCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(SloAllocGrpCols.$i_itm_sub3, r.itm_sub3());

		return super.getDtl_alloc_grp_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_loc_cd(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.dlv_sundry_flg()) {
			row.addStringColumn(SloLocCols.$i_dlv_lg_grp_cd, r.dlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloLocCols.$i_dlv_cd, r.dlv_cd());
		}
		if (r.tdlv_sundry_flg()) {
			row.addStringColumn(SloLocCols.$i_tdlv_lg_grp_cd, r.tdlv_lg_grp_cd());
		}
		else {
			row.addStringColumn(SloLocCols.$i_tdlv_cd, r.tdlv_cd());
		}
		row.addStringColumn(SloLocCols.$i_sls_dpt_cd, getHdrR().sls_dpt_cd());
		row.addDateColumn(SloLocCols.$i_base_dt, getHdrR().slo_dt());
		row.addStringColumn(SloLocCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(SloLocCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(SloLocCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(SloLocCols.$i_itm_sub3, r.itm_sub3());
		
		return super.getDtl_loc_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_rqst_to_loc_cd(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		row.addStringColumn(ItmDtlRqstLocCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(ItmDtlRqstLocCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(ItmDtlRqstLocCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(ItmDtlRqstLocCols.$i_itm_sub3, r.itm_sub3());
		row.addStringColumn(ItmDtlRqstLocCols.$i_wg_cd, r.wg_cd());
		row.addStringColumn(ItmDtlRqstLocCols.$i_strg_loc_cd, nvl(r.loc_cd(), r.def_loc_cd()));
		row.addStringColumn(ItmDtlRqstLocCols.$i_itm_ord_typ, MSC_ITM_ORD_TYP.WG_XFR.value());
		row.addBooleanColumn(ItmDtlRqstLocCols.$i_mode_nullval_flg, false);
		
		return super.getDtl_rqst_to_loc_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_sppl_cd(MCRow row, MCEventInfo info) {
		
		setSpplBind(row, info.getEventIndex());
		return super.getDtl_sppl_cd(row, info);
	}
	
	@Override
	public MCList<MCRow> getDtl_ship_inst_typ(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
	
		MCList<MCRow> list = super.getDtl_ship_inst_typ(row, info);
		MCList<MCRow> shipInstTypList = list.createInstance();
		
		if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ()) 
				&& MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			
			for (MCRow itmR : list) {
				if (MAC_SHIP_INST_TYP.isPICK(itmR.getString(ShipInstTypCols.$o_ship_inst_typ))
						|| MAC_SHIP_INST_TYP.isNON(itmR.getString(ShipInstTypCols.$o_ship_inst_typ))) {
					shipInstTypList.add(itmR);
				}
			}
		}
		else {
			shipInstTypList.addAll(list);
		}
		
		return shipInstTypList;
	}
	
	@Override
	public MCList<MCRow> getDtl_proc_typ(MCRow row, MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
	
		MCList<MCRow> list = super.getDtl_proc_typ(row, info);
		MCList<MCRow> procTypList = list.createInstance();
		
		for (MCRow itmR : list) {
			
			if ((MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()) || r.vmi_flg() || isIvNoNotNull())
					&& MAC_SLO_PROC_TYP.isPURC_DDLV(itmR.getString(SloProcTypCols.$o_slo_proc_typ))) {
				continue;
			}
			
			if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ()) && r.slo_proc_flg()) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(itmR.getString(SloProcTypCols.$o_slo_proc_typ))) {
					procTypList.add(itmR);	
				}
			}
			else
			{
				procTypList.add(itmR);
			}
		}
		
		return procTypList;
	}
	
	/**
	 * 発注先のコンボ/入力補助のパラメータを設定する。
	 * @param row バインド
	 * @param idx index
	 */
	protected void setSpplBind(MCRow row, int idx) {
		
		DtlR r = getDtlL().get(idx);
		
		row.addStringColumn(ItmDtlSpplCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(ItmDtlSpplCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(ItmDtlSpplCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(ItmDtlSpplCols.$i_itm_sub3, r.itm_sub3());
		
		row.addStringColumn(ItmDtlSpplCols.$i_wg_cd);
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
			row.setValue(ItmDtlSpplCols.$i_wg_cd, MSUCP_SlsUtil.getMidLocWgCd(getHdrR().sls_dpt_cd(), getHdrR().slo_dt(), this));
		}
		else {
			row.setValue(ItmDtlSpplCols.$i_wg_cd, r.wg_cd());
		}
		row.addBooleanColumn(ItmDtlSpplCols.$i_inc_outsrc_flg, true);
	}
	
	@Override
	public MCList<?> getDtl_maker_cd(MCRow row, MCEventInfo info) {
		
		setMakerBind(row, info.getEventIndex());

		return super.getDtl_maker_cd(row, info);
	}
	
	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public MCList getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		
		setDtlCstItmBind(row);
		
		return super.getDtl_cst_itm_cd(row, info);
	}
	
	@Override
	public MCList getDtl_sls_rsn_cd(MCRow row, MCEventInfo info) {
		
		// 単価がゼロの場合のみ、販売他勘定ＦＬＧがオンのデータ抽出する
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		
		if (!isNull(dtlR.trd_cur_upri()) && dtlR.trd_cur_upri().isPositive()) {
			row.addBooleanColumn(SlsBizRsnCols.$i_not_sls_acxfr_flg, true);
		}
		return super.getDtl_sls_rsn_cd(row, info);
	}
	
	/**
	 * メーカのコンボ/入力補助のパラメータを設定する。
	 * @param row バインド
	 * @param i　行
	 */
	protected void setMakerBind(MCRow row, int i) {
		
		DtlR r = getDtlL().get(i);
		
		row.addStringColumn(ItmDtlMakerCols.$i_itm_cd, r.itm_cd());
		row.addStringColumn(ItmDtlMakerCols.$i_itm_sub1, r.itm_sub1());
		row.addStringColumn(ItmDtlMakerCols.$i_itm_sub2, r.itm_sub2());
		row.addStringColumn(ItmDtlMakerCols.$i_itm_sub3, r.itm_sub3());
		
		row.addStringColumn(ItmDtlMakerCols.$i_wg_cd);
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
			row.setValue(ItmDtlMakerCols.$i_wg_cd, MSUCP_SlsUtil.getMidLocWgCd(getHdrR().sls_dpt_cd(), getHdrR().slo_dt(), this));
		}
		else {
			row.setValue(ItmDtlMakerCols.$i_wg_cd, r.wg_cd());
		}
		row.addStringColumn(ItmDtlMakerCols.$i_sppl_cd, r.sppl_cd());
		row.addBooleanColumn(ItmDtlMakerCols.$i_inc_outsrc_flg, true);
	}
	
	/**
	 * 販売検索対象区分の初期値を設定する。
	 */
	protected void setDefaultSrcTgtTyp() {
		
		if (Cnd_ope_INS.isSelected()) {
			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.QTN_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.QTN_NO.name());
		}
		else {
			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLO_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLO_NO.name());
		}
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$slo_no);
			list.add(HdrR.$slo_rev);
			list.add(HdrR.$latest_flg);
			list.add(HdrR.$aprv_flg);
			list.add(HdrR.$aprv_back_flg);
			list.add(HdrR.$aprv_no);
			list.add(HdrR.$aprv_sts_typ);
			list.add(HdrR.$aprv_sts_typ_nm);
			list.add(HdrR.$aprv_upd_flg);
			list.add(HdrR.$aprv_can_flg);
			list.add(HdrR.$qtn_no);
			list.add(HdrR.$qtn_rev);
			list.add(HdrR.$etd_dt);
			list.add(HdrR.$eta_dt);
			list.add(HdrR.$via_schd_dt);
			list.add(HdrR.$iv_no);
			list.add(HdrR.$iv_num_flg);
			list.add(HdrR.$adv_rcv_amt);
			list.add(HdrR.$rcpt_dt);
			
			list.add(HdrR.$can_rsn_cd);
			list.add(HdrR.$can_rsn_nm);
			list.add(HdrR.$can_rmrks);
			list.add(HdrR.$edi_flg);
			
		}
		else if (cont == getDtlL()) {
			
			list.add(DtlR.$abort_flg);
			list.add(DtlR.$org_abort_flg);
			list.add(DtlR.$sls_sts_typ);
			list.add(DtlR.$sls_sts_typ_nm);
			list.add(DtlR.$alloc_sts_typ);
			list.add(DtlR.$alloc_sts_typ_nm);
			list.add(DtlR.$slo_d_no);
			list.add(DtlR.$ship_schd_split_flg);
			list.add(DtlR.$ship_cmpl_flg);
			list.add(DtlR.$sls_cmpl_flg);
			list.add(DtlR.$alloc_qty);
			list.add(DtlR.$wait_qty);
			list.add(DtlR.$ship_inst_qty);
			list.add(DtlR.$ship_act_qty);
			list.add(DtlR.$iv_schd_qty);
			list.add(DtlR.$iv_act_qty);
			list.add(DtlR.$sls_qty);
			list.add(DtlR.$ship_ret_qty);
			list.add(DtlR.$re_ship_schd_qty);
			list.add(DtlR.$ship_schd_abort_qty);
			list.add(DtlR.$sls_schd_abort_qty);
			list.add(DtlR.$qtn_d_no);
			list.add(DtlR.$disp_seq);
			list.add(DtlR.$ship_pr_upd_cntr);
			list.add(DtlR.$ship_pr_no);
			list.add(DtlR.$org_ship_block_flg);
			
			list.add(DtlR.$rqst_dt);
			list.add(DtlR.$rqst_dlv_rqst_dt);
			list.add(DtlR.$can_rsn_cd);
			list.add(DtlR.$can_rsn_nm);
			list.add(DtlR.$slo_d_can_rmkrs);
		
			if (NOT_INHERIT_TYPE_REF_UPD == type) {
				
				list.add(DtlR.$sno_num_flg);
				list.add(DtlR.$ship_rqst_dt);
				list.add(DtlR.$ship_rqst_hm);
				list.add(DtlR.$dlv_rqst_dt);
				list.add(DtlR.$dlv_rqst_hm);
				list.add(DtlR.$sls_schd_dt);
				list.add(DtlR.$accpt_schd_dt);
				list.add(DtlR.$ship_schd_split_flg);
				list.add(DtlR.$not_dt_calc_flg);
				list.add(DtlR.$ship_schd_dt);
				list.add(DtlR.$ship_schd_hm);
				list.add(DtlR.$dlv_schd_dt);
				list.add(DtlR.$dlv_schd_hm);
			}
		}

		return list;
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
	protected MCCellConfig createDtlCellConfig() {
		return new DtlCellConfig();
	}

	/**
	 * DtlShipSchdTable用のセルコンフィグ
	 */
	public class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = getDtlL().get(index);
			
			if (column != columnDtl_dlv_show_dtl && column != columnDtl_tdlv_show_dtl) {
				
				if (isTrnst(r)) {
					if (column == columnDtl_intr_rmrks
						|| column == columnDtl_sub_char1
						|| column == columnDtl_sub_char2
						|| column == columnDtl_sub_char3
						|| column == columnDtl_edi_sub_d_char1
						|| column == columnDtl_edi_sub_d_char2
						|| column == columnDtl_edi_sub_d_char3
						|| column == columnDtl_edi_sub_d_char4
						|| column == columnDtl_edi_sub_d_char5
						|| column == columnDtl_edi_sub_d_num1
						|| column == columnDtl_edi_sub_d_dt1) {
						return null;
					}
					if ((isSame(getStatus(), UPD) || isSame(getStatus(), UPD_TRNST))
							&& isRemAbort(r)) {
						if (column == columnDtl_abort_flg) {
							return MCMode.REQUIRED;
						}
					}
					return MCMode.READ_ONLY;
				}
				
				if (r.abort_flg() || r.org_abort_flg()) {
					if (column != columnDtl_abort_flg) {
						
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_sls_cststk_flg) {
					if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()) || r.vmi_flg()) {
					if (column == columnDtl_trd_cur_upri
							|| column == columnDtl_interim_flg
							|| column == columnDtl_upri_not_tgt_flg
							|| column == columnDtl_trd_cur_dscnt_amt
							|| column == columnDtl_dscnt_rsn_cd
							|| column == columnDtl_iv_upri
							|| column == columnDtl_cost_upri
							|| column == columnDtl_tax_fix_flg
							|| column == columnDtl_tax_cd
							|| column == columnDtl_wtax_rate
							|| column == columnDtl_bill_crryovr_times
							|| column == columnDtl_sls_schd_dt
							|| column == columnDtl_pri_prnt_flg
							|| column == columnDtl_sls_rsn_cd
							|| column == columnDtl_sls_upri_req_typ
							|| column == columnDtl_sls_cststk_flg) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (isSame(getStatus(), UPD) 
						|| isSame(getStatus(), UPD_QTN) 
						|| isSame(getStatus(), UPD_APRV)
						|| isSame(getStatus(), UPD_TRNST)
						|| isSame(getStatus(), INS) 
						|| isSame(getStatus(), INS_QTN)) {
					
					if (r.isStatusCreate() 
							|| r.isStatusModify() 
							|| r.isStatusGUICreate()
							|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
						
						if (column == columnDtl_abort_flg) {
							
							if (isNull(r.slo_d_no())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_vmi_flg) {
							if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
								return MCMode.READ_ONLY;
							}
							else if ((isSame(getStatus(), UPD) || isSame(getStatus(), UPD_TRNST))
									&& (r.isStatusCreate() || r.isStatusGUICreate())) {
								return MCMode.REQUIRED;
							}
						}
						
						if (column == columnDtl_gd_cd) {
							if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
								return MCMode.REQUIRED;
							}
							else {
								return MCMode.READ_ONLY;
							}
						}
						if (column == columnDtl_proc_typ) {
							if (!r.slo_proc_flg()) {
								return MCMode.READ_ONLY;
							}
							else if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ()) && isEditableMode(columnDtl_proc_typ)) {
								return MCMode.ENABLE;
							}
						}
						
						if (r.vmi_flg()) {
							if (column == columnDtl_trd_cur_upri
									|| column == columnDtl_trd_cur_amt
									|| column == columnDtl_cost_upri
									|| column == columnDtl_trd_cur_tax_amt
									|| column == columnDtl_trd_cur_inc_tax_amt
									|| column == columnDtl_trd_cur_dscnt_amt
									|| column == columnDtl_dscnt_rsn_cd
									|| column == columnDtl_dscnt_rsn_nm
									|| column == columnDtl_sls_cststk_flg) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (r.dscnt_itm_flg()) {
							if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty ) {
								return MCMode.READ_ONLY;
							}
						}

						
						if (column == columnDtl_via_dlv_typ) {
							if (!isCstIv()) {
								return MCMode.READ_ONLY;
							}
						}
	
						//手配区分では「仕入直送」を選択した場合、預り売上ＦＬＧをオフに設定し、入力不可にする。
						//配送先経由区分を「経由しない」で固定、入力不可にする。
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
							if (column == columnDtl_sls_cststk_flg
									|| column == columnDtl_via_dlv_typ){
								return MCMode.READ_ONLY;
							}
						}
						//配送先経由区分:「経由する」を選択した場合、配送先は必須入力項目にし、
						//「経由しない」を選択した場合、配送先は任意項目にする。
						if (!isAprv()) {
							if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
								if (column == columnDtl_tdlv_cd) {
									return MCMode.REQUIRED;
								}
							}
							else if (r.tdlv_req_flg()) {
								if (column == columnDtl_tdlv_cd) {
									return MCMode.REQUIRED;
								}
							}
						}
						
						//仕向先ＣＤ１:入力時には、仕向先ＣＤ２を入力可能にする。クリアした場合は仕向先ＣＤ２、３をクリアし入力変更不可にする。
						if (isNull(r.dest_cd1())){
							if (column == columnDtl_dest_cd2 || column == columnDtl_dest_cd3){
								return MCMode.READ_ONLY;
							}
						}
						//仕向先ＣＤ２:入力時には、仕向先ＣＤ３を入力可能にする。クリアした場合は仕向先ＣＤ３をクリアし入力変更不可にする。
						if (isNull(r.dest_cd2())){
							if (column == columnDtl_dest_cd3){
								return MCMode.READ_ONLY;
							}
						}
						//単価にゼロを入力した場合、売上理由を必須にする。
						if (isSame(r.trd_cur_upri(),0) && !isAprv()){
							if (column == columnDtl_sls_rsn_cd){
								return MCMode.REQUIRED;
							}
							//Ｉ／Ｖ単価を入力可能にする。
							if (column == columnDtl_iv_upri && isCstIv()){
								return MCMode.REQUIRED;
							}
						}
						//入力された売上理由の販売他勘定ＦＬＧがオンの場合、負担部門を入力可能かつ必須にする。
						if (r.sls_acxfr_flg() && !isAprv()){
							if (column == columnDtl_bd_dpt_cd){
								return MCMode.REQUIRED;
							}
						}
						//預り売上ＦＬＧがオンの場合、納品先は入力必須にする。
						if (r.sls_cststk_flg() && !isAprv()){
							if (column == columnDtl_dlv_cd){
								return MCMode.REQUIRED;
							}
						}
						//販売単価取得区分が「納入希望日」の場合、納入希望日は入力必須にする。
						if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(r.sls_upri_req_typ())){
							if (column == columnDtl_dlv_rqst_dt){
								return MCMode.REQUIRED;
							}
						}
						//販売単価取得区分が「売上予定日」または預り売上の場合、売上予定日は入力必須にする。
						if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(r.sls_upri_req_typ()) || r.sls_cststk_flg()){
							if (column == columnDtl_sls_schd_dt){
								return MCMode.REQUIRED;
							}
						}
						
						if (column == columnDtl_iv_itm_nm) {
							if (!isCstIv()) {
								return MCMode.INVISIBLE;
							}
							else if(!r.sundry_itm_flg()){
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_ship_schd_dt
								|| column == columnDtl_ship_schd_hm
								|| column == columnDtl_dlv_schd_dt
								|| column == columnDtl_dlv_schd_hm) {
							if (!r.not_dt_calc_flg()) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_not_dt_calc_flg) {
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ()) 
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_ship_rqst_dt || column == columnDtl_ship_rqst_hm) {
							
							if ((MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())
									|| !isNull(r.dlv_rqst_dt()))
									&& (!isCstIv() || !MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()))) {
									
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_dlv_rqst_dt || column == columnDtl_dlv_rqst_hm) {
							
							if ((MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())
									|| !isNull(r.ship_rqst_dt()))
									&& (!isCstIv() || !MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()))) {
									
								return MCMode.READ_ONLY;
							}
							else if (column == columnDtl_dlv_rqst_dt 
									&& isEditableMode(columnDtl_dlv_rqst_dt)
									&& MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
								
								return MCMode.REQUIRED;
							}
						}
						
						if (column == columnDtl_alloc_grp_cd
								|| column == columnDtl_ship_lg_grp_cd
								|| column == columnDtl_loc_cd ) {
							
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_alloc_grp_cd ) {
							
							if ((MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ()) && (!isNull(r.ship_lg_grp_cd()) || !isNull(r.loc_cd())))) {
								
								return MCMode.READ_ONLY;
							}
						}

						if (column == columnDtl_ship_lg_grp_cd ) {
							
							if ((MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ()) && (!isNull(r.alloc_grp_cd()) || !isNull(r.loc_cd())))) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_loc_cd ) {
							
							if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ()) 
									|| (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ()) && (!isNull(r.alloc_grp_cd()) || !isNull(r.ship_lg_grp_cd())))) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_alloc_scope_typ) {
							
							if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
									|| MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_alloc_typ) {
							
							if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
									|| MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) 
									|| MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_ship_schd_split_typ) {
							
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
									|| MSC_SHIP_ASSORT_TYP.isAST(getHdrR().assort_typ())
									|| !isNull(r.set_itm_grp_no())) {
								
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_rqst_to_loc_cd){
							
							if ((!MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) || isNull(r.loc_cd())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_sppl_cd) {
							
							if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									&& ((!MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) || isNull(r.loc_cd()))) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_wg_rqst_cnt_rmrks) {
							
							if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									&& !MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) {
								return MCMode.READ_ONLY;
							}
						}

						if (column == columnDtl_maker_cd) {
							if (isNull(r.sppl_cd())) {
								return MCMode.READ_ONLY;
							}
						}

						if (column == columnDtl_ship_inst_typ) {
							
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_ship_term_cd
								|| column == columnDtl_ship_block_flg
								|| column == columnDtl_ship_cnt_rmrks) {
							
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_lot_no
								|| column == columnDtl_sublot_no) {
							if (!MAC_SLO_PROC_TYP.isALLOC(r.proc_typ())
									&& !MAC_SLO_PROC_TYP.isPROC(r.proc_typ())
									&& !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) {
								return MCMode.READ_ONLY;
							}
							if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						
						if (column == columnDtl_dlv_day_week_typ_nm) {
							if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
									|| MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						if (column == columnDtl_wtax_rate) {
							if (!isWatxRateEditable()) {
								return MCMode.READ_ONLY;
							}
						}
						if (isSame(getStatus(), UPD_QTN) || isSame(getStatus(), INS_QTN)) {
							if (!isNull(r.qtn_d_no())) {
								if (column == columnDtl_itm_cd
										|| column == columnDtl_itm_sub1
										|| column == columnDtl_itm_sub2
										|| column == columnDtl_itm_sub3
										|| column == columnDtl_itm_nm
										|| column == columnDtl_iv_itm_nm
										|| column == columnDtl_trd_unit_cd) {
									return MCMode.READ_ONLY;
								}
							}
						}
						if (column == columnDtl_not_lot_mix_flg) {
							if (isNotLotMng(r.lot_mng_typ())) {
								return MCMode.READ_ONLY;
							}
							else {
								return MCMode.ENABLE;
							}
						}
						if (column == columnDtl_not_sublot_mix_flg) {
							if (isNotSubLotMng(r.sublot_mng_typ())) {
								return MCMode.READ_ONLY;
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
		
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {

			if (isSame(getStatus(),FIX_U)) {
				
				return MCMode.READ_ONLY;
			}
			
			if (columnDtl_can_rsn_cd == column ||
					columnDtl_slo_d_can_rmkrs == column) {
				
				return MCMode.ENABLE;
			}
			
			return super.getPriorDeleteMode(index, column, table);
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
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

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {

		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());

		return ret;
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
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}

	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	/**
	 * Panel[Cnd]のボタン[srch_slo]の押下時の処理
	 */
	@Override
	public void doCnd_srch_slo(MCEventInfo info) {
		callMS_MSBBL1210_Srch01();
	}

	/**
	 * Panel[Cnd]のボタン[srch_qtn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_qtn(MCEventInfo info) {
		callMS_MSBBL1210_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1230(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1230");
		aso.putCnd(crtOpenMSBBP1230CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 販売納期調整画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1230.CndR crtOpenMSBBP1230CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg p = 
				(mcframe.clientMSBB.MSBBP1230.MSBBP_SlsDlvDtAdjstReg)aso.getPanel();
		
		mcframe.clientMSBB.MSBBP1230.CndR to = mcframe.clientMSBB.MSBBP1230.CndR.create();
		to.ope(p.Cnd_ope_UPD.getActionCommand());
		to.slo_no(getHdrR().slo_no());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[sprt01]の押下時の処理
	 */
	@Override
	public void doBtn_sprt(MCEventInfo info) {
		callMS_MSBBL1210_Sprt01();
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
		
		DtlR dtlR = deleteRow(DtlTable);
		
		if (isNull(dtlR)) {
			return;
		}

		if (dtlR.getStatus() != Status.DELETE) {
			dtlR.can_rsn_cd(null);
			dtlR.can_rsn_nm(null);
			dtlR.slo_d_can_rmkrs(null);
		}
		
		setHdrAmt();
		setHdrIncTaxAmt();
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);
		if (dtlR == null) {
			return;
		}
		dtlR.rem_abort_qty(null);
		dtlR.rem_abort_flg(false);
		setBtnMode(dtlR);
		setHdrAmt();
		setHdrIncTaxAmt();
		if (!dtlR.not_dt_calc_flg()) {
			
			dtlR.ship_schd_dt(null);
			dtlR.ship_schd_hm(null);
			dtlR.dlv_schd_dt(null);
			dtlR.dlv_schd_hm(null);
		}
	}

	/**
	 * Panel[Btn]のボタン[ins01]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		
		callMS_MSBBL1210_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd01]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		
		callMS_MSBBL1210_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del01]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1210_Del01();
	}
	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);
		
		R row = list.get(0);
		
		if(isNull(row)) {
			return;
		}
			
		String bizTyp = getHdrR().getBoolean(HdrR.$edi_flg) ? MAC_BIZ_TYP.SLO_EDI.value() : MAC_BIZ_TYP.SLO.value();
		row.setStringNE(mcframe.clientMBBC.MBBCP0020.RsltR.$biz_typ, bizTyp);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		if (nc == Hdr_pri_prnt_flg) doHdr_pri_prnt_flg_NC(info);
		
		if (nc == Hdr_ship_rqst_dt) doHdr_ship_rqst_dt_NC(info);
		if (nc == Hdr_ship_rqst_hm) doHdr_ship_rqst_hm_NC(info);
		if (nc == Hdr_dlv_rqst_dt) doHdr_dlv_rqst_dt_NC(info);
		if (nc == Hdr_dlv_rqst_hm) doHdr_dlv_rqst_hm_NC(info);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_dlv_cd) doHdr_dlv_cd_LC(info);
		if (lc == Hdr_dlv_nm) doHdr_dlv_nm_LC(info);
		if (lc == Hdr_dlv_lg_grp_cd) doHdr_dlv_lg_grp_cd_LC(info);
		if (lc == Hdr_dlv_zip_cd) doHdr_dlv_zip_cd_LC(info);
		if (lc == Hdr_dlv_addr1) doHdr_dlv_addr1_LC(info);
		if (lc == Hdr_dlv_addr2) doHdr_dlv_addr2_LC(info);
		if (lc == Hdr_dlv_addr3) doHdr_dlv_addr3_LC(info);
		if (lc == Hdr_dlv_addr4) doHdr_dlv_addr4_LC(info);
		if (lc == Hdr_dlv_tel) doHdr_dlv_tel_LC(info);
		if (lc == Hdr_dlv_fax) doHdr_dlv_fax_LC(info);
		if (lc == Hdr_dlv_cntct_dpt) doHdr_dlv_cntct_dpt_LC(info);
		if (lc == Hdr_dlv_cntct_psn) doHdr_dlv_cntct_psn_LC(info);
		
		if (lc == Hdr_tdlv_cd) doHdr_tdlv_cd_LC(info);
		if (lc == Hdr_tdlv_nm) doHdr_tdlv_nm_LC(info);
		if (lc == Hdr_tdlv_lg_grp_cd) doHdr_tdlv_lg_grp_cd_LC(info);
		if (lc == Hdr_tdlv_zip_cd) doHdr_tdlv_zip_cd_LC(info);
		if (lc == Hdr_tdlv_addr1) doHdr_tdlv_addr1_LC(info);
		if (lc == Hdr_tdlv_addr2) doHdr_tdlv_addr2_LC(info);
		if (lc == Hdr_tdlv_addr3) doHdr_tdlv_addr3_LC(info);
		if (lc == Hdr_tdlv_addr4) doHdr_tdlv_addr4_LC(info);
		if (lc == Hdr_tdlv_tel) doHdr_tdlv_tel_LC(info);
		if (lc == Hdr_tdlv_fax) doHdr_tdlv_fax_LC(info);
		if (lc == Hdr_tdlv_cntct_dpt) doHdr_tdlv_cntct_dpt_LC(info);
		if (lc == Hdr_tdlv_cntct_psn) doHdr_tdlv_cntct_psn_LC(info);

		if (lc == Hdr_sls_dpt_cd) doHdr_sls_dpt_cd_LC(info);

		if (Dtl_itm_p_PPanel.isItm(lc)) doDtl_itm_LC(info);
		if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		if (lc == columnDtl_trd_cur_inc_tax_amt) doDtl_trd_cur_inc_tax_amt_LC(info);
		if (lc == columnDtl_cost_upri) doDtl_cost_upri_LC(info);
		if (lc == columnDtl_base_cur_amt) doDtl_base_cur_amt_LC(info);
		if (lc == columnDtl_base_unit_qty) doDtl_base_unit_qty_LC(info);
		if (lc == columnDtl_iv_upri) doDtl_iv_upri_LC(info);
		if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		if (lc == columnDtl_tdlv_cd) doDtl_tdlv_cd_LC(info);
		if (lc == columnDtl_ship_rqst_dt) doDtl_ship_rqst_dt_LC(info);
		if (lc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_LC(info);
		if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
	}
	
	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {

		// 見積引継は参照登録不可
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) 
				&& isSame(afOpe, Cnd_ope_INS.getActionCommand()) 
				&& isSame(bfSt, REF))) {
			
			if (!isNull(getHdrR().qtn_no())) {
				dialog(MSBBP0007);
				return false;
			}
		}
		
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}
	
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			
			getCndR().srch_tgt_no(getHdrR().slo_no());
		}
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) 
				&& isSame(afOpe, Cnd_ope_INS.getActionCommand()) 
				&& isSame(bfSt, REF))) {
			
			setRefToInsInit();
			setHdrAmt();
			setHdrIncTaxAmt();
		}
		else if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) 
				&& isSame(afOpe, Cnd_ope_UPD.getActionCommand())) {
			DtlR dtlR = DtlTable.getSelectedMCRow();
			if (dtlR != null) {
				setBtnRDelMode(dtlR);
				setBtnRCopyMode(dtlR);
			}
		}
		
		setDefaultSrcTgtTyp();
	}
	
	/**
	 * 参照登録時の処理処理を行う。
	 */
	protected void setRefToInsInit() {
		
		setValueEx(Hdr_slo_dt, getToday());
	}
	
	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);
		
		setShipDefVal();
		
		setShipMode();
		
		setDefaultArDpt();
		setDefaultSlsBasisTyp();
		setDefaultCostUpri();
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultWatxRate(dtlR.getGUIIndex());
			if(!isNull(dtlR.itm_cd())){
				setDefaultSlsUpriReqTyp(dtlR.getGUIIndex());
				setDefaultBillCrryovrTimes(dtlR.getGUIIndex());
				if (!dtlR.tax_fix_flg()) {
					setDefaultTaxCd(dtlR.getGUIIndex(), false);
				}
			}
		}
		
		setBtnSprtMode();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		
		if (getHdrR().isEmpty()) {
			
			valueInitSub();
		}
		
		setDefaultSrcTgtTyp();
		setCstIvMode();
		setXrateInptFlgMode();
		setShipMode();
		setAdvBillAmtMode();
		setDestCdMode();
		setBtnSprtMode();
		setBtnMSBEP0500Mode();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		setRevNoMode();
		setDefaultSrcTgtTyp();
		setCstIvMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		setRevNoMode();
		setCstIvMode();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		setCstIvMode();
		setAprvBackFlgMode();
		setBtnDelMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		if (isAprv()) {
			setUPD_APRVStatus();
		}
		else if (!isNull(getHdrR().qtn_no())) {
			setUPD_QTNStatus();
		}
		
		if (hasTrnst()) {
			// ヘッダの制御のみ
			setUPD_TRNSTStatus();
		}
		
		setCstIvMode();
		setXrateInptFlgMode();
		setShipMode();
		setAdvBillAmtMode();
		setAprvBackFlgMode();
		setDestCdMode();

		setBtnSprtMode();
		setBtnMSBEP0500Mode();
	}
	
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		
		setCstIvMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		
		setCstIvMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		
		setCstIvMode();
	}
	
	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();
		
		setCstIvMode();
		setXrateInptFlgMode();
		setShipMode();
		setAdvBillAmtMode();
		setAprvBackFlgMode();
		setDestCdMode();
		setBtnSprtMode();
	}
	
	@Override
	public void setUPD_QTNStatus() {
		super.setUPD_QTNStatus();
		
		setCstIvMode();
		setXrateInptFlgMode();
		setShipMode();
		setAdvBillAmtMode();
		setAprvBackFlgMode();
		setDestCdMode();
		setBtnSprtMode();
	}
	
	@Override
	public void setINS_QTNStatus() {
		super.setINS_QTNStatus();
		
		setCstIvMode();
		setXrateInptFlgMode();
		setShipMode();
		setAdvBillAmtMode();
		setDestCdMode();
		setBtnSprtMode();
	}
	
	@Override
	protected void opePanelFillSpace() {
		
		if (!isAprv()) {	
			super.opePanelFillSpace();
		}
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		
		setCredBal();
		
		getHdrR().xrate_inpt_flg(false);
		getHdrR().ptax_xrate_inpt_flg(false);
		setXrateInptFlgMode();
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex());
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
	public void doHdr_slo_dt_LC(MCEventInfo info) {
		super.doHdr_slo_dt_LC(info);
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex());
			
			if (isNullAnd(dtlR.sls_schd_dt(), dtlR.ship_rqst_dt(),
					dtlR.dlv_rqst_dt()) && !dtlR.tax_fix_flg()) {
				setDefaultTaxCd(dtlR.getGUIIndex(), false);
			}
		}
		setCstItm(true);
		setDefaultCostUpri();
	}
	
	protected void doHdr_dlv_cd_LC(MCEventInfo info) {
		
		if (!isNull(getHdrR().dlv_cd())){
			
			if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
				
				getHdrR().pri_prnt_flg(false);
			}
		}
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dlv_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_cd(), getHdrR().dlv_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_cd(getHdrR().dlv_cd());
				dtlR.dlv_nm(getHdrR().dlv_nm());
				dtlR.dlv_sundry_flg(getHdrR().dlv_sundry_flg());
				dtlR.pri_prnt_flg(getHdrR().pri_prnt_flg());
				dtlR.dlv_zip_cd(getHdrR().dlv_zip_cd());
				dtlR.dlv_addr1(getHdrR().dlv_addr1());
				dtlR.dlv_addr2(getHdrR().dlv_addr2());
				dtlR.dlv_addr3(getHdrR().dlv_addr3());
				dtlR.dlv_addr4(getHdrR().dlv_addr4());
				dtlR.dlv_cntry_cd(getHdrR().dlv_cntry_cd());
				dtlR.dlv_cntry_nm(getHdrR().dlv_cntry_nm());
				dtlR.dlv_tel(getHdrR().dlv_tel());
				dtlR.dlv_fax(getHdrR().dlv_fax());
				dtlR.dlv_cntct_dpt(getHdrR().dlv_cntct_dpt());
				dtlR.dlv_cntct_psn(getHdrR().dlv_cntct_psn());
				dtlR.dlv_lg_grp_cd(getHdrR().dlv_lg_grp_cd());
				dtlR.dlv_lg_grp_nm(getHdrR().dlv_lg_grp_nm());
				dtlR.tdlv_req_flg(getHdrR().tdlv_req_flg());
				dtlR.prnt_lcl_cd(getHdrR().prnt_lcl_cd());
			}
		}
		
		if (!isSame(getHdrR().def_cst_cd(),getHdrR().cst_cd())) {
			setCstCd();
		}
	}
	
	protected boolean isEditableStatus() {
		if (isSame(getStatus(), UPD) || isSame(getStatus(), UPD_QTN) || isSame(getStatus(), INS) || isSame(getStatus(), INS_QTN)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void doHdr_def_cst_cd_NC(MCEventInfo info) {
		super.doHdr_def_cst_cd_NC(info);
		
		setCstCd();
	}
	
	protected void setCstCd() {
		if(!isNull(getHdrR().qtn_no())) {
			return;
		}
		// 「検索結果がありません」メッセージを回避するために、入力補助画面の処理を実装させない。
		linkBeansToISPanelCustom(Hdr_cst_cd, false);
		Hdr_cst_cd.setValue(getHdrR().def_cst_cd());
		linkBeansToISPanelCustom(Hdr_cst_cd, true);
	}
	
	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		//得意先ＣＤが入力・変更された場合,
		super.doHdr_cst_cd_LC(info);
		
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			setValueEx(Hdr_trd_cur_cd, null);
			setValueEx(Hdr_ar_dpt_cd, null);
		}
		setDefaultSlsBasisTyp();
		
		// 売上部門、債権部門の設定
		// 画面で表示されている値を変更時一旦クリアする
		setValueEx(Hdr_sls_usr_cd, null);
		setValueEx(Hdr_sls_dpt_cd, null);
		setValueEx(Hdr_ar_dpt_cd, null);
		// 売上部門の設定
		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}
		// 債権部門の設定
		setDefaultArDpt();
		
		//得意先のインボイス対象取引がオフの場合は、配送先を入力しても、全明細の配送先経由区分を「経由しない」で固定する。
		if (!getHdrR().cst_iv_flg()) {
			for (DtlR r : exceptEmpty(getDtlL())) {
				if (r.abort_flg() || r.org_abort_flg()|| r.isStatusDelete()) {
					continue;
				}
				if (r.isStatusCreate() || r.isStatusModify()
						|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
					setValueEx(columnDtl_via_dlv_typ, r.getGUIIndex(), MAC_VIA_DLV_TYP.NOT_VIA.value());
				}
			}
		}
		
		for (DtlR r : exceptEmpty(getDtlL())) {
			if (r.isStatusCreate() || r.isStatusModify()
					|| (r.isStatusNone() && !isNull(r.itm_cd()))) {

				int index = r.getGUIIndex();
				
				setDefaultSlsUpriReqTyp(index);
				setDefaultBillCrryovrTimes(index);
				setDefaultShipSchdSplitTyp(index);
				setDefaultTaxCd(index, true);
				setDefaultNotMixFlg(index, r);
			}

			if (!getHdrR().cst_iv_flg()) {
				// 得意先のインボイス対象取引がオフの場合は、Ｉ／Ｖ単価をクリアする。
				setValueEx(columnDtl_iv_upri, r.getGUIIndex(), null);
			}
			else if (!isSame(r.trd_cur_upri(), 0)) {
				// 得意先のインボイス対象取引がオンかつ単価が0以外の場合、Ｉ／Ｖ単価に取引通貨単価を設定する。
				setValueEx(columnDtl_iv_upri, r.getGUIIndex(), r.trd_cur_upri());
			}
		}
		
		setCstItm(false);
		
		setCstIvMode();
		
		if (!isCstIv()) {
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {	
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
				setValueEx(columnDtl_cntry_org_cd, dtlR.getGUIIndex(), null);
				setValueEx(columnDtl_cntry_org_nm, dtlR.getGUIIndex(), null);
			}
		}
		
		setAdvBillAmtMode();
		
		setCredBal();
	}
	
	@Override
	public void doHdr_aprv_back_flg_NC(MCEventInfo info) {
		super.doHdr_aprv_back_flg_NC(info);
		
		if (Cnd_ope_UPD.isSelected()) {
			
			if (!isNull(getHdrR().qtn_no())) {
				setUPD_QTNStatus();
			}
			else {
				setUPDStatus();
				opePanelFillSpace();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
	}
	
	/**
	 * 承認引戻しの表示モードを設定する。
	 */
	protected void setAprvBackFlgMode() {
		
		if (isAprv() && ((Cnd_ope_UPD.isSelected() && !hasAprvNextOper() && getHdrR().aprv_upd_flg())
						|| (Cnd_ope_DEL.isSelected() && !hasTrnst() && getHdrR().aprv_can_flg()))) {
			
			Hdr_aprv_back_flg.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_aprv_back_flg);
		}
	}
	
	@Override
	public void doHdr_iv_no_NC(MCEventInfo info) {
		super.doHdr_iv_no_NC(info);
		
		setIvAssortTyp();
	}
	
	@Override
	public void doHdr_iv_num_flg_NC(MCEventInfo info) {
		super.doHdr_iv_num_flg_NC(info);
		
		setIvAssortTyp();
		
		setHdrIvNo();
	}
	
	/**
	 * インボイスＮＯのモードを設定する。
	 */
	protected void setHdrIvNo() {

		if (getHdrR().iv_num_flg()) {
			
			setValueEx(Hdr_iv_no, null);
			
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {
			
			setDefaultMode(Hdr_iv_no);
		}
	}
	
	/**
	 * インボイスＮＯが入力されている場合は、品揃区分を品揃とする。
	 */
	protected void setIvAssortTyp() {

		if (isIvNoNotNull()) {
			
			setValueEx(Hdr_assort_typ, MSC_SHIP_ASSORT_TYP.AST.value());
			
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				
				if (!dtlR.abort_flg() && !dtlR.org_abort_flg() && !isTrnst(dtlR)) {
					
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
						
						setValueEx(columnDtl_proc_typ, dtlR.getGUIIndex(), null);
					}
				}
			}
		}
		
		setIvAssortTypMode();
	}
	
	@Override
	public void doDtl_sls_schd_dt_LC(MCEventInfo info) {
		super.doDtl_sls_schd_dt_LC(info);
		
		if (!getDtlL().get(info.getEventIndex()).tax_fix_flg()) {
			setDefaultTaxCd(info.getEventIndex(), false);
		}
	}
	
	protected void doDtl_ship_rqst_dt_LC(MCEventInfo info) {
		
		if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())) {
			if (!getDtlL().get(info.getEventIndex()).tax_fix_flg()) {
				setDefaultTaxCd(info.getEventIndex(), false);
			}
		}
	}
	
	protected void doDtl_dlv_rqst_dt_LC(MCEventInfo info) {
		
		if (MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ())
				|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ())) {
			if (!getDtlL().get(info.getEventIndex()).tax_fix_flg()) {
				setDefaultTaxCd(info.getEventIndex(), false);
			}
		}
	}
	
	protected void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())){
			// 売上部門を債権部門に設定できないケースがあるため、setValueExを使わない
			Hdr_ar_dpt_cd.setValue(getHdrR().sls_dpt_cd());
		}
		setDefaultCostUpri();
	}
	
	protected void doHdr_dlv_nm_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_nm, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_nm(), getHdrR().dlv_nm())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_nm(getHdrR().dlv_nm());
			}
		}
	}
	
	protected void doHdr_dlv_cntct_dpt_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_cntct_dpt, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_cntct_dpt(), getHdrR().dlv_cntct_dpt())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_cntct_dpt(getHdrR().dlv_cntct_dpt());
			}
		}
	}

	protected void doHdr_dlv_cntct_psn_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_cntct_psn, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_cntct_psn(), getHdrR().dlv_cntct_psn())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_cntct_psn(getHdrR().dlv_cntct_psn());
			}
		}
	}

	protected void doHdr_dlv_zip_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_zip_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_zip_cd(), getHdrR().dlv_zip_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_zip_cd(getHdrR().dlv_zip_cd());
			}
		}
	}

	protected void doHdr_dlv_addr1_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr1, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_addr1(), getHdrR().dlv_addr1())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_addr1(getHdrR().dlv_addr1());
			}
		}
	}
	
	protected void doHdr_dlv_addr2_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr2, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_addr2(), getHdrR().dlv_addr2())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_addr2(getHdrR().dlv_addr2());
			}
		}
	}

	protected void doHdr_dlv_addr3_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr3, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_addr3(), getHdrR().dlv_addr3())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_addr3(getHdrR().dlv_addr3());
			}
		}
	}

	protected void doHdr_dlv_addr4_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_addr4, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_addr4(), getHdrR().dlv_addr4())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_addr4(getHdrR().dlv_addr4());
			}
		}
	}
	
	protected void doHdr_dlv_tel_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_tel, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_tel(), getHdrR().dlv_tel())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_tel(getHdrR().dlv_tel());
			}
		}
	}

	protected void doHdr_dlv_fax_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_fax, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_fax(), getHdrR().dlv_fax())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_fax(getHdrR().dlv_fax());
			}
		}
	}

	protected void doHdr_dlv_lg_grp_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_dlv_lg_grp_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_lg_grp_cd(), getHdrR().dlv_lg_grp_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_lg_grp_cd(getHdrR().dlv_lg_grp_cd());
				dtlR.dlv_lg_grp_nm(getHdrR().dlv_lg_grp_nm());
			}
		}
	}

	protected void doHdr_pri_prnt_flg_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_pri_prnt_flg, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.pri_prnt_flg(), getHdrR().pri_prnt_flg())) {
					dtlR.setStatus(Status.MODIFY);
				}
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
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dest_cd1(), getHdrR().dest_cd1())) {
					dtlR.setStatus(Status.MODIFY);
				}
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
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dest_cd2(), getHdrR().dest_cd2())) {
					dtlR.setStatus(Status.MODIFY);
				}
				setValueEx(columnDtl_dest_cd2, dtlR.getGUIIndex(), getHdrR().dest_cd2());
			}
		}
	}

	@Override
	public void doHdr_dest_cd3_LC(MCEventInfo info) {
		super.doHdr_dest_cd3_LC(info);

		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dest_cd3, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dest_cd3(), getHdrR().dest_cd3())) {
					dtlR.setStatus(Status.MODIFY);
				}
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

	@Override
	public void doHdr_via_dlv_typ_LC(MCEventInfo info) {
		super.doHdr_via_dlv_typ_LC(info);
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_via_dlv_typ, dtlR.getGUIIndex())){
				
				setViaDlvTyp(dtlR, getHdrR().via_dlv_typ(), getHdrR().via_dlv_typ_nm());
			}
		}
	}

	protected void doHdr_tdlv_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_tdlv_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_cd(), getHdrR().tdlv_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_cd(getHdrR().tdlv_cd());
				dtlR.tdlv_nm(getHdrR().tdlv_nm());
				dtlR.tdlv_sundry_flg(getHdrR().tdlv_sundry_flg());
				dtlR.pri_prnt_flg(getHdrR().pri_prnt_flg());
				dtlR.tdlv_zip_cd(getHdrR().tdlv_zip_cd());
				dtlR.tdlv_addr1(getHdrR().tdlv_addr1());
				dtlR.tdlv_addr2(getHdrR().tdlv_addr2());
				dtlR.tdlv_addr3(getHdrR().tdlv_addr3());
				dtlR.tdlv_addr4(getHdrR().tdlv_addr4());
				dtlR.tdlv_cntry_cd(getHdrR().tdlv_cntry_cd());
				dtlR.tdlv_cntry_nm(getHdrR().tdlv_cntry_nm());
				dtlR.tdlv_tel(getHdrR().tdlv_tel());
				dtlR.tdlv_fax(getHdrR().tdlv_fax());
				dtlR.tdlv_cntct_dpt(getHdrR().tdlv_cntct_dpt());
				dtlR.tdlv_cntct_psn(getHdrR().tdlv_cntct_psn());
				dtlR.tdlv_lg_grp_cd(getHdrR().tdlv_lg_grp_cd());
				dtlR.tdlv_lg_grp_nm(getHdrR().tdlv_lg_grp_nm());
				
				setViaDlvTyp(dtlR, getHdrR().via_dlv_typ(), getHdrR().via_dlv_typ_nm());
			}
		}
	}

	protected void doHdr_tdlv_nm_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_nm, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_nm(), getHdrR().tdlv_nm())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_nm(getHdrR().tdlv_nm());
			}
		}
	}

	protected void doHdr_tdlv_cntct_dpt_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_cntct_dpt, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_cntct_dpt(), getHdrR().tdlv_cntct_dpt())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_cntct_dpt(getHdrR().tdlv_cntct_dpt());
			}
		}
	}

	protected void doHdr_tdlv_cntct_psn_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_cntct_psn, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_cntct_psn(), getHdrR().tdlv_cntct_psn())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_cntct_psn(getHdrR().tdlv_cntct_psn());
			}
		}
	}
	
	protected void doHdr_tdlv_zip_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_zip_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_zip_cd(), getHdrR().tdlv_zip_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_zip_cd(getHdrR().tdlv_zip_cd());
			}
		}
	}

	protected void doHdr_tdlv_addr1_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_addr1, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_addr1(), getHdrR().tdlv_addr1())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_addr1(getHdrR().tdlv_addr1());
			}
		}
	}

	protected void doHdr_tdlv_addr2_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_addr2, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_addr2(), getHdrR().tdlv_addr2())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_addr2(getHdrR().tdlv_addr2());
			}
		}
	}

	protected void doHdr_tdlv_addr3_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_addr3, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_addr3(), getHdrR().tdlv_addr3())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_addr3(getHdrR().tdlv_addr3());
			}
		}
	}

	protected void doHdr_tdlv_addr4_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_addr4, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_addr4(), getHdrR().tdlv_addr4())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_addr4(getHdrR().tdlv_addr4());
			}
		}
	}
	
	protected void doHdr_tdlv_tel_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_tel, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_tel(), getHdrR().tdlv_tel())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_tel(getHdrR().tdlv_tel());
			}
		}
	}

	protected void doHdr_tdlv_fax_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_fax, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_fax(), getHdrR().tdlv_fax())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_fax(getHdrR().tdlv_fax());
			}
		}
	}
	
	protected void doHdr_tdlv_lg_grp_cd_LC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().tdlv_cd(), dtlR.tdlv_cd()) && isEditable(columnDtl_tdlv_lg_grp_cd, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.tdlv_lg_grp_cd(), getHdrR().tdlv_lg_grp_cd())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.tdlv_lg_grp_cd(getHdrR().tdlv_lg_grp_cd());
				dtlR.tdlv_lg_grp_nm(getHdrR().tdlv_lg_grp_nm());
			}
		}
	}

	@Override
	public void doHdr_dlv_day_week_typ_nm_LC(MCEventInfo info) {
		super.doHdr_dlv_day_week_typ_nm_LC(info);
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dlv_day_week_typ_nm, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_day_week_typ(), getHdrR().dlv_day_week_typ())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_day_week_typ(getHdrR().dlv_day_week_typ());
				dtlR.dlv_day_week_typ_nm(getHdrR().dlv_day_week_typ_nm());
			}
		}
	}

	protected void doHdr_ship_rqst_dt_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_ship_rqst_dt, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.ship_rqst_dt(), getHdrR().ship_rqst_dt())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.ship_rqst_dt(getHdrR().ship_rqst_dt());
				if (isNull(getHdrR().ship_rqst_dt())) {
					dtlR.ship_rqst_hm(null);
				}
			}
		}
	}

	protected void doHdr_ship_rqst_hm_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_ship_rqst_hm, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() 
						&& (!isNull(dtlR.ship_rqst_hm()) && !dtlR.ship_rqst_hm().eqTime(getHdrR().ship_rqst_hm()) 
								|| (!isNull(getHdrR().ship_rqst_hm()) && !getHdrR().ship_rqst_hm().eqTime(dtlR.ship_rqst_hm())))) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.ship_rqst_hm(getHdrR().ship_rqst_hm());
			}
		}
	}

	protected void doHdr_dlv_rqst_dt_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dlv_rqst_dt, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() && !isSame(dtlR.dlv_rqst_dt(), getHdrR().dlv_rqst_dt())) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_rqst_dt(getHdrR().dlv_rqst_dt());
				if (isNull(getHdrR().dlv_rqst_dt())) {
					dtlR.dlv_rqst_hm(null);
				}

			}
		}
	}

	protected void doHdr_dlv_rqst_hm_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isEditable(columnDtl_dlv_rqst_hm, dtlR.getGUIIndex())){
				
				if (dtlR.isStatusNone() 
						&& (!isNull(dtlR.dlv_rqst_hm()) && !dtlR.dlv_rqst_hm().eqTime(getHdrR().dlv_rqst_hm()) 
								|| (!isNull(getHdrR().dlv_rqst_hm()) && !getHdrR().dlv_rqst_hm().eqTime(dtlR.dlv_rqst_hm())))) {
					dtlR.setStatus(Status.MODIFY);
				}
				dtlR.dlv_rqst_hm(getHdrR().dlv_rqst_hm());
			}
		}
	}
	
	@Override
	public void doHdr_adv_ship_ctrl_typ_LC (MCEventInfo info) {
		super.doHdr_adv_ship_ctrl_typ_LC(info);
		
		getHdrR().adv_bill_amt(null);
		getHdrR().adv_rcv_amt(null);
		setAdvBillAmtMode();
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR dtlR = getDtlL().get(index);
		setBtnMode(dtlR);
	}
	
	/**
	 * 明細ごとのボタンの押下制御を行う
	 * 
	 * @param dtlR
	 */
	protected void setBtnMode(DtlR dtlR) {
		setBtnRDelMode(dtlR);
		setBtnRCopyMode(dtlR);
		setBtnMSBEP0500Mode(dtlR);
	}
	
	protected void doDtl_itm_LC(MCEventInfo info) {
	
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			setBtnMSBEP0500Mode();
		}

		if (isNull(dtlR.itm_cd())) {
			
			clearRowExcept(dtlR, DtlR.$slo_d_no, DtlR.$disp_seq, DtlR.$ship_pr_no, DtlR.$ship_pr_upd_cntr, DtlR.$vmi_flg);
			
			return;
		}
		
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {
		
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().slo_dt(), this);
		if (isNull(row)) {
			row = MCRow.create();
			row.addStringColumn("bp_itm_cd");
		}
		row.addStringColumn("itm_cd", dtlR.itm_cd());
		row.addStringColumn("itm_sub1", dtlR.itm_sub1());
		row.addStringColumn("itm_sub2", dtlR.itm_sub2());
		row.addStringColumn("itm_sub3", dtlR.itm_sub3());
		columnDtl_cst_itm_cd.setValues(dtlR.getGUIIndex(), row);
	}
	
	/**
	 * 手配区分を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setProcTyp(DtlR dtlR) {
		
		String procTyp = null;
		
		if (!isIvNoNotNull() || !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.def_proc_typ())) {
			procTyp = dtlR.def_proc_typ();
		}
		
		if (!dtlR.slo_proc_flg()) {
			if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
				
				procTyp = MAC_SLO_PROC_TYP.ALLOC.value();
			}
			else if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
				
				procTyp =  null;
			}
		}
		
		columnDtl_proc_typ.setValue(dtlR.getGUIIndex(), procTyp);
	}
	
	/**
	 * 引当区分を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setAllocTyp(DtlR dtlR) {
		
		if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
			
			setValueEx(columnDtl_alloc_scope_typ, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_alloc_typ, dtlR.getGUIIndex(), null);
		}
	}
	
	/**
	 * 指図区分を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setShipInstTyp(DtlR dtlR) {
		
		setValueEx(columnDtl_ship_inst_typ, dtlR.getGUIIndex(), dtlR.def_ship_inst_typ());
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm(boolean dtFlg) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			if (!dtlR.abort_flg() && !dtlR.org_abort_flg() && !isTrnst(dtlR)) {
				if(!dtFlg || (dtFlg && isNull(dtlR.qtn_d_no()))) {
					setCstItm(dtlR);
				}
			}
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
	 * 受注明細納品先のＬＣイベント。
	 * @param info MCEventInfo
	 */
	protected void doDtl_dlv_cd_LC(MCEventInfo info) {
		
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			
			setValueEx(columnDtl_pri_prnt_flg, info.getEventIndex(), false);
		}
	}
	
	@Override
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info) {
		super.doDtl_prnt_lcl_cd_NC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setIvItmNm(dtlR);
	}
	
	/**
	 * インボイス表記品名を設定する。
	 * @param dtlR　受注明細
	 */
	protected void setIvItmNm(DtlR dtlR) {
		
		if (!isCstIv()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(dtlR.prnt_lcl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			} else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), nvl(row.getStringNE("itm_nm"), dtlR.itm_nm()));
			}
		}
	}
	
	/**
	 * インボイス取引用項目の表示モードを設定する。
	 */
	protected void setCstIvMode() {
		
		if (!isCstIv()) {
			
			Hdr_trnspt_cd.setMode(MCMode.READ_ONLY);
			Hdr_vssl_flght.setMode(MCMode.READ_ONLY);
			Hdr_load_port_cd.setMode(MCMode.READ_ONLY);
			Hdr_etd_dt.setMode(MCMode.READ_ONLY);
			Hdr_dschrg_port_cd.setMode(MCMode.READ_ONLY);
			Hdr_eta_dt.setMode(MCMode.READ_ONLY);
			Hdr_via_port_cd.setMode(MCMode.READ_ONLY);
			Hdr_via_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_iv_num_flg.setMode(MCMode.READ_ONLY);

			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);
			columnDtl_iv_upri.setVisible(false);
			columnDtl_iv_amt.setVisible(false);
			
			clearCstIv();
		}
		else {
			
			setDefaultMode(Hdr_trnspt_cd);
			setDefaultMode(Hdr_vssl_flght);
			setDefaultMode(Hdr_load_port_cd);
			setDefaultMode(Hdr_etd_dt);
			setDefaultMode(Hdr_dschrg_port_cd);
			setDefaultMode(Hdr_eta_dt);
			setDefaultMode(Hdr_via_port_cd);
			setDefaultMode(Hdr_via_schd_dt);
			setDefaultMode(Hdr_iv_num_flg);
			
			if (getHdrR().iv_num_flg()) {
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_iv_no);
			}
			
			setDefaultMode(columnDtl_iv_itm_nm);
			setDefaultMode(columnDtl_cntry_org_cd);
			setDefaultMode(columnDtl_cntry_org_nm);
			setDefaultMode(columnDtl_iv_upri);
			setDefaultMode(columnDtl_iv_amt);
		}
		
		setIvAssortTypMode();
	}
	
	/**
	 * インボイス取引に関連する項目をクリアする。
	 */
	protected void clearCstIv() {

		setValueEx(Hdr_trnspt_cd, null);
		setValueEx(Hdr_vssl_flght, null);
		setValueEx(Hdr_load_port_cd, null);
		setValueEx(Hdr_etd_dt, null);
		setValueEx(Hdr_dschrg_port_cd, null);
		setValueEx(Hdr_eta_dt, null);
		setValueEx(Hdr_via_port_cd, null);
		setValueEx(Hdr_via_schd_dt, null);
		setValueEx(Hdr_iv_no, null);
		setValueEx(Hdr_iv_num_flg, false);
	}
	
	/**
	 * 品揃区分のモードを設定する。<br>
	 * インボイスＮＯが入力されている場合、入力不可
	 */
	protected void setIvAssortTypMode() {

		if (isIvNoNotNull()) {
			Hdr_assort_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_assort_typ);
		}
	}
	
	/**
	 * 為替レート指定ＦＬＧ、納税為替レート指定ＦＬＧのモードを設定する
	 */
	protected void setXrateInptFlgMode() {
		
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
	
	/**
	 * 前受金請求額のモードを設定する
	 */
	protected void setAdvBillAmtMode() {
		
		if (!isAprv()) {
		
			if (!MSC_ADV_SHIP_CTRL_TYP.isSHIP_STOP(getHdrR().adv_ship_ctrl_typ())) {
				Hdr_adv_bill_amt_p_PPanel.setREAD_ONLYStatus();
			}
			else {
				Hdr_adv_bill_amt_p_PPanel.setREQUIREDStatus();
			}
		}
	}
	
	/**
	 * 出荷取引の入力制御を行う。
	 */
	protected void setShipMode() {

		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			
			Hdr_pri_prnt_flg.setMode(MCMode.READ_ONLY);
			Hdr_sls_basis_typ.setMode(MCMode.READ_ONLY);
			Hdr_trd_cur_cd.setMode(MCMode.READ_ONLY);
			setXrateInptFlgMode();
			setAdvBillAmtMode();
			Hdr_ar_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_pri_prnt_flg);
			setDefaultMode(Hdr_sls_basis_typ);
			setDefaultMode(Hdr_trd_cur_cd);
			setXrateInptFlgMode();
			setAdvBillAmtMode();
			setDefaultMode(Hdr_ar_dpt_cd);
		}
	}
	
	/**
	 * 出荷取引の初期値を設定する。
	 */
	protected void setShipDefVal() {

		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			
			Hdr_pri_prnt_flg.setValue(false);
			Hdr_sls_basis_typ.setValue(null);
			Hdr_trd_cur_cd.setValue(null);
			Hdr_xrate_inpt_flg.setValue(false);
			Hdr_xrate.setValue(null);
			Hdr_ptax_xrate_inpt_flg.setValue(false);
			Hdr_ptax_xrate.setValue(null);
			Hdr_adv_ship_ctrl_typ.setValue(null);
			Hdr_adv_bill_amt.setValue(null);
			Hdr_ar_dpt_cd.setValue(null);
			
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				
				setShipDtlDefVal(dtlR);
			}
		}
		else {
			exceptDeleteAndEmpty(getDtlL()).setBoolean(DtlR.$vmi_flg, false);
		}
	}
	
	/**
	 * 出荷取引の明細の初期値を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setShipDtlDefVal(DtlR dtlR) {
		
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()) || dtlR.vmi_flg()) {
			
			setValueEx(columnDtl_vmi_flg, dtlR.getGUIIndex(), true);
			setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_interim_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_upri_not_tgt_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_trd_cur_dscnt_amt, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_dscnt_rsn_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_iv_upri, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_cost_upri, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_prof_rate, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_tax_fix_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_wtax_rate, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_bill_crryovr_times, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_sls_schd_dt, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_pri_prnt_flg, dtlR.getGUIIndex(), false);
			setValueEx(columnDtl_sls_rsn_cd, dtlR.getGUIIndex(), null);
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
				setValueEx(columnDtl_proc_typ, dtlR.getGUIIndex(), null);
			}
			setValueEx(columnDtl_sls_upri_req_typ, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_sls_cststk_flg, dtlR.getGUIIndex(), false);
		}
	}
	
	/**
	 * 単価再取得ボタンのモードを設定する。
	 */
	protected void setBtnSprtMode() {

		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()) || isAprv()) {
			
			Btn_sprt.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(Btn_sprt);
		}
	}
	
	/**
	 * 行削除ボタンのモードを設定する。
	 * @param dtlR 受注明細
	 */
	protected void setBtnRDelMode(DtlR dtlR) {

		if (isAprv() || dtlR.abort_flg() || dtlR.org_abort_flg() || isTrnst(dtlR)) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
	}
	/**
	 * 行コピーボタンのモードを設定する。
	 * @param dtlR 受注明細
	 */
	protected void setBtnRCopyMode(DtlR dtlR) {
		if (!isNull(dtlR.qtn_d_no())) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	
	/**
	 * 在庫情報選択画面のモードを設定する。
	 */
	protected void setBtnMSBEP0500Mode() {
		
		setBtnMSBEP0500Mode(DtlTable.getSelectedMCRow());
	}
	
	/**
	 * 在庫情報選択画面のモードを設定する。
	 * @param dtlR 受注明細
	 */
	protected void setBtnMSBEP0500Mode(DtlR dtlR) {

		if (!isNull(dtlR) 
				&& !dtlR.isEmpty()
				&& (dtlR.abort_flg() 
						|| dtlR.org_abort_flg() 
						|| dtlR.isStatusDelete() 
						|| MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ()))
						|| !isEditable(columnDtl_loc_cd, DtlTable.getEventInfo().getEventIndex())) {
			
			Btn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
		}
	}
	
	/**
	 * 取消ボタンのモードを設定する。
	 */
	protected void setBtnDelMode() {

		if (hasAbort() || hasTrnst() || isAprv()) {
			Btn_del.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_del);
		}
	}
	
	/**
	 * インボイス取引得意先かどうか。
	 * @return インボイス取引先の場合はture
	 */
	protected boolean isCstIv() {
		
		return getHdrR().cst_iv_flg();
	}
	
	/**
	 * インボイスＮＯが入力されているかどうか。
	 * @return 入力されている場合はtrue
	 */
	protected boolean isIvNoNotNull() {

		return !isNull(getHdrR().iv_no()) || getHdrR().iv_num_flg();
	}
	
	protected void copyHdrToDtl(DtlR r) {
		HdrR h = getHdrR();
		if (MAC_TRD_PTN_TYP.isSHIP(h.trd_ptn_typ())){
			r.vmi_flg(true);
			r.trd_cur_upri(null);
			r.trd_cur_amt(null);
			r.cost_upri(null);
			r.cost_amt(null);
			r.trd_cur_tax_amt(null);
			r.trd_cur_inc_tax_amt(null);
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
			r.sls_cststk_flg(false);
		}
		if (isEditable(columnDtl_dlv_cd, r.getGUIIndex()) && isNull(r.dlv_cd())) {
			r.dlv_cd(h.dlv_cd()); //納品先ＣＤ
			r.dlv_nm(h.dlv_nm()); //納品先名
			r.dlv_sundry_flg(h.dlv_sundry_flg()); //納品先諸口
			r.pri_prnt_flg(h.pri_prnt_flg()); //価格印字ＦＬＧ
			r.dlv_lg_grp_cd(h.dlv_lg_grp_cd()); //納品先物流ＧＣＤ
			r.dlv_lg_grp_nm(h.dlv_lg_grp_nm()); //納品先物流Ｇ名
			r.dlv_cntry_cd(h.dlv_cntry_cd()); //納品先国
			r.dlv_cntry_nm(h.dlv_cntry_nm()); //納品先国名
			r.dlv_zip_cd(h.dlv_zip_cd()); //納品先郵便番号
			r.dlv_addr1(h.dlv_addr1()); //納品先住所1
			r.dlv_addr2(h.dlv_addr2()); //納品先住所2
			r.dlv_addr3(h.dlv_addr3()); //納品先住所3
			r.dlv_addr4(h.dlv_addr4()); //納品先住所4
			r.dlv_tel(h.dlv_tel()); //納品先ＴＥＬ
			r.dlv_fax(h.dlv_fax()); //納品先ＦＡＸ
			r.dlv_cntct_dpt(h.dlv_cntct_dpt()); //納品先部署
			r.dlv_cntct_psn(h.dlv_cntct_psn()); //納品先担当者
			r.tdlv_req_flg(h.tdlv_req_flg());
			r.prnt_lcl_cd(h.prnt_lcl_cd());
		}
		if (isEditable(columnDtl_dest_cd1, r.getGUIIndex()) && isNull(r.dest_cd1())) {
			r.dest_cd1(h.dest_cd1()); //仕向先ＣＤ１
			r.dest_nm1(h.dest_nm1()); //仕向先名１
		}
		if (isEditable(columnDtl_dest_cd2, r.getGUIIndex())) {
			r.dest_cd2(h.dest_cd2()); //仕向先ＣＤ２
			r.dest_nm2(h.dest_nm2()); //仕向先名２
		}
		if (isEditable(columnDtl_dest_cd3, r.getGUIIndex())) {
			r.dest_cd3(h.dest_cd3()); //仕向先ＣＤ３
			r.dest_nm3(h.dest_nm3()); //仕向先名３
		}
		setViaDlvTyp(r, h.via_dlv_typ(), h.via_dlv_typ_nm());
		if (isEditable(columnDtl_tdlv_cd, r.getGUIIndex()) && isNull(r.tdlv_cd())) {
			r.tdlv_cd(h.tdlv_cd()); //配送先ＣＤ
			r.tdlv_sundry_flg(h.tdlv_sundry_flg()); //配送先諸口ＦＬＧ
			r.tdlv_nm(h.tdlv_nm()); //配送先名
			r.tdlv_cntct_dpt(h.tdlv_cntct_dpt()); //配送先部署
			r.tdlv_cntct_psn(h.tdlv_cntct_psn()); //配送先担当者
			r.tdlv_zip_cd(h.tdlv_zip_cd()); //配送先郵便番号
			r.tdlv_addr1(h.tdlv_addr1()); //配送先住所1
			r.tdlv_addr2(h.tdlv_addr2()); //配送先住所2
			r.tdlv_addr3(h.tdlv_addr3()); //配送先住所3
			r.tdlv_addr4(h.tdlv_addr4()); //配送先住所4
			r.tdlv_tel(h.tdlv_tel()); //配送先ＴＥＬ
			r.tdlv_fax(h.tdlv_fax()); //配送先ＦＡＸ
			r.tdlv_cntry_cd(h.tdlv_cntry_cd()); //納品先国
			r.tdlv_cntry_nm(h.tdlv_cntry_nm()); //納品先国名
			r.tdlv_lg_grp_cd(h.tdlv_lg_grp_cd()); //配送先物流ＧＣＤ
			r.tdlv_lg_grp_nm(h.tdlv_lg_grp_nm()); //配送先物流Ｇ名
		}
		if (isEditable(columnDtl_dlv_day_week_typ_nm, r.getGUIIndex()) && isNull(r.dlv_day_week_typ_nm())) {
			r.dlv_day_week_typ(h.dlv_day_week_typ()); //曜日区分
			r.dlv_day_week_typ_nm(h.dlv_day_week_typ_nm()); //曜日区分名
		}
		
		if (isEditable(columnDtl_dlv_rqst_dt, r.getGUIIndex()) && isNull(r.dlv_rqst_dt())) {
			r.dlv_rqst_dt(getHdrR().dlv_rqst_dt());
			r.dlv_rqst_hm(getHdrR().dlv_rqst_hm());
		}
		
		if (isEditable(columnDtl_ship_rqst_dt, r.getGUIIndex()) && isNull(r.ship_rqst_dt())) {
			r.ship_rqst_dt(getHdrR().ship_rqst_dt());
			r.ship_rqst_hm(getHdrR().ship_rqst_hm());
		}
		
		if (!isNull(h.cst_cd())) {
			r.not_lg_mix_flg(h.hdr_not_lg_mix_flg());
			if (isNotLotMng(r.lot_mng_typ())) {
				r.not_lot_mix_flg(false);
			}
			else {
				r.not_lot_mix_flg(h.hdr_not_lot_mix_flg());
			}
			if (isNotSubLotMng(r.sublot_mng_typ())) {
				r.not_sublot_mix_flg(false);
			}
			else {
				r.not_sublot_mix_flg(h.hdr_not_sublot_mix_flg());
			}
		}
	}
	
	/**
	 * 得意先のインボイス対象取引がオフの場合は、配送先を入力しても、全明細の配送先経由区分を「経由しない」で固定する。
	 * 手配区分が仕入直送の場合も同様。
	 * @param dtlR 受注明細
	 * @param viaDlvtyp 配送先経由区分
	 * @param viaDlvtypNm 配送先経由区分名
	 */
	protected void setViaDlvTyp(DtlR dtlR, String viaDlvtyp, String viaDlvtypNm) {
		
		if (!getHdrR().cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
			dtlR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
			MAC_VIA_DLV_TYP.putNameNE(dtlR, DtlR.$via_dlv_typ, DtlR.$via_dlv_typ_nm);
		}
		else {
			if (dtlR.isStatusNone() && !isSame(dtlR.via_dlv_typ(), viaDlvtyp)) {
				dtlR.setStatus(Status.MODIFY);
			}
			dtlR.via_dlv_typ(viaDlvtyp);
			dtlR.via_dlv_typ_nm(viaDlvtypNm);
		}
	}
	
	protected void setDefaultArDpt() {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && MAC_AR_DPT_TYP.isAR(getHdrR().ar_dpt_typ())){
			setValueEx(Hdr_ar_dpt_cd, getHdrR().lnk_ar_dpt_cd());
		}
	}

	protected void setDefaultSlsBasisTyp() {
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			setValueEx(Hdr_sls_basis_typ, null);
		}
		else if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			// 取引先マスタに設定されていない場合、会社マスタの値を使用する。
			if (!isNull(getHdrR().cst_cd())) {
				setValueEx(Hdr_sls_basis_typ, nvl(getHdrR().bp_sls_basis_typ(), getCo().sls_basis_typ()));
			}
		}
	}
	
	protected void setDefaultCostUpri() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (isNull(dtlR.qtn_d_no())) {
				setDefaultCostUpri(dtlR.getGUIIndex());
			}
		}
	}

	protected void setDefaultSlsUpriReqTyp (int index) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			setValueEx(columnDtl_sls_upri_req_typ, index, nvl(getHdrR().sls_upri_req_typ(), getCo().sls_upri_req_typ()));
		}
	}
	
	protected void setDefaultBillCrryovrTimes (int index) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			setValueEx(columnDtl_bill_crryovr_times, index, nvl(r.itm_bill_crryovr_times(), getHdrR().cst_bill_crryovr_times()));
		}
	}
	
	protected void setDefaultShipSchdSplitTyp(int index) {
		if (!isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				if (isIvNoNotNull() 
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
						|| MSC_SHIP_ASSORT_TYP.isAST(getHdrR().assort_typ())
						|| !isNull(r.set_itm_grp_no())) {
						setValueEx(columnDtl_ship_schd_split_typ, index, MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
					} 
				else {
					setValueEx(columnDtl_ship_schd_split_typ, index, nvl(getHdrR().ship_schd_split_typ(), getCo().ship_schd_split_typ()));
				}
			}
			else if  (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
				setValueEx(columnDtl_ship_schd_split_typ, index, MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
			}
		}
	}
	
	/**
	 * 消費税の初期値を設定する。
	 * @param index 受注明細インデックス
	 * @param setTaxFixFlg 税指定ＦＬＧ設定フラグ
	 */
	protected void setDefaultTaxCd (int index, boolean setTaxFixFlg) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ()) && !isNull(getHdrR().cst_cd())) {
			
			DtlR r = getDtlL().get(index);
			if (r.vmi_flg()) {
				return;
			}
			
			MCDate baseDt = null;
			
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getHdrR().sls_basis_typ())) {
				baseDt = nvl(r.sls_schd_dt(), nvl(r.ship_rqst_dt(), getHdrR().slo_dt()));
			}
			else if(MAC_SLS_BASIS_TYP.isIN_BASIS(getHdrR().sls_basis_typ())
					|| MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getHdrR().sls_basis_typ())) {
				baseDt = nvl(r.sls_schd_dt(), nvl(r.dlv_rqst_dt(), getHdrR().slo_dt()));
			}
			
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().cst_cd(), baseDt, this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
		}
	}
	
	protected void setDefaultCostUpri(int index) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			DtlR r = getDtlL().get(index);
			MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), getHdrR().slo_dt(), getHdrR().wg_cd(), getCo().gm_std_upri_typ());
			setValueEx(columnDtl_cost_upri, index, cost_upri);
		}
	}
	
	/**
	 * 源泉税率の初期値を設定する。
	 * @param index インデックス
	 */
	protected void setDefaultWatxRate(int index) {
		
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())
				&& isWatxRateEditable()
				&& Dtl_itm_p_PPanel.isItmFixLight(index)
				&& !isNull(getHdrR().slo_dt())) {
			
			DtlR r = getDtlL().get(index);
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().slo_dt(),
					this);
			setValueEx(columnDtl_wtax_rate, index, wtaxRate);
		}
		else {
			setValueEx(columnDtl_wtax_rate, index, null);
		}
	}

	protected void setDefaultNotMixFlg(int index, DtlR r) {
		if (isNull(getHdrR().cst_cd())) {
			setValueEx(columnDtl_not_lg_mix_flg, index, false);
			setValueEx(columnDtl_not_lot_mix_flg, index, false);
			setValueEx(columnDtl_not_sublot_mix_flg, index, false);
		}
		else {
			setValueEx(columnDtl_not_lg_mix_flg, index, getHdrR().hdr_not_lg_mix_flg());
			if (isNotLotMng(r.lot_mng_typ())) {
				setValueEx(columnDtl_not_lot_mix_flg, index, false);
			}
			else {
				setValueEx(columnDtl_not_lot_mix_flg, index, getHdrR().hdr_not_lot_mix_flg());
			}
			if (isNotSubLotMng(r.sublot_mng_typ())) {
				setValueEx(columnDtl_not_sublot_mix_flg, index, false);
			}
			else {
				setValueEx(columnDtl_not_sublot_mix_flg, index, getHdrR().hdr_not_sublot_mix_flg());
			}
		}
	}

	protected void setNotMixFlg(DtlR dtlR) {
		if (!isNull(getHdrR().cst_cd())) {
			setValueEx(columnDtl_not_lg_mix_flg, dtlR.getGUIIndex(), getHdrR().hdr_not_lg_mix_flg());
			if (isNotLotMng(dtlR.lot_mng_typ())) {
				setValueEx(columnDtl_not_lot_mix_flg, dtlR.getGUIIndex(), false);
			}
			else {
				setValueEx(columnDtl_not_lot_mix_flg, dtlR.getGUIIndex(), getHdrR().hdr_not_lot_mix_flg());
			}
			if (isNotSubLotMng(dtlR.sublot_mng_typ())) {
				setValueEx(columnDtl_not_sublot_mix_flg, dtlR.getGUIIndex(), false);
			}
			else {
				setValueEx(columnDtl_not_sublot_mix_flg, dtlR.getGUIIndex(), getHdrR().hdr_not_sublot_mix_flg());
			}
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
	 * 格付の初期値を設定する。
	 * @param index インデックス
	 */
	protected void setDefaultGdCd(int index) {
		
		DtlR r = getDtlL().get(index);
		
		if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			columnDtl_gd_cd.setValue(index, getDefaultFeedStkGd().gd_cd());
		}
		else {
			columnDtl_gd_cd.setValue(index, null);
		}
	}

	protected void doDtl_trd_unit_qty_LC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setDscntAmt(r);

	}
	
//	protected void doDtl_trd_cur_upri_LC(MCEventInfo info){
//		DtlR r = getDtlL().get(info.getEventIndex());
//		if (isNull(r.trd_cur_upri())){
//			setValueEx(columnDtl_iv_upri, info.getEventIndex(), null);
//			setValueEx(columnDtl_sls_rsn_cd, info.getEventIndex(), null);
//		}
//		else {
//			if (!isSame(r.trd_cur_upri(), 0)){
//				if (isCstIv()) {
//					setValueEx(columnDtl_iv_upri, info.getEventIndex(), r.trd_cur_upri());
//				}
//				if (r.sls_acxfr_flg()) {
//					setValueEx(columnDtl_sls_rsn_cd, info.getEventIndex(), null);
//				}
//			}
//		}
//
//	}
	
	protected void doDtl_iv_upri_LC(MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		setIvAmt(r);
	}

//	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
//		DtlR r = getDtlL().get(info.getEventIndex());
//		setIvAmt(r);
//		setWtaxAmt(r);
//		setHdrAmt();
//
//	}
	
	protected void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}
	protected void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}
	
	protected void doDtl_base_cur_amt_LC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setProfRate(r);
		setHdrAmt();
	}
	
	protected void doDtl_base_unit_qty_LC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setCostAmt(r);
		
		//　画面実装仕様の項目順でイベントが実行されるため、基準単位のイベントが基準通貨金額の後に実行される。
		// そのため、原価金額を再計算後に、ヘッダの金額や粗利率も再計算する。
		setHdrAmt();
	}

	
	protected void doDtl_cost_upri_LC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setCostAmt(r);
		setHdrAmt();
	}
	
	protected void setCostAmt(DtlR r) {
		
		MCNumber cost_amt = null;
		if (!isNullOr(r.cost_upri(), r.base_unit_qty())) {
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place());
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
	 * 源泉税額の計算
	 * 
	 * @param dtlR
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
	
	/**
	 * インボイス金額の計算
	 * 
	 * @param dtlR
	 */
	protected void setIvAmt(DtlR dtlR) {
		
		MCNumber decPlace = getHdrR().trd_cur_amt_dec_place();
		String rndTyp = getHdrR().sls_amt_rnd_typ();
		
		if (isSame(dtlR.trd_cur_upri(), dtlR.iv_upri())) {
			dtlR.iv_amt(dtlR.trd_cur_amt());
		}
		else {
			MCNumber ivAmt = getAmt(dtlR.iv_upri(), dtlR.trd_unit_qty(), decPlace, rndTyp);
			dtlR.iv_amt(ivAmt);
		}
	}

	@Override
	public void doDtl_wtax_rate_NC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setWtaxAmt(r);
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
	
	@Override
	public void doDtl_vmi_flg_NC(MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.vmi_flg()){
			setShipDtlDefVal(r);
		}
	}
	
	@Override
	public void doDtl_proc_typ_NC(MCEventInfo info) {
		//手配区分では「仕入直送」を選択した場合、預り売上ＦＬＧをオフに設定し、入力不可にする。
		//配送先経由区分を「経由しない」で固定、入力不可にする。
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())) {
			
			setValueEx(columnDtl_sls_cststk_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_via_dlv_typ, info.getEventIndex(), MAC_VIA_DLV_TYP.NOT_VIA.value());
			setValueEx(columnDtl_ship_rqst_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_rqst_hm, info.getEventIndex(), null);
			
			setValueEx(columnDtl_not_dt_calc_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_ship_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_schd_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_hm, info.getEventIndex(), null);
			
			setValueEx(columnDtl_alloc_scope_typ, info.getEventIndex(), null);
			setValueEx(columnDtl_alloc_typ, info.getEventIndex(), null);
			setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_lg_grp_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_loc_cd, info.getEventIndex(), null);
			
			setValueEx(columnDtl_ship_term_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_block_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_ship_cnt_rmrks, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_day_week_typ_nm, info.getEventIndex(), null);
			
			setValueEx(columnDtl_ship_schd_split_typ, info.getEventIndex(), MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
			setValueEx(columnDtl_ship_inst_typ, info.getEventIndex(), MAC_SHIP_INST_TYP.NON.value());
		}
		
		if (MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) 
				|| MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) {
			
			setValueEx(columnDtl_alloc_typ, info.getEventIndex(), MAC_ALLOC_TYP.IMMED.value());
		}
		
		if ((!MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) || isNull(r.loc_cd())) {
			setValueEx(columnDtl_rqst_to_loc_cd, info.getEventIndex(), null);
		}
		
		if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
				&& ((!MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) || isNull(r.loc_cd()))) {
			
			setValueEx(columnDtl_sppl_cd, info.getEventIndex(), null);
		}
		
		if (!MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
				&& !MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) && !MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) {
			
			setValueEx(columnDtl_wg_rqst_cnt_rmrks, info.getEventIndex(), null);
		}
		
		if (!MAC_SLO_PROC_TYP.isALLOC(r.proc_typ())) {
			
			setValueEx(columnDtl_lot_no, info.getEventIndex(), null);
			setValueEx(columnDtl_sublot_no, info.getEventIndex(), null);
		}

		setBtnMSBEP0500Mode();

	}
	
	@Override
	public void doDtl_ship_inst_typ_NC(MCEventInfo info) {
		super.doDtl_ship_inst_typ_NC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
		
			setValueEx(columnDtl_ship_rqst_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_rqst_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_rqst_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_rqst_hm, info.getEventIndex(), null);
			
			setValueEx(columnDtl_alloc_scope_typ, info.getEventIndex(), null);
			setValueEx(columnDtl_alloc_typ, info.getEventIndex(), null);
			setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_lg_grp_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_loc_cd, info.getEventIndex(), null);
			
			setValueEx(columnDtl_ship_term_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_block_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_ship_cnt_rmrks, info.getEventIndex(), null);
			
			setValueEx(columnDtl_not_dt_calc_flg, info.getEventIndex(), false);
			setValueEx(columnDtl_ship_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_schd_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_sls_cststk_flg, info.getEventIndex(), false);
		}
	}
	
	@Override
	public void doDtl_set_itm_grp_no_LC(MCEventInfo info) {
		super.doDtl_set_itm_grp_no_LC(info);
		
        DtlR r = getDtlL().get(info.getEventIndex());
		
		if (!isNull(r.set_itm_grp_no())) {
			setValueEx(columnDtl_ship_schd_split_typ, info.getEventIndex(), MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
		}
	}
	
	@Override
	public void doDtl_not_dt_calc_flg_NC(MCEventInfo info) {
		super.doDtl_not_dt_calc_flg_NC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (!r.not_dt_calc_flg()){
			
			setValueEx(columnDtl_ship_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_ship_schd_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_dlv_schd_hm, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_abort_flg_NC(MCEventInfo info) {
		super.doDtl_abort_flg_NC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());

		setHdrAmt();
		setHdrIncTaxAmt();
		
		setBtnRDelMode(dtlR);
		
		setBtnMSBEP0500Mode(dtlR);
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
	 * 明細の配送先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_tdlv_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		
		setViaDlvTyp(r, r.via_dlv_typ(), r.via_dlv_typ_nm());
	}
	
	@Override
	public void doDtl_via_dlv_typ_LC(MCEventInfo info) {
		super.doDtl_via_dlv_typ_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ())) {
			setValueEx(columnDtl_dlv_day_week_typ_nm, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_alloc_scope_typ_LC(MCEventInfo info) {
		super.doDtl_alloc_scope_typ_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
			
			setValueEx(columnDtl_loc_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_lot_no, info.getEventIndex(), null);
			setValueEx(columnDtl_sublot_no, info.getEventIndex(), null);
		}
		else if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
			
			if (!isNull(r.loc_cd())) {
				
				setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
				setValueEx(columnDtl_ship_lg_grp_cd, info.getEventIndex(), null);
			}
			else if (!isNull(r.ship_lg_grp_cd())) {
				
				setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
			}
		}
		setBtnMSBEP0500Mode(r);
	}
	
	@Override
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info) {
		super.doDtl_alloc_grp_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
			
			if (!isNull(r.alloc_grp_cd())) {
				
				setValueEx(columnDtl_ship_lg_grp_cd, info.getEventIndex(), null);
				setValueEx(columnDtl_loc_cd, info.getEventIndex(), null);
			}
		}
		setBtnMSBEP0500Mode(r);
	}
	
	@Override
	public void doDtl_ship_lg_grp_cd_LC(MCEventInfo info) {
		super.doDtl_ship_lg_grp_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
			
			if (!isNull(r.ship_lg_grp_cd())) {
				
				setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
				setValueEx(columnDtl_loc_cd, info.getEventIndex(), null);
			}
		}
		setBtnMSBEP0500Mode(r);
	}
	
	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
			
			if (!isNull(r.loc_cd())) {
				
				setValueEx(columnDtl_alloc_grp_cd, info.getEventIndex(), null);
				setValueEx(columnDtl_ship_lg_grp_cd, info.getEventIndex(), null);
			}
		}
		
		if ((MAC_SLO_PROC_TYP.isPROC(r.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(r.proc_typ())) && isNull(r.loc_cd())) {
			
			setValueEx(columnDtl_rqst_to_loc_cd, info.getEventIndex(), null);
			setValueEx(columnDtl_sppl_cd, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_sppl_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.sppl_cd())) {
			setValueEx(columnDtl_maker_cd, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_lot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_lot_mng_typ_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNotLotMng(r.lot_mng_typ())) {
			setValueEx(columnDtl_not_lot_mix_flg, info.getEventIndex(), false);
		}
		else {
			setValueEx(columnDtl_not_lot_mix_flg, info.getEventIndex(), getHdrR().hdr_not_lot_mix_flg());
		}
	}
	
	@Override
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sublot_mng_typ_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNotSubLotMng(r.sublot_mng_typ())) {
			setValueEx(columnDtl_not_sublot_mix_flg, info.getEventIndex(), false);
		}
		else {
			setValueEx(columnDtl_not_sublot_mix_flg, info.getEventIndex(), getHdrR().hdr_not_sublot_mix_flg());
		}
	}
	
	@Override
	public void doHdr_assort_typ_LC(MCEventInfo info) {
		super.doHdr_assort_typ_LC(info);
		
		if (MSC_SHIP_ASSORT_TYP.isAST(getHdrR().assort_typ())) {
			
			for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
				
				if (!dtlR.abort_flg() && !dtlR.org_abort_flg() && !isTrnst(dtlR)) {
					setValueEx(columnDtl_ship_schd_split_typ, dtlR.getGUIIndex(), MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
				}
			}
		}
	}
	
	@Override
	public void doHdr_sls_basis_typ_LC(MCEventInfo info) {
		super.doHdr_sls_basis_typ_LC(info);
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (!dtlR.tax_fix_flg()) {
				setDefaultTaxCd(dtlR.getGUIIndex(), false);
			}
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
			if (r.isStatusDelete() || (r.abort_flg() && !isRemAbort(r)) || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_amt()) || r.sls_acxfr_flg()) {
				continue;
			}
			
			MCNumber trdCurAmt = r.trd_cur_amt();
			MCNumber baseCurAmt = r.base_cur_amt();
			MCNumber costAmt = r.cost_amt();
			if (r.abort_flg() && isRemAbort(r)) {
				MCNumber baseUnitQty = r.base_unit_qty().subtract(r.rem_abort_qty());
				MCNumber trdUnitQty = rvrsBaseUnitConv(baseUnitQty,
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
				
				MCNumber remAbortDscntAmt = MCNumber.ZERO;
				if (!isNull(r.trd_cur_dscnt_amt())) {
					remAbortDscntAmt = r.trd_cur_dscnt_amt().multiply(baseUnitQty)
							.divide(r.base_unit_qty(), getHdrR().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getHdrR().sls_amt_rnd_typ()));
				}
				
				MCRow amtR = getAmtAndTax(r.trd_cur_upri(), trdUnitQty, r.tax_rate(),
						r.inc_tax_flg(), getHdrR().trd_cur_amt_dec_place(),
						getHdrR().sls_amt_rnd_typ(), getHdrR().sls_tax_rnd_typ(),
						remAbortDscntAmt);
				trdCurAmt = amtR.getNumber("amt");
				costAmt = MSUCP_SlsUtil.getCostAmt(r.cost_upri(), baseUnitQty,
						getHdrR().base_cur_amt_dec_place());
				baseCurAmt = convToBaseCur(trdCurAmt, getHdrR().xrate(),
						getHdrR().base_cur_amt_dec_place(), getHdrR().xrate_rnd_typ());
			}
			if (r.dscnt_itm_flg()) {
				trd_cur_amt = nvl(trd_cur_amt, MCNumber.ZERO).subtract(trdCurAmt);
			}
			else {
				trd_cur_amt = nvl(trd_cur_amt, MCNumber.ZERO).add(trdCurAmt);
				if (!isNull(r.cost_upri())) {
					ttl_amt = nvl(ttl_amt, MCNumber.ZERO).add(trdCurAmt);
					base_cur_ttl_amt = nvl(base_cur_ttl_amt, MCNumber.ZERO).add(baseCurAmt);
					cost_amt = nvl(cost_amt, MCNumber.ZERO).add(costAmt);
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
			if (r.isStatusDelete() || (r.abort_flg() && !isRemAbort(r)) || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_inc_tax_amt()) || !isNull(r.bd_dpt_cd())) {
				continue;
			}
			
			MCNumber trdIncTaxAmt = r.trd_cur_inc_tax_amt();
			if (r.abort_flg() && isRemAbort(r)) {
				MCNumber baseUnitQty = r.base_unit_qty().subtract(r.rem_abort_qty());
				MCNumber trdUnitQty = rvrsBaseUnitConv(baseUnitQty,
						r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
				
				MCNumber remAbortDscntAmt = MCNumber.ZERO;
				if (!isNull(r.trd_cur_dscnt_amt())) {
					remAbortDscntAmt = r.trd_cur_dscnt_amt().multiply(baseUnitQty)
							.divide(r.base_unit_qty(), getHdrR().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getHdrR().sls_amt_rnd_typ()));
				}
				
				MCRow amtR = getAmtAndTax(r.trd_cur_upri(), trdUnitQty, r.tax_rate(),
						r.inc_tax_flg(), getHdrR().trd_cur_amt_dec_place(),
						getHdrR().sls_amt_rnd_typ(), getHdrR().sls_tax_rnd_typ(),
						remAbortDscntAmt);
				trdIncTaxAmt = amtR.getNumber("inc_tax_amt");
			}
			if (r.dscnt_itm_flg()) {
				trd_cur_inc_tax_amt = nvl(trd_cur_inc_tax_amt, MCNumber.ZERO).subtract(trdIncTaxAmt);
			}
			else {
				trd_cur_inc_tax_amt = nvl(trd_cur_inc_tax_amt, MCNumber.ZERO).add(trdIncTaxAmt);
			}
		}
		getHdrR().trd_cur_inc_tax_amt(trd_cur_inc_tax_amt);
	}
	
	protected void clearUpri(DtlR r){
		r.trd_unit_qty(null);
		r.trd_cur_upri(null);
		r.interim_flg(false);
		r.upri_not_tgt_flg(false);
		r.cost_upri(null);
		r.cost_amt(null);
		r.iv_upri(null);
		clearAmt(r);
	}
	
	protected void clearAmt(DtlR r){
		r.trd_cur_amt(null);
		r.trd_cur_tax_amt(null);
		r.trd_cur_inc_tax_amt(null);
		r.trd_cur_dscnt_amt(null);
		r.dscnt_rsn_cd(null);
		r.dscnt_rsn_nm(null);
		r.iv_amt(null);
		r.base_cur_upri(null);
		r.base_cur_amt(null);
		r.base_cur_tax_amt(null);
		r.base_cur_inc_tax_amt(null);
		r.ptax_cur_upri(null);
		r.ptax_cur_amt(null);
		r.ptax_cur_tax_amt(null);
		r.ptax_cur_inc_tax_amt(null);
	}
	
	protected void clearTaxAmt(DtlR r){
		r.trd_cur_tax_amt(null);
		r.trd_cur_inc_tax_amt(null);
		r.base_cur_tax_amt(null);
		r.base_cur_inc_tax_amt(null);
		r.ptax_cur_tax_amt(null);
		r.ptax_cur_inc_tax_amt(null);
	}

	/**
	 * 承認済みかどうか。
	 * @return 一次承認済または最終承認済 かつ 承認引戻がオフの場合はtrue
	 */
	protected boolean isAprv() {
		
		return !getHdrR().aprv_back_flg() && 
				(MAC_APRV_STS_TYP.isFIX(getHdrR().aprv_sts_typ()) 
						|| MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ()));
	}
	
	/**
	 * 後続処理が実装済みかどうか。<br>
	 * 指図数量 > 0 OR 出荷数量 > 0 OR 売上数量 > 0 OR Ｉ／Ｖ出荷予定数量 > 0
	 * @param dtlR 受注明細
	 * @return 後続処理が実行済みの場合はtrue
	 */
	protected boolean isTrnst(DtlR dtlR) {
		
		return (!isNull(dtlR.ship_inst_qty()) && dtlR.ship_inst_qty().gt(0))
				|| (!isNull(dtlR.ship_act_qty()) && dtlR.ship_act_qty().gt(0))
				|| (!isNull(dtlR.sls_qty()) && dtlR.sls_qty().gt(0))
				|| (!isNull(dtlR.iv_schd_qty()) && dtlR.iv_schd_qty().gt(0));
	}

	/**
	 * 後続処理が実装済みかどうか。
	 * @return　 後続処理が実行済みの場合はtrue
	 */
	protected boolean hasTrnst() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			if (isTrnst(dtlR)) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 承認次処理済みかどうか。<br>
	 * 指図数量 > 0 OR 出荷数量 > 0 OR 売上数量 > 0
	 * @param dtlR 受注明細
	 * @return 承認次処理済みの場合はtrue
	 */
	protected boolean isAprvNextOper(DtlR dtlR) {
		
		return (!isNull(dtlR.ship_inst_qty()) && dtlR.ship_inst_qty().gt(0))
				|| (!isNull(dtlR.ship_act_qty()) && dtlR.ship_act_qty().gt(0))
				|| (!isNull(dtlR.sls_qty()) && dtlR.sls_qty().gt(0));
	}

	/**
	 * 承認次処理済みかどうか。
	 * @return　 承認次処理済みの場合はtrue
	 */
	protected boolean hasAprvNextOper() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			if (isAprvNextOper(dtlR)) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 打切が存在するかどうか。
	 * @return 打切が存在する場合はtrue
	 */
	protected boolean hasAbort() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			if (dtlR.abort_flg()) {
				return true;
			}
		}
		
		return false;
	}
	protected boolean isRemAbort(DtlR r) {
		return !MAC_SLO_PROC_TYP.isPURC_DDLV(r.proc_typ())
				&& !MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())
				&& (r.rem_abort_flg() || isShipSchdShipNoPicKPartAct(r));
	}
	protected boolean isShipSchdShipNoPicKPartAct(DtlR r) {
		
		return  MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())
				 && (!isNull(r.ship_act_qty()) && r.ship_act_qty().gt(0) && r.ship_act_qty().lt(r.base_unit_qty()));
	}
	protected boolean isNotLotMng(String lotMngTyp) {
		return MAC_LOT_MNG_TYP.isNOT_MNG(lotMngTyp) || isNull(lotMngTyp);
	}
	protected boolean isNotSubLotMng(String subLotMngTyp) {
		return MAC_SUBLOT_MNG_TYP.isNOT_MNG(subLotMngTyp) || isNull(subLotMngTyp);
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
	public String getInptVerNoCol() {
		return DtlR.$ver_no;
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
	public String getInptAllocGrpCdCol() {
		return DtlR.$alloc_grp_cd;
	}
	
	@Override
	public String getInptLgGrpCdCol() {
		return DtlR.$ship_lg_grp_cd;
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
		
		if (index < 0) {
			return true;
		}
		DtlR dtlR  = getDtlL().get(index);
		
		if (isTrnst(dtlR) || dtlR.abort_flg() || dtlR.org_abort_flg() || dtlR.isStatusDelete()) {
			
			if (isSame(OPE_UPD, ope)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isCndEnable(String ope, String name, MCTable<?> table) {
		
		if (isSame(name, IfStkInspBase.CND_ITM_CD) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB1) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB2) 
				|| isSame(name, IfStkInspBase.CND_ITM_SUB3) 
				|| isSame(name, IfStkInspBase.CND_ITM_NM)) {
			return isEditable(columnDtl_itm_cd, DtlTable.getMCSelectedRow());
		}
		else if (isSame(name, IfStkInspBase.CND_ALLOC_GRP_CD) || isSame(name, IfStkInspBase.CND_ALLOC_GRP_NM)) {
			DtlR selR  = DtlTable.getSelectedMCRow();
			return isNull(selR.alloc_grp_cd());
		}
		else if (isSame(name, IfStkInspBase.CND_LOC_CD) || isSame(name, IfStkInspBase.CND_LOC_NM)) {
			DtlR selR  = DtlTable.getSelectedMCRow();
			return isNull(selR.loc_cd());
		}
		
		return IfStkInspBase.super.isCndEnable(ope, name, table);
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (Btn_open_MSBEP0500_p_PPanel == panel) {
			return DtlTable;
		}

		return null;
	}
	
	@Override
	public List<String> getIgnoreErrItms() {
		List<String> itms = new ArrayList<>();
		
		itms.add(DtlR.$alloc_grp_cd);
		itms.add(DtlR.$ship_lg_grp_cd);
		itms.add(DtlR.$loc_cd);

		return itms;
	}

	// 在庫選択画面に渡す検索条件を設定する（MSBEP_StkInfo_MC：setBindVal関数を参照のこと）
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlR selR  = (DtlR)table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (selR != null) {
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.SLO_LOC.value());
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, selR.itm_cd());                           // 品目ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, selR.itm_sub1());                       // 枝番１
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, selR.itm_sub2());                       // 枝番２
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, selR.itm_sub3());                       // 枝番３
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, selR.itm_nm());                           // 品名
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, selR.ver_no());                           // 版ＮＯ
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.gd_cd());                             // 格付ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.gd_nm());                             // 格付名
			bind.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_CD, selR.alloc_grp_cd());               // 総量引当場所グループＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ALLOC_GRP_NM, selR.alloc_grp_nm());               // 総量引当場所グループ名
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, selR.ship_lg_grp_cd());                // 物流グループＣＤ
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_NM, selR.ship_lg_grp_nm());                // 物流グループ名
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.loc_cd());                           // 場所ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.loc_nm());                           // 場所名
			bind.addStringColumn(IfStkInspBase.CND_SNO1, selR.sno1());                               // 手配ＮＯ１
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, selR.sno1_null_flg());            // 手配ＮＯ１無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO2, selR.sno2());                               // 手配ＮＯ２
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, selR.sno2_null_flg());            // 手配ＮＯ２無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO3, selR.sno3());                               // 手配ＮＯ３
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, selR.sno3_null_flg());            // 手配ＮＯ３無し可
			bind.addStringColumn(IfStkInspBase.CND_SNO4, selR.sno4());                               // 手配ＮＯ４
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, selR.sno4_null_flg());            // 手配ＮＯ４無し可
			bind.addStringColumn(IfStkInspBase.CND_SLO_WG_CD, getHdrR().wg_cd());                    // ワーキンググループＣＤ
			bind.addStringColumn(IfStkInspBase.CND_SLO_LG_GRP_CD, nvl(
					nvl(selR.tdlv_lg_grp_cd(), selR.dlv_lg_grp_cd()), 
					nvl(getHdrR().tdlv_lg_grp_cd(), getHdrR().dlv_lg_grp_cd())));  // 物流グループＣＤ
			bind.addBooleanColumn(IfStkInspBase.CND_PLNT_APRV_STS_TYP_OPN_FLG, true);	// 未承認(工場出荷承認)
			bind.addBooleanColumn(IfStkInspBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG, true);	// 承認済(工場出荷承認)
			bind.addBooleanColumn(IfStkInspBase.CND_PLNT_APRV_STS_TYP_NON_FLG, true);	// 未設定(工場出荷承認)
			bind.addBooleanColumn(IfStkInspBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG, true);	// 未判定(市場出荷判定)
			bind.addBooleanColumn(IfStkInspBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG, true);	// 出荷許可(市場出荷判定)
			bind.addBooleanColumn(IfStkInspBase.CND_MRKT_JUDG_STS_TYP_NON_FLG, true);	// 未設定(市場出荷判定)
			
			if (!isNull(selR.itm_cd())) {
				bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD); 
			}
		}

		return bind;
	}

	// ---------------------------------------- 在庫選択機能 END ----------------------------------------

}