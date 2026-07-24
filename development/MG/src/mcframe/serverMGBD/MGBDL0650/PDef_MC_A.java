package mcframe.serverMGBD.MGBDL0650;

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
 * [MGBDL_CurXrateReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0650.Chk01.UP.BLOCK0")){
			return MG_MGBDL0650_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Chk01.UP.BLOCK1")){
			return MG_MGBDL0650_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0650.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0650_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Chk02.UP.BLOCK0")){
			return MG_MGBDL0650_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0650.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0650_Chk02_DOWN_BLOCK0();
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

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
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
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_nm", "term_nm"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0650_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("fr_cur_nm", "fr_cur_nm"),
				MCItemDef.create("to_cur_nm", "to_cur_nm"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("term_nm", "term_nm")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0650", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Del01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0650_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0650", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0650_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0650_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0650", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".fr_cur_cd", "fr_cur_cd"),
				MCItemDef.create("dbc" + ".to_cur_cd", "to_cur_cd"),
				MCItemDef.create("dbc" + ".xrate_cd", "xrate_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("fr_cur_nm", "fr_cur_nm"),
				MCItemDef.create("to_cur_nm", "to_cur_nm"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("term_nm", "term_nm")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

