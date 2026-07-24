package mcframe.serverMSLA.MSLAL9210;

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
 * [MSLAL_OrdRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd02.UP.BLOCK2")){
			return MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL9210_OrdRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9210.OrdRecvIf_Upd04.DOWN.BLOCK1")){
			return MS_MSLAL9210_OrdRecvIf_Upd04_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL9210_OrdRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL9210", "OrdRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ordif" + ".data_lno", "data_lno"),
				MCItemDef.create("ordif" + ".data_no", "data_no"),
				MCItemDef.create("ordif" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ordif" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("ordif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ordif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("ordif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("ordif" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("ordif" + ".imp_flg", "imp_flg"),
				MCItemDef.create("ordif" + ".recv_dt", "recv_dt"),
				MCItemDef.create("ordif" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ordif" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("ordif" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ordif" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ordif" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ordif" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ordif" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ordif" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ordif" + ".ver_no", "ver_no"),
				MCItemDef.create("ordif" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ordif" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ordif" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ordif" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ordif" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ordif" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ordif" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ordif" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ordif" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ordif" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ordif" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ordif" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ordif" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ordif" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ordif" + ".master_dt", "master_dt"),
				MCItemDef.create("ordif" + ".sno1", "sno1"),
				MCItemDef.create("ordif" + ".sno2", "sno2"),
				MCItemDef.create("ordif" + ".sno3", "sno3"),
				MCItemDef.create("ordif" + ".sno4", "sno4"),
				MCItemDef.create("ordif" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ordif" + ".itm_ord_intr_rmrks", "itm_ord_intr_rmrks"),
				MCItemDef.create("ordif" + ".itm_ord_sub_char1", "itm_ord_sub_char1"),
				MCItemDef.create("ordif" + ".itm_ord_sub_char2", "itm_ord_sub_char2"),
				MCItemDef.create("ordif" + ".itm_ord_sub_char3", "itm_ord_sub_char3"),
				MCItemDef.create("ordif" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("ordif" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("ordif" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("ordif" + ".disp_seq", "disp_seq"),
				MCItemDef.create("ordif" + ".oper_cd", "oper_cd"),
				MCItemDef.create("ordif" + ".oper_seq", "oper_seq"),
				MCItemDef.create("ordif" + ".loc_cd", "loc_cd"),
				MCItemDef.create("ordif" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("ordif" + ".oper_ord_intr_rmrks", "oper_ord_intr_rmrks"),
				MCItemDef.create("ordif" + ".oper_ord_sub_char1", "oper_ord_sub_char1"),
				MCItemDef.create("ordif" + ".oper_ord_sub_char2", "oper_ord_sub_char2"),
				MCItemDef.create("ordif" + ".oper_ord_sub_char3", "oper_ord_sub_char3"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("ordif" + ".scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("allow_outsrc_schd_flg", "allow_outsrc_schd_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Chk01_Cnd")
		);
	}
	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("a_itm_ord_sts_typ", "a_itm_ord_sts_typ"),
				MCItemDef.create("b_itm_ord_sts_typ", "b_itm_ord_sts_typ"),
				MCItemDef.create("oper_ord_pr_flg", "oper_ord_pr_flg"),
				MCItemDef.create("io_schd_pr_flg", "io_schd_pr_flg"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".ver_no", "ver_no"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
				MCItemDef.create("ord" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ord" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ord" + ".rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("ord" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".nmr_qty", "nmr_qty"),
				MCItemDef.create("ord" + ".dnm_qty", "dnm_qty"),
				MCItemDef.create("ord" + ".fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("ord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".fix_dt", "fix_dt"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".mrp_po_schd_dt", "mrp_po_schd_dt"),
				MCItemDef.create("ord" + ".mrp_purc_lt", "mrp_purc_lt"),
				MCItemDef.create("ord" + ".purc_lt", "purc_lt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_st_schd_dt", "mrp_mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_end_schd_dt", "mrp_mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_lt", "mrp_mfg_lt"),
				MCItemDef.create("ord" + ".mfg_lt", "mfg_lt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".mrp_gi_schd_dt", "mrp_gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".mrp_strg_schd_dt", "mrp_strg_schd_dt"),
				MCItemDef.create("ord" + ".xfr_lt", "xfr_lt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".mrp_accpt_schd_dt", "mrp_accpt_schd_dt"),
				MCItemDef.create("ord" + ".accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_st_schd_dt", "mrp_insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_end_schd_dt", "mrp_insp_end_schd_dt"),
				MCItemDef.create("ord" + ".insp_lt", "insp_lt"),
				MCItemDef.create("ord" + ".insp_offst", "insp_offst"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".mrp_avl_schd_dt", "mrp_avl_schd_dt"),
				MCItemDef.create("ord" + ".master_dt", "master_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno_typ1", "sno_typ1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno_typ2", "sno_typ2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno_typ3", "sno_typ3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".sno_typ4", "sno_typ4"),
				MCItemDef.create("ord" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".not_fix_flg", "not_fix_flg"),
				MCItemDef.create("ord" + ".ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("ord" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".inst_itm_ord_sts_typ", "inst_itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no")
			}
			,
			MCBlockDef.create("OrdRecvIf_Chk01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("oord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_lt", "oper_lt"),
				MCItemDef.create("oord" + ".oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oord" + ".oper_offst", "oper_offst"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("oord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9210_OrdRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL9210", "OrdRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9210_OrdRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL9210", "OrdRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd02_Cnd")
		);
	}

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ord_rep_flg", "ord_rep_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("allow_outsrc_schd_flg", "allow_outsrc_schd_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd02_OrdRepCnd")
		);
	}


	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9210_OrdRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL9210", "OrdRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("ordif" + ".data_lno", "data_lno"),
				MCItemDef.create("ordif" + ".data_no", "data_no"),
				MCItemDef.create("ordif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ordif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("ordif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("ordif" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ordif" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("allow_outsrc_schd_flg", "allow_outsrc_schd_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9210_OrdRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL9210", "OrdRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("ordif" + ".data_lno", "data_lno"),
				MCItemDef.create("ordif" + ".data_no", "data_no"),
				MCItemDef.create("ordif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ordif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("ordif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("ordif" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ordif" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("if_scheduler_typ", "if_scheduler_typ"),
				MCItemDef.create("allow_outsrc_schd_flg", "allow_outsrc_schd_flg")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("ordif" + ".data_lno", "data_lno"),
				MCItemDef.create("ordif" + ".data_no", "data_no"),
				MCItemDef.create("ordif" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("OrdRecvIf_Upd04_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL9210_OrdRecvIf_Upd04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9210", "OrdRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd04_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

