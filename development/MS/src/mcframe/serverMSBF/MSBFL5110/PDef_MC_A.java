package mcframe.serverMSBF.MSBFL5110;

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
 * [MSBFL_MrktJudgService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk01.UP.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk02.UP.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk03.UP.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Chk03.DOWN.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Upd01.UP.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5110.MrktJudg_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5110_MrktJudg_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBFL5110_MrktJudg_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5110", "MrktJudg_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fromScrFlg", "fromScrFlg"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("upd_usr_cd", "upd_usr_cd"),
				MCItemDef.create("upd_dpt_cd", "upd_dpt_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("no_del_flg", "no_del_flg"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mrkt_judg_src_typ", "mrkt_judg_src_typ"),
				MCItemDef.create("mrkt_judg_src_no", "mrkt_judg_src_no"),
				MCItemDef.create("mrkt_judg_src_no_del", "mrkt_judg_src_no_del")
			}
			,
			MCBlockDef.create("MrktJudg_Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MrktJudg_Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5110_MrktJudg_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5110", "MrktJudg_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("pre_inst_flg", "pre_inst_flg")
			}
			,
			MCBlockDef.create("MrktJudg_Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MrktJudg_Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5110_MrktJudg_Chk03_INFO = new MCOperationInfo("MS", "MSBFL5110", "MrktJudg_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("MrktJudg_Chk03_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5110_MrktJudg_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MrktJudg_Chk03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5110_MrktJudg_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5110", "MrktJudg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5110_MrktJudg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fromScrFlg", "fromScrFlg"),
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mfg_so_aprv_typ", "mfg_so_aprv_typ"),
				MCItemDef.create("quality_mng_typ", "quality_mng_typ"),
				MCItemDef.create("mfg_mng_typ", "mfg_mng_typ"),
				MCItemDef.create("deviant_typ", "deviant_typ"),
				MCItemDef.create("deviant_msr_typ", "deviant_msr_typ"),
				MCItemDef.create("prod_itm_info_typ", "prod_itm_info_typ"),
				MCItemDef.create("chd_itm_info_typ", "chd_itm_info_typ"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("upd_usr_cd", "upd_usr_cd"),
				MCItemDef.create("upd_dpt_cd", "upd_dpt_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("no_del_flg", "no_del_flg"),
				MCItemDef.create("add_flg", "add_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mrkt_judg_src_typ", "mrkt_judg_src_typ"),
				MCItemDef.create("mrkt_judg_src_no", "mrkt_judg_src_no"),
				MCItemDef.create("mrkt_judg_src_no_del", "mrkt_judg_src_no_del"),
				MCItemDef.create("vld_dt", "vld_dt")
			}
			,
			MCBlockDef.create("MrktJudg_Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5110_MrktJudg_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5110", "MrktJudg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("mrkt_judg_no", "mrkt_judg_no"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm")
			}
			,
			MCBlockDef.create("MrktJudg_Upd01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

