package mcframe.serverMSBD.MSBDL0040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [MSBDL_PoSchdSplitReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0040.Srch01.UP.BLOCK0")){
			return MS_MSBDL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Srch02.UP.BLOCK0")){
			return MS_MSBDL0040_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0040_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Srch02.DOWN.BLOCK1")){
			return MS_MSBDL0040_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Sprt01.UP.BLOCK0")){
			return MS_MSBDL0040_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Sprt01.DOWN.BLOCK0")){
			return MS_MSBDL0040_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Sprt02.UP.BLOCK0")){
			return MS_MSBDL0040_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Sprt02.DOWN.BLOCK0")){
			return MS_MSBDL0040_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Chk01.UP.BLOCK0")){
			return MS_MSBDL0040_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Chk01.UP.BLOCK1")){
			return MS_MSBDL0040_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Chk01.DOWN.BLOCK0")){
			return MS_MSBDL0040_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Chk01.DOWN.BLOCK1")){
			return MS_MSBDL0040_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Chk02.UP.BLOCK0")){
			return MS_MSBDL0040_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Chk02.UP.BLOCK1")){
			return MS_MSBDL0040_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Chk02.DOWN.BLOCK0")){
			return MS_MSBDL0040_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Chk02.DOWN.BLOCK1")){
			return MS_MSBDL0040_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Ins01.UP.BLOCK0")){
			return MS_MSBDL0040_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Ins01.UP.BLOCK1")){
			return MS_MSBDL0040_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0040.Ins01.DOWN.BLOCK0")){
			return MS_MSBDL0040_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Del01.UP.BLOCK0")){
			return MS_MSBDL0040_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0040.Del01.UP.BLOCK1")){
			return MS_MSBDL0040_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBDL0040_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sppl_purc_upri_cng_flg", "sppl_purc_upri_cng_flg"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_usr_nm", "rqst_fr_usr_nm"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_dpt_nm", "rqst_fr_dpt_nm"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
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
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0040", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_usr_nm", "rqst_fr_usr_nm"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_dpt_nm", "rqst_fr_dpt_nm"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch02_Rslt1")
		);
	}
	public static MCContainerDef MS_MSBDL0040_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_usr_nm", "rqst_fr_usr_nm"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_dpt_nm", "rqst_fr_dpt_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch02_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Sprt01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Sprt02_INFO = new MCOperationInfo("MS", "MSBDL0040", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Chk01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("po_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("po_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("po_schd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("po_schd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("po_schd" + ".bd_itm_sub3", "bd_itm_sub3")
			}
			,
			MCBlockDef.create("Chk01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("split_src_schd_no", "split_src_schd_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0040_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("po_schd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po_schd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("po_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("po_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("po_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("po_schd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("po_schd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("po_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("po_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("po_schd" + ".sno1", "sno1"),
				MCItemDef.create("po_schd" + ".sno2", "sno2"),
				MCItemDef.create("po_schd" + ".sno3", "sno3"),
				MCItemDef.create("po_schd" + ".sno4", "sno4"),
				MCItemDef.create("po_schd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("po_schd" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("po_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("po_schd" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("po_schd" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("po_schd" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("po_schd" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("po_schd" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("po_schd" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("po_schd" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("po_schd" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("po_schd" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("po_schd" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("po_schd" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("po_schd" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("po_schd" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("po_schd" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("po_schd" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("po_schd" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("po_schd" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("po_schd" + ".reg_dt", "reg_dt"),
				MCItemDef.create("po_schd" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_schd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_schd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("po_schd" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("po_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("po_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_crt_flg", "outsrc_itm_ord_crt_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_schd" + ".pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("po_schd" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("po_schd" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("po_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("po_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("po_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("po_schd" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("po_schd" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("po_schd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("po_schd" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".xrate", "xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("po_schd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("po_schd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("po_schd" + ".dlv_rqst_tm", "dlv_rqst_dt"),
				MCItemDef.create("po_schd" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_dt"),
				MCItemDef.create("po_schd" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("po_schd" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("po_schd" + ".purc_lt", "purc_lt"),
				MCItemDef.create("po_schd" + ".drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("po_schd" + ".po_schd_chg_typ", "po_schd_chg_typ"),
				MCItemDef.create("po_schd" + ".rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("po_schd" + ".rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("po_schd" + ".split_src_schd_no", "split_src_schd_no"),
				MCItemDef.create("po_schd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("po_schd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("po_schd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("po_schd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("po_schd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("po_schd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("po_schd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("po_schd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("po_schd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("po_schd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("po_schd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("po_schd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("po_schd" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("po_schd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("po_schd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("po_schd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("po_schd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("po_schd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("po_schd" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("po_schd" + ".org_flg", "org_flg"),
				MCItemDef.create("po_schd" + ".can_flg", "can_flg"),
				MCItemDef.create("po_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("po_schd" + ".add_flg", "add_flg"),
				MCItemDef.create("po_schd" + ".base_unit_po_qty", "base_unit_po_qty"),
				MCItemDef.create("po_schd" + ".po_flg", "po_flg"),
				MCItemDef.create("po_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_schd" + ".po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd" + ".slo_no", "slo_no"),
				MCItemDef.create("po_schd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("po_schd" + ".po_no", "po_no"),
				MCItemDef.create("po_schd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("po_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("po_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("po_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("po_schd" + ".rqst_can_flg", "rqst_can_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Chk02_INFO = new MCOperationInfo("MS", "MSBDL0040", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Chk02_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Chk02_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0040_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("split_src_schd_no", "split_src_schd_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Ins01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("po_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("po_schd" + ".reg_dt", "reg_dt"),
				MCItemDef.create("po_schd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_schd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po_schd" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("po_schd" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("po_schd" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("po_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("po_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("po_schd" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("po_schd" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("po_schd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("po_schd" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".xrate", "xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("po_schd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("po_schd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("po_schd" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("po_schd" + ".dlv_rqst_tm", "dlv_rqst_dt"),
				MCItemDef.create("po_schd" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("po_schd" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("po_schd" + ".rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("po_schd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("po_schd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("po_schd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("po_schd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("po_schd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("po_schd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("po_schd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("po_schd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("po_schd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("po_schd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("po_schd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("po_schd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("po_schd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("po_schd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("po_schd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("po_schd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("po_schd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("po_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_schd" + ".po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd" + ".rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("po_schd" + ".rqst_fr_dpt_cd", "rqst_fr_dpt_cd")
			}
			,
			MCBlockDef.create("Ins01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Del01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

