package mcframe.serverMSLA.MSLAL5140;

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
 * [MSLAL_DlvInstRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL5140_DlvInstRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5140.DlvInstRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL5140_DlvInstRecvIf_Chk01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL5140_DlvInstRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5140", "DlvInstRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5140_DlvInstRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5140", "DlvInstRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5140_DlvInstRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL5140", "DlvInstRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("dlvInst" + ".data_lno", "data_lno"),
				MCItemDef.create("dlvInst" + ".data_no", "data_no"),
				MCItemDef.create("dlvInst" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("dlvInst" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("dlvInst" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("dlvInst" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("dlvInst" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlvInst" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5140_DlvInstRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL5140", "DlvInstRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("dlvInst" + ".data_lno", "data_lno"),
				MCItemDef.create("dlvInst" + ".data_no", "data_no"),
				MCItemDef.create("dlvInst" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("dlvInst" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("dlvInst" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("dlvInst" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("dlvInst" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlvInst" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("dlvInst" + ".data_lno", "data_lno"),
				MCItemDef.create("dlvInst" + ".data_no", "data_no"),
				MCItemDef.create("dlvInst" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5140_DlvInstRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL5140", "DlvInstRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dlvInst" + ".data_lno", "data_lno"),
				MCItemDef.create("dlvInst" + ".data_no", "data_no"),
				MCItemDef.create("dlvInst" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dlvInst" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("dlvInst" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("dlvInst" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("dlvInst" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("dlvInst" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("dlvInst" + ".imp_flg", "imp_flg"),
				MCItemDef.create("dlvInst" + ".recv_dt", "recv_dt"),
				MCItemDef.create("dlvInst" + ".cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("dlvInst" + ".cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("dlvInst" + ".cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("dlvInst" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("dlvInst" + ".cst_po_rev", "cst_po_rev"),
				MCItemDef.create("dlvInst" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlvInst" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dlvInst" + ".dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlvInst" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dlvInst" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("dlvInst" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlvInst" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlvInst" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlvInst" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlvInst" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlvInst" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlvInst" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlvInst" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("dlvInst" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("dlvInst" + ".dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlvInst" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("dlvInst" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("dlvInst" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("dlvInst" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("dlvInst" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("dlvInst" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("dlvInst" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("dlvInst" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("dlvInst" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("dlvInst" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("dlvInst" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("dlvInst" + ".tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("dlvInst" + ".dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlvInst" + ".pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("dlvInst" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("dlvInst" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dlvInst" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dlvInst" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dlvInst" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dlvInst" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dlvInst" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dlvInst" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("dlvInst" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("dlvInst" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("dlvInst" + ".cst_dlv_inst_rmrks", "cst_dlv_inst_rmrks"),
				MCItemDef.create("dlvInst" + ".cst_dlv_inst_d_rmrks", "cst_dlv_inst_d_rmrks"),
				MCItemDef.create("dlvInst" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dlvInst" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dlvInst" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dlvInst" + ".sub_char4", "sub_char4"),
				MCItemDef.create("dlvInst" + ".sub_char5", "sub_char5"),
				MCItemDef.create("dlvInst" + ".sub_char6", "sub_char6"),
				MCItemDef.create("dlvInst" + ".sub_char7", "sub_char7"),
				MCItemDef.create("dlvInst" + ".sub_char8", "sub_char8"),
				MCItemDef.create("dlvInst" + ".sub_char9", "sub_char9"),
				MCItemDef.create("dlvInst" + ".sub_char10", "sub_char10"),
				MCItemDef.create("dlvInst" + ".sub_char11", "sub_char11"),
				MCItemDef.create("dlvInst" + ".sub_char12", "sub_char12"),
				MCItemDef.create("dlvInst" + ".sub_char13", "sub_char13"),
				MCItemDef.create("dlvInst" + ".sub_char14", "sub_char14"),
				MCItemDef.create("dlvInst" + ".sub_char15", "sub_char15"),
				MCItemDef.create("dlvInst" + ".sub_char16", "sub_char16"),
				MCItemDef.create("dlvInst" + ".sub_char17", "sub_char17"),
				MCItemDef.create("dlvInst" + ".sub_char18", "sub_char18"),
				MCItemDef.create("dlvInst" + ".sub_char19", "sub_char19"),
				MCItemDef.create("dlvInst" + ".sub_char20", "sub_char20"),
				MCItemDef.create("dlvInst" + ".sub_char21", "sub_char21"),
				MCItemDef.create("dlvInst" + ".sub_char22", "sub_char22"),
				MCItemDef.create("dlvInst" + ".sub_char23", "sub_char23"),
				MCItemDef.create("dlvInst" + ".sub_char24", "sub_char24"),
				MCItemDef.create("dlvInst" + ".sub_char25", "sub_char25"),
				MCItemDef.create("dlvInst" + ".sub_char26", "sub_char26"),
				MCItemDef.create("dlvInst" + ".sub_char27", "sub_char27"),
				MCItemDef.create("dlvInst" + ".sub_char28", "sub_char28"),
				MCItemDef.create("dlvInst" + ".sub_char29", "sub_char29"),
				MCItemDef.create("dlvInst" + ".sub_char30", "sub_char30"),
				MCItemDef.create("dlvInst" + ".sub_num1", "sub_num1"),
				MCItemDef.create("dlvInst" + ".sub_num2", "sub_num2"),
				MCItemDef.create("dlvInst" + ".sub_num3", "sub_num3"),
				MCItemDef.create("dlvInst" + ".sub_num4", "sub_num4"),
				MCItemDef.create("dlvInst" + ".sub_num5", "sub_num5"),
				MCItemDef.create("dlvInst" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("dlvInst" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("dlvInst" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("dlvInst" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("dlvInst" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("dlvInst" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("dlvInst" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dlvInst" + ".data_lno", "data_lno"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5140_DlvInstRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5140", "DlvInstRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcpt" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("rcpt" + ".dlv_inst_rcpt_rev", "dlv_inst_rcpt_rev"),
				MCItemDef.create("rcpt" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("rcpt" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rcpt" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("rcpt" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("rcpt" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("rcpt" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_rmrks", "cst_dlv_inst_rmrks"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_d_rmrks", "cst_dlv_inst_d_rmrks"),
				MCItemDef.create("rcpt" + ".edi_flg", "edi_flg"),
				MCItemDef.create("rcpt" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("rcpt" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("rcpt" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("rcpt" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("rcpt" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("rcpt" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("rcpt" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("rcpt" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("rcpt" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("rcpt" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("rcpt" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("rcpt" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("rcpt" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("rcpt" + ".dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("rcpt" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("rcpt" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("rcpt" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("rcpt" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("rcpt" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("rcpt" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("rcpt" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("rcpt" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("rcpt" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("rcpt" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("rcpt" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("rcpt" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("rcpt" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("rcpt" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("rcpt" + ".tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("rcpt" + ".dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("rcpt" + ".sub_char1", "sub_char1"),
				MCItemDef.create("rcpt" + ".sub_char2", "sub_char2"),
				MCItemDef.create("rcpt" + ".sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo_upd_flg", "slo_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("DlvInstRecvIf_Chk01_Upd01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

