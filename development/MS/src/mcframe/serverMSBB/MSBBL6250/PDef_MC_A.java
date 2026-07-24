package mcframe.serverMSBB.MSBBL6250;

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
 * [MSBBL_SlsAprvAfterService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6250.SlsAprvAfter_Upd01.UP.BLOCK0")){
			return MS_MSBBL6250_SlsAprvAfter_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6250.SlsAprvAfter_Upd02.UP.BLOCK0")){
			return MS_MSBBL6250_SlsAprvAfter_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6250.SlsAprvAfter_Upd03.UP.BLOCK0")){
			return MS_MSBBL6250_SlsAprvAfter_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBBL6250_SlsAprvAfter_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6250", "SlsAprvAfter_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6250_SlsAprvAfter_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6250", "SlsAprvAfter_Upd01",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("last_aprv_usr_cd", "last_aprv_usr_cd"),
				MCItemDef.create("last_aprv_tm", "last_aprv_tm"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2")
			}
			,
			MCBlockDef.create("SlsAprvAfter_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6250_SlsAprvAfter_Upd02_INFO = new MCOperationInfo("MS", "MSBBL6250", "SlsAprvAfter_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6250_SlsAprvAfter_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6250", "SlsAprvAfter_Upd02",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("last_aprv_usr_cd", "last_aprv_usr_cd"),
				MCItemDef.create("last_aprv_tm", "last_aprv_tm"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2")
			}
			,
			MCBlockDef.create("SlsAprvAfter_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6250_SlsAprvAfter_Upd03_INFO = new MCOperationInfo("MS", "MSBBL6250", "SlsAprvAfter_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6250_SlsAprvAfter_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6250", "SlsAprvAfter_Upd03",
			new MCItemDef[]{
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("last_aprv_usr_cd", "last_aprv_usr_cd"),
				MCItemDef.create("last_aprv_tm", "last_aprv_tm"),
				MCItemDef.create("src_itm_cd", "src_itm_cd"),
				MCItemDef.create("src_itm_sub1", "src_itm_sub1"),
				MCItemDef.create("src_itm_sub2", "src_itm_sub2"),
				MCItemDef.create("src_itm_sub3", "src_itm_sub3"),
				MCItemDef.create("src_dpt_cd", "src_dpt_cd"),
				MCItemDef.create("src_bp_cd", "src_bp_cd"),
				MCItemDef.create("src_cur_cd1", "src_cur_cd1"),
				MCItemDef.create("src_amt1", "src_amt1"),
				MCItemDef.create("src_cur_cd2", "src_cur_cd2"),
				MCItemDef.create("src_amt2", "src_amt2"),
				MCItemDef.create("src_cur_cd3", "src_cur_cd3"),
				MCItemDef.create("src_amt3", "src_amt3"),
				MCItemDef.create("src_ext_key1", "src_ext_key1"),
				MCItemDef.create("src_ext_key2", "src_ext_key2"),
				MCItemDef.create("src_ext_key3", "src_ext_key3"),
				MCItemDef.create("aprv_src_no1", "aprv_src_no1"),
				MCItemDef.create("aprv_src_no2", "aprv_src_no2")
			}
			,
			MCBlockDef.create("SlsAprvAfter_Upd03_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

