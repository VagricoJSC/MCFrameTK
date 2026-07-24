package mcframe.clientMGBD.MGBDP0650;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBDP_CurXrateReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0650.Srch01.UP.BLOCK0")){
			return MG_MGBDL0650_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0650_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Upd01.UP.BLOCK0")){
			return MG_MGBDL0650_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0650_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Del01.UP.BLOCK0")){
			return MG_MGBDL0650_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0650_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Imp01.UP.BLOCK0")){
			return MG_MGBDL0650_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Imp01.DOWN.BLOCK0")){
			return MG_MGBDL0650_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MG_MGBDL0650_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term_fr", "term_fr"),
				MCItemDef.create("term_p" + ".term_to", "term_to"),
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("fr_cur_nm", "fr_cur_nm"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("to_cur_nm", "to_cur_nm"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("off_fix_flg", "off_fix_flg"),
				MCItemDef.create("on_fix_flg", "on_fix_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("term_p" + ".term_nm", "term_nm"),
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("fr_cur_nm", "fr_cur_nm"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("to_cur_nm", "to_cur_nm"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Del01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Del01",
			new MCItemDef[]{
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBDL0650", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("to_cur_cd", "to_cur_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fr_cur_nm", "fr_cur_nm"),
				MCItemDef.create("to_cur_nm", "to_cur_nm"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("term_p" + ".term_nm", "term_nm")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

