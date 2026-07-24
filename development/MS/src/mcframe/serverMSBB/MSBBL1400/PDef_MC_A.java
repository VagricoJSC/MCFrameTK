package mcframe.serverMSBB.MSBBL1400;

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
 * [MSBBL_SlsSumSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1400.Srch01.UP.BLOCK0")){
			return MS_MSBBL1400_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1400.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1400_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1400.Srch02.UP.BLOCK0")){
			return MS_MSBBL1400_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1400.Srch02.DOWN.BLOCK0")){
			return MS_MSBBL1400_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBL1400_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1400", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1400_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("inpt_ym", "inpt_ym"),
				MCItemDef.create("sls_trnst_disp", "sls_trnst_disp"),
				MCItemDef.create("sls_disp_term", "sls_disp_term"),
				MCItemDef.create("sum_term", "sum_term"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("use_act_xrate_flg", "use_act_xrate_flg"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1400_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1400", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_lvl_cd", "dpt_lvl_cd"),
				MCItemDef.create("dpt_lvl_nm", "dpt_lvl_nm"),
				MCItemDef.create("dpt1", "dpt1"),
				MCItemDef.create("dpt_nm1", "dpt_nm1"),
				MCItemDef.create("dpt2", "dpt2"),
				MCItemDef.create("dpt_nm2", "dpt_nm2"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("slo_amt", "slo_amt"),
				MCItemDef.create("slo_prof_amt", "slo_prof_amt"),
				MCItemDef.create("slo_prof_rate", "slo_prof_rate"),
				MCItemDef.create("spln_per_cmpl_slo_amt", "spln_per_cmpl_slo_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_amt", "bdg_per_cmpl_slo_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_prof_amt", "bdg_per_cmpl_slo_prof_amt"),
				MCItemDef.create("slo_bl_amt", "slo_bl_amt"),
				MCItemDef.create("slo_bl_prof_amt", "slo_bl_prof_amt"),
				MCItemDef.create("slo_bl_prof_rate", "slo_bl_prof_rate"),
				MCItemDef.create("spln_per_cmpl_slo_bl_amt", "spln_per_cmpl_slo_bl_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_bl_amt", "bdg_per_cmpl_slo_bl_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_bl_prof_amt", "bdg_per_cmpl_slo_bl_prof_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("sls_prof_amt", "sls_prof_amt"),
				MCItemDef.create("sls_prof_rate", "sls_prof_rate"),
				MCItemDef.create("sum_amt", "sum_amt"),
				MCItemDef.create("sum_prof_amt", "sum_prof_amt"),
				MCItemDef.create("sum_prof_rate", "sum_prof_rate"),
				MCItemDef.create("spln_per_cmpl_sum_amt", "spln_per_cmpl_sum_amt"),
				MCItemDef.create("bdg_per_cmpl_sum_amt", "bdg_per_cmpl_sum_amt"),
				MCItemDef.create("bdg_per_cmpl_sum_prof_amt", "bdg_per_cmpl_sum_prof_amt"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("spln_per_cmpl_sls_amt", "spln_per_cmpl_sls_amt"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_per_cmpl_sls_amt", "bdg_per_cmpl_sls_amt"),
				MCItemDef.create("bdg_per_cmpl_sls_prof_amt", "bdg_per_cmpl_sls_prof_amt"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("rate_dec_place", "rate_dec_place")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1400_Srch02_INFO = new MCOperationInfo("MS", "MSBBL1400", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1400_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("inpt_ym", "inpt_ym"),
				MCItemDef.create("sls_trnst_disp", "sls_trnst_disp"),
				MCItemDef.create("sls_disp_term", "sls_disp_term"),
				MCItemDef.create("sum_term", "sum_term"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("use_act_xrate_flg", "use_act_xrate_flg"),
				MCItemDef.create("sls_itm_grp_lvl", "sls_itm_grp_lvl"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("sls_itm_grp_nm", "sls_itm_grp_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1400_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1400", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("data_typ", "data_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_grp1", "itm_grp1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp2", "itm_grp2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("slo_qty", "slo_qty"),
				MCItemDef.create("slo_amt", "slo_amt"),
				MCItemDef.create("slo_prof_amt", "slo_prof_amt"),
				MCItemDef.create("slo_prof_rate", "slo_prof_rate"),
				MCItemDef.create("spln_per_cmpl_slo_qty", "spln_per_cmpl_slo_qty"),
				MCItemDef.create("spln_per_cmpl_slo_amt", "spln_per_cmpl_slo_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_amt", "bdg_per_cmpl_slo_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_prof_amt", "bdg_per_cmpl_slo_prof_amt"),
				MCItemDef.create("slo_bl_qty", "slo_bl_qty"),
				MCItemDef.create("slo_bl_amt", "slo_bl_amt"),
				MCItemDef.create("slo_bl_prof_amt", "slo_bl_prof_amt"),
				MCItemDef.create("slo_bl_prof_rate", "slo_bl_prof_rate"),
				MCItemDef.create("spln_per_cmpl_slo_bl_qty", "spln_per_cmpl_slo_bl_qty"),
				MCItemDef.create("spln_per_cmpl_slo_bl_amt", "spln_per_cmpl_slo_bl_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_bl_amt", "bdg_per_cmpl_slo_bl_amt"),
				MCItemDef.create("bdg_per_cmpl_slo_bl_prof_amt", "bdg_per_cmpl_slo_bl_prof_amt"),
				MCItemDef.create("sls_qty", "sls_qty"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("sls_prof_amt", "sls_prof_amt"),
				MCItemDef.create("sls_prof_rate", "sls_prof_rate"),
				MCItemDef.create("sum_qty", "sum_qty"),
				MCItemDef.create("sum_amt", "sum_amt"),
				MCItemDef.create("sum_prof_amt", "sum_prof_amt"),
				MCItemDef.create("sum_prof_rate", "sum_prof_rate"),
				MCItemDef.create("spln_per_cmpl_sum_qty", "spln_per_cmpl_sum_qty"),
				MCItemDef.create("spln_per_cmpl_sum_amt", "spln_per_cmpl_sum_amt"),
				MCItemDef.create("bdg_per_cmpl_sum_amt", "bdg_per_cmpl_sum_amt"),
				MCItemDef.create("bdg_per_cmpl_sum_prof_amt", "bdg_per_cmpl_sum_prof_amt"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("spln_amt", "spln_amt"),
				MCItemDef.create("spln_per_cmpl_sls_qty", "spln_per_cmpl_sls_qty"),
				MCItemDef.create("spln_per_cmpl_sls_amt", "spln_per_cmpl_sls_amt"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_per_cmpl_sls_amt", "bdg_per_cmpl_sls_amt"),
				MCItemDef.create("bdg_per_cmpl_sls_prof_amt", "bdg_per_cmpl_sls_prof_amt"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("rate_dec_place", "rate_dec_place")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

