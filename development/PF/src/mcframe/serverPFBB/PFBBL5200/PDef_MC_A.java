package mcframe.serverPFBB.PFBBL5200;

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
 * [PFBBL_AccountIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBBL5200.AccountIf_Conv01.UP.BLOCK0")){
			return PF_PFBBL5200_AccountIf_Conv01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBBL5200.AccountIf_Conv01.UP.BLOCK1")){
			return PF_PFBBL5200_AccountIf_Conv01_UP_BLOCK1();
		}
		else if (id.equals("PF.PFBBL5200.AccountIf_Conv01.DOWN.BLOCK0")){
			return PF_PFBBL5200_AccountIf_Conv01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBBL5200_AccountIf_Conv01_INFO = new MCOperationInfo("PF", "PFBBL5200", "AccountIf_Conv01", "000000", new PDef());

	public static MCContainerDef PF_PFBBL5200_AccountIf_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBBL5200", "AccountIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef PF_PFBBL5200_AccountIf_Conv01_UP_BLOCK1() {

		return new MCGeneralContainerDef("PF", "PFBBL5200", "AccountIf_Conv01",
			new MCItemDef[]{
				MCItemDef.create("rectype", "rectype"),
				MCItemDef.create("precode", "precode"),
				MCItemDef.create("name", "name"),
				MCItemDef.create("activeflag", "activeflag"),
				MCItemDef.create("extension", "extension"),
				MCItemDef.create("searchcharacter", "searchcharacter"),
				MCItemDef.create("accounttype", "accounttype"),
				MCItemDef.create("sp_accounttype", "sp_accounttype"),
				MCItemDef.create("currencycode", "currencycode"),
				MCItemDef.create("ratetypecode", "ratetypecode"),
				MCItemDef.create("reval_ratetypecode", "reval_ratetypecode"),
				MCItemDef.create("cnsr_ratetype1", "cnsr_ratetype1"),
				MCItemDef.create("cnsr_ratetype2", "cnsr_ratetype2"),
				MCItemDef.create("subincludeflag", "subincludeflag"),
				MCItemDef.create("appraisalconvflag", "appraisalconvflag"),
				MCItemDef.create("vat_flag", "vat_flag"),
				MCItemDef.create("reversingflag", "reversingflag"),
				MCItemDef.create("aparappraisalflag", "aparappraisalflag"),
				MCItemDef.create("aparreversingflag", "aparreversingflag"),
				MCItemDef.create("tax_ac_flag", "tax_ac_flag"),
				MCItemDef.create("taxablecode", "taxablecode"),
				MCItemDef.create("taxabletype", "taxabletype"),
				MCItemDef.create("openup_ar", "openup_ar"),
				MCItemDef.create("openup_ap", "openup_ap"),
				MCItemDef.create("openup_acc", "openup_acc"),
				MCItemDef.create("correspondentset", "correspondentset"),
				MCItemDef.create("descriptcontrol", "descriptcontrol"),
				MCItemDef.create("usermaster1control", "usermaster1control"),
				MCItemDef.create("usermaster2control", "usermaster2control"),
				MCItemDef.create("usermaster3control", "usermaster3control"),
				MCItemDef.create("usermaster4control", "usermaster4control"),
				MCItemDef.create("usermaster5control", "usermaster5control"),
				MCItemDef.create("usercodecontrol", "usercodecontrol"),
				MCItemDef.create("usertextcontrol", "usertextcontrol"),
				MCItemDef.create("userdatecontrol", "userdatecontrol"),
				MCItemDef.create("userqtycontrol", "userqtycontrol"),
				MCItemDef.create("correspondentsummary", "correspondentsummary"),
				MCItemDef.create("usermaster1summary", "usermaster1summary"),
				MCItemDef.create("usermaster2summary", "usermaster2summary"),
				MCItemDef.create("usermaster3summary", "usermaster3summary"),
				MCItemDef.create("usermaster4summary", "usermaster4summary"),
				MCItemDef.create("usermaster5summary", "usermaster5summary"),
				MCItemDef.create("userdatesummary", "userdatesummary"),
				MCItemDef.create("userqtysummary", "userqtysummary"),
				MCItemDef.create("pc_ratetype1", "pc_ratetype1"),
				MCItemDef.create("pc_exchangetype1", "pc_exchangetype1"),
				MCItemDef.create("pc_ratetype2", "pc_ratetype2"),
				MCItemDef.create("pc_exchangetype2", "pc_exchangetype2"),
				MCItemDef.create("pc_ratetype3", "pc_ratetype3"),
				MCItemDef.create("pc_exchangetype3", "pc_exchangetype3"),
				MCItemDef.create("safetybalancefc", "safetybalancefc"),
				MCItemDef.create("fstype", "fstype"),
				MCItemDef.create("beginend", "beginend")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef PF_PFBBL5200_AccountIf_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBBL5200", "AccountIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

