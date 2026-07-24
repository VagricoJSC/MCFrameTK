package mcframe.serverMSBE.MSBEL5550;

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
 * [MSBEL_ShipRprtPrntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd01.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd01.UP.BLOCK1")){
			return MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd01.UP.BLOCK2")){
			return MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd02.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd03.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Upd03.DOWN.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Del01.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt01.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt01.UP.BLOCK1")){
			return MS_MSBEL5550_ShipRprt_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt02.UP.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt02.UP.BLOCK1")){
			return MS_MSBEL5550_ShipRprt_Prnt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5550.ShipRprt_Prnt02.DOWN.BLOCK0")){
			return MS_MSBEL5550_ShipRprt_Prnt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("r_inst_no", "r_inst_no"),
				MCItemDef.create("split_flg", "split_flg"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("ds" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ds" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ds" + ".slo_no", "slo_no"),
				MCItemDef.create("ds" + ".trn_typ", "trn_typ"),
				MCItemDef.create("ds" + ".dlv_slip_inst_no", "dlv_slip_inst_no"),
				MCItemDef.create("ds" + ".dlv_slip_act_no", "dlv_slip_act_no"),
				MCItemDef.create("ds" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("ds" + ".usr_cd", "usr_cd"),
				MCItemDef.create("ds" + ".ship_tm", "ship_tm"),
				MCItemDef.create("ds" + ".dlv_tm", "dlv_tm"),
				MCItemDef.create("ds" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ds" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ds" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("ds" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("ds" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ds" + ".xrate", "xrate"),
				MCItemDef.create("ds" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ds" + ".bp_cd", "bp_cd"),
				MCItemDef.create("ds" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("ds" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("ds" + ".dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("ds" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("ds" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("ds" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("ds" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("ds" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("ds" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("ds" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("ds" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("ds" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("ds" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("ds" + ".xfr_loc_cd", "xfr_loc_cd"),
				MCItemDef.create("ds" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ds" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ds" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("ds" + ".sync_flg", "sync_flg"),
				MCItemDef.create("ds" + ".adjst_slip_flg", "adjst_slip_flg"),
				MCItemDef.create("ds" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ds" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ds" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ds" + ".ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ds" + ".sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("cststk_ship_flg", "cststk_ship_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_uniq_no", "dtl_uniq_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dsd" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dsd" + ".dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("dsd" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dsd" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dsd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dsd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dsd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dsd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dsd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dsd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dsd" + ".sno1", "sno1"),
				MCItemDef.create("dsd" + ".sno2", "sno2"),
				MCItemDef.create("dsd" + ".sno3", "sno3"),
				MCItemDef.create("dsd" + ".sno4", "sno4"),
				MCItemDef.create("dsd" + ".lot_no", "lot_no"),
				MCItemDef.create("dsd" + ".lot_plural_flg", "lot_plural_flg"),
				MCItemDef.create("dsd" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dsd" + ".sublot_plural_flg", "sublot_plural_flg"),
				MCItemDef.create("dsd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("dsd" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("dsd" + ".gd_cd", "gd_cd"),
				MCItemDef.create("dsd" + ".quality_typ", "quality_typ"),
				MCItemDef.create("dsd" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("dsd" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("dsd" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dsd" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("dsd" + ".fix_no", "fix_no"),
				MCItemDef.create("dsd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dsd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dsd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dsd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dsd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("dsd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dsd" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dsd" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("dsd" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("dsd" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("dsd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("dsd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("dsd" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("dsd" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("dsd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("dsd" + ".prov_typ", "prov_typ"),
				MCItemDef.create("dsd" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("dsd" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("dsd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("dsd" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dsd" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dsd" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dsd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("dsd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dsd" + ".io_typ", "io_typ"),
				MCItemDef.create("dsd" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("dsd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dsd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dsd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dsd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("dsd" + ".ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("dsd" + ".ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_uniq_no", "dtl_uniq_no"),
				MCItemDef.create("upded_flg", "upded_flg"),
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg"),
				MCItemDef.create("dsd" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dsd" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dsd" + ".dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev")
			}
			,
			MCBlockDef.create("ShipRprt_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd02",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("trn_typ", "trn_typ"),
				MCItemDef.create("dlv_slip_inst_no", "dlv_slip_inst_no"),
				MCItemDef.create("dlv_slip_act_no", "dlv_slip_act_no"),
				MCItemDef.create("dlv_slip_act_no_upd_flg", "dlv_slip_act_no_upd_flg"),
				MCItemDef.create("slip_prnt_flg", "slip_prnt_flg"),
				MCItemDef.create("slip_prnt_upd_flg", "slip_prnt_upd_flg"),
				MCItemDef.create("sls_prnt_flg", "sls_prnt_flg"),
				MCItemDef.create("sls_prnt_upd_flg", "sls_prnt_upd_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Upd02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Upd03_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL5550_ShipRprt_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Upd03",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev")
			}
			,
			MCBlockDef.create("ShipRprt_Upd03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Del01_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Del01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("ShipRprt_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("trn_typ", "trn_typ"),
				MCItemDef.create("dlv_slip_act_no", "dlv_slip_act_no"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("sls_prnt_flg", "sls_prnt_flg"),
				MCItemDef.create("inc_can_flg", "inc_can_flg"),
				MCItemDef.create("onr_prov_flg", "onr_prov_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("enf_pri_prnt_flg", "enf_pri_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("enf_pri_prnt_flg", "enf_pri_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5550_ShipRprt_Prnt02_INFO = new MCOperationInfo("MS", "MSBEL5550", "ShipRprt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("trn_typ", "trn_typ"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("bndl_inst_prnt_flg", "bndl_inst_prnt_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5550_ShipRprt_Prnt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5550", "ShipRprt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipRprt_Prnt02_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

