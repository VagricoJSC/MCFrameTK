package mcframe.serverMBBC.MBBCL0020;

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
 * [MBBCL_AttachmentLstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBCL0020.Srch01.UP.BLOCK0")){
			return MB_MBBCL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL0020.Srch01.DOWN.BLOCK0")){
			return MB_MBBCL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL0020.Upd01.UP.BLOCK0")){
			return MB_MBBCL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL0020.Upd01.DOWN.BLOCK0")){
			return MB_MBBCL0020_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBCL0020_Srch01_INFO = new MCOperationInfo("MB", "MBBCL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}


	public static MCContainerDef MB_MBBCL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("archive_flg", "archive_flg"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("edition", "edition"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("biz_typ_nm", "biz_typ_nm"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("fs_flg", "fs_flg"),
				MCItemDef.create("doc_id", "doc_id"),
				MCItemDef.create("preview_url", "preview_url"),
				MCItemDef.create("rmrks1", "rmrks1"),
				MCItemDef.create("rmrks2", "rmrks2"),
				MCItemDef.create("rmrks3", "rmrks3"),
				MCItemDef.create("rmrks4", "rmrks4"),
				MCItemDef.create("rmrks5", "rmrks5"),
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("rpt_attr1", "rpt_attr1"),
				MCItemDef.create("rpt_attr2", "rpt_attr2"),
				MCItemDef.create("rpt_attr3", "rpt_attr3"),
				MCItemDef.create("rpt_attr4", "rpt_attr4"),
				MCItemDef.create("rpt_attr5", "rpt_attr5"),
				MCItemDef.create("rpt_attr6", "rpt_attr6"),
				MCItemDef.create("rpt_attr7", "rpt_attr7"),
				MCItemDef.create("rpt_attr8", "rpt_attr8"),
				MCItemDef.create("rpt_attr9", "rpt_attr9"),
				MCItemDef.create("rpt_attr10", "rpt_attr10"),
				MCItemDef.create("rpt_attr11", "rpt_attr11"),
				MCItemDef.create("rpt_attr12", "rpt_attr12"),
				MCItemDef.create("rpt_attr13", "rpt_attr13"),
				MCItemDef.create("rpt_attr14", "rpt_attr14"),
				MCItemDef.create("rpt_attr15", "rpt_attr15"),
				MCItemDef.create("rpt_attr16", "rpt_attr16"),
				MCItemDef.create("rpt_attr17", "rpt_attr17"),
				MCItemDef.create("rpt_attr18", "rpt_attr18"),
				MCItemDef.create("rpt_attr19", "rpt_attr19"),
				MCItemDef.create("rpt_attr20", "rpt_attr20"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("data_crud_typ_nm", "data_crud_typ_nm"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBCL0020_Upd01_INFO = new MCOperationInfo("MB", "MBBCL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL0020_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("edition", "edition"),
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("select_file_flg", "select_file_flg"),
				MCItemDef.create("attach_file_flg", "attach_file_flg"),
				MCItemDef.create("biz_key1", "biz_key1"),
				MCItemDef.create("biz_key2", "biz_key2"),
				MCItemDef.create("biz_key3", "biz_key3"),
				MCItemDef.create("biz_key4", "biz_key4"),
				MCItemDef.create("biz_key5", "biz_key5"),
				MCItemDef.create("biz_key6", "biz_key6"),
				MCItemDef.create("biz_key7", "biz_key7"),
				MCItemDef.create("biz_key8", "biz_key8"),
				MCItemDef.create("biz_key9", "biz_key9"),
				MCItemDef.create("biz_key10", "biz_key10"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("rmrks1", "rmrks1"),
				MCItemDef.create("rmrks2", "rmrks2"),
				MCItemDef.create("rmrks3", "rmrks3"),
				MCItemDef.create("rmrks4", "rmrks4"),
				MCItemDef.create("rmrks5", "rmrks5"),
				MCItemDef.create("file_bin", "file_bin"),
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("if_proc_typ", "if_proc_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBCL0020_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

