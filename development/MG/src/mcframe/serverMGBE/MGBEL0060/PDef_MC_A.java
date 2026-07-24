package mcframe.serverMGBE.MGBEL0060;

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
 * [MGBEL_StdAlcSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBEL0060.Srch01.UP.BLOCK0")){
			return MG_MGBEL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBEL0060.Srch01.DOWN.BLOCK0")){
			return MG_MGBEL0060_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBEL0060_Srch01_INFO = new MCOperationInfo("MG", "MGBEL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBEL0060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("no_loc_flg", "no_loc_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("no_sppl_flg", "no_sppl_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("no_cst_flg", "no_cst_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("no_dlv_flg", "no_dlv_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("no_dest1_flg", "no_dest1_flg"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("no_dest2_flg", "no_dest2_flg"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("no_dest3_flg", "no_dest3_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("no_dpt_flg", "no_dpt_flg"),
				MCItemDef.create("expns_grp_cd", "expns_grp_cd"),
				MCItemDef.create("expns_grp_nm", "expns_grp_nm"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("expns_typ", "expns_typ"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_nm1", "alc_ac_grp_nm1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_nm2", "alc_ac_grp_nm2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("alc_ac_grp_nm3", "alc_ac_grp_nm3"),
				MCItemDef.create("dpt_cd2", "dpt_cd2"),
				MCItemDef.create("dpt_nm2", "dpt_nm2"),
				MCItemDef.create("no_dpt2_flg", "no_dpt2_flg"),
				MCItemDef.create("loc_cd2", "loc_cd2"),
				MCItemDef.create("loc_nm2", "loc_nm2"),
				MCItemDef.create("no_loc2_flg", "no_loc2_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("no_oper_flg", "no_oper_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("no_bp_flg", "no_bp_flg"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("no_ctg_flg", "no_ctg_flg"),
				MCItemDef.create("itm_cd2", "itm_cd2"),
				MCItemDef.create("itm_sub1_2", "itm_sub1_2"),
				MCItemDef.create("itm_sub2_2", "itm_sub2_2"),
				MCItemDef.create("itm_sub3_2", "itm_sub3_2"),
				MCItemDef.create("itm_nm2", "itm_nm2"),
				MCItemDef.create("no_itm2_flg", "no_itm2_flg"),
				MCItemDef.create("amt_zero_flg", "amt_zero_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBEL0060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("expns_grp_cd", "expns_grp_cd"),
				MCItemDef.create("expns_grp_nm", "expns_grp_nm"),
				MCItemDef.create("expnsg_seq", "expnsg_seq"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("expns_seq", "expns_seq"),
				MCItemDef.create("alc_ptn_cd", "alc_ptn_cd"),
				MCItemDef.create("alc_ptn_nm", "alc_ptn_nm"),
				MCItemDef.create("alc_amt", "alc_amt"),
				MCItemDef.create("alc_tgt_val", "alc_tgt_val"),
				MCItemDef.create("alc_rate", "alc_rate"),
				MCItemDef.create("coef_val", "coef_val"),
				MCItemDef.create("alc_org_tgt_val", "alc_org_tgt_val")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

