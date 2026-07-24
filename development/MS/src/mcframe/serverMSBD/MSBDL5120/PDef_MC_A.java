package mcframe.serverMSBD.MSBDL5120;

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
 * [MSBDL_PurcDlvDtAdjstRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5120.DlvInst_Chk01.UP.BLOCK0")){
			return MS_MSBDL5120_DlvInst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Chk01.UP.BLOCK1")){
			return MS_MSBDL5120_DlvInst_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5120_DlvInst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5120_DlvInst_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk01.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk01.UP.BLOCK1")){
			return MS_MSBDL5120_Prms_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5120_Prms_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk02.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk02.UP.BLOCK1")){
			return MS_MSBDL5120_Prms_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.UP.BLOCK1")){
			return MS_MSBDL5120_Prms_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.UP.BLOCK2")){
			return MS_MSBDL5120_Prms_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.UP.BLOCK3")){
			return MS_MSBDL5120_Prms_Chk03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.DOWN.BLOCK1")){
			return MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.DOWN.BLOCK2")){
			return MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Chk03.DOWN.BLOCK3")){
			return MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Upd01.UP.BLOCK0")){
			return MS_MSBDL5120_DlvInst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Upd01.UP.BLOCK1")){
			return MS_MSBDL5120_DlvInst_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5120_DlvInst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5120_DlvInst_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd01.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd01.UP.BLOCK1")){
			return MS_MSBDL5120_Prms_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5120_Prms_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd02.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd03.UP.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd03.UP.BLOCK1")){
			return MS_MSBDL5120_Prms_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5120.Prms_Upd03.DOWN.BLOCK0")){
			return MS_MSBDL5120_Prms_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5120.DlvInst_Prms_Del01.UP.BLOCK0")){
			return MS_MSBDL5120_DlvInst_Prms_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBDL5120_DlvInst_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5120", "DlvInst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_DlvInst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("crnt_edi_dlv_inst_flg", "crnt_edi_dlv_inst_flg"),
				MCItemDef.create("ext_sys_typ", "ext_sys_typ")
			}
			,
			MCBlockDef.create("DlvInst_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5120_DlvInst_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd")
			}
			,
			MCBlockDef.create("DlvInst_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_DlvInst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("DlvInst_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5120_DlvInst_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("DlvInst_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no")
			}
			,
			MCBlockDef.create("Prms_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("prms_rmrks", "prms_rmrks")
			}
			,
			MCBlockDef.create("Prms_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5120_Prms_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg")
			}
			,
			MCBlockDef.create("Prms_Chk02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no")
			}
			,
			MCBlockDef.create("Prms_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Chk03_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Prms_Chk03_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_NoRefl_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Prms_Chk03_NoRefl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_Cnd")
		);
	}
	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_NoRefl_Cnd")
		);
	}
	public static MCContainerDef MS_MSBDL5120_Prms_Chk03_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Prms_Chk03_NoRefl_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_DlvInst_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5120", "DlvInst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_DlvInst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("dlv_inst_prnt_rmrks", "dlv_inst_prnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_inst_print_flg", "dlv_inst_print_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("dlv_inst_grp_no", "dlv_inst_grp_no"),
				MCItemDef.create("ext_sys_typ", "ext_sys_typ")
			}
			,
			MCBlockDef.create("DlvInst_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5120_DlvInst_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("dlv_rqst_loc_cd", "dlv_rqst_loc_cd"),
				MCItemDef.create("dlv_rqst_str_ln_cd", "dlv_rqst_str_ln_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("dlv_inst_print_d_rmrks", "dlv_inst_print_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("DlvInst_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_DlvInst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_rev", "dlv_inst_rev")
			}
			,
			MCBlockDef.create("DlvInst_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5120_DlvInst_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("DlvInst_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt"),
				MCItemDef.create("prms_rcpt_dt", "prms_rcpt_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("dlv_slip_print_flg", "dlv_slip_print_flg"),
				MCItemDef.create("purc_ddlv_dlv_slip_print_flg", "purc_ddlv_dlv_slip_print_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("prms_rcpt_grp_no", "prms_rcpt_grp_no")
			}
			,
			MCBlockDef.create("Prms_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("prms_rmrks", "prms_rmrks")
			}
			,
			MCBlockDef.create("Prms_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no")
			}
			,
			MCBlockDef.create("Prms_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5120_Prms_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_d_seq", "dlv_slip_d_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_seq", "purc_ddlv_dlv_slip_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev"),
				MCItemDef.create("purc_ddlv_dlv_slip_d_no", "purc_ddlv_dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Prms_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Prms_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg")
			}
			,
			MCBlockDef.create("Prms_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_Prms_Upd03_INFO = new MCOperationInfo("MS", "MSBDL5120", "Prms_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_Prms_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("arr_schd_refl_dt", "arr_schd_refl_dt")
			}
			,
			MCBlockDef.create("Prms_Upd03_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5120_Prms_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("prms_rcpt_d_no", "prms_rcpt_d_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("prms_dlv_tm", "prms_dlv_tm"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Prms_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5120_Prms_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "Prms_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("prms_rcpt_no", "prms_rcpt_no"),
				MCItemDef.create("arr_schd_refl_flg", "arr_schd_refl_flg")
			}
			,
			MCBlockDef.create("Prms_Upd03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5120_DlvInst_Prms_Del01_INFO = new MCOperationInfo("MS", "MSBDL5120", "DlvInst_Prms_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5120_DlvInst_Prms_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5120", "DlvInst_Prms_Del01",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("DlvInst_Prms_Del01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

