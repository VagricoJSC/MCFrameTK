package mcframe.serverMABC.MABCL0810;

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
 * [MABCL_NumPtnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0810.NumPtn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.NumPtn_Upd01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.NumPtnLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtnLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.NumPtnLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtnLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.NumPtn_DelChk01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtn_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.NumPtn_Del01.UP.BLOCK0")){
			return MA_MABCL0810_NumPtn_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.Srch01.UP.BLOCK0")){
			return MA_MABCL0810_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0810_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0810_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0810.Upd01.UP.BLOCK0")){
			return MA_MABCL0810_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0810.Upd01.UP.BLOCK1")){
			return MA_MABCL0810_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0810.Del01.UP.BLOCK0")){
			return MA_MABCL0810_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABCL0810_NumPtn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("elm_typ1", "elm_typ1"),
				MCItemDef.create("elm_typ2", "elm_typ2"),
				MCItemDef.create("elm_typ3", "elm_typ3"),
				MCItemDef.create("elm_typ4", "elm_typ4"),
				MCItemDef.create("elm_typ5", "elm_typ5"),
				MCItemDef.create("elm_typ6", "elm_typ6"),
				MCItemDef.create("elm_typ7", "elm_typ7"),
				MCItemDef.create("elm_typ8", "elm_typ8"),
				MCItemDef.create("elm_typ9", "elm_typ9"),
				MCItemDef.create("elm_typ10", "elm_typ10"),
				MCItemDef.create("elm_dgt1", "elm_dgt1"),
				MCItemDef.create("elm_dgt2", "elm_dgt2"),
				MCItemDef.create("elm_dgt3", "elm_dgt3"),
				MCItemDef.create("elm_dgt4", "elm_dgt4"),
				MCItemDef.create("elm_dgt5", "elm_dgt5"),
				MCItemDef.create("elm_dgt6", "elm_dgt6"),
				MCItemDef.create("elm_dgt7", "elm_dgt7"),
				MCItemDef.create("elm_dgt8", "elm_dgt8"),
				MCItemDef.create("elm_dgt9", "elm_dgt9"),
				MCItemDef.create("elm_dgt10", "elm_dgt10"),
				MCItemDef.create("fix1", "fix1"),
				MCItemDef.create("fix2", "fix2"),
				MCItemDef.create("fix3", "fix3"),
				MCItemDef.create("fix4", "fix4"),
				MCItemDef.create("fix5", "fix5"),
				MCItemDef.create("fix6", "fix6"),
				MCItemDef.create("fix7", "fix7"),
				MCItemDef.create("fix8", "fix8"),
				MCItemDef.create("fix9", "fix9"),
				MCItemDef.create("fix10", "fix10"),
				MCItemDef.create("undisp_flg1", "undisp_flg1"),
				MCItemDef.create("undisp_flg2", "undisp_flg2"),
				MCItemDef.create("undisp_flg3", "undisp_flg3"),
				MCItemDef.create("undisp_flg4", "undisp_flg4"),
				MCItemDef.create("undisp_flg5", "undisp_flg5"),
				MCItemDef.create("undisp_flg6", "undisp_flg6"),
				MCItemDef.create("undisp_flg7", "undisp_flg7"),
				MCItemDef.create("undisp_flg8", "undisp_flg8"),
				MCItemDef.create("undisp_flg9", "undisp_flg9"),
				MCItemDef.create("undisp_flg10", "undisp_flg10"),
				MCItemDef.create("num_pad_str1", "num_pad_str1"),
				MCItemDef.create("num_pad_str2", "num_pad_str2"),
				MCItemDef.create("num_pad_str3", "num_pad_str3"),
				MCItemDef.create("num_pad_str4", "num_pad_str4"),
				MCItemDef.create("num_pad_str5", "num_pad_str5"),
				MCItemDef.create("num_pad_str6", "num_pad_str6"),
				MCItemDef.create("num_pad_str7", "num_pad_str7"),
				MCItemDef.create("num_pad_str8", "num_pad_str8"),
				MCItemDef.create("num_pad_str9", "num_pad_str9"),
				MCItemDef.create("num_pad_str10", "num_pad_str10"),
				MCItemDef.create("key_dgt", "key_dgt"),
				MCItemDef.create("def_seq_typ", "def_seq_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_NumPtn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("elm_typ1", "elm_typ1"),
				MCItemDef.create("elm_typ2", "elm_typ2"),
				MCItemDef.create("elm_typ3", "elm_typ3"),
				MCItemDef.create("elm_typ4", "elm_typ4"),
				MCItemDef.create("elm_typ5", "elm_typ5"),
				MCItemDef.create("elm_typ6", "elm_typ6"),
				MCItemDef.create("elm_typ7", "elm_typ7"),
				MCItemDef.create("elm_typ8", "elm_typ8"),
				MCItemDef.create("elm_typ9", "elm_typ9"),
				MCItemDef.create("elm_typ10", "elm_typ10"),
				MCItemDef.create("elm_dgt1", "elm_dgt1"),
				MCItemDef.create("elm_dgt2", "elm_dgt2"),
				MCItemDef.create("elm_dgt3", "elm_dgt3"),
				MCItemDef.create("elm_dgt4", "elm_dgt4"),
				MCItemDef.create("elm_dgt5", "elm_dgt5"),
				MCItemDef.create("elm_dgt6", "elm_dgt6"),
				MCItemDef.create("elm_dgt7", "elm_dgt7"),
				MCItemDef.create("elm_dgt8", "elm_dgt8"),
				MCItemDef.create("elm_dgt9", "elm_dgt9"),
				MCItemDef.create("elm_dgt10", "elm_dgt10"),
				MCItemDef.create("fix1", "fix1"),
				MCItemDef.create("fix2", "fix2"),
				MCItemDef.create("fix3", "fix3"),
				MCItemDef.create("fix4", "fix4"),
				MCItemDef.create("fix5", "fix5"),
				MCItemDef.create("fix6", "fix6"),
				MCItemDef.create("fix7", "fix7"),
				MCItemDef.create("fix8", "fix8"),
				MCItemDef.create("fix9", "fix9"),
				MCItemDef.create("fix10", "fix10"),
				MCItemDef.create("undisp_flg1", "undisp_flg1"),
				MCItemDef.create("undisp_flg2", "undisp_flg2"),
				MCItemDef.create("undisp_flg3", "undisp_flg3"),
				MCItemDef.create("undisp_flg4", "undisp_flg4"),
				MCItemDef.create("undisp_flg5", "undisp_flg5"),
				MCItemDef.create("undisp_flg6", "undisp_flg6"),
				MCItemDef.create("undisp_flg7", "undisp_flg7"),
				MCItemDef.create("undisp_flg8", "undisp_flg8"),
				MCItemDef.create("undisp_flg9", "undisp_flg9"),
				MCItemDef.create("undisp_flg10", "undisp_flg10"),
				MCItemDef.create("num_pad_str1", "num_pad_str1"),
				MCItemDef.create("num_pad_str2", "num_pad_str2"),
				MCItemDef.create("num_pad_str3", "num_pad_str3"),
				MCItemDef.create("num_pad_str4", "num_pad_str4"),
				MCItemDef.create("num_pad_str5", "num_pad_str5"),
				MCItemDef.create("num_pad_str6", "num_pad_str6"),
				MCItemDef.create("num_pad_str7", "num_pad_str7"),
				MCItemDef.create("num_pad_str8", "num_pad_str8"),
				MCItemDef.create("num_pad_str9", "num_pad_str9"),
				MCItemDef.create("num_pad_str10", "num_pad_str10"),
				MCItemDef.create("key_dgt", "key_dgt"),
				MCItemDef.create("def_seq_typ", "def_seq_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_NumPtnLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtnLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtnLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtnLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtnLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_NumPtnLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtnLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtnLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtnLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtnLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_NumPtn_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtn_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtn_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtn_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtn_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_NumPtn_Del01_INFO = new MCOperationInfo("MA", "MABCL0810", "NumPtn_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_NumPtn_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "NumPtn_Del01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("NumPtn_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_Srch01_INFO = new MCOperationInfo("MA", "MABCL0810", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm_lcl", "num_ptn_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0810_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm_lcl", "num_ptn_nm_lcl"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("elm_typ1", "elm_typ1"),
				MCItemDef.create("elm_typ2", "elm_typ2"),
				MCItemDef.create("elm_typ3", "elm_typ3"),
				MCItemDef.create("elm_typ4", "elm_typ4"),
				MCItemDef.create("elm_typ5", "elm_typ5"),
				MCItemDef.create("elm_typ6", "elm_typ6"),
				MCItemDef.create("elm_typ7", "elm_typ7"),
				MCItemDef.create("elm_typ8", "elm_typ8"),
				MCItemDef.create("elm_typ9", "elm_typ9"),
				MCItemDef.create("elm_typ10", "elm_typ10"),
				MCItemDef.create("elm_dgt1", "elm_dgt1"),
				MCItemDef.create("elm_dgt2", "elm_dgt2"),
				MCItemDef.create("elm_dgt3", "elm_dgt3"),
				MCItemDef.create("elm_dgt4", "elm_dgt4"),
				MCItemDef.create("elm_dgt5", "elm_dgt5"),
				MCItemDef.create("elm_dgt6", "elm_dgt6"),
				MCItemDef.create("elm_dgt7", "elm_dgt7"),
				MCItemDef.create("elm_dgt8", "elm_dgt8"),
				MCItemDef.create("elm_dgt9", "elm_dgt9"),
				MCItemDef.create("elm_dgt10", "elm_dgt10"),
				MCItemDef.create("fix1", "fix1"),
				MCItemDef.create("fix2", "fix2"),
				MCItemDef.create("fix3", "fix3"),
				MCItemDef.create("fix4", "fix4"),
				MCItemDef.create("fix5", "fix5"),
				MCItemDef.create("fix6", "fix6"),
				MCItemDef.create("fix7", "fix7"),
				MCItemDef.create("fix8", "fix8"),
				MCItemDef.create("fix9", "fix9"),
				MCItemDef.create("fix10", "fix10"),
				MCItemDef.create("undisp_flg1", "undisp_flg1"),
				MCItemDef.create("undisp_flg2", "undisp_flg2"),
				MCItemDef.create("undisp_flg3", "undisp_flg3"),
				MCItemDef.create("undisp_flg4", "undisp_flg4"),
				MCItemDef.create("undisp_flg5", "undisp_flg5"),
				MCItemDef.create("undisp_flg6", "undisp_flg6"),
				MCItemDef.create("undisp_flg7", "undisp_flg7"),
				MCItemDef.create("undisp_flg8", "undisp_flg8"),
				MCItemDef.create("undisp_flg9", "undisp_flg9"),
				MCItemDef.create("undisp_flg10", "undisp_flg10"),
				MCItemDef.create("num_pad_str1", "num_pad_str1"),
				MCItemDef.create("num_pad_str2", "num_pad_str2"),
				MCItemDef.create("num_pad_str3", "num_pad_str3"),
				MCItemDef.create("num_pad_str4", "num_pad_str4"),
				MCItemDef.create("num_pad_str5", "num_pad_str5"),
				MCItemDef.create("num_pad_str6", "num_pad_str6"),
				MCItemDef.create("num_pad_str7", "num_pad_str7"),
				MCItemDef.create("num_pad_str8", "num_pad_str8"),
				MCItemDef.create("num_pad_str9", "num_pad_str9"),
				MCItemDef.create("num_pad_str10", "num_pad_str10"),
				MCItemDef.create("key_dgt", "key_dgt"),
				MCItemDef.create("def_seq_typ", "def_seq_typ"),
				MCItemDef.create("def_seq_typ_nm", "def_seq_typ_nm"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("num_biz_typ_nm", "num_biz_typ_nm"),
				MCItemDef.create("max_digit", "max_digit"),
				MCItemDef.create("elm_typ_nm1", "elm_typ_nm1"),
				MCItemDef.create("elm_typ_nm2", "elm_typ_nm2"),
				MCItemDef.create("elm_typ_nm3", "elm_typ_nm3"),
				MCItemDef.create("elm_typ_nm4", "elm_typ_nm4"),
				MCItemDef.create("elm_typ_nm5", "elm_typ_nm5"),
				MCItemDef.create("elm_typ_nm6", "elm_typ_nm6"),
				MCItemDef.create("elm_typ_nm7", "elm_typ_nm7"),
				MCItemDef.create("elm_typ_nm8", "elm_typ_nm8"),
				MCItemDef.create("elm_typ_nm9", "elm_typ_nm9"),
				MCItemDef.create("elm_typ_nm10", "elm_typ_nm10"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MA_MABCL0810_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
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
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_Upd01_INFO = new MCOperationInfo("MA", "MABCL0810", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("elm_typ1", "elm_typ1"),
				MCItemDef.create("elm_typ2", "elm_typ2"),
				MCItemDef.create("elm_typ3", "elm_typ3"),
				MCItemDef.create("elm_typ4", "elm_typ4"),
				MCItemDef.create("elm_typ5", "elm_typ5"),
				MCItemDef.create("elm_typ6", "elm_typ6"),
				MCItemDef.create("elm_typ7", "elm_typ7"),
				MCItemDef.create("elm_typ8", "elm_typ8"),
				MCItemDef.create("elm_typ9", "elm_typ9"),
				MCItemDef.create("elm_typ10", "elm_typ10"),
				MCItemDef.create("elm_dgt1", "elm_dgt1"),
				MCItemDef.create("elm_dgt2", "elm_dgt2"),
				MCItemDef.create("elm_dgt3", "elm_dgt3"),
				MCItemDef.create("elm_dgt4", "elm_dgt4"),
				MCItemDef.create("elm_dgt5", "elm_dgt5"),
				MCItemDef.create("elm_dgt6", "elm_dgt6"),
				MCItemDef.create("elm_dgt7", "elm_dgt7"),
				MCItemDef.create("elm_dgt8", "elm_dgt8"),
				MCItemDef.create("elm_dgt9", "elm_dgt9"),
				MCItemDef.create("elm_dgt10", "elm_dgt10"),
				MCItemDef.create("fix1", "fix1"),
				MCItemDef.create("fix2", "fix2"),
				MCItemDef.create("fix3", "fix3"),
				MCItemDef.create("fix4", "fix4"),
				MCItemDef.create("fix5", "fix5"),
				MCItemDef.create("fix6", "fix6"),
				MCItemDef.create("fix7", "fix7"),
				MCItemDef.create("fix8", "fix8"),
				MCItemDef.create("fix9", "fix9"),
				MCItemDef.create("fix10", "fix10"),
				MCItemDef.create("undisp_flg1", "undisp_flg1"),
				MCItemDef.create("undisp_flg2", "undisp_flg2"),
				MCItemDef.create("undisp_flg3", "undisp_flg3"),
				MCItemDef.create("undisp_flg4", "undisp_flg4"),
				MCItemDef.create("undisp_flg5", "undisp_flg5"),
				MCItemDef.create("undisp_flg6", "undisp_flg6"),
				MCItemDef.create("undisp_flg7", "undisp_flg7"),
				MCItemDef.create("undisp_flg8", "undisp_flg8"),
				MCItemDef.create("undisp_flg9", "undisp_flg9"),
				MCItemDef.create("undisp_flg10", "undisp_flg10"),
				MCItemDef.create("num_pad_str1", "num_pad_str1"),
				MCItemDef.create("num_pad_str2", "num_pad_str2"),
				MCItemDef.create("num_pad_str3", "num_pad_str3"),
				MCItemDef.create("num_pad_str4", "num_pad_str4"),
				MCItemDef.create("num_pad_str5", "num_pad_str5"),
				MCItemDef.create("num_pad_str6", "num_pad_str6"),
				MCItemDef.create("num_pad_str7", "num_pad_str7"),
				MCItemDef.create("num_pad_str8", "num_pad_str8"),
				MCItemDef.create("num_pad_str9", "num_pad_str9"),
				MCItemDef.create("num_pad_str10", "num_pad_str10"),
				MCItemDef.create("key_dgt", "key_dgt"),
				MCItemDef.create("def_seq_typ", "def_seq_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0810_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("num_ptn_nm", "num_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0810_Del01_INFO = new MCOperationInfo("MA", "MABCL0810", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0810_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0810", "Del01",
			new MCItemDef[]{
				MCItemDef.create("num_biz_typ", "num_biz_typ"),
				MCItemDef.create("num_ptn_cd", "num_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

