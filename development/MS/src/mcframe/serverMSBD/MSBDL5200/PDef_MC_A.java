package mcframe.serverMSBD.MSBDL5200;

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
 * [MSBDL_PurcPrntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd01.UP.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd01.UP.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd02.UP.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Upd02.DOWN.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.UP.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.UP.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.UP.BLOCK2")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.UP.BLOCK3")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.UP.BLOCK4")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.DOWN.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.DOWN.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.DOWN.BLOCK2")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt01.DOWN.BLOCK3")){
			return MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt02.UP.BLOCK0")){
			return MS_MSBDL5200_PurcPrnt_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5200.PurcPrnt_Prnt02.UP.BLOCK1")){
			return MS_MSBDL5200_PurcPrnt_Prnt02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBDL5200_PurcPrnt_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5200", "PurcPrnt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("pds" + ".po_no", "po_no"),
				MCItemDef.create("pds" + ".po_rev", "po_rev"),
				MCItemDef.create("pds" + ".dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("pds" + ".prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("pds" + ".purc_dlv_slip_src_typ", "purc_dlv_slip_src_typ")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("pdsd" + ".dlv_slip_mng_d_no", "dlv_slip_mng_d_no"),
				MCItemDef.create("pdsd" + ".dlv_slip_mng_d_seq", "dlv_slip_mng_d_seq"),
				MCItemDef.create("pdsd" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("pdsd" + ".dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("pdsd" + ".dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("pdsd" + ".dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("pdsd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pdsd" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("pdsd" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5200_PurcPrnt_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5200", "PurcPrnt_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("po_no", "po_no")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Upd02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pdsd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pdsd" + ".dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("pdsd" + ".prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("pdsd" + ".purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("pdsd" + ".purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("pdsd" + ".purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev")
			}
			,
			MCBlockDef.create("PurcPrnt_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5200_PurcPrnt_Prnt01_INFO = new MCOperationInfo("MS", "MSBDL5200", "PurcPrnt_Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_Po")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_DlvInst")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("bp_srch_flg", "bp_srch_flg"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_DlvSlip")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("inc_can_flg", "inc_can_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_PurcDDlv")
		);
	}


	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_Po")
		);
	}
	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_DlvInst")
		);
	}
	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_DlvSlip")
		);
	}
	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt01_PurcDDlv")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5200_PurcPrnt_Prnt02_INFO = new MCOperationInfo("MS", "MSBDL5200", "PurcPrnt_Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("purc_ret_act_no", "purc_ret_act_no"),
				MCItemDef.create("purc_ret_act_rev", "purc_ret_act_rev"),
				MCItemDef.create("purc_ret_prnt_dt", "purc_ret_prnt_dt")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5200_PurcPrnt_Prnt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5200", "PurcPrnt_Prnt02",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("PurcPrnt_Prnt02_CndR")
		);
	}


	//FMCB DEF_CLASSES END
}

