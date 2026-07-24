package mcframe.serverMSBF.MSBFL0080;

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
 * [MSBFL_PlntAprvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0080.Srch01.UP.BLOCK0")){
			return MS_MSBFL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0080_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk01.UP.BLOCK0")){
			return MS_MSBFL0080_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0080_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk02.UP.BLOCK0")){
			return MS_MSBFL0080_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0080_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk03.UP.BLOCK0")){
			return MS_MSBFL0080_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Chk03.DOWN.BLOCK0")){
			return MS_MSBFL0080_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Upd01.UP.BLOCK0")){
			return MS_MSBFL0080_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Upd01.UP.BLOCK1")){
			return MS_MSBFL0080_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0080.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0080_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Upd02.UP.BLOCK0")){
			return MS_MSBFL0080_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Upd02.DOWN.BLOCK0")){
			return MS_MSBFL0080_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Del01.UP.BLOCK0")){
			return MS_MSBFL0080_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Del01.UP.BLOCK1")){
			return MS_MSBFL0080_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0080.Del01.DOWN.BLOCK0")){
			return MS_MSBFL0080_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0080_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0080.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0080_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBFL0080_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("rjct_flg", "rjct_flg"),
				MCItemDef.create("not_prnt_flg", "not_prnt_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("aprv_dt_fr", "aprv_dt_fr"),
				MCItemDef.create("aprv_dt_to", "aprv_dt_to"),
				MCItemDef.create("upd_ts_fr", "upd_ts_fr"),
				MCItemDef.create("upd_ts_to", "upd_ts_to"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trace_disp_flg", "trace_disp_flg"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("rjct_flg", "rjct_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_prnt_flg", "plnt_aprv_prnt_flg"),
				MCItemDef.create("plnt_aprv_prnt_tm", "plnt_aprv_prnt_tm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("comp_itm_insp_typ", "comp_itm_insp_typ"),
				MCItemDef.create("comp_itm_insp_typ_nm", "comp_itm_insp_typ_nm"),
				MCItemDef.create("comp_itm_quality_typ", "comp_itm_quality_typ"),
				MCItemDef.create("comp_itm_quality_typ_nm", "comp_itm_quality_typ_nm"),
				MCItemDef.create("comp_itm_mfg_aprv_typ", "comp_itm_mfg_aprv_typ"),
				MCItemDef.create("comp_itm_mfg_aprv_typ_nm", "comp_itm_mfg_aprv_typ_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
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
	
	static final MCOperationInfo MS_MSBFL0080_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0080", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("rjct_flg", "rjct_flg"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0080", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Chk03_INFO = new MCOperationInfo("MS", "MSBFL0080", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0080", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("acpt_flg", "acpt_flg"),
				MCItemDef.create("rjct_flg", "rjct_flg"),
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("aprv_prnt_flg", "aprv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0080_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Upd01_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("plnt_aprv_prnt_flg", "plnt_aprv_prnt_flg"),
				MCItemDef.create("plnt_aprv_prnt_tm", "plnt_aprv_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0080", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Del01_INFO = new MCOperationInfo("MS", "MSBFL0080", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL0080_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Del01_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Del01",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0080_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0080", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0080_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL0080_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0080", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("plnt_aprv_no", "plnt_aprv_no"),
				MCItemDef.create("plnt_aprv_prnt_flg", "plnt_aprv_prnt_flg"),
				MCItemDef.create("plnt_aprv_prnt_tm", "plnt_aprv_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

