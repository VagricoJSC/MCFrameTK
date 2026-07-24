package mcframe.serverMABC.MABCL0420;

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
import mcframe.serverMABC.MABCL0420.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverMA.dbc.MABCFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpSubReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpSubReg_MC extends MABCL_BpSubReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpSub_UpdChk01オペレーション.<p>
	 *
	 * 取引先補助マスタの登録前のチェックを行います。<br>
	 */
	public class BpSub_UpdChk01 extends MABCL_BpSubReg_MC_A.BpSub_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (BpSub_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 各フラグがオフの場合に指定できない項目をチェックする
				for (Map.Entry<String, String[]> m : getFlgRelationMap().entrySet()) {
					String flg = m.getKey();
					if (!r.getBoolean(flg)) {
						for (String col : m.getValue()) {
							Comparable<?> v = r.getValueNE(col);
							if (v instanceof Boolean) {
								if ((Boolean) v) {
									msgList.add(new MCMessage(r, col, MABCL0320,
											getLabel(r, flg), getLabel(r, col),
											toDispGUIIndex(r)));
								}
							}
							else {
								if (!isNull(v)) {
									msgList.add(new MCMessage(r, col, MABCL0320,
											getLabel(r, flg), getLabel(r, col),
											toDispGUIIndex(r)));
								}
							}
						}
					}
				}

				// 条件付必須チェック
				if (MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ())) {
					msgList.addAll(check(r, BpSub_UpdChk01_DtlR.$ar_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				if (MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ())) {
					msgList.addAll(check(r, BpSub_UpdChk01_DtlR.$bcst_dpt_cd,
							new FXUCL_RequiredValidater()));
				}
				if (r.bsppl_flg()) {
					msgList.addAll(check(r, BpSub_UpdChk01_DtlR.$bsppl_dpt_cd,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ()) && !isNull(r.ar_dpt_cd())) {
					msgList.add(new MCMessage(r, BpSub_UpdChk01_DtlR.$ar_dpt_cd,
							MABCL0135, toDispGUIIndex(r)));
				}
				if (!MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ())
						&& !isNull(r.bcst_dpt_cd())) {
					msgList.add(new MCMessage(r, BpSub_UpdChk01_DtlR.$bcst_dpt_cd,
							MABCL0130, toDispGUIIndex(r)));
				}
				if (!r.onr_prsppl_flg()) {
					if (!isNull(r.prov_tax_cd())) {
						msgList.add(new MCMessage(r, BpSub_UpdChk01_DtlR.$prov_tax_cd,
								MABCL0262, getLabel(r, BpSub_UpdChk01_DtlR.$prov_tax_cd),
								toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}

	protected Map<String, String[]> _flgRelationMap;

	protected Map<String, String[]> getFlgRelationMap() {
		if (_flgRelationMap == null) {
			_flgRelationMap = new HashMap<String, String[]>() {
				{
					// 得意先項目
					put(BpSub_UpdChk01_DtlR.$cst_flg, new String[] {
							BpSub_UpdChk01_DtlR.$ar_dpt_cd,
							BpSub_UpdChk01_DtlR.$cst_cntct_dpt,
							BpSub_UpdChk01_DtlR.$cst_cntct_psn,
							BpSub_UpdChk01_DtlR.$cst_cntct_psn_title,
							BpSub_UpdChk01_DtlR.$sls_tax_cd,
							BpSub_UpdChk01_DtlR.$sls_anly_cd1,
							BpSub_UpdChk01_DtlR.$sls_anly_cd2,
							BpSub_UpdChk01_DtlR.$sls_anly_cd3
					});
					// 請求先項目
					put(BpSub_UpdChk01_DtlR.$bcst_flg, new String[] {
							BpSub_UpdChk01_DtlR.$bcst_dpt_cd,
							BpSub_UpdChk01_DtlR.$bill_zip_cd,
							BpSub_UpdChk01_DtlR.$bill_addr1,
							BpSub_UpdChk01_DtlR.$bill_addr2,
							BpSub_UpdChk01_DtlR.$bill_addr3,
							BpSub_UpdChk01_DtlR.$bill_addr4,
							BpSub_UpdChk01_DtlR.$bill_tel,
							BpSub_UpdChk01_DtlR.$bill_bcst_nm,
							BpSub_UpdChk01_DtlR.$bill_bcst_dpt,
							BpSub_UpdChk01_DtlR.$bill_bcst_psn,
							BpSub_UpdChk01_DtlR.$bill_bcst_psn_title
					});
					// 発注先項目
					put(BpSub_UpdChk01_DtlR.$sppl_flg, new String[] {
							BpSub_UpdChk01_DtlR.$vmi_purc_dpt_cd,
							BpSub_UpdChk01_DtlR.$sppl_cntct_dpt,
							BpSub_UpdChk01_DtlR.$sppl_cntct_psn,
							BpSub_UpdChk01_DtlR.$sppl_cntct_psn_title,
							BpSub_UpdChk01_DtlR.$purc_tax_cd,
							BpSub_UpdChk01_DtlR.$prov_tax_cd
					});
					// 買掛先項目
					put(BpSub_UpdChk01_DtlR.$asppl_flg, new String[] {
							BpSub_UpdChk01_DtlR.$ap_dpt_cd
					});
					// 支払予定管理先項目
					put(BpSub_UpdChk01_DtlR.$bsppl_flg, new String[] {
							BpSub_UpdChk01_DtlR.$bsppl_dpt_cd
					});
					// 支払先項目
					put(BpSub_UpdChk01_DtlR.$psppl_flg, new String[] {
							BpSub_UpdChk01_DtlR.$pay_dpt_cd
					});
					// 納品先項目
					put(BpSub_UpdChk01_DtlR.$dlv_flg, new String[] {
							BpSub_UpdChk01_DtlR.$dlv_cntct_dpt,
							BpSub_UpdChk01_DtlR.$dlv_cntct_psn,
							BpSub_UpdChk01_DtlR.$dlv_cntct_psn_title
					});
				}
			};
		}
		return _flgRelationMap;
	}

	/**
	 * BpSub_Upd01オペレーション.<p>
	 *
	 * 取引先補助マスタの登録を行います。<br>
	 */
	public class BpSub_Upd01 extends MABCL_BpSubReg_MC_A.BpSub_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * BpSub_DelChk01オペレーション.<p>
	 *
	 * 取引先補助マスタの削除前のチェックを行います。<br>
	 */
	public class BpSub_DelChk01 extends MABCL_BpSubReg_MC_A.BpSub_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * BpSub_Del01オペレーション.<p>
	 *
	 * 取引先補助マスタの削除を行います。<br>
	 */
	public class BpSub_Del01 extends MABCL_BpSubReg_MC_A.BpSub_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先補助マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpSubReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_BP_SUB_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			addSelectCmn(builder, rslt);
			addJoinTableCmn(builder);
			addJoinTable(builder);
		}

		protected void refIns(MCQueryApiBuilder builder) {

			MAM_BP_SUB_R t = MAM_BP_SUB_R.create("T1");
			MAM_BP_SUB_R t1 = MAM_BP_SUB_R.create("T2");

			MAM_BP_R bp1 = MAM_BP_R.create("BP1");
			builder.inactiveForeign("BP1");
			builder.addFullOuterJoin(bp1,
					t.bp_cd.eq(bp1.bp_cd)
					.and(bp1.del_flg.eq(value(false))));
			builder.addSelect(bp1.bp_nm);
			builder.addSelect(bp1.repurc_obli_flg);

			builder.addFullOuterJoin(t1,
					t.bp_cd.eq(t1.bp_cd)
					.and(t.st_dt.eq(t1.st_dt))
					.and(t1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
					.and(t1.end_dt.gte(bind(Srch01_CndR.$end_dt_fr))));

			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			builder.addLeftOuterJoin(dpt1, dpt1.dpt_cd
					.eq(decode(t1.bp_cd, nullValue(), bp1.ar_dpt_cd, t1.ar_dpt_cd))
					.and(t1.bp_cd.isNull()
					.and(dpt1.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
					.and(dpt1.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
					.or(t1.bp_cd.isNotNull()
							.and(dpt1.st_dt.lte(t1.st_dt))
							.and(dpt1.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R ar_dpt_map = MAM_DPT_MAP_R.create("AR_DPT_MAP");
			builder.addLeftOuterJoin(ar_dpt_map,
					ar_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.ar_dpt_cd, t1.ar_dpt_cd))
					.and(bind("new_st_dt").between(ar_dpt_map.st_dt, ar_dpt_map.end_dt)));
			MAM_DPT_R ar_dpt_new = MAM_DPT_R.create("AR_DPT_NEW");
			builder.addLeftOuterJoin(ar_dpt_new,
					ar_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.ar_dpt_cd, t1.ar_dpt_cd))
					.and(bind("new_st_dt").between(ar_dpt_new.st_dt, ar_dpt_new.end_dt)));

			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			builder.addLeftOuterJoin(dpt2, dpt2.dpt_cd
					.eq(decode(t1.bp_cd, nullValue(), bp1.bcst_dpt_cd, t1.bcst_dpt_cd))
					.and(t1.bp_cd.isNull()
					.and(dpt2.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
					.and(dpt2.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
					.or(t1.bp_cd.isNotNull()
							.and(dpt2.st_dt.lte(t1.st_dt))
							.and(dpt2.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R bcst_dpt_map = MAM_DPT_MAP_R.create("BCST_DPT_MAP");
			builder.addLeftOuterJoin(bcst_dpt_map,
					bcst_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.bcst_dpt_cd, t1.bcst_dpt_cd))
					.and(bind("new_st_dt").between(bcst_dpt_map.st_dt, bcst_dpt_map.end_dt)));
			MAM_DPT_R bcst_dpt_new = MAM_DPT_R.create("BCST_DPT_NEW");
			builder.addLeftOuterJoin(bcst_dpt_new,
					bcst_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.bcst_dpt_cd, t1.bcst_dpt_cd))
					.and(bind("new_st_dt").between(bcst_dpt_new.st_dt, bcst_dpt_new.end_dt)));

			MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
			builder.addLeftOuterJoin(dpt3,
					dpt3.dpt_cd
							.eq(decode(t1.bp_cd, nullValue(), bp1.vmi_purc_dpt_cd,
									t1.vmi_purc_dpt_cd))
							.and(t1.bp_cd.isNull()
									.and(dpt3.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
									.and(dpt3.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
									.or(t1.bp_cd.isNotNull()
											.and(dpt3.st_dt.lte(t1.st_dt))
											.and(dpt3.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R vmi_purc_dpt_map = MAM_DPT_MAP_R.create("VMI_PURC_DPT_MAP");
			builder.addLeftOuterJoin(vmi_purc_dpt_map,
					vmi_purc_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.vmi_purc_dpt_cd, t1.vmi_purc_dpt_cd))
					.and(bind("new_st_dt").between(vmi_purc_dpt_map.st_dt, vmi_purc_dpt_map.end_dt)));
			MAM_DPT_R vmi_purc_dpt_new = MAM_DPT_R.create("VMI_PURC_DPT_NEW");
			builder.addLeftOuterJoin(vmi_purc_dpt_new,
					vmi_purc_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.vmi_purc_dpt_cd, t1.vmi_purc_dpt_cd))
					.and(bind("new_st_dt").between(vmi_purc_dpt_new.st_dt, vmi_purc_dpt_new.end_dt)));

			MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
			builder.addLeftOuterJoin(dpt4, dpt4.dpt_cd
					.eq(decode(t1.bp_cd, nullValue(), bp1.ap_dpt_cd, t1.ap_dpt_cd))
					.and(t1.bp_cd.isNull()
							.and(dpt4.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
							.and(dpt4.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
							.or(t1.bp_cd.isNotNull()
									.and(dpt4.st_dt.lte(t1.st_dt))
									.and(dpt4.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R ap_dpt_map = MAM_DPT_MAP_R.create("AP_DPT_MAP");
			builder.addLeftOuterJoin(ap_dpt_map,
					ap_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.ap_dpt_cd, t1.ap_dpt_cd))
					.and(bind("new_st_dt").between(ap_dpt_map.st_dt, ap_dpt_map.end_dt)));
			MAM_DPT_R ap_dpt_new = MAM_DPT_R.create("AP_DPT_NEW");
			builder.addLeftOuterJoin(ap_dpt_new,
					ap_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.ap_dpt_cd, t1.ap_dpt_cd))
					.and(bind("new_st_dt").between(ap_dpt_new.st_dt, ap_dpt_new.end_dt)));

			MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
			builder.addLeftOuterJoin(dpt5, dpt5.dpt_cd
					.eq(decode(t1.bp_cd, nullValue(), bp1.bsppl_dpt_cd, t1.bsppl_dpt_cd))
					.and(t1.bp_cd.isNull()
							.and(dpt5.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
							.and(dpt5.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
							.or(t1.bp_cd.isNotNull()
									.and(dpt5.st_dt.lte(t1.st_dt))
									.and(dpt5.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R bsppl_dpt_map = MAM_DPT_MAP_R.create("BSPPL_DPT_MAP");
			builder.addLeftOuterJoin(bsppl_dpt_map,
					bsppl_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.bsppl_dpt_cd, t1.bsppl_dpt_cd))
					.and(bind("new_st_dt").between(bsppl_dpt_map.st_dt, bsppl_dpt_map.end_dt)));
			MAM_DPT_R bsppl_dpt_new = MAM_DPT_R.create("BSPPL_DPT_NEW");
			builder.addLeftOuterJoin(bsppl_dpt_new,
					bsppl_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.bsppl_dpt_cd, t1.bsppl_dpt_cd))
					.and(bind("new_st_dt").between(bsppl_dpt_new.st_dt, bsppl_dpt_new.end_dt)));

			MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
			builder.addLeftOuterJoin(dpt6, dpt6.dpt_cd
					.eq(decode(t1.bp_cd, nullValue(), bp1.pay_dpt_cd, t1.pay_dpt_cd))
					.and(t1.bp_cd.isNull()
							.and(dpt6.st_dt.lte(bind(Srch01_CndR.$st_dt_to)))
							.and(dpt6.end_dt.gte(bind(Srch01_CndR.$st_dt_to)))
							.or(t1.bp_cd.isNotNull()
									.and(dpt6.st_dt.lte(t1.st_dt))
									.and(dpt6.end_dt.gte(t1.st_dt)))));
			MAM_DPT_MAP_R pay_dpt_map = MAM_DPT_MAP_R.create("PAY_DPT_MAP");
			builder.addLeftOuterJoin(pay_dpt_map,
					pay_dpt_map.old_dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.pay_dpt_cd, t1.pay_dpt_cd))
					.and(bind("new_st_dt").between(pay_dpt_map.st_dt, pay_dpt_map.end_dt)));
			MAM_DPT_R pay_dpt_new = MAM_DPT_R.create("PAY_DPT_NEW");
			builder.addLeftOuterJoin(pay_dpt_new,
					pay_dpt_new.dpt_cd.eq(decode(t1.bp_cd, nullValue(), bp1.pay_dpt_cd, t1.pay_dpt_cd))
					.and(bind("new_st_dt").between(pay_dpt_new.st_dt, pay_dpt_new.end_dt)));

			MAM_TAX_R tax1 = MAM_TAX_R.create("TAX1");
			builder.inactiveForeign("TAX1");
			builder.addLeftOuterJoin(tax1,
					decode(t1.bp_cd, nullValue(), bp1.sls_tax_cd, t1.sls_tax_cd)
							.eq(tax1.tax_cd));
			builder.addSelect(tax1.tax_nm.as("sls_tax_nm"));

			MAM_TAX_R tax2 = MAM_TAX_R.create("TAX2");
			builder.inactiveForeign("TAX2");
			builder.addLeftOuterJoin(tax2,
					decode(t1.bp_cd, nullValue(), bp1.purc_tax_cd, t1.purc_tax_cd)
							.eq(tax2.tax_cd));
			builder.addSelect(tax2.tax_nm.as("purc_tax_nm"));

			MAM_TAX_R tax3 = MAM_TAX_R.create("TAX3");
			builder.inactiveForeign("TAX3");
			builder.addLeftOuterJoin(tax3,
					decode(t1.bp_cd, nullValue(), bp1.prov_tax_cd, t1.prov_tax_cd)
							.eq(tax3.tax_cd));
			builder.addSelect(tax3.tax_nm.as("prov_tax_nm"));

			MAM_SLS_ANLY_R bp_sls_anly1 = MAM_SLS_ANLY_R.create("BP_SLS_ANLY1");
			MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
			builder.addLeftOuterJoin(bp_sls_anly1,
					bp_sls_anly1.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY1.value()))
							.and(bp_sls_anly1.sls_anly_cd.eq(bp1.sls_anly_cd1)));
			builder.removeSelect(MAM_SLS_ANLY_R.$sls_anly_nm);
			builder.addSelect(nvl(bp_sls_anly1.sls_anly_nm, sls_anly1.sls_anly_nm)
					.as("sls_anly_nm1"));
			
			MAM_SLS_ANLY_R bp_sls_anly2 = MAM_SLS_ANLY_R.create("BP_SLS_ANLY2");
			MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
			builder.addLeftOuterJoin(bp_sls_anly2,
					bp_sls_anly2.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY2.value()))
							.and(bp_sls_anly2.sls_anly_cd.eq(bp1.sls_anly_cd2)));
			builder.removeSelect(MAM_SLS_ANLY_R.$sls_anly_nm);
			builder.addSelect(nvl(bp_sls_anly2.sls_anly_nm, sls_anly2.sls_anly_nm)
					.as("sls_anly_nm2"));

			MAM_SLS_ANLY_R bp_sls_anly3 = MAM_SLS_ANLY_R.create("BP_SLS_ANLY3");
			MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
			builder.addLeftOuterJoin(bp_sls_anly3,
					bp_sls_anly3.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY3.value()))
							.and(bp_sls_anly3.sls_anly_cd.eq(bp1.sls_anly_cd3)));
			builder.removeSelect(MAM_SLS_ANLY_R.$sls_anly_nm);
			builder.addSelect(nvl(bp_sls_anly3.sls_anly_nm, sls_anly3.sls_anly_nm)
					.as("sls_anly_nm3"));

			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(t1.bp_cd.isNull().or(t1.bp_cd.eq(bp1.bp_cd)));

			builder.addWhereWithCutOffAnd(
					nvl(t1.bp_cd, bp1.bp_cd).like(bind(Srch01_CndR.$bp_cd)));
			builder.addWhereWithCutOffAnd(bp1.bp_nm.like(bind(Srch01_CndR.$bp_nm)));

			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.ar_dpt_cd, t1.ar_dpt_cd)
							.like(bind(Srch01_CndR.$ar_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.bcst_dpt_cd, t1.bcst_dpt_cd)
							.like(bind(Srch01_CndR.$bcst_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.vmi_purc_dpt_cd, t1.vmi_purc_dpt_cd)
							.like(bind(Srch01_CndR.$vmi_purc_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.ap_dpt_cd, t1.ap_dpt_cd)
							.like(bind(Srch01_CndR.$ap_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.bsppl_dpt_cd, t1.bsppl_dpt_cd)
							.like(bind(Srch01_CndR.$bsppl_dpt_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.pay_dpt_cd, t1.pay_dpt_cd)
							.like(bind(Srch01_CndR.$pay_dpt_cd)));

			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.ar_dpt_cd, t1.ar_dpt_cd)
							.like(bind(Srch01_CndR.$dpt_cd))
							.or(decode(t1.bp_cd, nullValue(), bp1.bcst_dpt_cd,
									t1.bcst_dpt_cd).like(bind(Srch01_CndR.$dpt_cd)))
							.or(decode(t1.bp_cd, nullValue(), bp1.vmi_purc_dpt_cd,
									t1.vmi_purc_dpt_cd).like(bind(Srch01_CndR.$dpt_cd)))
							.or(decode(t1.bp_cd, nullValue(), bp1.ap_dpt_cd, t1.ap_dpt_cd)
									.like(bind(Srch01_CndR.$dpt_cd)))
							.or(decode(t1.bp_cd, nullValue(), bp1.bsppl_dpt_cd,
									t1.bsppl_dpt_cd).like(bind(Srch01_CndR.$dpt_cd)))
							.or(decode(t1.bp_cd, nullValue(), bp1.pay_dpt_cd,
									t1.pay_dpt_cd).like(bind(Srch01_CndR.$dpt_cd))));

			builder.addWhereWithCutOffAnd(t1.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t1.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t1.memo3.like(bind(Srch01_CndR.$memo3)));
			builder.addWhereWithCutOffAnd(t1.memo4.like(bind(Srch01_CndR.$memo4)));
			builder.addWhereWithCutOffAnd(t1.memo5.like(bind(Srch01_CndR.$memo5)));
			builder.addWhereWithCutOffAnd(t1.memo6.like(bind(Srch01_CndR.$memo6)));
			builder.addWhereWithCutOffAnd(t1.memo7.like(bind(Srch01_CndR.$memo7)));
			builder.addWhereWithCutOffAnd(t1.memo8.like(bind(Srch01_CndR.$memo8)));
			builder.addWhereWithCutOffAnd(t1.memo9.like(bind(Srch01_CndR.$memo9)));
			builder.addWhereWithCutOffAnd(t1.memo10.like(bind(Srch01_CndR.$memo10)));
			builder.addWhereWithCutOffAnd(t1.memo11.like(bind(Srch01_CndR.$memo11)));
			builder.addWhereWithCutOffAnd(t1.memo12.like(bind(Srch01_CndR.$memo12)));
			builder.addWhereWithCutOffAnd(t1.memo13.like(bind(Srch01_CndR.$memo13)));
			builder.addWhereWithCutOffAnd(t1.memo14.like(bind(Srch01_CndR.$memo14)));
			builder.addWhereWithCutOffAnd(t1.memo15.like(bind(Srch01_CndR.$memo15)));
			builder.addWhereWithCutOffAnd(t1.memo16.like(bind(Srch01_CndR.$memo16)));
			builder.addWhereWithCutOffAnd(t1.memo17.like(bind(Srch01_CndR.$memo17)));
			builder.addWhereWithCutOffAnd(t1.memo18.like(bind(Srch01_CndR.$memo18)));
			builder.addWhereWithCutOffAnd(t1.memo19.like(bind(Srch01_CndR.$memo19)));
			builder.addWhereWithCutOffAnd(t1.memo20.like(bind(Srch01_CndR.$memo20)));

			if (up0().off_del_flg() && !up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(t1.del_flg, value(false)).eq(value(false)));
			}
			else if (!up0().off_del_flg() && up0().on_del_flg()) {
				builder.addWhereWithAnd(nvl(t1.del_flg, value(true)).eq(value(true)));
			}

			builder.removeSelect(MAM_BP_SUB_R.$bp_cd);
			builder.addSelect(nvl(t1.bp_cd, bp1.bp_cd).as("bp_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$zip_cd);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.zip_cd, t1.zip_cd).as("zip_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$addr1);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.addr1, t1.addr1).as("addr1"));
			builder.removeSelect(MAM_BP_SUB_R.$addr2);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.addr2, t1.addr2).as("addr2"));
			builder.removeSelect(MAM_BP_SUB_R.$addr3);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.addr3, t1.addr3).as("addr3"));
			builder.removeSelect(MAM_BP_SUB_R.$addr4);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.addr4, t1.addr4).as("addr4"));
			builder.removeSelect(MAM_BP_SUB_R.$tel);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.tel, t1.tel).as("tel"));
			builder.removeSelect(MAM_BP_SUB_R.$fax);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.fax, t1.fax).as("fax"));
			builder.removeSelect(MAM_BP_SUB_R.$cst_cntct_dpt);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.cst_cntct_dpt, t1.cst_cntct_dpt)
							.as("cst_cntct_dpt"));
			builder.removeSelect(MAM_BP_SUB_R.$cst_cntct_psn);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.cst_cntct_psn, t1.cst_cntct_psn)
							.as("cst_cntct_psn"));
			builder.removeSelect(MAM_BP_SUB_R.$cst_cntct_psn_title);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.cst_cntct_psn_title,
					t1.cst_cntct_psn_title).as("cst_cntct_psn_title"));
			builder.removeSelect(MAM_BP_SUB_R.$sls_tax_cd);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.sls_tax_cd, t1.sls_tax_cd)
					.as("sls_tax_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$sls_anly_cd1);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.sls_anly_cd1, t1.sls_anly_cd1)
							.as("sls_anly_cd1"));
			builder.removeSelect(MAM_BP_SUB_R.$sls_anly_cd2);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.sls_anly_cd2, t1.sls_anly_cd2)
							.as("sls_anly_cd2"));
			builder.removeSelect(MAM_BP_SUB_R.$sls_anly_cd3);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.sls_anly_cd3, t1.sls_anly_cd3)
							.as("sls_anly_cd3"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_zip_cd);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.bill_zip_cd, t1.bill_zip_cd)
							.as("bill_zip_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_addr1);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_addr1, t1.bill_addr1)
					.as("bill_addr1"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_addr2);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_addr2, t1.bill_addr2)
					.as("bill_addr2"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_addr3);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_addr3, t1.bill_addr3)
					.as("bill_addr3"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_addr4);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_addr4, t1.bill_addr4)
					.as("bill_addr4"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_tel);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_tel, t1.bill_tel)
					.as("bill_tel"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_bcst_nm);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.bill_bcst_nm, t1.bill_bcst_nm)
							.as("bill_bcst_nm"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_bcst_dpt);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.bill_bcst_dpt, t1.bill_bcst_dpt)
							.as("bill_bcst_dpt"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_bcst_psn);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.bill_bcst_psn, t1.bill_bcst_psn)
							.as("bill_bcst_psn"));
			builder.removeSelect(MAM_BP_SUB_R.$bill_bcst_psn_title);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.bill_bcst_psn_title,
					t1.bill_bcst_psn_title).as("bill_bcst_psn_title"));
			builder.removeSelect(MAM_BP_SUB_R.$sppl_cntct_dpt);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.sppl_cntct_dpt, t1.sppl_cntct_dpt)
							.as("sppl_cntct_dpt"));
			builder.removeSelect(MAM_BP_SUB_R.$sppl_cntct_psn);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.sppl_cntct_psn, t1.sppl_cntct_psn)
							.as("sppl_cntct_psn"));
			builder.removeSelect(MAM_BP_SUB_R.$sppl_cntct_psn_title);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.sppl_cntct_psn_title,
					t1.sppl_cntct_psn_title).as("sppl_cntct_psn_title"));
			builder.removeSelect(MAM_BP_SUB_R.$purc_tax_cd);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.purc_tax_cd, t1.purc_tax_cd)
							.as("purc_tax_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$prov_tax_cd);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.prov_tax_cd, t1.prov_tax_cd)
							.as("prov_tax_cd"));
			builder.removeSelect(MAM_BP_SUB_R.$dlv_cntct_dpt);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.dlv_cntct_dpt, t1.dlv_cntct_dpt)
							.as("dlv_cntct_dpt"));
			builder.removeSelect(MAM_BP_SUB_R.$dlv_cntct_psn);
			builder.addSelect(
					decode(t1.bp_cd, nullValue(), bp1.dlv_cntct_psn, t1.dlv_cntct_psn)
							.as("dlv_cntct_psn"));
			builder.removeSelect(MAM_BP_SUB_R.$dlv_cntct_psn_title);
			builder.addSelect(decode(t1.bp_cd, nullValue(), bp1.dlv_cntct_psn_title,
					t1.dlv_cntct_psn_title).as("dlv_cntct_psn_title"));

			builder.removeSelect(MAM_BP_SUB_R.$st_dt);
			builder.addSelect(bind("new_st_dt").as("st_dt"));
			builder.removeSelect(MAM_BP_SUB_R.$end_dt);
			builder.addSelect(nullValue().as("end_dt"));

			builder.removeSelect(MAM_BP_SUB_R.$ar_dpt_cd);
			builder.addSelect(nvl(ar_dpt_map.new_dpt_cd, ar_dpt_new.dpt_cd).as("ar_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			MAM_DPT_R S1X = MAM_DPT_R.create("S1X");
			builder.addSelect(
					subQuery()
							.select(max(S1X.dpt_nm).as("ar_dpt_nm")).from(S1X).where(
									bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
											.and(S1X.dpt_cd.eq(
													nvl(ar_dpt_map.new_dpt_cd, ar_dpt_new.dpt_cd))))
							.as("ar_dpt_nm"));

			builder.removeSelect(MAM_BP_SUB_R.$bcst_dpt_cd);
			builder.addSelect(nvl(bcst_dpt_map.new_dpt_cd, bcst_dpt_new.dpt_cd).as("bcst_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery().select(max(S1X.dpt_nm).as("bcst_dpt_nm"))
					.from(S1X)
					.where(bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
							.and(S1X.dpt_cd.eq(nvl(bcst_dpt_map.new_dpt_cd, bcst_dpt_new.dpt_cd))))
					.as("bcst_dpt_nm"));

			builder.removeSelect(MAM_BP_SUB_R.$vmi_purc_dpt_cd);
			builder.addSelect(nvl(vmi_purc_dpt_map.new_dpt_cd, vmi_purc_dpt_new.dpt_cd).as("vmi_purc_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery().select(max(S1X.dpt_nm).as("vmi_purc_dpt_nm"))
					.from(S1X)
					.where(bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
							.and(S1X.dpt_cd.eq(nvl(vmi_purc_dpt_map.new_dpt_cd, vmi_purc_dpt_new.dpt_cd))))
					.as("vmi_purc_dpt_nm"));

			builder.removeSelect(MAM_BP_SUB_R.$ap_dpt_cd);
			builder.addSelect(nvl(ap_dpt_map.new_dpt_cd, ap_dpt_new.dpt_cd).as("ap_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(
					subQuery()
							.select(max(S1X.dpt_nm).as("ap_dpt_nm")).from(S1X).where(
									bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
											.and(S1X.dpt_cd.eq(nvl(ap_dpt_map.new_dpt_cd, ap_dpt_new.dpt_cd))))
							.as("ap_dpt_nm"));

			builder.removeSelect(MAM_BP_SUB_R.$bsppl_dpt_cd);
			builder.addSelect(nvl(bsppl_dpt_map.new_dpt_cd, bsppl_dpt_new.dpt_cd).as("bsppl_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery()
					.select(max(S1X.dpt_nm).as("bsppl_dpt_nm")).from(S1X).where(
							bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
									.and(S1X.dpt_cd.eq(nvl(bsppl_dpt_map.new_dpt_cd, bsppl_dpt_new.dpt_cd))))
					.as("bsppl_dpt_nm"));

			builder.removeSelect(MAM_BP_SUB_R.$memo1);
			builder.addSelect(t1.memo1);
			builder.removeSelect(MAM_BP_SUB_R.$memo2);
			builder.addSelect(t1.memo2);
			builder.removeSelect(MAM_BP_SUB_R.$memo3);
			builder.addSelect(t1.memo3);
			builder.removeSelect(MAM_BP_SUB_R.$memo4);
			builder.addSelect(t1.memo4);
			builder.removeSelect(MAM_BP_SUB_R.$memo5);
			builder.addSelect(t1.memo5);
			builder.removeSelect(MAM_BP_SUB_R.$memo6);
			builder.addSelect(t1.memo6);
			builder.removeSelect(MAM_BP_SUB_R.$memo7);
			builder.addSelect(t1.memo7);
			builder.removeSelect(MAM_BP_SUB_R.$memo8);
			builder.addSelect(t1.memo8);
			builder.removeSelect(MAM_BP_SUB_R.$memo9);
			builder.addSelect(t1.memo9);
			builder.removeSelect(MAM_BP_SUB_R.$memo10);
			builder.addSelect(t1.memo10);
			builder.removeSelect(MAM_BP_SUB_R.$memo11);
			builder.addSelect(t1.memo11);
			builder.removeSelect(MAM_BP_SUB_R.$memo12);
			builder.addSelect(t1.memo12);
			builder.removeSelect(MAM_BP_SUB_R.$memo13);
			builder.addSelect(t1.memo13);
			builder.removeSelect(MAM_BP_SUB_R.$memo14);
			builder.addSelect(t1.memo14);
			builder.removeSelect(MAM_BP_SUB_R.$memo15);
			builder.addSelect(t1.memo15);
			builder.removeSelect(MAM_BP_SUB_R.$memo16);
			builder.addSelect(t1.memo16);
			builder.removeSelect(MAM_BP_SUB_R.$memo17);
			builder.addSelect(t1.memo17);
			builder.removeSelect(MAM_BP_SUB_R.$memo18);
			builder.addSelect(t1.memo18);
			builder.removeSelect(MAM_BP_SUB_R.$memo19);
			builder.addSelect(t1.memo19);
			builder.removeSelect(MAM_BP_SUB_R.$memo20);
			builder.addSelect(t1.memo20);
			builder.removeSelect(MAM_BP_SUB_R.$pay_dpt_cd);
			builder.addSelect(nvl(pay_dpt_map.new_dpt_cd, pay_dpt_new.dpt_cd).as("pay_dpt_cd"));
			builder.removeSelect(MAM_DPT_R.$dpt_nm);
			builder.addSelect(subQuery().select(max(S1X.dpt_nm).as("pay_dpt_nm"))
					.from(S1X)
					.where(bind("new_st_dt").between(S1X.st_dt, S1X.end_dt)
							.and(S1X.dpt_cd.eq(nvl(pay_dpt_map.new_dpt_cd, pay_dpt_new.dpt_cd))))
					.as("pay_dpt_nm"));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.sls_tax_cd, t1.sls_tax_cd)
							.like(bind(Srch01_CndR.$sls_tax_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.purc_tax_cd, t1.purc_tax_cd)
							.like(bind(Srch01_CndR.$purc_tax_cd)));
			builder.addWhereWithCutOffAnd(
					decode(t1.bp_cd, nullValue(), bp1.prov_tax_cd, t1.prov_tax_cd)
							.like(bind(Srch01_CndR.$prov_tax_cd)));
			builder.addWhereWithCutOffAnd(
					tax1.tax_nm.like(bind(Srch01_CndR.$sls_tax_nm)));
			builder.addWhereWithCutOffAnd(
					tax2.tax_nm.like(bind(Srch01_CndR.$purc_tax_nm)));
			builder.addWhereWithCutOffAnd(
					tax3.tax_nm.like(bind(Srch01_CndR.$prov_tax_nm)));

			builder.removeSelect(MAM_BP_SUB_R.$del_flg);
			builder.addSelect(value(false).as("del_flg"));
			builder.removeSelect(MAM_BP_SUB_R.$del_usr_id);
			builder.addSelect(nullValue().as("del_usr_id"));
			builder.removeSelect(MAM_BP_SUB_R.$del_usr_nm);
			builder.addSelect(nullValue().as("del_usr_nm"));
			builder.removeSelect(MAM_BP_SUB_R.$del_ts);
			builder.addSelect(nullValue().as("del_ts"));
			builder.removeSelect(MAM_BP_SUB_R.$ins_usr_id);
			builder.addSelect(nullValue().as("ins_usr_id"));
			builder.removeSelect(MAM_BP_SUB_R.$ins_usr_nm);
			builder.addSelect(nullValue().as("ins_usr_nm"));
			builder.removeSelect(MAM_BP_SUB_R.$ins_ts);
			builder.addSelect(nullValue().as("ins_ts"));
			builder.removeSelect(MAM_BP_SUB_R.$ins_func_id);
			builder.addSelect(nullValue().as("ins_func_id"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_cntr);
			builder.addSelect(nullValue().as("upd_cntr"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_usr_id);
			builder.addSelect(nullValue().as("upd_usr_id"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_usr_nm);
			builder.addSelect(nullValue().as("upd_usr_nm"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_ts);
			builder.addSelect(nullValue().as("upd_ts"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_func_id);
			builder.addSelect(nullValue().as("upd_func_id"));
			builder.removeSelect(MAM_BP_SUB_R.$upd_srv_req_no);
			builder.addSelect(nullValue().as("upd_srv_req_no"));
		}

		protected void addJoinTable(MCQueryApiBuilder builder) {

			if (!isNull(up0().new_st_dt())) {
				refIns(builder);
			}
			else {
				MAM_BP_SUB_R t = MAM_BP_SUB_R.create(builder.getBaseDbcAlias());
				addJoinTableMain(builder);
				builder.addWhereWithCutOffAnd(
						t.ar_dpt_cd.like(bind(Srch01_CndR.$ar_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.bcst_dpt_cd.like(bind(Srch01_CndR.$bcst_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.ap_dpt_cd.like(bind(Srch01_CndR.$ap_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.bsppl_dpt_cd.like(bind(Srch01_CndR.$bsppl_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.vmi_purc_dpt_cd.like(bind(Srch01_CndR.$vmi_purc_dpt_cd)));
				builder.addWhereWithCutOffAnd(
						t.pay_dpt_cd.like(bind(Srch01_CndR.$pay_dpt_cd)));

				builder.addWhereWithCutOffAnd(t.ar_dpt_cd.like(bind(Srch01_CndR.$dpt_cd))
						.or(t.bcst_dpt_cd.like(bind(Srch01_CndR.$dpt_cd)))
						.or(t.ap_dpt_cd.like(bind(Srch01_CndR.$dpt_cd)))
						.or(t.bsppl_dpt_cd.like(bind(Srch01_CndR.$dpt_cd)))
						.or(t.vmi_purc_dpt_cd.like(bind(Srch01_CndR.$dpt_cd)))
						.or(t.pay_dpt_cd.like(bind(Srch01_CndR.$dpt_cd))));

			}
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
			MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
			MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
			MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
			builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$ar_dpt_nm)));
			builder.addWhereWithCutOffAnd(
					dpt2.dpt_nm.like(bind(Srch01_CndR.$bcst_dpt_nm)));
			builder.addWhereWithCutOffAnd(
					dpt3.dpt_nm.like(bind(Srch01_CndR.$vmi_purc_dpt_nm)));
			builder.addWhereWithCutOffAnd(dpt4.dpt_nm.like(bind(Srch01_CndR.$ap_dpt_nm)));
			builder.addWhereWithCutOffAnd(
					dpt5.dpt_nm.like(bind(Srch01_CndR.$bsppl_dpt_nm)));
			builder.addWhereWithCutOffAnd(
					dpt6.dpt_nm.like(bind(Srch01_CndR.$pay_dpt_nm)));

			builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$dpt_nm))
					.or(dpt2.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)))
					.or(dpt3.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)))
					.or(dpt4.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)))
					.or(dpt5.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)))
					.or(dpt6.dpt_nm.like(bind(Srch01_CndR.$dpt_nm))));
			// 課税のみＦＬＧ
			if (up0().tax_abl_only_flg()) {
				MAM_TAX_R tax1 = MAM_TAX_R.create("TAX1");
				MAM_TAX_R tax2 = MAM_TAX_R.create("TAX2");
				MAM_TAX_R tax3 = MAM_TAX_R.create("TAX3");
				builder.addWhereWithAnd(
						tax1.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value()))
								.or(tax2.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value())))
								.or(tax3.tax_typ.eq(value(MAC_TAX_TYP.TAX_ABL.value()))));
			}

			MAM_BP_R bp1 = MAM_BP_R.create("BP1");
			if (!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if (!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if (!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if (!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if (!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if (!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if (!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if (!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if (!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if (!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));

			MCPredicate sql_w = value(0).eq(value(1));
			if (up0().cst_flg()) {
				sql_w = sql_w.or(bp1.cst_flg.eq(value(true)));
			}
			if (up0().acst_flg()) {
				sql_w = sql_w.or(bp1.acst_flg.eq(value(true)));
			}
			if (up0().bcst_flg()) {
				sql_w = sql_w.or(bp1.bcst_flg.eq(value(true)));
			}
			if (up0().rcst_flg()) {
				sql_w = sql_w.or(bp1.rcst_flg.eq(value(true)));
			}
			if (up0().sppl_flg()) {
				sql_w = sql_w.or(bp1.sppl_flg.eq(value(true)));
			}
			if (up0().asppl_flg()) {
				sql_w = sql_w.or(bp1.asppl_flg.eq(value(true)));
			}
			if (up0().bsppl_flg()) {
				sql_w = sql_w.or(bp1.bsppl_flg.eq(value(true)));
			}
			if (up0().psppl_flg()) {
				sql_w = sql_w.or(bp1.psppl_flg.eq(value(true)));
			}
			if (up0().cred_flg()) {
				sql_w = sql_w.or(bp1.cred_flg.eq(value(true)));
			}
			if (up0().dlv_flg()) {
				sql_w = sql_w.or(bp1.dlv_flg.eq(value(true)));
			}
			if (up0().maker_flg()) {
				sql_w = sql_w.or(bp1.maker_flg.eq(value(true)));
			}
			if (up0().dest_flg()) {
				sql_w = sql_w.or(bp1.dest_flg.eq(value(true)));
			}
			builder.addWhereWithAnd(sql_w);

		}
	}

	protected <R extends MCDBContainer> void addSelectCmn(MCQueryApiBuilder builder,
			MCList<R> rslt) {

		rslt.addBooleanColumn("cst_flg");
		rslt.addBooleanColumn("acst_flg");
		rslt.addBooleanColumn("bcst_flg");
		rslt.addBooleanColumn("rcst_flg");
		rslt.addBooleanColumn("sppl_flg");
		rslt.addBooleanColumn("asppl_flg");
		rslt.addBooleanColumn("bsppl_flg");
		rslt.addBooleanColumn("psppl_flg");
		rslt.addBooleanColumn("cred_flg");
		rslt.addBooleanColumn("dlv_flg");
		rslt.addBooleanColumn("maker_flg");
		rslt.addBooleanColumn("dest_flg");
		rslt.addBooleanColumn("onr_prsppl_flg");
		rslt.addBooleanColumn("repurc_obli_flg");
		
		MAM_BP_R bp1 = MAM_BP_R.create(MAM_BP_SUB_R.$BP1);
		builder.addSelect(bp1.cst_flg.as("cst_flg"));
		builder.addSelect(bp1.acst_flg.as("acst_flg"));
		builder.addSelect(bp1.bcst_flg.as("bcst_flg"));
		builder.addSelect(bp1.rcst_flg.as("rcst_flg"));
		builder.addSelect(bp1.sppl_flg.as("sppl_flg"));
		builder.addSelect(bp1.asppl_flg.as("asppl_flg"));
		builder.addSelect(bp1.bsppl_flg.as("bsppl_flg"));
		builder.addSelect(bp1.psppl_flg.as("psppl_flg"));
		builder.addSelect(bp1.cred_flg.as("cred_flg"));
		builder.addSelect(bp1.dlv_flg.as("dlv_flg"));
		builder.addSelect(bp1.maker_flg.as("maker_flg"));
		builder.addSelect(bp1.dest_flg.as("dest_flg"));
		builder.addSelect(bp1.bill_dpt_typ);
		builder.addSelect(bp1.ar_dpt_typ);
		builder.addSelect(bp1.onr_prsppl_flg);
		builder.addSelect(bp1.repurc_obli_flg);

		// 部門名称の取得
		MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
		MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
		MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
		MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
		builder.addSelect(dpt1.dpt_nm.as("ar_dpt_nm"));
		builder.addSelect(dpt2.dpt_nm.as("bcst_dpt_nm"));
		builder.addSelect(dpt3.dpt_nm.as("vmi_purc_dpt_nm"));
		builder.addSelect(dpt4.dpt_nm.as("ap_dpt_nm"));
		builder.addSelect(dpt5.dpt_nm.as("bsppl_dpt_nm"));
		builder.addSelect(dpt6.dpt_nm.as("pay_dpt_nm"));

		// 販売分析名称の取得
		MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
		MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
		MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
		builder.addSelect(sls_anly1.sls_anly_nm.as("sls_anly_nm1"));
		builder.addSelect(sls_anly2.sls_anly_nm.as("sls_anly_nm2"));
		builder.addSelect(sls_anly3.sls_anly_nm.as("sls_anly_nm3"));
	}

	protected void addJoinTableMain(MCQueryApiBuilder builder) {

		MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
		MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
		MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
		MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
		MAM_BP_SUB_R t = MAM_BP_SUB_R.create(builder.getBaseDbcAlias());

		builder.addLeftOuterJoin(dpt1, dpt1.dpt_cd.eq(t.ar_dpt_cd)
				.and(dpt1.st_dt.lte(t.st_dt))
				.and(dpt1.end_dt.gte(t.st_dt)));

		builder.addLeftOuterJoin(dpt2, dpt2.dpt_cd.eq(t.bcst_dpt_cd)
				.and(dpt2.st_dt.lte(t.st_dt))
				.and(dpt2.end_dt.gte(t.st_dt)));

		builder.addLeftOuterJoin(dpt3, dpt3.dpt_cd.eq(t.vmi_purc_dpt_cd)
				.and(dpt3.st_dt.lte(t.st_dt))
				.and(dpt3.end_dt.gte(t.st_dt)));

		builder.addLeftOuterJoin(dpt4, dpt4.dpt_cd.eq(t.ap_dpt_cd)
				.and(dpt4.st_dt.lte(t.st_dt))
				.and(dpt4.end_dt.gte(t.st_dt)));

		builder.addLeftOuterJoin(dpt5, dpt5.dpt_cd.eq(t.bsppl_dpt_cd)
				.and(dpt5.st_dt.lte(t.st_dt))
				.and(dpt5.end_dt.gte(t.st_dt)));

		builder.addLeftOuterJoin(dpt6, dpt6.dpt_cd.eq(t.pay_dpt_cd)
				.and(dpt6.st_dt.lte(t.st_dt))
				.and(dpt6.end_dt.gte(t.st_dt)));
	}

	protected void addJoinTableCmn(MCQueryApiBuilder builder) {

		MAM_SLS_ANLY_R sls_anly1 = MAM_SLS_ANLY_R.create("SLS_ANLY1");
		MAM_SLS_ANLY_R sls_anly2 = MAM_SLS_ANLY_R.create("SLS_ANLY2");
		MAM_SLS_ANLY_R sls_anly3 = MAM_SLS_ANLY_R.create("SLS_ANLY3");
		MAM_BP_SUB_R t = MAM_BP_SUB_R.create(builder.getBaseDbcAlias());

		builder.addLeftOuterJoin(sls_anly1,
				sls_anly1.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY1.value()))
						.and(sls_anly1.sls_anly_cd.eq(t.sls_anly_cd1)));
		builder.addLeftOuterJoin(sls_anly2,
				sls_anly2.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY2.value()))
						.and(sls_anly2.sls_anly_cd.eq(t.sls_anly_cd2)));
		builder.addLeftOuterJoin(sls_anly3,
				sls_anly3.sls_anly_typ.eq(value(MAC_SLS_ANLY_TYP.ANLY3.value()))
						.and(sls_anly3.sls_anly_cd.eq(t.sls_anly_cd3)));
	}

	protected <R extends MCDBContainer> void dbcCustomizeCommon(MCQueryApiBuilder builder,
			MCList<R> rslt) {
		addSelectCmn(builder, rslt);
		addJoinTableMain(builder);
		addJoinTableCmn(builder);
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 取引先補助マスタの検索を行います。<br>
	 */
	public class Sprt01 extends MABCL_BpSubReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder, rslt);
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先補助マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_BpSubReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先補助マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpSubReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}