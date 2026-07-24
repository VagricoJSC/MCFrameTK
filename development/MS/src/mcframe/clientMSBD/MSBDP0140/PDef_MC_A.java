package mcframe.clientMSBD.MSBDP0140;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PurcReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0140.Srch01.UP.BLOCK0")){
			return MS_MSBDL0140_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0140_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Srch01.DOWN.BLOCK1")){
			return MS_MSBDL0140_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Srch01.DOWN.BLOCK2")){
			return MS_MSBDL0140_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Srch02.UP.BLOCK0")){
			return MS_MSBDL0140_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0140_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Srch02.DOWN.BLOCK1")){
			return MS_MSBDL0140_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Srch02.DOWN.BLOCK2")){
			return MS_MSBDL0140_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Sprt01.UP.BLOCK0")){
			return MS_MSBDL0140_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Sprt01.UP.BLOCK1")){
			return MS_MSBDL0140_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Sprt01.DOWN.BLOCK0")){
			return MS_MSBDL0140_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.UP.BLOCK0")){
			return MS_MSBDL0140_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.UP.BLOCK1")){
			return MS_MSBDL0140_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.UP.BLOCK2")){
			return MS_MSBDL0140_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.DOWN.BLOCK0")){
			return MS_MSBDL0140_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.DOWN.BLOCK1")){
			return MS_MSBDL0140_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Ins01.DOWN.BLOCK2")){
			return MS_MSBDL0140_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.UP.BLOCK0")){
			return MS_MSBDL0140_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.UP.BLOCK1")){
			return MS_MSBDL0140_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.UP.BLOCK2")){
			return MS_MSBDL0140_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0140_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.DOWN.BLOCK1")){
			return MS_MSBDL0140_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Upd01.DOWN.BLOCK2")){
			return MS_MSBDL0140_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0140.Del01.UP.BLOCK0")){
			return MS_MSBDL0140_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0140.Del01.UP.BLOCK1")){
			return MS_MSBDL0140_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0140.Del01.UP.BLOCK2")){
			return MS_MSBDL0140_Del01_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBDL0140_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0140", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "po_no"),
				MCItemDef.create("purc_schd_dt_to", "purc_schd_dt_to")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0140_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sppl_addr_p" + ".cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_addr_p" + ".cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_addr_p" + ".tel", "sppl_tel"),
				MCItemDef.create("sppl_addr_p" + ".fax", "sppl_fax"),
				MCItemDef.create("sppl_addr_p" + ".cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_addr_p" + ".cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("purc_slip_each_lot_typ", "purc_slip_each_lot_typ"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("src_trd_cur_cd", "src_trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
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
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("schd_sync_flg", "schd_sync_flg"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd"),
				MCItemDef.create("src_trd_unit_conv_qty", "src_trd_unit_conv_qty"),
				MCItemDef.create("src_trd_unit_conv_base_qty", "src_trd_unit_conv_base_qty"),
				MCItemDef.create("src_trd_unit_dec_place", "src_trd_unit_dec_place"),
				MCItemDef.create("src_trd_unit_rnd_typ", "src_trd_unit_rnd_typ"),
				MCItemDef.create("src_trd_unit_qty", "src_trd_unit_qty"),
				MCItemDef.create("src_base_unit_qty", "src_base_unit_qty"),
				MCItemDef.create("src_trd_cur_upri", "src_trd_cur_upri"),
				MCItemDef.create("src_trd_cur_proc_upri", "src_trd_cur_proc_upri"),
				MCItemDef.create("src_trd_cur_onr_prov_upri", "src_trd_cur_onr_prov_upri"),
				MCItemDef.create("src_trd_cur_dscnt_amt", "src_trd_cur_dscnt_amt"),
				MCItemDef.create("src_trd_cur_amt", "src_trd_cur_amt"),
				MCItemDef.create("src_trd_cur_proc_amt", "src_trd_cur_proc_amt"),
				MCItemDef.create("src_trd_cur_onr_prov_amt", "src_trd_cur_onr_prov_amt"),
				MCItemDef.create("src_trd_cur_tax_amt", "src_trd_cur_tax_amt"),
				MCItemDef.create("src_wtax_rate", "src_wtax_rate"),
				MCItemDef.create("src_tax_rate", "src_tax_rate"),
				MCItemDef.create("src_inc_tax_flg", "src_inc_tax_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("purc_schd_qty", "base_unit_schd_qty"),
				MCItemDef.create("base_unit_qty_bf_cng", "base_unit_qty_bf_cng"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("purc_qty", "base_unit_purc_qty"),
				MCItemDef.create("arr_qty", "base_unit_arr_qty"),
				MCItemDef.create("accpt_dfct_qty", "base_unit_accpt_dfct_qty"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("re_arr_loc_nm", "re_arr_loc_nm"),
				MCItemDef.create("re_arr_loc_wg_cd", "re_arr_loc_wg_cd"),
				MCItemDef.create("re_arr_loc_wg_nm", "re_arr_loc_wg_nm"),
				MCItemDef.create("re_arr_str_ln_tgt_flg", "re_arr_str_ln_tgt_flg"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_nm", "re_arr_str_ln_nm"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd_none_flg", "re_arr_str_ln_cd_none_flg"),
				MCItemDef.create("re_arr_loc_site_cd", "re_arr_loc_site_cd"),
				MCItemDef.create("re_arr_loc_cal_cd", "re_arr_loc_cal_cd"),
				MCItemDef.create("re_arr_loc_sppl_cd", "re_arr_loc_sppl_cd"),
				MCItemDef.create("re_arr_loc_sppl_cal_cd", "re_arr_loc_sppl_cal_cd"),
				MCItemDef.create("trd_unit_re_arr_qty_p" + ".qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("re_arr_rqst_tm_p" + ".ymd", "re_arr_rqst_dt"),
				MCItemDef.create("re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_wg_nm", "dlv_loc_wg_nm"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("dlv_loc_nm", "dlv_loc_nm"),
				MCItemDef.create("dlv_loc_sppl_cd", "dlv_loc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("scst_cal_cd", "scst_cal_cd"),
				MCItemDef.create("dlv_p" + ".bp_cd", "scst_cd"),
				MCItemDef.create("dlv_p" + ".bp_nm", "scst_nm"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "scst_sundry_flg"),
				MCItemDef.create("dlv_p" + ".zip_cd", "scst_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "scst_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "scst_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "scst_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "scst_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "scst_tel"),
				MCItemDef.create("dlv_p" + ".fax", "scst_fax"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "scst_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "scst_cntry_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "scst_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "scst_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_p" + ".cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("bp_lot_flg", "bp_lot_flg"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "trd_cur_wtax_amt"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("purc_cont_fctr_p" + ".purc_cont_fctr", "purc_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.IGNORE_ITEM("sls_sync_flg"),
				MCItemDef.create("purc_act_qty", "base_unit_purc_act_qty")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_wg_nm", "dlv_loc_wg_nm"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("dlv_loc_nm", "dlv_loc_nm"),
				MCItemDef.create("dlv_loc_sppl_cd", "dlv_loc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("purc_cont_fctr_p" + ".purc_cont_fctr", "purc_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0140_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0140", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_no", "purc_act_no"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("newest_flg", "newest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0140_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sppl_addr_p" + ".cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_addr_p" + ".cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_addr_p" + ".tel", "sppl_tel"),
				MCItemDef.create("sppl_addr_p" + ".fax", "sppl_fax"),
				MCItemDef.create("sppl_addr_p" + ".cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_addr_p" + ".cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
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
				MCItemDef.create("purc_act_upd_cntr", "purc_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd"),
				MCItemDef.create("src_trd_unit_conv_qty", "src_trd_unit_conv_qty"),
				MCItemDef.create("src_trd_unit_conv_base_qty", "src_trd_unit_conv_base_qty"),
				MCItemDef.create("src_trd_unit_dec_place", "src_trd_unit_dec_place"),
				MCItemDef.create("src_trd_unit_rnd_typ", "src_trd_unit_rnd_typ"),
				MCItemDef.create("src_trd_unit_qty", "src_trd_unit_qty"),
				MCItemDef.create("src_base_unit_qty", "src_base_unit_qty"),
				MCItemDef.create("src_trd_cur_upri", "src_trd_cur_upri"),
				MCItemDef.create("src_trd_cur_proc_upri", "src_trd_cur_proc_upri"),
				MCItemDef.create("src_trd_cur_onr_prov_upri", "src_trd_cur_onr_prov_upri"),
				MCItemDef.create("src_trd_cur_dscnt_amt", "src_trd_cur_dscnt_amt"),
				MCItemDef.create("src_trd_cur_amt", "src_trd_cur_amt"),
				MCItemDef.create("src_trd_cur_proc_amt", "src_trd_cur_proc_amt"),
				MCItemDef.create("src_trd_cur_onr_prov_amt", "src_trd_cur_onr_prov_amt"),
				MCItemDef.create("src_trd_cur_tax_amt", "src_trd_cur_tax_amt"),
				MCItemDef.create("src_wtax_rate", "src_wtax_rate"),
				MCItemDef.create("src_tax_rate", "src_tax_rate"),
				MCItemDef.create("src_inc_tax_flg", "src_inc_tax_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("purc_schd_qty", "base_unit_schd_qty"),
				MCItemDef.create("base_unit_qty_bf_cng", "base_unit_qty_bf_cng"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("purc_qty", "base_unit_purc_qty"),
				MCItemDef.create("arr_qty", "base_unit_arr_qty"),
				MCItemDef.create("accpt_dfct_qty", "base_unit_accpt_dfct_qty"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("re_arr_loc_nm", "re_arr_loc_nm"),
				MCItemDef.create("re_arr_loc_wg_cd", "re_arr_loc_wg_cd"),
				MCItemDef.create("re_arr_loc_wg_nm", "re_arr_loc_wg_nm"),
				MCItemDef.create("re_arr_str_ln_tgt_flg", "re_arr_str_ln_tgt_flg"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_nm", "re_arr_str_ln_nm"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd_none_flg", "re_arr_str_ln_cd_none_flg"),
				MCItemDef.create("re_arr_loc_site_cd", "re_arr_loc_site_cd"),
				MCItemDef.create("re_arr_loc_cal_cd", "re_arr_loc_cal_cd"),
				MCItemDef.create("re_arr_loc_sppl_cd", "re_arr_loc_sppl_cd"),
				MCItemDef.create("re_arr_loc_sppl_cal_cd", "re_arr_loc_sppl_cal_cd"),
				MCItemDef.create("trd_unit_re_arr_qty_p" + ".qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("re_arr_rqst_tm_p" + ".ymd", "re_arr_rqst_dt"),
				MCItemDef.create("re_arr_rqst_tm_p" + ".hm", "re_arr_rqst_hm"),
				MCItemDef.create("re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_wg_nm", "dlv_loc_wg_nm"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("dlv_loc_nm", "dlv_loc_nm"),
				MCItemDef.create("dlv_loc_sppl_cd", "dlv_loc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("scst_cal_cd", "scst_cal_cd"),
				MCItemDef.create("dlv_p" + ".bp_cd", "scst_cd"),
				MCItemDef.create("dlv_p" + ".bp_nm", "scst_nm"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "scst_sundry_flg"),
				MCItemDef.create("dlv_p" + ".zip_cd", "scst_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "scst_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "scst_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "scst_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "scst_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "scst_tel"),
				MCItemDef.create("dlv_p" + ".fax", "scst_fax"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "scst_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "scst_cntry_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "scst_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "scst_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_p" + ".cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("bp_lot_flg", "bp_lot_flg"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("purc_dtl_upd_flg", "purc_dtl_upd_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "trd_cur_wtax_amt"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_p" + ".bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_p" + ".bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_p" + ".bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_p" + ".bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("purc_cont_fctr_p" + ".purc_cont_fctr", "purc_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("sls_sync_flg", "sls_sync_flg"),
				MCItemDef.create("purc_act_qty", "base_unit_purc_act_qty")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_wg_nm", "dlv_loc_wg_nm"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("dlv_loc_nm", "dlv_loc_nm"),
				MCItemDef.create("dlv_loc_sppl_cd", "dlv_loc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("purc_cont_fctr_p" + ".purc_cont_fctr", "purc_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_sync_flg", "sls_sync_flg")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0140_Sprt01_INFO = new MCOperationInfo("MS", "MSBDL0140", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_base_dt", "purc_dt")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Sprt01_UP_BLOCK1() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("upri_trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dlv_loc_wg_cd", "dlv_loc_wg_cd"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("src_base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_p" + ".bp_cd", "scst_cd"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("src_trd_unit_cd", "src_trd_unit_cd")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}


	public static MCContainerDef MS_MSBDL0140_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0140_Ins01_INFO = new MCOperationInfo("MS", "MSBDL0140", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("trd_unit_re_arr_qty_p" + ".qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("re_arr_rqst_tm_p" + ".ymd", "re_arr_rqst_tm"),
				MCItemDef.create("re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "trd_cur_wtax_amt"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("tmp_quality_typ", "tmp_quality_typ"),
				MCItemDef.create("tmp_gd_cd", "tmp_gd_cd")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("lot_no_p" + ".crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tmp_quality_typ", "tmp_quality_typ"),
				MCItemDef.create("tmp_stk_insp_typ", "tmp_stk_insp_typ"),
				MCItemDef.create("tmp_stk_id_typ", "tmp_stk_id_typ")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0140_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_dpt_nm", "bd_dpt_nm")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Ins01_DOWN_BLOCK2() {
	/** Ope.のBlock [Ins01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0140_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0140", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_dt", "ptax_dt"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("purc_act_upd_cntr", "purc_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_ptn_typ", "arr_ptn_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("re_arr_str_ln_p" + ".str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("trd_unit_re_arr_qty_p" + ".qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("re_arr_rqst_tm_p" + ".ymd", "re_arr_rqst_tm"),
				MCItemDef.create("re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_cur_upri_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri_p" + ".upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri_p" + ".upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_upri_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt_p" + ".amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt_p" + ".amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_upri_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_proc_upri_p" + ".upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri_p" + ".upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_proc_amt_p" + ".amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt_p" + ".amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_proc_upri_p" + ".upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri_p" + ".upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt_p" + ".amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_proc_amt_p" + ".amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt_p" + ".amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "trd_cur_wtax_amt"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_p" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_p" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_p" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_p" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_p" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_p" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_p" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_p" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_p" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_p" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_p" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_p" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_p" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_p" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_p" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("from_gd_cd", "from_gd_cd"),
				MCItemDef.create("gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_unit_cd", "gi_unit_cd"),
				MCItemDef.create("dlv_loc_cd", "dlv_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("lot_no_p" + ".crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("purc_cont_qty_p" + ".purc_cont_qty", "purc_cont_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0140_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_dpt_p" + ".dpt_nm", "purc_dpt_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("bd_p" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_p" + ".bd_dpt_nm", "bd_dpt_nm")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0140_Upd01_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0140_Del01_INFO = new MCOperationInfo("MS", "MSBDL0140", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0140_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("purc_act_upd_cntr", "purc_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBDL0140_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_Io] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0140", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("purc_act_io_seq", "purc_act_io_seq"),
				MCItemDef.create("arr_act_no", "arr_act_no")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

