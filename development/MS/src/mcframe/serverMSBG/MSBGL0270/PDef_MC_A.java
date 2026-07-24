package mcframe.serverMSBG.MSBGL0270;

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
 * [MSBGL_CredSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0270.Srch01.UP.BLOCK0")){
			return MS_MSBGL0270_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0270.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0270_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0270_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0270", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0270_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0270", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cred_nm", "cred_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("cred_use_fr", "cred_use_fr"),
				MCItemDef.create("cred_use_to", "cred_use_to"),
				MCItemDef.create("cred_amt_fr", "cred_amt_fr"),
				MCItemDef.create("cred_amt_to", "cred_amt_to"),
				MCItemDef.create("alarm_flg", "alarm_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cred_grp_flg1", "cred_grp_flg1"),
				MCItemDef.create("cred_grp_cd1", "cred_grp_cd1"),
				MCItemDef.create("cred_grp_nm1", "cred_grp_nm1"),
				MCItemDef.create("cred_grp_flg2", "cred_grp_flg2"),
				MCItemDef.create("cred_grp_cd2", "cred_grp_cd2"),
				MCItemDef.create("cred_grp_nm2", "cred_grp_nm2"),
				MCItemDef.create("cred_grp_flg3", "cred_grp_flg3"),
				MCItemDef.create("cred_grp_cd3", "cred_grp_cd3"),
				MCItemDef.create("cred_grp_nm3", "cred_grp_nm3"),
				MCItemDef.create("cred_grp_flg4", "cred_grp_flg4"),
				MCItemDef.create("cred_grp_cd4", "cred_grp_cd4"),
				MCItemDef.create("cred_grp_nm4", "cred_grp_nm4"),
				MCItemDef.create("cred_grp_flg5", "cred_grp_flg5"),
				MCItemDef.create("cred_grp_cd5", "cred_grp_cd5"),
				MCItemDef.create("cred_grp_nm5", "cred_grp_nm5"),
				MCItemDef.create("cred_grp_flg6", "cred_grp_flg6"),
				MCItemDef.create("cred_grp_cd6", "cred_grp_cd6"),
				MCItemDef.create("cred_grp_nm6", "cred_grp_nm6"),
				MCItemDef.create("cred_grp_flg7", "cred_grp_flg7"),
				MCItemDef.create("cred_grp_cd7", "cred_grp_cd7"),
				MCItemDef.create("cred_grp_nm7", "cred_grp_nm7"),
				MCItemDef.create("cred_grp_flg8", "cred_grp_flg8"),
				MCItemDef.create("cred_grp_cd8", "cred_grp_cd8"),
				MCItemDef.create("cred_grp_nm8", "cred_grp_nm8"),
				MCItemDef.create("cred_grp_flg9", "cred_grp_flg9"),
				MCItemDef.create("cred_grp_cd9", "cred_grp_cd9"),
				MCItemDef.create("cred_grp_nm9", "cred_grp_nm9"),
				MCItemDef.create("cred_grp_flg10", "cred_grp_flg10"),
				MCItemDef.create("cred_grp_cd10", "cred_grp_cd10"),
				MCItemDef.create("cred_grp_nm10", "cred_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0270_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0270", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("cred_nm", "cred_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("cred_limit", "cred_limit"),
				MCItemDef.create("cred_amt", "cred_amt"),
				MCItemDef.create("ar_cred_amt", "ar_cred_amt"),
				MCItemDef.create("ap_cred_amt", "ap_cred_amt"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("cred_use", "cred_use"),
				MCItemDef.create("alarm_point", "alarm_point"),
				MCItemDef.create("alarm_amt", "alarm_amt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cred_grp_cd1", "cred_grp_cd1"),
				MCItemDef.create("cred_grp_nm1", "cred_grp_nm1"),
				MCItemDef.create("cred_grp_cd2", "cred_grp_cd2"),
				MCItemDef.create("cred_grp_nm2", "cred_grp_nm2"),
				MCItemDef.create("cred_grp_cd3", "cred_grp_cd3"),
				MCItemDef.create("cred_grp_nm3", "cred_grp_nm3"),
				MCItemDef.create("cred_grp_cd4", "cred_grp_cd4"),
				MCItemDef.create("cred_grp_nm4", "cred_grp_nm4"),
				MCItemDef.create("cred_grp_cd5", "cred_grp_cd5"),
				MCItemDef.create("cred_grp_nm5", "cred_grp_nm5"),
				MCItemDef.create("cred_grp_cd6", "cred_grp_cd6"),
				MCItemDef.create("cred_grp_nm6", "cred_grp_nm6"),
				MCItemDef.create("cred_grp_cd7", "cred_grp_cd7"),
				MCItemDef.create("cred_grp_nm7", "cred_grp_nm7"),
				MCItemDef.create("cred_grp_cd8", "cred_grp_cd8"),
				MCItemDef.create("cred_grp_nm8", "cred_grp_nm8"),
				MCItemDef.create("cred_grp_cd9", "cred_grp_cd9"),
				MCItemDef.create("cred_grp_nm9", "cred_grp_nm9"),
				MCItemDef.create("cred_grp_cd10", "cred_grp_cd10"),
				MCItemDef.create("cred_grp_nm10", "cred_grp_nm10"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

