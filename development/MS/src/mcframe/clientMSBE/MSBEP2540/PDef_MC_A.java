package mcframe.clientMSBE.MSBEP2540;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_BomEx]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL2540.Srch01.UP.BLOCK0")){
			return MS_MSBEL2540_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2540.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL2540_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL2540_Srch01_INFO = new MCOperationInfo("MS", "MSBEL2540", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2540_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("bom_ptn_flg", "bom_ptn_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL2540_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL2540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hrrchy_p" + ".hrrchy", "bom_lvl"),
				MCItemDef.create("hrrchy_p" + ".extno", "extno"),
				MCItemDef.create("hrrchy_p" + ".par_extno", "par_extno"),
				MCItemDef.create("hrrchy_p" + ".loop_flg", "loop_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("not_new_lot_flg", "not_new_lot_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("cont_qty_p" + ".cont_qty", "std_cont_fctr_qty"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ_nm1", "sno_typ_nm1"),
				MCItemDef.create("max_sno_p" + ".sno1", "max_sno1"),
				MCItemDef.create("min_sno_p" + ".sno1", "min_sno1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ_nm2", "sno_typ_nm2"),
				MCItemDef.create("max_sno_p" + ".sno2", "max_sno2"),
				MCItemDef.create("min_sno_p" + ".sno2", "min_sno2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ_nm3", "sno_typ_nm3"),
				MCItemDef.create("max_sno_p" + ".sno3", "max_sno3"),
				MCItemDef.create("min_sno_p" + ".sno3", "min_sno3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("sno_typ_nm4", "sno_typ_nm4"),
				MCItemDef.create("max_sno_p" + ".sno4", "max_sno4"),
				MCItemDef.create("min_sno_p" + ".sno4", "min_sno4")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

