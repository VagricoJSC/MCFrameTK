package mcframe.clientMSBI.MSBIP0010;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBIP_CloseReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBIL0010.Srch01.UP.BLOCK0")){
			return MS_MSBIL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Srch01.DOWN.BLOCK0")){
			return MS_MSBIL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Srch01.DOWN.BLOCK1")){
			return MS_MSBIL0010_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBIL0010.Srch01.DOWN.BLOCK2")){
			return MS_MSBIL0010_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.UP.BLOCK0")){
			return MS_MSBIL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.UP.BLOCK1")){
			return MS_MSBIL0010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.UP.BLOCK2")){
			return MS_MSBIL0010_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.DOWN.BLOCK0")){
			return MS_MSBIL0010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.DOWN.BLOCK1")){
			return MS_MSBIL0010_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBIL0010.Upd01.DOWN.BLOCK2")){
			return MS_MSBIL0010_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.UP.BLOCK0")){
			return MS_MSBIL0010_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.UP.BLOCK1")){
			return MS_MSBIL0010_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.UP.BLOCK2")){
			return MS_MSBIL0010_Upd02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.DOWN.BLOCK0")){
			return MS_MSBIL0010_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.DOWN.BLOCK1")){
			return MS_MSBIL0010_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBIL0010.Upd02.DOWN.BLOCK2")){
			return MS_MSBIL0010_Upd02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBIL0010.Upd03.UP.BLOCK0")){
			return MS_MSBIL0010_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd03.DOWN.BLOCK0")){
			return MS_MSBIL0010_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd04.UP.BLOCK0")){
			return MS_MSBIL0010_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBIL0010.Upd04.DOWN.BLOCK0")){
			return MS_MSBIL0010_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBIL0010_Srch01_INFO = new MCOperationInfo("MS", "MSBIL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBIL0010_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "cl_typ"),
				MCItemDef.create("cl_ym", "cl_ym"),
				MCItemDef.create("cl_dt", "cl_dt")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBIL0010_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("sls_cl_ym", "sls_cl_ym"),
				MCItemDef.create("sls_cl_tm", "sls_cl_tm"),
				MCItemDef.create("sls_cl_usr_cd", "sls_cl_usr_cd"),
				MCItemDef.create("sls_cl_usr_nm", "sls_cl_usr_nm"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("rcv_cl_ym", "rcv_cl_ym"),
				MCItemDef.create("rcv_cl_tm", "rcv_cl_tm"),
				MCItemDef.create("rcv_cl_usr_cd", "rcv_cl_usr_cd"),
				MCItemDef.create("rcv_cl_usr_nm", "rcv_cl_usr_nm"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("purc_cl_ym", "purc_cl_ym"),
				MCItemDef.create("purc_cl_tm", "purc_cl_tm"),
				MCItemDef.create("purc_cl_usr_cd", "purc_cl_usr_cd"),
				MCItemDef.create("purc_cl_usr_nm", "purc_cl_usr_nm"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("pay_cl_ym", "pay_cl_ym"),
				MCItemDef.create("pay_cl_tm", "pay_cl_tm"),
				MCItemDef.create("pay_cl_usr_cd", "pay_cl_usr_cd"),
				MCItemDef.create("pay_cl_usr_nm", "pay_cl_usr_nm"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("stk_cl_ym", "stk_cl_ym"),
				MCItemDef.create("stk_cl_tm", "stk_cl_tm"),
				MCItemDef.create("stk_cl_usr_cd", "stk_cl_usr_cd"),
				MCItemDef.create("stk_cl_usr_nm", "stk_cl_usr_nm"),
				MCItemDef.create("db_ar_pre_cl_flg", "db_ar_pre_cl_flg"),
				MCItemDef.create("ar_pre_cl_tm", "ar_pre_cl_tm"),
				MCItemDef.create("ar_pre_cl_usr_cd", "ar_pre_cl_usr_cd"),
				MCItemDef.create("ar_pre_cl_usr_nm", "ar_pre_cl_usr_nm"),
				MCItemDef.create("db_ap_pre_cl_flg", "db_ap_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_tm", "ap_pre_cl_tm"),
				MCItemDef.create("ap_pre_cl_usr_cd", "ap_pre_cl_usr_cd"),
				MCItemDef.create("ap_pre_cl_usr_nm", "ap_pre_cl_usr_nm"),
				MCItemDef.create("all_acst_pre_cl_flg", "all_acst_pre_cl_flg"),
				MCItemDef.create("all_asppl_pre_cl_flg", "all_asppl_pre_cl_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("pre_cl_tm", "pre_cl_tm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("ArDtl")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("pre_cl_tm", "pre_cl_tm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("ApDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBIL0010_Upd01_INFO = new MCOperationInfo("MS", "MSBIL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBIL0010_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ar_pre_cl_flg", "ar_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_flg", "ap_pre_cl_flg"),
				MCItemDef.create("for_sv_all_acst_pre_cl_flg", "for_sv_all_acst_pre_cl_flg"),
				MCItemDef.create("for_sv_all_asppl_pre_cl_flg", "for_sv_all_asppl_pre_cl_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBIL0010_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd")
			}
			,
			MCBlockDef.create("ArDtl")
		);
	}

	public static MCContainerDef MS_MSBIL0010_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd")
			}
			,
			MCBlockDef.create("ApDtl")
		);
	}


	public static MCContainerDef MS_MSBIL0010_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.IGNORE_ITEM("sls_cl_tm"),
				MCItemDef.IGNORE_ITEM("rcv_cl_tm"),
				MCItemDef.IGNORE_ITEM("purc_cl_tm"),
				MCItemDef.IGNORE_ITEM("pay_cl_tm"),
				MCItemDef.IGNORE_ITEM("stk_cl_tm"),
				MCItemDef.create("ar_pre_cl_tm", "ar_pre_cl_tm"),
				MCItemDef.create("ap_pre_cl_tm", "ap_pre_cl_tm"),
				MCItemDef.IGNORE_ITEM("sls_cl_usr_cd"),
				MCItemDef.IGNORE_ITEM("sls_cl_usr_nm"),
				MCItemDef.IGNORE_ITEM("rcv_cl_usr_cd"),
				MCItemDef.IGNORE_ITEM("rcv_cl_usr_nm"),
				MCItemDef.IGNORE_ITEM("purc_cl_usr_cd"),
				MCItemDef.IGNORE_ITEM("purc_cl_usr_nm"),
				MCItemDef.IGNORE_ITEM("pay_cl_usr_cd"),
				MCItemDef.IGNORE_ITEM("pay_cl_usr_nm"),
				MCItemDef.IGNORE_ITEM("stk_cl_usr_cd"),
				MCItemDef.IGNORE_ITEM("stk_cl_usr_nm"),
				MCItemDef.create("ar_pre_cl_usr_cd", "ar_pre_cl_usr_cd"),
				MCItemDef.create("ar_pre_cl_usr_nm", "ar_pre_cl_usr_nm"),
				MCItemDef.create("ap_pre_cl_usr_cd", "ap_pre_cl_usr_cd"),
				MCItemDef.create("ap_pre_cl_usr_nm", "ap_pre_cl_usr_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("ArDtl")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Upd01_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("ApDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBIL0010_Upd02_INFO = new MCOperationInfo("MS", "MSBIL0010", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBIL0010_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ar_pre_cl_flg", "ar_pre_cl_flg"),
				MCItemDef.create("ap_pre_cl_flg", "ap_pre_cl_flg"),
				MCItemDef.create("for_sv_all_acst_pre_cl_flg", "for_sv_all_acst_pre_cl_flg"),
				MCItemDef.create("for_sv_all_asppl_pre_cl_flg", "for_sv_all_asppl_pre_cl_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}

	public static MCContainerDef MS_MSBIL0010_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd")
			}
			,
			MCBlockDef.create("ArDtl")
		);
	}

	public static MCContainerDef MS_MSBIL0010_Upd02_UP_BLOCK2() {
		/** Ope.のBlock [Upd02_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("asppl_cd", "asppl_cd")
			}
			,
			MCBlockDef.create("ApDtl")
		);
	}


	public static MCContainerDef MS_MSBIL0010_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ar_pre_cl_tm", "ar_pre_cl_tm"),
				MCItemDef.create("ap_pre_cl_tm", "ap_pre_cl_tm"),
				MCItemDef.create("ar_pre_cl_usr_cd", "ar_pre_cl_usr_cd"),
				MCItemDef.create("ar_pre_cl_usr_nm", "ar_pre_cl_usr_nm"),
				MCItemDef.create("ap_pre_cl_usr_cd", "ap_pre_cl_usr_cd"),
				MCItemDef.create("ap_pre_cl_usr_nm", "ap_pre_cl_usr_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Upd02_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd02_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("ArDtl")
		);
	}
	public static MCContainerDef MS_MSBIL0010_Upd02_DOWN_BLOCK2() {
	/** Ope.のBlock [Upd02_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("pre_cl_tm", "pre_cl_tm")
			}
			,
			MCBlockDef.create("ApDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBIL0010_Upd03_INFO = new MCOperationInfo("MS", "MSBIL0010", "Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBIL0010_Upd03_UP_BLOCK0() {
		/** Ope.のBlock [Upd03_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}


	public static MCContainerDef MS_MSBIL0010_Upd03_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd03_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd03",
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
				MCItemDef.create("sls_cl_usr_cd", "sls_cl_usr_cd"),
				MCItemDef.create("sls_cl_usr_nm", "sls_cl_usr_nm"),
				MCItemDef.create("rcv_cl_usr_cd", "rcv_cl_usr_cd"),
				MCItemDef.create("rcv_cl_usr_nm", "rcv_cl_usr_nm"),
				MCItemDef.create("purc_cl_usr_cd", "purc_cl_usr_cd"),
				MCItemDef.create("purc_cl_usr_nm", "purc_cl_usr_nm"),
				MCItemDef.create("pay_cl_usr_cd", "pay_cl_usr_cd"),
				MCItemDef.create("pay_cl_usr_nm", "pay_cl_usr_nm"),
				MCItemDef.create("stk_cl_usr_cd", "stk_cl_usr_cd"),
				MCItemDef.create("stk_cl_usr_nm", "stk_cl_usr_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	
	static final MCOperationInfo MS_MSBIL0010_Upd04_INFO = new MCOperationInfo("MS", "MSBIL0010", "Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBIL0010_Upd04_UP_BLOCK0() {
		/** Ope.のBlock [Upd04_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd04",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_flg", "stk_cl_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}


	public static MCContainerDef MS_MSBIL0010_Upd04_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd04_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBIL0010", "Upd04",
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
				MCItemDef.create("sls_cl_usr_cd", "sls_cl_usr_cd"),
				MCItemDef.create("sls_cl_usr_nm", "sls_cl_usr_nm"),
				MCItemDef.create("rcv_cl_usr_cd", "rcv_cl_usr_cd"),
				MCItemDef.create("rcv_cl_usr_nm", "rcv_cl_usr_nm"),
				MCItemDef.create("purc_cl_usr_cd", "purc_cl_usr_cd"),
				MCItemDef.create("purc_cl_usr_nm", "purc_cl_usr_nm"),
				MCItemDef.create("pay_cl_usr_cd", "pay_cl_usr_cd"),
				MCItemDef.create("pay_cl_usr_nm", "pay_cl_usr_nm"),
				MCItemDef.create("stk_cl_usr_cd", "stk_cl_usr_cd"),
				MCItemDef.create("stk_cl_usr_nm", "stk_cl_usr_nm")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	//FMCB DEF_CLASSES END
}

