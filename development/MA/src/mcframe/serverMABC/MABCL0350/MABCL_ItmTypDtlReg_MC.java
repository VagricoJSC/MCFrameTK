package mcframe.serverMABC.MABCL0350;

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
import mcframe.serverMABC.MABCL0350.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmTypDtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmTypDtlReg_MC extends MABCL_ItmTypDtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmTypDtl_UpdChk01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの登録前のチェックを行います。<br>
	 */
	public class ItmTypDtl_UpdChk01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (ItmTypDtl_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.itm_typ_d_cd())){
					msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$itm_typ_d_cd, MABCL0306, 
									getLabel(r, ItmTypDtl_UpdChk01_DtlR.$itm_typ_d_cd), r.itm_typ_d_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				// 市場出荷判定役割ＣＤ、市場出荷判定更新役割ＣＤ
				if (r.def_mrkt_judg_flg()) {
					msgList.addAll(check(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_role_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_upd_role_cd, new FXUCL_RequiredValidater()));
				}
				// 工場出荷承認役割ＣＤ
				if (r.def_plnt_aprv_flg()) {
					msgList.addAll(check(r, ItmTypDtl_UpdChk01_DtlR.$def_plnt_aprv_role_cd, new FXUCL_RequiredValidater()));
				}
				// 検査承認役割ＣＤ
				if (r.def_insp_aprv_flg()) {
					msgList.addAll(check(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_aprv_role_cd, new FXUCL_RequiredValidater()));
				}
				// 製造承認役割ＣＤ
				if (r.def_mfg_aprv_flg()) {
					msgList.addAll(check(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_aprv_role_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				// 架空品の入力不可チェック
				if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
					// 品目マスタ関連デフォルト値
					if (r.def_sls_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sls_flg, MABCL0034));
					if (r.def_mfg_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_flg, MABCL0034));
					if (r.def_purc_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_purc_flg, MABCL0034));
					if (r.def_insp_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_flg, MABCL0034));
					if (r.def_minus_stk_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_minus_stk_flg, MABCL0034));
					if (r.def_gi_alloc_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_gi_alloc_flg, MABCL0034));
					if (r.def_pack_alloc_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_pack_alloc_flg, MABCL0034));
					if (r.def_bp_lot_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_bp_lot_flg, MABCL0034));
					if (!isNull(r.def_comp_spec_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_comp_spec_typ, MABCL0035));
					if (r.def_comp_core_itm_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_comp_core_itm_flg, MABCL0034));
					if (r.def_skip_chk_ship_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_skip_chk_ship_flg, MABCL0034));
					if (!isNull(r.def_itm_spec_grp_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_itm_spec_grp_cd, MABCL0035));
					if (!isNull(r.def_sls_upri_grp_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sls_upri_grp_cd, MABCL0035));
					if (r.def_slo_proc_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_proc_flg, MABCL0034));
					if (!isNull(r.def_slo_proc_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_proc_typ, MABCL0035));
					if (!isNull(r.def_ship_inst_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_ship_inst_typ, MABCL0035));
					if (!isNull(r.def_itm_ship_grp_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_itm_ship_grp_cd, MABCL0035));
					if (r.def_arr_skip_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_arr_skip_flg, MABCL0034));
					if (!isNull(r.def_ship_term_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_ship_term_cd, MABCL0035));
					if (r.def_stk_lst_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_stk_lst_flg, MABCL0034));
					if (!isNull(r.def_mfg_inst_unit_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_inst_unit_typ, MABCL0035));
					if (r.def_sls_upri_cng_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sls_upri_cng_flg, MABCL0034));
					if (r.def_purc_upri_cng_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_purc_upri_cng_flg, MABCL0034));
					if (r.def_prov_upri_cng_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_prov_upri_cng_flg, MABCL0034));
					if (!isNull(r.def_mrp_proc_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrp_proc_typ, MABCL0035));
					if (!isNull(r.def_rqmt_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_typ, MABCL0035));
					if (!isNull(r.def_prod_pln_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_prod_pln_typ, MABCL0035));
					if (!isNull(r.def_dmnd_date_div_mons())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_dmnd_date_div_mons, MABCL0035));
					if (!isNull(r.def_alloc_margin_days())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_alloc_margin_days, MABCL0035));
					if (!isNull(r.def_mrp_alloc_margin_days())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrp_alloc_margin_days, MABCL0035));
					if (!isNull(r.def_mrp_opn_xfr_days())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrp_opn_xfr_days, MABCL0035));
					if (r.def_inpt_itm_add_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_inpt_itm_add_flg, MABCL0034));
					if (r.def_inpt_itm_del_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_inpt_itm_del_flg, MABCL0034));
					if (r.def_sch_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sch_flg, MABCL0034));
					if (!isNull(r.def_lot_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_mng_typ, MABCL0035));
					if (!isNull(r.def_lot_no_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_typ, MABCL0035));
					if (!isNull(r.def_lot_no_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_ptn_cd, MABCL0035));
					if (!isNull(r.def_sublot_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_mng_typ, MABCL0035));
					if (!isNull(r.def_sublot_no_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_typ, MABCL0035));
					if (!isNull(r.def_sublot_no_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_ptn_cd, MABCL0035));					
					if (!isNull(r.def_sno1_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_mng_typ, MABCL0035));
					if (!isNull(r.def_sno2_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_mng_typ, MABCL0035));
					if (!isNull(r.def_sno3_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_mng_typ, MABCL0035));
					if (!isNull(r.def_sno4_mng_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_mng_typ, MABCL0035));
					if (r.def_slo_sno1_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno1_flg, MABCL0034));
					if (r.def_slo_sno2_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno2_flg, MABCL0034));
					if (r.def_slo_sno3_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno3_flg, MABCL0034));
					if (r.def_slo_sno4_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno4_flg, MABCL0034));
					if (r.def_rqmt_sno1_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno1_flg, MABCL0034));
					if (r.def_rqmt_sno2_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno2_flg, MABCL0034));
					if (r.def_rqmt_sno3_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno3_flg, MABCL0034));
					if (r.def_rqmt_sno4_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno4_flg, MABCL0034));
					if (!isNull(r.def_sno1_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_ptn_cd, MABCL0035));
					if (!isNull(r.def_sno2_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_ptn_cd, MABCL0035));
					if (!isNull(r.def_sno3_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_ptn_cd, MABCL0035));
					if (!isNull(r.def_sno4_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_ptn_cd, MABCL0035));
					if (r.def_lmt_ctl_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_lmt_ctl_flg, MABCL0034));
					if (r.def_ver_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_ver_flg, MABCL0034));
					if (!isNull(r.def_mrkt_judg_role_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_role_cd, MABCL0035));
					if (!isNull(r.def_mrkt_judg_upd_role_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_upd_role_cd, MABCL0035));

					// 品目（工場・物流倉庫）マスタ関連デフォルト値
					if (r.def_plnt_aprv_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_plnt_aprv_flg, MABCL0034));
					if (!isNull(r.def_plnt_aprv_role_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_plnt_aprv_role_cd, MABCL0035));
					if (r.def_insp_aprv_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_aprv_flg, MABCL0034));
					if (!isNull(r.def_insp_aprv_role_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_aprv_role_cd, MABCL0035));
					if (r.def_mfg_aprv_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_aprv_flg, MABCL0034));
					if (!isNull(r.def_mfg_aprv_role_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_aprv_role_cd, MABCL0035));

					// ＢＯＭマスタ（子）関連デフォルト値
					if (r.def_inst_lot_fix_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_inst_lot_fix_flg, MABCL0034));
					if (r.def_lot_mix_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_mix_flg, MABCL0034));
					if (r.def_sublot_mix_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_mix_flg, MABCL0034));
					if (!isNull(r.def_alloc_ctl_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_alloc_ctl_typ, MABCL0035));
					if (!isNull(r.def_inpt_ctl_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_inpt_ctl_typ, MABCL0035));
					if (!isNull(r.def_bkf_typ())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_bkf_typ, MABCL0035));
					if (r.def_main_itm_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_main_itm_flg, MABCL0034));
					if (r.def_byprod_flg()) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_byprod_flg, MABCL0034));

					if (!isNull(r.def_calc_ptn_cd())) msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_calc_ptn_cd, MABCL0035));
				}
				// 受注時構成改訂許可ＦＬＧ
				if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.def_comp_spec_typ())) {
					if (r.def_comp_rev_at_slo_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_comp_rev_at_slo_flg, MABCL0178, toDispGUIIndex(r)));
					}
				}

				// 市場出荷判定対象ＦＬＧ、検査実施単位区分
				if (!MAC_LOT_MNG_TYP.isUNIQ(r.def_lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.def_sublot_mng_typ())) {
					if (r.def_mrkt_judg_flg()) {
						msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_flg, MABCL0061));
					}
					if (!isNull(r.def_insp_bind_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_bind_typ, MABCL0075, toDispGUIIndex(r)));
					}
				}
				// 期限管理対象ＦＬＧ
				if (isNull(r.def_lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
					if (r.def_lmt_ctl_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lmt_ctl_flg, MABCL0703, toDispGUIIndex(r)));
					}
				}
				// 期限管理種別、出荷ロット逆転禁止ＦＬＧ、出荷有効期限グループＣＤ
				if (!r.def_lmt_ctl_flg()) {
					if (!isNull(r.def_lmt_ctl_categ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lmt_ctl_categ, MABCL0062, toDispGUIIndex(r)));
					}
					if (r.def_ship_lot_back_stop_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_ship_lot_back_stop_flg, MABCL0142, toDispGUIIndex(r)));
					}
					if (!isNull(r.def_ship_valid_grp_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_ship_valid_grp_cd, MABCL0260, toDispGUIIndex(r)));
					}
				}
				// ロットＮＯ発番区分
				if (isNull(r.def_lot_mng_typ())) {
					if (!isNull(r.def_lot_no_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_typ, MABCL0184, toDispGUIIndex(r)));
					}
				}
				else if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
					if (!isNull(r.def_lot_no_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_typ, MABCL0185, toDispGUIIndex(r)));
					}
					if (r.def_ver_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_ver_flg, MABCL0182, toDispGUIIndex(r)));
					}
				}
				// ロットＮＯ発番パタンＣＤ
				if (isNull(r.def_lot_no_typ())) {
					if (!isNull(r.def_lot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_ptn_cd, MABCL0186, toDispGUIIndex(r)));
					}
				}
				else if(MAC_LOT_NO_TYP.isMANUAL(r.def_lot_no_typ())) {
					if (!isNull(r.def_lot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_no_ptn_cd, MABCL0187, toDispGUIIndex(r)));
					}
				}
				// サブロット管理区分
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ())) {
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isSTK(r.def_sublot_mng_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_mng_typ, MABCL0072, toDispGUIIndex(r)));
					}
				}
				// サブロットＮＯ発番区分
				if (isNull(r.def_sublot_mng_typ())) {
					if (!isNull(r.def_sublot_no_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_typ, MABCL0188, toDispGUIIndex(r)));
					}
				}
				else if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())) {
					if (!isNull(r.def_sublot_no_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_typ, MABCL0189, toDispGUIIndex(r)));
					}
				}
				// サブロットＮＯ発番パタンＣＤ
				if (isNull(r.def_sublot_no_typ())) {
					if (!isNull(r.def_sublot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_ptn_cd, MABCL0190, toDispGUIIndex(r)));
					}
				}
				else if(MAC_LOT_NO_TYP.isMANUAL(r.def_sublot_no_typ())) {
					if (!isNull(r.def_sublot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_no_ptn_cd, MABCL0191, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ１必須ＦＬＧ、所要手配ＮＯ１必須ＦＬＧ
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())) {
					if (r.def_slo_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno1_flg, MABCL0192, toDispGUIIndex(r)));
					}
					if (r.def_rqmt_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno1_flg, MABCL0193, toDispGUIIndex(r)));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno1_mng_typ())) {
					if (!r.def_slo_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno1_flg, MABCL0194, toDispGUIIndex(r)));
					}
					if (!r.def_rqmt_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno1_flg, MABCL0195, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ１発番区分
				if (!isNull(r.def_sno1_mng_typ())) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())) {
						if (!isNull(r.def_sno1_num_typ())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_num_typ, MABCL0196, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno1_num_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_num_typ, MABCL0197, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ１発番パタンＣＤ
				if (!isNull(r.def_sno1_num_typ())) {
					if (MAC_SNO_NO_TYP.isMANUAL(r.def_sno1_num_typ())) {
						if (!isNull(r.def_sno1_ptn_cd())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_ptn_cd, MABCL0198, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno1_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_ptn_cd, MABCL0199, toDispGUIIndex(r)));
					}
				}
				if (r.def_rqmt_sno1_flg()) {
					if (!isNull(r.def_sno1_num_typ()) && !MAC_SNO_NO_TYP.isAUTO(r.def_sno1_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.def_sno1_num_typ())) {
						msgList.add(getMsg2(r, ItmTypDtl_UpdChk01_DtlR.$def_sno1_num_typ, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno1_flg, MABCL0077));
					}
				}				
				// 手配ＮＯ２必須ＦＬＧ、所要手配ＮＯ２必須ＦＬＧ
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())) {
					if (r.def_slo_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno2_flg, MABCL0200, toDispGUIIndex(r)));
					}
					if (r.def_rqmt_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno2_flg, MABCL0201, toDispGUIIndex(r)));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno2_mng_typ())) {
					if (!r.def_slo_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno2_flg, MABCL0202, toDispGUIIndex(r)));
					}
					if (!r.def_rqmt_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno2_flg, MABCL0203, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ２発番区分
				if (!isNull(r.def_sno2_mng_typ())) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())) {
						if (!isNull(r.def_sno2_num_typ())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_num_typ, MABCL0204, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno2_num_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_num_typ, MABCL0205, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ２発番パタンＣＤ
				if (!isNull(r.def_sno2_num_typ())) {
					if (MAC_SNO_NO_TYP.isMANUAL(r.def_sno2_num_typ())) {
						if (!isNull(r.def_sno2_ptn_cd())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_ptn_cd, MABCL0206, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno2_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_ptn_cd, MABCL0207, toDispGUIIndex(r)));
					}
				}
				if (r.def_rqmt_sno2_flg()) {
					if (!isNull(r.def_sno2_num_typ()) && !MAC_SNO_NO_TYP.isAUTO(r.def_sno2_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.def_sno2_num_typ())) {
						msgList.add(getMsg2(r, ItmTypDtl_UpdChk01_DtlR.$def_sno2_num_typ, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno2_flg, MABCL0077));
					}
				}
				// 手配ＮＯ３必須ＦＬＧ、所要手配ＮＯ３必須ＦＬＧ
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())) {
					if (r.def_slo_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno3_flg, MABCL0208, toDispGUIIndex(r)));
					}
					if (r.def_rqmt_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno3_flg, MABCL0209, toDispGUIIndex(r)));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno3_mng_typ())) {
					if (!r.def_slo_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno3_flg, MABCL0210, toDispGUIIndex(r)));
					}
					if (!r.def_rqmt_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno3_flg, MABCL0211, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ３発番区分
				if (!isNull(r.def_sno3_mng_typ())) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())) {
						if (!isNull(r.def_sno3_num_typ())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_num_typ, MABCL0212, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno3_num_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_num_typ, MABCL0213, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ３発番パタンＣＤ
				if (!isNull(r.def_sno3_num_typ())) {
					if (MAC_SNO_NO_TYP.isMANUAL(r.def_sno3_num_typ())) {
						if (!isNull(r.def_sno3_ptn_cd())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_ptn_cd, MABCL0214, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno3_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_ptn_cd, MABCL0215, toDispGUIIndex(r)));
					}
				}
				if (r.def_rqmt_sno3_flg()) {
					if (!isNull(r.def_sno3_num_typ()) && !MAC_SNO_NO_TYP.isAUTO(r.def_sno3_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.def_sno3_num_typ())) {
						msgList.add(getMsg2(r, ItmTypDtl_UpdChk01_DtlR.$def_sno3_num_typ, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno3_flg, MABCL0077));
					}
				}
				// 手配ＮＯ４必須ＦＬＧ、所要手配ＮＯ４必須ＦＬＧ
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())) {
					if (r.def_slo_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno4_flg, MABCL0216, toDispGUIIndex(r)));
					}
					if (r.def_rqmt_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno4_flg, MABCL0217, toDispGUIIndex(r)));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno4_mng_typ())) {
					if (!r.def_slo_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_slo_sno4_flg, MABCL0218, toDispGUIIndex(r)));
					}
					if (!r.def_rqmt_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno4_flg, MABCL0219, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ４発番区分
				if (!isNull(r.def_sno4_mng_typ())) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())) {
						if (!isNull(r.def_sno4_num_typ())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_num_typ, MABCL0220, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno4_num_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_num_typ, MABCL0221, toDispGUIIndex(r)));
					}
				}
				//手配ＮＯ４発番パタンＣＤ
				if (!isNull(r.def_sno4_num_typ())) {
					if (MAC_SNO_NO_TYP.isMANUAL(r.def_sno4_num_typ())) {
						if (!isNull(r.def_sno4_ptn_cd())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_ptn_cd, MABCL0222, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if (!isNull(r.def_sno4_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_ptn_cd, MABCL0223, toDispGUIIndex(r)));
					}
				}
				if (r.def_rqmt_sno4_flg()) {
					if (!isNull(r.def_sno4_num_typ()) && !MAC_SNO_NO_TYP.isAUTO(r.def_sno4_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.def_sno4_num_typ())) {
						msgList.add(getMsg2(r, ItmTypDtl_UpdChk01_DtlR.$def_sno4_num_typ, ItmTypDtl_UpdChk01_DtlR.$def_rqmt_sno4_flg, MABCL0077));
					}
				}
				// 市場出荷判定役割ＣＤ、市場出荷判定更新役割ＣＤ
				if (!r.def_mrkt_judg_flg()) {
					if (!isNull(r.def_mrkt_judg_role_cd())) {
						msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_role_cd, MABCL0060));
					}
					if (!isNull(r.def_mrkt_judg_upd_role_cd())) {
						msgList.add(getMsg(r, ItmTypDtl_UpdChk01_DtlR.$def_mrkt_judg_upd_role_cd, MABCL0060));
					}
				}
				// 工場出荷承認役割ＣＤ
				if (!r.def_plnt_aprv_flg()) {
					if (!isNull(r.def_plnt_aprv_role_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_plnt_aprv_role_cd, MABCL0225, toDispGUIIndex(r)));
					}
				}
				// 検査承認役割ＣＤ
				if (!r.def_insp_aprv_flg()) {
					if (!isNull(r.def_insp_aprv_role_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_insp_aprv_role_cd, MABCL0226, toDispGUIIndex(r)));
					}
				}
				// 製造承認役割ＣＤ
				if (!r.def_mfg_aprv_flg()) {
					if (!isNull(r.def_mfg_aprv_role_cd())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_mfg_aprv_role_cd, MABCL0227, toDispGUIIndex(r)));
					}
				}
				// 手配ＮＯ１区分
				if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
					if (!isNull(r.def_sno1_mng_typ())) {
						if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno1_mng_typ())) {
							if (!MAC_SNO_TYP.isNO_EXTND(r.def_sno_typ1())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1, MABCL0228,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno1_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND(r.def_sno_typ1())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1, MABCL0229,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno1_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND_NULL(r.def_sno_typ1())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1, MABCL0230,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1), toDispGUIIndex(r)));
							}
						}
					} else {
						if (!isNull(r.def_sno_typ1())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1, MABCL0231,
									getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ1), toDispGUIIndex(r)));
						}
					}
					// 手配ＮＯ２区分
					if (!isNull(r.def_sno2_mng_typ())) {
						if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno2_mng_typ())) {
							if (!MAC_SNO_TYP.isNO_EXTND(r.def_sno_typ2())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2, MABCL0228,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno2_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND(r.def_sno_typ2())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2, MABCL0229,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno2_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND_NULL(r.def_sno_typ2())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2, MABCL0230,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2), toDispGUIIndex(r)));
							}
						}
					} else {
						if (!isNull(r.def_sno_typ2())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2, MABCL0231,
									getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ2), toDispGUIIndex(r)));
						}
					}
					// 手配ＮＯ３区分
					if (!isNull(r.def_sno3_mng_typ())) {
						if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno3_mng_typ())) {
							if (!MAC_SNO_TYP.isNO_EXTND(r.def_sno_typ3())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3, MABCL0228,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno3_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND(r.def_sno_typ3())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3, MABCL0229,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno3_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND_NULL(r.def_sno_typ3())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3, MABCL0230,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3), toDispGUIIndex(r)));
							}
						}
					} else {
						if (!isNull(r.def_sno_typ3())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3, MABCL0231,
									getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ3), toDispGUIIndex(r)));
						}
					}
					// 手配ＮＯ４区分
					if (!isNull(r.def_sno4_mng_typ())) {
						if (MAC_SNO_MNG_TYP.isNOT_MNG(r.def_sno4_mng_typ())) {
							if (!MAC_SNO_TYP.isNO_EXTND(r.def_sno_typ4())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4, MABCL0228,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.def_sno4_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND(r.def_sno_typ4())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4, MABCL0229,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4), toDispGUIIndex(r)));
							}
						}
						if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.def_sno4_mng_typ())) {
							if (!MAC_SNO_TYP.isEXTND_NULL(r.def_sno_typ4())) {
								msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4, MABCL0230,
										getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4), toDispGUIIndex(r)));
							}
						}
					} else {
						if (!isNull(r.def_sno_typ4())) {
							msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4, MABCL0231,
									getLabel(r, ItmTypDtl_UpdChk01_DtlR.$def_sno_typ4), toDispGUIIndex(r)));
						}
					}
				}
				// ロット混在ＦＬＧ
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ()) && r.def_lot_mix_flg()) {
					msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_lot_mix_flg, MABCL0244, toDispGUIIndex(r)));
				}
				// サブロット混在ＦＬＧ
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ()) && r.def_sublot_mix_flg()) {
					msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_sublot_mix_flg, MABCL0245, toDispGUIIndex(r)));
				}
				//新規ロット入力不可ＦＬＧ
				if (r.def_not_new_lot_flg()
				 && ((isNull(r.def_lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.def_lot_mng_typ()))
				  && (isNull(r.def_sublot_mng_typ()) ||  MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.def_sublot_mng_typ())))) {
					msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_not_new_lot_flg, MABCL0232, toDispGUIIndex(r)));
				}
				// 主原料ＦＬＧ
				if (r.def_byprod_flg() && r.def_main_itm_flg()) {
					msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_main_itm_flg, MABCL0246, toDispGUIIndex(r)));
				}
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.def_slo_proc_typ())) {
					if (!MAC_SHIP_INST_TYP.isNON(r.def_ship_inst_typ())) {
						msgList.add(new MCMessage(r, ItmTypDtl_UpdChk01_DtlR.$def_ship_inst_typ, MABCL0179, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(ItmTypDtl_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
		/** 項目名、制御項目名、行番号を引数に持つメッセージ（主に手配ＮＯ用） */
		protected MCMessage getMsg2(ItmTypDtl_UpdChk01_DtlR r, String col, String ctrl, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), getLabel(r, ctrl), toDispGUIIndex(r));
		}
	}
	/**
	 * ItmTypDtl_Upd01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの登録を行います。<br>
	 */
	public class ItmTypDtl_Upd01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmTypDtlLcl_UpdChk01オペレーション.<p>
	 *
	 * 汎用分類名称マスタの登録前のチェックを行います。<br>
	 */
	public class ItmTypDtlLcl_UpdChk01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtlLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmTypDtlLcl_Upd01オペレーション.<p>
	 *
	 * 汎用分類名称マスタの登録を行います。<br>
	 */
	public class ItmTypDtlLcl_Upd01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtlLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmTypDtl_DelChk01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの削除前のチェックを行います。<br>
	 */
	public class ItmTypDtl_DelChk01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmTypDtl_Del01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの削除を行います。<br>
	 */
	public class ItmTypDtl_Del01 extends MABCL_ItmTypDtlReg_MC_A.ItmTypDtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmTypDtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_ITM_TYP_D_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_NUM_PTN_R num_ptn1 = MAM_NUM_PTN_R.create("NUM_PTN1");
			MAM_NUM_PTN_R num_ptn2 = MAM_NUM_PTN_R.create("NUM_PTN2");
			MAM_NUM_PTN_R num_ptn3 = MAM_NUM_PTN_R.create("NUM_PTN3");
			MAM_NUM_PTN_R num_ptn4 = MAM_NUM_PTN_R.create("NUM_PTN4");
			MAM_NUM_PTN_R num_ptn5 = MAM_NUM_PTN_R.create("NUM_PTN5");
			MAM_NUM_PTN_R num_ptn6 = MAM_NUM_PTN_R.create("NUM_PTN6");
			MAM_ITM_TYP_D_R t = MAM_ITM_TYP_D_R.create(builder.getBaseDbcAlias());

			builder.addSelect(num_ptn1.num_ptn_nm.as("def_lot_no_ptn_nm"));
			builder.addSelect(num_ptn2.num_ptn_nm.as("def_sublot_no_ptn_nm"));
			builder.addSelect(num_ptn3.num_ptn_nm.as("def_sno1_ptn_nm"));
			builder.addSelect(num_ptn4.num_ptn_nm.as("def_sno2_ptn_nm"));
			builder.addSelect(num_ptn5.num_ptn_nm.as("def_sno3_ptn_nm"));
			builder.addSelect(num_ptn6.num_ptn_nm.as("def_sno4_ptn_nm"));

			builder.addLeftOuterJoin(num_ptn1, t.def_lot_no_ptn_cd.eq(num_ptn1.num_ptn_cd)
					.and(num_ptn1.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.LOT.value()))));
			builder.addLeftOuterJoin(num_ptn2, t.def_sublot_no_ptn_cd.eq(num_ptn2.num_ptn_cd)
					.and(num_ptn2.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SUBLOT.value()))));
			builder.addLeftOuterJoin(num_ptn3, t.def_sno1_ptn_cd.eq(num_ptn3.num_ptn_cd)
					.and(num_ptn3.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn4, t.def_sno2_ptn_cd.eq(num_ptn4.num_ptn_cd)
					.and(num_ptn4.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn5, t.def_sno3_ptn_cd.eq(num_ptn5.num_ptn_cd)
					.and(num_ptn5.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn6, t.def_sno4_ptn_cd.eq(num_ptn6.num_ptn_cd)
					.and(num_ptn6.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_ItmTypDtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目区分詳細マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_ItmTypDtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}