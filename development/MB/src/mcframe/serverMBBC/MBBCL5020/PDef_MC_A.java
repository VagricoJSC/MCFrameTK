package mcframe.serverMBBC.MBBCL5020;

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
 * [MBBCL_AttachService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBCL5020.Attach_Chk01.UP.BLOCK0")){
			return MB_MBBCL5020_Attach_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Chk01.UP.BLOCK1")){
			return MB_MBBCL5020_Attach_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Chk01.DOWN.BLOCK0")){
			return MB_MBBCL5020_Attach_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Chk01.DOWN.BLOCK1")){
			return MB_MBBCL5020_Attach_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Chk02.UP.BLOCK0")){
			return MB_MBBCL5020_Attach_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Chk02.DOWN.BLOCK0")){
			return MB_MBBCL5020_Attach_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Upd01.UP.BLOCK0")){
			return MB_MBBCL5020_Attach_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Upd01.UP.BLOCK1")){
			return MB_MBBCL5020_Attach_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Upd01.UP.BLOCK2")){
			return MB_MBBCL5020_Attach_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Upd01.DOWN.BLOCK0")){
			return MB_MBBCL5020_Attach_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Del01.UP.BLOCK0")){
			return MB_MBBCL5020_Attach_Del01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5020.Attach_Copy01.UP.BLOCK0")){
			return MB_MBBCL5020_Attach_Copy01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MB_MBBCL5020_Attach_Chk01_INFO = new MCOperationInfo("MB", "MBBCL5020", "Attach_Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5020_Attach_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("edition", "edition"),
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
				MCItemDef.create("report_id", "report_id"),
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
				MCItemDef.create("doc_id", "doc_id"),
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
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("select_file_flg", "select_file_flg"),
				MCItemDef.create("attach_file_flg", "attach_file_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Attach_Chk01_Dtl")
		);
	}

	public static MCContainerDef MB_MBBCL5020_Attach_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk01",
			new MCItemDef[]{
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("Attach_Chk01_Hdr")
		);
	}


	public static MCContainerDef MB_MBBCL5020_Attach_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("edition", "edition"),
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
				MCItemDef.create("report_id", "report_id"),
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
				MCItemDef.create("doc_id", "doc_id"),
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
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("select_file_flg", "select_file_flg"),
				MCItemDef.create("attach_file_flg", "attach_file_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Attach_Chk01_Dtl")
		);
	}
	public static MCContainerDef MB_MBBCL5020_Attach_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk01",
			new MCItemDef[]{
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("Attach_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5020_Attach_Chk02_INFO = new MCOperationInfo("MB", "MBBCL5020", "Attach_Chk02", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5020_Attach_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk02",
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
				MCItemDef.create("report_id", "report_id")
			}
			,
			MCBlockDef.create("Attach_Chk02_Dtl")
		);
	}


	public static MCContainerDef MB_MBBCL5020_Attach_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Chk02",
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
				MCItemDef.create("report_id", "report_id")
			}
			,
			MCBlockDef.create("Attach_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5020_Attach_Upd01_INFO = new MCOperationInfo("MB", "MBBCL5020", "Attach_Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5020_Attach_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("edition", "edition"),
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
				MCItemDef.create("report_id", "report_id"),
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
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("select_file_flg", "select_file_flg"),
				MCItemDef.create("attach_file_flg", "attach_file_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Attach_Upd01_Dtl")
		);
	}

	public static MCContainerDef MB_MBBCL5020_Attach_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Upd01",
			new MCItemDef[]{
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("Attach_Upd01_Hdr")
		);
	}

	public static MCContainerDef MB_MBBCL5020_Attach_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Upd01",
			new MCItemDef[]{
				MCItemDef.create("biz_typ", "biz_typ"),
				MCItemDef.create("report_id", "report_id"),
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
				MCItemDef.create("data_lno", "data_lno")
			}
			,
			MCBlockDef.create("Attach_Upd01_Dtl2")
		);
	}


	public static MCContainerDef MB_MBBCL5020_Attach_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Attach_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5020_Attach_Del01_INFO = new MCOperationInfo("MB", "MBBCL5020", "Attach_Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5020_Attach_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Del01",
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
				MCItemDef.create("report_id", "report_id")
			}
			,
			MCBlockDef.create("Attach_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5020_Attach_Copy01_INFO = new MCOperationInfo("MB", "MBBCL5020", "Attach_Copy01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5020_Attach_Copy01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5020", "Attach_Copy01",
			new MCItemDef[]{
				MCItemDef.create("msg_queue_id", "msg_queue_id"),
				MCItemDef.create("retry_flg", "retry_flg")
			}
			,
			MCBlockDef.create("Attach_Copy01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

