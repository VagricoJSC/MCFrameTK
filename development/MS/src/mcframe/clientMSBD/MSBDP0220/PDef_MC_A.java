package mcframe.clientMSBD.MSBDP0220;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBDP_PurcSlipSendIfSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL0220.Srch01.UP.BLOCK0")){
			return MS_MSBDL0220_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0220.Srch01.DOWN.BLOCK0")){
			return MS_MSBDL0220_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0220.Srch01.DOWN.BLOCK1")){
			return MS_MSBDL0220_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0220.Upd01.UP.BLOCK0")){
			return MS_MSBDL0220_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0220.Upd01.UP.BLOCK1")){
			return MS_MSBDL0220_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0220.Upd01.DOWN.BLOCK0")){
			return MS_MSBDL0220_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0220.Upd02.UP.BLOCK0")){
			return MS_MSBDL0220_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL0220.Upd02.UP.BLOCK1")){
			return MS_MSBDL0220_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL0220.Upd02.DOWN.BLOCK0")){
			return MS_MSBDL0220_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBDL0220_Srch01_INFO = new MCOperationInfo("MS", "MSBDL0220", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0220_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("re_snd_flg", "re_snd_flg"),
				MCItemDef.create("not_re_snd_flg", "not_re_snd_flg"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("purc_slip_no", "purc_slip_no"),
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("new_flg", "new_flg"),
				MCItemDef.create("snd_to_err_flg", "snd_to_err_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBDL0220_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("purc_slip_no", "purc_slip_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("snd_ts", "snd_ts"),
				MCItemDef.create("re_snd_flg", "re_snd_flg"),
				MCItemDef.create("not_snd_flg", "not_snd_flg"),
				MCItemDef.create("snd_to_err_flg", "snd_to_err_flg"),
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
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MS_MSBDL0220_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0220_Upd01_INFO = new MCOperationInfo("MS", "MSBDL0220", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0220_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBDL0220_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0220_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL0220_Upd02_INFO = new MCOperationInfo("MS", "MSBDL0220", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL0220_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("not_snd_flg", "not_snd_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBDL0220_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL0220_Upd02_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBDL0220", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

