package mcframe.clientMSBH.MSBHP0160;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_ApSwBalReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0160.Srch01.UP.BLOCK0")){
			return MS_MSBHL0160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Srch02.UP.BLOCK0")){
			return MS_MSBHL0160_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Srch02.DOWN.BLOCK0")){
			return MS_MSBHL0160_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Upd01.UP.BLOCK0")){
			return MS_MSBHL0160_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Upd01.UP.BLOCK1")){
			return MS_MSBHL0160_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0160.Upd01.UP.BLOCK2")){
			return MS_MSBHL0160_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0160.Upd02.UP.BLOCK0")){
			return MS_MSBHL0160_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0160.Upd02.UP.BLOCK1")){
			return MS_MSBHL0160_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0160.Upd02.UP.BLOCK2")){
			return MS_MSBHL0160_Upd02_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBHL0160_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0160_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_typ", "ap_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0160_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("inc_tax_amt_p" + ".amt", "inc_tax_amt"),
				MCItemDef.create("tgt_sw_amt_p" + ".amt", "tgt_sw_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0160_Srch02_INFO = new MCOperationInfo("MS", "MSBHL0160", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0160_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_typ", "ap_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0160_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("sw_src_pay_schd_no", "sw_src_pay_schd_no"),
				MCItemDef.create("inc_tax_amt_p" + ".amt", "inc_tax_amt"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("purc_wrk_no", "purc_wrk_no"),
				MCItemDef.create("purc_wrk_nm", "purc_wrk_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bsppl_cl_ym", "bsppl_cl_ym"),
				MCItemDef.create("bsppl_cl_day", "bsppl_cl_day"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0160_Upd01_INFO = new MCOperationInfo("MS", "MSBHL0160", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0160_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_SwFr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}

	public static MCContainerDef MS_MSBHL0160_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_SwBase] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sw")
		);
	}

	public static MCContainerDef MS_MSBHL0160_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_SwTo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_wrk_ope_typ", "ap_wrk_ope_typ"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("SwTo")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0160_Upd02_INFO = new MCOperationInfo("MS", "MSBHL0160", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0160_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_SwFr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}

	public static MCContainerDef MS_MSBHL0160_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_SwBase] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sw")
		);
	}

	public static MCContainerDef MS_MSBHL0160_Upd02_UP_BLOCK2() {
		/** Ope.のBlock [Upd02_SwTo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0160", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("ap_wrk_ope_typ", "ap_wrk_ope_typ"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("SwTo")
		);
	}


	//FMCB DEF_CLASSES END
}

