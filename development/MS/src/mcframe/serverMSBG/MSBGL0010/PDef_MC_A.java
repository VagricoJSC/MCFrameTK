package mcframe.serverMSBG.MSBGL0010;

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
 * [MSBGL_BillCl]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0010.Srch02.UP.BLOCK0")){
			return MS_MSBGL0010_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Srch02.DOWN.BLOCK0")){
			return MS_MSBGL0010_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Srch01.UP.BLOCK0")){
			return MS_MSBGL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Chk01.UP.BLOCK0")){
			return MS_MSBGL0010_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Chk01.UP.BLOCK1")){
			return MS_MSBGL0010_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0010.Chk01.DOWN.BLOCK0")){
			return MS_MSBGL0010_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Chk01.DOWN.BLOCK1")){
			return MS_MSBGL0010_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0010.Upd01.UP.BLOCK0")){
			return MS_MSBGL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Upd01.UP.BLOCK1")){
			return MS_MSBGL0010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0010.Upd01.UP.BLOCK2")){
			return MS_MSBGL0010_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0010.Upd01.DOWN.BLOCK0")){
			return MS_MSBGL0010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Chk02.UP.BLOCK0")){
			return MS_MSBGL0010_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Chk02.DOWN.BLOCK0")){
			return MS_MSBGL0010_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Del01.UP.BLOCK0")){
			return MS_MSBGL0010_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0010.Del01.DOWN.BLOCK0")){
			return MS_MSBGL0010_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBGL0010_Srch02_INFO = new MCOperationInfo("MS", "MSBGL0010", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("on_edi_flg", "on_edi_flg"),
				MCItemDef.create("off_edi_flg", "off_edi_flg"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("manual_flg", "manual_flg"),
				MCItemDef.create("sel_flg", "sel_flg"),
				MCItemDef.create("each_sls_flg", "each_sls_flg"),
				MCItemDef.create("batch_flg", "batch_flg"),
				MCItemDef.create("new_flg", "new_flg")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg"),
				MCItemDef.create("last_bill_ym", "last_bill_ym"),
				MCItemDef.create("last_bill_cl_day", "last_bill_cl_day"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_typ_nm", "bill_cl_typ_nm"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0010_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("on_edi_flg", "on_edi_flg"),
				MCItemDef.create("off_edi_flg", "off_edi_flg"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("manual_flg", "manual_flg"),
				MCItemDef.create("sel_flg", "sel_flg"),
				MCItemDef.create("each_sls_flg", "each_sls_flg"),
				MCItemDef.create("batch_flg", "batch_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg"),
				MCItemDef.create("last_bill_ym", "last_bill_ym"),
				MCItemDef.create("last_bill_cl_day", "last_bill_cl_day"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_typ_nm", "bill_cl_typ_nm"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0010_Chk01_INFO = new MCOperationInfo("MS", "MSBGL0010", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("inpt_bill_ym", "inpt_bill_ym"),
				MCItemDef.create("inpt_rcv_schd_dt", "inpt_rcv_schd_dt"),
				MCItemDef.create("inpt_bill_cl_day", "inpt_bill_cl_day"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("rec_id", "rec_id")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0010_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("bill_mtd_typ", "bill_mtd_typ"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("bill_prnt_tgt_flg", "bill_prnt_tgt_flg"),
				MCItemDef.create("rec_id", "rec_id"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("inpt_bill_ym", "inpt_bill_ym"),
				MCItemDef.create("inpt_rcv_schd_dt", "inpt_rcv_schd_dt"),
				MCItemDef.create("inpt_bill_cl_day", "inpt_bill_cl_day"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("rec_id", "rec_id")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0010_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("bill_mtd_typ", "bill_mtd_typ"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("bill_prnt_tgt_flg", "bill_prnt_tgt_flg"),
				MCItemDef.create("rec_id", "rec_id"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0010_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("inpt_bill_ym", "inpt_bill_ym"),
				MCItemDef.create("inpt_rcv_schd_dt", "inpt_rcv_schd_dt"),
				MCItemDef.create("inpt_bill_cl_day", "inpt_bill_cl_day"),
				MCItemDef.create("bill_d_sel_flg", "bill_d_sel_flg"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("rec_id", "rec_id")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0010_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("bill_mtd_typ", "bill_mtd_typ"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("bill_prnt_tgt_flg", "bill_prnt_tgt_flg"),
				MCItemDef.create("rec_id", "rec_id"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL0010_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("inpt_rcv_schd_dt", "inpt_rcv_schd_dt"),
				MCItemDef.create("bill_no", "bill_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0010_Chk02_INFO = new MCOperationInfo("MS", "MSBGL0010", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0010_Del01_INFO = new MCOperationInfo("MS", "MSBGL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBGL0010_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

