package mcframe.clientMABC.MABCP1500;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_ExtSysReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL1500.Srch01.UP.BLOCK0")){
			return MA_MABCL1500_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK0")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK1")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK2")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK3")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK4")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABCL1500.Srch01.DOWN.BLOCK5")){
			return MA_MABCL1500_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK0")){
			return MA_MABCL1500_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK1")){
			return MA_MABCL1500_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK2")){
			return MA_MABCL1500_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK3")){
			return MA_MABCL1500_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK4")){
			return MA_MABCL1500_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABCL1500.Upd01.UP.BLOCK5")){
			return MA_MABCL1500_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MA.MABCL1500.Del01.UP.BLOCK0")){
			return MA_MABCL1500_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL1500_Srch01_INFO = new MCOperationInfo("MA", "MABCL1500", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1500_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm_lcl", "ext_sys_nm_lcl"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_sys_typ", "ext_sys_typ"),
				MCItemDef.create("ext_sys_typ_nm", "ext_sys_typ_nm"),
				MCItemDef.create("web_api_flg", "web_api_flg"),
				MCItemDef.create("cmd_exec_flg", "cmd_exec_flg"),
				MCItemDef.create("real_imp_flg", "real_imp_flg"),
				MCItemDef.create("not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("if_upd_typ_nm", "if_upd_typ_nm"),
				MCItemDef.create("dlv_slip_split_flg", "dlv_slip_split_flg"),
				MCItemDef.create("null_val_if_flg", "null_val_if_flg"),
				MCItemDef.create("upri_not_chk_flg", "upri_not_chk_flg"),
				MCItemDef.create("amt_not_chk_flg", "amt_not_chk_flg"),
				MCItemDef.create("tax_not_chk_flg", "tax_not_chk_flg"),
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
	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("if_ctl_typ", "if_ctl_typ"),
				MCItemDef.create("if_ctl_typ_nm", "if_ctl_typ_nm"),
				MCItemDef.create("var_str", "var_str"),
				MCItemDef.create("var_num", "var_num"),
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
			MCBlockDef.create("ProtoAll")
		);
	}
	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("conv_ope", "conv_ope"),
				MCItemDef.create("file_io_ope", "file_io_ope"),
				MCItemDef.create("web_api_ope", "web_api_ope"),
				MCItemDef.create("cmd_exec_ope", "cmd_exec_ope"),
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
			MCBlockDef.create("AdapAll")
		);
	}
	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("http_header_nm", "http_header_nm"),
				MCItemDef.create("http_header_val", "http_header_val"),
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
			MCBlockDef.create("HttpHeaderAll")
		);
	}
	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Rslt5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("ext_sys_usr_cd", "ext_sys_usr_cd"),
				MCItemDef.create("ext_sys_pass", "ext_sys_pass"),
				MCItemDef.create("ext_sys_str1", "ext_sys_str1"),
				MCItemDef.create("ext_sys_str2", "ext_sys_str2"),
				MCItemDef.create("ext_sys_str3", "ext_sys_str3"),
				MCItemDef.create("ext_sys_str4", "ext_sys_str4"),
				MCItemDef.create("ext_sys_str5", "ext_sys_str5"),
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
			MCBlockDef.create("ExtSysUsrAll")
		);
	}
	public static MCContainerDef MA_MABCL1500_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_Rslt6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL1500_Upd01_INFO = new MCOperationInfo("MA", "MABCL1500", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_sys_typ", "ext_sys_typ"),
				MCItemDef.create("web_api_flg", "web_api_flg"),
				MCItemDef.create("cmd_exec_flg", "cmd_exec_flg"),
				MCItemDef.create("real_imp_flg", "real_imp_flg"),
				MCItemDef.create("not_send_upd_flg", "not_send_upd_flg"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("dlv_slip_split_flg", "dlv_slip_split_flg"),
				MCItemDef.create("null_val_if_flg", "null_val_if_flg"),
				MCItemDef.create("upri_not_chk_flg", "upri_not_chk_flg"),
				MCItemDef.create("amt_not_chk_flg", "amt_not_chk_flg"),
				MCItemDef.create("tax_not_chk_flg", "tax_not_chk_flg"),
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

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_ctl_typ", "if_ctl_typ"),
				MCItemDef.create("var_str", "var_str"),
				MCItemDef.create("var_num", "var_num"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ProtoAll")
		);
	}

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("conv_ope", "conv_ope"),
				MCItemDef.create("file_io_ope", "file_io_ope"),
				MCItemDef.create("web_api_ope", "web_api_ope"),
				MCItemDef.create("cmd_exec_ope", "cmd_exec_ope"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AdapAll")
		);
	}

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("http_header_nm", "http_header_nm"),
				MCItemDef.create("http_header_val", "http_header_val"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HttpHeaderAll")
		);
	}

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("ext_sys_usr_cd", "ext_sys_usr_cd"),
				MCItemDef.create("ext_sys_pass", "ext_sys_pass"),
				MCItemDef.create("ext_sys_str1", "ext_sys_str1"),
				MCItemDef.create("ext_sys_str2", "ext_sys_str2"),
				MCItemDef.create("ext_sys_str3", "ext_sys_str3"),
				MCItemDef.create("ext_sys_str4", "ext_sys_str4"),
				MCItemDef.create("ext_sys_str5", "ext_sys_str5"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ExtSysUsrAll")
		);
	}

	public static MCContainerDef MA_MABCL1500_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_Dtl6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL1500_Del01_INFO = new MCOperationInfo("MA", "MABCL1500", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL1500_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL1500", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

