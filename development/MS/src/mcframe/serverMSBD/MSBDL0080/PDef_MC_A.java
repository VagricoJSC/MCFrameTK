package mcframe.serverMSBD.MSBDL0080;

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
 * [MSBDL_PoReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0080.Srch01.UP.BLOCK0")){
			return MS_MSBDL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0080_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Srch01.DOWN.BLOCK1")){
			return MS_MSBDL0080_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Srch01.DOWN.BLOCK2")){
			return MS_MSBDL0080_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Srch02.UP.BLOCK0")){
			return MS_MSBDL0080_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Srch02.DOWN.BLOCK0")){
			return MS_MSBDL0080_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Srch02.DOWN.BLOCK1")){
			return MS_MSBDL0080_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Srch02.DOWN.BLOCK2")){
			return MS_MSBDL0080_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Sprt02.UP.BLOCK0")){
			return MS_MSBDL0080_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt02.UP.BLOCK1")){
			return MS_MSBDL0080_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Sprt02.DOWN.BLOCK0")){
			return MS_MSBDL0080_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt03.UP.BLOCK0")){
			return MS_MSBDL0080_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt03.DOWN.BLOCK0")){
			return MS_MSBDL0080_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt04.UP.BLOCK0")){
			return MS_MSBDL0080_Sprt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt04.UP.BLOCK1")){
			return MS_MSBDL0080_Sprt04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Sprt04.DOWN.BLOCK0")){
			return MS_MSBDL0080_Sprt04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Sprt04.DOWN.BLOCK1")){
			return MS_MSBDL0080_Sprt04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.UP.BLOCK0")){
			return MS_MSBDL0080_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.UP.BLOCK1")){
			return MS_MSBDL0080_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.UP.BLOCK2")){
			return MS_MSBDL0080_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.DOWN.BLOCK0")){
			return MS_MSBDL0080_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.DOWN.BLOCK1")){
			return MS_MSBDL0080_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk01.DOWN.BLOCK2")){
			return MS_MSBDL0080_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.UP.BLOCK0")){
			return MS_MSBDL0080_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.UP.BLOCK1")){
			return MS_MSBDL0080_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.UP.BLOCK2")){
			return MS_MSBDL0080_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.DOWN.BLOCK0")){
			return MS_MSBDL0080_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.DOWN.BLOCK1")){
			return MS_MSBDL0080_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk02.DOWN.BLOCK2")){
			return MS_MSBDL0080_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.UP.BLOCK0")){
			return MS_MSBDL0080_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.UP.BLOCK1")){
			return MS_MSBDL0080_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.UP.BLOCK2")){
			return MS_MSBDL0080_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.DOWN.BLOCK0")){
			return MS_MSBDL0080_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.DOWN.BLOCK1")){
			return MS_MSBDL0080_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Chk03.DOWN.BLOCK2")){
			return MS_MSBDL0080_Chk03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Ins01.UP.BLOCK0")){
			return MS_MSBDL0080_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Ins01.UP.BLOCK1")){
			return MS_MSBDL0080_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Ins01.UP.BLOCK2")){
			return MS_MSBDL0080_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Ins01.DOWN.BLOCK0")){
			return MS_MSBDL0080_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Ins01.DOWN.BLOCK1")){
			return MS_MSBDL0080_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Upd01.UP.BLOCK0")){
			return MS_MSBDL0080_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Upd01.UP.BLOCK1")){
			return MS_MSBDL0080_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Upd01.UP.BLOCK2")){
			return MS_MSBDL0080_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0080_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Upd01.DOWN.BLOCK1")){
			return MS_MSBDL0080_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Del01.UP.BLOCK0")){
			return MS_MSBDL0080_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Del01.UP.BLOCK1")){
			return MS_MSBDL0080_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0080.Del01.UP.BLOCK2")){
			return MS_MSBDL0080_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL0080.Prnt01.UP.BLOCK0")){
			return MS_MSBDL0080_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0080.Prnt01.UP.BLOCK1")){
			return MS_MSBDL0080_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBDL0080_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("rev_no", "rev_no"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
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
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("sppl_purc_upri_cng_flg", "sppl_purc_upri_cng_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("sppl_pay_crryovr_times", "sppl_pay_crryovr_times"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("po_print_dt", "po_print_dt"),
				MCItemDef.create("po_print_flg", "po_print_flg"),
				MCItemDef.create("dlv_print_flg", "dlv_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_print_flg", "purc_ddlv_dlv_print_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("crct_rsn_nm", "crct_rsn_nm"),
				MCItemDef.create("crct_rsn_rmrks", "crct_rsn_rmrks"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_print_nm", "po_print_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
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
				MCItemDef.create("edi_tgt_flg", "edi_tgt_flg"),
				MCItemDef.create("last_edi_flg", "last_edi_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("purc_if_flg", "purc_if_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_po_no", "ext_po_no"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("next_opr_flg", "next_opr_flg"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("can_flg", "can_flg")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("itm_pay_crryovr_times", "itm_pay_crryovr_times"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("purc_dlv_slip_flg", "purc_dlv_slip_flg"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_loc_zip_cd", "in_to_loc_zip_cd"),
				MCItemDef.create("in_to_loc_addr1", "in_to_loc_addr1"),
				MCItemDef.create("in_to_loc_addr2", "in_to_loc_addr2"),
				MCItemDef.create("in_to_loc_addr3", "in_to_loc_addr3"),
				MCItemDef.create("in_to_loc_addr4", "in_to_loc_addr4"),
				MCItemDef.create("in_to_loc_tel", "in_to_loc_tel"),
				MCItemDef.create("in_to_loc_fax", "in_to_loc_fax"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("bef_in_to_loc_wg_cd", "bef_in_to_loc_wg_cd"),
				MCItemDef.create("bef_lg_grp_cd", "bef_lg_grp_cd"),
				MCItemDef.create("bef_loc_grp_cd", "bef_loc_grp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_invalid_flg", "dlv_slip_invalid_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
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
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("ext_po_d_no", "ext_po_d_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("rqst_slo_flg", "rqst_slo_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("mfg_inst_flg", "mfg_inst_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("bef_abort_flg", "bef_abort_flg"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("purc_qty", "purc_qty"),
				MCItemDef.create("dlv_inst_prms_rcpt_qty", "dlv_inst_prms_rcpt_qty"),
				MCItemDef.create("dlv_inst_qty", "dlv_inst_qty"),
				MCItemDef.create("rcpt_iv_qty", "rcpt_iv_qty"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_typ_nm", "po_schd_src_typ_nm"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_usr_nm", "rqst_fr_usr_nm"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_dpt_nm", "rqst_fr_dpt_nm"),
				MCItemDef.create("purc_sts_typ", "purc_sts_typ"),
				MCItemDef.create("purc_sts_typ_nm", "purc_sts_typ_nm"),
				MCItemDef.create("arr_schd_split_flg", "arr_schd_split_flg"),
				MCItemDef.create("arr_flg", "arr_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("rcpt_iv_flg", "rcpt_iv_flg"),
				MCItemDef.create("po_schd_flg", "po_schd_flg"),
				MCItemDef.create("arr_rem_abort_flg", "arr_rem_abort_flg"),
				MCItemDef.create("purc_rem_abort_flg", "purc_rem_abort_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Srch02_INFO = new MCOperationInfo("MS", "MSBDL0080", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
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
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("mst_ap_dpt_cd", "mst_ap_dpt_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("sppl_purc_upri_cng_flg", "sppl_purc_upri_cng_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("sppl_pay_crryovr_times", "sppl_pay_crryovr_times"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_print_nm", "po_print_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("edi_tgt_flg", "edi_tgt_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("itm_pay_crryovr_times", "itm_pay_crryovr_times"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("arr_skip_flg", "arr_skip_flg"),
				MCItemDef.create("purc_dlv_slip_flg", "purc_dlv_slip_flg"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("xpns_purc_flg", "xpns_purc_flg"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("in_to_loc_zip_cd", "in_to_loc_zip_cd"),
				MCItemDef.create("in_to_loc_addr1", "in_to_loc_addr1"),
				MCItemDef.create("in_to_loc_addr2", "in_to_loc_addr2"),
				MCItemDef.create("in_to_loc_addr3", "in_to_loc_addr3"),
				MCItemDef.create("in_to_loc_addr4", "in_to_loc_addr4"),
				MCItemDef.create("in_to_loc_tel", "in_to_loc_tel"),
				MCItemDef.create("in_to_loc_fax", "in_to_loc_fax"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_wg_nm", "in_to_loc_wg_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("bef_in_to_loc_wg_cd", "bef_in_to_loc_wg_cd"),
				MCItemDef.create("bef_lg_grp_cd", "bef_lg_grp_cd"),
				MCItemDef.create("bef_loc_grp_cd", "bef_loc_grp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
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
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("drct_dlv_typ_nm", "drct_dlv_typ_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_slip_invalid_flg", "dlv_slip_invalid_flg"),
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
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("mfg_inst_flg", "mfg_inst_flg"),
				MCItemDef.create("po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_typ_nm", "po_schd_src_typ_nm"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("rqst_fr_usr_nm", "rqst_fr_usr_nm"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_dpt_nm", "rqst_fr_dpt_nm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_schd_flg", "po_schd_flg"),
				MCItemDef.create("rqst_slo_flg", "rqst_slo_flg")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Sprt02_INFO = new MCOperationInfo("MS", "MSBDL0080", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("Sprt02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt02",
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
	
	static final MCOperationInfo MS_MSBDL0080_Sprt03_INFO = new MCOperationInfo("MS", "MSBDL0080", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("Sprt03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
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
				MCItemDef.create("tdlv_fax", "tdlv_fax")
			}
			,
			MCBlockDef.create("Sprt03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Sprt04_INFO = new MCOperationInfo("MS", "MSBDL0080", "Sprt04", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Sprt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_chg_flg", "sppl_chg_flg")
			}
			,
			MCBlockDef.create("Sprt04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Sprt04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("in_to_loc_wg_cd", "in_to_loc_wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_flg", "outsrc_flg")
			}
			,
			MCBlockDef.create("Sprt04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Sprt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("edi_tgt_flg", "edi_tgt_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd")
			}
			,
			MCBlockDef.create("Sprt04_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Sprt04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Sprt04",
			new MCItemDef[]{
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_id_typ", "purc_id_typ")
			}
			,
			MCBlockDef.create("Sprt04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Chk01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_rem_abort_flg", "arr_rem_abort_flg"),
				MCItemDef.create("purc_rem_abort_flg", "purc_rem_abort_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
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
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sppl_purc_upri_cng_flg", "sppl_purc_upri_cng_flg"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("po_print_flg", "po_print_flg"),
				MCItemDef.create("last_po_rev", "last_po_rev"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
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
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("arr_rem_abort_flg", "arr_rem_abort_flg"),
				MCItemDef.create("purc_rem_abort_flg", "purc_rem_abort_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("mfg_inst_flg", "mfg_inst_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Chk02_INFO = new MCOperationInfo("MS", "MSBDL0080", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
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
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("sppl_purc_upri_cng_flg", "sppl_purc_upri_cng_flg"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("po_print_flg", "po_print_flg"),
				MCItemDef.create("last_po_rev", "last_po_rev"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("itm_purc_upri_cng_flg", "itm_purc_upri_cng_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
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
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("bef_abort_flg", "bef_abort_flg"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("mfg_inst_flg", "mfg_inst_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Chk03_INFO = new MCOperationInfo("MS", "MSBDL0080", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("bndl_flg", "bndl_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Chk03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Ins01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
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
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("arr_rem_abort_flg", "arr_rem_abort_flg"),
				MCItemDef.create("purc_rem_abort_flg", "purc_rem_abort_flg")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL0080_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL0080_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Del01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_upd_cntr", "po_upd_cntr"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_upd_cntr", "po_schd_upd_cntr"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0080_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL0080", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0080_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL0080_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0080", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_slip_invalid_flg", "dlv_slip_invalid_flg")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

