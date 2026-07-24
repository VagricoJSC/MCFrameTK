package mcframe.serverMSLA.MSLAL6420;

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
 * [MSLAL_InspActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL6420_InspActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6420.InspActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL6420_InspActRecvIf_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL6420_InspActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL6420", "InspActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("insp_if" + ".data_lno", "data_lno"),
				MCItemDef.create("insp_if" + ".data_no", "data_no"),
				MCItemDef.create("insp_if" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("insp_if" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("insp_if" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("insp_if" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_if" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("insp_if" + ".insp_no", "insp_no"),
				MCItemDef.create("insp_if" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("insp_if" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("insp_if" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("insp_if" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("insp_if" + ".smpl_quality_typ", "smpl_quality_typ"),
				MCItemDef.create("insp_if" + ".smpl_gd_cd", "smpl_gd_cd"),
				MCItemDef.create("insp_if" + ".smpl_dfct_rsn_cd", "smpl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("insp_if" + ".vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("insp_if" + ".lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("insp_if" + ".vld_dt", "vld_dt"),
				MCItemDef.create("insp_if" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("insp_if" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("insp_if" + ".lot_rmrks", "lot_rmrks"),
				MCItemDef.create("insp_if" + ".imp_only_judg", "imp_only_judg"),
				MCItemDef.create("insp_if" + ".insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_if" + ".judg_dt", "judg_dt"),
				MCItemDef.create("insp_if" + ".judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("insp_if" + ".judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("insp_if" + ".judg_rsn", "judg_rsn"),
				MCItemDef.create("insp_if" + ".ext_insp_act_no", "ext_insp_act_no"),
				MCItemDef.create("insp_if" + ".insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_if" + ".stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("insp_if" + ".stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("insp_if" + ".ttl_quality_typ", "ttl_quality_typ"),
				MCItemDef.create("insp_if" + ".ttl_gd_cd", "ttl_gd_cd"),
				MCItemDef.create("insp_if" + ".ttl_dfct_rsn_cd", "ttl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".ttl_act_tm", "ttl_act_tm"),
				MCItemDef.create("insp_if" + ".base_flg", "base_flg"),
				MCItemDef.create("insp_if" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("insp_if" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_qty", "ttl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_cd", "ttl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".ttl_intr_rmrks", "ttl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_act_d_no", "ext_insp_act_d_no"),
				MCItemDef.create("insp_if" + ".so_qty", "so_qty"),
				MCItemDef.create("insp_if" + ".smpl_qty", "smpl_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_qty", "smpl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_cd", "smpl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".smpl_act_tm", "smpl_act_tm"),
				MCItemDef.create("insp_if" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("insp_if" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("insp_if" + ".smpl_intr_rmrks", "smpl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_smpl_act_no", "ext_insp_smpl_act_no"),
				MCItemDef.create("insp_if" + ".sub_char1", "sub_char1"),
				MCItemDef.create("insp_if" + ".sub_char2", "sub_char2"),
				MCItemDef.create("insp_if" + ".sub_char3", "sub_char3"),
				MCItemDef.create("insp_if" + ".sub_char4", "sub_char4"),
				MCItemDef.create("insp_if" + ".sub_char5", "sub_char5"),
				MCItemDef.create("insp_if" + ".sub_char6", "sub_char6"),
				MCItemDef.create("insp_if" + ".sub_char7", "sub_char7"),
				MCItemDef.create("insp_if" + ".sub_char8", "sub_char8"),
				MCItemDef.create("insp_if" + ".sub_char9", "sub_char9"),
				MCItemDef.create("insp_if" + ".sub_char10", "sub_char10"),
				MCItemDef.create("insp_if" + ".sub_char11", "sub_char11"),
				MCItemDef.create("insp_if" + ".sub_char12", "sub_char12"),
				MCItemDef.create("insp_if" + ".sub_char13", "sub_char13"),
				MCItemDef.create("insp_if" + ".sub_char14", "sub_char14"),
				MCItemDef.create("insp_if" + ".sub_char15", "sub_char15"),
				MCItemDef.create("insp_if" + ".sub_char16", "sub_char16"),
				MCItemDef.create("insp_if" + ".sub_char17", "sub_char17"),
				MCItemDef.create("insp_if" + ".sub_char18", "sub_char18"),
				MCItemDef.create("insp_if" + ".sub_char19", "sub_char19"),
				MCItemDef.create("insp_if" + ".sub_char20", "sub_char20"),
				MCItemDef.create("insp_if" + ".sub_char21", "sub_char21"),
				MCItemDef.create("insp_if" + ".sub_char22", "sub_char22"),
				MCItemDef.create("insp_if" + ".sub_char23", "sub_char23"),
				MCItemDef.create("insp_if" + ".sub_char24", "sub_char24"),
				MCItemDef.create("insp_if" + ".sub_char25", "sub_char25"),
				MCItemDef.create("insp_if" + ".sub_char26", "sub_char26"),
				MCItemDef.create("insp_if" + ".sub_char27", "sub_char27"),
				MCItemDef.create("insp_if" + ".sub_char28", "sub_char28"),
				MCItemDef.create("insp_if" + ".sub_char29", "sub_char29"),
				MCItemDef.create("insp_if" + ".sub_char30", "sub_char30"),
				MCItemDef.create("insp_if" + ".sub_num1", "sub_num1"),
				MCItemDef.create("insp_if" + ".sub_num2", "sub_num2"),
				MCItemDef.create("insp_if" + ".sub_num3", "sub_num3"),
				MCItemDef.create("insp_if" + ".sub_num4", "sub_num4"),
				MCItemDef.create("insp_if" + ".sub_num5", "sub_num5"),
				MCItemDef.create("insp_if" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("insp_if" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("insp_if" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("insp_if" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("insp_if" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("insp_if" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("insp_if" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("InspActRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("insp_if" + ".data_lno", "data_lno"),
				MCItemDef.create("insp_if" + ".data_no", "data_no"),
				MCItemDef.create("insp_if" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("insp_if" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("insp_if" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("insp_if" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_if" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("insp_if" + ".insp_no", "insp_no"),
				MCItemDef.create("insp_if" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("insp_if" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("insp_if" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("insp_if" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("insp_if" + ".smpl_quality_typ", "smpl_quality_typ"),
				MCItemDef.create("insp_if" + ".smpl_gd_cd", "smpl_gd_cd"),
				MCItemDef.create("insp_if" + ".smpl_dfct_rsn_cd", "smpl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("insp_if" + ".vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("insp_if" + ".lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("insp_if" + ".vld_dt", "vld_dt"),
				MCItemDef.create("insp_if" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("insp_if" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("insp_if" + ".lot_rmrks", "lot_rmrks"),
				MCItemDef.create("insp_if" + ".imp_only_judg", "imp_only_judg"),
				MCItemDef.create("insp_if" + ".insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_if" + ".judg_dt", "judg_dt"),
				MCItemDef.create("insp_if" + ".judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("insp_if" + ".judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("insp_if" + ".judg_rsn", "judg_rsn"),
				MCItemDef.create("insp_if" + ".ext_insp_act_no", "ext_insp_act_no"),
				MCItemDef.create("insp_if" + ".insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_if" + ".stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("insp_if" + ".stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("insp_if" + ".ttl_quality_typ", "ttl_quality_typ"),
				MCItemDef.create("insp_if" + ".ttl_gd_cd", "ttl_gd_cd"),
				MCItemDef.create("insp_if" + ".ttl_dfct_rsn_cd", "ttl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".ttl_act_tm", "ttl_act_tm"),
				MCItemDef.create("insp_if" + ".base_flg", "base_flg"),
				MCItemDef.create("insp_if" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("insp_if" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_qty", "ttl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_cd", "ttl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".ttl_intr_rmrks", "ttl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_act_d_no", "ext_insp_act_d_no"),
				MCItemDef.create("insp_if" + ".so_qty", "so_qty"),
				MCItemDef.create("insp_if" + ".smpl_qty", "smpl_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_qty", "smpl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_cd", "smpl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".smpl_act_tm", "smpl_act_tm"),
				MCItemDef.create("insp_if" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("insp_if" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("insp_if" + ".smpl_intr_rmrks", "smpl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_smpl_act_no", "ext_insp_smpl_act_no"),
				MCItemDef.create("insp_if" + ".sub_char1", "sub_char1"),
				MCItemDef.create("insp_if" + ".sub_char2", "sub_char2"),
				MCItemDef.create("insp_if" + ".sub_char3", "sub_char3"),
				MCItemDef.create("insp_if" + ".sub_char4", "sub_char4"),
				MCItemDef.create("insp_if" + ".sub_char5", "sub_char5"),
				MCItemDef.create("insp_if" + ".sub_char6", "sub_char6"),
				MCItemDef.create("insp_if" + ".sub_char7", "sub_char7"),
				MCItemDef.create("insp_if" + ".sub_char8", "sub_char8"),
				MCItemDef.create("insp_if" + ".sub_char9", "sub_char9"),
				MCItemDef.create("insp_if" + ".sub_char10", "sub_char10"),
				MCItemDef.create("insp_if" + ".sub_char11", "sub_char11"),
				MCItemDef.create("insp_if" + ".sub_char12", "sub_char12"),
				MCItemDef.create("insp_if" + ".sub_char13", "sub_char13"),
				MCItemDef.create("insp_if" + ".sub_char14", "sub_char14"),
				MCItemDef.create("insp_if" + ".sub_char15", "sub_char15"),
				MCItemDef.create("insp_if" + ".sub_char16", "sub_char16"),
				MCItemDef.create("insp_if" + ".sub_char17", "sub_char17"),
				MCItemDef.create("insp_if" + ".sub_char18", "sub_char18"),
				MCItemDef.create("insp_if" + ".sub_char19", "sub_char19"),
				MCItemDef.create("insp_if" + ".sub_char20", "sub_char20"),
				MCItemDef.create("insp_if" + ".sub_char21", "sub_char21"),
				MCItemDef.create("insp_if" + ".sub_char22", "sub_char22"),
				MCItemDef.create("insp_if" + ".sub_char23", "sub_char23"),
				MCItemDef.create("insp_if" + ".sub_char24", "sub_char24"),
				MCItemDef.create("insp_if" + ".sub_char25", "sub_char25"),
				MCItemDef.create("insp_if" + ".sub_char26", "sub_char26"),
				MCItemDef.create("insp_if" + ".sub_char27", "sub_char27"),
				MCItemDef.create("insp_if" + ".sub_char28", "sub_char28"),
				MCItemDef.create("insp_if" + ".sub_char29", "sub_char29"),
				MCItemDef.create("insp_if" + ".sub_char30", "sub_char30"),
				MCItemDef.create("insp_if" + ".sub_num1", "sub_num1"),
				MCItemDef.create("insp_if" + ".sub_num2", "sub_num2"),
				MCItemDef.create("insp_if" + ".sub_num3", "sub_num3"),
				MCItemDef.create("insp_if" + ".sub_num4", "sub_num4"),
				MCItemDef.create("insp_if" + ".sub_num5", "sub_num5"),
				MCItemDef.create("insp_if" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("insp_if" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("insp_if" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("insp_if" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("insp_if" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("insp_if" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("insp_if" + ".log_sub_key2", "log_sub_key2"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspActRecvIf_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6420_InspActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6420", "InspActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6420_InspActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL6420", "InspActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6420_InspActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL6420", "InspActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("insp_if" + ".data_lno", "data_lno"),
				MCItemDef.create("insp_if" + ".data_no", "data_no"),
				MCItemDef.create("insp_if" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("insp_if" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("insp_if" + ".ext_insp_act_no", "ext_insp_act_no"),
				MCItemDef.create("insp_if" + ".ext_insp_act_d_no", "ext_insp_act_d_no"),
				MCItemDef.create("insp_if" + ".ext_insp_smpl_act_no", "ext_insp_smpl_act_no")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6420_InspActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL6420", "InspActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("insp_if" + ".data_lno", "data_lno"),
				MCItemDef.create("insp_if" + ".data_no", "data_no"),
				MCItemDef.create("insp_if" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("insp_if" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("insp_if" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("insp_if" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_if" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("insp_if" + ".insp_no", "insp_no"),
				MCItemDef.create("insp_if" + ".st_act_tm", "st_act_tm"),
				MCItemDef.create("insp_if" + ".end_act_tm", "end_act_tm"),
				MCItemDef.create("insp_if" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("insp_if" + ".if_act_usr_cd", "if_act_usr_cd"),
				MCItemDef.create("insp_if" + ".if_act_usr_nm", "if_act_usr_nm"),
				MCItemDef.create("insp_if" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_act_dpt_cd", "if_act_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_act_dpt_nm", "if_act_dpt_nm"),
				MCItemDef.create("insp_if" + ".smpl_quality_typ", "smpl_quality_typ"),
				MCItemDef.create("insp_if" + ".smpl_gd_cd", "smpl_gd_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_gd_cd", "if_smpl_gd_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_gd_nm", "if_smpl_gd_nm"),
				MCItemDef.create("insp_if" + ".smpl_dfct_rsn_cd", "smpl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_dfct_rsn_cd", "if_smpl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_dfct_rsn_nm", "if_smpl_dfct_rsn_nm"),
				MCItemDef.create("insp_if" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("insp_if" + ".vld_dt_upd_flg", "vld_dt_upd_flg"),
				MCItemDef.create("insp_if" + ".lmt_dt_frm", "lmt_dt_frm"),
				MCItemDef.create("insp_if" + ".vld_dt", "vld_dt"),
				MCItemDef.create("insp_if" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("insp_if" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("insp_if" + ".lot_rmrks", "lot_rmrks"),
				MCItemDef.create("insp_if" + ".imp_only_judg", "imp_only_judg"),
				MCItemDef.create("insp_if" + ".insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_if" + ".judg_dt", "judg_dt"),
				MCItemDef.create("insp_if" + ".judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("insp_if" + ".if_judg_usr_cd", "if_judg_usr_cd"),
				MCItemDef.create("insp_if" + ".if_judg_usr_nm", "if_judg_usr_nm"),
				MCItemDef.create("insp_if" + ".judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_judg_dpt_cd", "if_judg_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_judg_dpt_nm", "if_judg_dpt_nm"),
				MCItemDef.create("insp_if" + ".judg_rsn", "judg_rsn"),
				MCItemDef.create("insp_if" + ".ext_insp_act_no", "ext_insp_act_no"),
				MCItemDef.create("insp_if" + ".insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_if" + ".stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("insp_if" + ".if_stk_loc_cd", "if_stk_loc_cd"),
				MCItemDef.create("insp_if" + ".if_stk_loc_nm", "if_stk_loc_nm"),
				MCItemDef.create("insp_if" + ".stk_str_ln_cd", "stk_str_ln_cd"),
				MCItemDef.create("insp_if" + ".if_stk_str_ln_cd", "if_stk_str_ln_cd"),
				MCItemDef.create("insp_if" + ".if_stk_str_ln_nm", "if_stk_str_ln_nm"),
				MCItemDef.create("insp_if" + ".ttl_quality_typ", "ttl_quality_typ"),
				MCItemDef.create("insp_if" + ".ttl_gd_cd", "ttl_gd_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_gd_cd", "if_ttl_gd_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_gd_nm", "if_ttl_gd_nm"),
				MCItemDef.create("insp_if" + ".ttl_dfct_rsn_cd", "ttl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_dfct_rsn_cd", "if_ttl_dfct_rsn_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_dfct_rsn_nm", "if_ttl_dfct_rsn_nm"),
				MCItemDef.create("insp_if" + ".ttl_act_tm", "ttl_act_tm"),
				MCItemDef.create("insp_if" + ".base_flg", "base_flg"),
				MCItemDef.create("insp_if" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("insp_if" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_pack_unit_cd", "if_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_pack_unit_nm", "if_pack_unit_nm"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_qty", "ttl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".ttl_pack_xfr_pack_unit_cd", "ttl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_pack_xfr_pack_unit_cd", "if_ttl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_ttl_pack_xfr_pack_unit_nm", "if_ttl_pack_xfr_pack_unit_nm"),
				MCItemDef.create("insp_if" + ".ttl_intr_rmrks", "ttl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_act_d_no", "ext_insp_act_d_no"),
				MCItemDef.create("insp_if" + ".so_qty", "so_qty"),
				MCItemDef.create("insp_if" + ".smpl_qty", "smpl_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_qty", "smpl_pack_xfr_pack_unit_qty"),
				MCItemDef.create("insp_if" + ".smpl_pack_xfr_pack_unit_cd", "smpl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_pack_xfr_pack_unit_cd", "if_smpl_pack_xfr_pack_unit_cd"),
				MCItemDef.create("insp_if" + ".if_smpl_pack_xfr_pack_unit_nm", "if_smpl_pack_xfr_pack_unit_nm"),
				MCItemDef.create("insp_if" + ".smpl_act_tm", "smpl_act_tm"),
				MCItemDef.create("insp_if" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_bd_dpt_cd", "if_bd_dpt_cd"),
				MCItemDef.create("insp_if" + ".if_bd_dpt_nm", "if_bd_dpt_nm"),
				MCItemDef.create("insp_if" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("insp_if" + ".smpl_intr_rmrks", "smpl_intr_rmrks"),
				MCItemDef.create("insp_if" + ".ext_insp_smpl_act_no", "ext_insp_smpl_act_no"),
				MCItemDef.create("insp_if" + ".sub_char1", "sub_char1"),
				MCItemDef.create("insp_if" + ".sub_char2", "sub_char2"),
				MCItemDef.create("insp_if" + ".sub_char3", "sub_char3"),
				MCItemDef.create("insp_if" + ".sub_char4", "sub_char4"),
				MCItemDef.create("insp_if" + ".sub_char5", "sub_char5"),
				MCItemDef.create("insp_if" + ".sub_char6", "sub_char6"),
				MCItemDef.create("insp_if" + ".sub_char7", "sub_char7"),
				MCItemDef.create("insp_if" + ".sub_char8", "sub_char8"),
				MCItemDef.create("insp_if" + ".sub_char9", "sub_char9"),
				MCItemDef.create("insp_if" + ".sub_char10", "sub_char10"),
				MCItemDef.create("insp_if" + ".sub_char11", "sub_char11"),
				MCItemDef.create("insp_if" + ".sub_char12", "sub_char12"),
				MCItemDef.create("insp_if" + ".sub_char13", "sub_char13"),
				MCItemDef.create("insp_if" + ".sub_char14", "sub_char14"),
				MCItemDef.create("insp_if" + ".sub_char15", "sub_char15"),
				MCItemDef.create("insp_if" + ".sub_char16", "sub_char16"),
				MCItemDef.create("insp_if" + ".sub_char17", "sub_char17"),
				MCItemDef.create("insp_if" + ".sub_char18", "sub_char18"),
				MCItemDef.create("insp_if" + ".sub_char19", "sub_char19"),
				MCItemDef.create("insp_if" + ".sub_char20", "sub_char20"),
				MCItemDef.create("insp_if" + ".sub_char21", "sub_char21"),
				MCItemDef.create("insp_if" + ".sub_char22", "sub_char22"),
				MCItemDef.create("insp_if" + ".sub_char23", "sub_char23"),
				MCItemDef.create("insp_if" + ".sub_char24", "sub_char24"),
				MCItemDef.create("insp_if" + ".sub_char25", "sub_char25"),
				MCItemDef.create("insp_if" + ".sub_char26", "sub_char26"),
				MCItemDef.create("insp_if" + ".sub_char27", "sub_char27"),
				MCItemDef.create("insp_if" + ".sub_char28", "sub_char28"),
				MCItemDef.create("insp_if" + ".sub_char29", "sub_char29"),
				MCItemDef.create("insp_if" + ".sub_char30", "sub_char30"),
				MCItemDef.create("insp_if" + ".sub_num1", "sub_num1"),
				MCItemDef.create("insp_if" + ".sub_num2", "sub_num2"),
				MCItemDef.create("insp_if" + ".sub_num3", "sub_num3"),
				MCItemDef.create("insp_if" + ".sub_num4", "sub_num4"),
				MCItemDef.create("insp_if" + ".sub_num5", "sub_num5"),
				MCItemDef.create("insp_if" + ".sub_dt1", "sub_dt1"),
				MCItemDef.create("insp_if" + ".sub_dt2", "sub_dt2"),
				MCItemDef.create("insp_if" + ".sub_dt3", "sub_dt3"),
				MCItemDef.create("insp_if" + ".sub_dt4", "sub_dt4"),
				MCItemDef.create("insp_if" + ".sub_dt5", "sub_dt5"),
				MCItemDef.create("insp_if" + ".log_sub_key1", "log_sub_key1"),
				MCItemDef.create("insp_if" + ".log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL6420_InspActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6420", "InspActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("insp_if" + ".data_lno", "data_lno"),
				MCItemDef.create("insp_if" + ".data_no", "data_no"),
				MCItemDef.create("insp_if" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("InspActRecvIf_Upd04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

