package mcframe.clientMSBB.MSBBP1370;

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
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
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
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg;
import mcframe.clientMSBB.MSBBP1340.MSBBP_SlsRetReg;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import java.util.Map;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsDtlModReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsDtlModReg_MC extends MSBBP_SlsDtlModReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsDtlModReg_MC() {
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
	public MSBBP_SlsDtlModReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1370_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt01Caller<P extends MSBBP_SlsDtlModReg, B extends MS_MSBBL1370_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBBL1370_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0019); 
		}

		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			return getSrchL();
		}

		@Override
		protected void checkReq(MCMessageList msgList, MCContainer cont) {
			super.checkReq(msgList, cont);
			msgList.addAll(panel.checkReq(UpriBulkSet_upri_dt));
			for (DtlR r : getSrchL()) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd,
						columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
						columnDtl_cst_cd, columnDtl_schd_trd_unit_cd, columnDtl_trd_unit_qty_for_upri,
						columnDtl_trd_cur_cd));
			}
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			addAll(bridge.up0(), getSrchL(), createMap_UpriSrchR_DtlR());
		}

		@Override
		protected void show() {
			getUpriSrchL().clear();

			showMerge();
			for (UpriSrchR r : getUpriSrchL()) {
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), r.sls_upri());
				setValueEx(columnDtl_interim_flg, r.getGUIIndex(), r.interim_flg());
			}
		}

		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBBP0020));
		}

		/**
		 * 検索対象の明細を取得する
		 * @return
		 */
		protected MCList<DtlR> getSrchL() {

			MCList<DtlR> ret = MCList.create(DtlR.class);
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				else if (isSlsDscnt(r.trd_ptn_typ())) {
					continue;
				}
				else if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
					continue;
				}
				else if (MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.comp_spec_typ())) {
					continue;
				}
				else if (r.dscnt_itm_flg()) {
					continue;
				}
				else if (r.sls_acxfr_flg()) {
					continue;
				}
				else if (!isNull(r.schd_trd_unit_cd()) && !isSame(r.trd_unit_cd(), r.schd_trd_unit_cd())) {
					continue;
				}

				ret.add(r);
			}

			return ret;
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
				addColumnPathMap(UpriSrchR.$grp_no, DtlR.$sls_act_no);
				addColumnPathMap(UpriSrchR.$wg_cd, DtlR.$wg_cd);
				addColumnPathMap(UpriSrchR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(UpriSrchR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(UpriSrchR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(UpriSrchR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(UpriSrchR.$cst_cd, DtlR.$cst_cd);
				addColumnPathMap(UpriSrchR.$dlv_cd, DtlR.$dlv_cd);
				addColumnPathMap(UpriSrchR.$dest_cd1, DtlR.$dest_cd1);
				addColumnPathMap(UpriSrchR.$dest_cd2, DtlR.$dest_cd2);
				addColumnPathMap(UpriSrchR.$dest_cd3, DtlR.$dest_cd3);
				addColumnPathMap(UpriSrchR.$trd_unit_cd, DtlR.$schd_trd_unit_cd);
				addColumnPathMap(UpriSrchR.$trd_unit_qty, DtlR.$trd_unit_qty_for_upri);
				addColumnPathMap(UpriSrchR.$trd_cur_cd, DtlR.$trd_cur_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 単価採用日付はクライアントで判定する
				if (!isNull(getUpriBulkSetR().upri_dt())) {
					dest.dt(getUpriBulkSetR().upri_dt());
				}
				else if (isNull(src.slo_d_no())) {
					dest.dt(src.sls_dt());
				}
				else {
					if (MAC_SLS_UPRI_REQ_TYP.isSLO_DT(src.sls_upri_req_typ())) {
						dest.dt(src.slo_dt());
					}
					else if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(src.sls_upri_req_typ())) {
						dest.dt(src.dlv_rqst_dt());
					}
					else if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(src.sls_upri_req_typ())) {
						dest.dt(src.sls_schd_dt());
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBBL1370_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt02Caller<P extends MSBBP_SlsDtlModReg, B extends MS_MSBBL1370_Sprt02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBBL1370_Sprt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0021);
		}
		
		@Override
		protected boolean checkForCall() {
			// 明細が選択されていない場合
			if (getDtlL().subList(DtlR.$check, true).isEmpty()) {
				panel.dialog(msgNoCheckedRow());
				return false;
			}
			// 基準通貨以外の明細が選択されていない場合
			else if (getSrchL().isEmpty()) {
				panel.dialog(new MCMessage(MSBBP0023));
				return false;
			}
			
			return true;
		}
		
		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			return getSrchL();
		}

		@Override
		protected void checkReq(MCMessageList msgList, MCContainer cont) {
			super.checkReq(msgList, cont);
			msgList.addAll(panel.checkReq(XrateBulkSet_xrate_dt));
			for (DtlR r : getSrchL()) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_trd_cur_cd));
			}
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			addAll(bridge.up0(), getSrchL(), createMap_XrateSrchR_DtlR());
		}

		@Override
		protected void show() {
			getXrateSrchL().clear();

			showMerge();
			for (XrateSrchR r : getXrateSrchL()) {
				setValueEx(columnDtl_xrate, r.getGUIIndex(), r.xrate());
			}
		}

		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBBP0022));
		}
		
		/**
		 * 検索対象の明細を取得する
		 * @return
		 */
		protected MCList<DtlR> getSrchL() {

			MCList<DtlR> ret = MCList.create(DtlR.class);
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				else if (isSame(r.trd_cur_cd(), r.base_cur_cd())) {
					continue;
				}
				ret.add(r);
			}

			return ret;
		}

		/**
		 * 	RowMapper
		 * @return
		 */
		protected Map_XrateSrchR_DtlR<XrateSrchR, DtlR> createMap_XrateSrchR_DtlR() {
			return new Map_XrateSrchR_DtlR<XrateSrchR, DtlR>();
		}

		public class Map_XrateSrchR_DtlR<D extends XrateSrchR, S extends DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XrateSrchR.$trd_cur_cd, DtlR.$trd_cur_cd);
				addColumnPathMap(XrateSrchR.$xrate, DtlR.$xrate);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xrate_dt(getXrateBulkSetR().xrate_dt());
			}
		}
	}

	/**
	 * [MS_MSBBL1370_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Sprt03Caller<P extends MSBBP_SlsDtlModReg, B extends MS_MSBBL1370_Sprt03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBBL1370_Sprt03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0024);
		}

		@Override
		protected MCList getCheckedRows(IfListRegPanel p) {
			return getSrchL();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(TaxBulkSet_tax_dt));
			for (DtlR r : getDtlL().subList(DtlR.$check, true)) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_cst_cd,
						columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
						columnDtl_itm_sub3));
			}
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().clear();
			addAll(bridge.up0(), getSrchL(), createMap_TaxSrchR_DtlR());
		}

		@Override
		protected void show() {
			getTaxSrchL().clear();
			// GUIIndexを保持しておきたいため、super.show()は呼ばない
			showMerge();

			for (TaxSrchR r : getTaxSrchL()) {
				DtlR dtlR = getDtlL().get(r.getGUIIndex());
				dtlR.tax_cd(r.tax_cd());
				dtlR.tax_nm(r.tax_nm());
				dtlR.tax_rate(r.tax_rate());
				dtlR.tax_typ(r.tax_typ());
				dtlR.inc_tax_flg(r.inc_tax_flg());
				
				MCNumber tmpUpri = dtlR.trd_cur_upri();
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), null);
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), tmpUpri);
			}
		}

		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBBP0025));
		}

		/**
		 * 検索対象の明細を取得する
		 * @return
		 */
		protected MCList<DtlR> getSrchL() {

			MCList<DtlR> ret = MCList.create(DtlR.class);
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					continue;
				}
				else if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
					continue;
				}
				ret.add(r);
			}

			return ret;
		}

		/**
		 * RowMapper
		 * @return
		 */
		protected Map_TaxSrchR_DtlR<TaxSrchR, DtlR> createMap_TaxSrchR_DtlR() {
			return new Map_TaxSrchR_DtlR<TaxSrchR, DtlR>();
		}

		public class Map_TaxSrchR_DtlR<D extends TaxSrchR, S extends DtlR> extends
				MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(TaxSrchR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(TaxSrchR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(TaxSrchR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(TaxSrchR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(TaxSrchR.$cst_cd, DtlR.$cst_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tax_dt(getTaxBulkSetR().tax_dt());
			}
		}
	}

	/**
	 * [MS_MSBBL1370_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Upd01Caller<P extends MSBBP_SlsDtlModReg, B extends MS_MSBBL1370_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1370_Upd01Caller(P p, B b) {
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
			bridge.up0().setBooleanNE(DtlR.$prnt_out_flg, getBtnR().prnt_out_flg());
		}

	}

	/**
	 * [MS_MSBBL1370_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1370_Srch01Caller<P extends MSBBP_SlsDtlModReg, B extends MS_MSBBL1370_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1370_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
		}

		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(SrchTypPanel));
			msgList.addAll(checkAtLeastOne(IvPanel));
			if (!Cnd_disp_unit_HDR.isSelected()) {
				msgList.addAll(checkAtLeastOne(UpriPanel));
			}
			if (getCndR().sls_dscnt()) {
				msgList.addAll(checkAtLeastOne(AprvStsPanel));
			}
		}

		@Override
		protected void show() {
			super.show();
			// 検索後ステータスでは、検索枠を表示しない
			Ctrl_ctrl_PPanel.expand(false);
			setPrntOutFlgTyp();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			for (DtlR r : bridge.down0()) {
				// 計上日を取消計上日にコピー
				r.can_ac_dt(r.ac_dt());
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else if (Cnd_disp_unit_IO.isSelected()) {
				setREF_IOStatus();
			}
			else if (Cnd_disp_unit_DTL.isSelected()) {
				setREF_DTLStatus();
			}
			else if (Cnd_disp_unit_HDR.isSelected()) {
				setREF_HDRStatus();
			}

		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * Panel[UpriBulkSet]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doUpriBulkSet_select_all(MCEventInfo info) {
		for (DtlR row : getDtlL()) {
			int i = row.getGUIIndex();
			if (isEditable(columnDtl_check, i) && row.check()
					&& !isSlsDscnt(row.trd_ptn_typ()) && !(isSls(row.trd_ptn_typ()) && row.cst_iv_flg())) {
				setValueEx(columnDtl_interim_flg, i, true);
			}
		}
	}

	/**
	 * Panel[UpriBulkSet]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doUpriBulkSet_deselect_all(MCEventInfo info) {
		for (DtlR row : getDtlL()) {
			int i = row.getGUIIndex();
			if (isEditable(columnDtl_check, i) && row.check()
					&& !isSlsDscnt(row.trd_ptn_typ()) && !(isSls(row.trd_ptn_typ()) && row.cst_iv_flg())) {
				setValueEx(columnDtl_interim_flg, i, false);
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1370_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBBL1370_Srch01().execDL();
	}

	/**
	 * Panel[UpriBulkSet]のボタン[upri_replace]の押下時の処理
	 */
	@Override
	public void doUpriBulkSet_upri_replace(MCEventInfo info) {
		callMS_MSBBL1370_Sprt01();
	}

	/**
	 * Panel[XrateBulkSet]のボタン[xrate_replace]の押下時の処理
	 */
	@Override
	public void doXrateBulkSet_xrate_replace(MCEventInfo info) {
		callMS_MSBBL1370_Sprt02();
	}

	/**
	 * Panel[TaxBulkSet]のボタン[tax_replace]の押下時の処理
	 */
	@Override
	public void doTaxBulkSet_tax_replace(MCEventInfo info) {
		callMS_MSBBL1370_Sprt03();
	}

	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {

		DtlR row = DtlTable.getSelectedMCRow();
		MAUCP_AppScreenOpener aso;

		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}

		if (isSls(row.trd_ptn_typ())) {

			if (!isNullOrNullVal(row.iv_no()) && row.cst_iv_flg()) {
				aso = new MAUCP_AppScreenOpener("MS", "MSBEP1730");
				aso.putCnd(crtOpenMSBB1730CndR(aso, row));
				aso.putSearchAction();
				aso.show();
			}
			else if (!isNull(row.purc_ddlv_po_no()) || row.ddlv_sls_flg()) {
				aso = new MAUCP_AppScreenOpener("MS", "MSBBP1360");
				aso.putCnd(crtOpenMSBB1360CndR(aso, row));
				aso.putSearchAction();
				aso.show();
			}
			else {
				aso = new MAUCP_AppScreenOpener("MS", "MSBBP1310");
				aso.putCnd(crtOpenMSBB1310CndR(aso, row));
				aso.putSearchAction();
				aso.show();
			}
		}

		else if (isSlsRtn(row.trd_ptn_typ())) {

			aso = new MAUCP_AppScreenOpener("MS", "MSBBP1340");
			aso.putCnd(crtOpenMSBB1340CndR(aso, row));
			aso.putSearchAction();
			aso.show();

		}
		else if (isSlsDscnt(row.trd_ptn_typ())) {

			aso = new MAUCP_AppScreenOpener("MS", "MSBBP1380");
			aso.putCnd(crtOpenMSBB1380CndR(aso, row));
			aso.putSearchAction();
			aso.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (DtlR r : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_check, r.getGUIIndex()) && !r.check()) {
				setValueEx(columnDtl_check, r.getGUIIndex(), true);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (DtlR r : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_check, r.getGUIIndex()) && r.check()) {
				setValueEx(columnDtl_check, r.getGUIIndex(), false);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1370_Upd01();
	}
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg rootP =
				(mcframe.clientMSBB.MSBBP1370.MSBBP_SlsDtlModReg)panel;
		if(!rootP.Cnd_ope_REF.isSelected() || !rootP.Cnd_disp_unit_HDR.isSelected()) {
			dialog(MSBBP0105);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg)aso.getPanel();
			p.screenOpen(rootP, args);
	}
	@Override
	protected void setupParts() {
		super.setupParts();

		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		
		// 売上明細訂正は単価変更許可ＦＬＧに関わらず、単価・金額を変更可能とする。
		Dtl_trd_upri_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_cst_cd,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty,
				columnDtl_trd_cur_amt_dec_place, columnDtl_trd_cur_upri_dec_place,
				columnDtl_sls_amt_rnd_typ, columnDtl_sls_tax_rnd_typ,
				null, null, columnDtl_dscnt_itm_flg);
		
		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);

		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_trd_cur_upri_dec_place);

		Dtl_trd_unit_qty_for_upri_p_PPanel.setRelateBeans(columnDtl_schd_trd_unit_cd,
				columnDtl_trd_unit_dec_place);
		Dtl_prof_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_trd_cur_amt_dec_place);
		
		Dtl_sls_cost_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_upri_dec_place);
		
		Dtl_sls_cost_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place);

		Dtl_base_cur_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_upri,
				columnDtl_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_amt, columnDtl_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, columnDtl_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, columnDtl_xrate);
		Dtl_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt, columnDtl_xrate);

		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_amt_dec_place, columnDtl_trd_cur_dscnt_amt,
				columnDtl_ptax_xrate);

		Dtl_CstGrp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Dtl_DlvGrp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Dtl_BcstGrp_p_PPanel.setRelateBeans(Cnd_bcst_grp_p_PPanel);
		Dtl_AcstGrp_p_PPanel.setRelateBeans(Cnd_acst_grp_p_PPanel);

		Dtl_wtax_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_trd_cur_amt_dec_place);
		Dtl_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_base_cur_cd,
				columnDtl_xrate_cd, columnDtl_sls_dt, true);
		
		// 計上日変更により部門をクリアしない
		Dtl_usr_dpt_p_PPanel.setRelateBeans(columnDtl_ac_dt, columnDtl_sls_act_no);
	}

	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setModeSRCH();
		setModeSignRevFlg();
		setModeAprvSts();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setModeSRCH();
		setModeSignRevFlg();
		setModeAprvSts();
		setIoSubCharMode();
		FoldTab.focusActiveFirstComponent();
		setModeTrdCurIncTaxAmt();
		setModeToIncPastFlg();
	}

	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setModeAprvSts();
		DtlTable.selectLeftmostColumn(0);
		setModeTrdCurIncTaxAmt();
		setModeToIncPastFlg();
	}

	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
		setModeAprvSts();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setREF_IOStatus() {
		super.setREF_IOStatus();
		setModeAprvSts();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {

		Cnd_sls.setValue(true);
		Cnd_sls_ret.setValue(true);
		Cnd_sls_dscnt.setValue(true);

		Cnd_interim_flg.setValue(true);
		Cnd_not_interim_flg.setValue(true);

		Cnd_iv_tgt_flg.setValue(true);
		Cnd_iv_not_tgt_flg.setValue(true);

		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(XrateBulkSetPanel);
		}
	}
	/**
	 * 検索前種別選択時のモード設定
	 */
	protected void setModeSRCH() {

		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_disp_unit_Group, Cnd_disp_unit_DTL.getActionCommand());
			Cnd_disp_unit_Group.setMode(MCMode.READ_ONLY);

			Cnd_dis_can_disp_flg.setValue(false);
			Cnd_dis_can_disp_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_dis_can_disp_flg.setMode(MCMode.REQUIRED);
		}
	}

	/**
	 * 検索モードによる符号判定ＦＬＧのモード制御
	 */
	protected void setModeSignRevFlg() {

		if (Cnd_ope_UPD.isSelected() || Cnd_disp_unit_HDR.isSelected()) {
			Cnd_sign_rev_flg.setMode(MCMode.READ_ONLY);
			Cnd_sign_rev_flg.setValue(false);
		}
		else {
			Cnd_sign_rev_flg.setMode(MCMode.REQUIRED);
		}
	}

	/**
	 * 各承認ステータスＦＬＧのモード制御
	 */
	protected void setModeAprvSts() {
		if (!getCndR().sls_dscnt()) {
			Cnd_opn_flg.setMode(MCMode.READ_ONLY);
			Cnd_fix_flg.setMode(MCMode.READ_ONLY);
			Cnd_acpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_rjct_flg.setMode(MCMode.READ_ONLY);
			Cnd_last_rjct_flg.setMode(MCMode.READ_ONLY);
			Cnd_not_aprv_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				Cnd_opn_flg.setMode(MCMode.READ_ONLY);
				Cnd_fix_flg.setMode(MCMode.READ_ONLY);
				Cnd_rjct_flg.setMode(MCMode.READ_ONLY);
				Cnd_last_rjct_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cnd_opn_flg);
				setDefaultMode(Cnd_fix_flg);
				setDefaultMode(Cnd_rjct_flg);
				setDefaultMode(Cnd_last_rjct_flg);
			}
			setDefaultMode(Cnd_acpt_flg);
			setDefaultMode(Cnd_not_aprv_flg);
		}
	}
	
	/**
	 * 詳細予備１～３のモードを設定する。
	 */
	protected void setIoSubCharMode() {

		if (!Cnd_disp_unit_IO.isSelected()) {
			
			Cnd_io_sub_char1.setMode(MCMode.READ_ONLY);
			Cnd_io_sub_char2.setMode(MCMode.READ_ONLY);
			Cnd_io_sub_char3.setMode(MCMode.READ_ONLY);
		}
		else {
			
			setDefaultMode(Cnd_io_sub_char1);
			setDefaultMode(Cnd_io_sub_char2);
			setDefaultMode(Cnd_io_sub_char3);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_trd_cur_upri.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_sls_usr_cd.addLCListener(this);
		columnDtl_sls_dpt_cd.addLCListener(this);
		columnDtl_xrate.addLCListener(this);
		columnDtl_sls_cost_upri.addLCListener(this);
	}
	
	protected void setCostAmt(DtlR r) {
		
		MCNumber cost_amt = null;
		if (!isNullOr(r.sls_cost_upri(), r.base_unit_qty())) {
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.sls_cost_upri(), r.base_unit_qty(), getBaseCur().amt_dec_place());
			cost_amt = MSUCP_SlsUtil.getCostAmt(r.sls_cost_upri(), r.base_unit_qty(), r.base_cur_amt_dec_place());
		}
		setValueEx(columnDtl_sls_cost_amt, r.getGUIIndex(), cost_amt);
		setProfRate(r);
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（登録直後）、REF（検索モード）では、クリア確認出さない
			if (!isSame(getStatus(), UPD) || isStatusNone(getDtlL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には登録枠以外をクリアする
		clearContainers(getDtlL(), getUpriBulkSetR(), getXrateBulkSetR(),
				getTaxBulkSetR());

		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();

		setValueAprvSts();
		setSRCHStatus();
		setIndivPrnt();
		setModeTrdCurIncTaxAmt();
		setValueEx(Btn_prnt_out_flg, false);
	}
	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}

	protected void clearCnd() {
		if (Cnd_disp_unit_HDR.isSelected()) {
			setBoolean(IvPanel, true);
			setBoolean(UpriPanel, true);
			
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_typ_d_nm, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_sublot_no, null);
			setValueEx(Cnd_sno1, null);
			setValueEx(Cnd_sno2, null);
			setValueEx(Cnd_sno3, null);
			setValueEx(Cnd_sno4, null);
			setValueEx(Cnd_wrk_no, null);
			setValueEx(Cnd_wrk_nm, null);
			setValueEx(Cnd_tax_cd, null);
			setValueEx(Cnd_tax_nm, null);
			setValueEx(Cnd_cst_po_d_no, null);
			setValueEx(Cnd_tdlv_cd, null);
			setValueEx(Cnd_tdlv_nm, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_cst_itm_nm, null);
			setValueEx(Cnd_gd_cd, null);
			setValueEx(Cnd_gd_nm, null);
			setValueEx(Cnd_trd_d_rmrks, null);
			setValueEx(Cnd_intr_d_rmrks, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			setValueEx(Cnd_io_sub_char1, null);
			setValueEx(Cnd_io_sub_char2, null);
			setValueEx(Cnd_io_sub_char3, null);
			setValueEx(Cnd_ext_purc_act_d_no, null);
			
			setValueEx(Cnd_dlv_grp_flg1, false);
			setValueEx(Cnd_dlv_grp_cd1, null);
			setValueEx(Cnd_dlv_grp_flg2, false);
			setValueEx(Cnd_dlv_grp_cd2, null);
			setValueEx(Cnd_dlv_grp_flg3, false);
			setValueEx(Cnd_dlv_grp_cd3, null);
			setValueEx(Cnd_dlv_grp_flg4, false);
			setValueEx(Cnd_dlv_grp_cd4, null);
			setValueEx(Cnd_dlv_grp_flg5, false);
			setValueEx(Cnd_dlv_grp_cd5, null);
			setValueEx(Cnd_dlv_grp_flg6, false);
			setValueEx(Cnd_dlv_grp_cd6, null);
			setValueEx(Cnd_dlv_grp_flg7, false);
			setValueEx(Cnd_dlv_grp_cd7, null);
			setValueEx(Cnd_dlv_grp_flg8, false);
			setValueEx(Cnd_dlv_grp_cd8, null);
			setValueEx(Cnd_dlv_grp_flg9, false);
			setValueEx(Cnd_dlv_grp_cd9, null);
			setValueEx(Cnd_dlv_grp_flg10, false);
			setValueEx(Cnd_dlv_grp_cd10, null);
			setValueEx(Cnd_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_cd1, null);
			setValueEx(Cnd_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_cd2, null);
			setValueEx(Cnd_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_cd3, null);
			setValueEx(Cnd_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_cd4, null);
			setValueEx(Cnd_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_cd5, null);
			setValueEx(Cnd_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_cd6, null);
			setValueEx(Cnd_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_cd7, null);
			setValueEx(Cnd_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_cd8, null);
			setValueEx(Cnd_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_cd9, null);
			setValueEx(Cnd_itm_grp_flg10, false);
			setValueEx(Cnd_itm_grp_cd10, null);
			
		}
		else {
			setBoolean(IvPanel, true);
			setValueEx(Cnd_inc_past_flg, false);
			if (Cnd_disp_unit_DTL.isSelected()) {
				
				setValueEx(Cnd_io_sub_char1, null);
				setValueEx(Cnd_io_sub_char2, null);
				setValueEx(Cnd_io_sub_char3, null);
			}
		}
	}
	
	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);
		
		clearContainers(getDtlL());
		
		clearCnd();
		
		setSrchStatus();
		
		setModeSignRevFlg();

		setModeTrdCurIncTaxAmt();
	}

	protected void setModeTrdCurIncTaxAmt() {

		if(Cnd_disp_unit_HDR.isSelected()) {
			columnDtl_trd_cur_inc_tax_amt.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(columnDtl_trd_cur_inc_tax_amt);
		}
	}
	
	/**
	 * 表示単位に対応する検索ステータスに設定する。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_disp_unit_HDR.isSelected()) {
			setSRCH_HDRStatus();
			setModeAprvSts();
		}
		else {
			setSRCHStatus();
		}
		
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void doCnd_sls_dscnt_NC(MCEventInfo info) {
		super.doCnd_sls_dscnt_NC(info);
		setValueAprvSts();
		setModeAprvSts();
	}
	
	protected void setValueAprvSts() {
		if (!getCndR().sls_dscnt()) {
			Cnd_opn_flg.setValue(false);
			Cnd_fix_flg.setValue(false);
			Cnd_acpt_flg.setValue(false);
			Cnd_rjct_flg.setValue(false);
			Cnd_last_rjct_flg.setValue(false);
			Cnd_not_aprv_flg.setValue(true);
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				Cnd_opn_flg.setValue(false);
				Cnd_fix_flg.setValue(false);
				Cnd_acpt_flg.setValue(true);
				Cnd_rjct_flg.setValue(false);
				Cnd_last_rjct_flg.setValue(false);
				Cnd_not_aprv_flg.setValue(true);
			}
			else {
				Cnd_opn_flg.setValue(true);
				Cnd_fix_flg.setValue(true);
				Cnd_acpt_flg.setValue(true);
				Cnd_rjct_flg.setValue(true);
				Cnd_last_rjct_flg.setValue(true);
				Cnd_not_aprv_flg.setValue(true);
			}
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			doBtn_open_dtl(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		if (lc == columnDtl_sls_usr_cd) doDtl_sls_usr_cd_LC(info);
		if (lc == columnDtl_sls_dpt_cd) doDtl_sls_dpt_cd_LC(info);
		if (lc == columnDtl_xrate) doDtl_xrate_LC(info);
		if (lc == columnDtl_sls_cost_upri) doDtl_sls_cost_upri_LC(info) ;
	}
	protected void doDtl_sls_cost_upri_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setCostAmt(r);
	}
	
	protected void doDtl_sls_usr_cd_LC(MCEventInfo info) {

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		DtlR dtlR = getDtlL().get(info.getEventIndex());
		int index = 0;
		for (DtlR r : getDtlL()) {
			if (isSame(r.sls_act_no(), dtlR.sls_act_no())
					&& !isSame(r.sls_act_d_no(), dtlR.sls_act_d_no())) {
					setValueEx(columnDtl_sls_usr_cd, index, dtlR.sls_usr_cd());	
			}
			index++;
		}
	}

	protected void doDtl_sls_dpt_cd_LC(MCEventInfo info) {

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		DtlR dtlR = getDtlL().get(info.getEventIndex());
		int index = 0;
		for (DtlR r : getDtlL()) {
			if (isSame(r.sls_act_no(), dtlR.sls_act_no())
					&& !isSame(r.sls_act_d_no(), dtlR.sls_act_d_no())) {
					setValueEx(columnDtl_sls_dpt_cd, index, dtlR.sls_dpt_cd());	
			}
			index++;
		}
	}

	protected void doDtl_xrate_LC(MCEventInfo info) {

		if (!Cnd_ope_UPD.isSelected()) {
			return;
		}

		DtlR dtlR = getDtlL().get(info.getEventIndex());
		int index = 0;
		for (DtlR r : getDtlL()) {
			if (isSame(r.sls_act_no(), dtlR.sls_act_no())
					&& !isSame(r.sls_act_d_no(), dtlR.sls_act_d_no()) && !r.check()) {
					setValueEx(columnDtl_xrate, index, dtlR.xrate());	
			}
			index++;
		}
	}
	
	protected void doDtl_trd_cur_upri_LC(MCEventInfo info){
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isSame(r.trd_cur_upri(), 0) && r.sls_acxfr_flg()){
			setValueEx(columnDtl_biz_rsn_cd, info.getEventIndex(), null);
		}
	}
	
	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (!isNull(info.getNewValue())) {
			setCostAmt(r);
		}
		if (!isSame(r.trd_cur_upri(), 0) && r.sls_acxfr_flg()){
			setValueEx(columnDtl_biz_rsn_cd, info.getEventIndex(), null);
		}

		setWtaxAmt(index);
		clearDscntInfo(index);
	}
	
	/**
	 * 源泉税率が入力可能かどうか。
	 * @param dtlR 明細行
	 * @return 入力可能場合はtrue
	 */
	protected boolean isWatxRateEditable(DtlR dtlR) {
		
		if (!isNull(dtlR.trd_cur_cd()) 
				&& isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd()) 
				&& (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd()) || isNull(dtlR.ptax_cur_cd()))) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public void doDtl_ac_dt_LC(MCEventInfo info) {
		super.doDtl_ac_dt_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$ac_dt);
		
		// 計上日が変更できるのは締後のデータのみなので、取消計上日も連動させる
		row.can_ac_dt(row.ac_dt());
		propagate(row, DtlR.$can_ac_dt);
	}
	
	@Override	
	public void doDtl_bill_basis_dt_LC(MCEventInfo info) {
		super.doDtl_bill_basis_dt_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$bill_basis_dt);
	}

	@Override
	public void doDtl_sub_char1_LC(MCEventInfo info) {
		super.doDtl_sub_char1_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$sub_char1);
	}

	@Override
	public void doDtl_sub_char2_LC(MCEventInfo info) {
		super.doDtl_sub_char2_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$sub_char2);
	}

	@Override
	public void doDtl_sub_char3_LC(MCEventInfo info) {
		super.doDtl_sub_char3_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$sub_char3);
	}

	@Override
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info) {
		super.doDtl_ar_dpt_cd_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$ar_dpt_cd);
		propagate(row, DtlR.$ar_dpt_nm);
	}

	@Override
	public void doDtl_intr_rmrks_LC(MCEventInfo info) {
		super.doDtl_intr_rmrks_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$intr_rmrks);
	}

	@Override
	public void doDtl_trd_rmrks_LC(MCEventInfo info) {
		super.doDtl_trd_rmrks_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$trd_rmrks);
	}

	@Override
	public void doDtl_rcv_schd_dt_LC(MCEventInfo info) {
		super.doDtl_rcv_schd_dt_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		propagate(row, DtlR.$rcv_schd_dt);
	}
	
	@Override
	public void doDtl_biz_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_biz_rsn_cd_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (!r.sls_acxfr_flg()) {
			r.bd_dpt_cd(null);
			r.bd_dpt_nm(null);
		}
	}

	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		
		int index = info.getEventIndex();
		setWtaxAmt(index);
	}

	@Override
	public void doCnd_dis_can_disp_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_dis_can_disp_flg_NC(info);
		setModeToIncPastFlg();
	}
	
	protected void setModeToIncPastFlg() {
		if (getCndR().dis_can_disp_flg()) {
			setValueEx(Cnd_inc_past_flg, true);
			Cnd_inc_past_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_inc_past_flg.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 源泉税額を設定する。
	 * @param index インデックス
	 */
	protected void setWtaxAmt(int index) {
		
		DtlR r = getDtlL().get(index);
		
		MCNumber wtaxAmt = null;
		if (!isNull(r.wtax_rate())) {
			wtaxAmt = MAUCP_AmtUtil.getAmt(r.trd_cur_amt(), r.wtax_rate().divide(100),
					r.trd_cur_amt_dec_place(), r.wtax_rnd_typ());
		}
		setValueEx(columnDtl_wtax_amt, index, wtaxAmt);
	}

	protected void clearDscntInfo(int index) {
		DtlR r = getDtlL().get(index);
		if (isNull(r.trd_cur_amt()) || r.trd_cur_amt().isZero()) {
			r.trd_cur_dscnt_amt(null);
			r.dscnt_rsn_cd(null);
			r.dscnt_rsn_nm(null);
		}
	}

	protected void setProfRate(DtlR r) {
		if (!isNull(r.base_cur_amt()) && !isNull(r.sls_cost_amt())) {
			r.prof_rate(MSUCP_SlsUtil.getProfRate(r.base_cur_amt(), r.sls_cost_amt()));
			r.prof_amt(r.base_cur_amt().subtract(r.sls_cost_amt()));
		}
	}
	
	// ------------------------------------- CellConfig -------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected DtlTableCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * セルコンフィグ(明細テーブル)
	 */
	public class DtlTableCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (isSame(getStatus(), UPD)) {

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				// ヘッダカラムは表示順が最少の1行のみ入力可能
				if (!r.sls_close_flg() && Arrays.asList(HDR_COLS).contains(column.getBaseRowColumnName())) {
					if (!isMinDispDtl(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 売上締済の場合のヘッダカラム
				if (r.sls_close_flg() && Arrays.asList(HDR_COLS_CL).contains(column.getBaseRowColumnName())) {
					if (!isMinDispDtl(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_trd_cur_upri) {
					if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_trd_cur_amt) {
					if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_trd_cur_inc_tax_amt) {
					if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_tax_cd) {
					if (isSls(r.trd_ptn_typ()) && r.cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_trd_cur_dscnt_amt) {
					if (isSlsDscnt(r.trd_ptn_typ()) || (r.cst_iv_flg() && MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()))) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_bill_basis_dt) {
					if (MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_rcv_schd_dt) {
					if (!r.cst_iv_flg() || !MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_ar_dpt_cd) {
					if (r.cst_iv_flg() && isSls(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_bd_dpt_cd) {
					if (!r.sls_acxfr_flg() || isSlsDscnt(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_sls_cost_upri) {
					if (isSlsDscnt(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_wtax_rate) {
					if (!isWatxRateEditable(r)) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_interim_flg) {
					if (isSlsDscnt(r.trd_ptn_typ()) || (isSls(r.trd_ptn_typ()) && r.cst_iv_flg())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_biz_rsn_cd) {
					if (isSls(r.trd_ptn_typ()) && (isNull(r.trd_cur_upri()) || !r.trd_cur_upri().isZero())) {
						return MCMode.ENABLE;
					}
				}

				if (column == columnDtl_dscnt_rsn_cd) {
					if (isNull(r.trd_cur_dscnt_amt())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (!r.sls_close_flg()) {
					if (column == columnDtl_ac_dt || column == columnDtl_sls_dpt_cd || column == columnDtl_sls_usr_cd) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_base_sls_ac_dt) {
					if (!isSlsDscnt(r.trd_ptn_typ()) && !isSlsRtn(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
			}

			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 売上実績ヘッダ項目
	 */
	protected final String[] HDR_COLS = {
			DtlR.$xrate, DtlR.$sub_char1, DtlR.$sub_char2, DtlR.$sub_char3,
			DtlR.$bill_basis_dt, DtlR.$rcv_schd_dt, DtlR.$trd_rmrks, DtlR.$intr_rmrks,
			DtlR.$ar_dpt_cd
	};
	
	/**
	 * 売上実績ヘッダ項目（売上締済）
	 */
	protected final String[] HDR_COLS_CL = {
			DtlR.$ac_dt, DtlR.$sls_usr_cd, DtlR.$sls_dpt_cd,
			DtlR.$xrate, DtlR.$sub_char1, DtlR.$sub_char2, DtlR.$sub_char3,
			DtlR.$bill_basis_dt, DtlR.$rcv_schd_dt, DtlR.$trd_rmrks, DtlR.$intr_rmrks,
			DtlR.$ar_dpt_cd
	};

	protected void propagate(DtlR updRow, String col) {

		MCList<DtlR> dtlL = MCList.create(DtlR.class);
		if (updRow.cst_iv_flg() && isSls(updRow.trd_ptn_typ())) {
			dtlL = getDtlL().subList(DtlR.$iv_no, updRow.iv_no());
		}
		else {
			dtlL = getDtlL().subList(DtlR.$sls_act_no, updRow.sls_act_no());
		}
		for (DtlR r : dtlL) {
			if (r != updRow) {
				r.setValue(col, updRow.getValue(col));
				setValueEx(columnDtl_check, r.getGUIIndex(), true);
			}
		}
	}

	//---------------------------------------------- ListLogic ---------------------------------------------- 

	@Override
	public MCList<?> getDtl_biz_rsn_cd(MCRow row, MCEventInfo info) {

		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSLS_CNSGN(r.trd_ptn_typ())) {
			row.setBooleanNE(SlsAllBizRsnCols.$i_sls_flg, true);
			if (!isNull(r.trd_cur_upri()) && r.trd_cur_upri().isPositive()) {
				row.addBooleanColumn(SlsAllBizRsnCols.$i_not_sls_acxfr_flg, true);
			}
		}
		else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
			row.setBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg, true);
			if (!isNull(r.trd_cur_upri()) && r.trd_cur_upri().isPositive()) {
				row.addBooleanColumn(SlsAllBizRsnCols.$i_not_sls_acxfr_flg, true);
			}
		}
		else if (MAC_TRD_PTN_TYP.isSLS_DSCNT(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSLS_XTRA(r.trd_ptn_typ())) {
			row.setBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg, true);
		}
		return super.getDtl_biz_rsn_cd(row, info);
	}

	/**
	 * 売上伝票か判定する<br>
	 * @param trdPtnTyp 取引パタン区分
	 * @return 取引パタン区分が「売上」「貸出売上」の場合true / 左記以外はfalse
	 */
	protected boolean isSls(String trdPtnTyp) {
		return (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP
				.isSLS_CNSGN(trdPtnTyp));
	}

	/**
	 * 売上返品伝票か判定する<br>
	 * @param trdPtnTyp 取引パタン区分
	 * @return 取引パタン区分が「売上返品」の場合true / 左記以外はfalse
	 */
	protected boolean isSlsRtn(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp);
	}

	/**
	 * 売上値引伝票か判定する<br>
	 * @param trdPtnTyp 取引パタン区分
	 * @return　取引パタン区分が「売上値引」「売上値増」の場合true / 左記以外はfalse
	 */
	protected boolean isSlsDscnt(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp)
				|| MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp);
	}

	/**
	 * 	明細行で売上実績単位で表示順が最小の行か判定する
	 * @param r
	 * @return
	 */
	protected boolean isMinDispDtl(DtlR r) {

		String[] keys = {
				DtlR.$sls_act_no
		};
		Comparable<?>[] vals = {
				r.sls_act_no()
		};

		MCList<DtlR> l = getDtlL().subList(keys, vals);

		return isSame(r.disp_seq(), l.min(DtlR.$disp_seq));
	}

	protected mcframe.clientMSBB.MSBBP1360.CndR crtOpenMSBB1360CndR(
			MAUCP_AppScreenOpener aso, DtlR r) {

		MSBBP_PurcDdlvReg p = (MSBBP_PurcDdlvReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1360.CndR to = mcframe.clientMSBB.MSBBP1360.CndR.create();
		if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_rev(r.sls_act_rev());
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	protected mcframe.clientMSBE.MSBEP1730.CndR crtOpenMSBB1730CndR(
			MAUCP_AppScreenOpener aso, DtlR r) {

		MSBEP_IvReg p = (MSBEP_IvReg) aso.getPanel();

		mcframe.clientMSBE.MSBEP1730.CndR to = mcframe.clientMSBE.MSBEP1730.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.iv_no());
		return to;
	}

	protected mcframe.clientMSBB.MSBBP1310.CndR crtOpenMSBB1310CndR(
			MAUCP_AppScreenOpener aso, DtlR r) {

		MSBBP_SlsActReg p = (MSBBP_SlsActReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1310.CndR to = mcframe.clientMSBB.MSBBP1310.CndR.create();
		if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_rev(r.sls_act_rev());
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.srch_tgt_no(r.sls_act_no());

		return to;
	}

	protected mcframe.clientMSBB.MSBBP1340.CndR crtOpenMSBB1340CndR(
			MAUCP_AppScreenOpener aso, DtlR r) {

		MSBBP_SlsRetReg p = (MSBBP_SlsRetReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1340.CndR to = mcframe.clientMSBB.MSBBP1340.CndR.create();
		if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_rev(r.sls_act_rev());
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	protected mcframe.clientMSBB.MSBBP1380.CndR crtOpenMSBB1380CndR(
			MAUCP_AppScreenOpener aso, DtlR r) {

		MSBBP_SlsDscntReg p = (MSBBP_SlsDscntReg) aso.getPanel();

		mcframe.clientMSBB.MSBBP1380.CndR to = mcframe.clientMSBB.MSBBP1380.CndR.create();
		if (Cnd_ope_REF.isSelected()) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_rev(r.sls_act_rev());
		}
		else if (Cnd_ope_UPD.isSelected()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		to.srch_tgt_no(r.sls_act_no());
		return to;
	}

	@Override
	public mcframe.clientCore.beans.MCCacheType getCacheType(
			mcframe.clientCore.event.MCEventInfo info) {

		if (info.getComponent() == columnDtl_tax_cd) {
			return MCCacheType.SCREEN;
		}
		return super.getCacheType(info);
	}
	
	/**
	 * 納品書即時発行を設定する。
	 */
	protected void setPrntOutFlgTyp(){
		if (Cnd_ope_REF.isSelected()){
			setValueEx(Btn_prnt_out_flg, false);
		}
		else{
			setValueEx(Btn_prnt_out_flg, true);
		}
	}

}