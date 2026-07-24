package mcframe.serverMSBH.MSBHL5130;

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
 * [MSBHL_ApSwBalService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.UP.BLOCK0")){
			return MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.UP.BLOCK1")){
			return MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.UP.BLOCK2")){
			return MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.DOWN.BLOCK1")){
			return MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Chk01.DOWN.BLOCK2")){
			return MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Ins01.UP.BLOCK0")){
			return MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Ins01.UP.BLOCK1")){
			return MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Ins01.UP.BLOCK2")){
			return MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Ins01.DOWN.BLOCK0")){
			return MS_MSBHL5130_ApSwBal_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Prnt01.UP.BLOCK0")){
			return MS_MSBHL5130_ApSwBal_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5130.ApSwBal_Prnt01.UP.BLOCK1")){
			return MS_MSBHL5130_ApSwBal_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBHL5130_ApSwBal_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5130", "ApSwBal_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("ap_d_upd_cntr", "ap_d_upd_cntr"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_Fr")
		);
	}

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("sw_chk_flg", "sw_chk_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_Base")
		);
	}

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("wrk_ope_typ", "wrk_ope_typ"),
				MCItemDef.create("wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_To")
		);
	}


	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_Fr")
		);
	}
	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sw_chk_flg", "sw_chk_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_Base")
		);
	}
	public static MCContainerDef MS_MSBHL5130_ApSwBal_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("wrk_ope_typ", "wrk_ope_typ"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Chk01_To")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5130_ApSwBal_Ins01_INFO = new MCOperationInfo("MS", "MSBHL5130", "ApSwBal_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("ApSwBal_Ins01_Fr")
		);
	}

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sw_chk_flg", "sw_chk_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Ins01_Base")
		);
	}

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("wrk_ope_typ", "wrk_ope_typ"),
				MCItemDef.create("wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("ApSwBal_Ins01_To")
		);
	}


	public static MCContainerDef MS_MSBHL5130_ApSwBal_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("to_ap_d_no", "to_ap_d_no")
			}
			,
			MCBlockDef.create("ApSwBal_Ins01_Fr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5130_ApSwBal_Prnt01_INFO = new MCOperationInfo("MS", "MSBHL5130", "ApSwBal_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("reprnt_flg", "reprnt_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBHL5130_ApSwBal_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5130", "ApSwBal_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("ApSwBal_Prnt01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

