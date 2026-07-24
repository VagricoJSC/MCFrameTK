package mcframe.clientMSBE.MSBEP1160;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ProvDtlModReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ProvDtlModReg_MC extends MSBEP_ProvDtlModReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _toggleAll = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ProvDtlModReg_MC() {
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
	public MSBEP_ProvDtlModReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1160_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Prnt01Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1160_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			MCList<DtlR> dtlL = getDtlL();
			MCJoinKey<MCList<DtlR>> joinKey = dtlL.join(DtlR.$dlv_slip_no, bridge.down0(), DtlR.$dlv_slip_no);
			for(DtlR r : dtlL) {
				if(!isNull(r.rts_msg_p().rtn_sts_typ())) {
					continue;
				}
				DtlR joinR = r.getJoinedRow(joinKey);
				if (!isNull(joinR) && MAC_RTN_STS_TYP.isOK(joinR.rts_msg_p().rtn_sts_typ())) {
					r.rts_msg_p().rtn_sts_typ(joinR.rts_msg_p().rtn_sts_typ());
					r.rts_msg_p().rtn_sts_typ_nm(joinR.rts_msg_p().rtn_sts_typ_nm());
				}
			}
		}
	}


	/**
	 * [MS_MSBEL1160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Srch01Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1160_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkAtLeastOne(ProvTypPanel));
			msgList.addAll(checkAtLeastOne(SubconStsPanel));
			msgList.addAll(checkAtLeastOne(DlvPrntPanel));
			msgList.addAll(checkAtLeastOne(EdiPanel));
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
			else if (Cnd_ope_PRNT.isSelected()) {
				setPRNTStatus();
			}
			else if (Cnd_ope_REF_ACT.isSelected()) {
				setREF_ACTStatus();
			}
			else if (Cnd_ope_REF_SCHD.isSelected()) {
				setREF_SCHDStatus();
			}
		}
	}

	/**
	 * [MS_MSBEL1160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Upd01Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1160_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			if (getBtnR().prnt_out_flg()) {
				for (DtlR r :getDtlL()) {
					if (r.check() && MAC_STR.isNULL_VAL(r.dlv_slip_d_no())) {
						return new MCMessage(MSBEP0038); 
					}
				}
			}
			return super.msgExecConfirm();
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

			for (DtlR r : bridge.up0()) {
				// 計上日を取消計上日にコピー
				r.can_ac_dt(r.ac_dt());
			}
		}

		@Override
		protected void show() {
			super.show();
			MCList<DtlR> dtlL = getDtlL();
			MCJoinKey<MCList<DtlR>> joinKey = dtlL.join(DtlR.$dlv_slip_no, bridge.down0(), DtlR.$dlv_slip_no);
			for(DtlR r : dtlL) {
				if(!isNull(r.rts_msg_p().rtn_sts_typ())) {
					continue;
				}
				DtlR joinR = r.getJoinedRow(joinKey);
				if (!isNull(joinR) && MAC_RTN_STS_TYP.isOK(joinR.rts_msg_p().rtn_sts_typ())) {
					r.rts_msg_p().rtn_sts_typ(joinR.rts_msg_p().rtn_sts_typ());
					r.rts_msg_p().rtn_sts_typ_nm(joinR.rts_msg_p().rtn_sts_typ_nm());
				}
			}
		}
	}

	/**
	 * [MS_MSBEL1160_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt01Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1160_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0020); 
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
						columnDtl_prsppl_cd, columnDtl_trd_cur_cd, columnDtl_prsppl_wg_cd));
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
				setValueEx(columnDtl_trd_cur_upri, r.getGUIIndex(), r.upri());
			}
		}

		@Override
		protected void showEndMsg() {
			panel.dialog(new MCMessage(MSBEP0021));
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
				else if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
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
		protected Map_UpriSrchR_DtlR<UpriSrchR,DtlR> createMap_UpriSrchR_DtlR() {
			return new Map_UpriSrchR_DtlR<UpriSrchR, DtlR>();
		}

		public class Map_UpriSrchR_DtlR<D extends UpriSrchR, S extends DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpriSrchR.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(UpriSrchR.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(UpriSrchR.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(UpriSrchR.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(UpriSrchR.$prsppl_cd, DtlR.$prsppl_cd);
				addColumnPathMap(UpriSrchR.$cur_cd, DtlR.$trd_cur_cd);
				addColumnPathMap(UpriSrchR.$wg_cd, DtlR.$prsppl_wg_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 単価採用日付はクライアントで判定する
				if (isNull(getUpriBulkSetR().upri_dt())) {
					dest.dt(src.accpt_dt());
				}
				else {
					dest.dt(getUpriBulkSetR().upri_dt());
				}
			}
		}
	}

	/**
	 * [MS_MSBEL1160_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt02Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1160_Sprt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0022);
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
				panel.dialog(new MCMessage(MSBEP0024));
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
			panel.dialog(new MCMessage(MSBEP0023));
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
	 * [MS_MSBEL1160_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1160_Sprt03Caller<P extends MSBEP_ProvDtlModReg, B extends MS_MSBEL1160_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1160_Sprt03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBEP0027);
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
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtl_itm_cd,
						columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
						columnDtl_prsppl_cd));
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
			panel.dialog(new MCMessage(MSBEP0028));
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
				else if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					continue;
				}
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
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
				addColumnPathMap(TaxSrchR.$prsppl_cd, DtlR.$prsppl_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tax_dt(getTaxBulkSetR().tax_dt());
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1160_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL1160_Srch01().execDL();
	}
	/**
	 * Panel[UpriBulkSet]のボタン[upri_replace]の押下時の処理
	 */
	@Override
	public void doUpriBulkSet_upri_replace(MCEventInfo info) {
		callMS_MSBEL1160_Sprt01();
	}
	/**
	 * Panel[XrateBulkSet]のボタン[xrate_replace]の押下時の処理
	 */
	@Override
	public void doXrateBulkSet_xrate_replace(MCEventInfo info) {
		callMS_MSBEL1160_Sprt02();
	}
	/**
	 * Panel[TaxBulkSet]のボタン[tax_replace]の押下時の処理
	 */
	@Override
	public void doTaxBulkSet_tax_replace(MCEventInfo info) {
		callMS_MSBEL1160_Sprt03();
	}
	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {

		DtlR r = DtlTable.getSelectedMCRow();
		// 行が選択されていない場合
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}

		String screenId = getScreenId(r);
		showDtl(screenId, r);
	}
	protected String _MSBCP1090 = "MSBCP1090";	// 投入一覧照会
	protected String _MSBDP0090 = "MSBDP0090";	// 発注一覧登録
	protected String _MSBDP0130 = "MSBDP0130";	// 仕入実績一覧登録
	protected String _MSBDP0170 = "MSBDP0170";	// 仕入返品一覧照会
	protected String _MSBEP1050 = "MSBEP1050";	// 移動一覧登録
	protected String _MSBEP1090 = "MSBEP1090";	// 支給品着荷一覧登録
	protected String _MSBEP1420 = "MSBEP1420";	// 出荷予定変更登録
	protected String _MSBEP1450 = "MSBEP1450";	// 出荷実績一覧登録
	/**
	 * 詳細情報ボタンでの画面遷移先の画面ＩＤを取得する。
	 * @return 画面遷移対象の場合、その画面ＩＤを返す。画面遷移対象外の場合、nullを返す。
	 */
	protected String getScreenId(DtlR selectedR) {
		String screenId = null;

		//支給元予定区分
		String provSrcSchdTyp = selectedR.prov_src_schd_typ();
		//支給元実績区分
		String provSrcActTyp = selectedR.prov_src_act_typ();

		if (Cnd_ope_REF_SCHD.isSelected()) {
			if (MSC_PROV_SRC_SCHD_TYP.isXFR(provSrcSchdTyp)) {
				screenId = _MSBEP1050;	// 移動一覧登録
			}
			else if (MSC_PROV_SRC_SCHD_TYP.isSHIP(provSrcSchdTyp)) {
				if (!MAC_STR.isNULL_VAL(selectedR.prov_src_schd_no1())) {
					screenId = _MSBEP1420;	// 出荷予定変更登録
				}
				else {
					screenId = _MSBEP1090;	// 支給品着荷一覧登録
				}
			}
			else if (MSC_PROV_SRC_SCHD_TYP.isDDLV(provSrcSchdTyp)) {
				screenId = _MSBDP0090;	// 発注一覧登録
			}
			else if (MSC_PROV_SRC_SCHD_TYP.isRET_DDLV(provSrcSchdTyp)) {
				screenId = _MSBDP0170;	// 仕入返品一覧照会
			}
		}
		else {
			if (MSC_PROV_SRC_ACT_TYP.isXFR(provSrcActTyp)) {
				screenId = _MSBEP1050;	// 移動一覧登録
			}
			else if (MSC_PROV_SRC_ACT_TYP.isSHIP(provSrcActTyp)
					|| MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(provSrcActTyp)
					|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(provSrcActTyp)) {
				screenId = _MSBEP1090;	// 支給品着荷一覧登録
			}
			else if (MSC_PROV_SRC_ACT_TYP.isRET_SHIP(provSrcActTyp)) {
				screenId = _MSBEP1450;	// 出荷実績一覧登録
			}
			else if (MSC_PROV_SRC_ACT_TYP.isDDLV(provSrcActTyp)) {
				screenId = _MSBDP0130;	// 仕入実績一覧登録
			}
			else if (MSC_PROV_SRC_ACT_TYP.isRET_DDLV(provSrcActTyp)) {
				screenId = _MSBDP0170;	// 仕入返品一覧照会
			}
			else if (MSC_PROV_SRC_ACT_TYP.isINPT(provSrcActTyp)) {
				screenId = _MSBCP1090;	// 投入一覧照会
			}
		}

		return screenId;
	}
	/**
	 * 各詳細画面へ遷移する。
	 * @param r
	 */
	protected void showDtl(String screenId, DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", screenId);
		aso.runValueInit();
		aso.putCnd(crtOpenDtlCndR(aso, r, screenId));
		aso.putSearchAction();
		aso.show();
	}
	protected MCConstRow crtOpenDtlCndR(MAUCP_AppScreenOpener aso, DtlR r, String screenId) {
		MCConstRow to = null;

		if(isSame(screenId, _MSBCP1090)) {
			to = crtOpenMSBCP1090CndR(aso, r);	// 投入一覧照会
		}
		else if(isSame(screenId, _MSBDP0090)) {
			to = crtOpenMSBDP0090CndR(aso, r);	// 発注一覧登録
		}
		else if(isSame(screenId, _MSBDP0130)) {
			to = crtOpenMSBDP0130CndR(aso, r);	// 仕入実績一覧登録
		}
		else if(isSame(screenId, _MSBDP0170)) {
			to = crtOpenMSBDP0170CndR(aso, r);	// 仕入返品一覧照会
		}
		else if(isSame(screenId, _MSBEP1050)) {
			to = crtOpenMSBEP1050CndR(aso, r);	// 移動一覧登録
		}
		else if(isSame(screenId, _MSBEP1090)) {
			to = crtOpenMSBEP1090CndR(aso, r);	// 支給品着荷一覧登録
		}
		else if(isSame(screenId, _MSBEP1420)) {
			to = crtOpenMSBEP1420CndR(aso, r);	// 出荷予定変更登録
		}
		else if(isSame(screenId, _MSBEP1450)) {
			to = crtOpenMSBEP1450CndR(aso, r);	// 出荷実績一覧登録
		}

		return to;
	}
	/**
	 * 投入一覧照会画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBCP1090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBC.MSBCP1090.MSBCP_InptListSrch p = (mcframe.clientMSBC.MSBCP1090.MSBCP_InptListSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1090.CndR to = mcframe.clientMSBC.MSBCP1090.CndR.create();

		to.srch_mode1(p.Cnd_srch_mode1_ACT.getActionCommand());		// 検索モード１＠実績
		to.srch_mode2(p.Cnd_srch_mode2_INPT.getActionCommand());	// 検索モード２＠投入
		to.inpt_act_no(r.prov_src_act_no());

		return to;
	}
	/**
	 * 発注一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg p = (mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0090.CndR to = mcframe.clientMSBD.MSBDP0090.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());	// 操作種別＠参照する
		to.po_d_no(r.po_d_no());

		return to;
	}
	/**
	 * 仕入実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0130CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBD.MSBDP0130.MSBDP_PurcActListReg p = (mcframe.clientMSBD.MSBDP0130.MSBDP_PurcActListReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0130.CndR to = mcframe.clientMSBD.MSBDP0130.CndR.create();

		to.ope(p.Cnd_ope_SRCH_ACT.getActionCommand());	// 操作種別＠実績を参照する
		to.purc_act_d_no(r.purc_act_d_no());

		return to;
	}
	/**
	 * 仕入返品一覧照会画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBDP0170CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch p = (mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch) aso.getPanel();
		mcframe.clientMSBD.MSBDP0170.CndR to = mcframe.clientMSBD.MSBDP0170.CndR.create();

		if (Cnd_ope_REF_SCHD.isSelected()) {
			to.ope(p.Cnd_ope_SRCH_SCHD_REF.getActionCommand());	// 操作種別＠返品予定を参照する
			to.purc_ret_schd_d_no(r.purc_ret_schd_d_no());
		}
		else {
			to.ope(p.Cnd_ope_SRCH_ACT_REF.getActionCommand()); // 操作種別＠返品実績を参照する
			to.purc_ret_act_d_no(r.purc_ret_act_d_no());
		}
		to.mode(p.Cnd_mode_SRCH_LST.getActionCommand());	// 検索モード＠詳細

		return to;
	}
	/**
	 * 移動一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1050CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg p = (mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1050.CndR to = mcframe.clientMSBE.MSBEP1050.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());	// 操作種別＠参照する
		if (Cnd_ope_REF_SCHD.isSelected()) {
			to.tgt(p.Cnd_tgt_SCHD.getActionCommand());	// 処理対象＠予定
			to.xfr_alloc_sts_no(r.prov_src_schd_no1());
		}
		else {
			to.tgt(p.Cnd_tgt_ACT.getActionCommand());	// 処理対象＠予定
			to.md(p.Cnd_md_DTL.getActionCommand());		// 検索モード＠明細
			to.xfr_act_d_no(r.prov_src_act_no());
		}

		return to;
	}
	/**
	 * 支給品着荷一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg p = (mcframe.clientMSBE.MSBEP1090.MSBEP_ProvArrReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2000.CndR to = mcframe.clientMSBE.MSBEP2000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());	// 操作種別＠参照する
		if (Cnd_ope_REF_SCHD.isSelected()) {
			to.arr_schd_no(r.prov_src_schd_no2());
		}
		else {
			to.arr_act_no(r.prov_src_act_no());
		}

		return to;
	}
	/**
	 * 出荷予定変更登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1420CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg p = (mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1420.CndR to = mcframe.clientMSBE.MSBEP1420.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());	// 操作種別＠参照する
		to.md(p.Cnd_md_SHIP.getActionCommand());	// 検索モード＠出荷予定
		to.not_inst_flg(true);
		to.inst_flg(true);
		to.not_ship_flg(true);
		to.part_ship_flg(true);
		to.ship_flg(true);
		to.lg_grp_cd(r.lg_grp_cd());
		to.ship_schd_no(r.prov_src_schd_no1());

		return to;
	}
	/**
	 * 出荷実績一覧登録画面を起動するパラメータ値を初期化する。
	 * @param r
	 * @return
	 */
	protected MCConstRow crtOpenMSBEP1450CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg p = (mcframe.clientMSBE.MSBEP1450.MSBEP_ShipActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1450.CndR to = mcframe.clientMSBE.MSBEP1450.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());	// 操作種別＠参照する
		to.md(p.Cnd_md_DTL.getActionCommand());		// 検索モード＠明細
		to.lg_grp_cd(r.lg_grp_cd());
		to.ship_act_no(r.ship_act_no());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL1160_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		_toggleAll = true;
		for (DtlR r : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_check, r.getGUIIndex()) && !r.check()) {
				setValueEx(columnDtl_check, r.getGUIIndex(), true);
			}
		}
		_toggleAll = false;
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		_toggleAll = true;
		for (DtlR r : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_check, r.getGUIIndex()) && r.check()) {
				setValueEx(columnDtl_check, r.getGUIIndex(), false);
			}
		}
		_toggleAll = false;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1160_Upd01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Dtl_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null, null, null);
		Dtl_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, null, null, null);

		Dtl_trd_upri_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_prsppl_cd,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_base_unit_cd, columnDtl_act_qty,
				columnDtl_trd_cur_amt_dec_place, columnDtl_trd_cur_upri_dec_place,
				columnDtl_prov_amt_rnd_typ, columnDtl_prov_tax_rnd_typ, null, null, null);

		Dtl_trd_upri_amt_p_PPanel.setAmtToUpri(true);

		Dtl_old_trd_cur_upri_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_trd_cur_upri_dec_place);

		Dtl_base_cur_upri_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_upri_dec_place, columnDtl_trd_cur_upri,
				columnDtl_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_amt, columnDtl_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, columnDtl_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_base_cur_cd,
				columnDtl_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, columnDtl_xrate);

		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_inc_tax_amt,
				columnDtl_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnDtl_ptax_cur_cd,
				columnDtl_ptax_cur_upri_dec_place, columnDtl_trd_cur_tax_amt,
				columnDtl_ptax_xrate);

		Dtl_prsppl_Grp_p_PPanel.setRelateBeans(Cnd_prsppl_grp_p_PPanel);

		Dtl_wtax_amt_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd,
				columnDtl_trd_cur_amt_dec_place);
		Dtl_xrate_p_PPanel.setRelateBeans(columnDtl_trd_cur_cd, columnDtl_base_cur_cd,
				columnDtl_xrate_cd, columnDtl_accpt_dt, false);
	}

	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		setCndMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_ACTStatus() {
		super.setSRCH_ACTStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREF_ACTStatus() {
		super.setREF_ACTStatus();
		setCndMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setSRCH_SCHDStatus() {
		super.setSRCH_SCHDStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREF_SCHDStatus() {
		super.setREF_SCHDStatus();
		setCndMode();
		DtlTable.selectLeftmostColumn(0);
	}

	/**
	 * ステータスの設定後に操作種別固有のモードを設定する
	 */
	protected void setCndMode() {
		if(Cnd_ope_UPD.isSelected()) {
			Cnd_ffr_prov_flg.setMode(MCMode.READ_ONLY);
			Cnd_onr_prov_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_ffr_prov_flg);
			setDefaultMode(Cnd_onr_prov_flg);
		}
		if (Cnd_ope_PRNT.isSelected()) {
			Cnd_dis_can_disp_flg.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cnd_dis_can_disp_flg);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {

		Cnd_prov.setValue(true);
		Cnd_prov_rtn.setValue(true);

		Cnd_ffr_prov_flg.setValue(false);
		Cnd_onr_prov_flg.setValue(true);

		Cnd_subcon_flg.setValue(true);
		Cnd_not_subcon_flg.setValue(true);

		Cnd_dlv_not_prnted.setValue(true);
		Cnd_dlv_prnted.setValue(true);
		
		setValueEx(Cnd_on_edi_flg, true);
		setValueEx(Cnd_off_edi_flg, true);

		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setSRCHStatus();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_trd_cur_amt.addLCListener(this);
//		setListListener(DtlTable, getDtlRowListener());
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseCurFlg(this)) {
			setComponentInvisibleAllStatus(XrateBulkSetPanel);
		}
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
		clearContainers(getDtlL(), getUpriBulkSetR(), getXrateBulkSetR(), getTaxBulkSetR());

		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();

		if (Cnd_ope_UPD.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_REF_ACT.isSelected()) {
			setSRCH_ACTStatus();
		}
		else if (Cnd_ope_REF_SCHD.isSelected()) {
			setSRCH_SCHDStatus();
		}

		Ctrl_ctrl_PPanel.expand(true);
		setValueEx(Btn_prnt_out_flg, false);
	}

	protected void clearCnd() {
		if (Cnd_ope_REF_SCHD.isSelected()) {
			setValueEx(Cnd_accpt_dt_fr, null);
			setValueEx(Cnd_accpt_dt_to, null);
			setValueEx(Cnd_ac_ym_fr, null);
			setValueEx(Cnd_ac_ym_to, null);
			setValueEx(Cnd_ac_dt_fr, null);
			setValueEx(Cnd_ac_dt_to, null);
			setValueEx(Cnd_arr_act_dt_fr, null);
			setValueEx(Cnd_arr_act_hm_fr, null);
			setValueEx(Cnd_arr_act_dt_to, null);
			setValueEx(Cnd_arr_act_hm_to, null);
			setValueEx(Cnd_ap_dpt_cd, null);
			setValueEx(Cnd_ap_dpt_nm, null);
			setValueEx(Cnd_prov_src_act_typ, null);
			setValueEx(Cnd_prov_src_act_no, null);
			setValueEx(Cnd_prov_act_no, null);
			setValueEx(Cnd_trd_d_rmrks, null);
			setValueEx(Cnd_dis_can_disp_flg, false);
			setValueEx(Cnd_dlv_not_prnted, true);
			setValueEx(Cnd_dlv_prnted, true);
		}
		else {
			setValueEx(Cnd_accpt_schd_dt_fr, null);
			setValueEx(Cnd_accpt_schd_dt_to, null);
			setValueEx(Cnd_arr_schd_dt_fr, null);
			setValueEx(Cnd_arr_schd_hm_fr, null);
			setValueEx(Cnd_arr_schd_dt_to, null);
			setValueEx(Cnd_arr_schd_hm_to, null);
			setValueEx(Cnd_prov_src_schd_typ, null);
			setValueEx(Cnd_prov_src_schd_no1, null);
			setValueEx(Cnd_prov_src_schd_no2, null);
			setValueEx(Cnd_prov_schd_no, null);

			if (Cnd_ope_UPD.isSelected()) {
				setValueEx(Cnd_dis_can_disp_flg, false);
				setValueEx(Cnd_sign_rev_flg, false);
			}
		}
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Btn_prnt_out_flg, true);
			setValueEx(Cnd_ffr_prov_flg, false);
			setValueEx(Cnd_onr_prov_flg, true);
		}
		else {
			setValueEx(Btn_prnt_out_flg, false);
			setValueEx(Cnd_ffr_prov_flg, true);
			setValueEx(Cnd_onr_prov_flg, true);
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

		if (lc == columnDtl_trd_cur_amt) {
			doDtl_trd_cur_amt_LC(info);
		}

	}

	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		doDtl_wtax_rate_LC(info);
	}

	@Override
	public void doDtl_wtax_rate_LC(MCEventInfo info) {
		super.doDtl_wtax_rate_LC(info);
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		MCNumber wtaxAmt = null;
		if (!isNull(r.wtax_rate())) {
			wtaxAmt = MAUCP_AmtUtil.getAmt(r.trd_cur_amt(), r.wtax_rate().divide(100),
					r.trd_cur_amt_dec_place(), r.wtax_rnd_typ());
		}
		setValueEx(columnDtl_wtax_amt, index, wtaxAmt);
	}

	@Override
	public void doDtl_ac_dt_LC(MCEventInfo info) {
		super.doDtl_ac_dt_LC(info);
		DtlR row = getDtlL().get(info.getEventIndex());
		
		// 計上日が変更できるのは締後のデータのみなので、取消計上日も連動させる
		row.can_ac_dt(row.ac_dt());
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_VC(info);
		if (!_toggleAll && Cnd_ope_PRNT.isSelected()) {
			DtlR updRow = getDtlL().get(info.getEventIndex());
			if (updRow.check()) {
				propagate(updRow);
			}
		}
	}

	protected void propagate(DtlR updRow) {
		for (DtlR r : getDtlL().subList(getSlipKey(), updRow)) {
			if (r != updRow) {
				setValueEx(columnDtl_check, r.getGUIIndex(), true);
			}
		}
	}

	/**
	 * 伝票の単位<br>
	 * 以下の項目が一致する場合に同一伝票とみなす<br>
	 * <br>
	 * 計上日<br>
	 * 支給元実績区分<br>
	 * 納品書ＮＯ<br>
	 * 取引パタン区分<br>
	 * 支給先ＣＤ<br>
	 * 支給区分<br>
	 * 支給計上区分<br>
	 * 税率<br>
	 * 為替レートＣＤ<br>
	 * 為替レート<br>
	 * 納税為替レート<br>
	 * 源泉税率<br>
	 * 取引通貨ＣＤ<br>
	 * 基準通貨ＣＤ<br>
	 * 納税通貨ＣＤ<br>
	 * 発注ＮＯ<br>
	 * 仕入実績ＮＯ<br>
	 * 仕入返品実績ＮＯ<br>
	 * 製造実績ＮＯ<br>
	 */
	protected String[] _slipKey = null;
	protected String[] getSlipKey() {
		if (_slipKey == null) {
			_slipKey = new String[]{
					DtlR.$ac_dt, DtlR.$prov_src_act_typ, DtlR.$dlv_slip_no, DtlR.$trd_ptn_typ,
					DtlR.$prsppl_cd, DtlR.$prov_typ, DtlR.$prov_basis_typ,
					DtlR.$tax_rate, DtlR.$xrate_cd, DtlR.$xrate, DtlR.$ptax_xrate, DtlR.$wtax_rate,
					DtlR.$trd_cur_cd, DtlR.$base_cur_cd, DtlR.$ptax_cur_cd,
					DtlR.$po_no, DtlR.$purc_act_no, DtlR.$purc_ret_act_no, DtlR.$mfg_act_no};
		}
		return _slipKey;
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

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isSame(getStatus(), UPD)) {
				if (!r.purc_close_flg()) {
					if (column == columnDtl_ac_dt) {
						return MCMode.READ_ONLY;
					}
				}
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					if (column == columnDtl_wtax_rate) {
						if (!(isSame(r.trd_cur_cd(), r.base_cur_cd())
								&& isSame(r.trd_cur_cd(), nvl(r.ptax_cur_cd(), r.trd_cur_cd())))) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else {
					if (column == columnDtl_check || column == columnDtl_xfr_rsn_cd
							|| column == columnDtl_trd_d_rmrks || column == columnDtl_intr_rmrks
							|| column == columnDtl_sub_char1 || column == columnDtl_sub_char2 || column == columnDtl_sub_char3) {
							return MCMode.ENABLE;
						}
						else if (column != columnDtl_ac_dt){
							return MCMode.READ_ONLY;
						}
				}
				if (column == columnDtl_trd_cur_upri) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_trd_cur_amt) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_trd_cur_inc_tax_amt) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_tax_cd) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) && r.iv_trd_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_base_ac_dt) {
					if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	//---------------------------------------------- ListLogic ---------------------------------------------- 

	@Override
	public MCList<?> getDtl_xfr_rsn_cd(MCRow row, MCEventInfo info) {
 		MCList<?> dtlL = super.getDtl_xfr_rsn_cd(row, info);
 		return dtlL.subList(r -> !r.getBooleanNE("acxfr_gi_flg"));
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
		if (Cnd_ope_UPD.isSelected()){
			setValueEx(Btn_prnt_out_flg, true);
		}
		else{
			setValueEx(Btn_prnt_out_flg, false);
		}
	}

}