package mcframe.serverMSBG.MSBGL0030;

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
 * [MSBGL_BillSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0030.Srch01.UP.BLOCK0")){
			return MS_MSBGL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0030.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0030.Prnt01.UP.BLOCK0")){
			return MS_MSBGL0030_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0030.Prnt01.UP.BLOCK1")){
			return MS_MSBGL0030_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0030.Prnt01.DOWN.BLOCK0")){
			return MS_MSBGL0030_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0030_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("not_cl_flg", "not_cl_flg"),
				MCItemDef.create("cl_batch_flg", "cl_batch_flg"),
				MCItemDef.create("cl_scrn_flg", "cl_scrn_flg"),
				MCItemDef.create("each_sls_flg", "each_sls_flg"),
				MCItemDef.create("not_prnt_flg", "not_prnt_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("dmstic_flg", "dmstic_flg"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("not_adjst_flg", "not_adjst_flg"),
				MCItemDef.create("adjst_flg", "adjst_flg"),
				MCItemDef.create("bill_cl_ym_from", "bill_cl_ym_from"),
				MCItemDef.create("bill_cl_ym_to", "bill_cl_ym_to"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("rcv_schd_dt_from", "rcv_schd_dt_from"),
				MCItemDef.create("rcv_schd_dt_to", "rcv_schd_dt_to"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("inc_no_bill_flg", "inc_no_bill_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_prnt_ex_flg", "not_prnt_ex_flg"),
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("on_edi_flg", "on_edi_flg"),
				MCItemDef.create("off_edi_flg", "off_edi_flg"),
				MCItemDef.create("pre_bill_no", "pre_bill_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("bill_cl_ym", "bill_cl_ym"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bill_rev", "bill_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("pre_bill_no", "pre_bill_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("multi_flg", "multi_flg"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("pre_bill_dt", "pre_bill_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("last_bill_amt", "last_bill_amt"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("bill_amt", "bill_amt"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("bill_cl_sts_typ", "bill_cl_sts_typ"),
				MCItemDef.create("bill_cl_sts_typ_nm", "bill_cl_sts_typ_nm"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("sort_ord_flg", "sort_ord_flg"),
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("adjst_flg", "adjst_flg"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("d_cnt", "d_cnt"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0030_Prnt01_INFO = new MCOperationInfo("MS", "MSBGL0030", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0030_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_no", "bill_no")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBGL0030_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0030_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0030", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

