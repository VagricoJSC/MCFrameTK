package mcframe.serverMSBE.MSBEL0160;

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
 * [MSBEL_AllocStopLotReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0160.AllocStopLot_UpdChk01.UP.BLOCK0")){
			return MS_MSBEL0160_AllocStopLot_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.AllocStopLot_Upd01.UP.BLOCK0")){
			return MS_MSBEL0160_AllocStopLot_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.AllocStopLot_DelChk01.UP.BLOCK0")){
			return MS_MSBEL0160_AllocStopLot_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.AllocStopLot_Del01.UP.BLOCK0")){
			return MS_MSBEL0160_AllocStopLot_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.Srch01.UP.BLOCK0")){
			return MS_MSBEL0160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.Upd01.UP.BLOCK0")){
			return MS_MSBEL0160_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0160.Del01.UP.BLOCK0")){
			return MS_MSBEL0160_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL0160_AllocStopLot_UpdChk01_INFO = new MCOperationInfo("MS", "MSBEL0160", "AllocStopLot_UpdChk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_AllocStopLot_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "AllocStopLot_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("stop_usr_cd", "stop_usr_cd"),
				MCItemDef.create("stop_rmrks", "stop_rmrks"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("rel_usr_cd", "rel_usr_cd"),
				MCItemDef.create("rel_rmrks", "rel_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocStopLot_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_AllocStopLot_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0160", "AllocStopLot_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_AllocStopLot_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "AllocStopLot_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("stop_usr_cd", "stop_usr_cd"),
				MCItemDef.create("stop_rmrks", "stop_rmrks"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("rel_usr_cd", "rel_usr_cd"),
				MCItemDef.create("rel_rmrks", "rel_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocStopLot_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_AllocStopLot_DelChk01_INFO = new MCOperationInfo("MS", "MSBEL0160", "AllocStopLot_DelChk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_AllocStopLot_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "AllocStopLot_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocStopLot_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_AllocStopLot_Del01_INFO = new MCOperationInfo("MS", "MSBEL0160", "AllocStopLot_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_AllocStopLot_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "AllocStopLot_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("AllocStopLot_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("stop_dt_fr", "stop_dt_fr"),
				MCItemDef.create("stop_dt_to", "stop_dt_to"),
				MCItemDef.create("rel_dt_fr", "rel_dt_fr"),
				MCItemDef.create("rel_dt_to", "rel_dt_to"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("stop_rmrks", "stop_rmrks"),
				MCItemDef.create("rel_rmrks", "rel_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0160_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("stop_usr_cd", "stop_usr_cd"),
				MCItemDef.create("stop_usr_nm", "stop_usr_nm"),
				MCItemDef.create("stop_rmrks", "stop_rmrks"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("rel_usr_cd", "rel_usr_cd"),
				MCItemDef.create("rel_usr_nm", "rel_usr_nm"),
				MCItemDef.create("rel_rmrks", "rel_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0160", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("stop_dt", "stop_dt"),
				MCItemDef.create("stop_usr_cd", "stop_usr_cd"),
				MCItemDef.create("stop_rmrks", "stop_rmrks"),
				MCItemDef.create("rel_dt", "rel_dt"),
				MCItemDef.create("rel_usr_cd", "rel_usr_cd"),
				MCItemDef.create("rel_rmrks", "rel_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0160_Del01_INFO = new MCOperationInfo("MS", "MSBEL0160", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0160_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0160", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

