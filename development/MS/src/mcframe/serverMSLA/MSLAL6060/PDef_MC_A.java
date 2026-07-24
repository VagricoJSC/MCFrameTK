package mcframe.serverMSLA.MSLAL6060;

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
 * [MSLAL_XfrActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL6060_XfrActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd03.UP.BLOCK1")){
			return MS_MSLAL6060_XfrActRecvIf_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd04.UP.BLOCK1")){
			return MS_MSLAL6060_XfrActRecvIf_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL6060_XfrActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6060.XfrActRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL6060_XfrActRecvIf_Chk01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL6060_XfrActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6060", "XfrActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6060_XfrActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL6060", "XfrActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6060_XfrActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL6060", "XfrActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("xa" + ".data_lno", "data_lno"),
				MCItemDef.create("xa" + ".data_no", "data_no"),
				MCItemDef.create("xa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("xa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("xa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("xa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("xa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("xa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("xa" + ".lg_grp_cd", "lg_grp_cd")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd03_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6060_XfrActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL6060", "XfrActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("xa" + ".data_lno", "data_lno"),
				MCItemDef.create("xa" + ".data_no", "data_no"),
				MCItemDef.create("xa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("xa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("xa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("xa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("xa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("xa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("xa" + ".recv_dt", "recv_dt"),
				MCItemDef.create("xa" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xa" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xa" + ".xfr_dt", "xfr_dt"),
				MCItemDef.create("xa" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xa" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xa" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xa" + ".ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("xa" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xa" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xa" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xa" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xa" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xa" + ".lot_no", "lot_no"),
				MCItemDef.create("xa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xa" + ".sno1", "sno1"),
				MCItemDef.create("xa" + ".sno2", "sno2"),
				MCItemDef.create("xa" + ".sno3", "sno3"),
				MCItemDef.create("xa" + ".sno4", "sno4"),
				MCItemDef.create("xa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xa" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xa" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xa" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xa" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xa" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xa" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xa" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xa" + ".intr_d_rmrks", "intr_d_rmrks")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd04_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("xa" + ".data_lno", "data_lno"),
				MCItemDef.create("xa" + ".data_no", "data_no"),
				MCItemDef.create("xa" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6060_XfrActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL6060", "XfrActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("xa" + ".data_lno", "data_lno"),
				MCItemDef.create("xa" + ".data_no", "data_no"),
				MCItemDef.create("xa" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xa" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("xa" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("xa" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("xa" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("xa" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("xa" + ".imp_flg", "imp_flg"),
				MCItemDef.create("xa" + ".recv_dt", "recv_dt"),
				MCItemDef.create("xa" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xa" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xa" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xa" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xa" + ".xfr_dt", "xfr_dt"),
				MCItemDef.create("xa" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xa" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xa" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xa" + ".ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("xa" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xa" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xa" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xa" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xa" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xa" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xa" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xa" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xa" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xa" + ".lot_no", "lot_no"),
				MCItemDef.create("xa" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xa" + ".sno1", "sno1"),
				MCItemDef.create("xa" + ".sno2", "sno2"),
				MCItemDef.create("xa" + ".sno3", "sno3"),
				MCItemDef.create("xa" + ".sno4", "sno4"),
				MCItemDef.create("xa" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xa" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xa" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xa" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xa" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xa" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xa" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xa" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xa" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xa" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xa" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xa" + ".intr_d_rmrks", "intr_d_rmrks")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL6060_XfrActRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6060", "XfrActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xah" + ".xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xah" + ".xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xah" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xah" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xah" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xah" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xah" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xah" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xah" + ".xfr_dt", "xfr_dt"),
				MCItemDef.create("xah" + ".ac_dt", "ac_dt"),
				MCItemDef.create("xah" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("xah" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("xah" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xah" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("xah" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xah" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xah" + ".sub_char3", "sub_char3"),
				MCItemDef.create("immd_dlv_prnt_flg", "immd_dlv_prnt_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("xad" + ".xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("xad" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xad" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xad" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xad" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xad" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xad" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xad" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xad" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xad" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xad" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xad" + ".lot_no", "lot_no"),
				MCItemDef.create("xad" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xad" + ".sno1", "sno1"),
				MCItemDef.create("xad" + ".sno2", "sno2"),
				MCItemDef.create("xad" + ".sno3", "sno3"),
				MCItemDef.create("xad" + ".sno4", "sno4"),
				MCItemDef.create("xad" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xad" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xad" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xad" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xad" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xad" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xad" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xad" + ".skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("xad" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xad" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xad" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xad" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xad" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xad" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xad" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xad" + ".sub_char1", "sub_char1_dtl"),
				MCItemDef.create("xad" + ".sub_char2", "sub_char2_dtl"),
				MCItemDef.create("xad" + ".sub_char3", "sub_char3_dtl"),
				MCItemDef.create("xad" + ".wms_flg", "wms_flg"),
				MCItemDef.create("xad" + ".ext_xfr_act_no", "ext_xfr_act_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("act_upd_cntr", "act_upd_cntr"),
				MCItemDef.create("act_usr_cd_upd_flg", "act_usr_cd_upd_flg"),
				MCItemDef.create("act_dpt_cd_upd_flg", "act_dpt_cd_upd_flg"),
				MCItemDef.create("intr_rmrks_upd_flg", "intr_rmrks_upd_flg"),
				MCItemDef.create("trd_rmrks_upd_flg", "trd_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg"),
				MCItemDef.create("intr_d_rmrks_upd_flg", "intr_d_rmrks_upd_flg"),
				MCItemDef.create("trd_d_rmrks_upd_flg", "trd_d_rmrks_upd_flg"),
				MCItemDef.create("sub_char1_dtl_upd_flg", "sub_char1_dtl_upd_flg"),
				MCItemDef.create("sub_char2_dtl_upd_flg", "sub_char2_dtl_upd_flg"),
				MCItemDef.create("sub_char3_dtl_upd_flg", "sub_char3_dtl_upd_flg")
			}
			,
			MCBlockDef.create("XfrActRecvIf_Chk01_HdrDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

