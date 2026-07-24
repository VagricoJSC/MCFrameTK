package mcframe.clientMGBD.MGBDP0250;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBDP_PreAlcChk]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0250.Srch01.UP.BLOCK0")){
			return MG_MGBDL0250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0250.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0250.Srch01.DOWN.BLOCK1")){
			return MG_MGBDL0250_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBDL0250_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0250", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0250_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no_p" + ".calc_no", "calc_no"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("src_wg_cd", "src_wg_cd"),
				MCItemDef.create("src_wg_nm", "src_wg_nm"),
				MCItemDef.create("src_alc_ac_cd", "src_alc_ac_cd"),
				MCItemDef.create("src_alc_ac_nm", "src_alc_ac_nm"),
				MCItemDef.create("src_alc_ac_grp_cd1", "src_alc_ac_grp_cd1"),
				MCItemDef.create("src_alc_ac_grp_nm1", "src_alc_ac_grp_nm1"),
				MCItemDef.create("src_alc_ac_grp_cd2", "src_alc_ac_grp_cd2"),
				MCItemDef.create("src_alc_ac_grp_nm2", "src_alc_ac_grp_nm2"),
				MCItemDef.create("src_alc_ac_grp_cd3", "src_alc_ac_grp_cd3"),
				MCItemDef.create("src_alc_ac_grp_nm3", "src_alc_ac_grp_nm3"),
				MCItemDef.create("dest_wg_cd", "dest_wg_cd"),
				MCItemDef.create("dest_wg_nm", "dest_wg_nm"),
				MCItemDef.create("dest_alc_ac_cd", "dest_alc_ac_cd"),
				MCItemDef.create("dest_alc_ac_nm", "dest_alc_ac_nm"),
				MCItemDef.create("dest_alc_ac_grp_cd1", "dest_alc_ac_grp_cd1"),
				MCItemDef.create("dest_alc_ac_grp_nm1", "dest_alc_ac_grp_nm1"),
				MCItemDef.create("dest_alc_ac_grp_cd2", "dest_alc_ac_grp_cd2"),
				MCItemDef.create("dest_alc_ac_grp_nm2", "dest_alc_ac_grp_nm2"),
				MCItemDef.create("dest_alc_ac_grp_cd3", "dest_alc_ac_grp_cd3"),
				MCItemDef.create("dest_alc_ac_grp_nm3", "dest_alc_ac_grp_nm3"),
				MCItemDef.create("pre_alc_lvl_flg", "pre_alc_lvl_flg"),
				MCItemDef.create("src_wg_flg", "src_wg_flg"),
				MCItemDef.create("src_alc_ac_flg", "src_alc_ac_flg"),
				MCItemDef.create("dest_wg_flg", "dest_wg_flg"),
				MCItemDef.create("dest_alc_ac_flg", "dest_alc_ac_flg"),
				MCItemDef.create("ym_flg", "ym_flg"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("ctg_flg", "ctg_flg"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_typ_flg", "itm_typ_flg"),
				MCItemDef.create("itm_typ_d_flg", "itm_typ_d_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("sublot_flg", "sublot_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("itm_mfg_inst_flg", "itm_mfg_inst_flg"),
				MCItemDef.create("iv_flg", "iv_flg"),
				MCItemDef.create("po_flg", "po_flg"),
				MCItemDef.create("slo_flg", "slo_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0250_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_lvl", "pre_alc_lvl"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("wg_cd2", "wg_cd2"),
				MCItemDef.create("wg_nm2", "wg_nm2"),
				MCItemDef.create("alc_ac_cd2", "alc_ac_cd2"),
				MCItemDef.create("alc_ac_nm2", "alc_ac_nm2"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("col_all", "col_all")
			}
			,
			MCBlockDef.create("DispDtl")
		);
	}
	public static MCContainerDef MG_MGBDL0250_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Key] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd2"),
				MCItemDef.create("dpt_nm", "dpt_nm2")
			}
			,
			MCBlockDef.create("Key")
		);
	}
	//FMCB DEF_CLASSES END
}

