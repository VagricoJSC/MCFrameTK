package mcframe.serverMSBD.MSBDL0250;

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
 * [MSBDL_PurcDlvSlipPrnt]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0250.Srch01.UP.BLOCK0")){
			return MS_MSBDL0250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0250.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0250.Prnt01.UP.BLOCK0")){
			return MS_MSBDL0250_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0250.Prnt01.UP.BLOCK1")){
			return MS_MSBDL0250_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBDL0250_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0250", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0250_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("not_dlv_prnt_flg", "not_dlv_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("dlv_rqst_dt_fr", "dlv_rqst_dt_fr"),
				MCItemDef.create("dlv_rqst_dt_to", "dlv_rqst_dt_to"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("purc_dlv_slip_src_typ", "purc_dlv_slip_src_typ"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inv_can_flg", "inv_can_flg"),
				MCItemDef.create("inv_non_prnt_flg", "inv_non_prnt_flg"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0250_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_prnt_flg", "slip_prnt_flg"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("purc_dlv_slip_src_typ", "purc_dlv_slip_src_typ"),
				MCItemDef.create("purc_dlv_slip_src_typ_nm", "purc_dlv_slip_src_typ_nm"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_multi_flg", "purc_ddlv_dlv_slip_multi_flg"),
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
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0250_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL0250", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0250_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL0250", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("ope", "ope")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL0250_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL0250", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd2")
		);
	}


	//FMCB DEF_CLASSES END
}

