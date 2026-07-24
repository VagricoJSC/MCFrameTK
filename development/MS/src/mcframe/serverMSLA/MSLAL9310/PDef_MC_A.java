package mcframe.serverMSLA.MSLAL9310;

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
 * [MSLAL_OrdSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Oper_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Oper_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Bom_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Bom_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Bom_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Bom_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Loc_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Loc_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Loc_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Loc_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Cal_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Cal_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Cal_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Cal_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Ext_Cal_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Ext_Cal_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Stk_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Stk_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Stk_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Stk_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_IO_Gr_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_IO_Gr_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_IO_Gi_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_IO_Gi_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01.UP.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01.DOWN.BLOCK0")){
			return MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
																
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Itm_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Itm_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_alt_nm1", "itm_alt_nm1"),
				MCItemDef.create("itm_alt_nm2", "itm_alt_nm2"),
				MCItemDef.create("itm_alt_nm3", "itm_alt_nm3"),
				MCItemDef.create("itm_alt_nm4", "itm_alt_nm4"),
				MCItemDef.create("base_itm_nm", "base_itm_nm"),
				MCItemDef.create("base_itm_alt_nm1", "base_itm_alt_nm1"),
				MCItemDef.create("base_itm_alt_nm2", "base_itm_alt_nm2"),
				MCItemDef.create("base_itm_alt_nm3", "base_itm_alt_nm3"),
				MCItemDef.create("base_itm_alt_nm4", "base_itm_alt_nm4"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Itm_Oper_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Oper_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Oper_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Oper_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Oper_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Dtl_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_lt_add_qty", "mfg_lt_add_qty"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Dtl_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Bom_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Bom_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Bom_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Bom_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("OrdSendIf_Bom_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Bom_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Bom_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ph_flg", "ph_flg"),
				MCItemDef.create("ph_bom_ptn", "ph_bom_ptn"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("min_sno1", "min_sno1"),
				MCItemDef.create("max_sno1", "max_sno1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("min_sno2", "min_sno2"),
				MCItemDef.create("max_sno2", "max_sno2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("min_sno3", "min_sno3"),
				MCItemDef.create("max_sno3", "max_sno3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("min_sno4", "min_sno4"),
				MCItemDef.create("max_sno4", "max_sno4"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_Bom_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Loc_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Loc_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Loc_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Loc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("OrdSendIf_Loc_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Loc_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Loc_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd")
			}
			,
			MCBlockDef.create("OrdSendIf_Loc_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Cal_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Cal_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Cal_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Cal_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("OrdSendIf_Cal_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Cal_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Cal_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sun_off_flg", "sun_off_flg"),
				MCItemDef.create("mon_off_flg", "mon_off_flg"),
				MCItemDef.create("tue_off_flg", "tue_off_flg"),
				MCItemDef.create("wed_off_flg", "wed_off_flg"),
				MCItemDef.create("thu_off_flg", "thu_off_flg"),
				MCItemDef.create("fri_off_flg", "fri_off_flg"),
				MCItemDef.create("sat_off_flg", "sat_off_flg")
			}
			,
			MCBlockDef.create("OrdSendIf_Cal_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Ext_Cal_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Ext_Cal_Srch01", "000000", new PDef());


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Ext_Cal_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Ext_Cal_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("off_flg", "off_flg")
			}
			,
			MCBlockDef.create("OrdSendIf_Ext_Cal_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Stk_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Stk_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Stk_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Stk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_Stk_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Stk_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Stk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("OrdSendIf_Stk_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_IO_Gr_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_IO_Gr_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_IO_Gr_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_IO_Gr_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("OrdSendIf_IO_Gr_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_IO_Gi_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_IO_Gi_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_IO_Gi_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_IO_Gi_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg")
			}
			,
			MCBlockDef.create("OrdSendIf_IO_Gi_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Dly_Dmnd_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Dly_Dmnd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to")
			}
			,
			MCBlockDef.create("OrdSendIf_Dly_Dmnd_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Dly_Dmnd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dly_dmnd_no", "dly_dmnd_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno_typ4", "sno_typ4")
			}
			,
			MCBlockDef.create("OrdSendIf_Dly_Dmnd_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("include_unfirm_flg", "include_unfirm_flg"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("upd_flg", "upd_flg")
			}
			,
			MCBlockDef.create("OrdSendIf_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("itm_ord_intr_rmrks", "itm_ord_intr_rmrks"),
				MCItemDef.create("itm_ord_sub_char1", "itm_ord_sub_char1"),
				MCItemDef.create("itm_ord_sub_char2", "itm_ord_sub_char2"),
				MCItemDef.create("itm_ord_sub_char3", "itm_ord_sub_char3"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oper_ord_intr_rmrks", "oper_ord_intr_rmrks"),
				MCItemDef.create("oper_ord_sub_char1", "oper_ord_sub_char1"),
				MCItemDef.create("oper_ord_sub_char2", "oper_ord_sub_char2"),
				MCItemDef.create("oper_ord_sub_char3", "oper_ord_sub_char3"),
				MCItemDef.create("co_nm", "co_nm")
			}
			,
			MCBlockDef.create("OrdSendIf_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Bom_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Bom_Srch01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Dtl_Bom_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Itm_Dtl_Bom_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_dtl_bom" + ".wg_cd", "wg_cd"),
				MCItemDef.create("itm_dtl_bom" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("itm_dtl_bom" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("itm_dtl_bom" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("itm_dtl_bom" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_dtl_bom" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("itm_dtl_bom" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("itm_dtl_bom" + ".itm_dtl_st_dt", "itm_dtl_st_dt"),
				MCItemDef.create("itm_dtl_bom" + ".itm_dtl_end_dt", "itm_dtl_end_dt"),
				MCItemDef.create("itm_dtl_bom" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("itm_dtl_bom" + ".mfg_lt", "mfg_lt"),
				MCItemDef.create("itm_dtl_bom" + ".mfg_lt_add_qty", "mfg_lt_add_qty"),
				MCItemDef.create("itm_dtl_bom" + ".purc_lt", "purc_lt"),
				MCItemDef.create("itm_dtl_bom" + ".purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("itm_dtl_bom" + ".accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("itm_dtl_bom" + ".buf_lt", "buf_lt"),
				MCItemDef.create("itm_dtl_bom" + ".sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("itm_dtl_bom" + ".sz_week", "sz_week"),
				MCItemDef.create("itm_dtl_bom" + ".lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("itm_dtl_bom" + ".min_lot_qty", "min_lot_qty"),
				MCItemDef.create("itm_dtl_bom" + ".batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("itm_dtl_bom" + ".max_lot_qty", "max_lot_qty"),
				MCItemDef.create("itm_dtl_bom" + ".max_order", "max_order"),
				MCItemDef.create("itm_dtl_bom" + ".prio", "prio"),
				MCItemDef.create("itm_dtl_bom" + ".order_ratio", "order_ratio"),
				MCItemDef.create("itm_dtl_bom" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("itm_dtl_bom" + ".mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("itm_dtl_bom" + ".fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("itm_dtl_bom" + ".sno1", "sno1"),
				MCItemDef.create("itm_dtl_bom" + ".sno2", "sno2"),
				MCItemDef.create("itm_dtl_bom" + ".sno3", "sno3"),
				MCItemDef.create("itm_dtl_bom" + ".sno4", "sno4"),
				MCItemDef.create("itm_dtl_bom" + ".oper_cd", "oper_cd"),
				MCItemDef.create("itm_dtl_bom" + ".oper_seq", "oper_seq"),
				MCItemDef.create("itm_dtl_bom" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("itm_dtl_bom" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("itm_dtl_bom" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("itm_dtl_bom" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("itm_dtl_bom" + ".ver_no", "ver_no"),
				MCItemDef.create("itm_dtl_bom" + ".alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("itm_dtl_bom" + ".alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("itm_dtl_bom" + ".alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("itm_dtl_bom" + ".alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("itm_dtl_bom" + ".alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("itm_dtl_bom" + ".par_inst_qty", "par_inst_qty"),
				MCItemDef.create("itm_dtl_bom" + ".chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("itm_dtl_bom" + ".fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("itm_dtl_bom" + ".sno_typ1", "sno_typ1"),
				MCItemDef.create("itm_dtl_bom" + ".sno_typ2", "sno_typ2"),
				MCItemDef.create("itm_dtl_bom" + ".sno_typ3", "sno_typ3"),
				MCItemDef.create("itm_dtl_bom" + ".sno_typ4", "sno_typ4"),
				MCItemDef.create("itm_dtl_bom" + ".in_offst_typ", "in_offst_typ"),
				MCItemDef.create("itm_dtl_bom" + ".in_offst", "in_offst"),
				MCItemDef.create("itm_dtl_bom" + ".inpt_ctl_typ", "inpt_ctl_typ")
			}
			,
			MCBlockDef.create("OrdSendIf_Itm_Dtl_Bom_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Oper_InstAct_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Oper_InstAct_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("term_from", "term_from"),
				MCItemDef.create("term_to", "term_to")
			}
			,
			MCBlockDef.create("OrdSendIf_Oper_InstAct_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Oper_InstAct_Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope_act" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ope_act" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("ope_act" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ope_act" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ope_act" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("ope_act" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("ope_act" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ope_act" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("ope_act" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ope_act" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ope_act" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("ope_act" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("ope_act" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("ope_act" + ".oper_inst_schd_qty", "oper_inst_schd_qty"),
				MCItemDef.create("ope_act" + ".oper_act_qty", "oper_act_qty"),
				MCItemDef.create("ope_act" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("ope_act" + ".base_unit_nm", "base_unit_nm"),
				MCItemDef.create("ope_act" + ".inst_st_schd_tm", "inst_st_schd_tm"),
				MCItemDef.create("ope_act" + ".inst_end_schd_tm", "inst_end_schd_tm"),
				MCItemDef.create("ope_act" + ".act_st_tm", "act_st_tm"),
				MCItemDef.create("ope_act" + ".act_end_tm", "act_end_tm")
			}
			,
			MCBlockDef.create("OrdSendIf_Oper_InstAct_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Ord_Lnk_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Ord_Lnk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("term_from", "term_from"),
				MCItemDef.create("term_to", "term_to")
			}
			,
			MCBlockDef.create("OrdSendIf_Ord_Lnk_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Ord_Lnk_Srch01",
			new MCItemDef[]{
				MCItemDef.create("ord_lnk" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord_lnk" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord_lnk" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord_lnk" + ".par_itm_ord_no", "par_itm_ord_no"),
				MCItemDef.create("ord_lnk" + ".par_oper_ord_no", "par_oper_ord_no"),
				MCItemDef.create("ord_lnk" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord_lnk" + ".oper_cd", "oper_cd"),
				MCItemDef.create("ord_lnk" + ".oper_seq", "oper_seq"),
				MCItemDef.create("ord_lnk" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord_lnk" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord_lnk" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord_lnk" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord_lnk" + ".cal_cd", "cal_cd"),
				MCItemDef.create("ord_lnk" + ".xfr_lt", "xfr_lt"),
				MCItemDef.create("ord_lnk" + ".insp_offst", "insp_offst"),
				MCItemDef.create("ord_lnk" + ".insp_lt", "insp_lt"),
				MCItemDef.create("ord_lnk" + ".accpt_insp_lt", "accpt_insp_lt")
			}
			,
			MCBlockDef.create("OrdSendIf_Ord_Lnk_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_INFO = new MCOperationInfo("MS", "MSLAL9310", "OrdSendIf_Schd_ActQty_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Schd_ActQty_Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("term_from", "term_from"),
				MCItemDef.create("term_to", "term_to")
			}
			,
			MCBlockDef.create("OrdSendIf_Schd_ActQty_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9310", "OrdSendIf_Schd_ActQty_Srch01",
			new MCItemDef[]{
				MCItemDef.create("schd_act_qty" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("schd_act_qty" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("schd_act_qty" + ".wg_cd", "wg_cd"),
				MCItemDef.create("schd_act_qty" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("schd_act_qty" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("schd_act_qty" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("schd_act_qty" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("schd_act_qty" + ".itm_cd", "itm_cd"),
				MCItemDef.create("schd_act_qty" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("schd_act_qty" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("schd_act_qty" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("schd_act_qty" + ".act_qty", "act_qty"),
				MCItemDef.create("schd_act_qty" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("schd_act_qty" + ".base_unit_nm", "base_unit_nm")
			}
			,
			MCBlockDef.create("OrdSendIf_Schd_ActQty_Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

