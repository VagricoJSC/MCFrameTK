package mcframe.serverMSBD.MSBDL0120;

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
 * [MSBDL_PurcDlvDtAdjstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0120.Srch01.UP.BLOCK0")){
			return MS_MSBDL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK1")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK2")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK3")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK4")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK5")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK6")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK7")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MS.MSBDL0120.Srch01.DOWN.BLOCK8")){
			return MS_MSBDL0120_Srch01_DOWN_BLOCK8();
		}
		else if (id.equals("MS.MSBDL0120.Srch02.UP.BLOCK0")){
			return MS_MSBDL0120_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0120_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk01.UP.BLOCK0")){
			return MS_MSBDL0120_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk01.UP.BLOCK1")){
			return MS_MSBDL0120_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Chk01.DOWN.BLOCK0")){
			return MS_MSBDL0120_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk01.DOWN.BLOCK1")){
			return MS_MSBDL0120_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Upd01.UP.BLOCK0")){
			return MS_MSBDL0120_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd01.UP.BLOCK1")){
			return MS_MSBDL0120_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Upd01.UP.BLOCK2")){
			return MS_MSBDL0120_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0120.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0120_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd01.DOWN.BLOCK1")){
			return MS_MSBDL0120_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Chk02.UP.BLOCK0")){
			return MS_MSBDL0120_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk02.UP.BLOCK1")){
			return MS_MSBDL0120_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Chk02.DOWN.BLOCK0")){
			return MS_MSBDL0120_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk02.DOWN.BLOCK1")){
			return MS_MSBDL0120_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Chk05.UP.BLOCK0")){
			return MS_MSBDL0120_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Chk05.DOWN.BLOCK0")){
			return MS_MSBDL0120_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd02.UP.BLOCK0")){
			return MS_MSBDL0120_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd02.UP.BLOCK1")){
			return MS_MSBDL0120_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Upd02.UP.BLOCK2")){
			return MS_MSBDL0120_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0120.Upd02.DOWN.BLOCK0")){
			return MS_MSBDL0120_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd02.DOWN.BLOCK1")){
			return MS_MSBDL0120_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Upd05.UP.BLOCK0")){
			return MS_MSBDL0120_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Upd05.UP.BLOCK1")){
			return MS_MSBDL0120_Upd05_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Upd05.DOWN.BLOCK0")){
			return MS_MSBDL0120_Upd05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Prnt01.UP.BLOCK0")){
			return MS_MSBDL0120_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0120.Prnt01.UP.BLOCK1")){
			return MS_MSBDL0120_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0120.Prnt01.UP.BLOCK2")){
			return MS_MSBDL0120_Prnt01_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBDL0120_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_dpt_wg_nm", "purc_dpt_wg_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("prms_recv_flg", "prms_recv_flg"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("purc_if_flg", "purc_if_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_po_no", "ext_po_no"),
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
			MCBlockDef.create("Srch01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_str_ln_tgt_flg", "in_to_str_ln_tgt_flg"),
				MCItemDef.create("in_to_loc_zip_cd", "in_to_loc_zip_cd"),
				MCItemDef.create("in_to_loc_addr1", "in_to_loc_addr1"),
				MCItemDef.create("in_to_loc_addr2", "in_to_loc_addr2"),
				MCItemDef.create("in_to_loc_addr3", "in_to_loc_addr3"),
				MCItemDef.create("in_to_loc_addr4", "in_to_loc_addr4"),
				MCItemDef.create("in_to_loc_tel", "in_to_loc_tel"),
				MCItemDef.create("in_to_loc_fax", "in_to_loc_fax"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("in_to_loc_lg_grp_cd", "in_to_loc_lg_grp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_qty", "dlv_inst_qty"),
				MCItemDef.create("dlv_inst_prms_rcpt_dt", "dlv_inst_prms_rcpt_dt"),
				MCItemDef.create("dlv_inst_prms_refl_dt", "dlv_inst_prms_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("prms_refl_dt", "prms_refl_dt"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_rcpt_qty", "prms_rcpt_qty"),
				MCItemDef.create("prms_refl_qty", "prms_refl_qty"),
				MCItemDef.create("dlv_inst_prms_rcpt_qty", "dlv_inst_prms_rcpt_qty"),
				MCItemDef.create("dlv_inst_prms_refl_qty", "dlv_inst_prms_refl_qty"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ext_po_d_no", "ext_po_d_no"),
				MCItemDef.create("edi_dlv_inst_flg", "edi_dlv_inst_flg"),
				MCItemDef.create("edi_tgt_flg", "edi_tgt_flg"),
				MCItemDef.create("dlv_inst_ext_sys_typ", "dlv_inst_ext_sys_typ"),
				MCItemDef.create("pri_print_flg", "pri_print_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl2")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("arr_abort_flg", "arr_abort_flg"),
				MCItemDef.create("purc_abort_flg", "purc_abort_flg"),
				MCItemDef.create("arr_pr_abort_flg", "arr_pr_abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_loc_nm", "arr_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("arr_schd_hm", "arr_schd_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("arr_schd_qty", "arr_schd_qty"),
				MCItemDef.create("purc_schd_qty", "purc_schd_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_conv_base_qty", "schd_unit_conv_base_qty"),
				MCItemDef.create("schd_unit_conv_qty", "schd_unit_conv_qty"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("schd_unit_rnd_typ", "schd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_purc_schd_qty", "base_unit_purc_schd_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
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
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl3")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_dt", "arr_dt"),
				MCItemDef.create("arr_hm", "arr_hm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_loc_nm", "arr_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("ship_fr_valid_dt", "ship_fr_valid_dt"),
				MCItemDef.create("arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_usr_nm", "arr_usr_nm"),
				MCItemDef.create("arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_dpt_nm", "arr_dpt_nm"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
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
			MCBlockDef.create("Srch01_Dtl4")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_loc_nm", "arr_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("re_arr_flg", "re_arr_flg"),
				MCItemDef.create("trd_unit_re_arr_qty", "trd_unit_re_arr_qty"),
				MCItemDef.create("re_arr_loc_cd", "re_arr_loc_cd"),
				MCItemDef.create("re_arr_loc_nm", "re_arr_loc_nm"),
				MCItemDef.create("re_arr_str_ln_cd", "re_arr_str_ln_cd"),
				MCItemDef.create("re_arr_str_ln_nm", "re_arr_str_ln_nm"),
				MCItemDef.create("re_arr_rqst_dt", "re_arr_rqst_dt"),
				MCItemDef.create("re_arr_rqst_hm", "re_arr_rqst_hm"),
				MCItemDef.create("re_arr_purc_schd_dt", "re_arr_purc_schd_dt"),
				MCItemDef.create("re_arr_sync_flg", "re_arr_sync_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
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
			MCBlockDef.create("Srch01_Dtl5")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_print_dt", "dlv_inst_print_dt"),
				MCItemDef.create("dlv_inst_print_rmrks", "dlv_inst_print_rmrks"),
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Dtl6")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_str_ln_tgt_flg", "in_to_str_ln_tgt_flg"),
				MCItemDef.create("in_to_str_ln_cd", "in_to_str_ln_cd"),
				MCItemDef.create("in_to_str_ln_nm", "in_to_str_ln_nm"),
				MCItemDef.create("in_to_str_ln_cd_none_flg", "in_to_str_ln_cd_none_flg"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("dlv_inst_print_d_rmrks", "dlv_inst_print_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("inst_dlv_cd", "inst_dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_req_flg", "tdlv_req_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_lg_grp_nm", "tdlv_lg_grp_nm"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Dtl7")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK7() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("can_flg", "can_flg"),
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
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Dtl8")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Srch01_DOWN_BLOCK8() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("act_abort_qty", "act_abort_qty"),
				MCItemDef.create("purc_act_qty", "purc_act_qty"),
				MCItemDef.create("purc_abort_qty", "purc_abort_qty"),
				MCItemDef.create("accpt_dfct_qty", "accpt_dfct_qty"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("rcpt_iv_cmpl_flg", "rcpt_iv_cmpl_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl9")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0120", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_req_flg", "tdlv_req_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_lg_grp_nm", "tdlv_lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Chk01_INFO = new MCOperationInfo("MS", "MSBDL0120", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("crnt_edi_dlv_inst_flg", "crnt_edi_dlv_inst_flg"),
				MCItemDef.create("dlv_inst_ext_sys_typ", "dlv_inst_ext_sys_typ"),
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_inst_print_rmrks", "dlv_inst_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dlv_rqst_loc_cd", "dlv_rqst_loc_cd"),
				MCItemDef.create("dlv_rqst_str_ln_cd", "dlv_rqst_str_ln_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dlv_inst_print_d_rmrks", "dlv_inst_print_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0120", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("crnt_edi_dlv_inst_flg", "crnt_edi_dlv_inst_flg"),
				MCItemDef.create("dlv_inst_ext_sys_typ", "dlv_inst_ext_sys_typ"),
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_inst_print_rmrks", "dlv_inst_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dlv_rqst_loc_cd", "dlv_rqst_loc_cd"),
				MCItemDef.create("dlv_rqst_str_ln_cd", "dlv_rqst_str_ln_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dlv_inst_print_d_rmrks", "dlv_inst_print_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Chk02_INFO = new MCOperationInfo("MS", "MSBDL0120", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Chk05_INFO = new MCOperationInfo("MS", "MSBDL0120", "Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("arr_abort_flg", "arr_abort_flg"),
				MCItemDef.create("purc_abort_flg", "purc_abort_flg"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("bp_lot_no", "bp_lot_no")
			}
			,
			MCBlockDef.create("Chk05_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Upd02_INFO = new MCOperationInfo("MS", "MSBDL0120", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0120_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Upd05_INFO = new MCOperationInfo("MS", "MSBDL0120", "Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd05",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("arr_abort_flg", "arr_abort_flg"),
				MCItemDef.create("purc_abort_flg", "purc_abort_flg"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("bp_lot_no", "bp_lot_no")
			}
			,
			MCBlockDef.create("Upd05_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Upd05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd05",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd05_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBDL0120_Upd05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Upd05",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Upd05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0120_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL0120", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0120_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0120_Prnt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq")
			}
			,
			MCBlockDef.create("Prnt01_Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

