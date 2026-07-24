package mcframe.clientMSBB.MSBBP0010;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_CstFrcstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL0010.Srch01.UP.BLOCK0")){
			return MS_MSBBL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.UP.BLOCK0")){
			return MS_MSBBL0010_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Imp01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Imp01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.UP.BLOCK0")){
			return MS_MSBBL0010_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.UP.BLOCK1")){
			return MS_MSBBL0010_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.UP.BLOCK0")){
			return MS_MSBBL0010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.UP.BLOCK1")){
			return MS_MSBBL0010_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Ins01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.UP.BLOCK0")){
			return MS_MSBBL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.UP.BLOCK1")){
			return MS_MSBBL0010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL0010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL0010.Upd01.DOWN.BLOCK1")){
			return MS_MSBBL0010_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL0010.Del01.UP.BLOCK0")){
			return MS_MSBBL0010_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBBL0010_Srch01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "frcst_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "frcst_usr_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_period_typ_nm", "frcst_period_typ_nm"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("last_qty", "last_qty"),
				MCItemDef.create("last_cst_frcst_prnt_dt", "last_cst_frcst_prnt_dt"),
				MCItemDef.create("last_rcpt_dt", "last_rcpt_dt"),
				MCItemDef.create("prms_qty_p" + ".qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("slo_qty", "slo_qty"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Imp01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("prms_qty_p" + ".qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "frcst_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "frcst_usr_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Imp01_DOWN_BLOCK1() {
	/** Ope.のBlock [Imp01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_period_typ_nm", "frcst_period_typ_nm"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("prms_qty_p" + ".qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Sprt01_UP_BLOCK1() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("last_qty", "last_qty"),
				MCItemDef.create("last_cst_frcst_prnt_dt", "last_cst_frcst_prnt_dt"),
				MCItemDef.create("last_rcpt_dt", "last_rcpt_dt"),
				MCItemDef.create("spln_qty", "spln_qty"),
				MCItemDef.create("slo_qty", "slo_qty")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Ins01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "frcst_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("prms_qty_p" + ".qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Upd01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_prnt_dt", "cst_frcst_prnt_dt"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "frcst_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL0010_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("frcst_st_dt", "frcst_st_dt"),
				MCItemDef.create("frcst_end_dt", "frcst_end_dt"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("prms_qty_p" + ".qty", "prms_qty"),
				MCItemDef.create("frcst_stop_flg", "frcst_stop_flg"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL0010_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL0010_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("frcst_dt", "frcst_dt"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL0010_Del01_INFO = new MCOperationInfo("MS", "MSBBL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL0010_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

