package mcframe.clientMABS.MABSP0340;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_ItmWgReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0340.Srch01.UP.BLOCK0")){
			return MA_MABSL0340_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0340.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0340_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0340.Upd01.UP.BLOCK0")){
			return MA_MABSL0340_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0340.Del01.UP.BLOCK0")){
			return MA_MABSL0340_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABSL0340_Srch01_INFO = new MCOperationInfo("MA", "MABSL0340", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0340_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0340", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itmtyp_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itmtyp_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itmtyp_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0340_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0340", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mfg_inst_unit_typ_itm", "mfg_inst_unit_typ_itm"),
				MCItemDef.create("mfg_inst_unit_typ_wg", "mfg_inst_unit_typ_wg"),
				MCItemDef.create("mfg_inst_unit_typ_mst", "mfg_inst_unit_typ_mst"),
				MCItemDef.create("mfg_inst_unit_typ_nm_mst", "mfg_inst_unit_typ_nm_mst"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm"),
				MCItemDef.create("mrp_proc_typ_itm", "mrp_proc_typ_itm"),
				MCItemDef.create("mrp_proc_typ_wg", "mrp_proc_typ_wg"),
				MCItemDef.create("mrp_proc_typ_mst", "mrp_proc_typ_mst"),
				MCItemDef.create("mrp_proc_typ_nm_mst", "mrp_proc_typ_nm_mst"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("mrp_proc_typ_nm", "mrp_proc_typ_nm"),
				MCItemDef.create("rqmt_typ_itm", "rqmt_typ_itm"),
				MCItemDef.create("rqmt_typ_wg", "rqmt_typ_wg"),
				MCItemDef.create("rqmt_typ_mst", "rqmt_typ_mst"),
				MCItemDef.create("rqmt_typ_nm_mst", "rqmt_typ_nm_mst"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("prod_pln_typ_itm", "prod_pln_typ_itm"),
				MCItemDef.create("prod_pln_typ_wg", "prod_pln_typ_wg"),
				MCItemDef.create("prod_pln_typ_mst", "prod_pln_typ_mst"),
				MCItemDef.create("prod_pln_typ_nm_mst", "prod_pln_typ_nm_mst"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("prod_pln_typ_nm", "prod_pln_typ_nm"),
				MCItemDef.create("dmnd_date_div_mons_itm", "dmnd_date_div_mons_itm"),
				MCItemDef.create("dmnd_date_div_mons_wg", "dmnd_date_div_mons_wg"),
				MCItemDef.create("dmnd_date_div_mons_mst", "dmnd_date_div_mons_mst"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("alloc_margin_days_itm", "alloc_margin_days_itm"),
				MCItemDef.create("alloc_margin_days_wg", "alloc_margin_days_wg"),
				MCItemDef.create("alloc_margin_days_mst", "alloc_margin_days_mst"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("mrp_alloc_margin_days_itm", "mrp_alloc_margin_days_itm"),
				MCItemDef.create("mrp_alloc_margin_days_wg", "mrp_alloc_margin_days_wg"),
				MCItemDef.create("mrp_alloc_margin_days_mst", "mrp_alloc_margin_days_mst"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days_itm", "mrp_opn_xfr_days_itm"),
				MCItemDef.create("mrp_opn_xfr_days_wg", "mrp_opn_xfr_days_wg"),
				MCItemDef.create("mrp_opn_xfr_days_mst", "mrp_opn_xfr_days_mst"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("rqmt_rstr_qty_mst", "rqmt_rstr_qty_mst"),
				MCItemDef.create("qty_p" + ".qty", "rqmt_rstr_qty"),
				MCItemDef.create("inpt_itm_add_flg", "inpt_itm_add_flg"),
				MCItemDef.create("inpt_itm_add_typ", "inpt_itm_add_typ"),
				MCItemDef.create("inpt_itm_add_typ_nm", "inpt_itm_add_typ_nm"),
				MCItemDef.create("inpt_itm_del_flg", "inpt_itm_del_flg"),
				MCItemDef.create("inpt_itm_del_typ", "inpt_itm_del_typ"),
				MCItemDef.create("inpt_itm_del_typ_nm", "inpt_itm_del_typ_nm"),
				MCItemDef.create("sch_flg", "sch_flg"),
				MCItemDef.create("sch_tgt_typ", "sch_tgt_typ"),
				MCItemDef.create("sch_tgt_typ_nm", "sch_tgt_typ_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0340_Upd01_INFO = new MCOperationInfo("MA", "MABSL0340", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0340_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0340", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("qty_p" + ".qty", "rqmt_rstr_qty"),
				MCItemDef.create("inpt_itm_add_typ", "inpt_itm_add_typ"),
				MCItemDef.create("inpt_itm_del_typ", "inpt_itm_del_typ"),
				MCItemDef.create("sch_tgt_typ", "sch_tgt_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0340_Del01_INFO = new MCOperationInfo("MA", "MABSL0340", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0340_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0340", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

