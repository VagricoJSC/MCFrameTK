package mcframe.clientMSBC.MSBCP0220;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_MrpLogSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0220.Srch01.UP.BLOCK0")){
			return MS_MSBCL0220_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0220.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0220_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0220.Del01.UP.BLOCK0")){
			return MS_MSBCL0220_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBCL0220_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0220", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0220_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("mrp_calc_no", "mrp_calc_no"),
				MCItemDef.create("log_time_fr", "log_time_fr"),
				MCItemDef.create("log_time_to", "log_time_to"),
				MCItemDef.create("gp_batch_grp_cd", "gp_batch_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("req_no", "req_no"),
				MCItemDef.create("msg1", "msg1"),
				MCItemDef.create("msg2", "msg2"),
				MCItemDef.create("msg3", "msg3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0220_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg", "msg"),
				MCItemDef.create("mrp_calc_no", "mrp_calc_no"),
				MCItemDef.create("seq_no", "seq_no"),
				MCItemDef.create("log_time", "log_time"),
				MCItemDef.create("gp_batch_grp_cd", "gp_batch_grp_cd"),
				MCItemDef.create("gp_batch_grp_nm", "gp_batch_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
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
	
	static final MCOperationInfo MS_MSBCL0220_Del01_INFO = new MCOperationInfo("MS", "MSBCL0220", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0220_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0220", "Del01",
			new MCItemDef[]{
				MCItemDef.create("mrp_calc_no", "mrp_calc_no"),
				MCItemDef.create("seq_no", "seq_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

