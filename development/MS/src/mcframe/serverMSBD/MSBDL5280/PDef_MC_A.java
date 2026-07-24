package mcframe.serverMSBD.MSBDL5280;

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
 * [MSBDL_PurcFrcstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch01.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch01.UP.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch01.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch02.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch02.UP.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Srch02.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.UP.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.UP.BLOCK2")){
			return MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk01.DOWN.BLOCK2")){
			return MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk02.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk03.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Chk03.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Upd01.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Upd01.UP.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Upd01.UP.BLOCK2")){
			return MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Del01.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Del01.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Del02.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Del02.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Prnt01.UP.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Prnt01.UP.BLOCK1")){
			return MS_MSBDL5280_PurcFrcst_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5280.PurcFrcst_Prnt01.DOWN.BLOCK0")){
			return MS_MSBDL5280_PurcFrcst_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Srch01_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("ymd_fr", "ymd_fr"),
				MCItemDef.create("ymd_to", "ymd_to"),
				MCItemDef.create("std_pf_dt", "std_pf_dt"),
				MCItemDef.create("dac_flg", "dac_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("subcon_flg_str", "subcon_flg_str"),
				MCItemDef.create("purc_commit_flg_str", "purc_commit_flg_str"),
				MCItemDef.create("fix_period_flg", "fix_period_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
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
			MCBlockDef.create("PurcFrcst_Srch01_Cnd01")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("PurcFrcst_Srch01_Cnd02")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
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
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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
				MCItemDef.create("pf_period_typ", "pf_period_typ"),
				MCItemDef.create("pf_period_st_dt", "pf_period_st_dt"),
				MCItemDef.create("pf_period_end_dt", "pf_period_end_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_pf_qty", "trd_unit_pf_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_pf_qty", "base_unit_pf_qty")
			}
			,
			MCBlockDef.create("PurcFrcst_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Srch02_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("PurcFrcst_Srch02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch02",
			new MCItemDef[]{
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("PurcFrcst_Srch02_Cnd2")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Srch02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt")
			}
			,
			MCBlockDef.create("PurcFrcst_Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("pf_usr_cd", "pf_usr_cd"),
				MCItemDef.create("pf_dpt_cd", "pf_dpt_cd"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Fix")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_d_no", "purc_frcst_d_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_period_typ", "pf_period_typ"),
				MCItemDef.create("pf_period_st_dt", "pf_period_st_dt"),
				MCItemDef.create("pf_period_end_dt", "pf_period_end_dt"),
				MCItemDef.create("fix_period_flg", "fix_period_flg"),
				MCItemDef.create("trd_unit_pf_qty", "trd_unit_pf_qty"),
				MCItemDef.create("trd_unit_prms_qty", "trd_unit_prms_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_dt", "pf_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("pf_usr_cd", "pf_usr_cd"),
				MCItemDef.create("pf_dpt_cd", "pf_dpt_cd"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Fix")
		);
	}
	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_d_no", "purc_frcst_d_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_period_typ", "pf_period_typ"),
				MCItemDef.create("pf_period_st_dt", "pf_period_st_dt"),
				MCItemDef.create("pf_period_end_dt", "pf_period_end_dt"),
				MCItemDef.create("fix_period_flg", "fix_period_flg"),
				MCItemDef.create("trd_unit_pf_qty", "trd_unit_pf_qty"),
				MCItemDef.create("base_unit_pf_qty", "base_unit_pf_qty"),
				MCItemDef.create("trd_unit_prms_qty", "trd_unit_prms_qty"),
				MCItemDef.create("base_unit_prms_qty", "base_unit_prms_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Chk03_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_rpt_no", "pf_rpt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk03_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_rpt_no", "pf_rpt_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Chk03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("pf_usr_cd", "pf_usr_cd"),
				MCItemDef.create("pf_dpt_cd", "pf_dpt_cd"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("PurcFrcst_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("rpt_rmrks", "rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("PurcFrcst_Upd01_Fix")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("purc_frcst_d_no", "purc_frcst_d_no"),
				MCItemDef.create("purc_frcst_fix_no", "purc_frcst_fix_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("fix_period_flg", "fix_period_flg"),
				MCItemDef.create("trd_unit_pf_qty", "trd_unit_pf_qty"),
				MCItemDef.create("base_unit_pf_qty", "base_unit_pf_qty"),
				MCItemDef.create("trd_unit_prms_qty", "trd_unit_prms_qty"),
				MCItemDef.create("base_unit_prms_qty", "base_unit_prms_qty")
			}
			,
			MCBlockDef.create("PurcFrcst_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("PurcFrcst_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("PurcFrcst_Upd01_Fix")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Del01_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("PurcFrcst_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Del02_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PurcFrcst_Del02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("PurcFrcst_Del02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5280_PurcFrcst_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL5280", "PurcFrcst_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_frcst_no", "purc_frcst_no")
			}
			,
			MCBlockDef.create("PurcFrcst_Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Prnt01_CndR")
		);
	}


	public static MCContainerDef MS_MSBDL5280_PurcFrcst_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5280", "PurcFrcst_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pf_rpt_no", "pf_rpt_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcFrcst_Prnt01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

