package mcframe.serverMSBE.MSBEL5740;

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
 * [MSBEL_RcptIvRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk01.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk01.UP.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk01.UP.BLOCK2")){
			return MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.UP.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.UP.BLOCK2")){
			return MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.DOWN.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Ins01.DOWN.BLOCK2")){
			return MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.UP.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.UP.BLOCK2")){
			return MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd01.DOWN.BLOCK2")){
			return MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk02.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Upd02.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Del01.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Del01.UP.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Del01.DOWN.BLOCK0")){
			return MS_MSBEL5740_RcptIv_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_Del01.DOWN.BLOCK1")){
			return MS_MSBEL5740_RcptIv_Del01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5740.RcptIv_RevUpd01.UP.BLOCK0")){
			return MS_MSBEL5740_RcptIv_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("iv" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("iv" + ".rcpt_iv_src_typ", "rcpt_iv_src_typ"),
				MCItemDef.create("iv" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("iv" + ".purc_dt", "purc_dt"),
				MCItemDef.create("iv" + ".iv_dt", "iv_dt"),
				MCItemDef.create("iv" + ".purc_ac_schd_dt", "purc_ac_schd_dt"),
				MCItemDef.create("iv" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("iv" + ".in_to_id_typ", "in_to_id_typ"),
				MCItemDef.create("iv" + ".in_to_id_cd", "in_to_id_cd"),
				MCItemDef.create("iv" + ".in_to_id_nm", "in_to_id_nm"),
				MCItemDef.create("iv" + ".in_to_zip_cd", "in_to_zip_cd"),
				MCItemDef.create("iv" + ".in_to_addr1", "in_to_addr1"),
				MCItemDef.create("iv" + ".in_to_addr2", "in_to_addr2"),
				MCItemDef.create("iv" + ".in_to_addr3", "in_to_addr3"),
				MCItemDef.create("iv" + ".in_to_addr4", "in_to_addr4"),
				MCItemDef.create("iv" + ".in_to_cntct_dpt", "in_to_cntct_dpt"),
				MCItemDef.create("iv" + ".in_to_cntct_psn", "in_to_cntct_psn"),
				MCItemDef.create("iv" + ".in_to_tel", "in_to_tel"),
				MCItemDef.create("iv" + ".in_to_fax", "in_to_fax"),
				MCItemDef.create("iv" + ".in_to_cntry_cd", "in_to_cntry_cd"),
				MCItemDef.create("iv" + ".in_to_sundry_flg", "in_to_sundry_flg"),
				MCItemDef.create("iv" + ".trnspt_cd", "trnspt_cd"),
				MCItemDef.create("iv" + ".vssl_flght", "vssl_flght"),
				MCItemDef.create("iv" + ".load_port_cd", "load_port_cd"),
				MCItemDef.create("iv" + ".etd_dt", "etd_dt"),
				MCItemDef.create("iv" + ".dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("iv" + ".eta_dt", "eta_dt"),
				MCItemDef.create("iv" + ".via_port_cd", "via_port_cd"),
				MCItemDef.create("iv" + ".via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("iv" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("iv" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("iv" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("iv" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("iv" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("iv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("iv" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("iv" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("iv" + ".xrate", "xrate"),
				MCItemDef.create("iv" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("iv" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("iv" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("iv" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("iv" + ".purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("iv" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("iv" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("iv" + ".sub_char1", "sub_char1"),
				MCItemDef.create("iv" + ".sub_char2", "sub_char2"),
				MCItemDef.create("iv" + ".sub_char3", "sub_char3"),
				MCItemDef.create("iv" + ".rcpt_iv_rmrks", "rcpt_iv_rmrks"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("RcptIv_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("ivd" + ".po_no", "po_no"),
				MCItemDef.create("ivd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("ivd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ivd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ivd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ivd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ivd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ivd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ivd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ivd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ivd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ivd" + ".sno1", "sno1"),
				MCItemDef.create("ivd" + ".sno2", "sno2"),
				MCItemDef.create("ivd" + ".sno3", "sno3"),
				MCItemDef.create("ivd" + ".sno4", "sno4"),
				MCItemDef.create("ivd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("ivd" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("ivd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ivd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("ivd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ivd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ivd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ivd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ivd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("ivd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ivd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("ivd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ivd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("ivd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("ivd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("ivd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ivd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ivd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ivd" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("ivd" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ivd" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ivd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ivd" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ivd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("ivd" + ".manual_add_flg", "manual_add_flg"),
				MCItemDef.create("ivd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ivd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ivd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("ivd" + ".slo_no", "slo_no"),
				MCItemDef.create("ivd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("ivd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("ivd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("ivd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("ivd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("ivd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("ivd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("ivd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("ivd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("ivd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("ivd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("ivd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("ivd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("ivd" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("ivd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("ivd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("ivd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("ivd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("ivd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("ivd" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("ivd" + ".ref_prms_rcpt_d_no", "ref_prms_rcpt_d_no"),
				MCItemDef.create("ivd" + ".ref_dlv_inst_d_no", "ref_dlv_inst_d_no"),
				MCItemDef.create("ivd" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("ivd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ivd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ivd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ivd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_rmrks", "rcpt_iv_d_rmrks"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sync_flg", "sync_flg")
			}
			,
			MCBlockDef.create("RcptIv_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivmap" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivmap" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("ivmap" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("ivmap" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd")
			}
			,
			MCBlockDef.create("RcptIv_Chk01_Map")
		);
	}


	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcptIv_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm")
			}
			,
			MCBlockDef.create("RcptIv_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("iv" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("iv" + ".rcpt_iv_src_typ", "rcpt_iv_src_typ"),
				MCItemDef.create("iv" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("iv" + ".purc_dt", "purc_dt"),
				MCItemDef.create("iv" + ".iv_dt", "iv_dt"),
				MCItemDef.create("iv" + ".purc_ac_schd_dt", "purc_ac_schd_dt"),
				MCItemDef.create("iv" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("iv" + ".in_to_id_typ", "in_to_id_typ"),
				MCItemDef.create("iv" + ".in_to_id_cd", "in_to_id_cd"),
				MCItemDef.create("iv" + ".in_to_id_nm", "in_to_id_nm"),
				MCItemDef.create("iv" + ".in_to_zip_cd", "in_to_zip_cd"),
				MCItemDef.create("iv" + ".in_to_addr1", "in_to_addr1"),
				MCItemDef.create("iv" + ".in_to_addr2", "in_to_addr2"),
				MCItemDef.create("iv" + ".in_to_addr3", "in_to_addr3"),
				MCItemDef.create("iv" + ".in_to_addr4", "in_to_addr4"),
				MCItemDef.create("iv" + ".in_to_cntct_dpt", "in_to_cntct_dpt"),
				MCItemDef.create("iv" + ".in_to_cntct_psn", "in_to_cntct_psn"),
				MCItemDef.create("iv" + ".in_to_tel", "in_to_tel"),
				MCItemDef.create("iv" + ".in_to_fax", "in_to_fax"),
				MCItemDef.create("iv" + ".in_to_cntry_cd", "in_to_cntry_cd"),
				MCItemDef.create("iv" + ".in_to_sundry_flg", "in_to_sundry_flg"),
				MCItemDef.create("iv" + ".trnspt_cd", "trnspt_cd"),
				MCItemDef.create("iv" + ".vssl_flght", "vssl_flght"),
				MCItemDef.create("iv" + ".load_port_cd", "load_port_cd"),
				MCItemDef.create("iv" + ".etd_dt", "etd_dt"),
				MCItemDef.create("iv" + ".dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("iv" + ".eta_dt", "eta_dt"),
				MCItemDef.create("iv" + ".via_port_cd", "via_port_cd"),
				MCItemDef.create("iv" + ".via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("iv" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("iv" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("iv" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("iv" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("iv" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("iv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("iv" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("iv" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("iv" + ".xrate", "xrate"),
				MCItemDef.create("iv" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("iv" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("iv" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("iv" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("iv" + ".purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("iv" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("iv" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("iv" + ".sub_char1", "sub_char1"),
				MCItemDef.create("iv" + ".sub_char2", "sub_char2"),
				MCItemDef.create("iv" + ".sub_char3", "sub_char3"),
				MCItemDef.create("iv" + ".rcpt_iv_rmrks", "rcpt_iv_rmrks"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ivd" + ".po_no", "po_no"),
				MCItemDef.create("ivd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("ivd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ivd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ivd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ivd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ivd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ivd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ivd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ivd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ivd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ivd" + ".sno1", "sno1"),
				MCItemDef.create("ivd" + ".sno2", "sno2"),
				MCItemDef.create("ivd" + ".sno3", "sno3"),
				MCItemDef.create("ivd" + ".sno4", "sno4"),
				MCItemDef.create("ivd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("ivd" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("ivd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ivd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("ivd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ivd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ivd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ivd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ivd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("ivd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ivd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ivd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ivd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("ivd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("ivd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("ivd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ivd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ivd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ivd" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("ivd" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ivd" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ivd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ivd" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ivd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("ivd" + ".manual_add_flg", "manual_add_flg"),
				MCItemDef.create("ivd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ivd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ivd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("ivd" + ".slo_no", "slo_no"),
				MCItemDef.create("ivd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("ivd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("ivd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("ivd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("ivd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("ivd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("ivd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("ivd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("ivd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("ivd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("ivd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("ivd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("ivd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("ivd" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("ivd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("ivd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("ivd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("ivd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("ivd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("ivd" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("ivd" + ".ref_prms_rcpt_d_no", "ref_prms_rcpt_d_no"),
				MCItemDef.create("ivd" + ".ref_dlv_inst_d_no", "ref_dlv_inst_d_no"),
				MCItemDef.create("ivd" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("ivd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ivd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ivd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ivd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_rmrks", "rcpt_iv_d_rmrks"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sync_flg", "sync_flg")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivmap" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivmap" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("ivmap" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("ivmap" + ".trd_unit_qty", "trd_unit_qty")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Map")
		);
	}


	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_rev", "rcpt_iv_rev")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("ivd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ivd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ivd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ivd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcptIv_Ins01_Map")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("iv" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("iv" + ".rcpt_iv_src_typ", "rcpt_iv_src_typ"),
				MCItemDef.create("iv" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("iv" + ".purc_dt", "purc_dt"),
				MCItemDef.create("iv" + ".iv_dt", "iv_dt"),
				MCItemDef.create("iv" + ".purc_ac_schd_dt", "purc_ac_schd_dt"),
				MCItemDef.create("iv" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("iv" + ".in_to_id_typ", "in_to_id_typ"),
				MCItemDef.create("iv" + ".in_to_id_cd", "in_to_id_cd"),
				MCItemDef.create("iv" + ".in_to_id_nm", "in_to_id_nm"),
				MCItemDef.create("iv" + ".in_to_zip_cd", "in_to_zip_cd"),
				MCItemDef.create("iv" + ".in_to_addr1", "in_to_addr1"),
				MCItemDef.create("iv" + ".in_to_addr2", "in_to_addr2"),
				MCItemDef.create("iv" + ".in_to_addr3", "in_to_addr3"),
				MCItemDef.create("iv" + ".in_to_addr4", "in_to_addr4"),
				MCItemDef.create("iv" + ".in_to_cntct_dpt", "in_to_cntct_dpt"),
				MCItemDef.create("iv" + ".in_to_cntct_psn", "in_to_cntct_psn"),
				MCItemDef.create("iv" + ".in_to_tel", "in_to_tel"),
				MCItemDef.create("iv" + ".in_to_fax", "in_to_fax"),
				MCItemDef.create("iv" + ".in_to_cntry_cd", "in_to_cntry_cd"),
				MCItemDef.create("iv" + ".in_to_sundry_flg", "in_to_sundry_flg"),
				MCItemDef.create("iv" + ".trnspt_cd", "trnspt_cd"),
				MCItemDef.create("iv" + ".vssl_flght", "vssl_flght"),
				MCItemDef.create("iv" + ".load_port_cd", "load_port_cd"),
				MCItemDef.create("iv" + ".etd_dt", "etd_dt"),
				MCItemDef.create("iv" + ".dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("iv" + ".eta_dt", "eta_dt"),
				MCItemDef.create("iv" + ".via_port_cd", "via_port_cd"),
				MCItemDef.create("iv" + ".via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("iv" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("iv" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("iv" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("iv" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("iv" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("iv" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("iv" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("iv" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("iv" + ".xrate", "xrate"),
				MCItemDef.create("iv" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("iv" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("iv" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("iv" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("iv" + ".purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("iv" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("iv" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("iv" + ".sub_char1", "sub_char1"),
				MCItemDef.create("iv" + ".sub_char2", "sub_char2"),
				MCItemDef.create("iv" + ".sub_char3", "sub_char3"),
				MCItemDef.create("iv" + ".rcpt_iv_rmrks", "rcpt_iv_rmrks"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("ivd" + ".po_no", "po_no"),
				MCItemDef.create("ivd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("ivd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ivd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ivd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ivd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ivd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ivd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ivd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ivd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ivd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("ivd" + ".sno1", "sno1"),
				MCItemDef.create("ivd" + ".sno2", "sno2"),
				MCItemDef.create("ivd" + ".sno3", "sno3"),
				MCItemDef.create("ivd" + ".sno4", "sno4"),
				MCItemDef.create("ivd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("ivd" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("ivd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ivd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("ivd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ivd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ivd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ivd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ivd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("ivd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ivd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ivd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ivd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("ivd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("ivd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("ivd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ivd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("ivd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ivd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ivd" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("ivd" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ivd" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("ivd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ivd" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ivd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("ivd" + ".manual_add_flg", "manual_add_flg"),
				MCItemDef.create("ivd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ivd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ivd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("ivd" + ".slo_no", "slo_no"),
				MCItemDef.create("ivd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("ivd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("ivd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("ivd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("ivd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("ivd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("ivd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("ivd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("ivd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("ivd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("ivd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("ivd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("ivd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("ivd" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("ivd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("ivd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("ivd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("ivd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("ivd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("ivd" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("ivd" + ".ref_prms_rcpt_d_no", "ref_prms_rcpt_d_no"),
				MCItemDef.create("ivd" + ".ref_dlv_inst_d_no", "ref_dlv_inst_d_no"),
				MCItemDef.create("ivd" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("ivd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ivd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ivd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ivd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_rmrks", "rcpt_iv_d_rmrks"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivmap" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivmap" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("ivmap" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("ivmap" + ".trd_unit_qty", "trd_unit_qty")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Map")
		);
	}


	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_rev", "rcpt_iv_rev")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_rev", "rcpt_iv_rev"),
				MCItemDef.create("ivd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ivd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ivd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ivd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcptIv_Upd01_Map")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivmap" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ivmap" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("ivmap" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ivmap" + ".base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("RcptIv_Chk02_Map")
		);
	}


	public static MCContainerDef MS_MSBEL5740_RcptIv_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcptIv_Chk02_Map")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ivmap" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ivmap" + ".arr_act_no", "arr_act_no"),
				MCItemDef.create("ivmap" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ivmap" + ".base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("RcptIv_Upd02_Map")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_Del01_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv" + ".rcpt_iv_rev", "rcpt_iv_rev")
			}
			,
			MCBlockDef.create("RcptIv_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5740_RcptIv_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ivd" + ".rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ivd" + ".rcpt_iv_rev", "rcpt_iv_rev")
			}
			,
			MCBlockDef.create("RcptIv_Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5740_RcptIv_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcptIv_Del01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5740_RcptIv_Del01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("RcptIv_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5740_RcptIv_RevUpd01_INFO = new MCOperationInfo("MS", "MSBEL5740", "RcptIv_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5740_RcptIv_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5740", "RcptIv_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("RcptIv_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

