package mcframe.serverMSBD.MSBDL5190;

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
 * [MSBDL_VmiService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5190.Vmi_Chk01.UP.BLOCK0")){
			return MS_MSBDL5190_Vmi_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5190.Vmi_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5190_Vmi_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5190.Vmi_Upd01.UP.BLOCK0")){
			return MS_MSBDL5190_Vmi_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBDL5190_Vmi_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5190", "Vmi_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5190_Vmi_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5190", "Vmi_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_src_typ", "purc_src_typ"),
				MCItemDef.create("purc_src_no", "purc_src_no"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ")
			}
			,
			MCBlockDef.create("Vmi_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5190_Vmi_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5190", "Vmi_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_src_typ", "purc_src_typ"),
				MCItemDef.create("purc_src_no", "purc_src_no"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("ap_cred_cd", "ap_cred_cd")
			}
			,
			MCBlockDef.create("Vmi_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5190_Vmi_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5190", "Vmi_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5190_Vmi_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5190", "Vmi_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("purc_src_typ", "purc_src_typ"),
				MCItemDef.create("purc_src_no", "purc_src_no"),
				MCItemDef.create("purc_dt", "purc_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri")
			}
			,
			MCBlockDef.create("Vmi_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

