// FMSE PANEL_EI
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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.commonCore.annotation.EI;
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
import mcframe.clientMSBB.MSBBPA0030.*;
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

//FMCB IMPORT START
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import mcframe.clientMAUC.MAUCP1060.MAUCP_TrdUtil;
import mcframe.clientCore.beans.list.MCListConfig;
//FMCB IMPORT END

/**
 * 画面"MSBBP_SloReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBP_SloReg extends MSBBP_SloReg_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloReg() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SloReg(String name) {
		super(name);
	}

	public class MS_MSBBL1210_Srch01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch01Bridge {
	}
	public class MS_MSBBL1210_Srch02Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch02Bridge {
	}
	public class MS_MSBBL1210_Ins01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Ins01Bridge {
	}
	public class MS_MSBBL1210_Upd01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Upd01Bridge {
	}
	public class MS_MSBBL1210_Del01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Del01Bridge {
	}
	public class MS_MSBBL1210_Sprt01Bridge extends MSBBP_SloReg_MC.MS_MSBBL1210_Sprt01Bridge {
	}

//FMCB CUSTOM START
	/**
	 * Panel[Btn]のボタン[par_ship]の押下時の処理
	 */
	@Override
	public void doBtn_par_ship(MCEventInfo info) {
	    groupDtlByDeliveryRequestDate();
	    setHdrAmt();
	    setHdrIncTaxAmt();		
	}

	private static final String HAKUYOU_SERVICE_DTP_CD = "D20110";

	/**
	 * Panel[Hdr]のボタン[exp_match_btn]の押下時の処理
	 */
	@Override
	public void doHdr_exp_match_btn(MCEventInfo info) {
	}

	/**
	 * Panel[Hdr]のボタン[bom_exp_btn]の押下時の処理
	 */
	@Override
	public void doHdr_bom_exp_btn(MCEventInfo info) {
		MCRow bind = MCRow.create();
		
		bind.addStringColumn("par_itm_cd", Hdr_par_itm_cd.getValue());
		bind.addStringColumn("par_itm_sub1", Hdr_par_itm_sub1.getValue());
		bind.addStringColumn("par_itm_sub2", Hdr_par_itm_sub2.getValue());
		bind.addStringColumn("par_itm_sub3", Hdr_par_itm_sub3.getValue());
		bind.addStringColumn("par_itm_nm", Hdr_par_itm_nm.getValue());
		bind.addStringColumn("surv_line_qty", Hdr_surv_line_qty.getValue());
		bind.addStringColumn("diameter", Hdr_diameter.getValue());
		
		MCNumber hdrQty = Hdr_hdr_qty.getValue();
		if (isNull(hdrQty) || hdrQty.eq(MCNumber.ZERO)) {
			hdrQty = MCNumber.ONE;
		}
		bind.addNumberColumn("hdr_qty", hdrQty);
		
		openModalPanel("MS", "MSBBPA0020", T1, bind, this);
	}

	/**
	 * [MS_MSBBL1210_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch01Caller<P, B> {

		protected MS_MSBBL1210_Srch01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Srch02Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Srch02Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Srch02Caller<P, B> {

		protected MS_MSBBL1210_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Ins01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Ins01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Ins01Caller<P, B> {

		protected MS_MSBBL1210_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Upd01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Upd01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Upd01Caller<P, B> {

		protected MS_MSBBL1210_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Del01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Del01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Del01Caller<P, B> {

		protected MS_MSBBL1210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL1210_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1210_Sprt01Caller<P extends MSBBP_SloReg, B extends MS_MSBBL1210_Sprt01Bridge> extends MSBBP_SloReg_MC.MS_MSBBL1210_Sprt01Caller<P, B> {

		protected MS_MSBBL1210_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	public MCTable<?> getDtlTable() {
		return DtlTable;
	}
	
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		initTrace(this, "initByScreenParam");

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
				String slsDptCd = bind.getStringNE("sls_dpt_cd");
				setValueEx(Hdr_sls_dpt_cd, slsDptCd);
			    syncArDptWithSlsDpt();
			}
			
			if (bind.contains("hdr_qty")) {
				setValueEx(Hdr_hdr_qty, bind.getNumberNE("hdr_qty"));
			}
			
			if (bind.contains("par_itm_cd")) {
				setValueEx(Hdr_par_itm_cd, bind.getStringNE("par_itm_cd"));
				setValueEx(Hdr_par_itm_sub1, bind.getStringNE("par_itm_sub1"));
				setValueEx(Hdr_par_itm_sub2, bind.getStringNE("par_itm_sub2"));
				setValueEx(Hdr_par_itm_sub3, bind.getStringNE("par_itm_sub3"));
			}
			
			if (param != null && param.length > 0) {
				initializingDtl = true;
				MCList<?> list = (MCList<?>)param[0];
				try {
					for (int i=0; i<list.size(); i++) {
						if (DtlTable.getRow(i) == null) {
							insertRow(DtlTable);
						}
						MCRow row = list.get(i);
						
						String itmCd = row.getStringNE("itm_cd");
						setValueEx(columnDtl_itm_cd, i, itmCd);
						setValueEx(columnDtl_itm_sub1, i, row.getStringNE("itm_sub1"));
						setValueEx(columnDtl_itm_sub2, i, row.getStringNE("itm_sub2"));
						setValueEx(columnDtl_itm_sub3, i, row.getStringNE("itm_sub3"));

						setValueEx(columnDtl_trd_unit_cd, i, row.getStringNE("trd_unit_cd"));
						setValueEx(columnDtl_trd_unit_qty, i, row.getNumberNE("trd_unit_qty"));
						setValueEx(columnDtl_cst_itm_cd, i, row.getStringNE("cst_itm_cd"));
						setValueEx(columnDtl_cst_itm_nm, i, row.getStringNE("cst_itm_nm"));
					}
				}
				finally {
					initializingDtl = false;
				}
				
			    // 全項目設定後に再計算
			    for (int i = 0; i < list.size(); i++) {
			        recalculateDtlAmounts(i);
			    }
			    
				DtlTable.selectLeftmostColumn(0);
			}
			DtlTable.fillSpace(); // 画面が既に開いている状態で画面遷移されたケースを考慮
			HdrPanel.focusFirstComponent();
		}
	}
	
	@Override
	protected void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		super.doHdr_sls_dpt_cd_LC(info);
		String dptCd = Hdr_sls_dpt_cd.getValue();
		if (dptCd != null && HAKUYOU_SERVICE_DTP_CD.equals(dptCd)) {
			Hdr_trd_cd.doListEvent(MCListConfig.LIST);
			Hdr_trd_cd.clear();
		}

		Hdr_cst_cd.doListEvent(MCListConfig.LIST);

		// 売上部門変更後、債権部門へ反映
		syncArDptWithSlsDpt();		
	}

	/**
	 * 債権部門を売上部門と同じにする。
	 */
	private void syncArDptWithSlsDpt() {
	    String slsDptCd = getHdrR().sls_dpt_cd();

	    // 売上部門が未設定の場合は何もしない
	    if (isNull(slsDptCd)) {
	        return;
	    }

	    // 同じ場合は更新不要
	    if (java.util.Objects.equals(
	            slsDptCd, getHdrR().ar_dpt_cd())) {
	        return;
	    }

	    // 診断用：Rowへ直接設定
	    getHdrR().ar_dpt_cd(slsDptCd);
	    getHdrR().ar_dpt_nm(getHdrR().sls_dpt_nm());
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);

		// 売上条件区分・配送先のモードをクリア
		Hdr_tdlv_cd.setMode(MCMode.ENABLE);
		Hdr_sls_cond_typ.clear();
		
	    // 標準処理後に同期
	    syncArDptWithSlsDpt();		

	}

	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			setValueEx(Hdr_trd_cur_cd, null);
			setValueEx(Hdr_ar_dpt_cd, null);
		}
		setDefaultSlsBasisTyp();
		
		// 売上部門、債権部門の設定
		// 画面で表示されている値を変更時一旦クリアする
		// setValueEx(Hdr_sls_usr_cd, null);	// 標準動作カスタマイズ
		// setValueEx(Hdr_sls_dpt_cd, null);	// 標準動作カスタマイズ
		// setValueEx(Hdr_ar_dpt_cd, null);
		
		// 売上部門の設定
		// if (!isNull(getHdrR().cst_usr_cd())) {				// 標準動作カスタマイズ
		// 	setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		// }
		// else if (!isNull(getHdrR().cst_dpt_cd())) {			// 標準動作カスタマイズ
		// 	setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		// }
		
		// 債権部門の設定
		syncArDptWithSlsDpt();
		
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
	
	private final static String SLS_COND_TYP_0 = "0";	// 出荷売上
	private final static String SLS_COND_TYP_1 = "1";	// 営業在庫品
	private final static String SLS_COND_TYP_2 = "2";	// 営業所送り
	private final static String SLS_COND_TYP_3 = "3";
	private final static String SLS_COND_TYP_4 = "4";
	private final static String SLS_COND_TYP_6 = "6";
	private final static String SLS_COND_TYP_7 = "7";
	private final static String SLS_COND_TYP_9 = "9";	// 代納売上
	
	@Override
	public void doHdr_sls_cond_typ_LC(MCEventInfo info) {
		super.doHdr_sls_cond_typ_LC(info);

		// 選択中の取引CDに応じて入力項目を制御
		String slsCondType = Hdr_sls_cond_typ.getValue();
		if (slsCondType != null && SLS_COND_TYP_2.equals(slsCondType)) {
			Hdr_tdlv_cd.setMode(MCMode.REQUIRED);
		}
		else {
			Hdr_tdlv_cd.setMode(MCMode.ENABLE);
		}
	}
	
	
	/**
	 * 選択中の取引CDに応じて入力項目を制御
	 */
	private final static String TRD_CD_010 = "010";
	private final static String TRD_CD_020 = "020";
	private final static String TRD_CD_030 = "030";
	private final static String TRD_CD_040 = "040";
	private final static String TRD_CD_050 = "050";
	private final static String TRD_CD_060 = "060";
	private final static String TRD_CD_070 = "070";
	private final static String TRD_CD_080 = "080";
	private final static String TRD_CD_800 = "800";
	private final static String TRD_CD_9XX = "9XX"; // 代納
	private final static String TRD_CD_9YY = "9YY"; // 貸出
	private final static Set<String> ALL_TRD_CD = new HashSet<String>(
		Arrays.asList(TRD_CD_010, TRD_CD_020, TRD_CD_030, TRD_CD_040, TRD_CD_050, TRD_CD_060, TRD_CD_070, TRD_CD_080, TRD_CD_800, TRD_CD_9XX, TRD_CD_9YY)
	);
	
	
	@Override
	public MCList<?> getHdr_sls_cond_typ(
			MCRow row, MCEventInfo info) {
		// 標準リストロジックから全候補を取得
		MCList<?> list = super.getHdr_sls_cond_typ(row, info);

		if (list == null) {
			return null;
		}

		// 現在選択中の取引CD
		String trdCd = Hdr_trd_cd.getValue();

		// 許可する売上条件区分
		Set<String> allowed = getAllowedSalesConditions(trdCd);

		// 許可されていない候補を除外
		for (int i = list.size() - 1; i >= 0; i--) {
			MCRow item = (MCRow) list.get(i);

			String code = item.getStringNE("sls_cond_typ");

			if (!allowed.contains(code)) {
				list.remove(i);
			}
		}

		return list;
	}

	/**
	 * 取引CDに応じた選択可能な売上条件区分
	 */
	private final static Set<String> ALL_SLS_COND_CD = new HashSet<String>(
			Arrays.asList(SLS_COND_TYP_0, SLS_COND_TYP_1, SLS_COND_TYP_2, SLS_COND_TYP_3, SLS_COND_TYP_4, SLS_COND_TYP_6, SLS_COND_TYP_7)
		);
	protected Set<String> getAllowedSalesConditions(
			String trdCd) {
		if (TRD_CD_010.equals(trdCd)
				|| TRD_CD_020.equals(trdCd)
				|| TRD_CD_050.equals(trdCd)
				|| TRD_CD_070.equals(trdCd)
			) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_0, SLS_COND_TYP_2));
		}

		if (TRD_CD_030.equals(trdCd)
				|| TRD_CD_060.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_0, SLS_COND_TYP_3));
		}

		if (TRD_CD_040.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_0, SLS_COND_TYP_4));
		}

		if (TRD_CD_080.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_6));
		}

		if (TRD_CD_800.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_1));
		}
		
		if (TRD_CD_9XX.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_9));
		}
		
		if (TRD_CD_9YY.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(SLS_COND_TYP_0));
		}
		
		// 未定義の取引CDでは候補を制限しない
		return ALL_SLS_COND_CD;
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		
		Hdr_sls_cond_typ.setListVisibleColumn("sls_cond_typ", "sls_cond_typ_nm");
		
		// 売上担当者が変わると売上部門も変わってしまう動作を無効化する
		MAUBP_UsrDpt_H parts = Hdr_usr_dpt_p_PPanel;
		parts.setSuppressDefaultDepartment(true);
	}
	
	@Override
	public MCList<?> getHdr_frc_rsn_cd(
			MCRow row, MCEventInfo info) {
		// 標準リストロジックから全候補を取得
		MCList<?> list = super.getHdr_frc_rsn_cd(row, info);

		if (list == null) {
			return null;
		}

		// 現在選択中の取引CD
		String trdCd = Hdr_trd_cd.getValue();

		// 許可する売上条件区分
		Set<String> allowed = getAllowedFreeReasonCodes(trdCd);

		// 許可されていない候補を除外
		for (int i = list.size() - 1; i >= 0; i--) {
			MCRow item = (MCRow) list.get(i);

			String code = item.getStringNE("free_rsn_typ");

			if (!allowed.contains(code)) {
				list.remove(i);
			}
		}

		return list;
	}
	
	private final static String FREE_RSN_SAMPLE_PROD = "P";	// 見本品
	private final static String FREE_RSN_JIP_ENTRY_ERR = "Q";	// JIP誤入力
	private final static String FREE_RSN_LOANED_ITM = "T"; 	// 貸与品
	private final static String FREE_RSN_THIRD_DLV_ITM = "R"; // 代納品
	private final static Set<String> ALL_FREE_RSN_CD = new HashSet<String>(
			Arrays.asList(FREE_RSN_SAMPLE_PROD, FREE_RSN_JIP_ENTRY_ERR, FREE_RSN_LOANED_ITM, FREE_RSN_THIRD_DLV_ITM)
		);
	protected Set<String> getAllowedFreeReasonCodes(
			String trdCd) {
		// 取引CD：代納
		if (TRD_CD_9XX.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(FREE_RSN_JIP_ENTRY_ERR, FREE_RSN_THIRD_DLV_ITM));
		}

		// 貸出
		if (TRD_CD_9YY.equals(trdCd)) {
			return new HashSet<>(
					Arrays.asList(FREE_RSN_SAMPLE_PROD, FREE_RSN_LOANED_ITM));
		}

		// 未定義の取引CDでは候補を制限しない
		return ALL_FREE_RSN_CD;
	}
	
	@Override
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
		
		// 標準動作カスタマイズ
		// if (!isSame(getHdrR().def_cst_cd(),getHdrR().cst_cd())) {
		//	setCstCd();
		//}
	}	
	
	@Override
	public void doHdr_def_cst_cd_NC(MCEventInfo info) {
		// 標準動作カスタマイズ
		// super.doHdr_def_cst_cd_NC(info);
		// setCstCd();
	}

	/**
	 * 納入希望日ごとに明細をグルーピングし、
	 * 2番目以降のグループ先頭に1行目のコピーを追加する。
	 */
	protected void groupDtlByDeliveryRequestDate() {
		MCList<DtlR> dtlL = getDtlL();

		if (dtlL == null || dtlL.isEmpty()) {
			return;
		}

		// 元の1行目をコピー元として固定
		DtlR firstRow = dtlL.get(0);

		if (firstRow.isEmpty() || firstRow.isStatusDelete()) {
			return;
		}

		// 納入希望日ごとにグルーピング
		Map<Object, List<DtlR>> groups =
				new LinkedHashMap<>();

		for (DtlR row : dtlL) {

			if (row.isEmpty() || row.isStatusDelete()) {
				continue;
			}

			Object date = row.dlv_rqst_dt();

			groups.computeIfAbsent(
					date, k -> new ArrayList<>()
					).add(row);
		}

		if (groups.size() <= 1) {
			return;
		}

		// 並び替え後の明細
		MCList<DtlR> result = createDtlL();

		int groupIndex = 0;

		for (Map.Entry<Object, List<DtlR>> entry
				: groups.entrySet()) {

			List<DtlR> rows = entry.getValue();

			if (groupIndex > 0) {

				// コピー用の新しいRowを作成
				DtlR copy = createDtlR();

				// 元の1行目を全項目コピー
				MCRow.copyall(copy, firstRow);

				// 新規行として扱う
				copy.setStatus(Status.CREATE);

				// コピー先グループの納入希望日
				copy.dlv_rqst_dt(
						rows.get(0).dlv_rqst_dt()
						);

				// 受注明細NOは新規採番対象
				copy.slo_d_no(null);

				result.add(copy);
			}

			// グループ内の既存明細を追加
			for (DtlR row : rows) {
				result.add(row);
			}

			groupIndex++;
		}

		// 明細を再設定
		setDtlL(result);

		// テーブルの空行を調整
		DtlTable.fillSpace();
	}

	private boolean initializingDtl = false;	
	private boolean recalculatingDtlAmounts = false;

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		// 既存のイベント処理を先に実行
		super.doLCEvent(lc, info);

		// 初期化中は再計算しない
		if (initializingDtl) {
			return;
		}

		// 品目CD・数量の変更イベントだけを対象にする
		if (lc != columnDtl_itm_cd && lc != columnDtl_trd_unit_qty) {
			return;
		}

		if (recalculatingDtlAmounts) {
			return;
		}

		int index = info.getEventIndex();

		if (index < 0 || index >= getDtlL().size()) {
			return;
		}

		recalculatingDtlAmounts = true;

		try {
			recalculateDtlAmounts(index);
		}
		finally {
			recalculatingDtlAmounts = false;
		}
	}

	/**
	 * 明細の既存金額計算処理を実行する。
	 *
	 * 前提：
	 * 単価・数量など、計算に必要な値が
	 * 既に明細Rowへ設定されていること。
	 */
	protected void recalculateDtlAmounts(int index) {
		DtlR r = getDtlL().get(index);

		if (r == null || r.isEmpty()
				|| r.isStatusDelete()) {
			return;
		}

		// 単価計算
		setDtlUpri(r);

		// 値引額関連の既存処理
		setDscntAmt(r);

		// 明細金額計算
		setDtlAmt(r);
		
		// インボイス金額
		setIvAmt(r);

		// 税込金額
		setWtaxAmt(r);

		// ヘッダ金額再集計
		setHdrAmt();
		setHdrIncTaxAmt();
	}

	/**
	 * 単価計算
	 * @param r
	 */
	protected void setDtlAmt(DtlR r) {
		MCNumber qty = r.base_unit_qty();
		if (isNull(qty)) {
			return;
		}

		MCNumber upri = r.trd_cur_upri();
		MCNumber dscnt = r.trd_cur_dscnt_amt();
		if (isNull(upri) || isNull(dscnt)) {
			return;
		}

		MCNumber amt = upri.multiply(qty).subtract(dscnt);

		// GUI部品を経由せずRowに設定
		r.trd_cur_amt(amt);
	}
	
	/**
	 * 単価計算
	 * @param r
	 */
	protected void setDtlUpri(DtlR r) {
		MCNumber listUpri = r.list_pri();
		MCNumber wlSlsUpri = r.wl_sale_upri();
		String upriTyp = r.upri_typ();
		MCNumber upriRate = r.upri_rate();
		if (isNull(listUpri) || isNull(wlSlsUpri) || isNull(upriTyp) || isNull(upriRate)) {
			return;
		}

		// 単価
		MCNumber upri = null;
		switch (upriTyp) {
			case "1": upri = listUpri.multiply(upriRate).divide(100); break;
			case "2": upri = wlSlsUpri.multiply(upriRate).divide(100); break;
		}

		if (upri == null) {
			return;
		}

		// GUI部品を経由せずRowへ設定
		r.trd_cur_upri(upri);
	}

	/**
	 * 値引額を計算
	 */
	@Override
	protected void setDscntAmt(DtlR r) {
		MCNumber qty = r.base_unit_qty();
		if (isNull(qty)) {
			return;
		}

		MCNumber upri = r.trd_cur_upri();
		MCNumber upriRate = r.upri_rate();
		if (isNull(upri) || isNull(upriRate)) {
			return;
		}

		MCNumber discntAmt = upriRate.add(-100).multiply(-1).multiply(upri).multiply(qty).divide(100);

		// 診断用：GUI部品を経由せずRowに設定
		r.trd_cur_dscnt_amt(discntAmt);
	}

	/**
	 * 明細の請求繰越回数を常に1に設定する。
	 */
	@Override
	protected void setDefaultBillCrryovrTimes(int index) {
	    if (index < 0 || index >= getDtlL().size()) {
	        return;
	    }

	    DtlR r = getDtlL().get(index);

	    if (r == null || r.isEmpty()
	            || r.isStatusDelete()) {
	        return;
	    }

	    // 請求繰越回数を1に固定
	    r.bill_crryovr_times(MCNumber.ONE);
	}
//FMCB CUSTOM END
}