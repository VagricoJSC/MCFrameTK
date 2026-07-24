package mcframe.serverMSBG.MSBGL5020;

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
 * [MSBGL_RcvActCmnService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk01.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk01.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk01.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.UP.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.DOWN.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk02.DOWN.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.UP.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.DOWN.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk03.DOWN.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk04.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk04.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk05.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Chk05.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd01.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd01.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd01.UP.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd01.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd01.DOWN.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd02.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd02.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd02.UP.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd02.DOWN.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd03.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd03.UP.BLOCK1")){
			return MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd03.UP.BLOCK2")){
			return MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd03.UP.BLOCK3")){
			return MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Upd04.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL5020.RcvActCmn_Del01.UP.BLOCK0")){
			return MS_MSBGL5020_RcvActCmn_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Chk01_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk01",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Chk02_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_SwTo")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_SwFr")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_SwTo")
		);
	}
	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk02_SwFr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Chk03_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_SwTo")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_SwFr")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_SwTo")
		);
	}
	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk03_SwFr")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Chk04_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk04",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk04",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Chk04_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Chk05_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk05",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Del01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Chk05",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Upd01_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("tax_cd1", "tax_cd1"),
				MCItemDef.create("tax_typ1", "tax_typ1"),
				MCItemDef.create("tax_rate1", "tax_rate1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_typ2", "ar_sttl_typ2"),
				MCItemDef.create("tax_cd2", "tax_cd2"),
				MCItemDef.create("tax_typ2", "tax_typ2"),
				MCItemDef.create("tax_rate2", "tax_rate2"),
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("ar_sttl_typ3", "ar_sttl_typ3"),
				MCItemDef.create("tax_cd3", "tax_cd3"),
				MCItemDef.create("tax_typ3", "tax_typ3"),
				MCItemDef.create("tax_rate3", "tax_rate3"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_cd", "debt_cred_id_cd"),
				MCItemDef.create("debt_cred_nm", "debt_cred_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("rcv_auto_appl_flg", "rcv_auto_appl_flg"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2"),
				MCItemDef.create("amt3", "amt3"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_amt", "appl_amt")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd01_BillD")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("can_ac_ym", "can_ac_ym"),
				MCItemDef.create("can_trd_cd", "can_trd_cd"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("RcvAct_Base")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Upd02_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd02",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd02_SwTo")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("sw_src_bill_d_no", "sw_src_bill_d_no"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("base_cur_sw_amt", "base_cur_sw_amt"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd02_SwFr")
		);
	}


	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd02",
			new MCItemDef[]{
				MCItemDef.create("fr_trd_cd", "fr_trd_cd"),
				MCItemDef.create("fr_rcv_act_no", "fr_rcv_act_no"),
				MCItemDef.create("fr_rcv_act_seq", "fr_rcv_act_seq"),
				MCItemDef.create("fr_rcv_act_rev", "fr_rcv_act_rev"),
				MCItemDef.create("to_trd_cd", "to_trd_cd"),
				MCItemDef.create("to_rcv_act_no", "to_rcv_act_no"),
				MCItemDef.create("to_rcv_act_seq", "to_rcv_act_seq"),
				MCItemDef.create("to_rcv_act_rev", "to_rcv_act_rev")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd02_RcvAct")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Upd03_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd03",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd03",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd03_SwTo")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd03",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd03_SwFr")
		);
	}

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd03",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_d_iv_no", "bill_d_iv_no"),
				MCItemDef.create("hdr_dtl_peg", "hdr_dtl_peg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("sw_to_bill_mng_no", "sw_to_bill_mng_no"),
				MCItemDef.create("sw_to_acst_cd", "sw_to_acst_cd"),
				MCItemDef.create("sw_to_bill_ymd", "sw_to_bill_ymd"),
				MCItemDef.create("sw_to_schd_bill_dt", "sw_to_schd_bill_dt"),
				MCItemDef.create("sw_to_bill_crryovr_times", "sw_to_bill_crryovr_times"),
				MCItemDef.create("sw_to_ac_dt", "sw_to_ac_dt"),
				MCItemDef.create("sw_fr_ac_dt", "sw_fr_ac_dt"),
				MCItemDef.create("sw_fr_ar_ac_ym", "sw_fr_ar_ac_ym"),
				MCItemDef.create("sw_fr_ar_trd_cd", "sw_fr_ar_trd_cd"),
				MCItemDef.create("sw_fr_rcv_act_no", "sw_fr_rcv_act_no"),
				MCItemDef.create("sw_fr_rcv_act_seq", "sw_fr_rcv_act_seq"),
				MCItemDef.create("sw_fr_rcv_act_d_no", "sw_fr_rcv_act_d_no"),
				MCItemDef.create("sw_fr_rcv_act_d_seq", "sw_fr_rcv_act_d_seq"),
				MCItemDef.create("sw_to_ar_ac_ym", "sw_to_ar_ac_ym"),
				MCItemDef.create("sw_to_ar_trd_cd", "sw_to_ar_trd_cd"),
				MCItemDef.create("sw_to_rcv_act_no", "sw_to_rcv_act_no"),
				MCItemDef.create("sw_to_rcv_act_seq", "sw_to_rcv_act_seq"),
				MCItemDef.create("sw_to_rcv_act_d_no", "sw_to_rcv_act_d_no"),
				MCItemDef.create("sw_to_rcv_act_d_seq", "sw_to_rcv_act_d_seq"),
				MCItemDef.create("appl_amt", "appl_amt")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd03_BillD")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Upd04_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Upd04",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Upd04_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBGL5020_RcvActCmn_Del01_INFO = new MCOperationInfo("MS", "MSBGL5020", "RcvActCmn_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL5020_RcvActCmn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL5020", "RcvActCmn_Del01",
			new MCItemDef[]{
				MCItemDef.create("bill_mng_no", "bill_mng_no")
			}
			,
			MCBlockDef.create("RcvActCmn_Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

