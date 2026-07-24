package mcframe.clientMSBE.MSBEP1160;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_ProvDtlModReg]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("MS.MSBEL1160.Srch01.UP.BLOCK0")){
			return MS_MSBEL1160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Upd01.UP.BLOCK0")){
			return MS_MSBEL1160_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Upd01.UP.BLOCK1")){
			return MS_MSBEL1160_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1160.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1160_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1160_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1160_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt02.UP.BLOCK0")){
			return MS_MSBEL1160_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt02.DOWN.BLOCK0")){
			return MS_MSBEL1160_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt03.UP.BLOCK0")){
			return MS_MSBEL1160_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Sprt03.DOWN.BLOCK0")){
			return MS_MSBEL1160_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1160_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1160.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1160_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1160.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1160_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBEL1160_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("prov", "prov"),
				MCItemDef.create("prov_rtn", "prov_rtn"),
				MCItemDef.create("ffr_prov_flg", "ffr_prov_flg"),
				MCItemDef.create("onr_prov_flg", "onr_prov_flg"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("not_subcon_flg", "not_subcon_flg"),
				MCItemDef.create("dlv_not_prnted", "dlv_not_prnted"),
				MCItemDef.create("dlv_prnted", "dlv_prnted"),
				MCItemDef.create("accpt_dt_fr", "accpt_dt_fr"),
				MCItemDef.create("accpt_dt_to", "accpt_dt_to"),
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("arr_act_dt_p" + ".ymd_fr", "arr_act_dt_fr"),
				MCItemDef.create("arr_act_dt_p" + ".hm_fr", "arr_act_hm_fr"),
				MCItemDef.create("arr_act_dt_p" + ".ymd_to", "arr_act_dt_to"),
				MCItemDef.create("arr_act_dt_p" + ".hm_to", "arr_act_hm_to"),
				MCItemDef.create("accpt_schd_dt_fr", "accpt_schd_dt_fr"),
				MCItemDef.create("accpt_schd_dt_to", "accpt_schd_dt_to"),
				MCItemDef.create("arr_schd_dt_p" + ".ymd_fr", "arr_schd_dt_fr"),
				MCItemDef.create("arr_schd_dt_p" + ".hm_fr", "arr_schd_hm_fr"),
				MCItemDef.create("arr_schd_dt_p" + ".ymd_to", "arr_schd_dt_to"),
				MCItemDef.create("arr_schd_dt_p" + ".hm_to", "arr_schd_hm_to"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("prsppl_loc_cd", "prsppl_loc_cd"),
				MCItemDef.create("prsppl_loc_nm", "prsppl_loc_nm"),
				MCItemDef.create("prsppl_str_ln_cd", "prsppl_str_ln_cd"),
				MCItemDef.create("prsppl_str_ln_nm", "prsppl_str_ln_nm"),
				MCItemDef.create("prsppl_wg_cd", "prsppl_wg_cd"),
				MCItemDef.create("prsppl_wg_nm", "prsppl_wg_nm"),
				MCItemDef.create("prsppl_lg_grp_cd", "prsppl_lg_grp_cd"),
				MCItemDef.create("prsppl_lg_grp_nm", "prsppl_lg_grp_nm"),
				MCItemDef.create("prsppl_site_cd", "prsppl_site_cd"),
				MCItemDef.create("prsppl_site_nm", "prsppl_site_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_wrk_no_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("prov_src_act_no", "prov_src_act_no"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dis_can_disp_flg", "dis_can_disp_flg"),
				MCItemDef.create("sign_rev_flg", "sign_rev_flg"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg1", "prsppl_grp_flg1"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd1", "prsppl_grp_cd1"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm1", "prsppl_grp_nm1"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg2", "prsppl_grp_flg2"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd2", "prsppl_grp_cd2"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm2", "prsppl_grp_nm2"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg3", "prsppl_grp_flg3"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd3", "prsppl_grp_cd3"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm3", "prsppl_grp_nm3"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg4", "prsppl_grp_flg4"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd4", "prsppl_grp_cd4"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm4", "prsppl_grp_nm4"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg5", "prsppl_grp_flg5"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd5", "prsppl_grp_cd5"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm5", "prsppl_grp_nm5"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg6", "prsppl_grp_flg6"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd6", "prsppl_grp_cd6"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm6", "prsppl_grp_nm6"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg7", "prsppl_grp_flg7"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd7", "prsppl_grp_cd7"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm7", "prsppl_grp_nm7"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg8", "prsppl_grp_flg8"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd8", "prsppl_grp_cd8"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm8", "prsppl_grp_nm8"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg9", "prsppl_grp_flg9"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd9", "prsppl_grp_cd9"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm9", "prsppl_grp_nm9"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_flg10", "prsppl_grp_flg10"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_cd10", "prsppl_grp_cd10"),
				MCItemDef.create("prsppl_grp_p" + ".bp_grp_nm10", "prsppl_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("on_edi_flg", "on_edi_flg"),
				MCItemDef.create("off_edi_flg", "off_edi_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("accpt_dt", "accpt_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("arr_acr_tm_p" + ".ymd", "arr_act_dt"),
				MCItemDef.create("arr_acr_tm_p" + ".hm", "arr_act_hm"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("arr_schd_tm_p" + ".ymd", "arr_schd_dt"),
				MCItemDef.create("arr_schd_tm_p" + ".hm", "arr_schd_hm"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("prsppl_nm", "prsppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("prsppl_loc_cd", "prsppl_loc_cd"),
				MCItemDef.create("prsppl_loc_nm", "prsppl_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("prsppl_wg_cd", "prsppl_wg_cd"),
				MCItemDef.create("prsppl_wg_nm", "prsppl_wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("act_qty_p" + ".qty", "act_qty"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("old_trd_cur_upri_p" + ".upri", "old_trd_cur_upri"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "wtax_amt"),
				MCItemDef.create("xfr_rsn_cd", "xfr_rsn_cd"),
				MCItemDef.create("xfr_rsn_nm", "xfr_rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_prnted_flg", "dlv_prnted_flg"),
				MCItemDef.create("prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("prov_src_act_typ_nm", "prov_src_act_typ_nm"),
				MCItemDef.create("prov_src_act_no", "prov_src_act_no"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_act_rev", "prov_act_rev"),
				MCItemDef.create("prov_src_schd_typ", "prov_src_schd_typ"),
				MCItemDef.create("prov_src_schd_typ_nm", "prov_src_schd_typ_nm"),
				MCItemDef.create("prov_src_schd_no1", "prov_src_schd_no1"),
				MCItemDef.create("prov_src_schd_no2", "prov_src_schd_no2"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd1", "prsppl_grp_cd1"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm1", "prsppl_grp_nm1"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd2", "prsppl_grp_cd2"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm2", "prsppl_grp_nm2"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd3", "prsppl_grp_cd3"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm3", "prsppl_grp_nm3"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd4", "prsppl_grp_cd4"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm4", "prsppl_grp_nm4"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd5", "prsppl_grp_cd5"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm5", "prsppl_grp_nm5"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd6", "prsppl_grp_cd6"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm6", "prsppl_grp_nm6"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd7", "prsppl_grp_cd7"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm7", "prsppl_grp_nm7"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd8", "prsppl_grp_cd8"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm8", "prsppl_grp_nm8"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd9", "prsppl_grp_cd9"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm9", "prsppl_grp_nm9"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_cd10", "prsppl_grp_cd10"),
				MCItemDef.create("prsppl_Grp_p" + ".bp_grp_nm10", "prsppl_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("prov_amt_rnd_typ", "prov_amt_rnd_typ"),
				MCItemDef.create("prov_tax_rnd_typ", "prov_tax_rnd_typ"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("prov_act_seq", "prov_act_seq"),
				MCItemDef.create("prov_upd_cntr", "prov_upd_cntr"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_upd_cntr", "xfr_upd_cntr"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_ret_schd_d_no", "purc_ret_schd_d_no"),
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_d_no", "purc_ret_act_d_no"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("purc_close_flg", "purc_close_flg"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1160_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1160", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xfr_rsn_cd", "xfr_rsn_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_act_seq", "prov_act_seq"),
				MCItemDef.create("prnt_out_flg", "prnt_out_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("prov_upd_cntr", "prov_upd_cntr"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1160_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1160_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1160", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("grp_no", "grp_no")
			}
			,
			MCBlockDef.create("UpriSrch")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("upri", "upri")
			}
			,
			MCBlockDef.create("UpriSrch")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1160_Sprt02_INFO = new MCOperationInfo("MS", "MSBEL1160", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate_dt", "xrate_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("XrateSrch")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("xrate", "xrate")
			}
			,
			MCBlockDef.create("XrateSrch")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1160_Sprt03_INFO = new MCOperationInfo("MS", "MSBEL1160", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Sprt03_UP_BLOCK0() {
		/** Ope.のBlock [Sprt03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("prsppl_cd", "prsppl_cd"),
				MCItemDef.create("tax_dt", "tax_dt")
			}
			,
			MCBlockDef.create("TaxSrch")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Sprt03_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate")
			}
			,
			MCBlockDef.create("TaxSrch")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1160_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1160", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1160_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("prov_src_act_typ", "prov_src_act_typ"),
				MCItemDef.create("prov_act_no", "prov_act_no"),
				MCItemDef.create("prov_act_seq", "prov_act_seq"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("prov_upd_cntr", "prov_upd_cntr"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_upd_cntr", "xfr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1160_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1160_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1160", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

