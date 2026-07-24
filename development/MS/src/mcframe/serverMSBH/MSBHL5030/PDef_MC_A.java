package mcframe.serverMSBH.MSBHL5030;

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
 * [MSBHL_PaySchdRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch01.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch01.DOWN.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch02.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch02.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch02.DOWN.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch03.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch03.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch03.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch03.UP.BLOCK3")){
			return MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch03.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch04.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch04.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch05.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch05.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch05.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch05.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.DOWN.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch06.DOWN.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch07.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch07.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch08.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Srch08.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Srch08_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.UP.BLOCK3")){
			return MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.UP.BLOCK4")){
			return MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk02.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk02.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.UP.BLOCK3")){
			return MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.UP.BLOCK4")){
			return MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.DOWN.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Ins01.DOWN.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.UP.BLOCK3")){
			return MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.UP.BLOCK4")){
			return MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.DOWN.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd01.DOWN.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Upd02.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Del01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Del01.UP.BLOCK1")){
			return MS_MSBHL5030_PaySchd_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Del01.UP.BLOCK2")){
			return MS_MSBHL5030_PaySchd_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5030.PaySchd_Lock_Upd01.UP.BLOCK0")){
			return MS_MSBHL5030_PaySchd_Lock_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
															
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("is_ref_xrate", "is_ref_xrate"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("zero_flg", "zero_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch01_Cnd")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_typ", "trd_cur_com_paid_tax_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("ap_setoff_act_flg", "ap_setoff_act_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch02_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_d" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ap_d" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ap_d" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("ap_d" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ap_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ap_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ap_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ap_d" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ap_d" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ap_d" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("cl_dt_grp_flg", "cl_dt_grp_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_d" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ap_d" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ap_d" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("ap_d" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ap_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ap_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ap_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ap_d" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ap_d" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ap_d" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch02_Cnd")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".amt", "amt"),
				MCItemDef.create("pay_chk" + ".last_pay_schd_amt", "last_pay_schd_amt"),
				MCItemDef.create("pay_chk" + ".bfw_amt", "bfw_amt"),
				MCItemDef.create("pay_chk" + ".purc_amt", "purc_amt"),
				MCItemDef.create("pay_chk" + ".purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("pay_chk" + ".purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("pay_chk" + ".sw_to_amt", "sw_to_amt"),
				MCItemDef.create("pay_chk" + ".tax_amt", "tax_amt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch03_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("upd_mode_flg", "upd_mode_flg"),
				MCItemDef.create("srch_tax_diff_flg", "srch_tax_diff_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("bsppl_cl_dt_fr", "bsppl_cl_dt_fr"),
				MCItemDef.create("bsppl_cl_dt_to", "bsppl_cl_dt_to"),
				MCItemDef.create("pay_schd_dt_fr", "pay_schd_dt_fr"),
				MCItemDef.create("pay_schd_dt_to", "pay_schd_dt_to"),
				MCItemDef.create("act_dt_fr", "act_dt_fr"),
				MCItemDef.create("act_dt_to", "act_dt_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("inc_interim_flg", "inc_interim_flg"),
				MCItemDef.create("asppl_grp_flg1", "asppl_grp_flg1"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_flg2", "asppl_grp_flg2"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_flg3", "asppl_grp_flg3"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_flg4", "asppl_grp_flg4"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_flg5", "asppl_grp_flg5"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_flg6", "asppl_grp_flg6"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_flg7", "asppl_grp_flg7"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_flg8", "asppl_grp_flg8"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_flg9", "asppl_grp_flg9"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_flg10", "asppl_grp_flg10"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10"),
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
			MCBlockDef.create("PaySchd_Srch03_Cnd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_Srch03_RqstNoCnd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate")
			}
			,
			MCBlockDef.create("PaySchd_Srch03_CndPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate")
			}
			,
			MCBlockDef.create("PaySchd_Srch03_CndAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_mtd_typ_nm", "pay_mtd_typ_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("po_wrk_no", "po_wrk_no"),
				MCItemDef.create("po_wrk_nm", "po_wrk_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("crryovr_flg", "crryovr_flg"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_seq", "purc_act_seq"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("org_ap_d_no", "org_ap_d_no"),
				MCItemDef.create("crryovr_ap_d_no", "crryovr_ap_d_no"),
				MCItemDef.create("crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("sw_src_rcv_bill_no", "sw_src_rcv_bill_no"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("crryovr_times", "crryovr_times"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
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
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("PaySchd_Srch03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch04_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_schd_ctl" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_schd_ctl" + ".cur_cd", "cur_cd"),
				MCItemDef.create("pay_schd_ctl" + ".sttl_cd", "sttl_cd"),
				MCItemDef.create("pay_schd_ctl" + ".min_amt", "min_amt"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("base_dt", "base_dt")
			}
			,
			MCBlockDef.create("PaySchd_Srch04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt")
			}
			,
			MCBlockDef.create("PaySchd_Srch04_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch05_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch05", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch05",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("PaySchd_Srch05_Cnd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch05",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("PaySchd_Srch05_CndPayAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch05_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch05",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("xrate_base_dt", "xrate_base_dt")
			}
			,
			MCBlockDef.create("PaySchd_Srch05_CndAdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch05",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".po_no", "po_no"),
				MCItemDef.create("ap_d" + ".po_d_no", "po_d_no"),
				MCItemDef.create("ap_d" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("ap_d" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("ap_d" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("ap_d" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("ap_d" + ".purc_act_rev", "purc_act_rev"),
				MCItemDef.create("ap_d" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("ap_d" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ap_d" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("ap_d" + ".ap_typ", "ap_typ"),
				MCItemDef.create("ap_d" + ".trd_cd", "trd_cd"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ap_d" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ap_d" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_d" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_d" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_d" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_d" + ".sno1", "sno1"),
				MCItemDef.create("ap_d" + ".sno2", "sno2"),
				MCItemDef.create("ap_d" + ".sno3", "sno3"),
				MCItemDef.create("ap_d" + ".sno4", "sno4"),
				MCItemDef.create("ap_d" + ".act_dt", "act_dt"),
				MCItemDef.create("ap_d" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("ap_d" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("ap_d" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("ap_d" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("ap_d" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ap_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ap_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ap_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ap_d" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ap_d" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("ap_d" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("ap_d" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("ap_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("ap_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("ap_d" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ap_d" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ap_d" + ".tax_cd", "tax_cd"),
				MCItemDef.create("ap_d" + ".interim_flg", "interim_flg"),
				MCItemDef.create("ap_d" + ".xrate", "xrate"),
				MCItemDef.create("ap_d" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ap_d" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ap_d" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("ap_d" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ap_d" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("ap_d" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("ap_d" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("ap_d" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ap_d" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ap_d" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("ap_d" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("ap_d" + ".pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("ap_d" + ".org_ap_d_no", "org_ap_d_no"),
				MCItemDef.create("ap_d" + ".crryovr_ap_d_no", "crryovr_ap_d_no"),
				MCItemDef.create("ap_d" + ".crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("ap_d" + ".sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("ap_d" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("ap_d" + ".crryovr_flg", "crryovr_flg"),
				MCItemDef.create("ap_d" + ".valid_flg", "valid_flg"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("ap_d" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("ap_d" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("ap_d" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("ap_d" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("ap_d" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("ap_d" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("ap_d" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ap_d" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("ap_d" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no"),
				MCItemDef.create("amt_disp_pm", "amt_disp_pm"),
				MCItemDef.create("sw_src_rcv_bill_no", "sw_src_rcv_bill_no")
			}
			,
			MCBlockDef.create("PaySchd_Srch05_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch06_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch06", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".amt", "amt"),
				MCItemDef.create("pay_chk" + ".purc_amt", "purc_amt"),
				MCItemDef.create("pay_chk" + ".purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("pay_chk" + ".purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("pay_chk" + ".sw_to_amt", "sw_to_amt"),
				MCItemDef.create("pay_chk" + ".tax_amt", "tax_amt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("not_lock_flg", "not_lock_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_Rslt")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_PayAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_AdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".amt", "amt"),
				MCItemDef.create("pay_chk" + ".last_pay_schd_amt", "last_pay_schd_amt"),
				MCItemDef.create("pay_chk" + ".bfw_amt", "bfw_amt"),
				MCItemDef.create("pay_chk" + ".purc_amt", "purc_amt"),
				MCItemDef.create("pay_chk" + ".purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("pay_chk" + ".purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("pay_chk" + ".sw_to_amt", "sw_to_amt"),
				MCItemDef.create("pay_chk" + ".tax_amt", "tax_amt"),
				MCItemDef.create("pay_chk" + ".account_amt", "account_amt"),
				MCItemDef.create("pay_chk" + ".cash_amt", "cash_amt"),
				MCItemDef.create("pay_chk" + ".note_amt", "note_amt"),
				MCItemDef.create("pay_chk" + ".setoff_amt", "setoff_amt"),
				MCItemDef.create("pay_chk" + ".setoff_tax_amt", "setoff_tax_amt"),
				MCItemDef.create("pay_chk" + ".sw_amt", "sw_amt"),
				MCItemDef.create("pay_chk" + ".schd_pay_amt", "schd_pay_amt"),
				MCItemDef.create("pay_chk" + ".adv_pay_amt", "adv_pay_amt"),
				MCItemDef.create("pay_chk" + ".adv_pay_setoff_amt", "adv_pay_setoff_amt"),
				MCItemDef.create("pay_chk" + ".adv_pay_setoff_tax_amt", "adv_pay_setoff_tax_amt"),
				MCItemDef.create("pay_chk" + ".adv_pay_bal", "adv_pay_bal"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_Rslt")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_PayAct")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch06_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch06",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq")
			}
			,
			MCBlockDef.create("PaySchd_Srch06_AdvPayAct")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch07_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch07", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch07",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("reg_only_flg", "reg_only_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch07_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch07",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("calc_tgt_pay_chk_mng_no", "calc_tgt_pay_chk_mng_no"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg"),
				MCItemDef.create("pay_act_upd_cntr", "pay_act_upd_cntr"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_Srch07_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Srch08_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Srch08", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch08",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("reg_only_flg", "reg_only_flg")
			}
			,
			MCBlockDef.create("PaySchd_Srch08_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Srch08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Srch08",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("com_paid_ap_sttl_nm", "com_paid_ap_sttl_nm"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_Srch08_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_chk" + ".man_reg_flg", "man_reg_flg"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("co_psppl_cl_day", "co_psppl_cl_day"),
				MCItemDef.create("co_psppl_cl_dt", "co_psppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ap_d" + ".slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("ap_d" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_d" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_d" + ".ap_typ", "ap_typ"),
				MCItemDef.create("ap_d" + ".interim_flg", "interim_flg"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_schd" + ".trd_cur_exc_com_paid", "trd_cur_exc_com_paid"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_DtlAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_AdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Chk02_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Ins01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_chk" + ".man_reg_flg", "man_reg_flg"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_act_not_ref_flg", "pay_act_not_ref_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("co_psppl_cl_day", "co_psppl_cl_day"),
				MCItemDef.create("co_psppl_cl_dt", "co_psppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("co_ap_d_no", "co_ap_d_no"),
				MCItemDef.create("co_src_ap_d_no", "co_src_ap_d_no"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_schd" + ".trd_cur_exc_com_paid", "trd_cur_exc_com_paid"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_DtlAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_AdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk" + ".pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("pay_chk" + ".pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_chk" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("pay_chk" + ".aprv_no", "aprv_no"),
				MCItemDef.create("pay_chk" + ".aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Upd01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk" + ".reg_dt", "reg_dt"),
				MCItemDef.create("pay_chk" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_usr_cd", "bsppl_usr_cd"),
				MCItemDef.create("pay_chk" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_chk" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pay_chk" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pay_chk" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pay_chk" + ".pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("pay_chk" + ".bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("pay_chk" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pay_chk" + ".pay_xrate", "pay_xrate"),
				MCItemDef.create("pay_chk" + ".batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_chk" + ".man_reg_flg", "man_reg_flg"),
				MCItemDef.create("pay_chk" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("pay_chk" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_chk" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_chk" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_chk" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_act_not_ref_flg", "pay_act_not_ref_flg"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("co_psppl_cl_day", "co_psppl_cl_day"),
				MCItemDef.create("co_psppl_cl_dt", "co_psppl_cl_dt"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d" + ".pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ap_d" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("ap_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ap_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ap_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ap_d" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("co_ap_d_no", "co_ap_d_no"),
				MCItemDef.create("co_src_ap_d_no", "co_src_ap_d_no"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt"),
				MCItemDef.create("ref_ap_d_no", "ref_ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_schd" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_schd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pay_schd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pay_schd" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_schd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pay_schd" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_schd" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_schd" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pay_schd" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pay_schd" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pay_schd" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_schd" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pay_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pay_schd" + ".xrate", "xrate"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pay_schd" + ".trd_cur_com_paid_tax_amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_schd" + ".trd_cur_exc_com_paid", "trd_cur_exc_com_paid"),
				MCItemDef.create("pay_schd" + ".rcv_bill_no", "rcv_bill_no"),
				MCItemDef.create("pay_schd" + ".note_no", "note_no"),
				MCItemDef.create("pay_schd" + ".note_typ", "note_typ"),
				MCItemDef.create("pay_schd" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pay_schd" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pay_schd" + ".due_dt", "due_dt"),
				MCItemDef.create("pay_schd" + ".note_days", "note_days"),
				MCItemDef.create("pay_schd" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pay_schd" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pay_schd" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pay_schd" + ".endrsr", "endrsr"),
				MCItemDef.create("pay_schd" + ".accptr", "accptr"),
				MCItemDef.create("pay_schd" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pay_schd" + ".pay_schd_print_rmrks", "pay_schd_print_rmrks"),
				MCItemDef.create("pay_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pay_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pay_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pay_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pay_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_act_d" + ".upd_cntr", "pay_act_upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_DtlAct")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act" + ".adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act" + ".upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("PaySchd_AdvPayAct")
		);
	}


	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pay_chk" + ".pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("pay_chk" + ".pay_sts_typ", "pay_sts_typ"),
				MCItemDef.create("pay_chk" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("pay_chk" + ".aprv_no", "aprv_no"),
				MCItemDef.create("pay_chk" + ".aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Upd02_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Del01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_chk" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg")
			}
			,
			MCBlockDef.create("PaySchd_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ap_d" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("co_ap_d_no", "co_ap_d_no"),
				MCItemDef.create("co_src_ap_d_no", "co_src_ap_d_no")
			}
			,
			MCBlockDef.create("PaySchd_DtlApd")
		);
	}

	public static MCContainerDef MS_MSBHL5030_PaySchd_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_schd" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("PaySchd_DtlSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5030_PaySchd_Lock_Upd01_INFO = new MCOperationInfo("MS", "MSBHL5030", "PaySchd_Lock_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5030_PaySchd_Lock_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5030", "PaySchd_Lock_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd")
			}
			,
			MCBlockDef.create("PaySchd_Lock_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

