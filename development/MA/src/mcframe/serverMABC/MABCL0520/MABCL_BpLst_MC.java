package mcframe.serverMABC.MABCL0520;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0520.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMAUD.MAUDL6010.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mcframe.serverCore.dbc.FCVM_CO_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpLst_MC extends MABCL_BpLst_MC_A{
	//FMCB CUSTOM START
	protected String _mstSetTyp;

	protected String getMstSetTyp() {
		if (_mstSetTyp == null) {
			MAUDL_RLUtil.Srch01 o = MAUDL_RLUtil.crtSrch01();
			o.up0().mst_nm(MAC_MST_NM.MAM_BP.value());
			o.exec();
			_mstSetTyp = o.down0().mst_set_typ();
		}
		return _mstSetTyp;
	}

	protected boolean isAllCom() {
		return MAC_MST_SET_TYP.isALL_COM(getMstSetTyp());
	}

	protected boolean isAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getMstSetTyp());
	}

	/**
	 * BpLst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。<br>
	 */
	public class BpLst_UpdChk01 extends MABCL_BpLst_MC_A.BpLst_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (BpLst_UpdChk01_DtlR row : up0()) {
				if (isNotCd(row.bp_cd())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bp_cd, MABCL0306,
							getLabel(row, BpLst_UpdChk01_DtlR.$bp_cd), row.bp_cd(),
							toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue;
				}

				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 各フラグがオフの場合に指定できない項目をチェックする
				for (Map.Entry<String, String[]> m : getFlgRelationMap().entrySet()) {
					String flg = m.getKey();
					if (!row.getBoolean(flg)) {
						for (String col : m.getValue()) {
							Comparable<?> v = row.getValueNE(col);
							if (v instanceof Boolean) {
								if ((Boolean) v) {
									msgList.add(new MCMessage(row, col, MABCL0320,
											getLabel(row, flg), getLabel(row, col),
											toDispGUIIndex(row)));
								}
							}
							else {
								if (!isNull(v)) {
									msgList.add(new MCMessage(row, col, MABCL0320,
											getLabel(row, flg), getLabel(row, col),
											toDispGUIIndex(row)));
								}
							}
						}
					}
				}
				
				if (MAC_BILL_PRNT_TYP.isNOT_PRNT(row.bill_prnt_typ())) {
					for (String col : getBillPrntArray()) {
						Comparable<?> v = row.getValueNE(col);
						if (v instanceof Boolean) {
							if ((Boolean) v) {
								msgList.add(new MCMessage(row, col, MABCL0655,
										getLabel(row, col), toDispGUIIndex(row)));
							}
						}
						else {
							if (!isNull(v)) {
								msgList.add(new MCMessage(row, col, MABCL0655,
										getLabel(row, col), toDispGUIIndex(row)));
							}
						}
					}
				}
				if (!row.pay_ntc_prnt_flg()) {
					for (String col : getPayNtcPrntArray()) {
						Comparable<?> v = row.getValueNE(col);
						if (v instanceof Boolean) {
							if ((Boolean) v) {
								msgList.add(new MCMessage(row, col, MABCL0656,
										getLabel(row, col), toDispGUIIndex(row)));
							}
						}
						else {
							if (!isNull(v)) {
								msgList.add(new MCMessage(row, col, MABCL0656,
										getLabel(row, col), toDispGUIIndex(row)));
							}
						}
					}
				}
				// 条件付必須チェック
				// 債権部門ＣＤ
				if (MAC_AR_DPT_TYP.isAR(row.ar_dpt_typ())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$ar_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				// 請求起算区分
				if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(row.sls_basis_typ())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_basis_typ,
							new FXUCL_RequiredValidater()));
				}
				// 得意先項目（必須）
				if (row.cst_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$sls_amt_rnd_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$sls_tax_rnd_typ,
							new FXUCL_RequiredValidater()));
					if (!row.cst_sundry_flg()) {
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$acst_cd,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$ar_dpt_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$sls_upri_rnd_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$sls_tax_calc_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_crryovr_times,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$lot_back_stop_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$slip_each_lot_typ,
								new FXUCL_RequiredValidater()));
					}
				}
				// 請求先項目（必須）
				if (row.bcst_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$rcst_cd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_dpt_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_cl_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_prnt_typ,
							new FXUCL_RequiredValidater()));
					if (!isNull(row.bill_prnt_typ())
							&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(row.bill_prnt_typ())) {
						msgList.addAll(
								check(row, BpLst_UpdChk01_DtlR.$bill_dtl_subttl_typ,
										new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_dtl_brk_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_dtl_sort_typ,
								new FXUCL_RequiredValidater()));
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_can_slip_typ,
								new FXUCL_RequiredValidater()));
					}
				}
				// 発注先項目（必須）
				if (row.sppl_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$asppl_cd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$pay_crryovr_times,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$purc_amt_rnd_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$purc_tax_rnd_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$purc_tax_calc_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$purc_slip_each_lot_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_rcv_typ,
							new FXUCL_RequiredValidater()));
				}
				// 支払予定管理先項目（必須）
				if (row.bsppl_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$psppl_cd,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bsppl_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				// 納品先項目（必須）
				if (row.dlv_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$lg_grp_cd,
							new FXUCL_RequiredValidater()));
				}
				// 有償支給先項目（必須）
				if (row.onr_prsppl_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_basis_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_amt_rnd_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_tax_calc_typ,
							new FXUCL_RequiredValidater()));
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_tax_rnd_typ,
							new FXUCL_RequiredValidater()));
				}
				// 支給税ＣＤ
				if(row.repurc_obli_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$prov_tax_cd,
							new FXUCL_RequiredValidater()));
				}
				// 現品票ＣＤ
				if (row.stk_lst_issue_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$stk_lst_form_cd,
							new FXUCL_RequiredValidater()));
				}
				// 請求先ＣＤ
				if (!getCo().ar_no_use_flg() && row.acst_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bcst_cd,
							new FXUCL_RequiredValidater()));
				}
				// 請求先担当部門ＣＤ
				if (MAC_BILL_DPT_TYP.isBILL(row.bill_dpt_typ())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bcst_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				// 請求締日１
				if (MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_cl_day1,
							new FXUCL_RequiredValidater()));
				}
				// 請求税額端数処理区分
				if (row.tax_on_bill_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_tax_rnd_typ,
							new FXUCL_RequiredValidater()));
				}
				// 請求締遅延日数
				if (MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_cl_delay_days,
							new FXUCL_RequiredValidater()));
				}
				// 請求締前後区分
				if (MCNumber.ZERO.eq(row.bill_cl_delay_days())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bill_cl_ba_typ,
							new FXUCL_RequiredValidater()));
				}
				// 入金予定前後区分
				if (!isNull(row.bill_cal_cd())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$rcv_ba_typ,
							new FXUCL_RequiredValidater()));
				}
				// 売上明細書出力区分
				if (MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isSEL(row.bill_cl_typ())) {
					if (!isNull(row.bill_prnt_typ())
							&& !MAC_BILL_PRNT_TYP.isNOT_PRNT(row.bill_prnt_typ())) {
						msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$sls_dtl_outp_typ,
								new FXUCL_RequiredValidater()));
					}
				}
				// 支払予定管理先ＣＤ
				if (!getCo().ap_no_use_flg() && row.asppl_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$bsppl_cd,
							new FXUCL_RequiredValidater()));
				}
				// 支払締日１
				if (row.bsppl_flg() && !row.pay_spot_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$psppl_cl_day1,
							new FXUCL_RequiredValidater()));
				}
				// 配送先経由区分
				if (row.tdlv_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$via_dlv_typ,
							new FXUCL_RequiredValidater()));
				}
				// 支払税額端数処理区分
				if (row.tax_on_pay_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$pay_tax_rnd_typ,
							new FXUCL_RequiredValidater()));
				}
				// 支払予定締遅延日数
				if (row.batch_pay_schd_cl_flg()) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$pay_schd_cl_delay_days,
							new FXUCL_RequiredValidater()));
				}
				// 支払予定締前後区分
				if (MCNumber.ZERO.eq(row.pay_schd_cl_delay_days())) {
					msgList.addAll(check(row, BpLst_UpdChk01_DtlR.$pay_schd_cl_ba_typ,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
						&& !MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())) {
					if (!isNull(row.bill_cl_day1())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day1,
								MABCL0247,
								getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day1),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.bill_cl_day2())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day2,
								MABCL0247,
								getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day2),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.bill_cl_day3())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day3,
								MABCL0247,
								getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day3),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.bill_cl_day4())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day4,
								MABCL0247,
								getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day4),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.bill_cl_day5())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day5,
								MABCL0247,
								getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day5),
								toDispGUIIndex(row)));
					}
				}
				// 締日入力制御　「1」～「31」、「99」
				if (!checkDay(row.bill_cl_day1())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day1,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day1),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.bill_cl_day2())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day2,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day2),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.bill_cl_day3())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day3,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day3),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.bill_cl_day4())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day4,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day4),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.bill_cl_day5())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day5,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$bill_cl_day5),
							toDispGUIIndex(row)));
				}
				if (!checkClDays(row, new String[] {
						BpLst_UpdChk01_DtlR.$bill_cl_day1,
						BpLst_UpdChk01_DtlR.$bill_cl_day2,
						BpLst_UpdChk01_DtlR.$bill_cl_day3,
						BpLst_UpdChk01_DtlR.$bill_cl_day4,
						BpLst_UpdChk01_DtlR.$bill_cl_day5
				})) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_day1,
							MABCL0292, toDispGUIIndex(row)));
				}

				if (!checkDay(row.psppl_cl_day1())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day1,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$psppl_cl_day1),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.psppl_cl_day2())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day2,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$psppl_cl_day2),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.psppl_cl_day3())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day3,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$psppl_cl_day3),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.psppl_cl_day4())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day4,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$psppl_cl_day4),
							toDispGUIIndex(row)));
				}
				if (!checkDay(row.psppl_cl_day5())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day5,
							MABCL0267, getLabel(row, BpLst_UpdChk01_DtlR.$psppl_cl_day5),
							toDispGUIIndex(row)));
				}
				if (!checkClDays(row, new String[] {
						BpLst_UpdChk01_DtlR.$psppl_cl_day1,
						BpLst_UpdChk01_DtlR.$psppl_cl_day2,
						BpLst_UpdChk01_DtlR.$psppl_cl_day3,
						BpLst_UpdChk01_DtlR.$psppl_cl_day4,
						BpLst_UpdChk01_DtlR.$psppl_cl_day5
				})) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$psppl_cl_day1,
							MABCL0291, toDispGUIIndex(row)));
				}

				if (!isNull(row.bill_cl_delay_days())
						&& !MCNumber.ZERO.eq(row.bill_cl_delay_days())) {
					if (!isNull(row.bill_cl_ba_typ())) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_ba_typ,
										MABCL0301, toDispGUIIndex(row)));
					}
				}
				if (isNull(row.bill_cal_cd())) {
					if (!isNull(row.rcv_ba_typ())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$rcv_ba_typ,
								MABCL0302, toDispGUIIndex(row)));
					}
				}
				if (!MAC_BILL_DPT_TYP.isBILL(row.bill_dpt_typ())
						&& !isNull(row.bcst_dpt_cd())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bcst_dpt_cd,
							MABCL0130, toDispGUIIndex(row)));
				}
				if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
						&& !isNull(row.bill_cl_delay_days())) {
					msgList.add(
							new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_cl_delay_days,
									MABCL0131, toDispGUIIndex(row)));
				}
				if (!MAC_BILL_CL_TYP.isBATCH(row.bill_cl_typ())
						&& !MAC_BILL_CL_TYP.isMANUAL(row.bill_cl_typ())
						&& !MAC_BILL_CL_TYP.isSEL(row.bill_cl_typ())) {
					if (!isNull(row.sls_dtl_outp_typ())) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$sls_dtl_outp_typ,
										MABCL0132, toDispGUIIndex(row)));
					}
				}
				if (MAC_BILL_CL_TYP.isEACH_SLS(row.bill_cl_typ())) {
					if (row.bfw_bal_disp_flg()) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$bfw_bal_disp_flg,
										MABCL0133, toDispGUIIndex(row)));
					}
				}
				if (!row.tax_on_bill_flg()) {
					if (!isNull(row.bill_tax_rnd_typ())) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$tax_on_bill_flg,
										MABCL0311, toDispGUIIndex(row)));
					}
				}
				if (!row.rcv_amt_match_flg() && row.calc_com_paid_flg()) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$calc_com_paid_flg,
							MABCL0134, toDispGUIIndex(row)));
				}

				// 支給計上区分
				if (!row.onr_prsppl_flg()) {
					if (row.prov_upri_cng_flg()) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_upri_cng_flg, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_upri_cng_flg),
								toDispGUIIndex(row)));
					}
					if (row.prov_tax_cd_prio_flg()) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_tax_cd_prio_flg, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_tax_cd_prio_flg),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.prov_tax_cd())) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$prov_tax_cd,
								MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_tax_cd),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.outsrc_upri_typ())) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$outsrc_upri_typ, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$outsrc_upri_typ),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.prov_basis_typ())) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_basis_typ, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_basis_typ),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.prov_amt_rnd_typ())) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_amt_rnd_typ, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_amt_rnd_typ),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.prov_tax_calc_typ())) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_tax_calc_typ, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_tax_calc_typ),
								toDispGUIIndex(row)));
					}
					if (!isNull(row.prov_tax_rnd_typ())) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$prov_tax_rnd_typ, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$prov_tax_rnd_typ),
								toDispGUIIndex(row)));
					}
					if (row.repurc_obli_flg()) {
						msgList.add(new MCMessage(row,
								BpLst_UpdChk01_DtlR.$repurc_obli_flg, MABCL0262,
								getLabel(row, BpLst_UpdChk01_DtlR.$repurc_obli_flg),
								toDispGUIIndex(row)));
					}
				}
				else if (!isNull(row.prov_rcv_typ()) && !isNull(row.prov_basis_typ())) {
					if (row.subcon_flg()) {
						if (MAC_PROV_RCV_TYP.isNOT_ARR(row.prov_rcv_typ())
								&& !MAC_PROV_BASIS_TYP.isINPT(row.prov_basis_typ())) {
							msgList.add(
									new MCMessage(row, BpLst_UpdChk01_DtlR.$prov_basis_typ,
											MABCL0127, toDispGUIIndex(row)));
						}
					}
					else {
						if (MAC_PROV_RCV_TYP.isNOT_ARR(row.prov_rcv_typ())
								&& (!(MAC_PROV_BASIS_TYP.isGI(row.prov_basis_typ())
										|| MAC_PROV_BASIS_TYP.isINPT(row.prov_basis_typ())))) {
							msgList.add(
									new MCMessage(row, BpLst_UpdChk01_DtlR.$prov_basis_typ,
											MABCL0128, toDispGUIIndex(row)));
						}
					}
					if (!MAC_PROV_RCV_TYP.isNOT_ARR(row.prov_rcv_typ())
							&& (!(MAC_PROV_BASIS_TYP.isGR(row.prov_basis_typ())
									|| MAC_PROV_BASIS_TYP.isINPT(row.prov_basis_typ())))) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$prov_basis_typ,
										MABCL0129, toDispGUIIndex(row)));
						}		
				}
				if (row.subcon_flg()) {
					if (!isNull(row.purc_basis_typ())) {
						msgList.add(
								new MCMessage(row, BpLst_UpdChk01_DtlR.$purc_basis_typ,
										MABCL0543, toDispGUIIndex(row)));
					}
				}
				
				if (isNull(row.sppl_ship_form_cd()) && (row.po_dlv_slip_flg() || row.dlv_inst_dlv_slip_flg() || row.prms_rcpt_dlv_slip_flg())) {
					msgList.add(new MCMessage(row, null, MABCL0651, toDispGUIIndex(row)));
				}
				if (!isNull(row.ar_dpt_cd()) && !MAC_AR_DPT_TYP.isAR(row.ar_dpt_typ())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$ar_dpt_cd,
							MABCL0135, toDispGUIIndex(row)));
				}
				if (MAC_SLS_BASIS_TYP.isIN_BASIS(row.sls_basis_typ())
						&& !MAC_BILL_BASIS_TYP.isSLS_AC(row.bill_basis_typ())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_basis_typ,
							MABCL0136, toDispGUIIndex(row)));
				}
				if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(row.sls_basis_typ())
						&& !MAC_BILL_BASIS_TYP.isARRV(row.bill_basis_typ())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_basis_typ,
							MABCL0602, toDispGUIIndex(row)));
				}
				if (isNull(row.sls_basis_typ()) && !isNull(row.bill_basis_typ())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$bill_basis_typ,
							MABCL0137, toDispGUIIndex(row)));
				}

				if (!isSame(row.cntry_cd(), getCo().cntry_cd())) {
					if (row.subcon_flg()) {
						msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$subcon_flg,
								MABCL0126, toDispGUIIndex(row)));
					}
				}
				if (row.sppl_flg() && row.tdlv_flg()) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$sppl_flg,
							MABCL0603, toDispGUIIndex(row)));
				}
				if (!row.tdlv_flg() && !isNull(row.via_dlv_typ())) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$tdlv_flg,
							MABCL0153, toDispGUIIndex(row)));
				}
				if (row.tdlv_flg() && row.tdlv_req_flg()) {
					msgList.add(new MCMessage(row, BpLst_UpdChk01_DtlR.$tdlv_flg,
							MABCL0604, toDispGUIIndex(row)));
				}
			}
			return msgList;
		}

		protected boolean checkDay(MCNumber val) {
			MCNumber min = MCNumber.ONE;
			MCNumber max = new MCNumber(31);
			MCNumber last = new MCNumber(99);
			return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
		}

		/**
		 * 締日重複チェック
		 */
		protected boolean checkClDays(BpLst_UpdChk01_DtlR r, String[] clDayCol) {
			for (int i = 0; i < clDayCol.length; i++) {
				MCNumber vi = r.getNumber(clDayCol[i]);
				if (isNull(vi)) {
					break;
				}
				for (int j = i + 1; j < clDayCol.length; j++) {
					MCNumber vj = r.getNumber(clDayCol[j]);
					if (isNull(vi)) {
						break;
					}
					if (isSame(vi, vj)) {
						return false;
					}
				}
			}
			return true;
		}
	}

	protected Map<String, String[]> _flgRelationMap;
	protected String[] _billPrntArray;
	protected String[] _payNtcPrntArray;

	protected Map<String, String[]> getFlgRelationMap() {
		if (_flgRelationMap == null) {
			_flgRelationMap = new HashMap<String, String[]>() {
				{
					// 得意先項目
					put(BpLst_UpdChk01_DtlR.$cst_flg, new String[] {
							BpLst_UpdChk01_DtlR.$acst_cd, BpLst_UpdChk01_DtlR.$ar_dpt_typ,
							BpLst_UpdChk01_DtlR.$ar_dpt_cd,
							BpLst_UpdChk01_DtlR.$cst_cntct_dpt,
							BpLst_UpdChk01_DtlR.$cst_cntct_psn,
							BpLst_UpdChk01_DtlR.$cst_cntct_psn_title,
							BpLst_UpdChk01_DtlR.$cst_sundry_flg,
							BpLst_UpdChk01_DtlR.$sls_upri_req_typ,
							BpLst_UpdChk01_DtlR.$sls_upri_cng_flg,
							BpLst_UpdChk01_DtlR.$sls_upri_rnd_typ,
							BpLst_UpdChk01_DtlR.$sls_amt_rnd_typ,
							BpLst_UpdChk01_DtlR.$sls_tax_calc_typ,
							BpLst_UpdChk01_DtlR.$sls_tax_rnd_typ,
							BpLst_UpdChk01_DtlR.$sls_basis_typ,
							BpLst_UpdChk01_DtlR.$bill_basis_typ,
							BpLst_UpdChk01_DtlR.$ship_schd_split_typ,
							BpLst_UpdChk01_DtlR.$bill_crryovr_times,
							BpLst_UpdChk01_DtlR.$lot_back_stop_typ,
							BpLst_UpdChk01_DtlR.$slip_each_lot_typ,
							BpLst_UpdChk01_DtlR.$cst_ship_form_cd,
							BpLst_UpdChk01_DtlR.$stk_lst_issue_flg,
							BpLst_UpdChk01_DtlR.$stk_lst_form_cd,
							BpLst_UpdChk01_DtlR.$sls_tax_cd,
							BpLst_UpdChk01_DtlR.$sls_tax_cd_prio_flg,
							BpLst_UpdChk01_DtlR.$wrk_ar_flg,
							BpLst_UpdChk01_DtlR.$cst_iv_flg,
							BpLst_UpdChk01_DtlR.$cst_tterm_cd1,
							BpLst_UpdChk01_DtlR.$cst_tterm_cd2,
							BpLst_UpdChk01_DtlR.$cst_tterm_cd3,
							BpLst_UpdChk01_DtlR.$sls_anly_cd1,
							BpLst_UpdChk01_DtlR.$sls_anly_cd2,
							BpLst_UpdChk01_DtlR.$sls_anly_cd3,
							BpLst_UpdChk01_DtlR.$not_lg_mix_flg,
							BpLst_UpdChk01_DtlR.$not_lot_mix_flg,
							BpLst_UpdChk01_DtlR.$not_sublot_mix_flg
					});
					// 売掛先項目
					put(BpLst_UpdChk01_DtlR.$acst_flg, new String[] {
							BpLst_UpdChk01_DtlR.$bcst_cd
					});
					// 請求先項目
					put(BpLst_UpdChk01_DtlR.$bcst_flg, new String[] {
							BpLst_UpdChk01_DtlR.$rcst_cd, BpLst_UpdChk01_DtlR.$ar_cred_cd,
							BpLst_UpdChk01_DtlR.$bill_dpt_typ,
							BpLst_UpdChk01_DtlR.$bcst_dpt_cd,
							BpLst_UpdChk01_DtlR.$bill_cl_typ,
							BpLst_UpdChk01_DtlR.$bill_cl_day1,
							BpLst_UpdChk01_DtlR.$bill_cl_day2,
							BpLst_UpdChk01_DtlR.$bill_cl_day3,
							BpLst_UpdChk01_DtlR.$bill_cl_day4,
							BpLst_UpdChk01_DtlR.$bill_cl_day5,
							BpLst_UpdChk01_DtlR.$tax_on_bill_flg,
							BpLst_UpdChk01_DtlR.$bill_tax_rnd_typ,
							BpLst_UpdChk01_DtlR.$bill_cl_delay_days,
							BpLst_UpdChk01_DtlR.$bill_cl_ba_typ,
							BpLst_UpdChk01_DtlR.$sls_interim_cl_flg,
							BpLst_UpdChk01_DtlR.$bill_cal_cd,
							BpLst_UpdChk01_DtlR.$rcv_ba_typ,
							BpLst_UpdChk01_DtlR.$bill_zip_cd,
							BpLst_UpdChk01_DtlR.$bill_addr1,
							BpLst_UpdChk01_DtlR.$bill_addr2,
							BpLst_UpdChk01_DtlR.$bill_addr3,
							BpLst_UpdChk01_DtlR.$bill_addr4,
							BpLst_UpdChk01_DtlR.$bill_tel,
							BpLst_UpdChk01_DtlR.$bill_bcst_nm,
							BpLst_UpdChk01_DtlR.$bill_bcst_dpt,
							BpLst_UpdChk01_DtlR.$bill_bcst_psn,
							BpLst_UpdChk01_DtlR.$bill_bcst_psn_title,
							BpLst_UpdChk01_DtlR.$bfw_bal_disp_flg,
							BpLst_UpdChk01_DtlR.$sls_dtl_outp_typ,
							BpLst_UpdChk01_DtlR.$bill_prnt_typ,
							BpLst_UpdChk01_DtlR.$bill_dtl_outp_flg,
							BpLst_UpdChk01_DtlR.$bill_dtl_rcv_flg,
							BpLst_UpdChk01_DtlR.$bill_dtl_subttl_typ,
							BpLst_UpdChk01_DtlR.$bill_dtl_brk_typ,
							BpLst_UpdChk01_DtlR.$bill_dtl_sort_typ,
							BpLst_UpdChk01_DtlR.$bill_can_slip_typ,
							BpLst_UpdChk01_DtlR.$auto_line_appl_flg,
							BpLst_UpdChk01_DtlR.$ar_setoff_grp_cd
					});
					// 入金先項目
					put(BpLst_UpdChk01_DtlR.$rcst_flg, new String[] {
							BpLst_UpdChk01_DtlR.$xfr_psn,
							BpLst_UpdChk01_DtlR.$rcv_auto_appl_tgt_flg,
							BpLst_UpdChk01_DtlR.$rcv_amt_match_flg,
							BpLst_UpdChk01_DtlR.$ar_sttl_typ_match_flg,
							BpLst_UpdChk01_DtlR.$calc_com_paid_flg,
							BpLst_UpdChk01_DtlR.$auto_appl_delay_days
					});
					// 納品先項目
					put(BpLst_UpdChk01_DtlR.$dlv_flg, new String[] {
							BpLst_UpdChk01_DtlR.$dlv_sundry_flg,
							BpLst_UpdChk01_DtlR.$dlv_cntct_dpt,
							BpLst_UpdChk01_DtlR.$dlv_cntct_psn,
							BpLst_UpdChk01_DtlR.$dlv_cntct_psn_title,
							BpLst_UpdChk01_DtlR.$pri_prnt_flg,
							BpLst_UpdChk01_DtlR.$cnsgn_stktk_flg,
							BpLst_UpdChk01_DtlR.$tdlv_flg,
							BpLst_UpdChk01_DtlR.$via_dlv_typ,
							BpLst_UpdChk01_DtlR.$tdlv_req_flg,
							BpLst_UpdChk01_DtlR.$lg_grp_cd,
							BpLst_UpdChk01_DtlR.$dlv_cal_cd,
							BpLst_UpdChk01_DtlR.$dlv_chnnl1,
							BpLst_UpdChk01_DtlR.$dlv_chnnl2,
							BpLst_UpdChk01_DtlR.$dlv_chnnl3
					});
					// 発注先項目
					put(BpLst_UpdChk01_DtlR.$sppl_flg, new String[] {
							BpLst_UpdChk01_DtlR.$asppl_cd,
							BpLst_UpdChk01_DtlR.$vmi_purc_dpt_cd,
							BpLst_UpdChk01_DtlR.$subcon_flg,
							BpLst_UpdChk01_DtlR.$po_print_cd,
							BpLst_UpdChk01_DtlR.$sppl_ship_form_cd,
							BpLst_UpdChk01_DtlR.$pay_crryovr_times,
							BpLst_UpdChk01_DtlR.$sppl_cntct_dpt,
							BpLst_UpdChk01_DtlR.$sppl_cntct_psn,
							BpLst_UpdChk01_DtlR.$sppl_cntct_psn_title,
							BpLst_UpdChk01_DtlR.$purc_upri_req_typ,
							BpLst_UpdChk01_DtlR.$purc_upri_cng_flg,
							BpLst_UpdChk01_DtlR.$purc_amt_rnd_typ,
							BpLst_UpdChk01_DtlR.$purc_tax_rnd_typ,
							BpLst_UpdChk01_DtlR.$purc_tax_calc_typ,
							BpLst_UpdChk01_DtlR.$purc_tax_cd,
							BpLst_UpdChk01_DtlR.$purc_tax_cd_prio_flg,
							BpLst_UpdChk01_DtlR.$wrk_po_flg,
							BpLst_UpdChk01_DtlR.$wrk_ap_flg,
							BpLst_UpdChk01_DtlR.$purc_slip_each_lot_typ,
							BpLst_UpdChk01_DtlR.$prov_rcv_typ,
							BpLst_UpdChk01_DtlR.$onr_prsppl_flg,
							BpLst_UpdChk01_DtlR.$repurc_obli_flg,
							BpLst_UpdChk01_DtlR.$outsrc_upri_typ,
							BpLst_UpdChk01_DtlR.$prov_basis_typ,
							BpLst_UpdChk01_DtlR.$prov_upri_cng_flg,
							BpLst_UpdChk01_DtlR.$prov_amt_rnd_typ,
							BpLst_UpdChk01_DtlR.$prov_tax_rnd_typ,
							BpLst_UpdChk01_DtlR.$prov_tax_calc_typ,
							BpLst_UpdChk01_DtlR.$prov_tax_cd,
							BpLst_UpdChk01_DtlR.$prov_tax_cd_prio_flg,
							BpLst_UpdChk01_DtlR.$sppl_cal_cd,
							BpLst_UpdChk01_DtlR.$sppl_iv_flg,
							BpLst_UpdChk01_DtlR.$prms_recv_flg,
							BpLst_UpdChk01_DtlR.$sppl_tterm_cd1,
							BpLst_UpdChk01_DtlR.$sppl_tterm_cd2,
							BpLst_UpdChk01_DtlR.$sppl_tterm_cd3,
							BpLst_UpdChk01_DtlR.$purc_basis_typ
					});
					// 買掛先項目
					put(BpLst_UpdChk01_DtlR.$asppl_flg, new String[] {
							BpLst_UpdChk01_DtlR.$bsppl_cd, BpLst_UpdChk01_DtlR.$ap_dpt_cd
					});
					// 支払予定管理先項目
					put(BpLst_UpdChk01_DtlR.$bsppl_flg, new String[] {
							BpLst_UpdChk01_DtlR.$psppl_cd,
							BpLst_UpdChk01_DtlR.$ap_cred_cd,
							BpLst_UpdChk01_DtlR.$bsppl_dpt_cd,
							BpLst_UpdChk01_DtlR.$pay_spot_flg,
							BpLst_UpdChk01_DtlR.$psppl_cl_day1,
							BpLst_UpdChk01_DtlR.$psppl_cl_day2,
							BpLst_UpdChk01_DtlR.$psppl_cl_day3,
							BpLst_UpdChk01_DtlR.$psppl_cl_day4,
							BpLst_UpdChk01_DtlR.$psppl_cl_day5,
							BpLst_UpdChk01_DtlR.$purc_interim_cl_flg,
							BpLst_UpdChk01_DtlR.$ap_setoff_grp_cd,
							BpLst_UpdChk01_DtlR.$pay_bank_ac_cd,
							BpLst_UpdChk01_DtlR.$tax_on_pay_flg,
							BpLst_UpdChk01_DtlR.$pay_tax_rnd_typ,
							BpLst_UpdChk01_DtlR.$pay_schd_ba_typ,
							BpLst_UpdChk01_DtlR.$batch_pay_schd_cl_flg,
							BpLst_UpdChk01_DtlR.$pay_schd_cl_delay_days,
							BpLst_UpdChk01_DtlR.$pay_schd_cl_ba_typ
					});
					// 支払先項目
					put(BpLst_UpdChk01_DtlR.$psppl_flg, new String[] {
							BpLst_UpdChk01_DtlR.$psppl_rmrks,
							BpLst_UpdChk01_DtlR.$note_days,
							BpLst_UpdChk01_DtlR.$pay_dpt_cd
					});
				}
			};
		}
		return _flgRelationMap;
	}

	protected String[] getBillPrntArray() {
		if (_billPrntArray == null) {
			_billPrntArray = new String[] {
				BpLst_UpdChk01_DtlR.$bill_zip_cd,
				BpLst_UpdChk01_DtlR.$bill_addr1,
				BpLst_UpdChk01_DtlR.$bill_addr2,
				BpLst_UpdChk01_DtlR.$bill_addr3,
				BpLst_UpdChk01_DtlR.$bill_addr4,
				BpLst_UpdChk01_DtlR.$bill_tel,
				BpLst_UpdChk01_DtlR.$bill_bcst_nm,
				BpLst_UpdChk01_DtlR.$bill_bcst_dpt,
				BpLst_UpdChk01_DtlR.$bill_bcst_psn,
				BpLst_UpdChk01_DtlR.$bill_bcst_psn_title,
				BpLst_UpdChk01_DtlR.$sls_dtl_outp_typ,
				BpLst_UpdChk01_DtlR.$bill_dtl_outp_flg,
				BpLst_UpdChk01_DtlR.$bfw_bal_disp_flg,
				BpLst_UpdChk01_DtlR.$bill_dtl_rcv_flg,
				BpLst_UpdChk01_DtlR.$bill_dtl_subttl_typ,
				BpLst_UpdChk01_DtlR.$bill_dtl_brk_typ,
				BpLst_UpdChk01_DtlR.$bill_dtl_sort_typ,
				BpLst_UpdChk01_DtlR.$bill_can_slip_typ,
				BpLst_UpdChk01_DtlR.$bill_dtl_adv_flg
			};
		}
		return _billPrntArray;
	}
	protected String[] getPayNtcPrntArray() {
		if (_payNtcPrntArray == null) {
			_payNtcPrntArray = new String[] {
					BpLst_UpdChk01_DtlR.$pay_ntc_zip_cd,
					BpLst_UpdChk01_DtlR.$pay_ntc_addr1,
					BpLst_UpdChk01_DtlR.$pay_ntc_addr2,
					BpLst_UpdChk01_DtlR.$pay_ntc_addr3,
					BpLst_UpdChk01_DtlR.$pay_ntc_addr4,
					BpLst_UpdChk01_DtlR.$pay_ntc_tel,
					BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_nm,
					BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_dpt,
					BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_psn,
					BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_psn_title,
					BpLst_UpdChk01_DtlR.$pay_ntc_dtl_outp_flg,
					BpLst_UpdChk01_DtlR.$pay_ntc_bfw_bal_disp_flg,
					BpLst_UpdChk01_DtlR.$pay_ntc_adv_pay_flg,
					BpLst_UpdChk01_DtlR.$pay_ntc_dtl_pay_flg,
					BpLst_UpdChk01_DtlR.$pay_ntc_dtl_subttl_typ,
					BpLst_UpdChk01_DtlR.$pay_ntc_dtl_brk_typ,
					BpLst_UpdChk01_DtlR.$pay_ntc_dtl_sort_typ,
					BpLst_UpdChk01_DtlR.$pay_ntc_can_slip_typ
			};
		}
		return _payNtcPrntArray;
	}

	/**
	 * BpLst_UpdChk02オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。(取引先マスタ(全社)のみを対象とする場合に使用)<br>
	 */
	public class BpLst_UpdChk02 extends MABCL_BpLst_MC_A.BpLst_UpdChk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUp() {
			super.initUp();
			initBpCmnCache(up0());
			editUp(up0());
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp(MCList<BpLst_UpdChk02_DtlR> dtlL) {
			// 取引先マスタ（共通）からデータを取得
			for(BpLst_UpdChk02_DtlR r : dtlL) {
				completionBpCmn(r);
			}
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			
			for(BpLst_UpdChk02_DtlR r : up0()) {
				// キャッシュから取引先マスタ（共通）データの取得
				MAM_BP_CMN_R bpCmnR = getBpCmnR(r.bp_cd());
				if (isNull(bpCmnR)) {
					msgList.add(new MCMessage(r, null, MABCL0601, toDispGUIIndex(r)));
				}
				
			}
			if(!hasErr()) {
				doBpLstUpdChk01(msgList);
			}
			return msgList;
		}
		
		/**
		 * BPLst_UpdChk01の固有チェックを行う
		 */
		protected void doBpLstUpdChk01(MCMessageList msgList) {
			BpLst_UpdChk01 chk01 = crtBpLst_UpdChk01();
			MCList<BpLst_UpdChk01_DtlR> chkL = MCList.create(BpLst_UpdChk01_DtlR.class);
			addAll(chkL, up0(), createMap_BpLst_UpdChk01_DtlR_BpLst_UpdChk02_DtlR());
			chk01.up0().addAll(chkL);
			msgList.addAll(chk01.doServerCheckSub());
		}
		
		protected Map_BpLst_UpdChk01_DtlR_BpLst_UpdChk02_DtlR<BpLst_UpdChk01_DtlR,BpLst_UpdChk02_DtlR> createMap_BpLst_UpdChk01_DtlR_BpLst_UpdChk02_DtlR() {
			return new Map_BpLst_UpdChk01_DtlR_BpLst_UpdChk02_DtlR<BpLst_UpdChk01_DtlR, BpLst_UpdChk02_DtlR>();
		}

		public class Map_BpLst_UpdChk01_DtlR_BpLst_UpdChk02_DtlR<D extends BpLst_UpdChk01_DtlR, S extends BpLst_UpdChk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_cd, BpLst_UpdChk02_DtlR.$bp_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_nm, BpLst_UpdChk02_DtlR.$bp_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_alt_nm1, BpLst_UpdChk02_DtlR.$bp_alt_nm1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_alt_nm2, BpLst_UpdChk02_DtlR.$bp_alt_nm2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_alt_nm3, BpLst_UpdChk02_DtlR.$bp_alt_nm3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_alt_nm4, BpLst_UpdChk02_DtlR.$bp_alt_nm4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$zip_cd, BpLst_UpdChk02_DtlR.$zip_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$addr1, BpLst_UpdChk02_DtlR.$addr1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$addr2, BpLst_UpdChk02_DtlR.$addr2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$addr3, BpLst_UpdChk02_DtlR.$addr3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$addr4, BpLst_UpdChk02_DtlR.$addr4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$tel, BpLst_UpdChk02_DtlR.$tel);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$fax, BpLst_UpdChk02_DtlR.$fax);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ein, BpLst_UpdChk02_DtlR.$ein);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$std_co_cd, BpLst_UpdChk02_DtlR.$std_co_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cntry_cd, BpLst_UpdChk02_DtlR.$cntry_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$area_cd, BpLst_UpdChk02_DtlR.$area_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cur_cd, BpLst_UpdChk02_DtlR.$cur_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prnt_lcl_cd, BpLst_UpdChk02_DtlR.$prnt_lcl_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd1, BpLst_UpdChk02_DtlR.$bp_grp_cd1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd2, BpLst_UpdChk02_DtlR.$bp_grp_cd2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd3, BpLst_UpdChk02_DtlR.$bp_grp_cd3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd4, BpLst_UpdChk02_DtlR.$bp_grp_cd4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd5, BpLst_UpdChk02_DtlR.$bp_grp_cd5);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd6, BpLst_UpdChk02_DtlR.$bp_grp_cd6);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd7, BpLst_UpdChk02_DtlR.$bp_grp_cd7);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd8, BpLst_UpdChk02_DtlR.$bp_grp_cd8);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd9, BpLst_UpdChk02_DtlR.$bp_grp_cd9);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_grp_cd10, BpLst_UpdChk02_DtlR.$bp_grp_cd10);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_alc_grp, BpLst_UpdChk02_DtlR.$bp_alc_grp);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_flg, BpLst_UpdChk02_DtlR.$cst_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$acst_flg, BpLst_UpdChk02_DtlR.$acst_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bcst_flg, BpLst_UpdChk02_DtlR.$bcst_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$rcst_flg, BpLst_UpdChk02_DtlR.$rcst_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_flg, BpLst_UpdChk02_DtlR.$sppl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$asppl_flg, BpLst_UpdChk02_DtlR.$asppl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bsppl_flg, BpLst_UpdChk02_DtlR.$bsppl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_flg, BpLst_UpdChk02_DtlR.$psppl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cred_flg, BpLst_UpdChk02_DtlR.$cred_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_flg, BpLst_UpdChk02_DtlR.$dlv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$maker_flg, BpLst_UpdChk02_DtlR.$maker_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dest_flg, BpLst_UpdChk02_DtlR.$dest_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$all_com_flg, BpLst_UpdChk02_DtlR.$all_com_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$acst_cd, BpLst_UpdChk02_DtlR.$acst_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ar_dpt_typ, BpLst_UpdChk02_DtlR.$ar_dpt_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ar_dpt_cd, BpLst_UpdChk02_DtlR.$ar_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_cntct_dpt, BpLst_UpdChk02_DtlR.$cst_cntct_dpt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_cntct_psn, BpLst_UpdChk02_DtlR.$cst_cntct_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_cntct_psn_title, BpLst_UpdChk02_DtlR.$cst_cntct_psn_title);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_sundry_flg, BpLst_UpdChk02_DtlR.$cst_sundry_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_upri_req_typ, BpLst_UpdChk02_DtlR.$sls_upri_req_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_upri_cng_flg, BpLst_UpdChk02_DtlR.$sls_upri_cng_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_upri_rnd_typ, BpLst_UpdChk02_DtlR.$sls_upri_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_amt_rnd_typ, BpLst_UpdChk02_DtlR.$sls_amt_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_tax_calc_typ, BpLst_UpdChk02_DtlR.$sls_tax_calc_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_tax_rnd_typ, BpLst_UpdChk02_DtlR.$sls_tax_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_basis_typ, BpLst_UpdChk02_DtlR.$sls_basis_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_basis_typ, BpLst_UpdChk02_DtlR.$bill_basis_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ship_schd_split_typ, BpLst_UpdChk02_DtlR.$ship_schd_split_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_crryovr_times, BpLst_UpdChk02_DtlR.$bill_crryovr_times);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$lot_back_stop_typ, BpLst_UpdChk02_DtlR.$lot_back_stop_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$slip_each_lot_typ, BpLst_UpdChk02_DtlR.$slip_each_lot_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_ship_form_cd, BpLst_UpdChk02_DtlR.$cst_ship_form_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$stk_lst_issue_flg, BpLst_UpdChk02_DtlR.$stk_lst_issue_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$stk_lst_form_cd, BpLst_UpdChk02_DtlR.$stk_lst_form_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_tax_cd, BpLst_UpdChk02_DtlR.$sls_tax_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_tax_cd_prio_flg, BpLst_UpdChk02_DtlR.$sls_tax_cd_prio_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$wrk_ar_flg, BpLst_UpdChk02_DtlR.$wrk_ar_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_iv_flg, BpLst_UpdChk02_DtlR.$cst_iv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ship_lt, BpLst_UpdChk02_DtlR.$ship_lt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_tterm_cd1, BpLst_UpdChk02_DtlR.$cst_tterm_cd1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_tterm_cd2, BpLst_UpdChk02_DtlR.$cst_tterm_cd2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cst_tterm_cd3, BpLst_UpdChk02_DtlR.$cst_tterm_cd3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_anly_cd1, BpLst_UpdChk02_DtlR.$sls_anly_cd1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_anly_cd2, BpLst_UpdChk02_DtlR.$sls_anly_cd2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_anly_cd3, BpLst_UpdChk02_DtlR.$sls_anly_cd3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$not_lg_mix_flg, BpLst_UpdChk02_DtlR.$not_lg_mix_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$not_lot_mix_flg, BpLst_UpdChk02_DtlR.$not_lot_mix_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$not_sublot_mix_flg, BpLst_UpdChk02_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bcst_cd, BpLst_UpdChk02_DtlR.$bcst_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$rcst_cd, BpLst_UpdChk02_DtlR.$rcst_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ar_cred_cd, BpLst_UpdChk02_DtlR.$ar_cred_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dpt_typ, BpLst_UpdChk02_DtlR.$bill_dpt_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bcst_dpt_cd, BpLst_UpdChk02_DtlR.$bcst_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_typ, BpLst_UpdChk02_DtlR.$bill_cl_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_day1, BpLst_UpdChk02_DtlR.$bill_cl_day1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_day2, BpLst_UpdChk02_DtlR.$bill_cl_day2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_day3, BpLst_UpdChk02_DtlR.$bill_cl_day3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_day4, BpLst_UpdChk02_DtlR.$bill_cl_day4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_day5, BpLst_UpdChk02_DtlR.$bill_cl_day5);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$tax_on_bill_flg, BpLst_UpdChk02_DtlR.$tax_on_bill_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_tax_rnd_typ, BpLst_UpdChk02_DtlR.$bill_tax_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_delay_days, BpLst_UpdChk02_DtlR.$bill_cl_delay_days);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cl_ba_typ, BpLst_UpdChk02_DtlR.$bill_cl_ba_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_interim_cl_flg, BpLst_UpdChk02_DtlR.$sls_interim_cl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_cal_cd, BpLst_UpdChk02_DtlR.$bill_cal_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$rcv_ba_typ, BpLst_UpdChk02_DtlR.$rcv_ba_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_zip_cd, BpLst_UpdChk02_DtlR.$bill_zip_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_addr1, BpLst_UpdChk02_DtlR.$bill_addr1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_addr2, BpLst_UpdChk02_DtlR.$bill_addr2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_addr3, BpLst_UpdChk02_DtlR.$bill_addr3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_addr4, BpLst_UpdChk02_DtlR.$bill_addr4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_tel, BpLst_UpdChk02_DtlR.$bill_tel);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_bcst_nm, BpLst_UpdChk02_DtlR.$bill_bcst_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_bcst_dpt, BpLst_UpdChk02_DtlR.$bill_bcst_dpt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_bcst_psn, BpLst_UpdChk02_DtlR.$bill_bcst_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_bcst_psn_title, BpLst_UpdChk02_DtlR.$bill_bcst_psn_title);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bfw_bal_disp_flg, BpLst_UpdChk02_DtlR.$bfw_bal_disp_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sls_dtl_outp_typ, BpLst_UpdChk02_DtlR.$sls_dtl_outp_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_prnt_typ, BpLst_UpdChk02_DtlR.$bill_prnt_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_outp_flg, BpLst_UpdChk02_DtlR.$bill_dtl_outp_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_rcv_flg, BpLst_UpdChk02_DtlR.$bill_dtl_rcv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_subttl_typ, BpLst_UpdChk02_DtlR.$bill_dtl_subttl_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_brk_typ, BpLst_UpdChk02_DtlR.$bill_dtl_brk_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_sort_typ, BpLst_UpdChk02_DtlR.$bill_dtl_sort_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_can_slip_typ, BpLst_UpdChk02_DtlR.$bill_can_slip_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$auto_line_appl_flg, BpLst_UpdChk02_DtlR.$auto_line_appl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ar_setoff_grp_cd, BpLst_UpdChk02_DtlR.$ar_setoff_grp_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$xfr_psn, BpLst_UpdChk02_DtlR.$xfr_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$rcv_auto_appl_tgt_flg, BpLst_UpdChk02_DtlR.$rcv_auto_appl_tgt_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$rcv_amt_match_flg, BpLst_UpdChk02_DtlR.$rcv_amt_match_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ar_sttl_typ_match_flg, BpLst_UpdChk02_DtlR.$ar_sttl_typ_match_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$calc_com_paid_flg, BpLst_UpdChk02_DtlR.$calc_com_paid_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$auto_appl_delay_days, BpLst_UpdChk02_DtlR.$auto_appl_delay_days);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$asppl_cd, BpLst_UpdChk02_DtlR.$asppl_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$vmi_purc_dpt_cd, BpLst_UpdChk02_DtlR.$vmi_purc_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$subcon_flg, BpLst_UpdChk02_DtlR.$subcon_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$po_print_cd, BpLst_UpdChk02_DtlR.$po_print_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_ship_form_cd, BpLst_UpdChk02_DtlR.$sppl_ship_form_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$po_dlv_slip_flg, BpLst_UpdChk02_DtlR.$po_dlv_slip_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_crryovr_times, BpLst_UpdChk02_DtlR.$pay_crryovr_times);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_cntct_dpt, BpLst_UpdChk02_DtlR.$sppl_cntct_dpt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_cntct_psn, BpLst_UpdChk02_DtlR.$sppl_cntct_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_cntct_psn_title, BpLst_UpdChk02_DtlR.$sppl_cntct_psn_title);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_upri_req_typ, BpLst_UpdChk02_DtlR.$purc_upri_req_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_upri_cng_flg, BpLst_UpdChk02_DtlR.$purc_upri_cng_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_amt_rnd_typ, BpLst_UpdChk02_DtlR.$purc_amt_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_tax_rnd_typ, BpLst_UpdChk02_DtlR.$purc_tax_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_tax_calc_typ, BpLst_UpdChk02_DtlR.$purc_tax_calc_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_tax_cd, BpLst_UpdChk02_DtlR.$purc_tax_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_tax_cd_prio_flg, BpLst_UpdChk02_DtlR.$purc_tax_cd_prio_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$wrk_po_flg, BpLst_UpdChk02_DtlR.$wrk_po_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$wrk_ap_flg, BpLst_UpdChk02_DtlR.$wrk_ap_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_slip_each_lot_typ, BpLst_UpdChk02_DtlR.$purc_slip_each_lot_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_rcv_typ, BpLst_UpdChk02_DtlR.$prov_rcv_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$onr_prsppl_flg, BpLst_UpdChk02_DtlR.$onr_prsppl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$repurc_obli_flg, BpLst_UpdChk02_DtlR.$repurc_obli_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$outsrc_upri_typ, BpLst_UpdChk02_DtlR.$outsrc_upri_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_basis_typ, BpLst_UpdChk02_DtlR.$prov_basis_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_upri_cng_flg, BpLst_UpdChk02_DtlR.$prov_upri_cng_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_amt_rnd_typ, BpLst_UpdChk02_DtlR.$prov_amt_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_tax_rnd_typ, BpLst_UpdChk02_DtlR.$prov_tax_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_tax_calc_typ, BpLst_UpdChk02_DtlR.$prov_tax_calc_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_tax_cd, BpLst_UpdChk02_DtlR.$prov_tax_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prov_tax_cd_prio_flg, BpLst_UpdChk02_DtlR.$prov_tax_cd_prio_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_cal_cd, BpLst_UpdChk02_DtlR.$sppl_cal_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_iv_flg, BpLst_UpdChk02_DtlR.$sppl_iv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$prms_recv_flg, BpLst_UpdChk02_DtlR.$prms_recv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_tterm_cd1, BpLst_UpdChk02_DtlR.$sppl_tterm_cd1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_tterm_cd2, BpLst_UpdChk02_DtlR.$sppl_tterm_cd2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$sppl_tterm_cd3, BpLst_UpdChk02_DtlR.$sppl_tterm_cd3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bsppl_cd, BpLst_UpdChk02_DtlR.$bsppl_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ap_dpt_cd, BpLst_UpdChk02_DtlR.$ap_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cd, BpLst_UpdChk02_DtlR.$psppl_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ap_cred_cd, BpLst_UpdChk02_DtlR.$ap_cred_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bsppl_dpt_cd, BpLst_UpdChk02_DtlR.$bsppl_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_spot_flg, BpLst_UpdChk02_DtlR.$pay_spot_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cl_day1, BpLst_UpdChk02_DtlR.$psppl_cl_day1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cl_day2, BpLst_UpdChk02_DtlR.$psppl_cl_day2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cl_day3, BpLst_UpdChk02_DtlR.$psppl_cl_day3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cl_day4, BpLst_UpdChk02_DtlR.$psppl_cl_day4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_cl_day5, BpLst_UpdChk02_DtlR.$psppl_cl_day5);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_interim_cl_flg, BpLst_UpdChk02_DtlR.$purc_interim_cl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ap_setoff_grp_cd, BpLst_UpdChk02_DtlR.$ap_setoff_grp_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_bank_ac_cd, BpLst_UpdChk02_DtlR.$pay_bank_ac_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_schd_ba_typ, BpLst_UpdChk02_DtlR.$pay_schd_ba_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$tax_on_pay_flg, BpLst_UpdChk02_DtlR.$tax_on_pay_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_tax_rnd_typ, BpLst_UpdChk02_DtlR.$pay_tax_rnd_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$batch_pay_schd_cl_flg, BpLst_UpdChk02_DtlR.$batch_pay_schd_cl_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_schd_cl_delay_days, BpLst_UpdChk02_DtlR.$pay_schd_cl_delay_days);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_schd_cl_ba_typ, BpLst_UpdChk02_DtlR.$pay_schd_cl_ba_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$psppl_rmrks, BpLst_UpdChk02_DtlR.$psppl_rmrks);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$note_days, BpLst_UpdChk02_DtlR.$note_days);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_dpt_cd, BpLst_UpdChk02_DtlR.$pay_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_sundry_flg, BpLst_UpdChk02_DtlR.$dlv_sundry_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_cntct_dpt, BpLst_UpdChk02_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_cntct_psn, BpLst_UpdChk02_DtlR.$dlv_cntct_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_cntct_psn_title, BpLst_UpdChk02_DtlR.$dlv_cntct_psn_title);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pri_prnt_flg, BpLst_UpdChk02_DtlR.$pri_prnt_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$cnsgn_stktk_flg, BpLst_UpdChk02_DtlR.$cnsgn_stktk_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$tdlv_flg, BpLst_UpdChk02_DtlR.$tdlv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$via_dlv_typ, BpLst_UpdChk02_DtlR.$via_dlv_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$tdlv_req_flg, BpLst_UpdChk02_DtlR.$tdlv_req_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$lg_grp_cd, BpLst_UpdChk02_DtlR.$lg_grp_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_cal_cd, BpLst_UpdChk02_DtlR.$dlv_cal_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_chnnl1, BpLst_UpdChk02_DtlR.$dlv_chnnl1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_chnnl2, BpLst_UpdChk02_DtlR.$dlv_chnnl2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$dlv_chnnl3, BpLst_UpdChk02_DtlR.$dlv_chnnl3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo1, BpLst_UpdChk02_DtlR.$memo1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo2, BpLst_UpdChk02_DtlR.$memo2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo3, BpLst_UpdChk02_DtlR.$memo3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo4, BpLst_UpdChk02_DtlR.$memo4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo5, BpLst_UpdChk02_DtlR.$memo5);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo6, BpLst_UpdChk02_DtlR.$memo6);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo7, BpLst_UpdChk02_DtlR.$memo7);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo8, BpLst_UpdChk02_DtlR.$memo8);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo9, BpLst_UpdChk02_DtlR.$memo9);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo10, BpLst_UpdChk02_DtlR.$memo10);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo11, BpLst_UpdChk02_DtlR.$memo11);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo12, BpLst_UpdChk02_DtlR.$memo12);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo13, BpLst_UpdChk02_DtlR.$memo13);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo14, BpLst_UpdChk02_DtlR.$memo14);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo15, BpLst_UpdChk02_DtlR.$memo15);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo16, BpLst_UpdChk02_DtlR.$memo16);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo17, BpLst_UpdChk02_DtlR.$memo17);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo18, BpLst_UpdChk02_DtlR.$memo18);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo19, BpLst_UpdChk02_DtlR.$memo19);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$memo20, BpLst_UpdChk02_DtlR.$memo20);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$del_flg, BpLst_UpdChk02_DtlR.$del_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$del_usr_id, BpLst_UpdChk02_DtlR.$del_usr_id);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$del_usr_nm, BpLst_UpdChk02_DtlR.$del_usr_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$del_ts, BpLst_UpdChk02_DtlR.$del_ts);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ins_usr_id, BpLst_UpdChk02_DtlR.$ins_usr_id);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ins_usr_nm, BpLst_UpdChk02_DtlR.$ins_usr_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ins_ts, BpLst_UpdChk02_DtlR.$ins_ts);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$ins_func_id, BpLst_UpdChk02_DtlR.$ins_func_id);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_cntr, BpLst_UpdChk02_DtlR.$upd_cntr);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_usr_id, BpLst_UpdChk02_DtlR.$upd_usr_id);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_usr_nm, BpLst_UpdChk02_DtlR.$upd_usr_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_ts, BpLst_UpdChk02_DtlR.$upd_ts);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_func_id, BpLst_UpdChk02_DtlR.$upd_func_id);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$upd_srv_req_no, BpLst_UpdChk02_DtlR.$upd_srv_req_no);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$purc_basis_typ, BpLst_UpdChk02_DtlR.$purc_basis_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_ar_dpt_cd, BpLst_UpdChk02_DtlR.$check_ar_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_bcst_dpt_cd, BpLst_UpdChk02_DtlR.$check_bcst_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_vmi_purc_dpt_cd, BpLst_UpdChk02_DtlR.$check_vmi_purc_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_ap_dpt_cd, BpLst_UpdChk02_DtlR.$check_ap_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_bsppl_dpt_cd, BpLst_UpdChk02_DtlR.$check_bsppl_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$check_pay_dpt_cd, BpLst_UpdChk02_DtlR.$check_pay_dpt_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bp_com_upd_cntr, BpLst_UpdChk02_DtlR.$bp_com_upd_cntr);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$bill_dtl_adv_flg, BpLst_UpdChk02_DtlR.$bill_dtl_adv_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_prnt_flg, BpLst_UpdChk02_DtlR.$pay_ntc_prnt_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_zip_cd, BpLst_UpdChk02_DtlR.$pay_ntc_zip_cd);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_addr1, BpLst_UpdChk02_DtlR.$pay_ntc_addr1);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_addr2, BpLst_UpdChk02_DtlR.$pay_ntc_addr2);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_addr3, BpLst_UpdChk02_DtlR.$pay_ntc_addr3);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_addr4, BpLst_UpdChk02_DtlR.$pay_ntc_addr4);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_tel, BpLst_UpdChk02_DtlR.$pay_ntc_tel);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_nm, BpLst_UpdChk02_DtlR.$pay_ntc_bsppl_nm);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_dpt, BpLst_UpdChk02_DtlR.$pay_ntc_bsppl_dpt);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_psn, BpLst_UpdChk02_DtlR.$pay_ntc_bsppl_psn);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_bsppl_psn_title, BpLst_UpdChk02_DtlR.$pay_ntc_bsppl_psn_title);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_dtl_outp_flg, BpLst_UpdChk02_DtlR.$pay_ntc_dtl_outp_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_bfw_bal_disp_flg, BpLst_UpdChk02_DtlR.$pay_ntc_bfw_bal_disp_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_adv_pay_flg, BpLst_UpdChk02_DtlR.$pay_ntc_adv_pay_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_dtl_pay_flg, BpLst_UpdChk02_DtlR.$pay_ntc_dtl_pay_flg);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_dtl_subttl_typ, BpLst_UpdChk02_DtlR.$pay_ntc_dtl_subttl_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_dtl_brk_typ, BpLst_UpdChk02_DtlR.$pay_ntc_dtl_brk_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_dtl_sort_typ, BpLst_UpdChk02_DtlR.$pay_ntc_dtl_sort_typ);
				addColumnPathMap(BpLst_UpdChk01_DtlR.$pay_ntc_can_slip_typ, BpLst_UpdChk02_DtlR.$pay_ntc_can_slip_typ);

			}
		}
	}
	
	/**
	 * 取引先マスタ共通の項目を補完する
	 * @param dtlR 編集行
	 */
	protected void completionBpCmn(BpLst_UpdChk02_DtlR dtlR) {
		// キャッシュから取引先マスタ（共通）データの取得
		MAM_BP_CMN_R bpCmnR = getBpCmnR(dtlR.bp_cd());
		if (isNull(bpCmnR)) {
			return;
		}
		dtlR.bp_nm(bpCmnR.bp_nm());
		dtlR.cntry_cd(bpCmnR.cntry_cd());
		dtlR.cur_cd(bpCmnR.cur_cd());
	}

	/**
	 * BpLst_UpdChk03オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。(取引先マスタ(共通)のみを対象とする場合に使用)<br>
	 */
	public class BpLst_UpdChk03 extends MABCL_BpLst_MC_A.BpLst_UpdChk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for(BpLst_UpdChk03_DtlR r : up0()) {
				if (isNotCd(r.bp_cd())) {
					msgList.add(new MCMessage(r, BpLst_UpdChk03_DtlR.$bp_cd, MABCL0306,
							getLabel(r, BpLst_UpdChk03_DtlR.$bp_cd), r.bp_cd(),
							toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * BpLst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録を行います。<br>
	 */
	public class BpLst_Upd01 extends MABCL_BpLst_MC_A.BpLst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up() {
			for(BpLst_UpdChk01_DtlR row : up0()) {
				if(row.repurc_obli_flg()) {
					row.prov_tax_cd_prio_flg(true);
				}
			}
			super.up();
		}
	}
	/**
	 * BpLst_Upd02オペレーション.<p>
	 *
	 * 取引先マスタ(全社)の登録を行います。<br>
	 */
	public class BpLst_Upd02 extends MABCL_BpLst_MC_A.BpLst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			setComp();
			super.up();
		}

		protected void setComp() {
			initBpCmnCache(up0());
			for (BpLst_UpdChk02_DtlR r : up0()) {
				completionBpCmn(r);
				if (r.getStatus() == MCRow.MODIFY && isNull(r.upd_cntr())) {
					r.setStatus(MCRow.CREATE);
				}
				if(r.repurc_obli_flg()) {
					r.prov_tax_cd_prio_flg(true);
				}
			}
		}
	}
	/**
	 * BpLst_Upd03オペレーション.<p>
	 *
	 * 取引先マスタ(共通)の登録を行います。<br>
	 */
	public class BpLst_Upd03 extends MABCL_BpLst_MC_A.BpLst_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			up0().setBoolean(BpLst_UpdChk03_DtlR.$all_com_flg, true);
			super.up();
		}
	}
	/**
	 * BpLst_DelChk01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除前のチェックを行います。<br>
	 */
	public class BpLst_DelChk01 extends MABCL_BpLst_MC_A.BpLst_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpLst_Del01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除を行います。<br>
	 */
	public class BpLst_Del01 extends MABCL_BpLst_MC_A.BpLst_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			if (isSame(builder.getBaseDbc().tableName(), "MAM_BP_SUB")
					|| isSame(builder.getBaseDbc().tableName(), "MAM_BP_LCL")) {
				dbDelSub(builder, list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}

		protected <R extends MCDBContainer> void dbDelSub(MCQueryApiBuilder builder,
				MCList<R> list) {

			builder.addWhereWithAnd(defaultWhere(builder.getBaseDbc()));
			builder.buildDelete(
					createSqlId("MABCL520", builder.getBaseDbc(), "MABCL_BpLst_D01"))
					.executeBatchUpdate(list);
		}

	}
	/**
	 * BpLst_DelChk02オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除前のチェックを行います。<br>
	 */
	public class BpLst_DelChk02 extends MABCL_BpLst_MC_A.BpLst_DelChk02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected mcframe.commonCore.notice.MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			chkUpdCntr(msgList);
			
			return msgList;
		}
		
		/**
		 * マスタ制御が「共通＆会社別」の場合は、プロシージャ経由でマスタを削除するので
		 * 更新カウンタチェックは個別に実装する。
		 */
		protected void chkUpdCntr(MCMessageList msgL) {
			MCMessageList updCntrMsgL = new MCMessageList();
			MCList<MAM_BP_CMN_R> lockCmnL = getLockBpCmn();
			MCList<MAM_BP_R> locAllL = getLockBp();
			MCIndexKey cmnIdxkey = lockCmnL.createIndex(MAM_BP_CMN_R.$bp_cd);
			MCIndexKey allIdxkey = locAllL.createIndex(MAM_BP_R.$bp_cd);
			
			// 更新カウンタチェック
			for(BpLst_DelChk01_DtlR r : up0()) {
				// 取引先マスタ(共通)
				MAM_BP_CMN_R cmnLockR = lockCmnL.getFirst(cmnIdxkey, r.bp_cd());
				updCntrMsgL.addAll(checkUpdCntrNE(r, BpLst_DelChk01_DtlR.$upd_cntr_c, cmnLockR));
				
				if (!updCntrMsgL.isEmpty()) {
					break;
				}
				// 取引先マスタ(全社)
				MAM_BP_R allLockR = locAllL.getFirst(allIdxkey, r.bp_cd());
				if(!isNull(r.upd_cntr()) || !isNull(allLockR)) {
					updCntrMsgL.addAll(checkUpdCntrNE(r, BpLst_DelChk01_DtlR.$upd_cntr, allLockR));
				}
			}
			msgL.addAll(updCntrMsgL);
		}
		
		/**
		 * 取引先マスタ（共通）のロックを取得する
		 * @return
		 */
		protected MCList<MAM_BP_CMN_R> getLockBpCmn() {
			MCList<MAM_BP_CMN_R> lockL = MCList.create(MAM_BP_CMN_R.class);
			MAM_BP_CMN_R t = MAM_BP_CMN_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.addSelect(t.upd_cntr.as("upd_cntr_c"));
			
			dbSelectKeyForUpdateNoWait("MABCL0520_MAM_BP_CMN_S01", lockL, bldr, up0());
			
			return lockL;
		}
		
		/**
		 * 取引先マスタ（全社）のロックを取得する
		 * @return
		 */
		protected MCList<MAM_BP_R> getLockBp() {
			MCList<BpLst_DelChk01_DtlR> bindL = up0().clone();
			MCList<MAM_BP_R> lockL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.bp_cd, t.upd_cntr);
			
			dbSelectKeyForUpdateNoWait("MABCL0520_MAM_BP_S01", lockL, bldr, bindL);
			
			return lockL;
		}
	}
	/**
	 * BpLst_Del02オペレーション.<p>
	 *
	 * 取引先マスタ(共通、全社)を削除します。<br>
	 */
	public class BpLst_Del02 extends MABCL_BpLst_MC_A.BpLst_Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			doDeleteBp();
		}
		protected void doDeleteBp() {
			MCList<BpLst_UpdChk02_DtlR>bindL = MCList.create(BpLst_UpdChk02_DtlR.class);
			addAll(bindL, up0(), createMap_BpLst_UpdChk02_DtlR_BpLst_DelChk01_DtlR());
			// ワーク作成
			insBpWk(bindL);
			
			// プロシージャで削除
			String procId = "MAPA_BP$P_DEL_BP";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, null, null, null);
		}
		protected Map_BpLst_UpdChk02_DtlR_BpLst_DelChk01_DtlR<BpLst_UpdChk02_DtlR,BpLst_DelChk01_DtlR> createMap_BpLst_UpdChk02_DtlR_BpLst_DelChk01_DtlR() {
			return new Map_BpLst_UpdChk02_DtlR_BpLst_DelChk01_DtlR<BpLst_UpdChk02_DtlR, BpLst_DelChk01_DtlR>();
		}

		public class Map_BpLst_UpdChk02_DtlR_BpLst_DelChk01_DtlR<D extends BpLst_UpdChk02_DtlR, S extends BpLst_DelChk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BpLst_UpdChk02_DtlR.$bp_cd, BpLst_DelChk01_DtlR.$bp_cd);
				addColumnPathMap(BpLst_UpdChk02_DtlR.$upd_cntr, BpLst_DelChk01_DtlR.$upd_cntr);

			}
		}
	}

	/**
	 * BpCom_UpdChk01オペレーション.<p>
	 *
	 * 取引先会社マスタの登録前のチェックを行います。<br>
	 */
	public class BpCom_UpdChk01 extends MABCL_BpLst_MC_A.BpCom_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpCom_Upd01オペレーション.<p>
	 *
	 * 取引先会社マスタの登録を行います。<br>
	 */
	public class BpCom_Upd01 extends MABCL_BpLst_MC_A.BpCom_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void updateMain(MCQueryApiBuilder builder,
				MCList<R> list) {
			dbDeleteKey(createSqlId(LOGIC_ID, builder.getBaseDbc(), "D51"), list, builder);

			MCList<R> newDbc = list.createInstance();
			for (R r : list) {
				if (!r.isStatusDelete()) {
					r.setStatus(MCRow.CREATE);
					newDbc.add(r);
				}
			}
			super.updateMain(builder, newDbc);
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpLst_MC_A.Srch01 {
		protected boolean _own_co_on;
		protected boolean _own_co_off;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			condCustomizeSub((Srch01_CndR) cond);
		}

		protected void condCustomizeSub(Srch01_CndR cond){
			_own_co_on = cond.own_co_flg_on();
			_own_co_off = cond.own_co_flg_off();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAVM_BP_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		/** 型に対応するWhere句を返します。
		 * 取引先マスタ登録画面から検索するSQLはイコール検索に変更する。
		 * */
		@Override
		protected MCPredicate getWhere(MCDataType typ, MCPermColumn col, String bindCol) {
			if (MCDataType.STRING.equals(typ)
					&& isSame(MCSys.request.reqSrcId(), "MABCP0510")) {
				return MCQueryApiBuilder.makeEq(col, bind(bindCol));
			}
			return super.getWhere(typ, col, bindCol);
		}
		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			addSelectNm(builder, rslt);
			if(isAllComCom()) {
				addSelectCmn(builder);
			}
			addJoinTable(builder);
			if(isAllComCom()) {
				addJoinCmn(builder);
			}
			addFlgWhere(builder);
		}

		protected <R extends MCDBContainer> void addSelectNm(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			MAM_BP_COM_R bp_com1 = MAM_BP_COM_R.create("BP_COM1");
			MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
			MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
			MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
			MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
			MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
			MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
			MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
			MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
			MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
			MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
			MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
			MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
			MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
			
			// 取引先会社マスタ関連
			builder.addSelect(bp_com1.bp_cd.as("bp_com_bp_cd"));
			builder.addSelect(bp_com1.upd_cntr.as("bp_com_upd_cntr"));
			builder.addSelect(bp_com1.ex_flg);
			rslt.addBooleanColumn("ex_flg");

			// 販売分析名称の取得
			builder.addSelect(sls_anly1.sls_anly_nm.as("sls_anly_nm1"));
			builder.addSelect(sls_anly2.sls_anly_nm.as("sls_anly_nm2"));
			builder.addSelect(sls_anly3.sls_anly_nm.as("sls_anly_nm3"));

			//分類名称の取得
			builder.addSelect(bg1.bp_grp_nm.as("bp_grp_nm1"));
			builder.addSelect(bg2.bp_grp_nm.as("bp_grp_nm2"));
			builder.addSelect(bg3.bp_grp_nm.as("bp_grp_nm3"));
			builder.addSelect(bg4.bp_grp_nm.as("bp_grp_nm4"));
			builder.addSelect(bg5.bp_grp_nm.as("bp_grp_nm5"));
			builder.addSelect(bg6.bp_grp_nm.as("bp_grp_nm6"));
			builder.addSelect(bg7.bp_grp_nm.as("bp_grp_nm7"));
			builder.addSelect(bg8.bp_grp_nm.as("bp_grp_nm8"));
			builder.addSelect(bg9.bp_grp_nm.as("bp_grp_nm9"));
			builder.addSelect(bg10.bp_grp_nm.as("bp_grp_nm10"));
		}
		
		protected void addSelectCmn(MCQueryApiBuilder builder) {
			MAM_BP_CMN_R bp_cmn1 = MAM_BP_CMN_R.create("BP_CMN1");
			
			// 共通テーブルのシステム情報の取得
			builder.addSelect(bp_cmn1.ins_usr_id.as("ins_usr_id_c"));
			builder.addSelect(bp_cmn1.ins_usr_nm.as("ins_usr_nm_c"));
			builder.addSelect(bp_cmn1.ins_ts.as("ins_ts_c"));
			builder.addSelect(bp_cmn1.ins_func_id.as("ins_func_id_c"));
			builder.addSelect(bp_cmn1.upd_cntr.as("upd_cntr_c"));
			builder.addSelect(bp_cmn1.upd_usr_id.as("upd_usr_id_c"));
			builder.addSelect(bp_cmn1.upd_usr_nm.as("upd_usr_nm_c"));
			builder.addSelect(bp_cmn1.upd_ts.as("upd_ts_c"));
			builder.addSelect(bp_cmn1.upd_func_id.as("upd_func_id_c"));
			builder.addSelect(bp_cmn1.upd_srv_req_no.as("upd_srv_req_no_c"));
			builder.addSelect(bp_cmn1.del_usr_id.as("del_usr_id_c"));
			builder.addSelect(bp_cmn1.del_usr_nm.as("del_usr_nm_c"));
			builder.addSelect(bp_cmn1.del_ts.as("del_ts_c"));
		}

		protected void addJoinTable(MCQueryApiBuilder builder) {
			MAM_BP_COM_R bp_com1 = MAM_BP_COM_R.create("BP_COM1");
			MAVM_BP_R t = MAVM_BP_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(bp_com1, t.bp_cd.eq(bp_com1.bp_cd));

			MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
			MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
			MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
			builder.addLeftOuterJoin(sls_anly1,
					sls_anly1.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY1.value()))
							.and(sls_anly1.sls_anly_cd.eq(t.sls_anly_cd1)));
			builder.addLeftOuterJoin(sls_anly2,
					sls_anly2.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY2.value()))
							.and(sls_anly2.sls_anly_cd.eq(t.sls_anly_cd2)));
			builder.addLeftOuterJoin(sls_anly3,
					sls_anly3.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY3.value()))
							.and(sls_anly3.sls_anly_cd.eq(t.sls_anly_cd3)));

			MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
			MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
			MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
			MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
			MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
			MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
			MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
			MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
			MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
			MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
			builder.addLeftOuterJoin(bg1, t.bp_grp_cd1.eq(bg1.bp_grp_cd)
					.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(
					bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));

			builder.addLeftOuterJoin(bg2, t.bp_grp_cd2.eq(bg2.bp_grp_cd)
					.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(
					bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));

			builder.addLeftOuterJoin(bg3, t.bp_grp_cd3.eq(bg3.bp_grp_cd)
					.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(
					bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));

			builder.addLeftOuterJoin(bg4, t.bp_grp_cd4.eq(bg4.bp_grp_cd)
					.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(
					bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));

			builder.addLeftOuterJoin(bg5, t.bp_grp_cd5.eq(bg5.bp_grp_cd)
					.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(
					bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));

			builder.addLeftOuterJoin(bg6, t.bp_grp_cd6.eq(bg6.bp_grp_cd)
					.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(
					bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));

			builder.addLeftOuterJoin(bg7, t.bp_grp_cd7.eq(bg7.bp_grp_cd)
					.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(
					bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));

			builder.addLeftOuterJoin(bg8, t.bp_grp_cd8.eq(bg8.bp_grp_cd)
					.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(
					bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));

			builder.addLeftOuterJoin(bg9, t.bp_grp_cd9.eq(bg9.bp_grp_cd)
					.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(
					bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));

			builder.addLeftOuterJoin(bg10, t.bp_grp_cd10.eq(bg10.bp_grp_cd)
					.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(
					bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));

			if (up0().foreign_flg()) {
				builder.addWhereWithAnd(t.cntry_cd.neq(bind("1")), getCo().cntry_cd());
			}
		}
		protected void addJoinCmn(MCQueryApiBuilder builder) {
			MAM_BP_CMN_R bp_cmn1 = MAM_BP_CMN_R.create("BP_CMN1");
			MAVM_BP_R t = MAVM_BP_R.create(builder.getBaseDbcAlias());
			
			builder.addLeftOuterJoin(bp_cmn1, t.bp_cd.eq(bp_cmn1.bp_cd));
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAVM_BP_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// 取引先会社マスタ関連
			if (!isAllCom()) {
				r_dest.all_com_flg(true);
			}
			if (!isNull(r_src.getStringNE("bp_com_bp_cd"))) {
				if (r_dest.all_com_flg()) {
					if (r_src.getBooleanNE("ex_flg")) {
						r_dest.com_ex_flg(true);
					}
				}
				else {
					if (!r_src.getBooleanNE("ex_flg")) {
						r_dest.com_use_flg(true);
					}
				}
			}
			r_dest.bp_com_upd_cntr(r_src.getNumberNE("bp_com_upd_cntr"));

			// 名称
			r_dest.sls_anly_nm1(r_src.getStringNE("sls_anly_nm1"));
			r_dest.sls_anly_nm2(r_src.getStringNE("sls_anly_nm2"));
			r_dest.sls_anly_nm3(r_src.getStringNE("sls_anly_nm3"));
			r_dest.bp_grp_nm1(r_src.getStringNE("bp_grp_nm1"));
			r_dest.bp_grp_nm2(r_src.getStringNE("bp_grp_nm2"));
			r_dest.bp_grp_nm3(r_src.getStringNE("bp_grp_nm3"));
			r_dest.bp_grp_nm4(r_src.getStringNE("bp_grp_nm4"));
			r_dest.bp_grp_nm5(r_src.getStringNE("bp_grp_nm5"));
			r_dest.bp_grp_nm6(r_src.getStringNE("bp_grp_nm6"));
			r_dest.bp_grp_nm7(r_src.getStringNE("bp_grp_nm7"));
			r_dest.bp_grp_nm8(r_src.getStringNE("bp_grp_nm8"));
			r_dest.bp_grp_nm9(r_src.getStringNE("bp_grp_nm9"));
			r_dest.bp_grp_nm10(r_src.getStringNE("bp_grp_nm10"));
			// フラグ
			r_dest.cst_flg(r_src.getBooleanNE("cst_flg"));
			r_dest.acst_flg(r_src.getBooleanNE("acst_flg"));
			r_dest.bcst_flg(r_src.getBooleanNE("bcst_flg"));
			r_dest.rcst_flg(r_src.getBooleanNE("rcst_flg"));
			r_dest.sppl_flg(r_src.getBooleanNE("sppl_flg"));
			r_dest.asppl_flg(r_src.getBooleanNE("asppl_flg"));
			r_dest.bsppl_flg(r_src.getBooleanNE("bsppl_flg"));
			r_dest.psppl_flg(r_src.getBooleanNE("psppl_flg"));
			r_dest.cred_flg(r_src.getBooleanNE("cred_flg"));
			r_dest.dlv_flg(r_src.getBooleanNE("dlv_flg"));
			r_dest.maker_flg(r_src.getBooleanNE("maker_flg"));
			r_dest.dest_flg(r_src.getBooleanNE("dest_flg"));
			// 帳票出力ロケール名
			if (!isNull(r_src.prnt_lcl_cd())) {
				MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd",
						"lcl_nm");
				MCRow row = lclLst.getFirst("lcl_cd", r_src.prnt_lcl_cd());
				if (row != null) {
					r_dest.prnt_lcl_nm(row.getStringNE("lcl_nm"));
				}
			}
			// 機能名（共通）
			putFuncName(r_dest, "ins_func_id_c", "ins_func_nm_c") ;
			putFuncName(r_dest, "upd_func_id_c", "upd_func_nm_c") ;
		}

		protected void addFlgWhere(MCQueryApiBuilder builder) {

			MAVM_BP_R t = MAVM_BP_R.create(builder.getBaseDbcAlias());
			
			// 共通＆会社別、未登録オンの場合に、別会社で登録した取引先を検索できるようにする。
			boolean nvl_val = isAllComCom() && _own_co_off;
			
			MCPredicate sql_w = value(0).eq(value(1));
			
			if (up0().cst_flg()) {
				sql_w = sql_w.or(nvl(t.cst_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().acst_flg()) {
				sql_w = sql_w.or(nvl(t.acst_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().bcst_flg()) {
				sql_w = sql_w.or(nvl(t.bcst_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().rcst_flg()) {
				sql_w = sql_w.or(nvl(t.rcst_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().sppl_flg()) {
				sql_w = sql_w.or(nvl(t.sppl_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().asppl_flg()) {
				sql_w = sql_w.or(nvl(t.asppl_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().bsppl_flg()) {
				sql_w = sql_w.or(nvl(t.bsppl_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().psppl_flg()) {
				sql_w = sql_w.or(nvl(t.psppl_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().cred_flg()) {
				sql_w = sql_w.or(nvl(t.cred_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().dlv_flg()) {
				sql_w = sql_w.or(nvl(t.dlv_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().maker_flg()) {
				sql_w = sql_w.or(nvl(t.maker_flg, value(nvl_val)).eq(value(true)));
			}
			if (up0().dest_flg()) {
				sql_w = sql_w.or(nvl(t.dest_flg, value(nvl_val)).eq(value(true)));
			}
			if(isAllComCom()) {
				sql_w = sql_w.or(t.upd_ts.isNull());
			}
				
			builder.addWhereWithAnd(sql_w);

			if (!_own_co_on && _own_co_off) { //登録済オフ　未登録オン
				builder.addWhereWithAnd(t.upd_ts.isNull());
			}
			if (_own_co_on && !_own_co_off) { //登録済オン　未登録オフ
				builder.addWhereWithAnd(t.upd_ts.isNotNull());
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_BpLst_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			editUp();
			super.up();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// システムパラメータBASE_CUR_FLGが有効の場合
			// 会社マスタの基準通貨CDで通貨CDを補完する
			if (isBaseCurFlg()) {
				MAM_CO_R coR = MAM_CO_R.create();
				MCQueryApiBuilder coR_bldr = MCQueryApiBuilder.create(MAM_CO_R.create("T"));
				dbSelect("MABCL0520_MAM_CO_S01", coR, coR_bldr);
				for (BpLst_UpdChk01_DtlR r : up0()) {
					if (isNull(r.cur_cd())) {
						r.cur_cd(coR.base_cur_cd());
					}
				}
			}
			// 全社の場合、会社別項目が登録対象か判定する
			if(isAllComCom()) {
				for (BpLst_UpdChk01_DtlR r : up0()) {
					// いずれかがONもしくは更新カウンタがNULL以外の場合は全社更新対象
					if(r.cst_flg() || r.acst_flg() || r.bcst_flg() || r.rcst_flg() || r.sppl_flg() || r.asppl_flg() || r.bsppl_flg() || r.psppl_flg() || r.cred_flg() || r.dlv_flg() || r.maker_flg() || r.dest_flg() || !isNull(r.upd_cntr())) {
						r.all_upd_flg(true);
					}
				}
			}
		}

		@Override
		protected void up_CALL_OPE02(MCList<BpCom_UpdChk01_DtlR> dest0_0,
				MCList<BpCom_UpdChk01_DtlR> dest1_0,
				MCList<BpLst_UpdChk01_DtlR> src_Upd01_Dtl1) {

			// マスタ管理が「共通」のとき取引先会社マスタを更新する（「会社別」のときは何もしない）
			MCList<BpLst_UpdChk01_DtlR> list = src_Upd01_Dtl1.createInstance();
			if (isAllCom()) {
				for (BpLst_UpdChk01_DtlR row : src_Upd01_Dtl1) {
					// 自社使用・自社不使用のいずれかがオンのとき登録、それ以外は削除
					// 自社使用・自社不使用・全社がすべてオフの場合は自社使用として扱う
					if (row.com_use_flg() || row.com_ex_flg() || !row.com_use_flg()
							&& !row.com_ex_flg() && !row.all_com_flg()) {
						row.ex_flg(row.com_ex_flg());
						if (row.isStatusCreate() && !row.all_com_flg()) {//トリガでセットされるためMODIFYにする
							row.setStatus(MCRow.MODIFY);
						}
					}
					else {
						row.setStatus(MCRow.DELETE);
					}
					list.add(row);
				}
			}
			super.up_CALL_OPE02(dest0_0, dest1_0, list);
		}
		
		@Override
		protected void up_CALL_OPE04(MCList<BpLst_UpdChk02_DtlR> dest0_0,
				MCList<BpLst_UpdChk02_DtlR> dest1_0,
				MCList<BpLst_UpdChk01_DtlR> src_Upd01_Dtl1) {
			MCList<BpLst_UpdChk01_DtlR> list = src_Upd01_Dtl1.createInstance();
			if(up1().upd_only_com_flg()) {
				// 会社項目のみ更新の場合は全行更新対象
				list.addAll(src_Upd01_Dtl1);
			} else {
				for(BpLst_UpdChk01_DtlR row : src_Upd01_Dtl1) {
					// 全社更新がオンの場合は更新対象にする
					if(row.all_upd_flg()) {
						list.add(row);
					}
				}
			}
			super.up_CALL_OPE04(dest0_0, dest1_0, list);
		}
		
		@Override
		protected List<String> getSortedCallOpeGrpNms() {
			List<String> opeL = super.getSortedCallOpeGrpNms();
			if(isAllComCom()) {
				opeL.remove("CALL_OPE01");
				opeL.remove("CALL_OPE02");
				if(up1().upd_only_com_flg()) {
					opeL.remove("CALL_OPE03");
				}
			} else {
				opeL.remove("CALL_OPE03");
				opeL.remove("CALL_OPE04");
			}
			return opeL;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpLst_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected List<String> getSortedCallOpeGrpNms() {
			List<String> opeL = super.getSortedCallOpeGrpNms();
			if(isAllComCom()) {
				opeL.remove("CALL_OPE01");
			} else {
				opeL.remove("CALL_OPE02");
			}
			return opeL;
		}
	}

	// ///////////////////////////////////////////////
	// マスタ取得（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MABCL_BpLst> CLAZZ = MABCL_BpLst.class;

	/**
	 * 「MAM_BP_CMN」取得
	 */
	MCList<MAM_BP_CMN_R> _bpCmnL;
	MCIndexKey _bpCmnKey;
	protected void initBpCmnCache(MCList<BpLst_UpdChk02_DtlR> dtlL) {
		// ワーク作成
		insBpWk(dtlL);

		// 検索
		_bpCmnL = MCList.create(MAM_BP_CMN_R.class);
		MAM_BP_CMN_R t = MAM_BP_CMN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_BP_KEY_R w = MAW_BP_KEY_R.create("W");
		dbc_bldr.addInnerJoin(w, w.bp_cd.eq(t.bp_cd));
		dbSelect("MABCL0520_MAM_BP_CMN_S01", _bpCmnL, dbc_bldr);

		// インデックス作成
		_bpCmnKey = _bpCmnL.createIndex(
				MAW_BP_KEY_R.$bp_cd
		);
	}
	
	/**
	 * 取引先マスタの主キーワークテーブル作成
	 */
	protected void insBpWk(MCList<BpLst_UpdChk02_DtlR> dtlL) {
		MAW_BP_KEY_R S0T = MAW_BP_KEY_R.create("T");

		dbWkDelete("MABCL0520_MAW_BP_KEY_D01", MAM_BP_R.create());

		MCInsert q1 = sql("MABCL0520_MAW_BP_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.bp_cd
			)
			.values(
				bind("bp_cd")
			);
		q1.executeBatchUpdate(dtlL);
	}

	protected MAM_BP_CMN_R getBpCmnR(String bpCd) {
		return _bpCmnL.getFirst(_bpCmnKey, bpCd);
	}

	//FMCB CUSTOM END
}