package mcframe.serverMSBE.MSBEL6500;

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
 * [MSBEL_StkXfrActRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.UP.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.UP.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk01.DOWN.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.UP.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.UP.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.DOWN.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk02.DOWN.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk03.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Chk03.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.UP.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.UP.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.DOWN.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Ins01.DOWN.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.UP.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.UP.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Upd01.DOWN.BLOCK2")){
			return MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Del01.UP.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6500.StkXfrAct_Del01.DOWN.BLOCK0")){
			return MS_MSBEL6500_StkXfrAct_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk01_DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Chk02_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("io_upd_flg", "io_upd_flg"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk02_DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Chk03_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk03_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Chk03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Ins01_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr" + ".trd_cd", "trd_cd"),
				MCItemDef.create("stk_xfr" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("stk_xfr" + ".loc_cd", "loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("stk_xfr" + ".wg_cd", "wg_cd"),
				MCItemDef.create("stk_xfr" + ".act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("stk_xfr" + ".act_usr_cd", "act_usr_cd"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_tm", "stk_xfr_act_tm"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_xfr" + ".ac_dt", "ac_dt"),
				MCItemDef.create("stk_xfr" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("stk_xfr" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("stk_xfr" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr" + ".sub_char3", "sub_char3"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_rsn_cd", "stk_xfr_rsn_cd"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_DtlGi")
		);
	}

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no"),
				MCItemDef.create("stk_xfr_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("stk_xfr_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_xfr_d" + ".fix_no_typ", "fix_no_typ"),
				MCItemDef.create("stk_xfr_d" + ".fix_no", "fix_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".lot_no", "lot_no"),
				MCItemDef.create("stk_xfr_d" + ".sublot_no", "sublot_no"),
				MCItemDef.create("stk_xfr_d" + ".sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_xfr_d" + ".sno1", "sno1"),
				MCItemDef.create("stk_xfr_d" + ".sno2", "sno2"),
				MCItemDef.create("stk_xfr_d" + ".sno3", "sno3"),
				MCItemDef.create("stk_xfr_d" + ".sno4", "sno4"),
				MCItemDef.create("stk_xfr_d" + ".gd_cd", "gd_cd"),
				MCItemDef.create("stk_xfr_d" + ".quality_typ", "quality_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_xfr_d" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("stk_xfr_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("stk_xfr_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("stk_xfr_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("stk_xfr_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("stk_xfr_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("crt_lot_flg", "crt_lot_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_DtlGr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_DtlGi")
		);
	}
	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("stk_xfr_d" + ".stk_xfr_act_d_no", "stk_xfr_act_d_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Upd01_DtlGr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6500_StkXfrAct_Del01_INFO = new MCOperationInfo("MS", "MSBEL6500", "StkXfrAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no"),
				MCItemDef.create("stk_xfr" + ".stk_xfr_act_no", "stk_xfr_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("StkXfrAct_Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL6500_StkXfrAct_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6500", "StkXfrAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_dtl_peg_no", "hdr_dtl_peg_no")
			}
			,
			MCBlockDef.create("StkXfrAct_Del01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

