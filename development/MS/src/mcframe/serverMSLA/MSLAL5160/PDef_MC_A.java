package mcframe.serverMSLA.MSLAL5160;

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
 * [MSLAL_AccptRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL5160_AccptRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.DOWN.BLOCK3")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSLAL5160.AccptRecvIf_Chk01.DOWN.BLOCK4")){
			return MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL5160_AccptRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL5160", "AccptRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5160_AccptRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL5160", "AccptRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5160_AccptRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL5160", "AccptRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("accpt" + ".data_lno", "data_lno"),
				MCItemDef.create("accpt" + ".data_no", "data_no"),
				MCItemDef.create("accpt" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("accpt" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("accpt" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("accpt" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("accpt" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("accpt" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("accpt" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5160_AccptRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL5160", "AccptRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("accpt" + ".data_lno", "data_lno"),
				MCItemDef.create("accpt" + ".data_no", "data_no"),
				MCItemDef.create("accpt" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("accpt" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("accpt" + ".recv_dt", "recv_dt"),
				MCItemDef.create("accpt" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("accpt" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("accpt" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("accpt" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("accpt" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("accpt" + ".ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("accpt" + ".cst_cd", "cst_cd")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("accpt" + ".data_lno", "data_lno"),
				MCItemDef.create("accpt" + ".data_no", "data_no"),
				MCItemDef.create("accpt" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("AccptRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL5160_AccptRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL5160", "AccptRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("accpt" + ".data_lno", "data_lno"),
				MCItemDef.create("accpt" + ".data_no", "data_no"),
				MCItemDef.create("accpt" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("accpt" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("accpt" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("accpt" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("accpt" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("accpt" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("accpt" + ".imp_flg", "imp_flg"),
				MCItemDef.create("accpt" + ".recv_dt", "recv_dt"),
				MCItemDef.create("accpt" + ".accpt_dt", "accpt_dt"),
				MCItemDef.create("accpt" + ".rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("accpt" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("accpt" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("accpt" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("accpt" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("accpt" + ".ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("accpt" + ".iv_flg", "iv_flg"),
				MCItemDef.create("accpt" + ".abort_flg", "abort_flg"),
				MCItemDef.create("accpt" + ".cst_cd", "cst_cd"),
				MCItemDef.create("accpt" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("accpt" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("accpt" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("accpt" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("accpt" + ".tax_typ", "tax_typ"),
				MCItemDef.create("accpt" + ".interim_flg", "interim_flg"),
				MCItemDef.create("accpt" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("accpt" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("accpt" + ".tax_rate", "tax_rate"),
				MCItemDef.create("accpt" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("accpt" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("accpt" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("accpt" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("accpt" + ".itm_cd", "itm_cd"),
				MCItemDef.create("accpt" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("accpt" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("accpt" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("accpt" + ".itm_nm", "itm_nm"),
				MCItemDef.create("accpt" + ".lot_no", "lot_no"),
				MCItemDef.create("accpt" + ".sno1", "sno1"),
				MCItemDef.create("accpt" + ".sno2", "sno2"),
				MCItemDef.create("accpt" + ".sno3", "sno3"),
				MCItemDef.create("accpt" + ".sno4", "sno4"),
				MCItemDef.create("accpt" + ".upri_not_chk_flg", "upri_not_chk_flg"),
				MCItemDef.create("accpt" + ".amt_not_chk_flg", "amt_not_chk_flg"),
				MCItemDef.create("accpt" + ".tax_not_chk_flg", "tax_not_chk_flg"),
				MCItemDef.create("accpt" + ".sub_char1", "sub_char1"),
				MCItemDef.create("accpt" + ".sub_char2", "sub_char2"),
				MCItemDef.create("accpt" + ".sub_char3", "sub_char3"),
				MCItemDef.create("accpt" + ".sub_char4", "sub_char4"),
				MCItemDef.create("accpt" + ".sub_char5", "sub_char5"),
				MCItemDef.create("accpt" + ".sub_char6", "sub_char6"),
				MCItemDef.create("accpt" + ".sub_char7", "sub_char7"),
				MCItemDef.create("accpt" + ".sub_char8", "sub_char8"),
				MCItemDef.create("accpt" + ".sub_char9", "sub_char9"),
				MCItemDef.create("accpt" + ".sub_char10", "sub_char10"),
				MCItemDef.create("accpt" + ".sub_char11", "sub_char11"),
				MCItemDef.create("accpt" + ".sub_char12", "sub_char12"),
				MCItemDef.create("accpt" + ".sub_char13", "sub_char13"),
				MCItemDef.create("accpt" + ".sub_char14", "sub_char14"),
				MCItemDef.create("accpt" + ".sub_char15", "sub_char15"),
				MCItemDef.create("accpt" + ".sub_char16", "sub_char16"),
				MCItemDef.create("accpt" + ".sub_char17", "sub_char17"),
				MCItemDef.create("accpt" + ".sub_char18", "sub_char18"),
				MCItemDef.create("accpt" + ".sub_char19", "sub_char19"),
				MCItemDef.create("accpt" + ".sub_char20", "sub_char20"),
				MCItemDef.create("accpt" + ".sub_char21", "sub_char21"),
				MCItemDef.create("accpt" + ".sub_char22", "sub_char22"),
				MCItemDef.create("accpt" + ".sub_char23", "sub_char23"),
				MCItemDef.create("accpt" + ".sub_char24", "sub_char24"),
				MCItemDef.create("accpt" + ".sub_char25", "sub_char25"),
				MCItemDef.create("accpt" + ".sub_char26", "sub_char26"),
				MCItemDef.create("accpt" + ".sub_char27", "sub_char27"),
				MCItemDef.create("accpt" + ".sub_char28", "sub_char28"),
				MCItemDef.create("accpt" + ".sub_char29", "sub_char29"),
				MCItemDef.create("accpt" + ".sub_char30", "sub_char30"),
				MCItemDef.create("accpt" + ".sub_num1", "sub_num1"),
				MCItemDef.create("accpt" + ".sub_num2", "sub_num2"),
				MCItemDef.create("accpt" + ".sub_num3", "sub_num3"),
				MCItemDef.create("accpt" + ".sub_num4", "sub_num4"),
				MCItemDef.create("accpt" + ".sub_num5", "sub_num5"),
				MCItemDef.create("accpt" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("accpt" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("accpt" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("accpt" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("accpt" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("accpt" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("accpt" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("accpt" + ".data_lno", "data_lno"),
				MCItemDef.create("accpt" + ".data_no", "data_no"),
				MCItemDef.create("accpt" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("accpt" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("accpt" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("accpt" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("accpt" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("accpt" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("accpt" + ".imp_flg", "imp_flg"),
				MCItemDef.create("accpt" + ".recv_dt", "recv_dt"),
				MCItemDef.create("accpt" + ".accpt_dt", "accpt_dt"),
				MCItemDef.create("accpt" + ".rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("accpt" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("accpt" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("accpt" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("accpt" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("accpt" + ".ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("accpt" + ".iv_flg", "iv_flg"),
				MCItemDef.create("accpt" + ".abort_flg", "abort_flg"),
				MCItemDef.create("accpt" + ".cst_cd", "cst_cd"),
				MCItemDef.create("accpt" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("accpt" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("accpt" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("accpt" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("accpt" + ".tax_typ", "tax_typ"),
				MCItemDef.create("accpt" + ".interim_flg", "interim_flg"),
				MCItemDef.create("accpt" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("accpt" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("accpt" + ".tax_rate", "tax_rate"),
				MCItemDef.create("accpt" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("accpt" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("accpt" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("accpt" + ".accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("accpt" + ".itm_cd", "itm_cd"),
				MCItemDef.create("accpt" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("accpt" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("accpt" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("accpt" + ".itm_nm", "itm_nm"),
				MCItemDef.create("accpt" + ".lot_no", "lot_no"),
				MCItemDef.create("accpt" + ".sno1", "sno1"),
				MCItemDef.create("accpt" + ".sno2", "sno2"),
				MCItemDef.create("accpt" + ".sno3", "sno3"),
				MCItemDef.create("accpt" + ".sno4", "sno4"),
				MCItemDef.create("accpt" + ".upri_not_chk_flg", "upri_not_chk_flg"),
				MCItemDef.create("accpt" + ".amt_not_chk_flg", "amt_not_chk_flg"),
				MCItemDef.create("accpt" + ".tax_not_chk_flg", "tax_not_chk_flg"),
				MCItemDef.create("accpt" + ".sub_char1", "sub_char1"),
				MCItemDef.create("accpt" + ".sub_char2", "sub_char2"),
				MCItemDef.create("accpt" + ".sub_char3", "sub_char3"),
				MCItemDef.create("accpt" + ".sub_char4", "sub_char4"),
				MCItemDef.create("accpt" + ".sub_char5", "sub_char5"),
				MCItemDef.create("accpt" + ".sub_char6", "sub_char6"),
				MCItemDef.create("accpt" + ".sub_char7", "sub_char7"),
				MCItemDef.create("accpt" + ".sub_char8", "sub_char8"),
				MCItemDef.create("accpt" + ".sub_char9", "sub_char9"),
				MCItemDef.create("accpt" + ".sub_char10", "sub_char10"),
				MCItemDef.create("accpt" + ".sub_char11", "sub_char11"),
				MCItemDef.create("accpt" + ".sub_char12", "sub_char12"),
				MCItemDef.create("accpt" + ".sub_char13", "sub_char13"),
				MCItemDef.create("accpt" + ".sub_char14", "sub_char14"),
				MCItemDef.create("accpt" + ".sub_char15", "sub_char15"),
				MCItemDef.create("accpt" + ".sub_char16", "sub_char16"),
				MCItemDef.create("accpt" + ".sub_char17", "sub_char17"),
				MCItemDef.create("accpt" + ".sub_char18", "sub_char18"),
				MCItemDef.create("accpt" + ".sub_char19", "sub_char19"),
				MCItemDef.create("accpt" + ".sub_char20", "sub_char20"),
				MCItemDef.create("accpt" + ".sub_char21", "sub_char21"),
				MCItemDef.create("accpt" + ".sub_char22", "sub_char22"),
				MCItemDef.create("accpt" + ".sub_char23", "sub_char23"),
				MCItemDef.create("accpt" + ".sub_char24", "sub_char24"),
				MCItemDef.create("accpt" + ".sub_char25", "sub_char25"),
				MCItemDef.create("accpt" + ".sub_char26", "sub_char26"),
				MCItemDef.create("accpt" + ".sub_char27", "sub_char27"),
				MCItemDef.create("accpt" + ".sub_char28", "sub_char28"),
				MCItemDef.create("accpt" + ".sub_char29", "sub_char29"),
				MCItemDef.create("accpt" + ".sub_char30", "sub_char30"),
				MCItemDef.create("accpt" + ".sub_num1", "sub_num1"),
				MCItemDef.create("accpt" + ".sub_num2", "sub_num2"),
				MCItemDef.create("accpt" + ".sub_num3", "sub_num3"),
				MCItemDef.create("accpt" + ".sub_num4", "sub_num4"),
				MCItemDef.create("accpt" + ".sub_num5", "sub_num5"),
				MCItemDef.create("accpt" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("accpt" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("accpt" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("accpt" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("accpt" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("accpt" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("accpt" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("fix_sls_basis_typ", "fix_sls_basis_typ"),
				MCItemDef.create("fix_sls_schd_no", "fix_sls_schd_no"),
				MCItemDef.create("fix_dlv_slip_no", "fix_dlv_slip_no"),
				MCItemDef.create("fix_dlv_slip_d_no", "fix_dlv_slip_d_no"),
				MCItemDef.create("fix_slo_no", "fix_slo_no"),
				MCItemDef.create("fix_slo_d_no", "fix_slo_d_no"),
				MCItemDef.create("fix_base_unit_qty", "fix_base_unit_qty"),
				MCItemDef.create("fix_tax_cd", "fix_tax_cd"),
				MCItemDef.create("fix_trd_cur_cd", "fix_trd_cur_cd"),
				MCItemDef.create("fix_trd_cur_upri", "fix_trd_cur_upri"),
				MCItemDef.create("fix_trd_cur_amt", "fix_trd_cur_amt"),
				MCItemDef.create("fix_trd_cur_dscnt_amt", "fix_trd_cur_dscnt_amt"),
				MCItemDef.create("fix_trd_ptn_typ", "fix_trd_ptn_typ"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("sls_schd_mult_flg", "sls_schd_mult_flg"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("ddlvTgtFlg", "ddlvTgtFlg"),
				MCItemDef.create("ivDdlvTgtFlg", "ivDdlvTgtFlg"),
				MCItemDef.create("sloInfoTgtFlg", "sloInfoTgtFlg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("ship_tm", "ship_tm"),
				MCItemDef.create("dlv_tm", "dlv_tm"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("lc_no", "lc_no"),
				MCItemDef.create("lc_dt", "lc_dt"),
				MCItemDef.create("lc_rmrks", "lc_rmrks"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("adjst_tgt_dt", "adjst_tgt_dt"),
				MCItemDef.create("sls_adjst_typ", "sls_adjst_typ"),
				MCItemDef.create("adjst_mtd_typ", "adjst_mtd_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_act_service_via_flg", "ship_act_service_via_flg"),
				MCItemDef.create("slip_split_non_flg", "slip_split_non_flg"),
				MCItemDef.create("ship_act_service_exec_flg", "ship_act_service_exec_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("sls_dtl_mod_flg", "sls_dtl_mod_flg"),
				MCItemDef.create("no_cred_upd_flg", "no_cred_upd_flg"),
				MCItemDef.create("ship_act_sync_flg", "ship_act_sync_flg"),
				MCItemDef.create("edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_SlsAct_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("sls_schd_no", "sls_schd_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("purc_ddlv_po_no", "purc_ddlv_po_no"),
				MCItemDef.create("purc_ddlv_po_d_no", "purc_ddlv_po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("sls_schd_abort_flg", "sls_schd_abort_flg"),
				MCItemDef.create("ext_purc_act_d_no", "ext_purc_act_d_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("upd_purc_peg_no", "upd_purc_peg_no")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_SlsAct_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("io_peg_no", "io_peg_no"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("iv_ship_act_d_no", "iv_ship_act_d_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("sls_schd_abort_flg", "sls_schd_abort_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_flg", "sls_ret_schd_flg"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_SlsAct_Upd01_Io")
		);
	}
	public static MCContainerDef MS_MSLAL5160_AccptRecvIf_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSLAL5160", "AccptRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("act_tax_rate", "act_tax_rate"),
				MCItemDef.create("act_inc_tax_flg", "act_inc_tax_flg"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("tax_rnd_typ", "tax_rnd_typ"),
				MCItemDef.create("sls_schd_qty", "sls_schd_qty"),
				MCItemDef.create("base_unit_cmpl_qty", "base_unit_cmpl_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sls_schd_no", "sls_schd_no")
			}
			,
			MCBlockDef.create("AccptRecvIf_Chk01_Calc01Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

