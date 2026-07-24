package mcframe.serverMSLA.MSLAL6020;

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
 * [MSLAL_ShipActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL6020_ShipActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd03.UP.BLOCK1")){
			return MS_MSLAL6020_ShipActRecvIf_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd04.UP.BLOCK1")){
			return MS_MSLAL6020_ShipActRecvIf_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.UP.BLOCK1")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.DOWN.BLOCK3")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSLAL6020.ShipActRecvIf_Chk01.DOWN.BLOCK4")){
			return MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL6020_ShipActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6020", "ShipActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6020_ShipActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL6020", "ShipActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6020_ShipActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL6020", "ShipActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".data_lno", "data_lno"),
				MCItemDef.create("sa" + ".data_no", "data_no"),
				MCItemDef.create("sa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("sa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("sa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("sa" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("sa" + ".ship_inst_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd03_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6020_ShipActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL6020", "ShipActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".data_lno", "data_lno"),
				MCItemDef.create("sa" + ".data_no", "data_no"),
				MCItemDef.create("sa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("sa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("sa" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("sa" + ".ship_inst_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd04_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".data_lno", "data_lno"),
				MCItemDef.create("sa" + ".data_no", "data_no"),
				MCItemDef.create("sa" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6020_ShipActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL6020", "ShipActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".data_lno", "data_lno"),
				MCItemDef.create("sa" + ".data_no", "data_no"),
				MCItemDef.create("sa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("sa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("sa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("sa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("sa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("sa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("sa" + ".ship_inst_no", "ship_inst_no"),
				MCItemDef.create("sa" + ".ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("sa" + ".site_co_cd", "site_co_cd"),
				MCItemDef.create("sa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("sa" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sa" + ".ship_tm", "ship_tm"),
				MCItemDef.create("sa" + ".dlv_tm", "dlv_tm"),
				MCItemDef.create("sa" + ".cst_cd", "cst_cd"),
				MCItemDef.create("sa" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("sa" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("sa" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("sa" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("sa" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("sa" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("sa" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("sa" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("sa" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("sa" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("sa" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("sa" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("sa" + ".dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("sa" + ".dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("sa" + ".dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("sa" + ".dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("sa" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("sa" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("sa" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("sa" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("sa" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("sa" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("sa" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("sa" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("sa" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("sa" + ".pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("sa" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("sa" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("sa" + ".ship_dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("sa" + ".ship_usr_cd", "ship_usr_cd"),
				MCItemDef.create("sa" + ".ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("sa" + ".ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("sa" + ".iv_no", "iv_no"),
				MCItemDef.create("sa" + ".iv_d_no", "iv_d_no"),
				MCItemDef.create("sa" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("sa" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("sa" + ".ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("sa" + ".ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("sa" + ".ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("sa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("sa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("sa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("sa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sa" + ".if_itm_nm", "if_itm_nm"),
				MCItemDef.create("sa" + ".lot_no", "lot_no"),
				MCItemDef.create("sa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("sa" + ".sno1", "sno1"),
				MCItemDef.create("sa" + ".sno2", "sno2"),
				MCItemDef.create("sa" + ".sno3", "sno3"),
				MCItemDef.create("sa" + ".sno4", "sno4"),
				MCItemDef.create("sa" + ".ent_unit_qty", "ent_unit_qty"),
				MCItemDef.create("sa" + ".ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("sa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("sa" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("sa" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sa" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("sa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("sa" + ".quality_typ", "quality_typ"),
				MCItemDef.create("sa" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("sa" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sa" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("sa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sa" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("sa" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("sa" + ".cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("sa" + ".cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("sa" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("sa" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("sa" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("sa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sa" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sa" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("sa" + ".intr_d_rmrks", "intr_d_rmrks")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("sa" + ".data_lno", "data_lno"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("bndl_prnt_flg", "bndl_prnt_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Ctrl_Rslt")
		);
	}
	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ship_tm", "ship_tm"),
				MCItemDef.create("dlv_tm", "dlv_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("ship_usr_cd", "ship_usr_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_tel", "ship_to_tel"),
				MCItemDef.create("ship_to_fax", "ship_to_fax"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("ship_act_upd_cntr", "ship_act_upd_cntr")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Hdr_Rslt")
		);
	}
	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("arr_cnt_rmrks_upd_flg", "arr_cnt_rmrks_upd_flg"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Dtl_Rslt")
		);
	}
	public static MCContainerDef MS_MSLAL6020_ShipActRecvIf_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSLAL6020", "ShipActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no")
			}
			,
			MCBlockDef.create("ShipActRecvIf_Chk01_Cntr_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

