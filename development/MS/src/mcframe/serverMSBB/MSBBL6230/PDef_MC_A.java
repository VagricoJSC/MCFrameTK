package mcframe.serverMSBB.MSBBL6230;

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
 * [MSBBL_DlvInstRcptService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6230.DlvInstRcv_Chk01.UP.BLOCK0")){
			return MS_MSBBL6230_DlvInstRcv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6230.DlvInstRcv_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6230_DlvInstRcv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6230.DlvInstRcv_Upd01.UP.BLOCK0")){
			return MS_MSBBL6230_DlvInstRcv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6230.DlvInstRcv_Upd01.DOWN.BLOCK0")){
			return MS_MSBBL6230_DlvInstRcv_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBL6230_DlvInstRcv_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6230", "DlvInstRcv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6230_DlvInstRcv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6230", "DlvInstRcv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rcpt" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("rcpt" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("rcpt" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rcpt" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_rmrks", "cst_dlv_inst_rmrks"),
				MCItemDef.create("rcpt" + ".cst_dlv_inst_d_rmrks", "cst_dlv_inst_d_rmrks"),
				MCItemDef.create("rcpt" + ".edi_flg", "edi_flg"),
				MCItemDef.create("rcpt" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("rcpt" + ".dlv_cd", "dlv_cd"),
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
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("slo_upd_flg", "slo_upd_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("DlvInstRcv_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6230_DlvInstRcv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6230", "DlvInstRcv_Chk01",
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
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("DlvInstRcv_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6230_DlvInstRcv_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6230", "DlvInstRcv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6230_DlvInstRcv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6230", "DlvInstRcv_Upd01",
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
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("DlvInstRcv_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6230_DlvInstRcv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6230", "DlvInstRcv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcpt" + ".dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("rcpt" + ".dlv_inst_rcpt_rev", "dlv_inst_rcpt_rev"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("DlvInstRcv_Upd01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

