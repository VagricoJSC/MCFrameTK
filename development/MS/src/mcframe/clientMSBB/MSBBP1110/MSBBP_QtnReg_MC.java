package mcframe.clientMSBB.MSBBP1110;

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
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP0010.*;
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
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUC.MAUCP1060.MAUCP_TrdUtil;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.CstSloStkGdCols;
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_QtnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_QtnReg_MC extends MSBBP_QtnReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_QtnReg_MC() {
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
	public MSBBP_QtnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1110_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Sprt01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		/**
		 *  更新ボタンのイベントフラグ
		 */
		protected boolean _upd_btn_event_flg = false;
		
		/**
		 * エラーフラグ
		 */
		protected boolean _error_flg = false;
		
		protected MS_MSBBL1110_Sprt01Caller(P p, B b) {
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
					if (!isTrnst(dtlR)) {
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
				
				getDtlL().get(r.getGUIIndex()).old_trd_cur_std_sls_upri(getDtlL().get( r.getGUIIndex()).trd_cur_std_sls_upri());
				setValueEx(columnDtl_trd_cur_std_sls_upri, r.getGUIIndex(), r.std_sls_upri());
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
			msgList.addAll(panel.checkReq(Hdr_qtn_dt));
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
				
				dest.dt(getHdrR().qtn_dt());
				dest.cst_cd(getHdrR().cst_cd());
				dest.trd_cur_cd(getHdrR().trd_cur_cd());
				dest.wg_cd(getHdrR().wg_cd());
			}
		}
	}

	/**
	 * [MS_MSBBL1110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Srch01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1110_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			bridge.down0().cache_qtn_no(bridge.down0().qtn_no());
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
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
			hdrR.dlv_cntry_cd(firstDtlR.dlv_cntry_cd());
			hdrR.dlv_cntry_nm(firstDtlR.dlv_cntry_nm());
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
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()|| Cnd_ope_DEL.isSelected()) {
				if (getHdrR().can_flg()) {
					setREFStatus();
				}
			}
			DtlTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * [MS_MSBBL1110_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Ins01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

	 	/**
	 	 * 販売単価変更フラグ
	 	 */
		protected boolean _trd_cur_upri_chng_flg = false;
		
		protected MS_MSBBL1110_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_trd_cur_upri_chng_flg = false;
			setPrint(true);
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurStdSlsUpriChng(upriChngMsgList);
			
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
				
				restoreTrdCurStdSlsUpri();
			}
			
			return confirmRslt;
		}
	}

	/**
	 * [MS_MSBBL1110_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Upd01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

	 	/**
	 	 * 販売単価変更フラグ
	 	 */
		protected boolean _trd_cur_upri_chng_flg = false;
		
		protected MS_MSBBL1110_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			_trd_cur_upri_chng_flg = false;
			setPrint(true);
		}
		
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			
			MCMessageList upriChngMsgList = new MCMessageList();
			confirmForTrdCurStdSlsUpriChng(upriChngMsgList);
			
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
				
				restoreTrdCurStdSlsUpri();
			}
			
			return confirmRslt;
		}
	}
	
	/**
	 * 単価が変更された場合、確認メッセージを表示する。
	 * @param msgList メッセージリスト
	 */
	protected void confirmForTrdCurStdSlsUpriChng(MCMessageList msgList) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {
			
			if (!isNull(dtlR.old_trd_cur_std_sls_upri()) 
					&& !isNull(dtlR.trd_cur_upri()) 
					&& !isSame(dtlR.old_trd_cur_std_sls_upri(), dtlR.trd_cur_std_sls_upri()) ) {
				
				msgList.add(new MCMessage(
						dtlR, 
						DtlR.$trd_cur_std_sls_upri,
						MSBBP0012, 
						dtlR.old_trd_cur_std_sls_upri(), 
						dtlR.trd_cur_std_sls_upri(), 
						toDispGUIIndex(dtlR)));
			}
		}
	}
	
	/**
	 * 単価を変更前に戻す。
	 */
	protected void restoreTrdCurStdSlsUpri() {

		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL()).subList(DtlR.$upri_not_tgt_flg, false)) {
			
			if (!isNull(dtlR.old_trd_cur_std_sls_upri())) {
				
				setValueEx(columnDtl_trd_cur_std_sls_upri, dtlR.getGUIIndex(), dtlR.old_trd_cur_std_sls_upri());
			}
		}
	}
	
	/**
	 * 更新前に単価再所得処理を実行する。
	 * @return 実行結果がエラーの場合はtrue
	 */
	protected boolean callMS_MSBBL1210_Sprt01_Before_Upd() {

		MSBBP_QtnReg.MS_MSBBL1110_Sprt01Caller caller = createMS_MSBBL1110_Sprt01();
		caller.setUpdBtnEventFlg(true);
		caller.exec();
		
		return caller.getErrorFlg();
	}

	/**
	 * [MS_MSBBL1110_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Del01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1110_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1110_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Prnt01Caller<P extends MSBBP_QtnReg, B extends MS_MSBBL1110_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1110_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_qtn_dt);
		Hdr_cst_addr_p_PPanel.setRelateBeans(Hdr_cst_cd, Hdr_cst_nm, Hdr_cst_sundry_flg);
		
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_no_cost_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_qtn_dt, true, Hdr_xrate_inpt_flg);
		
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2,columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ, 
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		
		Dtl_trnst_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);
		
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.setSchd(true);
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_cst_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, 
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place, 
				Hdr_sls_amt_rnd_typ, Hdr_sls_tax_rnd_typ, null, null, columnDtl_dscnt_itm_flg);
		
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_trd_cur_amt_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, Hdr_trd_cur_upri_dec_place);
		
		Dtl_cost_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_cost_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_cost_upri_p_PPanel.UpriTable.setCellConfig(new MAUDP_CellConfig());
		
		Dtl_base_cur_std_sls_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_std_sls_upri, Hdr_xrate);
		Dtl_base_cur_std_sls_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_std_sls_amt, Hdr_xrate);
		Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_std_sls_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_std_sls_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_std_sls_tax_amt, Hdr_xrate);
		
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(
				columnDtl_base_unit_cd, 
				columnDtl_base_unit_dec_place, 
				columnDtl_base_unit_rnd_typ, 
				columnDtl_trd_unit_qty, 
				columnDtl_trd_unit_conv_base_qty, 
				columnDtl_trd_unit_conv_qty);
		
		Dtl_old_trd_cur_std_sls_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_upri_dec_place);
		
		Dtl_sno_p_PPanel.setSnoModeCtrl(true);
		Dtl_sno_p_PPanel.setAutoManuModeCtrl(true);
		Dtl_sno_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_sno1_mng_typ,columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ,
				columnDtl_sno1_num_typ,columnDtl_sno2_num_typ,columnDtl_sno3_num_typ,columnDtl_sno4_num_typ,
				columnDtl_slo_sno1_flg,columnDtl_slo_sno2_flg,columnDtl_slo_sno3_flg,columnDtl_slo_sno4_flg);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		
		getDtl_gd_cd_ListPutter().putBind(CstSloStkGdCols.$i_cst_cd, Hdr_cst_cd);
		getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_qtn_dt);
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_dlv_cd.addLCListener(this);
		Hdr_dlv_nm.addLCListener(this);
		Hdr_pri_prnt_flg.addNCListener(this);
		Hdr_dlv_zip_cd.addLCListener(this);
		Hdr_dlv_addr1.addLCListener(this);
		Hdr_dlv_addr2.addLCListener(this);
		Hdr_dlv_addr3.addLCListener(this);
		Hdr_dlv_addr4.addLCListener(this);
		Hdr_dlv_tel.addLCListener(this);
		Hdr_dlv_fax.addLCListener(this);
		Hdr_dlv_cntct_dpt.addLCListener(this);
		Hdr_dlv_cntct_psn.addLCListener(this);
		Hdr_sls_dpt_cd.addLCListener(this);
		
		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_trd_cur_upri.addNCListener(this);
		columnDtl_trd_unit_qty.addNCListener(this);
		columnDtl_base_unit_qty.addNCListener(this);
		columnDtl_tax_cd.addLCListener(this);
		columnDtl_trd_cur_std_sls_upri.addNCListener(this);
		columnDtl_trd_cur_dscnt_amt.addNCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addNCListener(this);
		columnDtl_base_cur_amt.addNCListener(this);
		columnDtl_cost_upri.addNCListener(this);
		setListListener(DtlTable, createDtlListListener());
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanel(columnDtl_set_itm_grp_no, "MS", "MSUAP1090", false);
		
		// 得意先
		linkBeansToISPanelCustom(Hdr_cst_cd, true);
		
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_qtn_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);
	}

	@Override
	public MCList<?> getHdr_cst_cd(MCRow row, MCEventInfo info) {
		row.setStringNE(BpCols.$i_dlv_cd, getHdrR().dlv_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.CST_BY_DLV.value());
		
		return super.getHdr_cst_cd(row, info);
	}
	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().qtn_dt());
		
		return super.getDtl_cst_itm_cd(row, info);
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
				bindR.base_dt(getHdrR().qtn_dt());
				bindR.set_itm_grp_no(dtlR.set_itm_grp_no());
				
				openModalPanel(
						"MS", 
						"MSUAP1090",
						T1, 
						bindR,
						columnDtl_itm_cd,
						columnDtl_itm_sub1,
						columnDtl_itm_sub2,
						columnDtl_itm_sub3,
						columnDtl_trd_unit_cd,
						columnDtl_trd_unit_qty,
						columnDtl_set_itm_grp_no);
			}
		}
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
		msgList.addAll(checkReq(Hdr_qtn_dt));
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
	protected MCRow getBindRowForISCustom(MCRow bind,MCLinkBeans beans, int eventIndex) {
		
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		
		if (beans == Hdr_cst_cd) {
			
			bind.setStringNE(BpCols.$i_bp_is_srch_typ, 
					MSC_QTN_TYP.isQTN(getHdrR().qtn_typ()) ? MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY.value() : MAC_BP_IS_SRCH_TYP.CST.value());
		}
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().qtn_dt());
		}
		return row;
	}
	
	/**
	 * 品揃入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1090Req(MCMessageList msgList, int i) {
		
		msgList.addAll(checkReq(Hdr_qtn_dt));
		msgList.addAll(checkReq(i, 
				columnDtl_itm_cd, 
				columnDtl_itm_sub1, 
				columnDtl_itm_sub2, 
				columnDtl_itm_sub3, 
				columnDtl_trd_unit_cd, 
				columnDtl_trd_unit_qty));
	}
	
	@Override
	protected void opePanelFillSpace() {
		
		if (!isAprv()) {
			super.opePanelFillSpace();
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
	protected void valueInit() {
		super.valueInit();
		
		valueInitQtnTyp();
		valueInitSub();
	}
	
	/**
	 * 画面の初期値を設定する。
	 */
	protected void valueInitSub() {
		
		setValueEx(Hdr_qtn_dt, getToday());
		setValueEx(Hdr_qtn_out_flg, true);
		getHdrR().base_cur_cd(getBaseCur().cur_cd());
		getHdrR().base_cur_nm(getBaseCur().cur_nm());
		getHdrR().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
		getHdrR().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		getHdrR().xrate_cd(getCo().sls_xrate_cd());
	}
	
	/**
	 * 見積区分の初期値を設定する。
	 */
	protected void valueInitQtnTyp() {
		
		setValueEx(Hdr_qtn_typ, MSC_QTN_TYP.QTN.value());
	}
	
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		if (T1 == openTyp) {

			setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			
			valueInitSub();
			
			setValueEx(Hdr_trd_cd, MAUCP_TrdUtil.getDefaultTrdCdNoCache(MAC_TRD_PTN_TYP.SLS.value()));
			setValueEx(Hdr_cst_cd, bind.getStringNE("cst_cd"));
			
			if (getHdrR().cst_sundry_flg()) {
				
				setValueEx(Hdr_cst_nm, bind.getStringNE("cst_nm"));
				setValueEx(Hdr_cst_zip_cd, bind.getStringNE("zip_cd"));
				setValueEx(Hdr_cst_addr1, bind.getStringNE("addr1"));
				setValueEx(Hdr_cst_addr2, bind.getStringNE("addr2"));
				setValueEx(Hdr_cst_addr3, bind.getStringNE("addr3"));
				setValueEx(Hdr_cst_addr4, bind.getStringNE("addr4"));
				setValueEx(Hdr_cst_cntct_dpt, bind.getStringNE("cst_cntct_dpt"));
				setValueEx(Hdr_cst_cntct_psn, bind.getStringNE("cst_cntct_psn"));
				setValueEx(Hdr_cst_tel, bind.getStringNE("tel"));
				setValueEx(Hdr_cst_fax, bind.getStringNE("fax"));
				
				setValueEx(Hdr_qtn_typ, MSC_QTN_TYP.PRE_QTN.value());
			}
			else {
				valueInitQtnTyp();
			}
			
			setValueEx(Hdr_wrk_no, bind.getStringNE("wrk_no"));
			
			DtlTable.fillSpace(); // 画面が既に開いている状態で画面遷移されたケースを考慮
			HdrPanel.focusFirstComponent();
		}
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
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			
			getCndR().qtn_no(getHdrR().qtn_no());
			getCndR().qtn_rev(getHdrR().qtn_rev());
		}
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) 
				&& isSame(afOpe, Cnd_ope_INS.getActionCommand()) 
				&& isSame(bfSt, REF))) {
			
			setRefToInsInit();
			setTrnsptCdMode();
		}
	}
	
	/**
	 * 参照処理の初期化を行う。
	 */
	protected void setRefToInsInit() {
		
		setValueEx(Hdr_qtn_typ, MSC_QTN_TYP.QTN.value());
		setValueEx(Hdr_qtn_dt, getToday());
		setValueEx(Hdr_qtn_out_flg, true);
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
	
		if (!isNull(getHdrR().cache_qtn_no())) {
			
			setRevUpdFlgMode();
		}
		else {
			valueInitSub();
		}
		
		setCstIvMode();
		
		setBtnMode();
	}
	
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		
		setCstIvMode();
		
		setBtnMode();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		setCstIvMode();
		
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		if (hasTrnst()) {
			
			setUPD_TRNSTStatus();
		}
		else if (isAprv()) {
			
			setUPD_APRVStatus();
			setAprvBackFlgMode();
		}
		else {
			
			setCstItmMode();
			setAprvBackFlgMode();
			setTrnsptCdMode();
			setDestCdMode();
			setCstIvMode();
		}
		
		setBtnMode();
		
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public void setUPD_TRNSTStatus() {
		super.setUPD_TRNSTStatus();
		
		setCstIvMode();
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (!isNull(dtlR)) {
			setBtnMode(dtlR);
		}
	}
	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();
		
		setCstIvMode();
		
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		
		setCstIvMode();
		
		setBtnMode();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		setCstIvMode();
		setAprvBackFlgMode();
		setBtnMode();
	}
	
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		
		setCstIvMode();
		setBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		setCstIvMode();
		setPrntQtnBtnMode();
		setBtnMode();
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
	 * 最終承認済みかどうか。
	 * @return 最終承認済 かつ 承認引戻がオフの場合はtrue
	 */
	protected boolean isAcptAprv() {
		
		return !getHdrR().aprv_flg() || MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ());
	}
	
	/**
	 * 明細に引継済みの明細が存在するかどうか。
	 * @return　一件でも存在する場合はtrue
	 */
	protected boolean hasTrnst() {

		for (DtlR dR : getDtlL()) {
			
			if (isTrnst(dR)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 指定された行が引継済みかどうか。
	 * @param dtlR　見積明細Row
	 * @return 引継済みの場合はtrue
	 */
	protected boolean isTrnst(DtlR dtlR) {
		
		return !isNull(dtlR.trnst_qty()) && dtlR.trnst_qty().isPositive();
	}
	
	/**
	 * 改訂番号更新ＦＬＧの表示モードを設定する。
	 */
	protected void setRevUpdFlgMode() {

		if (!isNull(getHdrR().cache_qtn_no())) {
			
			Hdr_rev_upd_flg.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_rev_upd_flg);
		}
	}
	
	@Override
	public MCList<?> getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	@Override
	public void doHdr_qtn_dt_NC(MCEventInfo info) {
		super.doHdr_qtn_dt_NC(info);
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setCstItm(dtlR);
			if (!dtlR.tax_fix_flg()) {
				setDefaultTaxCd(dtlR, false);
			}
			setDefaultCostUpri(dtlR);
		}
	}
	
	@Override
	public void doHdr_aprv_back_flg_NC(MCEventInfo info) {
		super.doHdr_aprv_back_flg_NC(info);
		
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			opePanelFillSpace();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
	}
	
	/**
	 * 承認引戻しの表示モードを設定する。
	 */
	protected void setAprvBackFlgMode() {
		
		if (isAprv() && !hasTrnst()
				&& ((Cnd_ope_UPD.isSelected() && getHdrR().aprv_upd_flg())
						|| (Cnd_ope_DEL.isSelected() && getHdrR().aprv_can_flg()))) {
			
			Hdr_aprv_back_flg.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_aprv_back_flg);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == Hdr_dlv_cd) doHdr_dlv_cd_LC(info);
		if (lc == Hdr_dlv_nm) doHdr_dlv_nm_LC(info);
		if (lc == Hdr_dlv_zip_cd) doHdr_dlv_zip_cd_LC(info);
		if (lc == Hdr_dlv_addr1) doHdr_dlv_addr1_LC(info);
		if (lc == Hdr_dlv_addr2) doHdr_dlv_addr2_LC(info);
		if (lc == Hdr_dlv_addr3) doHdr_dlv_addr3_LC(info);
		if (lc == Hdr_dlv_addr4) doHdr_dlv_addr4_LC(info);
		if (lc == Hdr_dlv_tel) doHdr_dlv_tel_LC(info);
		if (lc == Hdr_dlv_fax) doHdr_dlv_fax_LC(info);
		if (lc == Hdr_dlv_cntct_dpt) doHdr_dlv_cntct_dpt_LC(info);
		if (lc == Hdr_dlv_cntct_psn) doHdr_dlv_cntct_psn_LC(info);
		if (lc == Hdr_sls_dpt_cd) doHdr_sls_dpt_cd_LC(info);
		
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			
			doDtl_itm_LC(info);
		}
		else if (lc == columnDtl_tax_cd) {
			
			doDtl_itm_tax_LC(info);
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		if (nc == columnDtl_trd_cur_upri) {
			doDtl_trd_cur_upri_NC(info);
		}
		else if (nc == columnDtl_trd_unit_qty) {
			doDtl_trd_unit_qty_NC(info);
		}
		else if (nc == columnDtl_base_unit_qty) {
			doDtl_base_unit_qty_NC(info);
		}
		else if (nc == columnDtl_trd_cur_dscnt_amt) {
			doDtl_trd_cur_dscnt_amt_NC(info);
		}
		else if (nc == columnDtl_trd_cur_inc_tax_amt) {
			doDtl_trd_cur_inc_tax_amt_NC(info);
		}
		else if(nc == columnDtl_trd_cur_std_sls_upri) {
			doDtl_trd_cur_std_sls_upri_NC(info);
		}
		else if (nc == columnDtl_cost_upri) {
			doDtl_cost_upri_NC(info);
		}
		else if (nc == columnDtl_base_cur_amt) {
			doDtl_base_cur_amt_NC(info);
		}
	}
	
	@Override
	public void doHdr_rev_upd_flg_NC(MCEventInfo info) {
		super.doHdr_rev_upd_flg_NC(info);

		if (getHdrR().rev_upd_flg()) {
			getHdrR().qtn_no(getHdrR().cache_qtn_no());
		}
		else {
			getHdrR().qtn_no(null);
		}
	}

	@Override
	public void doHdr_qtn_typ_NC(MCEventInfo info) {
		super.doHdr_qtn_typ_NC(info);
		
		setQtnOutFlg();
	}
	
	@Override
	public void doHdr_failure_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr_failure_flg_NC(info);
		
		setQtnOutFlg();
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
	
	/**
	 * 見積書即時発行ＦＬＧを設定する。
	 */
	protected void setQtnOutFlg() {
		
		if (getHdrR().failure_flg() 
				|| MSC_QTN_TYP.isCREATING(getHdrR().qtn_typ())) {
			
			setValueEx(Hdr_qtn_out_flg, false);
		}
		else
		{
			setValueEx(Hdr_qtn_out_flg, true);
		}
	}
	
	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		super.doHdr_cst_cd_LC(info);
		
		setSlsUsrDpt();
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setCstItm(dtlR);
			setDefaultTaxCd(dtlR, true);
			setTrdCurAmt(dtlR);
		}
		
		setCstItmMode();
		setTrnsptCdMode();
		setCstIvMode();
	}
	
	/**
	 * 売上担当者と売上部門を設定する。
	 */
	protected void setSlsUsrDpt() {

		setValueEx(Hdr_sls_usr_cd, null);
		setValueEx(Hdr_sls_dpt_cd, null);

		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}
	}
	
	/**
	 * 得意先に関連する品目のモードを設定する。
	 */
	protected void setCstItmMode() {
		
		if (getHdrR().cst_sundry_flg()) {
			
			Hdr_cst_nm.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Hdr_cst_nm);
		}
	}
	
	/**
	 * インボイス取引用項目の表示モードを設定する。
	 */
	protected void setCstIvMode() {
		
		if (!isCstIv()) {
			
			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);
		}
		else {
			
			setDefaultMode(columnDtl_iv_itm_nm);
			setDefaultMode(columnDtl_cntry_org_cd);
			setDefaultMode(columnDtl_cntry_org_nm);
		}
	}
	
	/**
	 * 輸出方法の表示モードを設定する。
	 */
	protected void setTrnsptCdMode() {

		if (isCstIv()) {
			
			Hdr_trnspt_cd.setMode(MCMode.ENABLE);
		}
		else {
			
			setDefaultMode(Hdr_trnspt_cd);
			Hdr_trnspt_cd.setValue(null);
		}
	}
	
	protected void doHdr_dlv_cd_LC(MCEventInfo info) {
		
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
				dtlR.dlv_cntry_cd(getHdrR().dlv_cntry_cd());
				dtlR.dlv_cntry_nm(getHdrR().dlv_cntry_nm());
				dtlR.dlv_tel(getHdrR().dlv_tel());
				dtlR.dlv_fax(getHdrR().dlv_fax());
				dtlR.dlv_cntct_dpt(getHdrR().dlv_cntct_dpt());
				dtlR.dlv_cntct_psn(getHdrR().dlv_cntct_psn());
				dtlR.dlv_lg_grp_nm(getHdrR().dlv_lg_grp_nm());
				dtlR.prnt_lcl_cd(getHdrR().prnt_lcl_cd());
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

	protected void doHdr_pri_prnt_flg_NC(MCEventInfo info) {
		
		for (DtlR dtlR : getDtlL()) {
			
			if (!dtlR.isEmpty() && isSame(getHdrR().dlv_cd(), dtlR.dlv_cd()) && isEditable(columnDtl_pri_prnt_flg, dtlR.getGUIIndex())){
				
				dtlR.pri_prnt_flg(getHdrR().pri_prnt_flg());
			}
		}
	}

	protected void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		setDefaultCostUpri();
	}
	
	@Override
	public void doHdr_dest_cd1_LC(MCEventInfo info) {
		super.doHdr_dest_cd1_LC(info);
		
		setDestCdMode();
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setValueEx(columnDtl_dest_cd1, r.getGUIIndex(), getHdrR().dest_cd1());
		}
	}
	
	@Override
	public void doHdr_dest_cd2_LC(MCEventInfo info) {
		super.doHdr_dest_cd2_LC(info);
		
		setDestCdMode();
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!isNull(r.dest_cd1())) {
				setValueEx(columnDtl_dest_cd2, r.getGUIIndex(), getHdrR().dest_cd2());
			}
		}
	}
	
	@Override
	public void doHdr_dest_cd3_LC(MCEventInfo info) {
		super.doHdr_dest_cd3_LC(info);
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!isNull(r.dest_cd2())) {
				setValueEx(columnDtl_dest_cd3, r.getGUIIndex(), getHdrR().dest_cd3());
			}
		}
	}
	
	/**
	 * 仕向先の表示モードを設定する。
	 */
	protected void setDestCdMode() {

		if (!isNull(getHdrR().dest_cd1())) {
			
			Hdr_dest_cd2.setMode(MCMode.ENABLE);
		}
		else {
			Hdr_dest_cd2.clear();
			setDefaultMode(Hdr_dest_cd2);
		}
		
		if (!isNull(getHdrR().dest_cd2())) {
			
			Hdr_dest_cd3.setMode(MCMode.ENABLE);
		}
		else{
			Hdr_dest_cd3.clear();
			setDefaultMode(Hdr_dest_cd3);
		}
	}
	
	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setTrdCurAmt(dtlR);
		}
	}
	
	/**
	 * 更新系ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		if (isAprv()) {
			
			Btn_radd.setMode(MCMode.DISABLE);
			Btn_rdel.setMode(MCMode.DISABLE);
			Btn_rcopy.setMode(MCMode.DISABLE);
			Btn_menu_move_p_PPanel.setDISABLEStatus();
			Btn_sprt_srch_upri.setMode(MCMode.DISABLE);
			Btn_del.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(Btn_radd);
			setDefaultMode(Btn_rdel);
			setDefaultMode(Btn_rcopy);
			setDefaultMode(Btn_menu_move_p_PPanel.BtnPanel);
			setDefaultMode(Btn_sprt_srch_upri);
			setDefaultMode(Btn_del);
		}
		
		if (getHdrR().can_flg() || getHdrR().failure_flg()
				|| (getHdrR().aprv_flg() && !MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ()))) {
			
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
			Btn_open_MSBBP1310.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1210);
			setDefaultMode(Btn_open_MSBBP1310);
		}
	}
	
	/**
	 * 見積書発行ボタンの制御を行う。
	 */
	protected void setPrntQtnBtnMode() {

		if (isAcptAprv() && !getHdrR().can_flg()) {
			setDefaultMode(Btn_prnt_qtn);
		} 
		else {
			Btn_prnt_qtn.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 品目のListChangedイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_itm_LC(MCEventInfo info) {

		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			
			DtlR dtlR = getDtlL().get(info.getEventIndex());
			
			setCstItm(dtlR);
			
			setDefaultTaxCd(dtlR, true);
			
			setDefaultCostUpri(dtlR);
			
			setIvItmNm(dtlR);
			
			setColByDscntItm(dtlR);
		}
	}
	
	@Override
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info) {
		super.doDtl_prnt_lcl_cd_NC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setIvItmNm(dtlR);
	}
	
	/**
	 * 税ＣＤのListChangedイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_itm_tax_LC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setTrdCurAmt(dtlR);
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setCstItm(DtlR dtlR) {
		
		if (isNullOr(dtlR, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())) {
			
			setValueEx(columnDtl_cst_itm_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_cst_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			
			MCRow row = MAUCP_ItmUtil.getBpItm(
					getHdrR().cst_cd(), 
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(), 
					dtlR.itm_sub3(), 
					getHdrR().qtn_dt(), 
					this);
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
	}
	
	/**
	 * 税コードの初期値を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setDefaultTaxCd(DtlR dtlR, boolean setTaxFixFlg) {
		
		if (!isNull(getHdrR().cst_cd())) {
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(), 
					dtlR.itm_sub3(), 
					getHdrR().cst_cd(), 
					getHdrR().qtn_dt(), 
					this);
			setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), tax_cd);
			if (setTaxFixFlg) {
				dtlR.tax_fix_flg(false);
			}
		}
	}
	
	/**
	 * 原価単価の初期値を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setDefaultCostUpri(DtlR dtlR) {
		
			
			MCNumber cost_upri = MAUCP_StdUpriUtil.getStdCost(
					dtlR.itm_cd(), 
					dtlR.itm_sub1(), 
					dtlR.itm_sub2(), 
					dtlR.itm_sub3(), 
					getHdrR().qtn_dt(), 
					getHdrR().wg_cd(),
					getCo().gm_std_upri_typ());
			
			setValueEx(columnDtl_cost_upri, dtlR.getGUIIndex(), cost_upri);
	}

	protected void setDefaultCostUpri() {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultCostUpri(dtlR);
		}
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
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(DtlR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
			setValueEx(columnDtl_upri_rate, dtlR.getGUIIndex(), new MCNumber(100));
		}
	}

	
	@Override
	public void doDtl_upri_rate_NC(MCEventInfo info) {
		super.doDtl_upri_rate_NC(info);
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setTrdCurUpri(dtlR);
		
		setTrdCurAmt(dtlR);
	}
	
	/**
	 * 仕切単価のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_trd_cur_upri_NC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setUpriRate(dtlR);
		
		setTrdCurAmt(dtlR);
	}
	
	/**
	 * 明細の仕切率を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setUpriRate(DtlR dtlR) {
	
		if (!isNull(dtlR.trd_cur_std_sls_upri()) && !isNull(dtlR.trd_cur_upri())) {
			
			MCNumber upriRate;
			if (dtlR.trd_cur_std_sls_upri().isZero()) {
				if (dtlR.trd_cur_upri().isZero() && isNull(dtlR.upri_rate())) {
					upriRate = new MCNumber(100);
				}
				else if (dtlR.trd_cur_upri().isPositive()) {
					upriRate = null;
				}
				else {
					upriRate = dtlR.upri_rate();
				}
			}
			else {
				upriRate = dtlR.trd_cur_upri().multiply(100).divide(
						dtlR.trd_cur_std_sls_upri(), columnDtl_upri_rate.getMeta().scale(), MAC_RND_TYP.RNDUP.toMC());
			}
			dtlR.upri_rate(upriRate);
		}
		else {
			dtlR.upri_rate(null);
		}
	}
	
	/**
	 * 仕切単価を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setTrdCurUpri(DtlR dtlR) {
		
		MCNumber trdCurUpri = null;
		if (!isNull(dtlR.trd_cur_std_sls_upri()) 
				&& !isNull(dtlR.upri_rate()) 
				&& !isNull(getHdrR().trd_cur_upri_dec_place())) {
			
			trdCurUpri = dtlR.trd_cur_std_sls_upri().multiply(
					dtlR.upri_rate().divide(100), getHdrR().trd_cur_upri_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC());
		}
		
		if (!isNull(dtlR.trd_cur_std_sls_upri())) {
			setValueEx(columnDtl_trd_cur_upri, dtlR.getGUIIndex(), trdCurUpri);
		}
	}
	
	/**
	 * 取引単位数量のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_trd_unit_qty_NC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setTrdCurAmt(dtlR);
	}
	
	/**
	 * 基準単位数量のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_base_unit_qty_NC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setCostAmt(dtlR);
		
		setProfRate(dtlR);
		
		//　画面実装仕様の項目順でイベントが実行されるため、基準単位のイベントが基準通貨金額の後に実行される。
		// そのため、原価金額を再計算後に、ヘッダの金額や粗利率も再計算する。
		setHdrAmt();
	}
	
	/**
	 * 値引額のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_trd_cur_dscnt_amt_NC(MCEventInfo info) {
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		setTrdCurAmt(dtlR);
	}
	
	/**
	 * 取引通貨仕切税込金額のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_trd_cur_inc_tax_amt_NC(MCEventInfo info) {
		
		setHdrIncTaxAmt();
	}
	
	/**
	 * 標準販売単価のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_trd_cur_std_sls_upri_NC(MCEventInfo info) {

		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		if (isNull(dtlR.trd_cur_std_sls_upri()) || dtlR.trd_cur_std_sls_upri().isZero()) {
			
			setValueEx(columnDtl_trd_cur_upri, info.getEventIndex(), null);
		}
		else {
			if (!isNull(dtlR.upri_rate())) {
				setTrdCurUpri(dtlR);
			}
			else if (!isNull(dtlR.trd_cur_upri())) {
				setUpriRate(dtlR);
			}
		}
	}
	
	/**
	 * 仕切単価に関連する金額を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setTrdCurAmt(DtlR dtlR) {
		
		MCRow amtR = MAUCP_AmtUtil.getAmtAndTax(
				dtlR.trd_cur_upri()
				, dtlR.trd_unit_qty()
				, dtlR.tax_rate()
				, dtlR.inc_tax_flg()
				, getHdrR().trd_cur_amt_dec_place()
				, getHdrR().sls_amt_rnd_typ()
				, getHdrR().sls_tax_rnd_typ()
				, dtlR.trd_cur_dscnt_amt()
				);
		
		setValueEx(columnDtl_trd_cur_amt, dtlR.getGUIIndex(), amtR.getNumberNE("amt"));
		setValueEx(columnDtl_trd_cur_inc_tax_amt, dtlR.getGUIIndex(), amtR.getNumberNE("inc_tax_amt"));
		setValueEx(columnDtl_trd_cur_tax_amt, dtlR.getGUIIndex(), amtR.getNumberNE("tax_amt"));
	}
	
	/**
	 * 原価単価のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_cost_upri_NC(MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		setCostAmt(r);
		setProfRate(r);
		setHdrAmt();
	}
	
	/**
	 * 基準通貨仕切金額のNotificationChangeイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_base_cur_amt_NC(MCEventInfo info) {
		
		DtlR r = getDtlL().get(info.getEventIndex());
		setProfRate(r);
		setHdrAmt();
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
	 * 原価金額を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setCostAmt(DtlR dtlR) {
		
		MCNumber costAmt = null;
		if (!isNullOr(dtlR.cost_upri(), dtlR.base_unit_qty())) {
			
			costAmt = MSUCP_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), getBaseCur().amt_dec_place());
		}
		setValueEx(columnDtl_cost_amt, dtlR.getGUIIndex(), costAmt);
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
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			
			if (isNull(r.trd_cur_amt())) {
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
		
		getHdrR().prof_rate(MSUCP_SlsUtil.getProfRate(base_cur_ttl_amt, cost_amt));
	}
	
	/**
	 * ヘッダの取引通貨税込金額の設定
	 */
	protected void setHdrIncTaxAmt() {
		
		MCNumber trd_cur_inc_tax_amt = null;
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {

			if (isNull(r.trd_cur_inc_tax_amt())) {
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
	 * 明細の粗利率を設定する。
	 * @param dtlR 見積明細
	 */
	protected void setProfRate(DtlR dtlR) {
		
		dtlR.prof_rate(MSUCP_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		if (info.getEventIndex() < 0) {
			return;
		}
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		setBtnMode(dtlR);
	}
	
	/**
	 * 明細の選択行に応じて、ボタンモードを設定する。
	 * @param dtlR 見積明細
	 */
	protected void setBtnMode(DtlR dtlR) {

		if (isTrnst(dtlR) || isAprv()) {
			
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
		
//		if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(dtlR.comp_spec_typ())) {
//			
//			Btn_open_MSBBP1150.setMode(MCMode.DISABLE);
//		}
//		else {
//			setDefaultMode(Btn_open_MSBBP1150);
//		}
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$qtn_no);
			list.add(HdrR.$qtn_rev);
			list.add(HdrR.$can_flg);
			list.add(HdrR.$valid_dt);
			list.add(HdrR.$qtn_out_flg);
			list.add(HdrR.$qtn_prnt_flg);
			list.add(HdrR.$qtn_prnt_dt);
			list.add(HdrR.$failure_flg);
			list.add(HdrR.$aprv_flg);
			list.add(HdrR.$aprv_back_flg);
			list.add(HdrR.$aprv_no);
			list.add(HdrR.$aprv_sts_typ);
			list.add(HdrR.$aprv_sts_typ_nm);
			list.add(HdrR.$aprv_upd_flg);
			list.add(HdrR.$aprv_can_flg);
			list.add(HdrR.$qtn_rslt_rsn_cd);
			list.add(HdrR.$qtn_rslt_rsn_nm);
			list.add(HdrR.$qtn_rslt_rsn_rmrks);
			
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$qtn_d_no);
			list.add(DtlR.$qtn_d_rslt_rsn_cd);
			list.add(DtlR.$qtn_d_rslt_rsn_nm);
			list.add(DtlR.$qtn_d_rslt_rsn_rmrks);
			list.add(DtlR.$trnst_qty);
		}

		return list;
	}

	/**
	 * 登録枠の取消ＦＬＧの画面部品を返します。<br>
	 * 取消データを照会できるアプリでオーバーライドします。
	 * 
	 * @return　登録枠の取消ＦＬＧ画面部品
	 */
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}
	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL1110_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_qtn]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_qtn(MCEventInfo info) {
		callMS_MSBBL1110_Prnt01();
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
		
		setHdrAmt();
		
		setHdrIncTaxAmt();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		
		copyRow(DtlTable);
		
		setHdrAmt();
		
		setHdrIncTaxAmt();
	}
	
	/**
	 * Panel[Btn]のボタン[sprt_srch_upri]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_srch_upri(MCEventInfo info) {
		callMS_MSBBL1110_Sprt01();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.putCnd(crtOpenMSBBP1210CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 受注登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = 
				(mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg)aso.getPanel();
		
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();
		
		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_no(getHdrR().qtn_no());
		to.srch_tgt_rev(getHdrR().qtn_rev());
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1310(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1310");
		aso.putCnd(crtOpenMSBBP1310CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 売上実績登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1310.CndR crtOpenMSBBP1310CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg p = 
				(mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg)aso.getPanel();
		
		mcframe.clientMSBB.MSBBP1310.CndR to = mcframe.clientMSBB.MSBBP1310.CndR.create();
			
		to.ope(p.Cnd_ope_INS.getActionCommand());
		
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.QTN_NO.name());
		to.srch_tgt_no(getHdrR().qtn_no());
		to.srch_tgt_rev(getHdrR().qtn_rev());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1110_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1110_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1110_Del01();
	}
	
	/**
	 * インボイス取引得意先かどうか。
	 * @return インボイス取引先の場合はture
	 */
	protected boolean isCstIv() {
		
		return getHdrR().cst_iv_flg();
	}
	
	/**
	 * 指定されたカラムは納品先カラムかどうか。
	 * @param column　MCColumnConfig
	 * @return 納品先の場合はtrue
	 */
	protected boolean isDlvColumns(MCColumnConfig column) {

		return column == columnDtl_dlv_nm
				|| column == columnDtl_dlv_zip_cd
				|| column == columnDtl_dlv_addr1
				|| column == columnDtl_dlv_addr2
				|| column == columnDtl_dlv_addr3
				|| column == columnDtl_dlv_addr4
				|| column == columnDtl_dlv_cntct_dpt
				|| column == columnDtl_dlv_cntct_psn
				|| column == columnDtl_dlv_tel
				|| column == columnDtl_dlv_fax
				|| column == columnDtl_dlv_sundry_flg
				|| column == columnDtl_dlv_cntry_cd
				|| column == columnDtl_dlv_cntry_nm;
	}

//--------------------------ロウリスナー--------------------------------------

	protected MAUDP_RowListener createDtlListListener() {
		return new DtlListRowListener();
	}
	
	protected class DtlListRowListener extends MAUDP_RowListener {
		
		@Override
		public void statusChanged(mcframe.clientCore.container.MCRowStatusEvent event) {
			super.statusChanged(event);
			
			if (event.getNewStatus() == Status.CREATE
					&& event.getOldStatus() == Status.NONE) {
					
				DtlR dtl = (DtlR) event.getSourceRow();
				setDtlDefValue(dtl);
			}
		}
	}
	
	/**
	 * 明細行のステータスが新規に変わった時に、ヘッダの納品先、仕向先を明細行に設定する。
	 * @param dtlR 明細Row
	 */
	protected void setDtlDefValue(DtlR dtlR) {
		
		if (isNull(dtlR.dlv_cd())) {
			
			HdrR hdr = getHdrR();
			dtlR.dlv_cd(hdr.dlv_cd());
			dtlR.dlv_nm(hdr.dlv_nm());
			dtlR.dlv_sundry_flg(hdr.dlv_sundry_flg());
			dtlR.pri_prnt_flg(hdr.pri_prnt_flg());
			dtlR.dlv_cntry_nm(hdr.dlv_cntry_nm());
			dtlR.dlv_lg_grp_cd(hdr.dlv_lg_grp_cd());
			dtlR.dlv_lg_grp_nm(hdr.dlv_lg_grp_nm());
			setValueEx(columnDtl_dlv_nm, dtlR.getGUIIndex(), getHdrR().dlv_nm());
			setValueEx(columnDtl_dlv_zip_cd, dtlR.getGUIIndex(), getHdrR().dlv_zip_cd());
			setValueEx(columnDtl_dlv_addr1, dtlR.getGUIIndex(), getHdrR().dlv_addr1());
			setValueEx(columnDtl_dlv_addr2, dtlR.getGUIIndex(), getHdrR().dlv_addr2());
			setValueEx(columnDtl_dlv_addr3, dtlR.getGUIIndex(), getHdrR().dlv_addr3());
			setValueEx(columnDtl_dlv_addr4, dtlR.getGUIIndex(), getHdrR().dlv_addr4());
			setValueEx(columnDtl_dlv_cntct_dpt, dtlR.getGUIIndex(), getHdrR().dlv_cntct_dpt());
			setValueEx(columnDtl_dlv_cntct_psn, dtlR.getGUIIndex(), getHdrR().dlv_cntct_psn());
			setValueEx(columnDtl_dlv_tel, dtlR.getGUIIndex(), getHdrR().dlv_tel());
			setValueEx(columnDtl_dlv_fax, dtlR.getGUIIndex(), getHdrR().dlv_fax());
			setValueEx(columnDtl_dlv_cntry_cd, dtlR.getGUIIndex(), getHdrR().dlv_cntry_cd());
			setValueEx(columnDtl_prnt_lcl_cd, dtlR.getGUIIndex(), getHdrR().prnt_lcl_cd());
		}

		if (isNull(dtlR.dest_cd1())) {
			setValueEx(columnDtl_dest_cd1, dtlR.getGUIIndex(), getHdrR().dest_cd1());
		}
		
		if (isNull(dtlR.dest_cd2())) {
			setValueEx(columnDtl_dest_cd2, dtlR.getGUIIndex(), getHdrR().dest_cd2());
		}
		
		if (isNull(dtlR.dest_cd3())) {
			setValueEx(columnDtl_dest_cd3, dtlR.getGUIIndex(), getHdrR().dest_cd3());
		}
	}
//--------------------------ロウリスナー--------------------------------------
	
//--------------------------------セルコンフィグ--------------------------------	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected DtlTableCellConfig createDtlTableCellConfig() {

		return new DtlTableCellConfig();
	}

	protected class DtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			DtlR dtlR = getDtlL().get(index);
			
			if (column != columnDtl_trd_unit_qty 
					&& column != columnDtl_intr_rmrks
					&& column != columnDtl_qtn_d_rslt_rsn_cd
					&& column != columnDtl_qtn_d_rslt_rsn_rmrks
					&& column != columnDtl_sub_char1
					&& column != columnDtl_sub_char2
					&& column != columnDtl_sub_char3) {
				
				if (isTrnst(dtlR)) {
					return MCMode.READ_ONLY;
				}
			}

			if (column != columnDtl_gd_cd
					&& column != columnDtl_intr_rmrks
					&& column != columnDtl_qtn_d_rslt_rsn_cd
					&& column != columnDtl_qtn_d_rslt_rsn_rmrks
					&& column != columnDtl_cst_qtn_rqst_d_no
					&& column != columnDtl_sub_char1
					&& column != columnDtl_sub_char2
					&& column != columnDtl_sub_char3) {
				
				if (isAprv()) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl_trd_cur_upri) {
				
				if (isNull(dtlR.trd_cur_std_sls_upri())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_dest_cd2) {
				
				if (isNull(dtlR.dest_cd1())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_dest_cd3) {
				
				if (isNull(dtlR.dest_cd2())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_iv_itm_nm) {
				
				if (!isCstIv()) {
					return MCMode.INVISIBLE;
				}
				else if(!dtlR.sundry_itm_flg()){
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty 
					|| column == columnDtl_upri_rate || column == columnDtl_trd_cur_upri) {
				if (dtlR.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_gd_cd) {
				if (!MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
//--------------------------------セルコンフィグ--------------------------------

}