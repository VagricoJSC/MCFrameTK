package mcframe.serverMSBG.MSBGL0070;

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
 * [MSBGL_RcvSchdSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0070.Srch01.UP.BLOCK0")){
			return MS_MSBGL0070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0070.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0070_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0070_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0070", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0070_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("not_adjst_flg", "not_adjst_flg"),
				MCItemDef.create("adjst_flg", "adjst_flg"),
				MCItemDef.create("schd_act_rcv_dt_fr", "schd_act_rcv_dt_fr"),
				MCItemDef.create("schd_act_rcv_dt_to", "schd_act_rcv_dt_to"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("dtl_flg", "dtl_flg"),
				MCItemDef.create("key_flg", "key_flg"),
				MCItemDef.create("inc_appl_flg", "inc_appl_flg"),
				MCItemDef.create("inc_not_cl_flg", "inc_not_cl_flg"),
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("rfrnc_dt", "rfrnc_dt"),
				MCItemDef.create("bcst_grp_flg1", "bcst_grp_flg1"),
				MCItemDef.create("bcst_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_flg2", "bcst_grp_flg2"),
				MCItemDef.create("bcst_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_flg3", "bcst_grp_flg3"),
				MCItemDef.create("bcst_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_flg4", "bcst_grp_flg4"),
				MCItemDef.create("bcst_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_flg5", "bcst_grp_flg5"),
				MCItemDef.create("bcst_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_flg6", "bcst_grp_flg6"),
				MCItemDef.create("bcst_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_flg7", "bcst_grp_flg7"),
				MCItemDef.create("bcst_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_flg8", "bcst_grp_flg8"),
				MCItemDef.create("bcst_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_flg9", "bcst_grp_flg9"),
				MCItemDef.create("bcst_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_flg10", "bcst_grp_flg10"),
				MCItemDef.create("bcst_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_nm10", "bcst_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0070_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("schd_act_rcv_dt", "schd_act_rcv_dt"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("rcv_reg_typ", "rcv_reg_typ"),
				MCItemDef.create("rcv_schd_amt", "rcv_schd_amt"),
				MCItemDef.create("rcv_act_amt", "rcv_act_amt"),
				MCItemDef.create("not_appl_bal", "not_appl_bal"),
				MCItemDef.create("delay", "delay"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("adjst_flg", "adjst_flg"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("bcst_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_nm10", "bcst_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

