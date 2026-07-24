package mcframe.serverMSBI.MSBIL5010;

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
 * [MSBIL_ClService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBIL5010.Cl_Chk01.UP.BLOCK0")){
			return MS_MSBIL5010_Cl_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk01.UP.BLOCK1")){
			return MS_MSBIL5010_Cl_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk01.UP.BLOCK2")){
			return MS_MSBIL5010_Cl_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk01.DOWN.BLOCK0")){
			return MS_MSBIL5010_Cl_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk03.UP.BLOCK0")){
			return MS_MSBIL5010_Cl_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk03.UP.BLOCK1")){
			return MS_MSBIL5010_Cl_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk03.UP.BLOCK2")){
			return MS_MSBIL5010_Cl_Chk03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk03.DOWN.BLOCK0")){
			return MS_MSBIL5010_Cl_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Chk03.DOWN.BLOCK1")){
			return MS_MSBIL5010_Cl_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.UP.BLOCK0")){
			return MS_MSBIL5010_Cl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.UP.BLOCK1")){
			return MS_MSBIL5010_Cl_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.UP.BLOCK2")){
			return MS_MSBIL5010_Cl_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.DOWN.BLOCK0")){
			return MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.DOWN.BLOCK1")){
			return MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Upd01.DOWN.BLOCK2")){
			return MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBIL5010.Cl_Srch01.DOWN.BLOCK0")){
			return MS_MSBIL5010_Cl_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBIL5010_Cl_Chk01_INFO = new MCOperationInfo("MS", "MSBIL5010", "Cl_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBIL5010_Cl_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("cl_flg", "cl_flg"),
				MCItemDef.create("rel_cl_flg", "rel_cl_flg"),
				MCItemDef.create("pre_cl_flg", "pre_cl_flg"),
				MCItemDef.create("rel_pre_cl_flg", "rel_pre_cl_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("ar_pre_cl_flg", "ar_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_flg", "ap_pre_cl_flg"),
				MCItemDef.create("all_acst_pre_cl_flg", "all_acst_pre_cl_flg"),
				MCItemDef.create("all_asppl_pre_cl_flg", "all_asppl_pre_cl_flg")
			}
			,
			MCBlockDef.create("Cl_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("acst_cd", "acst_cd")
			}
			,
			MCBlockDef.create("Cl_Chk01_Ar")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("asppl_cd", "asppl_cd")
			}
			,
			MCBlockDef.create("Cl_Chk01_Ap")
		);
	}


	public static MCContainerDef MS_MSBIL5010_Cl_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("cl_flg", "cl_flg"),
				MCItemDef.create("rel_cl_flg", "rel_cl_flg"),
				MCItemDef.create("pre_cl_flg", "pre_cl_flg"),
				MCItemDef.create("rel_pre_cl_flg", "rel_pre_cl_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("ar_pre_cl_flg", "ar_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_flg", "ap_pre_cl_flg"),
				MCItemDef.create("all_acst_pre_cl_flg", "all_acst_pre_cl_flg"),
				MCItemDef.create("all_asppl_pre_cl_flg", "all_asppl_pre_cl_flg")
			}
			,
			MCBlockDef.create("Cl_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBIL5010_Cl_Chk03_INFO = new MCOperationInfo("MS", "MSBIL5010", "Cl_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBIL5010_Cl_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_cls_chk_flg", "sls_cls_chk_flg"),
				MCItemDef.create("rcv_cls_chk_flg", "rcv_cls_chk_flg"),
				MCItemDef.create("purc_cls_chk_flg", "purc_cls_chk_flg"),
				MCItemDef.create("pay_cls_chk_flg", "pay_cls_chk_flg"),
				MCItemDef.create("stk_cls_chk_flg", "stk_cls_chk_flg"),
				MCItemDef.create("io_lmt_skip_flg", "io_lmt_skip_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("old_bp_cd", "old_bp_cd"),
				MCItemDef.create("old_loc_cd", "old_loc_cd"),
				MCItemDef.create("old_itm_cd", "old_itm_cd"),
				MCItemDef.create("old_itm_sub1", "old_itm_sub1"),
				MCItemDef.create("old_itm_sub2", "old_itm_sub2"),
				MCItemDef.create("old_itm_sub3", "old_itm_sub3")
			}
			,
			MCBlockDef.create("Cl_Chk03_Cnd")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("no_msg_flg", "no_msg_flg")
			}
			,
			MCBlockDef.create("Cl_Chk03_CndHdr")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Chk03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("old_bp_cd", "old_bp_cd")
			}
			,
			MCBlockDef.create("Cl_Chk03_CndBp")
		);
	}


	public static MCContainerDef MS_MSBIL5010_Cl_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_cls_chk_flg", "sls_cls_chk_flg"),
				MCItemDef.create("rcv_cls_chk_flg", "rcv_cls_chk_flg"),
				MCItemDef.create("purc_cls_chk_flg", "purc_cls_chk_flg"),
				MCItemDef.create("pay_cls_chk_flg", "pay_cls_chk_flg"),
				MCItemDef.create("stk_cls_chk_flg", "stk_cls_chk_flg"),
				MCItemDef.create("io_lmt_skip_flg", "io_lmt_skip_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("old_bp_cd", "old_bp_cd"),
				MCItemDef.create("old_loc_cd", "old_loc_cd"),
				MCItemDef.create("old_itm_cd", "old_itm_cd"),
				MCItemDef.create("old_itm_sub1", "old_itm_sub1"),
				MCItemDef.create("old_itm_sub2", "old_itm_sub2"),
				MCItemDef.create("old_itm_sub3", "old_itm_sub3"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Cl_Chk03_Cnd")
		);
	}
	public static MCContainerDef MS_MSBIL5010_Cl_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("old_bp_cd", "old_bp_cd")
			}
			,
			MCBlockDef.create("Cl_Chk03_CndBp")
		);
	}
	
	static final MCOperationInfo MS_MSBIL5010_Cl_Upd01_INFO = new MCOperationInfo("MS", "MSBIL5010", "Cl_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("cl_flg", "cl_flg"),
				MCItemDef.create("rel_cl_flg", "rel_cl_flg"),
				MCItemDef.create("pre_cl_flg", "pre_cl_flg"),
				MCItemDef.create("rel_pre_cl_flg", "rel_pre_cl_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("ar_pre_cl_flg", "ar_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_flg", "ap_pre_cl_flg"),
				MCItemDef.create("all_acst_pre_cl_flg", "all_acst_pre_cl_flg"),
				MCItemDef.create("all_asppl_pre_cl_flg", "all_asppl_pre_cl_flg")
			}
			,
			MCBlockDef.create("Cl_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("acst_cd", "acst_cd")
			}
			,
			MCBlockDef.create("Cl_Upd01_Ar")
		);
	}

	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("asppl_cd", "asppl_cd")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlDown")
		);
	}


	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_cl_ym", "sls_cl_ym"),
				MCItemDef.create("rcv_cl_ym", "rcv_cl_ym"),
				MCItemDef.create("purc_cl_ym", "purc_cl_ym"),
				MCItemDef.create("pay_cl_ym", "pay_cl_ym"),
				MCItemDef.create("stk_cl_ym", "stk_cl_ym"),
				MCItemDef.create("sls_cl_tm", "sls_cl_tm"),
				MCItemDef.create("rcv_cl_tm", "rcv_cl_tm"),
				MCItemDef.create("purc_cl_tm", "purc_cl_tm"),
				MCItemDef.create("pay_cl_tm", "pay_cl_tm"),
				MCItemDef.create("stk_cl_tm", "stk_cl_tm"),
				MCItemDef.create("ar_pre_cl_tm", "ar_pre_cl_tm"),
				MCItemDef.create("ap_pre_cl_tm", "ap_pre_cl_tm"),
				MCItemDef.create("sls_cl_usr_cd", "sls_cl_usr_cd"),
				MCItemDef.create("sls_cl_usr_nm", "sls_cl_usr_nm"),
				MCItemDef.create("rcv_cl_usr_cd", "rcv_cl_usr_cd"),
				MCItemDef.create("rcv_cl_usr_nm", "rcv_cl_usr_nm"),
				MCItemDef.create("purc_cl_usr_cd", "purc_cl_usr_cd"),
				MCItemDef.create("purc_cl_usr_nm", "purc_cl_usr_nm"),
				MCItemDef.create("pay_cl_usr_cd", "pay_cl_usr_cd"),
				MCItemDef.create("pay_cl_usr_nm", "pay_cl_usr_nm"),
				MCItemDef.create("stk_cl_usr_cd", "stk_cl_usr_cd"),
				MCItemDef.create("stk_cl_usr_nm", "stk_cl_usr_nm"),
				MCItemDef.create("ar_pre_cl_usr_cd", "ar_pre_cl_usr_cd"),
				MCItemDef.create("ar_pre_cl_usr_nm", "ar_pre_cl_usr_nm"),
				MCItemDef.create("ap_pre_cl_usr_cd", "ap_pre_cl_usr_cd"),
				MCItemDef.create("ap_pre_cl_usr_nm", "ap_pre_cl_usr_nm")
			}
			,
			MCBlockDef.create("Cl_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("Cl_Upd01_Ar")
		);
	}
	public static MCContainerDef MS_MSBIL5010_Cl_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("StkXfrAct_Ins01_DtlDown")
		);
	}
	
	static final MCOperationInfo MS_MSBIL5010_Cl_Srch01_INFO = new MCOperationInfo("MS", "MSBIL5010", "Cl_Srch01", "000000", new PDef());


	public static MCContainerDef MS_MSBIL5010_Cl_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBIL5010", "Cl_Srch01",
			new MCItemDef[]{
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("sls_cl_ym", "sls_cl_ym"),
				MCItemDef.create("rcv_cl_ym", "rcv_cl_ym"),
				MCItemDef.create("purc_cl_ym", "purc_cl_ym"),
				MCItemDef.create("pay_cl_ym", "pay_cl_ym"),
				MCItemDef.create("stk_cl_ym", "stk_cl_ym")
			}
			,
			MCBlockDef.create("Cl_Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

