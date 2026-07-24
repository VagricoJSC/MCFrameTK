package mcframe.clientMSBD.MSBDP0040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PoSchdSplitReg]の入出力情報となる電文（上り・下り電文）と
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
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
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
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("inst_cont_qty_p" + ".cont_qty", "cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("std_cont_p" + ".std_cont_fctr", "std_cont_fctr"),
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
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".ymd", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
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
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
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
			MCBlockDef.create("Dtl1")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0040", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt1] に対する電文項目定義 */
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
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("inst_cont_qty_p" + ".cont_qty", "cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".ymd", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
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
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0040_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_Rslt2] に対する電文項目定義 */
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
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("inst_cont_qty_p" + ".cont_qty", "cont_qty"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".ymd", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_tm_p" + ".hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.IGNORE_ITEM("purc_dpt_wg_cd"),
				MCItemDef.IGNORE_ITEM("purc_dpt_wg_nm"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
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
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Sprt01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
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
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Sprt02_INFO = new MCOperationInfo("MS", "MSBDL0040", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Sprt02_UP_BLOCK0() {
		/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Sprt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Ins01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.IGNORE_ITEM("po_schd.base_unit_qty"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("bditm_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bditm_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bditm_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bditm_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bditm_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bditm_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bditm_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bditm_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bditm_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bditm_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bditm_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bditm_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bditm_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bditm_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bditm_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0040_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0040_Del01_INFO = new MCOperationInfo("MS", "MSBDL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0040_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0040_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

