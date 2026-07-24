package mcframe.serverMSLA.MSLAL5120;

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
 * [MSLAL_SloRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL5120_SloRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.UP.BLOCK1")){
			return MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.UP.BLOCK2")){
			return MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.DOWN.BLOCK3")){
			return MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSLAL5120.SloRecvIf_Chk01.DOWN.BLOCK4")){
			return MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL5120_SloRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5120", "SloRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5120_SloRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5120", "SloRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5120_SloRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL5120", "SloRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("slo" + ".data_lno", "data_lno"),
				MCItemDef.create("slo" + ".data_no", "data_no"),
				MCItemDef.create("slo" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("slo" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("slo" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("slo" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("slo" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5120_SloRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL5120", "SloRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("slo" + ".data_lno", "data_lno"),
				MCItemDef.create("slo" + ".data_no", "data_no"),
				MCItemDef.create("slo" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("slo" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("slo" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("slo" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("slo" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("slo" + ".data_lno", "data_lno"),
				MCItemDef.create("slo" + ".data_no", "data_no"),
				MCItemDef.create("slo" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("SloRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5120_SloRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL5120", "SloRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("slo" + ".data_lno", "data_lno"),
				MCItemDef.create("slo" + ".data_no", "data_no"),
				MCItemDef.create("slo" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("slo" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("slo" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("slo" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("slo" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("slo" + ".imp_flg", "imp_flg"),
				MCItemDef.create("slo" + ".recv_dt", "recv_dt"),
				MCItemDef.create("slo" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("slo" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("slo" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("slo" + ".cst_cd", "cst_cd"),
				MCItemDef.create("slo" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("slo" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("slo" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("slo" + ".po_dt", "po_dt"),
				MCItemDef.create("slo" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("slo" + ".sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("slo" + ".slo_typ", "slo_typ"),
				MCItemDef.create("slo" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("slo" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("slo" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("slo" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("slo" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("slo" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("slo" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("slo" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("slo" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("slo" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("slo" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("slo" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("slo" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("slo" + ".dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("slo" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("slo" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("slo" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("slo" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("slo" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("slo" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("slo" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("slo" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("slo" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("slo" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("slo" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("slo" + ".tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("slo" + ".dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("slo" + ".pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("slo" + ".wrk_no", "wrk_no"),
				MCItemDef.create("slo" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("slo" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("slo" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("slo" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("slo" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("slo" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("slo" + ".trnspt_cd", "trnspt_cd"),
				MCItemDef.create("slo" + ".load_port_cd", "load_port_cd"),
				MCItemDef.create("slo" + ".dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("slo" + ".via_port_cd", "via_port_cd"),
				MCItemDef.create("slo" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("slo" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("slo" + ".itm_cd", "itm_cd"),
				MCItemDef.create("slo" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("slo" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("slo" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("slo" + ".itm_nm", "itm_nm"),
				MCItemDef.create("slo" + ".cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("slo" + ".sno1", "sno1"),
				MCItemDef.create("slo" + ".sno2", "sno2"),
				MCItemDef.create("slo" + ".sno3", "sno3"),
				MCItemDef.create("slo" + ".sno4", "sno4"),
				MCItemDef.create("slo" + ".gd_cd", "gd_cd"),
				MCItemDef.create("slo" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("slo" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("slo" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("slo" + ".interim_flg", "interim_flg"),
				MCItemDef.create("slo" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("slo" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("slo" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("slo" + ".tax_rate", "tax_rate"),
				MCItemDef.create("slo" + ".tax_typ", "tax_typ"),
				MCItemDef.create("slo" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("slo" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("slo" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("slo" + ".ship_wh_cd", "ship_wh_cd"),
				MCItemDef.create("slo" + ".ship_block_flg", "ship_block_flg"),
				MCItemDef.create("slo" + ".abort_flg", "abort_flg"),
				MCItemDef.create("slo" + ".set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("slo" + ".ver_no", "ver_no"),
				MCItemDef.create("slo" + ".lot_no", "lot_no"),
				MCItemDef.create("slo" + ".sublot_no", "sublot_no"),
				MCItemDef.create("slo" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("slo" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("slo" + ".maker_cd", "maker_cd"),
				MCItemDef.create("slo" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("slo" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo" + ".cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("slo" + ".cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("slo" + ".upri_not_chk_flg", "upri_not_chk_flg"),
				MCItemDef.create("slo" + ".amt_not_chk_flg", "amt_not_chk_flg"),
				MCItemDef.create("slo" + ".tax_not_chk_flg", "tax_not_chk_flg"),
				MCItemDef.create("slo" + ".edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("slo" + ".edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("slo" + ".edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("slo" + ".edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("slo" + ".edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("slo" + ".edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("slo" + ".edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("slo" + ".edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("slo" + ".edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("slo" + ".edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("slo" + ".edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("slo" + ".edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("slo" + ".edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("slo" + ".edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("slo" + ".data_lno", "data_lno"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
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
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("org_ship_block_flg", "org_ship_block_flg"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("rem_abort_qty", "rem_abort_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Del01_Hdr")
		);
	}
	public static MCContainerDef MS_MSLAL5120_SloRecvIf_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSLAL5120", "SloRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("SloRecvIf_Chk01_Slo_Del01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

